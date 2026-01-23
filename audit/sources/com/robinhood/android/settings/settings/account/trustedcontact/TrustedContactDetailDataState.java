package com.robinhood.android.settings.settings.account.trustedcontact;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.models.api.identi.ApiAddress;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UiAddressKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactDetailDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDataState;", "", "loading", "", "trustedContact", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "<init>", "(ZLcom/robinhood/models/api/identi/ApiTrustedContact;)V", "getLoading", "()Z", "getTrustedContact", "()Lcom/robinhood/models/api/identi/ApiTrustedContact;", "fullName", "", "getFullName", "()Ljava/lang/String;", "email", "getEmail", PlaceTypes.ADDRESS, "getAddress", "isAddressRowVisible", "formatPhoneNumber", "formatter", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrustedContactDetailDataState {
    public static final int $stable = 8;
    private final boolean loading;
    private final ApiTrustedContact trustedContact;

    /* JADX WARN: Multi-variable type inference failed */
    public TrustedContactDetailDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TrustedContactDetailDataState copy$default(TrustedContactDetailDataState trustedContactDetailDataState, boolean z, ApiTrustedContact apiTrustedContact, int i, Object obj) {
        if ((i & 1) != 0) {
            z = trustedContactDetailDataState.loading;
        }
        if ((i & 2) != 0) {
            apiTrustedContact = trustedContactDetailDataState.trustedContact;
        }
        return trustedContactDetailDataState.copy(z, apiTrustedContact);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiTrustedContact getTrustedContact() {
        return this.trustedContact;
    }

    public final TrustedContactDetailDataState copy(boolean loading, ApiTrustedContact trustedContact) {
        return new TrustedContactDetailDataState(loading, trustedContact);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedContactDetailDataState)) {
            return false;
        }
        TrustedContactDetailDataState trustedContactDetailDataState = (TrustedContactDetailDataState) other;
        return this.loading == trustedContactDetailDataState.loading && Intrinsics.areEqual(this.trustedContact, trustedContactDetailDataState.trustedContact);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        ApiTrustedContact apiTrustedContact = this.trustedContact;
        return iHashCode + (apiTrustedContact == null ? 0 : apiTrustedContact.hashCode());
    }

    public String toString() {
        return "TrustedContactDetailDataState(loading=" + this.loading + ", trustedContact=" + this.trustedContact + ")";
    }

    public TrustedContactDetailDataState(boolean z, ApiTrustedContact apiTrustedContact) {
        this.loading = z;
        this.trustedContact = apiTrustedContact;
    }

    public /* synthetic */ TrustedContactDetailDataState(boolean z, ApiTrustedContact apiTrustedContact, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : apiTrustedContact);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final ApiTrustedContact getTrustedContact() {
        return this.trustedContact;
    }

    public final String getFullName() {
        ApiTrustedContact apiTrustedContact = this.trustedContact;
        if (apiTrustedContact != null) {
            return apiTrustedContact.getFullName();
        }
        return null;
    }

    public final String getEmail() {
        ApiTrustedContact apiTrustedContact = this.trustedContact;
        if (apiTrustedContact != null) {
            return apiTrustedContact.getEmail();
        }
        return null;
    }

    public final String getAddress() {
        ApiAddress address;
        UiAddress uiAddress;
        ApiTrustedContact apiTrustedContact = this.trustedContact;
        if (apiTrustedContact == null || (address = apiTrustedContact.getAddress()) == null || (uiAddress = UiAddressKt.toUiAddress(address)) == null) {
            return null;
        }
        return uiAddress.getDisplayMultiline();
    }

    public final boolean isAddressRowVisible() {
        ApiAddress address;
        ApiTrustedContact apiTrustedContact = this.trustedContact;
        return !UiAddressKt.isNullOrEmpty((apiTrustedContact == null || (address = apiTrustedContact.getAddress()) == null) ? null : UiAddressKt.toUiAddress(address));
    }

    public final String formatPhoneNumber(PhoneNumberFormatter formatter) {
        String phone_number;
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        ApiTrustedContact apiTrustedContact = this.trustedContact;
        if (apiTrustedContact == null || (phone_number = apiTrustedContact.getPhone_number()) == null) {
            return null;
        }
        return "+" + PhoneNumberFormatter.formatDisplayNumber$default(formatter, phone_number, false, 2, null);
    }
}
