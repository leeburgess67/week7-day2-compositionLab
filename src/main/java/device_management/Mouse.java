package device_management;

import behaviours.IInput;

public class Mouse implements IInput {
        private String type;
        private int numOfButtons;


        public Mouse(String type, int numOfButtons){
            this.type = type;
            this.numOfButtons = numOfButtons;
        }

        public String getType(){
            return this.type;
        }

        public int getNumOfButtons(){
            return this.numOfButtons;
        }

    public String sendData(){
        return "I'm sending data";
    }

}
