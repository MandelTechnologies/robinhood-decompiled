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
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedPriceDto;
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
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderReviewRow.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0007789:;<=By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u007f\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006>"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "", "startPrimaryTextContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;", "endPrimaryTextContent", "startPrimaryTextAutomationTestTag", "", "secondaryRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$SecondaryTextRow;", "tertiaryTextButton", "includeBottomDivider", "", "verticalPaddingOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$VerticalPadding;", "enabled", "rowTapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "trailingIcon", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;ZLcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$VerticalPadding;ZLcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;)V", "getStartPrimaryTextContent", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;", "getEndPrimaryTextContent", "getStartPrimaryTextAutomationTestTag", "()Ljava/lang/String;", "getSecondaryRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getTertiaryTextButton", "getIncludeBottomDivider", "()Z", "getVerticalPaddingOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$VerticalPadding;", "getEnabled", "getRowTapAction", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "getTrailingIcon", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "SecondaryTextRow", "TextContent", "IconContent", "TapAction", "TextStyleOverride", "ColorOverride", "VerticalPadding", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderReviewRowState {
    public static final int $stable;
    private final boolean enabled;
    private final TextContent endPrimaryTextContent;
    private final boolean includeBottomDivider;
    private final TapAction rowTapAction;
    private final ImmutableList<SecondaryTextRow> secondaryRows;
    private final String startPrimaryTextAutomationTestTag;
    private final TextContent startPrimaryTextContent;
    private final TextContent tertiaryTextButton;
    private final IconContent trailingIcon;
    private final VerticalPadding verticalPaddingOverride;

    static {
        int i = BentoIcon4.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i | i2 | i | i2 | i | i2 | i | i2 | i2;
    }

    public static /* synthetic */ CryptoOrderReviewRowState copy$default(CryptoOrderReviewRowState cryptoOrderReviewRowState, TextContent textContent, TextContent textContent2, String str, ImmutableList immutableList, TextContent textContent3, boolean z, VerticalPadding verticalPadding, boolean z2, TapAction tapAction, IconContent iconContent, int i, Object obj) {
        if ((i & 1) != 0) {
            textContent = cryptoOrderReviewRowState.startPrimaryTextContent;
        }
        if ((i & 2) != 0) {
            textContent2 = cryptoOrderReviewRowState.endPrimaryTextContent;
        }
        if ((i & 4) != 0) {
            str = cryptoOrderReviewRowState.startPrimaryTextAutomationTestTag;
        }
        if ((i & 8) != 0) {
            immutableList = cryptoOrderReviewRowState.secondaryRows;
        }
        if ((i & 16) != 0) {
            textContent3 = cryptoOrderReviewRowState.tertiaryTextButton;
        }
        if ((i & 32) != 0) {
            z = cryptoOrderReviewRowState.includeBottomDivider;
        }
        if ((i & 64) != 0) {
            verticalPadding = cryptoOrderReviewRowState.verticalPaddingOverride;
        }
        if ((i & 128) != 0) {
            z2 = cryptoOrderReviewRowState.enabled;
        }
        if ((i & 256) != 0) {
            tapAction = cryptoOrderReviewRowState.rowTapAction;
        }
        if ((i & 512) != 0) {
            iconContent = cryptoOrderReviewRowState.trailingIcon;
        }
        TapAction tapAction2 = tapAction;
        IconContent iconContent2 = iconContent;
        VerticalPadding verticalPadding2 = verticalPadding;
        boolean z3 = z2;
        TextContent textContent4 = textContent3;
        boolean z4 = z;
        return cryptoOrderReviewRowState.copy(textContent, textContent2, str, immutableList, textContent4, z4, verticalPadding2, z3, tapAction2, iconContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextContent getStartPrimaryTextContent() {
        return this.startPrimaryTextContent;
    }

    /* renamed from: component10, reason: from getter */
    public final IconContent getTrailingIcon() {
        return this.trailingIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextContent getEndPrimaryTextContent() {
        return this.endPrimaryTextContent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStartPrimaryTextAutomationTestTag() {
        return this.startPrimaryTextAutomationTestTag;
    }

    public final ImmutableList<SecondaryTextRow> component4() {
        return this.secondaryRows;
    }

    /* renamed from: component5, reason: from getter */
    public final TextContent getTertiaryTextButton() {
        return this.tertiaryTextButton;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    /* renamed from: component7, reason: from getter */
    public final VerticalPadding getVerticalPaddingOverride() {
        return this.verticalPaddingOverride;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component9, reason: from getter */
    public final TapAction getRowTapAction() {
        return this.rowTapAction;
    }

    public final CryptoOrderReviewRowState copy(TextContent startPrimaryTextContent, TextContent endPrimaryTextContent, String startPrimaryTextAutomationTestTag, ImmutableList<SecondaryTextRow> secondaryRows, TextContent tertiaryTextButton, boolean includeBottomDivider, VerticalPadding verticalPaddingOverride, boolean enabled, TapAction rowTapAction, IconContent trailingIcon) {
        Intrinsics.checkNotNullParameter(startPrimaryTextContent, "startPrimaryTextContent");
        Intrinsics.checkNotNullParameter(endPrimaryTextContent, "endPrimaryTextContent");
        return new CryptoOrderReviewRowState(startPrimaryTextContent, endPrimaryTextContent, startPrimaryTextAutomationTestTag, secondaryRows, tertiaryTextButton, includeBottomDivider, verticalPaddingOverride, enabled, rowTapAction, trailingIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderReviewRowState)) {
            return false;
        }
        CryptoOrderReviewRowState cryptoOrderReviewRowState = (CryptoOrderReviewRowState) other;
        return Intrinsics.areEqual(this.startPrimaryTextContent, cryptoOrderReviewRowState.startPrimaryTextContent) && Intrinsics.areEqual(this.endPrimaryTextContent, cryptoOrderReviewRowState.endPrimaryTextContent) && Intrinsics.areEqual(this.startPrimaryTextAutomationTestTag, cryptoOrderReviewRowState.startPrimaryTextAutomationTestTag) && Intrinsics.areEqual(this.secondaryRows, cryptoOrderReviewRowState.secondaryRows) && Intrinsics.areEqual(this.tertiaryTextButton, cryptoOrderReviewRowState.tertiaryTextButton) && this.includeBottomDivider == cryptoOrderReviewRowState.includeBottomDivider && this.verticalPaddingOverride == cryptoOrderReviewRowState.verticalPaddingOverride && this.enabled == cryptoOrderReviewRowState.enabled && Intrinsics.areEqual(this.rowTapAction, cryptoOrderReviewRowState.rowTapAction) && Intrinsics.areEqual(this.trailingIcon, cryptoOrderReviewRowState.trailingIcon);
    }

    public int hashCode() {
        int iHashCode = ((this.startPrimaryTextContent.hashCode() * 31) + this.endPrimaryTextContent.hashCode()) * 31;
        String str = this.startPrimaryTextAutomationTestTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImmutableList<SecondaryTextRow> immutableList = this.secondaryRows;
        int iHashCode3 = (iHashCode2 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        TextContent textContent = this.tertiaryTextButton;
        int iHashCode4 = (((iHashCode3 + (textContent == null ? 0 : textContent.hashCode())) * 31) + Boolean.hashCode(this.includeBottomDivider)) * 31;
        VerticalPadding verticalPadding = this.verticalPaddingOverride;
        int iHashCode5 = (((iHashCode4 + (verticalPadding == null ? 0 : verticalPadding.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31;
        TapAction tapAction = this.rowTapAction;
        int iHashCode6 = (iHashCode5 + (tapAction == null ? 0 : tapAction.hashCode())) * 31;
        IconContent iconContent = this.trailingIcon;
        return iHashCode6 + (iconContent != null ? iconContent.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderReviewRowState(startPrimaryTextContent=" + this.startPrimaryTextContent + ", endPrimaryTextContent=" + this.endPrimaryTextContent + ", startPrimaryTextAutomationTestTag=" + this.startPrimaryTextAutomationTestTag + ", secondaryRows=" + this.secondaryRows + ", tertiaryTextButton=" + this.tertiaryTextButton + ", includeBottomDivider=" + this.includeBottomDivider + ", verticalPaddingOverride=" + this.verticalPaddingOverride + ", enabled=" + this.enabled + ", rowTapAction=" + this.rowTapAction + ", trailingIcon=" + this.trailingIcon + ")";
    }

    public CryptoOrderReviewRowState(TextContent startPrimaryTextContent, TextContent endPrimaryTextContent, String str, ImmutableList<SecondaryTextRow> immutableList, TextContent textContent, boolean z, VerticalPadding verticalPadding, boolean z2, TapAction tapAction, IconContent iconContent) {
        Intrinsics.checkNotNullParameter(startPrimaryTextContent, "startPrimaryTextContent");
        Intrinsics.checkNotNullParameter(endPrimaryTextContent, "endPrimaryTextContent");
        this.startPrimaryTextContent = startPrimaryTextContent;
        this.endPrimaryTextContent = endPrimaryTextContent;
        this.startPrimaryTextAutomationTestTag = str;
        this.secondaryRows = immutableList;
        this.tertiaryTextButton = textContent;
        this.includeBottomDivider = z;
        this.verticalPaddingOverride = verticalPadding;
        this.enabled = z2;
        this.rowTapAction = tapAction;
        this.trailingIcon = iconContent;
    }

    public /* synthetic */ CryptoOrderReviewRowState(TextContent textContent, TextContent textContent2, String str, ImmutableList immutableList, TextContent textContent3, boolean z, VerticalPadding verticalPadding, boolean z2, TapAction tapAction, IconContent iconContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textContent, textContent2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : immutableList, (i & 16) != 0 ? null : textContent3, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : verticalPadding, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? null : tapAction, (i & 512) != 0 ? null : iconContent);
    }

    public final TextContent getStartPrimaryTextContent() {
        return this.startPrimaryTextContent;
    }

    public final TextContent getEndPrimaryTextContent() {
        return this.endPrimaryTextContent;
    }

    public final String getStartPrimaryTextAutomationTestTag() {
        return this.startPrimaryTextAutomationTestTag;
    }

    public final ImmutableList<SecondaryTextRow> getSecondaryRows() {
        return this.secondaryRows;
    }

    public final TextContent getTertiaryTextButton() {
        return this.tertiaryTextButton;
    }

    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    public final VerticalPadding getVerticalPaddingOverride() {
        return this.verticalPaddingOverride;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final TapAction getRowTapAction() {
        return this.rowTapAction;
    }

    public final IconContent getTrailingIcon() {
        return this.trailingIcon;
    }

    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$SecondaryTextRow;", "", "start", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;", "end", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;)V", "getStart", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;", "getEnd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SecondaryTextRow {
        public static final int $stable;
        private final TextContent end;
        private final TextContent start;

        static {
            int i = BentoIcon4.$stable;
            int i2 = StringResource.$stable;
            $stable = i | i | i2 | i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SecondaryTextRow() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SecondaryTextRow copy$default(SecondaryTextRow secondaryTextRow, TextContent textContent, TextContent textContent2, int i, Object obj) {
            if ((i & 1) != 0) {
                textContent = secondaryTextRow.start;
            }
            if ((i & 2) != 0) {
                textContent2 = secondaryTextRow.end;
            }
            return secondaryTextRow.copy(textContent, textContent2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextContent getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final TextContent getEnd() {
            return this.end;
        }

        public final SecondaryTextRow copy(TextContent start, TextContent end) {
            return new SecondaryTextRow(start, end);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecondaryTextRow)) {
                return false;
            }
            SecondaryTextRow secondaryTextRow = (SecondaryTextRow) other;
            return Intrinsics.areEqual(this.start, secondaryTextRow.start) && Intrinsics.areEqual(this.end, secondaryTextRow.end);
        }

        public int hashCode() {
            TextContent textContent = this.start;
            int iHashCode = (textContent == null ? 0 : textContent.hashCode()) * 31;
            TextContent textContent2 = this.end;
            return iHashCode + (textContent2 != null ? textContent2.hashCode() : 0);
        }

        public String toString() {
            return "SecondaryTextRow(start=" + this.start + ", end=" + this.end + ")";
        }

        public SecondaryTextRow(TextContent textContent, TextContent textContent2) {
            this.start = textContent;
            this.end = textContent2;
        }

        public /* synthetic */ SecondaryTextRow(TextContent textContent, TextContent textContent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textContent, (i & 2) != 0 ? null : textContent2);
        }

        public final TextContent getStart() {
            return this.start;
        }

        public final TextContent getEnd() {
            return this.end;
        }
    }

    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001e¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "textColorOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;", "trailingIcon", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "textStyleOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextStyleOverride;", "fontWeightOverride", "Landroidx/compose/ui/text/font/FontWeight;", "isLoading", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextStyleOverride;Landroidx/compose/ui/text/font/FontWeight;Z)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getTextColorOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;", "getTrailingIcon", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;", "getTapAction", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "getTextStyleOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextStyleOverride;", "getFontWeightOverride", "()Landroidx/compose/ui/text/font/FontWeight;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TextContent {
        public static final int $stable = BentoIcon4.$stable | StringResource.$stable;
        private final FontWeight fontWeightOverride;
        private final boolean isLoading;
        private final TapAction tapAction;
        private final StringResource text;
        private final ColorOverride textColorOverride;
        private final TextStyleOverride textStyleOverride;
        private final IconContent trailingIcon;

        public static /* synthetic */ TextContent copy$default(TextContent textContent, StringResource stringResource, ColorOverride colorOverride, IconContent iconContent, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeight, boolean z, int i, Object obj) {
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
            if ((i & 64) != 0) {
                z = textContent.isLoading;
            }
            FontWeight fontWeight2 = fontWeight;
            boolean z2 = z;
            TextStyleOverride textStyleOverride2 = textStyleOverride;
            IconContent iconContent2 = iconContent;
            return textContent.copy(stringResource, colorOverride, iconContent2, tapAction, textStyleOverride2, fontWeight2, z2);
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

        /* renamed from: component7, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final TextContent copy(StringResource text, ColorOverride textColorOverride, IconContent trailingIcon, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeightOverride, boolean isLoading) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextContent(text, textColorOverride, trailingIcon, tapAction, textStyleOverride, fontWeightOverride, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextContent)) {
                return false;
            }
            TextContent textContent = (TextContent) other;
            return Intrinsics.areEqual(this.text, textContent.text) && this.textColorOverride == textContent.textColorOverride && Intrinsics.areEqual(this.trailingIcon, textContent.trailingIcon) && Intrinsics.areEqual(this.tapAction, textContent.tapAction) && this.textStyleOverride == textContent.textStyleOverride && Intrinsics.areEqual(this.fontWeightOverride, textContent.fontWeightOverride) && this.isLoading == textContent.isLoading;
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
            return ((iHashCode5 + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "TextContent(text=" + this.text + ", textColorOverride=" + this.textColorOverride + ", trailingIcon=" + this.trailingIcon + ", tapAction=" + this.tapAction + ", textStyleOverride=" + this.textStyleOverride + ", fontWeightOverride=" + this.fontWeightOverride + ", isLoading=" + this.isLoading + ")";
        }

        public TextContent(StringResource text, ColorOverride colorOverride, IconContent iconContent, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeight, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.textColorOverride = colorOverride;
            this.trailingIcon = iconContent;
            this.tapAction = tapAction;
            this.textStyleOverride = textStyleOverride;
            this.fontWeightOverride = fontWeight;
            this.isLoading = z;
        }

        public /* synthetic */ TextContent(StringResource stringResource, ColorOverride colorOverride, IconContent iconContent, TapAction tapAction, TextStyleOverride textStyleOverride, FontWeight fontWeight, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : colorOverride, (i & 4) != 0 ? null : iconContent, (i & 8) != 0 ? null : tapAction, (i & 16) != 0 ? null : textStyleOverride, (i & 32) != 0 ? null : fontWeight, (i & 64) != 0 ? false : z);
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

        public final boolean isLoading() {
            return this.isLoading;
        }
    }

    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "colorOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getColorOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "", "EditPrice", "ShowMarketPriceBottomSheet", "ShowOrderTypeEducation", "ShowTradeBonusBottomSheet", "ShowSpreadBottomSheet", "ShowFeeDefinitionBottomSheet", "ShowEstimatedLiquidationPriceBottomSheet", "ShowEstimatedQuantityBottomSheet", "ShowPerpetualsEstimatedFeesBottomSheet", "ShowPerpetualsEstimatedMarginRequiredScreen", "QuickTrade", "Tokenization", "Recurring", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$EditPrice;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$QuickTrade;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$QuickTrade$ShowEduPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowEstimatedLiquidationPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowEstimatedQuantityBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowMarketPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowOrderTypeEducation;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowPerpetualsEstimatedFeesBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowPerpetualsEstimatedMarginRequiredScreen;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowSpreadBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TapAction {

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$EditPrice;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EditPrice implements TapAction {
            public static final int $stable = 0;
            public static final EditPrice INSTANCE = new EditPrice();

            public boolean equals(Object other) {
                return this == other || (other instanceof EditPrice);
            }

            public int hashCode() {
                return -2089035110;
            }

            public String toString() {
                return "EditPrice";
            }

            private EditPrice() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowMarketPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowMarketPriceBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowMarketPriceBottomSheet INSTANCE = new ShowMarketPriceBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowMarketPriceBottomSheet);
            }

            public int hashCode() {
                return 1278033097;
            }

            public String toString() {
                return "ShowMarketPriceBottomSheet";
            }

            private ShowMarketPriceBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowOrderTypeEducation;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "<init>", "(Lcom/robinhood/models/api/CryptoOrderType;)V", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowOrderTypeEducation implements TapAction {
            public static final int $stable = 0;
            private final CryptoOrderType orderType;

            public static /* synthetic */ ShowOrderTypeEducation copy$default(ShowOrderTypeEducation showOrderTypeEducation, CryptoOrderType cryptoOrderType, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoOrderType = showOrderTypeEducation.orderType;
                }
                return showOrderTypeEducation.copy(cryptoOrderType);
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoOrderType getOrderType() {
                return this.orderType;
            }

            public final ShowOrderTypeEducation copy(CryptoOrderType orderType) {
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                return new ShowOrderTypeEducation(orderType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowOrderTypeEducation) && this.orderType == ((ShowOrderTypeEducation) other).orderType;
            }

            public int hashCode() {
                return this.orderType.hashCode();
            }

            public String toString() {
                return "ShowOrderTypeEducation(orderType=" + this.orderType + ")";
            }

            public ShowOrderTypeEducation(CryptoOrderType orderType) {
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                this.orderType = orderType;
            }

            public final CryptoOrderType getOrderType() {
                return this.orderType;
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowTradeBonusBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowTradeBonusBottomSheet INSTANCE = new ShowTradeBonusBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowTradeBonusBottomSheet);
            }

            public int hashCode() {
                return 1072206359;
            }

            public String toString() {
                return "ShowTradeBonusBottomSheet";
            }

            private ShowTradeBonusBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowSpreadBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowSpreadBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowSpreadBottomSheet INSTANCE = new ShowSpreadBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowSpreadBottomSheet);
            }

            public int hashCode() {
                return 1090733503;
            }

            public String toString() {
                return "ShowSpreadBottomSheet";
            }

            private ShowSpreadBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "uiFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "<init>", "(Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;)V", "getUiFeeEstimation", "()Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowFeeDefinitionBottomSheet implements TapAction {
            public static final int $stable = 8;
            private final UiFeeEstimation uiFeeEstimation;

            public static /* synthetic */ ShowFeeDefinitionBottomSheet copy$default(ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet, UiFeeEstimation uiFeeEstimation, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiFeeEstimation = showFeeDefinitionBottomSheet.uiFeeEstimation;
                }
                return showFeeDefinitionBottomSheet.copy(uiFeeEstimation);
            }

            /* renamed from: component1, reason: from getter */
            public final UiFeeEstimation getUiFeeEstimation() {
                return this.uiFeeEstimation;
            }

            public final ShowFeeDefinitionBottomSheet copy(UiFeeEstimation uiFeeEstimation) {
                Intrinsics.checkNotNullParameter(uiFeeEstimation, "uiFeeEstimation");
                return new ShowFeeDefinitionBottomSheet(uiFeeEstimation);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowFeeDefinitionBottomSheet) && Intrinsics.areEqual(this.uiFeeEstimation, ((ShowFeeDefinitionBottomSheet) other).uiFeeEstimation);
            }

            public int hashCode() {
                return this.uiFeeEstimation.hashCode();
            }

            public String toString() {
                return "ShowFeeDefinitionBottomSheet(uiFeeEstimation=" + this.uiFeeEstimation + ")";
            }

            public ShowFeeDefinitionBottomSheet(UiFeeEstimation uiFeeEstimation) {
                Intrinsics.checkNotNullParameter(uiFeeEstimation, "uiFeeEstimation");
                this.uiFeeEstimation = uiFeeEstimation;
            }

            public final UiFeeEstimation getUiFeeEstimation() {
                return this.uiFeeEstimation;
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowEstimatedLiquidationPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowEstimatedLiquidationPriceBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowEstimatedLiquidationPriceBottomSheet INSTANCE = new ShowEstimatedLiquidationPriceBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowEstimatedLiquidationPriceBottomSheet);
            }

            public int hashCode() {
                return -75932566;
            }

            public String toString() {
                return "ShowEstimatedLiquidationPriceBottomSheet";
            }

            private ShowEstimatedLiquidationPriceBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowEstimatedQuantityBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowEstimatedQuantityBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowEstimatedQuantityBottomSheet INSTANCE = new ShowEstimatedQuantityBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowEstimatedQuantityBottomSheet);
            }

            public int hashCode() {
                return 513329295;
            }

            public String toString() {
                return "ShowEstimatedQuantityBottomSheet";
            }

            private ShowEstimatedQuantityBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowPerpetualsEstimatedFeesBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowPerpetualsEstimatedFeesBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowPerpetualsEstimatedFeesBottomSheet INSTANCE = new ShowPerpetualsEstimatedFeesBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowPerpetualsEstimatedFeesBottomSheet);
            }

            public int hashCode() {
                return 1560220354;
            }

            public String toString() {
                return "ShowPerpetualsEstimatedFeesBottomSheet";
            }

            private ShowPerpetualsEstimatedFeesBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$ShowPerpetualsEstimatedMarginRequiredScreen;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowPerpetualsEstimatedMarginRequiredScreen implements TapAction {
            public static final int $stable = 0;
            public static final ShowPerpetualsEstimatedMarginRequiredScreen INSTANCE = new ShowPerpetualsEstimatedMarginRequiredScreen();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowPerpetualsEstimatedMarginRequiredScreen);
            }

            public int hashCode() {
                return 1628451422;
            }

            public String toString() {
                return "ShowPerpetualsEstimatedMarginRequiredScreen";
            }

            private ShowPerpetualsEstimatedMarginRequiredScreen() {
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$QuickTrade;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "ShowEduPriceBottomSheet", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface QuickTrade extends TapAction {

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$QuickTrade$ShowEduPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowEduPriceBottomSheet implements TapAction {
                public static final int $stable = 0;
                public static final ShowEduPriceBottomSheet INSTANCE = new ShowEduPriceBottomSheet();

                public boolean equals(Object other) {
                    return this == other || (other instanceof ShowEduPriceBottomSheet);
                }

                public int hashCode() {
                    return 314960914;
                }

                public String toString() {
                    return "ShowEduPriceBottomSheet";
                }

                private ShowEduPriceBottomSheet() {
                }
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "ShowTokenizationFxFeeSheet", "ShowTokenizationEstimatedPriceSheet", "ShowTokenizationEstimatedTotalCostSheet", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization$ShowTokenizationEstimatedPriceSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization$ShowTokenizationEstimatedTotalCostSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization$ShowTokenizationFxFeeSheet;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Tokenization extends TapAction {
            BottomSheetTypeDto.TypeDto getData();

            String getLoggingIdentifier();

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization$ShowTokenizationFxFeeSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization;", "value", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;)V", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationFxFee;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationFxFee;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TapAction.Tokenization
                public BottomSheetTypeDto.TypeDto.TokenizationFxFee getData() {
                    return new BottomSheetTypeDto.TypeDto.TokenizationFxFee(this.value);
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TapAction.Tokenization
                public String getLoggingIdentifier() {
                    return "fx_fees";
                }
            }

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization$ShowTokenizationEstimatedPriceSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization;", "value", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;)V", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedPrice;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedPrice;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowTokenizationEstimatedPriceSheet implements Tokenization {
                public static final int $stable = 8;
                private final TokenizationEstimatedPriceDto value;

                public static /* synthetic */ ShowTokenizationEstimatedPriceSheet copy$default(ShowTokenizationEstimatedPriceSheet showTokenizationEstimatedPriceSheet, TokenizationEstimatedPriceDto tokenizationEstimatedPriceDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        tokenizationEstimatedPriceDto = showTokenizationEstimatedPriceSheet.value;
                    }
                    return showTokenizationEstimatedPriceSheet.copy(tokenizationEstimatedPriceDto);
                }

                /* renamed from: component1, reason: from getter */
                public final TokenizationEstimatedPriceDto getValue() {
                    return this.value;
                }

                public final ShowTokenizationEstimatedPriceSheet copy(TokenizationEstimatedPriceDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new ShowTokenizationEstimatedPriceSheet(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowTokenizationEstimatedPriceSheet) && Intrinsics.areEqual(this.value, ((ShowTokenizationEstimatedPriceSheet) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowTokenizationEstimatedPriceSheet(value=" + this.value + ")";
                }

                public ShowTokenizationEstimatedPriceSheet(TokenizationEstimatedPriceDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final TokenizationEstimatedPriceDto getValue() {
                    return this.value;
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TapAction.Tokenization
                public BottomSheetTypeDto.TypeDto.TokenizationEstimatedPrice getData() {
                    return new BottomSheetTypeDto.TypeDto.TokenizationEstimatedPrice(this.value);
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TapAction.Tokenization
                public String getLoggingIdentifier() {
                    return "estimated_price";
                }
            }

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization$ShowTokenizationEstimatedTotalCostSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Tokenization;", "value", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;)V", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedTotalCost;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedTotalCost;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TapAction.Tokenization
                public BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost getData() {
                    return new BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost(this.value);
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TapAction.Tokenization
                public String getLoggingIdentifier() {
                    return "estimated_total_cost";
                }
            }
        }

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "ChangeDate", "ChangeFrequency", "ChangeAmount", "ShowFees", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ChangeAmount;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ChangeDate;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ChangeFrequency;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ShowFees;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Recurring extends TapAction {

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ChangeDate;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ChangeDate implements Recurring {
                public static final int $stable = 0;
                public static final ChangeDate INSTANCE = new ChangeDate();

                public boolean equals(Object other) {
                    return this == other || (other instanceof ChangeDate);
                }

                public int hashCode() {
                    return 1017797428;
                }

                public String toString() {
                    return "ChangeDate";
                }

                private ChangeDate() {
                }
            }

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ChangeFrequency;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ChangeFrequency implements Recurring {
                public static final int $stable = 0;
                public static final ChangeFrequency INSTANCE = new ChangeFrequency();

                public boolean equals(Object other) {
                    return this == other || (other instanceof ChangeFrequency);
                }

                public int hashCode() {
                    return -814981738;
                }

                public String toString() {
                    return "ChangeFrequency";
                }

                private ChangeFrequency() {
                }
            }

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ChangeAmount;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ChangeAmount implements Recurring {
                public static final int $stable = 0;
                public static final ChangeAmount INSTANCE = new ChangeAmount();

                public boolean equals(Object other) {
                    return this == other || (other instanceof ChangeAmount);
                }

                public int hashCode() {
                    return -1224150434;
                }

                public String toString() {
                    return "ChangeAmount";
                }

                private ChangeAmount() {
                }
            }

            /* compiled from: CryptoOrderReviewRow.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring$ShowFees;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction$Recurring;", "feePercentageFormatted", "", "minFeeAmountFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeePercentageFormatted", "()Ljava/lang/String;", "getMinFeeAmountFormatted", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextStyleOverride;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_S_HIGHLIGHT_GRADIENT", "TEXT_M_HIGHLIGHT_GRADIENT", "TEXT_M", "TEXT_M_BOLD", "bentoTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getBentoTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TextStyleOverride {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TextStyleOverride[] $VALUES;
        public static final TextStyleOverride TEXT_S_HIGHLIGHT_GRADIENT = new TextStyleOverride("TEXT_S_HIGHLIGHT_GRADIENT", 0);
        public static final TextStyleOverride TEXT_M_HIGHLIGHT_GRADIENT = new TextStyleOverride("TEXT_M_HIGHLIGHT_GRADIENT", 1);
        public static final TextStyleOverride TEXT_M = new TextStyleOverride("TEXT_M", 2);
        public static final TextStyleOverride TEXT_M_BOLD = new TextStyleOverride("TEXT_M_BOLD", 3);

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextStyleOverride.values().length];
                try {
                    iArr[TextStyleOverride.TEXT_S_HIGHLIGHT_GRADIENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextStyleOverride.TEXT_M_HIGHLIGHT_GRADIENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextStyleOverride.TEXT_M.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TextStyleOverride.TEXT_M_BOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ TextStyleOverride[] $values() {
            return new TextStyleOverride[]{TEXT_S_HIGHLIGHT_GRADIENT, TEXT_M_HIGHLIGHT_GRADIENT, TEXT_M, TEXT_M_BOLD};
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
            composer.startReplaceGroup(422394868);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(422394868, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.TextStyleOverride.<get-bentoTextStyle> (CryptoOrderReviewRow.kt:318)");
            }
            BentoColor bentoColor = BentoColor.INSTANCE;
            Brush brushM6678linearGradientmHitzGk$default = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoColor.m21236getDayPrime0d7_KjU()), Color.m6701boximpl(bentoColor.m21236getDayPrime0d7_KjU())}), 0L, 0L, 0, 14, (Object) null);
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-2100410833);
                textStyleM7654copyNs73l9s$default = TextStyle.m7654copyNs73l9s$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), brushM6678linearGradientmHitzGk$default, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                composer.endReplaceGroup();
            } else if (i2 == 2) {
                composer.startReplaceGroup(-2100406673);
                textStyleM7654copyNs73l9s$default = TextStyle.m7654copyNs73l9s$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), brushM6678linearGradientmHitzGk$default, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                composer.endReplaceGroup();
            } else if (i2 == 3) {
                composer.startReplaceGroup(-2100404103);
                textStyleM7654copyNs73l9s$default = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                composer.endReplaceGroup();
            } else {
                if (i2 != 4) {
                    composer.startReplaceGroup(-2100414045);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2100401787);
                textStyleM7654copyNs73l9s$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
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
    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$ColorOverride;", "", "<init>", "(Ljava/lang/String;I)V", "DAY_PRIME", "POSITIVE", "NEGATIVE", "FG", "FG_2", "FG_3", "bentoColor", "Landroidx/compose/ui/graphics/Color;", "getBentoColor", "(Landroidx/compose/runtime/Composer;I)J", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorOverride {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ColorOverride[] $VALUES;
        public static final ColorOverride DAY_PRIME = new ColorOverride("DAY_PRIME", 0);
        public static final ColorOverride POSITIVE = new ColorOverride("POSITIVE", 1);
        public static final ColorOverride NEGATIVE = new ColorOverride("NEGATIVE", 2);

        /* renamed from: FG */
        public static final ColorOverride f6213FG = new ColorOverride("FG", 3);
        public static final ColorOverride FG_2 = new ColorOverride("FG_2", 4);
        public static final ColorOverride FG_3 = new ColorOverride("FG_3", 5);

        /* compiled from: CryptoOrderReviewRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ColorOverride.values().length];
                try {
                    iArr[ColorOverride.DAY_PRIME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ColorOverride.POSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ColorOverride.NEGATIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ColorOverride.f6213FG.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ColorOverride.FG_2.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ColorOverride.FG_3.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ ColorOverride[] $values() {
            return new ColorOverride[]{DAY_PRIME, POSITIVE, NEGATIVE, f6213FG, FG_2, FG_3};
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
            long jM21236getDayPrime0d7_KjU;
            composer.startReplaceGroup(-297894476);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-297894476, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.ColorOverride.<get-bentoColor> (CryptoOrderReviewRow.kt:351)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    composer.startReplaceGroup(1486220156);
                    composer.endReplaceGroup();
                    jM21236getDayPrime0d7_KjU = BentoColor.INSTANCE.m21236getDayPrime0d7_KjU();
                    break;
                case 2:
                    composer.startReplaceGroup(1486221916);
                    jM21236getDayPrime0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                    composer.endReplaceGroup();
                    break;
                case 3:
                    composer.startReplaceGroup(1486223676);
                    jM21236getDayPrime0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                    composer.endReplaceGroup();
                    break;
                case 4:
                    composer.startReplaceGroup(1486225238);
                    jM21236getDayPrime0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composer.endReplaceGroup();
                    break;
                case 5:
                    composer.startReplaceGroup(1486226679);
                    jM21236getDayPrime0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composer.endReplaceGroup();
                    break;
                case 6:
                    composer.startReplaceGroup(1486228151);
                    jM21236getDayPrime0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composer.endReplaceGroup();
                    break;
                default:
                    composer.startReplaceGroup(1486218741);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21236getDayPrime0d7_KjU;
        }

        public static ColorOverride valueOf(String str) {
            return (ColorOverride) Enum.valueOf(ColorOverride.class, str);
        }

        public static ColorOverride[] values() {
            return (ColorOverride[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderReviewRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u0004¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$VerticalPadding;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "bentoSpacing", "Landroidx/compose/ui/unit/Dp;", "getBentoSpacing", "(Landroidx/compose/runtime/Composer;I)F", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VerticalPadding {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VerticalPadding[] $VALUES;
        public static final VerticalPadding DEFAULT = new VerticalPadding("DEFAULT", 0);

        private static final /* synthetic */ VerticalPadding[] $values() {
            return new VerticalPadding[]{DEFAULT};
        }

        public static EnumEntries<VerticalPadding> getEntries() {
            return $ENTRIES;
        }

        private VerticalPadding(String str, int i) {
        }

        static {
            VerticalPadding[] verticalPaddingArr$values = $values();
            $VALUES = verticalPaddingArr$values;
            $ENTRIES = EnumEntries2.enumEntries(verticalPaddingArr$values);
        }

        @JvmName
        public final float getBentoSpacing(Composer composer, int i) {
            composer.startReplaceGroup(169261319);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(169261319, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowState.VerticalPadding.<get-bentoSpacing> (CryptoOrderReviewRow.kt:367)");
            }
            if (this != DEFAULT) {
                throw new NoWhenBranchMatchedException();
            }
            float fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return fM21590getDefaultD9Ej5fM;
        }

        public static VerticalPadding valueOf(String str) {
            return (VerticalPadding) Enum.valueOf(VerticalPadding.class, str);
        }

        public static VerticalPadding[] values() {
            return (VerticalPadding[]) $VALUES.clone();
        }
    }
}
