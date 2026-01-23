package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.C11131R;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState;", "", "confirmationType", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$ConfirmationType;", "memberSypPostDd", "", "sweepInterestRate", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$ConfirmationType;ZLjava/math/BigDecimal;)V", "getConfirmationType", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$ConfirmationType;", "getMemberSypPostDd", "()Z", "getSweepInterestRate", "()Ljava/math/BigDecimal;", "secondaryActionText", "Lcom/robinhood/utils/resource/StringResource;", "getSecondaryActionText", "()Lcom/robinhood/utils/resource/StringResource;", "description", "getDescription", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConfirmationType", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState {
    private final ConfirmationType confirmationType;
    private final boolean memberSypPostDd;
    private final BigDecimal sweepInterestRate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState copy$default(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState, ConfirmationType confirmationType, boolean z, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            confirmationType = paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.confirmationType;
        }
        if ((i & 2) != 0) {
            z = paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.memberSypPostDd;
        }
        if ((i & 4) != 0) {
            bigDecimal = paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.sweepInterestRate;
        }
        return paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.copy(confirmationType, z, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final ConfirmationType getConfirmationType() {
        return this.confirmationType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMemberSypPostDd() {
        return this.memberSypPostDd;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getSweepInterestRate() {
        return this.sweepInterestRate;
    }

    public final PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState copy(ConfirmationType confirmationType, boolean memberSypPostDd, BigDecimal sweepInterestRate) {
        Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
        return new PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState(confirmationType, memberSypPostDd, sweepInterestRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState)) {
            return false;
        }
        PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState = (PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState) other;
        return this.confirmationType == paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.confirmationType && this.memberSypPostDd == paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.memberSypPostDd && Intrinsics.areEqual(this.sweepInterestRate, paycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.sweepInterestRate);
    }

    public int hashCode() {
        int iHashCode = ((this.confirmationType.hashCode() * 31) + Boolean.hashCode(this.memberSypPostDd)) * 31;
        BigDecimal bigDecimal = this.sweepInterestRate;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState(confirmationType=" + this.confirmationType + ", memberSypPostDd=" + this.memberSypPostDd + ", sweepInterestRate=" + this.sweepInterestRate + ")";
    }

    public PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState(ConfirmationType confirmationType, boolean z, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
        this.confirmationType = confirmationType;
        this.memberSypPostDd = z;
        this.sweepInterestRate = bigDecimal;
    }

    public /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState(ConfirmationType confirmationType, boolean z, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(confirmationType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bigDecimal);
    }

    public final ConfirmationType getConfirmationType() {
        return this.confirmationType;
    }

    public final boolean getMemberSypPostDd() {
        return this.memberSypPostDd;
    }

    public final BigDecimal getSweepInterestRate() {
        return this.sweepInterestRate;
    }

    public final StringResource getSecondaryActionText() {
        if (this.memberSypPostDd) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_maybe_later, new Object[0]);
        }
        return null;
    }

    public final StringResource getDescription() {
        return StringResource.INSTANCE.invoke(C26245R.string.paycheck_investment_dd_confirmation_description_syp_retirement, new Object[0]);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$ConfirmationType;", "", "illustration", "", "title", "primaryAction", "bannerText", "<init>", "(Ljava/lang/String;IIIILjava/lang/Integer;)V", "getIllustration", "()I", "getTitle", "getPrimaryAction", "getBannerText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "ALREADY_SET_UP_DD", "MANUAL_ACCOUNT_ROUTING", "MANUAL_FORM_HR", "SWITCHER", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ConfirmationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConfirmationType[] $VALUES;
        public static final ConfirmationType ALREADY_SET_UP_DD = new ConfirmationType("ALREADY_SET_UP_DD", 0, C11131R.drawable.svg_split_your_paycheck, C26245R.string.paycheck_investment_dd_confirmation_title, C26245R.string.paycheck_investment_dd_confirmation_create_pri_cta, null);
        public static final ConfirmationType MANUAL_ACCOUNT_ROUTING = new ConfirmationType("MANUAL_ACCOUNT_ROUTING", 1, C11131R.drawable.svg_split_your_paycheck, C26245R.string.paycheck_investment_dd_confirmation_title, C26245R.string.paycheck_investment_dd_confirmation_create_pri_cta, Integer.valueOf(C26245R.string.paycheck_investment_dd_confirmation_banner));
        public static final ConfirmationType MANUAL_FORM_HR = new ConfirmationType("MANUAL_FORM_HR", 2, C11131R.drawable.svg_split_your_paycheck, C26245R.string.paycheck_investment_dd_confirmation_title, C26245R.string.paycheck_investment_dd_confirmation_create_pri_cta, Integer.valueOf(C26245R.string.paycheck_investment_dd_confirmation_banner));
        public static final ConfirmationType SWITCHER = new ConfirmationType("SWITCHER", 3, C11131R.drawable.svg_split_your_paycheck, C26245R.string.paycheck_investment_dd_confirmation_title, C26245R.string.paycheck_investment_dd_confirmation_create_pri_cta, Integer.valueOf(C26245R.string.paycheck_investment_dd_confirmation_banner));
        private final Integer bannerText;
        private final int illustration;
        private final int primaryAction;
        private final int title;

        private static final /* synthetic */ ConfirmationType[] $values() {
            return new ConfirmationType[]{ALREADY_SET_UP_DD, MANUAL_ACCOUNT_ROUTING, MANUAL_FORM_HR, SWITCHER};
        }

        public static EnumEntries<ConfirmationType> getEntries() {
            return $ENTRIES;
        }

        private ConfirmationType(String str, int i, int i2, int i3, int i4, Integer num) {
            this.illustration = i2;
            this.title = i3;
            this.primaryAction = i4;
            this.bannerText = num;
        }

        public final int getIllustration() {
            return this.illustration;
        }

        public final int getTitle() {
            return this.title;
        }

        public final int getPrimaryAction() {
            return this.primaryAction;
        }

        public final Integer getBannerText() {
            return this.bannerText;
        }

        static {
            ConfirmationType[] confirmationTypeArr$values = $values();
            $VALUES = confirmationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(confirmationTypeArr$values);
        }

        public static ConfirmationType valueOf(String str) {
            return (ConfirmationType) Enum.valueOf(ConfirmationType.class, str);
        }

        public static ConfirmationType[] values() {
            return (ConfirmationType[]) $VALUES.clone();
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\u00020\u0005*\u00060\u0006j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$Companion;", "", "<init>", "()V", "confirmationType", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$ConfirmationType;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Args;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/Args;", "getConfirmationType", "(Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Args;)Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState$ConfirmationType;", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingDdConfirmationViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DirectDepositSource.values().length];
                try {
                    iArr[DirectDepositSource.ALREADY_SET_UP_DD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DirectDepositSource.MANUAL_ACCOUNT_ROUTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DirectDepositSource.MANUAL_FORM_HR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DirectDepositSource.SWITCHER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConfirmationType getConfirmationType(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "<this>");
            int i = WhenMappings.$EnumSwitchMapping$0[args.getDirectDepositSource().ordinal()];
            if (i == 1) {
                return ConfirmationType.ALREADY_SET_UP_DD;
            }
            if (i == 2) {
                return ConfirmationType.MANUAL_ACCOUNT_ROUTING;
            }
            if (i == 3) {
                return ConfirmationType.MANUAL_FORM_HR;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return ConfirmationType.SWITCHER;
        }
    }
}
