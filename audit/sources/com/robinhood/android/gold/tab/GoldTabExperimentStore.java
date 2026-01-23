package com.robinhood.android.gold.tab;

import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: GoldTabExperimentStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0019\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/gold/tab/GoldTabExperimentStore;", "Lcom/robinhood/store/Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "subscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/librobinhood/data/store/identi/AddressStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/store/StoreBundle;)V", "streamGoldTabExperiment", "Lio/reactivex/Observable;", "Lcom/robinhood/android/gold/tab/GoldTabState;", "statesAllowingGoldTab", "", "", "applyExperimentFilter", "goldTabState", "lib-gold-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldTabExperimentStore extends Store {
    private final AccountProvider accountProvider;
    private final AddressStore addressStore;
    private final ExperimentsStore experimentsStore;
    private final RhyAccountStore rhyAccountStore;
    private final RhyTabStateStore rhyTabStateStore;
    private final GoldSubscriptionStore subscriptionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldTabExperimentStore(ExperimentsStore experimentsStore, GoldSubscriptionStore subscriptionStore, AddressStore addressStore, AccountProvider accountProvider, RhyTabStateStore rhyTabStateStore, RhyAccountStore rhyAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(subscriptionStore, "subscriptionStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.experimentsStore = experimentsStore;
        this.subscriptionStore = subscriptionStore;
        this.addressStore = addressStore;
        this.accountProvider = accountProvider;
        this.rhyTabStateStore = rhyTabStateStore;
        this.rhyAccountStore = rhyAccountStore;
    }

    public final Observable<GoldTabState> streamGoldTabExperiment(final List<String> statesAllowingGoldTab) {
        Intrinsics.checkNotNullParameter(statesAllowingGoldTab, "statesAllowingGoldTab");
        this.accountProvider.refresh(false);
        AddressStore.refreshResidentialAddress$default(this.addressStore, false, 1, null);
        Observable<GoldTabState> observableDistinctUntilChanged = Observable.combineLatest(this.rhyAccountStore.streamSpendingAccount(), this.addressStore.streamResidentialAddress(), this.subscriptionStore.streamGoldSubscriptionState().distinctUntilChanged(), this.rhyTabStateStore.streamRhyTabState().distinctUntilChanged(), new Function4() { // from class: com.robinhood.android.gold.tab.GoldTabExperimentStore.streamGoldTabExperiment.1

            /* compiled from: GoldTabExperimentStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.gold.tab.GoldTabExperimentStore$streamGoldTabExperiment$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GoldSubscriptionStore.GoldSubscriptionState.values().length];
                    try {
                        iArr[GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GoldSubscriptionStore.GoldSubscriptionState.ELIGIBLE_FOR_GOLD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function4
            public final GoldTabState apply(Optional<RhyAccount> rhyAccount, ResidentialAddress residence, GoldSubscriptionStore.GoldSubscriptionState subscription, RhyTabState tabState) {
                Intrinsics.checkNotNullParameter(rhyAccount, "rhyAccount");
                Intrinsics.checkNotNullParameter(residence, "residence");
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                Intrinsics.checkNotNullParameter(tabState, "tabState");
                Timber.INSTANCE.mo3350d("GoldTabExperiment data -> statesAllowingGoldTab=" + statesAllowingGoldTab + ", rhyAccount=" + rhyAccount + ", region=" + residence.getAddress().getRegion() + ", subscription=" + subscription.name() + ",tabState = " + tabState.getState().name(), new Object[0]);
                GoldTabState goldTabState = GoldTabState.NONE;
                if (rhyAccount.getOrNull() == null && (tabState.getState() != ApiRhyTabStateResponse.ApiRhyTabState.CREDIT_CARD_WAITLIST || CollectionsKt.contains(statesAllowingGoldTab, residence.getAddress().getRegion()))) {
                    int i = WhenMappings.$EnumSwitchMapping$0[subscription.ordinal()];
                    if (i == 1) {
                        return GoldTabState.SHOW_GOLD_HUB;
                    }
                    if (i == 2) {
                        return GoldTabState.SHOW_GOLD_UPGRADE;
                    }
                }
                return goldTabState;
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.gold.tab.GoldTabExperimentStore.streamGoldTabExperiment.2
            @Override // io.reactivex.functions.Function
            public final GoldTabState apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return GoldTabState.NONE;
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.gold.tab.GoldTabExperimentStore.streamGoldTabExperiment.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends GoldTabState> apply(GoldTabState goldTabState) {
                Intrinsics.checkNotNullParameter(goldTabState, "goldTabState");
                return GoldTabExperimentStore.this.applyExperimentFilter(goldTabState);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<GoldTabState> applyExperimentFilter(final GoldTabState goldTabState) {
        if (goldTabState != GoldTabState.NONE) {
            Observable<GoldTabState> map = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{GoldTabExperiment.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.gold.tab.GoldTabExperimentStore.applyExperimentFilter.1
                @Override // io.reactivex.functions.Function
                public final GoldTabState apply(Boolean experimentActive) {
                    Intrinsics.checkNotNullParameter(experimentActive, "experimentActive");
                    return experimentActive.booleanValue() ? goldTabState : GoldTabState.NONE;
                }
            });
            Intrinsics.checkNotNull(map);
            return map;
        }
        Observable<GoldTabState> observableJust = Observable.just(goldTabState);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }
}
