package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.dao.DepositScheduleDao;
import com.robinhood.models.p320db.DepositSchedule;
import com.robinhood.models.p320db.DepositSchedule2;
import com.robinhood.models.p355ui.UiDepositSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.LocalDate;

/* compiled from: DepositScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R,\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020%0$\u0012\u0004\u0012\u00020&0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020&0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R)\u00101\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/cashier/Cashier;", "cashier", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/DepositScheduleDao;", "dao", "<init>", "(Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/DepositScheduleDao;)V", "Lio/reactivex/Observable;", "Lcom/robinhood/api/utils/Metadata;", "getMetadata", "()Lio/reactivex/Observable;", "Ljava/util/UUID;", "achRhId", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lio/reactivex/Single;", "Lcom/robinhood/models/db/DepositSchedule;", "createDepositSchedule", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;)Lio/reactivex/Single;", "", "depositScheduleId", "updateDepositSchedule", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;)Lio/reactivex/Single;", "Lcom/robinhood/android/api/cashier/Cashier;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/models/dao/DepositScheduleDao;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiDepositSchedule$Request;", "Lcom/robinhood/models/api/ApiDepositSchedule;", "updateDepositScheduleEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "postDepositSchedule", "Lcom/robinhood/api/PaginatedEndpoint;", "", "getAllDepositSchedules", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/ui/UiDepositSchedule;", "streamDepositSchedules", "Lcom/robinhood/android/moria/db/Query;", "getStreamDepositSchedules", "()Lcom/robinhood/android/moria/db/Query;", "lib-store-direct-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class DepositScheduleStore extends Store {
    private final AccountProvider accountProvider;
    private final Cashier cashier;
    private final DepositScheduleDao dao;
    private final PaginatedEndpoint<Unit, ApiDepositSchedule> getAllDepositSchedules;
    private final PostEndpoint<ApiDepositSchedule.Request, ApiDepositSchedule> postDepositSchedule;
    private final Query<Unit, List<UiDepositSchedule>> streamDepositSchedules;
    private final PostEndpoint<Tuples2<String, ApiDepositSchedule.Request>, ApiDepositSchedule> updateDepositScheduleEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositScheduleStore(Cashier cashier, AccountProvider accountProvider, StoreBundle storeBundle, DepositScheduleDao dao) {
        super(storeBundle, DepositSchedule.INSTANCE);
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.cashier = cashier;
        this.accountProvider = accountProvider;
        this.dao = dao;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.updateDepositScheduleEndpoint = companion.create(new DepositScheduleStore6(this, null), new DepositScheduleStore7(this, null));
        this.postDepositSchedule = companion.create(new DepositScheduleStore4(cashier), new DepositScheduleStore5(this, null));
        this.getAllDepositSchedules = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new DepositScheduleStore2(this, null), getLogoutKillswitch(), new DepositScheduleStore3(dao), storeBundle.getClock(), null, 16, null);
        this.streamDepositSchedules = Store.create$default(this, Query.INSTANCE, "streamDepositSchedules", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.DepositScheduleStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositScheduleStore.streamDepositSchedules$lambda$0((Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getAllDepositSchedules$insert(DepositScheduleDao depositScheduleDao, PaginatedResult paginatedResult, Continuation continuation) {
        depositScheduleDao.insert((PaginatedResult<ApiDepositSchedule>) paginatedResult);
        return Unit.INSTANCE;
    }

    public final Query<Unit, List<UiDepositSchedule>> getStreamDepositSchedules() {
        return this.streamDepositSchedules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamDepositSchedules$lambda$0(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.flowOf(CollectionsKt.emptyList());
    }

    public final Observable<com.robinhood.api.utils.Metadata> getMetadata() {
        return getNetworkWrapper().getMetadata(Store.KEY_DEFAULT);
    }

    /* compiled from: DepositScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/DepositSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DepositScheduleStore$createDepositSchedule$1", m3645f = "DepositScheduleStore.kt", m3646l = {101, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.DepositScheduleStore$createDepositSchedule$1 */
    static final class C337961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DepositSchedule>, Object> {
        final /* synthetic */ UUID $achRhId;
        final /* synthetic */ Money $amount;
        final /* synthetic */ ApiDepositSchedule.Frequency $frequency;
        final /* synthetic */ LocalDate $startDate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337961(UUID uuid, Money money, ApiDepositSchedule.Frequency frequency, LocalDate localDate, Continuation<? super C337961> continuation) {
            super(2, continuation);
            this.$achRhId = uuid;
            this.$amount = money;
            this.$frequency = frequency;
            this.$startDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DepositScheduleStore.this.new C337961(this.$achRhId, this.$amount, this.$frequency, this.$startDate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DepositSchedule> continuation) {
            return ((C337961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (r14 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(DepositScheduleStore.this.accountProvider.mo22580getActiveAccountNumber());
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableFilterIsPresent, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DepositSchedule2.toDbModel((ApiDepositSchedule) obj);
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            PostEndpoint postEndpoint = DepositScheduleStore.this.postDepositSchedule;
            ApiDepositSchedule.FundingRelationship fundingRelationship = null;
            ApiDepositSchedule.Request request = new ApiDepositSchedule.Request(str, this.$amount, this.$frequency, this.$achRhId.toString(), fundingRelationship, this.$startDate, ApiDepositSchedule.State.ACTIVE, 16, null);
            this.label = 2;
            obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, this, 2, null);
        }
    }

    public final Single<DepositSchedule> createDepositSchedule(UUID achRhId, Money amount, ApiDepositSchedule.Frequency frequency, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(achRhId, "achRhId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337961(achRhId, amount, frequency, startDate, null), 1, null);
    }

    /* compiled from: DepositScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/DepositSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DepositScheduleStore$updateDepositSchedule$1", m3645f = "DepositScheduleStore.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.DepositScheduleStore$updateDepositSchedule$1 */
    static final class C337971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DepositSchedule>, Object> {
        final /* synthetic */ String $depositScheduleId;
        final /* synthetic */ ApiDepositSchedule.Frequency $frequency;
        final /* synthetic */ LocalDate $startDate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337971(String str, ApiDepositSchedule.Frequency frequency, LocalDate localDate, Continuation<? super C337971> continuation) {
            super(2, continuation);
            this.$depositScheduleId = str;
            this.$frequency = frequency;
            this.$startDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DepositScheduleStore.this.new C337971(this.$depositScheduleId, this.$frequency, this.$startDate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DepositSchedule> continuation) {
            return ((C337971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objPost$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = DepositScheduleStore.this.updateDepositScheduleEndpoint;
                Tuples2 tuples2 = new Tuples2(this.$depositScheduleId, new ApiDepositSchedule.Request(null, null, this.$frequency, null, null, this.$startDate, ApiDepositSchedule.State.ACTIVE, 27, null));
                this.label = 1;
                objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2, null, this, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objPost$default = obj;
            }
            return DepositSchedule2.toDbModel((ApiDepositSchedule) objPost$default);
        }
    }

    public final Single<DepositSchedule> updateDepositSchedule(String depositScheduleId, ApiDepositSchedule.Frequency frequency, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(depositScheduleId, "depositScheduleId");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337971(depositScheduleId, frequency, startDate, null), 1, null);
    }
}
