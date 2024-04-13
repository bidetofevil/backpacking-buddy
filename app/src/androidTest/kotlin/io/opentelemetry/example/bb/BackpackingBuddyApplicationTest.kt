package io.opentelemetry.example.bb

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.opentelemetry.android.OpenTelemetryRum
import io.opentelemetry.android.config.OtelRumConfig
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class BackpackingBuddyApplicationTest {

    @Test
    fun desugar() {
        val application = ApplicationProvider.getApplicationContext<Application>()
        val builder =
            OpenTelemetryRum.builder(
                application,
                OtelRumConfig(),
            ).build()
        Assert.assertNotNull(builder)
    }
}