package com.withpersona.sdk2.inquiry.steps.p423ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiStepUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenGenerationResult;", "", "viewBindings", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenViewBindings;", "contentView", "Landroid/view/View;", "footerView", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenViewBindings;Landroid/view/View;Landroid/view/View;)V", "getViewBindings", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenViewBindings;", "getContentView", "()Landroid/view/View;", "getFooterView", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.UiScreenGenerationResult, reason: use source file name */
/* loaded from: classes18.dex */
public final class UiStepUtils6 {
    private final View contentView;
    private final View footerView;
    private final UiStepUtils7 viewBindings;

    public UiStepUtils6(UiStepUtils7 viewBindings, View contentView, View view) {
        Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.viewBindings = viewBindings;
        this.contentView = contentView;
        this.footerView = view;
    }

    public final UiStepUtils7 getViewBindings() {
        return this.viewBindings;
    }

    public final View getContentView() {
        return this.contentView;
    }

    public final View getFooterView() {
        return this.footerView;
    }
}
