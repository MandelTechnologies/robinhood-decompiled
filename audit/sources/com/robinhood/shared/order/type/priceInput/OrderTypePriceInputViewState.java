package com.robinhood.shared.order.type.priceInput;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.shared.crypto.p375ui.content.CryptoContentState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OrderTypePriceInputViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u000523456BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState;", "", "navIcon", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NavIcon;", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "priceInputRowState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;", "priceForOrderRowState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "numpadState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;", "continueArgs", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;", "bidAskPriceInfoSheetState", "Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;", "<init>", "(Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NavIcon;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;)V", "getNavIcon", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NavIcon;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "getPriceInputRowState", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;", "getPriceForOrderRowState", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "getNumpadState", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;", "getContinueArgs", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;", "getBidAskPriceInfoSheetState", "()Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "NavIcon", "PriceInputRowState", "PriceForOrderRowState", "ContinueArgs", "NumpadState", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderTypePriceInputViewState {
    public static final int $stable = 8;
    private final CryptoContentState bidAskPriceInfoSheetState;
    private final ContinueArgs continueArgs;
    private final StringResource description;
    private final NavIcon navIcon;
    private final NumpadState numpadState;
    private final PriceForOrderRowState priceForOrderRowState;
    private final PriceInputRowState priceInputRowState;
    private final StringResource title;

    public static /* synthetic */ OrderTypePriceInputViewState copy$default(OrderTypePriceInputViewState orderTypePriceInputViewState, NavIcon navIcon, StringResource stringResource, StringResource stringResource2, PriceInputRowState priceInputRowState, PriceForOrderRowState priceForOrderRowState, NumpadState numpadState, ContinueArgs continueArgs, CryptoContentState cryptoContentState, int i, Object obj) {
        if ((i & 1) != 0) {
            navIcon = orderTypePriceInputViewState.navIcon;
        }
        if ((i & 2) != 0) {
            stringResource = orderTypePriceInputViewState.title;
        }
        if ((i & 4) != 0) {
            stringResource2 = orderTypePriceInputViewState.description;
        }
        if ((i & 8) != 0) {
            priceInputRowState = orderTypePriceInputViewState.priceInputRowState;
        }
        if ((i & 16) != 0) {
            priceForOrderRowState = orderTypePriceInputViewState.priceForOrderRowState;
        }
        if ((i & 32) != 0) {
            numpadState = orderTypePriceInputViewState.numpadState;
        }
        if ((i & 64) != 0) {
            continueArgs = orderTypePriceInputViewState.continueArgs;
        }
        if ((i & 128) != 0) {
            cryptoContentState = orderTypePriceInputViewState.bidAskPriceInfoSheetState;
        }
        ContinueArgs continueArgs2 = continueArgs;
        CryptoContentState cryptoContentState2 = cryptoContentState;
        PriceForOrderRowState priceForOrderRowState2 = priceForOrderRowState;
        NumpadState numpadState2 = numpadState;
        return orderTypePriceInputViewState.copy(navIcon, stringResource, stringResource2, priceInputRowState, priceForOrderRowState2, numpadState2, continueArgs2, cryptoContentState2);
    }

    /* renamed from: component1, reason: from getter */
    public final NavIcon getNavIcon() {
        return this.navIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceInputRowState getPriceInputRowState() {
        return this.priceInputRowState;
    }

    /* renamed from: component5, reason: from getter */
    public final PriceForOrderRowState getPriceForOrderRowState() {
        return this.priceForOrderRowState;
    }

    /* renamed from: component6, reason: from getter */
    public final NumpadState getNumpadState() {
        return this.numpadState;
    }

    /* renamed from: component7, reason: from getter */
    public final ContinueArgs getContinueArgs() {
        return this.continueArgs;
    }

    /* renamed from: component8, reason: from getter */
    public final CryptoContentState getBidAskPriceInfoSheetState() {
        return this.bidAskPriceInfoSheetState;
    }

    public final OrderTypePriceInputViewState copy(NavIcon navIcon, StringResource title, StringResource description, PriceInputRowState priceInputRowState, PriceForOrderRowState priceForOrderRowState, NumpadState numpadState, ContinueArgs continueArgs, CryptoContentState bidAskPriceInfoSheetState) {
        Intrinsics.checkNotNullParameter(navIcon, "navIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(priceInputRowState, "priceInputRowState");
        Intrinsics.checkNotNullParameter(priceForOrderRowState, "priceForOrderRowState");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        return new OrderTypePriceInputViewState(navIcon, title, description, priceInputRowState, priceForOrderRowState, numpadState, continueArgs, bidAskPriceInfoSheetState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTypePriceInputViewState)) {
            return false;
        }
        OrderTypePriceInputViewState orderTypePriceInputViewState = (OrderTypePriceInputViewState) other;
        return this.navIcon == orderTypePriceInputViewState.navIcon && Intrinsics.areEqual(this.title, orderTypePriceInputViewState.title) && Intrinsics.areEqual(this.description, orderTypePriceInputViewState.description) && Intrinsics.areEqual(this.priceInputRowState, orderTypePriceInputViewState.priceInputRowState) && Intrinsics.areEqual(this.priceForOrderRowState, orderTypePriceInputViewState.priceForOrderRowState) && Intrinsics.areEqual(this.numpadState, orderTypePriceInputViewState.numpadState) && Intrinsics.areEqual(this.continueArgs, orderTypePriceInputViewState.continueArgs) && Intrinsics.areEqual(this.bidAskPriceInfoSheetState, orderTypePriceInputViewState.bidAskPriceInfoSheetState);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.navIcon.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.priceInputRowState.hashCode()) * 31) + this.priceForOrderRowState.hashCode()) * 31) + this.numpadState.hashCode()) * 31;
        ContinueArgs continueArgs = this.continueArgs;
        int iHashCode2 = (iHashCode + (continueArgs == null ? 0 : continueArgs.hashCode())) * 31;
        CryptoContentState cryptoContentState = this.bidAskPriceInfoSheetState;
        return iHashCode2 + (cryptoContentState != null ? cryptoContentState.hashCode() : 0);
    }

    public String toString() {
        return "OrderTypePriceInputViewState(navIcon=" + this.navIcon + ", title=" + this.title + ", description=" + this.description + ", priceInputRowState=" + this.priceInputRowState + ", priceForOrderRowState=" + this.priceForOrderRowState + ", numpadState=" + this.numpadState + ", continueArgs=" + this.continueArgs + ", bidAskPriceInfoSheetState=" + this.bidAskPriceInfoSheetState + ")";
    }

    public OrderTypePriceInputViewState(NavIcon navIcon, StringResource title, StringResource description, PriceInputRowState priceInputRowState, PriceForOrderRowState priceForOrderRowState, NumpadState numpadState, ContinueArgs continueArgs, CryptoContentState cryptoContentState) {
        Intrinsics.checkNotNullParameter(navIcon, "navIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(priceInputRowState, "priceInputRowState");
        Intrinsics.checkNotNullParameter(priceForOrderRowState, "priceForOrderRowState");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        this.navIcon = navIcon;
        this.title = title;
        this.description = description;
        this.priceInputRowState = priceInputRowState;
        this.priceForOrderRowState = priceForOrderRowState;
        this.numpadState = numpadState;
        this.continueArgs = continueArgs;
        this.bidAskPriceInfoSheetState = cryptoContentState;
    }

    public final NavIcon getNavIcon() {
        return this.navIcon;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getDescription() {
        return this.description;
    }

    public final PriceInputRowState getPriceInputRowState() {
        return this.priceInputRowState;
    }

    public final PriceForOrderRowState getPriceForOrderRowState() {
        return this.priceForOrderRowState;
    }

    public final NumpadState getNumpadState() {
        return this.numpadState;
    }

    public final ContinueArgs getContinueArgs() {
        return this.continueArgs;
    }

    public final CryptoContentState getBidAskPriceInfoSheetState() {
        return this.bidAskPriceInfoSheetState;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderTypePriceInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NavIcon;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE", "BACK", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavIcon {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavIcon[] $VALUES;
        public static final NavIcon CLOSE = new NavIcon("CLOSE", 0);
        public static final NavIcon BACK = new NavIcon("BACK", 1);

        private static final /* synthetic */ NavIcon[] $values() {
            return new NavIcon[]{CLOSE, BACK};
        }

        public static EnumEntries<NavIcon> getEntries() {
            return $ENTRIES;
        }

        private NavIcon(String str, int i) {
        }

        static {
            NavIcon[] navIconArr$values = $values();
            $VALUES = navIconArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navIconArr$values);
        }

        public static NavIcon valueOf(String str) {
            return (NavIcon) Enum.valueOf(NavIcon.class, str);
        }

        public static NavIcon[] values() {
            return (NavIcon[]) $VALUES.clone();
        }
    }

    /* compiled from: OrderTypePriceInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "inputTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "useSecondaryTextColor", "", "shakeAnimationKey", "", "isLoading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/text/input/TextFieldValue;ZIZ)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getInputTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getUseSecondaryTextColor", "()Z", "getShakeAnimationKey", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PriceInputRowState {
        public static final String DEFAULT_LOADING_PLACEHOLDER = "------";
        private final TextFieldValue inputTextFieldValue;
        private final boolean isLoading;
        private final StringResource label;
        private final int shakeAnimationKey;
        private final boolean useSecondaryTextColor;
        public static final int $stable = StringResource.$stable;

        public static /* synthetic */ PriceInputRowState copy$default(PriceInputRowState priceInputRowState, StringResource stringResource, TextFieldValue textFieldValue, boolean z, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stringResource = priceInputRowState.label;
            }
            if ((i2 & 2) != 0) {
                textFieldValue = priceInputRowState.inputTextFieldValue;
            }
            if ((i2 & 4) != 0) {
                z = priceInputRowState.useSecondaryTextColor;
            }
            if ((i2 & 8) != 0) {
                i = priceInputRowState.shakeAnimationKey;
            }
            if ((i2 & 16) != 0) {
                z2 = priceInputRowState.isLoading;
            }
            boolean z3 = z2;
            boolean z4 = z;
            return priceInputRowState.copy(stringResource, textFieldValue, z4, i, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final TextFieldValue getInputTextFieldValue() {
            return this.inputTextFieldValue;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseSecondaryTextColor() {
            return this.useSecondaryTextColor;
        }

        /* renamed from: component4, reason: from getter */
        public final int getShakeAnimationKey() {
            return this.shakeAnimationKey;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final PriceInputRowState copy(StringResource label, TextFieldValue inputTextFieldValue, boolean useSecondaryTextColor, int shakeAnimationKey, boolean isLoading) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(inputTextFieldValue, "inputTextFieldValue");
            return new PriceInputRowState(label, inputTextFieldValue, useSecondaryTextColor, shakeAnimationKey, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInputRowState)) {
                return false;
            }
            PriceInputRowState priceInputRowState = (PriceInputRowState) other;
            return Intrinsics.areEqual(this.label, priceInputRowState.label) && Intrinsics.areEqual(this.inputTextFieldValue, priceInputRowState.inputTextFieldValue) && this.useSecondaryTextColor == priceInputRowState.useSecondaryTextColor && this.shakeAnimationKey == priceInputRowState.shakeAnimationKey && this.isLoading == priceInputRowState.isLoading;
        }

        public int hashCode() {
            return (((((((this.label.hashCode() * 31) + this.inputTextFieldValue.hashCode()) * 31) + Boolean.hashCode(this.useSecondaryTextColor)) * 31) + Integer.hashCode(this.shakeAnimationKey)) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "PriceInputRowState(label=" + this.label + ", inputTextFieldValue=" + this.inputTextFieldValue + ", useSecondaryTextColor=" + this.useSecondaryTextColor + ", shakeAnimationKey=" + this.shakeAnimationKey + ", isLoading=" + this.isLoading + ")";
        }

        public PriceInputRowState(StringResource label, TextFieldValue inputTextFieldValue, boolean z, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(inputTextFieldValue, "inputTextFieldValue");
            this.label = label;
            this.inputTextFieldValue = inputTextFieldValue;
            this.useSecondaryTextColor = z;
            this.shakeAnimationKey = i;
            this.isLoading = z2;
        }

        public final StringResource getLabel() {
            return this.label;
        }

        public final TextFieldValue getInputTextFieldValue() {
            return this.inputTextFieldValue;
        }

        public final boolean getUseSecondaryTextColor() {
            return this.useSecondaryTextColor;
        }

        public final int getShakeAnimationKey() {
            return this.shakeAnimationKey;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }
    }

    /* compiled from: OrderTypePriceInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "priceForOrder", "", "isLoading", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Z)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getPriceForOrder", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PriceForOrderRowState {
        private final boolean isLoading;
        private final StringResource label;
        private final String priceForOrder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = StringResource.$stable;
        private static final PriceForOrderRowState LOADING_PRICE_FOR_ORDER_ROW = new PriceForOrderRowState(StringResource.INSTANCE.invoke("-------"), "-------", true);

        public static /* synthetic */ PriceForOrderRowState copy$default(PriceForOrderRowState priceForOrderRowState, StringResource stringResource, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = priceForOrderRowState.label;
            }
            if ((i & 2) != 0) {
                str = priceForOrderRowState.priceForOrder;
            }
            if ((i & 4) != 0) {
                z = priceForOrderRowState.isLoading;
            }
            return priceForOrderRowState.copy(stringResource, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPriceForOrder() {
            return this.priceForOrder;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final PriceForOrderRowState copy(StringResource label, String priceForOrder, boolean isLoading) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(priceForOrder, "priceForOrder");
            return new PriceForOrderRowState(label, priceForOrder, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceForOrderRowState)) {
                return false;
            }
            PriceForOrderRowState priceForOrderRowState = (PriceForOrderRowState) other;
            return Intrinsics.areEqual(this.label, priceForOrderRowState.label) && Intrinsics.areEqual(this.priceForOrder, priceForOrderRowState.priceForOrder) && this.isLoading == priceForOrderRowState.isLoading;
        }

        public int hashCode() {
            return (((this.label.hashCode() * 31) + this.priceForOrder.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "PriceForOrderRowState(label=" + this.label + ", priceForOrder=" + this.priceForOrder + ", isLoading=" + this.isLoading + ")";
        }

        public PriceForOrderRowState(StringResource label, String priceForOrder, boolean z) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(priceForOrder, "priceForOrder");
            this.label = label;
            this.priceForOrder = priceForOrder;
            this.isLoading = z;
        }

        public final StringResource getLabel() {
            return this.label;
        }

        public final String getPriceForOrder() {
            return this.priceForOrder;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        /* compiled from: OrderTypePriceInputViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState$Companion;", "", "<init>", "()V", "LOADING_PRICE_FOR_ORDER_ROW", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "getLOADING_PRICE_FOR_ORDER_ROW", "()Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PriceForOrderRowState getLOADING_PRICE_FOR_ORDER_ROW() {
                return PriceForOrderRowState.LOADING_PRICE_FOR_ORDER_ROW;
            }
        }
    }

    /* compiled from: OrderTypePriceInputViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;", "", "newEditableOrderPrice", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "validationPrice", "Ljava/math/BigDecimal;", "validationPriceName", "Lcom/robinhood/utils/resource/StringResource;", "askPrice", "bidPrice", "midPrice", "<init>", "(Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;Ljava/math/BigDecimal;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getNewEditableOrderPrice", "()Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "getValidationPrice", "()Ljava/math/BigDecimal;", "getValidationPriceName", "()Lcom/robinhood/utils/resource/StringResource;", "getAskPrice", "getBidPrice", "getMidPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContinueArgs {
        public static final int $stable = 8;
        private final BigDecimal askPrice;
        private final BigDecimal bidPrice;
        private final BigDecimal midPrice;
        private final EditableOrderPrice newEditableOrderPrice;
        private final BigDecimal validationPrice;
        private final StringResource validationPriceName;

        public static /* synthetic */ ContinueArgs copy$default(ContinueArgs continueArgs, EditableOrderPrice editableOrderPrice, BigDecimal bigDecimal, StringResource stringResource, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, Object obj) {
            if ((i & 1) != 0) {
                editableOrderPrice = continueArgs.newEditableOrderPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal = continueArgs.validationPrice;
            }
            if ((i & 4) != 0) {
                stringResource = continueArgs.validationPriceName;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = continueArgs.askPrice;
            }
            if ((i & 16) != 0) {
                bigDecimal3 = continueArgs.bidPrice;
            }
            if ((i & 32) != 0) {
                bigDecimal4 = continueArgs.midPrice;
            }
            BigDecimal bigDecimal5 = bigDecimal3;
            BigDecimal bigDecimal6 = bigDecimal4;
            return continueArgs.copy(editableOrderPrice, bigDecimal, stringResource, bigDecimal2, bigDecimal5, bigDecimal6);
        }

        /* renamed from: component1, reason: from getter */
        public final EditableOrderPrice getNewEditableOrderPrice() {
            return this.newEditableOrderPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getValidationPrice() {
            return this.validationPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getValidationPriceName() {
            return this.validationPriceName;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getAskPrice() {
            return this.askPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getBidPrice() {
            return this.bidPrice;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getMidPrice() {
            return this.midPrice;
        }

        public final ContinueArgs copy(EditableOrderPrice newEditableOrderPrice, BigDecimal validationPrice, StringResource validationPriceName, BigDecimal askPrice, BigDecimal bidPrice, BigDecimal midPrice) {
            Intrinsics.checkNotNullParameter(newEditableOrderPrice, "newEditableOrderPrice");
            Intrinsics.checkNotNullParameter(validationPrice, "validationPrice");
            Intrinsics.checkNotNullParameter(validationPriceName, "validationPriceName");
            Intrinsics.checkNotNullParameter(askPrice, "askPrice");
            Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
            Intrinsics.checkNotNullParameter(midPrice, "midPrice");
            return new ContinueArgs(newEditableOrderPrice, validationPrice, validationPriceName, askPrice, bidPrice, midPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContinueArgs)) {
                return false;
            }
            ContinueArgs continueArgs = (ContinueArgs) other;
            return Intrinsics.areEqual(this.newEditableOrderPrice, continueArgs.newEditableOrderPrice) && Intrinsics.areEqual(this.validationPrice, continueArgs.validationPrice) && Intrinsics.areEqual(this.validationPriceName, continueArgs.validationPriceName) && Intrinsics.areEqual(this.askPrice, continueArgs.askPrice) && Intrinsics.areEqual(this.bidPrice, continueArgs.bidPrice) && Intrinsics.areEqual(this.midPrice, continueArgs.midPrice);
        }

        public int hashCode() {
            return (((((((((this.newEditableOrderPrice.hashCode() * 31) + this.validationPrice.hashCode()) * 31) + this.validationPriceName.hashCode()) * 31) + this.askPrice.hashCode()) * 31) + this.bidPrice.hashCode()) * 31) + this.midPrice.hashCode();
        }

        public String toString() {
            return "ContinueArgs(newEditableOrderPrice=" + this.newEditableOrderPrice + ", validationPrice=" + this.validationPrice + ", validationPriceName=" + this.validationPriceName + ", askPrice=" + this.askPrice + ", bidPrice=" + this.bidPrice + ", midPrice=" + this.midPrice + ")";
        }

        public ContinueArgs(EditableOrderPrice newEditableOrderPrice, BigDecimal validationPrice, StringResource validationPriceName, BigDecimal askPrice, BigDecimal bidPrice, BigDecimal midPrice) {
            Intrinsics.checkNotNullParameter(newEditableOrderPrice, "newEditableOrderPrice");
            Intrinsics.checkNotNullParameter(validationPrice, "validationPrice");
            Intrinsics.checkNotNullParameter(validationPriceName, "validationPriceName");
            Intrinsics.checkNotNullParameter(askPrice, "askPrice");
            Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
            Intrinsics.checkNotNullParameter(midPrice, "midPrice");
            this.newEditableOrderPrice = newEditableOrderPrice;
            this.validationPrice = validationPrice;
            this.validationPriceName = validationPriceName;
            this.askPrice = askPrice;
            this.bidPrice = bidPrice;
            this.midPrice = midPrice;
        }

        public final EditableOrderPrice getNewEditableOrderPrice() {
            return this.newEditableOrderPrice;
        }

        public final BigDecimal getValidationPrice() {
            return this.validationPrice;
        }

        public final StringResource getValidationPriceName() {
            return this.validationPriceName;
        }

        public final BigDecimal getAskPrice() {
            return this.askPrice;
        }

        public final BigDecimal getBidPrice() {
            return this.bidPrice;
        }

        public final BigDecimal getMidPrice() {
            return this.midPrice;
        }
    }

    /* compiled from: OrderTypePriceInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;", "", "isCtaEnabled", "", "isCtaLoading", "isNumpadEnabled", "<init>", "(ZZZ)V", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NumpadState {
        public static final int $stable = 0;
        private final boolean isCtaEnabled;
        private final boolean isCtaLoading;
        private final boolean isNumpadEnabled;

        public static /* synthetic */ NumpadState copy$default(NumpadState numpadState, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = numpadState.isCtaEnabled;
            }
            if ((i & 2) != 0) {
                z2 = numpadState.isCtaLoading;
            }
            if ((i & 4) != 0) {
                z3 = numpadState.isNumpadEnabled;
            }
            return numpadState.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCtaEnabled() {
            return this.isCtaEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCtaLoading() {
            return this.isCtaLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsNumpadEnabled() {
            return this.isNumpadEnabled;
        }

        public final NumpadState copy(boolean isCtaEnabled, boolean isCtaLoading, boolean isNumpadEnabled) {
            return new NumpadState(isCtaEnabled, isCtaLoading, isNumpadEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumpadState)) {
                return false;
            }
            NumpadState numpadState = (NumpadState) other;
            return this.isCtaEnabled == numpadState.isCtaEnabled && this.isCtaLoading == numpadState.isCtaLoading && this.isNumpadEnabled == numpadState.isNumpadEnabled;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isCtaEnabled) * 31) + Boolean.hashCode(this.isCtaLoading)) * 31) + Boolean.hashCode(this.isNumpadEnabled);
        }

        public String toString() {
            return "NumpadState(isCtaEnabled=" + this.isCtaEnabled + ", isCtaLoading=" + this.isCtaLoading + ", isNumpadEnabled=" + this.isNumpadEnabled + ")";
        }

        public NumpadState(boolean z, boolean z2, boolean z3) {
            this.isCtaEnabled = z;
            this.isCtaLoading = z2;
            this.isNumpadEnabled = z3;
        }

        public final boolean isCtaEnabled() {
            return this.isCtaEnabled;
        }

        public final boolean isCtaLoading() {
            return this.isCtaLoading;
        }

        public final boolean isNumpadEnabled() {
            return this.isNumpadEnabled;
        }
    }
}
