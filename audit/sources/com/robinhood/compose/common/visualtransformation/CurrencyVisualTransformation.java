package com.robinhood.compose.common.visualtransformation;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CurrencyVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/common/visualtransformation/CurrencyVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "currency", "Ljava/util/Currency;", "<init>", "(Ljava/util/Currency;)V", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class CurrencyVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final Currency currency;

    public CurrencyVisualTransformation(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        String string2;
        Integer numValueOf;
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
        String str = (string2.length() == 0 ? "" : this.currency.getSymbol()) + string2;
        if (zContains$default) {
            str = "-" + str;
        }
        String str2 = str;
        final ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i < str2.length()) {
            int i3 = i2 + 1;
            if (str2.charAt(i) == ',') {
                numValueOf = Integer.valueOf(i2);
            } else {
                numValueOf = (StringsKt.first(str2) != '-' ? i2 >= this.currency.getSymbol().length() : 1 > i2 || i2 >= this.currency.getSymbol().length() + 1) ? null : Integer.valueOf(i2);
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(new AnnotatedString(str2, text.getSpanStyles(), null, 4, null), new OffsetMapping() { // from class: com.robinhood.compose.common.visualtransformation.CurrencyVisualTransformation$filter$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (offset >= ((Number) it.next()).intValue()) {
                        offset++;
                    }
                }
                return offset;
            }

            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                Iterator it = CollectionsKt.reversed(arrayList).iterator();
                while (it.hasNext()) {
                    if (offset >= ((Number) it.next()).intValue()) {
                        offset--;
                    }
                }
                return Math.max(0, offset);
            }
        });
    }
}
