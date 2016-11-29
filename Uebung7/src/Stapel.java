/**
 * Represents a last-in-first-out (LIFO) storage
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class Stapel<T> {
    //------------------------------------------------
    // ---- Fields
    //------------------------------------------------
    private StackElement top;

    //------------------------------------------------
    // ---- Constructor
    //------------------------------------------------

    /**
     * Contructs a new stack with no elements in stack.
     */
    public Stapel() {
        top = null;
    }

    //------------------------------------------------
    // ---- Methods
    //------------------------------------------------

    /**
     * Adds element of generic type to stack.
     *
     * @param element The element of generic type which will be added.
     */
    public void legeDrauf(T element) {
        if (element != null) {
            StackElement temp = top;
            top = new StackElement(element, top);
        }
    }

    /**
     * Removes the top element of generic type from stack and returns it.
     *
     * @return The top element of the stack which was removed from stack.
     * @throws StapelLeerException If stack is empty StapelLeerException will be thrown.
     */
    public T nehmeHerunter() throws StapelLeerException {
        if (!istLeer()) {
            StackElement temp = top;
            if (temp.hasSucc()) {
                top = temp.succ;

            } else {
                top = null;
            }
            return temp.element;
        } else {
            throw new StapelLeerException("The stack ist empty.");
        }
    }

    /**
     * Returns true if stack is empty, false if stack has minimum one element.
     *
     * @return true if stack is empty, false if stack has minimum one element
     */
    public boolean istLeer() {
        return top == null;
    }

    /**
     * Represents an element of the stack.
     */
    private class StackElement {
        //------------------------------------------------
        // ---- Fields
        //------------------------------------------------
        private T element;
        private StackElement succ;

        //------------------------------------------------
        // ---- Constructor
        //------------------------------------------------

        /**
         * Constructs a stack-element with given element of specific type and another stackelement as successor.
         *
         * @param element The element of specific type which will represent the stack element
         * @param succ    The successor of the stack-element.
         */
        public StackElement(T element, StackElement succ) {
            this.element = element;
            this.succ = succ;
        }

        //------------------------------------------------
        // ---- Methods
        //------------------------------------------------

        /**
         * Returns true if stackelement has a successor.
         *
         * @return true if stackelement has a successor.
         */
        protected boolean hasSucc() {
            return succ != null;
        }
    }
}
