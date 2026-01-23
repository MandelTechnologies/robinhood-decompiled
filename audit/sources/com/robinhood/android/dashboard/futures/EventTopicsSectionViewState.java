package com.robinhood.android.dashboard.futures;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: EventTopicsSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState;", "", "Empty", "Loaded", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState$Empty;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState$Loaded;", "lib-dashboard-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface EventTopicsSectionViewState {

    /* compiled from: EventTopicsSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState$Empty;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements EventTopicsSectionViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return -1799029032;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }

    /* compiled from: EventTopicsSectionViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState$Loaded;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState;", "eventTopics", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;", "showShimmer", "", "eventContractsCount", "", "showEventCountInSubtitle", "showEventCountRedirectLink", "<init>", "(Lkotlinx/collections/immutable/PersistentList;ZLjava/lang/Long;ZZ)V", "getEventTopics", "()Lkotlinx/collections/immutable/PersistentList;", "getShowShimmer", "()Z", "getEventContractsCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShowEventCountInSubtitle", "getShowEventCountRedirectLink", "component1", "component2", "component3", "component4", "component5", "copy", "(Lkotlinx/collections/immutable/PersistentList;ZLjava/lang/Long;ZZ)Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState$Loaded;", "equals", "other", "", "hashCode", "", "toString", "", "lib-dashboard-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements EventTopicsSectionViewState {
        public static final int $stable = 8;
        private final Long eventContractsCount;
        private final ImmutableList3<EventTopic> eventTopics;
        private final boolean showEventCountInSubtitle;
        private final boolean showEventCountRedirectLink;
        private final boolean showShimmer;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ImmutableList3 immutableList3, boolean z, Long l, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList3 = loaded.eventTopics;
            }
            if ((i & 2) != 0) {
                z = loaded.showShimmer;
            }
            if ((i & 4) != 0) {
                l = loaded.eventContractsCount;
            }
            if ((i & 8) != 0) {
                z2 = loaded.showEventCountInSubtitle;
            }
            if ((i & 16) != 0) {
                z3 = loaded.showEventCountRedirectLink;
            }
            boolean z4 = z3;
            Long l2 = l;
            return loaded.copy(immutableList3, z, l2, z2, z4);
        }

        public final ImmutableList3<EventTopic> component1() {
            return this.eventTopics;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowShimmer() {
            return this.showShimmer;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getEventContractsCount() {
            return this.eventContractsCount;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowEventCountInSubtitle() {
            return this.showEventCountInSubtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowEventCountRedirectLink() {
            return this.showEventCountRedirectLink;
        }

        public final Loaded copy(ImmutableList3<EventTopic> eventTopics, boolean showShimmer, Long eventContractsCount, boolean showEventCountInSubtitle, boolean showEventCountRedirectLink) {
            Intrinsics.checkNotNullParameter(eventTopics, "eventTopics");
            return new Loaded(eventTopics, showShimmer, eventContractsCount, showEventCountInSubtitle, showEventCountRedirectLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.eventTopics, loaded.eventTopics) && this.showShimmer == loaded.showShimmer && Intrinsics.areEqual(this.eventContractsCount, loaded.eventContractsCount) && this.showEventCountInSubtitle == loaded.showEventCountInSubtitle && this.showEventCountRedirectLink == loaded.showEventCountRedirectLink;
        }

        public int hashCode() {
            int iHashCode = ((this.eventTopics.hashCode() * 31) + Boolean.hashCode(this.showShimmer)) * 31;
            Long l = this.eventContractsCount;
            return ((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.showEventCountInSubtitle)) * 31) + Boolean.hashCode(this.showEventCountRedirectLink);
        }

        public String toString() {
            return "Loaded(eventTopics=" + this.eventTopics + ", showShimmer=" + this.showShimmer + ", eventContractsCount=" + this.eventContractsCount + ", showEventCountInSubtitle=" + this.showEventCountInSubtitle + ", showEventCountRedirectLink=" + this.showEventCountRedirectLink + ")";
        }

        public Loaded(ImmutableList3<EventTopic> eventTopics, boolean z, Long l, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(eventTopics, "eventTopics");
            this.eventTopics = eventTopics;
            this.showShimmer = z;
            this.eventContractsCount = l;
            this.showEventCountInSubtitle = z2;
            this.showEventCountRedirectLink = z3;
        }

        public /* synthetic */ Loaded(ImmutableList3 immutableList3, boolean z, Long l, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(immutableList3, z, (i & 4) != 0 ? null : l, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
        }

        public final ImmutableList3<EventTopic> getEventTopics() {
            return this.eventTopics;
        }

        public final boolean getShowShimmer() {
            return this.showShimmer;
        }

        public final Long getEventContractsCount() {
            return this.eventContractsCount;
        }

        public final boolean getShowEventCountInSubtitle() {
            return this.showEventCountInSubtitle;
        }

        public final boolean getShowEventCountRedirectLink() {
            return this.showEventCountRedirectLink;
        }
    }
}
