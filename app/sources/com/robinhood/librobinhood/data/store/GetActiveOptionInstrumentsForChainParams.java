package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionContractType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/GetActiveOptionInstrumentsForChainParams;", "", "Ljava/util/UUID;", "optionChainId", "Lcom/robinhood/models/db/OptionContractType;", "optionContractType", "j$/time/LocalDate", "expirationDates", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/db/OptionContractType;", "component3", "()Lj$/time/LocalDate;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;)Lcom/robinhood/librobinhood/data/store/GetActiveOptionInstrumentsForChainParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getOptionChainId", "Lcom/robinhood/models/db/OptionContractType;", "getOptionContractType", "Lj$/time/LocalDate;", "getExpirationDates", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetActiveOptionInstrumentsForChainParams {
    private final LocalDate expirationDates;
    private final UUID optionChainId;
    private final OptionContractType optionContractType;

    public static /* synthetic */ GetActiveOptionInstrumentsForChainParams copy$default(GetActiveOptionInstrumentsForChainParams getActiveOptionInstrumentsForChainParams, UUID uuid, OptionContractType optionContractType, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = getActiveOptionInstrumentsForChainParams.optionChainId;
        }
        if ((i & 2) != 0) {
            optionContractType = getActiveOptionInstrumentsForChainParams.optionContractType;
        }
        if ((i & 4) != 0) {
            localDate = getActiveOptionInstrumentsForChainParams.expirationDates;
        }
        return getActiveOptionInstrumentsForChainParams.copy(uuid, optionContractType, localDate);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionContractType getOptionContractType() {
        return this.optionContractType;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalDate getExpirationDates() {
        return this.expirationDates;
    }

    public final GetActiveOptionInstrumentsForChainParams copy(UUID optionChainId, OptionContractType optionContractType, LocalDate expirationDates) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(expirationDates, "expirationDates");
        return new GetActiveOptionInstrumentsForChainParams(optionChainId, optionContractType, expirationDates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetActiveOptionInstrumentsForChainParams)) {
            return false;
        }
        GetActiveOptionInstrumentsForChainParams getActiveOptionInstrumentsForChainParams = (GetActiveOptionInstrumentsForChainParams) other;
        return Intrinsics.areEqual(this.optionChainId, getActiveOptionInstrumentsForChainParams.optionChainId) && this.optionContractType == getActiveOptionInstrumentsForChainParams.optionContractType && Intrinsics.areEqual(this.expirationDates, getActiveOptionInstrumentsForChainParams.expirationDates);
    }

    public int hashCode() {
        int iHashCode = this.optionChainId.hashCode() * 31;
        OptionContractType optionContractType = this.optionContractType;
        return ((iHashCode + (optionContractType == null ? 0 : optionContractType.hashCode())) * 31) + this.expirationDates.hashCode();
    }

    public String toString() {
        return "GetActiveOptionInstrumentsForChainParams(optionChainId=" + this.optionChainId + ", optionContractType=" + this.optionContractType + ", expirationDates=" + this.expirationDates + ")";
    }

    public GetActiveOptionInstrumentsForChainParams(UUID optionChainId, OptionContractType optionContractType, LocalDate expirationDates) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(expirationDates, "expirationDates");
        this.optionChainId = optionChainId;
        this.optionContractType = optionContractType;
        this.expirationDates = expirationDates;
    }

    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final OptionContractType getOptionContractType() {
        return this.optionContractType;
    }

    public final LocalDate getExpirationDates() {
        return this.expirationDates;
    }
}
