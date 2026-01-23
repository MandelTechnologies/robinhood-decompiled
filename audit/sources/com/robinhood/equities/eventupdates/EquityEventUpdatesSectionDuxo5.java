package com.robinhood.equities.eventupdates;

import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EquityEventUpdatesSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "", "Loading", "Loaded", "Empty", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState$Empty;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState$Loaded;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState$Loading;", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesViewState, reason: use source file name */
/* loaded from: classes15.dex */
public interface EquityEventUpdatesSectionDuxo5 {

    /* compiled from: EquityEventUpdatesSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState$Loading;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesViewState$Loading */
    public static final /* data */ class Loading implements EquityEventUpdatesSectionDuxo5 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1064467299;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: EquityEventUpdatesSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState$Loaded;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "updates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;", "showMore", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getUpdates", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowMore", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements EquityEventUpdatesSectionDuxo5 {
        public static final int $stable = 8;
        private final boolean showMore;
        private final ImmutableList<EquityEventUpdateDto> updates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, ImmutableList immutableList, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = loaded.updates;
            }
            if ((i & 2) != 0) {
                z = loaded.showMore;
            }
            return loaded.copy(immutableList, z);
        }

        public final ImmutableList<EquityEventUpdateDto> component1() {
            return this.updates;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowMore() {
            return this.showMore;
        }

        public final Loaded copy(ImmutableList<EquityEventUpdateDto> updates, boolean showMore) {
            Intrinsics.checkNotNullParameter(updates, "updates");
            return new Loaded(updates, showMore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.updates, loaded.updates) && this.showMore == loaded.showMore;
        }

        public int hashCode() {
            return (this.updates.hashCode() * 31) + Boolean.hashCode(this.showMore);
        }

        public String toString() {
            return "Loaded(updates=" + this.updates + ", showMore=" + this.showMore + ")";
        }

        public Loaded(ImmutableList<EquityEventUpdateDto> updates, boolean z) {
            Intrinsics.checkNotNullParameter(updates, "updates");
            this.updates = updates;
            this.showMore = z;
        }

        public final ImmutableList<EquityEventUpdateDto> getUpdates() {
            return this.updates;
        }

        public final boolean getShowMore() {
            return this.showMore;
        }
    }

    /* compiled from: EquityEventUpdatesSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState$Empty;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesViewState$Empty */
    public static final /* data */ class Empty implements EquityEventUpdatesSectionDuxo5 {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 1243778286;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }
}
