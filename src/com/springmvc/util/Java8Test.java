package com.springmvc.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import com.springmvc.model.Person;

public class Java8Test {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("name1", 10));
		list.add(new Person("name2", 11));
		// list.forEach((person)->System.out.println(person.getName()));
		// 过滤器
		list.stream().filter((person) -> person.getAge() > 10).forEach((person) -> System.out.println(person));
		// 启动线程
		new Thread(() -> {
			System.out.println("线程启动");
		}).start();
		// 排序
		String[] players = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner" };
		Arrays.sort(players, (String a, String b) -> a.compareTo(b));// java8比较器
		// 流
		Stream stream = Stream.of(players);
		stream.forEach(element -> System.out.println(element));
		// fastJson
		// JSON personJson = (JSON) JSONObject.toJSON(list.get(0));
		// System.out.println(personJson.toString());
		// Person person = JSONObject.toJavaObject(personJson, Person.class);
		// System.out.println(person);

		Thread threads[] = new Thread[3];
		for (int i = 0; i < 3; i++) {
			TaskLocalRandom task = new TaskLocalRandom();
			threads[i] = new Thread(task);
			threads[i].start();
			if(i==0){
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}else if(i==2){
				threads[i].setPriority(Thread.MAX_PRIORITY);
			}
		}
		UUID uuid = UUID.randomUUID();
		System.out.println(".{"+uuid.toString()+"}");
	}
}
