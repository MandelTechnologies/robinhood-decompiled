package androidx.compose.p011ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

/* compiled from: PlatformTextInputMethodRequest.android.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttributes", "Landroid/view/inputmethod/EditorInfo;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public interface PlatformTextInputMethodRequest {
    InputConnection createInputConnection(EditorInfo outAttributes);
}
