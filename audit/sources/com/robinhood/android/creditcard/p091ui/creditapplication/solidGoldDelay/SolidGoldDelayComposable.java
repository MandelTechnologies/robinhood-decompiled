package com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SolidGoldDelayComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/Options;", "", "<init>", "(Ljava/lang/String;I)V", "CASH", "CARD", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.Options, reason: use source file name */
/* loaded from: classes2.dex */
final class SolidGoldDelayComposable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SolidGoldDelayComposable[] $VALUES;
    public static final SolidGoldDelayComposable CASH = new SolidGoldDelayComposable("CASH", 0);
    public static final SolidGoldDelayComposable CARD = new SolidGoldDelayComposable("CARD", 1);

    private static final /* synthetic */ SolidGoldDelayComposable[] $values() {
        return new SolidGoldDelayComposable[]{CASH, CARD};
    }

    public static EnumEntries<SolidGoldDelayComposable> getEntries() {
        return $ENTRIES;
    }

    static {
        SolidGoldDelayComposable[] solidGoldDelayComposableArr$values = $values();
        $VALUES = solidGoldDelayComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(solidGoldDelayComposableArr$values);
    }

    private SolidGoldDelayComposable(String str, int i) {
    }

    public static SolidGoldDelayComposable valueOf(String str) {
        return (SolidGoldDelayComposable) Enum.valueOf(SolidGoldDelayComposable.class, str);
    }

    public static SolidGoldDelayComposable[] values() {
        return (SolidGoldDelayComposable[]) $VALUES.clone();
    }
}
