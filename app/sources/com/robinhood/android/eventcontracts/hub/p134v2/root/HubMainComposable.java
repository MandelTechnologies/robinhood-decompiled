package com.robinhood.android.eventcontracts.hub.p134v2.root;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubMainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubMainComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubMainComposable {
    public static final HubMainComposable INSTANCE = new HubMainComposable();
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$637307946 = ComposableLambda3.composableLambdaInstance(637307946, false, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubMainComposableKt$lambda$637307946$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(637307946, i, -1, "com.robinhood.android.eventcontracts.hub.v2.root.ComposableSingletons$HubMainComposableKt.lambda$637307946.<anonymous> (HubMainComposable.kt:67)");
            }
            ConditionalBackIcon.ConditionalBackIcon(BentoAppBar, composer, (i & 14) | BentoAppBarScope.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$637307946$feature_hub_v2_externalDebug() {
        return lambda$637307946;
    }
}
