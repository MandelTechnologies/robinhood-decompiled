package com.robinhood.android.tradingtrends.p264ui.details.table;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.generic.table.layout.GenericTableLayoutKt;
import com.robinhood.android.generic.table.layout.GenericTableLayoutScope;
import com.robinhood.android.tradingtrends.p264ui.details.table.TradingTrendsTableViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingTrendsTableComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $topContent;
    final /* synthetic */ TradingTrendsTableViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1(TradingTrendsTableViewState tradingTrendsTableViewState, Function2<? super Composer, ? super Integer, Unit> function2) {
        this.$viewState = tradingTrendsTableViewState;
        this.$topContent = function2;
    }

    private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(final TradingTrendsTableViewState tradingTrendsTableViewState, Integer num, final Function2 function2, final CoroutineScope coroutineScope, final SnapshotState snapshotState, GenericTableLayoutScope GenericTableLayout) {
        Intrinsics.checkNotNullParameter(GenericTableLayout, "$this$GenericTableLayout");
        GenericTableLayoutScope.DefaultImpls.item$default(GenericTableLayout, null, ComposableLambda3.composableLambdaInstance(-2104318779, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num2) {
                invoke(composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2104318779, i, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:97)");
                }
                function2.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        GenericTableLayoutScope.DefaultImpls.m14999tableY3c_0f4$default(GenericTableLayout, "trading-trends", ((TradingTrendsTableViewState.TradingTrendsTableState.Loaded) tradingTrendsTableViewState.getTable()).getGenericTableData(), new StickyColumn.StickAtStartAfterOnScreen(0, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(80)), true, null), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(40)), false, num, null, null, ComposableLambda3.composableLambdaInstance(-1223244712, true, new Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$2
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(GenericCell genericCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num2) {
                m19529invokeC8IHX40(genericCell, c2002Dp, c2002Dp2, displayDetails, composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-C8IHX40, reason: not valid java name */
            public final void m19529invokeC8IHX40(GenericCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1223244712, i, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:111)");
                }
                TradingTrendsGenericCell2.m19524DisplayTradingTrendsCellHdNWosM((TradingTrendsGenericCell) cell, displayDetails, c2002Dp2, c2002Dp, coroutineScope, composer, (DisplayDetails.$stable << 3) | ((i >> 6) & 112) | (i & 896) | ((i << 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, null);
        if (invoke$lambda$1(snapshotState) && ((TradingTrendsTableViewState.TradingTrendsTableState.Loaded) tradingTrendsTableViewState.getTable()).getGenericTableData().getRows().size() > 20) {
            GenericTableLayout.item("show-all", ComposableLambda3.composableLambdaInstance(-15509430, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3

                /* compiled from: TradingTrendsTableComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<Boolean> $displayShowAll$delegate;

                    AnonymousClass1(SnapshotState<Boolean> snapshotState) {
                        this.$displayShowAll$delegate = snapshotState;
                    }

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
                            ComposerKt.traceEventStart(2038412191, i, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:123)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 4, null);
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_show_all, composer, 0);
                        composer.startReplaceGroup(5004770);
                        final SnapshotState<Boolean> snapshotState = this.$displayShowAll$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0065: CONSTRUCTOR (r3v3 'objRememberedValue' java.lang.Object) = (r0v5 'snapshotState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.MutableState):void (m)] (LINE:134) call: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r7 = r16
                                r0 = r17
                                r1 = r0 & 3
                                r2 = 2
                                if (r1 != r2) goto L14
                                boolean r1 = r7.getSkipping()
                                if (r1 != 0) goto L10
                                goto L14
                            L10:
                                r7.skipToGroupEnd()
                                return
                            L14:
                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r1 == 0) goto L23
                                r1 = -1
                                java.lang.String r2 = "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:123)"
                                r3 = 2038412191(0x797fb39f, float:8.297993E34)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r3, r0, r1, r2)
                            L23:
                                androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p011ui.Modifier.INSTANCE
                                com.robinhood.compose.bento.theme.BentoTheme r0 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                int r1 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                com.robinhood.compose.bento.theme.BentoSpacing r2 = r0.getSpacing(r7, r1)
                                float r10 = r2.m21590getDefaultD9Ej5fM()
                                com.robinhood.compose.bento.theme.BentoSpacing r2 = r0.getSpacing(r7, r1)
                                float r12 = r2.m21590getDefaultD9Ej5fM()
                                com.robinhood.compose.bento.theme.BentoSpacing r0 = r0.getSpacing(r7, r1)
                                float r9 = r0.m21592getMediumD9Ej5fM()
                                r13 = 4
                                r14 = 0
                                r11 = 0
                                androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r8, r9, r10, r11, r12, r13, r14)
                                int r0 = com.robinhood.android.common.C11048R.string.general_label_show_all
                                r1 = 0
                                java.lang.String r1 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r0, r7, r1)
                                r0 = 5004770(0x4c5de2, float:7.013177E-39)
                                r7.startReplaceGroup(r0)
                                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r15.$displayShowAll$delegate
                                java.lang.Object r3 = r7.rememberedValue()
                                androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r4 = r4.getEmpty()
                                if (r3 != r4) goto L6b
                                com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$3$1$$ExternalSyntheticLambda0
                                r3.<init>(r0)
                                r7.updateRememberedValue(r3)
                            L6b:
                                r0 = r3
                                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                                r7.endReplaceGroup()
                                r8 = 6
                                r9 = 120(0x78, float:1.68E-43)
                                r3 = 0
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                com.robinhood.compose.bento.component.BentoTextButton2.m20715BentoTextButtonPIknLig(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L84
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L84:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.tradingtrends.p264ui.details.table.C30009xee94eb40.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1.invoke$lambda$2(snapshotState, false);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num2) {
                        invoke(composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-15509430, i, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:122)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2038412191, true, new AnonymousClass1(snapshotState), composer, 54), composer, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            GenericTableLayoutScope.DefaultImpls.item$default(GenericTableLayout, null, ComposableLambda3.composableLambdaInstance(776891374, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$1$1$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num2) {
                    invoke(composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(776891374, i, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:142)");
                    }
                    TradingTrendsTableComposableKt.TableDisclosure((TradingTrendsTableViewState.TradingTrendsTableState.Loaded) tradingTrendsTableViewState.getTable(), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 1, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201344777, i, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposable.<anonymous>.<anonymous> (TradingTrendsTableComposable.kt:85)");
            }
            if (!(this.$viewState.getTable() instanceof TradingTrendsTableViewState.TradingTrendsTableState.Loaded) || ((TradingTrendsTableViewState.TradingTrendsTableState.Loaded) this.$viewState.getTable()).getGenericTableData() == null) {
                composer.startReplaceGroup(703021884);
                TradingTrendsTableComposableKt.LoadingScreen(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(700476474);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composer.endReplaceGroup();
                final Integer num = invoke$lambda$1(snapshotState) ? 20 : null;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(this.$topContent) | composer.changedInstance(this.$viewState) | composer.changed(num) | composer.changedInstance(coroutineScope);
                final TradingTrendsTableViewState tradingTrendsTableViewState = this.$viewState;
                final Function2<Composer, Integer, Unit> function2 = this.$topContent;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    Object obj = new Function1() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return TradingTrendsTableComposableKt$TradingTrendsTableComposable$3$1.invoke$lambda$4$lambda$3(tradingTrendsTableViewState, num, function2, coroutineScope, snapshotState, (GenericTableLayoutScope) obj2);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    objRememberedValue3 = obj;
                }
                composer.endReplaceGroup();
                GenericTableLayoutKt.GenericTableLayout(modifierFillMaxSize$default, null, null, (Function1) objRememberedValue3, composer, 6, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
