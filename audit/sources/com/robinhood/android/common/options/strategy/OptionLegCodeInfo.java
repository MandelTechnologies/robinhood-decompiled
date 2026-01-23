package com.robinhood.android.common.options.strategy;

import com.robinhood.models.p320db.OptionPositionType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyCodes.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/options/strategy/OptionLegCodeInfo;", "", "optionInstrumentId", "Ljava/util/UUID;", "type", "Lcom/robinhood/models/db/OptionPositionType;", "ratioQuantity", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionPositionType;I)V", "getOptionInstrumentId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/models/db/OptionPositionType;", "getRatioQuantity", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptionLegCodeInfo {
    public static final int $stable = 8;
    private final UUID optionInstrumentId;
    private final int ratioQuantity;
    private final OptionPositionType type;

    public static /* synthetic */ OptionLegCodeInfo copy$default(OptionLegCodeInfo optionLegCodeInfo, UUID uuid, OptionPositionType optionPositionType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = optionLegCodeInfo.optionInstrumentId;
        }
        if ((i2 & 2) != 0) {
            optionPositionType = optionLegCodeInfo.type;
        }
        if ((i2 & 4) != 0) {
            i = optionLegCodeInfo.ratioQuantity;
        }
        return optionLegCodeInfo.copy(uuid, optionPositionType, i);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOptionInstrumentId() {
        return this.optionInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionPositionType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRatioQuantity() {
        return this.ratioQuantity;
    }

    public final OptionLegCodeInfo copy(UUID optionInstrumentId, OptionPositionType type2, int ratioQuantity) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new OptionLegCodeInfo(optionInstrumentId, type2, ratioQuantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionLegCodeInfo)) {
            return false;
        }
        OptionLegCodeInfo optionLegCodeInfo = (OptionLegCodeInfo) other;
        return Intrinsics.areEqual(this.optionInstrumentId, optionLegCodeInfo.optionInstrumentId) && this.type == optionLegCodeInfo.type && this.ratioQuantity == optionLegCodeInfo.ratioQuantity;
    }

    public int hashCode() {
        return (((this.optionInstrumentId.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.ratioQuantity);
    }

    public String toString() {
        return "OptionLegCodeInfo(optionInstrumentId=" + this.optionInstrumentId + ", type=" + this.type + ", ratioQuantity=" + this.ratioQuantity + ")";
    }

    public OptionLegCodeInfo(UUID optionInstrumentId, OptionPositionType type2, int i) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.optionInstrumentId = optionInstrumentId;
        this.type = type2;
        this.ratioQuantity = i;
    }

    public final UUID getOptionInstrumentId() {
        return this.optionInstrumentId;
    }

    public final OptionPositionType getType() {
        return this.type;
    }

    public final int getRatioQuantity() {
        return this.ratioQuantity;
    }
}
