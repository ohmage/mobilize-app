/*******************************************************************************
 * Copyright 2011 The Regents of the University of California
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.mobilizingcs;

import org.ohmage.OhmageApplication;
import org.ohmage.UserPreferencesHelper;
import org.ohmage.logprobe.LogProbe;

public class MobilizeApplication extends OhmageApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        UserPreferencesHelper.setPreserveInvalidPoints(true);

        // We log the device id so we can correlate data with systemsens
        LogProbe.setLogDeviceId(true);
    }

    @Override
    public void resetAll() {
        super.resetAll();

        UserPreferencesHelper.setPreserveInvalidPoints(true);
    }
}
