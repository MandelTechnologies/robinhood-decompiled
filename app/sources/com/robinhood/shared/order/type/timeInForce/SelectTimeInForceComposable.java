package com.robinhood.shared.order.type.timeInForce;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.order.type.C39278R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectTimeInForceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectTimeInForceComposable {
    public static final SelectTimeInForceComposable INSTANCE = new SelectTimeInForceComposable();
    private static Function2<Composer, Integer, Unit> lambda$1212566940 = ComposableLambda3.composableLambdaInstance(1212566940, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt$lambda$1212566940$1
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
                ComposerKt.traceEventStart(1212566940, i, -1, "com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt.lambda$1212566940.<anonymous> (SelectTimeInForceComposable.kt:53)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-691869112, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9468lambda$691869112 = ComposableLambda3.composableLambdaInstance(-691869112, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt$lambda$-691869112$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691869112, i, -1, "com.robinhood.shared.order.type.timeInForce.ComposableSingletons$SelectTimeInForceComposableKt.lambda$-691869112.<anonymous> (SelectTimeInForceComposable.kt:93)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C39278R.string.crypto_select_tif_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39278R.string.crypto_select_tif_description, composer, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1042624849, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9467lambda$1042624849 = ComposableLambda3.composableLambdaInstance(-1042624849, false, SelectTimeInForceComposable2.INSTANCE);

    /* renamed from: getLambda$-1042624849$lib_order_type_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25584getLambda$1042624849$lib_order_type_externalDebug() {
        return f9467lambda$1042624849;
    }

    /* renamed from: getLambda$-691869112$lib_order_type_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m25585getLambda$691869112$lib_order_type_externalDebug() {
        return f9468lambda$691869112;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1212566940$lib_order_type_externalDebug() {
        return lambda$1212566940;
    }
}
