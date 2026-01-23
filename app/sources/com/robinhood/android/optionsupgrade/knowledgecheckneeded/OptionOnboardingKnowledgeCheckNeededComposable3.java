package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOnboardingKnowledgeCheckNeededComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt$lambda$1277396183$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingKnowledgeCheckNeededComposable3 implements Function2<Composer, Integer, Unit> {
    public static final OptionOnboardingKnowledgeCheckNeededComposable3 INSTANCE = new OptionOnboardingKnowledgeCheckNeededComposable3();

    OptionOnboardingKnowledgeCheckNeededComposable3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1277396183, i, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt.lambda$1277396183.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:296)");
        }
        OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState = new OptionOnboardingKnowledgeCheckNeededViewState("Last step: Complete a knowledge check on options", new OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState(ServerToBentoAssetMapper2.CHAT_24, "Chat with a representative", "Current wait time: 1 minute", true, false), new OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState(ServerToBentoAssetMapper2.PHONE_24, "Schedule a call", "Currently unavailable", false, true), "To complete your knowledge check, we need to ask you a few questions about calls and puts. \n\nBy requesting support from an agent, you agree to abide by our App Use Standards. Harassment, abusive content, and spam are not permitted. Data from and about your support request will be processed in accordance with our Privacy Policy.");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt$lambda$1277396183$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt$lambda$1277396183$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt$lambda$1277396183$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededContent(optionOnboardingKnowledgeCheckNeededViewState, function0, function02, (Function0) objRememberedValue3, null, composer, 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
