package com.robinhood.android.event.trade.util;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString2;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextFieldValues.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"toTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "defaultIfEmpty", "bold", "", "getTextSelectionAtEnd", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;)J", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.util.TextFieldValuesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TextFieldValues {
    public static /* synthetic */ TextFieldValue toTextFieldValue$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "-";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return toTextFieldValue(str, str2, z);
    }

    public static final TextFieldValue toTextFieldValue(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String defaultIfEmpty = str2;
        Intrinsics.checkNotNullParameter(defaultIfEmpty, "defaultIfEmpty");
        if (str.length() != 0) {
            defaultIfEmpty = str;
        }
        if (z) {
            return new TextFieldValue(AnnotatedString2.AnnotatedString$default(defaultIfEmpty, new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), null, 4, null), TextRange2.TextRange(defaultIfEmpty.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
        return new TextFieldValue(defaultIfEmpty, TextRange2.TextRange(defaultIfEmpty.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    public static final long getTextSelectionAtEnd(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return TextRange2.TextRange(str.length());
    }
}
