package modelo;
// Generated 18-abr-2020 20:41:47 by Hibernate Tools 4.3.1



/**
 * CaracteristicasProductosId generated by hbm2java
 */
public class CaracteristicasProductosId  implements java.io.Serializable {


     private int idProducto;
     private String nombre;

    public CaracteristicasProductosId() {
    }

    public CaracteristicasProductosId(int idProducto, String nombre) {
       this.idProducto = idProducto;
       this.nombre = nombre;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CaracteristicasProductosId) ) return false;
		 CaracteristicasProductosId castOther = ( CaracteristicasProductosId ) other; 
         
		 return (this.getIdProducto()==castOther.getIdProducto())
 && ( (this.getNombre()==castOther.getNombre()) || ( this.getNombre()!=null && castOther.getNombre()!=null && this.getNombre().equals(castOther.getNombre()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdProducto();
         result = 37 * result + ( getNombre() == null ? 0 : this.getNombre().hashCode() );
         return result;
   }   


}


