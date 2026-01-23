package com.robinhood.android.portfolio.positions.display;

import com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PositionsDisplayOptionsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;", "", "Loading", "Ready", "Companion", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Loading;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Ready;", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PositionsDisplayOptionsViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: PositionsDisplayOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Loading;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements PositionsDisplayOptionsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1462540222;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: PositionsDisplayOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0014\u001a\u00060\u0003j\u0002`\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0003j\u0002`\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u00060\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Ready;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;", "title", "", InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY, "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "displayOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions$PositionsDisplayOption;", "isMcwFeatureAvailable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getTitle", "()Ljava/lang/String;", "getSelectedDisplayType", "getDisplayOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements PositionsDisplayOptionsViewState {
        public static final int $stable = 8;
        private final ImmutableList<PositionsDisplayOptions.PositionsDisplayOption> displayOptions;
        private final boolean isMcwFeatureAvailable;
        private final String selectedDisplayType;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, String str, String str2, ImmutableList immutableList, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.title;
            }
            if ((i & 2) != 0) {
                str2 = ready.selectedDisplayType;
            }
            if ((i & 4) != 0) {
                immutableList = ready.displayOptions;
            }
            if ((i & 8) != 0) {
                z = ready.isMcwFeatureAvailable;
            }
            return ready.copy(str, str2, immutableList, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSelectedDisplayType() {
            return this.selectedDisplayType;
        }

        public final ImmutableList<PositionsDisplayOptions.PositionsDisplayOption> component3() {
            return this.displayOptions;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsMcwFeatureAvailable() {
            return this.isMcwFeatureAvailable;
        }

        public final Ready copy(String title, String selectedDisplayType, ImmutableList<PositionsDisplayOptions.PositionsDisplayOption> displayOptions, boolean isMcwFeatureAvailable) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(selectedDisplayType, "selectedDisplayType");
            Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
            return new Ready(title, selectedDisplayType, displayOptions, isMcwFeatureAvailable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.selectedDisplayType, ready.selectedDisplayType) && Intrinsics.areEqual(this.displayOptions, ready.displayOptions) && this.isMcwFeatureAvailable == ready.isMcwFeatureAvailable;
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.selectedDisplayType.hashCode()) * 31) + this.displayOptions.hashCode()) * 31) + Boolean.hashCode(this.isMcwFeatureAvailable);
        }

        public String toString() {
            return "Ready(title=" + this.title + ", selectedDisplayType=" + this.selectedDisplayType + ", displayOptions=" + this.displayOptions + ", isMcwFeatureAvailable=" + this.isMcwFeatureAvailable + ")";
        }

        public Ready(String title, String selectedDisplayType, ImmutableList<PositionsDisplayOptions.PositionsDisplayOption> displayOptions, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(selectedDisplayType, "selectedDisplayType");
            Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
            this.title = title;
            this.selectedDisplayType = selectedDisplayType;
            this.displayOptions = displayOptions;
            this.isMcwFeatureAvailable = z;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSelectedDisplayType() {
            return this.selectedDisplayType;
        }

        public final ImmutableList<PositionsDisplayOptions.PositionsDisplayOption> getDisplayOptions() {
            return this.displayOptions;
        }

        public final boolean isMcwFeatureAvailable() {
            return this.isMcwFeatureAvailable;
        }
    }

    /* compiled from: PositionsDisplayOptionsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Ready;", "getLoadingMock", "()Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState$Ready;", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Ready loadingMock;

        private Companion() {
        }

        public final Ready getLoadingMock() {
            return loadingMock;
        }

        static {
            ArrayList arrayList = new ArrayList(6);
            for (int i = 0; i < 6; i++) {
                arrayList.add(new PositionsDisplayOptions.PositionsDisplayOption("-", "------- ------", null));
            }
            loadingMock = new Ready("------- ----", "", extensions2.toImmutableList(arrayList), false);
        }
    }
}
