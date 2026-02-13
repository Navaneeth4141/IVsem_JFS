public class SinkNode{
    public static void main(String args[]){
        int adj_matrix[][] = new int[5][5];
        adj_matrix = new int[][]{{0, 1, 1 ,0 ,1},{0, 0, 0, 1, 0},{0, 0, 0, 1, 1},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}};
        int zero_ctr = 0;
        int sink_ctr = 0;
        for(int i = 0; i < adj_matrix.length; i++){
            for(int j = 0; j < adj_matrix[i].length; j++){
                if(adj_matrix[i][j] == 0){
                    zero_ctr++;
                }
            }
            if(zero_ctr == adj_matrix.length){
                sink_ctr++;
                System.out.println("Sink node : " + (char)(65+i)); // explicit typecasting from int to char 
            }
            zero_ctr = 0;
        }
        System.out.println("Number of sink nodes : " + sink_ctr);
    }
}