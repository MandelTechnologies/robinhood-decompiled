package com.robinhood.android.verification.account;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PatternTemplateVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\u00020\u0005*\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/verification/account/PatternTemplateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "template", "", "fillerCharacter", "", "<init>", "(Ljava/lang/String;C)V", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "toFillerCharacterIfEmpty", "NumberOffsetMapping", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PatternTemplateVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private static final char DEFAULT_FILLER_CHAR = '_';
    public static final String INTERNATIONAL_US_NUMBER_TEMPLATE = "+1 (###) ### - ####";
    private static final char PLACEHOLDER_CHAR = '#';
    private final char fillerCharacter;
    private final String template;

    /* JADX WARN: Multi-variable type inference failed */
    public PatternTemplateVisualTransformation() {
        this(null, (char) 0, 3, 0 == true ? 1 : 0);
    }

    public PatternTemplateVisualTransformation(String template, char c) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.template = template;
        this.fillerCharacter = c;
    }

    public /* synthetic */ PatternTemplateVisualTransformation(String str, char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? INTERNATIONAL_US_NUMBER_TEMPLATE : str, (i & 2) != 0 ? DEFAULT_FILLER_CHAR : c);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String text2 = text.getText();
        NumberOffsetMapping numberOffsetMapping = new NumberOffsetMapping(text2, this.template);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String str = this.template;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i >= text2.length()) {
                builder.append(toFillerCharacterIfEmpty(cCharAt));
            } else if (cCharAt == '#') {
                builder.append(text2.charAt(i));
                i++;
            } else {
                builder.append(cCharAt);
            }
        }
        return new TransformedText(builder.toAnnotatedString(), numberOffsetMapping);
    }

    /* compiled from: PatternTemplateVisualTransformation.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/verification/account/PatternTemplateVisualTransformation$NumberOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "inputText", "", "template", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mapOfOriginalToTransformed", "", "", "mapOfTransformedToOriginal", "originalMaxOffset", "originalToTransformed", "offset", "transformedToOriginal", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NumberOffsetMapping implements OffsetMapping {
        public static final int $stable = 8;
        private final String inputText;
        private final Map<Integer, Integer> mapOfOriginalToTransformed;
        private final Map<Integer, Integer> mapOfTransformedToOriginal;
        private int originalMaxOffset;
        private final String template;

        public NumberOffsetMapping(String inputText, String template) {
            Intrinsics.checkNotNullParameter(inputText, "inputText");
            Intrinsics.checkNotNullParameter(template, "template");
            this.inputText = inputText;
            this.template = template;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.mapOfOriginalToTransformed = linkedHashMap;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            this.mapOfTransformedToOriginal = linkedHashMap2;
            linkedHashMap.clear();
            linkedHashMap2.clear();
            linkedHashMap.put(0, 0);
            linkedHashMap2.put(0, 0);
            int i = -1;
            int i2 = -1;
            boolean z = false;
            while (true) {
                int i3 = i + 1;
                if (i3 < this.template.length()) {
                    boolean z2 = this.template.charAt(i3) == '#';
                    if (z2 && (i2 = i2 + 1) >= this.inputText.length()) {
                        break;
                    }
                    if (z2 || !z) {
                        this.mapOfOriginalToTransformed.put(Integer.valueOf(i2 + 1), Integer.valueOf(i + 2));
                    } else {
                        this.mapOfOriginalToTransformed.putIfAbsent(Integer.valueOf(i2 + 1), Integer.valueOf(i + 2));
                    }
                    this.mapOfTransformedToOriginal.put(Integer.valueOf(i + 2), Integer.valueOf(i2 + 1));
                    i = i3;
                    if (z2) {
                        z = true;
                    }
                } else {
                    break;
                }
            }
            this.originalMaxOffset = Math.max(0, Math.min(this.inputText.length(), i2 + 1));
        }

        @Override // androidx.compose.p011ui.text.input.OffsetMapping
        public int originalToTransformed(int offset) {
            if (offset < 0 || offset > this.inputText.length()) {
                throw new IllegalArgumentException(("offset (" + offset + ") isn't in the range from 0 to " + this.inputText.length()).toString());
            }
            Integer num = this.mapOfOriginalToTransformed.get(Integer.valueOf(offset));
            return num != null ? num.intValue() : this.template.length();
        }

        @Override // androidx.compose.p011ui.text.input.OffsetMapping
        public int transformedToOriginal(int offset) {
            if (offset < 0) {
                throw new IllegalArgumentException(("offset (" + offset + ") should be greater or equal to 0").toString());
            }
            Integer num = this.mapOfTransformedToOriginal.get(Integer.valueOf(offset));
            return Math.max(0, num != null ? num.intValue() : this.originalMaxOffset);
        }
    }

    private final char toFillerCharacterIfEmpty(char c) {
        return c == '#' ? this.fillerCharacter : c;
    }
}
