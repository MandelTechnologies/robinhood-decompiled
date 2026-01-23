package com.robinhood.android.deeplink;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: DeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0011B=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0013B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0014BU\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0015J\b\u0010 \u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "Lcom/robinhood/android/deeplink/DeeplinkTarget;", "path", "", "deprecated", "", "experiment", "Lcom/robinhood/experiments/ExperimentDeclaration;", "isLongRunning", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "requireAuthentication", "shouldClearTop", "isAppLink", "<init>", "(Ljava/lang/String;ZLcom/robinhood/experiments/ExperimentDeclaration;ZLjava/util/Set;ZZZ)V", "(Ljava/lang/String;Lcom/robinhood/experiments/ExperimentDeclaration;Z)V", "regionGate", "(Ljava/lang/String;Lcom/robinhood/android/regiongate/RegionGate;Lcom/robinhood/experiments/ExperimentDeclaration;ZZ)V", "(Ljava/lang/String;Ljava/util/Set;Lcom/robinhood/experiments/ExperimentDeclaration;Z)V", "(Ljava/lang/String;ZZZZZLjava/util/Set;)V", "getPath", "()Ljava/lang/String;", "getDeprecated", "()Z", "getExperiment", "()Lcom/robinhood/experiments/ExperimentDeclaration;", "getRegionGates", "()Ljava/util/Set;", "getRequireAuthentication", "getShouldClearTop", "toString", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.LegacyDeeplinkTarget, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class DeeplinkTarget4 implements DeeplinkTarget {
    private final boolean deprecated;
    private final ExperimentDeclaration<?> experiment;
    private final boolean isAppLink;
    private final boolean isLongRunning;
    private final String path;
    private final Set<RegionGate> regionGates;
    private final boolean requireAuthentication;
    private final boolean shouldClearTop;

    /* JADX WARN: Multi-variable type inference failed */
    public DeeplinkTarget4(String path, boolean z, ExperimentDeclaration<?> experimentDeclaration, boolean z2, Set<? extends RegionGate> set, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.deprecated = z;
        this.experiment = experimentDeclaration;
        this.isLongRunning = z2;
        this.regionGates = set;
        this.requireAuthentication = z3;
        this.shouldClearTop = z4;
        this.isAppLink = z5;
        if (getExperiment() != null && !getIsLongRunning()) {
            throw new IllegalStateException("DeepLinks specifying an experiment must pass true for isLongRunning - use one of the public constructors instead of copy.");
        }
        Set<RegionGate> regionGates = getRegionGates();
        if (regionGates != null && !regionGates.isEmpty() && !getIsLongRunning()) {
            throw new IllegalStateException("DeepLinks specifying a region gate must pass true for isLongRunning - use one of the public constructors instead of copy.");
        }
    }

    public /* synthetic */ DeeplinkTarget4(String str, boolean z, ExperimentDeclaration experimentDeclaration, boolean z2, Set set, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, experimentDeclaration, (i & 8) != 0 ? false : z2, set, z3, z4, z5);
    }

    @Override // com.robinhood.android.deeplink.BaseDeepLinkPath
    public String getPath() {
        return this.path;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getDeprecated() {
        return this.deprecated;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public ExperimentDeclaration<?> getExperiment() {
        return this.experiment;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /* renamed from: isLongRunning, reason: from getter */
    public boolean getIsLongRunning() {
        return this.isLongRunning;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Set<RegionGate> getRegionGates() {
        return this.regionGates;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getRequireAuthentication() {
        return this.requireAuthentication;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getShouldClearTop() {
        return this.shouldClearTop;
    }

    /* renamed from: isAppLink, reason: from getter */
    public final boolean getIsAppLink() {
        return this.isAppLink;
    }

    public /* synthetic */ DeeplinkTarget4(String str, ExperimentDeclaration experimentDeclaration, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, experimentDeclaration, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeeplinkTarget4(String path, ExperimentDeclaration<?> experiment, boolean z) {
        this(path, false, experiment, true, null, true, true, z);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
    }

    public /* synthetic */ DeeplinkTarget4(String str, RegionGate regionGate, ExperimentDeclaration experimentDeclaration, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, regionGate, (ExperimentDeclaration<?>) ((i & 4) != 0 ? null : experimentDeclaration), (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeeplinkTarget4(String path, RegionGate regionGate, ExperimentDeclaration<?> experimentDeclaration, boolean z, boolean z2) {
        this(path, false, experimentDeclaration, true, SetsKt.setOf(regionGate), z2, true, z);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
    }

    public /* synthetic */ DeeplinkTarget4(String str, Set set, ExperimentDeclaration experimentDeclaration, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i & 4) != 0 ? null : experimentDeclaration, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeeplinkTarget4(String path, Set<? extends RegionGate> regionGates, ExperimentDeclaration<?> experimentDeclaration, boolean z) {
        this(path, false, experimentDeclaration, true, regionGates, true, true, z);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(regionGates, "regionGates");
    }

    public /* synthetic */ DeeplinkTarget4(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? false : z5, (Set<? extends RegionGate>) ((i & 64) != 0 ? null : set));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeeplinkTarget4(String path, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set<? extends RegionGate> set) {
        this(path, z, null, z3, set, z4, z5, z2);
        Intrinsics.checkNotNullParameter(path, "path");
    }

    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = Reflection.getOrCreateKotlinClass(getClass()).toString();
        }
        return simpleName + "(path = \"" + getPath() + "\")";
    }
}
