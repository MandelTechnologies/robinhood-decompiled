package com.robinhood.android.event.gamedetail.components;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ComboWheelPicker.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$3$1", m3645f = "ComboWheelPicker.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ComboWheelPicker3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ ImmutableList<String> $items;
    final /* synthetic */ ComboWheelPicker7 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComboWheelPicker3(ComboWheelPicker7 comboWheelPicker7, ImmutableList<String> immutableList, HapticFeedback hapticFeedback, Continuation<? super ComboWheelPicker3> continuation) {
        super(2, continuation);
        this.$state = comboWheelPicker7;
        this.$items = immutableList;
        this.$haptic = hapticFeedback;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComboWheelPicker3(this.$state, this.$items, this.$haptic, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ComboWheelPicker3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ComboWheelPicker7 comboWheelPicker7 = this.$state;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(ComboWheelPicker3.invokeSuspend$lambda$0(comboWheelPicker7));
                }
            });
            C163062 c163062 = new C163062(this.$items, this.$state, this.$haptic, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowSnapshotFlow, c163062, this) == coroutine_suspended) {
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

    /* compiled from: ComboWheelPicker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "offset", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$3$1$2", m3645f = "ComboWheelPicker.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$3$1$2 */
    static final class C163062 extends ContinuationImpl7 implements Function2<Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ HapticFeedback $haptic;
        final /* synthetic */ ImmutableList<String> $items;
        final /* synthetic */ ComboWheelPicker7 $state;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C163062(ImmutableList<String> immutableList, ComboWheelPicker7 comboWheelPicker7, HapticFeedback hapticFeedback, Continuation<? super C163062> continuation) {
            super(2, continuation);
            this.$items = immutableList;
            this.$state = comboWheelPicker7;
            this.$haptic = hapticFeedback;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C163062 c163062 = new C163062(this.$items, this.$state, this.$haptic, continuation);
            c163062.F$0 = ((Number) obj).floatValue();
            return c163062;
        }

        public final Object invoke(float f, Continuation<? super Unit> continuation) {
            return ((C163062) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(this.F$0 / 110.0f), 0, CollectionsKt.getLastIndex(this.$items));
            if (this.$state.getSelectedIndexState$feature_game_detail_externalDebug().getValue().intValue() != iCoerceIn) {
                this.$state.getSelectedIndexState$feature_game_detail_externalDebug().setValue(boxing.boxInt(iCoerceIn));
                this.$haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7048getSegmentFrequentTick5zf0vsI());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$0(ComboWheelPicker7 comboWheelPicker7) {
        return comboWheelPicker7.getScrollOffset$feature_game_detail_externalDebug().getValue().floatValue();
    }
}
