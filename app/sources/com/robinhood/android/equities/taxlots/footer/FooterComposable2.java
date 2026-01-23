package com.robinhood.android.equities.taxlots.footer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FooterComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterComposableKt$lambda$1166258126$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FooterComposable2 implements Function2<Composer, Integer, Unit> {
    public static final FooterComposable2 INSTANCE = new FooterComposable2();

    FooterComposable2() {
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
            ComposerKt.traceEventStart(1166258126, i, -1, "com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterComposableKt.lambda$1166258126.<anonymous> (FooterComposable.kt:218)");
        }
        BigDecimal bigDecimal = new BigDecimal("99999999.999999999");
        StringResource.Companion companion = StringResource.INSTANCE;
        FooterViewState footerViewState = new FooterViewState(null, bigDecimal, false, companion.invoke("+$99999999.999999999"), Boolean.TRUE, companion.invoke("$99999999.999999999"), null, 64, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterComposableKt$lambda$1166258126$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        FooterComposable6.FooterComposable(footerViewState, (Function0) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
