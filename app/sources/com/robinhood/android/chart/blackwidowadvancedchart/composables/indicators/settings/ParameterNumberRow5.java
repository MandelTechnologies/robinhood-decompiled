package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.utils.math.BigDecimals7;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ParameterNumberRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2$3$1", m3645f = "ParameterNumberRow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ParameterNumberRow5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
    final /* synthetic */ int $scale;
    final /* synthetic */ double $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ParameterNumberRow5(Function1<? super TextFieldValue, Unit> function1, double d, int i, Continuation<? super ParameterNumberRow5> continuation) {
        super(2, continuation);
        this.$onValueChange = function1;
        this.$value = d;
        this.$scale = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ParameterNumberRow5(this.$onValueChange, this.$value, this.$scale, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ParameterNumberRow5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<TextFieldValue, Unit> function1 = this.$onValueChange;
        String plainString = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.toBigDecimal(boxing.boxDouble(this.$value)).setScale(this.$scale)).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        function1.invoke(new TextFieldValue(plainString, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
