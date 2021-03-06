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

package androidx.compose.foundation.samples


import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.core.gesture.scrollorientationlocking.Orientation
import androidx.ui.foundation.Box
import androidx.ui.foundation.gestures.draggable


import androidx.ui.graphics.Color
import androidx.ui.layout.offsetPx
import androidx.ui.layout.preferredSize
import androidx.ui.layout.preferredWidth


import androidx.ui.unit.dp


@Composable
fun DraggableSample() {
    // Draw a seekbar-like composable that has a black background
    // with a red square that moves along the 300.dp drag distance
    val max = 300.dp
    val min = 0.dp
    // this is the  state we will update while dragging
    val offsetPosition = state { 0f }

    // seekbar itself
    Box(
        modifier = Modifier
            .preferredWidth(max)
            .draggable(orientation = Orientation.Horizontal) { delta ->
                val newValue = offsetPosition.value + delta
                offsetPosition.value = newValue.coerceIn(min.toPx(), max.toPx())
            },
        backgroundColor = Color.Black
    ) {
        Box(
            Modifier.offsetPx(x = offsetPosition).preferredSize(50.dp),
            backgroundColor = Color.Red
        )
    }
}