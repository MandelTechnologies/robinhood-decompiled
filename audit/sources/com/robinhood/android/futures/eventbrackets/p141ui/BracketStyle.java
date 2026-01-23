package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BracketStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketStyle;", "", "<init>", "()V", "isDay", "", "(Landroidx/compose/runtime/Composer;I)Z", "borderColor", "Landroidx/compose/ui/graphics/Color;", "getBorderColor", "(Landroidx/compose/runtime/Composer;I)J", "lockColor", "getLockColor", "equals", "other", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BracketStyle {
    public static final int $stable = 0;
    public static final BracketStyle INSTANCE = new BracketStyle();

    public boolean equals(Object other) {
        return this == other || (other instanceof BracketStyle);
    }

    public int hashCode() {
        return -337475992;
    }

    public String toString() {
        return "BracketStyle";
    }

    private BracketStyle() {
    }

    @JvmName
    private final boolean isDay(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-729122828, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketStyle.<get-isDay> (BracketStyle.kt:14)");
        }
        boolean isDay = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isDay;
    }

    @JvmName
    public final long getBorderColor(Composer composer, int i) {
        long jM21373getBg30d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737298225, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketStyle.<get-borderColor> (BracketStyle.kt:19)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        if (bentoTheme.getColors(composer, i2).getIsDay()) {
            composer.startReplaceGroup(1198687218);
            jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
        } else {
            composer.startReplaceGroup(1198688082);
            jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21373getBg30d7_KjU;
    }

    @JvmName
    public final long getLockColor(Composer composer, int i) {
        long jM21425getFg0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1811294797, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketStyle.<get-lockColor> (BracketStyle.kt:24)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        if (bentoTheme.getColors(composer, i2).getIsDay()) {
            composer.startReplaceGroup(1192548336);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
        } else {
            composer.startReplaceGroup(1192549199);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21425getFg0d7_KjU;
    }
}
