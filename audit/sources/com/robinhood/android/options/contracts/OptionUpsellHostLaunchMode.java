package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionUpsellHostLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;", "Landroid/os/Parcelable;", "<init>", "()V", "AlertOnboarding", "TradeOnExpiration", "AlertOnboardingThenTradeOnExpiration", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode$AlertOnboarding;", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode$AlertOnboardingThenTradeOnExpiration;", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode$TradeOnExpiration;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionUpsellHostLaunchMode implements Parcelable {
    public /* synthetic */ OptionUpsellHostLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionUpsellHostLaunchMode() {
    }

    /* compiled from: OptionUpsellHostLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode$AlertOnboarding;", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;", "analyticsSource", "Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;)V", "getAnalyticsSource", "()Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlertOnboarding extends OptionUpsellHostLaunchMode {
        public static final Parcelable.Creator<AlertOnboarding> CREATOR = new Creator();
        private final OptionAlertOnboardingSource analyticsSource;

        /* compiled from: OptionUpsellHostLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AlertOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlertOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AlertOnboarding(OptionAlertOnboardingSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlertOnboarding[] newArray(int i) {
                return new AlertOnboarding[i];
            }
        }

        public static /* synthetic */ AlertOnboarding copy$default(AlertOnboarding alertOnboarding, OptionAlertOnboardingSource optionAlertOnboardingSource, int i, Object obj) {
            if ((i & 1) != 0) {
                optionAlertOnboardingSource = alertOnboarding.analyticsSource;
            }
            return alertOnboarding.copy(optionAlertOnboardingSource);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionAlertOnboardingSource getAnalyticsSource() {
            return this.analyticsSource;
        }

        public final AlertOnboarding copy(OptionAlertOnboardingSource analyticsSource) {
            Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
            return new AlertOnboarding(analyticsSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlertOnboarding) && this.analyticsSource == ((AlertOnboarding) other).analyticsSource;
        }

        public int hashCode() {
            return this.analyticsSource.hashCode();
        }

        public String toString() {
            return "AlertOnboarding(analyticsSource=" + this.analyticsSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.analyticsSource.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertOnboarding(OptionAlertOnboardingSource analyticsSource) {
            super(null);
            Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
            this.analyticsSource = analyticsSource;
        }

        public final OptionAlertOnboardingSource getAnalyticsSource() {
            return this.analyticsSource;
        }
    }

    /* compiled from: OptionUpsellHostLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode$TradeOnExpiration;", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TradeOnExpiration extends OptionUpsellHostLaunchMode {
        public static final TradeOnExpiration INSTANCE = new TradeOnExpiration();
        public static final Parcelable.Creator<TradeOnExpiration> CREATOR = new Creator();

        /* compiled from: OptionUpsellHostLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TradeOnExpiration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradeOnExpiration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TradeOnExpiration.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradeOnExpiration[] newArray(int i) {
                return new TradeOnExpiration[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TradeOnExpiration() {
            super(null);
        }
    }

    /* compiled from: OptionUpsellHostLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode$AlertOnboardingThenTradeOnExpiration;", "Lcom/robinhood/android/options/contracts/OptionUpsellHostLaunchMode;", "alertOnboardingAnalyticsSource", "Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;)V", "getAlertOnboardingAnalyticsSource", "()Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlertOnboardingThenTradeOnExpiration extends OptionUpsellHostLaunchMode {
        public static final Parcelable.Creator<AlertOnboardingThenTradeOnExpiration> CREATOR = new Creator();
        private final OptionAlertOnboardingSource alertOnboardingAnalyticsSource;

        /* compiled from: OptionUpsellHostLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AlertOnboardingThenTradeOnExpiration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlertOnboardingThenTradeOnExpiration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AlertOnboardingThenTradeOnExpiration(OptionAlertOnboardingSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlertOnboardingThenTradeOnExpiration[] newArray(int i) {
                return new AlertOnboardingThenTradeOnExpiration[i];
            }
        }

        public static /* synthetic */ AlertOnboardingThenTradeOnExpiration copy$default(AlertOnboardingThenTradeOnExpiration alertOnboardingThenTradeOnExpiration, OptionAlertOnboardingSource optionAlertOnboardingSource, int i, Object obj) {
            if ((i & 1) != 0) {
                optionAlertOnboardingSource = alertOnboardingThenTradeOnExpiration.alertOnboardingAnalyticsSource;
            }
            return alertOnboardingThenTradeOnExpiration.copy(optionAlertOnboardingSource);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionAlertOnboardingSource getAlertOnboardingAnalyticsSource() {
            return this.alertOnboardingAnalyticsSource;
        }

        public final AlertOnboardingThenTradeOnExpiration copy(OptionAlertOnboardingSource alertOnboardingAnalyticsSource) {
            Intrinsics.checkNotNullParameter(alertOnboardingAnalyticsSource, "alertOnboardingAnalyticsSource");
            return new AlertOnboardingThenTradeOnExpiration(alertOnboardingAnalyticsSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlertOnboardingThenTradeOnExpiration) && this.alertOnboardingAnalyticsSource == ((AlertOnboardingThenTradeOnExpiration) other).alertOnboardingAnalyticsSource;
        }

        public int hashCode() {
            return this.alertOnboardingAnalyticsSource.hashCode();
        }

        public String toString() {
            return "AlertOnboardingThenTradeOnExpiration(alertOnboardingAnalyticsSource=" + this.alertOnboardingAnalyticsSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.alertOnboardingAnalyticsSource.name());
        }

        public final OptionAlertOnboardingSource getAlertOnboardingAnalyticsSource() {
            return this.alertOnboardingAnalyticsSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertOnboardingThenTradeOnExpiration(OptionAlertOnboardingSource alertOnboardingAnalyticsSource) {
            super(null);
            Intrinsics.checkNotNullParameter(alertOnboardingAnalyticsSource, "alertOnboardingAnalyticsSource");
            this.alertOnboardingAnalyticsSource = alertOnboardingAnalyticsSource;
        }
    }
}
