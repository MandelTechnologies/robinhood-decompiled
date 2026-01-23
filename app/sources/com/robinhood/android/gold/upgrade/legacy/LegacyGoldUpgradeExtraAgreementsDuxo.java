package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeExtraAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsViewState;", "goldUpgradeStore", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeExtraAgreementsDuxo extends BaseDuxo4<LegacyGoldUpgradeExtraAgreementsViewState> {
    public static final int $stable = 8;
    private final GoldUpgradeStore goldUpgradeStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGoldUpgradeExtraAgreementsDuxo(GoldUpgradeStore goldUpgradeStore, DuxoBundle duxoBundle) {
        super(new LegacyGoldUpgradeExtraAgreementsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldUpgradeStore = goldUpgradeStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.goldUpgradeStore.streamSelectedPlanId(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LegacyGoldUpgradeExtraAgreementsDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(LegacyGoldUpgradeExtraAgreementsDuxo legacyGoldUpgradeExtraAgreementsDuxo, Optional selectedPlanId) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        legacyGoldUpgradeExtraAgreementsDuxo.applyMutation(new LegacyGoldUpgradeExtraAgreementsDuxo2(selectedPlanId, null));
        return Unit.INSTANCE;
    }
}
