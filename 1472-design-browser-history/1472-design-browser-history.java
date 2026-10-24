class BrowserHistory {
    Deque<String> forwHistory;
    Deque<String> currHistory;

    public BrowserHistory(String homepage) {
       forwHistory = new ArrayDeque<>();  
       currHistory = new ArrayDeque<>(); 
       // apne current me homepage to krna hi h initially 
       currHistory.push(homepage);
    }
    
    public void visit(String url) {
       currHistory.push(url);
       while(!forwHistory.isEmpty()){
          forwHistory.pop();
       } 
    }
    
    public String back(int steps) {
        while(steps>0){
            if(currHistory.size() >1){
            String backTab = currHistory.pop();
            forwHistory.push(backTab);
            }else{
                break;
            }
            steps--;
        }
        return currHistory.peek();
    }
    
    public String forward(int steps) {
        while(steps >0){
            if(forwHistory.size() > 0){
                String forwTab = forwHistory.pop();
                currHistory.push(forwTab);
                
            }else{
                break;
            }
            steps--;
        }
        return currHistory.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */