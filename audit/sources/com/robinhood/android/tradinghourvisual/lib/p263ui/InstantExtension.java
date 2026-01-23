package com.robinhood.android.tradinghourvisual.lib.p263ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;

/* compiled from: InstantExtension.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"j$/time/Instant", "leftEdge", "rightEdge", "", "isStart", "", "calculateForwardDistanceFrom", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Z)F", "lib-trade-hour-visualizer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradinghourvisual.lib.ui.InstantExtensionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InstantExtension {
    public static final float calculateForwardDistanceFrom(Instant instant, Instant leftEdge, Instant rightEdge, boolean z) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(leftEdge, "leftEdge");
        Intrinsics.checkNotNullParameter(rightEdge, "rightEdge");
        if (Intrinsics.areEqual(instant, leftEdge) && z) {
            return 0.0f;
        }
        if (Intrinsics.areEqual(instant, rightEdge) && !z) {
            return 1.0f;
        }
        Duration durationBetween = Duration.between(leftEdge, instant);
        Duration durationBetween2 = Duration.between(leftEdge, rightEdge);
        while (durationBetween.isNegative()) {
            durationBetween = durationBetween.plusDays(1L);
        }
        float seconds = durationBetween.getSeconds() / durationBetween2.getSeconds();
        if (0.0f <= seconds && seconds <= 1.0f) {
            return seconds;
        }
        throw new IllegalArgumentException(StringsKt.trimMargin$default("\n        |calculateForwardDistanceFrom Error: Invalid duration value\n        |   leftEdge: " + leftEdge + "\n        |   rightEdge: " + rightEdge + "\n        |   this: " + instant + "\n        |   durationFromOpen: " + durationBetween + "\n        |   totalDuration: " + durationBetween2 + "\n        |   user local time: " + LocalDateTime.now() + "\n        |   user timezone: " + ZoneId.systemDefault() + "\n        |   resulting fraction: " + seconds + "\n    ", null, 1, null).toString());
    }
}
