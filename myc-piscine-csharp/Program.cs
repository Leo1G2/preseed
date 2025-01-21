using System;
using CSharpDiscovery.Quest03;

namespace TestCSharp
{
    class Program
    {
        static void Main(string[] str)
        {
            var poi = new PointOfInterest();
            Console.WriteLine(poi.Latitude);
            Console.WriteLine(poi.Longitude);
            Console.WriteLine(poi.Name);

            Console.WriteLine(PointOfInterest.GoogleMapsUrlTemplate);
        }
    }
}
