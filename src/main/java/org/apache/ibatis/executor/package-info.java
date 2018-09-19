/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Contains the statement executors.
 *
 * 抽象类BaseExecutor采用模板方法设计模式，具体的实现在其子类：BatchExecutor、ReuseExecutor和SimpleExecutor.
 *
 *           --> BaseExecutor
 *           \
 *           \
 * Executor --
 *           \
 *           \
 *           --> CachingExecutor
 *
 * CachingExecutor在查找数据库前先查找缓存，若没有找到的话调用delegate从数据库查询，并将查询结果存入缓存中。
 */
package org.apache.ibatis.executor;
