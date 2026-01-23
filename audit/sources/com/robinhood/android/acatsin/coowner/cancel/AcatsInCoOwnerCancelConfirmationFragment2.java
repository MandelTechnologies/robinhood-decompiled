package com.robinhood.android.acatsin.coowner.cancel;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInCoOwnerCancelConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.cancel.ComposableSingletons$AcatsInCoOwnerCancelConfirmationFragmentKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerCancelConfirmationFragment2 {
    public static final AcatsInCoOwnerCancelConfirmationFragment2 INSTANCE = new AcatsInCoOwnerCancelConfirmationFragment2();

    /* renamed from: lambda$-1695242037, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8609lambda$1695242037 = ComposableLambda3.composableLambdaInstance(-1695242037, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.coowner.cancel.ComposableSingletons$AcatsInCoOwnerCancelConfirmationFragmentKt$lambda$-1695242037$1
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
                ComposerKt.traceEventStart(-1695242037, i, -1, "com.robinhood.android.acatsin.coowner.cancel.ComposableSingletons$AcatsInCoOwnerCancelConfirmationFragmentKt.lambda$-1695242037.<anonymous> (AcatsInCoOwnerCancelConfirmationFragment.kt:39)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1695242037$feature_acats_in_coowner_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10727getLambda$1695242037$feature_acats_in_coowner_externalDebug() {
        return f8609lambda$1695242037;
    }
}
