package com.robinhood.android.maxonboarding;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingProgress.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 '2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001'B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/maxonboarding/OnboardingProgress;", "Landroid/os/Parcelable;", "", "segmentIdx", "", "progress", "", "<init>", "(Ljava/lang/String;IIF)V", "getSegmentIdx", "()I", "getProgress", "()F", "INITIAL", "REGION", "EMAIL", "PASSWORD", "FULL_NAME", "FUND_ACCOUNT_INITIAL", "FUND_ACCOUNT_INFO", "DEPOSIT_MATCH", "FUND_ACCOUNT_NATIVE_GOLD_UPSELL", "FUND_ACCOUNT_DEPOSIT", "FUND_ACCOUNT_DEPOSIT_CHOOSE_AMT", "FUND_ACCOUNT_DEPOSIT_CONFIRM_AMT", "RECURRING_AUTOMATIC_DEPOSIT_SCHEDULE", "RECURRING_AUTOMATIC_DEPOSIT_ENTER_AMOUNT", "RECURRING_AUTOMATIC_DEPOSIT_REVIEW_TRANSFER", "RECURRING_AUTOMATIC_DEPOSIT_DONE", "REFERRAL", "REFERRAL_INVITE_CONTACTS_SPLASH", "REFERRAL_INVITE_CONTACTS", "DOC_UPLOAD", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "feature-lib-max-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OnboardingProgress implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnboardingProgress[] $VALUES;
    public static final Parcelable.Creator<OnboardingProgress> CREATOR;
    public static final int NUM_SEGMENTS = 5;
    private final float progress;
    private final int segmentIdx;
    public static final OnboardingProgress INITIAL = new OnboardingProgress("INITIAL", 0, 0, 0.0f);
    public static final OnboardingProgress REGION = new OnboardingProgress("REGION", 1, 0, 0.25f);
    public static final OnboardingProgress EMAIL = new OnboardingProgress("EMAIL", 2, 0, 0.5f);
    public static final OnboardingProgress PASSWORD = new OnboardingProgress("PASSWORD", 3, 0, 0.75f);
    public static final OnboardingProgress FULL_NAME = new OnboardingProgress("FULL_NAME", 4, 0, 1.0f);
    public static final OnboardingProgress FUND_ACCOUNT_INITIAL = new OnboardingProgress("FUND_ACCOUNT_INITIAL", 5, 4, 0.0f);
    public static final OnboardingProgress FUND_ACCOUNT_INFO = new OnboardingProgress("FUND_ACCOUNT_INFO", 6, 4, 0.0f);
    public static final OnboardingProgress DEPOSIT_MATCH = new OnboardingProgress("DEPOSIT_MATCH", 7, 4, 0.2f);
    public static final OnboardingProgress FUND_ACCOUNT_NATIVE_GOLD_UPSELL = new OnboardingProgress("FUND_ACCOUNT_NATIVE_GOLD_UPSELL", 8, 4, 0.4f);
    public static final OnboardingProgress FUND_ACCOUNT_DEPOSIT = new OnboardingProgress("FUND_ACCOUNT_DEPOSIT", 9, 4, 0.4f);
    public static final OnboardingProgress FUND_ACCOUNT_DEPOSIT_CHOOSE_AMT = new OnboardingProgress("FUND_ACCOUNT_DEPOSIT_CHOOSE_AMT", 10, 4, 0.46f);
    public static final OnboardingProgress FUND_ACCOUNT_DEPOSIT_CONFIRM_AMT = new OnboardingProgress("FUND_ACCOUNT_DEPOSIT_CONFIRM_AMT", 11, 4, 0.53f);
    public static final OnboardingProgress RECURRING_AUTOMATIC_DEPOSIT_SCHEDULE = new OnboardingProgress("RECURRING_AUTOMATIC_DEPOSIT_SCHEDULE", 12, 4, 0.6f);
    public static final OnboardingProgress RECURRING_AUTOMATIC_DEPOSIT_ENTER_AMOUNT = new OnboardingProgress("RECURRING_AUTOMATIC_DEPOSIT_ENTER_AMOUNT", 13, 4, 0.65f);
    public static final OnboardingProgress RECURRING_AUTOMATIC_DEPOSIT_REVIEW_TRANSFER = new OnboardingProgress("RECURRING_AUTOMATIC_DEPOSIT_REVIEW_TRANSFER", 14, 4, 0.7f);
    public static final OnboardingProgress RECURRING_AUTOMATIC_DEPOSIT_DONE = new OnboardingProgress("RECURRING_AUTOMATIC_DEPOSIT_DONE", 15, 4, 0.75f);
    public static final OnboardingProgress REFERRAL = new OnboardingProgress("REFERRAL", 16, 4, 0.8f);
    public static final OnboardingProgress REFERRAL_INVITE_CONTACTS_SPLASH = new OnboardingProgress("REFERRAL_INVITE_CONTACTS_SPLASH", 17, 4, 0.8f);
    public static final OnboardingProgress REFERRAL_INVITE_CONTACTS = new OnboardingProgress("REFERRAL_INVITE_CONTACTS", 18, 4, 0.8f);
    public static final OnboardingProgress DOC_UPLOAD = new OnboardingProgress("DOC_UPLOAD", 19, 4, 0.8f);

    private static final /* synthetic */ OnboardingProgress[] $values() {
        return new OnboardingProgress[]{INITIAL, REGION, EMAIL, PASSWORD, FULL_NAME, FUND_ACCOUNT_INITIAL, FUND_ACCOUNT_INFO, DEPOSIT_MATCH, FUND_ACCOUNT_NATIVE_GOLD_UPSELL, FUND_ACCOUNT_DEPOSIT, FUND_ACCOUNT_DEPOSIT_CHOOSE_AMT, FUND_ACCOUNT_DEPOSIT_CONFIRM_AMT, RECURRING_AUTOMATIC_DEPOSIT_SCHEDULE, RECURRING_AUTOMATIC_DEPOSIT_ENTER_AMOUNT, RECURRING_AUTOMATIC_DEPOSIT_REVIEW_TRANSFER, RECURRING_AUTOMATIC_DEPOSIT_DONE, REFERRAL, REFERRAL_INVITE_CONTACTS_SPLASH, REFERRAL_INVITE_CONTACTS, DOC_UPLOAD};
    }

    public static EnumEntries<OnboardingProgress> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private OnboardingProgress(String str, int i, int i2, float f) {
        this.segmentIdx = i2;
        this.progress = f;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSegmentIdx() {
        return this.segmentIdx;
    }

    static {
        OnboardingProgress[] onboardingProgressArr$values = $values();
        $VALUES = onboardingProgressArr$values;
        $ENTRIES = EnumEntries2.enumEntries(onboardingProgressArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<OnboardingProgress>() { // from class: com.robinhood.android.maxonboarding.OnboardingProgress.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnboardingProgress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return OnboardingProgress.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnboardingProgress[] newArray(int i) {
                return new OnboardingProgress[i];
            }
        };
    }

    public static OnboardingProgress valueOf(String str) {
        return (OnboardingProgress) Enum.valueOf(OnboardingProgress.class, str);
    }

    public static OnboardingProgress[] values() {
        return (OnboardingProgress[]) $VALUES.clone();
    }
}
