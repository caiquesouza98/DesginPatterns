package pattern.adapter;

import pattern.currency.Dollar;
import pattern.currency.RealAdapter;
import pattern.currency.RealAdapterImpl;
import pattern.human.Astroboy;
import pattern.human.HumanAdapter;
import pattern.human.NormalGuy;
import pattern.human.Robot;

public class Demo {

	public static void main(String[] args) {
		Dollar dol = new Dollar();
		RealAdapter real = new RealAdapterImpl(dol);
		
		System.out.println(real.getValue());
		
		NormalGuy guy = new NormalGuy();
		Astroboy astroboy = new Astroboy();
		
		Robot humanAdapter = new HumanAdapter(guy);
		
		System.out.println("Normal guy:");
		guy.eat();
		guy.work();
		guy.fun();
		guy.sleep();
		
		System.out.println("Astroboy:");
		astroboy.charge();
		
		System.out.println("Human adapter:");
		humanAdapter.charge();
	}
}
