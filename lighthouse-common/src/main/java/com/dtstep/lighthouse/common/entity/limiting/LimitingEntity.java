package com.dtstep.lighthouse.common.entity.limiting;
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

import com.dtstep.lighthouse.common.entity.annotation.DBColumnAnnotation;
import com.dtstep.lighthouse.common.entity.annotation.DBNameAnnotation;

import java.io.Serializable;
import java.util.Date;


@DBNameAnnotation(name="ldp_limited_records")
public final class LimitingEntity implements Serializable {

    private static final long serialVersionUID = 1010163452878064992L;

    @DBColumnAnnotation(basic="id")
    private int id;

    @DBColumnAnnotation(basic="relation_id")
    private int relationId;

    @DBColumnAnnotation(basic="relation_type")
    private int relationType;

    @DBColumnAnnotation(basic="strategy")
    private String strategy;

    @DBColumnAnnotation(basic="start_time")
    private Date startTime;

    @DBColumnAnnotation(basic="end_time")
    private Date endTime;

    @DBColumnAnnotation(basic="create_time")
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRelationId() {
        return relationId;
    }

    public void setRelationId(int relationId) {
        this.relationId = relationId;
    }

    public int getRelationType() {
        return relationType;
    }

    public void setRelationType(int relationType) {
        this.relationType = relationType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
