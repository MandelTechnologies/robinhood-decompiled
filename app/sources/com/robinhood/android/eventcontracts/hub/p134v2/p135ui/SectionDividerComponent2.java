package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.hub.p134v2.home.SectionDividerComponentViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SectionDividerComponent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$SectionDividerComponentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SectionDividerComponent2 {
    public static final SectionDividerComponent2 INSTANCE = new SectionDividerComponent2();

    /* renamed from: lambda$-1895778848, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8960lambda$1895778848 = ComposableLambda3.composableLambdaInstance(-1895778848, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$SectionDividerComponentKt$lambda$-1895778848$1
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
                ComposerKt.traceEventStart(-1895778848, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.ComposableSingletons$SectionDividerComponentKt.lambda$-1895778848.<anonymous> (SectionDividerComponent.kt:56)");
            }
            SectionDividerComponent4.SectionDividerComponent(new SectionDividerComponentViewState("Final"), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1895778848$feature_hub_v2_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14354getLambda$1895778848$feature_hub_v2_externalDebug() {
        return f8960lambda$1895778848;
    }
}
