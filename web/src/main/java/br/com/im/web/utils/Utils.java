package br.com.im.web.utils;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class Utils {

	public static String formatToJSON(Object itens, HttpServletResponse response) {

		String estoqueStr = new Gson().toJson(itens);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		return estoqueStr;
	}

}
