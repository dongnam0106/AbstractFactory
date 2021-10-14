package LevelFactory;

import AbstractFactory.TechAbstractFactory;
import AbstractProduct.BE.BEBasic;
import AbstractProduct.BE.BackEnd;
import AbstractProduct.FE.FEBasic;
import AbstractProduct.FE.FrontEnd;

//BASIC FACTORY
public class BasicFactory extends TechAbstractFactory {
 
    @Override
    public FrontEnd educateFE() {
        return new FEBasic();
    }
 
    @Override
    public BackEnd educateBE() {
        return new BEBasic();
    }
 
}