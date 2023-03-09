package viopeTasks9to11;

import java.util.ArrayList;

public class Crew {

	private ArrayList<Sailor> sailorList;

	public Crew() {
		sailorList = new ArrayList<Sailor>();
	}

	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}

	public String toString() {
		String output = "";
		for (Sailor sailor : sailorList) {
			output += sailor.getName() + " (" + sailor.getEmail() + ")\n";
		}
		return output;

	}
}
