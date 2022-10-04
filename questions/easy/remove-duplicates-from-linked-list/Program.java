class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
		LinkedList pivot=linkedList,solution=linkedList;
		int currentVal=linkedList.value;
		
		while(pivot.next!=null){
			pivot=pivot.next;
			if(currentVal!=pivot.value){
				solution.next=pivot;
				solution=pivot;
				currentVal=pivot.value;
			}
		}
		solution.next=null;
    return linkedList;
  }
}
