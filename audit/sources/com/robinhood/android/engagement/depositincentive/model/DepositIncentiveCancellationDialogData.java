package com.robinhood.android.engagement.depositincentive.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositIncentiveCancellationDialogData.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentiveCancellationDialogData;", "Landroid/os/Parcelable;", "title", "", "message", "primaryButtonText", "secondaryButtonText", "loggingIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getPrimaryButtonText", "getSecondaryButtonText", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deposit-incentive_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DepositIncentiveCancellationDialogData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DepositIncentiveCancellationDialogData> CREATOR = new Creator();
    private final String loggingIdentifier;
    private final String message;
    private final String primaryButtonText;
    private final String secondaryButtonText;
    private final String title;

    /* compiled from: DepositIncentiveCancellationDialogData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositIncentiveCancellationDialogData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositIncentiveCancellationDialogData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositIncentiveCancellationDialogData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositIncentiveCancellationDialogData[] newArray(int i) {
            return new DepositIncentiveCancellationDialogData[i];
        }
    }

    public static /* synthetic */ DepositIncentiveCancellationDialogData copy$default(DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositIncentiveCancellationDialogData.title;
        }
        if ((i & 2) != 0) {
            str2 = depositIncentiveCancellationDialogData.message;
        }
        if ((i & 4) != 0) {
            str3 = depositIncentiveCancellationDialogData.primaryButtonText;
        }
        if ((i & 8) != 0) {
            str4 = depositIncentiveCancellationDialogData.secondaryButtonText;
        }
        if ((i & 16) != 0) {
            str5 = depositIncentiveCancellationDialogData.loggingIdentifier;
        }
        String str6 = str5;
        String str7 = str3;
        return depositIncentiveCancellationDialogData.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final DepositIncentiveCancellationDialogData copy(String title, String message, String primaryButtonText, String secondaryButtonText, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new DepositIncentiveCancellationDialogData(title, message, primaryButtonText, secondaryButtonText, loggingIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositIncentiveCancellationDialogData)) {
            return false;
        }
        DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData = (DepositIncentiveCancellationDialogData) other;
        return Intrinsics.areEqual(this.title, depositIncentiveCancellationDialogData.title) && Intrinsics.areEqual(this.message, depositIncentiveCancellationDialogData.message) && Intrinsics.areEqual(this.primaryButtonText, depositIncentiveCancellationDialogData.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, depositIncentiveCancellationDialogData.secondaryButtonText) && Intrinsics.areEqual(this.loggingIdentifier, depositIncentiveCancellationDialogData.loggingIdentifier);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31) + this.secondaryButtonText.hashCode()) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "DepositIncentiveCancellationDialogData(title=" + this.title + ", message=" + this.message + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeString(this.primaryButtonText);
        dest.writeString(this.secondaryButtonText);
        dest.writeString(this.loggingIdentifier);
    }

    public DepositIncentiveCancellationDialogData(String title, String message, String primaryButtonText, String secondaryButtonText, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.title = title;
        this.message = message;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = secondaryButtonText;
        this.loggingIdentifier = loggingIdentifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }
}
