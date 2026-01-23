package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

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

/* compiled from: RhyTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyTopAppBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyTopAppBar {
    public static final RhyTopAppBar INSTANCE = new RhyTopAppBar();
    private static Function2<Composer, Integer, Unit> lambda$1139649368 = ComposableLambda3.composableLambdaInstance(1139649368, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyTopAppBarKt$lambda$1139649368$1
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
                ComposerKt.traceEventStart(1139649368, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyTopAppBarKt.lambda$1139649368.<anonymous> (RhyTopAppBar.kt:94)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SEARCH_24), StringResources_androidKt.stringResource(C11048R.string.general_action_search, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-467768933, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8682lambda$467768933 = ComposableLambda3.composableLambdaInstance(-467768933, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyTopAppBarKt$lambda$-467768933$1
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
                ComposerKt.traceEventStart(-467768933, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyTopAppBarKt.lambda$-467768933.<anonymous> (RhyTopAppBar.kt:118)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.NOTIFICATION_24), StringResources_androidKt.stringResource(C11048R.string.top_nav_inbox_button_description, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-467768933$feature_cash_rhy_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11705getLambda$467768933$feature_cash_rhy_tab_externalDebug() {
        return f8682lambda$467768933;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1139649368$feature_cash_rhy_tab_externalDebug() {
        return lambda$1139649368;
    }
}
