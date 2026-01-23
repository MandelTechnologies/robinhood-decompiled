package com.withpersona.sdk2.inquiry.steps.p423ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NestedUiStep.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"to", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.NestedUiStepKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class NestedUiStep2 {
    /* renamed from: to */
    public static final UiComponentScreen m3256to(NestedUiStep nestedUiStep) {
        Intrinsics.checkNotNullParameter(nestedUiStep, "<this>");
        return new UiComponentScreen(nestedUiStep.getComponents(), nestedUiStep.getComponentConfigs(), nestedUiStep.getStyles());
    }
}
