package com.robinhood.android.gold.hub.animations;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnimatedStringComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/animations/AnimatedStringDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LTR", "RTL", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.hub.animations.AnimatedStringDirection, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnimatedStringComposable3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimatedStringComposable3[] $VALUES;
    public static final AnimatedStringComposable3 LTR = new AnimatedStringComposable3("LTR", 0);
    public static final AnimatedStringComposable3 RTL = new AnimatedStringComposable3("RTL", 1);

    private static final /* synthetic */ AnimatedStringComposable3[] $values() {
        return new AnimatedStringComposable3[]{LTR, RTL};
    }

    public static EnumEntries<AnimatedStringComposable3> getEntries() {
        return $ENTRIES;
    }

    private AnimatedStringComposable3(String str, int i) {
    }

    static {
        AnimatedStringComposable3[] animatedStringComposable3Arr$values = $values();
        $VALUES = animatedStringComposable3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(animatedStringComposable3Arr$values);
    }

    public static AnimatedStringComposable3 valueOf(String str) {
        return (AnimatedStringComposable3) Enum.valueOf(AnimatedStringComposable3.class, str);
    }

    public static AnimatedStringComposable3[] values() {
        return (AnimatedStringComposable3[]) $VALUES.clone();
    }
}
