package com.robinhood.shared.i18n.car;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CarSuitabilityType.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "", "Equity", "Option", "Unsupported", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Equity;", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Option;", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "lib-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CarSuitabilityType {

    /* compiled from: CarSuitabilityType.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Equity;", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "instrumentIds", "", "Ljava/util/UUID;", "isBuy", "", "<init>", "(Ljava/util/List;Z)V", "getInstrumentIds", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Equity implements CarSuitabilityType {
        private final List<UUID> instrumentIds;
        private final boolean isBuy;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Equity copy$default(Equity equity, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = equity.instrumentIds;
            }
            if ((i & 2) != 0) {
                z = equity.isBuy;
            }
            return equity.copy(list, z);
        }

        public final List<UUID> component1() {
            return this.instrumentIds;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBuy() {
            return this.isBuy;
        }

        public final Equity copy(List<UUID> instrumentIds, boolean isBuy) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            return new Equity(instrumentIds, isBuy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Equity)) {
                return false;
            }
            Equity equity = (Equity) other;
            return Intrinsics.areEqual(this.instrumentIds, equity.instrumentIds) && this.isBuy == equity.isBuy;
        }

        public int hashCode() {
            return (this.instrumentIds.hashCode() * 31) + Boolean.hashCode(this.isBuy);
        }

        public String toString() {
            return "Equity(instrumentIds=" + this.instrumentIds + ", isBuy=" + this.isBuy + ")";
        }

        public Equity(List<UUID> instrumentIds, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            this.instrumentIds = instrumentIds;
            this.isBuy = z;
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }

        public final boolean isBuy() {
            return this.isBuy;
        }
    }

    /* compiled from: CarSuitabilityType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Option;", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Option implements CarSuitabilityType {
        public static final Option INSTANCE = new Option();

        public boolean equals(Object other) {
            return this == other || (other instanceof Option);
        }

        public int hashCode() {
            return 994982794;
        }

        public String toString() {
            return "Option";
        }

        private Option() {
        }
    }

    /* compiled from: CarSuitabilityType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unsupported implements CarSuitabilityType {
        public static final Unsupported INSTANCE = new Unsupported();

        public boolean equals(Object other) {
            return this == other || (other instanceof Unsupported);
        }

        public int hashCode() {
            return 1552946240;
        }

        public String toString() {
            return "Unsupported";
        }

        private Unsupported() {
        }
    }
}
