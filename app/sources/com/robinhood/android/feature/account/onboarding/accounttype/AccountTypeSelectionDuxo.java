package com.robinhood.android.feature.account.onboarding.accounttype;

import accounts.onboarding.proto.p006v1.AccountTypeSelectionService;
import accounts.onboarding.proto.p006v1.AvailableAccountRowDto;
import accounts.onboarding.proto.p006v1.GetAvailableAccountTypesRequestDto;
import accounts.onboarding.proto.p006v1.GetAvailableAccountTypesResponseDto;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import bonfire.proto.idl.accounts.p028v1.AccountOnboardingEligibilityResponseDto;
import com.robinhood.android.account.store.onboarding.AccountOnboardingStore;
import com.robinhood.android.feature.account.onboarding.Microgram;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionEvent;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionFragment;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionRow;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: AccountTypeSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountOnboardingStore", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;Landroidx/lifecycle/SavedStateHandle;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "accountOnboardingComponent", "Lmicrogram/android/inject/MicrogramComponent;", "accountTypeSelectionService", "Laccounts/onboarding/proto/v1/AccountTypeSelectionService;", "onCreate", "", "verifyAccountEligibility", "row", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;", "dismissWarning", "Companion", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountTypeSelectionDuxo extends BaseDuxo3<AccountTypeSelectionDataState, AccountTypeSelectionViewState, AccountTypeSelectionEvent> implements HasSavedState {
    private final MicrogramComponent accountOnboardingComponent;
    private final AccountOnboardingStore accountOnboardingStore;
    private final AccountTypeSelectionService accountTypeSelectionService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTypeSelectionDuxo(AccountOnboardingStore accountOnboardingStore, SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle) {
        super(new AccountTypeSelectionDataState(null, null, null, null, false, 31, null), AccountTypeSelectionDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountOnboardingStore = accountOnboardingStore;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication(Microgram.accountOnboardingAppId, null, 2, null), null, 4, null);
        this.accountOnboardingComponent = microgramComponentCreate$default;
        this.accountTypeSelectionService = (AccountTypeSelectionService) microgramComponentCreate$default.getServiceLocator().getClient(AccountTypeSelectionService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C166441(null));
    }

    /* compiled from: AccountTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$onCreate$1", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$onCreate$1 */
    static final class C166441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C166441(Continuation<? super C166441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountTypeSelectionDuxo.this.new C166441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C166441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ManagementType protobuf;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.robinhood.models.api.ManagementType managementType = ((AccountTypeSelectionFragment.Args) AccountTypeSelectionDuxo.INSTANCE.getArgs((HasSavedState) AccountTypeSelectionDuxo.this)).getManagementType();
                GetAvailableAccountTypesRequestDto getAvailableAccountTypesRequestDto = new GetAvailableAccountTypesRequestDto((managementType == null || (protobuf = ManagementTypes2.toProtobuf(managementType)) == null) ? null : ManagementTypeDto.INSTANCE.fromProto(protobuf));
                AccountTypeSelectionService accountTypeSelectionService = AccountTypeSelectionDuxo.this.accountTypeSelectionService;
                this.label = 1;
                obj = accountTypeSelectionService.GetAvailableAccountTypes(getAvailableAccountTypesRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AccountTypeSelectionDuxo.this.applyMutation(new AnonymousClass1((GetAvailableAccountTypesResponseDto) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AccountTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$onCreate$1$1", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState>, Object> {
            final /* synthetic */ GetAvailableAccountTypesResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetAvailableAccountTypesResponseDto getAvailableAccountTypesResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = getAvailableAccountTypesResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountTypeSelectionDataState accountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState> continuation) {
                return ((AnonymousClass1) create(accountTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AccountTypeSelectionDataState accountTypeSelectionDataState = (AccountTypeSelectionDataState) this.L$0;
                String title = this.$response.getTitle();
                String subtitle = this.$response.getSubtitle();
                List<AvailableAccountRowDto> rows = this.$response.getRows();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                Iterator<T> it = rows.iterator();
                while (it.hasNext()) {
                    arrayList.add(AccountTypeSelectionRow2.toSelectionRow((AvailableAccountRowDto) it.next()));
                }
                return AccountTypeSelectionDataState.copy$default(accountTypeSelectionDataState, title, subtitle, extensions2.toImmutableList(arrayList), null, false, 24, null);
            }
        }
    }

    public final void verifyAccountEligibility(AccountTypeSelectionRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        AccountTypeSelectionRow.RowType rowType = row.getRowType();
        AccountTypeSelectionRow.RowType.Account account = rowType instanceof AccountTypeSelectionRow.RowType.Account ? (AccountTypeSelectionRow.RowType.Account) rowType : null;
        if (account == null) {
            return;
        }
        if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
            applyMutation(new C166451(null));
            try {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C166462(row, account, null), 3, null);
                return;
            } catch (Exception unused) {
                applyMutation(new C166474(null));
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        submit(new AccountTypeSelectionEvent.BrokerageAccountTypeSelected(account.getBrokerageAccountType()));
    }

    /* compiled from: AccountTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$1", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$1 */
    static final class C166451 extends ContinuationImpl7 implements Function2<AccountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C166451(Continuation<? super C166451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166451 c166451 = new C166451(continuation);
            c166451.L$0 = obj;
            return c166451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTypeSelectionDataState accountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState> continuation) {
            return ((C166451) create(accountTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountTypeSelectionDataState.copy$default((AccountTypeSelectionDataState) this.L$0, null, null, null, null, true, 15, null);
        }
    }

    /* compiled from: AccountTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$2", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$2 */
    static final class C166462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountTypeSelectionRow $row;
        final /* synthetic */ AccountTypeSelectionRow.RowType.Account $rowType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166462(AccountTypeSelectionRow accountTypeSelectionRow, AccountTypeSelectionRow.RowType.Account account, Continuation<? super C166462> continuation) {
            super(2, continuation);
            this.$row = accountTypeSelectionRow;
            this.$rowType = account;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountTypeSelectionDuxo.this.new C166462(this.$row, this.$rowType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C166462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountOnboardingStore accountOnboardingStore = AccountTypeSelectionDuxo.this.accountOnboardingStore;
                BrokerageAccountType brokerageAccountType = ((AccountTypeSelectionRow.RowType.Account) this.$row.getRowType()).getBrokerageAccountType();
                com.robinhood.models.api.ManagementType managementType = ((AccountTypeSelectionFragment.Args) AccountTypeSelectionDuxo.INSTANCE.getArgs((HasSavedState) AccountTypeSelectionDuxo.this)).getManagementType();
                this.label = 1;
                obj = accountOnboardingStore.getAccountEligibility(brokerageAccountType, managementType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AccountOnboardingEligibilityResponseDto accountOnboardingEligibilityResponseDto = (AccountOnboardingEligibilityResponseDto) obj;
            if (!accountOnboardingEligibilityResponseDto.is_eligible()) {
                AccountTypeSelectionDuxo.this.applyMutation(new AnonymousClass2(accountOnboardingEligibilityResponseDto, null));
            } else {
                AccountTypeSelectionDuxo.this.submit(new AccountTypeSelectionEvent.BrokerageAccountTypeSelected(this.$rowType.getBrokerageAccountType()));
                AccountTypeSelectionDuxo.this.applyMutation(new AnonymousClass1(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$2$1", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountTypeSelectionDataState accountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState> continuation) {
                return ((AnonymousClass1) create(accountTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountTypeSelectionDataState.copy$default((AccountTypeSelectionDataState) this.L$0, null, null, null, null, false, 15, null);
            }
        }

        /* compiled from: AccountTypeSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$2$2", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AccountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState>, Object> {
            final /* synthetic */ AccountOnboardingEligibilityResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountOnboardingEligibilityResponseDto accountOnboardingEligibilityResponseDto, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$response = accountOnboardingEligibilityResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$response, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountTypeSelectionDataState accountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState> continuation) {
                return ((AnonymousClass2) create(accountTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountTypeSelectionDataState.copy$default((AccountTypeSelectionDataState) this.L$0, null, null, null, this.$response.getWarning(), false, 7, null);
            }
        }
    }

    /* compiled from: AccountTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$4", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$verifyAccountEligibility$4 */
    static final class C166474 extends ContinuationImpl7 implements Function2<AccountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C166474(Continuation<? super C166474> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166474 c166474 = new C166474(continuation);
            c166474.L$0 = obj;
            return c166474;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTypeSelectionDataState accountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState> continuation) {
            return ((C166474) create(accountTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountTypeSelectionDataState.copy$default((AccountTypeSelectionDataState) this.L$0, null, null, null, null, false, 15, null);
        }
    }

    /* compiled from: AccountTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$dismissWarning$1", m3645f = "AccountTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionDuxo$dismissWarning$1 */
    static final class C166431 extends ContinuationImpl7 implements Function2<AccountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C166431(Continuation<? super C166431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166431 c166431 = new C166431(continuation);
            c166431.L$0 = obj;
            return c166431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTypeSelectionDataState accountTypeSelectionDataState, Continuation<? super AccountTypeSelectionDataState> continuation) {
            return ((C166431) create(accountTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountTypeSelectionDataState.copy$default((AccountTypeSelectionDataState) this.L$0, null, null, null, null, false, 23, null);
        }
    }

    public final void dismissWarning() {
        applyMutation(new C166431(null));
    }

    /* compiled from: AccountTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionFragment$Args;", "<init>", "()V", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountTypeSelectionDuxo, AccountTypeSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountTypeSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AccountTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountTypeSelectionFragment.Args getArgs(AccountTypeSelectionDuxo accountTypeSelectionDuxo) {
            return (AccountTypeSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, accountTypeSelectionDuxo);
        }
    }
}
