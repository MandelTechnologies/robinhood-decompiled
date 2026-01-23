package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ChartComponents.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$Content$3$1", m3645f = "ChartComponents.kt", m3646l = {156}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class PianoKeysAnnotation$Content$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $barCount;
    final /* synthetic */ List<PianoKeysAnnotation.BarState> $barStates;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $horizontalAnim;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PianoKeysAnnotation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PianoKeysAnnotation$Content$3$1(Animatable<Float, AnimationVectors2> animatable, int i, PianoKeysAnnotation pianoKeysAnnotation, List<PianoKeysAnnotation.BarState> list, Continuation<? super PianoKeysAnnotation$Content$3$1> continuation) {
        super(2, continuation);
        this.$horizontalAnim = animatable;
        this.$barCount = i;
        this.this$0 = pianoKeysAnnotation;
        this.$barStates = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PianoKeysAnnotation$Content$3$1 pianoKeysAnnotation$Content$3$1 = new PianoKeysAnnotation$Content$3$1(this.$horizontalAnim, this.$barCount, this.this$0, this.$barStates, continuation);
        pianoKeysAnnotation$Content$3$1.L$0 = obj;
        return pianoKeysAnnotation$Content$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PianoKeysAnnotation$Content$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final Animatable<Float, AnimationVectors2> animatable = this.$horizontalAnim;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$Content$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(PianoKeysAnnotation$Content$3$1.invokeSuspend$lambda$0(animatable));
                }
            });
            final int i2 = this.$barCount;
            final PianoKeysAnnotation pianoKeysAnnotation = this.this$0;
            final List<PianoKeysAnnotation.BarState> list = this.$barStates;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$Content$3$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).floatValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(float f, Continuation<? super Unit> continuation) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        float fCoerceIn = RangesKt.coerceIn(pianoKeysAnnotation.getPercentile5Points().get(i3).getX(), 0.0f, 1.0f);
                        PianoKeysAnnotation.BarState barState = list.get(i3);
                        if (!barState.getStarted() && f >= fCoerceIn) {
                            barState.setStarted(true);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(barState, null), 3, null);
                        }
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: ChartComponents.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$Content$3$1$2$1", m3645f = "ChartComponents.kt", m3646l = {165, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.projection.chart.PianoKeysAnnotation$Content$3$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PianoKeysAnnotation.BarState $barState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PianoKeysAnnotation.BarState barState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$barState = barState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$barState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
                    
                        if (androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, null, null, r11, 12, null) == r0) goto L15;
                     */
                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (DelayKt.delay(20L, this) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVectors2> verticalAnim = this.$barState.getVerticalAnim();
                        Float fBoxFloat = boxing.boxFloat(1.0f);
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                        this.label = 2;
                    }
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    public static final float invokeSuspend$lambda$0(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue();
    }
}
