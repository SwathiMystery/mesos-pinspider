package com.geekz.anon;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * An utility for JSON formatting.
 *
 * @author swathi on 12/29/14.
 */
public final class JsonFormatter {

	private JsonFormatter() {
	}

	/**
	 * Gson instantiation.
	 */
	public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

	/**
	 * Converts a Raw Type to JSON String.
	 *
	 * @param <T> Type to be converted
	 * @param t   Object of the type
	 * @return JSON representation
	 */
	public static <T> String toJSON(T t) {
		return GSON.toJson(t);
	}

	public static <T> String toJSON(T t, Type type) {
		return GSON.toJson(t, type);
	}

	/**
	 * Converts a JSON String to object representation.
	 *
	 * @param <T>            Type to be converted
	 * @param responseString JSON representation
	 * @param clazz          Target class
	 * @return Object of the target type
	 */
	public static <T> T fromJSON(String responseString, Class<T> clazz) {
		T t = null;
		t = GSON.fromJson(responseString, clazz);
		return t;
	}

	public static <T> T fromJSON(String responseString, Type type) {
		T t = null;
		t = GSON.fromJson(responseString, type);
		return t;
	}

}
