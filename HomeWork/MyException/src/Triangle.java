public class Triangle {
    // стороны треугольника
    private double _a, _b, _c;

    public Triangle()
    {
        _a = _b = _c = 1;
    }

    public Triangle(double a, double b, double c)
    {
        try {
            if (((a+b)<c)||((a+c)<b)||((b+c)<a))
                throw new TriangleException();
        }
        catch(TriangleException e)
        {
            System.out.println("Exception: "+e.getMessage());
            return;
        }

        _a=a;
        _b=b;
        _c=c;
    }

    // площадь треугольника
    public double getArea()
    {
        double p, s;
        p = (_a +_b +_c)/2; // полупериметр
        s = Math.sqrt(p*(p -_a)*(p -_b)*(p -_c)); // формула Герона
        return s;
    }
}
