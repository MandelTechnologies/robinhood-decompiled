package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import android.net.Uri;
import com.robinhood.shared.app.type.AppType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentChecklistV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2ViewState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "kycItem", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/ChecklistItem;", "twoFactorItem", "kycSuvWorkflowId", "Ljava/util/UUID;", "kycSuvIsMigrated", "", "kycDeeplink", "Landroid/net/Uri;", "kycRowLoggingIdentifier", "", "twoFactorRowLoggingIdentifier", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/ChecklistItem;Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/ChecklistItem;Ljava/util/UUID;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getKycItem", "()Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/ChecklistItem;", "getTwoFactorItem", "getKycSuvWorkflowId", "()Ljava/util/UUID;", "getKycSuvIsMigrated", "()Z", "getKycDeeplink", "()Landroid/net/Uri;", "getKycRowLoggingIdentifier", "()Ljava/lang/String;", "getTwoFactorRowLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentChecklistV2ViewState {
    public static final int $stable = 8;
    private final AppType appType;
    private final Uri kycDeeplink;
    private final ChecklistItem kycItem;
    private final String kycRowLoggingIdentifier;
    private final boolean kycSuvIsMigrated;
    private final UUID kycSuvWorkflowId;
    private final ChecklistItem twoFactorItem;
    private final String twoFactorRowLoggingIdentifier;

    public static /* synthetic */ EnrollmentChecklistV2ViewState copy$default(EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewState, AppType appType, ChecklistItem checklistItem, ChecklistItem checklistItem2, UUID uuid, boolean z, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = enrollmentChecklistV2ViewState.appType;
        }
        if ((i & 2) != 0) {
            checklistItem = enrollmentChecklistV2ViewState.kycItem;
        }
        if ((i & 4) != 0) {
            checklistItem2 = enrollmentChecklistV2ViewState.twoFactorItem;
        }
        if ((i & 8) != 0) {
            uuid = enrollmentChecklistV2ViewState.kycSuvWorkflowId;
        }
        if ((i & 16) != 0) {
            z = enrollmentChecklistV2ViewState.kycSuvIsMigrated;
        }
        if ((i & 32) != 0) {
            uri = enrollmentChecklistV2ViewState.kycDeeplink;
        }
        if ((i & 64) != 0) {
            str = enrollmentChecklistV2ViewState.kycRowLoggingIdentifier;
        }
        if ((i & 128) != 0) {
            str2 = enrollmentChecklistV2ViewState.twoFactorRowLoggingIdentifier;
        }
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        Uri uri2 = uri;
        return enrollmentChecklistV2ViewState.copy(appType, checklistItem, checklistItem2, uuid, z2, uri2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final ChecklistItem getKycItem() {
        return this.kycItem;
    }

    /* renamed from: component3, reason: from getter */
    public final ChecklistItem getTwoFactorItem() {
        return this.twoFactorItem;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getKycSuvWorkflowId() {
        return this.kycSuvWorkflowId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getKycSuvIsMigrated() {
        return this.kycSuvIsMigrated;
    }

    /* renamed from: component6, reason: from getter */
    public final Uri getKycDeeplink() {
        return this.kycDeeplink;
    }

    /* renamed from: component7, reason: from getter */
    public final String getKycRowLoggingIdentifier() {
        return this.kycRowLoggingIdentifier;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTwoFactorRowLoggingIdentifier() {
        return this.twoFactorRowLoggingIdentifier;
    }

    public final EnrollmentChecklistV2ViewState copy(AppType appType, ChecklistItem kycItem, ChecklistItem twoFactorItem, UUID kycSuvWorkflowId, boolean kycSuvIsMigrated, Uri kycDeeplink, String kycRowLoggingIdentifier, String twoFactorRowLoggingIdentifier) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(kycItem, "kycItem");
        Intrinsics.checkNotNullParameter(twoFactorItem, "twoFactorItem");
        return new EnrollmentChecklistV2ViewState(appType, kycItem, twoFactorItem, kycSuvWorkflowId, kycSuvIsMigrated, kycDeeplink, kycRowLoggingIdentifier, twoFactorRowLoggingIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentChecklistV2ViewState)) {
            return false;
        }
        EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewState = (EnrollmentChecklistV2ViewState) other;
        return this.appType == enrollmentChecklistV2ViewState.appType && Intrinsics.areEqual(this.kycItem, enrollmentChecklistV2ViewState.kycItem) && Intrinsics.areEqual(this.twoFactorItem, enrollmentChecklistV2ViewState.twoFactorItem) && Intrinsics.areEqual(this.kycSuvWorkflowId, enrollmentChecklistV2ViewState.kycSuvWorkflowId) && this.kycSuvIsMigrated == enrollmentChecklistV2ViewState.kycSuvIsMigrated && Intrinsics.areEqual(this.kycDeeplink, enrollmentChecklistV2ViewState.kycDeeplink) && Intrinsics.areEqual(this.kycRowLoggingIdentifier, enrollmentChecklistV2ViewState.kycRowLoggingIdentifier) && Intrinsics.areEqual(this.twoFactorRowLoggingIdentifier, enrollmentChecklistV2ViewState.twoFactorRowLoggingIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((((this.appType.hashCode() * 31) + this.kycItem.hashCode()) * 31) + this.twoFactorItem.hashCode()) * 31;
        UUID uuid = this.kycSuvWorkflowId;
        int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.kycSuvIsMigrated)) * 31;
        Uri uri = this.kycDeeplink;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.kycRowLoggingIdentifier;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.twoFactorRowLoggingIdentifier;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EnrollmentChecklistV2ViewState(appType=" + this.appType + ", kycItem=" + this.kycItem + ", twoFactorItem=" + this.twoFactorItem + ", kycSuvWorkflowId=" + this.kycSuvWorkflowId + ", kycSuvIsMigrated=" + this.kycSuvIsMigrated + ", kycDeeplink=" + this.kycDeeplink + ", kycRowLoggingIdentifier=" + this.kycRowLoggingIdentifier + ", twoFactorRowLoggingIdentifier=" + this.twoFactorRowLoggingIdentifier + ")";
    }

    public EnrollmentChecklistV2ViewState(AppType appType, ChecklistItem kycItem, ChecklistItem twoFactorItem, UUID uuid, boolean z, Uri uri, String str, String str2) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(kycItem, "kycItem");
        Intrinsics.checkNotNullParameter(twoFactorItem, "twoFactorItem");
        this.appType = appType;
        this.kycItem = kycItem;
        this.twoFactorItem = twoFactorItem;
        this.kycSuvWorkflowId = uuid;
        this.kycSuvIsMigrated = z;
        this.kycDeeplink = uri;
        this.kycRowLoggingIdentifier = str;
        this.twoFactorRowLoggingIdentifier = str2;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final ChecklistItem getKycItem() {
        return this.kycItem;
    }

    public final ChecklistItem getTwoFactorItem() {
        return this.twoFactorItem;
    }

    public final UUID getKycSuvWorkflowId() {
        return this.kycSuvWorkflowId;
    }

    public final boolean getKycSuvIsMigrated() {
        return this.kycSuvIsMigrated;
    }

    public final Uri getKycDeeplink() {
        return this.kycDeeplink;
    }

    public final String getKycRowLoggingIdentifier() {
        return this.kycRowLoggingIdentifier;
    }

    public final String getTwoFactorRowLoggingIdentifier() {
        return this.twoFactorRowLoggingIdentifier;
    }
}
