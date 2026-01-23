package com.robinhood.android.chart.blackwidowadvancedchart.formatters;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BwNumberVisualTransformer.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/formatters/BwNumberVisualTransformer;", "Landroidx/compose/ui/text/input/VisualTransformation;", "isPrice", "", "<init>", "(Z)V", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BwNumberVisualTransformer implements VisualTransformation {
    public static final int $stable = 0;
    private final boolean isPrice;

    public BwNumberVisualTransformer() {
        this(false, 1, null);
    }

    public BwNumberVisualTransformer(boolean z) {
        this.isPrice = z;
    }

    public /* synthetic */ BwNumberVisualTransformer(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        String string2;
        Intrinsics.checkNotNullParameter(text, "text");
        int i = 0;
        boolean zContains$default = StringsKt.contains$default((CharSequence) text.getText(), (CharSequence) "-", false, 2, (Object) null);
        String strRemovePrefix = StringsKt.removePrefix(text.getText(), "-");
        if (StringsKt.contains$default((CharSequence) strRemovePrefix, (CharSequence) ".", false, 2, (Object) null)) {
            List listSplit$default = StringsKt.split$default((CharSequence) strRemovePrefix, new String[]{"."}, false, 0, 6, (Object) null);
            string2 = StringsKt.reversed(CollectionsKt.joinToString$default(StringsKt.chunked(StringsKt.reversed((String) CollectionsKt.first(listSplit$default)).toString(), 3), ",", null, null, 0, null, null, 62, null)).toString() + ("." + CollectionsKt.last((List<? extends Object>) listSplit$default));
        } else {
            string2 = StringsKt.reversed(CollectionsKt.joinToString$default(StringsKt.chunked(StringsKt.reversed(strRemovePrefix).toString(), 3), ",", null, null, 0, null, null, 62, null)).toString();
        }
        if (this.isPrice) {
            string2 = (string2.length() > 0 ? "$" : "") + string2;
        }
        if (zContains$default) {
            string2 = "-" + string2;
        }
        String str = string2;
        AnnotatedString annotatedString = new AnnotatedString(str, text.getSpanStyles(), null, 4, null);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            Integer numValueOf = (cCharAt == '$' || cCharAt == ',') ? Integer.valueOf(i2) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(annotatedString, new BwNumberVisualTransformer2(arrayList));
    }
}
