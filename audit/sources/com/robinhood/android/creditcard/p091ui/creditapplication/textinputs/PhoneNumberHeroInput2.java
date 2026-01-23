package com.robinhood.android.creditcard.p091ui.creditapplication.textinputs;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneNumberHeroInput.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/textinputs/PhoneNumberVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "<init>", "()V", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberVisualTransformation, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneNumberHeroInput2 implements VisualTransformation {
    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        String string2;
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.getText().length() == 0) {
            string2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    sb.append("(");
                } else if (i == 3) {
                    sb.append(")-");
                } else if (i == 6) {
                    sb.append("-");
                }
                sb.append(text.charAt(i));
            }
            string2 = sb.toString();
        }
        return new TransformedText(new AnnotatedString(string2, null, 2, null), new OffsetMapping() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberVisualTransformation$filter$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                if (offset == 0) {
                    return 0;
                }
                return offset <= 3 ? offset + 1 : offset <= 6 ? offset + 3 : offset + 4;
            }

            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                if (offset == 0) {
                    return 0;
                }
                return offset <= 4 ? offset - 1 : offset <= 9 ? offset - 3 : offset - 4;
            }
        });
    }
}
