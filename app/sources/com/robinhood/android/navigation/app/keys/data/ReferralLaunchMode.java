package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ReferralLaunchMode;", "Landroid/os/Parcelable;", "source", "", "launchMode", "", "<init>", "(Ljava/lang/String;I)V", "getSource", "()Ljava/lang/String;", "getLaunchMode", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ReferralLaunchMode implements Parcelable {
    public static final String INITIAL_SOURCE_HOME_REWARDS_PILL = "home_pill";
    public static final String INITIAL_SOURCE_POST_STOCK_CLAIM_PROMPT = "prompt_after_stock_claim";
    public static final String INITIAL_SOURCE_PROFILE = "profile";
    public static final String LAST_KNOWN_TOUCHPOINT_OFFERS_LIST_SCREEN = "offers_list";
    public static final int LAUNCH_MODE_PAST_REFERRALS = 1;
    public static final int LAUNCH_MODE_REFER = 0;
    public static final String SOURCE_CRYPTO_DEEPLINK = "crypto_deeplink";
    public static final String SOURCE_HOME_TAB_ICON = "header_icon";
    public static final String SOURCE_POST_STOCK_CLAIM_PROMPT = "prompt_after_stock_reward_claim";
    public static final String SOURCE_PROFILE = "profile";
    public static final String SOURCE_SIGN_UP = "sign_up";
    private final int launchMode;
    private final String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ReferralLaunchMode> CREATOR = new Creator();

    /* compiled from: ReferralLaunchMode.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ReferralLaunchMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralLaunchMode createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferralLaunchMode(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralLaunchMode[] newArray(int i) {
            return new ReferralLaunchMode[i];
        }
    }

    @JvmStatic
    public static final ReferralLaunchMode normal(String str) {
        return INSTANCE.normal(str);
    }

    @JvmStatic
    public static final ReferralLaunchMode onboarding() {
        return INSTANCE.onboarding();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeInt(this.launchMode);
    }

    public ReferralLaunchMode(String source, int i) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.launchMode = i;
    }

    public /* synthetic */ ReferralLaunchMode(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }

    public final String getSource() {
        return this.source;
    }

    public final int getLaunchMode() {
        return this.launchMode;
    }

    /* compiled from: ReferralLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ReferralLaunchMode$Companion;", "", "<init>", "()V", "LAUNCH_MODE_REFER", "", "LAUNCH_MODE_PAST_REFERRALS", "SOURCE_POST_STOCK_CLAIM_PROMPT", "", "SOURCE_CRYPTO_DEEPLINK", "SOURCE_SIGN_UP", "SOURCE_HOME_TAB_ICON", "SOURCE_PROFILE", "INITIAL_SOURCE_HOME_REWARDS_PILL", "INITIAL_SOURCE_PROFILE", "INITIAL_SOURCE_POST_STOCK_CLAIM_PROMPT", "LAST_KNOWN_TOUCHPOINT_OFFERS_LIST_SCREEN", "normal", "Lcom/robinhood/android/navigation/app/keys/data/ReferralLaunchMode;", "source", "pastReferrals", "onboarding", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ReferralLaunchMode normal(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ReferralLaunchMode(source, 0, 2, null);
        }

        public final ReferralLaunchMode pastReferrals(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ReferralLaunchMode(source, 1);
        }

        @JvmStatic
        public final ReferralLaunchMode onboarding() {
            return new ReferralLaunchMode("sign_up", 0, 2, null);
        }
    }
}
