/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.ei.tools.converter.common.util;

/**
 * This class holds common contents used within mule and synapse converter
 */
public class Constant {

    public static final String MULE_TAG = "mule";
    public static final String MULE_FLOW = "flow";
    public static final String MULE_SUB_FLOW = "sub-flow";
    public static final String MULE_ASYNC_FLOW = "async";

    //Ballerina Packages
    public static final String BLANG_HTTP = "http";
    public static final String BLANG_SYSTEM = "system";
    public static final String BLANG_PKG_MESSAGES = "messages";
    public static final String BLANG_PKG_SQL = "sql";
    public static final String BLANG_PKG_LOGGER = "logger";
    public static final String BLANG_PKG_JSON = "jsons";
    public static final String BLANG_PKG_XML = "xmls";
    public static final String BLANG_PKG_JMS = "jms";

    //Ballerina Annotations
    public static final String BLANG_CONFIG = "configuration";
    public static final String BLANG_RESOURCE_CONFIG = "resourceConfig";
    public static final String BLANG_BASEPATH = "basePath";
    public static final String BLANG_VALUE = "value";
    public static final String BLANG_METHOD_GET = "GET";
    public static final String BLANG_METHOD_POST = "POST";
    public static final String BLANG_PATH = "Path";
    public static final String BLANG_PATHPARAM = "PathParam";
    public static final String BLANG_METHODS = "methods";

    //Ballerina types
    public static final String BLANG_TYPE_MESSAGE = "message";
    public static final String BLANG_TYPE_STRING = "string";
    public static final String BLANG_TYPE_XML = "xml";
    public static final String BLANG_TYPE_JSON = "json";
    public static final String BLANG_TYPE_MAP = "map";
    public static final String BLANG_TYPE_DATATABLE = "datatable";

    //Ballerina key words
    public static final String BLANG_RESOURCE_NAME = "Resource";
    public static final String BLANG_SERVICE_NAME = "Service";
    public static final String BLANG_WORKER_NAME = "Worker";

    //Functions in messages package
    public static final String BLANG_SET_STRING_PAYLOAD = "setStringPayload";
    public static final String BLANG_SET_JSON_PAYLOAD = "setJsonPayload";
    public static final String BLANG_SET_XML_PAYLOAD = "setXmlPayload";
    public static final String BLANG_ADD_HEADER = "addHeader";
    public static final String BLANG_REMOVE_HEADER = "removeHeader";
    public static final String BLANG_GET_HEADER = "getHeader";
    public static final String BLANG_GET_JSON_PAYLOAD = "getJsonPayload";
    public static final String BLANG_GET_XML_PAYLOAD = "getXmlPayload";
    public static final String BLANG_GET_STRING_PAYLOAD = "getStringPayload";
    public static final String BLANG_GET_STRING = "getString";
    public static final String BLANG_PARSE = "parse";

    //Ballerina connector related
    public static final String BLANG_CLIENT_CONNECTOR = "ClientConnector";
    public static final String BLANG_CLIENT_CONNECTOR_GET_ACTION = "get";
    public static final String BLANG_JMS_CONNECTOR_SEND_ACTION = "send";

    //SQL package
    public static final String BLANG_CLIENT_CONNECTOR_SELECT_ACTION = " select";
    public static final String BLANG_SQL_PARAMETER = " Parameter";

    public static final String BLANG_LOG = "log";

    //Functions in ballerina.utils.logger
    public static final String BLANG_DEBUG = "debug";
    public static final String BLANG_ERROR = "error";
    public static final String BLANG_INFO = "info";
    public static final String BLANG_TRACE = "trace";
    public static final String BLANG_WARN = "warn";

    //ballerina variable names - A counter will be used to create dynamic names out of these
    public static final String BLANG_DEFAULT_VAR_MSG = "msg";
    public static final String BLANG_VAR_RESPONSE = "response";
    public static final String BLANG_VAR_CONNECT = "connectRef";
    public static final String BLANG_VAR_CONNECT_PATHPARAM = "pathParamName";
    public static final String BLANG_VAR_XML_PAYLOAD = "xmlPayload";
    public static final String BLANG_VAR_JSON_PAYLOAD = "jsonPayload";
    public static final String BLANG_VAR_STRING_PAYLOAD = "stringPayload";
    public static final String BLANG_VAR_WORKER_MSG = "workerMsg";
    public static final String BLANG_VAR_DEFAULT_WORKER = "default";
    public static final String BLANG_VAR_PROP_MAP = "propertiesMap";
    public static final String BLANG_VAR_DATATABLE = "datatable";
    public static final String BLANG_VAR_QUERY = "query";
    public static final String BLANG_VAR_NAME = "variable";

    public static final String JSON = "json";
    public static final String XML = "xml";
    public static final String STRING = "string";

    //Comments
    public static final String BLANG_COMMENT_JSON = "//TODO : Remove  quotations surrounding the json value!";

    public static final String HTTP_PROTOCOL = "http://";
    public static final String HTTPS_PROTOCOL = "https://";
    public static final String HTTPS = "https";

    public static final String DEFAULT_PORT = "80";
    public static final String DIVIDER = "/";
    public static final String BACKTICK = "`";
    public static final String QUOTE_STR = "\"";
    public static final String EQUALS_SIGN = "==";

    public static final String OPTION = "-z";
}
