package com.example.recyclerview;

import java.util.ArrayList;

public class FruitDataSource {
    private static String[] fruitNames = {
            "Apel",
            "Jambu",
            "Jeruk",
            "Nanas",
            "Pepaya",
            "Pisang",
            "Semangka",
            "Strawberry",

    };

    private static String[] fruitDetails = {
            "Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.",
            "Jambu biji (Psidium guajava) atau sering juga disebut jambu batu, jambu siki dan jambu klutuk adalah tanaman tropis yang berasal dari Brasil. Jambu batu memiliki buah yang berwarna hijau dengan daging buah berwarna putih atau merah dan berasa asam-manis",
            "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, dan memiliki kuliat buah yang berwarna orange jika matang.",
            "Nanas,(Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae), memiliki daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal.",
            "Pepaya (Carica papaya L.), atau betik adalah tumbuhan yang berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya. Memiliki rasa yang manis dan lembut",
            "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar dan memanjang. Buah ini tersusun dalam tandan dengan kelompok-kelompok tersusun menjari yang disebut sisir. Hampir semua buah pisang memiliki kulit berwarna kuning ketika matang, ",
            "Semangka (juga dikenal sebagai tembikai[1] atau mendikai[1]) (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus",
            "Stroberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Buah stroberi berwarna hijau keputihan ketika sedang berkembang, dan pada kebanyakan spesies berubah menjadi merah ketika masak.",
    };

    private static int[] fruitImages = {
            R.drawable.apel,
            R.drawable.jambu,
            R.drawable.jeruk,
            R.drawable.nanas,
            R.drawable.pepaya,
            R.drawable.pisang,
            R.drawable.semangka,
            R.drawable.strawberry,
    };

    static ArrayList<Fruit> getListData() {
        ArrayList<Fruit> list = new ArrayList<>();
        for (int position = 0; position < fruitNames.length; position++) {
            Fruit fruit = new Fruit();
            fruit.setName(fruitNames[position]);
            fruit.setDetail(fruitDetails[position]);
            fruit.setPhoto(fruitImages[position]);
            list.add(fruit);
        }
        return list;
    }
}
