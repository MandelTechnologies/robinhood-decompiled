package com.robinhood.shared.accountactivityexporter;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporterRequest;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.datetime.Instants;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
import kotlin.ranges.RangesKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import retrofit2.Response;

/* compiled from: AccountActivityExporterRequestDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestViewState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "accountActivityExporterStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;Lj$/time/Clock;Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onStart", "()V", "", "accountNumber", "selectAccount", "(Ljava/lang/String;)V", "j$/time/LocalDate", "startDate", "endDate", "setDateSelection", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)V", "submitRequest", "clearResponse", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "Lj$/time/Clock;", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AccountActivityExporterRequestDuxo extends BaseDuxo<AccountActivityExporterRequestDataState, AccountActivityExporterRequestViewState> {
    public static final int $stable = 8;
    private final AccountActivityExporterStore accountActivityExporterStore;
    private final AccountProvider accountProvider;
    private final Clock clock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountActivityExporterRequestDuxo(AccountProvider accountProvider, AccountActivityExporterStore accountActivityExporterStore, Clock clock, AccountActivityExporterRequestDuxo4 stateProvider, DuxoBundle duxoBundle) {
        super(new AccountActivityExporterRequestDataState(null, null, null, null, false, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.accountActivityExporterStore = accountActivityExporterStore;
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(this.accountProvider.streamAllSelfDirectedAccounts(), this.accountProvider.streamAllManagedAccounts()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountActivityExporterRequestDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AccountActivityExporterRequestDuxo accountActivityExporterRequestDuxo, Tuples2 tuples2) {
        Object next;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        List listPlus = CollectionsKt.plus((Collection) tuples2.component1(), (Iterable) tuples2.component2());
        Iterator it = listPlus.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Account account = (Account) next;
            if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && account.getManagementType() == ManagementType.SELF_DIRECTED) {
                break;
            }
        }
        Account account2 = (Account) next;
        if (account2 == null) {
            account2 = (Account) CollectionsKt.first(listPlus);
        }
        Instant instant = accountActivityExporterRequestDuxo.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        LocalDate localDate$default = Instants.toLocalDate$default(instant, null, 1, null);
        accountActivityExporterRequestDuxo.applyMutation(new AccountActivityExporterRequestDuxo2(listPlus, account2, localDate$default.withDayOfYear(1), localDate$default, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountActivityExporterRequestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$selectAccount$1", m3645f = "AccountActivityExporterRequestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$selectAccount$1 */
    static final class C373101 extends ContinuationImpl7 implements Function2<AccountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373101(String str, Continuation<? super C373101> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373101 c373101 = new C373101(this.$accountNumber, continuation);
            c373101.L$0 = obj;
            return c373101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState> continuation) {
            return ((C373101) create(accountActivityExporterRequestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountActivityExporterRequestDataState accountActivityExporterRequestDataState = (AccountActivityExporterRequestDataState) this.L$0;
            List<Account> allAccounts = accountActivityExporterRequestDataState.getAllAccounts();
            if (allAccounts != null) {
                String str = this.$accountNumber;
                for (Account account : allAccounts) {
                    if (Intrinsics.areEqual(account.getAccountNumber(), str)) {
                        if (account != null) {
                            LocalDate startDate = accountActivityExporterRequestDataState.getStartDate();
                            return AccountActivityExporterRequestDataState.copy$default(accountActivityExporterRequestDataState, null, account, startDate != null ? (LocalDate) RangesKt.coerceAtLeast(startDate, Instants.toLocalDate$default(account.getCreatedAt(), null, 1, null)) : null, null, false, null, 57, null);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            return accountActivityExporterRequestDataState;
        }
    }

    public final void selectAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C373101(accountNumber, null));
    }

    /* compiled from: AccountActivityExporterRequestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$setDateSelection$1", m3645f = "AccountActivityExporterRequestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$setDateSelection$1 */
    static final class C373111 extends ContinuationImpl7 implements Function2<AccountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState>, Object> {
        final /* synthetic */ LocalDate $endDate;
        final /* synthetic */ LocalDate $startDate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373111(LocalDate localDate, LocalDate localDate2, Continuation<? super C373111> continuation) {
            super(2, continuation);
            this.$startDate = localDate;
            this.$endDate = localDate2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373111 c373111 = new C373111(this.$startDate, this.$endDate, continuation);
            c373111.L$0 = obj;
            return c373111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState> continuation) {
            return ((C373111) create(accountActivityExporterRequestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountActivityExporterRequestDataState.copy$default((AccountActivityExporterRequestDataState) this.L$0, null, null, this.$startDate, this.$endDate, false, null, 51, null);
        }
    }

    public final void setDateSelection(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        applyMutation(new C373111(startDate, endDate, null));
    }

    /* compiled from: AccountActivityExporterRequestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$submitRequest$1", m3645f = "AccountActivityExporterRequestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$submitRequest$1 */
    static final class C373121 extends ContinuationImpl7 implements Function2<AccountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C373121(Continuation<? super C373121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373121 c373121 = new C373121(continuation);
            c373121.L$0 = obj;
            return c373121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState> continuation) {
            return ((C373121) create(accountActivityExporterRequestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountActivityExporterRequestDataState.copy$default((AccountActivityExporterRequestDataState) this.L$0, null, null, null, null, true, null, 47, null);
        }
    }

    public final void submitRequest() {
        ApiAccountActivityExporterRequest submitRequest = getStateFlow().getValue().getSubmitRequest();
        if (submitRequest == null) {
            return;
        }
        applyMutation(new C373121(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.accountActivityExporterStore.submitAccountActivityExportRequest(submitRequest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountActivityExporterRequestDuxo.submitRequest$lambda$2(this.f$0, (Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitRequest$lambda$2(AccountActivityExporterRequestDuxo accountActivityExporterRequestDuxo, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        accountActivityExporterRequestDuxo.applyMutation(new AccountActivityExporterRequestDuxo3(response, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountActivityExporterRequestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterRequestDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$clearResponse$1", m3645f = "AccountActivityExporterRequestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterRequestDuxo$clearResponse$1 */
    static final class C373091 extends ContinuationImpl7 implements Function2<AccountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C373091(Continuation<? super C373091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373091 c373091 = new C373091(continuation);
            c373091.L$0 = obj;
            return c373091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountActivityExporterRequestDataState accountActivityExporterRequestDataState, Continuation<? super AccountActivityExporterRequestDataState> continuation) {
            return ((C373091) create(accountActivityExporterRequestDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountActivityExporterRequestDataState.copy$default((AccountActivityExporterRequestDataState) this.L$0, null, null, null, null, false, null, 15, null);
        }
    }

    public final void clearResponse() {
        applyMutation(new C373091(null));
    }
}
