package ca.ciccc.wmad202.assignment6.main.example;

public class TestExample {

    public static void test(){
//                Item1: Cylindrical (height = 10, radius = 5).
//                Item3: Cylindrical (height = 7, radius = 2).
//                Item6: Cylindrical (height = 6, radius = 2).

//                Item2: Cuboid (width = 10, length = 4, height=3)
//                Item4: Cuboid (width = 13, length = 5, height=2)


//        Item5: Cube (width=length=height=12)

        Item item1 = new Cylindrical(Item.Color.Yellow, 10, 5);
        Item item3 = new Cylindrical(Item.Color.Green, 7, 2);
        Item item6 = new Cylindrical(Item.Color.Gray, 6, 2);

        Item item2 = new Cuboid(Item.Color.Green, 3, 10, 4);
        Item item4 = new Cuboid(Item.Color.Yellow, 2, 13, 5);

        Item item5 = new Cube(Item.Color.Gray, 12);

        Table table = new Table();
        table.addItem(item1);
        table.addItem(item2);
        table.addItem(item3);
        table.addItem(item4);
        table.addItem(item5);
        table.addItem(item6);

        System.out.println("Total volume: "+table.getTotalVolume());

        System.out.println("Total volume of Cuboid-V1: "+table.getTotalVolumeForCuboid());
        System.out.println("Total volume of Cuboid-V2: "+table.getTotalVolume(Cuboid.class));
        System.out.println("Total volume of Cylindrical-V2: "+table.getTotalVolume(Cylindrical.class));
        System.out.println("Total volume of Cube-V2: "+table.getTotalVolume(Cube.class));

        System.out.println("Total volume of All Yellows-V1: "+table.getTotalVolumeInYellowItems());
        System.out.println("Total volume of All Yellows-V2: "+table.getTotalVolume(Item.Color.Yellow));
        System.out.println("Total volume of All Green-V2: "+table.getTotalVolume(Item.Color.Green));
        System.out.println("Total volume of All Gray-V2: "+table.getTotalVolume(Item.Color.Gray));

    }
}
