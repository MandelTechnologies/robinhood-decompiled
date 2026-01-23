package com.robinhood.android.gold.boost.maxawareness;

import com.robinhood.android.gold.boost.maxawareness.experiments.GoldDepositBoostMaxAwarenessExperiment;
import com.robinhood.android.gold.boost.maxawareness.experiments.MoneyMovementGoldSplitExperiment;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostMaxAwarenessStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "Lcom/robinhood/store/Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/store/StoreBundle;)V", "streamGoldDepositBoostMaxAwareness", "Lio/reactivex/Observable;", "", "streamGoldDepositBoostMaxAwarenessOrControl2", "streamGoldDepositBoostMaxAwarenessVariantMatch", "variantsToMatch", "", "Lcom/robinhood/android/gold/boost/maxawareness/experiments/GoldDepositBoostMaxAwarenessExperiment$Variant;", "streamGoldDepositBoostMaxAwarenessVariantMatch$lib_gold_deposit_boost_max_awareness_externalDebug", "([Lcom/robinhood/android/gold/boost/maxawareness/experiments/GoldDepositBoostMaxAwarenessExperiment$Variant;)Lio/reactivex/Observable;", "lib-gold-deposit-boost-max-awareness_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDepositBoostMaxAwarenessStore extends Store {
    private final ExperimentsStore experimentsStore;
    private final GoldSubscriptionStore goldSubscriptionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldDepositBoostMaxAwarenessStore(ExperimentsStore experimentsStore, GoldSubscriptionStore goldSubscriptionStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.experimentsStore = experimentsStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
    }

    public final Observable<Boolean> streamGoldDepositBoostMaxAwareness() {
        return m2047xbcdd1d2f(GoldDepositBoostMaxAwarenessExperiment.Variant.MAX_AWARENESS);
    }

    public final Observable<Boolean> streamGoldDepositBoostMaxAwarenessOrControl2() {
        return m2047xbcdd1d2f(GoldDepositBoostMaxAwarenessExperiment.Variant.MAX_AWARENESS, GoldDepositBoostMaxAwarenessExperiment.Variant.CONTROL_2);
    }

    /* renamed from: streamGoldDepositBoostMaxAwarenessVariantMatch$lib_gold_deposit_boost_max_awareness_externalDebug */
    public final Observable<Boolean> m2047xbcdd1d2f(final GoldDepositBoostMaxAwarenessExperiment.Variant... variantsToMatch) {
        Intrinsics.checkNotNullParameter(variantsToMatch, "variantsToMatch");
        Observable observableSwitchMap = this.goldSubscriptionStore.streamGoldSubscriptionState().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore$streamGoldDepositBoostMaxAwarenessVariantMatch$1

            /* compiled from: GoldDepositBoostMaxAwarenessStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore$streamGoldDepositBoostMaxAwarenessVariantMatch$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GoldSubscriptionStore.GoldSubscriptionState.values().length];
                    try {
                        iArr[GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(GoldSubscriptionStore.GoldSubscriptionState subscriptionState) {
                Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
                if (WhenMappings.$EnumSwitchMapping$0[subscriptionState.ordinal()] == 1) {
                    Observable observableStreamVariant$default = ExperimentsProvider.DefaultImpls.streamVariant$default(this.this$0.experimentsStore, MoneyMovementGoldSplitExperiment.INSTANCE, MoneyMovementGoldSplitExperiment.Variant.INCLUDED, false, 4, null);
                    final GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.this$0;
                    final GoldDepositBoostMaxAwarenessExperiment.Variant[] variantArr = variantsToMatch;
                    return observableStreamVariant$default.switchMap(new Function() { // from class: com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore$streamGoldDepositBoostMaxAwarenessVariantMatch$1.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Boolean> apply(MoneyMovementGoldSplitExperiment.Variant moneyMovementGoldSplit) {
                            Intrinsics.checkNotNullParameter(moneyMovementGoldSplit, "moneyMovementGoldSplit");
                            if (moneyMovementGoldSplit == MoneyMovementGoldSplitExperiment.Variant.EXCLUDED) {
                                Observable observableStreamVariant$default2 = ExperimentsProvider.DefaultImpls.streamVariant$default(goldDepositBoostMaxAwarenessStore.experimentsStore, GoldDepositBoostMaxAwarenessExperiment.INSTANCE, GoldDepositBoostMaxAwarenessExperiment.Variant.CONTROL, false, 4, null);
                                final GoldDepositBoostMaxAwarenessExperiment.Variant[] variantArr2 = variantArr;
                                return observableStreamVariant$default2.map(new Function() { // from class: com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwarenessVariantMatch.1.1.1
                                    @Override // io.reactivex.functions.Function
                                    public final Boolean apply(GoldDepositBoostMaxAwarenessExperiment.Variant it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return Boolean.valueOf(ArraysKt.contains(variantArr2, it));
                                    }
                                });
                            }
                            return Observable.just(Boolean.FALSE);
                        }
                    });
                }
                return Observable.just(Boolean.FALSE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
