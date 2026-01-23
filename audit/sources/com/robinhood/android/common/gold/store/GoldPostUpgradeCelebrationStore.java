package com.robinhood.android.common.gold.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.gold.api.ApiGoldCelebrationQueryParams;
import com.robinhood.android.common.gold.api.GoldCommonApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldPostUpgradeCelebrationStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/gold/store/GoldPostUpgradeCelebrationStore;", "Lcom/robinhood/store/Store;", "postUpgradeCelebrationApi", "Lcom/robinhood/android/common/gold/api/GoldCommonApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/common/gold/api/GoldCommonApi;Lcom/robinhood/store/StoreBundle;)V", "goldCelebrationRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "kotlin.jvm.PlatformType", "goldCelebrationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/common/gold/api/ApiGoldCelebrationQueryParams;", "streamPostUpgradeCelebration", "Lio/reactivex/Observable;", "source", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class GoldPostUpgradeCelebrationStore extends Store {
    public static final int $stable = 8;
    private final Endpoint<ApiGoldCelebrationQueryParams, UiPostTransferPage.PostTransferGoldCelebration> goldCelebrationEndpoint;
    private final BehaviorRelay<UiPostTransferPage.PostTransferGoldCelebration> goldCelebrationRelay;
    private final GoldCommonApi postUpgradeCelebrationApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPostUpgradeCelebrationStore(GoldCommonApi postUpgradeCelebrationApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(postUpgradeCelebrationApi, "postUpgradeCelebrationApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.postUpgradeCelebrationApi = postUpgradeCelebrationApi;
        BehaviorRelay<UiPostTransferPage.PostTransferGoldCelebration> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.goldCelebrationRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        GoldPostUpgradeCelebrationStore2 goldPostUpgradeCelebrationStore2 = new GoldPostUpgradeCelebrationStore2(behaviorRelayCreate);
        this.goldCelebrationEndpoint = Endpoint.Companion.create$default(companion, new GoldPostUpgradeCelebrationStore3(this, null), getLogoutKillswitch(), goldPostUpgradeCelebrationStore2, storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object goldCelebrationEndpoint$accept(BehaviorRelay behaviorRelay, UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, Continuation continuation) {
        behaviorRelay.accept(postTransferGoldCelebration);
        return Unit.INSTANCE;
    }

    public final Observable<UiPostTransferPage.PostTransferGoldCelebration> streamPostUpgradeCelebration(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Endpoint.DefaultImpls.refresh$default(this.goldCelebrationEndpoint, new ApiGoldCelebrationQueryParams(source), false, null, 6, null);
        return this.goldCelebrationRelay;
    }
}
