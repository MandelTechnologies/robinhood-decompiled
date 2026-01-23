package com.robinhood.android.earlypay.toggle.p113ui;

import com.robinhood.android.earlypay.C14433R;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: EarlyPayToggleViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleViewState;", "", "isEnabled", "", "isLoading", "pendingEnrollment", "earlyPayEnrollment", "Lcom/robinhood/models/db/EarlyPayEnrollment;", "earlyPayEnrollmentError", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(ZZLjava/lang/Boolean;Lcom/robinhood/models/db/EarlyPayEnrollment;Lcom/robinhood/udf/UiEvent;)V", "()Z", "Ljava/lang/Boolean;", "getEarlyPayEnrollmentError", "()Lcom/robinhood/udf/UiEvent;", "secondaryText", "Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Lcom/robinhood/utils/resource/StringResource;", "isToggleChecked", "component1", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "copy", "(ZZLjava/lang/Boolean;Lcom/robinhood/models/db/EarlyPayEnrollment;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayToggleViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class EarlyPayToggleViewState {
    public static final int $stable = 8;
    private final EarlyPayEnrollment earlyPayEnrollment;
    private final UiEvent<Throwable> earlyPayEnrollmentError;
    private final boolean isEnabled;
    private final boolean isLoading;
    private final boolean isToggleChecked;
    private final Boolean pendingEnrollment;

    public EarlyPayToggleViewState() {
        this(false, false, null, null, null, 31, null);
    }

    /* renamed from: component3, reason: from getter */
    private final Boolean getPendingEnrollment() {
        return this.pendingEnrollment;
    }

    /* renamed from: component4, reason: from getter */
    private final EarlyPayEnrollment getEarlyPayEnrollment() {
        return this.earlyPayEnrollment;
    }

    public static /* synthetic */ EarlyPayToggleViewState copy$default(EarlyPayToggleViewState earlyPayToggleViewState, boolean z, boolean z2, Boolean bool, EarlyPayEnrollment earlyPayEnrollment, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = earlyPayToggleViewState.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = earlyPayToggleViewState.isLoading;
        }
        if ((i & 4) != 0) {
            bool = earlyPayToggleViewState.pendingEnrollment;
        }
        if ((i & 8) != 0) {
            earlyPayEnrollment = earlyPayToggleViewState.earlyPayEnrollment;
        }
        if ((i & 16) != 0) {
            uiEvent = earlyPayToggleViewState.earlyPayEnrollmentError;
        }
        UiEvent uiEvent2 = uiEvent;
        Boolean bool2 = bool;
        return earlyPayToggleViewState.copy(z, z2, bool2, earlyPayEnrollment, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component5() {
        return this.earlyPayEnrollmentError;
    }

    public final EarlyPayToggleViewState copy(boolean isEnabled, boolean isLoading, Boolean pendingEnrollment, EarlyPayEnrollment earlyPayEnrollment, UiEvent<Throwable> earlyPayEnrollmentError) {
        return new EarlyPayToggleViewState(isEnabled, isLoading, pendingEnrollment, earlyPayEnrollment, earlyPayEnrollmentError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayToggleViewState)) {
            return false;
        }
        EarlyPayToggleViewState earlyPayToggleViewState = (EarlyPayToggleViewState) other;
        return this.isEnabled == earlyPayToggleViewState.isEnabled && this.isLoading == earlyPayToggleViewState.isLoading && Intrinsics.areEqual(this.pendingEnrollment, earlyPayToggleViewState.pendingEnrollment) && Intrinsics.areEqual(this.earlyPayEnrollment, earlyPayToggleViewState.earlyPayEnrollment) && Intrinsics.areEqual(this.earlyPayEnrollmentError, earlyPayToggleViewState.earlyPayEnrollmentError);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isEnabled) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        Boolean bool = this.pendingEnrollment;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        EarlyPayEnrollment earlyPayEnrollment = this.earlyPayEnrollment;
        int iHashCode3 = (iHashCode2 + (earlyPayEnrollment == null ? 0 : earlyPayEnrollment.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.earlyPayEnrollmentError;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "EarlyPayToggleViewState(isEnabled=" + this.isEnabled + ", isLoading=" + this.isLoading + ", pendingEnrollment=" + this.pendingEnrollment + ", earlyPayEnrollment=" + this.earlyPayEnrollment + ", earlyPayEnrollmentError=" + this.earlyPayEnrollmentError + ")";
    }

    public EarlyPayToggleViewState(boolean z, boolean z2, Boolean bool, EarlyPayEnrollment earlyPayEnrollment, UiEvent<Throwable> uiEvent) {
        this.isEnabled = z;
        this.isLoading = z2;
        this.pendingEnrollment = bool;
        this.earlyPayEnrollment = earlyPayEnrollment;
        this.earlyPayEnrollmentError = uiEvent;
        this.isToggleChecked = Intrinsics.areEqual(bool == null ? earlyPayEnrollment != null ? Boolean.valueOf(earlyPayEnrollment.isEnrolled()) : null : bool, Boolean.TRUE);
    }

    public /* synthetic */ EarlyPayToggleViewState(boolean z, boolean z2, Boolean bool, EarlyPayEnrollment earlyPayEnrollment, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : earlyPayEnrollment, (i & 16) != 0 ? null : uiEvent);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getEarlyPayEnrollmentError() {
        return this.earlyPayEnrollmentError;
    }

    public final StringResource getSecondaryText() {
        int i;
        EarlyPayEnrollment earlyPayEnrollment = this.earlyPayEnrollment;
        if ((earlyPayEnrollment != null ? earlyPayEnrollment.getUpdatedAt() : null) == null) {
            return StringResource.INSTANCE.invoke(C14433R.string.early_pay_toggle_view_secondary_text_placeholder, new Object[0]);
        }
        Instant updatedAt = this.earlyPayEnrollment.getUpdatedAt();
        if (this.earlyPayEnrollment.getUpdatedBy() != ApiEarlyPayEnrollment.UpdatedBy.NONE && updatedAt != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.earlyPayEnrollment.isEnrolled()) {
                i = C14433R.string.enabled_on_date_format;
            } else {
                i = C14433R.string.disabled_on_date_format;
            }
            return companion.invoke(i, InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) updatedAt));
        }
        return StringResource.INSTANCE.invoke(C14433R.string.early_pay_toggle_view_secondary_text_placeholder, new Object[0]);
    }

    /* renamed from: isToggleChecked, reason: from getter */
    public final boolean getIsToggleChecked() {
        return this.isToggleChecked;
    }
}
