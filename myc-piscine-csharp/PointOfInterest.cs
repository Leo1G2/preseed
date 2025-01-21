namespace CSharpDiscovery.Quest03
{
    public class PointOfInterest
    {
        public double Latitude { get; set; }
        public double Longitude { get; set; }
        public string? Name { get; set; }

        public static string GoogleMapsUrlTemplate => "https://www.google.com/maps/place/{0}/@{1},{2},15z/";

        public PointOfInterest()
        {
            Name = "Bordeaux Ynov Campus";
            Latitude = 44.854186;
            Longitude = -0.5663056;
        }

        public PointOfInterest(string name, double latitude, double longitude)
        {
            this.Name = name;
            this.Latitude = latitude;
            this.Longitude = longitude;
        }

        public string GetGoogleMapsUrl()
        {
            return string.Format(GoogleMapsUrlTemplate, Name?.Replace(' ', '+'), Latitude, Longitude);
        }
        public override string ToString()
        {
            return $"{Name} (Lat={Latitude}, Long={Longitude})";
        }
    }
}
