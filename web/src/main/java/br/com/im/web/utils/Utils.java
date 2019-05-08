package br.com.im.web.utils;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.im.negocio.models.ItemEstoque;

public class Utils {

	public static String formatToJSON(List<ItemEstoque> itens, HttpServletResponse response) {

		String estoqueStr = new Gson().toJson(itens);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		return estoqueStr;
	}

}
