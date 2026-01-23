package com.robinhood.android.p273ui;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.tabs.C29231R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MainTabBarViewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MainTabBarViewComposable {
    public static final MainTabBarViewComposable INSTANCE = new MainTabBarViewComposable();

    /* renamed from: lambda$-599613037, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9296lambda$599613037 = ComposableLambda3.composableLambdaInstance(-599613037, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt$lambda$-599613037$1
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
                ComposerKt.traceEventStart(-599613037, i, -1, "com.robinhood.android.ui.ComposableSingletons$MainTabBarViewComposableKt.lambda$-599613037.<anonymous> (MainTabBarViewComposable.kt:89)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29231R.string.watchlist_tab_tooltip, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-599613037$feature_tab_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20012getLambda$599613037$feature_tab_ui_externalDebug() {
        return f9296lambda$599613037;
    }
}
