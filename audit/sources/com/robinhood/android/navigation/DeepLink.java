package com.robinhood.android.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepLink.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014BM\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0015BY\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0016J&\u0010\"\u001a\u00020\u00002\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J!\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eHÆ\u0003Ju\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR)\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/navigation/DeepLink;", "", "path", "", "requireAuthentication", "", "experiment", "Lcom/robinhood/experiments/ExperimentDeclaration;", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "isLongRunning", "shouldClearTop", "getIntents", "Lkotlin/Function2;", "Landroid/content/Context;", "Landroid/net/Uri;", "", "Landroid/content/Intent;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/experiments/ExperimentDeclaration;Ljava/util/Set;ZZLkotlin/jvm/functions/Function2;)V", "(Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;)V", "(Ljava/lang/String;Ljava/util/Set;Lcom/robinhood/experiments/ExperimentDeclaration;ZLkotlin/jvm/functions/Function2;)V", "getPath", "()Ljava/lang/String;", "getRequireAuthentication", "()Z", "getExperiment", "()Lcom/robinhood/experiments/ExperimentDeclaration;", "getRegionGates", "()Ljava/util/Set;", "getShouldClearTop", "getGetIntents", "()Lkotlin/jvm/functions/Function2;", "copyWithNewGetIntents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeepLink {
    public static final String INTENT_ARG_DEEP_LINK = "deepLink";
    public static final String INTENT_ARG_DEEP_LINK_NONCE = "deepLinkNonce";
    public static final String INTENT_ARG_DEEP_LINK_ORIGIN = "deepLinkOrigin";
    private final ExperimentDeclaration<?> experiment;
    private final Function2<Context, Uri, Intent[]> getIntents;
    private final boolean isLongRunning;
    private final String path;
    private final Set<RegionGate> regionGates;
    private final boolean requireAuthentication;
    private final boolean shouldClearTop;
    public static final int $stable = 8;

    public static /* synthetic */ DeepLink copy$default(DeepLink deepLink, String str, boolean z, ExperimentDeclaration experimentDeclaration, Set set, boolean z2, boolean z3, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deepLink.path;
        }
        if ((i & 2) != 0) {
            z = deepLink.requireAuthentication;
        }
        if ((i & 4) != 0) {
            experimentDeclaration = deepLink.experiment;
        }
        if ((i & 8) != 0) {
            set = deepLink.regionGates;
        }
        if ((i & 16) != 0) {
            z2 = deepLink.isLongRunning;
        }
        if ((i & 32) != 0) {
            z3 = deepLink.shouldClearTop;
        }
        if ((i & 64) != 0) {
            function2 = deepLink.getIntents;
        }
        boolean z4 = z3;
        Function2 function22 = function2;
        boolean z5 = z2;
        ExperimentDeclaration experimentDeclaration2 = experimentDeclaration;
        return deepLink.copy(str, z, experimentDeclaration2, set, z5, z4, function22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequireAuthentication() {
        return this.requireAuthentication;
    }

    public final ExperimentDeclaration<?> component3() {
        return this.experiment;
    }

    public final Set<RegionGate> component4() {
        return this.regionGates;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLongRunning() {
        return this.isLongRunning;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldClearTop() {
        return this.shouldClearTop;
    }

    public final Function2<Context, Uri, Intent[]> component7() {
        return this.getIntents;
    }

    public final DeepLink copy(String path, boolean requireAuthentication, ExperimentDeclaration<?> experiment, Set<? extends RegionGate> regionGates, boolean isLongRunning, boolean shouldClearTop, Function2<? super Context, ? super Uri, Intent[]> getIntents) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(getIntents, "getIntents");
        return new DeepLink(path, requireAuthentication, experiment, regionGates, isLongRunning, shouldClearTop, getIntents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLink)) {
            return false;
        }
        DeepLink deepLink = (DeepLink) other;
        return Intrinsics.areEqual(this.path, deepLink.path) && this.requireAuthentication == deepLink.requireAuthentication && Intrinsics.areEqual(this.experiment, deepLink.experiment) && Intrinsics.areEqual(this.regionGates, deepLink.regionGates) && this.isLongRunning == deepLink.isLongRunning && this.shouldClearTop == deepLink.shouldClearTop && Intrinsics.areEqual(this.getIntents, deepLink.getIntents);
    }

    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + Boolean.hashCode(this.requireAuthentication)) * 31;
        ExperimentDeclaration<?> experimentDeclaration = this.experiment;
        int iHashCode2 = (iHashCode + (experimentDeclaration == null ? 0 : experimentDeclaration.hashCode())) * 31;
        Set<RegionGate> set = this.regionGates;
        return ((((((iHashCode2 + (set != null ? set.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLongRunning)) * 31) + Boolean.hashCode(this.shouldClearTop)) * 31) + this.getIntents.hashCode();
    }

    public String toString() {
        return "DeepLink(path=" + this.path + ", requireAuthentication=" + this.requireAuthentication + ", experiment=" + this.experiment + ", regionGates=" + this.regionGates + ", isLongRunning=" + this.isLongRunning + ", shouldClearTop=" + this.shouldClearTop + ", getIntents=" + this.getIntents + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeepLink(String path, boolean z, ExperimentDeclaration<?> experimentDeclaration, Set<? extends RegionGate> set, boolean z2, boolean z3, Function2<? super Context, ? super Uri, Intent[]> getIntents) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(getIntents, "getIntents");
        this.path = path;
        this.requireAuthentication = z;
        this.experiment = experimentDeclaration;
        this.regionGates = set;
        this.isLongRunning = z2;
        this.shouldClearTop = z3;
        this.getIntents = getIntents;
        if (experimentDeclaration != null && !z2) {
            throw new IllegalStateException("DeepLinks specifying an experiment must pass true for isLongRunning - use one of the public constructors instead of copy.");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeepLink(String str, boolean z, ExperimentDeclaration experimentDeclaration, Set set, boolean z2, boolean z3, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function2 function22;
        boolean z4;
        z = (i & 2) != 0 ? true : z;
        experimentDeclaration = (i & 4) != 0 ? null : experimentDeclaration;
        set = (i & 8) != 0 ? null : set;
        if ((i & 32) != 0) {
            function22 = function2;
            z4 = true;
        } else {
            function22 = function2;
            z4 = z3;
        }
        this(str, z, (ExperimentDeclaration<?>) experimentDeclaration, (Set<? extends RegionGate>) set, z2, z4, (Function2<? super Context, ? super Uri, Intent[]>) function22);
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getRequireAuthentication() {
        return this.requireAuthentication;
    }

    public final ExperimentDeclaration<?> getExperiment() {
        return this.experiment;
    }

    public final Set<RegionGate> getRegionGates() {
        return this.regionGates;
    }

    public final boolean isLongRunning() {
        return this.isLongRunning;
    }

    public final boolean getShouldClearTop() {
        return this.shouldClearTop;
    }

    public final Function2<Context, Uri, Intent[]> getGetIntents() {
        return this.getIntents;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeepLink(String str, boolean z, boolean z2, boolean z3, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function2 function22;
        boolean z4;
        z = (i & 2) != 0 ? true : z;
        if ((i & 8) != 0) {
            function22 = function2;
            z4 = true;
        } else {
            function22 = function2;
            z4 = z3;
        }
        this(str, z, z2, z4, (Function2<? super Context, ? super Uri, Intent[]>) function22);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeepLink(String path, boolean z, boolean z2, boolean z3, Function2<? super Context, ? super Uri, Intent[]> getIntents) {
        this(path, z, null, null, z2, z3, getIntents, 8, null);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(getIntents, "getIntents");
    }

    public /* synthetic */ DeepLink(String str, Set set, ExperimentDeclaration experimentDeclaration, boolean z, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (Set<? extends RegionGate>) set, (ExperimentDeclaration<?>) ((i & 4) != 0 ? null : experimentDeclaration), (i & 8) != 0 ? true : z, (Function2<? super Context, ? super Uri, Intent[]>) function2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeepLink(String path, Set<? extends RegionGate> regionGates, ExperimentDeclaration<?> experimentDeclaration, boolean z, Function2<? super Context, ? super Uri, Intent[]> getIntents) {
        this(path, true, experimentDeclaration, regionGates, true, z, getIntents);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(regionGates, "regionGates");
        Intrinsics.checkNotNullParameter(getIntents, "getIntents");
    }

    public final DeepLink copyWithNewGetIntents(Function2<? super Context, ? super Uri, Intent[]> getIntents) {
        Intrinsics.checkNotNullParameter(getIntents, "getIntents");
        return copy$default(this, null, false, null, null, false, false, getIntents, 63, null);
    }
}
