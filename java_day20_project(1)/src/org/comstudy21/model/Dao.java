package org.comstudy21.model;

import java.io.*;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {
	private String pathname = "src/org/comstudy21/resource/students.json";
	private FileReader reader;
	private FileWriter writer;

	private JSONObject getJsonObject() {
		File dataFile = new File(pathname);

		try {
			reader = new FileReader(dataFile);

			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Vector<Vector> selectAll() {
		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("처리 할 데이터가 없습니다!");
			return null;
		}

		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");

		Vector<Vector> vector = new Vector<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			Vector v = new Vector<>();
			v.add(obj.get("no"));
			v.add(obj.get("name"));
			v.add(obj.get("email"));
			v.add(obj.get("phone"));
			vector.add(v);
		}

		return vector;
	}

	public void insert(Member dto) {
		// 리스트를 가져온다 -> 리스트에 dto의 값을 추가한다. -> 다시 저장한다.
		File file = new File(pathname);
		if (!file.exists()) {
			JSONObject newObj = new JSONObject();
			newObj.put("no", 1);
			newObj.put("name", dto.getName());
			newObj.put("email", dto.getEmail());
			newObj.put("phone", dto.getPhone());
			JSONArray newArray = new JSONArray();
			newArray.put(newObj);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", 2);
			jsonObject.put("studentArr", newArray);

			try {
				writer = new FileWriter(file);
				writer.write(jsonObject.toString(2));
				// System.out.println("데이터 저장 성공!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (reader != null)
						reader.close();
					if (writer != null)
						writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return;
		}

		JSONObject jsonObject = getJsonObject();
		if (jsonObject == null) {
			System.out.println("처리 할 데이터가 없습니다!");
			return;
		}

		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
		JSONObject obj = new JSONObject();
		int seq = jsonObject.getInt("seq");
		obj.put("no", seq++);
		obj.put("name", dto.getName());
		obj.put("email", dto.getEmail());
		obj.put("phone", dto.getPhone());
		jsonArray.put(obj);

		JSONObject newObj = new JSONObject();
		newObj.put("studentArr", jsonArray);
		newObj.put("seq", seq);

		try {
			writer = new FileWriter(file);
			writer.write(newObj.toString(2));
			 System.out.println("데이터 저장 성공!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Dao dao = new Dao();
//		dao.insert(new Member(0, "", "", ""));
	}

	// public static void main(String[] args) {
	// Dao dao = new Dao();
	// Vector<Vector> vector = dao.selectAll();
	// System.out.println(vector);
	// }
}
