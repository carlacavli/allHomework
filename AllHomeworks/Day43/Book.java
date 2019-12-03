package AllHomeworks.Day43;
// Let's write a Online-Shop that sells books: ChildrenBook & Comics
// use inheritance, polymorphism and encapsulation while doing this

// Note: this HW is open-ended, so there a lot of way to solve it
// task about salary is similar to this

// Hint: you can use Book as parent class and define price() method there

public class Book {
    private  String title;
    private String author;
    private int numofpages;
    private double price;

    public double price(){
        return price;
    }

    public Book(String title,String author,int numofpages,double price){
        this. title=title;
        this.author=author;
        this.numofpages=numofpages;
        this.price=price;
    }

    public Book(double price) {
    }


    public String getTitle() { return title;
    }

    public void setTitle(String title) { this.title = title;
    }

    public String getAuthor(){ return author;
    }

    public void setAuthor(String author) { this.author = author;
    }



}
