package androidx.compose.p011ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m3636d2 = {"ShaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "shader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.graphics.BrushKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Brush2 {
    public static final Brush5 ShaderBrush(final Shader shader) {
        return new Brush5() { // from class: androidx.compose.ui.graphics.BrushKt.ShaderBrush.1
            @Override // androidx.compose.p011ui.graphics.Brush5
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public Shader mo6692createShaderuvyYCjk(long size) {
                return shader;
            }
        };
    }
}
