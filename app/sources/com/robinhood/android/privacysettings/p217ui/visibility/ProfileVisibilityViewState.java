package com.robinhood.android.privacysettings.p217ui.visibility;

import com.robinhood.models.api.identi.OptOutConsentType;
import com.robinhood.udf.UiEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileVisibilityViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityViewState;", "", "isLoading", "", "isUpdating", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "statuses", "", "Lcom/robinhood/models/api/identi/OptOutConsentType;", "<init>", "(ZZLcom/robinhood/udf/UiEvent;Ljava/util/Map;)V", "()Z", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "getStatuses", "()Ljava/util/Map;", "isStickerRowChecked", "isPhoneRowChecked", "isEmailRowChecked", "isAnyoneRowChecked", "isNobodyRowChecked", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfileVisibilityViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final boolean isUpdating;
    private final Map<OptOutConsentType, Boolean> statuses;

    public ProfileVisibilityViewState() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileVisibilityViewState copy$default(ProfileVisibilityViewState profileVisibilityViewState, boolean z, boolean z2, UiEvent uiEvent, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = profileVisibilityViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = profileVisibilityViewState.isUpdating;
        }
        if ((i & 4) != 0) {
            uiEvent = profileVisibilityViewState.errorEvent;
        }
        if ((i & 8) != 0) {
            map = profileVisibilityViewState.statuses;
        }
        return profileVisibilityViewState.copy(z, z2, uiEvent, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    public final Map<OptOutConsentType, Boolean> component4() {
        return this.statuses;
    }

    public final ProfileVisibilityViewState copy(boolean isLoading, boolean isUpdating, UiEvent<Throwable> errorEvent, Map<OptOutConsentType, Boolean> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        return new ProfileVisibilityViewState(isLoading, isUpdating, errorEvent, statuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileVisibilityViewState)) {
            return false;
        }
        ProfileVisibilityViewState profileVisibilityViewState = (ProfileVisibilityViewState) other;
        return this.isLoading == profileVisibilityViewState.isLoading && this.isUpdating == profileVisibilityViewState.isUpdating && Intrinsics.areEqual(this.errorEvent, profileVisibilityViewState.errorEvent) && Intrinsics.areEqual(this.statuses, profileVisibilityViewState.statuses);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isUpdating)) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return ((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.statuses.hashCode();
    }

    public String toString() {
        return "ProfileVisibilityViewState(isLoading=" + this.isLoading + ", isUpdating=" + this.isUpdating + ", errorEvent=" + this.errorEvent + ", statuses=" + this.statuses + ")";
    }

    public ProfileVisibilityViewState(boolean z, boolean z2, UiEvent<Throwable> uiEvent, Map<OptOutConsentType, Boolean> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        this.isLoading = z;
        this.isUpdating = z2;
        this.errorEvent = uiEvent;
        this.statuses = statuses;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public /* synthetic */ ProfileVisibilityViewState(boolean z, boolean z2, UiEvent uiEvent, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<OptOutConsentType, Boolean> getStatuses() {
        return this.statuses;
    }

    public final boolean isStickerRowChecked() {
        return this.statuses.getOrDefault(OptOutConsentType.STICKER_DISCOVERABILITY_CONSENT, Boolean.FALSE).booleanValue();
    }

    public final boolean isPhoneRowChecked() {
        return this.statuses.getOrDefault(OptOutConsentType.PHONE_DISCOVERABILITY_CONSENT, Boolean.FALSE).booleanValue();
    }

    public final boolean isEmailRowChecked() {
        return this.statuses.getOrDefault(OptOutConsentType.EMAIL_DISCOVERABILITY_CONSENT, Boolean.FALSE).booleanValue();
    }

    public final boolean isAnyoneRowChecked() {
        return isStickerRowChecked() || isPhoneRowChecked() || isEmailRowChecked();
    }

    public final boolean isNobodyRowChecked() {
        return !isAnyoneRowChecked();
    }
}
