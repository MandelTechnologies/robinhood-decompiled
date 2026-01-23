package com.robinhood.android.linking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MobileLinkingGroupsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MobileLinkingGroupsComposable {
    public static final MobileLinkingGroupsComposable INSTANCE = new MobileLinkingGroupsComposable();
    private static Function2<Composer, Integer, Unit> lambda$1128339128 = ComposableLambda3.composableLambdaInstance(1128339128, false, MobileLinkingGroupsComposable3.INSTANCE);

    /* renamed from: lambda$-802372243, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9103lambda$802372243 = ComposableLambda3.composableLambdaInstance(-802372243, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt$lambda$-802372243$1
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
                ComposerKt.traceEventStart(-802372243, i, -1, "com.robinhood.android.linking.ComposableSingletons$MobileLinkingGroupsComposableKt.lambda$-802372243.<anonymous> (MobileLinkingGroupsComposable.kt:149)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(MobileLinkingGroupsComposable.INSTANCE.getLambda$1128339128$lib_mobile_linking_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-802372243$lib_mobile_linking_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16067getLambda$802372243$lib_mobile_linking_externalDebug() {
        return f9103lambda$802372243;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1128339128$lib_mobile_linking_externalDebug() {
        return lambda$1128339128;
    }
}
