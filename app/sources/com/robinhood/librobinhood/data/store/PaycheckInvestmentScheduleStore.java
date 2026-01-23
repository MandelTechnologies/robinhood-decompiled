package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.Reactor;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.dao.PaycheckInvestmentScheduleDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaycheckInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u001eJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "Lcom/robinhood/store/Store;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/PaycheckInvestmentScheduleDao;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/recurring/models/dao/PaycheckInvestmentScheduleDao;)V", "rhyDirectDepositRelationshipsRefreshEach", "Lcom/robinhood/android/moria/db/reactor/RefreshEach;", "", "investmentSchedulesRefreshEach", "paycheckInvestmentSchedulesQuery", "Lcom/robinhood/android/moria/db/Query;", "", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "hasPaycheckInvestmentSchedulesQuery", "", "paycheckInvestmentScheduleByIdQuery", "Ljava/util/UUID;", "getPaycheckInvestmentScheduleByIdQuery", "()Lcom/robinhood/android/moria/db/Query;", "paycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery", "getPaycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery", "getPaycheckInvestmentSchedules", "Lio/reactivex/Observable;", "hasPaycheckInvestmentSchedules", "getPaycheckInvestmentSchedulesWithoutDirectDepositRelationship", "refresh", "Lkotlinx/coroutines/Job;", "force", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PaycheckInvestmentScheduleStore extends Store {
    private final PaycheckInvestmentScheduleDao dao;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final Query<Unit, Boolean> hasPaycheckInvestmentSchedulesQuery;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final RefreshEach<Object> investmentSchedulesRefreshEach;
    private final Query<UUID, UiPaycheckInvestmentSchedule> paycheckInvestmentScheduleByIdQuery;
    private final Query<Unit, List<UiPaycheckInvestmentSchedule>> paycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery;
    private final Query<Unit, List<UiPaycheckInvestmentSchedule>> paycheckInvestmentSchedulesQuery;
    private final RefreshEach<Object> rhyDirectDepositRelationshipsRefreshEach;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckInvestmentScheduleStore(DirectDepositRelationshipStore directDepositRelationshipStore, TraderInvestmentScheduleStore investmentScheduleStore, StoreBundle storeBundle, PaycheckInvestmentScheduleDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.dao = dao;
        RefreshEach<Object> refreshEach = new RefreshEach<>(new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.rhyDirectDepositRelationshipsRefreshEach$lambda$0(this.f$0, obj);
            }
        });
        this.rhyDirectDepositRelationshipsRefreshEach = refreshEach;
        RefreshEach<Object> refreshEach2 = new RefreshEach<>(new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.investmentSchedulesRefreshEach$lambda$1(this.f$0, obj);
            }
        });
        this.investmentSchedulesRefreshEach = refreshEach2;
        Query.Companion companion = Query.INSTANCE;
        this.paycheckInvestmentSchedulesQuery = Store.create$default(this, companion, "paycheckInvestmentSchedulesQuery", CollectionsKt.listOf((Object[]) new PollEach[]{new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.paycheckInvestmentSchedulesQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }), new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.paycheckInvestmentSchedulesQuery$lambda$3(this.f$0, (Unit) obj);
            }
        })}), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.paycheckInvestmentSchedulesQuery$lambda$4(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.hasPaycheckInvestmentSchedulesQuery = Store.create$default(this, companion, "paycheckInvestmentSchedulesQuery", CollectionsKt.listOf((Object[]) new RefreshEach[]{refreshEach, refreshEach2}), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.hasPaycheckInvestmentSchedulesQuery$lambda$5(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.paycheckInvestmentScheduleByIdQuery = Store.create$default(this, companion, "paycheckInvestmentSchedulesQuery", CollectionsKt.listOf((Object[]) new Reactor[]{new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.paycheckInvestmentScheduleByIdQuery$lambda$6(this.f$0, (UUID) obj);
            }
        }), new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.paycheckInvestmentScheduleByIdQuery$lambda$7(this.f$0, (UUID) obj);
            }
        })}), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.paycheckInvestmentScheduleByIdQuery$lambda$8(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.paycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery = Store.create$default(this, companion, "paycheckInvestmentSchedulesQuery", CollectionsKt.listOf((Object[]) new RefreshEach[]{refreshEach, refreshEach2}), new Function1() { // from class: com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckInvestmentScheduleStore.m2621x35cbee67(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job rhyDirectDepositRelationshipsRefreshEach$lambda$0(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.directDepositRelationshipStore.refresh(RhEntity.RHY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job investmentSchedulesRefreshEach$lambda$1(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.investmentScheduleStore.refresh(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckInvestmentSchedulesQuery$lambda$2(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.directDepositRelationshipStore.poll(RhEntity.RHY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckInvestmentSchedulesQuery$lambda$3(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.investmentScheduleStore.pollIndividualAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckInvestmentSchedulesQuery$lambda$4(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.dao.getPaycheckInvestmentSchedules();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow hasPaycheckInvestmentSchedulesQuery$lambda$5(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(paycheckInvestmentScheduleStore.dao.getHasPaycheckInvestmentSchedules());
    }

    public final Query<UUID, UiPaycheckInvestmentSchedule> getPaycheckInvestmentScheduleByIdQuery() {
        return this.paycheckInvestmentScheduleByIdQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckInvestmentScheduleByIdQuery$lambda$6(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.directDepositRelationshipStore.poll(RhEntity.RHY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job paycheckInvestmentScheduleByIdQuery$lambda$7(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return paycheckInvestmentScheduleStore.investmentScheduleStore.refresh(false, id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow paycheckInvestmentScheduleByIdQuery$lambda$8(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.filterNotNull(paycheckInvestmentScheduleStore.dao.getPaycheckInvestmentScheduleById(id));
    }

    /* renamed from: getPaycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery */
    public final Query<Unit, List<UiPaycheckInvestmentSchedule>> m2622x8305fe43() {
        return this.paycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: paycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery$lambda$9 */
    public static final Flow m2621x35cbee67(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paycheckInvestmentScheduleStore.dao.getPaycheckInvestmentSchedulesWithoutDirectDepositRelationship();
    }

    public final Observable<List<UiPaycheckInvestmentSchedule>> getPaycheckInvestmentSchedules() {
        return this.paycheckInvestmentSchedulesQuery.asObservable(Unit.INSTANCE);
    }

    public final Observable<Boolean> hasPaycheckInvestmentSchedules() {
        return this.hasPaycheckInvestmentSchedulesQuery.asObservable(Unit.INSTANCE);
    }

    public final Observable<List<UiPaycheckInvestmentSchedule>> getPaycheckInvestmentSchedulesWithoutDirectDepositRelationship() {
        return this.paycheckInvestmentScheduleWithoutDirectDepositRelationshipQuery.asObservable(Unit.INSTANCE);
    }

    public final Job refresh(boolean force) {
        return this.investmentScheduleStore.refresh(force);
    }
}
