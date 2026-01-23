package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.Insets;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: WindowInsets.android.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\"\u0015\u0010\u0014\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\"\u0015\u0010\u0016\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r\"\u0015\u0010\u0018\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\"\u0015\u0010\u001a\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r¨\u0006\u001b"}, m3636d2 = {"Landroidx/core/graphics/Insets;", "Landroidx/compose/foundation/layout/InsetsValues;", "toInsetsValues", "(Landroidx/core/graphics/Insets;)Landroidx/compose/foundation/layout/InsetsValues;", "insets", "", "name", "Landroidx/compose/foundation/layout/ValueInsets;", "ValueInsets", "(Landroidx/core/graphics/Insets;Ljava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "Landroidx/compose/foundation/layout/WindowInsets;", "getIme", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "ime", "getNavigationBars", "navigationBars", "getStatusBars", "statusBars", "getSystemBars", "systemBars", "getSystemGestures", "systemGestures", "getSafeDrawing", "safeDrawing", "getSafeContent", "safeContent", "foundation-layout_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    public static final InsetsValues toInsetsValues(Insets insets) {
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final ValueInsets ValueInsets(Insets insets, String str) {
        return new ValueInsets(toInsetsValues(insets), str);
    }

    @JvmName
    public static final WindowInsets getIme(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1466917860, i, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:155)");
        }
        AndroidWindowInsets ime = WindowInsetsHolder.INSTANCE.current(composer, 6).getIme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ime;
    }

    @JvmName
    public static final WindowInsets getNavigationBars(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596175702, i, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:171)");
        }
        AndroidWindowInsets navigationBars = WindowInsetsHolder.INSTANCE.current(composer, 6).getNavigationBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBars;
    }

    @JvmName
    public static final WindowInsets getStatusBars(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        AndroidWindowInsets statusBars = WindowInsetsHolder.INSTANCE.current(composer, 6).getStatusBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return statusBars;
    }

    @JvmName
    public static final WindowInsets getSystemBars(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:179)");
        }
        AndroidWindowInsets systemBars = WindowInsetsHolder.INSTANCE.current(composer, 6).getSystemBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return systemBars;
    }

    @JvmName
    public static final WindowInsets getSystemGestures(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(989216224, i, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:183)");
        }
        AndroidWindowInsets systemGestures = WindowInsetsHolder.INSTANCE.current(composer, 6).getSystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return systemGestures;
    }

    @JvmName
    public static final WindowInsets getSafeDrawing(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-49441252, i, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:198)");
        }
        WindowInsets safeDrawing = WindowInsetsHolder.INSTANCE.current(composer, 6).getSafeDrawing();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return safeDrawing;
    }

    @JvmName
    public static final WindowInsets getSafeContent(WindowInsets.Companion companion, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026663876, i, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:213)");
        }
        WindowInsets safeContent = WindowInsetsHolder.INSTANCE.current(composer, 6).getSafeContent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return safeContent;
    }
}
