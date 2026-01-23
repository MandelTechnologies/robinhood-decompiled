package com.robinhood.android.cash.rewards.p074ui.notification;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.rhy.contracts.RoundupRewardsDetailIntentKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.RhyRewardStore;
import com.robinhood.models.p355ui.UiRoundupReward;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsNotificationDetailsActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyRewardStore", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyRewardStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsNotificationDetailsActivityDuxo extends BaseDuxo4<RewardsNotificationDetailsActivityViewState> implements HasSavedState {
    private final RhyRewardStore rhyRewardStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsNotificationDetailsActivityDuxo(RhyRewardStore rhyRewardStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new RewardsNotificationDetailsActivityViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rhyRewardStore, "rhyRewardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rhyRewardStore = rhyRewardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.rhyRewardStore.refresh(true);
        Observable<R> map = this.rhyRewardStore.streamReward(((RoundupRewardsDetailIntentKey) INSTANCE.getExtras((HasSavedState) this)).getRoundupId()).map(new Function() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsActivityDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(Boolean.valueOf(((UiRoundupReward) it).getHasBonus()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C10182xec5828cd<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsActivityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsNotificationDetailsActivityDuxo.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RewardsNotificationDetailsActivityDuxo rewardsNotificationDetailsActivityDuxo, Boolean bool) {
        rewardsNotificationDetailsActivityDuxo.applyMutation(new RewardsNotificationDetailsActivityDuxo2(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsNotificationDetailsActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsActivityDuxo;", "Lcom/robinhood/android/rhy/contracts/RoundupRewardsDetailIntentKey;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<RewardsNotificationDetailsActivityDuxo, RoundupRewardsDetailIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public RoundupRewardsDetailIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (RoundupRewardsDetailIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public RoundupRewardsDetailIntentKey getExtras(RewardsNotificationDetailsActivityDuxo rewardsNotificationDetailsActivityDuxo) {
            return (RoundupRewardsDetailIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, rewardsNotificationDetailsActivityDuxo);
        }
    }
}
