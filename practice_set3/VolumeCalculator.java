class VolumeCalculator {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube (Cuboid)
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Main method to test overloaded methods
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        double cubeVolume = vc.calculateVolume(5);
        double rectangularCubeVolume = vc.calculateVolume(4, 5, 6);
        double sphereVolume = vc.calculateVolume(3, true);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}
