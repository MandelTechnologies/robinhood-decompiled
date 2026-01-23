package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: AchRelationshipStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"microdepositAmountValid", "", "", "(Ljava/lang/Integer;)Z", "lib-store-ach-relationship_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.AchRelationshipStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class AchRelationshipStore4 {
    public static final boolean microdepositAmountValid(Integer num) {
        return num != null && new PrimitiveRanges2(1, 99).contains(num.intValue());
    }
}
