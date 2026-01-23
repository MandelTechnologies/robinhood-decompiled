package com.robinhood.android.beneficiaries.p067ui.individualflow.accounts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.android.beneficiaries.models.api.ApiValidateAccountsRequest;
import com.robinhood.android.beneficiaries.models.api.ApiValidateAccountsResponse;
import com.robinhood.android.beneficiaries.p067ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.udf.UiEvent;
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

/* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "beneficiariesApi", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "selectAccount", "account", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "isSelected", "", "validateAdditionalAccounts", "selectedAccounts", "", "", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateAdditionalAccountsDuxo extends BaseDuxo<BeneficiaryCreateAdditionalAccountsDataState, BeneficiaryCreateAdditionalAccountsViewState> implements HasSavedState {
    private final BeneficiariesApi beneficiariesApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public BeneficiaryCreateAdditionalAccountsDuxo(BeneficiariesApi beneficiariesApi, BeneficiaryCreateAdditionalAccountsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        String title = ((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getTitle();
        String subtitle_markdown = ((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getSubtitle_markdown();
        List<ApiCreateBeneficiaryAccountRow> account_rows = ((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getAccount_rows();
        List<ApiCreateBeneficiaryAccountRow> account_rows2 = ((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs(savedStateHandle)).getAccountViewModel().getAccount_rows();
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
        super(new BeneficiaryCreateAdditionalAccountsDataState(title, subtitle_markdown, account_rows, CollectionsKt.toSet(arrayList2), false, null, null, 112, null), stateProvider, duxoBundle);
        this.beneficiariesApi = beneficiariesApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$onStart$1", m3645f = "BeneficiaryCreateAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$onStart$1 */
    static final class C97001 extends ContinuationImpl7 implements Function2<BeneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C97001(Continuation<? super C97001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97001 c97001 = new C97001(continuation);
            c97001.L$0 = obj;
            return c97001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState> continuation) {
            return ((C97001) create(beneficiaryCreateAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryCreateAdditionalAccountsDataState.copy$default((BeneficiaryCreateAdditionalAccountsDataState) this.L$0, null, null, null, null, false, null, null, 15, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        applyMutation(new C97001(null));
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$selectAccount$1", m3645f = "BeneficiaryCreateAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$selectAccount$1 */
    static final class C97011 extends ContinuationImpl7 implements Function2<BeneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState>, Object> {
        final /* synthetic */ ApiCreateBeneficiaryAccountRow $account;
        final /* synthetic */ boolean $isSelected;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C97011(boolean z, ApiCreateBeneficiaryAccountRow apiCreateBeneficiaryAccountRow, Continuation<? super C97011> continuation) {
            super(2, continuation);
            this.$isSelected = z;
            this.$account = apiCreateBeneficiaryAccountRow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97011 c97011 = new C97011(this.$isSelected, this.$account, continuation);
            c97011.L$0 = obj;
            return c97011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState> continuation) {
            return ((C97011) create(beneficiaryCreateAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState = (BeneficiaryCreateAdditionalAccountsDataState) this.L$0;
            if (this.$isSelected) {
                return BeneficiaryCreateAdditionalAccountsDataState.copy$default(beneficiaryCreateAdditionalAccountsDataState, null, null, null, SetsKt.plus(beneficiaryCreateAdditionalAccountsDataState.getSelectedAccounts(), this.$account.getValue()), false, null, null, 119, null);
            }
            return BeneficiaryCreateAdditionalAccountsDataState.copy$default(beneficiaryCreateAdditionalAccountsDataState, null, null, null, SetsKt.minus(beneficiaryCreateAdditionalAccountsDataState.getSelectedAccounts(), this.$account.getValue()), false, null, null, 119, null);
        }
    }

    public final void selectAccount(ApiCreateBeneficiaryAccountRow account, boolean isSelected) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new C97011(isSelected, account, null));
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$1", m3645f = "BeneficiaryCreateAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$1 */
    static final class C97021 extends ContinuationImpl7 implements Function2<BeneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C97021(Continuation<? super C97021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97021 c97021 = new C97021(continuation);
            c97021.L$0 = obj;
            return c97021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState> continuation) {
            return ((C97021) create(beneficiaryCreateAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryCreateAdditionalAccountsDataState.copy$default((BeneficiaryCreateAdditionalAccountsDataState) this.L$0, null, null, null, null, true, null, null, 111, null);
        }
    }

    public final void validateAdditionalAccounts(Set<String> selectedAccounts) {
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        applyMutation(new C97021(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C97032(selectedAccounts, this, null), 3, null);
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$2", m3645f = "BeneficiaryCreateAdditionalAccountsDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$2 */
    static final class C97032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $selectedAccounts;
        int label;
        final /* synthetic */ BeneficiaryCreateAdditionalAccountsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C97032(Set<String> set, BeneficiaryCreateAdditionalAccountsDuxo beneficiaryCreateAdditionalAccountsDuxo, Continuation<? super C97032> continuation) {
            super(2, continuation);
            this.$selectedAccounts = set;
            this.this$0 = beneficiaryCreateAdditionalAccountsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97032(this.$selectedAccounts, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<ApiBeneficiaryAgreementViewModel> listEmptyList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                this.this$0.applyMutation(new AnonymousClass2(th, null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.$selectedAccounts.isEmpty()) {
                    BeneficiariesApi beneficiariesApi = this.this$0.beneficiariesApi;
                    Companion companion = BeneficiaryCreateAdditionalAccountsDuxo.INSTANCE;
                    String account_number = ((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getConfiguration().getAccount_number();
                    ApiValidateAccountsRequest apiValidateAccountsRequest = new ApiValidateAccountsRequest(((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getConfiguration().getBeneficiary_id(), CollectionsKt.toList(this.$selectedAccounts), ((BeneficiaryCreateAdditionalAccountsFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getRelationship());
                    this.label = 1;
                    obj = beneficiariesApi.validateBeneficiaryAccounts(account_number, apiValidateAccountsRequest, this);
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

        /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$2$1", m3645f = "BeneficiaryCreateAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState>, Object> {
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
            public final Object invoke(BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState> continuation) {
                return ((AnonymousClass1) create(beneficiaryCreateAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryCreateAdditionalAccountsDataState.copy$default((BeneficiaryCreateAdditionalAccountsDataState) this.L$0, null, null, null, null, false, this.$additionalAgreements, null, 95, null);
            }
        }

        /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$2$2", m3645f = "BeneficiaryCreateAdditionalAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDuxo$validateAdditionalAccounts$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BeneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f3931$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3931$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3931$t, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState, Continuation<? super BeneficiaryCreateAdditionalAccountsDataState> continuation) {
                return ((AnonymousClass2) create(beneficiaryCreateAdditionalAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryCreateAdditionalAccountsDataState.copy$default((BeneficiaryCreateAdditionalAccountsDataState) this.L$0, null, null, null, null, false, null, new UiEvent(this.f3931$t), 47, null);
            }
        }
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryCreateAdditionalAccountsDuxo, BeneficiaryCreateAdditionalAccountsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryCreateAdditionalAccountsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryCreateAdditionalAccountsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryCreateAdditionalAccountsFragment.Args getArgs(BeneficiaryCreateAdditionalAccountsDuxo beneficiaryCreateAdditionalAccountsDuxo) {
            return (BeneficiaryCreateAdditionalAccountsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryCreateAdditionalAccountsDuxo);
        }
    }
}
