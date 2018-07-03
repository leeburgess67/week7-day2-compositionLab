package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

        private String type;


        public Keyboard(String type){
            this.type = type;
        }

        public String getType(){
            return this.type;
        }

        public String sendData(){
            return "I'm sending data";
        }


}
