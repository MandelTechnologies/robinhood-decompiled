package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.shared.tradeladder.api.models.LadderInputMode;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0003)*+BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;", "", "shakeInputKey", "", "inputValue", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputValue;", "placeholderText", "", "subtitleContent", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent;", "selectedInputMode", "Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;", "inputModeSegments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputModeSegment;", "<init>", "(ILcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputValue;Ljava/lang/String;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent;Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;Lkotlinx/collections/immutable/ImmutableList;)V", "getShakeInputKey", "()I", "getInputValue", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputValue;", "getPlaceholderText", "()Ljava/lang/String;", "getSubtitleContent", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent;", "getSelectedInputMode", "()Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;", "getInputModeSegments", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "InputValue", "SubtitleContent", "InputModeSegment", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderSizeInputBottomSheetState {
    public static final int $stable = 8;
    private final ImmutableList<InputModeSegment> inputModeSegments;
    private final InputValue inputValue;
    private final String placeholderText;
    private final LadderInputMode selectedInputMode;
    private final int shakeInputKey;
    private final SubtitleContent subtitleContent;

    public static /* synthetic */ OrderSizeInputBottomSheetState copy$default(OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, int i, InputValue inputValue, String str, SubtitleContent subtitleContent, LadderInputMode ladderInputMode, ImmutableList immutableList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = orderSizeInputBottomSheetState.shakeInputKey;
        }
        if ((i2 & 2) != 0) {
            inputValue = orderSizeInputBottomSheetState.inputValue;
        }
        if ((i2 & 4) != 0) {
            str = orderSizeInputBottomSheetState.placeholderText;
        }
        if ((i2 & 8) != 0) {
            subtitleContent = orderSizeInputBottomSheetState.subtitleContent;
        }
        if ((i2 & 16) != 0) {
            ladderInputMode = orderSizeInputBottomSheetState.selectedInputMode;
        }
        if ((i2 & 32) != 0) {
            immutableList = orderSizeInputBottomSheetState.inputModeSegments;
        }
        LadderInputMode ladderInputMode2 = ladderInputMode;
        ImmutableList immutableList2 = immutableList;
        return orderSizeInputBottomSheetState.copy(i, inputValue, str, subtitleContent, ladderInputMode2, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getShakeInputKey() {
        return this.shakeInputKey;
    }

    /* renamed from: component2, reason: from getter */
    public final InputValue getInputValue() {
        return this.inputValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    /* renamed from: component4, reason: from getter */
    public final SubtitleContent getSubtitleContent() {
        return this.subtitleContent;
    }

    /* renamed from: component5, reason: from getter */
    public final LadderInputMode getSelectedInputMode() {
        return this.selectedInputMode;
    }

    public final ImmutableList<InputModeSegment> component6() {
        return this.inputModeSegments;
    }

    public final OrderSizeInputBottomSheetState copy(int shakeInputKey, InputValue inputValue, String placeholderText, SubtitleContent subtitleContent, LadderInputMode selectedInputMode, ImmutableList<InputModeSegment> inputModeSegments) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(selectedInputMode, "selectedInputMode");
        return new OrderSizeInputBottomSheetState(shakeInputKey, inputValue, placeholderText, subtitleContent, selectedInputMode, inputModeSegments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSizeInputBottomSheetState)) {
            return false;
        }
        OrderSizeInputBottomSheetState orderSizeInputBottomSheetState = (OrderSizeInputBottomSheetState) other;
        return this.shakeInputKey == orderSizeInputBottomSheetState.shakeInputKey && Intrinsics.areEqual(this.inputValue, orderSizeInputBottomSheetState.inputValue) && Intrinsics.areEqual(this.placeholderText, orderSizeInputBottomSheetState.placeholderText) && Intrinsics.areEqual(this.subtitleContent, orderSizeInputBottomSheetState.subtitleContent) && this.selectedInputMode == orderSizeInputBottomSheetState.selectedInputMode && Intrinsics.areEqual(this.inputModeSegments, orderSizeInputBottomSheetState.inputModeSegments);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.shakeInputKey) * 31) + this.inputValue.hashCode()) * 31) + this.placeholderText.hashCode()) * 31;
        SubtitleContent subtitleContent = this.subtitleContent;
        int iHashCode2 = (((iHashCode + (subtitleContent == null ? 0 : subtitleContent.hashCode())) * 31) + this.selectedInputMode.hashCode()) * 31;
        ImmutableList<InputModeSegment> immutableList = this.inputModeSegments;
        return iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "OrderSizeInputBottomSheetState(shakeInputKey=" + this.shakeInputKey + ", inputValue=" + this.inputValue + ", placeholderText=" + this.placeholderText + ", subtitleContent=" + this.subtitleContent + ", selectedInputMode=" + this.selectedInputMode + ", inputModeSegments=" + this.inputModeSegments + ")";
    }

    public OrderSizeInputBottomSheetState(int i, InputValue inputValue, String placeholderText, SubtitleContent subtitleContent, LadderInputMode selectedInputMode, ImmutableList<InputModeSegment> immutableList) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(selectedInputMode, "selectedInputMode");
        this.shakeInputKey = i;
        this.inputValue = inputValue;
        this.placeholderText = placeholderText;
        this.subtitleContent = subtitleContent;
        this.selectedInputMode = selectedInputMode;
        this.inputModeSegments = immutableList;
    }

    public final int getShakeInputKey() {
        return this.shakeInputKey;
    }

    public final InputValue getInputValue() {
        return this.inputValue;
    }

    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    public final SubtitleContent getSubtitleContent() {
        return this.subtitleContent;
    }

    public final LadderInputMode getSelectedInputMode() {
        return this.selectedInputMode;
    }

    public final ImmutableList<InputModeSegment> getInputModeSegments() {
        return this.inputModeSegments;
    }

    /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputValue;", "", "displayValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "trailingSymbol", "", "value", "Ljava/math/BigDecimal;", "isPlaceholder", "", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getDisplayValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getTrailingSymbol", "()Ljava/lang/String;", "getValue", "()Ljava/math/BigDecimal;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputValue {
        public static final int $stable = 8;
        private final TextFieldValue displayValue;
        private final boolean isPlaceholder;
        private final String trailingSymbol;
        private final BigDecimal value;

        public static /* synthetic */ InputValue copy$default(InputValue inputValue, TextFieldValue textFieldValue, String str, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldValue = inputValue.displayValue;
            }
            if ((i & 2) != 0) {
                str = inputValue.trailingSymbol;
            }
            if ((i & 4) != 0) {
                bigDecimal = inputValue.value;
            }
            if ((i & 8) != 0) {
                z = inputValue.isPlaceholder;
            }
            return inputValue.copy(textFieldValue, str, bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final TextFieldValue getDisplayValue() {
            return this.displayValue;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTrailingSymbol() {
            return this.trailingSymbol;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getValue() {
            return this.value;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPlaceholder() {
            return this.isPlaceholder;
        }

        public final InputValue copy(TextFieldValue displayValue, String trailingSymbol, BigDecimal value, boolean isPlaceholder) {
            Intrinsics.checkNotNullParameter(displayValue, "displayValue");
            Intrinsics.checkNotNullParameter(value, "value");
            return new InputValue(displayValue, trailingSymbol, value, isPlaceholder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputValue)) {
                return false;
            }
            InputValue inputValue = (InputValue) other;
            return Intrinsics.areEqual(this.displayValue, inputValue.displayValue) && Intrinsics.areEqual(this.trailingSymbol, inputValue.trailingSymbol) && Intrinsics.areEqual(this.value, inputValue.value) && this.isPlaceholder == inputValue.isPlaceholder;
        }

        public int hashCode() {
            int iHashCode = this.displayValue.hashCode() * 31;
            String str = this.trailingSymbol;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isPlaceholder);
        }

        public String toString() {
            return "InputValue(displayValue=" + this.displayValue + ", trailingSymbol=" + this.trailingSymbol + ", value=" + this.value + ", isPlaceholder=" + this.isPlaceholder + ")";
        }

        public InputValue(TextFieldValue displayValue, String str, BigDecimal value, boolean z) {
            Intrinsics.checkNotNullParameter(displayValue, "displayValue");
            Intrinsics.checkNotNullParameter(value, "value");
            this.displayValue = displayValue;
            this.trailingSymbol = str;
            this.value = value;
            this.isPlaceholder = z;
        }

        public final TextFieldValue getDisplayValue() {
            return this.displayValue;
        }

        public final String getTrailingSymbol() {
            return this.trailingSymbol;
        }

        public final BigDecimal getValue() {
            return this.value;
        }

        public final boolean isPlaceholder() {
            return this.isPlaceholder;
        }
    }

    /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent;", "", "<init>", "()V", "StandardText", "ErrorText", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent$ErrorText;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent$StandardText;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SubtitleContent {
        public static final int $stable = 0;

        public /* synthetic */ SubtitleContent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent$StandardText;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StandardText extends SubtitleContent {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ StandardText copy$default(StandardText standardText, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = standardText.text;
                }
                return standardText.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final StandardText copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new StandardText(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StandardText) && Intrinsics.areEqual(this.text, ((StandardText) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "StandardText(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StandardText(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }

        private SubtitleContent() {
        }

        /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent$ErrorText;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$SubtitleContent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ErrorText extends SubtitleContent {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ ErrorText copy$default(ErrorText errorText, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = errorText.text;
                }
                return errorText.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final ErrorText copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new ErrorText(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorText) && Intrinsics.areEqual(this.text, ((ErrorText) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "ErrorText(text=" + this.text + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorText(String text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }
    }

    /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputModeSegment;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "inputMode", "Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getInputMode", "()Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputModeSegment {
        public static final int $stable = StringResource.$stable;
        private final LadderInputMode inputMode;
        private final StringResource text;

        public static /* synthetic */ InputModeSegment copy$default(InputModeSegment inputModeSegment, StringResource stringResource, LadderInputMode ladderInputMode, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = inputModeSegment.text;
            }
            if ((i & 2) != 0) {
                ladderInputMode = inputModeSegment.inputMode;
            }
            return inputModeSegment.copy(stringResource, ladderInputMode);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final LadderInputMode getInputMode() {
            return this.inputMode;
        }

        public final InputModeSegment copy(StringResource text, LadderInputMode inputMode) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            return new InputModeSegment(text, inputMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputModeSegment)) {
                return false;
            }
            InputModeSegment inputModeSegment = (InputModeSegment) other;
            return Intrinsics.areEqual(this.text, inputModeSegment.text) && this.inputMode == inputModeSegment.inputMode;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.inputMode.hashCode();
        }

        public String toString() {
            return "InputModeSegment(text=" + this.text + ", inputMode=" + this.inputMode + ")";
        }

        public InputModeSegment(StringResource text, LadderInputMode inputMode) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(inputMode, "inputMode");
            this.text = text;
            this.inputMode = inputMode;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final LadderInputMode getInputMode() {
            return this.inputMode;
        }
    }
}
