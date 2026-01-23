package com.robinhood.android.tradingtrends.p264ui.moreinfo;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingTrendsMoreInfoScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$TradingTrendsMoreInfoScreen$1$1", m3645f = "TradingTrendsMoreInfoScreen.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$TradingTrendsMoreInfoScreen$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TradingTrendsMoreInfoScreen4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<String> $moreInfoMarkdown$delegate;
    final /* synthetic */ TradingTrendsCachedService $tradingTrendsService;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TradingTrendsMoreInfoScreen4(TradingTrendsCachedService tradingTrendsCachedService, SnapshotState<String> snapshotState, Continuation<? super TradingTrendsMoreInfoScreen4> continuation) {
        super(2, continuation);
        this.$tradingTrendsService = tradingTrendsCachedService;
        this.$moreInfoMarkdown$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingTrendsMoreInfoScreen4(this.$tradingTrendsService, this.$moreInfoMarkdown$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradingTrendsMoreInfoScreen4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SnapshotState<String> snapshotState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (TradingTrendsMoreInfoScreen3.TradingTrendsMoreInfoScreen$lambda$1(this.$moreInfoMarkdown$delegate) == null) {
                SnapshotState<String> snapshotState2 = this.$moreInfoMarkdown$delegate;
                TradingTrendsCachedService tradingTrendsCachedService = this.$tradingTrendsService;
                this.L$0 = snapshotState2;
                this.label = 1;
                Object moreInfo = tradingTrendsCachedService.getMoreInfo(this);
                if (moreInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                snapshotState = snapshotState2;
                obj = moreInfo;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snapshotState = (SnapshotState) this.L$0;
        ResultKt.throwOnFailure(obj);
        snapshotState.setValue((String) obj);
        return Unit.INSTANCE;
    }
}
