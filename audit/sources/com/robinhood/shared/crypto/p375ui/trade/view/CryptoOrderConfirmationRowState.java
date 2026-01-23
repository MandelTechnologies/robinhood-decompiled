package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCostDto;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFeeDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderConfirmationRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u001a\u001b\u001c\u001d\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState;", "", "startPrimaryTextContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;", "startSecondaryTextContent", "endPrimaryTextContent", "endSecondaryTextContent", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;)V", "getStartPrimaryTextContent", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;", "getStartSecondaryTextContent", "getEndPrimaryTextContent", "getEndSecondaryTextContent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TextContent", "IconContent", "TapAction", "TextStyleOverride", "ColorOverride", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderConfirmationRowState {
    public static final int $stable;
    private final TextContent endPrimaryTextContent;
    private final TextContent endSecondaryTextContent;
    private final TextContent startPrimaryTextContent;
    private final TextContent startSecondaryTextContent;

    static {
        int i = BentoIcon4.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i | i2 | i | i2 | i | i2 | i2;
    }

    public static /* synthetic */ CryptoOrderConfirmationRowState copy$default(CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState, TextContent textContent, TextContent textContent2, TextContent textContent3, TextContent textContent4, int i, Object obj) {
        if ((i & 1) != 0) {
            textContent = cryptoOrderConfirmationRowState.startPrimaryTextContent;
        }
        if ((i & 2) != 0) {
            textContent2 = cryptoOrderConfirmationRowState.startSecondaryTextContent;
        }
        if ((i & 4) != 0) {
            textContent3 = cryptoOrderConfirmationRowState.endPrimaryTextContent;
        }
        if ((i & 8) != 0) {
            textContent4 = cryptoOrderConfirmationRowState.endSecondaryTextContent;
        }
        return cryptoOrderConfirmationRowState.copy(textContent, textContent2, textContent3, textContent4);
    }

    /* renamed from: component1, reason: from getter */
    public final TextContent getStartPrimaryTextContent() {
        return this.startPrimaryTextContent;
    }

    /* renamed from: component2, reason: from getter */
    public final TextContent getStartSecondaryTextContent() {
        return this.startSecondaryTextContent;
    }

    /* renamed from: component3, reason: from getter */
    public final TextContent getEndPrimaryTextContent() {
        return this.endPrimaryTextContent;
    }

    /* renamed from: component4, reason: from getter */
    public final TextContent getEndSecondaryTextContent() {
        return this.endSecondaryTextContent;
    }

    public final CryptoOrderConfirmationRowState copy(TextContent startPrimaryTextContent, TextContent startSecondaryTextContent, TextContent endPrimaryTextContent, TextContent endSecondaryTextContent) {
        Intrinsics.checkNotNullParameter(startPrimaryTextContent, "startPrimaryTextContent");
        Intrinsics.checkNotNullParameter(endPrimaryTextContent, "endPrimaryTextContent");
        return new CryptoOrderConfirmationRowState(startPrimaryTextContent, startSecondaryTextContent, endPrimaryTextContent, endSecondaryTextContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderConfirmationRowState)) {
            return false;
        }
        CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState = (CryptoOrderConfirmationRowState) other;
        return Intrinsics.areEqual(this.startPrimaryTextContent, cryptoOrderConfirmationRowState.startPrimaryTextContent) && Intrinsics.areEqual(this.startSecondaryTextContent, cryptoOrderConfirmationRowState.startSecondaryTextContent) && Intrinsics.areEqual(this.endPrimaryTextContent, cryptoOrderConfirmationRowState.endPrimaryTextContent) && Intrinsics.areEqual(this.endSecondaryTextContent, cryptoOrderConfirmationRowState.endSecondaryTextContent);
    }

    public int hashCode() {
        int iHashCode = this.startPrimaryTextContent.hashCode() * 31;
        TextContent textContent = this.startSecondaryTextContent;
        int iHashCode2 = (((iHashCode + (textContent == null ? 0 : textContent.hashCode())) * 31) + this.endPrimaryTextContent.hashCode()) * 31;
        TextContent textContent2 = this.endSecondaryTextContent;
        return iHashCode2 + (textContent2 != null ? textContent2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderConfirmationRowState(startPrimaryTextContent=" + this.startPrimaryTextContent + ", startSecondaryTextContent=" + this.startSecondaryTextContent + ", endPrimaryTextContent=" + this.endPrimaryTextContent + ", endSecondaryTextContent=" + this.endSecondaryTextContent + ")";
    }

    public CryptoOrderConfirmationRowState(TextContent startPrimaryTextContent, TextContent textContent, TextContent endPrimaryTextContent, TextContent textContent2) {
        Intrinsics.checkNotNullParameter(startPrimaryTextContent, "startPrimaryTextContent");
        Intrinsics.checkNotNullParameter(endPrimaryTextContent, "endPrimaryTextContent");
        this.startPrimaryTextContent = startPrimaryTextContent;
        this.startSecondaryTextContent = textContent;
        this.endPrimaryTextContent = endPrimaryTextContent;
        this.endSecondaryTextContent = textContent2;
    }

    public /* synthetic */ CryptoOrderConfirmationRowState(TextContent textContent, TextContent textContent2, TextContent textContent3, TextContent textContent4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textContent, (i & 2) != 0 ? null : textContent2, textContent3, (i & 8) != 0 ? null : textContent4);
    }

    public final TextContent getStartPrimaryTextContent() {
        return this.startPrimaryTextContent;
    }

    public final TextContent getStartSecondaryTextContent() {
        return this.startSecondaryTextContent;
    }

    public final TextContent getEndPrimaryTextContent() {
        return this.endPrimaryTextContent;
    }

    public final TextContent getEndSecondaryTextContent() {
        return this.endSecondaryTextContent;
    }

    /* compiled from: CryptoOrderConfirmationRow.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "textColorOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;", "trailingIcon", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$IconContent;", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "textStyleOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextStyleOverride;", "fontWeightOverride", "Landroidx/compose/ui/text/font/FontWeight;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$IconContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextStyleOverride;Landroidx/compose/ui/text/font/FontWeight;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getTextColorOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;", "getTrailingIcon", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$IconContent;", "getTapAction", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "getTextStyleOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextStyleOverride;", "getFontWeightOverride", "()Landroidx/compose/ui/text/font/FontWeight;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TextContent {
        public static final int $stable = BentoIcon4.$stable | StringResource.$stable;
        private final FontWeight fontWeightOverride;
        private final TapAction tapAction;
        private final StringResource text;
        private final ColorOverride textColorOverride;
        private final TextStyleOverride textStyleOverride;
        private final IconContent trailingIcon;

        public static /* synthetic */ TextContent copy$default(TextContent textContent, StringResource stringResource, ColorOverride colorOverride, IconContent iconContent, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeight, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = textContent.text;
            }
            if ((i & 2) != 0) {
                colorOverride = textContent.textColorOverride;
            }
            if ((i & 4) != 0) {
                iconContent = textContent.trailingIcon;
            }
            if ((i & 8) != 0) {
                tapAction = textContent.tapAction;
            }
            if ((i & 16) != 0) {
                textStyleOverride = textContent.textStyleOverride;
            }
            if ((i & 32) != 0) {
                fontWeight = textContent.fontWeightOverride;
            }
            TextStyleOverride textStyleOverride2 = textStyleOverride;
            FontWeight fontWeight2 = fontWeight;
            return textContent.copy(stringResource, colorOverride, iconContent, tapAction, textStyleOverride2, fontWeight2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorOverride getTextColorOverride() {
            return this.textColorOverride;
        }

        /* renamed from: component3, reason: from getter */
        public final IconContent getTrailingIcon() {
            return this.trailingIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final TapAction getTapAction() {
            return this.tapAction;
        }

        /* renamed from: component5, reason: from getter */
        public final TextStyleOverride getTextStyleOverride() {
            return this.textStyleOverride;
        }

        /* renamed from: component6, reason: from getter */
        public final FontWeight getFontWeightOverride() {
            return this.fontWeightOverride;
        }

        public final TextContent copy(StringResource text, ColorOverride textColorOverride, IconContent trailingIcon, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeightOverride) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextContent(text, textColorOverride, trailingIcon, tapAction, textStyleOverride, fontWeightOverride);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextContent)) {
                return false;
            }
            TextContent textContent = (TextContent) other;
            return Intrinsics.areEqual(this.text, textContent.text) && this.textColorOverride == textContent.textColorOverride && Intrinsics.areEqual(this.trailingIcon, textContent.trailingIcon) && Intrinsics.areEqual(this.tapAction, textContent.tapAction) && this.textStyleOverride == textContent.textStyleOverride && Intrinsics.areEqual(this.fontWeightOverride, textContent.fontWeightOverride);
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            ColorOverride colorOverride = this.textColorOverride;
            int iHashCode2 = (iHashCode + (colorOverride == null ? 0 : colorOverride.hashCode())) * 31;
            IconContent iconContent = this.trailingIcon;
            int iHashCode3 = (iHashCode2 + (iconContent == null ? 0 : iconContent.hashCode())) * 31;
            TapAction tapAction = this.tapAction;
            int iHashCode4 = (iHashCode3 + (tapAction == null ? 0 : tapAction.hashCode())) * 31;
            TextStyleOverride textStyleOverride = this.textStyleOverride;
            int iHashCode5 = (iHashCode4 + (textStyleOverride == null ? 0 : textStyleOverride.hashCode())) * 31;
            FontWeight fontWeight = this.fontWeightOverride;
            return iHashCode5 + (fontWeight != null ? fontWeight.hashCode() : 0);
        }

        public String toString() {
            return "TextContent(text=" + this.text + ", textColorOverride=" + this.textColorOverride + ", trailingIcon=" + this.trailingIcon + ", tapAction=" + this.tapAction + ", textStyleOverride=" + this.textStyleOverride + ", fontWeightOverride=" + this.fontWeightOverride + ")";
        }

        public TextContent(StringResource text, ColorOverride colorOverride, IconContent iconContent, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeight) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.textColorOverride = colorOverride;
            this.trailingIcon = iconContent;
            this.tapAction = tapAction;
            this.textStyleOverride = textStyleOverride;
            this.fontWeightOverride = fontWeight;
        }

        public /* synthetic */ TextContent(StringResource stringResource, ColorOverride colorOverride, IconContent iconContent, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : colorOverride, (i & 4) != 0 ? null : iconContent, (i & 8) != 0 ? null : tapAction, (i & 16) != 0 ? null : textStyleOverride, (i & 32) != 0 ? null : fontWeight);
        }

        public final StringResource getText() {
            return this.text;
        }

        public final ColorOverride getTextColorOverride() {
            return this.textColorOverride;
        }

        public final IconContent getTrailingIcon() {
            return this.trailingIcon;
        }

        public final TapAction getTapAction() {
            return this.tapAction;
        }

        public final TextStyleOverride getTextStyleOverride() {
            return this.textStyleOverride;
        }

        public final FontWeight getFontWeightOverride() {
            return this.fontWeightOverride;
        }
    }

    /* compiled from: CryptoOrderConfirmationRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$IconContent;", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "colorOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getColorOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IconContent {
        public static final int $stable = BentoIcon4.$stable;
        private final ColorOverride colorOverride;
        private final BentoIcon4 icon;

        public static /* synthetic */ IconContent copy$default(IconContent iconContent, BentoIcon4 bentoIcon4, ColorOverride colorOverride, int i, Object obj) {
            if ((i & 1) != 0) {
                bentoIcon4 = iconContent.icon;
            }
            if ((i & 2) != 0) {
                colorOverride = iconContent.colorOverride;
            }
            return iconContent.copy(bentoIcon4, colorOverride);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorOverride getColorOverride() {
            return this.colorOverride;
        }

        public final IconContent copy(BentoIcon4 icon, ColorOverride colorOverride) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new IconContent(icon, colorOverride);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconContent)) {
                return false;
            }
            IconContent iconContent = (IconContent) other;
            return Intrinsics.areEqual(this.icon, iconContent.icon) && this.colorOverride == iconContent.colorOverride;
        }

        public int hashCode() {
            int iHashCode = this.icon.hashCode() * 31;
            ColorOverride colorOverride = this.colorOverride;
            return iHashCode + (colorOverride == null ? 0 : colorOverride.hashCode());
        }

        public String toString() {
            return "IconContent(icon=" + this.icon + ", colorOverride=" + this.colorOverride + ")";
        }

        public IconContent(BentoIcon4 icon, ColorOverride colorOverride) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.colorOverride = colorOverride;
        }

        public /* synthetic */ IconContent(BentoIcon4 bentoIcon4, ColorOverride colorOverride, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bentoIcon4, (i & 2) != 0 ? null : colorOverride);
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final ColorOverride getColorOverride() {
            return this.colorOverride;
        }
    }

    /* compiled from: CryptoOrderConfirmationRow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "", "ShowCostDetailBottomSheet", "ShowFeeDefinitionBottomSheet", "ShowTradeBonusBottomSheet", "ShowPerpetualOrderDetailFees", "Tokenization", "Recurring", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Recurring;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowCostDetailBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowPerpetualOrderDetailFees;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TapAction {

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowCostDetailBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowCostDetailBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowCostDetailBottomSheet INSTANCE = new ShowCostDetailBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowCostDetailBottomSheet);
            }

            public int hashCode() {
                return 46093041;
            }

            public String toString() {
                return "ShowCostDetailBottomSheet";
            }

            private ShowCostDetailBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowFeeDefinitionBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowFeeDefinitionBottomSheet INSTANCE = new ShowFeeDefinitionBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowFeeDefinitionBottomSheet);
            }

            public int hashCode() {
                return 1110762112;
            }

            public String toString() {
                return "ShowFeeDefinitionBottomSheet";
            }

            private ShowFeeDefinitionBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "isEstimate", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowTradeBonusBottomSheet implements TapAction {
            public static final int $stable = 0;
            private final boolean isEstimate;

            public static /* synthetic */ ShowTradeBonusBottomSheet copy$default(ShowTradeBonusBottomSheet showTradeBonusBottomSheet, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = showTradeBonusBottomSheet.isEstimate;
                }
                return showTradeBonusBottomSheet.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsEstimate() {
                return this.isEstimate;
            }

            public final ShowTradeBonusBottomSheet copy(boolean isEstimate) {
                return new ShowTradeBonusBottomSheet(isEstimate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowTradeBonusBottomSheet) && this.isEstimate == ((ShowTradeBonusBottomSheet) other).isEstimate;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEstimate);
            }

            public String toString() {
                return "ShowTradeBonusBottomSheet(isEstimate=" + this.isEstimate + ")";
            }

            public ShowTradeBonusBottomSheet(boolean z) {
                this.isEstimate = z;
            }

            public final boolean isEstimate() {
                return this.isEstimate;
            }
        }

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$ShowPerpetualOrderDetailFees;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowPerpetualOrderDetailFees implements TapAction {
            public static final int $stable = 0;
            public static final ShowPerpetualOrderDetailFees INSTANCE = new ShowPerpetualOrderDetailFees();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowPerpetualOrderDetailFees);
            }

            public int hashCode() {
                return -751090125;
            }

            public String toString() {
                return "ShowPerpetualOrderDetailFees";
            }

            private ShowPerpetualOrderDetailFees() {
            }
        }

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "ShowTokenizationFxFeeSheet", "ShowTokenizationEstimatedTotalCostSheet", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization$ShowTokenizationEstimatedTotalCostSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization$ShowTokenizationFxFeeSheet;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Tokenization extends TapAction {
            BottomSheetTypeDto.TypeDto getData();

            String getLoggingIdentifier();

            /* compiled from: CryptoOrderConfirmationRow.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization$ShowTokenizationFxFeeSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization;", "value", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;)V", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationFxFee;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationFxFee;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowTokenizationFxFeeSheet implements Tokenization {
                public static final int $stable = 8;
                private final TokenizationFxFeeDto value;

                public static /* synthetic */ ShowTokenizationFxFeeSheet copy$default(ShowTokenizationFxFeeSheet showTokenizationFxFeeSheet, TokenizationFxFeeDto tokenizationFxFeeDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        tokenizationFxFeeDto = showTokenizationFxFeeSheet.value;
                    }
                    return showTokenizationFxFeeSheet.copy(tokenizationFxFeeDto);
                }

                /* renamed from: component1, reason: from getter */
                public final TokenizationFxFeeDto getValue() {
                    return this.value;
                }

                public final ShowTokenizationFxFeeSheet copy(TokenizationFxFeeDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new ShowTokenizationFxFeeSheet(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowTokenizationFxFeeSheet) && Intrinsics.areEqual(this.value, ((ShowTokenizationFxFeeSheet) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowTokenizationFxFeeSheet(value=" + this.value + ")";
                }

                public ShowTokenizationFxFeeSheet(TokenizationFxFeeDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final TokenizationFxFeeDto getValue() {
                    return this.value;
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowState.TapAction.Tokenization
                public BottomSheetTypeDto.TypeDto.TokenizationFxFee getData() {
                    return new BottomSheetTypeDto.TypeDto.TokenizationFxFee(this.value);
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowState.TapAction.Tokenization
                public String getLoggingIdentifier() {
                    return "fx_fees";
                }
            }

            /* compiled from: CryptoOrderConfirmationRow.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization$ShowTokenizationEstimatedTotalCostSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Tokenization;", "value", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;)V", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedTotalCost;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedTotalCost;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowTokenizationEstimatedTotalCostSheet implements Tokenization {
                public static final int $stable = 8;
                private final TokenizationEstimatedTotalCostDto value;

                public static /* synthetic */ ShowTokenizationEstimatedTotalCostSheet copy$default(ShowTokenizationEstimatedTotalCostSheet showTokenizationEstimatedTotalCostSheet, TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        tokenizationEstimatedTotalCostDto = showTokenizationEstimatedTotalCostSheet.value;
                    }
                    return showTokenizationEstimatedTotalCostSheet.copy(tokenizationEstimatedTotalCostDto);
                }

                /* renamed from: component1, reason: from getter */
                public final TokenizationEstimatedTotalCostDto getValue() {
                    return this.value;
                }

                public final ShowTokenizationEstimatedTotalCostSheet copy(TokenizationEstimatedTotalCostDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new ShowTokenizationEstimatedTotalCostSheet(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowTokenizationEstimatedTotalCostSheet) && Intrinsics.areEqual(this.value, ((ShowTokenizationEstimatedTotalCostSheet) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowTokenizationEstimatedTotalCostSheet(value=" + this.value + ")";
                }

                public ShowTokenizationEstimatedTotalCostSheet(TokenizationEstimatedTotalCostDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final TokenizationEstimatedTotalCostDto getValue() {
                    return this.value;
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowState.TapAction.Tokenization
                public BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost getData() {
                    return new BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost(this.value);
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowState.TapAction.Tokenization
                public String getLoggingIdentifier() {
                    return "estimated_total_cost";
                }
            }
        }

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Recurring;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "ShowFees", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Recurring$ShowFees;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Recurring extends TapAction {

            /* compiled from: CryptoOrderConfirmationRow.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Recurring$ShowFees;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction$Recurring;", "feePercentageFormatted", "", "minFeeAmountFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeePercentageFormatted", "()Ljava/lang/String;", "getMinFeeAmountFormatted", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowFees implements Recurring {
                public static final int $stable = 0;
                private final String feePercentageFormatted;
                private final String minFeeAmountFormatted;

                public static /* synthetic */ ShowFees copy$default(ShowFees showFees, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = showFees.feePercentageFormatted;
                    }
                    if ((i & 2) != 0) {
                        str2 = showFees.minFeeAmountFormatted;
                    }
                    return showFees.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getFeePercentageFormatted() {
                    return this.feePercentageFormatted;
                }

                /* renamed from: component2, reason: from getter */
                public final String getMinFeeAmountFormatted() {
                    return this.minFeeAmountFormatted;
                }

                public final ShowFees copy(String feePercentageFormatted, String minFeeAmountFormatted) {
                    Intrinsics.checkNotNullParameter(feePercentageFormatted, "feePercentageFormatted");
                    Intrinsics.checkNotNullParameter(minFeeAmountFormatted, "minFeeAmountFormatted");
                    return new ShowFees(feePercentageFormatted, minFeeAmountFormatted);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ShowFees)) {
                        return false;
                    }
                    ShowFees showFees = (ShowFees) other;
                    return Intrinsics.areEqual(this.feePercentageFormatted, showFees.feePercentageFormatted) && Intrinsics.areEqual(this.minFeeAmountFormatted, showFees.minFeeAmountFormatted);
                }

                public int hashCode() {
                    return (this.feePercentageFormatted.hashCode() * 31) + this.minFeeAmountFormatted.hashCode();
                }

                public String toString() {
                    return "ShowFees(feePercentageFormatted=" + this.feePercentageFormatted + ", minFeeAmountFormatted=" + this.minFeeAmountFormatted + ")";
                }

                public ShowFees(String feePercentageFormatted, String minFeeAmountFormatted) {
                    Intrinsics.checkNotNullParameter(feePercentageFormatted, "feePercentageFormatted");
                    Intrinsics.checkNotNullParameter(minFeeAmountFormatted, "minFeeAmountFormatted");
                    this.feePercentageFormatted = feePercentageFormatted;
                    this.minFeeAmountFormatted = minFeeAmountFormatted;
                }

                public final String getFeePercentageFormatted() {
                    return this.feePercentageFormatted;
                }

                public final String getMinFeeAmountFormatted() {
                    return this.minFeeAmountFormatted;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderConfirmationRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextStyleOverride;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_S_TRADE_BONUS_GRADIENT", "TEXT_M_TRADE_BONUS_GRADIENT", "bentoTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getBentoTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TextStyleOverride {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TextStyleOverride[] $VALUES;
        public static final TextStyleOverride TEXT_S_TRADE_BONUS_GRADIENT = new TextStyleOverride("TEXT_S_TRADE_BONUS_GRADIENT", 0);
        public static final TextStyleOverride TEXT_M_TRADE_BONUS_GRADIENT = new TextStyleOverride("TEXT_M_TRADE_BONUS_GRADIENT", 1);

        /* compiled from: CryptoOrderConfirmationRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextStyleOverride.values().length];
                try {
                    iArr[TextStyleOverride.TEXT_S_TRADE_BONUS_GRADIENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextStyleOverride.TEXT_M_TRADE_BONUS_GRADIENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ TextStyleOverride[] $values() {
            return new TextStyleOverride[]{TEXT_S_TRADE_BONUS_GRADIENT, TEXT_M_TRADE_BONUS_GRADIENT};
        }

        public static EnumEntries<TextStyleOverride> getEntries() {
            return $ENTRIES;
        }

        private TextStyleOverride(String str, int i) {
        }

        static {
            TextStyleOverride[] textStyleOverrideArr$values = $values();
            $VALUES = textStyleOverrideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(textStyleOverrideArr$values);
        }

        @JvmName
        public final TextStyle getBentoTextStyle(Composer composer, int i) {
            TextStyle textStyleM7654copyNs73l9s$default;
            composer.startReplaceGroup(485960532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(485960532, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowState.TextStyleOverride.<get-bentoTextStyle> (CryptoOrderConfirmationRow.kt:191)");
            }
            BentoColor bentoColor = BentoColor.INSTANCE;
            Brush brushM6678linearGradientmHitzGk$default = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoColor.m21236getDayPrime0d7_KjU()), Color.m6701boximpl(bentoColor.m21236getDayPrime0d7_KjU())}), 0L, 0L, 0, 14, (Object) null);
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-1143349809);
                textStyleM7654copyNs73l9s$default = TextStyle.m7654copyNs73l9s$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), brushM6678linearGradientmHitzGk$default, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                composer.endReplaceGroup();
            } else {
                if (i2 != 2) {
                    composer.startReplaceGroup(-1143353286);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1143345585);
                textStyleM7654copyNs73l9s$default = TextStyle.m7654copyNs73l9s$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), brushM6678linearGradientmHitzGk$default, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return textStyleM7654copyNs73l9s$default;
        }

        public static TextStyleOverride valueOf(String str) {
            return (TextStyleOverride) Enum.valueOf(TextStyleOverride.class, str);
        }

        public static TextStyleOverride[] values() {
            return (TextStyleOverride[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderConfirmationRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$ColorOverride;", "", "<init>", "(Ljava/lang/String;I)V", "DAY_PRIME", "FG_2", "bentoColor", "Landroidx/compose/ui/graphics/Color;", "getBentoColor", "(Landroidx/compose/runtime/Composer;I)J", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorOverride {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ColorOverride[] $VALUES;
        public static final ColorOverride DAY_PRIME = new ColorOverride("DAY_PRIME", 0);
        public static final ColorOverride FG_2 = new ColorOverride("FG_2", 1);

        private static final /* synthetic */ ColorOverride[] $values() {
            return new ColorOverride[]{DAY_PRIME, FG_2};
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
            long jM21426getFg20d7_KjU;
            composer.startReplaceGroup(125029652);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(125029652, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowState.ColorOverride.<get-bentoColor> (CryptoOrderConfirmationRow.kt:214)");
            }
            if (this == DAY_PRIME) {
                jM21426getFg20d7_KjU = BentoColor.INSTANCE.m21236getDayPrime0d7_KjU();
            } else {
                if (this != FG_2) {
                    throw new NoWhenBranchMatchedException();
                }
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21426getFg20d7_KjU;
        }

        public static ColorOverride valueOf(String str) {
            return (ColorOverride) Enum.valueOf(ColorOverride.class, str);
        }

        public static ColorOverride[] values() {
            return (ColorOverride[]) $VALUES.clone();
        }
    }
}
