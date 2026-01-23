package com.robinhood.android.gold.contracts;

import kotlin.Metadata;

/* compiled from: GoldUpgradeTabContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract;", "", "<init>", "()V", "Callback", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeTabContract {
    public static final GoldUpgradeTabContract INSTANCE = new GoldUpgradeTabContract();

    /* compiled from: GoldUpgradeTabContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", "", "onUpgradeSuccess", "", "onUpgradeDataLoadError", "onUpgradeCanceled", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onUpgradeCanceled();

        void onUpgradeDataLoadError();

        void onUpgradeSuccess();
    }

    private GoldUpgradeTabContract() {
    }
}
