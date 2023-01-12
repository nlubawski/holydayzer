public class Holidays {
  private String[] holidays = new String[] {
      "01/01/2023 => Confraternização mundial",
      "21/02/2023 => Carnaval",
      "17/04/2023 => Páscoa",
      "21/04/2023 => Tiradentes",
      "01/05/2023 => Dia do trabalho",
      "08/06/2023 => Corpus Christi",
      "07/09/2023 => Independência do Brasil",
      "12/10/2023 => Nossa Senhora Aparecida",
      "02/11/2023 => Finados",
      "15/11/2023 => Proclamação da República",
      "25/12/2023 => Natal" };

  public String[] getHolidays() {
    return this.holidays;
  }

  public String isHoliday(String date) {
    for (int i = 0; i < holidays.length; i++) {
      if(holidays[i].contains(date)){
        return holidays[i].substring(14);
      }
    }

    return "Não existe feriado neste dia";
  }
}