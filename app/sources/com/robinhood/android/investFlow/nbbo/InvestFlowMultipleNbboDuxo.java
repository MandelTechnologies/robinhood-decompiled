package com.robinhood.android.investFlow.nbbo;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowMultipleNbboDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "investFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "refresh", "initial", "", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowMultipleNbboDuxo extends OldBaseDuxo<InvestFlowMultipleNbboViewState> implements HasSavedState {
    private final InvestFlowStore investFlowStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowMultipleNbboDuxo(InvestFlowStore investFlowStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(investFlowStore, "investFlowStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        boolean z = false;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = null;
        List list = null;
        super(new InvestFlowMultipleNbboViewState(z, ((InvestFlowMultipleNbboArgs) companion.getArgs(savedStateHandle)).getTotalAmount(), apiInvestFlowNbboResponse, ((InvestFlowMultipleNbboArgs) companion.getArgs(savedStateHandle)).getBrokerageAccountType(), list, ((InvestFlowMultipleNbboArgs) companion.getArgs(savedStateHandle)).getAccountNumber(), 21, null), null, 2, 0 == true ? 1 : 0);
        this.investFlowStore = investFlowStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        refresh(true);
    }

    public static /* synthetic */ void refresh$default(InvestFlowMultipleNbboDuxo investFlowMultipleNbboDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investFlowMultipleNbboDuxo.refresh(z);
    }

    public final void refresh(boolean initial) {
        Single<ApiInvestFlowNbboResponse> singleDoOnSubscribe = this.investFlowStore.getNbbo(((InvestFlowMultipleNbboArgs) INSTANCE.getArgs((HasSavedState) this)).getAssetAllocations()).doOnSubscribe(new C193721(initial, this));
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowMultipleNbboDuxo.refresh$lambda$1(this.f$0, (ApiInvestFlowNbboResponse) obj);
            }
        });
    }

    /* compiled from: InvestFlowMultipleNbboDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboDuxo$refresh$1 */
    static final class C193721<T> implements Consumer {
        final /* synthetic */ boolean $initial;
        final /* synthetic */ InvestFlowMultipleNbboDuxo this$0;

        C193721(boolean z, InvestFlowMultipleNbboDuxo investFlowMultipleNbboDuxo) {
            this.$initial = z;
            this.this$0 = investFlowMultipleNbboDuxo;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            if (this.$initial) {
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboDuxo$refresh$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestFlowMultipleNbboDuxo.C193721.accept$lambda$0((InvestFlowMultipleNbboViewState) obj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InvestFlowMultipleNbboViewState accept$lambda$0(InvestFlowMultipleNbboViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return InvestFlowMultipleNbboViewState.copy$default(applyMutation, true, null, null, null, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$1(InvestFlowMultipleNbboDuxo investFlowMultipleNbboDuxo, final ApiInvestFlowNbboResponse apiInvestFlowNbboResponse) {
        investFlowMultipleNbboDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowMultipleNbboDuxo.refresh$lambda$1$lambda$0(apiInvestFlowNbboResponse, (InvestFlowMultipleNbboViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowMultipleNbboViewState refresh$lambda$1$lambda$0(ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, InvestFlowMultipleNbboViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InvestFlowMultipleNbboViewState.copy$default(applyMutation, false, null, apiInvestFlowNbboResponse, null, null, null, 58, null);
    }

    /* compiled from: InvestFlowMultipleNbboDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboDuxo;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowMultipleNbboDuxo, InvestFlowMultipleNbboArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowMultipleNbboArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowMultipleNbboArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowMultipleNbboArgs getArgs(InvestFlowMultipleNbboDuxo investFlowMultipleNbboDuxo) {
            return (InvestFlowMultipleNbboArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowMultipleNbboDuxo);
        }
    }
}
