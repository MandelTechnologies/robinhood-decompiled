package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlideUpScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$SlideUpScreenKt$lambda$-2115803357$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SlideUpScreen6 implements Function2<Composer, Integer, Unit> {
    public static final SlideUpScreen6 INSTANCE = new SlideUpScreen6();

    SlideUpScreen6() {
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
            ComposerKt.traceEventStart(-2115803357, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$SlideUpScreenKt.lambda$-2115803357.<anonymous> (SlideUpScreen.kt:137)");
        }
        LadderScreenState.SlideUp.IdentiAgreement identiAgreement = new LadderScreenState.SlideUp.IdentiAgreement(null, false, false, null, 9, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$SlideUpScreenKt$lambda$-2115803357$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlideUpScreen6.invoke$lambda$1$lambda$0((LadderScreenState) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$SlideUpScreenKt$lambda$-2115803357$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlideUpScreen6.invoke$lambda$3$lambda$2((LadderScreenState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$SlideUpScreenKt$lambda$-2115803357$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlideUpScreen6.invoke$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        SlideUpScreen7.SlideUpScreen(identiAgreement, function2, function1, (Function1) objRememberedValue3, composer, 3504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(LadderScreenState ladderScreenState) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LadderScreenState ladderScreenState, boolean z) {
        Intrinsics.checkNotNullParameter(ladderScreenState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(boolean z) {
        return Unit.INSTANCE;
    }
}
