package com.robinhood.store.futures;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00010\u0001H\u0002*\f\b\u0002\u0010\u0000\"\u00020\u00012\u00020\u0001*\f\b\u0002\u0010\u0002\"\u00020\u00012\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"RequestId", "Ljava/util/UUID;", "FuturesAccountId", "newRequestId", "kotlin.jvm.PlatformType", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesOrderStoreKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID newRequestId() {
        return UUID.randomUUID();
    }
}
