package com.robinhood.android.common.gold;

import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeAgreementDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;", "", "loadedStatus", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;", "goldAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "disclosureMarkdown", "", "error", "", "selectedPlanId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/UUID;)V", "getLoadedStatus", "()Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;", "getGoldAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "getDisclosureMarkdown", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getSelectedPlanId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GoldUpgradeAgreementDataState {
    public static final int $stable = 8;
    private final String disclosureMarkdown;
    private final Throwable error;
    private final ApiGoldSweepAgreement goldAgreement;
    private final LegacyGoldUpgradeAgreementDataState2 loadedStatus;
    private final UUID selectedPlanId;

    public static /* synthetic */ GoldUpgradeAgreementDataState copy$default(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState, LegacyGoldUpgradeAgreementDataState2 legacyGoldUpgradeAgreementDataState2, ApiGoldSweepAgreement apiGoldSweepAgreement, String str, Throwable th, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            legacyGoldUpgradeAgreementDataState2 = goldUpgradeAgreementDataState.loadedStatus;
        }
        if ((i & 2) != 0) {
            apiGoldSweepAgreement = goldUpgradeAgreementDataState.goldAgreement;
        }
        if ((i & 4) != 0) {
            str = goldUpgradeAgreementDataState.disclosureMarkdown;
        }
        if ((i & 8) != 0) {
            th = goldUpgradeAgreementDataState.error;
        }
        if ((i & 16) != 0) {
            uuid = goldUpgradeAgreementDataState.selectedPlanId;
        }
        UUID uuid2 = uuid;
        String str2 = str;
        return goldUpgradeAgreementDataState.copy(legacyGoldUpgradeAgreementDataState2, apiGoldSweepAgreement, str2, th, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final LegacyGoldUpgradeAgreementDataState2 getLoadedStatus() {
        return this.loadedStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiGoldSweepAgreement getGoldAgreement() {
        return this.goldAgreement;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }

    public final GoldUpgradeAgreementDataState copy(LegacyGoldUpgradeAgreementDataState2 loadedStatus, ApiGoldSweepAgreement goldAgreement, String disclosureMarkdown, Throwable error, UUID selectedPlanId) {
        Intrinsics.checkNotNullParameter(loadedStatus, "loadedStatus");
        return new GoldUpgradeAgreementDataState(loadedStatus, goldAgreement, disclosureMarkdown, error, selectedPlanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldUpgradeAgreementDataState)) {
            return false;
        }
        GoldUpgradeAgreementDataState goldUpgradeAgreementDataState = (GoldUpgradeAgreementDataState) other;
        return this.loadedStatus == goldUpgradeAgreementDataState.loadedStatus && Intrinsics.areEqual(this.goldAgreement, goldUpgradeAgreementDataState.goldAgreement) && Intrinsics.areEqual(this.disclosureMarkdown, goldUpgradeAgreementDataState.disclosureMarkdown) && Intrinsics.areEqual(this.error, goldUpgradeAgreementDataState.error) && Intrinsics.areEqual(this.selectedPlanId, goldUpgradeAgreementDataState.selectedPlanId);
    }

    public int hashCode() {
        int iHashCode = this.loadedStatus.hashCode() * 31;
        ApiGoldSweepAgreement apiGoldSweepAgreement = this.goldAgreement;
        int iHashCode2 = (iHashCode + (apiGoldSweepAgreement == null ? 0 : apiGoldSweepAgreement.hashCode())) * 31;
        String str = this.disclosureMarkdown;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.error;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        UUID uuid = this.selectedPlanId;
        return iHashCode4 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "GoldUpgradeAgreementDataState(loadedStatus=" + this.loadedStatus + ", goldAgreement=" + this.goldAgreement + ", disclosureMarkdown=" + this.disclosureMarkdown + ", error=" + this.error + ", selectedPlanId=" + this.selectedPlanId + ")";
    }

    public GoldUpgradeAgreementDataState(LegacyGoldUpgradeAgreementDataState2 loadedStatus, ApiGoldSweepAgreement apiGoldSweepAgreement, String str, Throwable th, UUID uuid) {
        Intrinsics.checkNotNullParameter(loadedStatus, "loadedStatus");
        this.loadedStatus = loadedStatus;
        this.goldAgreement = apiGoldSweepAgreement;
        this.disclosureMarkdown = str;
        this.error = th;
        this.selectedPlanId = uuid;
    }

    public final LegacyGoldUpgradeAgreementDataState2 getLoadedStatus() {
        return this.loadedStatus;
    }

    public final ApiGoldSweepAgreement getGoldAgreement() {
        return this.goldAgreement;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }
}
