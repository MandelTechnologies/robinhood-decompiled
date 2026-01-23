package androidx.compose.p011ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

/* compiled from: AutofillUtils.android.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/autofill/AutofillApi27Helper;", "", "()V", "notifyViewVisibilityChanged", "", "view", "Landroid/view/View;", "autofillManager", "Landroid/view/autofill/AutofillManager;", "semanticsId", "", "isVisible", "", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class AutofillApi27Helper {
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    public final void notifyViewVisibilityChanged(View view, AutofillManager autofillManager, int semanticsId, boolean isVisible) {
        autofillManager.notifyViewVisibilityChanged(view, semanticsId, isVisible);
    }
}
