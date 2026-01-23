package androidx.compose.p011ui.modifier;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ModifierLocalModifierNode.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\u0001\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0001\u0010\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", "modifierLocalMapOf", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "Lkotlin/Pair;", "Landroidx/compose/ui/modifier/ModifierLocal;", "entry", "(Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.modifier.ModifierLocalModifierNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ModifierLocalModifierNode5 {
    public static final ModifierLocalModifierNode4 modifierLocalMapOf() {
        return ModifierLocalModifierNode3.INSTANCE;
    }

    public static final <T> ModifierLocalModifierNode4 modifierLocalMapOf(Tuples2<? extends ModifierLocal<T>, ? extends T> tuples2) {
        ModifierLocalModifierNode6 modifierLocalModifierNode6 = new ModifierLocalModifierNode6(tuples2.getFirst());
        modifierLocalModifierNode6.set$ui_release(tuples2.getFirst(), tuples2.getSecond());
        return modifierLocalModifierNode6;
    }
}
