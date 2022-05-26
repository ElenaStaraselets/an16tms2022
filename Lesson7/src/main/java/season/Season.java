package season;

import lombok.Getter;

@Getter
public enum Season {

    WINTER(1, "Холодно, снег, Новый год", -5),
    SPRING(2, "Теплее, первая зелень, цветение садов", 8),
    SUMMER(3, "Солнце, каникулы, море", 23) {
        //Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(4, "Желтые листья, холодает, дожди", 10);
    final int id;
    final String about;
    final int middleTemperature;

    Season(int id, String about, int middleTemperature) {
        this.id = id;
        this.about = about;
        this.middleTemperature = middleTemperature;
    }

    //Добавить конструктор принимающий на вход среднюю температуру
    Season(int middleTemperature) {
        this.id = 0;
        this.middleTemperature = middleTemperature;
        this.about = "";
    }

    public int getMiddleTemperature() {
        return middleTemperature;
    }

    //Создать метод getDescription, возвращающий строку “Холодное время года”
    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "Season{" + this.name() + "; " +
                "id=" + id +
                ", about='" + about + '\'' +
                ", middleTemperature=" + middleTemperature +
                '}';
    }


}
