package com.robinhood.android.optionsupgrade;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates2;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOnboardingDisclosureStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureViewState;", "<init>", "()V", "reduce", "dataState", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingDisclosureStateProvider implements StateProvider<OptionOnboardingDisclosureDataState, OptionOnboardingDisclosureViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OptionOnboardingDisclosureViewState reduce(OptionOnboardingDisclosureDataState dataState) {
        OptionOnboardingDisclosureStates optionOnboardingDisclosureStates;
        UiAgreementWithContent uiAgreementWithContent;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionOnboardingDisclosureStates2<UiAgreementWithContent> agreementLoadingState = dataState.getAgreementLoadingState();
        String content = null;
        if (agreementLoadingState != null) {
            OptionOnboardingDisclosureStates2.Success success = agreementLoadingState instanceof OptionOnboardingDisclosureStates2.Success ? (OptionOnboardingDisclosureStates2.Success) agreementLoadingState : null;
            if (success != null && (uiAgreementWithContent = (UiAgreementWithContent) success.getResult()) != null) {
                content = uiAgreementWithContent.getContent();
            }
        }
        boolean z = dataState.getAgreementLoadingState() instanceof OptionOnboardingDisclosureStates2.Loading;
        boolean z2 = (dataState.getSigningLoadingState() instanceof OptionOnboardingDisclosureStates2.Loading) || dataState.getLoadingNextScreens();
        OptionOnboardingDisclosureStates2<Unit> signingLoadingState = dataState.getSigningLoadingState();
        if (signingLoadingState != null && (signingLoadingState instanceof OptionOnboardingDisclosureStates2.Failure)) {
            optionOnboardingDisclosureStates = OptionOnboardingDisclosureStates.SIGNING_ERROR;
        } else {
            OptionOnboardingDisclosureStates2<UiAgreementWithContent> agreementLoadingState2 = dataState.getAgreementLoadingState();
            if (agreementLoadingState2 != null && (agreementLoadingState2 instanceof OptionOnboardingDisclosureStates2.Failure)) {
                optionOnboardingDisclosureStates = OptionOnboardingDisclosureStates.LOADING_ERROR;
            } else {
                optionOnboardingDisclosureStates = OptionOnboardingDisclosureStates.NONE;
            }
        }
        return new OptionOnboardingDisclosureViewState(content, z, z2, optionOnboardingDisclosureStates);
    }
}
