package com.robinhood.android.gold.upgrade.legacy;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeAgreementsViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeAgreementsViewState;", "", "selectedPlanId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getSelectedPlanId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LegacyGoldUpgradeAgreementsViewState {
    public static final int $stable = 8;
    private final UUID selectedPlanId;

    public static /* synthetic */ LegacyGoldUpgradeAgreementsViewState copy$default(LegacyGoldUpgradeAgreementsViewState legacyGoldUpgradeAgreementsViewState, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = legacyGoldUpgradeAgreementsViewState.selectedPlanId;
        }
        return legacyGoldUpgradeAgreementsViewState.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }

    public final LegacyGoldUpgradeAgreementsViewState copy(UUID selectedPlanId) {
        return new LegacyGoldUpgradeAgreementsViewState(selectedPlanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LegacyGoldUpgradeAgreementsViewState) && Intrinsics.areEqual(this.selectedPlanId, ((LegacyGoldUpgradeAgreementsViewState) other).selectedPlanId);
    }

    public int hashCode() {
        UUID uuid = this.selectedPlanId;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public String toString() {
        return "LegacyGoldUpgradeAgreementsViewState(selectedPlanId=" + this.selectedPlanId + ")";
    }

    public LegacyGoldUpgradeAgreementsViewState(UUID uuid) {
        this.selectedPlanId = uuid;
    }

    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }
}
