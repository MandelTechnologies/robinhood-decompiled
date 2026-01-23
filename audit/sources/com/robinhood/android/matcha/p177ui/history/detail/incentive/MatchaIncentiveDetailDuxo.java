package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesExperiment;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveDetailFragmentKey;
import com.robinhood.android.store.matcha.MatchaIncentivesStore;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.matcha.MatchaIncentive;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentiveDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaIncentivesStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaIncentivesStore;Lcom/robinhood/android/store/matcha/MatchaTransferStore;Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaIncentiveDetailDuxo extends BaseDuxo<MatchaIncentiveDetailDataState, MatchaIncentiveDetailViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final MatchaIncentivesStore matchaIncentivesStore;
    private final MatchaIncentivesSummaryStore matchaIncentivesSummaryStore;
    private final MatchaTransferStore matchaTransferStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaIncentiveDetailDuxo(MatchaIncentivesStore matchaIncentivesStore, MatchaTransferStore matchaTransferStore, MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, ExperimentsStore experimentsStore, MatchaIncentiveDetailStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MatchaIncentiveDetailDataState(null, null, null, false, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaIncentivesStore, "matchaIncentivesStore");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaIncentivesStore = matchaIncentivesStore;
        this.matchaTransferStore = matchaTransferStore;
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.matchaIncentivesSummaryStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaIncentivesSummaryStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentiveDetailDuxo.onStart$lambda$0(this.f$0, (MatchaIncentivesSummary) obj);
            }
        });
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MatchaIncentivesExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentiveDetailDuxo.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Observable<R> observableSwitchMap = this.matchaIncentivesStore.stream().switchMap(new Function() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo.onStart.3

            /* compiled from: MatchaIncentiveDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$onStart$3$1", m3645f = "MatchaIncentiveDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$onStart$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaIncentiveDetailDataState, Continuation<? super MatchaIncentiveDetailDataState>, Object> {
                final /* synthetic */ MatchaIncentive $incentive;
                final /* synthetic */ List<MatchaIncentive> $incentives;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MatchaIncentive matchaIncentive, List<MatchaIncentive> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$incentive = matchaIncentive;
                    this.$incentives = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$incentive, this.$incentives, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MatchaIncentiveDetailDataState matchaIncentiveDetailDataState, Continuation<? super MatchaIncentiveDetailDataState> continuation) {
                    return ((AnonymousClass1) create(matchaIncentiveDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MatchaIncentiveDetailDataState matchaIncentiveDetailDataState = (MatchaIncentiveDetailDataState) this.L$0;
                    MatchaIncentive matchaIncentive = this.$incentive;
                    List<MatchaIncentive> list = this.$incentives;
                    Intrinsics.checkNotNull(list);
                    return MatchaIncentiveDetailDataState.copy$default(matchaIncentiveDetailDataState, matchaIncentive, null, list, false, null, 26, null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MatchaTransfer>> apply(List<MatchaIncentive> incentives) {
                T next;
                Intrinsics.checkNotNullParameter(incentives, "incentives");
                MatchaIncentiveDetailDuxo matchaIncentiveDetailDuxo = MatchaIncentiveDetailDuxo.this;
                Iterator<T> it = incentives.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((MatchaIncentive) next).getId(), ((MatchaIncentiveDetailFragmentKey) MatchaIncentiveDetailDuxo.INSTANCE.getArgs((HasSavedState) matchaIncentiveDetailDuxo)).getIncentiveId())) {
                        break;
                    }
                }
                MatchaIncentive matchaIncentive = next;
                MatchaIncentiveDetailDuxo.this.applyMutation(new AnonymousClass1(matchaIncentive, incentives, null));
                if (matchaIncentive != null) {
                    return ObservablesKt.toOptionals(MatchaIncentiveDetailDuxo.this.matchaTransferStore.streamMatchaTransfer(matchaIncentive.getTransferId()));
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentiveDetailDuxo.onStart$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(MatchaIncentiveDetailDuxo matchaIncentiveDetailDuxo, MatchaIncentivesSummary incentivesSummary) {
        Intrinsics.checkNotNullParameter(incentivesSummary, "incentivesSummary");
        matchaIncentiveDetailDuxo.applyMutation(new MatchaIncentiveDetailDuxo2(incentivesSummary, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MatchaIncentiveDetailDuxo matchaIncentiveDetailDuxo, Boolean bool) {
        matchaIncentiveDetailDuxo.applyMutation(new MatchaIncentiveDetailDuxo3(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(MatchaIncentiveDetailDuxo matchaIncentiveDetailDuxo, Optional optional) {
        matchaIncentiveDetailDuxo.applyMutation(new MatchaIncentiveDetailDuxo4((MatchaTransfer) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaIncentiveDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDuxo;", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveDetailFragmentKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaIncentiveDetailDuxo, MatchaIncentiveDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaIncentiveDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaIncentiveDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaIncentiveDetailFragmentKey getArgs(MatchaIncentiveDetailDuxo matchaIncentiveDetailDuxo) {
            return (MatchaIncentiveDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, matchaIncentiveDetailDuxo);
        }
    }
}
