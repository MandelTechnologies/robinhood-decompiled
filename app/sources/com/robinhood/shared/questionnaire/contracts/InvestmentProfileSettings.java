package com.robinhood.shared.questionnaire.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentProfileSettings.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0091\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0097\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u00105\u001a\u000206J\u0013\u00107\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000206HÖ\u0001J\t\u0010;\u001a\u00020\u0004HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000206R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006B"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/InvestmentProfileSettings;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "productContext", "", "accountNumber", "applicationId", "fromGoldUpgrade", "", "configureToolbar", "displayOnly", "source", "showButtonBar", "showAccountSwitcher", "useGoldTheme", "toolbarVisible", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;)V", "getProductContext", "()Ljava/lang/String;", "getAccountNumber", "getApplicationId", "getFromGoldUpgrade", "()Z", "getConfigureToolbar", "getDisplayOnly", "getSource", "getShowButtonBar", "getShowAccountSwitcher", "getUseGoldTheme", "getToolbarVisible", "getTitle", "getSubtitle", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InvestmentProfileSettings implements FragmentKey, TabFragmentKey {
    public static final String SOURCE_MARGIN_UPGRADE = "margin_upgrade";
    public static final String SOURCE_TOKENIZED_STOCKS_ONBOARDING = "crypto_tokenized_stocks_onboarding";
    private final String accountNumber;
    private final String applicationId;
    private final boolean configureToolbar;
    private final boolean displayOnly;
    private final boolean fromGoldUpgrade;
    private final String productContext;
    private final boolean showAccountSwitcher;
    private final boolean showButtonBar;
    private final String source;
    private final String subtitle;
    private final String title;
    private final boolean toolbarVisible;
    private final boolean useGoldTheme;
    public static final Parcelable.Creator<InvestmentProfileSettings> CREATOR = new Creator();

    /* compiled from: InvestmentProfileSettings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestmentProfileSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentProfileSettings createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String str;
            boolean z5;
            boolean z6;
            boolean z7;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z8 = false;
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z8 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z9 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z3;
                str = string5;
                z5 = z4;
            } else {
                z4 = z3;
                str = string5;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z7 = z6;
            } else {
                z7 = z6;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z7 = z;
            }
            return new InvestmentProfileSettings(string2, string3, string4, z8, z9, z2, str, z5, z4, z6, z7, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentProfileSettings[] newArray(int i) {
            return new InvestmentProfileSettings[i];
        }
    }

    public static /* synthetic */ InvestmentProfileSettings copy$default(InvestmentProfileSettings investmentProfileSettings, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentProfileSettings.productContext;
        }
        return investmentProfileSettings.copy(str, (i & 2) != 0 ? investmentProfileSettings.accountNumber : str2, (i & 4) != 0 ? investmentProfileSettings.applicationId : str3, (i & 8) != 0 ? investmentProfileSettings.fromGoldUpgrade : z, (i & 16) != 0 ? investmentProfileSettings.configureToolbar : z2, (i & 32) != 0 ? investmentProfileSettings.displayOnly : z3, (i & 64) != 0 ? investmentProfileSettings.source : str4, (i & 128) != 0 ? investmentProfileSettings.showButtonBar : z4, (i & 256) != 0 ? investmentProfileSettings.showAccountSwitcher : z5, (i & 512) != 0 ? investmentProfileSettings.useGoldTheme : z6, (i & 1024) != 0 ? investmentProfileSettings.toolbarVisible : z7, (i & 2048) != 0 ? investmentProfileSettings.title : str5, (i & 4096) != 0 ? investmentProfileSettings.subtitle : str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductContext() {
        return this.productContext;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUseGoldTheme() {
        return this.useGoldTheme;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFromGoldUpgrade() {
        return this.fromGoldUpgrade;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getConfigureToolbar() {
        return this.configureToolbar;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisplayOnly() {
        return this.displayOnly;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowButtonBar() {
        return this.showButtonBar;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowAccountSwitcher() {
        return this.showAccountSwitcher;
    }

    public final InvestmentProfileSettings copy(String productContext, String accountNumber, String applicationId, boolean fromGoldUpgrade, boolean configureToolbar, boolean displayOnly, String source, boolean showButtonBar, boolean showAccountSwitcher, boolean useGoldTheme, boolean toolbarVisible, String title, String subtitle) {
        return new InvestmentProfileSettings(productContext, accountNumber, applicationId, fromGoldUpgrade, configureToolbar, displayOnly, source, showButtonBar, showAccountSwitcher, useGoldTheme, toolbarVisible, title, subtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentProfileSettings)) {
            return false;
        }
        InvestmentProfileSettings investmentProfileSettings = (InvestmentProfileSettings) other;
        return Intrinsics.areEqual(this.productContext, investmentProfileSettings.productContext) && Intrinsics.areEqual(this.accountNumber, investmentProfileSettings.accountNumber) && Intrinsics.areEqual(this.applicationId, investmentProfileSettings.applicationId) && this.fromGoldUpgrade == investmentProfileSettings.fromGoldUpgrade && this.configureToolbar == investmentProfileSettings.configureToolbar && this.displayOnly == investmentProfileSettings.displayOnly && Intrinsics.areEqual(this.source, investmentProfileSettings.source) && this.showButtonBar == investmentProfileSettings.showButtonBar && this.showAccountSwitcher == investmentProfileSettings.showAccountSwitcher && this.useGoldTheme == investmentProfileSettings.useGoldTheme && this.toolbarVisible == investmentProfileSettings.toolbarVisible && Intrinsics.areEqual(this.title, investmentProfileSettings.title) && Intrinsics.areEqual(this.subtitle, investmentProfileSettings.subtitle);
    }

    public int hashCode() {
        String str = this.productContext;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applicationId;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.fromGoldUpgrade)) * 31) + Boolean.hashCode(this.configureToolbar)) * 31) + Boolean.hashCode(this.displayOnly)) * 31;
        String str4 = this.source;
        int iHashCode4 = (((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.showButtonBar)) * 31) + Boolean.hashCode(this.showAccountSwitcher)) * 31) + Boolean.hashCode(this.useGoldTheme)) * 31) + Boolean.hashCode(this.toolbarVisible)) * 31;
        String str5 = this.title;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitle;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "InvestmentProfileSettings(productContext=" + this.productContext + ", accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", fromGoldUpgrade=" + this.fromGoldUpgrade + ", configureToolbar=" + this.configureToolbar + ", displayOnly=" + this.displayOnly + ", source=" + this.source + ", showButtonBar=" + this.showButtonBar + ", showAccountSwitcher=" + this.showAccountSwitcher + ", useGoldTheme=" + this.useGoldTheme + ", toolbarVisible=" + this.toolbarVisible + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.productContext);
        dest.writeString(this.accountNumber);
        dest.writeString(this.applicationId);
        dest.writeInt(this.fromGoldUpgrade ? 1 : 0);
        dest.writeInt(this.configureToolbar ? 1 : 0);
        dest.writeInt(this.displayOnly ? 1 : 0);
        dest.writeString(this.source);
        dest.writeInt(this.showButtonBar ? 1 : 0);
        dest.writeInt(this.showAccountSwitcher ? 1 : 0);
        dest.writeInt(this.useGoldTheme ? 1 : 0);
        dest.writeInt(this.toolbarVisible ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
    }

    public InvestmentProfileSettings(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, String str5, String str6) {
        this.productContext = str;
        this.accountNumber = str2;
        this.applicationId = str3;
        this.fromGoldUpgrade = z;
        this.configureToolbar = z2;
        this.displayOnly = z3;
        this.source = str4;
        this.showButtonBar = z4;
        this.showAccountSwitcher = z5;
        this.useGoldTheme = z6;
        this.toolbarVisible = z7;
        this.title = str5;
        this.subtitle = str6;
    }

    public /* synthetic */ InvestmentProfileSettings(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? true : z7, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6);
    }

    public final String getProductContext() {
        return this.productContext;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getFromGoldUpgrade() {
        return this.fromGoldUpgrade;
    }

    public final boolean getConfigureToolbar() {
        return this.configureToolbar;
    }

    public final boolean getDisplayOnly() {
        return this.displayOnly;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getShowButtonBar() {
        return this.showButtonBar;
    }

    public final boolean getShowAccountSwitcher() {
        return this.showAccountSwitcher;
    }

    public final boolean getUseGoldTheme() {
        return this.useGoldTheme;
    }

    public final boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
