// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendixsso.actions;

import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;

public class GetHttpRequestParameter extends CustomJavaAction<java.lang.String>
{
	/** @deprecated use HttpRequest.getMendixObject() instead. */
	@java.lang.Deprecated(forRemoval = true)
	private final IMendixObject __HttpRequest;
	private final system.proxies.HttpRequest HttpRequest;
	private final java.lang.String ParameterName;

	public GetHttpRequestParameter(
		IContext context,
		IMendixObject _httpRequest,
		java.lang.String _parameterName
	)
	{
		super(context);
		this.__HttpRequest = _httpRequest;
		this.HttpRequest = _httpRequest == null ? null : system.proxies.HttpRequest.initialize(getContext(), _httpRequest);
		this.ParameterName = _parameterName;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		if(Optional.ofNullable(this.HttpRequest).isEmpty()){
			throw new MendixRuntimeException("HttpRequest parameter can not be null");
		}
		final Map<String,String> queryParamMap = parseQueryString(HttpRequest.getUri());
	  final String param = queryParamMap.get(ParameterName);
		return param;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetHttpRequestParameter";
	}

	// BEGIN EXTRA CODE
	private static final String ENCODING = "utf-8";
	private static Map<String, String> parseQueryString(final String uri) throws UnsupportedEncodingException {
		int index = uri.indexOf('?');
		if (index == -1) {
			return new HashMap<>();
		}
		String queryString = uri.substring(index + 1);
		StringTokenizer st = new StringTokenizer(queryString, "&");
		Map<String, String> result = new HashMap<>();
		while (st.hasMoreTokens()) {
			String[] kv = st.nextToken().split("=");
			result.put(URLDecoder.decode(kv[0], ENCODING), kv.length > 1 ? URLDecoder.decode(kv[1], ENCODING) : null);
		}
		return result;
	}
	// END EXTRA CODE
}
