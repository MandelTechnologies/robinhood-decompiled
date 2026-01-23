package com.robinhood.android.disclosures.lib.p107ui;

import androidx.compose.p011ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnotationStringExt.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getUrl", "", "Landroidx/compose/ui/text/AnnotatedString;", "offset", "", "lib-disclosures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.disclosures.lib.ui.AnnotationStringExtKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class AnnotationStringExt {
    public static final String getUrl(AnnotatedString annotatedString, int i) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) annotatedString.getStringAnnotations("URL", i, i));
        if (range != null) {
            return (String) range.getItem();
        }
        return null;
    }
}
