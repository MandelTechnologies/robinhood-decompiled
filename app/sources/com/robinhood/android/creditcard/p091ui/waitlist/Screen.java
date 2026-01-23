package com.robinhood.android.creditcard.p091ui.waitlist;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/Screen;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "INTRO", "SOLID_GOLD_INTRO", "CONFIRMATION", "UPSELL", "JOINED", "TRANSITION", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class Screen {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Screen[] $VALUES;
    public static final Screen LOADING = new Screen("LOADING", 0);
    public static final Screen INTRO = new Screen("INTRO", 1);
    public static final Screen SOLID_GOLD_INTRO = new Screen("SOLID_GOLD_INTRO", 2);
    public static final Screen CONFIRMATION = new Screen("CONFIRMATION", 3);
    public static final Screen UPSELL = new Screen("UPSELL", 4);
    public static final Screen JOINED = new Screen("JOINED", 5);
    public static final Screen TRANSITION = new Screen("TRANSITION", 6);

    private static final /* synthetic */ Screen[] $values() {
        return new Screen[]{LOADING, INTRO, SOLID_GOLD_INTRO, CONFIRMATION, UPSELL, JOINED, TRANSITION};
    }

    public static EnumEntries<Screen> getEntries() {
        return $ENTRIES;
    }

    private Screen(String str, int i) {
    }

    static {
        Screen[] screenArr$values = $values();
        $VALUES = screenArr$values;
        $ENTRIES = EnumEntries2.enumEntries(screenArr$values);
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) $VALUES.clone();
    }
}
