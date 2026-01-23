package com.robinhood.android.account.accountfunding;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.accounts.p028v1.FundingOptionsRequestDto;
import com.robinhood.android.account.accountfunding.AccountFundingOptionsDuxo2;
import com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys;
import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel;
import com.robinhood.android.account.store.onboarding.AccountOnboardingStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountFundingOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0013H\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsViewState;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountOnboardingStore", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "mapToLocation", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LocationDto;", "", "mapToLayout", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LayoutDto;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey;", "Companion", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountFundingOptionsDuxo extends BaseDuxo5<AccountFundingOptionsViewState, AccountFundingOptionsDuxo2> implements HasSavedState {
    private final AccountOnboardingStore accountOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountFundingOptionsDuxo(AccountOnboardingStore accountOnboardingStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new AccountFundingOptionsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountOnboardingStore = accountOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C80761(null));
    }

    /* compiled from: AccountFundingOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.accountfunding.AccountFundingOptionsDuxo$onCreate$1", m3645f = "AccountFundingOptionsDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsDuxo$onCreate$1 */
    static final class C80761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80761(Continuation<? super C80761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountFundingOptionsDuxo.this.new C80761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C80761 c80761;
            AccountOnboardingStore accountOnboardingStore;
            String accountNumber;
            String transferFundsEntryPoint;
            FundingOptionsRequestDto.LocationDto locationDtoMapToLocation;
            FundingOptionsRequestDto.LayoutDto layoutDtoMapToLayout;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        accountOnboardingStore = AccountFundingOptionsDuxo.this.accountOnboardingStore;
                        Companion companion = AccountFundingOptionsDuxo.INSTANCE;
                        accountNumber = ((AccountFundingOptionsFragmentKeys) companion.getArgs((HasSavedState) AccountFundingOptionsDuxo.this)).getAccountNumber();
                        transferFundsEntryPoint = ((AccountFundingOptionsFragmentKeys) companion.getArgs((HasSavedState) AccountFundingOptionsDuxo.this)).getTransferFundsEntryPoint();
                        String location = ((AccountFundingOptionsFragmentKeys) companion.getArgs((HasSavedState) AccountFundingOptionsDuxo.this)).getLocation();
                        locationDtoMapToLocation = location != null ? AccountFundingOptionsDuxo.this.mapToLocation(location) : null;
                        AccountFundingOptionsDuxo accountFundingOptionsDuxo = AccountFundingOptionsDuxo.this;
                        layoutDtoMapToLayout = accountFundingOptionsDuxo.mapToLayout((AccountFundingOptionsFragmentKeys) companion.getArgs((HasSavedState) accountFundingOptionsDuxo));
                        this.label = 1;
                        c80761 = this;
                    } catch (Exception e) {
                        e = e;
                        c80761 = this;
                        exc = e;
                        AccountFundingOptionsDuxo.this.submit(new AccountFundingOptionsDuxo2.Error(exc));
                        return Unit.INSTANCE;
                    }
                    try {
                        obj = accountOnboardingStore.getAccountFundingOptions(accountNumber, transferFundsEntryPoint, locationDtoMapToLocation, layoutDtoMapToLayout, c80761);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        AccountFundingOptionsDuxo.this.submit(new AccountFundingOptionsDuxo2.Error(exc));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c80761 = this;
                }
                AccountFundingOptionsDuxo.this.applyMutation(new AnonymousClass1((FundingOptionsViewModel) obj, null));
            } catch (Exception e3) {
                exc = e3;
                c80761 = this;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountFundingOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.accountfunding.AccountFundingOptionsDuxo$onCreate$1$1", m3645f = "AccountFundingOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountFundingOptionsViewState, Continuation<? super AccountFundingOptionsViewState>, Object> {
            final /* synthetic */ FundingOptionsViewModel $fundingOptions;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FundingOptionsViewModel fundingOptionsViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$fundingOptions = fundingOptionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fundingOptions, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountFundingOptionsViewState accountFundingOptionsViewState, Continuation<? super AccountFundingOptionsViewState> continuation) {
                return ((AnonymousClass1) create(accountFundingOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((AccountFundingOptionsViewState) this.L$0).copy(this.$fundingOptions);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FundingOptionsRequestDto.LocationDto mapToLocation(String str) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            objM28550constructorimpl = Result.m28550constructorimpl(FundingOptionsRequestDto.LocationDto.valueOf(upperCase));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        return (FundingOptionsRequestDto.LocationDto) objM28550constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FundingOptionsRequestDto.LayoutDto mapToLayout(AccountFundingOptionsFragmentKeys accountFundingOptionsFragmentKeys) {
        if (accountFundingOptionsFragmentKeys instanceof AccountFundingOptionsFragmentKeys.FullScreen) {
            return FundingOptionsRequestDto.LayoutDto.LAYOUT_FULL_SCREEN;
        }
        if (accountFundingOptionsFragmentKeys instanceof AccountFundingOptionsFragmentKeys.BottomSheet) {
            return FundingOptionsRequestDto.LayoutDto.LAYOUT_SHEET;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: AccountFundingOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey;", "<init>", "()V", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountFundingOptionsDuxo, AccountFundingOptionsFragmentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountFundingOptionsFragmentKeys getArgs(SavedStateHandle savedStateHandle) {
            return (AccountFundingOptionsFragmentKeys) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountFundingOptionsFragmentKeys getArgs(AccountFundingOptionsDuxo accountFundingOptionsDuxo) {
            return (AccountFundingOptionsFragmentKeys) DuxoCompanion.DefaultImpls.getArgs(this, accountFundingOptionsDuxo);
        }
    }
}
