package Quadtree;

class EInfo extends Exception{
    public EInfo(String m){
        super(m);
    }
}

public class Nodo {

	int info; //1 = blanco, -1 = negro y 0 = null (para cuando no tenga valor sino que tenga hijos)
	Nodo padre;
	Nodo[] hijos;

    public Nodo() {
		this.info = 0;
        this.hijos= null;
	}
	
	public int getInfo() {
		return this.info;
	}
	public void setInfo(int info) throws EInfo {
        if (info!=-1 || info!=1) throw new EInfo("Dato invalido");
		this.info = info;
	}
	
	public Nodo getPadre() {
		return this.padre;
	}
	public void setPadre(Nodo padre) {
		this.padre = padre;
	}

    public Nodo[] getHijos() {
        return this.hijos;
    }
    public Nodo getHijo(int index) throws EInfo {
        if (0>index || index>4) throw new EInfo("Dato invalido");
        return this.hijos[index];
    }
    // public void setHijos(Nodo[] hijos) {
    //     this.hijos = hijos;
    // }
	
	public void crearHijos() {
        this.hijos= new Nodo[4];
        for (Nodo hijo: hijos){
            hijo= new Nodo();
            hijo.setPadre(this);
        }
    }
}