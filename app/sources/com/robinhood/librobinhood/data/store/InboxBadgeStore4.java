package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.InboxBadge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.postoffice.ShouldBadgeResponseDto;

/* compiled from: InboxBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/models/db/InboxBadge;", "Lrosetta/postoffice/ShouldBadgeResponseDto;", "lib-store-inbox_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.InboxBadgeStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class InboxBadgeStore4 {
    public static final InboxBadge toDbModel(ShouldBadgeResponseDto shouldBadgeResponseDto) {
        Intrinsics.checkNotNullParameter(shouldBadgeResponseDto, "<this>");
        return new InboxBadge(shouldBadgeResponseDto.getShould_badge(), shouldBadgeResponseDto.getShould_critical_badge());
    }
}
