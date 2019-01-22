package tpVolSpring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


//Clef d'association
@Embeddable // Relier � un @EmbeddedId
public class EscalePk implements Serializable {
	@ManyToOne // Relier � la table vol
	@JoinColumn(name = "escale_fly_id")
	private Vol vol;

	@ManyToOne // Relier � la table aeroport
	@JoinColumn(name = "escale_airport_id")
	private Aeroport aeroport;

	public EscalePk() {
	}

	public EscalePk(Vol vol, Aeroport aeroport) {
		super();
		this.vol = vol;
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aeroport == null) ? 0 : aeroport.hashCode());
		result = prime * result + ((vol == null) ? 0 : vol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EscalePk other = (EscalePk) obj;
		if (aeroport == null) {
			if (other.aeroport != null)
				return false;
		} else if (!aeroport.equals(other.aeroport))
			return false;
		if (vol == null) {
			if (other.vol != null)
				return false;
		} else if (!vol.equals(other.vol))
			return false;
		return true;
	}


}
