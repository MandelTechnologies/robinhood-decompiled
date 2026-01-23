package com.robinhood.android.tickerinputview.keyevent;

import android.view.KeyEvent;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.tickerinputview.CharArrays;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.utils.extensions.KeyEvents2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PercentInputConsumer.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0014J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/tickerinputview/keyevent/PercentInputConsumer;", "Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer;", "", "<init>", "()V", "MAX_PERCENT", "Ljava/math/BigDecimal;", "ZERO_CHAR_ARRAY", "", "isKeyEventValid", "", "currentInput", "keyEvent", "Landroid/view/KeyEvent;", "nextState", "Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer$InputState;", "currentState", "lib-ticker-input-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PercentInputConsumer extends InputKeyEventConsumer<Integer> {
    public static final PercentInputConsumer INSTANCE = new PercentInputConsumer();
    private static final BigDecimal MAX_PERCENT = new BigDecimal(100);
    private static final char[] ZERO_CHAR_ARRAY = {'0'};
    public static final int $stable = 8;

    private PercentInputConsumer() {
    }

    @Override // com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer
    protected boolean isKeyEventValid(char[] currentInput, KeyEvent keyEvent) {
        BigDecimal number;
        Intrinsics.checkNotNullParameter(currentInput, "currentInput");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return (!KeyEvents2.isDigit(keyEvent) || (number = CharArrays.toNumber(ArraysKt.plus(currentInput, keyEvent.getNumber()))) == null || number.compareTo(MAX_PERCENT) <= 0) && !KeyEvents2.isDot(keyEvent);
    }

    @Override // com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer
    protected InputKeyEventConsumer.InputState<Integer> nextState(InputKeyEventConsumer.InputState<Integer> currentState, KeyEvent keyEvent) {
        char[] cArrPlus;
        BigDecimal number;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        char[] cArrDropChars = CharArrays.dropChars(currentState.getInput(), TickerInputView.PERCENT_SYMBOL);
        if (KeyEvents2.isDelete(keyEvent)) {
            if (cArrDropChars.length > 1) {
                cArrPlus = CollectionsKt.toCharArray(ArraysKt.dropLast(cArrDropChars, 1));
            } else {
                cArrPlus = ZERO_CHAR_ARRAY;
            }
        } else {
            cArrPlus = KeyEvents2.isDigit(keyEvent) ? ArraysKt.plus(cArrDropChars, keyEvent.getNumber()) : null;
        }
        if (cArrPlus == null || (number = CharArrays.toNumber(cArrPlus)) == null) {
            return currentState;
        }
        int iIntValue = number.intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        char[] charArray = Formats.getWholeNumberPercentFormat().format(Float.valueOf(iIntValue / 100.0f)).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return new InputKeyEventConsumer.InputState<>(numValueOf, charArray);
    }
}
