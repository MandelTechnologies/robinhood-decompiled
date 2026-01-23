package com.withpersona.sdk2.inquiry.modal;

import com.squareup.workflow1.p415ui.Compatible;
import com.squareup.workflow1.p415ui.backstack.BackStackScreen;
import com.squareup.workflow1.p415ui.modal.HasModals;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalContainerScreen.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u00020\u0006B-\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "", "B", "T", "Lcom/squareup/workflow1/ui/modal/HasModals;", "Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "Lcom/squareup/workflow1/ui/Compatible;", "baseScreen", "", "modals", "", "compatibilityKey", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Object;", "getBaseScreen", "()Ljava/lang/Object;", "Ljava/util/List;", "getModals", "()Ljava/util/List;", "Ljava/lang/String;", "getCompatibilityKey", "()Ljava/lang/String;", "beneathModals", "getBeneathModals", "modal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ModalContainerScreen<B, T> implements HasModals<B, BackStackScreen<T>>, Compatible {
    private final B baseScreen;
    private final B beneathModals;
    private final String compatibilityKey;
    private final List<BackStackScreen<T>> modals;

    public ModalContainerScreen(B baseScreen, List<BackStackScreen<T>> modals, String compatibilityKey) {
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(modals, "modals");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        this.baseScreen = baseScreen;
        this.modals = modals;
        this.compatibilityKey = compatibilityKey;
        this.beneathModals = baseScreen;
    }

    @Override // com.squareup.workflow1.p415ui.modal.HasModals
    public List<BackStackScreen<T>> getModals() {
        return this.modals;
    }

    @Override // com.squareup.workflow1.p415ui.Compatible
    public String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    @Override // com.squareup.workflow1.p415ui.modal.HasModals
    public B getBeneathModals() {
        return this.beneathModals;
    }
}
