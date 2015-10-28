
package model;


public class Players {
    private int playerID;
    private String firstName;
    private String lastName;
    private int playerNumber;
    private String playerPosition;

    public Players() {
        this.playerID = 0;
        this.firstName = "";
        this.lastName = "";
        this.playerNumber = 0;
        this.playerPosition = "";
    }
    
    public Players(int playerID, String firstName, String lastName, int playerNumber, String playerPosition) {
        this.playerID = playerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    @Override
    public String toString() {
        return "Players{" + "playerID=" + playerID + ", firstName=" + firstName + ", lastName=" + lastName + ", playerNumber=" + playerNumber + ", playerPosition=" + playerPosition + '}';
    }

}