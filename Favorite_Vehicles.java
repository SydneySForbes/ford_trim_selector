package com.example.trimselector.models;

import org.bson.types.ObjectId;

public class Favorite_Vehicles {


        private ObjectId id;
        private ObjectId userId;
        private ObjectId vehicleId;
        private ObjectId trimId;

        // Constructors
        public Favorite() {
        }

        public Favorite(ObjectId id, ObjectId userId, ObjectId vehicleId, ObjectId trimId) {
            this.id = id;
            this.userId = userId;
            this.vehicleId = vehicleId;
            this.trimId = trimId;
        }

        // Getters and Setters
        public ObjectId getId() {
            return id;
        }

        public void setId(ObjectId id) {
            this.id = id;
        }

        public ObjectId getUserId() {
            return userId;
        }

        public void setUserId(ObjectId userId) {
            this.userId = userId;
        }

        public ObjectId getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(ObjectId vehicleId) {
            this.vehicleId = vehicleId;
        }

        public ObjectId getTrimId() {
            return trimId;
        }

        public void setTrimId(ObjectId trimId) {
            this.trimId = trimId;
        }

        // toString Method for Debugging
        @Override
        public String toString() {
            return "Favorite{" +
                    "id=" + id +
                    ", userId=" + userId +
                    ", vehicleId=" + vehicleId +
                    ", trimId=" + trimId +
                    '}';
        }


}
