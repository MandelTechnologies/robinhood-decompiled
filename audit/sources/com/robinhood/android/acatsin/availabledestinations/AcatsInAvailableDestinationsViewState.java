package com.robinhood.android.acatsin.availabledestinations;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AcatsInAvailableDestinationsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;", "", "<init>", "()V", "Loading", "Error", "Ready", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Error;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Loading;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Ready;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInAvailableDestinationsViewState {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInAvailableDestinationsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInAvailableDestinationsViewState() {
    }

    /* compiled from: AcatsInAvailableDestinationsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Loading;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends AcatsInAvailableDestinationsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1200715792;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: AcatsInAvailableDestinationsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Error;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends AcatsInAvailableDestinationsViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1617235420;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: AcatsInAvailableDestinationsViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Ready;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;", "acatsDestinations", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "selectedDestination", "headerContents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "stickyFooterContents", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;Ljava/util/List;Ljava/util/List;)V", "getAcatsDestinations", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedDestination", "()Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "getHeaderContents", "()Ljava/util/List;", "getStickyFooterContents", "isContinueEnabled", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready extends AcatsInAvailableDestinationsViewState {
        public static final int $stable = 8;
        private final ImmutableList<AcatsDestination> acatsDestinations;
        private final List<UIComponent<GenericAction>> headerContents;
        private final AcatsDestination selectedDestination;
        private final List<UIComponent<GenericAction>> stickyFooterContents;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, ImmutableList immutableList, AcatsDestination acatsDestination, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = ready.acatsDestinations;
            }
            if ((i & 2) != 0) {
                acatsDestination = ready.selectedDestination;
            }
            if ((i & 4) != 0) {
                list = ready.headerContents;
            }
            if ((i & 8) != 0) {
                list2 = ready.stickyFooterContents;
            }
            return ready.copy(immutableList, acatsDestination, list, list2);
        }

        public final ImmutableList<AcatsDestination> component1() {
            return this.acatsDestinations;
        }

        /* renamed from: component2, reason: from getter */
        public final AcatsDestination getSelectedDestination() {
            return this.selectedDestination;
        }

        public final List<UIComponent<GenericAction>> component3() {
            return this.headerContents;
        }

        public final List<UIComponent<GenericAction>> component4() {
            return this.stickyFooterContents;
        }

        public final Ready copy(ImmutableList<? extends AcatsDestination> acatsDestinations, AcatsDestination selectedDestination, List<? extends UIComponent<? extends GenericAction>> headerContents, List<? extends UIComponent<? extends GenericAction>> stickyFooterContents) {
            Intrinsics.checkNotNullParameter(acatsDestinations, "acatsDestinations");
            Intrinsics.checkNotNullParameter(headerContents, "headerContents");
            Intrinsics.checkNotNullParameter(stickyFooterContents, "stickyFooterContents");
            return new Ready(acatsDestinations, selectedDestination, headerContents, stickyFooterContents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.acatsDestinations, ready.acatsDestinations) && Intrinsics.areEqual(this.selectedDestination, ready.selectedDestination) && Intrinsics.areEqual(this.headerContents, ready.headerContents) && Intrinsics.areEqual(this.stickyFooterContents, ready.stickyFooterContents);
        }

        public int hashCode() {
            int iHashCode = this.acatsDestinations.hashCode() * 31;
            AcatsDestination acatsDestination = this.selectedDestination;
            return ((((iHashCode + (acatsDestination == null ? 0 : acatsDestination.hashCode())) * 31) + this.headerContents.hashCode()) * 31) + this.stickyFooterContents.hashCode();
        }

        public String toString() {
            return "Ready(acatsDestinations=" + this.acatsDestinations + ", selectedDestination=" + this.selectedDestination + ", headerContents=" + this.headerContents + ", stickyFooterContents=" + this.stickyFooterContents + ")";
        }

        public final ImmutableList<AcatsDestination> getAcatsDestinations() {
            return this.acatsDestinations;
        }

        public final AcatsDestination getSelectedDestination() {
            return this.selectedDestination;
        }

        public /* synthetic */ Ready(ImmutableList immutableList, AcatsDestination acatsDestination, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(immutableList, (i & 2) != 0 ? null : acatsDestination, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final List<UIComponent<GenericAction>> getHeaderContents() {
            return this.headerContents;
        }

        public final List<UIComponent<GenericAction>> getStickyFooterContents() {
            return this.stickyFooterContents;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(ImmutableList<? extends AcatsDestination> acatsDestinations, AcatsDestination acatsDestination, List<? extends UIComponent<? extends GenericAction>> headerContents, List<? extends UIComponent<? extends GenericAction>> stickyFooterContents) {
            super(null);
            Intrinsics.checkNotNullParameter(acatsDestinations, "acatsDestinations");
            Intrinsics.checkNotNullParameter(headerContents, "headerContents");
            Intrinsics.checkNotNullParameter(stickyFooterContents, "stickyFooterContents");
            this.acatsDestinations = acatsDestinations;
            this.selectedDestination = acatsDestination;
            this.headerContents = headerContents;
            this.stickyFooterContents = stickyFooterContents;
        }

        public final boolean isContinueEnabled() {
            return this.selectedDestination != null;
        }
    }
}
