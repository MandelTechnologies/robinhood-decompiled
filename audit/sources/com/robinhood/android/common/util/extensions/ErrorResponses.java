package com.robinhood.android.common.util.extensions;

import com.robinhood.models.api.ErrorResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ErrorResponses.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"containsError", "", "Lcom/robinhood/models/api/ErrorResponse;", "fieldName", "", "fieldNames", "", "", "(Lcom/robinhood/models/api/ErrorResponse;[Ljava/lang/String;)Z", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.ErrorResponsesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ErrorResponses {
    public static final boolean containsError(ErrorResponse errorResponse, String fieldName) {
        Intrinsics.checkNotNullParameter(errorResponse, "<this>");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        return errorResponse.getFieldError(fieldName) != null;
    }

    public static final boolean containsError(ErrorResponse errorResponse, String[] fieldNames) {
        Intrinsics.checkNotNullParameter(errorResponse, "<this>");
        Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
        return containsError(errorResponse, (Iterable<String>) ArraysKt.asIterable(fieldNames));
    }

    public static final boolean containsError(ErrorResponse errorResponse, Iterable<String> fieldNames) {
        Intrinsics.checkNotNullParameter(errorResponse, "<this>");
        Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = fieldNames.iterator();
        while (it.hasNext()) {
            String fieldError = errorResponse.getFieldError(it.next());
            if (fieldError != null) {
                arrayList.add(fieldError);
            }
        }
        return !arrayList.isEmpty();
    }
}
