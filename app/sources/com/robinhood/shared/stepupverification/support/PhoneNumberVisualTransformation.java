package com.robinhood.shared.stepupverification.support;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.designsystem.textinput.format.InputFormatCharacter;
import com.robinhood.android.designsystem.textinput.format.InputFormatCharacterList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneNumberVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/PhoneNumberVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "transformEmptyString", "", "<init>", "(Lcom/robinhood/android/common/util/InternationalInfo;Z)V", "formatCharacters", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacterList;", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PhoneNumberVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private static final String PLACEHOLDER = "_";
    private final InputFormatCharacterList formatCharacters;
    private final boolean transformEmptyString;

    public PhoneNumberVisualTransformation(InternationalInfo internationalInfo, boolean z) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        this.transformEmptyString = z;
        this.formatCharacters = new InputFormatCharacterList(internationalInfo.getCountryCodePhoneNumberTemplate(), internationalInfo.getCountryCodePhoneNumberHint());
    }

    public /* synthetic */ PhoneNumberVisualTransformation(InternationalInfo internationalInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internationalInfo, (i & 2) != 0 ? true : z);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(final AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (!this.transformEmptyString && text.length() == 0) {
            return new TransformedText(new AnnotatedString("", null, 2, null), OffsetMapping.INSTANCE.getIdentity());
        }
        StringBuilder sb = new StringBuilder();
        int formatCharacterCount = this.formatCharacters.getFormatCharacterCount();
        int i = 0;
        for (int i2 = 0; i2 < formatCharacterCount; i2++) {
            InputFormatCharacter formatCharacter = this.formatCharacters.getFormatCharacter(i2);
            if (formatCharacter instanceof InputFormatCharacter.PreFormat) {
                sb.append(((InputFormatCharacter.PreFormat) formatCharacter).getValue());
            } else {
                if (!(formatCharacter instanceof InputFormatCharacter.Placeholder)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (i < text.length()) {
                    sb.append(text.charAt(i));
                    i++;
                } else {
                    sb.append(PLACEHOLDER);
                }
            }
        }
        return new TransformedText(new AnnotatedString(sb.toString(), null, 2, null), new OffsetMapping() { // from class: com.robinhood.shared.stepupverification.support.PhoneNumberVisualTransformation$filter$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                int i3 = offset + 1;
                int formatCharacterCount2 = this.this$0.formatCharacters.getFormatCharacterCount();
                int i4 = 0;
                for (int i5 = 0; i5 < formatCharacterCount2; i5++) {
                    InputFormatCharacter formatCharacter2 = this.this$0.formatCharacters.getFormatCharacter(i5);
                    if (formatCharacter2 instanceof InputFormatCharacter.PreFormat) {
                        i4++;
                    } else {
                        if (!(formatCharacter2 instanceof InputFormatCharacter.Placeholder)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3--;
                    }
                    if (i3 == 0) {
                        break;
                    }
                }
                return offset + i4;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int transformedToOriginal(int offset) {
                int length = text.length();
                int i3 = 0;
                for (int i4 = 0; i4 < offset; i4++) {
                    InputFormatCharacter formatCharacter2 = this.this$0.formatCharacters.getFormatCharacter(i4);
                    if (!(formatCharacter2 instanceof InputFormatCharacter.PreFormat)) {
                        if (!(formatCharacter2 instanceof InputFormatCharacter.Placeholder)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (length > 0) {
                            length--;
                        } else {
                            i3++;
                        }
                    }
                }
                return offset - i3;
            }
        });
    }
}
