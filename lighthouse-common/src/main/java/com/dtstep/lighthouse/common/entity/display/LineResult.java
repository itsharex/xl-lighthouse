package com.dtstep.lighthouse.common.entity.display;
/*
 * Copyright (C) 2022-2023 XueLing.雪灵
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LineResult extends AbstractResult {

    private static final long serialVersionUID = -5887679698603457875L;

    private List<Long> batchList;

    private List<Object> valueList;

    public LineResult(TimeUnit timeParamUnit){
        super(timeParamUnit);
    }

    public List<Long> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<Long> batchList) {
        this.batchList = batchList;
    }

    public List<Object> getValueList() {
        return valueList;
    }

    public void setValueList(List<Object> valueList) {
        this.valueList = valueList;
    }
}
