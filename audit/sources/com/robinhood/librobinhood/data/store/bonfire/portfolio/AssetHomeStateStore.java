package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.AssetHomeApi;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.AssetHomeStateDao;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AssetHomeStateStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AssetHomeStateStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/android/models/portfolio/AssetHomeStateDao;", "assetHomeApi", "Lcom/robinhood/android/api/portfolio/AssetHomeApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/portfolio/AssetHomeStateDao;Lcom/robinhood/android/api/portfolio/AssetHomeApi;Lcom/robinhood/store/StoreBundle;)V", "stateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AssetHomeStateStore$AssetHomeKey;", "Lcom/robinhood/android/models/portfolio/AssetHomeState;", "stateQuery", "Lcom/robinhood/android/moria/db/Query;", "streamAssetHomeState", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "AssetHomeKey", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AssetHomeStateStore extends Store {
    private final AssetHomeStateDao dao;
    private final Endpoint<AssetHomeKey, AssetHomeState> stateEndpoint;
    private final Query<AssetHomeKey, AssetHomeState> stateQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetHomeStateStore(AssetHomeStateDao dao, AssetHomeApi assetHomeApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(assetHomeApi, "assetHomeApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        AssetHomeStateStore2 assetHomeStateStore2 = new AssetHomeStateStore2(dao);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.stateEndpoint = companion.create(new AssetHomeStateStore3(assetHomeApi, null), logoutKillswitch, assetHomeStateStore2, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.stateQuery = Store.create$default(this, Query.INSTANCE, "queryAssetHomeState", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetHomeStateStore.stateQuery$lambda$0(this.f$0, (AssetHomeStateStore.AssetHomeKey) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetHomeStateStore.stateQuery$lambda$1(this.f$0, (AssetHomeStateStore.AssetHomeKey) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object stateEndpoint$insert(AssetHomeStateDao assetHomeStateDao, AssetHomeState assetHomeState, Continuation continuation) {
        assetHomeStateDao.insert(assetHomeState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow stateQuery$lambda$0(AssetHomeStateStore assetHomeStateStore, AssetHomeKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<AssetHomeKey, AssetHomeState> endpoint = assetHomeStateStore.stateEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow stateQuery$lambda$1(AssetHomeStateStore assetHomeStateStore, AssetHomeKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(assetHomeStateStore.dao.streamAssetHomeState(it.getAccountNumber(), it.getAssetType()));
    }

    public final Flow<AssetHomeState> streamAssetHomeState(String accountNumber, AssetType assetType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return this.stateQuery.asFlow(new AssetHomeKey(accountNumber, assetType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AssetHomeStateStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AssetHomeStateStore$AssetHomeKey;", "", "accountNumber", "", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AssetType;)V", "getAccountNumber", "()Ljava/lang/String;", "getAssetType", "()Lcom/robinhood/android/models/portfolio/api/AssetType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class AssetHomeKey {
        private final String accountNumber;
        private final AssetType assetType;

        public static /* synthetic */ AssetHomeKey copy$default(AssetHomeKey assetHomeKey, String str, AssetType assetType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetHomeKey.accountNumber;
            }
            if ((i & 2) != 0) {
                assetType = assetHomeKey.assetType;
            }
            return assetHomeKey.copy(str, assetType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final AssetType getAssetType() {
            return this.assetType;
        }

        public final AssetHomeKey copy(String accountNumber, AssetType assetType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            return new AssetHomeKey(accountNumber, assetType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetHomeKey)) {
                return false;
            }
            AssetHomeKey assetHomeKey = (AssetHomeKey) other;
            return Intrinsics.areEqual(this.accountNumber, assetHomeKey.accountNumber) && this.assetType == assetHomeKey.assetType;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.assetType.hashCode();
        }

        public String toString() {
            return "AssetHomeKey(accountNumber=" + this.accountNumber + ", assetType=" + this.assetType + ")";
        }

        public AssetHomeKey(String accountNumber, AssetType assetType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.accountNumber = accountNumber;
            this.assetType = assetType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AssetType getAssetType() {
            return this.assetType;
        }
    }
}
