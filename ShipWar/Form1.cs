﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Media;

namespace ShipWar
{
    public partial class Fondo : Form
    {
        int vidas = 3;
        int puntos = 0;
        int tiempoTranscurrido = 0;
        int intentosRestantes = 3;
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
                puntos += 45;
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

        private void timer1_Tick(object sender, EventArgs e)
        {
            desplazamiento();

            retornoEO(obstaculo1);
            retornoEO(obstaculo2);
            retornoEO(obstaculo2);
            retornoEO(obstaculo3);
            retornoEO(obstaculo4);
            retornoEO(obstaculo5);
            retornoEO(obstaculo6);
            retornoEO(obstaculo7);
            retornoEO(obstaculo8);
            retornoEO(obstaculo9);
            retornoEO(obstaculo10);
            retornoEO(obstaculo11);
            retornoEO(obstaculo12);
            retornoEO(obstaculo13);
            retornoEO(obstaculo14);
            retornoEO(obstaculo15);
            retornoEO(obstaculo16);
            retornoEO(obstaculo17);
            retornoEO(obstaculo18);

            colision(obstaculo1);
            colision(obstaculo2);
            colision(obstaculo2);
            colision(obstaculo3);
            colision(obstaculo4);
            colision(obstaculo5);
            colision(obstaculo6);
            colision(obstaculo7);
            colision(obstaculo8);
            colision(obstaculo9);
            colision(obstaculo10);
            colision(obstaculo11);
            colision(obstaculo12);
            colision(obstaculo13);
            colision(obstaculo14);
            colision(obstaculo15);
            colision(obstaculo16);
            colision(obstaculo17);
            colision(obstaculo18);
        }

        public void colision(PictureBox colision)
        {
            if (!juegoTerminado && barco.Bounds.IntersectsWith(colision.Bounds))
            {
                barco.Image = ShipWar.Properties.Resources.barcodestroy;
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

        public void quitarVidas()
        {
            if (vidas > 0)
            {
                switch (vidas)
                {
                    case 3:
                        corazon3.Image = ShipWar.Properties.Resources.calavera;
                        break;
                    case 2:
                        corazon2.Image = ShipWar.Properties.Resources.calavera;
                        break;
                    case 1:
                        corazon1.Image = ShipWar.Properties.Resources.calavera;
                        break;
                }
                vidas--;
            }
        }
        /*
        public void obstaculosOE(PictureBox obstaculos)
        {
            if (obstaculos.Location.X > 1300)
            {
                obstaculos.Location = new Point(-300, obstaculos.Location.Y);
            }
        }*/

        public void retornoEO(PictureBox obstaculo)
        {
            if (!juegoTerminado && obstaculo.Location.X < -210)
            {
                obstaculo.Location = new Point(1400, obstaculo.Location.Y);
            }
        }

        public void desplazamiento()
        {
            if (!juegoTerminado)
            {
                obstaculo1.Left = obstaculo1.Left - 30;
                obstaculo2.Left = obstaculo2.Left - 30;
                obstaculo3.Left = obstaculo3.Left - 30;
                obstaculo4.Left = obstaculo4.Left - 30;
                obstaculo5.Left = obstaculo5.Left - 30;
                obstaculo6.Left = obstaculo6.Left - 30;
                obstaculo7.Left = obstaculo7.Left - 30;
                obstaculo8.Left = obstaculo8.Left - 30;
                obstaculo9.Left = obstaculo9.Left - 30;
                obstaculo10.Left = obstaculo10.Left - 30;
                obstaculo11.Left = obstaculo11.Left - 30;
                obstaculo12.Left = obstaculo12.Left - 30;
                obstaculo13.Left = obstaculo13.Left - 30;
                obstaculo14.Left = obstaculo14.Left - 30;
                obstaculo15.Left = obstaculo15.Left - 30;
                obstaculo16.Left = obstaculo16.Left - 30;
                obstaculo17.Left = obstaculo17.Left - 30;
                obstaculo18.Left = obstaculo18.Left - 30;
            }
        }

        private void Fondo_KeyDown(object sender, KeyEventArgs evento)
        {
            if (!juegoTerminado)
            {
                if (evento.KeyCode == Keys.Up)
                {
                    barco.Top -= 10;
                    barco.Image = ShipWar.Properties.Resources.Ship;
                }
                else if (evento.KeyCode == Keys.Down)
                {
                    barco.Top += 10;
                    barco.Image = ShipWar.Properties.Resources.Ship;
                }
            }
        }

        private void ReiniciarJuego()
        {
            vidas = 3;
            puntos = 0;
            intentosRestantes = 3;
            tiempoTranscurrido = 0;
            puntosLabel.Text = "Puntos: 0";
            corazon1.Image = ShipWar.Properties.Resources.corazon;
            corazon2.Image = ShipWar.Properties.Resources.corazon;
            corazon3.Image = ShipWar.Properties.Resources.corazon;
            barco.Location = new Point(Location.X, Location.Y);
            barco.Image = ShipWar.Properties.Resources.Ship;
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
    }
}