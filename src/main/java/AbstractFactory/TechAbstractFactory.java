package AbstractFactory;

import AbstractProduct.BE.BackEnd;
import AbstractProduct.FE.FrontEnd;

//ABSTRACT FACTORY
public abstract class TechAbstractFactory {
 
    public abstract FrontEnd educateFE();
 
    public abstract BackEnd educateBE();
     
}