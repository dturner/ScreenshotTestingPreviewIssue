package com.example.screenshottestpreviewissue

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.screenshottestpreviewissue.ui.theme.ScreenshotTestPreviewIssueTheme


@Composable
@Preview(showBackground = true)
fun GreetingPreview() {
    ScreenshotTestPreviewIssueTheme {
        Text("Hello",
            Modifier.padding(
                dimensionResource(R.dimen.my_padding)
            )
        )
    }
}