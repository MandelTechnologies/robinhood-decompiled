package com.robinhood.android.tracing;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.tracing.RhTrace6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhTrace.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u001a+\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u001a-\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\u001a>\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\r\u001aN\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m3636d2 = {"withMethodNamePrefix", "Lcom/robinhood/android/tracing/TrackTrace;", "prefix", "Lkotlin/Function0;", "", GoldFeature.INSTANT, "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "inSpan", "R", "block", "(Lcom/robinhood/android/tracing/TrackTrace;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lcom/robinhood/android/tracing/TrackTrace;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lib-tracing_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tracing.RhTraceKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RhTrace2 {
    public static final RhTrace6 withMethodNamePrefix(RhTrace6 rhTrace6, Function0<String> prefix) {
        Intrinsics.checkNotNullParameter(rhTrace6, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rhTrace6.isEnabled() ? rhTrace6.withMethodNamePrefix(prefix.invoke()) : RhTrace6.Noop.INSTANCE;
    }

    public static final void instant(RhTrace6 rhTrace6, Function0<String> methodName) {
        Intrinsics.checkNotNullParameter(rhTrace6, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        if (rhTrace6.isEnabled()) {
            rhTrace6.instant(methodName.invoke());
        }
    }

    public static final RhTrace3 beginSpan(RhTrace6 rhTrace6, Function0<String> methodName) {
        Intrinsics.checkNotNullParameter(rhTrace6, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        if (rhTrace6.isEnabled()) {
            return rhTrace6.beginSpan(methodName.invoke());
        }
        return null;
    }

    public static final <R> R inSpan(RhTrace6 rhTrace6, String methodName, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(rhTrace6, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(block, "block");
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan(methodName);
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R inSpan(RhTrace6 rhTrace6, Function0<String> methodName, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(rhTrace6, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(block, "block");
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan(methodName.invoke());
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            InlineMarker.finallyEnd(1);
        }
    }
}
