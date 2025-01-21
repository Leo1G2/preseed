using System;

namespace CSharpDiscovery.Quest02
{
    public class FromStringToDateTime_Exercice
    {
        public static DateTime FromStringToDateTime(string dateStr)
        {
            string[] dateTimeParts = dateStr.Split(' ');
            string[] dateParts = dateTimeParts[0].Split('/');
            string[] timeParts = dateTimeParts[1].Split(':');
            int day = int.Parse(dateParts[0]);
            int month = int.Parse(dateParts[1]);
            int year = int.Parse(dateParts[2]);
            int hour = int.Parse(timeParts[0]);
            int minute = int.Parse(timeParts[1]);
            return new DateTime(year, month, day, hour, minute, 0);
        }   
    }
}
