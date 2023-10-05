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
        }

        public void moverCarros()
        {
            batimovil.Left = batimovil.Left + 3;
            carro1.Left = carro1.Left + 3;
            retroescavadora.Left = retroescavadora.Left - 3;
            cisterna.Left = cisterna.Left - 3;
            taxi.Left = taxi.Left + 3;
            moto.Left = moto.Left + 3;
            patrulla1.Left = patrulla1.Left - 3;
            patrulla2.Left = patrulla2.Left - 3;
            hmcorrienfo.Left = hmcorrienfo.Left + 2;
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

        private void hmcorrienfo_Click(object sender, EventArgs e)
        {

        }
    }
}
