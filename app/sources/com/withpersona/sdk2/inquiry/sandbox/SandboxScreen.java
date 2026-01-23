package com.withpersona.sdk2.inquiry.sandbox;

import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SandboxScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxScreen;", "", "R", "mainScreen", "Lkotlin/Function0;", "", "onFabClick", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags$ForcedStatus;", "getCurrentForcedStatus", "", "simulateGovIdNfc", "Lkotlin/Function1;", "onSimulateGovIdNfcChanged", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getMainScreen", "()Ljava/lang/Object;", "Lkotlin/jvm/functions/Function0;", "getOnFabClick", "()Lkotlin/jvm/functions/Function0;", "getGetCurrentForcedStatus", "Z", "getSimulateGovIdNfc", "()Z", "Lkotlin/jvm/functions/Function1;", "getOnSimulateGovIdNfcChanged", "()Lkotlin/jvm/functions/Function1;", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SandboxScreen<R> {
    private final Function0<SandboxFlags.ForcedStatus> getCurrentForcedStatus;
    private final R mainScreen;
    private final Function0<Unit> onFabClick;
    private final Function1<Boolean, Unit> onSimulateGovIdNfcChanged;
    private final boolean simulateGovIdNfc;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SandboxScreen)) {
            return false;
        }
        SandboxScreen sandboxScreen = (SandboxScreen) other;
        return Intrinsics.areEqual(this.mainScreen, sandboxScreen.mainScreen) && Intrinsics.areEqual(this.onFabClick, sandboxScreen.onFabClick) && Intrinsics.areEqual(this.getCurrentForcedStatus, sandboxScreen.getCurrentForcedStatus) && this.simulateGovIdNfc == sandboxScreen.simulateGovIdNfc && Intrinsics.areEqual(this.onSimulateGovIdNfcChanged, sandboxScreen.onSimulateGovIdNfcChanged);
    }

    public int hashCode() {
        return (((((((this.mainScreen.hashCode() * 31) + this.onFabClick.hashCode()) * 31) + this.getCurrentForcedStatus.hashCode()) * 31) + Boolean.hashCode(this.simulateGovIdNfc)) * 31) + this.onSimulateGovIdNfcChanged.hashCode();
    }

    public String toString() {
        return "SandboxScreen(mainScreen=" + this.mainScreen + ", onFabClick=" + this.onFabClick + ", getCurrentForcedStatus=" + this.getCurrentForcedStatus + ", simulateGovIdNfc=" + this.simulateGovIdNfc + ", onSimulateGovIdNfcChanged=" + this.onSimulateGovIdNfcChanged + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SandboxScreen(R mainScreen, Function0<Unit> onFabClick, Function0<? extends SandboxFlags.ForcedStatus> getCurrentForcedStatus, boolean z, Function1<? super Boolean, Unit> onSimulateGovIdNfcChanged) {
        Intrinsics.checkNotNullParameter(mainScreen, "mainScreen");
        Intrinsics.checkNotNullParameter(onFabClick, "onFabClick");
        Intrinsics.checkNotNullParameter(getCurrentForcedStatus, "getCurrentForcedStatus");
        Intrinsics.checkNotNullParameter(onSimulateGovIdNfcChanged, "onSimulateGovIdNfcChanged");
        this.mainScreen = mainScreen;
        this.onFabClick = onFabClick;
        this.getCurrentForcedStatus = getCurrentForcedStatus;
        this.simulateGovIdNfc = z;
        this.onSimulateGovIdNfcChanged = onSimulateGovIdNfcChanged;
    }

    public final R getMainScreen() {
        return this.mainScreen;
    }

    public final Function0<Unit> getOnFabClick() {
        return this.onFabClick;
    }

    public final Function0<SandboxFlags.ForcedStatus> getGetCurrentForcedStatus() {
        return this.getCurrentForcedStatus;
    }

    public final boolean getSimulateGovIdNfc() {
        return this.simulateGovIdNfc;
    }

    public final Function1<Boolean, Unit> getOnSimulateGovIdNfcChanged() {
        return this.onSimulateGovIdNfcChanged;
    }
}
