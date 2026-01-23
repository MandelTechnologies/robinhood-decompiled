package com.robinhood.android.rhy.referral.fund.select;

import com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectEvent;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSelectDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectDataState;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectViewState;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectEvent;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "stateProvider", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "onClickPill", "hasFundingSource", "", "pill", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectPill;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralFundSelectDuxo extends BaseDuxo3<RhyReferralFundSelectDataState, RhyReferralFundSelectViewState, RhyReferralFundSelectEvent> {
    public static final int $stable = 8;
    private final TransferAccountStore transferAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralFundSelectDuxo(TransferAccountStore transferAccountStore, RhyReferralFundSelectStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyReferralFundSelectDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transferAccountStore = transferAccountStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.transferAccountStore.refresh(true);
        Observable<List<TransferAccount>> observableDistinctUntilChanged = this.transferAccountStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundSelectDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyReferralFundSelectDuxo rhyReferralFundSelectDuxo, List list) {
        rhyReferralFundSelectDuxo.applyMutation(new RhyReferralFundSelectDuxo2(list, null));
        return Unit.INSTANCE;
    }

    public final void onClickPill(boolean hasFundingSource, RhyReferralFundSelectPill pill) {
        Intrinsics.checkNotNullParameter(pill, "pill");
        TransferConfiguration.Standard standard = new TransferConfiguration.Standard(pill.getAmount(), ApiCreateTransferRequest2.ONCE, false, null, new TransferConfiguration.TransferAccountSelection(null, true, ApiTransferAccount.TransferAccountType.RHY, 1, null), new ApiCreateTransferRequest.ApiPostTransferPageConfig(CollectionsKt.listOf((Object[]) new ApiPostTransferPage.PostTransferPageType[]{ApiPostTransferPage.PostTransferPageType.TIMELINE, ApiPostTransferPage.PostTransferPageType.CONFIRMATION, ApiPostTransferPage.PostTransferPageType.CONFIRMATION_WITH_DISCLAIMER, ApiPostTransferPage.PostTransferPageType.DETAIL_CONFIRMATION, ApiPostTransferPage.PostTransferPageType.INSTANT_AVAILABILITY})), null, null, false, true, null, null, false, 7628, null);
        if (hasFundingSource) {
            submit(new RhyReferralFundSelectEvent.ShowTransfer(standard));
        } else {
            submit(new RhyReferralFundSelectEvent.ShowAddFundingSource(standard));
        }
    }
}
