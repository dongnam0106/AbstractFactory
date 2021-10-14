package LevelFactory;

import AbstractFactory.TechAbstractFactory;
import AbstractProduct.BE.BEAdvanced;
import AbstractProduct.BE.BackEnd;
import AbstractProduct.FE.FEAdvanced;
import AbstractProduct.FE.FrontEnd;

//ADVANCED FACTORY
public class AdvancedFactory extends TechAbstractFactory {
 
    @Override
    public FrontEnd educateFE() {
        return new FEAdvanced();
    }
 
    @Override
    public BackEnd educateBE() {
        return new BEAdvanced();
    }
}