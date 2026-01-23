package com.robinhood.android.gold.lib.upgrade.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldSweepAgreementsFlow;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlowQueryParams;
import com.robinhood.android.gold.lib.upgrade.api.GoldUpgradeApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeStore.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0!0\u0011J\u0006\u0010\"\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \f*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u001b0\u001b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "Lcom/robinhood/store/Store;", "goldUpgradeApi", "Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;Lcom/robinhood/store/StoreBundle;)V", "goldUpgradeFlowRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/Result;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", "kotlin.jvm.PlatformType", "goldUpgradeFlowEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlowQueryParams;", "streamGoldUpgradeFlow", "Lio/reactivex/Observable;", "source", "", "exitDeeplink", "goldSweepAgreementsRelay", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;", "goldSweepAgreementsEndpoint", "streamGoldSweepAgreementsFlow", "feature", "goldUpgradeFlowStateRelay", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeFlowState;", "setSelectedPlanId", "", "selectedPlanId", "Ljava/util/UUID;", "streamSelectedPlanId", "Lcom/robinhood/utils/Optional;", "resetSelectedPlanId", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeStore extends Store {
    private final Endpoint<ApiGoldUpgradeFlowQueryParams, Result<ApiGoldSweepAgreementsFlow>> goldSweepAgreementsEndpoint;
    private final BehaviorRelay<Result<ApiGoldSweepAgreementsFlow>> goldSweepAgreementsRelay;
    private final GoldUpgradeApi goldUpgradeApi;
    private final Endpoint<ApiGoldUpgradeFlowQueryParams, Result<ApiGoldUpgradeFlow>> goldUpgradeFlowEndpoint;
    private final BehaviorRelay<Result<ApiGoldUpgradeFlow>> goldUpgradeFlowRelay;
    private final BehaviorRelay<GoldUpgradeFlowState> goldUpgradeFlowStateRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUpgradeStore(GoldUpgradeApi goldUpgradeApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeApi, "goldUpgradeApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldUpgradeApi = goldUpgradeApi;
        BehaviorRelay<Result<ApiGoldUpgradeFlow>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.goldUpgradeFlowRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        GoldUpgradeStore4 goldUpgradeStore4 = new GoldUpgradeStore4(behaviorRelayCreate);
        this.goldUpgradeFlowEndpoint = Endpoint.Companion.create$default(companion, new GoldUpgradeStore5(this, null), getLogoutKillswitch(), goldUpgradeStore4, storeBundle.getClock(), null, 16, null);
        BehaviorRelay<Result<ApiGoldSweepAgreementsFlow>> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.goldSweepAgreementsRelay = behaviorRelayCreate2;
        GoldUpgradeStore2 goldUpgradeStore2 = new GoldUpgradeStore2(behaviorRelayCreate2);
        this.goldSweepAgreementsEndpoint = Endpoint.Companion.create$default(companion, new GoldUpgradeStore3(this, null), getLogoutKillswitch(), goldUpgradeStore2, storeBundle.getClock(), null, 16, null);
        BehaviorRelay<GoldUpgradeFlowState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new GoldUpgradeFlowState(null));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.goldUpgradeFlowStateRelay = behaviorRelayCreateDefault;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object goldUpgradeFlowEndpoint$accept(BehaviorRelay behaviorRelay, Object obj, Continuation continuation) {
        behaviorRelay.accept(Result.m28549boximpl(obj));
        return Unit.INSTANCE;
    }

    public final Observable<Result<ApiGoldUpgradeFlow>> streamGoldUpgradeFlow(String source, String exitDeeplink) {
        Endpoint.DefaultImpls.refresh$default(this.goldUpgradeFlowEndpoint, new ApiGoldUpgradeFlowQueryParams(source, exitDeeplink), false, null, 6, null);
        return this.goldUpgradeFlowRelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object goldSweepAgreementsEndpoint$accept$0(BehaviorRelay behaviorRelay, Object obj, Continuation continuation) {
        behaviorRelay.accept(Result.m28549boximpl(obj));
        return Unit.INSTANCE;
    }

    public final Observable<Result<ApiGoldSweepAgreementsFlow>> streamGoldSweepAgreementsFlow(String feature) {
        Endpoint.DefaultImpls.refresh$default(this.goldSweepAgreementsEndpoint, new ApiGoldUpgradeFlowQueryParams(feature, null), false, null, 6, null);
        return this.goldSweepAgreementsRelay;
    }

    public final void setSelectedPlanId(UUID selectedPlanId) {
        GoldUpgradeFlowState goldUpgradeFlowState;
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        BehaviorRelay<GoldUpgradeFlowState> behaviorRelay = this.goldUpgradeFlowStateRelay;
        GoldUpgradeFlowState value = behaviorRelay.getValue();
        if (value == null || (goldUpgradeFlowState = value.copy(selectedPlanId)) == null) {
            goldUpgradeFlowState = new GoldUpgradeFlowState(selectedPlanId);
        }
        behaviorRelay.accept(goldUpgradeFlowState);
    }

    public final Observable<Optional<UUID>> streamSelectedPlanId() {
        Observable map = this.goldUpgradeFlowStateRelay.map(new Function() { // from class: com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore.streamSelectedPlanId.1
            @Override // io.reactivex.functions.Function
            public final Optional<UUID> apply(GoldUpgradeFlowState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getSelectedPlanId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void resetSelectedPlanId() {
        GoldUpgradeFlowState goldUpgradeFlowState;
        BehaviorRelay<GoldUpgradeFlowState> behaviorRelay = this.goldUpgradeFlowStateRelay;
        GoldUpgradeFlowState value = behaviorRelay.getValue();
        if (value == null || (goldUpgradeFlowState = value.copy(null)) == null) {
            goldUpgradeFlowState = new GoldUpgradeFlowState(null);
        }
        behaviorRelay.accept(goldUpgradeFlowState);
    }
}
