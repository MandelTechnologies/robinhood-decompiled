package com.robinhood.android.crypto.p094ui.historicalchart;

import androidx.compose.runtime.SnapshotState4;
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

/* compiled from: CryptoHistoricalChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$CryptoHistoricalChartComposable$4$1", m3645f = "CryptoHistoricalChartComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$CryptoHistoricalChartComposable$4$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHistoricalChartComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onPriceString;
    final /* synthetic */ SnapshotState4<CryptoHistoricalChartViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CryptoHistoricalChartComposable4(SnapshotState4<CryptoHistoricalChartViewState> snapshotState4, Function1<? super String, Unit> function1, Continuation<? super CryptoHistoricalChartComposable4> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$onPriceString = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHistoricalChartComposable4(this.$viewState$delegate, this.$onPriceString, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoHistoricalChartComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String headerString = CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$2(this.$viewState$delegate).getHeaderString();
            if (headerString != null) {
                this.$onPriceString.invoke(headerString);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
