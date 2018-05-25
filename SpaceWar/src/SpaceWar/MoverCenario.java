package SpaceWar;

import java.awt.Image;
import javax.swing.ImageIcon;

public class MoverCenario {

    private Image imagemCenario;
    private int posicaoX;
    private int posicaoY;
    private boolean visivel;
    private final int ALTURA_DA_TELA = -7100;
    private final double VELOCIDADE_DA_TELA = 2.5;

    public MoverCenario(int posicaoX, int posicaoY) {

        ImageIcon retornaCenario;

        retornaCenario = new ImageIcon(getClass().getResource("/Imagens/mapaSalvador.jpg"));
        imagemCenario = retornaCenario.getImage();

        visivel();

    }

    public void moverCenario() {

        if (this.posicaoY > 0) {
            this.posicaoY = ALTURA_DA_TELA;
        } else {
            this.posicaoY += VELOCIDADE_DA_TELA;
        }

    }

    private void visivel() {
        visivel = true;
    }

    public Image getImagem() {
        return imagemCenario;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }
}
