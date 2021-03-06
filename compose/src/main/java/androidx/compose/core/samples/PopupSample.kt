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

package androidx.ui.core.samples


import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.Popup
import androidx.ui.foundation.Box
import androidx.ui.foundation.shape.corner.RoundedCornerShape

import androidx.ui.graphics.Color
import androidx.ui.layout.preferredSize

import androidx.ui.unit.dp


@Composable
fun PopupSample() {
    Box {
        val popupWidth = 200.dp
        val popupHeight = 50.dp
        val cornerSize = 16.dp

        Popup(alignment = Alignment.Center) {
            // Draw a rectangle shape with rounded corners inside the popup
            Box(
                Modifier.preferredSize(popupWidth, popupHeight),
                shape = RoundedCornerShape(cornerSize),
                backgroundColor = Color.White
            )
        }
    }
}
