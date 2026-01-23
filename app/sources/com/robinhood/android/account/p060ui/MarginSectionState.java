package com.robinhood.android.account.p060ui;

import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.margin.MarginEligibilityViewModel;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.MarginCall;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AccountOverviewMarginCard.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002>?B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003JG\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u00109\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020+HÖ\u0001J\t\u0010=\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/account/ui/MarginSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "account", "Lcom/robinhood/models/db/Account;", "isOptionsSupported", "", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "marginEligibilityViewModel", "Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/models/db/Account;ZLcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;)V", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getMarginSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getAccount", "()Lcom/robinhood/models/db/Account;", "()Z", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getMarginEligibilityViewModel", "()Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "isMarginInvestingEnabled", "shouldHideEnableMarginCta", "getShouldHideEnableMarginCta", "ineligibilityContentMarkdown", "", "getIneligibilityContentMarkdown$feature_account_overview_externalRelease", "()Ljava/lang/String;", "valueText", "Lcom/robinhood/utils/resource/StringResource;", "getValueText", "()Lcom/robinhood/utils/resource/StringResource;", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/account/ui/MarginSectionState$Summary;", "getSummary$feature_account_overview_externalRelease", "()Lcom/robinhood/android/account/ui/MarginSectionState$Summary;", "ctaTextRes", "", "getCtaTextRes", "()I", "rows", "Lcom/robinhood/android/account/ui/MarginSectionState$Rows;", "getRows$feature_account_overview_externalRelease", "()Lcom/robinhood/android/account/ui/MarginSectionState$Rows;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "Summary", "Rows", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class MarginSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final Account account;
    private final CountryCode.Supported countryCode;
    private final boolean isOptionsSupported;
    private final MarginEligibilityViewModel marginEligibilityViewModel;
    private final ApiMarginInvestingInfo marginInvestingInfo;
    private final MarginSettings marginSettings;

    /* compiled from: AccountOverviewMarginCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.MARGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ MarginSectionState copy$default(MarginSectionState marginSectionState, ApiMarginInvestingInfo apiMarginInvestingInfo, MarginSettings marginSettings, Account account, boolean z, CountryCode.Supported supported, MarginEligibilityViewModel marginEligibilityViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMarginInvestingInfo = marginSectionState.marginInvestingInfo;
        }
        if ((i & 2) != 0) {
            marginSettings = marginSectionState.marginSettings;
        }
        if ((i & 4) != 0) {
            account = marginSectionState.account;
        }
        if ((i & 8) != 0) {
            z = marginSectionState.isOptionsSupported;
        }
        if ((i & 16) != 0) {
            supported = marginSectionState.countryCode;
        }
        if ((i & 32) != 0) {
            marginEligibilityViewModel = marginSectionState.marginEligibilityViewModel;
        }
        CountryCode.Supported supported2 = supported;
        MarginEligibilityViewModel marginEligibilityViewModel2 = marginEligibilityViewModel;
        return marginSectionState.copy(apiMarginInvestingInfo, marginSettings, account, z, supported2, marginEligibilityViewModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsOptionsSupported() {
        return this.isOptionsSupported;
    }

    /* renamed from: component5, reason: from getter */
    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final MarginEligibilityViewModel getMarginEligibilityViewModel() {
        return this.marginEligibilityViewModel;
    }

    public final MarginSectionState copy(ApiMarginInvestingInfo marginInvestingInfo, MarginSettings marginSettings, Account account, boolean isOptionsSupported, CountryCode.Supported countryCode, MarginEligibilityViewModel marginEligibilityViewModel) {
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new MarginSectionState(marginInvestingInfo, marginSettings, account, isOptionsSupported, countryCode, marginEligibilityViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginSectionState)) {
            return false;
        }
        MarginSectionState marginSectionState = (MarginSectionState) other;
        return Intrinsics.areEqual(this.marginInvestingInfo, marginSectionState.marginInvestingInfo) && Intrinsics.areEqual(this.marginSettings, marginSectionState.marginSettings) && Intrinsics.areEqual(this.account, marginSectionState.account) && this.isOptionsSupported == marginSectionState.isOptionsSupported && Intrinsics.areEqual(this.countryCode, marginSectionState.countryCode) && Intrinsics.areEqual(this.marginEligibilityViewModel, marginSectionState.marginEligibilityViewModel);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.marginInvestingInfo.hashCode() * 31) + this.marginSettings.hashCode()) * 31) + this.account.hashCode()) * 31) + Boolean.hashCode(this.isOptionsSupported)) * 31) + this.countryCode.hashCode()) * 31;
        MarginEligibilityViewModel marginEligibilityViewModel = this.marginEligibilityViewModel;
        return iHashCode + (marginEligibilityViewModel == null ? 0 : marginEligibilityViewModel.hashCode());
    }

    public String toString() {
        return "MarginSectionState(marginInvestingInfo=" + this.marginInvestingInfo + ", marginSettings=" + this.marginSettings + ", account=" + this.account + ", isOptionsSupported=" + this.isOptionsSupported + ", countryCode=" + this.countryCode + ", marginEligibilityViewModel=" + this.marginEligibilityViewModel + ")";
    }

    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isOptionsSupported() {
        return this.isOptionsSupported;
    }

    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final MarginEligibilityViewModel getMarginEligibilityViewModel() {
        return this.marginEligibilityViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSectionState(ApiMarginInvestingInfo marginInvestingInfo, MarginSettings marginSettings, Account account, boolean z, CountryCode.Supported countryCode, MarginEligibilityViewModel marginEligibilityViewModel) {
        super(CardOrder.CardIdentifier.MARGIN, null);
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        Intrinsics.checkNotNullParameter(marginSettings, "marginSettings");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.marginInvestingInfo = marginInvestingInfo;
        this.marginSettings = marginSettings;
        this.account = account;
        this.isOptionsSupported = z;
        this.countryCode = countryCode;
        this.marginEligibilityViewModel = marginEligibilityViewModel;
    }

    public final boolean isMarginInvestingEnabled() {
        return this.marginSettings.isMarginInvestingEnabled();
    }

    public final boolean getShouldHideEnableMarginCta() {
        return this.account.getType() == AccountType.CASH;
    }

    /* compiled from: AccountOverviewMarginCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/MarginSectionState$Summary;", "", "<init>", "()V", "PlainText", "Markdown", "Lcom/robinhood/android/account/ui/MarginSectionState$Summary$Markdown;", "Lcom/robinhood/android/account/ui/MarginSectionState$Summary$PlainText;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Summary {
        public static final int $stable = 0;

        public /* synthetic */ Summary(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Summary() {
        }

        /* compiled from: AccountOverviewMarginCard.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/account/ui/MarginSectionState$Summary$PlainText;", "Lcom/robinhood/android/account/ui/MarginSectionState$Summary;", "textRes", "", "shouldShowLearnMore", "", "<init>", "(IZ)V", "getTextRes", "()I", "getShouldShowLearnMore", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlainText extends Summary {
            public static final int $stable = 0;
            private final boolean shouldShowLearnMore;
            private final int textRes;

            public static /* synthetic */ PlainText copy$default(PlainText plainText, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = plainText.textRes;
                }
                if ((i2 & 2) != 0) {
                    z = plainText.shouldShowLearnMore;
                }
                return plainText.copy(i, z);
            }

            /* renamed from: component1, reason: from getter */
            public final int getTextRes() {
                return this.textRes;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShouldShowLearnMore() {
                return this.shouldShowLearnMore;
            }

            public final PlainText copy(int textRes, boolean shouldShowLearnMore) {
                return new PlainText(textRes, shouldShowLearnMore);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlainText)) {
                    return false;
                }
                PlainText plainText = (PlainText) other;
                return this.textRes == plainText.textRes && this.shouldShowLearnMore == plainText.shouldShowLearnMore;
            }

            public int hashCode() {
                return (Integer.hashCode(this.textRes) * 31) + Boolean.hashCode(this.shouldShowLearnMore);
            }

            public String toString() {
                return "PlainText(textRes=" + this.textRes + ", shouldShowLearnMore=" + this.shouldShowLearnMore + ")";
            }

            public final int getTextRes() {
                return this.textRes;
            }

            public final boolean getShouldShowLearnMore() {
                return this.shouldShowLearnMore;
            }

            public PlainText(int i, boolean z) {
                super(null);
                this.textRes = i;
                this.shouldShowLearnMore = z;
            }
        }

        /* compiled from: AccountOverviewMarginCard.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/ui/MarginSectionState$Summary$Markdown;", "Lcom/robinhood/android/account/ui/MarginSectionState$Summary;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Markdown extends Summary {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ Markdown copy$default(Markdown markdown, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = markdown.text;
                }
                return markdown.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Markdown copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Markdown(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Markdown) && Intrinsics.areEqual(this.text, ((Markdown) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Markdown(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Markdown(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }
    }

    /* compiled from: AccountOverviewMarginCard.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/account/ui/MarginSectionState$Rows;", "", "marginUsed", "", MarginCall.TYPE_MAINTENANCE, "optionsCollateral", "dayTradeLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMarginUsed", "()Ljava/lang/String;", "getMaintenance", "getOptionsCollateral", "getDayTradeLimit", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Rows {
        public static final int $stable = 0;
        private final String dayTradeLimit;
        private final String maintenance;
        private final String marginUsed;
        private final String optionsCollateral;

        public static /* synthetic */ Rows copy$default(Rows rows, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rows.marginUsed;
            }
            if ((i & 2) != 0) {
                str2 = rows.maintenance;
            }
            if ((i & 4) != 0) {
                str3 = rows.optionsCollateral;
            }
            if ((i & 8) != 0) {
                str4 = rows.dayTradeLimit;
            }
            return rows.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMarginUsed() {
            return this.marginUsed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMaintenance() {
            return this.maintenance;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOptionsCollateral() {
            return this.optionsCollateral;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDayTradeLimit() {
            return this.dayTradeLimit;
        }

        public final Rows copy(String marginUsed, String maintenance, String optionsCollateral, String dayTradeLimit) {
            Intrinsics.checkNotNullParameter(marginUsed, "marginUsed");
            Intrinsics.checkNotNullParameter(maintenance, "maintenance");
            Intrinsics.checkNotNullParameter(dayTradeLimit, "dayTradeLimit");
            return new Rows(marginUsed, maintenance, optionsCollateral, dayTradeLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rows)) {
                return false;
            }
            Rows rows = (Rows) other;
            return Intrinsics.areEqual(this.marginUsed, rows.marginUsed) && Intrinsics.areEqual(this.maintenance, rows.maintenance) && Intrinsics.areEqual(this.optionsCollateral, rows.optionsCollateral) && Intrinsics.areEqual(this.dayTradeLimit, rows.dayTradeLimit);
        }

        public int hashCode() {
            int iHashCode = ((this.marginUsed.hashCode() * 31) + this.maintenance.hashCode()) * 31;
            String str = this.optionsCollateral;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dayTradeLimit.hashCode();
        }

        public String toString() {
            return "Rows(marginUsed=" + this.marginUsed + ", maintenance=" + this.maintenance + ", optionsCollateral=" + this.optionsCollateral + ", dayTradeLimit=" + this.dayTradeLimit + ")";
        }

        public Rows(String marginUsed, String maintenance, String str, String dayTradeLimit) {
            Intrinsics.checkNotNullParameter(marginUsed, "marginUsed");
            Intrinsics.checkNotNullParameter(maintenance, "maintenance");
            Intrinsics.checkNotNullParameter(dayTradeLimit, "dayTradeLimit");
            this.marginUsed = marginUsed;
            this.maintenance = maintenance;
            this.optionsCollateral = str;
            this.dayTradeLimit = dayTradeLimit;
        }

        public final String getMarginUsed() {
            return this.marginUsed;
        }

        public final String getMaintenance() {
            return this.maintenance;
        }

        public final String getOptionsCollateral() {
            return this.optionsCollateral;
        }

        public final String getDayTradeLimit() {
            return this.dayTradeLimit;
        }
    }

    /* renamed from: getIneligibilityContentMarkdown$feature_account_overview_externalRelease */
    public final String m1703xadce013f() {
        MarginEligibilityViewModel marginEligibilityViewModel = this.marginEligibilityViewModel;
        if (marginEligibilityViewModel != null) {
            String ineligibilityContentMarkdown = marginEligibilityViewModel.getIneligibilityContentMarkdown();
            if (this.account.getType() == AccountType.CASH && !marginEligibilityViewModel.isEligibleForMargin()) {
                return ineligibilityContentMarkdown;
            }
        }
        return null;
    }

    public final StringResource getValueText() {
        MarginEligibilityViewModel marginEligibilityViewModel = this.marginEligibilityViewModel;
        String ineligibilityTitle = marginEligibilityViewModel != null ? marginEligibilityViewModel.getIneligibilityTitle() : null;
        if (ineligibilityTitle != null) {
            return StringResource.INSTANCE.invoke(ineligibilityTitle);
        }
        return isMarginInvestingEnabled() ? StringResource.INSTANCE.invoke(C8159R.string.account_overview_margin_section_enabled_label, new Object[0]) : StringResource.INSTANCE.invoke(C8159R.string.account_overview_margin_section_disabled_label, new Object[0]);
    }

    public final Summary getSummary$feature_account_overview_externalRelease() {
        int i;
        String strM1703xadce013f = m1703xadce013f();
        if (strM1703xadce013f != null) {
            return new Summary.Markdown(strM1703xadce013f);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.account.getType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual(this.countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C8159R.string.f3882xce7529d5;
            } else {
                i = C8159R.string.f3881xe5e8cd60;
            }
        } else if (isMarginInvestingEnabled()) {
            if (Intrinsics.areEqual(this.countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C8159R.string.account_overview_margin_section_enabled_description_uk;
            } else {
                i = C8159R.string.account_overview_margin_section_enabled_description;
            }
        } else if (Intrinsics.areEqual(this.countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            i = C8159R.string.f3884x48d9e90;
        } else {
            i = C8159R.string.f3883xb6bc0a85;
        }
        return new Summary.PlainText(i, isMarginInvestingEnabled());
    }

    public final int getCtaTextRes() {
        if (isMarginInvestingEnabled()) {
            return C8159R.string.account_overview_margin_section_margin_settings_cta;
        }
        return C8159R.string.account_overview_margin_section_enable_margin_cta;
    }

    public final Rows getRows$feature_account_overview_externalRelease() {
        String str = Money.format$default(this.marginInvestingInfo.getAmountBorrowed(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String str2 = Money.format$default(this.marginInvestingInfo.getMarginMaintenance(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        String str3 = Money.format$default(this.marginInvestingInfo.getOptionsCollateral(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (!this.isOptionsSupported) {
            str3 = null;
        }
        Rows rows = new Rows(str, str2, str3, Money.format$default(this.marginInvestingInfo.getTodaysDayTradeLimit(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        if (isMarginInvestingEnabled()) {
            return rows;
        }
        return null;
    }
}
