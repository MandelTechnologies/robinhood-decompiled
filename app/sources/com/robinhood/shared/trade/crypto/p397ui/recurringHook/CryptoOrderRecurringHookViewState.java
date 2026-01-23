package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: CryptoOrderRecurringHookViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState;", "", "j$/time/LocalDate", "nextInvestmentDate", "Lcom/robinhood/utils/resource/StringResource;", "subtitleText", "footerText", "", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState$FrequencyRowItem;", "rowItems", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "selectedFrequency", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/utils/resource/StringResource;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;)Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getNextInvestmentDate", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitleText", "getFooterText", "Ljava/util/List;", "getRowItems", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "getSelectedFrequency", "FrequencyRowItem", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderRecurringHookViewState {
    public static final int $stable = 8;
    private final StringResource footerText;
    private final LocalDate nextInvestmentDate;
    private final List<FrequencyRowItem> rowItems;
    private final CryptoOrderRecurringHookFrequency selectedFrequency;
    private final StringResource subtitleText;

    public static /* synthetic */ CryptoOrderRecurringHookViewState copy$default(CryptoOrderRecurringHookViewState cryptoOrderRecurringHookViewState, LocalDate localDate, StringResource stringResource, StringResource stringResource2, List list, CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = cryptoOrderRecurringHookViewState.nextInvestmentDate;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoOrderRecurringHookViewState.subtitleText;
        }
        if ((i & 4) != 0) {
            stringResource2 = cryptoOrderRecurringHookViewState.footerText;
        }
        if ((i & 8) != 0) {
            list = cryptoOrderRecurringHookViewState.rowItems;
        }
        if ((i & 16) != 0) {
            cryptoOrderRecurringHookFrequency = cryptoOrderRecurringHookViewState.selectedFrequency;
        }
        CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency2 = cryptoOrderRecurringHookFrequency;
        StringResource stringResource3 = stringResource2;
        return cryptoOrderRecurringHookViewState.copy(localDate, stringResource, stringResource3, list, cryptoOrderRecurringHookFrequency2);
    }

    /* renamed from: component1, reason: from getter */
    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getFooterText() {
        return this.footerText;
    }

    public final List<FrequencyRowItem> component4() {
        return this.rowItems;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoOrderRecurringHookFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final CryptoOrderRecurringHookViewState copy(LocalDate nextInvestmentDate, StringResource subtitleText, StringResource footerText, List<FrequencyRowItem> rowItems, CryptoOrderRecurringHookFrequency selectedFrequency) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        Intrinsics.checkNotNullParameter(rowItems, "rowItems");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        return new CryptoOrderRecurringHookViewState(nextInvestmentDate, subtitleText, footerText, rowItems, selectedFrequency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderRecurringHookViewState)) {
            return false;
        }
        CryptoOrderRecurringHookViewState cryptoOrderRecurringHookViewState = (CryptoOrderRecurringHookViewState) other;
        return Intrinsics.areEqual(this.nextInvestmentDate, cryptoOrderRecurringHookViewState.nextInvestmentDate) && Intrinsics.areEqual(this.subtitleText, cryptoOrderRecurringHookViewState.subtitleText) && Intrinsics.areEqual(this.footerText, cryptoOrderRecurringHookViewState.footerText) && Intrinsics.areEqual(this.rowItems, cryptoOrderRecurringHookViewState.rowItems) && this.selectedFrequency == cryptoOrderRecurringHookViewState.selectedFrequency;
    }

    public int hashCode() {
        return (((((((this.nextInvestmentDate.hashCode() * 31) + this.subtitleText.hashCode()) * 31) + this.footerText.hashCode()) * 31) + this.rowItems.hashCode()) * 31) + this.selectedFrequency.hashCode();
    }

    public String toString() {
        return "CryptoOrderRecurringHookViewState(nextInvestmentDate=" + this.nextInvestmentDate + ", subtitleText=" + this.subtitleText + ", footerText=" + this.footerText + ", rowItems=" + this.rowItems + ", selectedFrequency=" + this.selectedFrequency + ")";
    }

    public CryptoOrderRecurringHookViewState(LocalDate nextInvestmentDate, StringResource subtitleText, StringResource footerText, List<FrequencyRowItem> rowItems, CryptoOrderRecurringHookFrequency selectedFrequency) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        Intrinsics.checkNotNullParameter(rowItems, "rowItems");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        this.nextInvestmentDate = nextInvestmentDate;
        this.subtitleText = subtitleText;
        this.footerText = footerText;
        this.rowItems = rowItems;
        this.selectedFrequency = selectedFrequency;
    }

    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final StringResource getFooterText() {
        return this.footerText;
    }

    public final List<FrequencyRowItem> getRowItems() {
        return this.rowItems;
    }

    public final CryptoOrderRecurringHookFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* compiled from: CryptoOrderRecurringHookViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState$FrequencyRowItem;", "", "frequency", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "isChecked", "", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getFrequency", "()Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FrequencyRowItem {
        public static final int $stable = StringResource.$stable;
        private final CryptoOrderRecurringHookFrequency frequency;
        private final boolean isChecked;
        private final StringResource primaryText;
        private final StringResource secondaryText;

        public static /* synthetic */ FrequencyRowItem copy$default(FrequencyRowItem frequencyRowItem, CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderRecurringHookFrequency = frequencyRowItem.frequency;
            }
            if ((i & 2) != 0) {
                stringResource = frequencyRowItem.primaryText;
            }
            if ((i & 4) != 0) {
                stringResource2 = frequencyRowItem.secondaryText;
            }
            if ((i & 8) != 0) {
                z = frequencyRowItem.isChecked;
            }
            return frequencyRowItem.copy(cryptoOrderRecurringHookFrequency, stringResource, stringResource2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderRecurringHookFrequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final FrequencyRowItem copy(CryptoOrderRecurringHookFrequency frequency, StringResource primaryText, StringResource secondaryText, boolean isChecked) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new FrequencyRowItem(frequency, primaryText, secondaryText, isChecked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrequencyRowItem)) {
                return false;
            }
            FrequencyRowItem frequencyRowItem = (FrequencyRowItem) other;
            return this.frequency == frequencyRowItem.frequency && Intrinsics.areEqual(this.primaryText, frequencyRowItem.primaryText) && Intrinsics.areEqual(this.secondaryText, frequencyRowItem.secondaryText) && this.isChecked == frequencyRowItem.isChecked;
        }

        public int hashCode() {
            return (((((this.frequency.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "FrequencyRowItem(frequency=" + this.frequency + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", isChecked=" + this.isChecked + ")";
        }

        public FrequencyRowItem(CryptoOrderRecurringHookFrequency frequency, StringResource primaryText, StringResource secondaryText, boolean z) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.frequency = frequency;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.isChecked = z;
        }

        public final CryptoOrderRecurringHookFrequency getFrequency() {
            return this.frequency;
        }

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }
    }
}
