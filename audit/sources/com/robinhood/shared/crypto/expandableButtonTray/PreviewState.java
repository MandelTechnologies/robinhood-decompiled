package com.robinhood.shared.crypto.expandableButtonTray;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoExpandableButtonTrayComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/expandableButtonTray/PreviewState;", "", "trayState", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "", "isExpanded", "", "<init>", "(Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;Z)V", "getTrayState", "()Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-crypto-expandable-button-tray_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PreviewState {
    public static final int $stable = StringResource.$stable;
    private final boolean isExpanded;
    private final ExpandableButtonTrayState<Unit> trayState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviewState copy$default(PreviewState previewState, ExpandableButtonTrayState expandableButtonTrayState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            expandableButtonTrayState = previewState.trayState;
        }
        if ((i & 2) != 0) {
            z = previewState.isExpanded;
        }
        return previewState.copy(expandableButtonTrayState, z);
    }

    public final ExpandableButtonTrayState<Unit> component1() {
        return this.trayState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final PreviewState copy(ExpandableButtonTrayState<Unit> trayState, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(trayState, "trayState");
        return new PreviewState(trayState, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewState)) {
            return false;
        }
        PreviewState previewState = (PreviewState) other;
        return Intrinsics.areEqual(this.trayState, previewState.trayState) && this.isExpanded == previewState.isExpanded;
    }

    public int hashCode() {
        return (this.trayState.hashCode() * 31) + Boolean.hashCode(this.isExpanded);
    }

    public String toString() {
        return "PreviewState(trayState=" + this.trayState + ", isExpanded=" + this.isExpanded + ")";
    }

    public PreviewState(ExpandableButtonTrayState<Unit> trayState, boolean z) {
        Intrinsics.checkNotNullParameter(trayState, "trayState");
        this.trayState = trayState;
        this.isExpanded = z;
    }

    public final ExpandableButtonTrayState<Unit> getTrayState() {
        return this.trayState;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }
}
