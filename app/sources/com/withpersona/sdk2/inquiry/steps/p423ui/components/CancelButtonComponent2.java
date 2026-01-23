package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CancelButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelButtonComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Lcom/google/android/material/button/MaterialButton;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class CancelButtonComponent2 {
    public static final MaterialButton makeView(CancelButtonComponent cancelButtonComponent, UiComponentHelper uiComponentHelper, CancelButton config) {
        Intrinsics.checkNotNullParameter(cancelButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        return UiComponent3.buttonView(cancelButtonComponent, uiComponentHelper, config);
    }
}
