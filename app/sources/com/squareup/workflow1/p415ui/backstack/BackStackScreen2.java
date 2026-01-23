package com.squareup.workflow1.p415ui.backstack;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackStackScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"", "T", "", "Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "toBackStackScreen", "(Ljava/util/List;)Lcom/squareup/workflow1/ui/backstack/BackStackScreen;", "wf1-container-common"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.backstack.BackStackScreenKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BackStackScreen2 {
    public static final <T> BackStackScreen<T> toBackStackScreen(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new BackStackScreen<>(CollectionsKt.first((List) list), list.subList(1, list.size()));
    }
}
