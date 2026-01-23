package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholds;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsPortfolioRiskAnalyzerEquityPositionRow.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u000726\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerEquityPositionRow", "", "state", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;", "onOpenStockDetailPage", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onEquityRowCheckedChanged", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "equityPositionId", "", "checked", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "feature-options-portfolio-risk-analyzer_externalDebug", "expanded", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderAlpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerEquityPositionRow3 {

    /* compiled from: OptionsPortfolioRiskAnalyzerEquityPositionRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.values().length];
            try {
                iArr[OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsPortfolioRiskAnalyzerEquityPositionRowViewState2.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$21(OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState, Function0 function0, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerEquityPositionRow(optionsPortfolioRiskAnalyzerEquityPositionRowViewState, function0, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$7(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$9(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$20$lambda$12$lambda$11 */
    public static final Unit m2265x537a7657(SnapshotState snapshotState) {
        OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$3(snapshotState, !OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$20$lambda$19$lambda$16$lambda$14$lambda$13 */
    public static final Unit m2266x5823301a(Function2 function2, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState, boolean z) {
        function2.invoke(optionsPortfolioRiskAnalyzerEquityPositionRowViewState.getEquityInstrumentId(), Boolean.valueOf(!optionsPortfolioRiskAnalyzerEquityPositionRowViewState.getChecked()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerEquityPositionRow(final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState state, final Function0<Unit> onOpenStockDetailPage, Modifier modifier, final Function2<? super UUID, ? super Boolean, Unit> onEquityRowCheckedChanged, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        MutableTransitionState mutableTransitionState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue4;
        boolean zChanged;
        Object objRememberedValue5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean z;
        Object objRememberedValue6;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int currentCompositeKeyHash6;
        Composer composerM6388constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        int i4;
        long jM21456getPositive0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onOpenStockDetailPage, "onOpenStockDetailPage");
        Intrinsics.checkNotNullParameter(onEquityRowCheckedChanged, "onEquityRowCheckedChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(424629080);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenStockDetailPage) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onEquityRowCheckedChanged) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(424629080, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRow (OptionsPortfolioRiskAnalyzerEquityPositionRow.kt:54)");
                }
                Object[] objArr = {state.getEquityInstrumentId()};
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerEquityPositionRow3.OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3;
                Modifier modifier4 = modifier2;
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(mutableTransitionState) | composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new OptionsPortfolioRiskAnalyzerEquityPositionRow4(mutableTransitionState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                boolean z2 = mutableTransitionState.isIdle() || ((Boolean) mutableTransitionState.getCurrentState()).booleanValue();
                Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), "ExpandTransition", composerStartRestartGroup, 48, 0);
                C23521x3ca90a02 c23521x3ca90a02 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C2002Dp>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$OptionsPortfolioRiskAnalyzerEquityPositionRow$$inlined$animateDp$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                        return invoke(segment, composer3, num.intValue());
                    }

                    public final SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i7) {
                        composer3.startReplaceGroup(-575880366);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-575880366, i7, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                        }
                        SpringSpec<C2002Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2002Dp.m7993boximpl(VisibilityThresholds.getVisibilityThreshold(C2002Dp.INSTANCE)), 3, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return springSpecSpring$default;
                    }
                };
                TwoWayConverter<C2002Dp, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(C2002Dp.INSTANCE);
                boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceGroup(1555882550);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1555882550, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerEquityPositionRow.kt:68)");
                }
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(!zBooleanValue ? 1 : 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(fM7995constructorimpl);
                boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceGroup(1555882550);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1555882550, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerEquityPositionRow.kt:68)");
                }
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(!zBooleanValue2 ? 1 : 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2002DpM7993boximpl, C2002Dp.m7993boximpl(fM7995constructorimpl2), c23521x3ca90a02.invoke((C23521x3ca90a02) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "BorderWidth", composerStartRestartGroup, 196608);
                C23522x82751f60 c23522x82751f60 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$OptionsPortfolioRiskAnalyzerEquityPositionRow$$inlined$animateFloat$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                        return invoke(segment, composer3, num.intValue());
                    }

                    public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i7) {
                        composer3.startReplaceGroup(-522164544);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-522164544, i7, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                        }
                        SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return springSpecSpring$default;
                    }
                };
                TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceGroup(1481113020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1481113020, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerEquityPositionRow.kt:69)");
                }
                float f = !zBooleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceGroup(1481113020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1481113020, 0, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRow.<anonymous> (OptionsPortfolioRiskAnalyzerEquityPositionRow.kt:69)");
                }
                float f2 = !zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), c23522x82751f60.invoke((C23522x82751f60) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "BorderAlpha", composerStartRestartGroup, 196608);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i7).m21427getFg30d7_KjU(), OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$9(snapshotState4CreateTransitionAnimation2), 0.0f, 0.0f, 0.0f, 14, null);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16));
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$7(snapshotState4CreateTransitionAnimation), jM6705copywmQWz5c$default, roundedCornerShapeM5327RoundedCornerShape0680j_4);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerEquityPositionRow3.m2265x537a7657(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4891clickableO2vRcR0$default(companion4, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                boolean checked = state.getChecked();
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i6 & 14) != 4) | ((i6 & 7168) != 2048);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerEquityPositionRow3.m2266x5823301a(onEquityRowCheckedChanged, state, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, checked, false, colorM6701boximpl, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 5);
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 805306368, 0, 7678);
                BentoText2.m20747BentoText38GnDrw(state.getSubtitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 805306368, 0, 7674);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getEnd(), composerStartRestartGroup, 48);
                currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor6);
                }
                composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(state.getTotalReturn(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                String totalReturnPercentage = state.getTotalReturnPercentage();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS();
                i4 = WhenMappings.$EnumSwitchMapping$0[state.getPnlColorType().ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(2030493685);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21456getPositive0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 2) {
                    composerStartRestartGroup.startReplaceGroup(2030498255);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2030496245);
                    jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21452getNegative0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(totalReturnPercentage, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup.endNode();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(!OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(snapshotState) ? ServerToBentoAssetMapper2.CARET_UP_16 : ServerToBentoAssetMapper2.CARET_DOWN_16), null, bentoTheme.getColors(composerStartRestartGroup, i7).m21427getFg30d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 10, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                AnimatedVisibilityKt.AnimatedVisibility(column6, !z2, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion2.getCenterHorizontally(), false, null, 13, null)), ExitTransition.INSTANCE.getNone(), (String) null, OptionsPortfolioRiskAnalyzerEquityPositionRow.INSTANCE.m2264x803ac32c(), composerStartRestartGroup, 1575942, 16);
                AnimatedVisibilityKt.AnimatedVisibility(column6, (MutableTransitionState<Boolean>) mutableTransitionState, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, Easing3.getFastOutLinearInEasing(), 2, null), companion2.getTop(), false, null, 12, null), (String) null, ComposableLambda3.rememberComposableLambda(178827187, true, new OptionsPortfolioRiskAnalyzerEquityPositionRow5(state, onOpenStockDetailPage), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942 | (MutableTransitionState.$stable << 3), 16);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerEquityPositionRow3.OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$21(state, onOpenStockDetailPage, modifier3, onEquityRowCheckedChanged, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = {state.getEquityInstrumentId()};
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            int i62 = i3;
            Modifier modifier42 = modifier2;
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            mutableTransitionState = (MutableTransitionState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf2 = Boolean.valueOf(OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(mutableTransitionState) | composerStartRestartGroup.changed(snapshotState);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new OptionsPortfolioRiskAnalyzerEquityPositionRow4(mutableTransitionState, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                if (mutableTransitionState.isIdle()) {
                    Transition transitionUpdateTransition2 = TransitionKt.updateTransition(Boolean.valueOf(z2), "ExpandTransition", composerStartRestartGroup, 48, 0);
                    C23521x3ca90a02 c23521x3ca90a022 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C2002Dp>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$OptionsPortfolioRiskAnalyzerEquityPositionRow$$inlined$animateDp$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final SpringSpec<C2002Dp> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i72) {
                            composer3.startReplaceGroup(-575880366);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-575880366, i72, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
                            }
                            SpringSpec<C2002Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2002Dp.m7993boximpl(VisibilityThresholds.getVisibilityThreshold(C2002Dp.INSTANCE)), 3, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return springSpecSpring$default;
                        }
                    };
                    TwoWayConverter<C2002Dp, AnimationVectors2> vectorConverter3 = VectorConvertersKt.getVectorConverter(C2002Dp.INSTANCE);
                    boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(1555882550);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(!zBooleanValue5 ? 1 : 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(fM7995constructorimpl3);
                    boolean zBooleanValue22 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(1555882550);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(!zBooleanValue22 ? 1 : 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState4 snapshotState4CreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, c2002DpM7993boximpl2, C2002Dp.m7993boximpl(fM7995constructorimpl22), c23521x3ca90a022.invoke((C23521x3ca90a02) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, "BorderWidth", composerStartRestartGroup, 196608);
                    C23522x82751f60 c23522x82751f602 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$OptionsPortfolioRiskAnalyzerEquityPositionRow$$inlined$animateFloat$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, int i72) {
                            composer3.startReplaceGroup(-522164544);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-522164544, i72, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
                            }
                            SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return springSpecSpring$default;
                        }
                    };
                    TwoWayConverter<Float, AnimationVectors2> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    boolean zBooleanValue32 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(1481113020);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!zBooleanValue32) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Float fValueOf2 = Float.valueOf(f);
                    boolean zBooleanValue42 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(1481113020);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!zBooleanValue42) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState4 snapshotState4CreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf2, Float.valueOf(f2), c23522x82751f602.invoke((C23522x82751f60) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter22, "BorderAlpha", composerStartRestartGroup, 196608);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i72).m21427getFg30d7_KjU(), OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$9(snapshotState4CreateTransitionAnimation22), 0.0f, 0.0f, 0.0f, 14, null);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16));
                    Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 0.0f, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_42), OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$7(snapshotState4CreateTransitionAnimation3), jM6705copywmQWz5c$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap7, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier7, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(snapshotState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionsPortfolioRiskAnalyzerEquityPositionRow3.m2265x537a7657(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4891clickableO2vRcR0$default(companion42, interactionSource32, null, false, null, null, (Function0) objRememberedValue5, 28, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy4, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                                Modifier modifierWeight$default3 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                                Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting()) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                    boolean checked2 = state.getChecked();
                                    Color colorM6701boximpl2 = Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU());
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    if ((i62 & 7168) != 2048) {
                                    }
                                    z = ((i62 & 14) != 4) | ((i62 & 7168) != 2048);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (!z) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return OptionsPortfolioRiskAnalyzerEquityPositionRow3.m2266x5823301a(onEquityRowCheckedChanged, state, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, checked2, false, colorM6701boximpl2, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 5);
                                        Modifier modifierWeight$default22 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default22);
                                        Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl4.getInserting()) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                                            BentoText2.m20747BentoText38GnDrw(state.getTitle(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 805306368, 0, 7678);
                                            BentoText2.m20747BentoText38GnDrw(state.getSubtitle(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextS(), composerStartRestartGroup, 805306368, 0, 7674);
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endNode();
                                            MeasurePolicy measurePolicyRowMeasurePolicy32 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                                            Function0<ComposeUiNode> constructor52 = companion32.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy32, companion32.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion32.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash5 = companion32.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl5.getInserting()) {
                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion32.getSetModifier());
                                                MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getEnd(), composerStartRestartGroup, 48);
                                                currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap62 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier62 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                                                Function0<ComposeUiNode> constructor62 = companion32.getConstructor();
                                                if (composerStartRestartGroup.getApplier() == null) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap62, companion32.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash6 = companion32.getSetCompositeKeyHash();
                                                if (!composerM6388constructorimpl6.getInserting()) {
                                                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier62, companion32.getSetModifier());
                                                    BentoText2.m20747BentoText38GnDrw(state.getTotalReturn(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                                    String totalReturnPercentage2 = state.getTotalReturnPercentage();
                                                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextS();
                                                    i4 = WhenMappings.$EnumSwitchMapping$0[state.getPnlColorType().ordinal()];
                                                    if (i4 != 1) {
                                                    }
                                                    BentoText2.m20747BentoText38GnDrw(totalReturnPercentage2, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 0, 0, 8186);
                                                    composerStartRestartGroup.endNode();
                                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(!OptionsPortfolioRiskAnalyzerEquityPositionRow$lambda$2(snapshotState) ? ServerToBentoAssetMapper2.CARET_UP_16 : ServerToBentoAssetMapper2.CARET_DOWN_16), null, bentoTheme2.getColors(composerStartRestartGroup, i72).m21427getFg30d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 0.0f, 10, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.endNode();
                                                    AnimatedVisibilityKt.AnimatedVisibility(column62, !z2, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion22.getCenterHorizontally(), false, null, 13, null)), ExitTransition.INSTANCE.getNone(), (String) null, OptionsPortfolioRiskAnalyzerEquityPositionRow.INSTANCE.m2264x803ac32c(), composerStartRestartGroup, 1575942, 16);
                                                    AnimatedVisibilityKt.AnimatedVisibility(column62, (MutableTransitionState<Boolean>) mutableTransitionState, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 7, null), EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 0, Easing3.getFastOutLinearInEasing(), 2, null), companion22.getTop(), false, null, 12, null), (String) null, ComposableLambda3.rememberComposableLambda(178827187, true, new OptionsPortfolioRiskAnalyzerEquityPositionRow5(state, onOpenStockDetailPage), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942 | (MutableTransitionState.$stable << 3), 16);
                                                    composer2 = composerStartRestartGroup;
                                                    composer2.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    modifier3 = modifier42;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
