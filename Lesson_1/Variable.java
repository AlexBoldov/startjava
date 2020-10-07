public class Variable {
	public static void main(String[] args) {
		byte numberOfCores = 8;				//Число ядер процессора
		short bitness = 64;					//Разрядность ОС
		int memorySize = 16344;				//Объем ОЗУ, Mb
		long hddSize = 1048576;				//Объем винчестера, Mb
		float osVersion = 7.1f;				//Версия ОС
		double cpuFrequency = 3.33;			//Частота процессора, GHz
		char procMarking = 'T';				/*Маркировка процессора:
											"T" - уменьшенное энергопотребление;
											"K" - потенциал для разгона*/
		boolean isIntegratedVideo = true;	//Наличие интегрированной видеокарты

		System.out.println(numberOfCores);
		System.out.println(bitness);
		System.out.println(memorySize);
		System.out.println(hddSize);
		System.out.println(osVersion);
		System.out.println(cpuFrequency);
		System.out.println(procMarking);
		System.out.println(isIntegratedVideo);
	}
}