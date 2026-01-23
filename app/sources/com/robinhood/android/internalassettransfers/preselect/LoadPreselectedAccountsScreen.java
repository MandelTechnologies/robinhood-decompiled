package com.robinhood.android.internalassettransfers.preselect;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadPreselectedAccountsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.preselect.ComposableSingletons$LoadPreselectedAccountsScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LoadPreselectedAccountsScreen {
    public static final LoadPreselectedAccountsScreen INSTANCE = new LoadPreselectedAccountsScreen();
    private static Function2<Composer, Integer, Unit> lambda$1424024786 = ComposableLambda3.composableLambdaInstance(1424024786, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.preselect.ComposableSingletons$LoadPreselectedAccountsScreenKt$lambda$1424024786$1
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
                ComposerKt.traceEventStart(1424024786, i, -1, "com.robinhood.android.internalassettransfers.preselect.ComposableSingletons$LoadPreselectedAccountsScreenKt.lambda$1424024786.<anonymous> (LoadPreselectedAccountsScreen.kt:31)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1142054204, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9052lambda$1142054204 = ComposableLambda3.composableLambdaInstance(-1142054204, false, LoadPreselectedAccountsScreen2.INSTANCE);

    /* renamed from: lambda$-738020044, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9053lambda$738020044 = ComposableLambda3.composableLambdaInstance(-738020044, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.preselect.ComposableSingletons$LoadPreselectedAccountsScreenKt$lambda$-738020044$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-738020044, i, -1, "com.robinhood.android.internalassettransfers.preselect.ComposableSingletons$LoadPreselectedAccountsScreenKt.lambda$-738020044.<anonymous> (LoadPreselectedAccountsScreen.kt:41)");
            }
            LocalShowPlaceholder.Loadable(true, PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, LoadPreselectedAccountsScreen.INSTANCE.m2098x4aa840e2(), composer, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1142054204$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2098x4aa840e2() {
        return f9052lambda$1142054204;
    }

    /* renamed from: getLambda$-738020044$feature_internal_asset_transfers_externalDebug */
    public final Function3<PaddingValues, Composer, Integer, Unit> m2099xa08b1c55() {
        return f9053lambda$738020044;
    }

    /* renamed from: getLambda$1424024786$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2100xbd01a59e() {
        return lambda$1424024786;
    }
}
