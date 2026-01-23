package androidx.compose.p011ui.text.input;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import kotlin.Metadata;

/* compiled from: TextFieldValue.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m3636d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.input.TextFieldValueKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class TextFieldValue4 {
    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m7644getMinimpl(textFieldValue.getSelection()) - i), TextRange.m7644getMinimpl(textFieldValue.getSelection()));
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(TextRange.m7643getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m7643getMaximpl(textFieldValue.getSelection()) + i, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getText().m7530subSequence5zctL8(textFieldValue.getSelection());
    }
}
