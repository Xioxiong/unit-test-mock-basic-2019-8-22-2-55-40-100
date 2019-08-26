package cashregister;

public class MockPrinter extends Printer {
    private String printerText;

    public String getPrinterText(){
        return printerText;
    }
    public void setPrinterText(String s){
        this.printerText = s;
    }
    @Override
    public void print(String printThis) {
        this.printerText = printThis;
    }
}
