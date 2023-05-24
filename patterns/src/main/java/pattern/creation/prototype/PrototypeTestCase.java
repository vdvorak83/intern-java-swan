package pattern.creation.prototype;

public class PrototypeTestCase {
    public static void main(String[] args)  {
        Storage.addPrototype("myClass", new Forclone("original"));

        Prototype myClassCopy = Storage.getPrototype("myClass");
        System.out.println("Original name: " + ((Forclone) Storage.getPrototype("myClass")).getName());
        System.out.println("Copy name: " + ((Forclone) myClassCopy).getName());

        ((Forclone) myClassCopy).setName("new");

        System.out.println("Original name after change: " + ((Forclone) Storage.getPrototype("myClass")).getName());
        System.out.println("Copy name after change: " + ((Forclone) myClassCopy).getName());
    }
}