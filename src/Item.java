class Item {
    double price;
    int stock;
    int sales;

    Item(double price, int numPieces) {
        this.price = price;
        this.stock = numPieces;
        this.sales = 0;
    }

    void restock(int amount) {
        this.stock = this.stock + amount;
    }

    void purchase(int amount) {
        this.stock = this.stock - amount;
        sales += 1;
    }
}