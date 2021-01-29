# liupeng_bolg

# Liupeng Blog APIs


**简介**:Liupeng Blog APIs


**HOST**:127.0.0.1:8080


**联系人**:


**Version**:1.0


**接口路径**:undefined


[TOC]






# 管理


## 添加一个


**接口地址**:`/blogInformation/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称    | 参数说明         | in    | 是否必须 | 数据类型       | schema |
| ----------- | ---------------- | ----- | -------- | -------------- | ------ |
| id          | 自增ID           | query | false    | integer(int32) |        |
| blogId      | 博客ID           | query | false    | integer(int32) |        |
| information | 博客内容（一行） | query | false    | string         |        |


**响应状态**:


| 状态码 | 说明         | schema          |
| ------ | ------------ | --------------- |
| 200    | OK           | BlogInformation |
| 201    | Created      |                 |
| 401    | Unauthorized |                 |
| 403    | Forbidden    |                 |
| 404    | Not Found    |                 |


**响应参数**:


| 参数名称    | 参数说明         | 类型           | schema         |
| ----------- | ---------------- | -------------- | -------------- |
| blogId      | 博客ID           | integer(int32) | integer(int32) |
| id          | 自增ID           | integer(int32) | integer(int32) |
| information | 博客内容（一行） | string         |                |


**响应示例**:

```javascript
{
	"blogId": 0,
	"id": 0,
	"information": ""
}
```


## 删除一个


**接口地址**:`/blogInformation/delOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称    | 参数说明         | in    | 是否必须 | 数据类型       | schema |
| ----------- | ---------------- | ----- | -------- | -------------- | ------ |
| id          | 自增ID           | query | false    | integer(int32) |        |
| blogId      | 博客ID           | query | false    | integer(int32) |        |
| information | 博客内容（一行） | query | false    | string         |        |


**响应状态**:


| 状态码 | 说明         | schema |
| ------ | ------------ | ------ |
| 200    | OK           |        |
| 201    | Created      |        |
| 401    | Unauthorized |        |
| 403    | Forbidden    |        |
| 404    | Not Found    |        |


**响应参数**:


暂无


**响应示例**:

```javascript

```


## 查询所有


**接口地址**:`/blogInformation/selectAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明         | schema          |
| ------ | ------------ | --------------- |
| 200    | OK           | BlogInformation |
| 201    | Created      |                 |
| 401    | Unauthorized |                 |
| 403    | Forbidden    |                 |
| 404    | Not Found    |                 |


**响应参数**:


| 参数名称    | 参数说明         | 类型           | schema         |
| ----------- | ---------------- | -------------- | -------------- |
| blogId      | 博客ID           | integer(int32) | integer(int32) |
| id          | 自增ID           | integer(int32) | integer(int32) |
| information | 博客内容（一行） | string         |                |


**响应示例**:

```javascript
[
	{
		"blogId": 0,
		"id": 0,
		"information": ""
	}
]
```


## 查询一个


**接口地址**:`/blogInformation/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型       | schema |
| -------- | -------- | ----- | -------- | -------------- | ------ |
| id       | id       | query | false    | integer(int32) |        |


**响应状态**:


| 状态码 | 说明         | schema          |
| ------ | ------------ | --------------- |
| 200    | OK           | BlogInformation |
| 201    | Created      |                 |
| 401    | Unauthorized |                 |
| 403    | Forbidden    |                 |
| 404    | Not Found    |                 |


**响应参数**:


| 参数名称    | 参数说明         | 类型           | schema         |
| ----------- | ---------------- | -------------- | -------------- |
| blogId      | 博客ID           | integer(int32) | integer(int32) |
| id          | 自增ID           | integer(int32) | integer(int32) |
| information | 博客内容（一行） | string         |                |


**响应示例**:

```javascript
{
	"blogId": 0,
	"id": 0,
	"information": ""
}
```


## 更新数据


