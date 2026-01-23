package com.robinhood.android.retirement.onboarding.outro.invest;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementInvestDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\r\u0010\u000eB!\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDataState;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "nuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/StateProvider;)V", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementInvestDuxo extends BaseDuxo<RetirementInvestDataState, RetirementInvestViewState> implements HasSavedState {
    private final RetirementNuxStore nuxStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementInvestDuxo(RetirementNuxStore nuxStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, StateProvider<? super RetirementInvestDataState, ? extends RetirementInvestViewState> stateProvider) {
        super(new RetirementInvestDataState(null, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(nuxStore, "nuxStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.nuxStore = nuxStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RetirementInvestDuxo(RetirementNuxStore nuxStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        this(nuxStore, duxoBundle, savedStateHandle, RetirementInvestDataState.INSTANCE.getStateProvider());
        Intrinsics.checkNotNullParameter(nuxStore, "nuxStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.nuxStore.getUninvestedViewModel(((RetirementInvestFragment.Key) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementInvestDuxo.onStart$lambda$0(this.f$0, (RetirementUninvestedViewModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RetirementInvestDuxo retirementInvestDuxo, RetirementUninvestedViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        retirementInvestDuxo.applyMutation(new RetirementInvestDuxo2(viewModel, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementInvestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDuxo;", "Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestFragment$Key;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementInvestDuxo, RetirementInvestFragment.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementInvestFragment.Key getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementInvestFragment.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementInvestFragment.Key getArgs(RetirementInvestDuxo retirementInvestDuxo) {
            return (RetirementInvestFragment.Key) DuxoCompanion.DefaultImpls.getArgs(this, retirementInvestDuxo);
        }
    }
}
