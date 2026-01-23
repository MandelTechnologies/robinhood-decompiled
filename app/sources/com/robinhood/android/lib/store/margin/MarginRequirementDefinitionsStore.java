package com.robinhood.android.lib.store.margin;

import com.robinhood.android.lib.store.margin.MarginRequirementDefinitionsStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.dao.bonfire.instrument.MarginRequirementDefinitionDao;
import com.robinhood.models.p320db.MarginRequirements;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginRequirementDefinitionsStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginRequirementDefinitionsStore;", "Lcom/robinhood/store/Store;", "bonfire", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/instrument/MarginRequirementDefinitionDao;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/instrument/MarginRequirementDefinitionDao;)V", "marginRequirementEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/lib/store/margin/MarginRequirementDefinitionsStore$MarginRequirementParams;", "Lcom/robinhood/models/db/MarginRequirements;", "stream", "Lcom/robinhood/android/moria/db/Query;", "streamMarginDefinitions", "Lio/reactivex/Observable;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "MarginRequirementParams", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginRequirementDefinitionsStore extends Store {
    private final BonfireApi bonfire;
    private final MarginRequirementDefinitionDao dao;
    private final Endpoint<MarginRequirementParams, MarginRequirements> marginRequirementEndpoint;
    private final Query<MarginRequirementParams, MarginRequirements> stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginRequirementDefinitionsStore(BonfireApi bonfire2, StoreBundle storeBundle, MarginRequirementDefinitionDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfire = bonfire2;
        this.dao = dao;
        this.marginRequirementEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MarginRequirementDefinitionsStore2(this, null), getLogoutKillswitch(), new MarginRequirementDefinitionsStore3(dao), storeBundle.getClock(), null, 16, null);
        this.stream = Store.create$default(this, Query.INSTANCE, "streamMarginDefinitions", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginRequirementDefinitionsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginRequirementDefinitionsStore.stream$lambda$0(this.f$0, (MarginRequirementDefinitionsStore.MarginRequirementParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginRequirementDefinitionsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginRequirementDefinitionsStore.stream$lambda$1(this.f$0, (MarginRequirementDefinitionsStore.MarginRequirementParams) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: MarginRequirementDefinitionsStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginRequirementDefinitionsStore$MarginRequirementParams;", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginRequirementParams {
        private final String accountNumber;
        private final UUID instrumentId;

        public static /* synthetic */ MarginRequirementParams copy$default(MarginRequirementParams marginRequirementParams, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = marginRequirementParams.instrumentId;
            }
            if ((i & 2) != 0) {
                str = marginRequirementParams.accountNumber;
            }
            return marginRequirementParams.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final MarginRequirementParams copy(UUID instrumentId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new MarginRequirementParams(instrumentId, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginRequirementParams)) {
                return false;
            }
            MarginRequirementParams marginRequirementParams = (MarginRequirementParams) other;
            return Intrinsics.areEqual(this.instrumentId, marginRequirementParams.instrumentId) && Intrinsics.areEqual(this.accountNumber, marginRequirementParams.accountNumber);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "MarginRequirementParams(instrumentId=" + this.instrumentId + ", accountNumber=" + this.accountNumber + ")";
        }

        public MarginRequirementParams(UUID instrumentId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.accountNumber = accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object marginRequirementEndpoint$insert(MarginRequirementDefinitionDao marginRequirementDefinitionDao, MarginRequirements marginRequirements, Continuation continuation) {
        marginRequirementDefinitionDao.insert((MarginRequirementDefinitionDao) marginRequirements);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow stream$lambda$0(MarginRequirementDefinitionsStore marginRequirementDefinitionsStore, MarginRequirementParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(marginRequirementDefinitionsStore.marginRequirementEndpoint, params, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow stream$lambda$1(MarginRequirementDefinitionsStore marginRequirementDefinitionsStore, MarginRequirementParams marginRequirementParams) {
        Intrinsics.checkNotNullParameter(marginRequirementParams, "<destruct>");
        return marginRequirementDefinitionsStore.dao.getMarginDefinitions(marginRequirementParams.getInstrumentId(), marginRequirementParams.getAccountNumber());
    }

    public final Observable<MarginRequirements> streamMarginDefinitions(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.stream.asObservable(new MarginRequirementParams(instrumentId, accountNumber));
    }
}
