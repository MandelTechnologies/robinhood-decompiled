package com.robinhood.android.retirement.p239ui.error;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.retirement.C26959R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RetirementDashboardErrorReason.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/error/RetirementDashboardErrorReason;", "Landroid/os/Parcelable;", "", "title", "", AccountOverviewOptionsSettingCard4.CTA, "<init>", "(Ljava/lang/String;III)V", "getTitle", "()I", "getCta", "FailedToLoad", "UpdateApp", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementDashboardErrorReason implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetirementDashboardErrorReason[] $VALUES;
    public static final Parcelable.Creator<RetirementDashboardErrorReason> CREATOR;
    public static final RetirementDashboardErrorReason FailedToLoad = new RetirementDashboardErrorReason("FailedToLoad", 0, C26959R.string.retirement_dashboard_error_title, C26959R.string.retirement_dashboard_error_retry_cta);
    public static final RetirementDashboardErrorReason UpdateApp = new RetirementDashboardErrorReason("UpdateApp", 1, C26959R.string.retirement_dashboard_update_app_title, C26959R.string.retirement_dashboard_unknown_update_app_cta);
    private final int cta;
    private final int title;

    private static final /* synthetic */ RetirementDashboardErrorReason[] $values() {
        return new RetirementDashboardErrorReason[]{FailedToLoad, UpdateApp};
    }

    public static EnumEntries<RetirementDashboardErrorReason> getEntries() {
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

    private RetirementDashboardErrorReason(String str, int i, int i2, int i3) {
        this.title = i2;
        this.cta = i3;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getCta() {
        return this.cta;
    }

    static {
        RetirementDashboardErrorReason[] retirementDashboardErrorReasonArr$values = $values();
        $VALUES = retirementDashboardErrorReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(retirementDashboardErrorReasonArr$values);
        CREATOR = new Parcelable.Creator<RetirementDashboardErrorReason>() { // from class: com.robinhood.android.retirement.ui.error.RetirementDashboardErrorReason.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetirementDashboardErrorReason createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return RetirementDashboardErrorReason.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetirementDashboardErrorReason[] newArray(int i) {
                return new RetirementDashboardErrorReason[i];
            }
        };
    }

    public static RetirementDashboardErrorReason valueOf(String str) {
        return (RetirementDashboardErrorReason) Enum.valueOf(RetirementDashboardErrorReason.class, str);
    }

    public static RetirementDashboardErrorReason[] values() {
        return (RetirementDashboardErrorReason[]) $VALUES.clone();
    }
}
