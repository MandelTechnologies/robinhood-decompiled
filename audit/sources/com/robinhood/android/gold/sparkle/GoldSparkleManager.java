package com.robinhood.android.gold.sparkle;

import android.app.Application;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.view.WindowManager;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.sensor.SensorManager;
import com.robinhood.utils.sensor.SensorManagers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: GoldSparkleManager.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/GoldSparkleManager;", "Lcom/robinhood/android/gold/sparkle/SparkleManager;", "app", "Landroid/app/Application;", "sensorManager", "Lcom/robinhood/utils/sensor/SensorManager;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/app/Application;Lcom/robinhood/utils/sensor/SensorManager;Lkotlinx/coroutines/CoroutineScope;)V", "displayDimensions", "Landroid/util/SizeF;", "getDisplayDimensions$annotations", "()V", "getDisplayDimensions", "()Landroid/util/SizeF;", "translation", "Lkotlinx/coroutines/flow/Flow;", "Landroid/graphics/PointF;", "getTranslation", "()Lkotlinx/coroutines/flow/Flow;", "lib-gold-sparkle_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldSparkleManager implements SparkleManager {
    private final SizeF displayDimensions;
    private final Flow<PointF> translation;

    public static /* synthetic */ void getDisplayDimensions$annotations() {
    }

    public GoldSparkleManager(Application app, SensorManager sensorManager, @RootCoroutineScope CoroutineScope rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Object systemService = app.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.displayDimensions = new SizeF(r0.widthPixels, r0.heightPixels);
        final SizeF displayDimensions = getDisplayDimensions();
        final PointF pointF = new PointF();
        final Flow flowGravity$default = SensorManagers.gravity$default(sensorManager, 0, 1, null);
        this.translation = FlowKt.shareIn(new Flow<PointF>() { // from class: com.robinhood.android.gold.sparkle.GoldSparkleManager$translation$lambda$3$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.gold.sparkle.GoldSparkleManager$translation$lambda$3$$inlined$map$1$2 */
            public static final class C179082<T> implements FlowCollector {
                final /* synthetic */ SizeF $displayDimensions$inlined;
                final /* synthetic */ PointF $point$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.gold.sparkle.GoldSparkleManager$translation$lambda$3$$inlined$map$1$2", m3645f = "GoldSparkleManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.gold.sparkle.GoldSparkleManager$translation$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C179082.this.emit(null, this);
                    }
                }

                public C179082(FlowCollector flowCollector, PointF pointF, SizeF sizeF) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$point$inlined = pointF;
                    this.$displayDimensions$inlined = sizeF;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        float[] fArr = (float[]) obj;
                        float f = fArr[0];
                        float f2 = fArr[1];
                        float fCoerceIn = RangesKt.coerceIn((f / 9.80665f) + 0.5f, 0.0f, 1.0f);
                        float fCoerceIn2 = RangesKt.coerceIn(1.0f - (f2 / 9.80665f), 0.0f, 1.0f);
                        PointF pointF = this.$point$inlined;
                        pointF.x = fCoerceIn * this.$displayDimensions$inlined.getWidth();
                        pointF.y = fCoerceIn2 * this.$displayDimensions$inlined.getHeight();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(pointF, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super PointF> flowCollector, Continuation continuation) {
                Object objCollect = flowGravity$default.collect(new C179082(flowCollector, pointF, displayDimensions), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, rootCoroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
    }

    @Override // com.robinhood.android.gold.sparkle.SparkleManager
    public SizeF getDisplayDimensions() {
        return this.displayDimensions;
    }

    @Override // com.robinhood.android.gold.sparkle.SparkleManager
    public Flow<PointF> getTranslation() {
        return this.translation;
    }
}
