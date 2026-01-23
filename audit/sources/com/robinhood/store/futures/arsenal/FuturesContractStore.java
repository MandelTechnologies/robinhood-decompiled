package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesContractDao;
import com.robinhood.android.models.futures.arsenal.dao.FuturesProductDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.arsenal.proto.p281v1.idl.AccountTypeDto;
import com.robinhood.arsenal.proto.p281v1.idl.GetMarginRequirementRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.MarginTypeDto;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.Uuids;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.LocalDate;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011J'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0*0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R2\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140$8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b.\u0010&\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R>\u00103\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140*0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010&R,\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010)R2\u00105\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010)R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010&R \u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001e0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010)¨\u0006:"}, m3636d2 = {"Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "arsenalService", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesContractDao;", "futuresContractDao", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;", "futuresProductDao", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Lcom/robinhood/android/models/futures/arsenal/dao/FuturesContractDao;Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "contractId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "streamFuturesContract", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;", "streamUiFuturesContract", "", "contractIds", "streamUiFuturesContracts", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "j$/time/LocalDate", "since", "streamRelatedFutureContracts", "(Ljava/util/UUID;Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Account;", "individualAccount", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "streamMarginRequirement", "(Ljava/util/UUID;Lcom/robinhood/models/db/Account;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesContractDao;", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;", "Lcom/robinhood/android/moria/network/Endpoint;", "futuresContractEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "futuresContractQuery", "Lcom/robinhood/android/moria/db/Query;", "Lkotlin/Pair;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "combinedContractAndProductEndpoint", "uiFuturesContractQuery", "relatedFuturesContractEndpoint", "getRelatedFuturesContractEndpoint$lib_store_futures_externalDebug", "()Lcom/robinhood/android/moria/network/Endpoint;", "getRelatedFuturesContractEndpoint$lib_store_futures_externalDebug$annotations", "()V", "multiContractAndProductEndpoint", "multiUiContractQuery", "relatedFuturesContractsQuery", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "marginRequirementEndpoint", "getMarginRequirementQuery", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesContractStore extends Store {
    public static final long NUM_DAYS_SINCE_EXPIRATION_FOR_DISPLAY = 30;
    private final InstrumentService arsenalService;
    private final Endpoint<UUID, Tuples2<FuturesContract, FuturesProduct>> combinedContractAndProductEndpoint;
    private final FuturesContractDao futuresContractDao;
    private final Endpoint<UUID, FuturesContract> futuresContractEndpoint;
    private final Query<UUID, FuturesContract> futuresContractQuery;
    private final FuturesProductDao futuresProductDao;
    private final Query<GetMarginRequirementRequestDto, FuturesMarginRequirement> getMarginRequirementQuery;
    private final Endpoint<GetMarginRequirementRequestDto, FuturesMarginRequirement> marginRequirementEndpoint;
    private final Endpoint<List<UUID>, Tuples2<List<FuturesContract>, List<FuturesProduct>>> multiContractAndProductEndpoint;
    private final Query<List<UUID>, List<UiFuturesContract>> multiUiContractQuery;
    private final Endpoint<UUID, List<FuturesContract>> relatedFuturesContractEndpoint;
    private final Query<Tuples2<UUID, LocalDate>, List<FuturesContract>> relatedFuturesContractsQuery;
    private final Query<UUID, UiFuturesContract> uiFuturesContractQuery;

    /* renamed from: getRelatedFuturesContractEndpoint$lib_store_futures_externalDebug$annotations */
    public static /* synthetic */ void m2962xa38c705f() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesContractStore(InstrumentService arsenalService, FuturesContractDao futuresContractDao, FuturesProductDao futuresProductDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(arsenalService, "arsenalService");
        Intrinsics.checkNotNullParameter(futuresContractDao, "futuresContractDao");
        Intrinsics.checkNotNullParameter(futuresProductDao, "futuresProductDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.arsenalService = arsenalService;
        this.futuresContractDao = futuresContractDao;
        this.futuresProductDao = futuresProductDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        FuturesContractStore$futuresContractEndpoint$1 futuresContractStore$futuresContractEndpoint$1 = new FuturesContractStore$futuresContractEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        FuturesContractStore$futuresContractEndpoint$2 futuresContractStore$futuresContractEndpoint$2 = new FuturesContractStore$futuresContractEndpoint$2(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        Endpoint<UUID, FuturesContract> endpointCreate = companion.create(futuresContractStore$futuresContractEndpoint$1, logoutKillswitch, futuresContractStore$futuresContractEndpoint$2, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.futuresContractEndpoint = endpointCreate;
        Query.Companion companion2 = Query.INSTANCE;
        this.futuresContractQuery = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesContract", CollectionsKt.listOf(new RefreshEach(new FuturesContractStore$futuresContractQuery$1(endpointCreate))), new FuturesContractStore$futuresContractQuery$2(futuresContractDao), false, 16, null);
        FuturesContractStore$combinedContractAndProductEndpoint$1 futuresContractStore$combinedContractAndProductEndpoint$1 = new FuturesContractStore$combinedContractAndProductEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch2 = storeBundle.getLogoutKillswitch();
        FuturesContractStore$combinedContractAndProductEndpoint$2 futuresContractStore$combinedContractAndProductEndpoint$2 = new FuturesContractStore$combinedContractAndProductEndpoint$2(this, null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfMinutes2 = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
        Endpoint<UUID, Tuples2<FuturesContract, FuturesProduct>> endpointCreate2 = companion.create(futuresContractStore$combinedContractAndProductEndpoint$1, logoutKillswitch2, futuresContractStore$combinedContractAndProductEndpoint$2, clock2, new DefaultStaleDecider(durationOfMinutes2, storeBundle.getClock()));
        this.combinedContractAndProductEndpoint = endpointCreate2;
        this.uiFuturesContractQuery = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryUiFuturesContract", CollectionsKt.listOf(new RefreshEach(new FuturesContractStore$uiFuturesContractQuery$1(endpointCreate2))), new FuturesContractStore$uiFuturesContractQuery$2(futuresContractDao), false, 16, null);
        FuturesContractStore$relatedFuturesContractEndpoint$1 futuresContractStore$relatedFuturesContractEndpoint$1 = new FuturesContractStore$relatedFuturesContractEndpoint$1(arsenalService);
        LogoutKillswitch logoutKillswitch3 = storeBundle.getLogoutKillswitch();
        FuturesContractStore$relatedFuturesContractEndpoint$2 futuresContractStore$relatedFuturesContractEndpoint$2 = new FuturesContractStore$relatedFuturesContractEndpoint$2(futuresContractDao);
        Clock clock3 = storeBundle.getClock();
        Duration durationOfMinutes3 = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes3, "ofMinutes(...)");
        this.relatedFuturesContractEndpoint = companion.create(futuresContractStore$relatedFuturesContractEndpoint$1, logoutKillswitch3, futuresContractStore$relatedFuturesContractEndpoint$2, clock3, new DefaultStaleDecider(durationOfMinutes3, storeBundle.getClock()));
        FuturesContractStore$multiContractAndProductEndpoint$1 futuresContractStore$multiContractAndProductEndpoint$1 = new FuturesContractStore$multiContractAndProductEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch4 = getLogoutKillswitch();
        FuturesContractStore$multiContractAndProductEndpoint$2 futuresContractStore$multiContractAndProductEndpoint$2 = new FuturesContractStore$multiContractAndProductEndpoint$2(this, null);
        Clock clock4 = storeBundle.getClock();
        Duration durationOfMinutes4 = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes4, "ofMinutes(...)");
        Endpoint<List<UUID>, Tuples2<List<FuturesContract>, List<FuturesProduct>>> endpointCreate3 = companion.create(futuresContractStore$multiContractAndProductEndpoint$1, logoutKillswitch4, futuresContractStore$multiContractAndProductEndpoint$2, clock4, new DefaultStaleDecider(durationOfMinutes4, storeBundle.getClock()));
        this.multiContractAndProductEndpoint = endpointCreate3;
        this.multiUiContractQuery = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryMultiUiFuturesContract", CollectionsKt.listOf(new RefreshEach(new FuturesContractStore$multiUiContractQuery$1(endpointCreate3))), new FuturesContractStore$multiUiContractQuery$2(futuresContractDao), false, 16, null);
        this.relatedFuturesContractsQuery = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryRelatedFuturesContracts", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.arsenal.FuturesContractStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesContractStore.relatedFuturesContractsQuery$lambda$2(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.arsenal.FuturesContractStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesContractStore.relatedFuturesContractsQuery$lambda$3(this.f$0, (Tuples2) obj);
            }
        }, false, 16, null);
        FuturesContractStore$marginRequirementEndpoint$1 futuresContractStore$marginRequirementEndpoint$1 = new FuturesContractStore$marginRequirementEndpoint$1(this, null);
        LogoutKillswitch logoutKillswitch5 = getLogoutKillswitch();
        FuturesContractStore$marginRequirementEndpoint$2 futuresContractStore$marginRequirementEndpoint$2 = new FuturesContractStore$marginRequirementEndpoint$2(this, null);
        Clock clock5 = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.marginRequirementEndpoint = companion.create(futuresContractStore$marginRequirementEndpoint$1, logoutKillswitch5, futuresContractStore$marginRequirementEndpoint$2, clock5, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
        this.getMarginRequirementQuery = Store.create$default(this, companion2, "getMarginRequirement", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.arsenal.FuturesContractStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesContractStore.getMarginRequirementQuery$lambda$4(this.f$0, (GetMarginRequirementRequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.arsenal.FuturesContractStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesContractStore.getMarginRequirementQuery$lambda$5(this.f$0, (GetMarginRequirementRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* renamed from: getRelatedFuturesContractEndpoint$lib_store_futures_externalDebug */
    public final Endpoint<UUID, List<FuturesContract>> m2963x21e34a5f() {
        return this.relatedFuturesContractEndpoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object relatedFuturesContractEndpoint$insert(FuturesContractDao futuresContractDao, Iterable iterable, Continuation continuation) {
        futuresContractDao.insert(iterable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job relatedFuturesContractsQuery$lambda$2(FuturesContractStore futuresContractStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return Endpoint.DefaultImpls.refresh$default(futuresContractStore.relatedFuturesContractEndpoint, (UUID) tuples2.component1(), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow relatedFuturesContractsQuery$lambda$3(FuturesContractStore futuresContractStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UUID uuid = (UUID) tuples2.component1();
        LocalDate localDateMinusDays = ((LocalDate) tuples2.component2()).minusDays(30L);
        return futuresContractStore.futuresContractDao.getRelatedFuturesContractsQuery(uuid, localDateMinusDays.getYear() + StringsKt.padStart(String.valueOf(localDateMinusDays.getMonth().getValue()), 2, '0'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getMarginRequirementQuery$lambda$4(FuturesContractStore futuresContractStore, GetMarginRequirementRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(futuresContractStore.marginRequirementEndpoint, request, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getMarginRequirementQuery$lambda$5(FuturesContractStore futuresContractStore, GetMarginRequirementRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return futuresContractStore.futuresContractDao.getMarginRequirement(com.robinhood.utils.extensions.StringsKt.toUuid(it.getContract_id()));
    }

    public final Flow<FuturesContract> streamFuturesContract(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.distinctUntilChanged(this.futuresContractQuery.asFlow(contractId));
    }

    public final Flow<UiFuturesContract> streamUiFuturesContract(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.distinctUntilChanged(this.uiFuturesContractQuery.asFlow(contractId));
    }

    public final Flow<List<UiFuturesContract>> streamUiFuturesContracts(List<UUID> contractIds) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        return FlowKt.distinctUntilChanged(this.multiUiContractQuery.asFlow(contractIds));
    }

    public static /* synthetic */ Flow streamRelatedFutureContracts$default(FuturesContractStore futuresContractStore, UUID uuid, LocalDate localDate, int i, Object obj) {
        if ((i & 2) != 0) {
            localDate = LocalDate.now(ZoneIds.INSTANCE.getUTC());
        }
        return futuresContractStore.streamRelatedFutureContracts(uuid, localDate);
    }

    public final Flow<List<FuturesContract>> streamRelatedFutureContracts(UUID contractId, LocalDate since) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(since, "since");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.take(streamFuturesContract(contractId), 1), new C41490x78277fa6(null, this, since)));
    }

    public final Flow<FuturesMarginRequirement> streamMarginRequirement(UUID contractId, Account individualAccount) {
        AccountTypeDto accountTypeDto;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(individualAccount, "individualAccount");
        boolean zIsMargin = individualAccount.isMargin();
        Account.MarginBalances marginBalances = individualAccount.getMarginBalances();
        boolean z = (marginBalances != null ? marginBalances.getMarginLimit() : null) != null;
        String strSafeToString = Uuids.safeToString(contractId);
        if (zIsMargin && z) {
            accountTypeDto = AccountTypeDto.ACCOUNT_TYPE_MARGIN_LIMITED;
        } else if (zIsMargin && !z) {
            accountTypeDto = AccountTypeDto.ACCOUNT_TYPE_MARGIN_NO_LIMIT;
        } else {
            accountTypeDto = AccountTypeDto.ACCOUNT_TYPE_CASH;
        }
        return this.getMarginRequirementQuery.asFlow(new GetMarginRequirementRequestDto(strSafeToString, MarginTypeDto.MARGIN_TYPE_OVERNIGHT, accountTypeDto));
    }
}
