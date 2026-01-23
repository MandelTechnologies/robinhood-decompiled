package com.robinhood.android.gold.contracts;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toFragmentKey", "Lcom/robinhood/android/gold/contracts/GoldUpgradeFragmentKey;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.contracts.GoldUpgradeFragmentKeyKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUpgradeFragmentKey2 {
    public static final GoldUpgradeFragmentKey toFragmentKey(GoldUpgradeIntentKey goldUpgradeIntentKey) {
        Intrinsics.checkNotNullParameter(goldUpgradeIntentKey, "<this>");
        return new GoldUpgradeFragmentKey(goldUpgradeIntentKey.getSourceScreenIdentifier(), goldUpgradeIntentKey.getFeature(), goldUpgradeIntentKey.getExitDeeplink(), goldUpgradeIntentKey.getOverrideDayNightMode(), false, goldUpgradeIntentKey.getSageId());
    }
}
