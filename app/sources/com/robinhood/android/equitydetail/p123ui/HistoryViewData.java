package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Account;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/HistoryViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentId", "Ljava/util/UUID;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/Account;)V", "getInstrumentId", "()Ljava/util/UUID;", "getAccount", "()Lcom/robinhood/models/db/Account;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HistoryViewData extends DetailData {
    public static final int $stable = 8;
    private final Account account;
    private final UUID instrumentId;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ HistoryViewData copy$default(HistoryViewData historyViewData, UUID uuid, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = historyViewData.instrumentId;
        }
        if ((i & 2) != 0) {
            account = historyViewData.account;
        }
        return historyViewData.copy(uuid, account);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final HistoryViewData copy(UUID instrumentId, Account account) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(account, "account");
        return new HistoryViewData(instrumentId, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryViewData)) {
            return false;
        }
        HistoryViewData historyViewData = (HistoryViewData) other;
        return Intrinsics.areEqual(this.instrumentId, historyViewData.instrumentId) && Intrinsics.areEqual(this.account, historyViewData.account);
    }

    public int hashCode() {
        return (this.instrumentId.hashCode() * 31) + this.account.hashCode();
    }

    public String toString() {
        return "HistoryViewData(instrumentId=" + this.instrumentId + ", account=" + this.account + ")";
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Account getAccount() {
        return this.account;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryViewData(UUID instrumentId, Account account) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(account, "account");
        this.instrumentId = instrumentId;
        this.account = account;
        this.section = ApiStockDetail.Section.HISTORY;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
