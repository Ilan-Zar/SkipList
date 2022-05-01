import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class SkipList <E> implements List<E> {
	
	private int size;
	private int listHeight;
	private Node<E> head;
	private Random random;
	private final double p = 0.5;
	private final int MAX_LEVEL = 20;
	
	private static class Node<E>{
		E item;
		Node<E> forward;
		Node<E> down;
		int distance;
		
		Node(E element){
			this.item = element;
		}
	}
	public SkipList(){
		
		size = 0;
		listHeight = 1;
		head.forward = null;
		head.down = null;
		head.distance = 0;
	}
	
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		
		return false;
	}
	
	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}
		int lvl = randomLevel();
		if(lvl > listHeight) {
			for(int i = lvl; i > listHeight; i--) {
				Node <E> node = new Node <> (null);
				node.down = head;
				node.forward = null;
				node.distance = size + 1;
				head = node;
			}
			listHeight = lvl;
		}
		int pos = 0;
		Node <E> x = head;
		int currentLevel = listHeight;
		Node <E> lastInserted =  null;
		for(int i = listHeight; i < 1; i--) {
			while(pos + x.distance <= index) {
				pos = pos + x.distance;
				x = x.forward;
			}
			if(currentLevel > lvl)
				pos--;
		}
	}
	
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "abc";
	}
	
	private int randomLevel() {
		int lvl = 1;
		while(random.nextDouble() < p && lvl < MAX_LEVEL) 
			lvl += 1;
		return lvl;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}



	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
