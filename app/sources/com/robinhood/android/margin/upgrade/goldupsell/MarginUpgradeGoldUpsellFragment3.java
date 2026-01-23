package com.robinhood.android.margin.upgrade.goldupsell;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragment3;
import com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TopAlignedListPage;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeGoldUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"MarginUpgradeGoldUpsellScreen", "", "state", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onError", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PreviewMarginUpgradeGoldUpsellScreen", "(Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;Landroidx/compose/runtime/Composer;I)V", "feature-margin-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeGoldUpsellFragment3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeGoldUpsellScreen$lambda$0(MarginUpgradeGoldUpsellState3 marginUpgradeGoldUpsellState3, SduiActionHandler sduiActionHandler, Function1 function1, int i, Composer composer, int i2) {
        MarginUpgradeGoldUpsellScreen(marginUpgradeGoldUpsellState3, sduiActionHandler, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarginUpgradeGoldUpsellScreen$lambda$1(MarginUpgradeGoldUpsellState3 marginUpgradeGoldUpsellState3, int i, Composer composer, int i2) {
        PreviewMarginUpgradeGoldUpsellScreen(marginUpgradeGoldUpsellState3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginUpgradeGoldUpsellScreen(final MarginUpgradeGoldUpsellState3 marginUpgradeGoldUpsellState3, SduiActionHandler<? super GenericAction> sduiActionHandler, final Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        Arrangement.Vertical top;
        ImmutableList3 immutableList3PersistentListOf;
        final SduiActionHandler<? super GenericAction> sduiActionHandler2 = sduiActionHandler;
        Composer composerStartRestartGroup = composer.startRestartGroup(-442842911);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(marginUpgradeGoldUpsellState3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-442842911, i2, -1, "com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellScreen (MarginUpgradeGoldUpsellFragment.kt:93)");
            }
            if (marginUpgradeGoldUpsellState3 instanceof MarginUpgradeGoldUpsellState3.Loading) {
                composerStartRestartGroup.startReplaceGroup(-370266723);
                LoadingScreenComposablesKt.PromoLoadingScreenComposable(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), 0, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (marginUpgradeGoldUpsellState3 instanceof MarginUpgradeGoldUpsellState3.Error) {
                composerStartRestartGroup.startReplaceGroup(-370262119);
                composerStartRestartGroup.endReplaceGroup();
                function1.invoke(((MarginUpgradeGoldUpsellState3.Error) marginUpgradeGoldUpsellState3).getThrowable());
            } else {
                if (!(marginUpgradeGoldUpsellState3 instanceof MarginUpgradeGoldUpsellState3.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(-370268531);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1406860738);
                Modifier.Companion companion = Modifier.INSTANCE;
                final Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
                final StandardPageTemplate<GenericAction> standardPageTemplate = ((MarginUpgradeGoldUpsellState3.Loaded) marginUpgradeGoldUpsellState3).getStandardPageTemplate();
                composerStartRestartGroup.startReplaceGroup(-962331744);
                PageThemeOverride theme_override = standardPageTemplate.getTheme_override();
                if (theme_override != null) {
                    composerStartRestartGroup.startReplaceGroup(82012030);
                    BentoTheme2.BentoTheme(Boolean.valueOf(theme_override == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$MarginUpgradeGoldUpsellScreen$$inlined$SduiStandardPage$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: SduiStandardPage.kt */
                        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$MarginUpgradeGoldUpsellScreen$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ long $backgroundedColor;
                            final /* synthetic */ SystemUiController $systemUiController;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                                super(2, continuation);
                                this.$systemUiController = systemUiController;
                                this.$backgroundedColor = j;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                                return Unit.INSTANCE;
                            }
                        }

                        public final void invoke(Composer composer2, int i3) {
                            Arrangement.Vertical top2;
                            ImmutableList3 immutableList3PersistentListOf2;
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(873647597, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                            }
                            StandardPageTemplate standardPageTemplate2 = standardPageTemplate;
                            SduiActionHandler sduiActionHandler3 = sduiActionHandler2;
                            Modifier modifier = modifierSystemBarsPadding;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null);
                            composer2.startReplaceGroup(-430325605);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top3 = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top3, companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            if (standardPageTemplate2 instanceof CenterAlignedListPage) {
                                top2 = arrangement.getCenter();
                            } else {
                                if (!(standardPageTemplate2 instanceof TopAlignedListPage)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                top2 = arrangement.getTop();
                            }
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion2.getCenterHorizontally(), composer2, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate2.getBody());
                            composer2.startReplaceGroup(-1772220517);
                            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, companion4, null, sduiActionHandler3, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            List footer = standardPageTemplate2.getFooter();
                            if (footer == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer)) == null) {
                                immutableList3PersistentListOf2 = extensions2.persistentListOf();
                            }
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null);
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableList3PersistentListOf2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler3, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100666368, 0);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endReplaceGroup();
                            SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                            Unit unit = Unit.INSTANCE;
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChanged = composer2.changed(systemUiControllerRememberSystemUiController) | composer2.changed(jM21371getBg0d7_KjU);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(82611105);
                    int i3 = i2 & 112;
                    composerStartRestartGroup.startReplaceGroup(-430325605);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierSystemBarsPadding, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    if (standardPageTemplate instanceof CenterAlignedListPage) {
                        top = arrangement.getCenter();
                    } else {
                        if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        top = arrangement.getTop();
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                    int i4 = (i3 << 6) & 7168;
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, companion, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composerStartRestartGroup, 100663296 | (((12582912 | i4) << 3) & 57344), 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Iterable footer = standardPageTemplate.getFooter();
                    if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                        immutableList3PersistentListOf = extensions2.persistentListOf();
                    }
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    sduiActionHandler2 = sduiActionHandler;
                    SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composerStartRestartGroup, (((i4 | 12583296) << 3) & 57344) | 100666368, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeGoldUpsellFragment3.MarginUpgradeGoldUpsellScreen$lambda$0(marginUpgradeGoldUpsellState3, sduiActionHandler2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewMarginUpgradeGoldUpsellScreen(final MarginUpgradeGoldUpsellState3 marginUpgradeGoldUpsellState3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(634865642);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(marginUpgradeGoldUpsellState3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634865642, i2, -1, "com.robinhood.android.margin.upgrade.goldupsell.PreviewMarginUpgradeGoldUpsellScreen (MarginUpgradeGoldUpsellFragment.kt:113)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(-1069978838, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt.PreviewMarginUpgradeGoldUpsellScreen.1

                /* compiled from: MarginUpgradeGoldUpsellFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$PreviewMarginUpgradeGoldUpsellScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ MarginUpgradeGoldUpsellState3 $state;

                    AnonymousClass1(MarginUpgradeGoldUpsellState3 marginUpgradeGoldUpsellState3) {
                        this.$state = marginUpgradeGoldUpsellState3;
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
                            ComposerKt.traceEventStart(-804504462, i, -1, "com.robinhood.android.margin.upgrade.goldupsell.PreviewMarginUpgradeGoldUpsellScreen.<anonymous>.<anonymous> (MarginUpgradeGoldUpsellFragment.kt:116)");
                        }
                        MarginUpgradeGoldUpsellState3 marginUpgradeGoldUpsellState3 = this.$state;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$PreviewMarginUpgradeGoldUpsellScreen$1$1$1$1
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                public final boolean mo15941handle(GenericAction it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return true;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$PreviewMarginUpgradeGoldUpsellScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MarginUpgradeGoldUpsellFragment3.C211721.AnonymousClass1.invoke$lambda$2$lambda$1((Throwable) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        MarginUpgradeGoldUpsellFragment3.MarginUpgradeGoldUpsellScreen(marginUpgradeGoldUpsellState3, sduiActionHandler, (Function1) objRememberedValue2, composer, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1069978838, i3, -1, "com.robinhood.android.margin.upgrade.goldupsell.PreviewMarginUpgradeGoldUpsellScreen.<anonymous> (MarginUpgradeGoldUpsellFragment.kt:115)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-804504462, true, new AnonymousClass1(marginUpgradeGoldUpsellState3), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeGoldUpsellFragment3.PreviewMarginUpgradeGoldUpsellScreen$lambda$1(marginUpgradeGoldUpsellState3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
