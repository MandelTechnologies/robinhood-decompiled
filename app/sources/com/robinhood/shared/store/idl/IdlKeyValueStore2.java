package com.robinhood.shared.store.idl;

import com.robinhood.idl.Dto3;
import com.robinhood.shared.models.idl.p390ui.UiIdlCacheEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;

/* compiled from: IdlKeyValueStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a3\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0001\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\b¨\u0006\b"}, m3636d2 = {"stream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/models/idl/ui/UiIdlCacheEntry;", "T", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "key", "", "lib-store-idl_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.store.idl.IdlKeyValueStoreKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class IdlKeyValueStore2 {
    public static final /* synthetic */ <T extends Dto3<?>> Flow<UiIdlCacheEntry<T>> stream(IdlKeyValueStore idlKeyValueStore, String key) {
        Intrinsics.checkNotNullParameter(idlKeyValueStore, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return idlKeyValueStore.stream(key, Reflection.getOrCreateKotlinClass(Dto3.class));
    }
}
