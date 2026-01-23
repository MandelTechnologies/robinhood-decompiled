package androidx.compose.foundation.layout;

import androidx.compose.p011ui.modifier.ModifierLocal3;
import androidx.compose.p011ui.modifier.ModifierLocal4;
import androidx.compose.p011ui.modifier.ModifierLocalConsumer;
import androidx.compose.p011ui.modifier.ModifierLocalProvider;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR+\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012\u0082\u0001\u0001\u001c¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "<init>", "()V", "modifierLocalInsets", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "<set-?>", "consumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "getConsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setConsumedInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "consumedInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "value", "Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.InsetsConsumingModifier, reason: use source file name */
/* loaded from: classes4.dex */
abstract class WindowInsetsPadding2 implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* renamed from: consumedInsets$delegate, reason: from kotlin metadata */
    private final SnapshotState consumedInsets;

    public /* synthetic */ WindowInsetsPadding2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract WindowInsets calculateInsets(WindowInsets modifierLocalInsets);

    private WindowInsetsPadding2() {
        this.consumedInsets = SnapshotState3.mutableStateOf$default(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets.setValue(windowInsets);
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocal3 scope) {
        setConsumedInsets(calculateInsets((WindowInsets) scope.getCurrent(WindowInsetsPadding6.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalProvider
    public ModifierLocal4<WindowInsets> getKey() {
        return WindowInsetsPadding6.getModifierLocalConsumedWindowInsets();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p011ui.modifier.ModifierLocalProvider
    public WindowInsets getValue() {
        return getConsumedInsets();
    }
}
