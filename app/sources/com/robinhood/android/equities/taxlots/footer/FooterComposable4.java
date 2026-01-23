package com.robinhood.android.equities.taxlots.footer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equities.taxlots.C14807R;
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
/* renamed from: com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterComposableKt$lambda$2052789519$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FooterComposable4 implements Function2<Composer, Integer, Unit> {
    public static final FooterComposable4 INSTANCE = new FooterComposable4();

    FooterComposable4() {
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
            ComposerKt.traceEventStart(2052789519, i, -1, "com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterComposableKt.lambda$2052789519.<anonymous> (FooterComposable.kt:199)");
        }
        BigDecimal bigDecimal = new BigDecimal("0");
        StringResource.Companion companion = StringResource.INSTANCE;
        FooterViewState footerViewState = new FooterViewState(null, bigDecimal, false, companion.invoke(C14807R.string.tax_lots_table_empty_text, new Object[0]), null, companion.invoke(C14807R.string.tax_lots_table_empty_text, new Object[0]), BigDecimal.TEN);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.footer.ComposableSingletons$FooterComposableKt$lambda$2052789519$1$$ExternalSyntheticLambda0
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
