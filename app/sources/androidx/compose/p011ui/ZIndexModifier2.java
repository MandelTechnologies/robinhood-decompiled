package androidx.compose.p011ui;

import kotlin.Metadata;

/* compiled from: ZIndexModifier.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"zIndex", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.ZIndexModifierKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ZIndexModifier2 {
    public static final Modifier zIndex(Modifier modifier, float f) {
        return modifier.then(new ZIndexElement(f));
    }
}
