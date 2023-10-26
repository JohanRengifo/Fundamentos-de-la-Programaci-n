namespace muchoSapo
{
    public partial class Form1 : Form
    {
        int vidas=3;

        SoundPlayer musica_fondo = new SoundPlayer(@"d:\sonidos\thesun.wav");
        SoundPlayer freno = new SoundPlayer(@"d:\sonidos\grito.wav");
        public Form1()
        {
            InitializeComponent();
            musica_fondo.Play();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            moverCarros();
            retornoCarros(taxi);
            retornoCarros(batimovil);
            retornoCarrosCarril1(cisterna);
            retornoCarrosCarril1(retro);
            if (sapo.Bounds.IntersectsWith(cisterna.Bounds))
            {
                sapo.Image = muchoSapo.Properties.Resources.ranaAplastada;
                timer1.Stop();
                freno.Play();
                quitarVidas();

            }
        }

        public void quitarVidas()
        {
            switch (vidas)
            {
                case 1:
                    corazon1.Image = muchoSapo.Properties.Resources.bones;
                    break;
                case 2:
                    corazon2.Image = muchoSapo.Properties.Resources.bones;
                    break;
                case 3:
                    corazon3.Image = muchoSapo.Properties.Resources.bones;
                    break;
            }
            vidas--;
        }
        public void retornoCarros(PictureBox carrito)
        {
            if (carrito.Location.X > 1200)
            {
                carrito.Location = new Point(-200, carrito.Location.Y);
            }
        }
        public void retornoCarrosCarril1(PictureBox carrito)
        {
            if (carrito.Location.X < -210)
            {
                carrito.Location = new Point(1000, carrito.Location.Y);
            }
        }
        public void moverCarros()
        {
            batimovil.Left = batimovil.Left + 2;
            rojo.Left = rojo.Left + 2;
            taxi.Left = taxi.Left + 2;
            cisterna.Left = cisterna.Left - 2;
            retro.Left = retro.Left - 2;
            bus.Left = bus.Left - 2;
            esqueleto.Left = esqueleto.Left + 2;
        }

        private void Form1_KeyDown(object sender, KeyEventArgs evento)
        {
            if (evento.KeyCode == Keys.Right)
            {
                sapo.Left += 10;
                sapo.Image = muchoSapo.Properties.Resources.ranaDere;
            }
            if (evento.KeyCode == Keys.Left)
            {
                sapo.Left -= 10;
                sapo.Image = muchoSapo.Properties.Resources.ranaIzq;
            }

            if (evento.KeyCode == Keys.Up)
            {
                sapo.Top -= 10;
                sapo.Image = muchoSapo.Properties.Resources.ranaFrente;
            }
            if (evento.KeyCode == Keys.Down)
            {
                sapo.Top += 10;
                sapo.Image = muchoSapo.Properties.Resources.ranaContraria;
            }
        }
    }
}
