package com.robinhood.android.rewards.p240ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.rewards.p240ui.RewardDetailDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.RewardStore;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.p320db.RewardData;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p355ui.UiRewards3;
import com.robinhood.models.p355ui.UiStandaloneStockRewardItem;
import com.robinhood.shared.history.contracts.RewardDetailFragmentKey;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rewards/ui/RewardDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rewards/ui/RewardDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "rewardStore", "Lcom/robinhood/librobinhood/data/store/RewardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/RewardStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "observeRewardStore", "key", "Lcom/robinhood/shared/history/contracts/RewardDetailFragmentKey;", "Companion", "feature-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardDetailDuxo extends OldBaseDuxo<RewardDetailViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AccountProvider accountProvider;
    private final BackupWithholdingStore backupWithholdingStore;
    private final RewardStore rewardStore;
    private final SavedStateHandle savedStateHandle;

    /* compiled from: RewardDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardDetailFragmentKey.Type.values().length];
            try {
                iArr[RewardDetailFragmentKey.Type.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardDetailFragmentKey.Type.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardDetailDuxo(AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, RewardStore rewardStore, SavedStateHandle savedStateHandle) {
        super(new RewardDetailViewState((RewardDetailFragmentKey) INSTANCE.getArgs(savedStateHandle), null, null, null, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(rewardStore, "rewardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.rewardStore = rewardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        observeRewardStore((RewardDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this));
    }

    private final void observeRewardStore(RewardDetailFragmentKey key) {
        Observable observableStreamReward;
        Observable observableAsObservable;
        final UUID id = key.getId();
        RewardDetailFragmentKey.Type type2 = key.getType();
        this.rewardStore.refresh(true);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[type2.ordinal()];
        if (i == 1) {
            observableStreamReward = this.rewardStore.streamReward(id);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            observableStreamReward = this.rewardStore.streamCashReward(id);
        }
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamReward, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C273161());
        int i2 = iArr[type2.ordinal()];
        if (i2 == 1) {
            observableAsObservable = asObservable(this.rewardStore.streamItem(id));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            observableAsObservable = Observable.empty();
        }
        Intrinsics.checkNotNull(observableAsObservable);
        Observable map = observableAsObservable.map(new Function() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo$observeRewardStore$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiRewards3 uiRewards3 = (UiRewards3) it;
                UiStandaloneStockRewardItem uiStandaloneStockRewardItem = uiRewards3 instanceof UiStandaloneStockRewardItem ? (UiStandaloneStockRewardItem) uiRewards3 : null;
                return Optional3.asOptional(uiStandaloneStockRewardItem != null ? uiStandaloneStockRewardItem.getAssetCurrency() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RewardDetailDuxo$observeRewardStore$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardDetailDuxo.observeRewardStore$lambda$2(this.f$0, (Currency) obj);
            }
        });
        Observable<R> observableSwitchMap = this.accountProvider.getIndividualAccountNumber().toObservable().switchMap(new Function() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo.observeRewardStore.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingAmount>> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 != null) {
                    Observable<Optional<WithholdingAmount>> observablePollWithholdingAmount = RewardDetailDuxo.this.backupWithholdingStore.pollWithholdingAmount(new Tuples2<>(strComponent1, CollectionsKt.listOf(id)));
                    if (observablePollWithholdingAmount != null) {
                        return observablePollWithholdingAmount;
                    }
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardDetailDuxo.observeRewardStore$lambda$4(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: RewardDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rewards.ui.RewardDetailDuxo$observeRewardStore$1 */
    static final class C273161 implements Function1<?, Unit> {
        C273161() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((Object) obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardDetailViewState invoke$lambda$0(Object obj, RewardDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardDetailViewState.copy$default(applyMutation, null, (RewardData) obj, null, null, 13, null);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final Object reward) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            RewardDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo$observeRewardStore$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardDetailDuxo.C273161.invoke$lambda$0(reward, (RewardDetailViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeRewardStore$lambda$2(RewardDetailDuxo rewardDetailDuxo, final Currency assetCurrency) {
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        rewardDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardDetailDuxo.observeRewardStore$lambda$2$lambda$1(assetCurrency, (RewardDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardDetailViewState observeRewardStore$lambda$2$lambda$1(Currency currency, RewardDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardDetailViewState.copy$default(applyMutation, null, null, null, currency, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeRewardStore$lambda$4(RewardDetailDuxo rewardDetailDuxo, Optional optional) {
        final WithholdingAmount withholdingAmount = (WithholdingAmount) optional.component1();
        rewardDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rewards.ui.RewardDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardDetailDuxo.observeRewardStore$lambda$4$lambda$3(withholdingAmount, (RewardDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardDetailViewState observeRewardStore$lambda$4$lambda$3(WithholdingAmount withholdingAmount, RewardDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardDetailViewState.copy$default(applyMutation, null, null, withholdingAmount, null, 11, null);
    }

    /* compiled from: RewardDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rewards/ui/RewardDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rewards/ui/RewardDetailDuxo;", "Lcom/robinhood/shared/history/contracts/RewardDetailFragmentKey;", "<init>", "()V", "feature-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RewardDetailDuxo, RewardDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RewardDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardDetailFragmentKey getArgs(RewardDetailDuxo rewardDetailDuxo) {
            return (RewardDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, rewardDetailDuxo);
        }
    }
}
