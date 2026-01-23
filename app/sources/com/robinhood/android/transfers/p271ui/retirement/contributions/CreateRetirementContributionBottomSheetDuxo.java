package com.robinhood.android.transfers.p271ui.retirement.contributions;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.api.contributions.ApiIraContributionBottomSheetResponse;
import com.robinhood.android.transfers.contracts.CreateRetirementContributionsDialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import kotlin.Metadata;
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

/* compiled from: CreateRetirementContributionBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "contributionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateRetirementContributionBottomSheetDuxo extends BaseDuxo4<CreateRetirementContributionBottomSheetViewState> implements HasSavedState {
    private final ContributionStore contributionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRetirementContributionBottomSheetDuxo(ContributionStore contributionStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new CreateRetirementContributionBottomSheetViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contributionStore = contributionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C310291(null));
    }

    /* compiled from: CreateRetirementContributionBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionBottomSheetDuxo$onCreate$1", m3645f = "CreateRetirementContributionBottomSheetDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionBottomSheetDuxo$onCreate$1 */
    static final class C310291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310291(Continuation<? super C310291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310291 c310291 = CreateRetirementContributionBottomSheetDuxo.this.new C310291(continuation);
            c310291.L$0 = obj;
            return c310291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreateRetirementContributionBottomSheetDuxo createRetirementContributionBottomSheetDuxo = CreateRetirementContributionBottomSheetDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    ContributionStore contributionStore = createRetirementContributionBottomSheetDuxo.contributionStore;
                    Companion companion2 = CreateRetirementContributionBottomSheetDuxo.INSTANCE;
                    String amountSelected = ((CreateRetirementContributionsDialogFragmentKey) companion2.getArgs((HasSavedState) createRetirementContributionBottomSheetDuxo)).getAmountSelected();
                    int taxYear = ((CreateRetirementContributionsDialogFragmentKey) companion2.getArgs((HasSavedState) createRetirementContributionBottomSheetDuxo)).getTaxYear();
                    boolean excludeUserContributionsSection = ((CreateRetirementContributionsDialogFragmentKey) companion2.getArgs((HasSavedState) createRetirementContributionBottomSheetDuxo)).getExcludeUserContributionsSection();
                    this.label = 1;
                    obj = contributionStore.getContributionBottomSheet(amountSelected, taxYear, excludeUserContributionsSection, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiIraContributionBottomSheetResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            CreateRetirementContributionBottomSheetDuxo createRetirementContributionBottomSheetDuxo2 = CreateRetirementContributionBottomSheetDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                createRetirementContributionBottomSheetDuxo2.applyMutation(new CreateRetirementContributionBottomSheetDuxo2((ApiIraContributionBottomSheetResponse) objM28550constructorimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CreateRetirementContributionBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionBottomSheetDuxo;", "Lcom/robinhood/android/transfers/contracts/CreateRetirementContributionsDialogFragmentKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateRetirementContributionBottomSheetDuxo, CreateRetirementContributionsDialogFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateRetirementContributionsDialogFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CreateRetirementContributionsDialogFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateRetirementContributionsDialogFragmentKey getArgs(CreateRetirementContributionBottomSheetDuxo createRetirementContributionBottomSheetDuxo) {
            return (CreateRetirementContributionsDialogFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, createRetirementContributionBottomSheetDuxo);
        }
    }
}
