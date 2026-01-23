package com.squareup.workflow1.p415ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: TextControllerControlEditText.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/squareup/workflow1/ui/TextControllerSubscription;", "", "controller", "Lcom/squareup/workflow1/ui/TextController;", "subscription", "Lkotlinx/coroutines/Job;", "(Lcom/squareup/workflow1/ui/TextController;Lkotlinx/coroutines/Job;)V", "getController", "()Lcom/squareup/workflow1/ui/TextController;", "getSubscription", "()Lkotlinx/coroutines/Job;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.TextControllerSubscription, reason: use source file name */
/* loaded from: classes12.dex */
final class TextControllerControlEditText5 {
    private final TextController controller;
    private final Job subscription;

    public TextControllerControlEditText5(TextController controller, Job subscription) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.controller = controller;
        this.subscription = subscription;
    }

    public final TextController getController() {
        return this.controller;
    }

    public final Job getSubscription() {
        return this.subscription;
    }
}
