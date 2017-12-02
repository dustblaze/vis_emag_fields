/**
 * Created by dust on 2/12/17.
 */

public enum GraphType {
    E_VECTOR, E_FIELD, M_VECTOR, M_FIELD;

    public String toArg() {
        switch (this) {
            case E_VECTOR:
                return "--e_vector ";
            case E_FIELD:
                return "--e_field ";
            case M_VECTOR:
                return "--m_vector ";
            case M_FIELD:
                return "--m_field ";
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(E_VECTOR.toArg());
    }
}
