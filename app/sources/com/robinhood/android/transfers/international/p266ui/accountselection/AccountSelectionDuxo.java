package com.robinhood.android.transfers.international.p266ui.accountselection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.currencybalance.CurrencyBalanceApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionDuxo4;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001aB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDataState;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "currencyBalanceApi", "Lcom/robinhood/android/api/currencybalance/CurrencyBalanceApi;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/api/currencybalance/CurrencyBalanceApi;Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "loadInternalBalances", "loadExternalAccounts", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AccountSelectionDuxo extends BaseDuxo3<AccountSelectionDataState, AccountSelectionViewState, AccountSelectionDuxo4> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CurrencyBalanceApi currencyBalanceApi;
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSelectionFragment.Args.Type.values().length];
            try {
                iArr[AccountSelectionFragment.Args.Type.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSelectionFragment.Args.Type.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSelectionDuxo(AccountProvider accountProvider, CurrencyBalanceApi currencyBalanceApi, PaymentInstrumentStore paymentInstrumentStore, SavedStateHandle savedStateHandle, AccountSelectionStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new AccountSelectionDataState((AccountSelectionFragment.Args) INSTANCE.getArgs(savedStateHandle), null, null, null, 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(currencyBalanceApi, "currencyBalanceApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.currencyBalanceApi = currencyBalanceApi;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        int i = WhenMappings.$EnumSwitchMapping$0[((AccountSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getType().ordinal()];
        if (i == 1) {
            loadInternalBalances();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            loadExternalAccounts();
        }
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.accountselection.AccountSelectionDuxo$loadInternalBalances$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {41, 42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.accountselection.AccountSelectionDuxo$loadInternalBalances$1 */
    static final class C303251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C303251(Continuation<? super C303251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303251 c303251 = AccountSelectionDuxo.this.new C303251(continuation);
            c303251.L$0 = obj;
            return c303251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            AccountSelectionDuxo accountSelectionDuxo;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                accountSelectionDuxo = AccountSelectionDuxo.this;
                Result.Companion companion2 = Result.INSTANCE;
                AccountProvider accountProvider = accountSelectionDuxo.accountProvider;
                this.L$0 = accountSelectionDuxo;
                this.label = 1;
                obj = accountProvider.getIndividualAccountNumberForced(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM28550constructorimpl = Result.m28550constructorimpl(Tuples4.m3642to(str, (List) obj));
                AccountSelectionDuxo accountSelectionDuxo2 = AccountSelectionDuxo.this;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    Tuples2 tuples2 = (Tuples2) objM28550constructorimpl;
                    accountSelectionDuxo2.applyMutation(new AccountSelectionDuxo3((String) tuples2.component1(), (List) tuples2.component2(), null));
                } else {
                    accountSelectionDuxo2.submit(new AccountSelectionDuxo4.Error(thM28553exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            }
            accountSelectionDuxo = (AccountSelectionDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str2 = (String) obj;
            CurrencyBalanceApi currencyBalanceApi = accountSelectionDuxo.currencyBalanceApi;
            this.L$0 = str2;
            this.label = 2;
            Object currencyBalances = currencyBalanceApi.getCurrencyBalances(str2, this);
            if (currencyBalances != coroutine_suspended) {
                str = str2;
                obj = currencyBalances;
                objM28550constructorimpl = Result.m28550constructorimpl(Tuples4.m3642to(str, (List) obj));
                AccountSelectionDuxo accountSelectionDuxo22 = AccountSelectionDuxo.this;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void loadInternalBalances() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303251(null), 3, null);
    }

    private final void loadExternalAccounts() {
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentInstrumentStore.stream(CollectionsKt.listOf(PaymentInstrumentType.I18N_BANK_ACCOUNT)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.international.ui.accountselection.AccountSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSelectionDuxo.loadExternalAccounts$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadExternalAccounts$lambda$0(AccountSelectionDuxo accountSelectionDuxo, List paymentInstruments) {
        Intrinsics.checkNotNullParameter(paymentInstruments, "paymentInstruments");
        accountSelectionDuxo.applyMutation(new AccountSelectionDuxo2(paymentInstruments, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDuxo;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;", "<init>", "()V", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountSelectionDuxo, AccountSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AccountSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountSelectionFragment.Args getArgs(AccountSelectionDuxo accountSelectionDuxo) {
            return (AccountSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, accountSelectionDuxo);
        }
    }
}
