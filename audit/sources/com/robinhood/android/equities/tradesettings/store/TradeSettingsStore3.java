package com.robinhood.android.equities.tradesettings.store;

import com.robinhood.models.p320db.EquityPositionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "", "Equity", "Options", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType$Equity;", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType$Options;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.store.InstrumentType, reason: use source file name */
/* loaded from: classes3.dex */
public interface TradeSettingsStore3 {

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/InstrumentType$Equity;", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "positionType", "Lcom/robinhood/models/db/EquityPositionType;", "<init>", "(Lcom/robinhood/models/db/EquityPositionType;)V", "getPositionType", "()Lcom/robinhood/models/db/EquityPositionType;", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.tradesettings.store.InstrumentType$Equity */
    public static final /* data */ class Equity implements TradeSettingsStore3 {
        public static final int $stable = 0;
        private final EquityPositionType positionType;

        public static /* synthetic */ Equity copy$default(Equity equity, EquityPositionType equityPositionType, int i, Object obj) {
            if ((i & 1) != 0) {
                equityPositionType = equity.positionType;
            }
            return equity.copy(equityPositionType);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityPositionType getPositionType() {
            return this.positionType;
        }

        public final Equity copy(EquityPositionType positionType) {
            return new Equity(positionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Equity) && this.positionType == ((Equity) other).positionType;
        }

        public int hashCode() {
            EquityPositionType equityPositionType = this.positionType;
            if (equityPositionType == null) {
                return 0;
            }
            return equityPositionType.hashCode();
        }

        public Equity(EquityPositionType equityPositionType) {
            this.positionType = equityPositionType;
        }

        public final EquityPositionType getPositionType() {
            return this.positionType;
        }

        public String toString() {
            String str;
            EquityPositionType equityPositionType = this.positionType;
            if (equityPositionType != null) {
                str = "_" + equityPositionType;
            } else {
                str = null;
            }
            return "EQUITIES" + str;
        }
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/InstrumentType$Options;", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.tradesettings.store.InstrumentType$Options */
    public static final /* data */ class Options implements TradeSettingsStore3 {
        public static final int $stable = 0;
        public static final Options INSTANCE = new Options();

        public boolean equals(Object other) {
            return this == other || (other instanceof Options);
        }

        public int hashCode() {
            return -1045614596;
        }

        private Options() {
        }

        public String toString() {
            return "OPTIONS";
        }
    }
}
