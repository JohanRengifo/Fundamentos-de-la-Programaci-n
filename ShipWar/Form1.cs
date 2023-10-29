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
        // Vidas
        int vidas = 3;

        // Musica
        SoundPlayer musica_fondo = new SoundPlayer(@"C:\");
        SoundPlayer colision = new SoundPlayer(@"C:\");

        public Fondo()
        {
            InitializeComponent();
            musica_fondo.Play(); // Reproduce la Musica de Fondo
        }

        private void timer1_Tick_1(object sender, EventArgs e)
        {
            //Funcion de Desplazamiento
            moverCarros();

            //Reaparicon Objetos
            // Der - Izq
            retorno1(patrulla1);

            // Izq - Der
            retornocarrito(taxi);

            // Choque de la Rana
            choqueRana(cisterna);
            choqueRana(taxi);
        }

        // Funcion Cambio Imagen | Choque
        public void choqueRana(PictureBox choque)
        {
            if (sapa.Bounds.IntersectsWith(choque.Bounds))
            {
                barco.Image = ShipWar.Properties.Resources.barcodestruido;
                timer1.Stop();
                colision.Play();
                quitarVidas();
            }
            
        }

        // Funcion Quita Vidas
        public void quitarVidas()
        {
            switch (vidas)
            {
                case 1:
                    corazon1.Image = ShipWar.Properties.Resources.calavera; // Quita el Corazon por una Calavera
                break;
                case 2:
                    corazon2.Image = ShipWar.Properties.Resources.calavera;
                break;
                case 3:
                    corazon3.Image = ShipWar.Properties.Resources.calavera;
                break;
            }
            vidas--;
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
            
        }

        //Funcion de Movimiento de la Rana
        private void Fondo_KeyDown(object sender, KeyEventArgs evento)
        {
            //Hacia la Derecha
            if(evento.KeyCode == Keys.Right)
            {
                barco.Left += 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                ranafrente.Image = ShipWar.Properties.Resources.ranaDere;
            }

            // Hacia la Izquierda
            if (evento.KeyCode == Keys.Left)
            {
                barco.Left -= 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                barco.Image = ShipWar.Properties.Resources.ranaIzq;
            }

            // Hacia Arriba
            if (evento.KeyCode == Keys.Up)
            {
                ranafrente.Top -= 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                barco.Image = ShipWar.Properties.Resources.ranaFrente;
            }

            //Hacia Abajo
            if (evento.KeyCode == Keys.Down)
            {
                ranafrente.Top += 10;
                // Orientazcion de Imagen respecto a la orientacion del movimiento
                barco.Image = ShipWar.Properties.Resources.ranaContraria;
            }
        }
    }
}