**接口地址**:`/blogInformation/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称    | 参数说明         | in    | 是否必须 | 数据类型       | schema |
| ----------- | ---------------- | ----- | -------- | -------------- | ------ |
| id          | 自增ID           | query | false    | integer(int32) |        |
| blogId      | 博客ID           | query | false    | integer(int32) |        |
| information | 博客内容（一行） | query | false    | string         |        |


**响应状态**:


| 状态码 | 说明         | schema          |
| ------ | ------------ | --------------- |
| 200    | OK           | BlogInformation |
| 201    | Created      |                 |
| 401    | Unauthorized |                 |
| 403    | Forbidden    |                 |
| 404    | Not Found    |                 |


**响应参数**:


| 参数名称    | 参数说明         | 类型           | schema         |
| ----------- | ---------------- | -------------- | -------------- |
| blogId      | 博客ID           | integer(int32) | integer(int32) |
| id          | 自增ID           | integer(int32) | integer(int32) |
| information | 博客内容（一行） | string         |                |


**响应示例**:

```javascript
{
	"blogId": 0,
	"id": 0,
	"information": ""
}
```


## 添加一个


**接口地址**:`/bolgAbstruct/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称  | 参数说明  | in    | 是否必须 | 数据类型          | schema |
| --------- | --------- | ----- | -------- | ----------------- | ------ |
| id        | 自增ID    | query | false    | integer(int32)    |        |
| blogName  | 博客名称  | query | false    | string            |        |
| blogType1 | 博客类型1 | query | false    | integer(int32)    |        |
| blogType2 | 博客类型2 | query | false    | integer(int32)    |        |
| blogType3 | 博客类型3 | query | false    | integer(int32)    |        |
| blogType4 | 博客类型4 | query | false    | integer(int32)    |        |
| blogType5 | 博客类型5 | query | false    | integer(int32)    |        |
| addDate   | 添加日期  | query | false    | string(date-time) |        |
| isDelete  | 是否删除  | query | false    | integer(int32)    |        |
| delDate   | 删除时间  | query | false    | string(date-time) |        |


**响应状态**:


| 状态码 | 说明         | schema       |
| ------ | ------------ | ------------ |
| 200    | OK           | BolgAbstruct |
| 201    | Created      |              |
| 401    | Unauthorized |              |
| 403    | Forbidden    |              |
| 404    | Not Found    |              |


**响应参数**:


| 参数名称  | 参数说明  | 类型              | schema            |
| --------- | --------- | ----------------- | ----------------- |
| addDate   | 添加日期  | string(date-time) | string(date-time) |
| blogName  | 博客名称  | string            |                   |
| blogType1 | 博客类型1 | integer(int32)    | integer(int32)    |
| blogType2 | 博客类型2 | integer(int32)    | integer(int32)    |
| blogType3 | 博客类型3 | integer(int32)    | integer(int32)    |
| blogType4 | 博客类型4 | integer(int32)    | integer(int32)    |
| blogType5 | 博客类型5 | integer(int32)    | integer(int32)    |
| delDate   | 删除时间  | string(date-time) | string(date-time) |
| id        | 自增ID    | integer(int32)    | integer(int32)    |
| isDelete  | 是否删除  | integer(int32)    | integer(int32)    |


**响应示例**:

```javascript
{
	"addDate": "",
	"blogName": "",
	"blogType1": 0,
	"blogType2": 0,
	"blogType3": 0,
	"blogType4": 0,
	"blogType5": 0,
	"delDate": "",
	"id": 0,
	"isDelete": 0
}
```


## 删除一个


**接口地址**:`/bolgAbstruct/delOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称  | 参数说明  | in    | 是否必须 | 数据类型          | schema |
| --------- | --------- | ----- | -------- | ----------------- | ------ |
| id        | 自增ID    | query | false    | integer(int32)    |        |
| blogName  | 博客名称  | query | false    | string            |        |
| blogType1 | 博客类型1 | query | false    | integer(int32)    |        |
| blogType2 | 博客类型2 | query | false    | integer(int32)    |        |
| blogType3 | 博客类型3 | query | false    | integer(int32)    |        |
| blogType4 | 博客类型4 | query | false    | integer(int32)    |        |
| blogType5 | 博客类型5 | query | false    | integer(int32)    |        |
| addDate   | 添加日期  | query | false    | string(date-time) |        |
| isDelete  | 是否删除  | query | false    | integer(int32)    |        |
| delDate   | 删除时间  | query | false    | string(date-time) |        |


**响应状态**:


| 状态码 | 说明         | schema |
| ------ | ------------ | ------ |
| 200    | OK           |        |
| 201    | Created      |        |
| 401    | Unauthorized |        |
| 403    | Forbidden    |        |
| 404    | Not Found    |        |


**响应参数**:


暂无


**响应示例**:

```javascript

