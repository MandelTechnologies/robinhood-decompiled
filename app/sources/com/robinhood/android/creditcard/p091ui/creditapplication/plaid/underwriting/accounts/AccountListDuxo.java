package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo4;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse2;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.time.Time4;
import p479j$.time.Duration;

/* compiled from: AccountListDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0012J\r\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListEvent;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/android/udf/DuxoBundle;Lkotlinx/coroutines/CoroutineDispatcher;)V", "onAccountSelected", "", "account", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "onAccountSelected$feature_credit_card_externalDebug", "startReportStatusPolling", "(Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAddAccountClicked", "onAddAccountClicked$feature_credit_card_externalDebug", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AccountListDuxo extends BaseDuxo5<AccountListViewState, AccountListDuxo4> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo", m3645f = "AccountListDuxo.kt", m3646l = {50}, m3647m = "startReportStatusPolling")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$1 */
    static final class C124951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C124951(Continuation<? super C124951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountListDuxo.this.startReportStatusPolling(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountListDuxo(CreditCardStore creditCardStore, DuxoBundle duxoBundle, @DefaultDispatcher CoroutineDispatcher defaultDispatcher) {
        super(new AccountListViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    public final void onAccountSelected$feature_credit_card_externalDebug(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new AccountListDuxo2(this, account, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startReportStatusPolling(Account account, Continuation<? super Unit> continuation) {
        C124951 c124951;
        if (continuation instanceof C124951) {
            c124951 = (C124951) continuation;
            int i = c124951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c124951.label = i - Integer.MIN_VALUE;
            } else {
                c124951 = new C124951(continuation);
            }
        }
        Object obj = c124951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c124951.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Duration durationOfSeconds = Duration.ofSeconds(30L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                C124962 c124962 = new C124962(account, null);
                c124951.label = 1;
                if (Time4.withTimeout(durationOfSeconds, c124962, c124951) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Timeout4 unused) {
            submit(new AccountListDuxo4.Run(CreditApplicationDuxo8.NextPage.INSTANCE));
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            submit(new AccountListDuxo4.Run(CreditApplicationDuxo8.Error.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2", m3645f = "AccountListDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2 */
    static final class C124962 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Account $account;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C124962(Account account, Continuation<? super C124962> continuation) {
            super(2, continuation);
            this.$account = account;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountListDuxo.this.new C124962(this.$account, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C124962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowPollAssetReportStatus$default = CreditCardStore.pollAssetReportStatus$default(AccountListDuxo.this.creditCardStore, this.$account.getId(), null, null, 6, null);
                Flow flowTake = FlowKt.take(new Flow<ManageCreditApplicationAssetReportResponse2>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2$invokeSuspend$$inlined$filter$1$2", m3645f = "AccountListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((ManageCreditApplicationAssetReportResponse2) obj) == ManageCreditApplicationAssetReportResponse2.DONE) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ManageCreditApplicationAssetReportResponse2> flowCollector, Continuation continuation) {
                        Object objCollect = flowPollAssetReportStatus$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AccountListDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: AccountListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2$2", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$startReportStatusPolling$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ManageCreditApplicationAssetReportResponse2, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountListDuxo accountListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ManageCreditApplicationAssetReportResponse2 manageCreditApplicationAssetReportResponse2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(manageCreditApplicationAssetReportResponse2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new AccountListDuxo4.Run(CreditApplicationDuxo8.Underwrite.INSTANCE));
                return Unit.INSTANCE;
            }
        }
    }

    public final void onAddAccountClicked$feature_credit_card_externalDebug() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new AccountListDuxo3(this, null), 2, null);
    }
}
