package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes21.dex */
public final class TempSensorBreadcrumbsIntegration implements Integration, Closeable, SensorEventListener {
    private final Context context;
    private IHub hub;
    private SentryAndroidOptions options;
    SensorManager sensorManager;
    private boolean isClosed = false;
    private final Object startLock = new Object();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public TempSensorBreadcrumbsIntegration(Context context) {
        this.context = (Context) Objects.requireNonNull(context, "Context is required");
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, final SentryOptions sentryOptions) {
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.options.isEnableSystemEventBreadcrumbs()));
        if (this.options.isEnableSystemEventBreadcrumbs()) {
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.TempSensorBreadcrumbsIntegration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TempSensorBreadcrumbsIntegration.m28530$r8$lambda$D7g_kVhlkNOGINCoqjqBPWtQ0(this.f$0, sentryOptions);
                    }
                });
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start TempSensorBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }

    /* renamed from: $r8$lambda$D7g_kVhlkN-OGINCoqjqBPWtQ-0, reason: not valid java name */
    public static /* synthetic */ void m28530$r8$lambda$D7g_kVhlkNOGINCoqjqBPWtQ0(TempSensorBreadcrumbsIntegration tempSensorBreadcrumbsIntegration, SentryOptions sentryOptions) {
        synchronized (tempSensorBreadcrumbsIntegration.startLock) {
            try {
                if (!tempSensorBreadcrumbsIntegration.isClosed) {
                    tempSensorBreadcrumbsIntegration.startSensorListener(sentryOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startSensorListener(SentryOptions sentryOptions) {
        try {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService("sensor");
            this.sensorManager = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                if (defaultSensor != null) {
                    this.sensorManager.registerListener(this, defaultSensor, 3);
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    IntegrationUtils.addIntegrationToSdkVersion((Class<?>) TempSensorBreadcrumbsIntegration.class);
                    return;
                }
                sentryOptions.getLogger().log(SentryLevel.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                return;
            }
            sentryOptions.getLogger().log(SentryLevel.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.startLock) {
            this.isClosed = true;
        }
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.sensorManager = null;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.hub == null) {
            return;
        }
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("system");
        breadcrumb.setCategory("device.event");
        breadcrumb.setData("action", "TYPE_AMBIENT_TEMPERATURE");
        breadcrumb.setData("accuracy", Integer.valueOf(sensorEvent.accuracy));
        breadcrumb.setData("timestamp", Long.valueOf(sensorEvent.timestamp));
        breadcrumb.setLevel(SentryLevel.INFO);
        breadcrumb.setData("degree", Float.valueOf(sensorEvent.values[0]));
        Hint hint = new Hint();
        hint.set("android:sensorEvent", sensorEvent);
        this.hub.addBreadcrumb(breadcrumb, hint);
    }
}
