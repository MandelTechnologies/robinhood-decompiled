package androidx.compose.p011ui.text.input;

import androidx.compose.p011ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* compiled from: VisualTransformation.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", "mask", "<init>", "(C)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filter", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "C", "getMask", "()C", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.input.PasswordVisualTransformation, reason: use source file name */
/* loaded from: classes.dex */
public final class VisualTransformation2 implements VisualTransformation {
    private final char mask;

    public VisualTransformation2() {
        this((char) 0, 1, null);
    }

    public VisualTransformation2(char c) {
        this.mask = c;
    }

    public /* synthetic */ VisualTransformation2(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        return new TransformedText(new AnnotatedString(StringsKt.repeat(String.valueOf(this.mask), text.getText().length()), null, 2, null), OffsetMapping.INSTANCE.getIdentity());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VisualTransformation2) && this.mask == ((VisualTransformation2) other).mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }
}
