package com.robinhood.android.eventcontracts.hub.p134v2.root;

import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraphDestinations2;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode4;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HubInitialLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001d\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003HÂ\u0003J'\u0010\u0013\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0018\u001a\u00020\fHÖ\u0001R\"\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/NavigateToCategoryContentEvent;", "", "nodeIdHierarchy", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/predictionmarkets/SubCategorySelectionMode;", "<init>", "(Ljava/util/List;)V", "getNavTargets", "Lcom/robinhood/android/eventcontracts/hub/v2/root/NavigateToCategoryContentEvent$HubNavigation;", "entryPointIdentifier", "", "createNavTarget", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "target", "Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "HubNavigation", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class NavigateToCategoryContentEvent {
    public static final int $stable = 8;
    private final List<Tuples2<UUID, EcHubNavNode4>> nodeIdHierarchy;

    /* compiled from: HubInitialLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcHubNavNode4.values().length];
            try {
                iArr[EcHubNavNode4.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcHubNavNode4.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final List<Tuples2<UUID, EcHubNavNode4>> component1() {
        return this.nodeIdHierarchy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigateToCategoryContentEvent copy$default(NavigateToCategoryContentEvent navigateToCategoryContentEvent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navigateToCategoryContentEvent.nodeIdHierarchy;
        }
        return navigateToCategoryContentEvent.copy(list);
    }

    public final NavigateToCategoryContentEvent copy(List<? extends Tuples2<UUID, ? extends EcHubNavNode4>> nodeIdHierarchy) {
        return new NavigateToCategoryContentEvent(nodeIdHierarchy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavigateToCategoryContentEvent) && Intrinsics.areEqual(this.nodeIdHierarchy, ((NavigateToCategoryContentEvent) other).nodeIdHierarchy);
    }

    public int hashCode() {
        List<Tuples2<UUID, EcHubNavNode4>> list = this.nodeIdHierarchy;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "NavigateToCategoryContentEvent(nodeIdHierarchy=" + this.nodeIdHierarchy + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigateToCategoryContentEvent(List<? extends Tuples2<UUID, ? extends EcHubNavNode4>> list) {
        this.nodeIdHierarchy = list;
    }

    public final List<HubNavigation> getNavTargets(String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        if (this.nodeIdHierarchy == null) {
            return null;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        EcHubNavNode4 ecHubNavNode4 = EcHubNavNode4.PUSH;
        int i = 0;
        UUID uuid = null;
        for (Object obj : this.nodeIdHierarchy) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples2 = (Tuples2) obj;
            UUID uuid2 = (UUID) tuples2.component1();
            EcHubNavNode4 ecHubNavNode42 = (EcHubNavNode4) tuples2.component2();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[ecHubNavNode4.ordinal()];
            if (i3 == 1) {
                int i4 = iArr[ecHubNavNode42.ordinal()];
                if (i4 == 1) {
                    listCreateListBuilder.add(createNavTarget(i, new HubRootNavGraphDestinations2.Args(entryPointIdentifier, uuid2, null, 4, null)));
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i == CollectionsKt.getLastIndex(this.nodeIdHierarchy)) {
                        listCreateListBuilder.add(createNavTarget(i, new HubRootNavGraphDestinations2.Args(entryPointIdentifier, uuid2, null, 4, null)));
                    } else {
                        uuid = uuid2;
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = iArr[ecHubNavNode42.ordinal()];
                if (i5 == 1) {
                    listCreateListBuilder.add(createNavTarget(i, new HubRootNavGraphDestinations2.Args(entryPointIdentifier, uuid, uuid2)));
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i == CollectionsKt.getLastIndex(this.nodeIdHierarchy)) {
                        listCreateListBuilder.add(createNavTarget(i, new HubRootNavGraphDestinations2.Args(entryPointIdentifier, uuid, uuid2)));
                    }
                }
                uuid = null;
            }
            i = i2;
            ecHubNavNode4 = ecHubNavNode42;
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    private final HubNavigation createNavTarget(int index, HubRootNavGraphDestinations2.Args target) {
        NavTransition navTransition;
        List<Tuples2<UUID, EcHubNavNode4>> list = this.nodeIdHierarchy;
        if (list == null || index == CollectionsKt.getLastIndex(list)) {
            navTransition = NavTransition.CROSS_FADE;
        } else {
            navTransition = NavTransition.NONE;
        }
        return new HubNavigation(target, navTransition);
    }

    /* compiled from: HubInitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/NavigateToCategoryContentEvent$HubNavigation;", "", "target", "Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;", NavTransition2.KEY_TRANSITION, "Lcom/robinhood/android/navigation/compose/NavTransition;", "<init>", "(Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;Lcom/robinhood/android/navigation/compose/NavTransition;)V", "getTarget", "()Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;", "getTransition", "()Lcom/robinhood/android/navigation/compose/NavTransition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HubNavigation {
        public static final int $stable = 8;
        private final HubRootNavGraphDestinations2.Args target;
        private final NavTransition transition;

        public static /* synthetic */ HubNavigation copy$default(HubNavigation hubNavigation, HubRootNavGraphDestinations2.Args args, NavTransition navTransition, int i, Object obj) {
            if ((i & 1) != 0) {
                args = hubNavigation.target;
            }
            if ((i & 2) != 0) {
                navTransition = hubNavigation.transition;
            }
            return hubNavigation.copy(args, navTransition);
        }

        /* renamed from: component1, reason: from getter */
        public final HubRootNavGraphDestinations2.Args getTarget() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final NavTransition getTransition() {
            return this.transition;
        }

        public final HubNavigation copy(HubRootNavGraphDestinations2.Args target, NavTransition transition) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(transition, "transition");
            return new HubNavigation(target, transition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HubNavigation)) {
                return false;
            }
            HubNavigation hubNavigation = (HubNavigation) other;
            return Intrinsics.areEqual(this.target, hubNavigation.target) && this.transition == hubNavigation.transition;
        }

        public int hashCode() {
            return (this.target.hashCode() * 31) + this.transition.hashCode();
        }

        public String toString() {
            return "HubNavigation(target=" + this.target + ", transition=" + this.transition + ")";
        }

        public HubNavigation(HubRootNavGraphDestinations2.Args target, NavTransition transition) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.target = target;
            this.transition = transition;
        }

        public final HubRootNavGraphDestinations2.Args getTarget() {
            return this.target;
        }

        public final NavTransition getTransition() {
            return this.transition;
        }
    }
}
