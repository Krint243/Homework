package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldSize;
    private int winLenght;
    private boolean isInit;
    private int cellWidth;
    private int cellHeidt;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeidt;

                if (isInit && !Logic.isGameFinished) {
                    Logic.humanTurn(cellY, cellX);


                    repaint();
                    if (Logic.whowin == 1) {
                        JOptionPane.showMessageDialog(null, "Победил человек");

                    } else if (Logic.whowin == 2) {
                        JOptionPane.showMessageDialog(null, "Победил компьютер");
                    } else if (Logic.whowin == 3){
                        JOptionPane.showMessageDialog(null, "Ничья!");
                    }
                }


            }

        });
    }

    void startNewGame(int fieldSize, int winLenght) {
        this.fieldSize = fieldSize;
        this.winLenght = winLenght;
        isInit = true;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics graf) {
        super.paintComponent(graf);
        graf.clearRect(0, 0, getWidth(), getHeight());
        drawGrid(graf);
        drawXO(graf);
        if (!isInit) {
            return;
        }



    }

    private void drawGrid(Graphics graf) {
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        cellWidth = panelWidth / fieldSize;
        cellHeidt = panelHeight / fieldSize;
        graf.setColor(Color.GRAY);
        ((Graphics2D) graf).setStroke(new BasicStroke(2));

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeidt;
            graf.drawLine(0, y, panelWidth, y);
        }
        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            graf.drawLine(x, 0, x, panelHeight);
        }
    }

    private void drawX(int j, int i, Graphics graf) {
        graf.setColor(Color.BLUE);
        ((Graphics2D) graf).setStroke((new BasicStroke(3)));
        graf.drawLine(i * cellWidth, j * cellHeidt, (i + 1) * cellWidth, (j + 1) * cellHeidt);
        graf.drawLine(i * cellWidth, (j + 1) * cellHeidt, (i + 1) * cellWidth, j * cellHeidt);

    }

    private void drawO(int j, int i, Graphics graf) {
        graf.setColor(Color.RED);
//        ((Graphics2D) graf).setStroke((new BasicStroke(2)));
        graf.drawOval((i * cellWidth) - 1 * cellWidth / 100, j * cellHeidt + 4, cellWidth, cellHeidt);

    }

    private void drawXO(Graphics graf) {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {

                    drawX(i, j, graf);

                } else if (Logic.map[i][j] == Logic.DOT_O) {

                    drawO(i, j, graf);


                }


            }

        }

    }
}


