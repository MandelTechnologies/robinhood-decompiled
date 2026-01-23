package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* compiled from: EditorInfo.android.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "()V", "setHandwritingGestures", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class EditorInfoApi34 {
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.listOf((Object[]) new Class[]{EditorInfoApi34$$ExternalSyntheticApiModelOutline0.m108m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline4.m112m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline1.m109m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline2.m110m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline5.m113m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline6.m114m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline7.m115m()}));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.setOf((Object[]) new Class[]{EditorInfoApi34$$ExternalSyntheticApiModelOutline0.m108m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline4.m112m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline1.m109m(), EditorInfoApi34$$ExternalSyntheticApiModelOutline2.m110m()}));
    }
}
