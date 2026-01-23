package com.robinhood.android.account.p060ui;

import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.margin.MarginEligibilityViewModel;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AccountTypeSectionState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J=\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0019HÖ\u0001J\t\u00100\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u000fR\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u000f¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountTypeSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "account", "Lcom/robinhood/models/db/Account;", "isRetirementAccount", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "accountTypeEligibilityViewModel", "Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "isMemberPdtRevampV1", "<init>", "(Lcom/robinhood/models/db/Account;ZLcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;Z)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "()Z", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getAccountTypeEligibilityViewModel", "()Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "ineligibilityContentMarkdown", "", "getIneligibilityContentMarkdown$feature_account_overview_externalRelease", "()Ljava/lang/String;", "titleTextRes", "", "getTitleTextRes", "()I", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary;", "getSummary", "()Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary;", "ctaTextRes", "getCtaTextRes", "disableCta", "getDisableCta", "showCta", "getShowCta", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "Summary", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountTypeSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final Account account;
    private final MarginEligibilityViewModel accountTypeEligibilityViewModel;
    private final boolean isMemberPdtRevampV1;
    private final boolean isRetirementAccount;
    private final CountryCode.Supported locality;

    /* compiled from: AccountTypeSectionState.kt */
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

    public static /* synthetic */ AccountTypeSectionState copy$default(AccountTypeSectionState accountTypeSectionState, Account account, boolean z, CountryCode.Supported supported, MarginEligibilityViewModel marginEligibilityViewModel, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            account = accountTypeSectionState.account;
        }
        if ((i & 2) != 0) {
            z = accountTypeSectionState.isRetirementAccount;
        }
        if ((i & 4) != 0) {
            supported = accountTypeSectionState.locality;
        }
        if ((i & 8) != 0) {
            marginEligibilityViewModel = accountTypeSectionState.accountTypeEligibilityViewModel;
        }
        if ((i & 16) != 0) {
            z2 = accountTypeSectionState.isMemberPdtRevampV1;
        }
        boolean z3 = z2;
        CountryCode.Supported supported2 = supported;
        return accountTypeSectionState.copy(account, z, supported2, marginEligibilityViewModel, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRetirementAccount() {
        return this.isRetirementAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    /* renamed from: component4, reason: from getter */
    public final MarginEligibilityViewModel getAccountTypeEligibilityViewModel() {
        return this.accountTypeEligibilityViewModel;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    public final AccountTypeSectionState copy(Account account, boolean isRetirementAccount, CountryCode.Supported locality, MarginEligibilityViewModel accountTypeEligibilityViewModel, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new AccountTypeSectionState(account, isRetirementAccount, locality, accountTypeEligibilityViewModel, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTypeSectionState)) {
            return false;
        }
        AccountTypeSectionState accountTypeSectionState = (AccountTypeSectionState) other;
        return Intrinsics.areEqual(this.account, accountTypeSectionState.account) && this.isRetirementAccount == accountTypeSectionState.isRetirementAccount && Intrinsics.areEqual(this.locality, accountTypeSectionState.locality) && Intrinsics.areEqual(this.accountTypeEligibilityViewModel, accountTypeSectionState.accountTypeEligibilityViewModel) && this.isMemberPdtRevampV1 == accountTypeSectionState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        int iHashCode = ((((this.account.hashCode() * 31) + Boolean.hashCode(this.isRetirementAccount)) * 31) + this.locality.hashCode()) * 31;
        MarginEligibilityViewModel marginEligibilityViewModel = this.accountTypeEligibilityViewModel;
        return ((iHashCode + (marginEligibilityViewModel == null ? 0 : marginEligibilityViewModel.hashCode())) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        return "AccountTypeSectionState(account=" + this.account + ", isRetirementAccount=" + this.isRetirementAccount + ", locality=" + this.locality + ", accountTypeEligibilityViewModel=" + this.accountTypeEligibilityViewModel + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isRetirementAccount() {
        return this.isRetirementAccount;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final MarginEligibilityViewModel getAccountTypeEligibilityViewModel() {
        return this.accountTypeEligibilityViewModel;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTypeSectionState(Account account, boolean z, CountryCode.Supported locality, MarginEligibilityViewModel marginEligibilityViewModel, boolean z2) {
        super(CardOrder.CardIdentifier.ACCOUNT_TYPE_CARD, null);
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.account = account;
        this.isRetirementAccount = z;
        this.locality = locality;
        this.accountTypeEligibilityViewModel = marginEligibilityViewModel;
        this.isMemberPdtRevampV1 = z2;
    }

    /* compiled from: AccountTypeSectionState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary;", "", "<init>", "()V", "PlainText", "Markdown", "Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary$Markdown;", "Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary$PlainText;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Summary {
        public static final int $stable = 0;

        public /* synthetic */ Summary(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Summary() {
        }

        /* compiled from: AccountTypeSectionState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary$PlainText;", "Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary;", "textRes", "", "learnMoreUrlRes", "<init>", "(II)V", "getTextRes", "()I", "getLearnMoreUrlRes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlainText extends Summary {
            public static final int $stable = 0;
            private final int learnMoreUrlRes;
            private final int textRes;

            public static /* synthetic */ PlainText copy$default(PlainText plainText, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = plainText.textRes;
                }
                if ((i3 & 2) != 0) {
                    i2 = plainText.learnMoreUrlRes;
                }
                return plainText.copy(i, i2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getTextRes() {
                return this.textRes;
            }

            /* renamed from: component2, reason: from getter */
            public final int getLearnMoreUrlRes() {
                return this.learnMoreUrlRes;
            }

            public final PlainText copy(int textRes, int learnMoreUrlRes) {
                return new PlainText(textRes, learnMoreUrlRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlainText)) {
                    return false;
                }
                PlainText plainText = (PlainText) other;
                return this.textRes == plainText.textRes && this.learnMoreUrlRes == plainText.learnMoreUrlRes;
            }

            public int hashCode() {
                return (Integer.hashCode(this.textRes) * 31) + Integer.hashCode(this.learnMoreUrlRes);
            }

            public String toString() {
                return "PlainText(textRes=" + this.textRes + ", learnMoreUrlRes=" + this.learnMoreUrlRes + ")";
            }

            public final int getTextRes() {
                return this.textRes;
            }

            public final int getLearnMoreUrlRes() {
                return this.learnMoreUrlRes;
            }

            public PlainText(int i, int i2) {
                super(null);
                this.textRes = i;
                this.learnMoreUrlRes = i2;
            }
        }

        /* compiled from: AccountTypeSectionState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary$Markdown;", "Lcom/robinhood/android/account/ui/AccountTypeSectionState$Summary;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* renamed from: getIneligibilityContentMarkdown$feature_account_overview_externalRelease */
    public final String m1702xadce013f() {
        MarginEligibilityViewModel marginEligibilityViewModel = this.accountTypeEligibilityViewModel;
        if (marginEligibilityViewModel != null) {
            String ineligibilityContentMarkdown = marginEligibilityViewModel.getIneligibilityContentMarkdown();
            if (this.account.getType() == AccountType.CASH && !marginEligibilityViewModel.isEligibleForMargin()) {
                return ineligibilityContentMarkdown;
            }
        }
        return null;
    }

    public final int getTitleTextRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.account.getType().ordinal()];
        if (i == 1) {
            if (this.isRetirementAccount) {
                return C8159R.string.account_type_section_limited_margin_label;
            }
            return C8159R.string.account_type_section_margin_account_label;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(this.locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return C8159R.string.account_type_section_cash_account_label_uk;
        }
        return C8159R.string.account_type_section_cash_account_label;
    }

    public final Summary getSummary() {
        int i;
        int i2;
        String strM1702xadce013f = m1702xadce013f();
        if (strM1702xadce013f != null) {
            return new Summary.Markdown(strM1702xadce013f);
        }
        if (Intrinsics.areEqual(this.locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            i = C8159R.string.account_type_section_summary_uk;
        } else if (this.isMemberPdtRevampV1) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.account.getType().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.isRetirementAccount) {
                    i = C8159R.string.account_type_section_cash_retirement_account_summary_without_pdt;
                } else {
                    i = C8159R.string.account_type_section_cash_account_summary_without_pdt;
                }
            } else if (this.isRetirementAccount) {
                i = C8159R.string.account_type_section_limited_margin_account_summary_without_pdt;
            } else {
                i = C8159R.string.account_type_section_margin_account_summary_without_pdt;
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[this.account.getType().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.isRetirementAccount) {
                    i = C8159R.string.account_type_section_cash_retirement_account_summary;
                } else {
                    i = C8159R.string.account_type_section_cash_account_summary;
                }
            } else if (this.isRetirementAccount) {
                i = C8159R.string.account_type_section_limited_margin_account_summary;
            } else {
                i = C8159R.string.account_type_section_margin_account_summary;
            }
        }
        if (this.isRetirementAccount) {
            i2 = C8159R.string.account_type_section_retirement_account_learn_more_url;
        } else {
            i2 = C8159R.string.account_type_section_learn_more_url;
        }
        return new Summary.PlainText(i, i2);
    }

    public final int getCtaTextRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.account.getType().ordinal()];
        if (i == 1) {
            if (Intrinsics.areEqual(this.locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                return C8159R.string.account_type_section_switch_to_cash_account_cta_uk;
            }
            return C8159R.string.account_type_section_switch_to_cash_account_cta;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.isRetirementAccount) {
            return C8159R.string.account_type_section_switch_to_limited_margin_account_cta;
        }
        return C8159R.string.account_type_section_switch_to_margin_account_cta;
    }

    public final boolean getDisableCta() {
        MarginEligibilityViewModel marginEligibilityViewModel;
        return (this.account.getType() != AccountType.CASH || (marginEligibilityViewModel = this.accountTypeEligibilityViewModel) == null || marginEligibilityViewModel.isEligibleForMargin()) ? false : true;
    }

    public final boolean getShowCta() {
        return !(this.accountTypeEligibilityViewModel != null ? Intrinsics.areEqual(r0.getHideSwitchToMarginCta(), Boolean.TRUE) : false);
    }
}
