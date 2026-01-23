package com.robinhood.shared.common.instrumentratings;

import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentRatingsV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState$Loaded;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState$Loading;", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2ViewState, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class InstrumentRatingsV2Duxo4 {
    public static final int $stable = 0;

    public /* synthetic */ InstrumentRatingsV2Duxo4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InstrumentRatingsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState$Loading;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2ViewState$Loading */
    public static final /* data */ class Loading extends InstrumentRatingsV2Duxo4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1795577533;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private InstrumentRatingsV2Duxo4() {
    }

    /* compiled from: InstrumentRatingsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState$Loaded;", "Lcom/robinhood/shared/common/instrumentratings/InstrumentRatingsV2ViewState;", "ratingsComposableState", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "<init>", "(Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;)V", "getRatingsComposableState", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-instrument-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.instrumentratings.InstrumentRatingsV2ViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends InstrumentRatingsV2Duxo4 {
        public static final int $stable = AnalystRatingsComposableState.$stable;
        private final AnalystRatingsComposableState ratingsComposableState;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AnalystRatingsComposableState analystRatingsComposableState, int i, Object obj) {
            if ((i & 1) != 0) {
                analystRatingsComposableState = loaded.ratingsComposableState;
            }
            return loaded.copy(analystRatingsComposableState);
        }

        /* renamed from: component1, reason: from getter */
        public final AnalystRatingsComposableState getRatingsComposableState() {
            return this.ratingsComposableState;
        }

        public final Loaded copy(AnalystRatingsComposableState ratingsComposableState) {
            Intrinsics.checkNotNullParameter(ratingsComposableState, "ratingsComposableState");
            return new Loaded(ratingsComposableState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.ratingsComposableState, ((Loaded) other).ratingsComposableState);
        }

        public int hashCode() {
            return this.ratingsComposableState.hashCode();
        }

        public String toString() {
            return "Loaded(ratingsComposableState=" + this.ratingsComposableState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(AnalystRatingsComposableState ratingsComposableState) {
            super(null);
            Intrinsics.checkNotNullParameter(ratingsComposableState, "ratingsComposableState");
            this.ratingsComposableState = ratingsComposableState;
        }

        public final AnalystRatingsComposableState getRatingsComposableState() {
            return this.ratingsComposableState;
        }
    }
}
