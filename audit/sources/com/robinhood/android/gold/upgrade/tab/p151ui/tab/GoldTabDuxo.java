package com.robinhood.android.gold.upgrade.tab.p151ui.tab;

import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.gold.upgrade.tab.p151ui.tab.GoldTabState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: GoldTabDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/upgrade/tab/ui/tab/GoldTabState;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "refreshGoldStatus", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldTabDuxo extends BaseDuxo4<GoldTabState> {
    public static final int $stable = 8;
    private final GoldSubscriptionStore goldSubscriptionStore;

    /* compiled from: GoldTabDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldTabDuxo(GoldSubscriptionStore goldSubscriptionStore, DuxoBundle duxoBundle) {
        super(GoldTabState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldSubscriptionStore = goldSubscriptionStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable<GoldSubscriptionStore.GoldSubscriptionState> observableDistinctUntilChanged = this.goldSubscriptionStore.streamGoldSubscriptionState().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.upgrade.tab.ui.tab.GoldTabDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldTabDuxo.onResume$lambda$0(this.f$0, (GoldSubscriptionStore.GoldSubscriptionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(GoldTabDuxo goldTabDuxo, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState) {
        GoldTabState goldTabState;
        int i = goldSubscriptionState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[goldSubscriptionState.ordinal()];
        if (i == 1) {
            goldTabState = GoldTabState.ShowGoldHub.INSTANCE;
        } else if (i == 2) {
            goldTabState = GoldTabState.ShowGoldUpgrade.INSTANCE;
        } else {
            goldTabState = GoldTabState.Error.INSTANCE;
        }
        goldTabDuxo.applyMutation(new GoldTabDuxo2(goldTabState, null));
        return Unit.INSTANCE;
    }

    public final void refreshGoldStatus() {
        Timber.INSTANCE.mo3350d("Requesting refresh of gold status....", new Object[0]);
        this.goldSubscriptionStore.refreshStores();
    }
}
