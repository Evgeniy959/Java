package com.example.oop;

public class Fraction {
    public int integer;
    public int numerator;
    public int denominator;

    void setDenominator(int denominator)
    {
        if (denominator == 0)throw new IllegalArgumentException("The denominator is zero.");
        this.denominator = denominator;
    }

    void setNumerator(int numerator) {
        if (numerator >= 0)this.numerator = numerator;
		else this.numerator = -numerator;
    }

    public Fraction() {
        integer = 0;
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Fraction(int integer, int numerator, int denominator) {
        this.integer = integer;
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    void to_proper()
    {
        int i = 1;
        for (; this.numerator >= this.denominator; i++)
        {
            this.numerator = this.numerator - this.denominator;
            this.integer = i;
        }
    }
    void to_improper()
    {
        this.numerator = this.integer * this.denominator + this.numerator;
        this.integer = 0;
    }
    void reduce()
    {
        int CommonMultiplier;
        do {
            if ((this.numerator <= this.denominator) && (this.numerator != 0))
                CommonMultiplier = this.numerator;
			else if (this.numerator > this.denominator)
                CommonMultiplier = this.denominator;
			else break;
            for (; CommonMultiplier > 0; CommonMultiplier--)
            {
                if (this.numerator % CommonMultiplier == 0 && this.denominator % CommonMultiplier==0)
                {
                    this.numerator = this.numerator / CommonMultiplier;
                    this.denominator = this.denominator / CommonMultiplier;
                    break;
                }
            }
        } while (CommonMultiplier != 1);
        this.to_proper();
    }

    public static Fraction addition(Fraction left, Fraction right)
    {
        left.to_improper();
        right.to_improper();
        Fraction result = new Fraction(left.numerator*right.denominator + right.numerator*left.denominator, left.denominator*right.denominator);
        result.reduce();
        result.print();
        return result;
    }

    public static Fraction subtraction(Fraction left, Fraction right)
    {
        left.to_improper();
        right.to_improper();
        Fraction result = new Fraction(left.numerator*right.denominator - right.numerator*left.denominator, left.denominator*right.denominator);
        result.reduce();
        result.print();
        return result;
    }

    public static Fraction multiply(Fraction left, Fraction right)
    {
        left.to_improper();
        right.to_improper();
        Fraction result = new Fraction(left.numerator*right.numerator,left.denominator*right.denominator);
        result.reduce();
        result.print();
        return result;
    }

    public static Fraction multiply(Fraction left, Fraction right1, Fraction right2)
    {
        left.to_improper();
        right1.to_improper();
        right2.to_improper();
        Fraction result = new Fraction(left.numerator*right1.numerator* right2.numerator,left.denominator*right1.denominator* right2.denominator);
        result.reduce();
        result.print();
        return result;
    }

    public static Fraction division(Fraction left, Fraction right)
    {
        left.to_improper();
        right.to_improper();
        Fraction result = new Fraction(left.numerator*right.denominator,left.denominator*right.numerator);
        result.reduce();
        result.print();
        return result;
    }

    void print()
    {

        if (this.numerator!=0 && this.integer!=0)
        {
            System.out.println (integer + "(" + numerator + "/" + denominator + ")" );
        }
		else if (this.integer==0 && this.numerator!=0)
        {
            System.out.println (numerator + "/" + denominator);
        }
		else
            System.out.println(integer);
    }
}
