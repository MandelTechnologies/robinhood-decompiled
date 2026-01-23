package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.inputConfirmation;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputConfirmationComponentUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/inputConfirmation/InputConfirmationComponentUtils;", "", "<init>", "()V", "getConfirmationCode", "", "view", "Landroid/view/View;", "isDoneEnteringCode", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InputConfirmationComponentUtils {
    public static final InputConfirmationComponentUtils INSTANCE = new InputConfirmationComponentUtils();

    private InputConfirmationComponentUtils() {
    }

    public final String getConfirmationCode(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R$id.first);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R$id.second);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(R$id.third);
        TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(R$id.fourth);
        EditText editText = textInputLayout.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = textInputLayout2.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = textInputLayout3.getEditText();
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = textInputLayout4.getEditText();
        return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{strValueOf, strValueOf2, strValueOf3, String.valueOf(editText4 != null ? editText4.getText() : null)}), "", null, null, 0, null, null, 62, null);
    }

    public final boolean isDoneEnteringCode(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return getConfirmationCode(view).length() == 4;
    }
}
