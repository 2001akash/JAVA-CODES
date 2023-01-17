import java.util.Stack;

public class Program16 {
    public static void main(String[] args) {
        // The Stack class
        // stacke ius derived from vector
        // stack folows lifo i.e last in first out
        // stack provides method like push(),peek to work with data
        Stack<String> cakeLayers = new Stack<String>();
        cakeLayers.push("chocolate");
        cakeLayers.push("Vanilla");
        cakeLayers.push("Strawberry");
        cakeLayers.push("Rum-Raisin");
        cakeLayers.push("TootyFruity");
        System.out.println("Total layers added " + cakeLayers.size());
        System.out.println("The layer atthe top is " + cakeLayers.peek());
        System.out.println("Eating the top layer " + cakeLayers.pop());
        System.out.println("Layers we are Left with " + cakeLayers.size());
        while (cakeLayers.size() > 0) {
            System.out.println("Eating all layers,currently it is " + cakeLayers.pop());
        }
        System.out.println("Layers we are left with " + cakeLayers.size());
    }

}
