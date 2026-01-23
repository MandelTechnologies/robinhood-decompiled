package com.robinhood.utils.compose.keyboard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KeyboardState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/utils/compose/keyboard/KeyboardState;", "", "<init>", "(Ljava/lang/String;I)V", "OPENED", "CLOSED", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class KeyboardState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KeyboardState[] $VALUES;
    public static final KeyboardState OPENED = new KeyboardState("OPENED", 0);
    public static final KeyboardState CLOSED = new KeyboardState("CLOSED", 1);

    private static final /* synthetic */ KeyboardState[] $values() {
        return new KeyboardState[]{OPENED, CLOSED};
    }

    public static EnumEntries<KeyboardState> getEntries() {
        return $ENTRIES;
    }

    private KeyboardState(String str, int i) {
    }

    static {
        KeyboardState[] keyboardStateArr$values = $values();
        $VALUES = keyboardStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(keyboardStateArr$values);
    }

    public static KeyboardState valueOf(String str) {
        return (KeyboardState) Enum.valueOf(KeyboardState.class, str);
    }

    public static KeyboardState[] values() {
        return (KeyboardState[]) $VALUES.clone();
    }
}
