package com.robinhood.android.welcome.rebrand;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WelcomePageRebrand.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B9\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001b\u001a\u00020\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomePageRebrand;", "Landroid/os/Parcelable;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "subtitleRes", "disclosureRes", "analyticsString", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getTitleRes", "()I", "getSubtitleRes", "getDisclosureRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnalyticsString", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "PAGE_ONE", "PAGE_TWO", "PAGE_THREE", "PAGE_FOUR", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WelcomePageRebrand implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WelcomePageRebrand[] $VALUES;
    public static final Parcelable.Creator<WelcomePageRebrand> CREATOR;
    private final String analyticsString;
    private final Integer disclosureRes;
    private final Screen screen;
    private final int subtitleRes;
    private final int titleRes;
    public static final WelcomePageRebrand PAGE_ONE = new WelcomePageRebrand("PAGE_ONE", 0, C31456R.string.welcome_max_title, C31456R.string.welcome_max_subtitle, null, AnalyticsStrings.TAB_MAX_WELCOME, new Screen(Screen.Name.WELCOME_MAIN, null, null, null, 14, null));
    public static final WelcomePageRebrand PAGE_TWO = new WelcomePageRebrand("PAGE_TWO", 1, C31456R.string.welcome_max_page_two_title, C31456R.string.gated_etf_welcome_max_page_two_subtitle, Integer.valueOf(C31456R.string.welcome_max_page_two_disclosure), AnalyticsStrings.TAB_MAX_MADE_FOR_EVERYONE, new Screen(Screen.Name.WELCOME_INVESTING, null, null, null, 14, null));
    public static final WelcomePageRebrand PAGE_THREE = new WelcomePageRebrand("PAGE_THREE", 2, C31456R.string.welcome_max_page_three_title, C31456R.string.welcome_max_page_three_subtitle, Integer.valueOf(C31456R.string.gated_rhf_welcome_max_page_three_disclosure), AnalyticsStrings.TAB_MAX_START_WITH_DOLLAR, new Screen(Screen.Name.WELCOME_START_WITH_DOLLAR, null, null, null, 14, null));
    public static final WelcomePageRebrand PAGE_FOUR = new WelcomePageRebrand("PAGE_FOUR", 3, C31456R.string.welcome_max_page_four_title, C31456R.string.welcome_max_page_four_subtitle, Integer.valueOf(C31456R.string.welcome_max_page_four_disclosure), AnalyticsStrings.TAB_MAX_SAFETY_FIRST, new Screen(Screen.Name.WELCOME_SAFETY_FIRST, null, null, null, 14, null));

    private static final /* synthetic */ WelcomePageRebrand[] $values() {
        return new WelcomePageRebrand[]{PAGE_ONE, PAGE_TWO, PAGE_THREE, PAGE_FOUR};
    }

    public static EnumEntries<WelcomePageRebrand> getEntries() {
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

    private WelcomePageRebrand(String str, int i, int i2, int i3, Integer num, String str2, Screen screen) {
        this.titleRes = i2;
        this.subtitleRes = i3;
        this.disclosureRes = num;
        this.analyticsString = str2;
        this.screen = screen;
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
        WelcomePageRebrand[] welcomePageRebrandArr$values = $values();
        $VALUES = welcomePageRebrandArr$values;
        $ENTRIES = EnumEntries2.enumEntries(welcomePageRebrandArr$values);
        CREATOR = new Parcelable.Creator<WelcomePageRebrand>() { // from class: com.robinhood.android.welcome.rebrand.WelcomePageRebrand.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WelcomePageRebrand createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return WelcomePageRebrand.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WelcomePageRebrand[] newArray(int i) {
                return new WelcomePageRebrand[i];
            }
        };
    }

    public static WelcomePageRebrand valueOf(String str) {
        return (WelcomePageRebrand) Enum.valueOf(WelcomePageRebrand.class, str);
    }

    public static WelcomePageRebrand[] values() {
        return (WelcomePageRebrand[]) $VALUES.clone();
    }
}
