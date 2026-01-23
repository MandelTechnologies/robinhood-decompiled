package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import kotlin.Metadata;

/* compiled from: UiComponent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LoadingIndicatorComponent;", "", "getName", "()Ljava/lang/String;", "name", "", "getWasTapped", "()Z", "setWasTapped", "(Z)V", "wasTapped", "getAutoSubmitCountdownText", "autoSubmitCountdownText", "", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "autoSubmitIntervalSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CombinedStepButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, reason: use source file name */
/* loaded from: classes18.dex */
public interface UiComponent2 extends UiComponent, UiComponentAttributes2, UiComponentAttributes3, LoadingIndicatorComponent {
    String getAutoSubmitCountdownText();

    Integer getAutoSubmitIntervalSeconds();

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    String getName();

    boolean getWasTapped();

    void setWasTapped(boolean z);
}
