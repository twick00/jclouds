/**
 *
 * Copyright (C) 2011 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.jclouds.epc;

import org.jclouds.providers.BaseProviderMetadataTest;
import org.jclouds.providers.ProviderMetadata;
import org.testng.annotations.Test;

/**
 * The EucalyptusPartnerCloudEC2ProviderTest tests the {@link EucalyptusPartnerCloudEC2ProviderMetadata} class.
 * 
 * @author Jeremy Whitlock <jwhitlock@apache.org>
 */
@Test(groups = "unit", testName = "EucalyptusPartnerCloudEC2ProviderTest")
public class EucalyptusPartnerCloudEC2ProviderTest extends BaseProviderMetadataTest {

   public EucalyptusPartnerCloudEC2ProviderTest() {
      super(new EucalyptusPartnerCloudEC2ProviderMetadata(), ProviderMetadata.COMPUTE_TYPE);
   }

}