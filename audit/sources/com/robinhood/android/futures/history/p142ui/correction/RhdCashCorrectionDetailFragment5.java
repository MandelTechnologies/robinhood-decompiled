package com.robinhood.android.futures.history.p142ui.correction;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.futures.history.extensions.StringResources3;
import com.robinhood.android.futures.history.p142ui.correction.RhdCashCorrectionDetailDuxo4;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: RhdCashCorrectionDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"CashCorrectionDetail", "", "state", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "onBackClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewCashCorrectionDetail", "(Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState$Loaded;", "(Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState$Loaded;Landroidx/compose/runtime/Composer;I)V", "feature-futures-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhdCashCorrectionDetailFragment5 {

    /* compiled from: RhdCashCorrectionDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesContractType.values().length];
            try {
                iArr[FuturesContractType.OUTRIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesContractType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesContractType.EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashCorrectionDetail$lambda$0(RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo4, Function0 function0, int i, Composer composer, int i2) {
        CashCorrectionDetail(rhdCashCorrectionDetailDuxo4, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashCorrectionDetail$lambda$5(RhdCashCorrectionDetailDuxo4.Loaded loaded, int i, Composer composer, int i2) {
        CashCorrectionDetail(loaded, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCashCorrectionDetail$lambda$2(RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo4, int i, Composer composer, int i2) {
        PreviewCashCorrectionDetail(rhdCashCorrectionDetailDuxo4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CashCorrectionDetail(final RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo4, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-389269039);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(rhdCashCorrectionDetailDuxo4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-389269039, i2, -1, "com.robinhood.android.futures.history.ui.correction.CashCorrectionDetail (RhdCashCorrectionDetailFragment.kt:86)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1826893722, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt.CashCorrectionDetail.1
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
                        ComposerKt.traceEventStart(-1826893722, i3, -1, "com.robinhood.android.futures.history.ui.correction.CashCorrectionDetail.<anonymous> (RhdCashCorrectionDetailFragment.kt:88)");
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo42 = rhdCashCorrectionDetailDuxo4;
                    final Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    RhdCashCorrectionDetailFragment2 rhdCashCorrectionDetailFragment2 = RhdCashCorrectionDetailFragment2.INSTANCE;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(rhdCashCorrectionDetailFragment2.m14657getLambda$400845533$feature_futures_history_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1049174193, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$CashCorrectionDetail$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1049174193, i4, -1, "com.robinhood.android.futures.history.ui.correction.CashCorrectionDetail.<anonymous>.<anonymous>.<anonymous> (RhdCashCorrectionDetailFragment.kt:96)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (rhdCashCorrectionDetailDuxo42 instanceof RhdCashCorrectionDetailDuxo4.Loading) {
                        composer2.startReplaceGroup(-220048085);
                        LocalShowPlaceholder.Loadable(true, null, null, rhdCashCorrectionDetailFragment2.getLambda$1726071208$feature_futures_history_externalDebug(), composer2, 3078, 6);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(rhdCashCorrectionDetailDuxo42 instanceof RhdCashCorrectionDetailDuxo4.Loaded)) {
                            composer2.startReplaceGroup(-220050218);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-220017589);
                        RhdCashCorrectionDetailFragment5.CashCorrectionDetail((RhdCashCorrectionDetailDuxo4.Loaded) rhdCashCorrectionDetailDuxo42, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhdCashCorrectionDetailFragment5.CashCorrectionDetail$lambda$0(rhdCashCorrectionDetailDuxo4, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewCashCorrectionDetail(final RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(764757353);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(rhdCashCorrectionDetailDuxo4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(764757353, i2, -1, "com.robinhood.android.futures.history.ui.correction.PreviewCashCorrectionDetail (RhdCashCorrectionDetailFragment.kt:130)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RhdCashCorrectionDetailFragment7(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            TemporalFormatter.Companion.init$default(companion, null, (Function1) ((KFunction) objRememberedValue), 1, null);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-529496287, true, new C172552(rhdCashCorrectionDetailDuxo4), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhdCashCorrectionDetailFragment5.PreviewCashCorrectionDetail$lambda$2(rhdCashCorrectionDetailDuxo4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RhdCashCorrectionDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$PreviewCashCorrectionDetail$2 */
    static final class C172552 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RhdCashCorrectionDetailDuxo4 $state;

        C172552(RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo4) {
            this.$state = rhdCashCorrectionDetailDuxo4;
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
                ComposerKt.traceEventStart(-529496287, i, -1, "com.robinhood.android.futures.history.ui.correction.PreviewCashCorrectionDetail.<anonymous> (RhdCashCorrectionDetailFragment.kt:134)");
            }
            RhdCashCorrectionDetailDuxo4 rhdCashCorrectionDetailDuxo4 = this.$state;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$PreviewCashCorrectionDetail$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RhdCashCorrectionDetailFragment5.CashCorrectionDetail(rhdCashCorrectionDetailDuxo4, (Function0) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CashCorrectionDetail(final RhdCashCorrectionDetailDuxo4.Loaded loaded, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1112370117);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112370117, i2, -1, "com.robinhood.android.futures.history.ui.correction.CashCorrectionDetail (RhdCashCorrectionDetailFragment.kt:164)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
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
            String amountDisplayString = loaded.getAmountDisplayString();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(amountDisplayString, PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            int i5 = WhenMappings.$EnumSwitchMapping$0[loaded.getCashCorrection().getContractType().ordinal()];
            if (i5 != 1) {
                i3 = 2;
                if (i5 == 2) {
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(1686966132);
                    composerStartRestartGroup.endReplaceGroup();
                    strStringResource = "-";
                } else {
                    if (i5 != 3) {
                        composerStartRestartGroup.startReplaceGroup(-222682512);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-222671893);
                    z = false;
                    strStringResource = StringResources_androidKt.stringResource(C17229R.string.events_cash_correction_detail_title, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                i3 = 2;
                z = false;
                composerStartRestartGroup.startReplaceGroup(-222679924);
                strStringResource = StringResources_androidKt.stringResource(C17229R.string.futures_cash_correction_detail_title, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean z2 = z;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, i3, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8188);
            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_cash_correction_detail_pay_date_label, composerStartRestartGroup, z2 ? 1 : 0), null, 2, null), null, null, null, new AnnotatedString(loaded.getPayDateDisplayString(), null, 2, null), null, null, null, null, false, false, 4061, null);
            int i6 = BentoDataRowState.$stable;
            BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i6, 6);
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17229R.string.futures_cash_correction_detail_reason_label, composerStartRestartGroup, z2 ? 1 : 0), null, 2, null), null, null, null, new AnnotatedString(StringResources3.getText(loaded.getReasonDisplayString(), composerStartRestartGroup, StringResource.$stable), null, 2, null), null, null, null, null, false, false, 4061, null), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 7, null), null, composerStartRestartGroup, i6, 4);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), z2);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, z2 ? 1 : 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoMarkdownText2.BentoMarkdownText(StringResources_androidKt.stringResource(C17229R.string.futures_history_disclaimer_markdown, composerStartRestartGroup, z2 ? 1 : 0), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.history.ui.correction.RhdCashCorrectionDetailFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhdCashCorrectionDetailFragment5.CashCorrectionDetail$lambda$5(loaded, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
