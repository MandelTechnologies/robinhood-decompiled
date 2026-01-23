package com.robinhood.android.crypto.util;

import com.robinhood.models.api.ApiResidencyDocument;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiResidencyDocumentExtensions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"getPendingDocument", "Lcom/robinhood/models/api/ApiResidencyDocument;", "", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.util.ApiResidencyDocumentExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ApiResidencyDocumentExtensions {
    public static final ApiResidencyDocument getPendingDocument(List<ApiResidencyDocument> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ApiResidencyDocument) next).getState() == ApiResidencyDocument.State.PENDING) {
                break;
            }
        }
        return (ApiResidencyDocument) next;
    }
}
