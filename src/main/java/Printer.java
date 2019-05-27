public class Printer {

    private int pages, toner;

    public Printer(int pages, int toner){
      this.pages = pages;
      this.toner = toner;
    }

    public void print(int pages, int copies) {
        if (pages * copies < this.pages) {
            //Enough pages & toner
            if (pages * copies < this.toner) {
                this.pages -= (pages * copies);
            }else/*Not enough toner*/{
                this.pages -= this.toner;
                this.toner = 0;
                tonerError();
            }
        }
    }

    public int getPages(){
      return this.pages;
    }

    public int getToner(){
        return this.toner;
    }

    private void tonerError(){
        System.out.println("OUT OF TONER");
    }

}
