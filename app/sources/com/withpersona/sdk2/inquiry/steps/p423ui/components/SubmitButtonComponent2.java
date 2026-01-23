package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.shared.p422ui.ButtonWithLoadingIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitButtonComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SubmitButtonComponent2 {
    public static final ButtonWithLoadingIndicator makeView(SubmitButtonComponent submitButtonComponent, UiComponentHelper uiComponentHelper, SubmitButton config) {
        Intrinsics.checkNotNullParameter(submitButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        return UiComponent3.buttonViewWithLoadingIndicator(submitButtonComponent, uiComponentHelper, config);
    }
}
