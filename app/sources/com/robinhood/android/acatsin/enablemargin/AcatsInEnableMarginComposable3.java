package com.robinhood.android.acatsin.enablemargin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInEnableMarginComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-307526231$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInEnableMarginComposable3 implements Function2<Composer, Integer, Unit> {
    public static final AcatsInEnableMarginComposable3 INSTANCE = new AcatsInEnableMarginComposable3();

    AcatsInEnableMarginComposable3() {
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
            ComposerKt.traceEventStart(-307526231, i, -1, "com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt.lambda$-307526231.<anonymous> (AcatsInEnableMarginComposable.kt:123)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        AcatsInEnableMarginViewState.Loaded loaded = new AcatsInEnableMarginViewState.Loaded(companion.invoke("Margin balances can't be transferred to cash accounts"), companion.invoke("You can only have one margin-enabled individual account."), false, false, 8, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-307526231$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-307526231$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AcatsInEnableMarginComposable.AcatsInEnableMarginComposable(loaded, function0, (Function0) objRememberedValue2, composer, StringResource.$stable | 432);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
