package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.util.extensions.PhoneFormat;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaSmsVerifyDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0002\b\u0019J5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDataState;", "", "isLoading", "", "isLoggedIn", "phoneNumber", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "<init>", "(ZZLjava/lang/String;Lcom/robinhood/models/db/sheriff/User;)V", "()Z", "getPhoneNumber$feature_security_center_externalDebug", "()Ljava/lang/String;", "getUser$feature_security_center_externalDebug", "()Lcom/robinhood/models/db/sheriff/User;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component3$feature_security_center_externalDebug", "component4", "component4$feature_security_center_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MfaSmsVerifyDataState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final boolean isLoggedIn;
    private final String phoneNumber;
    private final User user;

    public MfaSmsVerifyDataState() {
        this(false, false, null, null, 15, null);
    }

    public static /* synthetic */ MfaSmsVerifyDataState copy$default(MfaSmsVerifyDataState mfaSmsVerifyDataState, boolean z, boolean z2, String str, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mfaSmsVerifyDataState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = mfaSmsVerifyDataState.isLoggedIn;
        }
        if ((i & 4) != 0) {
            str = mfaSmsVerifyDataState.phoneNumber;
        }
        if ((i & 8) != 0) {
            user = mfaSmsVerifyDataState.user;
        }
        return mfaSmsVerifyDataState.copy(z, z2, str, user);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component3$feature_security_center_externalDebug, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component4$feature_security_center_externalDebug, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final MfaSmsVerifyDataState copy(boolean isLoading, boolean isLoggedIn, String phoneNumber, User user) {
        return new MfaSmsVerifyDataState(isLoading, isLoggedIn, phoneNumber, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaSmsVerifyDataState)) {
            return false;
        }
        MfaSmsVerifyDataState mfaSmsVerifyDataState = (MfaSmsVerifyDataState) other;
        return this.isLoading == mfaSmsVerifyDataState.isLoading && this.isLoggedIn == mfaSmsVerifyDataState.isLoggedIn && Intrinsics.areEqual(this.phoneNumber, mfaSmsVerifyDataState.phoneNumber) && Intrinsics.areEqual(this.user, mfaSmsVerifyDataState.user);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31;
        String str = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        User user = this.user;
        return iHashCode2 + (user != null ? user.hashCode() : 0);
    }

    public String toString() {
        return "MfaSmsVerifyDataState(isLoading=" + this.isLoading + ", isLoggedIn=" + this.isLoggedIn + ", phoneNumber=" + this.phoneNumber + ", user=" + this.user + ")";
    }

    public MfaSmsVerifyDataState(boolean z, boolean z2, String str, User user) {
        this.isLoading = z;
        this.isLoggedIn = z2;
        this.phoneNumber = str;
        this.user = user;
    }

    public /* synthetic */ MfaSmsVerifyDataState(boolean z, boolean z2, String str, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : user);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final String getPhoneNumber$feature_security_center_externalDebug() {
        return this.phoneNumber;
    }

    public final User getUser$feature_security_center_externalDebug() {
        return this.user;
    }

    public final StringResource getSubtitle() {
        String str = this.phoneNumber;
        if (str != null) {
            return StringResource.INSTANCE.invoke(C28186R.string.setting_mfa_sms_verify_v2_subtitle, PhoneFormat.formatPhoneForMfa(str, this.user));
        }
        return StringResource.INSTANCE.invoke("");
    }
}
