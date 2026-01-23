package com.robinhood.android.event.gamedetail.p130ui.toolbar;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.futures.sharedfuturesui.PipButton;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailAppBar.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"GameDetailAppBar", "", "titleState", "Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "showSettings", "", "isScrolled", "showDivider", "onBack", "Lkotlin/Function0;", "onPipModeClicked", "onSettingsClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/builders/TitleState;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailAppBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailAppBar$lambda$0(TitleState titleState, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailAppBar(titleState, z, z2, z3, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailAppBar(final TitleState titleState, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onBack, final Function0<Unit> onPipModeClicked, final Function0<Unit> onSettingsClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onPipModeClicked, "onPipModeClicked");
        Intrinsics.checkNotNullParameter(onSettingsClicked, "onSettingsClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1452143276);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(titleState) : composerStartRestartGroup.changedInstance(titleState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z4 = z3;
                i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBack) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPipModeClicked) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSettingsClicked) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1452143276, i3, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar (GameDetailAppBar.kt:26)");
                    }
                    composer2 = composerStartRestartGroup;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(518743199, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt.GameDetailAppBar.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(518743199, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar.<anonymous> (GameDetailAppBar.kt:29)");
                            }
                            StringResource title = titleState.getTitle();
                            composer3.startReplaceGroup(296009456);
                            String textAsString = title == null ? null : StringResources6.getTextAsString(title, composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                            String str = textAsString == null ? "" : textAsString;
                            String subtitle = titleState.getSubtitle();
                            GameDetailToolbarTitle.GameDetailToolbarTitle(str, subtitle == null ? "" : subtitle, z2, null, composer3, 0, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(540068043, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt.GameDetailAppBar.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 6) == 0) {
                                i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(540068043, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar.<anonymous> (GameDetailAppBar.kt:39)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBack, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-364164406, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt.GameDetailAppBar.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                            invoke(row5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-364164406, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar.<anonymous> (GameDetailAppBar.kt:42)");
                            }
                            PipButton.PipButton(UserInteractionEventData.Action.VIEW_PICTURE_IN_PICTURE, onPipModeClicked, null, composer3, 6, 4);
                            if (z) {
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24), "Settings", bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), onSettingsClicked, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, false, z4, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, ((i3 >> 18) & 112) | 12586374 | ((i3 << 9) & 3670016), 0, 1840);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GameDetailAppBar.GameDetailAppBar$lambda$0(titleState, z, z2, z3, onBack, onPipModeClicked, onSettingsClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            if ((4793491 & i3) != 4793490) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(518743199, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt.GameDetailAppBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(518743199, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar.<anonymous> (GameDetailAppBar.kt:29)");
                        }
                        StringResource title = titleState.getTitle();
                        composer3.startReplaceGroup(296009456);
                        String textAsString = title == null ? null : StringResources6.getTextAsString(title, composer3, StringResource.$stable);
                        composer3.endReplaceGroup();
                        String str = textAsString == null ? "" : textAsString;
                        String subtitle = titleState.getSubtitle();
                        GameDetailToolbarTitle.GameDetailToolbarTitle(str, subtitle == null ? "" : subtitle, z2, null, composer3, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(540068043, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt.GameDetailAppBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(540068043, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar.<anonymous> (GameDetailAppBar.kt:39)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBack, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-364164406, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBarKt.GameDetailAppBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-364164406, i5, -1, "com.robinhood.android.event.gamedetail.ui.toolbar.GameDetailAppBar.<anonymous> (GameDetailAppBar.kt:42)");
                        }
                        PipButton.PipButton(UserInteractionEventData.Action.VIEW_PICTURE_IN_PICTURE, onPipModeClicked, null, composer3, 6, 4);
                        if (z) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24), "Settings", bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), onSettingsClicked, false, composer3, BentoIcon4.Size24.$stable | 48, 32);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, z4, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, ((i3 >> 18) & 112) | 12586374 | ((i3 << 9) & 3670016), 0, 1840);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z3;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
