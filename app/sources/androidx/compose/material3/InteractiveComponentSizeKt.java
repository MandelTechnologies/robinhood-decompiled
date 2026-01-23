package androidx.compose.material3;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: InteractiveComponentSize.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "Landroidx/compose/ui/unit/Dp;", "LocalMinimumInteractiveComponentSize", "getLocalMinimumInteractiveComponentSize", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {
    private static final CompositionLocal6<Boolean> LocalMinimumInteractiveComponentEnforcement = CompositionLocal3.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });
    private static final CompositionLocal6<C2002Dp> LocalMinimumInteractiveComponentSize = CompositionLocal3.staticCompositionLocalOf(new Function0<C2002Dp>() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentSize$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C2002Dp invoke() {
            return C2002Dp.m7993boximpl(m5879invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m5879invokeD9Ej5fM() {
            return C2002Dp.m7995constructorimpl(48);
        }
    });

    public static final Modifier minimumInteractiveComponentSize(Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }

    public static final CompositionLocal6<C2002Dp> getLocalMinimumInteractiveComponentSize() {
        return LocalMinimumInteractiveComponentSize;
    }
}
