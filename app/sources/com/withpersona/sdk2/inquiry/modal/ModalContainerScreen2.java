package com.withpersona.sdk2.inquiry.modal;

import com.squareup.workflow1.p415ui.backstack.BackStackScreen;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalContainerScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aE\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a?\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u0002H\u00032\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"inModalOver", "Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "B", "T", "", "Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "baseScreen", "compatibilityKey", "", "(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Ljava/lang/Object;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "firstInModalStack", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "modal_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.modal.ModalContainerScreenKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ModalContainerScreen2 {
    public static final <B, T> ModalContainerScreen<B, T> inModalOver(BackStackScreen<T> backStackScreen, B baseScreen, String compatibilityKey) {
        Intrinsics.checkNotNullParameter(backStackScreen, "<this>");
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        return new ModalContainerScreen<>(baseScreen, CollectionsKt.listOf(backStackScreen), compatibilityKey);
    }

    public static final <B, T> ModalContainerScreen<B, T> firstInModalStack(T t, B baseScreen, String compatibilityKey) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        return inModalOver(new BackStackScreen(t, CollectionsKt.emptyList()), baseScreen, compatibilityKey);
    }
}
