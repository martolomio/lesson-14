package com.homework.set;

public class Book implements Comparable<Book>{
	
	private String name;
	private int page;
	private int weiht;
	private int height;
	
	public Book(String name, int page, int weiht, int height) {
		super();
		this.name = name;
		this.page = page;
		this.weiht = weiht;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getWeiht() {
		return weiht;
	}

	public void setWeiht(int weiht) {
		this.weiht = weiht;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", page=" + page + ", weiht=" + weiht + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + page;
		result = prime * result + weiht;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (page != other.page)
			return false;
		if (weiht != other.weiht)
			return false;
		return true;
	}

	

	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(getName());
	}
	
	
	
}
