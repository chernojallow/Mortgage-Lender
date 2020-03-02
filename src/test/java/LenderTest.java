import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


final class LenderTest {

    @Test
    void availableFundTest() {


        Lender lender = new Lender();

        int result = lender.availableFund();
        assertEquals(100, result);

    }

      @Test
    void getLoanTest() {

        Lender lender = new Lender();

        String expected  = "Loan request greater than available fund";
         Exception actual = assertThrows(IllegalArgumentException.class, () -> lender.getLoan(300));

        assertThat(actual.getMessage()).isEqualTo(expected);

    }


    @Test
    void addFundTest() {

        Lender lender = new Lender();

        int results = lender.addFunds(300);
        assertEquals(400, results);

    }





}
