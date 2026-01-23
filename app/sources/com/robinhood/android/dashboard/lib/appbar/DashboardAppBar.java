package com.robinhood.android.dashboard.lib.appbar;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DashboardAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.appbar.ComposableSingletons$DashboardAppBarKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardAppBar {
    public static final DashboardAppBar INSTANCE = new DashboardAppBar();

    /* renamed from: lambda$-7930348, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8863lambda$7930348 = ComposableLambda3.composableLambdaInstance(-7930348, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.appbar.ComposableSingletons$DashboardAppBarKt$lambda$-7930348$1
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
                ComposerKt.traceEventStart(-7930348, i, -1, "com.robinhood.android.dashboard.lib.appbar.ComposableSingletons$DashboardAppBarKt.lambda$-7930348.<anonymous> (DashboardAppBar.kt:162)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24), StringResources_androidKt.stringResource(C13691R.string.general_label_settings, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-7930348$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13188getLambda$7930348$lib_account_home_externalDebug() {
        return f8863lambda$7930348;
    }
}
