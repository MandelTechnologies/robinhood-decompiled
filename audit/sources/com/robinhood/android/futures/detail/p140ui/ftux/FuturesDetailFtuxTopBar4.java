package com.robinhood.android.futures.detail.p140ui.ftux;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailFtuxTopBar.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"FuturesDetailFtuxTopBar", "", "onCloseClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailFtuxTopBar4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailFtuxTopBar$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesDetailFtuxTopBar(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesDetailFtuxTopBar(final Function0<Unit> onCloseClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-778774659);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-778774659, i3, -1, "com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBar (FuturesDetailFtuxTopBar.kt:17)");
                }
                int i5 = (i3 & 112) | 3078;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(FuturesDetailFtuxTopBar.INSTANCE.m14594getLambda$544871760$feature_futures_detail_externalDebug(), modifier3, null, ComposableLambda3.rememberComposableLambda(-212364261, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBarKt.FuturesDetailFtuxTopBar.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-212364261, i6, -1, "com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBar.<anonymous> (FuturesDetailFtuxTopBar.kt:22)");
                        }
                        IconButton5.IconButton(onCloseClicked, null, false, null, null, FuturesDetailFtuxTopBar.INSTANCE.m14593getLambda$321547682$feature_futures_detail_externalDebug(), composer3, 196608, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, i5, 0, 2036);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesDetailFtuxTopBar4.FuturesDetailFtuxTopBar$lambda$0(onCloseClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = (i3 & 112) | 3078;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(FuturesDetailFtuxTopBar.INSTANCE.m14594getLambda$544871760$feature_futures_detail_externalDebug(), modifier3, null, ComposableLambda3.rememberComposableLambda(-212364261, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBarKt.FuturesDetailFtuxTopBar.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-212364261, i6, -1, "com.robinhood.android.futures.detail.ui.ftux.FuturesDetailFtuxTopBar.<anonymous> (FuturesDetailFtuxTopBar.kt:22)");
                    }
                    IconButton5.IconButton(onCloseClicked, null, false, null, null, FuturesDetailFtuxTopBar.INSTANCE.m14593getLambda$321547682$feature_futures_detail_externalDebug(), composer3, 196608, 30);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, i52, 0, 2036);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
