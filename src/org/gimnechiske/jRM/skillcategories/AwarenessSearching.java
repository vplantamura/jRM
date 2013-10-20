package org.gimnechiske.jRM.skillcategories;

import java.util.ArrayList;

import org.gimnechiske.jRM.*;
import org.gimnechiske.jRM.Character;
import org.gimnechiske.jRM.core.SkillCategory;
import org.gimnechiske.jRM.lib.*;
import org.gimnechiske.jRM.skills.*;
import org.gimnechiske.jRM.table.Maneuver;

public class AwarenessSearching implements SkillCategory {
	private ArrayList<Skill> skillList = new ArrayList<>();
	private int myRanks;
	private int specialBonus;
	private int temporaryBonus;
	private int storedProfBonus;
	private int storedStatBonus;

	public AwarenessSearching() {
		Skill s = new DetectTraps(this);
		skillList.add(s);
		s = new LiePerception(this);
		skillList.add(s);
		s = new LocateHidden(this);
		skillList.add(s);
		s = new Observation(this);
		skillList.add(s);
		s = new PoisonPerception(this);
		skillList.add(s);
		s = new ReadingTracks(this);
		skillList.add(s);
		s = new Surveillance(this);
		skillList.add(s);
		s = new Tracking(this);
		skillList.add(s);
	}

	public double[] getProgression() {
		return Progression.CATEGORY;
	}
	public double[] getSkillProgression() {
		return Progression.STANDARD;
	}

	public double getRanks() {
		return myRanks;
	}
	public String getDescription() {
		return null;
	}
	public String getName() {
		return "Awareness * Searching";
	}
	public int[] getDevCost(Profession prof) {
		return prof.getDevCost(this);
	}
	public int getRankBonus() {
		double[] p = getProgression();
		double i = 0.0;
		int r = myRanks;
		if (r < 1) return (int) p[0];
		if (r < 11) i += r * p[1];
		else {
			r -= 10;
			i += 10 * p[1];
		}
		if (r < 11) i += r * p[2];
		else {
			r -= 10;
			i += 10 * p[2];
		}
		if (r < 11) i += r * p[3];
		else {
			r -= 10;
			i += 10 * p[3];
		}
		if (r > 0) i += r * p[4];
		return (int) i;
	}
	public int getSpecialBonus() {
		return specialBonus;
	}
	public int getTemporaryBonus() {
		return temporaryBonus;
	}
	public int getTotalBonus() {
		int i = getRankBonus();
		i += getSpecialBonus();
		i += storedStatBonus;
		i += storedProfBonus;
		i += getTemporaryBonus();
		return i;
	}
	public String getGroup() {
		return "Awareness";
	}
	public int getStatBonus(Character c) {
		int[] s = getStats();
		int[] r = c.getStatBonuses();
		int i = 0;
		for (int j = 0; j < s.length; j++) i += r[s[j]];
		storedStatBonus = i;
		return i;
	}
	public int getProfBonus(Profession prof) {
		storedProfBonus = prof.getProfessionBonus(this);
		return storedProfBonus;
	}
	public Maneuver getResult(int dice) {
		return null;
	}
	public ArrayList<Skill> getSkills() {
		return skillList;
	}
	public boolean isCombatSkill() {
		return false;
	}
	public int[] getStats() {
		int[] tmp = { LibStats.IN, LibStats.RE, LibStats.SD};
		return tmp;
	}
}
