package com.robinhood.shared.trading.tradecomponentscompose.input;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TradeQuantityNumberFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"tradeQuantityNumberFormatter", "", "newString", "scale", "", "totalMaxDigits", "lib-trade-components-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityNumberFormatterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeQuantityNumberFormatter {
    public static /* synthetic */ String tradeQuantityNumberFormatter$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 12;
        }
        return tradeQuantityNumberFormatter(str, i, i2);
    }

    public static final String tradeQuantityNumberFormatter(String newString, int i, int i2) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        if (!StringsKt.contains$default((CharSequence) newString, ',', false, 2, (Object) null)) {
            int i3 = 0;
            for (int i4 = 0; i4 < newString.length(); i4++) {
                if (newString.charAt(i4) == '-') {
                    i3++;
                }
            }
            if (i3 <= 1 && StringsKt.indexOf$default((CharSequence) newString, '-', 0, false, 6, (Object) null) <= 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < newString.length(); i6++) {
                    if (newString.charAt(i6) == '.') {
                        i5++;
                    }
                }
                int i7 = i - 1;
                if (i5 <= Math.min(1, i7)) {
                    boolean zStartsWith$default = StringsKt.startsWith$default(newString, "-", false, 2, (Object) null);
                    List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(newString, "-"), new String[]{"."}, false, 0, 6, (Object) null);
                    String strRemovePrefix = (String) CollectionsKt.first(listSplit$default);
                    if (strRemovePrefix.length() > 1) {
                        strRemovePrefix = StringsKt.removePrefix(strRemovePrefix, "0");
                    }
                    if (StringsKt.contains$default((CharSequence) newString, (CharSequence) ".", false, 2, (Object) null)) {
                        strRemovePrefix = listSplit$default.size() == 2 ? strRemovePrefix + "." + StringsKt.take((String) CollectionsKt.last(listSplit$default), Math.max(0, i7)) : strRemovePrefix + ".";
                    }
                    if (zStartsWith$default) {
                        strRemovePrefix = "-" + strRemovePrefix;
                    }
                    return StringsKt.take(strRemovePrefix, i2);
                }
            }
        }
        return null;
    }
}
