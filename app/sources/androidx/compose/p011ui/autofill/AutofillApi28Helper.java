package androidx.compose.p011ui.autofill;

import android.view.ViewStructure;
import kotlin.Metadata;

/* compiled from: AutofillUtils.android.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m3636d2 = {"Landroidx/compose/ui/autofill/AutofillApi28Helper;", "", "()V", "setMaxTextLength", "", "structure", "Landroid/view/ViewStructure;", "length", "", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class AutofillApi28Helper {
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    public final void setMaxTextLength(ViewStructure structure, int length) {
        structure.setMaxTextLength(length);
    }
}
