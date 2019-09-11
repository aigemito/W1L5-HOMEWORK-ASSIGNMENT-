package Prog5_5;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;
	public Computer(String manufacturer,String processor,int ramSize,double processorSpeed) {
		this.manufacturer=manufacturer;
		this.processor=processor;
		this.ramSize=ramSize;
		this.processorSpeed=processorSpeed;
	}
	
	int getRamSize() {
		return ramSize;
	}
	double getProcessorSpeed() {
		return processorSpeed;
	}
	double computerPower() {
		return ramSize*processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Computer [ Manufacturer:"+manufacturer+" Processor:"+processor+" RamSize:"+ramSize+" ProcessorSpeed: "+ processorSpeed+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj.getClass()!= this.getClass()) return false;
		Computer comp=(Computer)obj;
		return this.manufacturer.equals(comp.manufacturer) && this.processor.equals(comp.processor) && this.ramSize==comp.ramSize && this.processorSpeed==comp.processorSpeed;
		
	}
	@Override
	public int hashCode() {
		int hash = 5;
		// User defined formula 
		int result = 1;

		result = hash * result + (manufacturer.hashCode() + processor.hashCode());
		result = hash * result + (ramSize + ramSize);

		long temp = Double.doubleToLongBits(processorSpeed); result = hash * result + (int) (temp ^ (temp >>> 32));
		return result;
		
	}
	
}
