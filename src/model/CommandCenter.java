package model;

public class CommandCenter {

	private static Building[] building;
    private static Queue<Person> personQueue;
    private static PriorityQueue<Person> priorityQueue;
    private static Stack<Person> personStack;
	
	
	public CommandCenter() {
		
		personQueue = new Queue<>();
		personStack = new Stack<>();
		

		
	}
	
	public Building[] createBuilding(int num) {
		return building = new Building[num];		
	}
	
	public void addBuilding(String[]input, int pos) {
		building[pos] = new Building(input[0].charAt(0), Integer.parseInt(input[2]), Integer.parseInt(input[3]));
	}
	
	public void addPerson(String[] person) {
		Person p = new Person(person[0], Integer.parseInt(person[1]), Integer.parseInt(person[2]));
		fillPersonQueue(p);
		
	}	


	public void fillPersonQueue(Person p) {
		personQueue.enqueue(p);
	}
	
	public void createPriorityQueue(int num) throws Exception {
		priorityQueue = new PriorityQueue<>(num, (o1, o2) -> o1.getOffice() - o2.getOffice());
		fillPriorityQueue(num);
	}
	
	public void fillPriorityQueue(int count) throws Exception {
		for(int i =0;i< count;i++) {
			priorityQueue.offer(personQueue.dequeue());
		}		
	}	

	public void fillPersonStack(int count) throws Exception {
		for (int i = 0; i < count; i++) {
			personStack.push(priorityQueue.poll());
		}		
	}
	
	public String assignOffice(int count, int id) {
		String message = "";
		System.out.println("Movimientos edificio "+building[id].getId()+"\n");
		for (int i = 0; i <count; i++) {
			if (0 < personStack.top().getOffice() && personStack.top().getOffice() <= building[id].getOffices()) {
				if (building[id].getList().search(personStack.top().getOffice()) == null) {
					try {
						building[id].getList().insert(personStack.top().getOffice(), personStack.top());
						message+=(personStack.top().getName() + " se mueve a la oficina: " + personStack.top().getOffice()+"\n");
					} catch (Exception e) {
						message+=(personStack.top().getName() + " no puede ser incluido en las oficinas del edificio\n");
					}
				} else {message+=(personStack.top().getName() + " no puede ser incluido en las oficinas del edificio\n");}									

			} else {message+=(personStack.top().getName() + " no puede ser incluido en una oficina que no existe\n");}	

			personStack.pop();

		}
		return message;


	}
	
	public String askOffice(int index, int office) {
		String message="";
		if (index != -1) {
			if (office > 0 && office <= building[index].getOffices()) {
				Person p = building[index].getList().search(office);
				message = (p == null) ? "La oficina esta vacia" : "En la oficina esta " + p.getName();
			} else {
				message+=("La oficina no existe");
			}
		} else {
			message+=("La oficina no existe");
		}
		return message;
	}
	
	public int validateBuilding(char in) {
		for (int i = 0; i < building.length; i++) {
			if (building[i].getId() == in) {
				return i;
			}
		}
		return -1;
	}

	
}
