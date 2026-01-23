package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import com.robinhood.models.p320db.Instrument;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentsV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState$Loaded;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState$Loading;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2DataState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class SimilarInstrumentsV2Duxo2 {
    public static final int $stable = 0;

    public /* synthetic */ SimilarInstrumentsV2Duxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SimilarInstrumentsV2Duxo2() {
    }

    /* compiled from: SimilarInstrumentsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState$Loading;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2DataState$Loading */
    public static final /* data */ class Loading extends SimilarInstrumentsV2Duxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1854199807;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SimilarInstrumentsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState$Loaded;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState;", "instrument", "Lcom/robinhood/models/db/Instrument;", "similarInstrumentUuids", "", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/util/List;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSimilarInstrumentUuids", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2DataState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends SimilarInstrumentsV2Duxo2 {
        public static final int $stable = 8;
        private final Instrument instrument;
        private final List<UUID> similarInstrumentUuids;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, Instrument instrument, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = loaded.instrument;
            }
            if ((i & 2) != 0) {
                list = loaded.similarInstrumentUuids;
            }
            return loaded.copy(instrument, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final List<UUID> component2() {
            return this.similarInstrumentUuids;
        }

        public final Loaded copy(Instrument instrument, List<UUID> similarInstrumentUuids) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(similarInstrumentUuids, "similarInstrumentUuids");
            return new Loaded(instrument, similarInstrumentUuids);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.instrument, loaded.instrument) && Intrinsics.areEqual(this.similarInstrumentUuids, loaded.similarInstrumentUuids);
        }

        public int hashCode() {
            return (this.instrument.hashCode() * 31) + this.similarInstrumentUuids.hashCode();
        }

        public String toString() {
            return "Loaded(instrument=" + this.instrument + ", similarInstrumentUuids=" + this.similarInstrumentUuids + ")";
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final List<UUID> getSimilarInstrumentUuids() {
            return this.similarInstrumentUuids;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Instrument instrument, List<UUID> similarInstrumentUuids) {
            super(null);
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(similarInstrumentUuids, "similarInstrumentUuids");
            this.instrument = instrument;
            this.similarInstrumentUuids = similarInstrumentUuids;
        }
    }
}
