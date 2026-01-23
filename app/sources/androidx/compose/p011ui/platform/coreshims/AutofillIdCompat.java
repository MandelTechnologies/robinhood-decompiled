package androidx.compose.p011ui.platform.coreshims;

import android.view.autofill.AutofillId;

/* loaded from: classes4.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId toAutofillId() {
        return AutofillIdCompat$$ExternalSyntheticApiModelOutline0.m316m(this.mWrappedObj);
    }
}
