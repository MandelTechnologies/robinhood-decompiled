package com.robinhood.android.taxcenter.viewdocument;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentDownloadComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DocumentDownloadComposable {
    public static final DocumentDownloadComposable INSTANCE = new DocumentDownloadComposable();

    /* renamed from: lambda$-281286481, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9260lambda$281286481 = ComposableLambda3.composableLambdaInstance(-281286481, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt$lambda$-281286481$1
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
                ComposerKt.traceEventStart(-281286481, i, -1, "com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt.lambda$-281286481.<anonymous> (DocumentDownloadComposable.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-921187833, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9261lambda$921187833 = ComposableLambda3.composableLambdaInstance(-921187833, false, DocumentDownloadComposable3.INSTANCE);

    /* renamed from: getLambda$-281286481$feature_tax_center_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19223getLambda$281286481$feature_tax_center_externalDebug() {
        return f9260lambda$281286481;
    }

    /* renamed from: getLambda$-921187833$feature_tax_center_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19224getLambda$921187833$feature_tax_center_externalDebug() {
        return f9261lambda$921187833;
    }
}
