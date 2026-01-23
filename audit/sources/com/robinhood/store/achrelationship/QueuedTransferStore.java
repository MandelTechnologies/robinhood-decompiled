package com.robinhood.store.achrelationship;

import android.annotation.SuppressLint;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.retrofit.Iav;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.prefs.HasQueuedDepositPref;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.api.ApiQueuedIavDeposit;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: QueuedTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001bH\u0002J\u009a\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0018\u0010+\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030-\u0012\u0004\u0012\u00020.\u0018\u00010,2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.\u0018\u00010,2\u0018\u00101\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030-\u0012\u0004\u0012\u00020.\u0018\u00010,2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.\u0018\u00010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "hasQueuedDepositPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "iavStore", "Lcom/robinhood/store/achrelationship/IavStore;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "iav", "Lcom/robinhood/api/retrofit/Iav;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/store/achrelationship/IavStore;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/api/retrofit/Iav;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "hasQueuedDeposit", "", "refreshQueuedDeposit", "", "forcedGetHasQueuedDeposit", "Lio/reactivex/Single;", "rhAccountType", "Lcom/robinhood/models/api/cashier/RhAccountType;", "setHasQueuedDeposit", "postQueuedIavDeposit", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/AchRelationship;", "accessToken", "", PlaidExchangeTokenFragment.ARG_IAV_ACCOUNT_ID, "amount", "Ljava/math/BigDecimal;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "queuedDepositSuccessEventSupplier", "Lkotlin/Function1;", "Lretrofit2/Response;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "queuedDepositErrorEventSupplier", "", "achRelationshipSuccessEventSupplier", "achRelationshipErrorEventSupplier", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class QueuedTransferStore extends Store {
    private final AccountProvider accountProvider;
    private final Cashier cashier;
    private final BooleanPreference hasQueuedDepositPref;
    private final Iav iav;
    private final IavStore iavStore;
    private final RhyAccountStore rhyAccountStore;
    private final BaseSortingHatStore sortingHatStore;
    private final TransfersBonfireApi transfersBonfireApi;
    private final UserStore userStore;

    /* compiled from: QueuedTransferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhAccountType.values().length];
            try {
                iArr[RhAccountType.RHS_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhAccountType.RHY_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueuedTransferStore(StoreBundle storeBundle, @HasQueuedDepositPref BooleanPreference hasQueuedDepositPref, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, IavStore iavStore, Cashier cashier, Iav iav, UserStore userStore, BaseSortingHatStore sortingHatStore, TransfersBonfireApi transfersBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(iavStore, "iavStore");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(iav, "iav");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        this.hasQueuedDepositPref = hasQueuedDepositPref;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.iavStore = iavStore;
        this.cashier = cashier;
        this.iav = iav;
        this.userStore = userStore;
        this.sortingHatStore = sortingHatStore;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    public final boolean hasQueuedDeposit() {
        return this.hasQueuedDepositPref.get();
    }

    /* compiled from: QueuedTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.QueuedTransferStore$refreshQueuedDeposit$1", m3645f = "QueuedTransferStore.kt", m3646l = {54, 57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.achrelationship.QueuedTransferStore$refreshQueuedDeposit$1 */
    /* loaded from: classes12.dex */
    static final class C413011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C413011(Continuation<? super C413011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C413011 c413011 = QueuedTransferStore.this.new C413011(continuation);
            c413011.L$0 = obj;
            return c413011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C413011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        
            if (r6 == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object objM28550constructorimpl2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                QueuedTransferStore queuedTransferStore = QueuedTransferStore.this;
                Result.Companion companion3 = Result.INSTANCE;
                Cashier cashier = queuedTransferStore.cashier;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (cashier.getQueuedAchVerification(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM28550constructorimpl2 = Result.m28550constructorimpl((ApiQueuedIavDeposit) obj);
                    QueuedTransferStore queuedTransferStore2 = QueuedTransferStore.this;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
                        queuedTransferStore2.setHasQueuedDeposit();
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            QueuedTransferStore queuedTransferStore3 = QueuedTransferStore.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                queuedTransferStore3.setHasQueuedDeposit();
            }
            Iav iav = QueuedTransferStore.this.iav;
            this.L$0 = null;
            this.label = 2;
            obj = Iav.DefaultImpls.getQueuedIavDeposit$default(iav, null, this, 1, null);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void refreshQueuedDeposit() {
        if (this.hasQueuedDepositPref.get()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C413011(null), 3, null);
    }

    public final Single<Boolean> forcedGetHasQueuedDeposit(final RhAccountType rhAccountType) {
        Intrinsics.checkNotNullParameter(rhAccountType, "rhAccountType");
        this.userStore.refresh(true);
        Single<Boolean> singleDoAfterSuccess = this.userStore.getUser().firstOrError().flatMap(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.forcedGetHasQueuedDeposit.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CountryCode.Supported locality = it.getOrigin().getLocality();
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                    QueuedTransferStore queuedTransferStore = QueuedTransferStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(queuedTransferStore, null, new AnonymousClass1(queuedTransferStore, rhAccountType, null), 1, null).map(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.forcedGetHasQueuedDeposit.1.2
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(ApiQueuedIavDeposit it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.TRUE;
                        }
                    });
                }
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    QueuedTransferStore queuedTransferStore2 = QueuedTransferStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(queuedTransferStore2, null, new AnonymousClass3(queuedTransferStore2, rhAccountType, null), 1, null).map(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.forcedGetHasQueuedDeposit.1.4
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(Unit it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.TRUE;
                        }
                    });
                }
                return Single.just(Boolean.FALSE);
            }

            /* compiled from: QueuedTransferStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiQueuedIavDeposit;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.QueuedTransferStore$forcedGetHasQueuedDeposit$1$1", m3645f = "QueuedTransferStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.store.achrelationship.QueuedTransferStore$forcedGetHasQueuedDeposit$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiQueuedIavDeposit>, Object> {
                final /* synthetic */ RhAccountType $rhAccountType;
                int label;
                final /* synthetic */ QueuedTransferStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(QueuedTransferStore queuedTransferStore, RhAccountType rhAccountType, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = queuedTransferStore;
                    this.$rhAccountType = rhAccountType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$rhAccountType, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiQueuedIavDeposit> continuation) {
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
                    Iav iav = this.this$0.iav;
                    RhAccountType rhAccountType = this.$rhAccountType;
                    this.label = 1;
                    Object queuedIavDeposit = iav.getQueuedIavDeposit(rhAccountType, this);
                    return queuedIavDeposit == coroutine_suspended ? coroutine_suspended : queuedIavDeposit;
                }
            }

            /* compiled from: QueuedTransferStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.store.achrelationship.QueuedTransferStore$forcedGetHasQueuedDeposit$1$3", m3645f = "QueuedTransferStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.store.achrelationship.QueuedTransferStore$forcedGetHasQueuedDeposit$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ RhAccountType $rhAccountType;
                int label;
                final /* synthetic */ QueuedTransferStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(QueuedTransferStore queuedTransferStore, RhAccountType rhAccountType, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = queuedTransferStore;
                    this.$rhAccountType = rhAccountType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.this$0, this.$rhAccountType, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                        RhAccountType rhAccountType = this.$rhAccountType;
                        this.label = 1;
                        if (transfersBonfireApi.getQueuedDeposit(rhAccountType, this) == coroutine_suspended) {
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
        }).onErrorReturnItem(Boolean.FALSE).subscribeOn(Schedulers.m3346io()).doAfterSuccess(new Consumer() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.forcedGetHasQueuedDeposit.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                if (rhAccountType == RhAccountType.RHS_ACCOUNT) {
                    this.setHasQueuedDeposit();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoAfterSuccess, "doAfterSuccess(...)");
        return singleDoAfterSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasQueuedDeposit() {
        this.hasQueuedDepositPref.set(true);
    }

    public final Single<Optional<AchRelationship>> postQueuedIavDeposit(final String accessToken, final String iavAccountId, final BigDecimal amount, final RhAccountType rhAccountType, final PlaidIavMetadata plaidIavMetadata, final Function1<? super Response<?>, UserInteractionEventData> queuedDepositSuccessEventSupplier, final Function1<? super Throwable, UserInteractionEventData> queuedDepositErrorEventSupplier, final Function1<? super Response<?>, UserInteractionEventData> achRelationshipSuccessEventSupplier, final Function1<? super Throwable, UserInteractionEventData> achRelationshipErrorEventSupplier) {
        Single<Boolean> singleForceFetchHasBrokerageAccountIfNotCached;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(iavAccountId, "iavAccountId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(rhAccountType, "rhAccountType");
        Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
        int i = WhenMappings.$EnumSwitchMapping$0[rhAccountType.ordinal()];
        if (i == 1) {
            singleForceFetchHasBrokerageAccountIfNotCached = this.accountProvider.forceFetchHasBrokerageAccountIfNotCached();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            singleForceFetchHasBrokerageAccountIfNotCached = this.rhyAccountStore.forceFetchAccountIfNotCached().map(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore$postQueuedIavDeposit$hasAccountSingle$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Optional<RhyAccount> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it instanceof Some);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleForceFetchHasBrokerageAccountIfNotCached, "map(...)");
        }
        Single<Optional<AchRelationship>> singleSubscribeOn = singleForceFetchHasBrokerageAccountIfNotCached.flatMap(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.postQueuedIavDeposit.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<AchRelationship>> apply(Boolean hasAccount) {
                Intrinsics.checkNotNullParameter(hasAccount, "hasAccount");
                if (Intrinsics.areEqual(hasAccount, Boolean.FALSE)) {
                    Single<Optional<AchRelationship>> singleSubmitQueuedDeposit = QueuedTransferStore.this.iavStore.submitQueuedDeposit(accessToken, iavAccountId, amount, rhAccountType, queuedDepositSuccessEventSupplier, queuedDepositErrorEventSupplier);
                    final QueuedTransferStore queuedTransferStore = QueuedTransferStore.this;
                    final String str = accessToken;
                    final String str2 = iavAccountId;
                    final BigDecimal bigDecimal = amount;
                    final RhAccountType rhAccountType2 = rhAccountType;
                    final PlaidIavMetadata plaidIavMetadata2 = plaidIavMetadata;
                    final Function1<Response<?>, UserInteractionEventData> function1 = achRelationshipSuccessEventSupplier;
                    final Function1<Throwable, UserInteractionEventData> function12 = achRelationshipErrorEventSupplier;
                    Single<Optional<AchRelationship>> singleOnErrorResumeNext = singleSubmitQueuedDeposit.onErrorResumeNext(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.postQueuedIavDeposit.1.1
                        @Override // io.reactivex.functions.Function
                        public final SingleSource<? extends Optional<AchRelationship>> apply(Throwable throwable) {
                            Intrinsics.checkNotNullParameter(throwable, "throwable");
                            Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
                            if (httpStatusCode != null && httpStatusCode.intValue() == 422) {
                                return queuedTransferStore.iavStore.createAchRelationship(str, str2, bigDecimal, rhAccountType2, plaidIavMetadata2, function1, function12).map(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.postQueuedIavDeposit.1.1.1
                                    @Override // io.reactivex.functions.Function
                                    public final Some<AchRelationship> apply(AchRelationship p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        return new Some<>(p0);
                                    }
                                });
                            }
                            return Single.error(throwable);
                        }
                    });
                    Intrinsics.checkNotNull(singleOnErrorResumeNext);
                    return singleOnErrorResumeNext;
                }
                if (!Intrinsics.areEqual(hasAccount, Boolean.TRUE)) {
                    throw new NoWhenBranchMatchedException();
                }
                Single<R> map = QueuedTransferStore.this.iavStore.createAchRelationship(accessToken, iavAccountId, amount, rhAccountType, plaidIavMetadata, achRelationshipSuccessEventSupplier, achRelationshipErrorEventSupplier).map(new Function() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.postQueuedIavDeposit.1.2
                    @Override // io.reactivex.functions.Function
                    public final Some<AchRelationship> apply(AchRelationship p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new Some<>(p0);
                    }
                });
                Intrinsics.checkNotNull(map);
                return map;
            }
        }).doOnSuccess(new Consumer() { // from class: com.robinhood.store.achrelationship.QueuedTransferStore.postQueuedIavDeposit.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<AchRelationship> optional) {
                QueuedTransferStore.this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }
}
