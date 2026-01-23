package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextMeasurer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.CacheTextLayoutInput, reason: use source file name */
/* loaded from: classes4.dex */
public final class TextMeasurer2 {
    private final TextLayoutInput textLayoutInput;

    public TextMeasurer2(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m7956hashCodeimpl(textLayoutInput.getOverflow())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m7978hashCodeimpl(textLayoutInput.getConstraints());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextMeasurer2)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        TextMeasurer2 textMeasurer2 = (TextMeasurer2) other;
        return Intrinsics.areEqual(textLayoutInput.getText(), textMeasurer2.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(textMeasurer2.textLayoutInput.getStyle()) && Intrinsics.areEqual(textLayoutInput.getPlaceholders(), textMeasurer2.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == textMeasurer2.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == textMeasurer2.textLayoutInput.getSoftWrap() && TextOverflow.m7955equalsimpl0(textLayoutInput.getOverflow(), textMeasurer2.textLayoutInput.getOverflow()) && Intrinsics.areEqual(textLayoutInput.getDensity(), textMeasurer2.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == textMeasurer2.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == textMeasurer2.textLayoutInput.getFontFamilyResolver() && Constraints.m7969equalsimpl0(textLayoutInput.getConstraints(), textMeasurer2.textLayoutInput.getConstraints());
    }
}
