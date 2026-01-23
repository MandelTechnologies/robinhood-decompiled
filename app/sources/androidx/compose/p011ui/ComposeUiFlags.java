package androidx.compose.p011ui;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: ComposeUiFlags.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003R\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0006\u0012\u0004\b\r\u0010\u0003R\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, m3636d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "<init>", "()V", "", "isRectTrackingEnabled", "Z", "isRectTrackingEnabled$annotations", "NewNestedScrollFlingDispatchingEnabled", "getNewNestedScrollFlingDispatchingEnabled$annotations", "isSemanticAutofillEnabled", "isSemanticAutofillEnabled$annotations", "isViewFocusFixEnabled", "isViewFocusFixEnabled$annotations", "isRemoveFocusedViewFixEnabled", "isRemoveFocusedViewFixEnabled$annotations", "isTrackFocusEnabled", "isTrackFocusEnabled$annotations", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class ComposeUiFlags {

    @JvmField
    public static boolean isRemoveFocusedViewFixEnabled;

    @JvmField
    public static boolean isViewFocusFixEnabled;
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();

    @JvmField
    public static boolean isRectTrackingEnabled = true;

    @JvmField
    public static boolean NewNestedScrollFlingDispatchingEnabled = true;

    @JvmField
    public static boolean isSemanticAutofillEnabled = true;

    @JvmField
    public static boolean isTrackFocusEnabled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }
}
