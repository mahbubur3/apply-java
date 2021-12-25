interface printable {
    void print();
}

class Aud implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Aud obj = new Aud();
        obj.print();
    }
}
