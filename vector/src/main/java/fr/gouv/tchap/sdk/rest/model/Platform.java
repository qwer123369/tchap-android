/* 
 * Copyright 2018 DINSIC
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
package fr.gouv.tchap.sdk.rest.model;

/**
 * Class to contain a Tchap platform configuration.
 */
public class Platform {
    // The homeserver name.
    public String hs;
    // Tell whether the given 3pid has been invited to the platform or not.
    public boolean invited;
}
