package androidx.compose.p011ui.modifier;

import androidx.compose.p011ui.internal.InlineClassHelper4;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ModifierLocalModifierNode.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R/\u0010\u0007\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "T", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "Landroidx/compose/ui/modifier/ModifierLocal;", "", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.modifier.SingleLocalMap, reason: use source file name */
/* loaded from: classes.dex */
public final class ModifierLocalModifierNode6 extends ModifierLocalModifierNode4 {
    private final ModifierLocal<?> key;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final SnapshotState value;

    public ModifierLocalModifierNode6(ModifierLocal<?> modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    private final Object getValue() {
        return this.value.getValue();
    }

    private final void setValue(Object obj) {
        this.value.setValue(obj);
    }

    public <T> void set$ui_release(ModifierLocal<T> key, T value) {
        if (!(key == this.key)) {
            InlineClassHelper4.throwIllegalStateException("Check failed.");
        }
        setValue(value);
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalModifierNode4
    public <T> T get$ui_release(ModifierLocal<T> key) {
        if (!(key == this.key)) {
            InlineClassHelper4.throwIllegalStateException("Check failed.");
        }
        T t = (T) getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalModifierNode4
    public boolean contains$ui_release(ModifierLocal<?> key) {
        return key == this.key;
    }
}
