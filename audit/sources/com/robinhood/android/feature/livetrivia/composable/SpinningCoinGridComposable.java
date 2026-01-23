package com.robinhood.android.feature.livetrivia.composable;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpinningCoinGridComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/composable/SpinDirection;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinDirection, reason: use source file name */
/* loaded from: classes3.dex */
final class SpinningCoinGridComposable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpinningCoinGridComposable[] $VALUES;
    public static final SpinningCoinGridComposable HORIZONTAL = new SpinningCoinGridComposable("HORIZONTAL", 0);
    public static final SpinningCoinGridComposable VERTICAL = new SpinningCoinGridComposable("VERTICAL", 1);

    private static final /* synthetic */ SpinningCoinGridComposable[] $values() {
        return new SpinningCoinGridComposable[]{HORIZONTAL, VERTICAL};
    }

    public static EnumEntries<SpinningCoinGridComposable> getEntries() {
        return $ENTRIES;
    }

    private SpinningCoinGridComposable(String str, int i) {
    }

    static {
        SpinningCoinGridComposable[] spinningCoinGridComposableArr$values = $values();
        $VALUES = spinningCoinGridComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(spinningCoinGridComposableArr$values);
    }

    public static SpinningCoinGridComposable valueOf(String str) {
        return (SpinningCoinGridComposable) Enum.valueOf(SpinningCoinGridComposable.class, str);
    }

    public static SpinningCoinGridComposable[] values() {
        return (SpinningCoinGridComposable[]) $VALUES.clone();
    }
}
