package com.robinhood.android.equityscreener.table.data;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CellClasses.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/WatchlistCell;", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", "instrumentId", "Ljava/util/UUID;", "isInUserList", "", "<init>", "(Ljava/util/UUID;Ljava/lang/Boolean;)V", "getInstrumentId", "()Ljava/util/UUID;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.WatchlistCell, reason: use source file name */
/* loaded from: classes3.dex */
public final class CellClasses6 implements CellClasses {
    public static final int $stable = 8;
    private final UUID instrumentId;
    private final Boolean isInUserList;

    public CellClasses6(UUID instrumentId, Boolean bool) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.isInUserList = bool;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: isInUserList, reason: from getter */
    public final Boolean getIsInUserList() {
        return this.isInUserList;
    }
}
