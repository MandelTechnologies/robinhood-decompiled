package com.robinhood.android.accountcenter.views;

import com.robinhood.models.p355ui.ProfileAccountBreakdown;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus;", "", "<init>", "()V", "Loading", "Success", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus$Loading;", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus$Success;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class ProfileAccountBreakdownStatus {
    public static final int $stable = 0;

    public /* synthetic */ ProfileAccountBreakdownStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus$Loading;", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus;", "<init>", "()V", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends ProfileAccountBreakdownStatus {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private ProfileAccountBreakdownStatus() {
    }

    /* compiled from: ProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus$Success;", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus;", "profileAccountBreakdown", "Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "<init>", "(Lcom/robinhood/models/ui/ProfileAccountBreakdown;)V", "getProfileAccountBreakdown", "()Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Success extends ProfileAccountBreakdownStatus {
        public static final int $stable = 8;
        private final ProfileAccountBreakdown profileAccountBreakdown;

        public final ProfileAccountBreakdown getProfileAccountBreakdown() {
            return this.profileAccountBreakdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ProfileAccountBreakdown profileAccountBreakdown) {
            super(null);
            Intrinsics.checkNotNullParameter(profileAccountBreakdown, "profileAccountBreakdown");
            this.profileAccountBreakdown = profileAccountBreakdown;
        }
    }
}
