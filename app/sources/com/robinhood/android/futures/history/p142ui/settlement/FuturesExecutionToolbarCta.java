package com.robinhood.android.futures.history.p142ui.settlement;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesCashSettlementDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/settlement/FuturesExecutionToolbarCta;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "contractId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getContractId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesExecutionToolbarCta {
    public static final int $stable = 8;
    private final UUID contractId;
    private final StringResource text;

    public static /* synthetic */ FuturesExecutionToolbarCta copy$default(FuturesExecutionToolbarCta futuresExecutionToolbarCta, StringResource stringResource, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = futuresExecutionToolbarCta.text;
        }
        if ((i & 2) != 0) {
            uuid = futuresExecutionToolbarCta.contractId;
        }
        return futuresExecutionToolbarCta.copy(stringResource, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    public final FuturesExecutionToolbarCta copy(StringResource text, UUID contractId) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return new FuturesExecutionToolbarCta(text, contractId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesExecutionToolbarCta)) {
            return false;
        }
        FuturesExecutionToolbarCta futuresExecutionToolbarCta = (FuturesExecutionToolbarCta) other;
        return Intrinsics.areEqual(this.text, futuresExecutionToolbarCta.text) && Intrinsics.areEqual(this.contractId, futuresExecutionToolbarCta.contractId);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.contractId.hashCode();
    }

    public String toString() {
        return "FuturesExecutionToolbarCta(text=" + this.text + ", contractId=" + this.contractId + ")";
    }

    public FuturesExecutionToolbarCta(StringResource text, UUID contractId) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        this.text = text;
        this.contractId = contractId;
    }

    public final StringResource getText() {
        return this.text;
    }

    public final UUID getContractId() {
        return this.contractId;
    }
}
