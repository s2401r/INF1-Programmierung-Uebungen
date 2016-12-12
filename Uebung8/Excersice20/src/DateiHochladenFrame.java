import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class DateiHochladenFrame extends MeinFrame implements ActionListener {

    /**
     * Set aller Komponenten der Anwendung
     */
    protected Label warnung = new Label("");
    protected Label info = new Label("Bitte geben Sie einen Dateinamen ein!");
    protected TextField dateiName = new TextField("Wunschzettel.txt");
    protected Button upload = new Button("Upload starten!");
    protected Button zurueck = new Button("Zurueck");

    /**
     * Erstellt das Frame und setzt die Startwerte der Komponenten
     */
    public DateiHochladenFrame() {
        super("Datei hochladen");
        setBounds(400, 400, 250, 300);
        setLayout(new GridBagLayout());
        setBackground(Color.white);
        setFont(Font.getFont(Font.SANS_SERIF));

        warnung.setForeground(Color.red);

        put(warnung, 1, 0, 1);
        put(info, 1, 1, 1);
        put(dateiName, 1, 2, 1);
        put(upload, 1, 3, 1);
        put(zurueck, 1, 4, 1);
        upload.addActionListener(this);
        zurueck.addActionListener(this);
        pack();
        setVisible(true);
    }

    /**
     * Behandelt die Aktionen beim Klick der verschiedenen Buttons
     *
     * @param event
     */
    public void actionPerformed(ActionEvent event) {
        // Setzt die Warnungsmeldung zurueck!
        warnung.setText("");
        if (event.getSource() == zurueck) {
            Wuenschedatenbank.getInstanz().setVisible(true);
            setVisible(false);
        } else if (event.getSource() == upload) {
            try {
                this.dateiHochladen(dateiName.getText());
            } catch (FileNotFoundException e) {
                warnung.setText("Datei wurde nicht gefunden!");
            } catch (GeschenkOhneTitelException e) {
                warnung.setText("Ein Geschenk hat keinen Titel!");
            } catch (FalscherNameException e) {
                warnung.setText("Der Name eines Kinds ist ungueltig!");
            }
        }

    }

    /**
     * Laed alle Wuensche und Kinder aus einer Datei in die Anwendung.
     *
     * @param datei Name der Datei
     * @throws Fehler beim Einlesen der Datei
     */
    public void dateiHochladen(String datei) throws GeschenkOhneTitelException, FalscherNameException, FileNotFoundException {
        FileReader reader = new FileReader(datei);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            String line = bufferedReader.readLine();
            do {
                String[] lineArray = line.split(";");

                Geschenk geschenk = new Geschenk(lineArray[1], GeschenkTyp.valueOf(lineArray[2]));

                Kind kind = KinderListe.getKind(lineArray[0]);
                kind.addGeschenk(geschenk);

                line = bufferedReader.readLine();
            } while (line != null);
        } catch (IOException e) {
            warnung.setText("Es ist ein Fehler während des Dateiupload aufgetreten.");
        }

    }

    /**
     * Ermoeglicht die Verwaltung einer einzigen Instanz fuer das Frame.
     */
    public static DateiHochladenFrame instanz;

    public static DateiHochladenFrame getInstanz() {
        if (instanz == null) {
            instanz = new DateiHochladenFrame();
        }
        return instanz;
    }

    /**
     * Schliesst die eine Instanz des Frames.
     */
    public static void disposeInstanz() {
        if (instanz != null) {
            instanz.dispose();
        }
    }

}
