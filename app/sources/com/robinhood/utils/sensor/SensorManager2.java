package com.robinhood.utils.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.os.HandlerCompat;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.sensor.SensorEventListenerAdapter;
import com.robinhood.utils.sensor.SensorManager2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: SensorManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/utils/sensor/DefaultSensorManager;", "Lcom/robinhood/utils/sensor/SensorManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "systemSensorManager", "Landroid/hardware/SensorManager;", "events", "Lkotlinx/coroutines/flow/Flow;", "", "sensor", "Landroid/hardware/Sensor;", "samplingPeriodUs", "", "getDefaultSensor", "type", "getQuaternionFromVector", "", "quaternion", "rotationVector", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.sensor.DefaultSensorManager, reason: use source file name */
/* loaded from: classes12.dex */
public final class SensorManager2 implements SensorManager {
    private static final String SENSOR_THREAD = "SensorManagerEventsThread";
    private final android.hardware.SensorManager systemSensorManager;

    public SensorManager2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.systemSensorManager = ContextSystemServices.getSensorManager(context);
    }

    /* compiled from: SensorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.sensor.DefaultSensorManager$events$1", m3645f = "SensorManager.kt", m3646l = {79}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.sensor.DefaultSensorManager$events$1 */
    static final class C419921 extends ContinuationImpl7 implements Function2<Produce4<? super float[]>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $samplingPeriodUs;
        final /* synthetic */ Sensor $sensor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C419921(Sensor sensor, int i, Continuation<? super C419921> continuation) {
            super(2, continuation);
            this.$sensor = sensor;
            this.$samplingPeriodUs = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419921 c419921 = SensorManager2.this.new C419921(this.$sensor, this.$samplingPeriodUs, continuation);
            c419921.L$0 = obj;
            return c419921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super float[]> produce4, Continuation<? super Unit> continuation) {
            return ((C419921) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [android.hardware.SensorEventListener, com.robinhood.utils.sensor.DefaultSensorManager$events$1$listener$1] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce4 = (Produce4) this.L$0;
                final HandlerThread handlerThread = new HandlerThread(SensorManager2.SENSOR_THREAD, 0);
                handlerThread.start();
                Handler handlerCreateAsync = HandlerCompat.createAsync(handlerThread.getLooper());
                Intrinsics.checkNotNullExpressionValue(handlerCreateAsync, "createAsync(...)");
                final ?? r4 = new SensorEventListenerAdapter() { // from class: com.robinhood.utils.sensor.DefaultSensorManager$events$1$listener$1
                    @Override // com.robinhood.utils.sensor.SensorEventListenerAdapter, android.hardware.SensorEventListener
                    public void onAccuracyChanged(Sensor sensor, int i2) {
                        SensorEventListenerAdapter.DefaultImpls.onAccuracyChanged(this, sensor, i2);
                    }

                    @Override // com.robinhood.utils.sensor.SensorEventListenerAdapter, android.hardware.SensorEventListener2
                    public void onFlushCompleted(Sensor sensor) {
                        SensorEventListenerAdapter.DefaultImpls.onFlushCompleted(this, sensor);
                    }

                    @Override // com.robinhood.utils.sensor.SensorEventListenerAdapter, android.hardware.SensorEventListener
                    public void onSensorChanged(SensorEvent event) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        Produce4<float[]> produce42 = produce4;
                        float[] values = event.values;
                        Intrinsics.checkNotNullExpressionValue(values, "values");
                        float[] fArrCopyOf = Arrays.copyOf(values, values.length);
                        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
                        Object objMo8337trySendJP2dKIU = produce42.mo8337trySendJP2dKIU(fArrCopyOf);
                        Produce4<float[]> produce43 = produce4;
                        if (objMo8337trySendJP2dKIU instanceof Channel5.Failed) {
                            Throwable thM28805exceptionOrNullimpl = Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU);
                            Timber.INSTANCE.mo3353e("Failed to send onSensorChanged: " + thM28805exceptionOrNullimpl, new Object[0]);
                            Channel9.DefaultImpls.close$default(produce43, null, 1, null);
                        }
                    }
                };
                SensorManager2.this.systemSensorManager.registerListener((SensorEventListener) r4, this.$sensor, this.$samplingPeriodUs, handlerCreateAsync);
                final SensorManager2 sensorManager2 = SensorManager2.this;
                Function0 function0 = new Function0() { // from class: com.robinhood.utils.sensor.DefaultSensorManager$events$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SensorManager2.C419921.invokeSuspend$lambda$1(sensorManager2, r4, handlerThread);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(SensorManager2 sensorManager2, SensorManager3 sensorManager3, HandlerThread handlerThread) {
            sensorManager2.systemSensorManager.unregisterListener(sensorManager3);
            handlerThread.quitSafely();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.utils.sensor.SensorManager
    public Flow<float[]> events(Sensor sensor, int samplingPeriodUs) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
        return FlowKt.conflate(FlowKt.callbackFlow(new C419921(sensor, samplingPeriodUs, null)));
    }

    @Override // com.robinhood.utils.sensor.SensorManager
    public Sensor getDefaultSensor(int type2) {
        return this.systemSensorManager.getDefaultSensor(type2);
    }

    @Override // com.robinhood.utils.sensor.SensorManager
    public void getQuaternionFromVector(float[] quaternion, float[] rotationVector) {
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Intrinsics.checkNotNullParameter(rotationVector, "rotationVector");
        android.hardware.SensorManager.getQuaternionFromVector(quaternion, rotationVector);
    }
}
