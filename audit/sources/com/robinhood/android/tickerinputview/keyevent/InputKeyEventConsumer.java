package com.robinhood.android.tickerinputview.keyevent;

import android.view.KeyEvent;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputKeyEventConsumer.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH$J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\nH$J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer;", "T", "", "<init>", "()V", "isKeyEventValid", "", "currentInput", "", "keyEvent", "Landroid/view/KeyEvent;", "nextState", "Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer$InputState;", "currentState", "consume", "InputState", "lib-ticker-input-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class InputKeyEventConsumer<T> {
    public static final int $stable = 0;

    protected abstract boolean isKeyEventValid(char[] currentInput, KeyEvent keyEvent);

    protected abstract InputState<T> nextState(InputState<T> currentState, KeyEvent keyEvent);

    /* compiled from: InputKeyEventConsumer.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer$InputState;", "T", "", "value", "input", "", "<init>", "(Ljava/lang/Object;[C)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getInput", "()[C", "component1", "component2", "copy", "(Ljava/lang/Object;[C)Lcom/robinhood/android/tickerinputview/keyevent/InputKeyEventConsumer$InputState;", "equals", "", "other", "hashCode", "", "toString", "", "lib-ticker-input-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputState<T> {
        public static final int $stable = 8;
        private final char[] input;
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InputState copy$default(InputState inputState, Object obj, char[] cArr, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = inputState.value;
            }
            if ((i & 2) != 0) {
                cArr = inputState.input;
            }
            return inputState.copy(obj, cArr);
        }

        public final T component1() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final char[] getInput() {
            return this.input;
        }

        public final InputState<T> copy(T value, char[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return new InputState<>(value, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputState)) {
                return false;
            }
            InputState inputState = (InputState) other;
            return Intrinsics.areEqual(this.value, inputState.value) && Intrinsics.areEqual(this.input, inputState.input);
        }

        public int hashCode() {
            T t = this.value;
            return ((t == null ? 0 : t.hashCode()) * 31) + Arrays.hashCode(this.input);
        }

        public String toString() {
            return "InputState(value=" + this.value + ", input=" + Arrays.toString(this.input) + ")";
        }

        public InputState(T t, char[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.value = t;
            this.input = input;
        }

        public final T getValue() {
            return this.value;
        }

        public final char[] getInput() {
            return this.input;
        }
    }

    public final InputState<T> consume(InputState<T> currentState, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return !isKeyEventValid(currentState.getInput(), keyEvent) ? currentState : nextState(currentState, keyEvent);
    }
}
