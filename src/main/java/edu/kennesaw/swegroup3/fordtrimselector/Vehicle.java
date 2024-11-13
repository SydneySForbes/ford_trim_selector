package edu.kennesaw.swegroup3.fordtrimselector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("vehicle")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    private ObjectId id;
    private String model;
    private String year;
    private List<Trim> trims;

    public class Trim{
        @Id
        private ObjectId id;
        private String name;
        private int starting_msrp;
        private String drive_type;
        private Engine engine;
        private Battery battery;
        private Drivetrain drivetrain;
        @Field("fuel_efficiency")
        private FuelEfficiency fuelEfficiency;
        private MPGe mpge;
        private Body body;
        @Field("pickup_bed")
        private PickupBed pickupBed;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class Engine{
            private String type;
            private String engine_model;
            private int horsepower;
            private int torque;
            private String fuel_type;
            private double fuel_capacity;
        }
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class Drivetrain{
            private String transmission;
            private String drive_type;
        }
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class Battery{
            private String port_type;
            private int capacity;
            private int range;
            private double charge_time;
            private int kwh_per_100_miles;
        }
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class FuelEfficiency{
            private int city;
            private int highway;
            private int combined;
        }
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class MPGe{
            private int city;
            private int highway;
            private int combined;
        }
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class Body {
            private String body_type;
            private int doors;
            private int seats;
            private double length;
            private double width;
            private double height;
            private double wheelbase;
            private int towing_capacity;
            private int cargo_capacity_max;
            private int cargo_capacity_seats_in_place;
            private int curb_weight;
        }
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public class PickupBed{
            private double length;
            private int payload_capacity;
        }

    }
}

