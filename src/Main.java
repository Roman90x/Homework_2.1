public class Main {
    public static void main(String[] args) {
        System.out.println();
        taskHuman();
        System.out.println();
        //taskCar();
        System.out.println();
    }
        public static void taskHuman() {

        int year = 2022;

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.town = "Минск";
        maksim.job = "бренд-менеджер";

        Human anya = new Human();
        anya.name = "Аня";
        anya.age = 29;
        anya.town = "Москва";
        anya.job = "методист образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.age =28;
        katya.town = "Калининград";
        katya.job = "продакт-менеджер";

        Human artem = new Human();
        artem.name = "Артем";
        artem.age = 27;
        artem.town = "Москва";
        artem.job = "директор по развитию бизнеса";

        System.out.println("Привет! Меня зовут " + maksim.name +
                ". Я из города " + maksim.town +
                ". Я родился в " + (year - maksim.age) +
                " году. Я работаю на должности "+ maksim.job +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name +
                ". Я из города " + anya.town +
                ". Я родилась в " + (year - anya.age) +
                " году. Я работаю на должности "+ anya.job +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name +
                ". Я из города " + katya.town +
                ". Я родилась в " + (year - katya.age) +
                " году. Я работаю на должности "+ katya.job +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name +
                ". Я из города " + artem.town +
                ". Я родился в " + (year - artem.age) +
                " году. Я работаю на должности "+ artem.job +
                ". Будем знакомы!");
    }

    public static void taskCar() {

        car granta = new car();
        granta.brand = "LADA";
        granta.model = "Granta";
        granta.productionYear = 2015;
        granta.productionCountry = "Россия";
        granta.color = "Желтый";
        granta.engineVolume = 1.7;
        System.out.println("Марка автомобиля " + granta.brand +
                "; Модель " + granta.model +
                "; Год выпуска " + granta.productionYear +
                "; Страна сборки " + granta.productionCountry +
                "; Цвет кузова " + granta.color +
                "; Объем двигатель " + granta.engineVolume);


        car audi = new car();
        audi.brand = "AUDI";
        audi.model = "A8 50 L TDI quattro";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        audi.color = "Черный";
        audi.engineVolume = 3.0;
        System.out.println("Марка автомобиля " + audi.brand +
                "; Модель " + audi.model +
                "; Год выпуска " + audi.productionYear +
                "; Страна сборки " + audi.productionCountry +
                "; Цвет кузова " + audi.color +
                "; Объем двигатель " + audi.engineVolume);


        car bmw = new car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        bmw.color = "Черный";
        bmw.engineVolume = 3.0;
        System.out.println("Марка автомобиля " + bmw.brand +
                "; Модель " + bmw.model +
                "; Год выпуска " + bmw.productionYear +
                "; Страна сборки " + bmw.productionCountry +
                "; Цвет кузова " + bmw.color +
                "; Объем двигатель " + bmw.engineVolume);


        car kia = new car();
        kia.brand = "Kia";
        kia.model = "Sportage 4";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        kia.color = "Красный";
        kia.engineVolume = 2.4;
        System.out.println("Марка автомобиля " + kia.brand +
                "; Модель " + kia.model +
                "; Год выпуска " + kia.productionYear +
                "; Страна сборки " + kia.productionCountry +
                "; Цвет кузова " + kia.color +
                "; Объем двигатель " + kia.engineVolume);


        car hyundai = new car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        hyundai.color = "Оранжевый";
        hyundai.engineVolume = 1.6;
        System.out.println("Марка автомобиля " + hyundai.brand +
                "; Модель " + hyundai.model +
                "; Год выпуска " + hyundai.productionYear +
                "; Страна сборки " + hyundai.productionCountry +
                "; Цвет кузова " + hyundai.color +
                "; Объем двигатель " + hyundai.engineVolume);

    }
}