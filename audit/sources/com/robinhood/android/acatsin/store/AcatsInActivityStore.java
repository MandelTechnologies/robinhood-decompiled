package com.robinhood.android.acatsin.store;

import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssetRequest;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Deferred;

/* compiled from: AcatsInActivityStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "Lcom/robinhood/store/Store;", "acatsBrokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsPlaidStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;Lcom/robinhood/store/StoreBundle;)V", "availableAccountsSharedStream", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getAvailableAccountsSharedStream", "()Lio/reactivex/Observable;", "fetchAvailableDestinations", "Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAvailableDestinations", "Lio/reactivex/Completable;", "plaidBrokerAssets", "", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssetRequest;", "Lkotlinx/coroutines/Deferred;", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "getPlaidBrokerAssets", "rhsAccountNumber", "", "contraAccountNumber", "accessTokenId", "forceRefresh", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInActivityStore extends Store {
    public static final int $stable = 8;
    private final AcatsBrokerageStore acatsBrokerageStore;
    private final AcatsPlaidStore acatsPlaidStore;
    private final Observable<List<AvailableAccount>> availableAccountsSharedStream;
    private final Map<PlaidBrokerAssetRequest, Deferred<PlaidBrokerAssets>> plaidBrokerAssets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInActivityStore(AcatsBrokerageStore acatsBrokerageStore, AcatsPlaidStore acatsPlaidStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
        Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.acatsBrokerageStore = acatsBrokerageStore;
        this.acatsPlaidStore = acatsPlaidStore;
        Observable<List<AvailableAccount>> observableAutoConnect = acatsBrokerageStore.getAvailableAccounts().replay(1).autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        this.availableAccountsSharedStream = observableAutoConnect;
        this.plaidBrokerAssets = new LinkedHashMap();
    }

    public final Observable<List<AvailableAccount>> getAvailableAccountsSharedStream() {
        return this.availableAccountsSharedStream;
    }

    public final Object fetchAvailableDestinations(Continuation<? super ApiAvailableDestinationsResponse> continuation) {
        return this.acatsBrokerageStore.getAvailableDestinations(continuation);
    }

    public final Completable refreshAvailableDestinations() {
        return this.acatsBrokerageStore.refreshAvailableDestinations();
    }

    public static /* synthetic */ Deferred getPlaidBrokerAssets$default(AcatsInActivityStore acatsInActivityStore, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return acatsInActivityStore.getPlaidBrokerAssets(str, str2, str3, z);
    }

    public final Deferred<PlaidBrokerAssets> getPlaidBrokerAssets(String rhsAccountNumber, String contraAccountNumber, String accessTokenId, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(accessTokenId, "accessTokenId");
        try {
            PlaidBrokerAssetRequest plaidBrokerAssetRequest = new PlaidBrokerAssetRequest(rhsAccountNumber, contraAccountNumber, accessTokenId);
            Deferred<PlaidBrokerAssets> deferred = this.plaidBrokerAssets.get(plaidBrokerAssetRequest);
            if (forceRefresh) {
                deferred = null;
            }
            Deferred<PlaidBrokerAssets> deferredAsync$default = deferred;
            if (deferredAsync$default == null) {
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(getStoreScope(), null, null, new AcatsInActivityStore2(this, plaidBrokerAssetRequest, null), 3, null);
            }
            this.plaidBrokerAssets.put(plaidBrokerAssetRequest, deferredAsync$default);
            return deferredAsync$default;
        } catch (Exception e) {
            CrashReporter.INSTANCE.reportNonFatal(new RuntimeException("Failed to fetch Plaid assets", e), true, new EventMetadata(SentryTeam.EQUITIES, MapsKt.mapOf(Tuples4.m3642to("plaidTokenId", accessTokenId)), null, 4, null));
            return CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        }
    }
}
