package androidx.compose.material3;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IconButton.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m3636d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/IconButtonColors;", "iconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "Landroidx/compose/ui/graphics/Color;", "localContentColor", "defaultIconButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconButtonColors;", "defaultIconButtonColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material3.IconButtonDefaults, reason: use source file name */
/* loaded from: classes.dex */
public final class IconButton4 {
    public static final IconButton4 INSTANCE = new IconButton4();

    private IconButton4() {
    }

    public final IconButton3 iconButtonColors(Composer composer, int i) {
        composer.startReplaceGroup(-1519621781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519621781, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long value = ((Color) composer.consume(ContentColor3.getLocalContentColor())).getValue();
        IconButton3 iconButton3M5870defaultIconButtonColors4WTKRHQ$material3_release = m5870defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), value);
        if (Color.m6707equalsimpl0(iconButton3M5870defaultIconButtonColors4WTKRHQ$material3_release.getContentColor(), value)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButton3M5870defaultIconButtonColors4WTKRHQ$material3_release;
        }
        IconButton3 iconButton3M5865copyjRlVdoo$default = IconButton3.m5865copyjRlVdoo$default(iconButton3M5870defaultIconButtonColors4WTKRHQ$material3_release, 0L, value, 0L, Color.m6705copywmQWz5c$default(value, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButton3M5865copyjRlVdoo$default;
    }

    /* renamed from: defaultIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButton3 m5870defaultIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j) {
        IconButton3 defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached != null) {
            return defaultIconButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconButton3 iconButton3 = new IconButton3(companion.m6725getTransparent0d7_KjU(), j, companion.m6725getTransparent0d7_KjU(), Color.m6705copywmQWz5c$default(j, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3_release(iconButton3);
        return iconButton3;
    }
}
