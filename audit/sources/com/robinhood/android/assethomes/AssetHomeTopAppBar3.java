package com.robinhood.android.assethomes;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetHomeTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.ComposableSingletons$AssetHomeTopAppBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeTopAppBar3 {
    public static final AssetHomeTopAppBar3 INSTANCE = new AssetHomeTopAppBar3();
    private static Function2<Composer, Integer, Unit> lambda$2103513349 = ComposableLambda3.composableLambdaInstance(2103513349, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.ComposableSingletons$AssetHomeTopAppBarKt$lambda$2103513349$1
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
                ComposerKt.traceEventStart(2103513349, i, -1, "com.robinhood.android.assethomes.ComposableSingletons$AssetHomeTopAppBarKt.lambda$2103513349.<anonymous> (AssetHomeTopAppBar.kt:109)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SEARCH_24), StringResources_androidKt.stringResource(C11048R.string.general_action_search, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2103513349$feature_asset_homes_externalDebug() {
        return lambda$2103513349;
    }
}
