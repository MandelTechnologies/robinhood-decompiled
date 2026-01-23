package com.robinhood.android.optionschain.chainsettings.education;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.options.contracts.OptionChainCustomizationEducationLaunchMode;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OptionChainCustomizationEducation;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDataState;", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "stateProvider", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "updateSelectedCategoryIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainCustomizationEducationDuxo extends BaseDuxo<OptionChainCustomizationEducationDataState, OptionChainCustomizationEducationViewState> implements HasSavedState {
    private final OptionChainCustomizationStore optionChainCustomizationStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainCustomizationEducationDuxo(OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationEducationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionChainCustomizationEducationDataState((OptionChainCustomizationEducationLaunchMode) INSTANCE.getArgs(savedStateHandle), null, null, 6, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Observable<OptionChainCustomizationEducation> observableAsObservable;
        OptionChainCustomizationEducationLaunchMode optionChainCustomizationEducationLaunchMode = (OptionChainCustomizationEducationLaunchMode) INSTANCE.getArgs((HasSavedState) this);
        if (optionChainCustomizationEducationLaunchMode instanceof OptionChainCustomizationEducationLaunchMode.MainChain) {
            observableAsObservable = this.optionChainCustomizationStore.getStreamChainEducationById().asObservable(((OptionChainCustomizationEducationLaunchMode.MainChain) optionChainCustomizationEducationLaunchMode).getOrderSide().getServerValue());
        } else {
            if (!(optionChainCustomizationEducationLaunchMode instanceof OptionChainCustomizationEducationLaunchMode.StrategyBuilder)) {
                throw new NoWhenBranchMatchedException();
            }
            observableAsObservable = this.optionChainCustomizationStore.getStreamStrategyBuilderEducationById().asObservable(((OptionChainCustomizationEducationLaunchMode.StrategyBuilder) optionChainCustomizationEducationLaunchMode).getStrategyType().getServerValue());
        }
        Observable<OptionChainCustomizationEducation> observableDistinctUntilChanged = observableAsObservable.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationEducationDuxo.onCreate$lambda$0(this.f$0, (OptionChainCustomizationEducation) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionChainCustomizationEducationDuxo optionChainCustomizationEducationDuxo, OptionChainCustomizationEducation optionChainCustomizationEducation) {
        optionChainCustomizationEducationDuxo.applyMutation(new OptionChainCustomizationEducationDuxo2(optionChainCustomizationEducation, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainCustomizationEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationDuxo$updateSelectedCategoryIndex$1", m3645f = "OptionChainCustomizationEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.education.OptionChainCustomizationEducationDuxo$updateSelectedCategoryIndex$1 */
    static final class C243141 extends ContinuationImpl7 implements Function2<OptionChainCustomizationEducationDataState, Continuation<? super OptionChainCustomizationEducationDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C243141(int i, Continuation<? super C243141> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C243141 c243141 = new C243141(this.$index, continuation);
            c243141.L$0 = obj;
            return c243141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainCustomizationEducationDataState optionChainCustomizationEducationDataState, Continuation<? super OptionChainCustomizationEducationDataState> continuation) {
            return ((C243141) create(optionChainCustomizationEducationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainCustomizationEducationDataState.copy$default((OptionChainCustomizationEducationDataState) this.L$0, null, boxing.boxInt(this.$index), null, 5, null);
        }
    }

    public final void updateSelectedCategoryIndex(int index) {
        applyMutation(new C243141(index, null));
    }

    /* compiled from: OptionChainCustomizationEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDuxo;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionChainCustomizationEducationDuxo, OptionChainCustomizationEducationLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainCustomizationEducationLaunchMode getArgs(SavedStateHandle savedStateHandle) {
            return (OptionChainCustomizationEducationLaunchMode) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainCustomizationEducationLaunchMode getArgs(OptionChainCustomizationEducationDuxo optionChainCustomizationEducationDuxo) {
            return (OptionChainCustomizationEducationLaunchMode) DuxoCompanion.DefaultImpls.getArgs(this, optionChainCustomizationEducationDuxo);
        }
    }
}
