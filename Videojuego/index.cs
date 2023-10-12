using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FrogGame
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            moverCarros();

            retornocarrito(taxi);
            retornocarrito(batimovil);
            retornocarrito(carro1);
            retornocarrito(moto);

            retorno1(patrulla1);
            retorno1(patrulla2);
            retorno1(cisterna);
            retorno1(retroescavadora);
        }

        
        public void retornocarrito(PictureBox carrito)
        {
            if (carrito.Location.X > 1200)
            {
                carrito.Location = new Point(-200, carrito.Location.Y);
            }
        }

        public void retorno1(PictureBox carrito)
        {
            if (carrito.Location.X < -210)
            {
                carrito.Location = new Point(1000, carrito.Location.Y);
            }
        }

        public void moverCarros()
        {
            batimovil.Left = batimovil.Left + 10;
            carro1.Left = carro1.Left + 10;
            retroescavadora.Left = retroescavadora.Left - 10;
            cisterna.Left = cisterna.Left - 10;
            taxi.Left = taxi.Left + 10;
            moto.Left = moto.Left + 10;
            patrulla1.Left = patrulla1.Left - 10;
            patrulla2.Left = patrulla2.Left - 10;
        }

        private void Batimovil_Click(object sender, EventArgs e)
        {

        }

        private void patrulla1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {

        }
    }
}
