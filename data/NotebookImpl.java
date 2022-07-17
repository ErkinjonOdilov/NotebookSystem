package UZ.WAXA.HomeTask.notebook.data;

import UZ.WAXA.HomeTask.notebook.service.NotebookService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NotebookImpl implements NotebookService {
    private Scanner scanner=new Scanner(System.in);
    private Map<String,Notebook> map=new HashMap<>();
    @Override
    public void add() {
        System.out.print("Notebook Name: ");
        scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.print("Model: ");
        scanner=new Scanner(System.in);
        String model= scanner.nextLine();
        System.out.print("Color: ");
        scanner=new Scanner(System.in);
        String color= scanner.nextLine();
        System.out.print("Display: ");
        scanner=new Scanner(System.in);
        String display= scanner.nextLine();
        System.out.print("Memory: ");
        scanner=new Scanner(System.in);
        String memory=scanner.nextLine();
        System.out.print("OZU: ");
        scanner=new Scanner(System.in);
        String ozu=scanner.nextLine();
        System.out.print("SSD: ");
        scanner=new Scanner(System.in);
        String ssd=scanner.nextLine();
        System.out.print("HDD: ");
        scanner=new Scanner(System.in);
        String hdd= scanner.nextLine();
        System.out.print("GPU: ");
        scanner=new Scanner(System.in);
        String gpu= scanner.nextLine();
        System.out.print("Chastota: ");
        scanner=new Scanner(System.in);
        String chastota= scanner.nextLine();
        Notebook n1=new Notebook(model,color,display,memory,ozu,ssd,hdd,gpu,chastota);
        map.put(name,n1);
        System.out.println("Successfully added");
    }

    @Override
    public void edit() {
        System.out.print("Notebook Name: ");
        scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        if(map.containsKey(name)){
            System.out.println("Which one is edited");
            System.out.println("1->Notebook name\n2->Model\n3->Color\n4->Display\n5->Memory\n6->OZU\n7->SSD\n8->HDD\n" +
                    "9->GPU\n10->Chastota");
            int n=scanner.nextInt();
            switch (n){
                case 1->{
                    Notebook n2=map.get(name);
                    System.out.print("New Notebook Name: ");
                    scanner=new Scanner(System.in);
                    String newName=scanner.nextLine();
                   map.put(newName,n2);
                   map.remove(name);
                    System.out.println("Successfully edited");

                }
                case 2->{   System.out.print("New Notebook Model: ");
                    scanner=new Scanner(System.in);
                    String newModel=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setModel(newModel);
                    System.out.println("Successfully edited");}
                case 3->{ System.out.print("New Notebook Color: ");
                    scanner=new Scanner(System.in);
                    String newColor=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setColor(newColor);
                    System.out.println("Successfully edited");}
                case 4->{ System.out.print("New Notebook Display: ");
                    scanner=new Scanner(System.in);
                    String newDisplay=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setDisplay(newDisplay);
                    System.out.println("Successfully edited");}
                case 5->{ System.out.print("New Notebook Memory: ");
                    scanner=new Scanner(System.in);
                    String newMemory=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setMemory(newMemory);
                    System.out.println("Successfully edited");}
                case 6->{ System.out.print("New Notebook OZU: ");
                    scanner=new Scanner(System.in);
                    String newOzu=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setOzu(newOzu);
                    System.out.println("Successfully edited");}
                case 7->{ System.out.print("New Notebook SSD: ");
                    scanner=new Scanner(System.in);
                    String newSsd=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setSsd(newSsd);
                    System.out.println("Successfully edited");}
                case 8->{ System.out.print("New Notebook HDD: ");
                    scanner=new Scanner(System.in);
                    String newHdd=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setHdd(newHdd);
                    System.out.println("Successfully edited");}
                case 9->{ System.out.print("New Notebook GPU: ");
                    scanner=new Scanner(System.in);
                    String newGpu=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setGpu(newGpu);
                    System.out.println("Successfully edited");}
                case 10->{ System.out.print("New Notebook Chastota: ");
                    scanner=new Scanner(System.in);
                    String newChastota=scanner.nextLine();
                    Notebook n2=map.get(name);
                    n2.setChastota(newChastota);
                    System.out.println("Successfully edited");}
            }
        }else {
            System.out.println("Not Found");
        }
    }

    @Override
    public void remove() {
        System.out.print("Notebook Name: ");
        scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        if(map.containsKey(name)){
            map.remove(name);
            System.out.println("Successfully removed");
        }else {
            System.out.println("Not Found");
        }
    }

    @Override
    public void list() {
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s+" -> "+map.get(s));
        }
    }
}
