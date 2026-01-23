package com.robinhood.android.beneficiaries.p067ui.trustflow.accounts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.android.beneficiaries.models.api.ApiValidateAccountsRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateAccountsResponse;
import com.robinhood.android.beneficiaries.p067ui.trustflow.accounts.BeneficiaryAdditionalAccountsEvent;
import com.robinhood.android.beneficiaries.p067ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001dB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "beneficiariesApi", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "selectAccount", "account", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "isSelected", "", "validateAdditionalAccounts", "selectedAccounts", "", "", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryAdditionalAccountsDuxo extends BaseDuxo3<BeneficiaryAdditionalAccountsDataState, BeneficiaryAdditionalAccountsViewState, BeneficiaryAdditionalAccountsEvent> implements HasSavedState {
    private final BeneficiariesApi beneficiariesApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public BeneficiaryAdditionalAccountsDuxo(BeneficiariesApi beneficiariesApi, BeneficiaryAdditionalAccountsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        String title = ((BeneficiaryAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getTitle();
        String subtitle_markdown = ((BeneficiaryAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getSubtitle_markdown();
        List<ApiCreateBeneficiaryAccountRow> account_rows = ((BeneficiaryAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getAccount_rows();
        List<ApiCreateBeneficiaryAccountRow> account_rows2 = ((BeneficiaryAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getAccount_rows();
        ArrayList arrayList = new ArrayList();
        for (Object obj : account_rows2) {
            if (((ApiCreateBeneficiaryAccountRow) obj).is_selected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ApiCreateBeneficiaryAccountRow) it.next()).getValue());
        }
        super(new BeneficiaryAdditionalAccountsDataState(title, subtitle_markdown, account_rows, CollectionsKt.toSet(arrayList2), false, null, 48, null), stateProvider, duxoBundle);
        this.beneficiariesApi = beneficiariesApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$onStart$1", m3645f = "BeneficiaryAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$onStart$1 */
    static final class C98021 extends ContinuationImpl7 implements Function2<BeneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C98021(Continuation<? super C98021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98021 c98021 = new C98021(continuation);
            c98021.L$0 = obj;
            return c98021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryAdditionalAccountsDataState beneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState> continuation) {
            return ((C98021) create(beneficiaryAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryAdditionalAccountsDataState.copy$default((BeneficiaryAdditionalAccountsDataState) this.L$0, null, null, null, null, false, null, 15, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        applyMutation(new C98021(null));
    }

    /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$selectAccount$1", m3645f = "BeneficiaryAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$selectAccount$1 */
    static final class C98031 extends ContinuationImpl7 implements Function2<BeneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState>, Object> {
        final /* synthetic */ ApiCreateBeneficiaryAccountRow $account;
        final /* synthetic */ boolean $isSelected;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98031(boolean z, ApiCreateBeneficiaryAccountRow apiCreateBeneficiaryAccountRow, Continuation<? super C98031> continuation) {
            super(2, continuation);
            this.$isSelected = z;
            this.$account = apiCreateBeneficiaryAccountRow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98031 c98031 = new C98031(this.$isSelected, this.$account, continuation);
            c98031.L$0 = obj;
            return c98031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryAdditionalAccountsDataState beneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState> continuation) {
            return ((C98031) create(beneficiaryAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BeneficiaryAdditionalAccountsDataState beneficiaryAdditionalAccountsDataState = (BeneficiaryAdditionalAccountsDataState) this.L$0;
            if (this.$isSelected) {
                return BeneficiaryAdditionalAccountsDataState.copy$default(beneficiaryAdditionalAccountsDataState, null, null, null, SetsKt.plus(beneficiaryAdditionalAccountsDataState.getSelectedAccounts(), this.$account.getValue()), false, null, 55, null);
            }
            return BeneficiaryAdditionalAccountsDataState.copy$default(beneficiaryAdditionalAccountsDataState, null, null, null, SetsKt.minus(beneficiaryAdditionalAccountsDataState.getSelectedAccounts(), this.$account.getValue()), false, null, 55, null);
        }
    }

    public final void selectAccount(ApiCreateBeneficiaryAccountRow account, boolean isSelected) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new C98031(isSelected, account, null));
    }

    /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$1", m3645f = "BeneficiaryAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$1 */
    static final class C98041 extends ContinuationImpl7 implements Function2<BeneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C98041(Continuation<? super C98041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98041 c98041 = new C98041(continuation);
            c98041.L$0 = obj;
            return c98041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryAdditionalAccountsDataState beneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState> continuation) {
            return ((C98041) create(beneficiaryAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryAdditionalAccountsDataState.copy$default((BeneficiaryAdditionalAccountsDataState) this.L$0, null, null, null, null, true, null, 47, null);
        }
    }

    public final void validateAdditionalAccounts(Set<String> selectedAccounts) {
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        applyMutation(new C98041(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C98052(selectedAccounts, this, null), 3, null);
    }

    /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$2", m3645f = "BeneficiaryAdditionalAccountsDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$2 */
    static final class C98052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $selectedAccounts;
        int label;
        final /* synthetic */ BeneficiaryAdditionalAccountsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98052(Set<String> set, BeneficiaryAdditionalAccountsDuxo beneficiaryAdditionalAccountsDuxo, Continuation<? super C98052> continuation) {
            super(2, continuation);
            this.$selectedAccounts = set;
            this.this$0 = beneficiaryAdditionalAccountsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C98052(this.$selectedAccounts, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C98052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<ApiBeneficiaryAgreementViewModel> listEmptyList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                this.this$0.applyMutation(new AnonymousClass2(null));
                this.this$0.submit(new BeneficiaryAdditionalAccountsEvent.Error(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.$selectedAccounts.isEmpty()) {
                    BeneficiariesApi beneficiariesApi = this.this$0.beneficiariesApi;
                    Companion companion = BeneficiaryAdditionalAccountsDuxo.INSTANCE;
                    String accountNumber = ((BeneficiaryAdditionalAccountsFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                    ApiValidateAccountsRequest apiValidateAccountsRequest = new ApiValidateAccountsRequest(((BeneficiaryAdditionalAccountsFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getBeneficiaryId(), CollectionsKt.toList(this.$selectedAccounts), "other");
                    this.label = 1;
                    obj = beneficiariesApi.validateBeneficiaryAccounts(accountNumber, apiValidateAccountsRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                    this.this$0.applyMutation(new AnonymousClass1(listEmptyList, null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            listEmptyList = ((ApiValidateAccountsResponse) obj).getPost_submit_agreements();
            this.this$0.applyMutation(new AnonymousClass1(listEmptyList, null));
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$2$1", m3645f = "BeneficiaryAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState>, Object> {
            final /* synthetic */ List<ApiBeneficiaryAgreementViewModel> $additionalAgreements;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<ApiBeneficiaryAgreementViewModel> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$additionalAgreements = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$additionalAgreements, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryAdditionalAccountsDataState beneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState> continuation) {
                return ((AnonymousClass1) create(beneficiaryAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryAdditionalAccountsDataState.copy$default((BeneficiaryAdditionalAccountsDataState) this.L$0, null, null, null, null, false, this.$additionalAgreements, 15, null);
            }
        }

        /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$2$2", m3645f = "BeneficiaryAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsDuxo$validateAdditionalAccounts$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BeneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryAdditionalAccountsDataState beneficiaryAdditionalAccountsDataState, Continuation<? super BeneficiaryAdditionalAccountsDataState> continuation) {
                return ((AnonymousClass2) create(beneficiaryAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryAdditionalAccountsDataState.copy$default((BeneficiaryAdditionalAccountsDataState) this.L$0, null, null, null, null, false, null, 47, null);
            }
        }
    }

    /* compiled from: BeneficiaryAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryAdditionalAccountsDuxo, BeneficiaryAdditionalAccountsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryAdditionalAccountsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryAdditionalAccountsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryAdditionalAccountsFragment.Args getArgs(BeneficiaryAdditionalAccountsDuxo beneficiaryAdditionalAccountsDuxo) {
            return (BeneficiaryAdditionalAccountsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryAdditionalAccountsDuxo);
        }
    }
}
