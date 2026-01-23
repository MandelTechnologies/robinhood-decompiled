package com.robinhood.android.common.history.p082ui.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: HistorySection.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010%¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "Landroid/os/Parcelable;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "state", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "types", "j$/time/Instant", "since", "before", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "staticFilter", "", "displayCount", "", "hideFooterBelowDisplayCount", "<init>", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Lkotlinx/collections/immutable/ImmutableSet;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;IZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "component2", "()Lkotlinx/collections/immutable/ImmutableSet;", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "component6", "component7", "()Z", "copy", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Lkotlinx/collections/immutable/ImmutableSet;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;IZ)Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getState", "Lkotlinx/collections/immutable/ImmutableSet;", "getTypes", "Lj$/time/Instant;", "getSince", "getBefore", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "getStaticFilter", "I", "getDisplayCount", "Z", "getHideFooterBelowDisplayCount", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistorySectionState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HistorySectionState> CREATOR = new Creator();
    private final Instant before;
    private final int displayCount;
    private final boolean hideFooterBelowDisplayCount;
    private final Instant since;
    private final HistoryEvent.State state;
    private final HistoryStaticFilter staticFilter;
    private final ImmutableSet<HistoryTransactionType> types;

    /* compiled from: HistorySection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HistorySectionState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistorySectionState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HistoryEvent.State stateValueOf = parcel.readInt() == 0 ? null : HistoryEvent.State.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(HistoryTransactionType.valueOf(parcel.readString()));
            }
            return new HistorySectionState(stateValueOf, extensions2.toPersistentSet(linkedHashSet), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (HistoryStaticFilter) parcel.readParcelable(HistorySectionState.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistorySectionState[] newArray(int i) {
            return new HistorySectionState[i];
        }
    }

    public HistorySectionState() {
        this(null, null, null, null, null, 0, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ HistorySectionState copy$default(HistorySectionState historySectionState, HistoryEvent.State state, ImmutableSet immutableSet, Instant instant, Instant instant2, HistoryStaticFilter historyStaticFilter, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            state = historySectionState.state;
        }
        if ((i2 & 2) != 0) {
            immutableSet = historySectionState.types;
        }
        if ((i2 & 4) != 0) {
            instant = historySectionState.since;
        }
        if ((i2 & 8) != 0) {
            instant2 = historySectionState.before;
        }
        if ((i2 & 16) != 0) {
            historyStaticFilter = historySectionState.staticFilter;
        }
        if ((i2 & 32) != 0) {
            i = historySectionState.displayCount;
        }
        if ((i2 & 64) != 0) {
            z = historySectionState.hideFooterBelowDisplayCount;
        }
        int i3 = i;
        boolean z2 = z;
        HistoryStaticFilter historyStaticFilter2 = historyStaticFilter;
        Instant instant3 = instant;
        return historySectionState.copy(state, immutableSet, instant3, instant2, historyStaticFilter2, i3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final HistoryEvent.State getState() {
        return this.state;
    }

    public final ImmutableSet<HistoryTransactionType> component2() {
        return this.types;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getSince() {
        return this.since;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getBefore() {
        return this.before;
    }

    /* renamed from: component5, reason: from getter */
    public final HistoryStaticFilter getStaticFilter() {
        return this.staticFilter;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDisplayCount() {
        return this.displayCount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHideFooterBelowDisplayCount() {
        return this.hideFooterBelowDisplayCount;
    }

    public final HistorySectionState copy(HistoryEvent.State state, ImmutableSet<? extends HistoryTransactionType> types, Instant since, Instant before, HistoryStaticFilter staticFilter, int displayCount, boolean hideFooterBelowDisplayCount) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(since, "since");
        return new HistorySectionState(state, types, since, before, staticFilter, displayCount, hideFooterBelowDisplayCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistorySectionState)) {
            return false;
        }
        HistorySectionState historySectionState = (HistorySectionState) other;
        return this.state == historySectionState.state && Intrinsics.areEqual(this.types, historySectionState.types) && Intrinsics.areEqual(this.since, historySectionState.since) && Intrinsics.areEqual(this.before, historySectionState.before) && Intrinsics.areEqual(this.staticFilter, historySectionState.staticFilter) && this.displayCount == historySectionState.displayCount && this.hideFooterBelowDisplayCount == historySectionState.hideFooterBelowDisplayCount;
    }

    public int hashCode() {
        HistoryEvent.State state = this.state;
        int iHashCode = (((((state == null ? 0 : state.hashCode()) * 31) + this.types.hashCode()) * 31) + this.since.hashCode()) * 31;
        Instant instant = this.before;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        HistoryStaticFilter historyStaticFilter = this.staticFilter;
        return ((((iHashCode2 + (historyStaticFilter != null ? historyStaticFilter.hashCode() : 0)) * 31) + Integer.hashCode(this.displayCount)) * 31) + Boolean.hashCode(this.hideFooterBelowDisplayCount);
    }

    public String toString() {
        return "HistorySectionState(state=" + this.state + ", types=" + this.types + ", since=" + this.since + ", before=" + this.before + ", staticFilter=" + this.staticFilter + ", displayCount=" + this.displayCount + ", hideFooterBelowDisplayCount=" + this.hideFooterBelowDisplayCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HistoryEvent.State state = this.state;
        if (state == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(state.name());
        }
        ImmutableSet<HistoryTransactionType> immutableSet = this.types;
        dest.writeInt(immutableSet.size());
        Iterator<HistoryTransactionType> it = immutableSet.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeSerializable(this.since);
        dest.writeSerializable(this.before);
        dest.writeParcelable(this.staticFilter, flags);
        dest.writeInt(this.displayCount);
        dest.writeInt(this.hideFooterBelowDisplayCount ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistorySectionState(HistoryEvent.State state, ImmutableSet<? extends HistoryTransactionType> types, Instant since, Instant instant, HistoryStaticFilter historyStaticFilter, int i, boolean z) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(since, "since");
        this.state = state;
        this.types = types;
        this.since = since;
        this.before = instant;
        this.staticFilter = historyStaticFilter;
        this.displayCount = i;
        this.hideFooterBelowDisplayCount = z;
    }

    public final HistoryEvent.State getState() {
        return this.state;
    }

    public /* synthetic */ HistorySectionState(HistoryEvent.State state, ImmutableSet immutableSet, Instant instant, Instant instant2, HistoryStaticFilter historyStaticFilter, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : state, (i2 & 2) != 0 ? extensions2.persistentSetOf() : immutableSet, (i2 & 4) != 0 ? Instant.EPOCH : instant, (i2 & 8) != 0 ? null : instant2, (i2 & 16) != 0 ? null : historyStaticFilter, (i2 & 32) != 0 ? 5 : i, (i2 & 64) != 0 ? false : z);
    }

    public final ImmutableSet<HistoryTransactionType> getTypes() {
        return this.types;
    }

    public final Instant getSince() {
        return this.since;
    }

    public final Instant getBefore() {
        return this.before;
    }

    public final HistoryStaticFilter getStaticFilter() {
        return this.staticFilter;
    }

    public final int getDisplayCount() {
        return this.displayCount;
    }

    public final boolean getHideFooterBelowDisplayCount() {
        return this.hideFooterBelowDisplayCount;
    }
}
