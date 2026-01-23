package com.robinhood.android.investmentstracker.composables;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerToolbar.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"InvestmentsTrackerToolbar", "", "hamburgerClick", "Lkotlin/Function0;", "notificationClick", "backClick", "modifier", "Landroidx/compose/ui/Modifier;", "navigationTitle", "", "useHomeHeaderMode", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerToolbar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerToolbar$lambda$0(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, String str, boolean z, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerToolbar(function0, function02, function03, modifier, str, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerToolbar(final Function0<Unit> hamburgerClick, final Function0<Unit> notificationClick, final Function0<Unit> backClick, Modifier modifier, String str, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        boolean z2;
        Composer composer2;
        final String str3;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(hamburgerClick, "hamburgerClick");
        Intrinsics.checkNotNullParameter(notificationClick, "notificationClick");
        Intrinsics.checkNotNullParameter(backClick, "backClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1122488528);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(hamburgerClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(notificationClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(backClick) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        final String str4 = i4 == 0 ? null : str2;
                        final boolean z4 = i5 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1122488528, i3, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar (InvestmentsTrackerToolbar.kt:20)");
                        }
                        Modifier modifier4 = modifier2;
                        boolean z5 = z4;
                        composer2 = composerStartRestartGroup;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(6880157, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt.InvestmentsTrackerToolbar.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(6880157, i7, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar.<anonymous> (InvestmentsTrackerToolbar.kt:38)");
                                }
                                String str5 = str4;
                                if (str5 != null) {
                                    BentoText2.m20747BentoText38GnDrw(str5, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(667950321, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt.InvestmentsTrackerToolbar.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(667950321, i7, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar.<anonymous> (InvestmentsTrackerToolbar.kt:24)");
                                }
                                Tuples2 tuples2M3642to = z4 ? Tuples4.m3642to(ServerToBentoAssetMapper2.HAMBURGER_24, hamburgerClick) : Tuples4.m3642to(ServerToBentoAssetMapper2.CARET_LEFT_24, backClick);
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = (ServerToBentoAssetMapper2) tuples2M3642to.component1();
                                Function0 function0 = (Function0) tuples2M3642to.component2();
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), "", bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function0, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1593451822, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt.InvestmentsTrackerToolbar.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1593451822, i7, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar.<anonymous> (InvestmentsTrackerToolbar.kt:46)");
                                }
                                if (z4) {
                                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.NOTIFICATION_24);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    BentoIcon2.m20644BentoIconFU0evQE(size24, "", bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 10, null), notificationClick, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i3 >> 6) & 112) | 3462, 0, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str3 = str4;
                        modifier3 = modifier4;
                        z3 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        str3 = str2;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InvestmentsTrackerToolbar.InvestmentsTrackerToolbar$lambda$0(hamburgerClick, notificationClick, backClick, modifier3, str3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) == 74898) {
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier42 = modifier2;
                    boolean z52 = z4;
                    composer2 = composerStartRestartGroup;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(6880157, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt.InvestmentsTrackerToolbar.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(6880157, i7, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar.<anonymous> (InvestmentsTrackerToolbar.kt:38)");
                            }
                            String str5 = str4;
                            if (str5 != null) {
                                BentoText2.m20747BentoText38GnDrw(str5, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), modifier42, ComposableLambda3.rememberComposableLambda(667950321, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt.InvestmentsTrackerToolbar.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(667950321, i7, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar.<anonymous> (InvestmentsTrackerToolbar.kt:24)");
                            }
                            Tuples2 tuples2M3642to = z4 ? Tuples4.m3642to(ServerToBentoAssetMapper2.HAMBURGER_24, hamburgerClick) : Tuples4.m3642to(ServerToBentoAssetMapper2.CARET_LEFT_24, backClick);
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = (ServerToBentoAssetMapper2) tuples2M3642to.component1();
                            Function0 function0 = (Function0) tuples2M3642to.component2();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), "", bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function0, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1593451822, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbarKt.InvestmentsTrackerToolbar.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                            invoke(row5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1593451822, i7, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar.<anonymous> (InvestmentsTrackerToolbar.kt:46)");
                            }
                            if (z4) {
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.NOTIFICATION_24);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoIcon2.m20644BentoIconFU0evQE(size24, "", bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 10, null), notificationClick, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i3 >> 6) & 112) | 3462, 0, 2032);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    z3 = z52;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
