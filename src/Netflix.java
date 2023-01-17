public class Netflix {
    private String ID;

    public ArrayLIst <Movie> getMOVIES() {
        return MOVIES;
    }

    public void setMOVIES(ArrayLIst <Movie> MOVIES) {
        this.MOVIES = MOVIES;
    }

    private ArrayLIst <Movie> MOVIES = new ArrayList<>();//dari database

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList <Customer> getCUSTOMER() {
        return CUSTOMER;
    }

    public void setCUSTOMER(ArrayList <Customer> CUSTOMER) {
        this.CUSTOMER = CUSTOMER;
    }

    private ArrayList <Customer> CUSTOMER = new ArrayList<>();//dari database
    private Boolean islogin;

        public Netflix(){
            if(islogin){
                Customer customer = new Customer();
                customer.ShowProfile(CUSTOMER, "ary001");
                Movie movie = new Movie();
                movie.ShowAllMovie(MOVIES);
            }
        }
        public int GetRating(String movieid){
            for(int index=0;index<MOVIES.size();index++){
                if(movieid.equals(MOVIES.get)(index).getid())){
                    return(int)long.parselong(String.valueOf(MOVIES.get)(index).getCustomerMovie().stream().count()));
                }
            }
            return0;
        }
    }