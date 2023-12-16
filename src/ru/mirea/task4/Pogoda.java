package ru.mirea.task4;

enum TimeOfYear {
    Весна(18), Лето(30), Осень(12), Зима(-5);

    private int middleTemperature;

    TimeOfYear(int middleTemperature) {
        this.middleTemperature = middleTemperature;
    }

    public int getMiddleTemperature() {
        return middleTemperature;
    }

    public String getDescription() {
        switch (this) {
            case Лето:
                return "Теплое и солнечное время года";
            default:
                return "Прохладное время года";
        }
    }
}

public class Pogoda {
    public static void main(String[] args) {
        TimeOfYear favoriteSeason = TimeOfYear.Лето;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getMiddleTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        System.out.println("Информация о временах года:");
        for (TimeOfYear season : TimeOfYear.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getMiddleTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
