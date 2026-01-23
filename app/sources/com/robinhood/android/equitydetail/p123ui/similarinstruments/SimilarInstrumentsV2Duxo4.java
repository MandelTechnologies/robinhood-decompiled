package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: SimilarInstrumentsV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState$Loaded;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState$Loading;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2ViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class SimilarInstrumentsV2Duxo4 {
    public static final int $stable = 0;

    public /* synthetic */ SimilarInstrumentsV2Duxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SimilarInstrumentsV2Duxo4() {
    }

    /* compiled from: SimilarInstrumentsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState$Loading;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2ViewState$Loading */
    public static final /* data */ class Loading extends SimilarInstrumentsV2Duxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1865403622;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SimilarInstrumentsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState$Loaded;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState;", "symbol", "", "similarInstrumentsUuids", "Lkotlinx/collections/immutable/PersistentList;", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;)V", "getSymbol", "()Ljava/lang/String;", "getSimilarInstrumentsUuids", "()Lkotlinx/collections/immutable/PersistentList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2ViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends SimilarInstrumentsV2Duxo4 {
        public static final int $stable = 8;
        private final ImmutableList3<UUID> similarInstrumentsUuids;
        private final String symbol;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ImmutableList3 immutableList3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.symbol;
            }
            if ((i & 2) != 0) {
                immutableList3 = loaded.similarInstrumentsUuids;
            }
            return loaded.copy(str, immutableList3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final ImmutableList3<UUID> component2() {
            return this.similarInstrumentsUuids;
        }

        public final Loaded copy(String symbol, ImmutableList3<UUID> similarInstrumentsUuids) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(similarInstrumentsUuids, "similarInstrumentsUuids");
            return new Loaded(symbol, similarInstrumentsUuids);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.symbol, loaded.symbol) && Intrinsics.areEqual(this.similarInstrumentsUuids, loaded.similarInstrumentsUuids);
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + this.similarInstrumentsUuids.hashCode();
        }

        public String toString() {
            return "Loaded(symbol=" + this.symbol + ", similarInstrumentsUuids=" + this.similarInstrumentsUuids + ")";
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final ImmutableList3<UUID> getSimilarInstrumentsUuids() {
            return this.similarInstrumentsUuids;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String symbol, ImmutableList3<UUID> similarInstrumentsUuids) {
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(similarInstrumentsUuids, "similarInstrumentsUuids");
            this.symbol = symbol;
            this.similarInstrumentsUuids = similarInstrumentsUuids;
        }
    }
}
