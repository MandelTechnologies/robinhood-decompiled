package com.robinhood.android.portfolio.positionsSortOptions;

import com.robinhood.android.models.portfolio.PositionsSortOptions;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.portfolio.contracts.PositionsSortResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSortOptionsViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;", "", "result", "Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "getResult", "()Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "dismissed", "", "getDismissed", "()Z", "Loading", "Ready", "Companion", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Loading;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Ready;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PositionsSortOptionsViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean getDismissed();

    PositionsSortResult getResult();

    /* compiled from: PositionsSortOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Loading;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;", "result", "Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "dismissed", "", "<init>", "(Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;Z)V", "getResult", "()Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "getDismissed", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements PositionsSortOptionsViewState {
        public static final int $stable = 8;
        private final boolean dismissed;
        private final PositionsSortResult result;

        public static /* synthetic */ Loading copy$default(Loading loading, PositionsSortResult positionsSortResult, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                positionsSortResult = loading.result;
            }
            if ((i & 2) != 0) {
                z = loading.dismissed;
            }
            return loading.copy(positionsSortResult, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PositionsSortResult getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDismissed() {
            return this.dismissed;
        }

        public final Loading copy(PositionsSortResult result, boolean dismissed) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Loading(result, dismissed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.result, loading.result) && this.dismissed == loading.dismissed;
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + Boolean.hashCode(this.dismissed);
        }

        public String toString() {
            return "Loading(result=" + this.result + ", dismissed=" + this.dismissed + ")";
        }

        public Loading(PositionsSortResult result, boolean z) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.dismissed = z;
        }

        @Override // com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsViewState
        public PositionsSortResult getResult() {
            return this.result;
        }

        @Override // com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsViewState
        public boolean getDismissed() {
            return this.dismissed;
        }
    }

    /* compiled from: PositionsSortOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Ready;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;", "options", "", "Lcom/robinhood/android/models/portfolio/PositionsSortOptions$SortOption;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "sortPersistPending", "", "result", "Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "dismissed", "<init>", "(Ljava/util/List;Lcom/robinhood/android/models/portfolio/PositionsSortPreference;ZLcom/robinhood/android/portfolio/contracts/PositionsSortResult;Z)V", "getOptions", "()Ljava/util/List;", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "getSortPersistPending", "()Z", "getResult", "()Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "getDismissed", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements PositionsSortOptionsViewState {
        public static final int $stable = 8;
        private final boolean dismissed;
        private final List<PositionsSortOptions.SortOption> options;
        private final PositionsSortResult result;
        private final boolean sortPersistPending;
        private final PositionsSortPreference sortPreference;

        public static /* synthetic */ Ready copy$default(Ready ready, List list, PositionsSortPreference positionsSortPreference, boolean z, PositionsSortResult positionsSortResult, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ready.options;
            }
            if ((i & 2) != 0) {
                positionsSortPreference = ready.sortPreference;
            }
            if ((i & 4) != 0) {
                z = ready.sortPersistPending;
            }
            if ((i & 8) != 0) {
                positionsSortResult = ready.result;
            }
            if ((i & 16) != 0) {
                z2 = ready.dismissed;
            }
            boolean z3 = z2;
            boolean z4 = z;
            return ready.copy(list, positionsSortPreference, z4, positionsSortResult, z3);
        }

        public final List<PositionsSortOptions.SortOption> component1() {
            return this.options;
        }

        /* renamed from: component2, reason: from getter */
        public final PositionsSortPreference getSortPreference() {
            return this.sortPreference;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSortPersistPending() {
            return this.sortPersistPending;
        }

        /* renamed from: component4, reason: from getter */
        public final PositionsSortResult getResult() {
            return this.result;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getDismissed() {
            return this.dismissed;
        }

        public final Ready copy(List<PositionsSortOptions.SortOption> options, PositionsSortPreference sortPreference, boolean sortPersistPending, PositionsSortResult result, boolean dismissed) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(result, "result");
            return new Ready(options, sortPreference, sortPersistPending, result, dismissed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.options, ready.options) && Intrinsics.areEqual(this.sortPreference, ready.sortPreference) && this.sortPersistPending == ready.sortPersistPending && Intrinsics.areEqual(this.result, ready.result) && this.dismissed == ready.dismissed;
        }

        public int hashCode() {
            int iHashCode = this.options.hashCode() * 31;
            PositionsSortPreference positionsSortPreference = this.sortPreference;
            return ((((((iHashCode + (positionsSortPreference == null ? 0 : positionsSortPreference.hashCode())) * 31) + Boolean.hashCode(this.sortPersistPending)) * 31) + this.result.hashCode()) * 31) + Boolean.hashCode(this.dismissed);
        }

        public String toString() {
            return "Ready(options=" + this.options + ", sortPreference=" + this.sortPreference + ", sortPersistPending=" + this.sortPersistPending + ", result=" + this.result + ", dismissed=" + this.dismissed + ")";
        }

        public Ready(List<PositionsSortOptions.SortOption> options, PositionsSortPreference positionsSortPreference, boolean z, PositionsSortResult result, boolean z2) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(result, "result");
            this.options = options;
            this.sortPreference = positionsSortPreference;
            this.sortPersistPending = z;
            this.result = result;
            this.dismissed = z2;
        }

        public final List<PositionsSortOptions.SortOption> getOptions() {
            return this.options;
        }

        public final PositionsSortPreference getSortPreference() {
            return this.sortPreference;
        }

        public final boolean getSortPersistPending() {
            return this.sortPersistPending;
        }

        @Override // com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsViewState
        public PositionsSortResult getResult() {
            return this.result;
        }

        @Override // com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsViewState
        public boolean getDismissed() {
            return this.dismissed;
        }
    }

    /* compiled from: PositionsSortOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Ready;", "getLoadingMock", "()Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Ready;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Ready loadingMock;

        private Companion() {
        }

        public final Ready getLoadingMock() {
            return loadingMock;
        }

        static {
            ArrayList arrayList = new ArrayList(7);
            for (int i = 0; i < 7; i++) {
                arrayList.add(new PositionsSortOptions.SortOption("---- ------", String.valueOf(i)));
            }
            loadingMock = new Ready(arrayList, null, true, new PositionsSortResult("", PositionInstrumentType.EQUITY, null), false);
        }
    }
}
