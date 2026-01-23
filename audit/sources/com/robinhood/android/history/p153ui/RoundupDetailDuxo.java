package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.history.p153ui.RoundupDetailDuxo;
import com.robinhood.android.history.p153ui.RoundupDetailFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.RhyRewardStore;
import com.robinhood.librobinhood.data.store.RoundupTimelineStore;
import com.robinhood.models.p320db.mcduckling.RoundupTimeline;
import com.robinhood.models.p355ui.UiRoundupReward;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundupDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RoundupDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/RoundupDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyRewardStore", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "roundupTimelineStore", "Lcom/robinhood/librobinhood/data/store/RoundupTimelineStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyRewardStore;Lcom/robinhood/librobinhood/data/store/RoundupTimelineStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "skipRoundupOrder", "roundupId", "Ljava/util/UUID;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class RoundupDetailDuxo extends OldBaseDuxo<RoundupDetailViewState> implements HasSavedState {
    private final RhyRewardStore rhyRewardStore;
    private final RoundupTimelineStore roundupTimelineStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoundupDetailDuxo(RhyRewardStore rhyRewardStore, RoundupTimelineStore roundupTimelineStore, SavedStateHandle savedStateHandle) {
        super(new RoundupDetailViewState(false, null, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        Intrinsics.checkNotNullParameter(roundupTimelineStore, "roundupTimelineStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhyRewardStore = rhyRewardStore;
        this.roundupTimelineStore = roundupTimelineStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyRewardStore.refresh(true);
        Observable<R> observableFlatMap = this.rhyRewardStore.streamReward(((RoundupDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getRoundupId()).distinctUntilChanged().flatMap(new Function() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<UiRoundupReward, RoundupTimeline>> apply(final UiRoundupReward uiRoundupReward) {
                Intrinsics.checkNotNullParameter(uiRoundupReward, "uiRoundupReward");
                RoundupDetailDuxo.this.roundupTimelineStore.refresh(uiRoundupReward.getId(), true);
                return RoundupDetailDuxo.this.roundupTimelineStore.stream(uiRoundupReward.getId()).map(new Function() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo.onStart.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<UiRoundupReward, RoundupTimeline> apply(RoundupTimeline roundupTimeline) {
                        Intrinsics.checkNotNullParameter(roundupTimeline, "roundupTimeline");
                        return new Tuples2<>(uiRoundupReward, roundupTimeline);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupDetailDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RoundupDetailDuxo roundupDetailDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final UiRoundupReward uiRoundupReward = (UiRoundupReward) objComponent1;
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final RoundupTimeline roundupTimeline = (RoundupTimeline) objComponent2;
        roundupDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupDetailDuxo.onStart$lambda$1$lambda$0(uiRoundupReward, roundupTimeline, (RoundupDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundupDetailViewState onStart$lambda$1$lambda$0(UiRoundupReward uiRoundupReward, RoundupTimeline roundupTimeline, RoundupDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RoundupDetailViewState.copy$default(applyMutation, false, uiRoundupReward, null, roundupTimeline, 4, null);
    }

    public final void skipRoundupOrder(final UUID roundupId) {
        Intrinsics.checkNotNullParameter(roundupId, "roundupId");
        Single<Unit> singleDoOnSubscribe = this.roundupTimelineStore.skipRoundupOrder(roundupId).doOnSubscribe(new C184181());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupDetailDuxo.skipRoundupOrder$lambda$3(this.f$0, roundupId, (Unit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupDetailDuxo.skipRoundupOrder$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RoundupDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.RoundupDetailDuxo$skipRoundupOrder$1 */
    static final class C184181<T> implements Consumer {
        C184181() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RoundupDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$skipRoundupOrder$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoundupDetailDuxo.C184181.accept$lambda$0((RoundupDetailViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RoundupDetailViewState accept$lambda$0(RoundupDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RoundupDetailViewState.copy$default(applyMutation, true, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit skipRoundupOrder$lambda$3(RoundupDetailDuxo roundupDetailDuxo, UUID uuid, Unit unit) {
        roundupDetailDuxo.roundupTimelineStore.refresh(uuid, true);
        roundupDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupDetailDuxo.skipRoundupOrder$lambda$3$lambda$2((RoundupDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundupDetailViewState skipRoundupOrder$lambda$3$lambda$2(RoundupDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RoundupDetailViewState.copy$default(applyMutation, false, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit skipRoundupOrder$lambda$5(RoundupDetailDuxo roundupDetailDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        roundupDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.RoundupDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupDetailDuxo.skipRoundupOrder$lambda$5$lambda$4(throwable, (RoundupDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundupDetailViewState skipRoundupOrder$lambda$5$lambda$4(Throwable th, RoundupDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RoundupDetailViewState.copy$default(applyMutation, false, null, new UiEvent(th), null, 10, null);
    }

    /* compiled from: RoundupDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/RoundupDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/RoundupDetailDuxo;", "Lcom/robinhood/android/history/ui/RoundupDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RoundupDetailDuxo, RoundupDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RoundupDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RoundupDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RoundupDetailFragment.Args getArgs(RoundupDetailDuxo roundupDetailDuxo) {
            return (RoundupDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, roundupDetailDuxo);
        }
    }
}
