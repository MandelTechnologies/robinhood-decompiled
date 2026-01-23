package com.robinhood.android.welcome;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WelcomePage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomePage;", "Landroid/os/Parcelable;", "", "pageIdx", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "subtitleRes", "disclosureRes", "analyticsString", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getPageIdx", "()I", "getTitleRes", "getSubtitleRes", "getDisclosureRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnalyticsString", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "PAGE_TWO", "PAGE_THREE", "PAGE_FOUR", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WelcomePage implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WelcomePage[] $VALUES;
    public static final Parcelable.Creator<WelcomePage> CREATOR;
    private final String analyticsString;
    private final Integer disclosureRes;
    private final int pageIdx;
    private final Screen screen;
    private final int subtitleRes;
    private final int titleRes;
    public static final WelcomePage PAGE_TWO = new WelcomePage("PAGE_TWO", 0, 1, C31456R.string.welcome_max_page_two_title, C31456R.string.gated_etf_welcome_max_page_two_subtitle, Integer.valueOf(C31456R.string.welcome_max_page_two_disclosure), AnalyticsStrings.TAB_MAX_MADE_FOR_EVERYONE, new Screen(Screen.Name.WELCOME_INVESTING, null, null, null, 14, null));
    public static final WelcomePage PAGE_THREE = new WelcomePage("PAGE_THREE", 1, 2, C31456R.string.welcome_max_page_three_title, C31456R.string.welcome_max_page_three_subtitle, Integer.valueOf(C31456R.string.gated_rhf_welcome_max_page_three_disclosure), AnalyticsStrings.TAB_MAX_START_WITH_DOLLAR, new Screen(Screen.Name.WELCOME_START_WITH_DOLLAR, null, null, null, 14, null));
    public static final WelcomePage PAGE_FOUR = new WelcomePage("PAGE_FOUR", 2, 3, C31456R.string.welcome_max_page_four_title, C31456R.string.welcome_max_page_four_subtitle, Integer.valueOf(C31456R.string.welcome_max_page_four_disclosure), AnalyticsStrings.TAB_MAX_SAFETY_FIRST, new Screen(Screen.Name.WELCOME_SAFETY_FIRST, null, null, null, 14, null));

    private static final /* synthetic */ WelcomePage[] $values() {
        return new WelcomePage[]{PAGE_TWO, PAGE_THREE, PAGE_FOUR};
    }

    public static EnumEntries<WelcomePage> getEntries() {
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

    private WelcomePage(String str, int i, int i2, int i3, int i4, Integer num, String str2, Screen screen) {
        this.pageIdx = i2;
        this.titleRes = i3;
        this.subtitleRes = i4;
        this.disclosureRes = num;
        this.analyticsString = str2;
        this.screen = screen;
    }

    public final int getPageIdx() {
        return this.pageIdx;
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

    public final String getAnalyticsString() {
        return this.analyticsString;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    static {
        WelcomePage[] welcomePageArr$values = $values();
        $VALUES = welcomePageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(welcomePageArr$values);
        CREATOR = new Parcelable.Creator<WelcomePage>() { // from class: com.robinhood.android.welcome.WelcomePage.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WelcomePage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return WelcomePage.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WelcomePage[] newArray(int i) {
                return new WelcomePage[i];
            }
        };
    }

    public static WelcomePage valueOf(String str) {
        return (WelcomePage) Enum.valueOf(WelcomePage.class, str);
    }

    public static WelcomePage[] values() {
        return (WelcomePage[]) $VALUES.clone();
    }
}
