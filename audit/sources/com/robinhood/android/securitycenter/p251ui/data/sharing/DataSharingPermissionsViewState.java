package com.robinhood.android.securitycenter.p251ui.data.sharing;

import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.models.p320db.identi.OptOutConsentStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataSharingPermissionsViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/sharing/DataSharingPermissionsViewState;", "", "pendingOptIn", "", "optOutConsentStatus", "Lcom/robinhood/models/db/identi/OptOutConsentStatus;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/identi/OptOutConsentStatus;)V", "Ljava/lang/Boolean;", "isDataSharingPermissionsToggleChecked", "()Z", "dataSharingPermissionsTogglePrimaryText", "", "getDataSharingPermissionsTogglePrimaryText", "()I", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/identi/OptOutConsentStatus;)Lcom/robinhood/android/securitycenter/ui/data/sharing/DataSharingPermissionsViewState;", "equals", "other", "hashCode", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DataSharingPermissionsViewState {
    public static final int $stable = 8;
    private final int dataSharingPermissionsTogglePrimaryText;
    private final boolean isDataSharingPermissionsToggleChecked;
    private final OptOutConsentStatus optOutConsentStatus;
    private final Boolean pendingOptIn;

    /* JADX WARN: Multi-variable type inference failed */
    public DataSharingPermissionsViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Boolean getPendingOptIn() {
        return this.pendingOptIn;
    }

    /* renamed from: component2, reason: from getter */
    private final OptOutConsentStatus getOptOutConsentStatus() {
        return this.optOutConsentStatus;
    }

    public static /* synthetic */ DataSharingPermissionsViewState copy$default(DataSharingPermissionsViewState dataSharingPermissionsViewState, Boolean bool, OptOutConsentStatus optOutConsentStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = dataSharingPermissionsViewState.pendingOptIn;
        }
        if ((i & 2) != 0) {
            optOutConsentStatus = dataSharingPermissionsViewState.optOutConsentStatus;
        }
        return dataSharingPermissionsViewState.copy(bool, optOutConsentStatus);
    }

    public final DataSharingPermissionsViewState copy(Boolean pendingOptIn, OptOutConsentStatus optOutConsentStatus) {
        return new DataSharingPermissionsViewState(pendingOptIn, optOutConsentStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSharingPermissionsViewState)) {
            return false;
        }
        DataSharingPermissionsViewState dataSharingPermissionsViewState = (DataSharingPermissionsViewState) other;
        return Intrinsics.areEqual(this.pendingOptIn, dataSharingPermissionsViewState.pendingOptIn) && Intrinsics.areEqual(this.optOutConsentStatus, dataSharingPermissionsViewState.optOutConsentStatus);
    }

    public int hashCode() {
        Boolean bool = this.pendingOptIn;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        OptOutConsentStatus optOutConsentStatus = this.optOutConsentStatus;
        return iHashCode + (optOutConsentStatus != null ? optOutConsentStatus.hashCode() : 0);
    }

    public String toString() {
        return "DataSharingPermissionsViewState(pendingOptIn=" + this.pendingOptIn + ", optOutConsentStatus=" + this.optOutConsentStatus + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[PHI: r1
      0x0009: PHI (r1v10 java.lang.Boolean) = (r1v0 java.lang.Boolean), (r1v2 java.lang.Boolean) binds: [B:3:0x0007, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataSharingPermissionsViewState(Boolean bool, OptOutConsentStatus optOutConsentStatus) {
        boolean zBooleanValue;
        int i;
        this.pendingOptIn = bool;
        this.optOutConsentStatus = optOutConsentStatus;
        if (bool == null) {
            bool = optOutConsentStatus != null ? Boolean.valueOf(optOutConsentStatus.getConsentStatus()) : null;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
        }
        this.isDataSharingPermissionsToggleChecked = zBooleanValue;
        if (zBooleanValue) {
            i = C28186R.string.data_sharing_permissions_enabled_label;
        } else {
            i = C28186R.string.data_sharing_permissions_disabled_label;
        }
        this.dataSharingPermissionsTogglePrimaryText = i;
    }

    public /* synthetic */ DataSharingPermissionsViewState(Boolean bool, OptOutConsentStatus optOutConsentStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : optOutConsentStatus);
    }

    /* renamed from: isDataSharingPermissionsToggleChecked, reason: from getter */
    public final boolean getIsDataSharingPermissionsToggleChecked() {
        return this.isDataSharingPermissionsToggleChecked;
    }

    public final int getDataSharingPermissionsTogglePrimaryText() {
        return this.dataSharingPermissionsTogglePrimaryText;
    }
}
