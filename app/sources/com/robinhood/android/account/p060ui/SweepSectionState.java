package com.robinhood.android.account.p060ui;

import android.content.res.Resources;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewSweepEnrollmentCard.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003BCDB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010/\u001a\u00020&2\u0006\u00100\u001a\u000201J\u0017\u00102\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b4J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003JE\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010<\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0011\u0010-\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b.\u0010(¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/account/ui/SweepSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "account", "Lcom/robinhood/models/db/Account;", "enrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "interestEarningDisclosure", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "isInLeveredMarginRegionGate", "", "isMcwEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/iso/countrycode/CountryCode$Supported;ZZ)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getEnrollmentData", "()Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "getInterestEarningDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "()Z", "state", "Lcom/robinhood/android/account/ui/SweepSectionState$SweepState;", "getState$feature_account_overview_externalRelease", "()Lcom/robinhood/android/account/ui/SweepSectionState$SweepState;", "isPausedDueToPdt", "mainText", "Lcom/robinhood/android/account/ui/SweepSectionState$MainText;", "getMainText$feature_account_overview_externalRelease", "()Lcom/robinhood/android/account/ui/SweepSectionState$MainText;", "totalInterestEarned", "Lcom/robinhood/models/util/Money;", "getTotalInterestEarned", "()Lcom/robinhood/models/util/Money;", "formattedApy", "", "getFormattedApy", "()Ljava/lang/String;", "formattedMaxApy", "getFormattedMaxApy", "showTotalInterestEarnedRow", "getShowTotalInterestEarnedRow", "totalInterestEarnedMetaText", "getTotalInterestEarnedMetaText", "getDetailText", "resources", "Landroid/content/res/Resources;", "getRowsState", "Lcom/robinhood/android/account/ui/SweepSectionState$RowsState;", "getRowsState$feature_account_overview_externalRelease", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "SweepState", "MainText", "RowsState", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class SweepSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final Account account;
    private final CountryCode.Supported countryCode;
    private final SweepEnrollmentData enrollmentData;
    private final Disclosure interestEarningDisclosure;
    private final boolean isInLeveredMarginRegionGate;
    private final boolean isMcwEnabled;
    private final boolean isPausedDueToPdt;

    /* compiled from: AccountOverviewSweepEnrollmentCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SweepState.values().length];
            try {
                iArr[SweepState.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SweepState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SweepState.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ SweepSectionState copy$default(SweepSectionState sweepSectionState, Account account, SweepEnrollmentData sweepEnrollmentData, Disclosure disclosure, CountryCode.Supported supported, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            account = sweepSectionState.account;
        }
        if ((i & 2) != 0) {
            sweepEnrollmentData = sweepSectionState.enrollmentData;
        }
        if ((i & 4) != 0) {
            disclosure = sweepSectionState.interestEarningDisclosure;
        }
        if ((i & 8) != 0) {
            supported = sweepSectionState.countryCode;
        }
        if ((i & 16) != 0) {
            z = sweepSectionState.isInLeveredMarginRegionGate;
        }
        if ((i & 32) != 0) {
            z2 = sweepSectionState.isMcwEnabled;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return sweepSectionState.copy(account, sweepEnrollmentData, disclosure, supported, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final SweepEnrollmentData getEnrollmentData() {
        return this.enrollmentData;
    }

    /* renamed from: component3, reason: from getter */
    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    /* renamed from: component4, reason: from getter */
    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInLeveredMarginRegionGate() {
        return this.isInLeveredMarginRegionGate;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsMcwEnabled() {
        return this.isMcwEnabled;
    }

    public final SweepSectionState copy(Account account, SweepEnrollmentData enrollmentData, Disclosure interestEarningDisclosure, CountryCode.Supported countryCode, boolean isInLeveredMarginRegionGate, boolean isMcwEnabled) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(enrollmentData, "enrollmentData");
        Intrinsics.checkNotNullParameter(interestEarningDisclosure, "interestEarningDisclosure");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new SweepSectionState(account, enrollmentData, interestEarningDisclosure, countryCode, isInLeveredMarginRegionGate, isMcwEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepSectionState)) {
            return false;
        }
        SweepSectionState sweepSectionState = (SweepSectionState) other;
        return Intrinsics.areEqual(this.account, sweepSectionState.account) && Intrinsics.areEqual(this.enrollmentData, sweepSectionState.enrollmentData) && Intrinsics.areEqual(this.interestEarningDisclosure, sweepSectionState.interestEarningDisclosure) && Intrinsics.areEqual(this.countryCode, sweepSectionState.countryCode) && this.isInLeveredMarginRegionGate == sweepSectionState.isInLeveredMarginRegionGate && this.isMcwEnabled == sweepSectionState.isMcwEnabled;
    }

    public int hashCode() {
        return (((((((((this.account.hashCode() * 31) + this.enrollmentData.hashCode()) * 31) + this.interestEarningDisclosure.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + Boolean.hashCode(this.isInLeveredMarginRegionGate)) * 31) + Boolean.hashCode(this.isMcwEnabled);
    }

    public String toString() {
        return "SweepSectionState(account=" + this.account + ", enrollmentData=" + this.enrollmentData + ", interestEarningDisclosure=" + this.interestEarningDisclosure + ", countryCode=" + this.countryCode + ", isInLeveredMarginRegionGate=" + this.isInLeveredMarginRegionGate + ", isMcwEnabled=" + this.isMcwEnabled + ")";
    }

    public final Account getAccount() {
        return this.account;
    }

    public final SweepEnrollmentData getEnrollmentData() {
        return this.enrollmentData;
    }

    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    public final CountryCode.Supported getCountryCode() {
        return this.countryCode;
    }

    public final boolean isInLeveredMarginRegionGate() {
        return this.isInLeveredMarginRegionGate;
    }

    public final boolean isMcwEnabled() {
        return this.isMcwEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SweepSectionState(Account account, SweepEnrollmentData enrollmentData, Disclosure interestEarningDisclosure, CountryCode.Supported countryCode, boolean z, boolean z2) {
        super(CardOrder.CardIdentifier.SWEEP, null);
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(enrollmentData, "enrollmentData");
        Intrinsics.checkNotNullParameter(interestEarningDisclosure, "interestEarningDisclosure");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.account = account;
        this.enrollmentData = enrollmentData;
        this.interestEarningDisclosure = interestEarningDisclosure;
        this.countryCode = countryCode;
        this.isInLeveredMarginRegionGate = z;
        this.isMcwEnabled = z2;
        this.isPausedDueToPdt = getState$feature_account_overview_externalRelease() == SweepState.PAUSED && enrollmentData.getSweepTimelineSummary().getInterestPausedReason() == ApiSweepsTimelineSummary.PausedReason.PDT;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountOverviewSweepEnrollmentCard.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/account/ui/SweepSectionState$SweepState;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "PAUSED", "ENABLED", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SweepState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SweepState[] $VALUES;
        public static final SweepState DISABLED = new SweepState("DISABLED", 0);
        public static final SweepState PAUSED = new SweepState("PAUSED", 1);
        public static final SweepState ENABLED = new SweepState("ENABLED", 2);

        private static final /* synthetic */ SweepState[] $values() {
            return new SweepState[]{DISABLED, PAUSED, ENABLED};
        }

        public static EnumEntries<SweepState> getEntries() {
            return $ENTRIES;
        }

        private SweepState(String str, int i) {
        }

        static {
            SweepState[] sweepStateArr$values = $values();
            $VALUES = sweepStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sweepStateArr$values);
        }

        public static SweepState valueOf(String str) {
            return (SweepState) Enum.valueOf(SweepState.class, str);
        }

        public static SweepState[] values() {
            return (SweepState[]) $VALUES.clone();
        }
    }

    /* compiled from: AccountOverviewSweepEnrollmentCard.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/account/ui/SweepSectionState$MainText;", "", "res", "", "drawableEndRes", "Lcom/robinhood/compose/bento/component/BentoIcons;", "clickable", "", "enrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "isInLeveredMarginRegionGate", "<init>", "(ILcom/robinhood/compose/bento/component/BentoIcons;ZLcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;Z)V", "getRes", "()I", "getDrawableEndRes", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getClickable", "()Z", "getEnrollmentData", "()Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MainText {
        public static final int $stable = 8;
        private final boolean clickable;
        private final BentoIcon4 drawableEndRes;
        private final SweepEnrollmentData enrollmentData;
        private final boolean isInLeveredMarginRegionGate;
        private final int res;

        public static /* synthetic */ MainText copy$default(MainText mainText, int i, BentoIcon4 bentoIcon4, boolean z, SweepEnrollmentData sweepEnrollmentData, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = mainText.res;
            }
            if ((i2 & 2) != 0) {
                bentoIcon4 = mainText.drawableEndRes;
            }
            if ((i2 & 4) != 0) {
                z = mainText.clickable;
            }
            if ((i2 & 8) != 0) {
                sweepEnrollmentData = mainText.enrollmentData;
            }
            if ((i2 & 16) != 0) {
                z2 = mainText.isInLeveredMarginRegionGate;
            }
            boolean z3 = z2;
            boolean z4 = z;
            return mainText.copy(i, bentoIcon4, z4, sweepEnrollmentData, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRes() {
            return this.res;
        }

        /* renamed from: component2, reason: from getter */
        public final BentoIcon4 getDrawableEndRes() {
            return this.drawableEndRes;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getClickable() {
            return this.clickable;
        }

        /* renamed from: component4, reason: from getter */
        public final SweepEnrollmentData getEnrollmentData() {
            return this.enrollmentData;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsInLeveredMarginRegionGate() {
            return this.isInLeveredMarginRegionGate;
        }

        public final MainText copy(int res, BentoIcon4 drawableEndRes, boolean clickable, SweepEnrollmentData enrollmentData, boolean isInLeveredMarginRegionGate) {
            Intrinsics.checkNotNullParameter(enrollmentData, "enrollmentData");
            return new MainText(res, drawableEndRes, clickable, enrollmentData, isInLeveredMarginRegionGate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainText)) {
                return false;
            }
            MainText mainText = (MainText) other;
            return this.res == mainText.res && Intrinsics.areEqual(this.drawableEndRes, mainText.drawableEndRes) && this.clickable == mainText.clickable && Intrinsics.areEqual(this.enrollmentData, mainText.enrollmentData) && this.isInLeveredMarginRegionGate == mainText.isInLeveredMarginRegionGate;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.res) * 31;
            BentoIcon4 bentoIcon4 = this.drawableEndRes;
            return ((((((iHashCode + (bentoIcon4 == null ? 0 : bentoIcon4.hashCode())) * 31) + Boolean.hashCode(this.clickable)) * 31) + this.enrollmentData.hashCode()) * 31) + Boolean.hashCode(this.isInLeveredMarginRegionGate);
        }

        public String toString() {
            return "MainText(res=" + this.res + ", drawableEndRes=" + this.drawableEndRes + ", clickable=" + this.clickable + ", enrollmentData=" + this.enrollmentData + ", isInLeveredMarginRegionGate=" + this.isInLeveredMarginRegionGate + ")";
        }

        public MainText(int i, BentoIcon4 bentoIcon4, boolean z, SweepEnrollmentData enrollmentData, boolean z2) {
            Intrinsics.checkNotNullParameter(enrollmentData, "enrollmentData");
            this.res = i;
            this.drawableEndRes = bentoIcon4;
            this.clickable = z;
            this.enrollmentData = enrollmentData;
            this.isInLeveredMarginRegionGate = z2;
        }

        public final int getRes() {
            return this.res;
        }

        public final BentoIcon4 getDrawableEndRes() {
            return this.drawableEndRes;
        }

        public final boolean getClickable() {
            return this.clickable;
        }

        public final SweepEnrollmentData getEnrollmentData() {
            return this.enrollmentData;
        }

        public final boolean isInLeveredMarginRegionGate() {
            return this.isInLeveredMarginRegionGate;
        }
    }

    /* compiled from: AccountOverviewSweepEnrollmentCard.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/account/ui/SweepSectionState$RowsState;", "", "apyText", "", "sweptCashText", "pendingInterestText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApyText", "()Ljava/lang/String;", "getSweptCashText", "getPendingInterestText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowsState {
        public static final int $stable = 0;
        private final String apyText;
        private final String pendingInterestText;
        private final String sweptCashText;

        public static /* synthetic */ RowsState copy$default(RowsState rowsState, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rowsState.apyText;
            }
            if ((i & 2) != 0) {
                str2 = rowsState.sweptCashText;
            }
            if ((i & 4) != 0) {
                str3 = rowsState.pendingInterestText;
            }
            return rowsState.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApyText() {
            return this.apyText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSweptCashText() {
            return this.sweptCashText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPendingInterestText() {
            return this.pendingInterestText;
        }

        public final RowsState copy(String apyText, String sweptCashText, String pendingInterestText) {
            Intrinsics.checkNotNullParameter(apyText, "apyText");
            Intrinsics.checkNotNullParameter(sweptCashText, "sweptCashText");
            Intrinsics.checkNotNullParameter(pendingInterestText, "pendingInterestText");
            return new RowsState(apyText, sweptCashText, pendingInterestText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowsState)) {
                return false;
            }
            RowsState rowsState = (RowsState) other;
            return Intrinsics.areEqual(this.apyText, rowsState.apyText) && Intrinsics.areEqual(this.sweptCashText, rowsState.sweptCashText) && Intrinsics.areEqual(this.pendingInterestText, rowsState.pendingInterestText);
        }

        public int hashCode() {
            return (((this.apyText.hashCode() * 31) + this.sweptCashText.hashCode()) * 31) + this.pendingInterestText.hashCode();
        }

        public String toString() {
            return "RowsState(apyText=" + this.apyText + ", sweptCashText=" + this.sweptCashText + ", pendingInterestText=" + this.pendingInterestText + ")";
        }

        public RowsState(String apyText, String sweptCashText, String pendingInterestText) {
            Intrinsics.checkNotNullParameter(apyText, "apyText");
            Intrinsics.checkNotNullParameter(sweptCashText, "sweptCashText");
            Intrinsics.checkNotNullParameter(pendingInterestText, "pendingInterestText");
            this.apyText = apyText;
            this.sweptCashText = sweptCashText;
            this.pendingInterestText = pendingInterestText;
        }

        public final String getApyText() {
            return this.apyText;
        }

        public final String getSweptCashText() {
            return this.sweptCashText;
        }

        public final String getPendingInterestText() {
            return this.pendingInterestText;
        }
    }

    public final SweepState getState$feature_account_overview_externalRelease() {
        return this.enrollmentData.getSweepTimelineSummary().getInterestPausedReason() != null ? SweepState.PAUSED : this.enrollmentData.isSweepEnrolled() ? SweepState.ENABLED : SweepState.DISABLED;
    }

    /* renamed from: isPausedDueToPdt, reason: from getter */
    public final boolean getIsPausedDueToPdt() {
        return this.isPausedDueToPdt;
    }

    public final MainText getMainText$feature_account_overview_externalRelease() {
        int i;
        BentoIcon4.Size16 size16;
        SweepState state$feature_account_overview_externalRelease = getState$feature_account_overview_externalRelease();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[state$feature_account_overview_externalRelease.ordinal()];
        if (i2 == 1) {
            i = C11048R.string.general_label_disabled;
        } else if (i2 == 2) {
            i = C11048R.string.general_label_paused;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C8159R.string.account_overview_cash_sweep_enabled;
        }
        int i3 = iArr[getState$feature_account_overview_externalRelease().ordinal()];
        if (i3 == 1) {
            size16 = null;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            size16 = null;
        } else {
            size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16);
        }
        return new MainText(i, size16, getState$feature_account_overview_externalRelease() == SweepState.PAUSED, this.enrollmentData, this.isInLeveredMarginRegionGate);
    }

    private final Money getTotalInterestEarned() {
        return this.enrollmentData.getSweepTimelineSummary().getTotalPaidInterest();
    }

    private final String getFormattedApy() {
        return Formats.getInterestRateFormatShort().format(this.enrollmentData.getSweepInterest().getInterestRate());
    }

    private final String getFormattedMaxApy() {
        BigDecimal interestRate;
        NumberFormatter interestRateFormatShort = Formats.getInterestRateFormatShort();
        if (this.enrollmentData.getSweepInterest().getGoldInterestRate() != null) {
            interestRate = this.enrollmentData.getSweepInterest().getGoldInterestRate();
            Intrinsics.checkNotNull(interestRate);
        } else {
            interestRate = this.enrollmentData.getSweepInterest().getInterestRate();
        }
        return interestRateFormatShort.format(interestRate);
    }

    public final boolean getShowTotalInterestEarnedRow() {
        int i = WhenMappings.$EnumSwitchMapping$0[getState$feature_account_overview_externalRelease().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (getTotalInterestEarned().getDecimalValue().compareTo(BigDecimal.ZERO) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final String getTotalInterestEarnedMetaText() {
        return Money.format$default(getTotalInterestEarned(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getDetailText(Resources resources) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i3 = WhenMappings.$EnumSwitchMapping$0[getState$feature_account_overview_externalRelease().ordinal()];
        if (i3 == 1) {
            if (this.isMcwEnabled) {
                i = C8159R.string.mcw_account_overview_sweep_enrollment_disabled_desc;
            } else {
                i = C8159R.string.account_overview_sweep_enrollment_disabled_desc;
            }
            String string2 = resources.getString(i, getFormattedMaxApy(), AccountDisplayNames.getDisplayName(this.account).getShort().getInSentence().getText(resources));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.isMcwEnabled) {
                i2 = C8159R.string.mcw_account_overview_cash_sweep_enabled_desc;
            } else {
                i2 = C8159R.string.account_overview_cash_sweep_enabled_desc;
            }
            String string3 = resources.getString(i2, AccountDisplayNames.getDisplayName(this.account).getShort().getInSentence().getText(resources), LocalDateFormatter.MEDIUM_NO_YEAR.format(this.enrollmentData.getSweepTimelineSummary().getNextInterestPayment().getDate()));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (this.isPausedDueToPdt) {
            String string4 = resources.getString(C8159R.string.account_overview_cash_sweep_paused_pdt_desc, AccountDisplayNames.getDisplayName(this.account).getWithAccount().getTitle().getText(resources));
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (this.isMcwEnabled) {
            String string5 = resources.getString(C8159R.string.mcw_account_overview_cash_sweep_paused_desc, getFormattedApy());
            Intrinsics.checkNotNull(string5);
            return string5;
        }
        String string6 = resources.getString(C8159R.string.account_overview_cash_sweep_paused_desc, getFormattedApy());
        Intrinsics.checkNotNull(string6);
        return string6;
    }

    public final RowsState getRowsState$feature_account_overview_externalRelease(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[getState$feature_account_overview_externalRelease().ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(C8159R.string.sweep_interest_apy, getFormattedApy());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = Money.format$default(this.enrollmentData.getSweepTimelineSummary().getSweepBalance(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        Money interestAccrued = this.enrollmentData.getSweepTimelineSummary().getInterestAccrued();
        if (interestAccrued == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            interestAccrued = Money3.toMoney(ZERO, Currencies.USD);
        }
        return new RowsState(string2, str, Money.format$default(interestAccrued, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }
}
