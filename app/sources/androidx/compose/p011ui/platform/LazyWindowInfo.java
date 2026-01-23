package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidWindowInfo.android.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/ui/platform/LazyWindowInfo;", "Landroidx/compose/ui/platform/WindowInfo;", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntSize;", "onInitializeContainerSize", "", "setOnInitializeContainerSize", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/MutableState;", "_containerSize", "Landroidx/compose/runtime/MutableState;", "", "<set-?>", "isWindowFocused$delegate", "isWindowFocused", "()Z", "setWindowFocused", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "value", "getKeyboardModifiers-k7X9c1A", "()I", "setKeyboardModifiers-5xRPYO0", "(I)V", "keyboardModifiers", "getContainerSize-YbymL2g", "()J", "containerSize", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LazyWindowInfo implements WindowInfo {
    private SnapshotState<IntSize> _containerSize;

    /* renamed from: isWindowFocused$delegate, reason: from kotlin metadata */
    private final SnapshotState isWindowFocused = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private Function0<IntSize> onInitializeContainerSize;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p011ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused.getValue()).booleanValue();
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m7450setKeyboardModifiers5xRPYO0(int i) {
        WindowInfo2.INSTANCE.getGlobalKeyboardModifiers$ui_release().setValue(PointerKeyboardModifiers.m7196boximpl(i));
    }

    public final void setOnInitializeContainerSize(Function0<IntSize> onInitializeContainerSize) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = onInitializeContainerSize;
        }
    }

    @Override // androidx.compose.p011ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo7449getContainerSizeYbymL2g() {
        if (this._containerSize == null) {
            Function0<IntSize> function0 = this.onInitializeContainerSize;
            this._containerSize = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(function0 != null ? function0.invoke().getPackedValue() : IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
            this.onInitializeContainerSize = null;
        }
        SnapshotState<IntSize> snapshotState = this._containerSize;
        Intrinsics.checkNotNull(snapshotState);
        return snapshotState.getValue().getPackedValue();
    }
}
