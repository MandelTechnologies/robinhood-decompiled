package com.robinhood.android.common.gold;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.ComposableSingletons$LegacyGoldUpgradeAgreementComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LegacyGoldUpgradeAgreementComposable {
    public static final LegacyGoldUpgradeAgreementComposable INSTANCE = new LegacyGoldUpgradeAgreementComposable();

    /* renamed from: lambda$-1622016285, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8722lambda$1622016285 = ComposableLambda3.composableLambdaInstance(-1622016285, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.ComposableSingletons$LegacyGoldUpgradeAgreementComposableKt$lambda$-1622016285$1
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
                ComposerKt.traceEventStart(-1622016285, i, -1, "com.robinhood.android.common.gold.ComposableSingletons$LegacyGoldUpgradeAgreementComposableKt.lambda$-1622016285.<anonymous> (LegacyGoldUpgradeAgreementComposable.kt:77)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1622016285$feature_lib_gold_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12211getLambda$1622016285$feature_lib_gold_externalRelease() {
        return f8722lambda$1622016285;
    }
}
