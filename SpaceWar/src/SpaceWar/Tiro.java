package SpaceWar;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Tiro {

    private Image imagem;
    private int posicaoX;
    private int posicaoY;
    private int largura;
    private int altura;
    private boolean visivel = true;
    private final int ALTURA_DA_TELA = 0;
    private final int VELOCIDADE_DO_TIRO = 5;

    public Tiro(int posicaoX, int posicaoY) {

        this.posicaoX = posicaoX - 33;//define a posicao x inicial do tiro
        this.posicaoY = posicaoY - 50;//define a posicao x inicial do tiro

        ImageIcon retornaImagem = new ImageIcon(getClass().getResource("/Imagens/tiro.png"));
        imagem = retornaImagem.getImage();

        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);

        visivel();

    }

    public void moverTiro() {

        this.posicaoY -= VELOCIDADE_DO_TIRO;

        if (this.posicaoY < ALTURA_DA_TELA) {

            invisivel();
        }
    }

    private void visivel() {
        visivel = true;
    }

    public void invisivel() {
        visivel = false;
    }

    public Image getImagem() {
        return imagem;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public Rectangle getBounds() {
        return new Rectangle(posicaoX, posicaoY, largura, altura);
    }
}