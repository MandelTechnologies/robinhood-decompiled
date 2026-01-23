package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.paging.PagedList;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: MerchantRewardHistoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryViewState;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryStore;)V", "onCreate", "", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantRewardHistoryDuxo extends OldBaseDuxo<MerchantRewardHistoryViewState> {
    public static final int $stable = 8;
    private final HistoryStore historyStore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardHistoryDuxo(HistoryStore historyStore) {
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Object[] objArr = 0 == true ? 1 : 0;
        super(new MerchantRewardHistoryViewState(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0);
        this.historyStore = historyStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        HistoryStore historyStore = this.historyStore;
        Observable observableJust = Observable.just(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableJust2 = Observable.just(SetsKt.setOf(HistoryTransactionType.MERCHANT_REWARD));
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Observable observableJust3 = Observable.just(Instant.EPOCH);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        Observable observableThrottleLatest = HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, null, 0, 56, null).throttleLatest(350L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableThrottleLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardHistoryDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardHistoryDuxo.onCreate$lambda$1(this.f$0, (PagedList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MerchantRewardHistoryDuxo merchantRewardHistoryDuxo, final PagedList pagedList) {
        merchantRewardHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardHistoryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardHistoryDuxo.onCreate$lambda$1$lambda$0(pagedList, (MerchantRewardHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantRewardHistoryViewState onCreate$lambda$1$lambda$0(PagedList pagedList, MerchantRewardHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(pagedList);
    }
}
