package com.robinhood.shared.order.type.util;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldValueUtil.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"toTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "defaultIfNull", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.util.TextFieldValueUtilKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TextFieldValueUtil {
    public static final TextFieldValue toTextFieldValue(String str, String defaultIfNull) {
        Intrinsics.checkNotNullParameter(defaultIfNull, "defaultIfNull");
        String str2 = str == null ? defaultIfNull : str;
        return new TextFieldValue(str2, TextRange2.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
