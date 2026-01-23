package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations2;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringExtraCashData;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringDepositExtraCashSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.ComposableSingletons$RecurringDepositExtraCashSplashComposableKt$lambda$-1762420410$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositExtraCashSplashComposable2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    public static final RecurringDepositExtraCashSplashComposable2 INSTANCE = new RecurringDepositExtraCashSplashComposable2();

    RecurringDepositExtraCashSplashComposable2() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1762420410, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.ComposableSingletons$RecurringDepositExtraCashSplashComposableKt.lambda$-1762420410.<anonymous> (RecurringDepositExtraCashSplashComposable.kt:65)");
        }
        final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
        BentoButtons.Type type2 = BentoButtons.Type.Primary;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 10, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(lifecycleAwareNavigator);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.ComposableSingletons$RecurringDepositExtraCashSplashComposableKt$lambda$-1762420410$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringDepositExtraCashSplashComposable2.invoke$lambda$1$lambda$0(lifecycleAwareNavigator);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations2.INSTANCE, new RecurringExtraCashData(null, null, null, 7, null), null, null, 6, null), false, (Function1) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
