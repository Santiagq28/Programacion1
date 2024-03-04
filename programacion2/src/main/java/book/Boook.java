
package book;

public class Boook {
    public static void main(String[] args){
        search iliada = new search("Iliada",15,102203,"Èpico","19/02/24","28/02/24");
        iliada.searching();
        System.out.println(iliada.getId());
    }
    public static class search{
        String title;
        int ammount;
        int id;
        String genre;
        String loandate;
        String returndate;
        
        
        public search(String title, int ammount, int id, String genre, String loandate, String returndate){
            this.title = title;
            this.ammount = ammount;
            this.genre = genre;
            this.id = id;
            this.loandate = loandate;
            this.returndate = returndate;
            
        }
        public search(){
            
        }
        public void searching(){
        System.out.println(this.title+" "+this.ammount+" "+this.genre);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getAmmount() {
            return ammount;
        }

        public void setAmmount(int ammount) {
            this.ammount = ammount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getLoandate() {
            return loandate;
        }

        public void setLoandate(String loandate) {
            this.loandate = loandate;
        }

        public String getReturndate() {
            return returndate;
        }

        public void setReturndate(String returndate) {
            this.returndate = returndate;
        }
        
    }
}


