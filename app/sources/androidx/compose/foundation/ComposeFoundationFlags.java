package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: ComposeFoundationFlags.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003¨\u0006\f"}, m3636d2 = {"Landroidx/compose/foundation/ComposeFoundationFlags;", "", "<init>", "()V", "", "NewNestedFlingPropagationEnabled", "Z", "getNewNestedFlingPropagationEnabled$annotations", "DragGesturePickUpEnabled", "getDragGesturePickUpEnabled$annotations", "isDetectTapGesturesImmediateCoroutineDispatchEnabled", "isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class ComposeFoundationFlags {
    public static final ComposeFoundationFlags INSTANCE = new ComposeFoundationFlags();

    @JvmField
    public static boolean NewNestedFlingPropagationEnabled = true;

    @JvmField
    public static boolean DragGesturePickUpEnabled = true;

    @JvmField
    public static boolean isDetectTapGesturesImmediateCoroutineDispatchEnabled = true;
    public static final int $stable = 8;

    private ComposeFoundationFlags() {
    }
}
