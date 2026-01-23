package com.robinhood.android.accountcenter.views;

import com.robinhood.models.p355ui.ProfileAccountBreakdown;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownState;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "<init>", "(Lcom/robinhood/models/ui/ProfileAccountBreakdown;)V", "getData", "()Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "shouldShowInfoBanner", "", "getShouldShowInfoBanner", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class ProfileAccountBreakdownState {
    public static final int $stable = 8;
    private final ProfileAccountBreakdown data;
    private final boolean shouldShowInfoBanner;

    public static /* synthetic */ ProfileAccountBreakdownState copy$default(ProfileAccountBreakdownState profileAccountBreakdownState, ProfileAccountBreakdown profileAccountBreakdown, int i, Object obj) {
        if ((i & 1) != 0) {
            profileAccountBreakdown = profileAccountBreakdownState.data;
        }
        return profileAccountBreakdownState.copy(profileAccountBreakdown);
    }

    /* renamed from: component1, reason: from getter */
    public final ProfileAccountBreakdown getData() {
        return this.data;
    }

    public final ProfileAccountBreakdownState copy(ProfileAccountBreakdown data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ProfileAccountBreakdownState(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProfileAccountBreakdownState) && Intrinsics.areEqual(this.data, ((ProfileAccountBreakdownState) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "ProfileAccountBreakdownState(data=" + this.data + ")";
    }

    public ProfileAccountBreakdownState(ProfileAccountBreakdown data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.shouldShowInfoBanner = !data.getInfoBanners().isEmpty();
    }

    public final ProfileAccountBreakdown getData() {
        return this.data;
    }

    public final boolean getShouldShowInfoBanner() {
        return this.shouldShowInfoBanner;
    }
}
