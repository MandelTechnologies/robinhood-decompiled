package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailTaxLotsViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent;", "taxLotTableState", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent;Lcom/robinhood/shared/taxLots/TaxLotTableState;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent;", "getTaxLotTableState", "()Lcom/robinhood/shared/taxLots/TaxLotTableState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SubtitleContent", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderDetailTaxLotsViewState {
    public static final int $stable;
    private final SubtitleContent subtitle;
    private final TaxLotTableState<Unit> taxLotTableState;
    private final StringResource title;

    static {
        int i = TaxLotTableState.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i2 | i2 | i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoOrderDetailTaxLotsViewState copy$default(CryptoOrderDetailTaxLotsViewState cryptoOrderDetailTaxLotsViewState, StringResource stringResource, SubtitleContent subtitleContent, TaxLotTableState taxLotTableState, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoOrderDetailTaxLotsViewState.title;
        }
        if ((i & 2) != 0) {
            subtitleContent = cryptoOrderDetailTaxLotsViewState.subtitle;
        }
        if ((i & 4) != 0) {
            taxLotTableState = cryptoOrderDetailTaxLotsViewState.taxLotTableState;
        }
        return cryptoOrderDetailTaxLotsViewState.copy(stringResource, subtitleContent, taxLotTableState);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final SubtitleContent getSubtitle() {
        return this.subtitle;
    }

    public final TaxLotTableState<Unit> component3() {
        return this.taxLotTableState;
    }

    public final CryptoOrderDetailTaxLotsViewState copy(StringResource title, SubtitleContent subtitle, TaxLotTableState<Unit> taxLotTableState) {
        Intrinsics.checkNotNullParameter(taxLotTableState, "taxLotTableState");
        return new CryptoOrderDetailTaxLotsViewState(title, subtitle, taxLotTableState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderDetailTaxLotsViewState)) {
            return false;
        }
        CryptoOrderDetailTaxLotsViewState cryptoOrderDetailTaxLotsViewState = (CryptoOrderDetailTaxLotsViewState) other;
        return Intrinsics.areEqual(this.title, cryptoOrderDetailTaxLotsViewState.title) && Intrinsics.areEqual(this.subtitle, cryptoOrderDetailTaxLotsViewState.subtitle) && Intrinsics.areEqual(this.taxLotTableState, cryptoOrderDetailTaxLotsViewState.taxLotTableState);
    }

    public int hashCode() {
        StringResource stringResource = this.title;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        SubtitleContent subtitleContent = this.subtitle;
        return ((iHashCode + (subtitleContent != null ? subtitleContent.hashCode() : 0)) * 31) + this.taxLotTableState.hashCode();
    }

    public String toString() {
        return "CryptoOrderDetailTaxLotsViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", taxLotTableState=" + this.taxLotTableState + ")";
    }

    public CryptoOrderDetailTaxLotsViewState(StringResource stringResource, SubtitleContent subtitleContent, TaxLotTableState<Unit> taxLotTableState) {
        Intrinsics.checkNotNullParameter(taxLotTableState, "taxLotTableState");
        this.title = stringResource;
        this.subtitle = subtitleContent;
        this.taxLotTableState = taxLotTableState;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final SubtitleContent getSubtitle() {
        return this.subtitle;
    }

    public final TaxLotTableState<Unit> getTaxLotTableState() {
        return this.taxLotTableState;
    }

    /* compiled from: CryptoOrderDetailTaxLotsViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent;", "", "prefix", "Lcom/robinhood/utils/resource/StringResource;", "suffix", "suffixColorOverride", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent$ColorOverride;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent$ColorOverride;)V", "getPrefix", "()Lcom/robinhood/utils/resource/StringResource;", "getSuffix", "getSuffixColorOverride", "()Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent$ColorOverride;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ColorOverride", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubtitleContent {
        public static final int $stable = StringResource.$stable;
        private final StringResource prefix;
        private final StringResource suffix;
        private final ColorOverride suffixColorOverride;

        public static /* synthetic */ SubtitleContent copy$default(SubtitleContent subtitleContent, StringResource stringResource, StringResource stringResource2, ColorOverride colorOverride, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = subtitleContent.prefix;
            }
            if ((i & 2) != 0) {
                stringResource2 = subtitleContent.suffix;
            }
            if ((i & 4) != 0) {
                colorOverride = subtitleContent.suffixColorOverride;
            }
            return subtitleContent.copy(stringResource, stringResource2, colorOverride);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPrefix() {
            return this.prefix;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSuffix() {
            return this.suffix;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorOverride getSuffixColorOverride() {
            return this.suffixColorOverride;
        }

        public final SubtitleContent copy(StringResource prefix, StringResource suffix, ColorOverride suffixColorOverride) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            return new SubtitleContent(prefix, suffix, suffixColorOverride);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleContent)) {
                return false;
            }
            SubtitleContent subtitleContent = (SubtitleContent) other;
            return Intrinsics.areEqual(this.prefix, subtitleContent.prefix) && Intrinsics.areEqual(this.suffix, subtitleContent.suffix) && this.suffixColorOverride == subtitleContent.suffixColorOverride;
        }

        public int hashCode() {
            int iHashCode = ((this.prefix.hashCode() * 31) + this.suffix.hashCode()) * 31;
            ColorOverride colorOverride = this.suffixColorOverride;
            return iHashCode + (colorOverride == null ? 0 : colorOverride.hashCode());
        }

        public String toString() {
            return "SubtitleContent(prefix=" + this.prefix + ", suffix=" + this.suffix + ", suffixColorOverride=" + this.suffixColorOverride + ")";
        }

        public SubtitleContent(StringResource prefix, StringResource suffix, ColorOverride colorOverride) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.suffixColorOverride = colorOverride;
        }

        public /* synthetic */ SubtitleContent(StringResource stringResource, StringResource stringResource2, ColorOverride colorOverride, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, stringResource2, (i & 4) != 0 ? null : colorOverride);
        }

        public final StringResource getPrefix() {
            return this.prefix;
        }

        public final StringResource getSuffix() {
            return this.suffix;
        }

        public final ColorOverride getSuffixColorOverride() {
            return this.suffixColorOverride;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoOrderDetailTaxLotsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent$ColorOverride;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ColorOverride {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ColorOverride[] $VALUES;
            public static final ColorOverride POSITIVE = new ColorOverride("POSITIVE", 0);
            public static final ColorOverride NEGATIVE = new ColorOverride("NEGATIVE", 1);

            private static final /* synthetic */ ColorOverride[] $values() {
                return new ColorOverride[]{POSITIVE, NEGATIVE};
            }

            public static EnumEntries<ColorOverride> getEntries() {
                return $ENTRIES;
            }

            private ColorOverride(String str, int i) {
            }

            static {
                ColorOverride[] colorOverrideArr$values = $values();
                $VALUES = colorOverrideArr$values;
                $ENTRIES = EnumEntries2.enumEntries(colorOverrideArr$values);
            }

            public static ColorOverride valueOf(String str) {
                return (ColorOverride) Enum.valueOf(ColorOverride.class, str);
            }

            public static ColorOverride[] values() {
                return (ColorOverride[]) $VALUES.clone();
            }
        }
    }
}
