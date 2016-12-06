package jp.ac.uryukyu.ie.e165706;


import java.util.List;




class Player {

        private int player_x;
        private int player_y;
        private int map_x;
        private int map_y;
        private List<String> take;

        Player(String like, String h, List<String> rise){

            this.take = rise;
            String[] p = like.split("\\s+",0);
            for(int i = 0; i<2; i++){
                if (i == 0){
                    String q = p[i];
                    this.player_x = Integer.parseInt(q);
                }
                if (i ==1){
                    String w = p[i];
                    this.player_y = Integer.parseInt(w);
                }
            }

            String[] me = h.split("\\s+",0);
            for (int j = 0; j<2; j++){
                if (j == 0){
                    String e  =me[j];
                    this.map_x = Integer.parseInt(e);
                }
                if(j == 1){
                    String qu = me[j];
                    this.map_y = Integer.parseInt(qu);
                }
            }

        }
        void under_go(int player_x, int player_y) {
            String roal = take.get(player_y + 1).substring(player_x, player_x + 1);
            if (roal == " "){
                this.player_y += 1;
            }
        }




        String player_point(int player_x, int player_y, List<String> rise){
            String loid = take.get(player_y);
            String far = loid.substring(player_x, player_x + 1);
            return far;
        }
        int getPlayer_x(){
            return player_x;
        }
        int getPlayer_y() { return player_y; }
        int getMap_x() {return map_x;}
        int getMap_y() {return map_y;}



    }

