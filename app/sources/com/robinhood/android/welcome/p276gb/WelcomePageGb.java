package com.robinhood.android.welcome.p276gb;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WelcomePageGb.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BE\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomePageGb;", "Landroid/os/Parcelable;", "", "backgroundColorRes", "", "imageRes", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "subtitleRes", "disclosureRes", "screenIdentifier", "", "<init>", "(Ljava/lang/String;IIIIILjava/lang/Integer;Ljava/lang/String;)V", "getBackgroundColorRes", "()I", "getImageRes", "getTitleRes", "getSubtitleRes", "getDisclosureRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScreenIdentifier", "()Ljava/lang/String;", "PAGE_TWO", "PAGE_THREE", "PAGE_FOUR", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WelcomePageGb implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WelcomePageGb[] $VALUES;
    public static final Parcelable.Creator<WelcomePageGb> CREATOR;
    private final int backgroundColorRes;
    private final Integer disclosureRes;
    private final int imageRes;
    private final String screenIdentifier;
    private final int subtitleRes;
    private final int titleRes;
    public static final WelcomePageGb PAGE_TWO = new WelcomePageGb("PAGE_TWO", 0, C20690R.color.mobius_stratos_day, C31456R.drawable.welcome_page_gb_prop_1, C31456R.string.welcome_gb_page_two_title, C31456R.string.welcome_gb_page_two_subtitle, Integer.valueOf(C31456R.string.welcome_gb_page_two_disclosure), WelcomePageGb2.TAB_GB_NO_COMMISSIONS);
    public static final WelcomePageGb PAGE_THREE = new WelcomePageGb("PAGE_THREE", 1, C20690R.color.mobius_x_ray_light_day, C31456R.drawable.welcome_page_gb_prop_2, C31456R.string.welcome_gb_page_three_title, C31456R.string.welcome_gb_page_three_subtitle, Integer.valueOf(C31456R.string.welcome_gb_page_three_disclosure), WelcomePageGb2.TAB_GB_GOLD_CASH_INTEREST);
    public static final WelcomePageGb PAGE_FOUR = new WelcomePageGb("PAGE_FOUR", 2, C20690R.color.mobius_cosmonaut_night, C31456R.drawable.welcome_page_gb_prop_3, C31456R.string.welcome_gb_page_four_title, C31456R.string.welcome_gb_page_four_subtitle, Integer.valueOf(C31456R.string.welcome_gb_page_four_disclosure), WelcomePageGb2.TAB_GB_24H_MARKET);

    private static final /* synthetic */ WelcomePageGb[] $values() {
        return new WelcomePageGb[]{PAGE_TWO, PAGE_THREE, PAGE_FOUR};
    }

    public static EnumEntries<WelcomePageGb> getEntries() {
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

    private WelcomePageGb(String str, int i, int i2, int i3, int i4, int i5, Integer num, String str2) {
        this.backgroundColorRes = i2;
        this.imageRes = i3;
        this.titleRes = i4;
        this.subtitleRes = i5;
        this.disclosureRes = num;
        this.screenIdentifier = str2;
    }

    public final int getBackgroundColorRes() {
        return this.backgroundColorRes;
    }

    public final int getImageRes() {
        return this.imageRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final Integer getDisclosureRes() {
        return this.disclosureRes;
    }

    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    static {
        WelcomePageGb[] welcomePageGbArr$values = $values();
        $VALUES = welcomePageGbArr$values;
        $ENTRIES = EnumEntries2.enumEntries(welcomePageGbArr$values);
        CREATOR = new Parcelable.Creator<WelcomePageGb>() { // from class: com.robinhood.android.welcome.gb.WelcomePageGb.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WelcomePageGb createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return WelcomePageGb.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WelcomePageGb[] newArray(int i) {
                return new WelcomePageGb[i];
            }
        };
    }

    public static WelcomePageGb valueOf(String str) {
        return (WelcomePageGb) Enum.valueOf(WelcomePageGb.class, str);
    }

    public static WelcomePageGb[] values() {
        return (WelcomePageGb[]) $VALUES.clone();
    }
}
