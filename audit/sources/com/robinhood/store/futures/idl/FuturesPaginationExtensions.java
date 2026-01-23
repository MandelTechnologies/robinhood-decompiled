package com.robinhood.store.futures.idl;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesPaginationExtensions.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"toIdlPaginationCursor", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.idl.FuturesPaginationExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FuturesPaginationExtensions {
    public static final IdlPaginationCursor toIdlPaginationCursor(String str) {
        String strNullIfEmpty;
        if (str == null || (strNullIfEmpty = StringsKt.nullIfEmpty(str)) == null) {
            return null;
        }
        return new IdlPaginationCursor(strNullIfEmpty);
    }
}
