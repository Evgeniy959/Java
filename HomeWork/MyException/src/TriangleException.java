public class TriangleException extends Exception
{
    String message;
    public TriangleException() {
        message = "Bad sides of triangle.";
    }

    public TriangleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return "TriangleException{}. Bad sides of triangle.";
    }

}
