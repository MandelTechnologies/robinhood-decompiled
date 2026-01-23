package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import com.robinhood.android.chart.blackwidowadvancedchart.AddIndicatorScreenState;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AddIndicatorScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1 INSTANCE = new ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1();

    ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1() {
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
            ComposerKt.traceEventStart(1857233451, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt.lambda$1857233451.<anonymous> (AddIndicatorScreen.kt:523)");
        }
        AddIndicatorScreenState addIndicatorScreenState = new AddIndicatorScreenState(false, extensions2.persistentListOf(new IndicatorDto(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "Relative Strength Index", "RSI", false, null, 24, null), new IndicatorDto(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "Exponential moving average", "EMA", false, null, 24, null), new IndicatorDto(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, "Volume-weighted average price", "VWAP", false, null, 24, null), new IndicatorDto(Constants.SdidMigrationStatusCodes.MISSING_PARAMS, "Simple moving average", "SMA", false, null, 24, null)), extensions2.persistentListOf(new IndicatorDto(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "Relative Strength Index", "RSI", false, null, 24, null)), extensions2.persistentListOf());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1.invoke$lambda$3$lambda$2((IndicatorDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AddIndicatorScreenKt.AddIndicatorScreen(addIndicatorScreenState, function0, (Function1) objRememberedValue2, null, composer, 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(IndicatorDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
