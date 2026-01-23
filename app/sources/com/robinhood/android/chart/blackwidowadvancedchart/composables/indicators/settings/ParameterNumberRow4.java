package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ParameterNumberRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2$2$1", m3645f = "ParameterNumberRow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ParameterNumberRow4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $focused$delegate;
    final /* synthetic */ BigDecimal $min;
    final /* synthetic */ int $scale;
    final /* synthetic */ long $selection;
    final /* synthetic */ Function1<SettingsKeyboardState, Unit> $showKeyboard;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ParameterNumberRow4(Function1<? super SettingsKeyboardState, Unit> function1, int i, long j, BigDecimal bigDecimal, SnapshotState<Boolean> snapshotState, Continuation<? super ParameterNumberRow4> continuation) {
        super(2, continuation);
        this.$showKeyboard = function1;
        this.$scale = i;
        this.$selection = j;
        this.$min = bigDecimal;
        this.$focused$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ParameterNumberRow4(this.$showKeyboard, this.$scale, this.$selection, this.$min, this.$focused$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ParameterNumberRow4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (ParameterNumberRow3.C108562.invoke$lambda$1(this.$focused$delegate)) {
                Function1<SettingsKeyboardState, Unit> function1 = this.$showKeyboard;
                boolean z = false;
                boolean z2 = this.$scale > 1;
                if (TextRange.m7641getEndimpl(this.$selection) == 0 && TextRange.m7646getStartimpl(this.$selection) == 0 && BigDecimals7.isNegative(this.$min)) {
                    z = true;
                }
                function1.invoke(new Open(z2, z));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
