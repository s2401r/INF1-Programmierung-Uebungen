/**
 * Liste zum verwalten von mehreren Objekten
 */
public class List {

    /**
     * Repraesentiert ein Element der Liste.
     * Kapselt den Inhalt der gespeichert werden soll mit zusaetzlichen Informationen,
     * welche notwendig sind fuer die Listenstruktur
     */
    private static class ListElem {
        /**
         * Inhalt des Listenelements
         */
        Object content;
        /**
         * naechstes Listenelement
         */
        ListElem succ;

        /**
         * Konstruktor
         *
         * @param cont Inhalt des Elements
         * @param next naechstes Element der Liste
         */
        ListElem(Object cont, ListElem next) {
            content = cont;
            succ = next;
        }
    }

    /**
     * Der ListIterator stellt eine Moeglichkeit zur Verfuegung auf der Liste zu navigieren.
     * Der Iterator startet dabei beim ersten Element der Liste und kann nur in eine Richtung navigieren.
     */
    public class ListIterator {
        /**
         * Ein Zeiger, welcher das aktuelle Element vorhaelt.
         */
        protected ListElem current;

        /**
         * Konstruktor
         * Dieser zeigt beim Erstellen auf das erste Element (head) der Liste.
         */
        public ListIterator() {
            current = head;
        }

        /**
         * Gibt an, ob in der Liste ein weiteres Element vorhanden ist.
         *
         * @return true, falls noch ein weiteres Element vorhanden ist; andernfalls false.
         */
        public boolean hasNext() {
            return (current.succ != null);
        }

        /**
         * Gibt das naechste Element der Liste zurueck. Kann zum Fehler fuehren, falls kein weiteres Element existiert.
         * Mit {@link #hasNext()} kann geprueft werden, ob ein weiteres Element verfuegbar ist.
         *
         * @return Wert des naechsten Elements.
         */
        public Object next() {
            if (hasNext()) {
                Object val = current.content;
                current = current.succ;
                return val;
            } else {
                return current.content;
            }
        }
    }

    /**
     * Erstes Element der Liste
     */
    protected ListElem head = null;

    /**
     * Fuegt ein Element an der ersten Position der Liste ein.
     * Die bereits vorhandene Liste wird an dieses neue Element angeknuepft.
     *
     * @param item Wert des neuen Elements.
     */
    public void insertFirst(Object item) {
        head = new ListElem(item, head);

        ListIterator iterator = iterator();
        return;
    }

    /**
     * Fuegt ein Element an einer bestimmten Position der Liste ein.
     * Ein index von 0 referenziert dabei auf das erste Element und ist damit aequivalent zu {@link #insertFirst}.
     * Die Liste bis zu Position index bleibt unveraendert.
     * Die restliche Liste wird an das neue Element angeknuepft.
     *
     * @param index Position des neuen Elements
     * @param item  Wert des neuen Elements
     * @return false, falls der index ausserhalb der Grenzen der Liste liegt; andernfalls true.
     */
    public boolean insert(int index, Object item) {
        ListIterator iter = iterator();

        for (int i = 0; i < index; i++) {
            if (!iter.hasNext() && i != index - 1) {
                return false;
            } else {
                iter.next();
            }
        }

        ListElem listElem;
        if (iter.hasNext()) {
            listElem = new ListElem(item, iter.current.succ);
        } else {
            listElem = new ListElem(item, null);
        }

        iter.current.succ = listElem;
        return true;
    }

    /**
     * Entfernt ein Element aus der Liste.
     * Die ueberbleibenden Elemente bleiben dabei erhalten und vom Iterator navigierbar.
     *
     * @param index Position des Elements das geloescht werden soll.
     * @return null, falls der index ausserhalb der Grenzen der Liste liegt;
     * andernfalls den Wert des geloeschten Elements.
     */
    public Object remove(int index) {

        ListIterator iter = iterator();

        if (index <= 0) {
            if (iter.hasNext()) {
                head = iter.current.succ;
                return iter.current.content;
            } else {
                head = null;
                return iter.current.content;
            }
        } else if (index > 0) {
            for (int i = 0; i < index - 1; i++) {
                if (!iter.hasNext()) {
                    return null;
                } else {
                    iter.next();
                }
            }

            if (iter.hasNext()) {
                if (iter.current.succ != null) {
                    if (iter.current.succ.succ != null) {
                        Object val = iter.current.succ.content;
                        iter.current.succ = iter.current.succ.succ;
                        return val;
                    } else {
                        Object val = iter.current.succ.content;
                        iter.current.succ = null;
                        return val;
                    }
                }
            } else {
                return null;
            }
        }

        return null;
    }

    /**
     * Gibt eine Instanz des ListIterators fuer diese Liste zurueck.
     *
     * @return ListIterator
     */
    public ListIterator iterator() {
        return new ListIterator();
    }
}