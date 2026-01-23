package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaycheckHubViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "", "<init>", "()V", "isPaycheckDistributionViewVisible", "", "()Z", "isBannerVisible", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "None", "PaycheckDistributionView", "InfoText", "ButtonAction", "Companion", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$None;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$PaycheckDistributionView;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class PaycheckHubViewState3 {
    private final StringResource bannerText;
    private final ButtonAction buttonAction;
    private final boolean isBannerVisible;
    private final boolean isPaycheckDistributionViewVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    public /* synthetic */ PaycheckHubViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaycheckHubViewState3() {
    }

    /* renamed from: isPaycheckDistributionViewVisible, reason: from getter */
    public boolean getIsPaycheckDistributionViewVisible() {
        return this.isPaycheckDistributionViewVisible;
    }

    /* renamed from: isBannerVisible, reason: from getter */
    public boolean getIsBannerVisible() {
        return this.isBannerVisible;
    }

    public StringResource getBannerText() {
        return this.bannerText;
    }

    public ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    /* compiled from: PaycheckHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$None;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "<init>", "()V", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$None */
    public static final class None extends PaycheckHubViewState3 {
        public static final None INSTANCE = new None();
        public static final int $stable = StringResource.$stable;

        private None() {
            super(null);
        }
    }

    /* compiled from: PaycheckHubViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$PaycheckDistributionView;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "paycheck", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "<init>", "(Lcom/robinhood/models/db/bonfire/PaycheckV2;)V", "getPaycheck", "()Lcom/robinhood/models/db/bonfire/PaycheckV2;", "isPaycheckDistributionViewVisible", "", "()Z", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$PaycheckDistributionView, reason: from toString */
    public static final /* data */ class PaycheckDistributionView extends PaycheckHubViewState3 {
        public static final int $stable = 8;
        private final ButtonAction buttonAction;
        private final boolean isPaycheckDistributionViewVisible;
        private final PaycheckV2 paycheck;

        public static /* synthetic */ PaycheckDistributionView copy$default(PaycheckDistributionView paycheckDistributionView, PaycheckV2 paycheckV2, int i, Object obj) {
            if ((i & 1) != 0) {
                paycheckV2 = paycheckDistributionView.paycheck;
            }
            return paycheckDistributionView.copy(paycheckV2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaycheckV2 getPaycheck() {
            return this.paycheck;
        }

        public final PaycheckDistributionView copy(PaycheckV2 paycheck) {
            Intrinsics.checkNotNullParameter(paycheck, "paycheck");
            return new PaycheckDistributionView(paycheck);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaycheckDistributionView) && Intrinsics.areEqual(this.paycheck, ((PaycheckDistributionView) other).paycheck);
        }

        public int hashCode() {
            return this.paycheck.hashCode();
        }

        public String toString() {
            return "PaycheckDistributionView(paycheck=" + this.paycheck + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaycheckDistributionView(PaycheckV2 paycheck) {
            super(null);
            Intrinsics.checkNotNullParameter(paycheck, "paycheck");
            this.paycheck = paycheck;
            this.isPaycheckDistributionViewVisible = true;
            this.buttonAction = ButtonAction.MANAGE;
        }

        public final PaycheckV2 getPaycheck() {
            return this.paycheck;
        }

        @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
        /* renamed from: isPaycheckDistributionViewVisible, reason: from getter */
        public boolean getIsPaycheckDistributionViewVisible() {
            return this.isPaycheckDistributionViewVisible;
        }

        @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
        public ButtonAction getButtonAction() {
            return this.buttonAction;
        }
    }

    /* compiled from: PaycheckHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "<init>", "()V", "isBannerVisible", "", "()Z", "ManualDdNoPaychecksNoSyp", "ManualDdNoPaychecksHasSyp", "HasPaychecksNoSyp", "HasPaychecksHasSyp", "Rhs", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$HasPaychecksHasSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$HasPaychecksNoSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$ManualDdNoPaychecksHasSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$ManualDdNoPaychecksNoSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$Rhs;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$InfoText */
    public static abstract class InfoText extends PaycheckHubViewState3 {
        public static final int $stable = StringResource.$stable;
        private final boolean isBannerVisible;

        public /* synthetic */ InfoText(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InfoText() {
            super(null);
            this.isBannerVisible = true;
        }

        @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
        /* renamed from: isBannerVisible, reason: from getter */
        public boolean getIsBannerVisible() {
            return this.isBannerVisible;
        }

        /* compiled from: PaycheckHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$ManualDdNoPaychecksNoSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "<init>", "(Lcom/robinhood/models/db/mcduckling/SweepsInterest;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$InfoText$ManualDdNoPaychecksNoSyp, reason: from toString */
        public static final /* data */ class ManualDdNoPaychecksNoSyp extends InfoText {
            public static final int $stable = 8;
            private final ButtonAction buttonAction;
            private final SweepsInterest sweepsInterest;

            /* renamed from: component1, reason: from getter */
            private final SweepsInterest getSweepsInterest() {
                return this.sweepsInterest;
            }

            public static /* synthetic */ ManualDdNoPaychecksNoSyp copy$default(ManualDdNoPaychecksNoSyp manualDdNoPaychecksNoSyp, SweepsInterest sweepsInterest, int i, Object obj) {
                if ((i & 1) != 0) {
                    sweepsInterest = manualDdNoPaychecksNoSyp.sweepsInterest;
                }
                return manualDdNoPaychecksNoSyp.copy(sweepsInterest);
            }

            public final ManualDdNoPaychecksNoSyp copy(SweepsInterest sweepsInterest) {
                return new ManualDdNoPaychecksNoSyp(sweepsInterest);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ManualDdNoPaychecksNoSyp) && Intrinsics.areEqual(this.sweepsInterest, ((ManualDdNoPaychecksNoSyp) other).sweepsInterest);
            }

            public int hashCode() {
                SweepsInterest sweepsInterest = this.sweepsInterest;
                if (sweepsInterest == null) {
                    return 0;
                }
                return sweepsInterest.hashCode();
            }

            public String toString() {
                return "ManualDdNoPaychecksNoSyp(sweepsInterest=" + this.sweepsInterest + ")";
            }

            public ManualDdNoPaychecksNoSyp(SweepsInterest sweepsInterest) {
                super(null);
                this.sweepsInterest = sweepsInterest;
                this.buttonAction = ButtonAction.CREATE;
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public StringResource getBannerText() {
                BigDecimal interestRate;
                SweepsInterest sweepsInterest = this.sweepsInterest;
                if (sweepsInterest == null || (interestRate = sweepsInterest.getGoldInterestRate()) == null) {
                    SweepsInterest sweepsInterest2 = this.sweepsInterest;
                    interestRate = sweepsInterest2 != null ? sweepsInterest2.getInterestRate() : null;
                }
                if (interestRate == null) {
                    return StringResource.INSTANCE.invoke(C25434R.string.f4831xf6fd87af, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C25434R.string.paycheck_hub_pending_direct_deposit_setup_info_syp_sweeps_upsell, Formats.getInterestRateFormatShort().format(interestRate));
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public ButtonAction getButtonAction() {
                return this.buttonAction;
            }
        }

        /* compiled from: PaycheckHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$ManualDdNoPaychecksHasSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$InfoText$ManualDdNoPaychecksHasSyp */
        public static final class ManualDdNoPaychecksHasSyp extends InfoText {
            public static final ManualDdNoPaychecksHasSyp INSTANCE = new ManualDdNoPaychecksHasSyp();
            private static final StringResource bannerText = StringResource.INSTANCE.invoke(C25434R.string.paycheck_hub_pending_direct_deposit_setup_info_has_syp, new Object[0]);
            private static final ButtonAction buttonAction = ButtonAction.MANAGE;
            public static final int $stable = StringResource.$stable;

            private ManualDdNoPaychecksHasSyp() {
                super(null);
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public StringResource getBannerText() {
                return bannerText;
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public ButtonAction getButtonAction() {
                return buttonAction;
            }
        }

        /* compiled from: PaycheckHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$HasPaychecksNoSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "latestPaycheck", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "<init>", "(Lcom/robinhood/models/db/bonfire/PaycheckV2;Lcom/robinhood/models/db/mcduckling/SweepsInterest;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$InfoText$HasPaychecksNoSyp, reason: from toString */
        public static final /* data */ class HasPaychecksNoSyp extends InfoText {
            public static final int $stable = 8;
            private final ButtonAction buttonAction;
            private final PaycheckV2 latestPaycheck;
            private final SweepsInterest sweepsInterest;

            /* renamed from: component1, reason: from getter */
            private final PaycheckV2 getLatestPaycheck() {
                return this.latestPaycheck;
            }

            /* renamed from: component2, reason: from getter */
            private final SweepsInterest getSweepsInterest() {
                return this.sweepsInterest;
            }

            public static /* synthetic */ HasPaychecksNoSyp copy$default(HasPaychecksNoSyp hasPaychecksNoSyp, PaycheckV2 paycheckV2, SweepsInterest sweepsInterest, int i, Object obj) {
                if ((i & 1) != 0) {
                    paycheckV2 = hasPaychecksNoSyp.latestPaycheck;
                }
                if ((i & 2) != 0) {
                    sweepsInterest = hasPaychecksNoSyp.sweepsInterest;
                }
                return hasPaychecksNoSyp.copy(paycheckV2, sweepsInterest);
            }

            public final HasPaychecksNoSyp copy(PaycheckV2 latestPaycheck, SweepsInterest sweepsInterest) {
                Intrinsics.checkNotNullParameter(latestPaycheck, "latestPaycheck");
                return new HasPaychecksNoSyp(latestPaycheck, sweepsInterest);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HasPaychecksNoSyp)) {
                    return false;
                }
                HasPaychecksNoSyp hasPaychecksNoSyp = (HasPaychecksNoSyp) other;
                return Intrinsics.areEqual(this.latestPaycheck, hasPaychecksNoSyp.latestPaycheck) && Intrinsics.areEqual(this.sweepsInterest, hasPaychecksNoSyp.sweepsInterest);
            }

            public int hashCode() {
                int iHashCode = this.latestPaycheck.hashCode() * 31;
                SweepsInterest sweepsInterest = this.sweepsInterest;
                return iHashCode + (sweepsInterest == null ? 0 : sweepsInterest.hashCode());
            }

            public String toString() {
                return "HasPaychecksNoSyp(latestPaycheck=" + this.latestPaycheck + ", sweepsInterest=" + this.sweepsInterest + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HasPaychecksNoSyp(PaycheckV2 latestPaycheck, SweepsInterest sweepsInterest) {
                super(null);
                Intrinsics.checkNotNullParameter(latestPaycheck, "latestPaycheck");
                this.latestPaycheck = latestPaycheck;
                this.sweepsInterest = sweepsInterest;
                this.buttonAction = ButtonAction.CREATE;
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public StringResource getBannerText() {
                BigDecimal interestRate;
                SweepsInterest sweepsInterest = this.sweepsInterest;
                if (sweepsInterest == null || (interestRate = sweepsInterest.getGoldInterestRate()) == null) {
                    SweepsInterest sweepsInterest2 = this.sweepsInterest;
                    interestRate = sweepsInterest2 != null ? sweepsInterest2.getInterestRate() : null;
                }
                if (interestRate == null) {
                    return StringResource.INSTANCE.invoke(C25434R.string.paycheck_hub_banner_no_syp_syp_sweeps_upsell_no_interest, this.latestPaycheck.getOriginatorName());
                }
                return StringResource.INSTANCE.invoke(C25434R.string.paycheck_hub_banner_no_syp_syp_sweeps_upsell, this.latestPaycheck.getOriginatorName(), Formats.getInterestRateFormatShort().format(interestRate));
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public ButtonAction getButtonAction() {
                return this.buttonAction;
            }
        }

        /* compiled from: PaycheckHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$HasPaychecksHasSyp;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$InfoText$HasPaychecksHasSyp */
        public static final class HasPaychecksHasSyp extends InfoText {
            public static final HasPaychecksHasSyp INSTANCE = new HasPaychecksHasSyp();
            private static final StringResource bannerText = StringResource.INSTANCE.invoke(C25434R.string.paycheck_hub_banner_has_syp_syp_sweeps_upsell, new Object[0]);
            private static final ButtonAction buttonAction = ButtonAction.MANAGE;
            public static final int $stable = StringResource.$stable;

            private HasPaychecksHasSyp() {
                super(null);
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public StringResource getBannerText() {
                return bannerText;
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public ButtonAction getButtonAction() {
                return buttonAction;
            }
        }

        /* compiled from: PaycheckHubViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText$Rhs;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$InfoText;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "buttonAction", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "getButtonAction", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$InfoText$Rhs */
        public static final class Rhs extends InfoText {
            public static final Rhs INSTANCE = new Rhs();
            private static final StringResource bannerText = StringResource.INSTANCE.invoke(C25434R.string.paycheck_cash_management_direct_deposit_redirect, new Object[0]);
            private static final ButtonAction buttonAction = ButtonAction.REDIRECT;
            public static final int $stable = StringResource.$stable;

            private Rhs() {
                super(null);
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public StringResource getBannerText() {
                return bannerText;
            }

            @Override // com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3
            public ButtonAction getButtonAction() {
                return buttonAction;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaycheckHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$ButtonAction;", "", "labelRes", "", "<init>", "(Ljava/lang/String;II)V", "getLabelRes", "()I", "CREATE", "MANAGE", "REDIRECT", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$ButtonAction */
    public static final class ButtonAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonAction[] $VALUES;
        public static final ButtonAction CREATE = new ButtonAction("CREATE", 0, C25434R.string.paycheck_recurring_investments_create);
        public static final ButtonAction MANAGE = new ButtonAction("MANAGE", 1, C25434R.string.paycheck_recurring_investments_manage);
        public static final ButtonAction REDIRECT = new ButtonAction("REDIRECT", 2, C25434R.string.paycheck_cash_management_direct_deposit_redirect_cta);
        private final int labelRes;

        private static final /* synthetic */ ButtonAction[] $values() {
            return new ButtonAction[]{CREATE, MANAGE, REDIRECT};
        }

        public static EnumEntries<ButtonAction> getEntries() {
            return $ENTRIES;
        }

        private ButtonAction(String str, int i, int i2) {
            this.labelRes = i2;
        }

        public final int getLabelRes() {
            return this.labelRes;
        }

        static {
            ButtonAction[] buttonActionArr$values = $values();
            $VALUES = buttonActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonActionArr$values);
        }

        public static ButtonAction valueOf(String str) {
            return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
        }

        public static ButtonAction[] values() {
            return (ButtonAction[]) $VALUES.clone();
        }
    }

    /* compiled from: PaycheckHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent$Companion;", "", "<init>", "()V", "getState", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "paychecks", "", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "hasPaycheckInvestmentSchedules", "", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/SweepsInterest;)Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsContent$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaycheckHubViewState3 getState$default(Companion companion, List list, Boolean bool, SweepsInterest sweepsInterest, int i, Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                sweepsInterest = null;
            }
            return companion.getState(list, bool, sweepsInterest);
        }

        public final PaycheckHubViewState3 getState(List<PaycheckV2> paychecks, Boolean hasPaycheckInvestmentSchedules, SweepsInterest sweepsInterest) {
            PaycheckV2 paycheckV2;
            Object next;
            if (paychecks != null) {
                Iterator<T> it = paychecks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (BigDecimals7.m2978gt(((PaycheckV2) next).getInvestedAmount(), BigDecimal.ZERO)) {
                        break;
                    }
                }
                paycheckV2 = (PaycheckV2) next;
            } else {
                paycheckV2 = null;
            }
            PaycheckV2 paycheckV22 = paychecks != null ? (PaycheckV2) CollectionsKt.firstOrNull((List) paychecks) : null;
            boolean z = paycheckV2 != null;
            int size = paychecks != null ? paychecks.size() : 0;
            boolean zAreEqual = Intrinsics.areEqual(hasPaycheckInvestmentSchedules, Boolean.TRUE);
            if (paychecks == null || hasPaycheckInvestmentSchedules == null) {
                return None.INSTANCE;
            }
            if ((paycheckV22 != null ? paycheckV22.getAccountType() : null) == RhEntity.RHS) {
                return InfoText.Rhs.INSTANCE;
            }
            if (size == 0 && !zAreEqual) {
                return new InfoText.ManualDdNoPaychecksNoSyp(sweepsInterest);
            }
            if (size == 0 && zAreEqual) {
                return InfoText.ManualDdNoPaychecksHasSyp.INSTANCE;
            }
            if (paycheckV22 != null && size > 0 && !zAreEqual) {
                return new InfoText.HasPaychecksNoSyp(paycheckV22, sweepsInterest);
            }
            if (size > 0 && zAreEqual && !z) {
                return InfoText.HasPaychecksHasSyp.INSTANCE;
            }
            if (size > 0 && z && paycheckV22 != null) {
                return new PaycheckDistributionView(paycheckV22);
            }
            return None.INSTANCE;
        }
    }
}
