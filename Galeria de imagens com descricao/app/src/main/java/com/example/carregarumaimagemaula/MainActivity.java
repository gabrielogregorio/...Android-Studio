package com.example.carregarumaimagemaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView imgFoto;
    TextView txtFoto;
    Button btnProxima, btnAnterior, btnInicio, btnFinal;

    int posicao = 1;

    public int obterProximo(int posicaoAtual, String acao) {
        if (acao == ">"){
            if (posicaoAtual == 10)
                return 1;
            return posicaoAtual + 1;
        }

        if (acao == "<") {
            if (posicaoAtual == 1)
                return 10;
            return posicaoAtual-1;
        }

        if (acao == ">>")
            return 10;

        return 1;
    }

    public void definirImagemPorId(int id){
        if (id == 1){
            txtFoto.setText("Como buracos negros como este se formam? Os dois buracos negros que espiralaram juntos para produzir o evento de onda gravitacional GW190521 não foram apenas os buracos negros mais massivos já vistos pelo LIGO e pelo VIRGO até agora, suas massas - 66 e 85 massas solares - eram sem precedentes e inesperadas. Buracos negros de menor massa, abaixo de cerca de 65 massas solares, são conhecidos por se formarem em explosões de supernova . Por outro lado, acredita-se que os buracos negros de maior massa, acima de 135 massas solares, sejam criados por estrelas muito massivas que implodem depois de usarem seus elementos produtores de fusão nuclear . Como tal buracos negros de massa intermediária vieram a existir ainda é desconhecida, embora uma hipótese sustente que eles resultam de colisões consecutivas de estrelas e buracos negros em aglomerados de estrelas densas. Apresentado é uma ilustração dos buracos negros imediatamente antes da colisão, anotados com setas indicando seus eixos de rotação. Na ilustração, as ondas espirais indicam a produção de radiação gravitacional , enquanto as estrelas circundantes destacam a possibilidade de que a fusão ocorreu em um aglomerado de estrelas . Visto no ano passado, mas proveniente de uma época em que o universo tinha apenas cerca de metade de sua idade atual ( z ~ 0,8), fusão de buraco negro GW190521 é o mais distante já detectado, dentro dos erros de medição.");
            imgFoto.setImageResource(R.drawable.img1);
        } else if (id == 2){
            txtFoto.setText(" Esta é a bagunça que resta quando uma estrela explode. A Nebulosa do Caranguejo , resultado de uma supernova vista em 1054 DC , está repleta de filamentos misteriosos . Os filamentos não são apenas tremendamente complexos, mas parecem ter menos massa do que a expelida na supernova original e uma velocidade maior do que a esperada de uma explosão livre. A imagem em destaque , obtida pelo Telescópio Espacial Hubble , é apresentada em três cores escolhidas por interesse científico . A Nebulosa do Caranguejo abrange cerca de 10anos-luz . Em nebulosa é mentiras muito center um pulsar : uma estrela de nêutrons a massa do Sol , mas com apenas o tamanho de uma cidade pequena . O Pulsar do Caranguejo gira cerca de 30 vezes a cada segundo.");
            imgFoto.setImageResource(R.drawable.img2);
        } else if (id == 3) {
            txtFoto.setText(" Como uma estrela criou a nebulosa Helix ? As formas de nebulosas planetárias como a Hélice são importantes porque provavelmente contêm pistas de como estrelas como o Sol acabam com suas vidas. As observações feitas pelo telescópio espacial Hubble em órbita e pelo telescópio Blanco de 4 metros no Chile , no entanto, mostraram que a Hélice não é realmente uma simples hélice . Em vez disso, ele incorpora dois discos quase perpendiculares , bem como arcos, choques e até mesmo recursos não bem compreendidos. Mesmo assim, muitas simetrias geométricas impressionantes permanecem. Como uma única estrela semelhante ao Sol criou uma complexidade tão bela, porém geométrica, é um tópico de pesquisa . A Nebulosa Helix é a nebulosa planetária mais próxima da Terra, fica a apenas 700 anos-luz de distância em direção à constelação de Aquário e se estende por cerca de 3 anos-luz.");
            imgFoto.setImageResource(R.drawable.img3);
        } else if (id == 4) {
            txtFoto.setText("Em pinceladas de poeira interestelar e gás hidrogênio brilhante , esta bela paisagem do céu é pintada através do plano de nossa Galáxia da Via Láctea perto da extremidade norte da Grande Fenda e da constelação de Cygnus, o Cisne . Composto com 22 imagens diferentes e mais de 180 horas de dados de imagem, o mosaico de campo amplo mede impressionantes 24 graus no céu. A estrela alfa de Cygnus, o brilhante, quente e supergigante Deneb fica perto do centro superior. Cheio de estrelas e nuvens de gás luminosas, Cygnus também é o lar da nebulosa escura e obscurecida do Saco de Carvão do Norte, estendendo-se de Deneb em direção ao centro da vista. O brilho avermelhado das regiões de formação de estrelas NGC 7000 e IC 5070, a Nebulosa da América do Norte e as Nebulosas do Pelicano , ficam logo à esquerda de Deneb. A Nebulosa do Véu é um destaque abaixo e à esquerda do centro. Um remanescente de supernova , o Véu está a cerca de 1.400 anos-luz de distância, mas muitas outras nebulosas e aglomerados de estrelas são identificáveis \u200B\u200Bem toda a cena cósmica. Claro, Deneb também é conhecida pelos observadores do céu do hemisfério norte por seu lugar em dois asterismos - marcando o topo da Cruz do Norte e um vértice do Triângulo de Verão .");
            imgFoto.setImageResource(R.drawable.img4);
        } else if (id == 5){
            txtFoto.setText(" Que planetas estão por trás dessa espiral incomum de rocha? Saturno (inferior esquerdo) e Júpiter . Este mês, após o pôr do sol, a dupla brilhante planetária está bastante proeminente em direção ao sudeste. Agora, a sua visão dos maiores planetas do nosso Sistema Solar pode não incluir um pitoresco hoodoo no primeiro plano, nem a espetacular faixa central da nossa Via Láctea ao fundo, mas deve ser bastante atraente de qualquer maneira. A imagem apresentada é uma composição de exposições consecutivas de primeiro e segundo plano, todas tiradas no final de maio com a mesma câmera e do mesmo local - as terras áridas do  Deserto de Ah-Shi-Sle-Pah na Bacia de San Juan, no Novo México , EUA . A torre de rocha, informalmente apelidada de 'Trono Alienígena', tem cerca de 3 metros de altura. Saturno e Júpiter permanecerão visíveis juntos após o pôr do sol por vários meses.");
            imgFoto.setImageResource(R.drawable.img5);
        } else if (id == 6) {
            txtFoto.setText("Este cometa NEOWISE (C / 2020 F3) agora varre os céus setentrionais de nosso belo planeta . Suas longas caudas se estendem por essa visão do céu profundo de Suchy Vrch, na República Tcheca. Gravado na noite de 13/14 de julho , o composto de primeiro plano não rastreado e exposições do céu rastreadas e filtradas revela detalhes na cauda do cometa não visíveis a olho nu. Estruturas tênues se estendem até o topo da moldura, mais de 20 graus da coma brilhante do cometa. Empurrada para fora pela pressão da própria luz do sol, a ampla curva da cauda de poeira amarelada do cometa é fácil de ver a olho nu. Mas a cauda mais fraca e azulada é separada da poeira reflexiva do cometa. A cauda mais fraca é uma cauda de íons, formada quando os íons da coma cometária são arrastados para fora por campos magnéticos no vento solar e fluorescem à luz do sol. O NEOWISE de saída está subindo mais alto nos céus noturnos do norte , chegando mais perto da Terra em 23 de julho.");
            imgFoto.setImageResource(R.drawable.img6);
        } else if (id == 7) {
            txtFoto.setText("De onde vêm as caudas de cometa? Não há lugares óbvios nos núcleos dos cometas de onde emanam os jatos que criam as caudas dos cometas . Uma das melhores imagens de jatos emergentes é mostrada na imagem apresentada , tirada em 2015 pela nave robótica Rosetta da ESA que orbitou o Cometa 67P / Churyumov-Gerasimenko (Cometa CG) de 2014 a 2016. A imagem mostra plumas de gás e poeira escapando de numerosos lugares do núcleo do Cometa CG à medida que se aproximava do Sol e aquecido. O cometa tem dois lobos proeminentes, o maior medindo cerca de 4 quilômetros, e um lobo menor de 2,5 quilômetros conectado por um pescoço estreito. As análises indicam que a evaporação deve estar ocorrendo bem dentro da superfície do cometa para criar os jatos de poeira e gelo que vemos sendo emitidos através da superfície. O cometa CG (também conhecido como Cometa 67P) perde em jatos cerca de um metro de raio durante cada uma de suas órbitas de 6,44 anos ao redor do Sol, uma taxa na qual destruirá completamente o cometa em apenas milhares de anos. Em 2016, a missão da Rosetta terminou com um impacto controlado na superfície do Comet CG.");
            imgFoto.setImageResource(R.drawable.img7);
        } else if (id == 8){
            txtFoto.setText("Depois de seguir de perto o cometa 67P / Churyumov-Gerasimenko por 786 dias enquanto ele contornava o Sol, o impacto controlado da espaçonave Rosetta com a superfície do cometa foi confirmado pela perda de sinal da espaçonave em 30 de setembro de 2016. Uma das imagens tiradas durante sua descida final, esta vista de alta resolução mostra a paisagem desolada do cometa. A cena se estende por pouco mais de 600 metros (2.000 pés), capturada quando Rosetta estava a cerca de 16 quilômetros da superfície do cometa. A descida de Rosetta ao cometa encerrou a fase operacional de uma missão inspiradora de exploração espacial. Rosetta implantou um módulo de pouso na superfície de um dos mundos mais primordiais do Sistema Solar e testemunhou em primeira mão como um cometa muda quando sujeito à crescente intensidade da radiação solar. A decisão de encerrar a missão na superfície é o resultado da órbita do cometa que agora está levando-o para longe de Júpiter, onde haveria falta de energia para operar a espaçonave. Os operadores da missão também enfrentaram um período em que o Sol estaria próximo da linha de visão entre a Terra e Rosetta, tornando as comunicações de rádio cada vez mais difíceis.\n");
            imgFoto.setImageResource(R.drawable.img8);
        } else if (id == 9){
            txtFoto.setText("A espaçonave Rosetta continua circulando e mapeando o cometa Churyumov-Gerasimenko. Cruzando o interior do Sistema Solar por dez anos para chegar à vizinhança do cometa em 2014, a espaçonave robótica continua a fotografar o incomum núcleo do cometa de lóbulo duplo . A imagem apresentada , tirada há um ano, mostra poeira e gás escapando do núcleo do cometa. Embora pareça brilhante aqui, a superfície do cometa reflete apenas cerca de 4% da luz visível incidente , tornando-a tão escura quanto carvão . O cometa 67P / Churyumov Gerasimenko mede cerca de quatro quilômetros de comprimento e tem uma superfície de gravidadetão baixo que um astronauta poderia pular dele. Com o Rosetta a reboque, o Comet 67P passou seu ponto mais próximo do Sol no ano passado e agora está voltando para o ponto mais distante - logo após a órbita de Júpiter .");
            imgFoto.setImageResource(R.drawable.img9);
        } else if (id == 10){
            txtFoto.setText("A captura deste nascer do sol exigiu sorte e tempo. Em primeiro lugar, o tempo preciso era necessário para capturar a travessia de um veleiro bem na frente de um sol nascente . Além disso, por uma feliz coincidência, o próprio Sol de fundo parece incomum - parece a letra grega Ômega (Ω). Na realidade, o Sol permaneceu circular - a ilusão do Omega foi criada pela refração da luz solar no ar quente logo acima da água. Opticamente, os pés da capital Omega são na verdade uma imagem invertidada região do Sol logo acima dela. Embora um tanto raros, os efeitos ópticos causados \u200B\u200Bpela atmosfera da Terra podem fazer objetos distantes próximos ao horizonte - incluindo o Sol e a Lua - parecerem bastante incomuns . Esta imagem de exposição única foi tirada sobre o Mar Mediterrâneo há pouco mais de duas semanas, perto de Valência , Espanha .");
            imgFoto.setImageResource(R.drawable.img10);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);

        txtFoto = (TextView) findViewById(R.id.txtFoto);

        btnAnterior = (Button) findViewById(R.id.btnAnterior);
        btnProxima = (Button) findViewById(R.id.btnProxima);
        btnInicio = (Button) findViewById(R.id.btnInicio);
        btnFinal = (Button) findViewById(R.id.btnFinal);



        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acao = "<<";
                posicao = obterProximo(posicao, acao);
                definirImagemPorId(posicao);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acao = "<";
                posicao = obterProximo(posicao, acao);
                definirImagemPorId(posicao);
            }
        });

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acao = ">";
                posicao = obterProximo(posicao, acao);
                definirImagemPorId(posicao);
            }
        });
        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acao = ">>";
                posicao = obterProximo(posicao, acao);
                definirImagemPorId(posicao);

            }
        });

    }
}