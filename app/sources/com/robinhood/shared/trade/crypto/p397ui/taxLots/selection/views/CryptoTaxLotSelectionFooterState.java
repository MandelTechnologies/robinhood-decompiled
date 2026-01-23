package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionFooter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;", "", "totalCreditTextContent", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "estimatedGainLossTextContent", "quantityTextContent", "errorMessage", "Lcom/robinhood/utils/resource/StringResource;", "isCtaEnabled", "", "isCtaLoading", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getTotalCreditTextContent", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "getEstimatedGainLossTextContent", "getQuantityTextContent", "getErrorMessage", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "TextContent", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotSelectionFooterState {
    public static final int $stable = StringResource.$stable;
    private final StringResource errorMessage;
    private final TextContent estimatedGainLossTextContent;
    private final boolean isCtaEnabled;
    private final boolean isCtaLoading;
    private final TextContent quantityTextContent;
    private final TextContent totalCreditTextContent;

    public static /* synthetic */ CryptoTaxLotSelectionFooterState copy$default(CryptoTaxLotSelectionFooterState cryptoTaxLotSelectionFooterState, TextContent textContent, TextContent textContent2, TextContent textContent3, StringResource stringResource, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            textContent = cryptoTaxLotSelectionFooterState.totalCreditTextContent;
        }
        if ((i & 2) != 0) {
            textContent2 = cryptoTaxLotSelectionFooterState.estimatedGainLossTextContent;
        }
        if ((i & 4) != 0) {
            textContent3 = cryptoTaxLotSelectionFooterState.quantityTextContent;
        }
        if ((i & 8) != 0) {
            stringResource = cryptoTaxLotSelectionFooterState.errorMessage;
        }
        if ((i & 16) != 0) {
            z = cryptoTaxLotSelectionFooterState.isCtaEnabled;
        }
        if ((i & 32) != 0) {
            z2 = cryptoTaxLotSelectionFooterState.isCtaLoading;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return cryptoTaxLotSelectionFooterState.copy(textContent, textContent2, textContent3, stringResource, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final TextContent getTotalCreditTextContent() {
        return this.totalCreditTextContent;
    }

    /* renamed from: component2, reason: from getter */
    public final TextContent getEstimatedGainLossTextContent() {
        return this.estimatedGainLossTextContent;
    }

    /* renamed from: component3, reason: from getter */
    public final TextContent getQuantityTextContent() {
        return this.quantityTextContent;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCtaEnabled() {
        return this.isCtaEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCtaLoading() {
        return this.isCtaLoading;
    }

    public final CryptoTaxLotSelectionFooterState copy(TextContent totalCreditTextContent, TextContent estimatedGainLossTextContent, TextContent quantityTextContent, StringResource errorMessage, boolean isCtaEnabled, boolean isCtaLoading) {
        Intrinsics.checkNotNullParameter(totalCreditTextContent, "totalCreditTextContent");
        Intrinsics.checkNotNullParameter(estimatedGainLossTextContent, "estimatedGainLossTextContent");
        Intrinsics.checkNotNullParameter(quantityTextContent, "quantityTextContent");
        return new CryptoTaxLotSelectionFooterState(totalCreditTextContent, estimatedGainLossTextContent, quantityTextContent, errorMessage, isCtaEnabled, isCtaLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotSelectionFooterState)) {
            return false;
        }
        CryptoTaxLotSelectionFooterState cryptoTaxLotSelectionFooterState = (CryptoTaxLotSelectionFooterState) other;
        return Intrinsics.areEqual(this.totalCreditTextContent, cryptoTaxLotSelectionFooterState.totalCreditTextContent) && Intrinsics.areEqual(this.estimatedGainLossTextContent, cryptoTaxLotSelectionFooterState.estimatedGainLossTextContent) && Intrinsics.areEqual(this.quantityTextContent, cryptoTaxLotSelectionFooterState.quantityTextContent) && Intrinsics.areEqual(this.errorMessage, cryptoTaxLotSelectionFooterState.errorMessage) && this.isCtaEnabled == cryptoTaxLotSelectionFooterState.isCtaEnabled && this.isCtaLoading == cryptoTaxLotSelectionFooterState.isCtaLoading;
    }

    public int hashCode() {
        int iHashCode = ((((this.totalCreditTextContent.hashCode() * 31) + this.estimatedGainLossTextContent.hashCode()) * 31) + this.quantityTextContent.hashCode()) * 31;
        StringResource stringResource = this.errorMessage;
        return ((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isCtaEnabled)) * 31) + Boolean.hashCode(this.isCtaLoading);
    }

    public String toString() {
        return "CryptoTaxLotSelectionFooterState(totalCreditTextContent=" + this.totalCreditTextContent + ", estimatedGainLossTextContent=" + this.estimatedGainLossTextContent + ", quantityTextContent=" + this.quantityTextContent + ", errorMessage=" + this.errorMessage + ", isCtaEnabled=" + this.isCtaEnabled + ", isCtaLoading=" + this.isCtaLoading + ")";
    }

    public CryptoTaxLotSelectionFooterState(TextContent totalCreditTextContent, TextContent estimatedGainLossTextContent, TextContent quantityTextContent, StringResource stringResource, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(totalCreditTextContent, "totalCreditTextContent");
        Intrinsics.checkNotNullParameter(estimatedGainLossTextContent, "estimatedGainLossTextContent");
        Intrinsics.checkNotNullParameter(quantityTextContent, "quantityTextContent");
        this.totalCreditTextContent = totalCreditTextContent;
        this.estimatedGainLossTextContent = estimatedGainLossTextContent;
        this.quantityTextContent = quantityTextContent;
        this.errorMessage = stringResource;
        this.isCtaEnabled = z;
        this.isCtaLoading = z2;
    }

    public /* synthetic */ CryptoTaxLotSelectionFooterState(TextContent textContent, TextContent textContent2, TextContent textContent3, StringResource stringResource, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textContent, textContent2, textContent3, (i & 8) != 0 ? null : stringResource, z, (i & 32) != 0 ? false : z2);
    }

    public final TextContent getTotalCreditTextContent() {
        return this.totalCreditTextContent;
    }

    public final TextContent getEstimatedGainLossTextContent() {
        return this.estimatedGainLossTextContent;
    }

    public final TextContent getQuantityTextContent() {
        return this.quantityTextContent;
    }

    public final StringResource getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isCtaEnabled() {
        return this.isCtaEnabled;
    }

    public final boolean isCtaLoading() {
        return this.isCtaLoading;
    }

    /* compiled from: CryptoTaxLotSelectionFooter.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "", "<init>", "()V", "None", "Loading", "Text", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$None;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Text;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TextContent {
        public static final int $stable = 0;

        public /* synthetic */ TextContent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoTaxLotSelectionFooter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$None;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None extends TextContent {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -1360907799;
            }

            public String toString() {
                return "None";
            }

            private None() {
                super(null);
            }
        }

        private TextContent() {
        }

        /* compiled from: CryptoTaxLotSelectionFooter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends TextContent {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -99904277;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        /* compiled from: CryptoTaxLotSelectionFooter.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Text;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent;", "text", "Lcom/robinhood/utils/resource/StringResource;", "colorOverride", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Text$ColorOverride;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Text$ColorOverride;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getColorOverride", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Text$ColorOverride;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ColorOverride", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Text extends TextContent {
            public static final int $stable = StringResource.$stable;
            private final ColorOverride colorOverride;
            private final StringResource text;

            public static /* synthetic */ Text copy$default(Text text, StringResource stringResource, ColorOverride colorOverride, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = text.text;
                }
                if ((i & 2) != 0) {
                    colorOverride = text.colorOverride;
                }
                return text.copy(stringResource, colorOverride);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final ColorOverride getColorOverride() {
                return this.colorOverride;
            }

            public final Text copy(StringResource text, ColorOverride colorOverride) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text, colorOverride);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.areEqual(this.text, text.text) && this.colorOverride == text.colorOverride;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                ColorOverride colorOverride = this.colorOverride;
                return iHashCode + (colorOverride == null ? 0 : colorOverride.hashCode());
            }

            public String toString() {
                return "Text(text=" + this.text + ", colorOverride=" + this.colorOverride + ")";
            }

            public /* synthetic */ Text(StringResource stringResource, ColorOverride colorOverride, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringResource, (i & 2) != 0 ? null : colorOverride);
            }

            public final StringResource getText() {
                return this.text;
            }

            public final ColorOverride getColorOverride() {
                return this.colorOverride;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(StringResource text, ColorOverride colorOverride) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.colorOverride = colorOverride;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CryptoTaxLotSelectionFooter.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState$TextContent$Text$ColorOverride;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "bentoColor", "Landroidx/compose/ui/graphics/Color;", "getBentoColor", "(Landroidx/compose/runtime/Composer;I)J", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class ColorOverride {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ ColorOverride[] $VALUES;
                public static final ColorOverride POSITIVE = new ColorOverride("POSITIVE", 0);
                public static final ColorOverride NEGATIVE = new ColorOverride("NEGATIVE", 1);

                /* compiled from: CryptoTaxLotSelectionFooter.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ColorOverride.values().length];
                        try {
                            iArr[ColorOverride.POSITIVE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ColorOverride.NEGATIVE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

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

                @JvmName
                public final long getBentoColor(Composer composer, int i) {
                    long jM21456getPositive0d7_KjU;
                    composer.startReplaceGroup(880936185);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(880936185, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState.TextContent.Text.ColorOverride.<get-bentoColor> (CryptoTaxLotSelectionFooter.kt:191)");
                    }
                    int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                    if (i2 == 1) {
                        composer.startReplaceGroup(471119937);
                        jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        if (i2 != 2) {
                            composer.startReplaceGroup(471117914);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(471121953);
                        jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return jM21456getPositive0d7_KjU;
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
}
