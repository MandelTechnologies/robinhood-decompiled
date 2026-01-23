package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldValuePropsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$GoldValuePropsBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class GoldValuePropsBottomSheet2 {
    public static final GoldValuePropsBottomSheet2 INSTANCE = new GoldValuePropsBottomSheet2();
    private static Function2<Composer, Integer, Unit> lambda$101051075 = ComposableLambda3.composableLambdaInstance(101051075, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$GoldValuePropsBottomSheetKt$lambda$101051075$1
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
                ComposerKt.traceEventStart(101051075, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.ComposableSingletons$GoldValuePropsBottomSheetKt.lambda$101051075.<anonymous> (GoldValuePropsBottomSheet.kt:82)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$101051075$feature_credit_card_externalDebug() {
        return lambda$101051075;
    }
}
