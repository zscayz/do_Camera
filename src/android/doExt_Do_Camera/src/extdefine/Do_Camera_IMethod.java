package extdefine;

import core.helper.jsonparse.DoJsonNode;
import core.interfaces.DoIScriptEngine;

/**
 * 声明自定义扩展组件方法
 */
public interface Do_Camera_IMethod {
	
	void capture(DoJsonNode _dictParas,DoIScriptEngine _scriptEngine, String _callbackFuncName) throws Exception ;
}
