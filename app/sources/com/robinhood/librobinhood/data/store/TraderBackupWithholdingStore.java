package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.p280bw.BackupWithholdingApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmountDao;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingInfoSheet;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.WithholdingStatusDao;
import com.robinhood.models.util.Money;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: TraderBackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140#2\u0006\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016J.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140#2\u0006\u0010)\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016J.\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140#2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a0\u0011H\u0016J\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000#H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0019\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a0\u0011\u0012\u0004\u0012\u00020\u001b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u001f\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140 X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010!\u001a&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/base/BackupWithholdingStore;", "bonfireApi", "Lcom/robinhood/api/bw/BackupWithholdingApi;", "withholdingAmountDao", "Lcom/robinhood/models/db/bonfire/WithholdingAmountDao;", "withholdingStatusDao", "Lcom/robinhood/models/db/bonfire/WithholdingStatusDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/bw/BackupWithholdingApi;Lcom/robinhood/models/db/bonfire/WithholdingAmountDao;Lcom/robinhood/models/db/bonfire/WithholdingStatusDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "backupWithholdingStatusEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "estimatedWithholdingAmountEndpoint", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore$EstimatedWithholdingAmountParams;", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "withholdingAmountEndpoint", "", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "withholdingInfoSheetEndpoint", "", "Lcom/robinhood/models/db/bonfire/WithholdingInfoSheet;", "withholdingStatusQuery", "Lcom/robinhood/android/moria/db/Query;", "withholdingAmountQuery", "streamWithholdingStatus", "Lio/reactivex/Observable;", "accountNumber", "instrumentId", "refreshWithholdingStatus", "Lkotlinx/coroutines/Job;", "streamTaxWithholdingEstimatedAmount", "amount", "Ljava/math/BigDecimal;", "pollWithholdingAmount", "params", "pollOrderWithholdingAmount", "Lkotlinx/coroutines/flow/Flow;", "orderStream", "Lcom/robinhood/models/db/Order;", "getTaxWithholdingInfoSheet", "EstimatedWithholdingAmountParams", "lib-store-backup-withholding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderBackupWithholdingStore extends Store implements BackupWithholdingStore {
    private final Endpoint<Tuples2<String, UUID>, Optional<WithholdingStatus>> backupWithholdingStatusEndpoint;
    private final BackupWithholdingApi bonfireApi;
    private final Endpoint<EstimatedWithholdingAmountParams, Optional<WithholdingEstimatedAmount>> estimatedWithholdingAmountEndpoint;
    private final ExperimentsStore experimentsStore;
    private final WithholdingAmountDao withholdingAmountDao;
    private final Endpoint<Tuples2<String, List<UUID>>, WithholdingAmount> withholdingAmountEndpoint;
    private final Query<Tuples2<String, ? extends List<UUID>>, Optional<WithholdingAmount>> withholdingAmountQuery;
    private final Endpoint<Unit, WithholdingInfoSheet> withholdingInfoSheetEndpoint;
    private final WithholdingStatusDao withholdingStatusDao;
    private final Query<Tuples2<String, UUID>, Optional<WithholdingStatus>> withholdingStatusQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderBackupWithholdingStore(BackupWithholdingApi bonfireApi, WithholdingAmountDao withholdingAmountDao, WithholdingStatusDao withholdingStatusDao, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(withholdingAmountDao, "withholdingAmountDao");
        Intrinsics.checkNotNullParameter(withholdingStatusDao, "withholdingStatusDao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.withholdingAmountDao = withholdingAmountDao;
        this.withholdingStatusDao = withholdingStatusDao;
        this.experimentsStore = experimentsStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        TraderBackupWithholdingStore2 traderBackupWithholdingStore2 = new TraderBackupWithholdingStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        TraderBackupWithholdingStore3 traderBackupWithholdingStore3 = new TraderBackupWithholdingStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.backupWithholdingStatusEndpoint = companion.createWithParams(traderBackupWithholdingStore2, logoutKillswitch, traderBackupWithholdingStore3, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.estimatedWithholdingAmountEndpoint = Endpoint.Companion.create$default(companion, new TraderBackupWithholdingStore4(this, null), getLogoutKillswitch(), new TraderBackupWithholdingStore5(null), storeBundle.getClock(), null, 16, null);
        this.withholdingAmountEndpoint = Endpoint.Companion.create$default(companion, new TraderBackupWithholdingStore6(this, null), getLogoutKillswitch(), new TraderBackupWithholdingStore7(this, null), storeBundle.getClock(), null, 16, null);
        this.withholdingInfoSheetEndpoint = Endpoint.Companion.create$default(companion, new TraderBackupWithholdingStore8(this, null), getLogoutKillswitch(), new TraderBackupWithholdingStore9(null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.withholdingStatusQuery = Store.createOptional$default(this, companion2, "streamWithholdingStatus", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderBackupWithholdingStore.withholdingStatusQuery$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderBackupWithholdingStore.withholdingStatusQuery$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.withholdingAmountQuery = Store.createOptional$default(this, companion2, "pollWithholdingAmount", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderBackupWithholdingStore.withholdingAmountQuery$lambda$2(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderBackupWithholdingStore.withholdingAmountQuery$lambda$3(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: TraderBackupWithholdingStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore$EstimatedWithholdingAmountParams;", "", "amount", "Ljava/math/BigDecimal;", "withholdingStatus", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/WithholdingStatus;Ljava/util/UUID;)V", "getAmount", "()Ljava/math/BigDecimal;", "getWithholdingStatus", "()Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-backup-withholding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EstimatedWithholdingAmountParams {
        private final BigDecimal amount;
        private final UUID instrumentId;
        private final WithholdingStatus withholdingStatus;

        public static /* synthetic */ EstimatedWithholdingAmountParams copy$default(EstimatedWithholdingAmountParams estimatedWithholdingAmountParams, BigDecimal bigDecimal, WithholdingStatus withholdingStatus, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = estimatedWithholdingAmountParams.amount;
            }
            if ((i & 2) != 0) {
                withholdingStatus = estimatedWithholdingAmountParams.withholdingStatus;
            }
            if ((i & 4) != 0) {
                uuid = estimatedWithholdingAmountParams.instrumentId;
            }
            return estimatedWithholdingAmountParams.copy(bigDecimal, withholdingStatus, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final WithholdingStatus getWithholdingStatus() {
            return this.withholdingStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final EstimatedWithholdingAmountParams copy(BigDecimal amount, WithholdingStatus withholdingStatus, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(withholdingStatus, "withholdingStatus");
            return new EstimatedWithholdingAmountParams(amount, withholdingStatus, instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EstimatedWithholdingAmountParams)) {
                return false;
            }
            EstimatedWithholdingAmountParams estimatedWithholdingAmountParams = (EstimatedWithholdingAmountParams) other;
            return Intrinsics.areEqual(this.amount, estimatedWithholdingAmountParams.amount) && Intrinsics.areEqual(this.withholdingStatus, estimatedWithholdingAmountParams.withholdingStatus) && Intrinsics.areEqual(this.instrumentId, estimatedWithholdingAmountParams.instrumentId);
        }

        public int hashCode() {
            int iHashCode = ((this.amount.hashCode() * 31) + this.withholdingStatus.hashCode()) * 31;
            UUID uuid = this.instrumentId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "EstimatedWithholdingAmountParams(amount=" + this.amount + ", withholdingStatus=" + this.withholdingStatus + ", instrumentId=" + this.instrumentId + ")";
        }

        public EstimatedWithholdingAmountParams(BigDecimal amount, WithholdingStatus withholdingStatus, UUID uuid) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(withholdingStatus, "withholdingStatus");
            this.amount = amount;
            this.withholdingStatus = withholdingStatus;
            this.instrumentId = uuid;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final WithholdingStatus getWithholdingStatus() {
            return this.withholdingStatus;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job withholdingStatusQuery$lambda$0(TraderBackupWithholdingStore traderBackupWithholdingStore, Tuples2 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.refresh$default(traderBackupWithholdingStore.backupWithholdingStatusEndpoint, params, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow withholdingStatusQuery$lambda$1(TraderBackupWithholdingStore traderBackupWithholdingStore, Tuples2 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return traderBackupWithholdingStore.withholdingStatusDao.getWithholdingStatus((String) params.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow withholdingAmountQuery$lambda$2(TraderBackupWithholdingStore traderBackupWithholdingStore, Tuples2 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(traderBackupWithholdingStore.withholdingAmountEndpoint, params, WithholdingAmount.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow withholdingAmountQuery$lambda$3(TraderBackupWithholdingStore traderBackupWithholdingStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str = (String) tuples2.component1();
        List list = (List) tuples2.component2();
        return traderBackupWithholdingStore.withholdingAmountDao.getWithholdingAmount(str + ";" + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
    }

    @Override // com.robinhood.store.base.BackupWithholdingStore
    public Observable<Optional<WithholdingStatus>> streamWithholdingStatus(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.withholdingStatusQuery.asObservable(new Tuples2<>(accountNumber, instrumentId));
    }

    @Override // com.robinhood.store.base.BackupWithholdingStore
    public Job refreshWithholdingStatus(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.backupWithholdingStatusEndpoint, new Tuples2(accountNumber, instrumentId), true, null, 4, null);
    }

    @Override // com.robinhood.store.base.BackupWithholdingStore
    public Observable<Optional<WithholdingEstimatedAmount>> streamTaxWithholdingEstimatedAmount(final BigDecimal amount, String accountNumber, final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable observableSwitchMap = streamWithholdingStatus(accountNumber, instrumentId).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore.streamTaxWithholdingEstimatedAmount.1

            /* compiled from: TraderBackupWithholdingStore.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$streamTaxWithholdingEstimatedAmount$1$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$streamTaxWithholdingEstimatedAmount$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends WithholdingEstimatedAmount>>, Object> {
                final /* synthetic */ BigDecimal $amount;
                final /* synthetic */ UUID $instrumentId;
                final /* synthetic */ WithholdingStatus $withholdingStatus;
                int label;
                final /* synthetic */ TraderBackupWithholdingStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TraderBackupWithholdingStore traderBackupWithholdingStore, BigDecimal bigDecimal, WithholdingStatus withholdingStatus, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = traderBackupWithholdingStore;
                    this.$amount = bigDecimal;
                    this.$withholdingStatus = withholdingStatus;
                    this.$instrumentId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$amount, this.$withholdingStatus, this.$instrumentId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends WithholdingEstimatedAmount>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<WithholdingEstimatedAmount>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<WithholdingEstimatedAmount>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    Endpoint endpoint = this.this$0.estimatedWithholdingAmountEndpoint;
                    EstimatedWithholdingAmountParams estimatedWithholdingAmountParams = new EstimatedWithholdingAmountParams(this.$amount, this.$withholdingStatus, this.$instrumentId);
                    this.label = 1;
                    Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, estimatedWithholdingAmountParams, null, this, 2, null);
                    return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingEstimatedAmount>> apply(Optional<WithholdingStatus> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                WithholdingStatus withholdingStatusComponent1 = optional.component1();
                if (withholdingStatusComponent1 != null) {
                    TraderBackupWithholdingStore traderBackupWithholdingStore = TraderBackupWithholdingStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(traderBackupWithholdingStore, null, new AnonymousClass1(traderBackupWithholdingStore, amount, withholdingStatusComponent1, instrumentId, null), 1, null).toObservable();
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    @Override // com.robinhood.store.base.BackupWithholdingStore
    public Observable<Optional<WithholdingAmount>> pollWithholdingAmount(Tuples2<String, ? extends List<UUID>> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Observable<Optional<WithholdingAmount>> observableTakeUntil = this.withholdingAmountQuery.asObservable(params).take(3L).takeUntil(new Predicate() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore.pollWithholdingAmount.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Optional<WithholdingAmount> optional) {
                Money amount;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                WithholdingAmount withholdingAmountComponent1 = optional.component1();
                return BigDecimals7.isPositive((withholdingAmountComponent1 == null || (amount = withholdingAmountComponent1.getAmount()) == null) ? null : amount.getDecimalValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    /* compiled from: TraderBackupWithholdingStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1 */
    static final class C343801 extends ContinuationImpl7 implements Function2<Produce4<? super WithholdingAmount>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Order> $orderStream;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ TraderBackupWithholdingStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343801(Observable<Order> observable, TraderBackupWithholdingStore traderBackupWithholdingStore, Continuation<? super C343801> continuation) {
            super(2, continuation);
            this.$orderStream = observable;
            this.this$0 = traderBackupWithholdingStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C343801 c343801 = new C343801(this.$orderStream, this.this$0, continuation);
            c343801.L$0 = obj;
            return c343801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super WithholdingAmount> produce4, Continuation<? super Unit> continuation) {
            return ((C343801) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Order order;
            Produce4 produce42;
            WithholdingStatus withholdingStatus;
            Produce4 produce43;
            Produce4 produce44;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce45 = (Produce4) this.L$0;
                Observable<Order> observable = this.$orderStream;
                this.L$0 = produce45;
                this.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(observable, this);
                if (objAwaitFirst != coroutine_suspended) {
                    produce4 = produce45;
                    obj = objAwaitFirst;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    produce42 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Channel9.DefaultImpls.close$default(produce42, null, 1, null);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i == 4) {
                        produce43 = (Produce4) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        Channel9.DefaultImpls.close$default(produce43, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    produce44 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Channel9.DefaultImpls.close$default(produce44, null, 1, null);
                    return Unit.INSTANCE;
                }
                Order order2 = (Order) this.L$1;
                Produce4 produce46 = (Produce4) this.L$0;
                ResultKt.throwOnFailure(obj);
                order = order2;
                produce4 = produce46;
                withholdingStatus = (WithholdingStatus) obj;
                if (withholdingStatus != null || !withholdingStatus.isWithheld()) {
                    this.L$0 = produce4;
                    this.L$1 = null;
                    this.label = 4;
                    if (produce4.send(null, this) != coroutine_suspended) {
                        produce43 = produce4;
                        Channel9.DefaultImpls.close$default(produce43, null, 1, null);
                        return Unit.INSTANCE;
                    }
                } else {
                    final Flow flowTransformWhile = FlowKt.transformWhile(FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(this.$orderStream), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(order, null)), new AnonymousClass2(null));
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformWhile.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$filter$1$2", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (!((List) obj).isEmpty()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }), new AnonymousClass4(this.this$0, order, null));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(produce4);
                    this.L$0 = produce4;
                    this.L$1 = null;
                    this.label = 5;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass5, this) != coroutine_suspended) {
                        produce44 = produce4;
                        Channel9.DefaultImpls.close$default(produce44, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            Order order3 = (Order) obj;
            if (order3.getSide() == EquityOrderSide.SELL) {
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.streamWithholdingStatus(order3.getAccountNumber(), order3.getInstrument())), Integer.MAX_VALUE, null, 2, null);
                Flow<WithholdingStatus> flow = new Flow<WithholdingStatus>() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super WithholdingStatus> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Object orNull = ((Optional) obj).getOrNull();
                                if (orNull != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                this.L$0 = produce4;
                this.L$1 = order3;
                this.label = 3;
                Object objFirstOrNull = FlowKt.firstOrNull(flow, this);
                if (objFirstOrNull != coroutine_suspended) {
                    order = order3;
                    obj = objFirstOrNull;
                    withholdingStatus = (WithholdingStatus) obj;
                    if (withholdingStatus != null) {
                    }
                    this.L$0 = produce4;
                    this.L$1 = null;
                    this.label = 4;
                    if (produce4.send(null, this) != coroutine_suspended) {
                    }
                }
            } else {
                this.L$0 = produce4;
                this.label = 2;
                if (produce4.send(null, this) != coroutine_suspended) {
                    produce42 = produce4;
                    Channel9.DefaultImpls.close$default(produce42, null, 1, null);
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: TraderBackupWithholdingStore.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FlowCollector<? super Order>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Order $orderInfo;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Order order, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$orderInfo = order;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderInfo, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super Order> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Order order = this.$orderInfo;
                    Intrinsics.checkNotNull(order);
                    this.label = 1;
                    if (flowCollector.emit(order, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: TraderBackupWithholdingStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljava/util/UUID;", "it", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$2", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends UUID>>, Order, Continuation<? super Boolean>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends UUID>> flowCollector, Order order, Continuation<? super Boolean> continuation) {
                return invoke2((FlowCollector<? super List<UUID>>) flowCollector, order, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super List<UUID>> flowCollector, Order order, Continuation<? super Boolean> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = order;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Order order;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Order order2 = (Order) this.L$1;
                    List<UUID> executionIds = order2.getExecutionIds();
                    this.L$0 = order2;
                    this.label = 1;
                    if (flowCollector.emit(executionIds, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    order = order2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    order = (Order) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return boxing.boxBoolean(!order.getState().isFinal());
            }
        }

        /* compiled from: TraderBackupWithholdingStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "executionIds", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<FlowCollector<? super WithholdingAmount>, List<? extends UUID>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Order $orderInfo;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ TraderBackupWithholdingStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(TraderBackupWithholdingStore traderBackupWithholdingStore, Order order, Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
                this.this$0 = traderBackupWithholdingStore;
                this.$orderInfo = order;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super WithholdingAmount> flowCollector, List<? extends UUID> list, Continuation<? super Unit> continuation) {
                return invoke2(flowCollector, (List<UUID>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super WithholdingAmount> flowCollector, List<UUID> list, Continuation<? super Unit> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$orderInfo, continuation);
                anonymousClass4.L$0 = flowCollector;
                anonymousClass4.L$1 = list;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
            
                if (r1.emit(r9, r8) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    final Flow flowAsFlow = this.this$0.withholdingAmountQuery.asFlow(new Tuples2(this.$orderInfo.getAccountNumber(), (List) this.L$1));
                    Flow<WithholdingAmount> flow = new Flow<WithholdingAmount>() { // from class: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super WithholdingAmount> flowCollector2, Continuation continuation) {
                            Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector2), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4$invokeSuspend$$inlined$map$1$2", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Object orNull = ((Optional) obj).getOrNull();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                    this.L$0 = flowCollector;
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flow, anonymousClass2, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 2;
            }

            /* compiled from: TraderBackupWithholdingStore.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4$2", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<WithholdingAmount, Continuation<? super Boolean>, Object> {
                /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(WithholdingAmount withholdingAmount, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass2) create(withholdingAmount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WithholdingAmount withholdingAmount = (WithholdingAmount) this.L$0;
                    return boxing.boxBoolean((withholdingAmount != null ? withholdingAmount.getAmount() : null) != null);
                }
            }
        }

        /* compiled from: TraderBackupWithholdingStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$pollOrderWithholdingAmount$1$5, reason: invalid class name */
        /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function2<WithholdingAmount, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass5(Object obj) {
                super(2, obj, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WithholdingAmount withholdingAmount, Continuation<? super Unit> continuation) {
                return ((Produce4) this.receiver).send(withholdingAmount, continuation);
            }
        }
    }

    @Override // com.robinhood.store.base.BackupWithholdingStore
    public Flow<WithholdingAmount> pollOrderWithholdingAmount(Observable<Order> orderStream) {
        Intrinsics.checkNotNullParameter(orderStream, "orderStream");
        return FlowKt.channelFlow(new C343801(orderStream, this, null));
    }

    /* compiled from: TraderBackupWithholdingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/WithholdingInfoSheet;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$getTaxWithholdingInfoSheet$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$getTaxWithholdingInfoSheet$1 */
    static final class C343791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super WithholdingInfoSheet>, Object> {
        int label;

        C343791(Continuation<? super C343791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderBackupWithholdingStore.this.new C343791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WithholdingInfoSheet> continuation) {
            return ((C343791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint endpoint = TraderBackupWithholdingStore.this.withholdingInfoSheetEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    @Override // com.robinhood.store.base.BackupWithholdingStore
    public Observable<WithholdingInfoSheet> getTaxWithholdingInfoSheet() {
        Observable<WithholdingInfoSheet> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C343791(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }
}
