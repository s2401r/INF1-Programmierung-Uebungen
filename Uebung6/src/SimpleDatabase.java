/**
 * Created by Tobias on 23/11/2016.
 */

import java.awt.*;
import java.awt.event.*;

public class SimpleDatabase extends Frame {

    protected Button btn_last = new Button("Zurück");
    protected Label lbl_index = new Label("0");
    protected Button btn_next = new Button("Weiter");

    protected TextField txt_content = new TextField("");

    protected Button btn_save = new Button("Speichern");
    protected Button btn_load = new Button("Laden");
    protected Button btn_end = new Button("Beenden");

    private String[] databaseObject = new String[10];
    private int pivot = 0;

    public SimpleDatabase() {
        setBounds(400, 400, 250, 300);
        setLayout(new GridBagLayout());
        setBackground(Color.white);
        setTitle("Simple Database");

        btn_last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pivot == 0) {
                    pivot = 9;
                } else {
                    pivot -= 1;
                }
                setLbl_index(pivot);
            }
        });
        lbl_index.setAlignment(Label.CENTER);
        btn_next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pivot == 9) {
                    pivot = 0;
                } else {
                    pivot += 1;
                }
                setLbl_index(pivot);
            }
        });

        btn_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_content.getText() != null) {
                    databaseObject[pivot] = txt_content.getText();
                }
            }
        });
        btn_load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (databaseObject[pivot] != null) {
                    txt_content.setText(databaseObject[pivot]);
                } else {
                    txt_content.setText("");
                }
            }
        });
        btn_end.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        addWindowListener(new SimpleDatabaseWindowListener());

        put(this, btn_last, 0, 0, 1);
        put(this, lbl_index, 1, 0, 1);
        put(this, btn_next, 2, 0, 1);

        put(this, txt_content, 0, 1, 3);

        put(this, btn_save, 0, 2, 1);
        put(this, btn_load, 1, 2, 1);
        put(this, btn_end, 2, 2, 1);

        pack();

        setVisible(true);
    }

    class SimpleDatabaseWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().dispose();
            System.exit(0);
        }
    }

    static public void main(String[] args) {
        new SimpleDatabase();
    }

    private static void put(Container ctr, Component comp, int x, int y, int w) {
        GridBagLayout g = (GridBagLayout) ctr.getLayout();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = x;
        c.gridy = y;
        c.gridwidth = w;
        c.gridheight = 1;
        c.weightx = 0.0;
        c.weighty = 0.0;
        ctr.add(comp);
        g.setConstraints(comp, c);
    }

    private void setLbl_index(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);

        lbl_index.setText(sb.toString());
    }
}



