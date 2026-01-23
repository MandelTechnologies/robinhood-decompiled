package com.robinhood.compose.common;

import android.text.format.DateFormat;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: DateOfBirthVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/compose/common/DateOfBirthVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "locale", "Ljava/util/Locale;", "dateFormatSkeletonPattern", "", "<init>", "(Ljava/util/Locale;Ljava/lang/String;)V", "getDateFormatSkeletonPattern", "()Ljava/lang/String;", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class DateOfBirthVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final String dateFormatSkeletonPattern;
    private final Locale locale;

    /* JADX WARN: Multi-variable type inference failed */
    public DateOfBirthVisualTransformation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DateOfBirthVisualTransformation(Locale locale, String dateFormatSkeletonPattern) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(dateFormatSkeletonPattern, "dateFormatSkeletonPattern");
        this.locale = locale;
        this.dateFormatSkeletonPattern = dateFormatSkeletonPattern;
    }

    public /* synthetic */ DateOfBirthVisualTransformation(Locale locale, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Locale.getDefault(Locale.Category.DISPLAY) : locale, (i & 2) != 0 ? "MM/dd/yyyy" : str);
    }

    public final String getDateFormatSkeletonPattern() {
        return this.dateFormatSkeletonPattern;
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) throws IOException {
        Character chValueOf;
        Intrinsics.checkNotNullParameter(text, "text");
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(this.locale, this.dateFormatSkeletonPattern);
        Intrinsics.checkNotNullExpressionValue(bestDateTimePattern, "getBestDateTimePattern(...)");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bestDateTimePattern.length(); i++) {
            char cCharAt = bestDateTimePattern.charAt(i);
            if (!CharsKt.isWhitespace(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        int i2 = 0;
        while (true) {
            if (i2 >= string2.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt2 = string2.charAt(i2);
            if (!Character.isLetter(cCharAt2)) {
                chValueOf = Character.valueOf(cCharAt2);
                break;
            }
            i2++;
        }
        char cCharValue = chValueOf != null ? chValueOf.charValue() : '/';
        final int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string2, cCharValue, 0, false, 6, (Object) null);
        final int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) string2, cCharValue, iIndexOf$default + 1, false, 4, (Object) null);
        OffsetMapping offsetMapping = new OffsetMapping() { // from class: com.robinhood.compose.common.DateOfBirthVisualTransformation$filter$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return offset <= iIndexOf$default ? offset : offset <= iIndexOf$default2 + (-1) ? offset + 1 : offset + 2;
            }

            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                return offset <= iIndexOf$default ? offset : offset <= iIndexOf$default2 ? offset - 1 : offset - 2;
            }
        };
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(offsetMapping.transformedToOriginal(iIndexOf$default)), Integer.valueOf(offsetMapping.transformedToOriginal(iIndexOf$default2))});
        int length = text.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (listListOf.contains(Integer.valueOf(i3))) {
                builder.append(cCharValue);
            }
            builder.append(text.charAt(i3));
        }
        return new TransformedText(builder.toAnnotatedString(), offsetMapping);
    }
}
