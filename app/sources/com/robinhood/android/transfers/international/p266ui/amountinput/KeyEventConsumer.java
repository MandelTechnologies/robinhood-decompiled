package com.robinhood.android.transfers.international.p266ui.amountinput;

import android.view.KeyEvent;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: KeyEventConsumer.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/KeyEventConsumer;", "", "maxAmount", "Ljava/math/BigDecimal;", "allowSubDollarAmount", "", "<init>", "(Ljava/math/BigDecimal;Z)V", "consume", "Lcom/robinhood/android/transfers/international/ui/amountinput/KeyEventConsumer$InputState;", "currentState", "keyEvent", "Landroid/view/KeyEvent;", "isKeyEventValid", "currentInput", "", "nextState", "format", "charArray", "InputState", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class KeyEventConsumer {
    private static final char DECIMAL_SEPARATOR = '.';
    private static final NumberFormat FORMATTER;
    private final boolean allowSubDollarAmount;
    private final BigDecimal maxAmount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final char[] ZERO_CHAR_ARRAY = {'0'};

    public KeyEventConsumer(BigDecimal maxAmount, boolean z) {
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        this.maxAmount = maxAmount;
        this.allowSubDollarAmount = z;
    }

    /* compiled from: KeyEventConsumer.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/KeyEventConsumer$InputState;", "", "value", "Ljava/math/BigDecimal;", "chars", "", "<init>", "(Ljava/math/BigDecimal;[C)V", "getValue", "()Ljava/math/BigDecimal;", "getChars", "()[C", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputState {
        public static final int $stable = 8;
        private final char[] chars;
        private final BigDecimal value;

        public static /* synthetic */ InputState copy$default(InputState inputState, BigDecimal bigDecimal, char[] cArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = inputState.value;
            }
            if ((i & 2) != 0) {
                cArr = inputState.chars;
            }
            return inputState.copy(bigDecimal, cArr);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final char[] getChars() {
            return this.chars;
        }

        public final InputState copy(BigDecimal value, char[] chars) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(chars, "chars");
            return new InputState(value, chars);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputState)) {
                return false;
            }
            InputState inputState = (InputState) other;
            return Intrinsics.areEqual(this.value, inputState.value) && Intrinsics.areEqual(this.chars, inputState.chars);
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + Arrays.hashCode(this.chars);
        }

        public String toString() {
            return "InputState(value=" + this.value + ", chars=" + Arrays.toString(this.chars) + ")";
        }

        public InputState(BigDecimal value, char[] chars) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(chars, "chars");
            this.value = value;
            this.chars = chars;
        }

        public final BigDecimal getValue() {
            return this.value;
        }

        public final char[] getChars() {
            return this.chars;
        }
    }

    public final InputState consume(InputState currentState, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return !isKeyEventValid(currentState.getChars(), keyEvent) ? currentState : nextState(currentState, keyEvent);
    }

    private final boolean isKeyEventValid(char[] currentInput, KeyEvent keyEvent) {
        BigDecimal number;
        if (KeyEvents2.isDigit(keyEvent) && (number = KeyEventConsumer2.toNumber(ArraysKt.plus(currentInput, keyEvent.getNumber()))) != null && number.compareTo(this.maxAmount) > 0) {
            return false;
        }
        if (!this.allowSubDollarAmount && KeyEvents2.isDotOrPeriod(keyEvent) && BigDecimals7.isZero(KeyEventConsumer2.toNumber(currentInput))) {
            return false;
        }
        return !KeyEvents2.isDotOrPeriod(keyEvent) || KeyEventConsumer2.isNumber(ArraysKt.plus(currentInput, keyEvent.getNumber()));
    }

    private final InputState nextState(InputState currentState, KeyEvent keyEvent) {
        char[] cArr;
        String str;
        char[] chars = currentState.getChars();
        if (KeyEvents2.isDelete(keyEvent)) {
            if (chars.length > 1) {
                cArr = format(CollectionsKt.toCharArray(ArraysKt.dropLast(currentState.getChars(), 1)));
            } else {
                cArr = ZERO_CHAR_ARRAY;
            }
        } else if (KeyEvents2.isDigit(keyEvent) || KeyEvents2.isDotOrPeriod(keyEvent)) {
            cArr = format(ArraysKt.plus(currentState.getChars(), keyEvent.getNumber()));
            if (cArr == null) {
                cArr = ZERO_CHAR_ARRAY;
            }
        } else {
            cArr = null;
        }
        BigDecimal number = cArr != null ? KeyEventConsumer2.toNumber(cArr) : null;
        if (number != null) {
            return new InputState(number, cArr);
        }
        BigDecimal value = currentState.getValue();
        if (BigDecimals7.isInteger(currentState.getValue())) {
            str = Formats.getIntegerFormat().format(currentState.getValue());
        } else {
            str = FORMATTER.format(currentState.getValue());
        }
        Intrinsics.checkNotNull(str);
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return new InputState(value, charArray);
    }

    private final char[] format(char[] charArray) {
        char[] charArray2;
        List listSplit$default = StringsKt.split$default((CharSequence) ArraysKt.joinToString$default(charArray, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), new char[]{'.'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            char[] charArray3 = ((String) it.next()).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray3, "toCharArray(...)");
            arrayList.add(charArray3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        BigDecimal number = KeyEventConsumer2.toNumber((char[]) arrayList.get(0));
        if (number == null) {
            charArray2 = new char[0];
        } else {
            String str = FORMATTER.format(number);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        }
        if (arrayList.size() == 1) {
            return charArray2;
        }
        if (arrayList.size() == 2) {
            return ArraysKt.plus(ArraysKt.plus(charArray2, '.'), ArraysKt.take((char[]) arrayList.get(1), FORMATTER.getMaximumFractionDigits()));
        }
        return null;
    }

    /* compiled from: KeyEventConsumer.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/KeyEventConsumer$Companion;", "", "<init>", "()V", "DECIMAL_SEPARATOR", "", "ZERO_CHAR_ARRAY", "", "FORMATTER", "Ljava/text/NumberFormat;", "getFORMATTER$feature_international_transfers_externalDebug", "()Ljava/text/NumberFormat;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NumberFormat getFORMATTER$feature_international_transfers_externalDebug() {
            return KeyEventConsumer.FORMATTER;
        }
    }

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        FORMATTER = numberInstance;
    }
}
