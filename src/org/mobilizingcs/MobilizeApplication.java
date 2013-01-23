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

public class MobilizeApplication extends OhmageApplication {

    @Override
    public void configureForDeployment(String server) {
        UserPreferencesHelper userPrefs = new UserPreferencesHelper(this);
        userPrefs.setShowFeedback(true);
        userPrefs.setShowProfile(true);
        userPrefs.setShowUploadQueue(true);
        userPrefs.setShowMobility(false);
        userPrefs.setShowMobilityFeedback(false);
        userPrefs.setUploadResponsesWifiOnly(false);
        userPrefs.setUploadProbesWifiOnly(true);

        // ConfigHelper is set by the defaults in config.xml
    }
}
