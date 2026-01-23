package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssetRequest;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidAccountNumberResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenRequest;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsPlaidLinkTokenQueryParams;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "Lcom/robinhood/store/Store;", "acatsApi", "Lcom/robinhood/android/acats/api/AcatsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/acats/api/AcatsApi;Lcom/robinhood/store/StoreBundle;)V", "plaidLinkTokenEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsPlaidLinkTokenQueryParams;", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenResponse;", "plaidLinkTokenPostEndpoint", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenRequest;", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidAccountNumberResponse;", "plaidBrokerAssetsEndpoint", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssetRequest;", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "getPlaidLinkToken", "rhAccountNumber", "", "contraDtccNumber", "plaidInstitutionId", "androidPackageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPlaidLinkToken", "request", "(Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaidBrokerAssets", "(Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AcatsPlaidStore extends Store {
    private final AcatsApi acatsApi;
    private final Endpoint<PlaidBrokerAssetRequest, PlaidBrokerAssets> plaidBrokerAssetsEndpoint;
    private final Endpoint<ApiAcatsPlaidLinkTokenQueryParams, ApiAcatsInPlaidTokenResponse> plaidLinkTokenEndpoint;
    private final Endpoint<ApiAcatsInPlaidTokenRequest, ApiAcatsInPlaidAccountNumberResponse> plaidLinkTokenPostEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsPlaidStore(AcatsApi acatsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(acatsApi, "acatsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.acatsApi = acatsApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.plaidLinkTokenEndpoint = Endpoint.Companion.create$default(companion, new AcatsPlaidStore4(this, null), getLogoutKillswitch(), new AcatsPlaidStore5(null), storeBundle.getClock(), null, 16, null);
        this.plaidLinkTokenPostEndpoint = Endpoint.Companion.create$default(companion, new AcatsPlaidStore6(this, null), getLogoutKillswitch(), new AcatsPlaidStore7(null), storeBundle.getClock(), null, 16, null);
        this.plaidBrokerAssetsEndpoint = Endpoint.Companion.create$default(companion, new AcatsPlaidStore2(this, null), getLogoutKillswitch(), new AcatsPlaidStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object getPlaidLinkToken(String str, String str2, String str3, String str4, Continuation<? super ApiAcatsInPlaidTokenResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.plaidLinkTokenEndpoint, new ApiAcatsPlaidLinkTokenQueryParams(str, str2, str3, str4), null, continuation, 2, null);
    }

    public final Object postPlaidLinkToken(ApiAcatsInPlaidTokenRequest apiAcatsInPlaidTokenRequest, Continuation<? super ApiAcatsInPlaidAccountNumberResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.plaidLinkTokenPostEndpoint, apiAcatsInPlaidTokenRequest, null, continuation, 2, null);
    }

    public final Object getPlaidBrokerAssets(PlaidBrokerAssetRequest plaidBrokerAssetRequest, Continuation<? super PlaidBrokerAssets> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.plaidBrokerAssetsEndpoint, plaidBrokerAssetRequest, null, continuation, 2, null);
    }
}
