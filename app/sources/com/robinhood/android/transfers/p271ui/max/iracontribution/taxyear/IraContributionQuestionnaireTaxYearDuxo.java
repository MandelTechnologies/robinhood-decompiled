package com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.udf.UiEvent;
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

/* compiled from: IraContributionQuestionnaireTaxYearDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearDataState;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/StateProvider;)V", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onYearSelected", "", "taxYear", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$TaxYearRow;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraContributionQuestionnaireTaxYearDuxo extends BaseDuxo<TaxYearDataState, TaxYearViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IraContributionQuestionnaireTaxYearDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, StateProvider<? super TaxYearDataState, TaxYearViewState> stateProvider) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        super(new TaxYearDataState(((IraContributionQuestionnaireTaxYearFragment.Args) companion.getArgs(savedStateHandle)).getTaxYearViewModel(), ((IraContributionQuestionnaireTaxYearFragment.Args) companion.getArgs(savedStateHandle)).getSelectionStyle(), (ApiIraContributionQuestionnaire.TaxYearRow) CollectionsKt.first((List) ((IraContributionQuestionnaireTaxYearFragment.Args) companion.getArgs(savedStateHandle)).getTaxYearViewModel().getRows()), null, 8, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IraContributionQuestionnaireTaxYearDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        this(duxoBundle, savedStateHandle, TaxYearDataState.INSTANCE.getStateProvider());
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    /* compiled from: IraContributionQuestionnaireTaxYearDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/TaxYearDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearDuxo$onYearSelected$1", m3645f = "IraContributionQuestionnaireTaxYearDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearDuxo$onYearSelected$1 */
    static final class C308841 extends ContinuationImpl7 implements Function2<TaxYearDataState, Continuation<? super TaxYearDataState>, Object> {
        final /* synthetic */ ApiIraContributionQuestionnaire.TaxYearRow $taxYear;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C308841(ApiIraContributionQuestionnaire.TaxYearRow taxYearRow, Continuation<? super C308841> continuation) {
            super(2, continuation);
            this.$taxYear = taxYearRow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308841 c308841 = new C308841(this.$taxYear, continuation);
            c308841.L$0 = obj;
            return c308841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TaxYearDataState taxYearDataState, Continuation<? super TaxYearDataState> continuation) {
            return ((C308841) create(taxYearDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TaxYearDataState taxYearDataState = (TaxYearDataState) this.L$0;
            if (taxYearDataState.getSelectionStyle() == IraContributionQuestionnaireLaunchMode.SelectionStyle.RADIO_BUTTON) {
                return TaxYearDataState.copy$default(taxYearDataState, null, null, this.$taxYear, null, 11, null);
            }
            return TaxYearDataState.copy$default(taxYearDataState, null, null, null, new UiEvent(this.$taxYear), 7, null);
        }
    }

    public final void onYearSelected(ApiIraContributionQuestionnaire.TaxYearRow taxYear) {
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        applyMutation(new C308841(taxYear, null));
    }

    /* compiled from: IraContributionQuestionnaireTaxYearDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearDuxo;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IraContributionQuestionnaireTaxYearDuxo, IraContributionQuestionnaireTaxYearFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IraContributionQuestionnaireTaxYearFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (IraContributionQuestionnaireTaxYearFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IraContributionQuestionnaireTaxYearFragment.Args getArgs(IraContributionQuestionnaireTaxYearDuxo iraContributionQuestionnaireTaxYearDuxo) {
            return (IraContributionQuestionnaireTaxYearFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, iraContributionQuestionnaireTaxYearDuxo);
        }
    }
}
