using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SapoHp
{
    public partial class Fondo : Form
    {
        public Fondo()
        {
            InitializeComponent();
        }

        private void timer1_Tick_1(object sender, EventArgs e)
        {
            //Funcion de Desplazamiento
            moverCarros();

            //Reaparicon Objetos
            // Der - Izq
            retorno1(patrulla1);
            retorno1(patrulla2);
            retorno1(cisterna);
            retorno1(retroescavadora);

            // Izq - Der
            retornocarrito(taxi);
            retornocarrito(carronegro);
            retornocarrito(carrorojo);
            retornocarrito(moto);

            if (ranafrente.Bounds.IntersectsWith(cisterna.Bounds))
            {
                ranafrente.Image = SapoHp.Properties.Resources.ranaAplastada;
            }
        }

        // Funcion Reaparicion  Izq - Der
        public void retornocarrito(PictureBox carrito)
        {
            if (carrito.Location.X > 1300)
            {
                carrito.Location = new Point(-300, carrito.Location.Y);
            }
        }
        // Funcion Reaparicion  Der - Izq
        public void retorno1(PictureBox carrito)
        {
            if (carrito.Location.X < -210)
            {
                carrito.Location = new Point(1400, carrito.Location.Y);
            }
        }

        //Funcion Movimiento Objetos
        public void moverCarros()
        {
            carronegro.Left = carronegro.Left + 10;
            carrorojo.Left = carrorojo.Left + 10;
            retroescavadora.Left = retroescavadora.Left - 10;
            cisterna.Left = cisterna.Left - 10;
            taxi.Left = taxi.Left + 10;
            moto.Left = moto.Left + 10;
            patrulla1.Left = patrulla1.Left - 10;
            patrulla2.Left = patrulla2.Left - 10;
        }

        //Funcion de Movimiento de la Rana
        private void Fondo_KeyDown(object sender, KeyEventArgs evento)
        {
            //Hacia la Derecha
            if(evento.KeyCode == Keys.Right)
            {
                ranafrente.Left += 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                ranafrente.Image = SapoHp.Properties.Resources.ranaDere;
            }

            // Hacia la Izquierda
            if (evento.KeyCode == Keys.Left)
            {
                ranafrente.Left -= 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                ranafrente.Image = SapoHp.Properties.Resources.ranaIzq;
            }

            // Hacia Arriba
            if (evento.KeyCode == Keys.Up)
            {
                ranafrente.Top -= 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                ranafrente.Image = SapoHp.Properties.Resources.ranaFrente;
            }

            //Hacia Abajo
            if (evento.KeyCode == Keys.Down)
            {
                ranafrente.Top += 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                ranafrente.Image = SapoHp.Properties.Resources.ranaContraria;
            }
        }
    }
}
