package com.withpersona.sdk2.inquiry.steps.p423ui;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiStepUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/UiScreenViewBindings;", "", "componentNameToComponentView", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "<init>", "(Ljava/util/Map;)V", "getComponentNameToComponentView", "()Ljava/util/Map;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.UiScreenViewBindings, reason: use source file name */
/* loaded from: classes18.dex */
public final class UiStepUtils7 {
    private final Map<String, ComponentView> componentNameToComponentView;

    public UiStepUtils7(Map<String, ComponentView> componentNameToComponentView) {
        Intrinsics.checkNotNullParameter(componentNameToComponentView, "componentNameToComponentView");
        this.componentNameToComponentView = componentNameToComponentView;
    }

    public final Map<String, ComponentView> getComponentNameToComponentView() {
        return this.componentNameToComponentView;
    }
}
