package com.robinhood.android.transfers.p271ui.max.i18n;

import android.view.KeyEvent;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.TickerInputView;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MoneyInputConsumer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/MoneyInputConsumer;", "Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer;", "Ljava/math/BigDecimal;", "maxAmount", "allowSubDollarAmount", "", "<init>", "(Ljava/math/BigDecimal;Z)V", "isKeyEventValid", "currentInput", "", "keyEvent", "Landroid/view/KeyEvent;", "nextState", "Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer$InputState;", "currentState", "format", "charArray", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MoneyInputConsumer extends InputKeyEventConsumer<BigDecimal> {
    private static final NumberFormat FORMATTER;
    private static final char[] ZERO_CHAR_ARRAY;
    private static final char[] ZERO_GBP_ARRAY;
    private static final char[] ZERO_SGD_ARRAY;
    private final boolean allowSubDollarAmount;
    private final BigDecimal maxAmount;
    public static final int $stable = 8;

    public /* synthetic */ MoneyInputConsumer(BigDecimal bigDecimal, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i & 2) != 0 ? false : z);
    }

    public MoneyInputConsumer(BigDecimal maxAmount, boolean z) {
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        this.maxAmount = maxAmount;
        this.allowSubDollarAmount = z;
    }

    @Override // com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer
    protected boolean isKeyEventValid(char[] currentInput, KeyEvent keyEvent) {
        BigDecimal number;
        Intrinsics.checkNotNullParameter(currentInput, "currentInput");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (KeyEvents2.isDigit(keyEvent) && (number = CharArrays2.toNumber(ArraysKt.plus(currentInput, keyEvent.getNumber()))) != null && number.compareTo(this.maxAmount) > 0) {
            return false;
        }
        if (!this.allowSubDollarAmount && KeyEvents2.isDotOrPeriod(keyEvent) && BigDecimals7.isZero(CharArrays2.toNumber(currentInput))) {
            return false;
        }
        return !KeyEvents2.isDotOrPeriod(keyEvent) || CharArrays2.isNumber(ArraysKt.plus(currentInput, keyEvent.getNumber()));
    }

    @Override // com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer
    protected InputKeyEventConsumer.InputState<BigDecimal> nextState(InputKeyEventConsumer.InputState<BigDecimal> currentState, KeyEvent keyEvent) {
        char[] cArr;
        NumberFormatter amountFormat;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        char[] input = currentState.getInput();
        ArrayList arrayList = new ArrayList();
        for (char c : input) {
            if (TickerInputView.INSTANCE.getCURRENCY_SYMBOLS().contains(Character.valueOf(c))) {
                arrayList.add(Character.valueOf(c));
            }
        }
        char[] charArray = CollectionsKt.toCharArray(arrayList);
        char[] cArrDropChars = CharArrays2.dropChars(currentState.getInput(), Arrays.copyOf(charArray, charArray.length));
        if (KeyEvents2.isDelete(keyEvent)) {
            if (cArrDropChars.length > 1) {
                cArr = format(CollectionsKt.toCharArray(ArraysKt.dropLast(currentState.getInput(), 1)));
            } else {
                String str = new String(charArray);
                if (Intrinsics.areEqual(str, "£")) {
                    cArr = ZERO_GBP_ARRAY;
                } else {
                    cArr = Intrinsics.areEqual(str, "S$") ? ZERO_SGD_ARRAY : ZERO_CHAR_ARRAY;
                }
            }
        } else if (KeyEvents2.isDigit(keyEvent) || KeyEvents2.isDotOrPeriod(keyEvent)) {
            cArr = format(ArraysKt.plus(currentState.getInput(), keyEvent.getNumber()));
            if (cArr == null) {
                cArr = ZERO_CHAR_ARRAY;
            }
        } else {
            cArr = null;
        }
        BigDecimal number = cArr != null ? CharArrays2.toNumber(cArr) : null;
        if (number != null) {
            return new InputKeyEventConsumer.InputState<>(number, cArr);
        }
        BigDecimal value = currentState.getValue();
        if (BigDecimals7.isInteger(currentState.getValue())) {
            amountFormat = Formats.getWholeNumberAmountFormat();
        } else {
            amountFormat = Formats.getAmountFormat();
        }
        char[] charArray2 = amountFormat.format(currentState.getValue()).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        return new InputKeyEventConsumer.InputState<>(value, charArray2);
    }

    static {
        char[] charArray = "£0".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        ZERO_GBP_ARRAY = charArray;
        char[] charArray2 = "S$0".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        ZERO_SGD_ARRAY = charArray2;
        char[] charArray3 = "$0".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray3, "toCharArray(...)");
        ZERO_CHAR_ARRAY = charArray3;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        FORMATTER = numberInstance;
    }

    private final char[] format(char[] charArray) {
        char[] charArray2;
        ArrayList arrayList = new ArrayList();
        for (char c : charArray) {
            if (TickerInputView.INSTANCE.getCURRENCY_SYMBOLS().contains(Character.valueOf(c))) {
                arrayList.add(Character.valueOf(c));
            }
        }
        char[] charArray3 = CollectionsKt.toCharArray(arrayList);
        List<char[]> listSplitByDecimalSeparator = CharArrays2.splitByDecimalSeparator(CharArrays2.dropChars(charArray, Arrays.copyOf(charArray3, charArray3.length)), '.');
        if (listSplitByDecimalSeparator.isEmpty()) {
            return null;
        }
        BigDecimal number = CharArrays2.toNumber(listSplitByDecimalSeparator.get(0));
        if (number == null) {
            charArray2 = new char[0];
        } else {
            String str = FORMATTER.format(number);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        }
        if (listSplitByDecimalSeparator.size() == 1) {
            return ArraysKt.plus(charArray3, charArray2);
        }
        if (listSplitByDecimalSeparator.size() != 2) {
            return null;
        }
        return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(charArray3, charArray2), '.'), ArraysKt.take(listSplitByDecimalSeparator.get(1), FORMATTER.getMaximumFractionDigits()));
    }
}
