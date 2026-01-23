package com.robinhood.compose.common;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SsnVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/common/SsnVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "focused", "", "<init>", "(Z)V", "getFocused", "()Z", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SsnVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final boolean focused;

    public SsnVisualTransformation(boolean z) {
        this.focused = z;
    }

    public final boolean getFocused() {
        return this.focused;
    }

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
                if (i == 3 || i == 5) {
                    sb.append("-");
                }
                if (i < 9) {
                    sb.append(!this.focused ? (char) 8226 : text.charAt(i));
                }
            }
            string2 = sb.toString();
        }
        return new TransformedText(new AnnotatedString(string2, null, 2, null), new OffsetMapping() { // from class: com.robinhood.compose.common.SsnVisualTransformation$filter$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return offset <= 3 ? offset : offset <= 5 ? offset + 1 : offset + 2;
            }

            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                return offset <= 3 ? offset : offset <= 6 ? offset - 1 : offset - 2;
            }
        });
    }
}
