package com.robinhood.android.iav.p154ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.iav.p154ui.PlaidLoadingFragment;
import com.robinhood.android.iav.p154ui.PlaidLoadingViewState3;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.p370rx.delay.SingleDelay2;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidLoadingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/iav/ui/PlaidLoadingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isQueued", "", "onCreate", "", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PlaidLoadingDuxo extends OldBaseDuxo<PlaidLoadingViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final ExperimentsStore experimentsStore;
    private final boolean isQueued;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlaidLoadingDuxo(TransferAccountStore transferAccountStore, AchRelationshipStore achRelationshipStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle) {
        super(new PlaidLoadingViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.transferAccountStore = transferAccountStore;
        this.achRelationshipStore = achRelationshipStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.isQueued = ((PlaidLoadingFragment.Args) INSTANCE.getArgs(getSavedStateHandle())).getSource().getIsQueued();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        Observable<Boolean> observable;
        super.onCreate();
        Observables observables = Observables.INSTANCE;
        if (this.isQueued) {
            observable = Observable.just(Boolean.FALSE);
            Intrinsics.checkNotNull(observable);
        } else {
            observable = this.transferAccountStore.fetchNoActiveInternalAccounts().toObservable();
            Intrinsics.checkNotNull(observable);
        }
        Observable observableZip = observables.zip(observable, this.achRelationshipStore.getHasReachedLinkedAchRelationshipsLimit(), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.MOBILE_PLAID_EXPERIMENT.INSTANCE}, false, null, 6, null));
        Boolean bool = Boolean.FALSE;
        Single map = observableZip.first(new Tuples3(bool, bool, Boolean.TRUE)).map(new Function() { // from class: com.robinhood.android.iav.ui.PlaidLoadingDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final PlaidLoadingViewState2 apply(Tuples3<Boolean, Boolean, Boolean> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                Boolean boolComponent1 = tuples3.component1();
                boolean zBooleanValue = tuples3.component2().booleanValue();
                boolean zBooleanValue2 = tuples3.component3().booleanValue();
                if (boolComponent1.booleanValue()) {
                    return PlaidLoadingViewState2.DEACTIVATE_ACCOUNT;
                }
                if (zBooleanValue) {
                    return PlaidLoadingViewState2.REACHED_LINKED_ACH_RELATIONSHIPS_LIMIT;
                }
                if (zBooleanValue2) {
                    return PlaidLoadingViewState2.SHOW_PLAID_FLOW;
                }
                return PlaidLoadingViewState2.SHOW_MICRO_DEPOSITS_FLOW;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SingleDelay2.minTimeInFlight(map, 200L, TimeUnit.MILLISECONDS), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidLoadingDuxo.onCreate$lambda$1(this.f$0, (PlaidLoadingViewState2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(PlaidLoadingDuxo plaidLoadingDuxo, final PlaidLoadingViewState2 plaidLoadingViewState2) {
        plaidLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidLoadingDuxo.onCreate$lambda$1$lambda$0(plaidLoadingViewState2, (PlaidLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlaidLoadingViewState onCreate$lambda$1$lambda$0(PlaidLoadingViewState2 plaidLoadingViewState2, PlaidLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(plaidLoadingViewState2);
        return applyMutation.copy(new PlaidLoadingViewState3.Loaded(plaidLoadingViewState2));
    }

    /* compiled from: PlaidLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/iav/ui/PlaidLoadingDuxo;", "Lcom/robinhood/android/iav/ui/PlaidLoadingFragment$Args;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PlaidLoadingDuxo, PlaidLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PlaidLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PlaidLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PlaidLoadingFragment.Args getArgs(PlaidLoadingDuxo plaidLoadingDuxo) {
            return (PlaidLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, plaidLoadingDuxo);
        }
    }
}
