/*
 * Licensed to the Technische Universität Darmstadt under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The Technische Universität Darmstadt 
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.
 *  
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dkpro.core.io.pubannotation.internal.model;

// "relations": [
//   {"id": "R1", "subj": "T1", "pred": "themeOf", "obj": "E1"},
//   {"id": "R2", "subj": "E1", "pred": "themeOf", "obj": "E2"},
//   {"id": "R3", "subj": "T2", "pred": "causeOf", "obj": "E2"}
// ]
public class PARelation
{
    private String id;
    private String subj;
    private String pred;
    private String obj;
    
    public PARelation()
    {
        // Default constructor
    }
    
    public String getId()
    {
        return id;
    }
    public void setId(String aId)
    {
        id = aId;
    }
    public String getSubj()
    {
        return subj;
    }
    public void setSubj(String aSubj)
    {
        subj = aSubj;
    }
    public String getPred()
    {
        return pred;
    }
    public void setPred(String aPred)
    {
        pred = aPred;
    }
    public String getObj()
    {
        return obj;
    }
    public void setObj(String aObj)
    {
        obj = aObj;
    }
}
