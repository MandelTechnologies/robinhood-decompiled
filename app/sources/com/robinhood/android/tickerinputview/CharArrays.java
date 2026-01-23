package com.robinhood.android.tickerinputview;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CharArrays.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0002\u001a\u00020\u0001\"\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0001\u001a\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003¨\u0006\u000b"}, m3636d2 = {"dropChars", "", "args", "", "isNumber", "", "toNumber", "Ljava/math/BigDecimal;", "splitByDecimalSeparator", "", "decimalSeparator", "lib-ticker-input-view_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tickerinputview.CharArraysKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CharArrays {
    public static final boolean isNumber(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return toNumber(cArr) != null;
    }

    public static final BigDecimal toNumber(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        try {
            return new BigDecimal(dropChars(cArr, TickerInputView.CURRENCY_SYMBOL, TickerInputView.PERCENT_SYMBOL, ','));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final List<char[]> splitByDecimalSeparator(char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        List listSplit$default = StringsKt.split$default((CharSequence) ArraysKt.joinToString$default(cArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), new char[]{c}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            char[] charArray = ((String) it.next()).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            arrayList.add(charArray);
        }
        return arrayList;
    }

    public static final char[] dropChars(char[] cArr, char... args) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (!ArraysKt.contains(args, c)) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return CollectionsKt.toCharArray(arrayList);
    }
}
