package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.models.util.Money;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onCreate$buyingPowerObservable$2, reason: use source file name */
/* loaded from: classes9.dex */
final class RecommendationsOrderDuxo4<T> implements Consumer {
    final /* synthetic */ RecommendationsOrderDuxo this$0;

    RecommendationsOrderDuxo4(RecommendationsOrderDuxo recommendationsOrderDuxo) {
        this.this$0 = recommendationsOrderDuxo;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Money money) {
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onCreate$buyingPowerObservable$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo4.accept$lambda$0((RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState accept$lambda$0(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }
}
