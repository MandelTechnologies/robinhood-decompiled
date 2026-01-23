package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState;", "", "metaText", "Lcom/robinhood/utils/resource/StringResource;", "showMetaAsCta", "", "destination", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;)V", "getMetaText", "()Lcom/robinhood/utils/resource/StringResource;", "getShowMetaAsCta", "()Z", "getDestination", "()Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Destination", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SourceOfFundsRowState {
    public static final int $stable = StringResource.$stable;
    private final Destination destination;
    private final StringResource metaText;
    private final boolean showMetaAsCta;

    public static /* synthetic */ SourceOfFundsRowState copy$default(SourceOfFundsRowState sourceOfFundsRowState, StringResource stringResource, boolean z, Destination destination, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = sourceOfFundsRowState.metaText;
        }
        if ((i & 2) != 0) {
            z = sourceOfFundsRowState.showMetaAsCta;
        }
        if ((i & 4) != 0) {
            destination = sourceOfFundsRowState.destination;
        }
        return sourceOfFundsRowState.copy(stringResource, z, destination);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getMetaText() {
        return this.metaText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowMetaAsCta() {
        return this.showMetaAsCta;
    }

    /* renamed from: component3, reason: from getter */
    public final Destination getDestination() {
        return this.destination;
    }

    public final SourceOfFundsRowState copy(StringResource metaText, boolean showMetaAsCta, Destination destination) {
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new SourceOfFundsRowState(metaText, showMetaAsCta, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceOfFundsRowState)) {
            return false;
        }
        SourceOfFundsRowState sourceOfFundsRowState = (SourceOfFundsRowState) other;
        return Intrinsics.areEqual(this.metaText, sourceOfFundsRowState.metaText) && this.showMetaAsCta == sourceOfFundsRowState.showMetaAsCta && Intrinsics.areEqual(this.destination, sourceOfFundsRowState.destination);
    }

    public int hashCode() {
        return (((this.metaText.hashCode() * 31) + Boolean.hashCode(this.showMetaAsCta)) * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "SourceOfFundsRowState(metaText=" + this.metaText + ", showMetaAsCta=" + this.showMetaAsCta + ", destination=" + this.destination + ")";
    }

    public SourceOfFundsRowState(StringResource metaText, boolean z, Destination destination) {
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.metaText = metaText;
        this.showMetaAsCta = z;
        this.destination = destination;
    }

    public final StringResource getMetaText() {
        return this.metaText;
    }

    public final boolean getShowMetaAsCta() {
        return this.showMetaAsCta;
    }

    public final Destination getDestination() {
        return this.destination;
    }

    /* compiled from: InvestmentScheduleSettingsRows.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "", "PaycheckSourceOfFunds", "InsufficientBuyingPower", "DefaultSourceOfFunds", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination$DefaultSourceOfFunds;", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination$InsufficientBuyingPower;", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination$PaycheckSourceOfFunds;", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Destination {

        /* compiled from: InvestmentScheduleSettingsRows.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination$PaycheckSourceOfFunds;", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PaycheckSourceOfFunds implements Destination {
            public static final int $stable = 0;
            public static final PaycheckSourceOfFunds INSTANCE = new PaycheckSourceOfFunds();

            private PaycheckSourceOfFunds() {
            }
        }

        /* compiled from: InvestmentScheduleSettingsRows.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination$InsufficientBuyingPower;", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "amount", "Lcom/robinhood/models/util/Money;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InsufficientBuyingPower implements Destination {
            public static final int $stable = 8;
            private final Money amount;
            private final ApiInvestmentSchedule.Frequency frequency;

            public static /* synthetic */ InsufficientBuyingPower copy$default(InsufficientBuyingPower insufficientBuyingPower, Money money, ApiInvestmentSchedule.Frequency frequency, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = insufficientBuyingPower.amount;
                }
                if ((i & 2) != 0) {
                    frequency = insufficientBuyingPower.frequency;
                }
                return insufficientBuyingPower.copy(money, frequency);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiInvestmentSchedule.Frequency getFrequency() {
                return this.frequency;
            }

            public final InsufficientBuyingPower copy(Money amount, ApiInvestmentSchedule.Frequency frequency) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                return new InsufficientBuyingPower(amount, frequency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InsufficientBuyingPower)) {
                    return false;
                }
                InsufficientBuyingPower insufficientBuyingPower = (InsufficientBuyingPower) other;
                return Intrinsics.areEqual(this.amount, insufficientBuyingPower.amount) && this.frequency == insufficientBuyingPower.frequency;
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.frequency.hashCode();
            }

            public String toString() {
                return "InsufficientBuyingPower(amount=" + this.amount + ", frequency=" + this.frequency + ")";
            }

            public InsufficientBuyingPower(Money amount, ApiInvestmentSchedule.Frequency frequency) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                this.amount = amount;
                this.frequency = frequency;
            }

            public final Money getAmount() {
                return this.amount;
            }

            public final ApiInvestmentSchedule.Frequency getFrequency() {
                return this.frequency;
            }
        }

        /* compiled from: InvestmentScheduleSettingsRows.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination$DefaultSourceOfFunds;", "Lcom/robinhood/android/settings/ui/recurring/detail/SourceOfFundsRowState$Destination;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultSourceOfFunds implements Destination {
            public static final int $stable = 0;
            public static final DefaultSourceOfFunds INSTANCE = new DefaultSourceOfFunds();

            private DefaultSourceOfFunds() {
            }
        }
    }
}
