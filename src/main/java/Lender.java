final class Lender {

     int fund = 100;

    public int availableFund(){
        return fund;

    }

    public int getLoan(int loanAmount){

        if(loanAmount >= fund){

            throw new IllegalArgumentException("Loan request greater than available fund");
        }

        return loanAmount;

    }

    public int addFunds(int m){

        m+= fund;
        return m;
    }



       }







