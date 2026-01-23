package com.robinhood.android.swipetodismiss;

import androidx.compose.p011ui.unit.Density;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Swipeable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.swipetodismiss.SwipeableKt$swipeable$4$3$1", m3645f = "Swipeable.kt", m3646l = {633}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class SwipeableKt$swipeable$4$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ Density $density;
    final /* synthetic */ boolean $flingEnabled;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableKt$swipeable$4$3$1(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, boolean z, Density density, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f, Continuation<? super SwipeableKt$swipeable$4$3$1> continuation) {
        super(2, continuation);
        this.$state = swipeableState;
        this.$anchors = map;
        this.$resistance = resistanceConfig;
        this.$flingEnabled = z;
        this.$density = density;
        this.$thresholds = function2;
        this.$velocityThreshold = f;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeableKt$swipeable$4$3$1(this.$state, this.$anchors, this.$resistance, this.$flingEnabled, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeableKt$swipeable$4$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Map anchors$lib_swipe_to_dismiss_externalDebug = this.$state.getAnchors$lib_swipe_to_dismiss_externalDebug();
            this.$state.setAnchors$lib_swipe_to_dismiss_externalDebug(this.$anchors);
            this.$state.setResistance$lib_swipe_to_dismiss_externalDebug(this.$resistance);
            SwipeableState<T> swipeableState = this.$state;
            final Map<Float, T> map = this.$anchors;
            final Function2<T, T, ThresholdConfig> function2 = this.$thresholds;
            final Density density = this.$density;
            swipeableState.setThresholds$lib_swipe_to_dismiss_externalDebug(new Function2() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$swipeable$4$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Float.valueOf(SwipeableKt$swipeable$4$3$1.invokeSuspend$lambda$1(map, function2, density, ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                }
            });
            this.$state.setFlingEnabled$lib_swipe_to_dismiss_externalDebug(this.$flingEnabled);
            this.$state.setVelocityThreshold$lib_swipe_to_dismiss_externalDebug(this.$density.mo5016toPx0680j_4(this.$velocityThreshold));
            SwipeableState<T> swipeableState2 = this.$state;
            Object obj2 = this.$anchors;
            this.label = 1;
            if (swipeableState2.processNewAnchors$lib_swipe_to_dismiss_externalDebug(anchors$lib_swipe_to_dismiss_externalDebug, obj2, this) == coroutine_suspended) {
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
    public static final float invokeSuspend$lambda$1(Map map, Function2 function2, Density density, float f, float f2) {
        return ((ThresholdConfig) function2.invoke(MapsKt.getValue(map, Float.valueOf(f)), MapsKt.getValue(map, Float.valueOf(f2)))).computeThreshold(density, f, f2);
    }
}
