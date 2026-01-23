package com.robinhood.android.futures.sharedfuturesui.animations;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PillLoadingPlaceholderModifierKt {
    public static final ComposableSingletons$PillLoadingPlaceholderModifierKt INSTANCE = new ComposableSingletons$PillLoadingPlaceholderModifierKt();

    /* renamed from: lambda$-99832347, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8997lambda$99832347 = ComposableLambda3.composableLambdaInstance(-99832347, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.animations.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$-99832347$1
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
                ComposerKt.traceEventStart(-99832347, i, -1, "com.robinhood.android.futures.sharedfuturesui.animations.ComposableSingletons$PillLoadingPlaceholderModifierKt.lambda$-99832347.<anonymous> (PillLoadingPlaceholderModifier.kt:190)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            RoundedCornerShape RoundedCornerShape = RoundedCornerShape2.RoundedCornerShape(50);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw("Getting price...", PillLoadingPlaceholderModifierKt.m14744pillLoadingPlaceholder0cUbh54$default(companion, RoundedCornerShape, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), PillLoadingPlaceholderModifierKt.defaultPillOutlineLinearGradiant(bentoTheme.getColors(composer, i2)), 0.0f, 0.0f, 0, null, 120, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-527706038, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8996lambda$527706038 = ComposableLambda3.composableLambdaInstance(-527706038, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.sharedfuturesui.animations.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$-527706038$1
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
                ComposerKt.traceEventStart(-527706038, i, -1, "com.robinhood.android.futures.sharedfuturesui.animations.ComposableSingletons$PillLoadingPlaceholderModifierKt.lambda$-527706038.<anonymous> (PillLoadingPlaceholderModifier.kt:188)");
            }
            SurfaceKt.m5967SurfaceT9BRK9s(null, null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$PillLoadingPlaceholderModifierKt.INSTANCE.m14738getLambda$99832347$lib_shared_futures_ui_externalDebug(), composer, 12582912, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-527706038$lib_shared_futures_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14737getLambda$527706038$lib_shared_futures_ui_externalDebug() {
        return f8996lambda$527706038;
    }

    /* renamed from: getLambda$-99832347$lib_shared_futures_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14738getLambda$99832347$lib_shared_futures_ui_externalDebug() {
        return f8997lambda$99832347;
    }
}
