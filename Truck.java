/*
* This is a program that gets the Truck status
* from Truch to Main
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-11-02
*/

/**
 * This is the class for Truck.
 * Make class Truck.
 */

public class Truck extends Vehicle {

    /**
    * This is the license plate.
    */
    private String licensePlate;

    /**
     * This is the truck constructor.
     *
     * @param color this is the color.
     * @param licensePlate this is the license plate.
     * @param maxSpeed this is the max speed.
     */
    public Truck(String color, String licensePlate, int maxSpeed) {
        super(color, maxSpeed);
        this.licensePlate = licensePlate;
    }

    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * This sets the licensePlate.
     *
     * @param newLicensePlate this is the new variable.
     */
    public void setLicensePlate(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * This is the breaking method.
     *
     * @param breakPower the break power.
     * @param breakTime the break time.
     * @param airPressure the air pressure.
     */
    public void breaking(int breakPower, int breakTime, int airPressure) {
        super.setSpeed(super.getSpeed() - (breakPower * breakTime)
                       - (airPressure * breakTime));

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }

    /**
     * This is the status method.
     */
    public void status() {
        System.out.println(" ---> Speed: " + super.getSpeed());
        System.out.println(" ---> MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" ---> Color: " + super.getColor());
        System.out.println(" ---> licensePlate: " + this.getLicensePlate());
    }
}
