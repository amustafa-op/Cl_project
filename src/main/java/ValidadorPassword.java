public class ValidadorPassword {
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 19;

    public boolean esValida(String password) {
        if (password == null) return false;

        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) return false;
        if (password.contains(" ")) return false;

        return tieneAlMenosUnDigito(password);
    }

    private boolean tieneAlMenosUnDigito(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}