```


## 查询所有


**接口地址**:`/bolgAbstruct/selectAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明         | schema       |
| ------ | ------------ | ------------ |
| 200    | OK           | BolgAbstruct |
| 201    | Created      |              |
| 401    | Unauthorized |              |
| 403    | Forbidden    |              |
| 404    | Not Found    |              |


**响应参数**:


| 参数名称  | 参数说明  | 类型              | schema            |
| --------- | --------- | ----------------- | ----------------- |
| addDate   | 添加日期  | string(date-time) | string(date-time) |
| blogName  | 博客名称  | string            |                   |
| blogType1 | 博客类型1 | integer(int32)    | integer(int32)    |
| blogType2 | 博客类型2 | integer(int32)    | integer(int32)    |
| blogType3 | 博客类型3 | integer(int32)    | integer(int32)    |
| blogType4 | 博客类型4 | integer(int32)    | integer(int32)    |
| blogType5 | 博客类型5 | integer(int32)    | integer(int32)    |
| delDate   | 删除时间  | string(date-time) | string(date-time) |
| id        | 自增ID    | integer(int32)    | integer(int32)    |
| isDelete  | 是否删除  | integer(int32)    | integer(int32)    |


**响应示例**:

```javascript
[
	{
		"addDate": "",
		"blogName": "",
		"blogType1": 0,
		"blogType2": 0,
		"blogType3": 0,
		"blogType4": 0,
		"blogType5": 0,
		"delDate": "",
		"id": 0,
		"isDelete": 0
	}
]
```


## 查询一个


**接口地址**:`/bolgAbstruct/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型       | schema |
| -------- | -------- | ----- | -------- | -------------- | ------ |
| id       | id       | query | false    | integer(int32) |        |


**响应状态**:


| 状态码 | 说明         | schema       |
| ------ | ------------ | ------------ |
| 200    | OK           | BolgAbstruct |
| 201    | Created      |              |
| 401    | Unauthorized |              |
| 403    | Forbidden    |              |
| 404    | Not Found    |              |


**响应参数**:


| 参数名称  | 参数说明  | 类型              | schema            |
| --------- | --------- | ----------------- | ----------------- |
| addDate   | 添加日期  | string(date-time) | string(date-time) |
| blogName  | 博客名称  | string            |                   |
| blogType1 | 博客类型1 | integer(int32)    | integer(int32)    |
| blogType2 | 博客类型2 | integer(int32)    | integer(int32)    |
| blogType3 | 博客类型3 | integer(int32)    | integer(int32)    |
| blogType4 | 博客类型4 | integer(int32)    | integer(int32)    |
| blogType5 | 博客类型5 | integer(int32)    | integer(int32)    |
| delDate   | 删除时间  | string(date-time) | string(date-time) |
| id        | 自增ID    | integer(int32)    | integer(int32)    |
| isDelete  | 是否删除  | integer(int32)    | integer(int32)    |


**响应示例**:

```javascript
{
	"addDate": "",
	"blogName": "",
	"blogType1": 0,
	"blogType2": 0,
	"blogType3": 0,
	"blogType4": 0,
	"blogType5": 0,
	"delDate": "",
	"id": 0,
	"isDelete": 0
}
```


## 更新数据


**接口地址**:`/bolgAbstruct/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称  | 参数说明  | in    | 是否必须 | 数据类型          | schema |
| --------- | --------- | ----- | -------- | ----------------- | ------ |
| id        | 自增ID    | query | false    | integer(int32)    |        |
| blogName  | 博客名称  | query | false    | string            |        |
| blogType1 | 博客类型1 | query | false    | integer(int32)    |        |
| blogType2 | 博客类型2 | query | false    | integer(int32)    |        |
| blogType3 | 博客类型3 | query | false    | integer(int32)    |        |
| blogType4 | 博客类型4 | query | false    | integer(int32)    |        |
| blogType5 | 博客类型5 | query | false    | integer(int32)    |        |
| addDate   | 添加日期  | query | false    | string(date-time) |        |
| isDelete  | 是否删除  | query | false    | integer(int32)    |        |
| delDate   | 删除时间  | query | false    | string(date-time) |        |


