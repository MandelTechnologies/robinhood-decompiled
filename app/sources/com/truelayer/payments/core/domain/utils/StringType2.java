package com.truelayer.payments.core.domain.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0010\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0006"}, m3636d2 = {"intoTypeList", "", "", "", "Lcom/truelayer/payments/core/domain/utils/StringType;", "intoUrlParams", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.domain.utils.StringTypeKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class StringType2 {
    public static final List<String> intoTypeList(Collection<? extends StringType> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends StringType> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((StringType) it.next()).getType());
        }
        return arrayList;
    }

    public static final String intoUrlParams(Collection<? extends StringType> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, new Function1<StringType, CharSequence>() { // from class: com.truelayer.payments.core.domain.utils.StringTypeKt.intoUrlParams.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(StringType it) throws UnsupportedEncodingException {
                Intrinsics.checkNotNullParameter(it, "it");
                String strEncode = URLEncoder.encode(it.getType(), "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
                return strEncode;
            }
        }, 30, null);
    }
}
