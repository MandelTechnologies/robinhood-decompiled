package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LimitRevealComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$BottomBar$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class LimitRevealComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LimitRevealDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onContinue;
    final /* synthetic */ boolean $selectedPremium;
    final /* synthetic */ boolean $upsell;

    LimitRevealComposable6(boolean z, Modifier modifier, boolean z2, EventLogger eventLogger, LimitRevealDuxo limitRevealDuxo, Function0<Unit> function0) {
        this.$upsell = z;
        this.$modifier = modifier;
        this.$selectedPremium = z2;
        this.$eventLogger = eventLogger;
        this.$duxo = limitRevealDuxo;
        this.$onContinue = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-484264067, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.BottomBar.<anonymous>.<anonymous> (LimitRevealComposable.kt:368)");
        }
        if (this.$upsell) {
            composer.startReplaceGroup(84355696);
            LimitRevealComposable2.Disclaimer((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), this.$modifier, composer, 0, 0);
            composer.endReplaceGroup();
            i2 = 0;
        } else {
            composer.startReplaceGroup(84456291);
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, LimitRevealComposable2.LIMIT_REVEAL_DISCLAIMER_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_subtitle, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            i2 = 0;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 48, 0, 8120);
            composer.endReplaceGroup();
        }
        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, i2);
        Modifier modifier = this.$modifier;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$upsell) | composer.changed(this.$selectedPremium) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$duxo) | composer.changed(this.$onContinue);
        final boolean z = this.$upsell;
        final boolean z2 = this.$selectedPremium;
        final EventLogger eventLogger = this.$eventLogger;
        final LimitRevealDuxo limitRevealDuxo = this.$duxo;
        final Function0<Unit> function0 = this.$onContinue;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function0 function02 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$BottomBar$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LimitRevealComposable6.invoke$lambda$1$lambda$0(z, z2, eventLogger, limitRevealDuxo, function0);
                }
            };
            composer.updateRememberedValue(function02);
            objRememberedValue = function02;
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifier, null, null, false, null, null, (Function0) objRememberedValue, strStringResource2, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(boolean z, boolean z2, EventLogger eventLogger, LimitRevealDuxo limitRevealDuxo, Function0 function0) {
        if (z && z2) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.CC_APPLICATION_LIMIT_REVEAL, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
            limitRevealDuxo.onPremiumContinue();
        } else {
            loggingUtils.logContinue$default(eventLogger, null, 1, null);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
