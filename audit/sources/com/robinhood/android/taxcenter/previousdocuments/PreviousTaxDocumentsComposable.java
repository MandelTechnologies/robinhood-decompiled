package com.robinhood.android.taxcenter.previousdocuments;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviousTaxDocumentsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcenter.previousdocuments.ComposableSingletons$PreviousTaxDocumentsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PreviousTaxDocumentsComposable {
    public static final PreviousTaxDocumentsComposable INSTANCE = new PreviousTaxDocumentsComposable();
    private static Function3<BentoButtonBar3, Composer, Integer, Unit> lambda$318846964 = ComposableLambda3.composableLambdaInstance(318846964, false, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.previousdocuments.ComposableSingletons$PreviousTaxDocumentsComposableKt$lambda$318846964$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(318846964, i, -1, "com.robinhood.android.taxcenter.previousdocuments.ComposableSingletons$PreviousTaxDocumentsComposableKt.lambda$318846964.<anonymous> (PreviousTaxDocumentsComposable.kt:73)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BentoButtonBar3, Composer, Integer, Unit> getLambda$318846964$feature_tax_center_externalDebug() {
        return lambda$318846964;
    }
}
