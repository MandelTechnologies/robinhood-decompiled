package com.robinhood.librobinhood.data.store;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PositionNotUpdatedAfterOrderException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.PositionNotUpdatedAfterOrderException, reason: use source file name */
/* loaded from: classes13.dex */
public final class PositionStore2 extends IllegalStateException {
    private final UUID instrumentId;

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionStore2(UUID instrumentId) {
        super("Instrument ID: " + instrumentId);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
    }
}
