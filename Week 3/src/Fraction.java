public class Fraction{
    private int numerator, denominator;
	
	public int getNumerator() 
	{
        return numerator;
    }
	
	public void setNumerator(int numerator) 
	{
        this.numerator = numerator;
    }
	
	public int getDenominator() 
	{
        return denominator;
    }
	
	public void setDenominator(int denominator) 
	{
        if(denominator != 0)
		{
            this.denominator = denominator;
        }
        else return;
    }
	
	public Fraction() {this(0, 1);}
	
    public Fraction(int numerator, int denominator)
	{
        if (denominator != 0) 
		{
            setNumerator(numerator);
            setDenominator(denominator);
        }
		else 
		{
			setNumerator(numerator);
			setDenominator(1);
		}
    }
	
    public Fraction(int numerator)
	{
        setNumerator(numerator);
        setDenominator(1);

    }

	private int gcd(int a, int b)
	{
		while (b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }
	
    public Fraction reduce()
	{
		int k = gcd(this.denominator, this.numerator);
		this.denominator = this.denominator/k;
		this.numerator = this.numerator/k;
		return this;
    }

    public Fraction add(Fraction f)
	{
        numerator = numerator*f.denominator + f.numerator*denominator;
        denominator = denominator*f.denominator;
        return reduce();
    }

    public Fraction subtract(Fraction f)
	{
        numerator = numerator*f.denominator - f.numerator*denominator;
        denominator = denominator*f.denominator;
        return reduce();
    }

    public Fraction multiply(Fraction f)
	{
        numerator = numerator*f.numerator;
        denominator = denominator*f.denominator;
        return reduce();
    }

    public Fraction divide(Fraction f)
	{
        if (f.numerator != 0)
		{
            numerator = numerator*f.denominator;
            denominator = denominator*f.numerator;
        }
        return reduce();
    }
	
    public boolean equals(Object obj)
	{
        if (obj instanceof Fraction)
		{
            Fraction other = (Fraction) obj;
            int a = this.numerator*other.denominator;
            int b = this.denominator*other.numerator;
            return (a == b);
        }
        else return false;
    }

    
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(2, 4);
		System.out.println(f1.equals(f2));
		return;
	}
	
}
