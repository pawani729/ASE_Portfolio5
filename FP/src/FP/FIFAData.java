package FP;

public class FIFAData implements Comparable<FIFAData> {
  private int position;
  private String Name;
  private String Club;
  private int Crossing;
  private int Finishing;
  private int HeadingAccuracy;
  private int Volleys;
  private int Dribbling;
  private int Curve;
  private int BallControl;
  private int Acceleration;
  private int Balance;
  private int ShotPower;
  private int Jumping;
  private int Stamina;
  private int Strength;
  private int LongShots;
  private int Positioning;
  private int Vision;
  private int Marking;
  
  public FIFAData(int position,String Name, String Club, int Crossing, int Finishing, int HeadingAccuracy,
      int Volleys, int Dribbling, int Curve, int BallControl,int Acceleration, int Balance, int ShotPower, int Jumping,
      int Stamina, int Strength, int LongShots, int Positioning, int Vision, int Marking) {
    this.position = position;
    this.Name = Name;
    this.Club = Club;
    this.Crossing = Crossing;
    this.Finishing = Finishing;
    this.HeadingAccuracy = HeadingAccuracy;
    this.Volleys = Volleys;
    this.Dribbling = Dribbling;
    this.Curve = Curve;
    this.BallControl = BallControl;
    this.Acceleration = Acceleration;
    this.Balance = Balance;
    this.ShotPower = ShotPower;
    this.Jumping = Jumping;
    this.Stamina = Stamina;
    this.Strength = Strength;
    this.LongShots = LongShots;
    this.Positioning = Positioning;
    this.Vision = Vision;
    this.Marking = Marking;
  }

  public String toString() {
    return String.format("%-3d%-20s%-20s%10d%10d%10d%10d%10d%10d%10d%10d%10d%10d%10d", position, Name, Club, Crossing, Finishing,
        Volleys, BallControl, Acceleration, Balance, Stamina, Strength, Positioning, Vision, Marking);
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getClub() {
    return Club;
  }

  public void setClub(String Club) {
    this.Club = Club;
  }

  public int getCrossing() {
    return Crossing;
  }

  public void setCrossing(int Crossing) {
    this.Crossing = Crossing;
  }

  public int getFinishing() {
    return Finishing;
  }

  public void setFinishing(int Finishing) {
    this.Finishing = Finishing;
  }

  public int getHeadingAccuracy() {
    return HeadingAccuracy;
  }

  public void setHeadingAccuracy(int HeadingAccuracy) {
    this.HeadingAccuracy = HeadingAccuracy;
  }

  public int getVolleys() {
    return Volleys;
  }

  public void setVolleys(int Volleys) {
    this.Volleys = Volleys;
  }

  public int getDribbling() {
    return Dribbling;
  }

  public void setDribbling(int Dribbling) {
    this.Dribbling = Dribbling;
  }

  public int getCurve() {
    return Curve;
  }

  public void setCurve(int Curve) {
    this.Curve = Curve;
  }

  public int getBallControl() {
    return BallControl;
  }

  public void setBallControl(int BallControl) {
    this.BallControl = BallControl;
  }

  public int getAcceleration() {
    return Acceleration;
  }

  public void setAcceleration(int Acceleration) {
    this.Acceleration = Acceleration;
  }

  public int getBalance() {
    return Balance;
  }

  public void setBalance(int Balance) {
    this.Balance = Balance;
  }

  public int getShotPower() {
    return ShotPower;
  }

  public void setShotPower(int ShotPower) {
    this.ShotPower = ShotPower;
  }

  public int getJumping() {
    return Jumping;
  }

  public void setJumping(int Jumping) {
    this.Jumping = Jumping;
  }

  public int getStamina() {
    return Stamina;
  }

  public void setStamina(int Stamina) {
    this.Stamina = Stamina;
  }
  
  public int getStrength() {
    return Strength;
  }

  public void setStrength(int Strength) {
    this.Strength = Strength;
  }
  
  public int getLongShots() {
    return LongShots;
  }

  public void setLongShots(int LongShots) {
    this.LongShots = LongShots;
  }
  
  public int getPositioning() {
    return Positioning;
  }

  public void setPositioning(int Positioning) {
    this.Positioning = Positioning;
  }
  
  public int getVision() {
    return Vision;
  }

  public void setVision(int Vision) {
    this.Vision = Vision;
  }
  
  public int getMarking() {
    return Marking;
  }

  public void setMarking(int Marking) {
    this.Marking = Marking;
  }
  
  public int compareTo(FIFAData c) {
    return ((Integer) Crossing).compareTo(c.Crossing);
  }
}
