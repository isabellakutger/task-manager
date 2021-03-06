/*
 * Copyright 2018 OpenTOSCA and
 * University of Stuttgart (Institute of Architecture of Application Systems, Institute for Parallel and Distributed Systems)
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.htm.taskinstance;

import com.htm.dm.IDataModelElement;

/**
 * Input parameters represent data which is needed by the user to fulfill the task.
 * For example a specific modelnumber of a component.
 */
public interface IInputParameter extends IDataModelElement {

    public String getId();

    public String getLabel();

    public void setLabel(String label);

    public String getValue();

    public void setValue(String value);

    public void setTask(ITaskInstance task);

    public ITaskInstance getTask(ITaskInstance task);

}
