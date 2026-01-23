package com.robinhood.android.options.settings;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsSettingsShortSellingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.settings.OptionsSettingsShortSellingComposableKt$OptionsSettingsShortSellingComposable$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSettingsShortSellingComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ OptionSettingShortSellingState $state;
    final /* synthetic */ Function1<Boolean, Unit> $toggleShortSelling;

    /* JADX WARN: Multi-variable type inference failed */
    OptionsSettingsShortSellingComposable2(OptionSettingShortSellingState optionSettingShortSellingState, Function1<? super Boolean, Unit> function1, EventLogger eventLogger) {
        this.$state = optionSettingShortSellingState;
        this.$toggleShortSelling = function1;
        this.$eventLogger = eventLogger;
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
            ComposerKt.traceEventStart(1557207569, i, -1, "com.robinhood.android.options.settings.OptionsSettingsShortSellingComposable.<anonymous>.<anonymous> (OptionsSettingsShortSellingComposable.kt:34)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C23695R.string.options_setting_short_selling_title, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(this.$state.getShortSellingSubtitleTextRes(), composer, 0);
        boolean shortSellingToggleChecked = this.$state.getShortSellingToggleChecked();
        boolean shortSellingToggleEnabled = this.$state.getShortSellingToggleEnabled();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$toggleShortSelling) | composer.changedInstance(this.$eventLogger);
        final Function1<Boolean, Unit> function1 = this.$toggleShortSelling;
        final EventLogger eventLogger = this.$eventLogger;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingsShortSellingComposableKt$OptionsSettingsShortSellingComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSettingsShortSellingComposable2.invoke$lambda$1$lambda$0(function1, eventLogger, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoToggleRow3.BentoToggleRow(null, strStringResource, strStringResource2, shortSellingToggleEnabled, shortSellingToggleChecked, null, false, null, (Function1) objRememberedValue, composer, 0, 225);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, EventLogger eventLogger, boolean z) {
        String str;
        function1.invoke(Boolean.valueOf(z));
        Component component = new Component(Component.ComponentType.BUTTON, "short_selling_setting", null, 4, null);
        if (z) {
            str = "enable";
        } else {
            str = AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_DISABLE;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, component, null, new Context(0, 0, 0, str, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 43, null);
        return Unit.INSTANCE;
    }
}
