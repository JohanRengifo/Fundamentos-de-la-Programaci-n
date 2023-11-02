using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SurfShip
{
    public partial class Fondo : Form
    {
        // Varables Generales
        int vidas = 2;
        int puntos = 0;
        int tiempoTranscurrido = 0;
        int intentosRestantes = 2;
        Timer puntosTimer = new Timer();
        Timer juegoTerminadoTimer = new Timer();
        bool juegoTerminado = false;

        public Fondo()
        {
            InitializeComponent();
            puntosTimer.Interval = 1000;
            puntosTimer.Tick += PuntosTimer_Tick;
            puntosTimer.Start();

            juegoTerminadoTimer.Interval = 1000;
            juegoTerminadoTimer.Tick += JuegoTerminadoTimer_Tick;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            obstaculos();

            // Retornos
            retornoEO(roca1);
            retornoEO(roca2);
            retornoEO(roca3);
            retornoEO(roca4);
            retornoEO(islarocosa1);
            retornoEO(islarocosa2);
            retornoEO(islarocosa3);
            retornoEO(islarocosa4);
            retornoEO(islasola1);
            retornoEO(islasola2);
            retornoEO(islasola3);
            retornoEO(islasola4);
            retornoEO(tiburon1);
            retornoEO(tiburon2);

            // Colision
            colision(roca1);
            colision(roca2);
            colision(roca3);
            colision(roca4);
            colision(islarocosa1);
            colision(islarocosa2);
            colision(islarocosa3);
            colision(islarocosa4);
            colision(islasola1);
            colision(islasola2);
            colision(islasola3);
            colision(islasola4);
            colision(tiburon1);
            colision(tiburon2);

        }

        // Sistema de Puntos
        private void PuntosTimer_Tick(object sender, EventArgs e)
        {
            tiempoTranscurrido++;


            if (tiempoTranscurrido % 60 == 0)
            {
                puntos += 55;
            }
            else if (tiempoTranscurrido % 24 == 0)
            {
                puntos += 20;
            }
            else if (tiempoTranscurrido % 16 == 0)
            {
                puntos += 14;
            }
            else if (tiempoTranscurrido % 8 == 0)
            {
                puntos += 10;
            }
            else if (tiempoTranscurrido % 4 == 0)
            {
                puntos += 1;
            }

            puntosLabel.Text = "Puntos: " + puntos;

            // Verificar si se alcanzaron 1000 puntos para finalizar el juego
            if (puntos >= 1000)
            {
                FinalizarJuego();
            }
        }
        // Fin Sistema de Puntos

        // Movimiento Recursos
        public void obstaculos()
        {
            roca1.Left = roca1.Left - 10;
            roca2.Left = roca2.Left - 10;
            roca3.Left = roca3.Left - 10;
            roca4.Left = roca4.Left - 10;
            islarocosa1.Left = islarocosa1.Left - 10;
            islarocosa2.Left = islarocosa2.Left - 10;
            islarocosa3.Left = islarocosa3.Left - 10;
            islarocosa4.Left = islarocosa4.Left - 10;
            islasola1.Left = islasola1.Left - 10;
            islasola2.Left = islasola2.Left - 10;
            islasola3.Left = islasola3.Left - 10;
            islasola4.Left = islasola4.Left - 10;
            tiburon1.Left = tiburon1.Left - 10;
            tiburon2.Left = tiburon2.Left - 10;
        }
        // Fin Movimiento Recursos

        // Retornos
        public void retornoEO(PictureBox obstaculo)
        {
            if (obstaculo.Location.X < -210)
            {
                obstaculo.Location = new Point(1400, obstaculo.Location.Y);
            }
        }
        // Fin Retornos

        // Funcion Colision
        public void colision(PictureBox choque)
        {
            if (lancha.Bounds.IntersectsWith(choque.Bounds))
            {
                lancha.Image = SurfShip.Properties.Resources.barcodestroy;
                timer1.Stop();
                // freno.Play();
                quitarVidas();
            }

        }
        // Fin Fincion Colision

        // Funcion Vidas
        public void quitarVidas()
        {
            switch (vidas)
            {
                case 1:
                    corazon1.Image = SurfShip.Properties.Resources.calavera; // Quita el Corazon por una Calavera
                    break;
                case 2:
                    corazon2.Image = SurfShip.Properties.Resources.calavera;
                    break;
            }
            vidas--;
        }
        // Fin Fincion Vidas

        // Funcion para Reinicio de Juego
        private void ReiniciarJuego()
        {
            vidas = 1;
            puntos = 0;
            intentosRestantes = 1;
            tiempoTranscurrido = 0;
            puntosLabel.Text = "Puntos: 0";
            corazon1.Image = SurfShip.Properties.Resources.corazon;
            corazon2.Image = SurfShip.Properties.Resources.corazon;
            lancha.Location = new Point(Location.X, Location.Y);
            lancha.Image = SurfShip.Properties.Resources.ship;
            timer1.Start();
        }

        private void FinalizarJuego()
        {
            juegoTerminado = true;
            timer1.Stop();
            puntosTimer.Stop();
            juegoTerminadoTimer.Start();
            MessageBox.Show("¡Has ganado el juego con " + puntos + " puntos!", "¡Felicidades!",
                            MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void JuegoTerminadoTimer_Tick(object sender, EventArgs e)
        {
            juegoTerminadoTimer.Stop();
            Close();
        }
        // Fin Funcion Reinicio de Juego
    }
}
