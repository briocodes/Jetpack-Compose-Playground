/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.material.demos

import androidx.compose.Composable
import androidx.ui.core.Modifier

import androidx.ui.foundation.ScrollableColumn
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.InnerPadding
import androidx.ui.layout.Spacer
import androidx.ui.layout.height
import androidx.ui.material.MaterialTheme
import androidx.ui.material.samples.RadioButtonSample
import androidx.ui.material.samples.RadioGroupSample
import androidx.ui.material.samples.SwitchSample
import androidx.ui.material.samples.TriStateCheckboxSample
import androidx.ui.unit.dp

@Composable
fun SelectionControlsDemo() {
    val headerStyle = MaterialTheme.typography.h6
    ScrollableColumn(
        contentPadding = InnerPadding(10.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Checkbox", style = headerStyle)
        TriStateCheckboxSample()
        Spacer(Modifier.height(16.dp))
        Text(text = "Switch", style = headerStyle)
        SwitchSample()
        Spacer(Modifier.height(16.dp))
        Text(text = "RadioButtons with custom colors", style = headerStyle)
        RadioButtonSample()
        Spacer(Modifier.height(16.dp))
        Text(text = "Radio group", style = headerStyle)
        RadioGroupSample()
    }
}
