package com.robinhood.librobinhood.data.store;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0006*\f\b\u0002\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0007"}, m3636d2 = {"RequestId", "Ljava/util/UUID;", "newRequestId", "kotlin.jvm.PlatformType", "toIdlPaginationCursor", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "", "lib-store-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoCashInterestStoreKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID newRequestId() {
        return UUID.randomUUID();
    }

    public static final IdlPaginationCursor toIdlPaginationCursor(String str) {
        String strNullIfEmpty;
        if (str == null || (strNullIfEmpty = StringsKt.nullIfEmpty(str)) == null) {
            return null;
        }
        return new IdlPaginationCursor(strNullIfEmpty);
    }
}
