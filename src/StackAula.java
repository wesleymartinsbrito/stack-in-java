import java.util.Stack;

public class StackAula {
    public static void main(String[] args) {
        Stack <String> carros = new Stack<>();
        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Bmw");

        System.out.println(" Primeiro elemento da pilha: " +carros.peek());
        System.out.println(carros);
        System.out.println("Primeiro elemento da pilha sendo retirado: " +carros.pop());
        System.out.println(carros.peek());
        System.out.println(carros);
        System.out.println(carros.isEmpty()?"Pilha sem elementos":"Pilha com elementos!");
    }
}
