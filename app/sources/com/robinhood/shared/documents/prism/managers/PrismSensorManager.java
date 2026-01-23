package com.robinhood.shared.documents.prism.managers;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.shared.documents.prism.timeseries.PrismTimeSeriesEntry;
import com.robinhood.utils.Preconditions;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrismSensorManager.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u00109\u001a\u0002062\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010;\u001a\u00020<H\u0016J\u000e\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u000206J\u0006\u0010A\u001a\u000206J\u0006\u0010B\u001a\u000206J\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0DJ\b\u0010E\u001a\u000206H\u0002J\u0010\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\u001bH\u0002J\f\u0010H\u001a\u000200*\u000200H\u0002J\u0012\u0010I\u001a\u000200*\b\u0012\u0004\u0012\u00020\u00110DH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0013\u0010+\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0013\u0010-\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b4\u00102¨\u0006K"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/managers/PrismSensorManager;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sensorManager", "Landroid/hardware/SensorManager;", "rotationSensor", "Landroid/hardware/Sensor;", "gyroSensor", "gyroErrorSensor", "accelerometerSensor", "linearAccelerationSensor", "gravitySensor", "magnetometerSensor", "rotationVectorReading", "", "gyroReading", "gyroErrorReading", "linearAccelerationReading", "accelerometerReading", "gravityVectorReading", "magnetometerReading", "recordingTimeSeries", "", "lastSampleTimestamp", "", "timeSeriesEntries", "", "Lcom/robinhood/shared/documents/prism/timeseries/PrismTimeSeriesEntry;", "recordingMotion", "averageMotionValues", "recentMotionValues", "calculatedGravity", "rotationVendor", "", "getRotationVendor", "()Ljava/lang/String;", "gyroVendor", "getGyroVendor", "accelerometerVendor", "getAccelerometerVendor", "linearAccelerationVendor", "getLinearAccelerationVendor", "gravityVendor", "getGravityVendor", "averageMotion", "", "getAverageMotion", "()F", "recentMotion", "getRecentMotion", "onSensorChanged", "", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "accuracy", "", "bindToLifecycleHost", "lifecycleHost", "Lcom/robinhood/disposer/LifecycleHost;", "startRecordingMotion", "stopRecordingMotion", "startRecordingTimeSeries", "finishRecordingTimeSeries", "", "registerListeners", "getTimeSeriesEntry", "timestampMillis", "inGravityIncrements", "magnitude", "Companion", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PrismSensorManager implements SensorEventListener {
    private static final String EVENT_START_SENSOR_TRACKING = "start_sensor_tracking";
    private static final String EVENT_STOP_SENSOR_TRACKING = "stop_sensor_tracking";
    private static final float GRAVITY_ALPHA = 0.2f;
    private static final float GRAVITY_MAGNITUDE = 9.81f;
    private static final int MAX_RECENT_MOTION_VALUES = 20;
    private static final long SENSOR_SAMPLING_RATE_NS = 10000000;
    private static final int SENSOR_SAMPLING_RATE_US = 10000;
    private final float[] accelerometerReading;
    private final Sensor accelerometerSensor;
    private final List<float[]> averageMotionValues;
    private final float[] calculatedGravity;
    private final Context context;
    private final Sensor gravitySensor;
    private final float[] gravityVectorReading;
    private final float[] gyroErrorReading;
    private final Sensor gyroErrorSensor;
    private final float[] gyroReading;
    private final Sensor gyroSensor;
    private long lastSampleTimestamp;
    private final float[] linearAccelerationReading;
    private final Sensor linearAccelerationSensor;
    private final float[] magnetometerReading;
    private final Sensor magnetometerSensor;
    private final List<float[]> recentMotionValues;
    private boolean recordingMotion;
    private boolean recordingTimeSeries;
    private final Sensor rotationSensor;
    private final float[] rotationVectorReading;
    private final SensorManager sensorManager;
    private final List<PrismTimeSeriesEntry> timeSeriesEntries;
    public static final int $stable = 8;

    private final float inGravityIncrements(float f) {
        return f / GRAVITY_MAGNITUDE;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    public PrismSensorManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.rotationSensor = sensorManager.getDefaultSensor(11);
        this.gyroSensor = sensorManager.getDefaultSensor(4);
        this.gyroErrorSensor = sensorManager.getDefaultSensor(16);
        this.accelerometerSensor = sensorManager.getDefaultSensor(1);
        this.linearAccelerationSensor = sensorManager.getDefaultSensor(10);
        this.gravitySensor = sensorManager.getDefaultSensor(9);
        this.magnetometerSensor = sensorManager.getDefaultSensor(2);
        this.rotationVectorReading = new float[4];
        this.gyroReading = new float[3];
        this.gyroErrorReading = new float[3];
        this.linearAccelerationReading = new float[3];
        this.accelerometerReading = new float[3];
        this.gravityVectorReading = new float[3];
        this.magnetometerReading = new float[3];
        this.timeSeriesEntries = new ArrayList();
        this.averageMotionValues = new ArrayList();
        this.recentMotionValues = new ArrayList();
        this.calculatedGravity = new float[3];
    }

    public final String getRotationVendor() {
        Sensor sensor = this.rotationSensor;
        if (sensor != null) {
            return sensor.getVendor();
        }
        return null;
    }

    public final String getGyroVendor() {
        Sensor sensor = this.gyroSensor;
        if (sensor != null) {
            return sensor.getVendor();
        }
        return null;
    }

    public final String getAccelerometerVendor() {
        Sensor sensor = this.accelerometerSensor;
        if (sensor != null) {
            return sensor.getVendor();
        }
        return null;
    }

    public final String getLinearAccelerationVendor() {
        Sensor sensor = this.linearAccelerationSensor;
        if (sensor != null) {
            return sensor.getVendor();
        }
        return null;
    }

    public final String getGravityVendor() {
        Sensor sensor = this.gravitySensor;
        if (sensor != null) {
            return sensor.getVendor();
        }
        return null;
    }

    public final float getAverageMotion() {
        if (this.averageMotionValues.isEmpty()) {
            return 0.0f;
        }
        return magnitude(this.averageMotionValues) / this.averageMotionValues.size();
    }

    public final float getRecentMotion() {
        return magnitude(this.recentMotionValues);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (event == null) {
            return;
        }
        int type2 = event.sensor.getType();
        if (type2 == 1) {
            float[] fArr = this.calculatedGravity;
            float f = fArr[0] * GRAVITY_ALPHA;
            float[] fArr2 = event.values;
            float f2 = f + (fArr2[0] * 0.8f);
            fArr[0] = f2;
            float f3 = (fArr[1] * GRAVITY_ALPHA) + (fArr2[1] * 0.8f);
            fArr[1] = f3;
            float f4 = (fArr[2] * GRAVITY_ALPHA) + (fArr2[2] * 0.8f);
            fArr[2] = f4;
            float[] fArr3 = {fArr2[0] - f2, fArr2[1] - f3, fArr2[2] - f4};
            this.recentMotionValues.add(fArr3);
            if (this.recentMotionValues.size() > 20) {
                this.recentMotionValues.remove(0);
            }
            if (this.recordingMotion) {
                this.averageMotionValues.add(fArr3);
            }
            float[] values = event.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            ArraysKt.copyInto$default(values, this.accelerometerReading, 0, 0, 0, 14, (Object) null);
            return;
        }
        if (type2 == 2) {
            float[] values2 = event.values;
            Intrinsics.checkNotNullExpressionValue(values2, "values");
            ArraysKt.copyInto$default(values2, this.magnetometerReading, 0, 0, 0, 14, (Object) null);
            if (this.recordingTimeSeries) {
                long j = this.lastSampleTimestamp + 10000000;
                long j2 = event.timestamp;
                if (j <= j2) {
                    this.timeSeriesEntries.add(getTimeSeriesEntry(j2 / 1000000));
                    this.lastSampleTimestamp = event.timestamp;
                }
            }
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (type2 == 4) {
            float[] values3 = event.values;
            Intrinsics.checkNotNullExpressionValue(values3, "values");
            ArraysKt.copyInto$default(values3, this.gyroReading, 0, 0, 0, 14, (Object) null);
            return;
        }
        if (type2 == 16) {
            float[] values4 = event.values;
            Intrinsics.checkNotNullExpressionValue(values4, "values");
            ArraysKt.copyInto$default(values4, this.gyroErrorReading, 0, 3, 0, 10, (Object) null);
            return;
        }
        switch (type2) {
            case 9:
                float[] values5 = event.values;
                Intrinsics.checkNotNullExpressionValue(values5, "values");
                ArraysKt.copyInto$default(values5, this.gravityVectorReading, 0, 0, 0, 14, (Object) null);
                return;
            case 10:
                float[] values6 = event.values;
                Intrinsics.checkNotNullExpressionValue(values6, "values");
                ArraysKt.copyInto$default(values6, this.linearAccelerationReading, 0, 0, 0, 14, (Object) null);
                return;
            case 11:
                float[] values7 = event.values;
                Intrinsics.checkNotNullExpressionValue(values7, "values");
                ArraysKt.copyInto$default(values7, this.rotationVectorReading, 0, 0, 4, 6, (Object) null);
                return;
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(event.sensor.getType()));
                throw new ExceptionsH();
        }
    }

    /* compiled from: PrismSensorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.managers.PrismSensorManager$bindToLifecycleHost$1", m3645f = "PrismSensorManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.managers.PrismSensorManager$bindToLifecycleHost$1 */
    static final class C387781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C387781(Continuation<? super C387781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismSensorManager.this.new C387781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PrismSensorManager.this.registerListeners();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void bindToLifecycleHost(LifecycleHost lifecycleHost) {
        Intrinsics.checkNotNullParameter(lifecycleHost, "lifecycleHost");
        lifecycleHost.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C387781(null)).invokeOnCompletion(new Function1() { // from class: com.robinhood.shared.documents.prism.managers.PrismSensorManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrismSensorManager.bindToLifecycleHost$lambda$0(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToLifecycleHost$lambda$0(PrismSensorManager prismSensorManager, Throwable th) {
        prismSensorManager.sensorManager.unregisterListener(prismSensorManager);
        return Unit.INSTANCE;
    }

    public final void startRecordingMotion() {
        this.recordingMotion = true;
        this.averageMotionValues.clear();
    }

    public final void stopRecordingMotion() {
        this.recordingMotion = false;
    }

    public final void startRecordingTimeSeries() {
        this.recordingTimeSeries = true;
        this.lastSampleTimestamp = 0L;
        this.timeSeriesEntries.clear();
    }

    public final List<PrismTimeSeriesEntry> finishRecordingTimeSeries() {
        this.recordingTimeSeries = false;
        List<PrismTimeSeriesEntry> list = this.timeSeriesEntries;
        PrismTimeSeriesEntry prismTimeSeriesEntry = (PrismTimeSeriesEntry) CollectionsKt.firstOrNull((List) this.timeSeriesEntries);
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        Float f6 = null;
        Float f7 = null;
        Float f8 = null;
        Float f9 = null;
        Float f10 = null;
        Float f11 = null;
        Float f12 = null;
        Float f13 = null;
        Float f14 = null;
        Float f15 = null;
        Float f16 = null;
        Float f17 = null;
        Float f18 = null;
        Float f19 = null;
        Float f20 = null;
        Float f21 = null;
        list.add(0, new PrismTimeSeriesEntry(prismTimeSeriesEntry != null ? prismTimeSeriesEntry.getTimestamp() : SystemClock.elapsedRealtime(), EVENT_START_SENSOR_TRACKING, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, null, 16777212, null));
        this.timeSeriesEntries.add(new PrismTimeSeriesEntry(0L, EVENT_STOP_SENSOR_TRACKING, null, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, 16777213, null));
        List<PrismTimeSeriesEntry> list2 = CollectionsKt.toList(this.timeSeriesEntries);
        this.timeSeriesEntries.clear();
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerListeners() {
        Sensor sensor = this.rotationSensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 10000);
        }
        Sensor sensor2 = this.gyroSensor;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, 10000);
        }
        Sensor sensor3 = this.gyroErrorSensor;
        if (sensor3 != null) {
            this.sensorManager.registerListener(this, sensor3, 10000);
        }
        Sensor sensor4 = this.accelerometerSensor;
        if (sensor4 != null) {
            this.sensorManager.registerListener(this, sensor4, 10000);
        }
        Sensor sensor5 = this.linearAccelerationSensor;
        if (sensor5 != null) {
            this.sensorManager.registerListener(this, sensor5, 10000);
        }
        Sensor sensor6 = this.gravitySensor;
        if (sensor6 != null) {
            this.sensorManager.registerListener(this, sensor6, 10000);
        }
        Sensor sensor7 = this.magnetometerSensor;
        if (sensor7 != null) {
            this.sensorManager.registerListener(this, sensor7, 10000);
        }
    }

    private final PrismTimeSeriesEntry getTimeSeriesEntry(long timestampMillis) {
        float[] fArr = new float[9];
        SensorManager.getRotationMatrix(fArr, null, this.accelerometerReading, this.magnetometerReading);
        float[] fArr2 = new float[3];
        SensorManager.getOrientation(fArr, fArr2);
        return new PrismTimeSeriesEntry(timestampMillis, null, Float.valueOf(this.rotationVectorReading[0]), Float.valueOf(this.rotationVectorReading[1]), Float.valueOf(this.rotationVectorReading[2]), Float.valueOf(this.rotationVectorReading[3]), Float.valueOf(fArr2[0]), Float.valueOf(fArr2[1]), Float.valueOf(fArr2[2]), Float.valueOf(this.gyroReading[0]), Float.valueOf(this.gyroReading[1]), Float.valueOf(this.gyroReading[2]), Float.valueOf(this.gyroErrorReading[0]), Float.valueOf(this.gyroErrorReading[1]), Float.valueOf(this.gyroErrorReading[2]), Float.valueOf(inGravityIncrements(this.linearAccelerationReading[0])), Float.valueOf(inGravityIncrements(this.linearAccelerationReading[1])), Float.valueOf(inGravityIncrements(this.linearAccelerationReading[2])), Float.valueOf(inGravityIncrements(this.accelerometerReading[0])), Float.valueOf(inGravityIncrements(this.accelerometerReading[1])), Float.valueOf(inGravityIncrements(this.accelerometerReading[2])), Float.valueOf(inGravityIncrements(this.gravityVectorReading[0])), Float.valueOf(inGravityIncrements(this.gravityVectorReading[1])), Float.valueOf(inGravityIncrements(this.gravityVectorReading[2])), 2, null);
    }

    private final float magnitude(List<float[]> list) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (float[] fArr : list) {
            f += fArr[0];
            f2 += fArr[1];
            f3 += fArr[2];
        }
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }
}
