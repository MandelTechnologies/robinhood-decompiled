package com.robinhood.android.equitytradeladder.topbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContentState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTradeLadderTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeLadderTopBar2 implements Function2<Composer, Integer, Unit> {
    public static final EquityTradeLadderTopBar2 INSTANCE = new EquityTradeLadderTopBar2();

    EquityTradeLadderTopBar2() {
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
            ComposerKt.traceEventStart(1101081545, i, -1, "com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt.lambda$1101081545.<anonymous> (EquityTradeLadderTopBar.kt:104)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        TitleContentState titleContentState = new TitleContentState(companion.invoke("Title"), false, companion.invoke("2 Positions"), TitleContentState.DeltaDirection.POSITIVE, false);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(123);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        EquityTradeLadderViewState.TopBarData topBarData = new EquityTradeLadderViewState.TopBarData(titleContentState, bigDecimalValueOf, bigDecimalValueOf2, true, companion.invoke("+$500"), new EquityTradeLadderViewState.TopBarData.FlattenButtonData(true, true, false, false, null, false), false, 2, true, false, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda0
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
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda1
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
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function03 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function04 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function0 function05 = (Function0) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        Function0 function06 = (Function0) objRememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function0 function07 = (Function0) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.equitytradeladder.topbar.ComposableSingletons$EquityTradeLadderTopBarKt$lambda$1101081545$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        EquityTradeLadderTopBar3.EquityTradeLadderTopBar(topBarData, function0, function02, function03, function04, function05, function06, function07, (Function0) objRememberedValue8, null, null, composer, 115043760, 0, 1536);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
