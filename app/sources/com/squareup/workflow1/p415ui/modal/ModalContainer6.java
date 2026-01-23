package com.squareup.workflow1.p415ui.modal;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;

/* compiled from: ModalContainer.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"decorView", "Landroid/view/View;", "Landroid/app/Dialog;", "getDecorView", "(Landroid/app/Dialog;)Landroid/view/View;", "wf1-container-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.modal.ModalContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ModalContainer6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View getDecorView(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return null;
        }
        return window.getDecorView();
    }
}
