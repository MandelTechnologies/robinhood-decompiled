package com.robinhood.compose.common.visualtransformation;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PlaceholderVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/compose/common/visualtransformation/PlaceholderVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "format", "", "placeholderCharacter", "", "<init>", "(Ljava/lang/String;C)V", "offsetMapping", "com/robinhood/compose/common/visualtransformation/PlaceholderVisualTransformation$offsetMapping$1", "Lcom/robinhood/compose/common/visualtransformation/PlaceholderVisualTransformation$offsetMapping$1;", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PlaceholderVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final String format;
    private final PlaceholderVisualTransformation2 offsetMapping;
    private final char placeholderCharacter;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.robinhood.compose.common.visualtransformation.PlaceholderVisualTransformation$offsetMapping$1] */
    public PlaceholderVisualTransformation(String format2, char c) {
        Intrinsics.checkNotNullParameter(format2, "format");
        this.format = format2;
        this.placeholderCharacter = c;
        this.offsetMapping = new OffsetMapping() { // from class: com.robinhood.compose.common.visualtransformation.PlaceholderVisualTransformation$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                String str = this.this$0.format;
                int length = str.length();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str.charAt(i3);
                    if (i == offset) {
                        break;
                    }
                    if (cCharAt == this.this$0.placeholderCharacter) {
                        i++;
                    }
                    i2++;
                }
                return i2;
            }

            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                int i = 0;
                for (int i2 = 0; i2 < offset; i2++) {
                    if (this.this$0.format.charAt(i2) == this.this$0.placeholderCharacter) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        String string2;
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            string2 = "";
        } else {
            String str = this.format;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (str.charAt(i3) == this.placeholderCharacter) {
                    i2++;
                }
            }
            if (text.length() > i2) {
                throw new IllegalStateException("Input text cannot be longer than the number of placeholder characters in format. Make sure your placeholder character is correct and your text input is validatingmax length properly.");
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            while (i < this.format.length() && i4 < text.length()) {
                if (this.format.charAt(i) == this.placeholderCharacter) {
                    sb.append(text.charAt(i4));
                    i4++;
                } else {
                    sb.append(this.format.charAt(i));
                }
                i++;
            }
            if (i < this.format.length() && text.length() == i2) {
                String strSubstring = this.format.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb.append(strSubstring);
            }
            string2 = sb.toString();
        }
        return new TransformedText(new AnnotatedString(string2, null, 2, null), this.offsetMapping);
    }
}
