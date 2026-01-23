package com.squareup.workflow1.p415ui.modal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertContainerScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertContainerScreen;", "", "B", "Lcom/squareup/workflow1/ui/modal/HasModals;", "Lcom/squareup/workflow1/ui/modal/AlertScreen;", "beneathModals", "", "modals", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getBeneathModals", "()Ljava/lang/Object;", "Ljava/util/List;", "getModals", "()Ljava/util/List;", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AlertContainerScreen<B> implements HasModals<B, AlertScreen> {
    private final B beneathModals;
    private final List<AlertScreen> modals;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertContainerScreen)) {
            return false;
        }
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) other;
        return Intrinsics.areEqual(getBeneathModals(), alertContainerScreen.getBeneathModals()) && Intrinsics.areEqual(getModals(), alertContainerScreen.getModals());
    }

    public int hashCode() {
        return (getBeneathModals().hashCode() * 31) + getModals().hashCode();
    }

    public String toString() {
        return "AlertContainerScreen(beneathModals=" + getBeneathModals() + ", modals=" + getModals() + ')';
    }

    public AlertContainerScreen(B beneathModals, List<AlertScreen> modals) {
        Intrinsics.checkNotNullParameter(beneathModals, "beneathModals");
        Intrinsics.checkNotNullParameter(modals, "modals");
        this.beneathModals = beneathModals;
        this.modals = modals;
    }

    @Override // com.squareup.workflow1.p415ui.modal.HasModals
    public B getBeneathModals() {
        return this.beneathModals;
    }

    public /* synthetic */ AlertContainerScreen(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Override // com.squareup.workflow1.p415ui.modal.HasModals
    public List<AlertScreen> getModals() {
        return this.modals;
    }
}
