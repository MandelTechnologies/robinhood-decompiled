package com.robinhood.android.matcha.p177ui.memo;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MemoInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.memo.ComposableSingletons$MemoInputComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MemoInputComposable {
    public static final MemoInputComposable INSTANCE = new MemoInputComposable();

    /* renamed from: lambda$-587725001, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9108lambda$587725001 = ComposableLambda3.composableLambdaInstance(-587725001, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.ComposableSingletons$MemoInputComposableKt$lambda$-587725001$1
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
                ComposerKt.traceEventStart(-587725001, i, -1, "com.robinhood.android.matcha.ui.memo.ComposableSingletons$MemoInputComposableKt.lambda$-587725001.<anonymous> (MemoInputComposable.kt:84)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_add_memo, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-587725001$feature_p2p_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16364getLambda$587725001$feature_p2p_externalDebug() {
        return f9108lambda$587725001;
    }
}
