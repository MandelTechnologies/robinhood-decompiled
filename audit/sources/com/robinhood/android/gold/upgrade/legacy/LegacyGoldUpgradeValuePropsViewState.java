package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeValuePropsViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeValuePropsViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "selectedPlanId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getSelectedPlanId", "()Ljava/util/UUID;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class LegacyGoldUpgradeValuePropsViewState implements LoggableViewState {
    public static final int $stable = 8;
    private final UUID selectedPlanId;

    public static /* synthetic */ LegacyGoldUpgradeValuePropsViewState copy$default(LegacyGoldUpgradeValuePropsViewState legacyGoldUpgradeValuePropsViewState, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = legacyGoldUpgradeValuePropsViewState.selectedPlanId;
        }
        return legacyGoldUpgradeValuePropsViewState.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }

    public final LegacyGoldUpgradeValuePropsViewState copy(UUID selectedPlanId) {
        return new LegacyGoldUpgradeValuePropsViewState(selectedPlanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LegacyGoldUpgradeValuePropsViewState) && Intrinsics.areEqual(this.selectedPlanId, ((LegacyGoldUpgradeValuePropsViewState) other).selectedPlanId);
    }

    public int hashCode() {
        UUID uuid = this.selectedPlanId;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public String toString() {
        return "LegacyGoldUpgradeValuePropsViewState(selectedPlanId=" + this.selectedPlanId + ")";
    }

    public LegacyGoldUpgradeValuePropsViewState(UUID uuid) {
        this.selectedPlanId = uuid;
    }

    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        return this.selectedPlanId != null ? new LoggableViewState2.Completed(null, null, 3, null) : new LoggableViewState2.Loading(null, 1, null);
    }
}
