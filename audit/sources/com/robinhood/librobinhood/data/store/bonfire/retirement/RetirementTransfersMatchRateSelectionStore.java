package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchAgreements;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRowResponse;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionSubmitRequest;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementTransfersMatchRateSelectionStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionContributions;", "submitEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionSubmitRequest;", "", "goldMatchSelectionRowEndpoint", "Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRowResponse;", "goldMatchAgreementsEndpoint", "Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchAgreements;", "getTransfersMatchRateSelectionViewModels", "entryPoint", "(Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitRetirementMatchRateSelectionInTransfers", CarResultComposable2.BODY, "(Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionSubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldMatchSelectionRow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldMatchAgreements", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RetirementTransfersMatchRateSelectionStore extends Store {
    private final Endpoint<ApiMatchRateSelection6, ApiMatchRateSelectionContributions> endpoint;
    private final Endpoint<Unit, ApiGoldMatchAgreements> goldMatchAgreementsEndpoint;
    private final Endpoint<Unit, ApiGoldMatchSelectionRowResponse> goldMatchSelectionRowEndpoint;
    private final RetirementApi retirementApi;
    private final PostEndpoint<ApiMatchRateSelectionSubmitRequest, Unit> submitEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementTransfersMatchRateSelectionStore(RetirementApi retirementApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.endpoint = Endpoint.Companion.create$default(companion, new RetirementTransfersMatchRateSelectionStore2(this, null), getLogoutKillswitch(), new RetirementTransfersMatchRateSelectionStore3(null), storeBundle.getClock(), null, 16, null);
        this.submitEndpoint = PostEndpoint.INSTANCE.create(new RetirementTransfersMatchRateSelectionStore8(this, null), new RetirementTransfersMatchRateSelectionStore9(null));
        this.goldMatchSelectionRowEndpoint = Endpoint.Companion.create$default(companion, new RetirementTransfersMatchRateSelectionStore6(this, null), getLogoutKillswitch(), new RetirementTransfersMatchRateSelectionStore7(null), storeBundle.getClock(), null, 16, null);
        this.goldMatchAgreementsEndpoint = Endpoint.Companion.create$default(companion, new RetirementTransfersMatchRateSelectionStore4(this, null), getLogoutKillswitch(), new RetirementTransfersMatchRateSelectionStore5(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object getTransfersMatchRateSelectionViewModels(ApiMatchRateSelection6 apiMatchRateSelection6, Continuation<? super ApiMatchRateSelectionContributions> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.endpoint, apiMatchRateSelection6, null, continuation, 2, null);
    }

    public final Object submitRetirementMatchRateSelectionInTransfers(ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest, Continuation<? super Unit> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.submitEndpoint, apiMatchRateSelectionSubmitRequest, null, continuation, 2, null);
    }

    public final Object getGoldMatchSelectionRow(Continuation<? super ApiGoldMatchSelectionRowResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.goldMatchSelectionRowEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Object getGoldMatchAgreements(Continuation<? super ApiGoldMatchAgreements> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.goldMatchAgreementsEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }
}
