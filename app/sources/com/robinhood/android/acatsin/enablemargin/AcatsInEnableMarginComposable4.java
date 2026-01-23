package com.robinhood.android.acatsin.enablemargin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acatsin.C7725R;
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
/* renamed from: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-396847050$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInEnableMarginComposable4 implements Function2<Composer, Integer, Unit> {
    public static final AcatsInEnableMarginComposable4 INSTANCE = new AcatsInEnableMarginComposable4();

    AcatsInEnableMarginComposable4() {
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
            ComposerKt.traceEventStart(-396847050, i, -1, "com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt.lambda$-396847050.<anonymous> (AcatsInEnableMarginComposable.kt:107)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        AcatsInEnableMarginViewState.Loaded loaded = new AcatsInEnableMarginViewState.Loaded(companion.invoke(C7725R.string.acats_in_enable_margin_title, new Object[0]), companion.invoke(C7725R.string.acats_in_enable_margin_message, new Object[0]), true, false, 8, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-396847050$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-396847050$1$$ExternalSyntheticLambda1
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
