package com.robinhood.utils.text;

import android.text.Editable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: Editables.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a&\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m3636d2 = {AnalyticsStrings.BUTTON_LIST_DELETE, "Landroid/text/Editable;", "range", "Lkotlin/ranges/IntRange;", "replace", "", "text", "", "start", "", "end", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.text.EditablesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Editables {
    public static final Editable delete(Editable editable, PrimitiveRanges2 range) {
        Intrinsics.checkNotNullParameter(editable, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Editable editableDelete = editable.delete(range.getFirst(), range.getLast() + 1);
        Intrinsics.checkNotNullExpressionValue(editableDelete, "delete(...)");
        return editableDelete;
    }

    public static /* synthetic */ void replace$default(Editable editable, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = editable.length();
        }
        replace(editable, charSequence, i, i2);
    }

    public static final void replace(Editable editable, CharSequence text, int i, int i2) {
        Intrinsics.checkNotNullParameter(editable, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        editable.replace(i, i2, text);
    }
}
