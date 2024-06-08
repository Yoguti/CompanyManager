package empresa_model;

import java.io.Serializable;
import java.math.BigInteger;

public class CNPJ implements Serializable {
    private final BigInteger cnpj;
    private static final int MAX_CNPJ_LENGTH = 14;

    public CNPJ(String cnpj) {
        this.cnpj = validateAndCleanCNPJ(cnpj);
    }

    private BigInteger validateAndCleanCNPJ(String cnpj) {
        if (cnpj == null) {
            throw new IllegalArgumentException("CNPJ cannot be null");
        }
        String cleanedCNPJ = cnpj.replaceAll("[^\\d]", "");
        if (cleanedCNPJ.length() != MAX_CNPJ_LENGTH) {
            throw new IllegalArgumentException("CNPJ must have 14 digits");
        }
        BigInteger cnpjNumber = new BigInteger(cleanedCNPJ);
        return cnpjNumber;
    }

    public BigInteger getCNPJ() {
        return cnpj;
    }

    public String toFormattedString() {
        String unformatted = String.format("%014d", cnpj);
        return String.format("%s.%s.%s/%s-%s",
                unformatted.substring(0, 2),
                unformatted.substring(2, 5),
                unformatted.substring(5, 8),
                unformatted.substring(8, 12),
                unformatted.substring(12, 14));
    }

    @Override
    public String toString() {
        return cnpj.toString();
    }
}
