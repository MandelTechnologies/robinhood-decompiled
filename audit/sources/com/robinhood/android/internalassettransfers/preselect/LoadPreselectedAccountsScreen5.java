package com.robinhood.android.internalassettransfers.preselect;

import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadPreselectedAccountsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"LoadPreselectedAccountsScreen", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LoadPreselectedAccountsScreen5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadPreselectedAccountsScreen$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadPreselectedAccountsScreen(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadPreselectedAccountsScreen(final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1579358691);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(1579358691, i3, -1, "com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreen (LoadPreselectedAccountsScreen.kt:25)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-1679627873, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreenKt.LoadPreselectedAccountsScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1679627873, i6, -1, "com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreen.<anonymous> (LoadPreselectedAccountsScreen.kt:30)");
                        }
                        Function2<Composer, Integer, Unit> function2M2100xbd01a59e = LoadPreselectedAccountsScreen.INSTANCE.m2100xbd01a59e();
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2100xbd01a59e, null, ComposableLambda3.rememberComposableLambda(1449006590, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreenKt.LoadPreselectedAccountsScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1449006590, i7, -1, "com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreen.<anonymous>.<anonymous> (LoadPreselectedAccountsScreen.kt:33)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, LoadPreselectedAccountsScreen.INSTANCE.m2099xa08b1c55(), composer2, ((i3 >> 3) & 14) | 805306416, 316);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoadPreselectedAccountsScreen5.LoadPreselectedAccountsScreen$lambda$0(onBackClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-1679627873, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreenKt.LoadPreselectedAccountsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1679627873, i6, -1, "com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreen.<anonymous> (LoadPreselectedAccountsScreen.kt:30)");
                    }
                    Function2<Composer, Integer, Unit> function2M2100xbd01a59e = LoadPreselectedAccountsScreen.INSTANCE.m2100xbd01a59e();
                    final Function0<Unit> function0 = onBackClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2100xbd01a59e, null, ComposableLambda3.rememberComposableLambda(1449006590, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreenKt.LoadPreselectedAccountsScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1449006590, i7, -1, "com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsScreen.<anonymous>.<anonymous> (LoadPreselectedAccountsScreen.kt:33)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, LoadPreselectedAccountsScreen.INSTANCE.m2099xa08b1c55(), composer2, ((i3 >> 3) & 14) | 805306416, 316);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
