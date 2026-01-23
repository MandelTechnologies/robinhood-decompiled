package com.robinhood.android.cortex.digest.asset;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$AssetDigestComposableKt {
    public static final ComposableSingletons$AssetDigestComposableKt INSTANCE = new ComposableSingletons$AssetDigestComposableKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1496114688 = ComposableLambda3.composableLambdaInstance(1496114688, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$1496114688$1
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
                ComposerKt.traceEventStart(1496114688, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt.lambda$1496114688.<anonymous> (AssetDigestComposable.kt:292)");
            }
            AssetDigestComposableKt.AssetDigestAnimation(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<String, Composer, Integer, Unit> lambda$413392129 = ComposableLambda3.composableLambdaInstance(413392129, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$413392129$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(413392129, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt.lambda$413392129.<anonymous> (AssetDigestComposable.kt:452)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.LIGHTNING_12), StringResources_androidKt.stringResource(C12023R.string.copilot_digest_breaking_news, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU(), modifierFillMaxSize$default, null, false, composer, BentoIcon4.Size12.$stable | 3072, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2028017094, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f8737lambda$2028017094 = ComposableLambda3.composableLambdaInstance(-2028017094, false, C12020x9adabbf.INSTANCE);

    /* renamed from: lambda$-1476151639, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8736lambda$1476151639 = ComposableLambda3.composableLambdaInstance(-1476151639, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$-1476151639$1
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
                ComposerKt.traceEventStart(-1476151639, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt.lambda$-1476151639.<anonymous> (AssetDigestComposable.kt:578)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableSingletons$AssetDigestComposableKt.INSTANCE.m12560getLambda$2028017094$feature_cortex_digest_asset_externalDebug(), composer, 805306368, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-144413343, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8735lambda$144413343 = ComposableLambda3.composableLambdaInstance(-144413343, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt$lambda$-144413343$1
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
                ComposerKt.traceEventStart(-144413343, i, -1, "com.robinhood.android.cortex.digest.asset.ComposableSingletons$AssetDigestComposableKt.lambda$-144413343.<anonymous> (AssetDigestComposable.kt:577)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$AssetDigestComposableKt.INSTANCE.m12559getLambda$1476151639$feature_cortex_digest_asset_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-144413343$feature_cortex_digest_asset_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12558getLambda$144413343$feature_cortex_digest_asset_externalDebug() {
        return f8735lambda$144413343;
    }

    /* renamed from: getLambda$-1476151639$feature_cortex_digest_asset_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12559getLambda$1476151639$feature_cortex_digest_asset_externalDebug() {
        return f8736lambda$1476151639;
    }

    /* renamed from: getLambda$-2028017094$feature_cortex_digest_asset_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m12560getLambda$2028017094$feature_cortex_digest_asset_externalDebug() {
        return f8737lambda$2028017094;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1496114688$feature_cortex_digest_asset_externalDebug() {
        return lambda$1496114688;
    }

    public final Function3<String, Composer, Integer, Unit> getLambda$413392129$feature_cortex_digest_asset_externalDebug() {
        return lambda$413392129;
    }
}
