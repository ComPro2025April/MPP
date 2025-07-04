In this problem we didn't override hashCode() method. 
That's why our code using default hashCode() method from Object and return wrong result.

We should implement own hashCode() method inside Employee class.

    @Override
    public int hashCode(){
        return (name + salary).hashCode();
    }