**响应状态**:


| 状态码 | 说明         | schema       |
| ------ | ------------ | ------------ |
| 200    | OK           | BolgAbstruct |
| 201    | Created      |              |
| 401    | Unauthorized |              |
| 403    | Forbidden    |              |
| 404    | Not Found    |              |


**响应参数**:


| 参数名称  | 参数说明  | 类型              | schema            |
| --------- | --------- | ----------------- | ----------------- |
| addDate   | 添加日期  | string(date-time) | string(date-time) |
| blogName  | 博客名称  | string            |                   |
| blogType1 | 博客类型1 | integer(int32)    | integer(int32)    |
| blogType2 | 博客类型2 | integer(int32)    | integer(int32)    |
| blogType3 | 博客类型3 | integer(int32)    | integer(int32)    |
| blogType4 | 博客类型4 | integer(int32)    | integer(int32)    |
| blogType5 | 博客类型5 | integer(int32)    | integer(int32)    |
| delDate   | 删除时间  | string(date-time) | string(date-time) |
| id        | 自增ID    | integer(int32)    | integer(int32)    |
| isDelete  | 是否删除  | integer(int32)    | integer(int32)    |


**响应示例**:

```javascript
{
	"addDate": "",
	"blogName": "",
	"blogType1": 0,
	"blogType2": 0,
	"blogType3": 0,
	"blogType4": 0,
	"blogType5": 0,
	"delDate": "",
	"id": 0,
	"isDelete": 0
}
```


# 博客类型管理


## 添加一个


**接口地址**:`/blogTypes/addOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型          | schema |
| -------- | -------- | ----- | -------- | ----------------- | ------ |
| id       | 自增ID   | query | false    | integer(int32)    |        |
| typeName | 类型名称 | query | false    | string            |        |
| addDate  | 添加日期 | query | false    | string(date-time) |        |
| delDate  | 删除日期 | query | false    | string(date-time) |        |
| isDelete | 是否删除 | query | false    | integer(int32)    |        |


**响应状态**:


| 状态码 | 说明         | schema    |
| ------ | ------------ | --------- |
| 200    | OK           | BlogTypes |
| 201    | Created      |           |
| 401    | Unauthorized |           |
| 403    | Forbidden    |           |
| 404    | Not Found    |           |


**响应参数**:


| 参数名称 | 参数说明 | 类型              | schema            |
| -------- | -------- | ----------------- | ----------------- |
| addDate  | 添加日期 | string(date-time) | string(date-time) |
| delDate  | 删除日期 | string(date-time) | string(date-time) |
| id       | 自增ID   | integer(int32)    | integer(int32)    |
| isDelete | 是否删除 | integer(int32)    | integer(int32)    |
| typeName | 类型名称 | string            |                   |


**响应示例**:

```javascript
{
	"addDate": "",
	"delDate": "",
	"id": 0,
	"isDelete": 0,
	"typeName": ""
}
```


## 删除一个


**接口地址**:`/blogTypes/delOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型          | schema |
| -------- | -------- | ----- | -------- | ----------------- | ------ |
| id       | 自增ID   | query | false    | integer(int32)    |        |
| typeName | 类型名称 | query | false    | string            |        |
| addDate  | 添加日期 | query | false    | string(date-time) |        |
| delDate  | 删除日期 | query | false    | string(date-time) |        |
| isDelete | 是否删除 | query | false    | integer(int32)    |        |


