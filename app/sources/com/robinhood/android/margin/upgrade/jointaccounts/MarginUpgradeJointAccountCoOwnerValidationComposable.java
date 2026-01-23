package com.robinhood.android.margin.upgrade.jointaccounts;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginUpgradeJointAccountCoOwnerValidationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.ComposableSingletons$MarginUpgradeJointAccountCoOwnerValidationComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeJointAccountCoOwnerValidationComposable {
    public static final MarginUpgradeJointAccountCoOwnerValidationComposable INSTANCE = new MarginUpgradeJointAccountCoOwnerValidationComposable();
    private static Function2<Composer, Integer, Unit> lambda$511501144 = ComposableLambda3.composableLambdaInstance(511501144, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.jointaccounts.ComposableSingletons$MarginUpgradeJointAccountCoOwnerValidationComposableKt$lambda$511501144$1
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
                ComposerKt.traceEventStart(511501144, i, -1, "com.robinhood.android.margin.upgrade.jointaccounts.ComposableSingletons$MarginUpgradeJointAccountCoOwnerValidationComposableKt.lambda$511501144.<anonymous> (MarginUpgradeJointAccountCoOwnerValidationComposable.kt:92)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$511501144$feature_margin_upgrade_externalDebug() {
        return lambda$511501144;
    }
}
