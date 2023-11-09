using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ShipGame
{
    public partial class Fondo : Form
    {
        static Random aleatorio = new Random();
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

        private void PuntosTimer_Tick(object sender, EventArgs e)
        {
            tiempoTranscurrido++;


            if (tiempoTranscurrido % 60 == 0)
            {
                puntos += 55;
            }
            else if (tiempoTranscurrido % 24 == 0)
            {
                puntos += 33;
            }
            else if (tiempoTranscurrido % 16 == 0)
            {
                puntos += 22;
            }
            else if (tiempoTranscurrido % 8 == 0)
            {
                puntos += 14;
            }
            else if (tiempoTranscurrido % 4 == 0)
            {
                puntos += 2;
            }

            puntosLabel.Text = "Puntos: " + puntos;

            // Verificar si se alcanzaron 1000 puntos para finalizar el juego
            if (puntos >= 1500)
            {
                FinalizarJuego();
            }
        }

        private void moneda(PictureBox coin)
        {
            if (lancha.Bounds.IntersectsWith(coin.Bounds))
            {
                puntos += 5;
                puntosLabel.Text = "Puntos: " + puntos;
                coin.Location = new Point(aleatorio.Next(400) + 200, aleatorio.Next(300) + 100);
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            obstaculos();
            retorno(roca1);
            retorno(roca2);
            retorno(roca3);
            retorno(roca4);
            retorno(islarocosa1);
            retorno(islarocosa2);
            retorno(islarocosa3);
            retorno(islarocosa4);
            retorno(islasola1);
            retorno(islasola2);
            retorno(islasola3);
            retorno(islasola4);
            retorno(tiburon1);
            retorno(tiburon2);

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

            moneda(lancha);
        }

        private void obstaculos()
        {
            foreach (PictureBox obstaculo in Controls.OfType<PictureBox>())
            {
                if (obstaculo.Name.StartsWith("roca") || obstaculo.Name.StartsWith("islarocosa") ||
                    obstaculo.Name.StartsWith("islasola") || obstaculo.Name.StartsWith("tiburon"))
                {
                    obstaculo.Left -= 10;
                }
            }
        }

        private void retorno(PictureBox obstaculo)
        {
            if (obstaculo.Left < -210)
            {
                obstaculo.Location = new Point(1800, obstaculo.Top);
            }
        }

        private void colision(PictureBox colision)
        {
            if (!juegoTerminado && lancha.Bounds.IntersectsWith(colision.Bounds))
            {
                lancha.Image = ShipGame.Properties.Resources.barcodestroy;
                timer1.Stop();
                quitarVidas();
                if (vidas > 0)
                {
                    if (intentosRestantes > 0)
                    {
                        intentosRestantes--;
                        DialogResult result = MessageBox.Show("¿Deseas reiniciar el juego?", "Game Over",
                            MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                        if (result == DialogResult.Yes)
                        {
                            ReiniciarJuego();
                        }
                        else
                        {
                            FinalizarJuego();
                        }
                    }
                }
                else
                {
                    FinalizarJuego();
                }
            }
        }

        private void quitarVidas()
        {
            switch (vidas)
            {
                case 1:
                    corazon1.Image = ShipGame.Properties.Resources.calavera;
                    break;
                case 2:
                    corazon2.Image = ShipGame.Properties.Resources.calavera;
                    break;
            }
            vidas--;
        }

        private void ReiniciarJuego()
        {
            vidas = 1;
            puntos = 0;
            intentosRestantes = 1;
            tiempoTranscurrido = 0;
            puntosLabel.Text = "Puntos: 0";
            corazon1.Image = ShipGame.Properties.Resources.corazon;
            corazon2.Image = ShipGame.Properties.Resources.calavera;
            lancha.Location = new Point(Location.X, Location.Y);
            lancha.Image = ShipGame.Properties.Resources.ship;
            timer1.Start();
        }

        private void FinalizarJuego()
        {
            juegoTerminado = true;
            timer1.Stop();
            puntosTimer.Stop();
            juegoTerminadoTimer.Start();
            MessageBox.Show("Terminaste el juego con " + puntos + " puntos!", "Cerrando Juego",
                            MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void JuegoTerminadoTimer_Tick(object sender, EventArgs e)
        {
            juegoTerminadoTimer.Stop();
            Close();
        }

        private void Fondo_KeyDown(object sender, KeyEventArgs evento)
        {
            if (!juegoTerminado)
            {
                if (evento.KeyCode == Keys.Right)
                {
                    lancha.Left += 20;
                }
                else if (evento.KeyCode == Keys.Left)
                {
                    lancha.Left -= 20;
                }
                else if (evento.KeyCode == Keys.Up)
                {
                    lancha.Top -= 20;
                }
                else if (evento.KeyCode == Keys.Down)
                {
                    lancha.Top += 20;
                }
            }
        }
    }
}