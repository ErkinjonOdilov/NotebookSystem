package UZ.WAXA.HomeTask.notebook;

import UZ.WAXA.HomeTask.notebook.data.NotebookImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotebookImpl n2=new NotebookImpl();
        boolean isTrue=true;
        while (isTrue){
            System.out.println("1->Add Notebook\n2->Edit Notebook\n3->Remove Notebook\n4->List\n0->Exit");
            int n=scanner.nextInt();
            switch (n){
                 case 0->{isTrue=false;}
                 case 1->{n2.add();}
                 case 2->{n2.edit();}
                 case 3->{n2.remove();}
                 case 4->{n2.list();}
            }
        }
    }
}
