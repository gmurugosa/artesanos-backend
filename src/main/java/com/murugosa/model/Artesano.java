package com.murugosa.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

    @Entity
    @Table(name = "Artesanos")
    @XmlRootElement
    public class Artesano implements Serializable {

        private static final long serialVersionUID = 1L;
        @Id
        @Basic(optional = false)
        @Column(name = "pr_codigo")
        private String prCodigo;

        @Basic(optional = false)
        @Column(name = "pr_nombre")
        private String prNombre;
        @Column(name = "celular")
        private String celular;
        @Column(name = "cuentabancaria")
        private String cuentabancaria;


        public Artesano() {
        }

        public Artesano(String prCodigo) {
            this.prCodigo = prCodigo;
        }

        public String getPrCodigo() {
            return prCodigo;
        }

        public void setPrCodigo(String prCodigo) {
            this.prCodigo = prCodigo;
        }

        public String getPrNombre() {
            return prNombre;
        }

        public void setPrNombre(String prNombre) {
            this.prNombre = prNombre;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public String getCuentabancaria() {
            return cuentabancaria;
        }

        public void setCuentabancaria(String cuentabancaria) {
            this.cuentabancaria = cuentabancaria;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Artesano artesano = (Artesano) o;
            return Objects.equals(prCodigo, artesano.prCodigo) && Objects.equals(prNombre, artesano.prNombre) && Objects.equals(celular, artesano.celular) && Objects.equals(cuentabancaria, artesano.cuentabancaria);
        }

        @Override
        public int hashCode() {
            return Objects.hash(prCodigo, prNombre, celular, cuentabancaria);
        }

        @Override
        public String toString() {
            return "Artesano{" +
                    "prCodigo='" + prCodigo + '\'' +
                    ", prNombre='" + prNombre + '\'' +
                    ", celular='" + celular + '\'' +
                    ", cuentabancaria='" + cuentabancaria + '\'' +
                    '}';
        }
    }
