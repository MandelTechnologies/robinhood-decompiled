package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "updateUnderlyingId", "", "underlyingId", "Ljava/util/UUID;", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerDuxo extends BaseDuxo<OptionsPortfolioRiskAnalyzerDataState, OptionsPortfolioRiskAnalyzerViewState> implements HasArgs<OptionsPortfolioRiskAnalyzer.WithAccountNumber> {
    private static final String ARGS_RECENT_SELECTION = "RECENT_SELECTION_ID";
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public OptionsPortfolioRiskAnalyzer.WithAccountNumber getArgs(SavedStateHandle savedStateHandle) {
        return (OptionsPortfolioRiskAnalyzer.WithAccountNumber) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionsPortfolioRiskAnalyzerDuxo(DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        String accountNumber = ((OptionsPortfolioRiskAnalyzer.WithAccountNumber) companion.getArgs(savedStateHandle)).getAccountNumber();
        UUID uuid = (UUID) savedStateHandle.get(ARGS_RECENT_SELECTION);
        super(new OptionsPortfolioRiskAnalyzerDataState(accountNumber, uuid == null ? ((OptionsPortfolioRiskAnalyzer.WithAccountNumber) companion.getArgs(savedStateHandle)).getInitialUnderlyingId() : uuid), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerDuxo$updateUnderlyingId$1", m3645f = "OptionsPortfolioRiskAnalyzerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerDuxo$updateUnderlyingId$1 */
    static final class C234541 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerDataState, Continuation<? super OptionsPortfolioRiskAnalyzerDataState>, Object> {
        final /* synthetic */ UUID $underlyingId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C234541(UUID uuid, Continuation<? super C234541> continuation) {
            super(2, continuation);
            this.$underlyingId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C234541 c234541 = new C234541(this.$underlyingId, continuation);
            c234541.L$0 = obj;
            return c234541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerDataState optionsPortfolioRiskAnalyzerDataState, Continuation<? super OptionsPortfolioRiskAnalyzerDataState> continuation) {
            return ((C234541) create(optionsPortfolioRiskAnalyzerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsPortfolioRiskAnalyzerDataState.copy$default((OptionsPortfolioRiskAnalyzerDataState) this.L$0, null, this.$underlyingId, 1, null);
        }
    }

    public final void updateUnderlyingId(UUID underlyingId) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        getSavedStateHandle().set(ARGS_RECENT_SELECTION, underlyingId);
        applyMutation(new C234541(underlyingId, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "<init>", "()V", "ARGS_RECENT_SELECTION", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<OptionsPortfolioRiskAnalyzerDuxo, OptionsPortfolioRiskAnalyzer.WithAccountNumber> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public OptionsPortfolioRiskAnalyzer.WithAccountNumber getArgs(SavedStateHandle savedStateHandle) {
            return (OptionsPortfolioRiskAnalyzer.WithAccountNumber) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public OptionsPortfolioRiskAnalyzer.WithAccountNumber getArgs(OptionsPortfolioRiskAnalyzerDuxo optionsPortfolioRiskAnalyzerDuxo) {
            return (OptionsPortfolioRiskAnalyzer.WithAccountNumber) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, optionsPortfolioRiskAnalyzerDuxo);
        }
    }
}
