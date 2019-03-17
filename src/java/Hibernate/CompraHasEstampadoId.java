package Hibernate;
// Generated Sep 7, 2015 3:42:23 PM by Hibernate Tools 4.3.1



/**
 * CompraHasEstampadoId generated by hbm2java
 */
public class CompraHasEstampadoId  implements java.io.Serializable {


     private int compraIdcompra;
     private int estampadoIdestampado;

    public CompraHasEstampadoId() {
    }

    public CompraHasEstampadoId(int compraIdcompra, int estampadoIdestampado) {
       this.compraIdcompra = compraIdcompra;
       this.estampadoIdestampado = estampadoIdestampado;
    }
   
    public int getCompraIdcompra() {
        return this.compraIdcompra;
    }
    
    public void setCompraIdcompra(int compraIdcompra) {
        this.compraIdcompra = compraIdcompra;
    }
    public int getEstampadoIdestampado() {
        return this.estampadoIdestampado;
    }
    
    public void setEstampadoIdestampado(int estampadoIdestampado) {
        this.estampadoIdestampado = estampadoIdestampado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CompraHasEstampadoId) ) return false;
		 CompraHasEstampadoId castOther = ( CompraHasEstampadoId ) other; 
         
		 return (this.getCompraIdcompra()==castOther.getCompraIdcompra())
 && (this.getEstampadoIdestampado()==castOther.getEstampadoIdestampado());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCompraIdcompra();
         result = 37 * result + this.getEstampadoIdestampado();
         return result;
   }   


}

