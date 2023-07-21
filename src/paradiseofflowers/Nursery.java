package paradiseofflowers;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Nursery extends javax.swing.JFrame {
    public String current_user;
    public double discount;
    public String mobile;
    public String[] rows= new String[4];
    private double totalPrice=0;
    double dltprc=0;
    private boolean rt01=false;
    private boolean yt02=false;
    private boolean bt03=false;
    private boolean wt04=false;
    private boolean blt05=false;
    private boolean br01=false;
    private boolean pr02=false;
    private boolean rr03=false;
    private boolean yr04=false;
    private boolean wr05=false;
    private boolean wh01=false;
    private boolean ph02=false;
    private boolean yh03=false;
    private boolean pph04=false;
    private boolean rh05=false;
    private boolean bor01=false;
    private boolean por02=false;
    private boolean yor03=false;
    private boolean ror04=false;
    private boolean wor05=false;
    private int tulipSelected=0;
    private int roseSelected=0;
    private int hibiscusSelected=0;
    private int orchidSelected=0;
    double rtPrice, ytPrice,btPrice,wtPrice,bltPrice,prc=0;
    double brPrice, prPrice,rrPrice,yrPrice,wrPrice,prcrose=0;
    double whPrice, phPrice,yhPrice,pphPrice,rhPrice,prchib=0;
    double borPrice, porPrice,yorPrice,rorPrice,worPrice,prcor=0;
    DefaultTableModel  model;
    double disprc;
    
    public Nursery(String current_user,Double discount) throws ArrayIndexOutOfBoundsException {
        this.current_user = current_user;
        this.discount=discount;
        initComponents();
        setSize(1250, 1000);  
        scrlPane1.getVerticalScrollBar().setUnitIncrement(16);
        model=  (DefaultTableModel) table.getModel();
        setIcon();
        if(discount!=0.00){
            congo.setText("Congratulation! You have Got 10% discount on your first Buy.");
        }
    }
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgAbout/8.png")));
    }

    public void myTulip(){
         
        if(rt01==true && yt02==true && bt03==false  && wt04==false && blt05==false ){
            prc=(rtPrice+ytPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redYellowTulip.jpg")));
        }
        else if(rt01==true && yt02==false && bt03==true  && wt04==false && blt05==false){
            prc=(rtPrice+btPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redBlackTulip.jpg")));
        }
        else if(rt01==true && yt02==false && bt03==false  && wt04==true && blt05==false){
            prc=(rtPrice+wtPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redWhiteTulip.jpg")));
        }
        else if(rt01==true && yt02==false && bt03==false  && wt04==false && blt05==true){
            prc=(rtPrice+bltPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redBlueTulip.jpg")));
        }
        
        else if(rt01==false && yt02==true && bt03==true  && wt04==false && blt05==false){
            prc=(ytPrice+btPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowBlackTulip.jpg")));
        }
        else if(rt01==false && yt02==true && bt03==false  && wt04==true && blt05==false){
            prc=(ytPrice+wtPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowWhiteTulip.jpg")));
        }
        else if(rt01==false && yt02==true && bt03==false  && wt04==false && blt05==true){
            prc=(ytPrice+bltPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowBlueTulip.jpg")));
        }
        
        else if(rt01==false && yt02==false && bt03==true  && wt04==true && blt05==false){
            prc=(btPrice+wtPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blackWhiteTulip.jpg")));
        }
        else if(rt01==false && yt02==false && bt03==true  && wt04==false && blt05==true){
            prc=(btPrice+bltPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blackBlueTulip.jpg")));
        }
        
        else if(rt01==false && yt02==false && bt03==false && wt04==true && blt05==true){
            prc=(wtPrice+bltPrice)/2 +200;
            mixedTulipPrice.setText(Double.toString(prc));
            mixedTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteBlueTulip.jpg")));
        }
        else {
            prc= 0;
            
            mixedTulipPrice.setText("");
            JOptionPane.showMessageDialog(null,"Your must select 2 Types of Tulip ","Warning",JOptionPane.ERROR_MESSAGE);
            mixedTulipImg.setIcon(null);
        }
    }
    public void myRose()
    {
         if(br01==true && pr02==true && rr03==false  && yr04==false && wr05==false ){
            prcrose=(brPrice+prPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkBlueRose.jpg")));
        }
        else if(br01==true && pr02==false && rr03==true  && yr04==false && wr05==false){
            prcrose=(brPrice+rrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redBlueRose.jpg")));
        }
        else if(br01==true && pr02==false && rr03==false  && yr04==true && wr05==false){
            prcrose=(brPrice+yrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueYellowRose.jpg")));
        }
        else if(br01==true && pr02==false && rr03==false  && yr04==false && wr05==true){
            prcrose=(brPrice+wrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueWhiteRose.jpg")));
        }
        
        else if(br01==false && pr02==true && rr03==true  && yr04==false && wr05==false){
            prcrose=(prPrice+rrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkRedRose.jpg")));
        }
        else if(br01==false && pr02==true && rr03==false  && yr04==true && wr05==false){
            prcrose=(prPrice+yrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkYellowRose.jpg")));
        }
        else if(br01==false && pr02==true && rr03==false  && yr04==false && wr05==true){
            prcrose=(prPrice+wrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkWhiteRose.jpg")));
        }
        
        else if(br01==false && pr02==false && rr03==true  && yr04==true && wr05==false){
            prcrose=(rrPrice+yrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redYellowRose.jpg")));
        }
        else if(br01==false && pr02==false && rr03==true  && yr04==false && wr05==true){
            prcrose=(rrPrice+wrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redWhiteRose.jpg")));
        }
        
        else if(br01==false && pr02==false && rr03==false && yr04==true && wr05==true){
            prcrose=(yrPrice+wrPrice)/2 +200;
            mixedRosePrice.setText(Double.toString(prcrose));
            mixedRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteYellowRose.jpg")));
        }
        else {
            prcrose= 0;
            mixedRosePrice.setText("");
            JOptionPane.showMessageDialog(null,"Your must select 2 Types of Tulip ","Warning",JOptionPane.ERROR_MESSAGE);
            mixedRoseImg.setIcon(null);
        }
    }
    public void myHibiscus()
    {
        if(wh01==true && ph02==true && yh03==false  && pph04==false && rh05==false ){
            prchib=(whPrice+phPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whitePinkHibiscus.jpg")));
        }
        else if(wh01==true && ph02==false && yh03==true  && pph04==false && rh05==false){
            prchib=(whPrice+yhPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteYellowHibiscus.jpg")));
        }
        else if(wh01==true && ph02==false && yh03==false  && pph04==true && rh05==false){
            prchib=(whPrice+pphPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whitePurpleHibiscus.jpg")));
        }
        else if(wh01==true && ph02==false && yh03==false  && pph04==false && rh05==true){
            prchib=(whPrice+rhPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteRedHibiscus.jpg")));
        }
        
        else if(wh01==false && ph02==true && yh03==true  && pph04==false && rh05==false){
            prchib=(phPrice+yhPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowPinkHibiscus.jpg")));
        }
        else if(wh01==false && ph02==true && yh03==false  && pph04==true && rh05==false){
            prchib=(phPrice+pphPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkPurpleHibiscus.jpg")));
        }
        else if(wh01==false && ph02==true && yh03==false  && pph04==false && rh05==true){
            prchib=(phPrice+rhPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redPinkHibiscus.jpg")));
        }
        
        else if(wh01==false && ph02==false && yh03==true  && pph04==true && rh05==false){
            prchib=(yhPrice+pphPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowPurpleHibiscus.jpg")));
        }
        else if(wh01==false && ph02==false && yh03==true  && pph04==false && rh05==true){
            prchib=(yhPrice+rhPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redYellowHibiscus.jpg")));
        }
        
        else if(wh01==false && ph02==false && yh03==false && pph04==true && rh05==true){
            prchib=(pphPrice+rhPrice)/2 +200;
            mixedHibiscusPrice.setText(Double.toString(prchib));
            mixedHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redPurpleHibiscus.jpg")));
        }
        else {
            prchib= 0;
            mixedHibiscusPrice.setText("");
            JOptionPane.showMessageDialog(null,"Your must select 2 Types of Tulip ","Warning",JOptionPane.ERROR_MESSAGE);
            mixedHibiscusImg.setIcon(null);
        }
    }
    public void myOrchid()
    {
        if(bor01==true && por02==true && yor03==false  && ror04==false && wor05==false ){
            //recombinationType=1;
            prcor=(borPrice+porPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bluePurpleOrchid.jpg")));
        }
        else if(bor01==true && por02==false && yor03==true  && ror04==false && wor05==false){
           // recombinationType=2;
            prcor=(borPrice+yorPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueYellowOrchid.jpg")));
        }
        else if(bor01==true && por02==false && yor03==false  && ror04==true && wor05==false){
           // recombinationType=3;
            prcor=(borPrice+rorPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redBlueOrchid.jpg")));
        }
        else if(bor01==true && por02==false && yor03==false  && ror04==false && wor05==true){
           // recombinationType=4;
            prcor=(borPrice+worPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueWhiteOrchid.jpg")));
        }
        
        else if(bor01==false && por02==true && yor03==true  && ror04==false && wor05==false){
           // recombinationType=5;
            prcor=(porPrice+yorPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purpleYellowOrchid.jpg")));
        }
        else if(bor01==false && por02==true && yor03==false  && ror04==true && wor05==false){
            //recombinationType=6;
            prcor=(porPrice+rorPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redPurpleOrchid.jpg")));
        }
        else if(bor01==false && por02==true && yor03==false  && ror04==false && wor05==true){
            //recombinationType=7;
            prcor=(porPrice+worPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purpleWhiteOrchid.jpg")));
        }
        
        else if(bor01==false && por02==false && yor03==true  && ror04==true && wor05==false){
           // recombinationType=8;
            prcor=(yorPrice+rorPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redYellowOrchid.jpg")));
        }
        else if(bor01==false && por02==false && yor03==true  && ror04==false && wor05==true){
           // recombinationType=9;
            prcor=(yorPrice+worPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowWhiteOrchid.jpg")));
        }
        
        else if(bor01==false && por02==false && yor03==false && ror04==true && wor05==true){
            //recombinationType=10;
            prcor=(rorPrice+worPrice)/2 +200;
            mixedOrchidPrice.setText(Double.toString(prcor));
            mixedOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redWhiteOrchid.jpg")));
        }
        else {
            prcor= 0;
            mixedOrchidPrice.setText("");
            JOptionPane.showMessageDialog(null,"Your must select 2 Types of Tulip ","Warning",JOptionPane.ERROR_MESSAGE);
            mixedOrchidImg.setIcon(null);
        }
    }
    
    void calcPrice(double prc){
        totalPrice += prc;
        String fp=Double.toString(totalPrice);
        finalPrice.setText(fp);   
        if (discount!=0.00){
            double disPrc= totalPrice- totalPrice*.10;
            discnt.setText("You have Got 10% discount on your first Buy. Total price with discount is: Tk "+disPrc);
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingBar1 = new javax.swing.JLabel();
        headingBar2 = new javax.swing.JLabel();
        scrlPane1 = new javax.swing.JScrollPane();
        mainBody = new javax.swing.JPanel();
        redTulipImg = new javax.swing.JLabel();
        redTulipLabel = new javax.swing.JLabel();
        tulipLabel = new javax.swing.JLabel();
        RedTulipDscrptn = new javax.swing.JLabel();
        yellowTulipImg = new javax.swing.JLabel();
        yellowTulipLabel = new javax.swing.JLabel();
        yellowTulipDscrptn = new javax.swing.JLabel();
        blackTulipImg = new javax.swing.JLabel();
        redTulipBuy = new javax.swing.JButton();
        yellowTulipBuy = new javax.swing.JButton();
        blueTulipLabel = new javax.swing.JLabel();
        whiteTulipImg = new javax.swing.JLabel();
        whiteTulipLable = new javax.swing.JLabel();
        blackTulipDscrptn = new javax.swing.JLabel();
        whiteTulipDscrptn = new javax.swing.JLabel();
        blackTulipBuy = new javax.swing.JButton();
        whiteTulipBuy = new javax.swing.JButton();
        RT01 = new javax.swing.JRadioButton();
        YT02 = new javax.swing.JRadioButton();
        BT03 = new javax.swing.JRadioButton();
        WT04 = new javax.swing.JRadioButton();
        BlT05 = new javax.swing.JRadioButton();
        blueTulipImg = new javax.swing.JLabel();
        mixedTulipImg = new javax.swing.JLabel();
        blackTulipLabel = new javax.swing.JLabel();
        blueTulipDscrptn = new javax.swing.JLabel();
        blueTulipBuy = new javax.swing.JButton();
        mixedOrchidBuy = new javax.swing.JButton();
        recombineOrchidBttn = new javax.swing.JButton();
        clr1 = new javax.swing.JButton();
        logoutBttn = new javax.swing.JButton();
        tulipLabel1 = new javax.swing.JLabel();
        blueRoseImg = new javax.swing.JLabel();
        whiteRoseLabel = new javax.swing.JLabel();
        whiteRoseDscrptn = new javax.swing.JLabel();
        redRoseBuy = new javax.swing.JButton();
        pinkRoseImg = new javax.swing.JLabel();
        yellowRoseLabel = new javax.swing.JLabel();
        yellowRoseDscrptn = new javax.swing.JLabel();
        mixedTulipBuy1 = new javax.swing.JButton();
        redRoseImg = new javax.swing.JLabel();
        blueRoseLabel = new javax.swing.JLabel();
        blueRoseDscrptn = new javax.swing.JLabel();
        blueRoseBuy = new javax.swing.JButton();
        yellowRoseImg = new javax.swing.JLabel();
        pinkRoseLabel = new javax.swing.JLabel();
        pinkRoseDscrptn = new javax.swing.JLabel();
        pinkRoseBuy = new javax.swing.JButton();
        whiteRoseImg = new javax.swing.JLabel();
        redRoseLabel = new javax.swing.JLabel();
        redRoseDscrptn = new javax.swing.JLabel();
        whiteRoseBuy = new javax.swing.JButton();
        redHibiscusImg = new javax.swing.JLabel();
        recombineTulipBttn = new javax.swing.JButton();
        clr5 = new javax.swing.JButton();
        yellowRoseBuy = new javax.swing.JButton();
        PR02 = new javax.swing.JRadioButton();
        RH05 = new javax.swing.JRadioButton();
        WR05 = new javax.swing.JRadioButton();
        RR03 = new javax.swing.JRadioButton();
        YR04 = new javax.swing.JRadioButton();
        mixedOrchidPrice = new javax.swing.JLabel();
        noOfRT01 = new javax.swing.JSpinner();
        noOfYT02 = new javax.swing.JSpinner();
        noOfBT03 = new javax.swing.JSpinner();
        noOfWT04 = new javax.swing.JSpinner();
        noOfBlT05 = new javax.swing.JSpinner();
        noOfBR01 = new javax.swing.JSpinner();
        noOfPR02 = new javax.swing.JSpinner();
        noOfRR03 = new javax.swing.JSpinner();
        noOfYR04 = new javax.swing.JSpinner();
        noOfWR05 = new javax.swing.JSpinner();
        tulipLabel2 = new javax.swing.JLabel();
        whiteHibiscusImg = new javax.swing.JLabel();
        redOrchidLabel = new javax.swing.JLabel();
        redOrchidDscrptn = new javax.swing.JLabel();
        redOrchidBuy = new javax.swing.JButton();
        noOfROR04 = new javax.swing.JSpinner();
        pinkHibiscusImg = new javax.swing.JLabel();
        purpleHibiscusLabel = new javax.swing.JLabel();
        purpleHibiscusDscrptn = new javax.swing.JLabel();
        purpleHibiscusBuy = new javax.swing.JButton();
        noOfPPH04 = new javax.swing.JSpinner();
        whiteHibiscusImg1 = new javax.swing.JLabel();
        whiteHibiscusLabel = new javax.swing.JLabel();
        whiteHibiscusDscrptn = new javax.swing.JLabel();
        whiteHibiscusBuy = new javax.swing.JButton();
        noOfWH01 = new javax.swing.JSpinner();
        mixedRoseImg = new javax.swing.JLabel();
        whiteOrchidImg = new javax.swing.JLabel();
        purpleHibiscusImg = new javax.swing.JLabel();
        pinkHibiscusLabel = new javax.swing.JLabel();
        pinkHibiscusDscrptn = new javax.swing.JLabel();
        pinkHibiscusBuy = new javax.swing.JButton();
        noOfPH02 = new javax.swing.JSpinner();
        yellowHibiscusLabel = new javax.swing.JLabel();
        yellowHibiscusDscrptn = new javax.swing.JLabel();
        yellowHibiscusBuy = new javax.swing.JButton();
        noOfYH03 = new javax.swing.JSpinner();
        recombineRoseBttn = new javax.swing.JButton();
        clr2 = new javax.swing.JButton();
        BR01 = new javax.swing.JRadioButton();
        WOR05 = new javax.swing.JRadioButton();
        PH02 = new javax.swing.JRadioButton();
        YH03 = new javax.swing.JRadioButton();
        PPH04 = new javax.swing.JRadioButton();
        mixedRosePrice = new javax.swing.JLabel();
        mixedRoseBuy = new javax.swing.JButton();
        tulipLabel3 = new javax.swing.JLabel();
        mixedOrchidImg = new javax.swing.JLabel();
        mixedHibiscusImg = new javax.swing.JLabel();
        blueOrchidImg = new javax.swing.JLabel();
        purpleOrchidImg = new javax.swing.JLabel();
        yellowOrchidImg = new javax.swing.JLabel();
        redOrchidImg = new javax.swing.JLabel();
        redHibiscusLabel = new javax.swing.JLabel();
        redHibiscusDscrptn = new javax.swing.JLabel();
        redHibiscusBuy = new javax.swing.JButton();
        noOfRH05 = new javax.swing.JSpinner();
        whiteOrchidLabel = new javax.swing.JLabel();
        whiteOrchidDscrptn = new javax.swing.JLabel();
        whiteOrchidBuy = new javax.swing.JButton();
        noOfWOR05 = new javax.swing.JSpinner();
        blueOrchidLabel = new javax.swing.JLabel();
        blueOrchidDscrptn = new javax.swing.JLabel();
        blueOrchidBuy = new javax.swing.JButton();
        noOfBOR01 = new javax.swing.JSpinner();
        purpleOrchidLabel = new javax.swing.JLabel();
        purpleOrchidDscrptn = new javax.swing.JLabel();
        purpleOrchidBuy = new javax.swing.JButton();
        noOfPOR02 = new javax.swing.JSpinner();
        yellowOrchidLabel = new javax.swing.JLabel();
        yellowOrchidDscrptn = new javax.swing.JLabel();
        yellowOrchidBuy = new javax.swing.JButton();
        noOfYOR03 = new javax.swing.JSpinner();
        recombineHibiscusBttn = new javax.swing.JButton();
        clr3 = new javax.swing.JButton();
        WH01 = new javax.swing.JRadioButton();
        BOR01 = new javax.swing.JRadioButton();
        POR02 = new javax.swing.JRadioButton();
        YOR03 = new javax.swing.JRadioButton();
        ROR04 = new javax.swing.JRadioButton();
        mixedHibiscusPrice = new javax.swing.JLabel();
        mixedHibiscusBuy = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        scrlPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        currPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        finalPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        redTulipPrice = new javax.swing.JLabel();
        yellowTulipPrice = new javax.swing.JLabel();
        redTulipID = new javax.swing.JLabel();
        yellowTulipID = new javax.swing.JLabel();
        blackTulipPrice = new javax.swing.JLabel();
        blackTulipID = new javax.swing.JLabel();
        whiteTulipID = new javax.swing.JLabel();
        whiteTulipPrice = new javax.swing.JLabel();
        blueTulipID = new javax.swing.JLabel();
        blueTulipPrice = new javax.swing.JLabel();
        mixedTulipPrice = new javax.swing.JLabel();
        blueRoseID = new javax.swing.JLabel();
        blueRosePrice = new javax.swing.JLabel();
        pinkRoseID = new javax.swing.JLabel();
        pinkRosePrice = new javax.swing.JLabel();
        mixedRoseDescription = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        redRoseID = new javax.swing.JLabel();
        redRosePrice = new javax.swing.JLabel();
        yellowRoseID = new javax.swing.JLabel();
        whiteRoseID = new javax.swing.JLabel();
        whiteRosePrice = new javax.swing.JLabel();
        yellowRosePrice = new javax.swing.JLabel();
        whiteHibiscusID = new javax.swing.JLabel();
        whiteHibiscusPrice = new javax.swing.JLabel();
        pinkHibiscusID = new javax.swing.JLabel();
        pinkHibiscusPrice = new javax.swing.JLabel();
        yellowHibiscusID = new javax.swing.JLabel();
        yellowHibiscusPrice = new javax.swing.JLabel();
        purpleHibiscusID = new javax.swing.JLabel();
        purpleHibiscusPrice = new javax.swing.JLabel();
        redHibiscusID = new javax.swing.JLabel();
        redHibiscusPrice = new javax.swing.JLabel();
        mixedHibiscusDescription = new javax.swing.JLabel();
        blueOrchidID = new javax.swing.JLabel();
        blueOrchidPrice = new javax.swing.JLabel();
        purpleOrchidID = new javax.swing.JLabel();
        prupleOrchidPrice = new javax.swing.JLabel();
        yellowOrchidID = new javax.swing.JLabel();
        yellowOrchidPrice = new javax.swing.JLabel();
        redOrchidID = new javax.swing.JLabel();
        redOrchidPrice = new javax.swing.JLabel();
        whiteOrchidID = new javax.swing.JLabel();
        whiteOrchidPrice = new javax.swing.JLabel();
        mixedOrchidDescription = new javax.swing.JLabel();
        aboutBttn = new javax.swing.JButton();
        discnt = new javax.swing.JLabel();
        congo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home page");
        setBackground(new java.awt.Color(51, 102, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        headingBar1.setBackground(new java.awt.Color(102, 0, 51));
        headingBar1.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        headingBar1.setForeground(new java.awt.Color(204, 255, 204));
        headingBar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingBar1.setText("Paradise of Flowers");
        headingBar1.setOpaque(true);

        headingBar2.setBackground(new java.awt.Color(116, 3, 59));
        headingBar2.setFont(new java.awt.Font("Gabriola", 3, 36)); // NOI18N
        headingBar2.setForeground(new java.awt.Color(204, 255, 204));
        headingBar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingBar2.setText("Make your dream garden");
        headingBar2.setOpaque(true);

        scrlPane1.setBackground(new java.awt.Color(119, 72, 96));
        scrlPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        mainBody.setBackground(new java.awt.Color(108, 71, 90));
        mainBody.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mainBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redTulip.jpg"))); // NOI18N
        mainBody.add(redTulipImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 181, -1, -1));

        redTulipLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        redTulipLabel.setForeground(new java.awt.Color(153, 255, 204));
        redTulipLabel.setText("Red Tulip ");
        mainBody.add(redTulipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 181, 150, 45));

        tulipLabel.setBackground(new java.awt.Color(102, 0, 51));
        tulipLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tulipLabel.setForeground(new java.awt.Color(204, 255, 204));
        tulipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tulipLabel.setText("Tulip");
        tulipLabel.setOpaque(true);
        mainBody.add(tulipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 71, 271, 41));

        RedTulipDscrptn.setBackground(new java.awt.Color(204, 255, 204));
        RedTulipDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RedTulipDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        RedTulipDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(RedTulipDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 226, -1, 109));

        yellowTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowTulip.jpg"))); // NOI18N
        mainBody.add(yellowTulipImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 181, -1, -1));

        yellowTulipLabel.setBackground(new java.awt.Color(153, 255, 204));
        yellowTulipLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        yellowTulipLabel.setForeground(new java.awt.Color(153, 255, 204));
        yellowTulipLabel.setText("Yellow Tulip");
        mainBody.add(yellowTulipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 181, 150, 45));

        yellowTulipDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowTulipDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        yellowTulipDscrptn.setText("<html>Plant ID : <br><br>Price (Tk) : <html>");
        mainBody.add(yellowTulipDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 226, -1, 100));

        blackTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blackTulip.jpg"))); // NOI18N
        mainBody.add(blackTulipImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 424, -1, -1));

        redTulipBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redTulipBuy.setText("Buy");
        redTulipBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redTulipBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redTulipBuy.setOpaque(false);
        redTulipBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redTulipBuyActionPerformed(evt);
            }
        });
        mainBody.add(redTulipBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 352, 90, -1));

        yellowTulipBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowTulipBuy.setText("Buy");
        yellowTulipBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellowTulipBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellowTulipBuy.setOpaque(false);
        yellowTulipBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowTulipBuyActionPerformed(evt);
            }
        });
        mainBody.add(yellowTulipBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 350, 90, -1));

        blueTulipLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        blueTulipLabel.setForeground(new java.awt.Color(153, 255, 204));
        blueTulipLabel.setText("Blue Tulip");
        mainBody.add(blueTulipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 668, 150, 45));

        whiteTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteTulip.jpg"))); // NOI18N
        mainBody.add(whiteTulipImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 424, -1, -1));

        whiteTulipLable.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        whiteTulipLable.setForeground(new java.awt.Color(153, 255, 204));
        whiteTulipLable.setText("White Tulip");
        mainBody.add(whiteTulipLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 424, 150, 45));

        blackTulipDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blackTulipDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        blackTulipDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(blackTulipDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 469, -1, 109));

        whiteTulipDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteTulipDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        whiteTulipDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(whiteTulipDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 476, -1, 109));

        blackTulipBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blackTulipBuy.setText("Buy");
        blackTulipBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blackTulipBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blackTulipBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackTulipBuyActionPerformed(evt);
            }
        });
        mainBody.add(blackTulipBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 595, 90, -1));

        whiteTulipBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteTulipBuy.setText("Buy");
        whiteTulipBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whiteTulipBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whiteTulipBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteTulipBuyActionPerformed(evt);
            }
        });
        mainBody.add(whiteTulipBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 593, 90, -1));

        RT01.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        RT01.setForeground(new java.awt.Color(204, 255, 204));
        RT01.setText("RT01");
        RT01.setOpaque(false);
        RT01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RT01ActionPerformed(evt);
            }
        });
        mainBody.add(RT01, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 697, -1, -1));

        YT02.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        YT02.setForeground(new java.awt.Color(204, 255, 204));
        YT02.setText("YT02");
        YT02.setOpaque(false);
        YT02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YT02ActionPerformed(evt);
            }
        });
        mainBody.add(YT02, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 728, -1, -1));

        BT03.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        BT03.setForeground(new java.awt.Color(204, 255, 204));
        BT03.setText("BT03");
        BT03.setOpaque(false);
        BT03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT03ActionPerformed(evt);
            }
        });
        mainBody.add(BT03, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 759, -1, -1));

        WT04.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        WT04.setForeground(new java.awt.Color(204, 255, 204));
        WT04.setText("WT04");
        WT04.setOpaque(false);
        WT04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WT04ActionPerformed(evt);
            }
        });
        mainBody.add(WT04, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 790, -1, -1));

        BlT05.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        BlT05.setForeground(new java.awt.Color(204, 255, 204));
        BlT05.setText("BlT05");
        BlT05.setOpaque(false);
        BlT05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlT05ActionPerformed(evt);
            }
        });
        mainBody.add(BlT05, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 826, -1, -1));

        blueTulipImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueTulip.jpg"))); // NOI18N
        mainBody.add(blueTulipImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 668, -1, -1));

        mixedTulipImg.setBackground(new java.awt.Color(204, 204, 204));
        mixedTulipImg.setOpaque(true);
        mainBody.add(mixedTulipImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 668, 200, 200));

        blackTulipLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        blackTulipLabel.setForeground(new java.awt.Color(153, 255, 204));
        blackTulipLabel.setText("Black Tulip");
        mainBody.add(blackTulipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 424, 150, 45));

        blueTulipDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueTulipDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        blueTulipDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(blueTulipDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 720, -1, 109));

        blueTulipBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueTulipBuy.setText("Buy");
        blueTulipBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blueTulipBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blueTulipBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueTulipBuyActionPerformed(evt);
            }
        });
        mainBody.add(blueTulipBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 837, 90, -1));

        mixedOrchidBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedOrchidBuy.setText("Buy");
        mixedOrchidBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mixedOrchidBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mixedOrchidBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixedOrchidBuyActionPerformed(evt);
            }
        });
        mainBody.add(mixedOrchidBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 3420, 90, -1));

        recombineOrchidBttn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        recombineOrchidBttn.setText("Recombine");
        recombineOrchidBttn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recombineOrchidBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recombineOrchidBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recombineOrchidBttnActionPerformed(evt);
            }
        });
        mainBody.add(recombineOrchidBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3250, 115, -1));

        clr1.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        clr1.setText("Clear");
        clr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr1ActionPerformed(evt);
            }
        });
        mainBody.add(clr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 668, -1, 27));

        logoutBttn.setBackground(new java.awt.Color(102, 0, 51));
        logoutBttn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoutBttn.setForeground(new java.awt.Color(153, 255, 204));
        logoutBttn.setText("Logout");
        logoutBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBttnActionPerformed(evt);
            }
        });
        mainBody.add(logoutBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        tulipLabel1.setBackground(new java.awt.Color(102, 0, 51));
        tulipLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tulipLabel1.setForeground(new java.awt.Color(204, 255, 204));
        tulipLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tulipLabel1.setText("Rose");
        tulipLabel1.setOpaque(true);
        mainBody.add(tulipLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 950, 271, 41));

        blueRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueRose.jpg"))); // NOI18N
        blueRoseImg.setOpaque(true);
        mainBody.add(blueRoseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 1052, -1, -1));

        whiteRoseLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        whiteRoseLabel.setForeground(new java.awt.Color(153, 255, 204));
        whiteRoseLabel.setText("White Rose");
        mainBody.add(whiteRoseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1549, 150, 45));

        whiteRoseDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteRoseDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        whiteRoseDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(whiteRoseDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1601, -1, 109));

        redRoseBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redRoseBuy.setText("Buy");
        redRoseBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redRoseBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redRoseBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redRoseBuyActionPerformed(evt);
            }
        });
        mainBody.add(redRoseBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1473, 90, -1));

        pinkRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkRose.jpeg"))); // NOI18N
        pinkRoseImg.setOpaque(true);
        mainBody.add(pinkRoseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 1052, -1, -1));

        yellowRoseLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        yellowRoseLabel.setForeground(new java.awt.Color(153, 255, 204));
        yellowRoseLabel.setText("Yellow Rose");
        mainBody.add(yellowRoseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 1304, 150, 45));

        yellowRoseDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowRoseDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        yellowRoseDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(yellowRoseDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 1356, -1, 109));

        mixedTulipBuy1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedTulipBuy1.setText("Buy");
        mixedTulipBuy1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mixedTulipBuy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mixedTulipBuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixedTulipBuy1ActionPerformed(evt);
            }
        });
        mainBody.add(mixedTulipBuy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 839, 90, -1));

        redRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redRose.jpg"))); // NOI18N
        redRoseImg.setOpaque(true);
        mainBody.add(redRoseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 1304, -1, -1));

        blueRoseLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        blueRoseLabel.setForeground(new java.awt.Color(153, 255, 204));
        blueRoseLabel.setText("Blue Rose");
        mainBody.add(blueRoseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1052, 150, 45));

        blueRoseDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueRoseDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        blueRoseDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(blueRoseDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1104, -1, 109));

        blueRoseBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueRoseBuy.setText("Buy");
        blueRoseBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blueRoseBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blueRoseBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueRoseBuyActionPerformed(evt);
            }
        });
        mainBody.add(blueRoseBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1224, 90, -1));

        yellowRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowRose.jpeg"))); // NOI18N
        yellowRoseImg.setOpaque(true);
        mainBody.add(yellowRoseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 1304, -1, -1));

        pinkRoseLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        pinkRoseLabel.setForeground(new java.awt.Color(153, 255, 204));
        pinkRoseLabel.setText("Pink Rose");
        mainBody.add(pinkRoseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 1052, 150, 45));

        pinkRoseDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkRoseDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        pinkRoseDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(pinkRoseDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 1104, -1, 109));

        pinkRoseBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkRoseBuy.setText("Buy");
        pinkRoseBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pinkRoseBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinkRoseBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkRoseBuyActionPerformed(evt);
            }
        });
        mainBody.add(pinkRoseBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 1223, 90, -1));

        whiteRoseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteRose.jpg"))); // NOI18N
        whiteRoseImg.setOpaque(true);
        mainBody.add(whiteRoseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 1549, -1, -1));

        redRoseLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        redRoseLabel.setForeground(new java.awt.Color(153, 255, 204));
        redRoseLabel.setText("Red Rose");
        mainBody.add(redRoseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1304, 150, 45));

        redRoseDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redRoseDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        redRoseDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(redRoseDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1356, -1, 109));

        whiteRoseBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteRoseBuy.setText("Buy");
        whiteRoseBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whiteRoseBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whiteRoseBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteRoseBuyActionPerformed(evt);
            }
        });
        mainBody.add(whiteRoseBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 1720, 90, -1));

        redHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redHibiscus.jpg"))); // NOI18N
        redHibiscusImg.setOpaque(true);
        mainBody.add(redHibiscusImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2390, 200, 200));

        recombineTulipBttn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        recombineTulipBttn.setText("Recombine");
        recombineTulipBttn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recombineTulipBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recombineTulipBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recombineTulipBttnActionPerformed(evt);
            }
        });
        mainBody.add(recombineTulipBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 668, 115, -1));

        clr5.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        clr5.setText("Clear");
        clr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr5ActionPerformed(evt);
            }
        });
        mainBody.add(clr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 3250, 78, -1));

        yellowRoseBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowRoseBuy.setText("Buy");
        yellowRoseBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellowRoseBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellowRoseBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowRoseBuyActionPerformed(evt);
            }
        });
        mainBody.add(yellowRoseBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 1475, 90, -1));

        PR02.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        PR02.setForeground(new java.awt.Color(204, 255, 204));
        PR02.setText("PR02");
        PR02.setOpaque(false);
        PR02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PR02ActionPerformed(evt);
            }
        });
        mainBody.add(PR02, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 1623, -1, -1));

        RH05.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        RH05.setForeground(new java.awt.Color(204, 255, 204));
        RH05.setText("RH05");
        RH05.setOpaque(false);
        RH05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RH05ActionPerformed(evt);
            }
        });
        mainBody.add(RH05, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2540, -1, -1));

        WR05.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        WR05.setForeground(new java.awt.Color(204, 255, 204));
        WR05.setText("WR05");
        WR05.setOpaque(false);
        WR05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WR05ActionPerformed(evt);
            }
        });
        mainBody.add(WR05, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 1725, -1, -1));

        RR03.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        RR03.setForeground(new java.awt.Color(204, 255, 204));
        RR03.setText("RR03");
        RR03.setOpaque(false);
        RR03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RR03ActionPerformed(evt);
            }
        });
        mainBody.add(RR03, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 1661, -1, -1));

        YR04.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        YR04.setForeground(new java.awt.Color(204, 255, 204));
        YR04.setText("YR04");
        YR04.setOpaque(false);
        YR04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YR04ActionPerformed(evt);
            }
        });
        mainBody.add(YR04, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 1692, -1, -1));

        mixedOrchidPrice.setBackground(new java.awt.Color(204, 204, 204));
        mixedOrchidPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedOrchidPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainBody.add(mixedOrchidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 3330, 100, 35));

        noOfRT01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfRT01.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfRT01, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 352, 55, 29));

        noOfYT02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfYT02.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfYT02, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 352, 55, 29));

        noOfBT03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfBT03.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfBT03, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 595, 55, 29));

        noOfWT04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfWT04.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfWT04, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 595, 55, 29));

        noOfBlT05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfBlT05.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfBlT05, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 839, 55, 29));

        noOfBR01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfBR01.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfBR01, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 1226, 55, 29));

        noOfPR02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfPR02.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfPR02, new org.netbeans.lib.awtextra.AbsoluteConstraints(1091, 1223, 55, 29));

        noOfRR03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfRR03.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfRR03, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 1475, 55, 29));

        noOfYR04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfYR04.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfYR04, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 1472, 55, 32));

        noOfWR05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfWR05.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfWR05, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 1717, 55, 32));

        tulipLabel2.setBackground(new java.awt.Color(102, 0, 51));
        tulipLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tulipLabel2.setForeground(new java.awt.Color(204, 255, 204));
        tulipLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tulipLabel2.setText("Orchid");
        tulipLabel2.setOpaque(true);
        mainBody.add(tulipLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 2640, 271, 41));

        whiteHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowHibiscus.jpg"))); // NOI18N
        whiteHibiscusImg.setOpaque(true);
        mainBody.add(whiteHibiscusImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2140, 200, 200));

        redOrchidLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        redOrchidLabel.setForeground(new java.awt.Color(153, 255, 204));
        redOrchidLabel.setText("Red Orchid");
        mainBody.add(redOrchidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3000, 170, 45));

        redOrchidDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redOrchidDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        redOrchidDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(redOrchidDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3050, -1, 109));

        redOrchidBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redOrchidBuy.setText("Buy");
        redOrchidBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redOrchidBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redOrchidBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redOrchidBuyActionPerformed(evt);
            }
        });
        mainBody.add(redOrchidBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3170, 90, -1));

        noOfROR04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfROR04.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfROR04, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 3170, 55, 32));

        pinkHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pinkHibiscus.jpg"))); // NOI18N
        pinkHibiscusImg.setOpaque(true);
        mainBody.add(pinkHibiscusImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1890, 200, 200));

        purpleHibiscusLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        purpleHibiscusLabel.setForeground(new java.awt.Color(153, 255, 204));
        purpleHibiscusLabel.setText("Purple Hibiscus");
        mainBody.add(purpleHibiscusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2140, 170, 45));

        purpleHibiscusDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleHibiscusDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        purpleHibiscusDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(purpleHibiscusDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2190, -1, 109));

        purpleHibiscusBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleHibiscusBuy.setText("Buy");
        purpleHibiscusBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purpleHibiscusBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purpleHibiscusBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleHibiscusBuyActionPerformed(evt);
            }
        });
        mainBody.add(purpleHibiscusBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2310, 90, -1));

        noOfPPH04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfPPH04.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfPPH04, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2310, 55, 32));

        whiteHibiscusImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteHibiscus.jpg"))); // NOI18N
        whiteHibiscusImg1.setOpaque(true);
        mainBody.add(whiteHibiscusImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1890, 200, 200));

        whiteHibiscusLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        whiteHibiscusLabel.setForeground(new java.awt.Color(153, 255, 204));
        whiteHibiscusLabel.setText("White Hibiscus");
        mainBody.add(whiteHibiscusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1890, 160, 45));

        whiteHibiscusDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteHibiscusDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        whiteHibiscusDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(whiteHibiscusDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1940, -1, 109));

        whiteHibiscusBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteHibiscusBuy.setText("Buy");
        whiteHibiscusBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whiteHibiscusBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whiteHibiscusBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteHibiscusBuyActionPerformed(evt);
            }
        });
        mainBody.add(whiteHibiscusBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2060, 90, -1));

        noOfWH01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfWH01.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfWH01, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2060, 55, 32));

        mixedRoseImg.setOpaque(true);
        mainBody.add(mixedRoseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 1549, 200, 200));

        whiteOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/whiteOrchid.jpg"))); // NOI18N
        whiteOrchidImg.setOpaque(true);
        mainBody.add(whiteOrchidImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3250, 200, 200));

        purpleHibiscusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purpleHibiscus.jpg"))); // NOI18N
        purpleHibiscusImg.setOpaque(true);
        mainBody.add(purpleHibiscusImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 2140, 200, 200));

        pinkHibiscusLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        pinkHibiscusLabel.setForeground(new java.awt.Color(153, 255, 204));
        pinkHibiscusLabel.setText("Pink Hibiscus");
        mainBody.add(pinkHibiscusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1890, 150, 45));

        pinkHibiscusDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkHibiscusDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        pinkHibiscusDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(pinkHibiscusDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1940, -1, 109));

        pinkHibiscusBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkHibiscusBuy.setText("Buy");
        pinkHibiscusBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pinkHibiscusBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinkHibiscusBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkHibiscusBuyActionPerformed(evt);
            }
        });
        mainBody.add(pinkHibiscusBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2060, 90, -1));

        noOfPH02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfPH02.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfPH02, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2060, 55, 32));

        yellowHibiscusLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        yellowHibiscusLabel.setForeground(new java.awt.Color(153, 255, 204));
        yellowHibiscusLabel.setText("Yellow Hibiscus");
        mainBody.add(yellowHibiscusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2140, 170, 45));

        yellowHibiscusDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowHibiscusDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        yellowHibiscusDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(yellowHibiscusDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2190, -1, 109));

        yellowHibiscusBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowHibiscusBuy.setText("Buy");
        yellowHibiscusBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellowHibiscusBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellowHibiscusBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowHibiscusBuyActionPerformed(evt);
            }
        });
        mainBody.add(yellowHibiscusBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2310, 90, -1));

        noOfYH03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfYH03.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfYH03, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2310, 55, 32));

        recombineRoseBttn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        recombineRoseBttn.setText("Recombine");
        recombineRoseBttn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recombineRoseBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recombineRoseBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recombineRoseBttnActionPerformed(evt);
            }
        });
        mainBody.add(recombineRoseBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 1551, 115, -1));

        clr2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        clr2.setText("Clear");
        clr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr2ActionPerformed(evt);
            }
        });
        mainBody.add(clr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 1549, 78, -1));

        BR01.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        BR01.setForeground(new java.awt.Color(204, 255, 204));
        BR01.setText("BR01");
        BR01.setOpaque(false);
        BR01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BR01ActionPerformed(evt);
            }
        });
        mainBody.add(BR01, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 1589, -1, -1));

        WOR05.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        WOR05.setForeground(new java.awt.Color(204, 255, 204));
        WOR05.setText("WOR05");
        WOR05.setOpaque(false);
        WOR05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WOR05ActionPerformed(evt);
            }
        });
        mainBody.add(WOR05, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3400, -1, -1));

        PH02.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        PH02.setForeground(new java.awt.Color(204, 255, 204));
        PH02.setText("PH02");
        PH02.setOpaque(false);
        PH02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PH02ActionPerformed(evt);
            }
        });
        mainBody.add(PH02, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2450, -1, -1));

        YH03.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        YH03.setForeground(new java.awt.Color(204, 255, 204));
        YH03.setText("YH03");
        YH03.setOpaque(false);
        YH03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YH03ActionPerformed(evt);
            }
        });
        mainBody.add(YH03, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2480, -1, -1));

        PPH04.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        PPH04.setForeground(new java.awt.Color(204, 255, 204));
        PPH04.setText("PPH04");
        PPH04.setOpaque(false);
        PPH04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPH04ActionPerformed(evt);
            }
        });
        mainBody.add(PPH04, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2510, -1, -1));

        mixedRosePrice.setBackground(new java.awt.Color(204, 204, 204));
        mixedRosePrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedRosePrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainBody.add(mixedRosePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1640, 100, 35));

        mixedRoseBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedRoseBuy.setText("Buy");
        mixedRoseBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mixedRoseBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mixedRoseBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixedRoseBuyActionPerformed(evt);
            }
        });
        mainBody.add(mixedRoseBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 1720, 90, -1));

        tulipLabel3.setBackground(new java.awt.Color(102, 0, 51));
        tulipLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tulipLabel3.setForeground(new java.awt.Color(204, 255, 204));
        tulipLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tulipLabel3.setText("Hibiscus");
        tulipLabel3.setOpaque(true);
        mainBody.add(tulipLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 1803, 271, 41));

        mixedOrchidImg.setOpaque(true);
        mainBody.add(mixedOrchidImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 3250, 200, 200));

        mixedHibiscusImg.setOpaque(true);
        mainBody.add(mixedHibiscusImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 2390, 200, 200));

        blueOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blueOrchid.jpg"))); // NOI18N
        blueOrchidImg.setOpaque(true);
        mainBody.add(blueOrchidImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2750, 200, 200));

        purpleOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purpleOrchid.jpg"))); // NOI18N
        purpleOrchidImg.setOpaque(true);
        mainBody.add(purpleOrchidImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 2750, 200, 200));

        yellowOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yellowOrchid.jpg"))); // NOI18N
        yellowOrchidImg.setOpaque(true);
        mainBody.add(yellowOrchidImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3000, 200, 200));

        redOrchidImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/redOrchid.jpg"))); // NOI18N
        redOrchidImg.setOpaque(true);
        mainBody.add(redOrchidImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 3000, 200, 200));

        redHibiscusLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        redHibiscusLabel.setForeground(new java.awt.Color(153, 255, 204));
        redHibiscusLabel.setText("Red Hibiscus");
        mainBody.add(redHibiscusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2390, 170, 45));

        redHibiscusDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redHibiscusDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        redHibiscusDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(redHibiscusDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2440, -1, 109));

        redHibiscusBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redHibiscusBuy.setText("Buy");
        redHibiscusBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redHibiscusBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redHibiscusBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redHibiscusBuyActionPerformed(evt);
            }
        });
        mainBody.add(redHibiscusBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2560, 90, -1));

        noOfRH05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfRH05.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfRH05, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2560, 55, 32));

        whiteOrchidLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        whiteOrchidLabel.setForeground(new java.awt.Color(153, 255, 204));
        whiteOrchidLabel.setText("White Orchid");
        mainBody.add(whiteOrchidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 3250, 170, 45));

        whiteOrchidDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteOrchidDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        whiteOrchidDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(whiteOrchidDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 3300, -1, 109));

        whiteOrchidBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteOrchidBuy.setText("Buy");
        whiteOrchidBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whiteOrchidBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whiteOrchidBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteOrchidBuyActionPerformed(evt);
            }
        });
        mainBody.add(whiteOrchidBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 3420, 90, -1));

        noOfWOR05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfWOR05.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfWOR05, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3420, 55, 32));

        blueOrchidLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        blueOrchidLabel.setForeground(new java.awt.Color(153, 255, 204));
        blueOrchidLabel.setText("Blue Orchid");
        mainBody.add(blueOrchidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2750, 170, 45));

        blueOrchidDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueOrchidDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        blueOrchidDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(blueOrchidDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2800, -1, 109));

        blueOrchidBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueOrchidBuy.setText("Buy");
        blueOrchidBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blueOrchidBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blueOrchidBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueOrchidBuyActionPerformed(evt);
            }
        });
        mainBody.add(blueOrchidBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2920, 90, -1));

        noOfBOR01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfBOR01.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfBOR01, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2920, 55, 32));

        purpleOrchidLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        purpleOrchidLabel.setForeground(new java.awt.Color(153, 255, 204));
        purpleOrchidLabel.setText("Purple Orchid");
        mainBody.add(purpleOrchidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2750, 170, 45));

        purpleOrchidDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleOrchidDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        purpleOrchidDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(purpleOrchidDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2800, -1, 109));

        purpleOrchidBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleOrchidBuy.setText("Buy");
        purpleOrchidBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purpleOrchidBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purpleOrchidBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleOrchidBuyActionPerformed(evt);
            }
        });
        mainBody.add(purpleOrchidBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2920, 90, -1));

        noOfPOR02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfPOR02.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfPOR02, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2920, 55, 32));

        yellowOrchidLabel.setFont(new java.awt.Font("Tahoma", 3, 21)); // NOI18N
        yellowOrchidLabel.setForeground(new java.awt.Color(153, 255, 204));
        yellowOrchidLabel.setText("Yellow Orchid");
        mainBody.add(yellowOrchidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 3000, 170, 45));

        yellowOrchidDscrptn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowOrchidDscrptn.setForeground(new java.awt.Color(204, 255, 204));
        yellowOrchidDscrptn.setText("<html>  Plant ID    :  <br><br>  Price (Tk) : <html>");
        mainBody.add(yellowOrchidDscrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 3050, -1, 109));

        yellowOrchidBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowOrchidBuy.setText("Buy");
        yellowOrchidBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellowOrchidBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellowOrchidBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowOrchidBuyActionPerformed(evt);
            }
        });
        mainBody.add(yellowOrchidBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 3170, 90, -1));

        noOfYOR03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfYOR03.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        mainBody.add(noOfYOR03, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3170, 55, 32));

        recombineHibiscusBttn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        recombineHibiscusBttn.setText("Recombine");
        recombineHibiscusBttn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recombineHibiscusBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recombineHibiscusBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recombineHibiscusBttnActionPerformed(evt);
            }
        });
        mainBody.add(recombineHibiscusBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2390, 115, -1));

        clr3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        clr3.setText("Clear");
        clr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr3ActionPerformed(evt);
            }
        });
        mainBody.add(clr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 2390, 78, -1));

        WH01.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        WH01.setForeground(new java.awt.Color(204, 255, 204));
        WH01.setText("WH01");
        WH01.setOpaque(false);
        WH01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WH01ActionPerformed(evt);
            }
        });
        mainBody.add(WH01, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2420, -1, -1));

        BOR01.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        BOR01.setForeground(new java.awt.Color(204, 255, 204));
        BOR01.setText("BOR01");
        BOR01.setOpaque(false);
        BOR01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOR01ActionPerformed(evt);
            }
        });
        mainBody.add(BOR01, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3280, -1, -1));

        POR02.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        POR02.setForeground(new java.awt.Color(204, 255, 204));
        POR02.setText("POR02");
        POR02.setOpaque(false);
        POR02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POR02ActionPerformed(evt);
            }
        });
        mainBody.add(POR02, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3310, -1, -1));

        YOR03.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        YOR03.setForeground(new java.awt.Color(204, 255, 204));
        YOR03.setText("YOR03");
        YOR03.setOpaque(false);
        YOR03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YOR03ActionPerformed(evt);
            }
        });
        mainBody.add(YOR03, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3340, -1, -1));

        ROR04.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        ROR04.setForeground(new java.awt.Color(204, 255, 204));
        ROR04.setText("ROR04");
        ROR04.setOpaque(false);
        ROR04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROR04ActionPerformed(evt);
            }
        });
        mainBody.add(ROR04, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3370, -1, -1));

        mixedHibiscusPrice.setBackground(new java.awt.Color(204, 204, 204));
        mixedHibiscusPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedHibiscusPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainBody.add(mixedHibiscusPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 2470, 100, 35));

        mixedHibiscusBuy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedHibiscusBuy.setText("Buy");
        mixedHibiscusBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mixedHibiscusBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mixedHibiscusBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixedHibiscusBuyActionPerformed(evt);
            }
        });
        mainBody.add(mixedHibiscusBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 2560, 90, -1));

        confirm.setBackground(new java.awt.Color(102, 0, 51));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        confirm.setForeground(new java.awt.Color(153, 255, 204));
        confirm.setText("Confirm Buy");
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        mainBody.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 3790, 190, 50));

        address.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        mainBody.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 3580, 420, 70));

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address");
        jLabel1.setOpaque(true);
        mainBody.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3580, 130, 70));

        scrlPane3.setBackground(new java.awt.Color(204, 204, 255));
        scrlPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrlPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        table.setBackground(new java.awt.Color(153, 153, 255));
        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plant ID", "Plant Name", "Number of buy", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlPane3.setViewportView(table);

        mainBody.add(scrlPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3610, 550, 110));

        jLabel2.setBackground(new java.awt.Color(102, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mobile");
        jLabel2.setOpaque(true);
        mainBody.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3670, 130, 50));

        currPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        currPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currPhoneActionPerformed(evt);
            }
        });
        mainBody.add(currPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 3670, 420, 50));

        jLabel3.setBackground(new java.awt.Color(102, 0, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cart Table");
        jLabel3.setOpaque(true);
        mainBody.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3580, 550, 30));

        finalPrice.setEditable(false);
        mainBody.add(finalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 3720, 140, 30));

        jLabel4.setBackground(new java.awt.Color(102, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total (Tk)");
        jLabel4.setOpaque(true);
        mainBody.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 3720, 100, 30));

        remove.setBackground(new java.awt.Color(102, 0, 51));
        remove.setForeground(new java.awt.Color(153, 255, 204));
        remove.setText("Remove from cart");
        remove.setToolTipText("Remove selected item from cart");
        remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        mainBody.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3720, -1, 30));

        redTulipPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redTulipPrice.setForeground(new java.awt.Color(204, 255, 204));
        redTulipPrice.setText("350");
        mainBody.add(redTulipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 100, 30));

        yellowTulipPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowTulipPrice.setForeground(new java.awt.Color(204, 255, 204));
        yellowTulipPrice.setText("250");
        mainBody.add(yellowTulipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 80, 30));

        redTulipID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redTulipID.setForeground(new java.awt.Color(204, 255, 204));
        redTulipID.setText("RT01");
        mainBody.add(redTulipID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 80, 30));

        yellowTulipID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowTulipID.setForeground(new java.awt.Color(204, 255, 204));
        yellowTulipID.setText("YT02");
        mainBody.add(yellowTulipID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 240, 80, 30));

        blackTulipPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blackTulipPrice.setForeground(new java.awt.Color(204, 255, 204));
        blackTulipPrice.setText("300");
        mainBody.add(blackTulipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, 40));

        blackTulipID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blackTulipID.setForeground(new java.awt.Color(204, 255, 204));
        blackTulipID.setText("BT03");
        mainBody.add(blackTulipID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 80, 40));

        whiteTulipID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteTulipID.setForeground(new java.awt.Color(204, 255, 204));
        whiteTulipID.setText("WT04");
        mainBody.add(whiteTulipID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, 90, 30));

        whiteTulipPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteTulipPrice.setForeground(new java.awt.Color(204, 255, 204));
        whiteTulipPrice.setText("220");
        mainBody.add(whiteTulipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 540, 80, 30));

        blueTulipID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueTulipID.setForeground(new java.awt.Color(204, 255, 204));
        blueTulipID.setText("BlT05");
        mainBody.add(blueTulipID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 730, 80, 40));

        blueTulipPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueTulipPrice.setForeground(new java.awt.Color(204, 255, 204));
        blueTulipPrice.setText("230");
        mainBody.add(blueTulipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 786, 70, 30));

        mixedTulipPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedTulipPrice.setForeground(new java.awt.Color(204, 255, 204));
        mixedTulipPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainBody.add(mixedTulipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 750, 100, 40));

        blueRoseID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueRoseID.setForeground(new java.awt.Color(204, 255, 204));
        blueRoseID.setText("BR01");
        mainBody.add(blueRoseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1120, 80, 30));

        blueRosePrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueRosePrice.setForeground(new java.awt.Color(204, 255, 204));
        blueRosePrice.setText("350");
        mainBody.add(blueRosePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1170, 70, 30));

        pinkRoseID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkRoseID.setForeground(new java.awt.Color(204, 255, 204));
        pinkRoseID.setText("PR02");
        mainBody.add(pinkRoseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 1120, 90, 30));

        pinkRosePrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkRosePrice.setForeground(new java.awt.Color(204, 255, 204));
        pinkRosePrice.setText("230");
        mainBody.add(pinkRosePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 1170, 70, 30));

        mixedRoseDescription.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedRoseDescription.setForeground(new java.awt.Color(204, 255, 204));
        mixedRoseDescription.setText("Price (Tk) :");
        mainBody.add(mixedRoseDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1600, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Price (Tk) :");
        mainBody.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 710, 100, 30));

        redRoseID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redRoseID.setForeground(new java.awt.Color(204, 255, 204));
        redRoseID.setText("RR03");
        mainBody.add(redRoseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1370, 80, 30));

        redRosePrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redRosePrice.setForeground(new java.awt.Color(204, 255, 204));
        redRosePrice.setText("250");
        mainBody.add(redRosePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1420, 80, 30));

        yellowRoseID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowRoseID.setForeground(new java.awt.Color(204, 255, 204));
        yellowRoseID.setText("YR04");
        mainBody.add(yellowRoseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 1370, 90, 30));

        whiteRoseID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteRoseID.setForeground(new java.awt.Color(204, 255, 204));
        whiteRoseID.setText("WR05");
        mainBody.add(whiteRoseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1610, 100, 40));

        whiteRosePrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteRosePrice.setForeground(new java.awt.Color(204, 255, 204));
        whiteRosePrice.setText("300");
        mainBody.add(whiteRosePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1660, 80, 40));

        yellowRosePrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowRosePrice.setForeground(new java.awt.Color(204, 255, 204));
        yellowRosePrice.setText("250");
        mainBody.add(yellowRosePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 1420, 80, 30));

        whiteHibiscusID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteHibiscusID.setForeground(new java.awt.Color(204, 255, 204));
        whiteHibiscusID.setText("WH01");
        mainBody.add(whiteHibiscusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1950, 70, 30));

        whiteHibiscusPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteHibiscusPrice.setForeground(new java.awt.Color(204, 255, 204));
        whiteHibiscusPrice.setText("220");
        mainBody.add(whiteHibiscusPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2000, 70, 30));

        pinkHibiscusID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkHibiscusID.setForeground(new java.awt.Color(204, 255, 204));
        pinkHibiscusID.setText("PH02");
        mainBody.add(pinkHibiscusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 1950, 80, 30));

        pinkHibiscusPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pinkHibiscusPrice.setForeground(new java.awt.Color(204, 255, 204));
        pinkHibiscusPrice.setText("230");
        mainBody.add(pinkHibiscusPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2006, 80, 30));

        yellowHibiscusID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowHibiscusID.setForeground(new java.awt.Color(204, 255, 204));
        yellowHibiscusID.setText("YH03");
        mainBody.add(yellowHibiscusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2206, 80, 30));

        yellowHibiscusPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowHibiscusPrice.setForeground(new java.awt.Color(204, 255, 204));
        yellowHibiscusPrice.setText("360");
        mainBody.add(yellowHibiscusPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2256, 70, 30));

        purpleHibiscusID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleHibiscusID.setForeground(new java.awt.Color(204, 255, 204));
        purpleHibiscusID.setText("PPH04");
        mainBody.add(purpleHibiscusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2206, 90, 30));

        purpleHibiscusPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleHibiscusPrice.setForeground(new java.awt.Color(204, 255, 204));
        purpleHibiscusPrice.setText("350");
        mainBody.add(purpleHibiscusPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2256, 80, 30));

        redHibiscusID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redHibiscusID.setForeground(new java.awt.Color(204, 255, 204));
        redHibiscusID.setText("RH05");
        mainBody.add(redHibiscusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2456, 80, 30));

        redHibiscusPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redHibiscusPrice.setForeground(new java.awt.Color(204, 255, 204));
        redHibiscusPrice.setText("280");
        mainBody.add(redHibiscusPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2506, 80, 30));

        mixedHibiscusDescription.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedHibiscusDescription.setForeground(new java.awt.Color(204, 255, 204));
        mixedHibiscusDescription.setText("Price (TK) :");
        mainBody.add(mixedHibiscusDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 2430, 110, 40));

        blueOrchidID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueOrchidID.setForeground(new java.awt.Color(204, 255, 204));
        blueOrchidID.setText("BOR01");
        mainBody.add(blueOrchidID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2816, 90, 30));

        blueOrchidPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        blueOrchidPrice.setForeground(new java.awt.Color(204, 255, 204));
        blueOrchidPrice.setText("400");
        mainBody.add(blueOrchidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2866, 80, 30));

        purpleOrchidID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        purpleOrchidID.setForeground(new java.awt.Color(204, 255, 204));
        purpleOrchidID.setText("POR02");
        mainBody.add(purpleOrchidID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2816, 80, 30));

        prupleOrchidPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        prupleOrchidPrice.setForeground(new java.awt.Color(204, 255, 204));
        prupleOrchidPrice.setText("410");
        mainBody.add(prupleOrchidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 2866, 80, 30));

        yellowOrchidID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowOrchidID.setForeground(new java.awt.Color(204, 255, 204));
        yellowOrchidID.setText("YOR03");
        mainBody.add(yellowOrchidID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3066, 100, 30));

        yellowOrchidPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        yellowOrchidPrice.setForeground(new java.awt.Color(204, 255, 204));
        yellowOrchidPrice.setText("390");
        mainBody.add(yellowOrchidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3116, 80, 30));

        redOrchidID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redOrchidID.setForeground(new java.awt.Color(204, 255, 204));
        redOrchidID.setText("ROR04");
        mainBody.add(redOrchidID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 3066, 80, 30));

        redOrchidPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        redOrchidPrice.setForeground(new java.awt.Color(204, 255, 204));
        redOrchidPrice.setText("420");
        mainBody.add(redOrchidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 3116, 90, 30));

        whiteOrchidID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteOrchidID.setForeground(new java.awt.Color(204, 255, 204));
        whiteOrchidID.setText("WOR05");
        mainBody.add(whiteOrchidID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3316, 90, 30));

        whiteOrchidPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        whiteOrchidPrice.setForeground(new java.awt.Color(204, 255, 204));
        whiteOrchidPrice.setText("380");
        mainBody.add(whiteOrchidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3366, 100, 30));

        mixedOrchidDescription.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mixedOrchidDescription.setForeground(new java.awt.Color(204, 255, 204));
        mixedOrchidDescription.setText("Price (TK) :");
        mainBody.add(mixedOrchidDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 3290, 110, 40));

        aboutBttn.setBackground(new java.awt.Color(102, 0, 51));
        aboutBttn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        aboutBttn.setForeground(new java.awt.Color(153, 255, 204));
        aboutBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgAbout/4.png"))); // NOI18N
        aboutBttn.setToolTipText("About Us");
        aboutBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBttnActionPerformed(evt);
            }
        });
        mainBody.add(aboutBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 80, 60));

        discnt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        discnt.setForeground(new java.awt.Color(204, 255, 204));
        discnt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mainBody.add(discnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 3850, 950, 80));

        congo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        congo.setForeground(new java.awt.Color(204, 255, 204));
        congo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainBody.add(congo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 730, 40));

        scrlPane1.setViewportView(mainBody);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
            .addComponent(headingBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
            .addComponent(scrlPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headingBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headingBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 3945, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void YR04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YR04ActionPerformed
        // TODO add your handling code here:
         yr04=YR04.isSelected();
        roseSelected +=1;
        yrPrice= Double.parseDouble(yellowRosePrice.getText());
    }//GEN-LAST:event_YR04ActionPerformed

    private void RR03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RR03ActionPerformed
        // TODO add your handling code here:
         rr03=RR03.isSelected();
        roseSelected +=1;
        rrPrice= Double.parseDouble(redRosePrice.getText());
    }//GEN-LAST:event_RR03ActionPerformed

    private void WR05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WR05ActionPerformed
        wr05=WR05.isSelected();
        roseSelected +=1;
        wrPrice= Double.parseDouble(whiteRosePrice.getText());
    }//GEN-LAST:event_WR05ActionPerformed

    private void RH05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RH05ActionPerformed
        // TODO add your handling code here:
          rh05=RH05.isSelected();
        hibiscusSelected +=1;
        rhPrice= Double.parseDouble(redHibiscusPrice.getText());
    }//GEN-LAST:event_RH05ActionPerformed

    private void PR02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PR02ActionPerformed
        // TODO add your handling code here:
         pr02=PR02.isSelected();
        roseSelected +=1;
        prPrice= Double.parseDouble(pinkRosePrice.getText());
    }//GEN-LAST:event_PR02ActionPerformed

    private void yellowRoseBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowRoseBuyActionPerformed
        double yrPrc= Double.parseDouble(blueRosePrice.getText())* Double.parseDouble(noOfYR04.getValue().toString());
        rows[0]=yellowRoseID.getText();
        rows[1]=yellowRoseLabel.getText();
        rows[2]=noOfYR04.getValue().toString();
        rows[3]=Double.toString(yrPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(yrPrc);
    }//GEN-LAST:event_yellowRoseBuyActionPerformed

    private void recombineTulipBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recombineTulipBttnActionPerformed
        // TODO add your handling code here:
         myTulip();
    }//GEN-LAST:event_recombineTulipBttnActionPerformed

    private void whiteRoseBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteRoseBuyActionPerformed
        double wrPrc= Double.parseDouble(whiteRosePrice.getText())* Double.parseDouble(noOfWR05.getValue().toString());
        rows[0]=whiteRoseID.getText();
        rows[1]=whiteRoseLabel.getText();
        rows[2]=noOfWR05.getValue().toString();
        rows[3]=Double.toString(wrPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(wrPrc);
    }//GEN-LAST:event_whiteRoseBuyActionPerformed

    private void pinkRoseBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkRoseBuyActionPerformed
        // TODO add your handling code here:
        double prPrc= Double.parseDouble(pinkRosePrice.getText())* Double.parseDouble(noOfPR02.getValue().toString());
        rows[0]=pinkRoseID.getText();
        rows[1]=pinkRoseLabel.getText();
        rows[2]=noOfPR02.getValue().toString();
        rows[3]=Double.toString(prPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(prPrc);
    }//GEN-LAST:event_pinkRoseBuyActionPerformed

    private void blueRoseBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueRoseBuyActionPerformed
        // TODO add your handling code here:
        double blrPrc= Double.parseDouble(blueRosePrice.getText())* Double.parseDouble(noOfBR01.getValue().toString());
        rows[0]=blueRoseID.getText();
        rows[1]=blueRoseLabel.getText();
        rows[2]=noOfBR01.getValue().toString();
        rows[3]=Double.toString(blrPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(blrPrc);
    }//GEN-LAST:event_blueRoseBuyActionPerformed

    private void mixedTulipBuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixedTulipBuy1ActionPerformed
        // TODO add your handling code here:
        double mixtPrc= Double.parseDouble(mixedTulipPrice.getText());
        rows[0]="MxT01";
        rows[1]="Mix Tulip";
        rows[2]="1";
        rows[3]=Double.toString(mixtPrc);
        model.insertRow(model.getRowCount(), rows);
        calcPrice(mixtPrc);
    }//GEN-LAST:event_mixedTulipBuy1ActionPerformed

    private void redRoseBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redRoseBuyActionPerformed
        double rrPrc= Double.parseDouble(redRosePrice.getText())* Double.parseDouble(noOfRR03.getValue().toString());
        rows[0]=redRoseID.getText();
        rows[1]=redRoseLabel.getText();
        rows[2]=noOfRR03.getValue().toString();
        rows[3]=Double.toString(rrPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(rrPrc);
    }//GEN-LAST:event_redRoseBuyActionPerformed

    private void logoutBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBttnActionPerformed
        int res=JOptionPane.showConfirmDialog(this,"Are you sure, you want to logout?","Warning",JOptionPane.YES_NO_OPTION);
        if(res== JOptionPane.YES_OPTION)
        {
            dispose();
            loginPage login=new loginPage();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logoutBttnActionPerformed

    private void clr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr1ActionPerformed
       
        mixedTulipPrice.setText("");
        mixedTulipImg.setIcon(null);
    }//GEN-LAST:event_clr1ActionPerformed

    private void recombineOrchidBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recombineOrchidBttnActionPerformed
        // TODO add your handling code here:
        myOrchid();
       
    }//GEN-LAST:event_recombineOrchidBttnActionPerformed

    private void mixedOrchidBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixedOrchidBuyActionPerformed
        double mixoPrc= Double.parseDouble(mixedOrchidPrice.getText());
        rows[0]="MxO04";
        rows[1]="Mix Orchid";
        rows[2]="1";
        rows[3]=Double.toString(mixoPrc);
        model.insertRow(model.getRowCount(), rows);
        calcPrice(mixoPrc);
    }//GEN-LAST:event_mixedOrchidBuyActionPerformed

    private void blueTulipBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueTulipBuyActionPerformed
        // TODO add your handling code here:
        double bltPrc= Double.parseDouble(blueTulipPrice.getText())* Double.parseDouble(noOfBlT05.getValue().toString());
        rows[0]=blueTulipID.getText();
        rows[1]=blueTulipLabel.getText();
        rows[2]=noOfBlT05.getValue().toString();
        rows[3]=Double.toString(bltPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(bltPrc);
    }//GEN-LAST:event_blueTulipBuyActionPerformed

    private void BlT05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlT05ActionPerformed
        // TODO add your handling code here:
        blt05=BlT05.isSelected();
        tulipSelected +=1;
        bltPrice= Double.parseDouble(blueTulipPrice.getText());
    }//GEN-LAST:event_BlT05ActionPerformed

    private void WT04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WT04ActionPerformed
        // TODO add your handling code here:
        wt04=WT04.isSelected();
        tulipSelected +=1;
        wtPrice= Double.parseDouble(whiteTulipPrice.getText());
    }//GEN-LAST:event_WT04ActionPerformed

    private void BT03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT03ActionPerformed
        // TODO add your handling code here:
        bt03=BT03.isSelected();
        tulipSelected +=1;
        btPrice= Double.parseDouble(blackTulipPrice.getText());
    }//GEN-LAST:event_BT03ActionPerformed

    private void YT02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YT02ActionPerformed
        // TODO add your handling code here:
        yt02=YT02.isSelected();
        tulipSelected +=1;
        ytPrice= Double.parseDouble(yellowTulipPrice.getText());
    }//GEN-LAST:event_YT02ActionPerformed

    private void RT01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RT01ActionPerformed
        // TODO add your handling code here:
        rt01=RT01.isSelected();
        tulipSelected +=1;
        rtPrice= Double.parseDouble(redTulipPrice.getText());
        System.out.println(rtPrice);
    }//GEN-LAST:event_RT01ActionPerformed

    private void whiteTulipBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteTulipBuyActionPerformed
        // TODO add your handling code here:
        double wtPrc= Double.parseDouble(whiteTulipPrice.getText())* Double.parseDouble(noOfWT04.getValue().toString());
        rows[0]=whiteTulipID.getText();
        rows[1]=whiteTulipLable.getText();
        rows[2]=noOfWT04.getValue().toString();
        rows[3]=Double.toString(wtPrc);
        model.insertRow(model.getRowCount(), rows);
        calcPrice(wtPrc);
    }//GEN-LAST:event_whiteTulipBuyActionPerformed

    private void blackTulipBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackTulipBuyActionPerformed

        double btPrc= Double.parseDouble(blackTulipPrice.getText())* Double.parseDouble(noOfBT03.getValue().toString());
        rows[0]=blackTulipID.getText();
        rows[1]=blackTulipLabel.getText();
        rows[2]=noOfBT03.getValue().toString();
        rows[3]=Double.toString(btPrc);
        model.insertRow(model.getRowCount(), rows);       
        calcPrice(btPrc);
    }//GEN-LAST:event_blackTulipBuyActionPerformed

    private void yellowTulipBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowTulipBuyActionPerformed
        
        double ytPrc= Double.parseDouble(yellowTulipPrice.getText())* Double.parseDouble(noOfYT02.getValue().toString());
        rows[0]=yellowTulipID.getText();
        rows[1]=yellowTulipLabel.getText();
        rows[2]=noOfYT02.getValue().toString();
        rows[3]=Double.toString(ytPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(ytPrc);
    }//GEN-LAST:event_yellowTulipBuyActionPerformed

    private void redTulipBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redTulipBuyActionPerformed

        double rtPrc= Double.parseDouble(redTulipPrice.getText())* Double.parseDouble(noOfRT01.getValue().toString());
        rows[0]=redTulipID.getText();
        rows[1]=redTulipLabel.getText();
        rows[2]=noOfRT01.getValue().toString();
        rows[3]=Double.toString(rtPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(rtPrc);
    }//GEN-LAST:event_redTulipBuyActionPerformed

    private void redOrchidBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redOrchidBuyActionPerformed
        double pphPrc= Double.parseDouble(purpleHibiscusPrice.getText())* Double.parseDouble(noOfPPH04.getValue().toString());
        rows[0]=purpleHibiscusID.getText();
        rows[1]=purpleHibiscusLabel.getText();
        rows[2]=noOfPPH04.getValue().toString();
        rows[3]=Double.toString(pphPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(pphPrc);
    }//GEN-LAST:event_redOrchidBuyActionPerformed

    private void purpleHibiscusBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleHibiscusBuyActionPerformed
        double pphPrc= Double.parseDouble(purpleHibiscusPrice.getText())* Double.parseDouble(noOfPPH04.getValue().toString());
        rows[0]=purpleHibiscusID.getText();
        rows[1]=purpleHibiscusLabel.getText();
        rows[2]=noOfPPH04.getValue().toString();
        rows[3]=Double.toString(pphPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(pphPrc);
    }//GEN-LAST:event_purpleHibiscusBuyActionPerformed

    private void whiteHibiscusBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteHibiscusBuyActionPerformed
        double whPrc= Double.parseDouble(whiteHibiscusPrice.getText())* Double.parseDouble(noOfWH01.getValue().toString());
        rows[0]=whiteHibiscusID.getText();
        rows[1]=whiteHibiscusLabel.getText();
        rows[2]=noOfWH01.getValue().toString();
        rows[3]=Double.toString(whPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(whPrc);
    }//GEN-LAST:event_whiteHibiscusBuyActionPerformed

    private void pinkHibiscusBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkHibiscusBuyActionPerformed
        double phPrc= Double.parseDouble(pinkHibiscusPrice.getText())* Double.parseDouble(noOfPH02.getValue().toString());
        rows[0]=pinkHibiscusID.getText();
        rows[1]=pinkHibiscusLabel.getText();
        rows[2]=noOfPH02.getValue().toString();
        rows[3]=Double.toString(phPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(phPrc);
    }//GEN-LAST:event_pinkHibiscusBuyActionPerformed

    private void yellowHibiscusBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowHibiscusBuyActionPerformed
        double yhPrc= Double.parseDouble(yellowHibiscusPrice.getText())* Double.parseDouble(noOfYH03.getValue().toString());
        rows[0]=yellowHibiscusID.getText();
        rows[1]=yellowHibiscusLabel.getText();
        rows[2]=noOfYH03.getValue().toString();
        rows[3]=Double.toString(yhPrc);
        model.insertRow(model.getRowCount(), rows);        
        calcPrice(yhPrc);
    }//GEN-LAST:event_yellowHibiscusBuyActionPerformed

    private void recombineRoseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recombineRoseBttnActionPerformed
        // TODO add your handling code here:
        myRose();
    }//GEN-LAST:event_recombineRoseBttnActionPerformed

    private void BR01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BR01ActionPerformed
        // TODO add your handling code here:
         br01=BR01.isSelected();
        roseSelected +=1;
        brPrice= Double.parseDouble(blueRosePrice.getText());
    }//GEN-LAST:event_BR01ActionPerformed

    private void WOR05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WOR05ActionPerformed
        // TODO add your handling code here:
        wor05=WOR05.isSelected();
        orchidSelected +=1;
        worPrice= Double.parseDouble(whiteOrchidPrice.getText());
    }//GEN-LAST:event_WOR05ActionPerformed

    private void PH02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PH02ActionPerformed
        // TODO add your handling code here:
          ph02=PH02.isSelected();
        hibiscusSelected +=1;
        phPrice= Double.parseDouble(pinkHibiscusPrice.getText());
    }//GEN-LAST:event_PH02ActionPerformed

    private void YH03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YH03ActionPerformed
        // TODO add your handling code here:
          yh03=YH03.isSelected();
        hibiscusSelected +=1;
        yhPrice= Double.parseDouble(yellowHibiscusPrice.getText());
    }//GEN-LAST:event_YH03ActionPerformed

    private void PPH04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPH04ActionPerformed
        // TODO add your handling code here:
          pph04=PPH04.isSelected();
        hibiscusSelected +=1;
        pphPrice= Double.parseDouble(purpleHibiscusPrice.getText());
    }//GEN-LAST:event_PPH04ActionPerformed

    private void mixedRoseBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixedRoseBuyActionPerformed
        double mixrPrc= Double.parseDouble(mixedRosePrice.getText());
        rows[0]="MxR02";
        rows[1]="Mix Rose";
        rows[2]="1";
        rows[3]=Double.toString(mixrPrc);
        model.insertRow(model.getRowCount(), rows);
        calcPrice(mixrPrc);
    }//GEN-LAST:event_mixedRoseBuyActionPerformed

    private void redHibiscusBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redHibiscusBuyActionPerformed
        double rhPrc= Double.parseDouble(redHibiscusPrice.getText())* Double.parseDouble(noOfRH05.getValue().toString());
        rows[0]=redHibiscusID.getText();
        rows[1]=redHibiscusLabel.getText();
        rows[2]=noOfRH05.getValue().toString();
        rows[3]=Double.toString(rhPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(rhPrc);
    }//GEN-LAST:event_redHibiscusBuyActionPerformed

    private void whiteOrchidBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteOrchidBuyActionPerformed
        double worPrc= Double.parseDouble(whiteOrchidPrice.getText())* Double.parseDouble(noOfWOR05.getValue().toString());
        rows[0]=whiteOrchidID.getText();
        rows[1]=whiteOrchidLabel.getText();
        rows[2]=noOfWOR05.getValue().toString();
        rows[3]=Double.toString(worPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(worPrc);
    }//GEN-LAST:event_whiteOrchidBuyActionPerformed

    private void blueOrchidBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueOrchidBuyActionPerformed
        double borPrc= Double.parseDouble(blueOrchidPrice.getText())* Double.parseDouble(noOfBOR01.getValue().toString());
        rows[0]=blueOrchidID.getText();
        rows[1]=blueOrchidLabel.getText();
        rows[2]=noOfBOR01.getValue().toString();
        rows[3]=Double.toString(borPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(borPrc);
    }//GEN-LAST:event_blueOrchidBuyActionPerformed

    private void purpleOrchidBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleOrchidBuyActionPerformed
        double porPrc= Double.parseDouble(prupleOrchidPrice.getText())* Double.parseDouble(noOfPOR02.getValue().toString());
        rows[0]=purpleOrchidID.getText();
        rows[1]=purpleOrchidLabel.getText();
        rows[2]=noOfPOR02.getValue().toString();
        rows[3]=Double.toString(porPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(porPrc);
    }//GEN-LAST:event_purpleOrchidBuyActionPerformed

    private void yellowOrchidBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowOrchidBuyActionPerformed
        double yorPrc= Double.parseDouble(yellowOrchidPrice.getText())* Double.parseDouble(noOfYOR03.getValue().toString());
        rows[0]=yellowOrchidID.getText();
        rows[1]=yellowOrchidLabel.getText();
        rows[2]=noOfYOR03.getValue().toString();
        rows[3]=Double.toString(yorPrc);
        model.insertRow(model.getRowCount(), rows);         
        calcPrice(yorPrc);
    }//GEN-LAST:event_yellowOrchidBuyActionPerformed

    private void recombineHibiscusBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recombineHibiscusBttnActionPerformed
        // TODO add your handling code here:
        myHibiscus();
    }//GEN-LAST:event_recombineHibiscusBttnActionPerformed

    private void WH01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WH01ActionPerformed
        // TODO add your handling code here:
        wh01=WH01.isSelected();
        hibiscusSelected +=1;
        whPrice= Double.parseDouble(whiteHibiscusPrice.getText());
    }//GEN-LAST:event_WH01ActionPerformed

    private void BOR01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOR01ActionPerformed
        // TODO add your handling code here:
        bor01=BOR01.isSelected();
        orchidSelected +=1;
        borPrice= Double.parseDouble(blueOrchidPrice.getText());
    }//GEN-LAST:event_BOR01ActionPerformed

    private void POR02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POR02ActionPerformed
        // TODO add your handling code here:
        por02=POR02.isSelected();
        orchidSelected +=1;
        porPrice= Double.parseDouble(prupleOrchidPrice.getText());
    }//GEN-LAST:event_POR02ActionPerformed

    private void YOR03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YOR03ActionPerformed
        // TODO add your handling code here:
        yor03=YOR03.isSelected();
        orchidSelected +=1;
        yorPrice= Double.parseDouble(yellowOrchidPrice.getText());
    }//GEN-LAST:event_YOR03ActionPerformed

    private void ROR04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROR04ActionPerformed
        ror04=ROR04.isSelected();
        orchidSelected +=1;
        rorPrice= Double.parseDouble(redOrchidPrice.getText());
    }//GEN-LAST:event_ROR04ActionPerformed

    private void mixedHibiscusBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixedHibiscusBuyActionPerformed
        double mixhPrc= Double.parseDouble(mixedHibiscusPrice.getText());
        rows[0]="MxH02";
        rows[1]="Mix Hibiscus";
        rows[2]="1";
        rows[3]=Double.toString(mixhPrc);
        model.insertRow(model.getRowCount(), rows);
        calcPrice(mixhPrc);
    }//GEN-LAST:event_mixedHibiscusBuyActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        if(totalPrice==0){
            JOptionPane.showMessageDialog(null,"Cart is empty!!! Buy something first.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(address.getText().equals("")){
            JOptionPane.showMessageDialog(null,"You have not entered your confirmation Address!!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(currPhone.getText().equals("")){
            JOptionPane.showMessageDialog(null,"You have not entered your confirmation Phone number!!!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int res=JOptionPane.showConfirmDialog(this,"Are you sure, you want to parchase these item(s) of cart?","Warning",JOptionPane.YES_NO_OPTION);
            if(res== JOptionPane.YES_OPTION)
            {
                DefaultTableModel model1= (DefaultTableModel) table.getModel();
                String a = address.getText();
                String m = currPhone.getText();
                String p= finalPrice.getText();
                int index[]= table.getSelectedRows();
                dispose();
                Reciept rcpt=new Reciept(current_user,a,m,p,discount);
                DefaultTableModel model2= (DefaultTableModel) rcpt.table2.getModel();
                Object[] row=new Object[4];
                int n=model.getRowCount();

                for(int i=0;i<n;i++){
                    row[0]=model1.getValueAt(i, 0);
                    row[1]=model1.getValueAt(i, 1);
                    row[2]=model1.getValueAt(i, 2);
                    row[3]=model1.getValueAt(i, 3);
                    model2.addRow(row);
                }
                rcpt.setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void currPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currPhoneActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed

        DefaultTableModel model1= (DefaultTableModel) table.getModel();
        int index[]= table.getSelectedRows();
        Object[] row=new Object[4];
        for(int i=0;i<index.length;i++){
            row[0]=model1.getValueAt(i, 0);
            row[1]=model1.getValueAt(i, 1);
            row[2]=model1.getValueAt(i, 2);
            row[3]=model1.getValueAt(i, 3);

            dltprc = Double.parseDouble(model1.getValueAt(index[i], 3).toString());
            totalPrice = totalPrice-dltprc;
            model1.removeRow(index[i]);
        }
        String fp=Double.toString(totalPrice);
        finalPrice.setText(fp);
        if (discount!=0.00){
            double disPrc= totalPrice- totalPrice*.10;
            discnt.setText("You have Got 10% discount on your first Buy. Total price with discount is: Tk "+disPrc);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void clr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr2ActionPerformed
        // TODO add your handling code here:
         mixedRosePrice.setText("");
        mixedRoseImg.setIcon(null);
    }//GEN-LAST:event_clr2ActionPerformed

    private void clr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr3ActionPerformed
        // TODO add your handling code here:
         mixedHibiscusPrice.setText("");
        mixedHibiscusImg.setIcon(null);
    }//GEN-LAST:event_clr3ActionPerformed

    private void clr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr5ActionPerformed
        // TODO add your handling code here:
         mixedOrchidPrice.setText("");
        mixedOrchidImg.setIcon(null);
    }//GEN-LAST:event_clr5ActionPerformed

    private void aboutBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBttnActionPerformed
        // TODO add your handling code here:
        AboutPage about=new AboutPage();
        about.setVisible(true);
    }//GEN-LAST:event_aboutBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BOR01;
    private javax.swing.JRadioButton BR01;
    private javax.swing.JRadioButton BT03;
    private javax.swing.JRadioButton BlT05;
    private javax.swing.JRadioButton PH02;
    private javax.swing.JRadioButton POR02;
    private javax.swing.JRadioButton PPH04;
    private javax.swing.JRadioButton PR02;
    private javax.swing.JRadioButton RH05;
    private javax.swing.JRadioButton ROR04;
    private javax.swing.JRadioButton RR03;
    private javax.swing.JRadioButton RT01;
    private javax.swing.JLabel RedTulipDscrptn;
    private javax.swing.JRadioButton WH01;
    private javax.swing.JRadioButton WOR05;
    private javax.swing.JRadioButton WR05;
    private javax.swing.JRadioButton WT04;
    private javax.swing.JRadioButton YH03;
    private javax.swing.JRadioButton YOR03;
    private javax.swing.JRadioButton YR04;
    private javax.swing.JRadioButton YT02;
    private javax.swing.JButton aboutBttn;
    private javax.swing.JTextField address;
    private javax.swing.JButton blackTulipBuy;
    private javax.swing.JLabel blackTulipDscrptn;
    private javax.swing.JLabel blackTulipID;
    private javax.swing.JLabel blackTulipImg;
    private javax.swing.JLabel blackTulipLabel;
    private javax.swing.JLabel blackTulipPrice;
    private javax.swing.JButton blueOrchidBuy;
    private javax.swing.JLabel blueOrchidDscrptn;
    private javax.swing.JLabel blueOrchidID;
    private javax.swing.JLabel blueOrchidImg;
    private javax.swing.JLabel blueOrchidLabel;
    private javax.swing.JLabel blueOrchidPrice;
    private javax.swing.JButton blueRoseBuy;
    private javax.swing.JLabel blueRoseDscrptn;
    private javax.swing.JLabel blueRoseID;
    private javax.swing.JLabel blueRoseImg;
    private javax.swing.JLabel blueRoseLabel;
    private javax.swing.JLabel blueRosePrice;
    private javax.swing.JButton blueTulipBuy;
    private javax.swing.JLabel blueTulipDscrptn;
    private javax.swing.JLabel blueTulipID;
    private javax.swing.JLabel blueTulipImg;
    private javax.swing.JLabel blueTulipLabel;
    private javax.swing.JLabel blueTulipPrice;
    private javax.swing.JButton clr1;
    private javax.swing.JButton clr2;
    private javax.swing.JButton clr3;
    private javax.swing.JButton clr5;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel congo;
    private javax.swing.JTextField currPhone;
    private javax.swing.JLabel discnt;
    private javax.swing.JTextField finalPrice;
    private javax.swing.JLabel headingBar1;
    private javax.swing.JLabel headingBar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logoutBttn;
    private javax.swing.JPanel mainBody;
    private javax.swing.JButton mixedHibiscusBuy;
    private javax.swing.JLabel mixedHibiscusDescription;
    private javax.swing.JLabel mixedHibiscusImg;
    private javax.swing.JLabel mixedHibiscusPrice;
    private javax.swing.JButton mixedOrchidBuy;
    private javax.swing.JLabel mixedOrchidDescription;
    private javax.swing.JLabel mixedOrchidImg;
    private javax.swing.JLabel mixedOrchidPrice;
    private javax.swing.JButton mixedRoseBuy;
    private javax.swing.JLabel mixedRoseDescription;
    private javax.swing.JLabel mixedRoseImg;
    private javax.swing.JLabel mixedRosePrice;
    private javax.swing.JButton mixedTulipBuy1;
    private javax.swing.JLabel mixedTulipImg;
    private javax.swing.JLabel mixedTulipPrice;
    private javax.swing.JSpinner noOfBOR01;
    private javax.swing.JSpinner noOfBR01;
    private javax.swing.JSpinner noOfBT03;
    private javax.swing.JSpinner noOfBlT05;
    private javax.swing.JSpinner noOfPH02;
    private javax.swing.JSpinner noOfPOR02;
    private javax.swing.JSpinner noOfPPH04;
    private javax.swing.JSpinner noOfPR02;
    private javax.swing.JSpinner noOfRH05;
    private javax.swing.JSpinner noOfROR04;
    private javax.swing.JSpinner noOfRR03;
    private javax.swing.JSpinner noOfRT01;
    private javax.swing.JSpinner noOfWH01;
    private javax.swing.JSpinner noOfWOR05;
    private javax.swing.JSpinner noOfWR05;
    private javax.swing.JSpinner noOfWT04;
    private javax.swing.JSpinner noOfYH03;
    private javax.swing.JSpinner noOfYOR03;
    private javax.swing.JSpinner noOfYR04;
    private javax.swing.JSpinner noOfYT02;
    private javax.swing.JButton pinkHibiscusBuy;
    private javax.swing.JLabel pinkHibiscusDscrptn;
    private javax.swing.JLabel pinkHibiscusID;
    private javax.swing.JLabel pinkHibiscusImg;
    private javax.swing.JLabel pinkHibiscusLabel;
    private javax.swing.JLabel pinkHibiscusPrice;
    private javax.swing.JButton pinkRoseBuy;
    private javax.swing.JLabel pinkRoseDscrptn;
    private javax.swing.JLabel pinkRoseID;
    private javax.swing.JLabel pinkRoseImg;
    private javax.swing.JLabel pinkRoseLabel;
    private javax.swing.JLabel pinkRosePrice;
    private javax.swing.JLabel prupleOrchidPrice;
    private javax.swing.JButton purpleHibiscusBuy;
    private javax.swing.JLabel purpleHibiscusDscrptn;
    private javax.swing.JLabel purpleHibiscusID;
    private javax.swing.JLabel purpleHibiscusImg;
    private javax.swing.JLabel purpleHibiscusLabel;
    private javax.swing.JLabel purpleHibiscusPrice;
    private javax.swing.JButton purpleOrchidBuy;
    private javax.swing.JLabel purpleOrchidDscrptn;
    private javax.swing.JLabel purpleOrchidID;
    private javax.swing.JLabel purpleOrchidImg;
    private javax.swing.JLabel purpleOrchidLabel;
    private javax.swing.JButton recombineHibiscusBttn;
    private javax.swing.JButton recombineOrchidBttn;
    private javax.swing.JButton recombineRoseBttn;
    private javax.swing.JButton recombineTulipBttn;
    private javax.swing.JButton redHibiscusBuy;
    private javax.swing.JLabel redHibiscusDscrptn;
    private javax.swing.JLabel redHibiscusID;
    private javax.swing.JLabel redHibiscusImg;
    private javax.swing.JLabel redHibiscusLabel;
    private javax.swing.JLabel redHibiscusPrice;
    private javax.swing.JButton redOrchidBuy;
    private javax.swing.JLabel redOrchidDscrptn;
    private javax.swing.JLabel redOrchidID;
    private javax.swing.JLabel redOrchidImg;
    private javax.swing.JLabel redOrchidLabel;
    private javax.swing.JLabel redOrchidPrice;
    private javax.swing.JButton redRoseBuy;
    private javax.swing.JLabel redRoseDscrptn;
    private javax.swing.JLabel redRoseID;
    private javax.swing.JLabel redRoseImg;
    private javax.swing.JLabel redRoseLabel;
    private javax.swing.JLabel redRosePrice;
    private javax.swing.JButton redTulipBuy;
    private javax.swing.JLabel redTulipID;
    private javax.swing.JLabel redTulipImg;
    private javax.swing.JLabel redTulipLabel;
    private javax.swing.JLabel redTulipPrice;
    private javax.swing.JButton remove;
    private javax.swing.JScrollPane scrlPane1;
    private javax.swing.JScrollPane scrlPane3;
    private javax.swing.JTable table;
    private javax.swing.JLabel tulipLabel;
    private javax.swing.JLabel tulipLabel1;
    private javax.swing.JLabel tulipLabel2;
    private javax.swing.JLabel tulipLabel3;
    private javax.swing.JButton whiteHibiscusBuy;
    private javax.swing.JLabel whiteHibiscusDscrptn;
    private javax.swing.JLabel whiteHibiscusID;
    private javax.swing.JLabel whiteHibiscusImg;
    private javax.swing.JLabel whiteHibiscusImg1;
    private javax.swing.JLabel whiteHibiscusLabel;
    private javax.swing.JLabel whiteHibiscusPrice;
    private javax.swing.JButton whiteOrchidBuy;
    private javax.swing.JLabel whiteOrchidDscrptn;
    private javax.swing.JLabel whiteOrchidID;
    private javax.swing.JLabel whiteOrchidImg;
    private javax.swing.JLabel whiteOrchidLabel;
    private javax.swing.JLabel whiteOrchidPrice;
    private javax.swing.JButton whiteRoseBuy;
    private javax.swing.JLabel whiteRoseDscrptn;
    private javax.swing.JLabel whiteRoseID;
    private javax.swing.JLabel whiteRoseImg;
    private javax.swing.JLabel whiteRoseLabel;
    private javax.swing.JLabel whiteRosePrice;
    private javax.swing.JButton whiteTulipBuy;
    private javax.swing.JLabel whiteTulipDscrptn;
    private javax.swing.JLabel whiteTulipID;
    private javax.swing.JLabel whiteTulipImg;
    private javax.swing.JLabel whiteTulipLable;
    private javax.swing.JLabel whiteTulipPrice;
    private javax.swing.JButton yellowHibiscusBuy;
    private javax.swing.JLabel yellowHibiscusDscrptn;
    private javax.swing.JLabel yellowHibiscusID;
    private javax.swing.JLabel yellowHibiscusLabel;
    private javax.swing.JLabel yellowHibiscusPrice;
    private javax.swing.JButton yellowOrchidBuy;
    private javax.swing.JLabel yellowOrchidDscrptn;
    private javax.swing.JLabel yellowOrchidID;
    private javax.swing.JLabel yellowOrchidImg;
    private javax.swing.JLabel yellowOrchidLabel;
    private javax.swing.JLabel yellowOrchidPrice;
    private javax.swing.JButton yellowRoseBuy;
    private javax.swing.JLabel yellowRoseDscrptn;
    private javax.swing.JLabel yellowRoseID;
    private javax.swing.JLabel yellowRoseImg;
    private javax.swing.JLabel yellowRoseLabel;
    private javax.swing.JLabel yellowRosePrice;
    private javax.swing.JButton yellowTulipBuy;
    private javax.swing.JLabel yellowTulipDscrptn;
    private javax.swing.JLabel yellowTulipID;
    private javax.swing.JLabel yellowTulipImg;
    private javax.swing.JLabel yellowTulipLabel;
    private javax.swing.JLabel yellowTulipPrice;
    // End of variables declaration//GEN-END:variables
}
