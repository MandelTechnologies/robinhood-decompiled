package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericLadderTopBar.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lkotlin/Function0;", "", "navigationContent", "titleContent", "actionsContent", "Landroidx/compose/ui/Modifier;", "modifier", "detailContent", "GenericLadderTopBar", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PreviewGenericLadderTopBar", "(Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class GenericLadderTopBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLadderTopBar$lambda$0(Function2 function2, Function2 function22, Function2 function23, Modifier modifier, Function2 function24, int i, int i2, Composer composer, int i3) {
        GenericLadderTopBar(function2, function22, function23, modifier, function24, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericLadderTopBar$lambda$1(int i, Composer composer, int i2) {
        PreviewGenericLadderTopBar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericLadderTopBar(final Function2<? super Composer, ? super Integer, Unit> navigationContent, final Function2<? super Composer, ? super Integer, Unit> titleContent, final Function2<? super Composer, ? super Integer, Unit> actionsContent, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navigationContent, "navigationContent");
        Intrinsics.checkNotNullParameter(titleContent, "titleContent");
        Intrinsics.checkNotNullParameter(actionsContent, "actionsContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1518891005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navigationContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(titleContent) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionsContent) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function24 = i4 == 0 ? null : function22;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1518891005, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar (GenericLadderTopBar.kt:46)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    Function2<? super Composer, ? super Integer, Unit> function25 = function24;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m5967SurfaceT9BRK9s(ZIndexModifier2.zIndex(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 1.0f), null, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0.0f, C2002Dp.m7995constructorimpl(2), null, ComposableLambda3.rememberComposableLambda(-1218296190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt.GenericLadderTopBar.1
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
                                ComposerKt.traceEventStart(-1218296190, i7, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous> (GenericLadderTopBar.kt:55)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function26 = function24;
                            final Function2<Composer, Integer, Unit> function27 = titleContent;
                            final Function2<Composer, Integer, Unit> function28 = navigationContent;
                            final Function2<Composer, Integer, Unit> function29 = actionsContent;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(454217765, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$GenericLadderTopBar$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(454217765, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous>.<anonymous>.<anonymous> (GenericLadderTopBar.kt:62)");
                                    }
                                    function27.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 2, null), ComposableLambda3.rememberComposableLambda(-276010887, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$GenericLadderTopBar$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-276010887, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous>.<anonymous>.<anonymous> (GenericLadderTopBar.kt:59)");
                                    }
                                    function28.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), ComposableLambda3.rememberComposableLambda(9614618, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$GenericLadderTopBar$1$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                    invoke(row5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(9614618, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous>.<anonymous>.<anonymous> (GenericLadderTopBar.kt:66)");
                                    }
                                    function29.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12586374, 0, 1904);
                            composer3.startReplaceGroup(92004224);
                            if (function26 != null) {
                                function26.invoke(composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composer3, i8).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 12779520, 82);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function23 = function25;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function23 = function22;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GenericLadderTopBarKt.GenericLadderTopBar$lambda$0(navigationContent, titleContent, actionsContent, modifier3, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function22 = function2;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                Function2<? super Composer, ? super Integer, Unit> function252 = function24;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(ZIndexModifier2.zIndex(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 1.0f), null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0.0f, C2002Dp.m7995constructorimpl(2), null, ComposableLambda3.rememberComposableLambda(-1218296190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt.GenericLadderTopBar.1
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
                            ComposerKt.traceEventStart(-1218296190, i7, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous> (GenericLadderTopBar.kt:55)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function26 = function24;
                        final Function2<? super Composer, ? super Integer, Unit> function27 = titleContent;
                        final Function2<? super Composer, ? super Integer, Unit> function28 = navigationContent;
                        final Function2<? super Composer, ? super Integer, Unit> function29 = actionsContent;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(454217765, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$GenericLadderTopBar$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i9) {
                                if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(454217765, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous>.<anonymous>.<anonymous> (GenericLadderTopBar.kt:62)");
                                }
                                function27.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme22.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 2, null), ComposableLambda3.rememberComposableLambda(-276010887, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$GenericLadderTopBar$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-276010887, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous>.<anonymous>.<anonymous> (GenericLadderTopBar.kt:59)");
                                }
                                function28.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), ComposableLambda3.rememberComposableLambda(9614618, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$GenericLadderTopBar$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                invoke(row5, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(9614618, i9, -1, "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBar.<anonymous>.<anonymous>.<anonymous> (GenericLadderTopBar.kt:66)");
                                }
                                function29.invoke(composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12586374, 0, 1904);
                        composer3.startReplaceGroup(92004224);
                        if (function26 != null) {
                            function26.invoke(composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme22.getColors(composer3, i8).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 12779520, 82);
                if (ComposerKt.isTraceInProgress()) {
                }
                function23 = function252;
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function22 = function2;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void PreviewGenericLadderTopBar(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(130502832);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(130502832, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.PreviewGenericLadderTopBar (GenericLadderTopBar.kt:79)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$GenericLadderTopBarKt.INSTANCE.getLambda$962381297$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.GenericLadderTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericLadderTopBarKt.PreviewGenericLadderTopBar$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
