package com.robinhood.shared.crypto.p375ui.primer;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimerHeaderAssetContainer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.primer.ComposableSingletons$PrimerHeaderAssetContainerKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PrimerHeaderAssetContainer {
    public static final PrimerHeaderAssetContainer INSTANCE = new PrimerHeaderAssetContainer();

    /* renamed from: lambda$-766802574, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9440lambda$766802574 = ComposableLambda3.composableLambdaInstance(-766802574, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.primer.ComposableSingletons$PrimerHeaderAssetContainerKt$lambda$-766802574$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope PrimerHeaderAssetContainer, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PrimerHeaderAssetContainer, "$this$PrimerHeaderAssetContainer");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-766802574, i, -1, "com.robinhood.shared.crypto.ui.primer.ComposableSingletons$PrimerHeaderAssetContainerKt.lambda$-766802574.<anonymous> (PrimerHeaderAssetContainer.kt:60)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper3.CRYPTO_ORDER_TYPES_BUY_MARKET.getResourceId(), composer, 0), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1377828233 = ComposableLambda3.composableLambdaInstance(1377828233, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.primer.ComposableSingletons$PrimerHeaderAssetContainerKt$lambda$1377828233$1
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
                ComposerKt.traceEventStart(1377828233, i, -1, "com.robinhood.shared.crypto.ui.primer.ComposableSingletons$PrimerHeaderAssetContainerKt.lambda$1377828233.<anonymous> (PrimerHeaderAssetContainer.kt:59)");
            }
            PrimerHeaderAssetContainer4.PrimerHeaderAssetContainer(null, null, PrimerHeaderAssetContainer.INSTANCE.m25231getLambda$766802574$lib_crypto_ui_externalDebug(), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-766802574$lib_crypto_ui_externalDebug, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m25231getLambda$766802574$lib_crypto_ui_externalDebug() {
        return f9440lambda$766802574;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1377828233$lib_crypto_ui_externalDebug() {
        return lambda$1377828233;
    }
}
