package com.robinhood.android.cortex.digest.common.sources;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cortex.digest.common.C12073R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CortexArticleSourceOverlfowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.common.sources.ComposableSingletons$CortexArticleSourceOverlfowComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CortexArticleSourceOverlfowComposable {
    public static final CortexArticleSourceOverlfowComposable INSTANCE = new CortexArticleSourceOverlfowComposable();

    /* renamed from: lambda$-1535719212, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8743lambda$1535719212 = ComposableLambda3.composableLambdaInstance(-1535719212, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.ComposableSingletons$CortexArticleSourceOverlfowComposableKt$lambda$-1535719212$1
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
                ComposerKt.traceEventStart(-1535719212, i, -1, "com.robinhood.android.cortex.digest.common.sources.ComposableSingletons$CortexArticleSourceOverlfowComposableKt.lambda$-1535719212.<anonymous> (CortexArticleSourceOverlfowComposable.kt:33)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12073R.string.cortex_digest_article_source_header_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1535719212$lib_cortex_digest_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12578getLambda$1535719212$lib_cortex_digest_common_externalDebug() {
        return f8743lambda$1535719212;
    }
}
