package com.robinhood.librobinhood.data.store;

import com.robinhood.android.equity.TaxLotsRegionGate;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.api.ApiTaxLotEligibility;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.TaxLotEligibilityDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.TaxLotEligibility;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: TaxLotEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001bJ*\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0014\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TaxLotEligibilityDao;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/TaxLotEligibilityDao;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/lib/account/AccountProvider;)V", "singleTaxLotEligibilityEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/ApiTaxLotEligibility;", "streamTaxLotEligibility", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/TaxLotEligibility;", "isAccountEligible", "", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxLotPositionEligibility", "Lkotlinx/coroutines/flow/Flow;", "instrumentId", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TaxLotEligibilityStore extends Store {
    private final AccountProvider accountProvider;
    private final EquitiesBrokeback brokeback;
    private final TaxLotEligibilityDao dao;
    private final RegionGateProvider regionGateProvider;
    private final Endpoint<Tuples2<UUID, String>, ApiTaxLotEligibility> singleTaxLotEligibilityEndpoint;
    private final Query<Tuples2<UUID, String>, Optional<TaxLotEligibility>> streamTaxLotEligibility;

    /* compiled from: TaxLotEligibilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TaxLotEligibilityStore", m3645f = "TaxLotEligibilityStore.kt", m3646l = {76}, m3647m = "getTaxLotPositionEligibility")
    /* renamed from: com.robinhood.librobinhood.data.store.TaxLotEligibilityStore$getTaxLotPositionEligibility$1 */
    static final class C343621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C343621(Continuation<? super C343621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaxLotEligibilityStore.this.getTaxLotPositionEligibility(null, null, this);
        }
    }

    /* compiled from: TaxLotEligibilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TaxLotEligibilityStore", m3645f = "TaxLotEligibilityStore.kt", m3646l = {63, 85}, m3647m = "isAccountEligible")
    /* renamed from: com.robinhood.librobinhood.data.store.TaxLotEligibilityStore$isAccountEligible$1 */
    static final class C343631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C343631(Continuation<? super C343631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaxLotEligibilityStore.this.isAccountEligible(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotEligibilityStore(StoreBundle storeBundle, TaxLotEligibilityDao dao, EquitiesBrokeback brokeback, RegionGateProvider regionGateProvider, AccountProvider accountProvider) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        this.dao = dao;
        this.brokeback = brokeback;
        this.regionGateProvider = regionGateProvider;
        this.accountProvider = accountProvider;
        this.singleTaxLotEligibilityEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new TaxLotEligibilityStore2(this, null), getLogoutKillswitch(), new TaxLotEligibilityStore3(dao), storeBundle.getClock(), null, 16, null);
        this.streamTaxLotEligibility = Store.createOptional$default(this, Query.INSTANCE, "streamTaxLotEligibility", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxLotEligibilityStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxLotEligibilityStore.streamTaxLotEligibility$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxLotEligibilityStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxLotEligibilityStore.streamTaxLotEligibility$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object singleTaxLotEligibilityEndpoint$insert(TaxLotEligibilityDao taxLotEligibilityDao, ApiTaxLotEligibility apiTaxLotEligibility, Continuation continuation) {
        taxLotEligibilityDao.insert(apiTaxLotEligibility);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamTaxLotEligibility$lambda$0(TaxLotEligibilityStore taxLotEligibilityStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return Endpoint.DefaultImpls.poll$default(taxLotEligibilityStore.singleTaxLotEligibilityEndpoint, new Tuples2((UUID) tuples2.component1(), (String) tuples2.component2()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamTaxLotEligibility$lambda$1(TaxLotEligibilityStore taxLotEligibilityStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return taxLotEligibilityStore.dao.stream((UUID) tuples2.component1(), (String) tuples2.component2());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isAccountEligible(String str, Continuation<? super Boolean> continuation) {
        C343631 c343631;
        BrokerageAccountType brokerageAccountType;
        if (continuation instanceof C343631) {
            c343631 = (C343631) continuation;
            int i = c343631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343631.label = i - Integer.MIN_VALUE;
            } else {
                c343631 = new C343631(continuation);
            }
        }
        C343631 c3436312 = c343631;
        Object regionGateState$default = c3436312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3436312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            RegionGateProvider regionGateProvider = this.regionGateProvider;
            TaxLotsRegionGate taxLotsRegionGate = TaxLotsRegionGate.INSTANCE;
            c3436312.L$0 = str;
            c3436312.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, taxLotsRegionGate, false, c3436312, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(regionGateState$default);
            Account account = (Account) regionGateState$default;
            boolean z = (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null || brokerageAccountType.isRetirement()) ? false : true;
            return boxing.boxBoolean(z);
        }
        str = (String) c3436312.L$0;
        ResultKt.throwOnFailure(regionGateState$default);
        if (((Boolean) regionGateState$default).booleanValue()) {
            Observable<Account> observableStreamAccount = this.accountProvider.streamAccount(str);
            c3436312.L$0 = null;
            c3436312.label = 2;
            regionGateState$default = RxAwait3.awaitFirstOrNull(observableStreamAccount, c3436312);
        }
        return boxing.boxBoolean(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTaxLotPositionEligibility(UUID uuid, String str, Continuation<? super Flow<? extends Optional<TaxLotEligibility>>> continuation) {
        C343621 c343621;
        if (continuation instanceof C343621) {
            c343621 = (C343621) continuation;
            int i = c343621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343621.label = i - Integer.MIN_VALUE;
            } else {
                c343621 = new C343621(continuation);
            }
        }
        Object objIsAccountEligible = c343621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsAccountEligible);
            c343621.L$0 = uuid;
            c343621.L$1 = str;
            c343621.label = 1;
            objIsAccountEligible = isAccountEligible(str, c343621);
            if (objIsAccountEligible == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c343621.L$1;
            uuid = (UUID) c343621.L$0;
            ResultKt.throwOnFailure(objIsAccountEligible);
        }
        if (!((Boolean) objIsAccountEligible).booleanValue()) {
            return FlowKt.flowOf(Optional2.INSTANCE);
        }
        return this.streamTaxLotEligibility.asFlow(new Tuples2<>(uuid, str));
    }
}
