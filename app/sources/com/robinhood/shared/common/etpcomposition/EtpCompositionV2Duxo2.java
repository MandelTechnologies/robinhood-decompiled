package com.robinhood.shared.common.etpcomposition;

import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;", "", "<init>", "()V", "Loading", "LoadedNoDetails", "Loaded", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState$Loaded;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState$LoadedNoDetails;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState$Loading;", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2DataState, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class EtpCompositionV2Duxo2 {
    public static final int $stable = 0;

    public /* synthetic */ EtpCompositionV2Duxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState$Loading;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2DataState$Loading */
    public static final /* data */ class Loading extends EtpCompositionV2Duxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -572456774;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private EtpCompositionV2Duxo2() {
    }

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState$LoadedNoDetails;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2DataState$LoadedNoDetails */
    public static final /* data */ class LoadedNoDetails extends EtpCompositionV2Duxo2 {
        public static final int $stable = 0;
        public static final LoadedNoDetails INSTANCE = new LoadedNoDetails();

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadedNoDetails);
        }

        public int hashCode() {
            return -1741842374;
        }

        public String toString() {
            return "LoadedNoDetails";
        }

        private LoadedNoDetails() {
            super(null);
        }
    }

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState$Loaded;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;", "instrument", "Lcom/robinhood/models/db/Instrument;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EtpDetails;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2DataState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends EtpCompositionV2Duxo2 {
        public static final int $stable = 8;
        private final EtpDetails etpDetails;
        private final Instrument instrument;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Instrument instrument, EtpDetails etpDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = loaded.instrument;
            }
            if ((i & 2) != 0) {
                etpDetails = loaded.etpDetails;
            }
            return loaded.copy(instrument, etpDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final EtpDetails getEtpDetails() {
            return this.etpDetails;
        }

        public final Loaded copy(Instrument instrument, EtpDetails etpDetails) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(etpDetails, "etpDetails");
            return new Loaded(instrument, etpDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.instrument, loaded.instrument) && Intrinsics.areEqual(this.etpDetails, loaded.etpDetails);
        }

        public int hashCode() {
            return (this.instrument.hashCode() * 31) + this.etpDetails.hashCode();
        }

        public String toString() {
            return "Loaded(instrument=" + this.instrument + ", etpDetails=" + this.etpDetails + ")";
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final EtpDetails getEtpDetails() {
            return this.etpDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Instrument instrument, EtpDetails etpDetails) {
            super(null);
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(etpDetails, "etpDetails");
            this.instrument = instrument;
            this.etpDetails = etpDetails;
        }
    }
}
