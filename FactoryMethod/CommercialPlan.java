package FactoryMethod;

class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate=7.50;
    }
}