**响应状态**:


| 状态码 | 说明         | schema |
| ------ | ------------ | ------ |
| 200    | OK           |        |
| 201    | Created      |        |
| 401    | Unauthorized |        |
| 403    | Forbidden    |        |
| 404    | Not Found    |        |


**响应参数**:


暂无


**响应示例**:

```javascript

```


## 查询所有


**接口地址**:`/blogTypes/selectAll`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明         | schema    |
| ------ | ------------ | --------- |
| 200    | OK           | BlogTypes |
| 201    | Created      |           |
| 401    | Unauthorized |           |
| 403    | Forbidden    |           |
| 404    | Not Found    |           |


**响应参数**:


| 参数名称 | 参数说明 | 类型              | schema            |
| -------- | -------- | ----------------- | ----------------- |
| addDate  | 添加日期 | string(date-time) | string(date-time) |
| delDate  | 删除日期 | string(date-time) | string(date-time) |
| id       | 自增ID   | integer(int32)    | integer(int32)    |
| isDelete | 是否删除 | integer(int32)    | integer(int32)    |
| typeName | 类型名称 | string            |                   |


**响应示例**:

```javascript
[
	{
		"addDate": "",
		"delDate": "",
		"id": 0,
		"isDelete": 0,
		"typeName": ""
	}
]
```


## 查询一个


**接口地址**:`/blogTypes/selectOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型       | schema |
| -------- | -------- | ----- | -------- | -------------- | ------ |
| id       | id       | query | false    | integer(int32) |        |


**响应状态**:


| 状态码 | 说明         | schema    |
| ------ | ------------ | --------- |
| 200    | OK           | BlogTypes |
| 201    | Created      |           |
| 401    | Unauthorized |           |
| 403    | Forbidden    |           |
| 404    | Not Found    |           |


**响应参数**:


| 参数名称 | 参数说明 | 类型              | schema            |
| -------- | -------- | ----------------- | ----------------- |
| addDate  | 添加日期 | string(date-time) | string(date-time) |
| delDate  | 删除日期 | string(date-time) | string(date-time) |
| id       | 自增ID   | integer(int32)    | integer(int32)    |
| isDelete | 是否删除 | integer(int32)    | integer(int32)    |
| typeName | 类型名称 | string            |                   |


**响应示例**:

```javascript
{
	"addDate": "",
	"delDate": "",
	"id": 0,
	"isDelete": 0,
	"typeName": ""
}
```


## 更新数据


**接口地址**:`/blogTypes/updateOne`


**请求方式**:`POST`


**请求数据类型**:`application/json`


**响应数据类型**:`application/json;charset=UTF-8`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | in    | 是否必须 | 数据类型          | schema |
| -------- | -------- | ----- | -------- | ----------------- | ------ |
| id       | 自增ID   | query | false    | integer(int32)    |        |
| typeName | 类型名称 | query | false    | string            |        |
| addDate  | 添加日期 | query | false    | string(date-time) |        |
| delDate  | 删除日期 | query | false    | string(date-time) |        |
| isDelete | 是否删除 | query | false    | integer(int32)    |        |


**响应状态**:


| 状态码 | 说明         | schema    |
| ------ | ------------ | --------- |
| 200    | OK           | BlogTypes |
| 201    | Created      |           |
| 401    | Unauthorized |           |
| 403    | Forbidden    |           |
| 404    | Not Found    |           |


**响应参数**:


| 参数名称 | 参数说明 | 类型              | schema            |
| -------- | -------- | ----------------- | ----------------- |
| addDate  | 添加日期 | string(date-time) | string(date-time) |
| delDate  | 删除日期 | string(date-time) | string(date-time) |
| id       | 自增ID   | integer(int32)    | integer(int32)    |
| isDelete | 是否删除 | integer(int32)    | integer(int32)    |
| typeName | 类型名称 | string            |                   |


**响应示例**:

```javascript
{
	"addDate": "",
	"delDate": "",
	"id": 0,
	"isDelete": 0,
	"typeName": ""
}
```