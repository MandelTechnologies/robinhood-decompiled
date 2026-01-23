package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004%&'(BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "", "startPrimaryTextContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;", "startSecondaryTextContent", "inputPlaceholderText", "Lcom/robinhood/utils/resource/StringResource;", "inputText", "inputTooltip", "includeBottomDivider", "", "isFocused", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getStartPrimaryTextContent", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;", "getStartSecondaryTextContent", "getInputPlaceholderText", "()Lcom/robinhood/utils/resource/StringResource;", "getInputText", "getInputTooltip", "getIncludeBottomDivider", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "TextContent", "IconContent", "TapAction", "ColorOverride", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderInputRowState {
    public static final int $stable;
    private final boolean includeBottomDivider;
    private final StringResource inputPlaceholderText;
    private final StringResource inputText;
    private final StringResource inputTooltip;
    private final boolean isFocused;
    private final TextContent startPrimaryTextContent;
    private final TextContent startSecondaryTextContent;

    static {
        int i = StringResource.$stable;
        int i2 = BentoIcon4.$stable;
        $stable = i | i2 | i | i2 | i;
    }

    public static /* synthetic */ CryptoOrderInputRowState copy$default(CryptoOrderInputRowState cryptoOrderInputRowState, TextContent textContent, TextContent textContent2, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            textContent = cryptoOrderInputRowState.startPrimaryTextContent;
        }
        if ((i & 2) != 0) {
            textContent2 = cryptoOrderInputRowState.startSecondaryTextContent;
        }
        if ((i & 4) != 0) {
            stringResource = cryptoOrderInputRowState.inputPlaceholderText;
        }
        if ((i & 8) != 0) {
            stringResource2 = cryptoOrderInputRowState.inputText;
        }
        if ((i & 16) != 0) {
            stringResource3 = cryptoOrderInputRowState.inputTooltip;
        }
        if ((i & 32) != 0) {
            z = cryptoOrderInputRowState.includeBottomDivider;
        }
        if ((i & 64) != 0) {
            z2 = cryptoOrderInputRowState.isFocused;
        }
        boolean z3 = z;
        boolean z4 = z2;
        StringResource stringResource4 = stringResource3;
        StringResource stringResource5 = stringResource;
        return cryptoOrderInputRowState.copy(textContent, textContent2, stringResource5, stringResource2, stringResource4, z3, z4);
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
    public final StringResource getInputPlaceholderText() {
        return this.inputPlaceholderText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getInputText() {
        return this.inputText;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getInputTooltip() {
        return this.inputTooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final CryptoOrderInputRowState copy(TextContent startPrimaryTextContent, TextContent startSecondaryTextContent, StringResource inputPlaceholderText, StringResource inputText, StringResource inputTooltip, boolean includeBottomDivider, boolean isFocused) {
        Intrinsics.checkNotNullParameter(startPrimaryTextContent, "startPrimaryTextContent");
        return new CryptoOrderInputRowState(startPrimaryTextContent, startSecondaryTextContent, inputPlaceholderText, inputText, inputTooltip, includeBottomDivider, isFocused);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderInputRowState)) {
            return false;
        }
        CryptoOrderInputRowState cryptoOrderInputRowState = (CryptoOrderInputRowState) other;
        return Intrinsics.areEqual(this.startPrimaryTextContent, cryptoOrderInputRowState.startPrimaryTextContent) && Intrinsics.areEqual(this.startSecondaryTextContent, cryptoOrderInputRowState.startSecondaryTextContent) && Intrinsics.areEqual(this.inputPlaceholderText, cryptoOrderInputRowState.inputPlaceholderText) && Intrinsics.areEqual(this.inputText, cryptoOrderInputRowState.inputText) && Intrinsics.areEqual(this.inputTooltip, cryptoOrderInputRowState.inputTooltip) && this.includeBottomDivider == cryptoOrderInputRowState.includeBottomDivider && this.isFocused == cryptoOrderInputRowState.isFocused;
    }

    public int hashCode() {
        int iHashCode = this.startPrimaryTextContent.hashCode() * 31;
        TextContent textContent = this.startSecondaryTextContent;
        int iHashCode2 = (iHashCode + (textContent == null ? 0 : textContent.hashCode())) * 31;
        StringResource stringResource = this.inputPlaceholderText;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.inputText;
        int iHashCode4 = (iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.inputTooltip;
        return ((((iHashCode4 + (stringResource3 != null ? stringResource3.hashCode() : 0)) * 31) + Boolean.hashCode(this.includeBottomDivider)) * 31) + Boolean.hashCode(this.isFocused);
    }

    public String toString() {
        return "CryptoOrderInputRowState(startPrimaryTextContent=" + this.startPrimaryTextContent + ", startSecondaryTextContent=" + this.startSecondaryTextContent + ", inputPlaceholderText=" + this.inputPlaceholderText + ", inputText=" + this.inputText + ", inputTooltip=" + this.inputTooltip + ", includeBottomDivider=" + this.includeBottomDivider + ", isFocused=" + this.isFocused + ")";
    }

    public CryptoOrderInputRowState(TextContent startPrimaryTextContent, TextContent textContent, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(startPrimaryTextContent, "startPrimaryTextContent");
        this.startPrimaryTextContent = startPrimaryTextContent;
        this.startSecondaryTextContent = textContent;
        this.inputPlaceholderText = stringResource;
        this.inputText = stringResource2;
        this.inputTooltip = stringResource3;
        this.includeBottomDivider = z;
        this.isFocused = z2;
    }

    public /* synthetic */ CryptoOrderInputRowState(TextContent textContent, TextContent textContent2, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textContent, (i & 2) != 0 ? null : textContent2, stringResource, stringResource2, (i & 16) != 0 ? null : stringResource3, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2);
    }

    public final TextContent getStartPrimaryTextContent() {
        return this.startPrimaryTextContent;
    }

    public final TextContent getStartSecondaryTextContent() {
        return this.startSecondaryTextContent;
    }

    public final StringResource getInputPlaceholderText() {
        return this.inputPlaceholderText;
    }

    public final StringResource getInputText() {
        return this.inputText;
    }

    public final StringResource getInputTooltip() {
        return this.inputTooltip;
    }

    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    /* compiled from: CryptoOrderInputRow.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "trailingIcon", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$IconContent;", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "isLoading", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$IconContent;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;Z)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getTrailingIcon", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$IconContent;", "getTapAction", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TextContent {
        private final boolean isLoading;
        private final TapAction tapAction;
        private final StringResource text;
        private final IconContent trailingIcon;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = BentoIcon4.$stable | StringResource.$stable;
        private static final TextContent LOADING_TEXT_CONTENT = new TextContent(StringResource.INSTANCE.invoke("             "), null, null, true, 6, null);

        public static /* synthetic */ TextContent copy$default(TextContent textContent, StringResource stringResource, IconContent iconContent, TapAction tapAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = textContent.text;
            }
            if ((i & 2) != 0) {
                iconContent = textContent.trailingIcon;
            }
            if ((i & 4) != 0) {
                tapAction = textContent.tapAction;
            }
            if ((i & 8) != 0) {
                z = textContent.isLoading;
            }
            return textContent.copy(stringResource, iconContent, tapAction, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final IconContent getTrailingIcon() {
            return this.trailingIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final TapAction getTapAction() {
            return this.tapAction;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final TextContent copy(StringResource text, IconContent trailingIcon, TapAction tapAction, boolean isLoading) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextContent(text, trailingIcon, tapAction, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextContent)) {
                return false;
            }
            TextContent textContent = (TextContent) other;
            return Intrinsics.areEqual(this.text, textContent.text) && Intrinsics.areEqual(this.trailingIcon, textContent.trailingIcon) && Intrinsics.areEqual(this.tapAction, textContent.tapAction) && this.isLoading == textContent.isLoading;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            IconContent iconContent = this.trailingIcon;
            int iHashCode2 = (iHashCode + (iconContent == null ? 0 : iconContent.hashCode())) * 31;
            TapAction tapAction = this.tapAction;
            return ((iHashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "TextContent(text=" + this.text + ", trailingIcon=" + this.trailingIcon + ", tapAction=" + this.tapAction + ", isLoading=" + this.isLoading + ")";
        }

        public TextContent(StringResource text, IconContent iconContent, TapAction tapAction, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.trailingIcon = iconContent;
            this.tapAction = tapAction;
            this.isLoading = z;
        }

        public /* synthetic */ TextContent(StringResource stringResource, IconContent iconContent, TapAction tapAction, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : iconContent, (i & 4) != 0 ? null : tapAction, (i & 8) != 0 ? false : z);
        }

        public final StringResource getText() {
            return this.text;
        }

        public final IconContent getTrailingIcon() {
            return this.trailingIcon;
        }

        public final TapAction getTapAction() {
            return this.tapAction;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        /* compiled from: CryptoOrderInputRow.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent$Companion;", "", "<init>", "()V", "LOADING_TEXT_CONTENT", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;", "getLOADING_TEXT_CONTENT", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TextContent getLOADING_TEXT_CONTENT() {
                return TextContent.LOADING_TEXT_CONTENT;
            }
        }
    }

    /* compiled from: CryptoOrderInputRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$IconContent;", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "colorOverride", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$ColorOverride;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$ColorOverride;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getColorOverride", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$ColorOverride;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* compiled from: CryptoOrderInputRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "", "ShowLimitPriceBottomSheet", "ShowStopPriceBottomSheet", "Tokenization", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$ShowLimitPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$ShowStopPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$Tokenization;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TapAction {

        /* compiled from: CryptoOrderInputRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$ShowLimitPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowLimitPriceBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowLimitPriceBottomSheet INSTANCE = new ShowLimitPriceBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowLimitPriceBottomSheet);
            }

            public int hashCode() {
                return -673952904;
            }

            public String toString() {
                return "ShowLimitPriceBottomSheet";
            }

            private ShowLimitPriceBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderInputRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$ShowStopPriceBottomSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowStopPriceBottomSheet implements TapAction {
            public static final int $stable = 0;
            public static final ShowStopPriceBottomSheet INSTANCE = new ShowStopPriceBottomSheet();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowStopPriceBottomSheet);
            }

            public int hashCode() {
                return 336527899;
            }

            public String toString() {
                return "ShowStopPriceBottomSheet";
            }

            private ShowStopPriceBottomSheet() {
            }
        }

        /* compiled from: CryptoOrderInputRow.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$Tokenization;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "ShowTokenizationLimitPriceSheet", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$Tokenization$ShowTokenizationLimitPriceSheet;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Tokenization extends TapAction {
            BottomSheetTypeDto.TypeDto getData();

            String getLoggingIdentifier();

            /* compiled from: CryptoOrderInputRow.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$Tokenization$ShowTokenizationLimitPriceSheet;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction$Tokenization;", "value", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;)V", "getValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", WebsocketGatewayConstants.DATA_KEY, "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$LimitOrderDefinition;", "getData", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$LimitOrderDefinition;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowTokenizationLimitPriceSheet implements Tokenization {
                public static final int $stable = 8;
                private final BottomSheetTypeDto.LimitOrderDefinitionDto value;

                public static /* synthetic */ ShowTokenizationLimitPriceSheet copy$default(ShowTokenizationLimitPriceSheet showTokenizationLimitPriceSheet, BottomSheetTypeDto.LimitOrderDefinitionDto limitOrderDefinitionDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        limitOrderDefinitionDto = showTokenizationLimitPriceSheet.value;
                    }
                    return showTokenizationLimitPriceSheet.copy(limitOrderDefinitionDto);
                }

                /* renamed from: component1, reason: from getter */
                public final BottomSheetTypeDto.LimitOrderDefinitionDto getValue() {
                    return this.value;
                }

                public final ShowTokenizationLimitPriceSheet copy(BottomSheetTypeDto.LimitOrderDefinitionDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new ShowTokenizationLimitPriceSheet(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowTokenizationLimitPriceSheet) && Intrinsics.areEqual(this.value, ((ShowTokenizationLimitPriceSheet) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowTokenizationLimitPriceSheet(value=" + this.value + ")";
                }

                public ShowTokenizationLimitPriceSheet(BottomSheetTypeDto.LimitOrderDefinitionDto value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final BottomSheetTypeDto.LimitOrderDefinitionDto getValue() {
                    return this.value;
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowState.TapAction.Tokenization
                public BottomSheetTypeDto.TypeDto.LimitOrderDefinition getData() {
                    return new BottomSheetTypeDto.TypeDto.LimitOrderDefinition(this.value);
                }

                @Override // com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowState.TapAction.Tokenization
                public String getLoggingIdentifier() {
                    return "limit_price";
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderInputRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u0004¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$ColorOverride;", "", "<init>", "(Ljava/lang/String;I)V", "FG_2", "bentoColor", "Landroidx/compose/ui/graphics/Color;", "getBentoColor", "(Landroidx/compose/runtime/Composer;I)J", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorOverride {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ColorOverride[] $VALUES;
        public static final ColorOverride FG_2 = new ColorOverride("FG_2", 0);

        private static final /* synthetic */ ColorOverride[] $values() {
            return new ColorOverride[]{FG_2};
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
            composer.startReplaceGroup(324777632);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324777632, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowState.ColorOverride.<get-bentoColor> (CryptoOrderInputRow.kt:274)");
            }
            if (this != FG_2) {
                throw new NoWhenBranchMatchedException();
            }
            long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
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
