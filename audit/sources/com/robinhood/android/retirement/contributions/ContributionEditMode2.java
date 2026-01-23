package com.robinhood.android.retirement.contributions;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.responsive.Density4;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: ContributionEditMode.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a9\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0012H\u0003¢\u0006\u0002\u0010\u0013\"\u0014\u0010\u0000\u001a\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0014"}, m3636d2 = {"EditModeCtaVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getEditModeCtaVerticalPadding", "(Landroidx/compose/runtime/Composer;I)F", "ContributionEditMode", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "callbacks", "Lcom/robinhood/android/retirement/contributions/ContributionEditCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;Lcom/robinhood/android/retirement/contributions/ContributionEditCallbacks;Landroidx/compose/runtime/Composer;II)V", "KeypadChips", "chips", "", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "onChipPress", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.contributions.ContributionEditModeKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionEditMode2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionEditMode$lambda$10(Modifier modifier, ContributionEditModeState contributionEditModeState, ContributionEditMode contributionEditMode, int i, int i2, Composer composer, int i3) {
        ContributionEditMode(modifier, contributionEditModeState, contributionEditMode, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$3(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$4(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$5(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$6(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KeypadChips$lambda$15(Modifier modifier, List list, Function1 function1, int i, int i2, Composer composer, int i3) {
        KeypadChips(modifier, list, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @JvmName
    private static final float getEditModeCtaVerticalPadding(Composer composer, int i) {
        float fM21590getDefaultD9Ej5fM;
        composer.startReplaceGroup(1333084678);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1333084678, i, -1, "com.robinhood.android.retirement.contributions.<get-EditModeCtaVerticalPadding> (ContributionEditMode.kt:39)");
        }
        if (Density4.isLowDensityScreen(composer, 0)) {
            composer.startReplaceGroup(1194123499);
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
        } else {
            composer.startReplaceGroup(1194124461);
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM21590getDefaultD9Ej5fM;
    }

    public static final void ContributionEditMode(Modifier modifier, final ContributionEditModeState state, final ContributionEditMode callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1001218735);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
        } else {
            Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001218735, i3, -1, "com.robinhood.android.retirement.contributions.ContributionEditMode (ContributionEditMode.kt:69)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(923324440);
            if (StringsKt.isBlank(state.getFormattedMoney())) {
                modifier3 = modifier5;
            } else {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, getEditModeCtaVerticalPadding(composerStartRestartGroup, 0), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(state);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionEditMode2.ContributionEditMode$lambda$9$lambda$1$lambda$0(callbacks, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion.getCenterVertically(), composerStartRestartGroup, 54);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                modifier3 = modifier5;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26981R.string.create_contribution_until_max, new Object[]{state.getFormattedMoney()}, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(size16, "Info icon", bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 2, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), getEditModeCtaVerticalPadding(composerStartRestartGroup, 0));
            boolean showKeypadChips = state.getShowKeypadChips();
            Alignment topCenter = companion.getTopCenter();
            Boolean boolValueOf = Boolean.valueOf(showKeypadChips);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ContributionEditMode2.ContributionEditMode$lambda$9$lambda$8$lambda$7((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(boolValueOf, modifierM5143paddingVpY3zN4, (Function1) objRememberedValue2, topCenter, "retirement_contribution_keypad_chips_animation", null, ComposableLambda3.rememberComposableLambda(-984660842, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$ContributionEditMode$1$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-984660842, i6, -1, "com.robinhood.android.retirement.contributions.ContributionEditMode.<anonymous>.<anonymous> (ContributionEditMode.kt:124)");
                    }
                    if (z) {
                        composer2.startReplaceGroup(595538531);
                        List<KeypadChip> keypadChips = state.getKeypadChips();
                        ContributionEditMode contributionEditMode = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(contributionEditMode);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ContributionEditMode4(contributionEditMode);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        ContributionEditMode2.KeypadChips(null, keypadChips, (Function1) ((KFunction) objRememberedValue3), composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(595715076);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0);
                        ContributionEditMode contributionEditMode2 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(contributionEditMode2);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new ContributionEditMode5(contributionEditMode2);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue4), strStringResource, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer2, 384, 0, 8184);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600896, 32);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContributionEditMode2.ContributionEditMode$lambda$10(modifier4, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionEditMode$lambda$9$lambda$1$lambda$0(ContributionEditMode contributionEditMode, ContributionEditModeState contributionEditModeState) {
        contributionEditMode.onUntilMaxClicked(contributionEditModeState.getAmount(), contributionEditModeState.getTaxYear());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform ContributionEditMode$lambda$9$lambda$8$lambda$7(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Boolean) AnimatedContent.getTargetState()).booleanValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ContributionEditMode2.ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$3(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ContributionEditMode2.ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$4(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ContributionEditMode2.ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$5(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ContributionEditMode2.ContributionEditMode$lambda$9$lambda$8$lambda$7$lambda$6(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KeypadChips(Modifier modifier, final List<KeypadChip> list, final Function1<? super KeypadChip, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(830123798);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i6 = 256;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830123798, i3, -1, "com.robinhood.android.retirement.contributions.KeypadChips (ContributionEditMode.kt:145)");
            }
            Object obj = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1201367870);
            List<KeypadChip> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (final KeypadChip keypadChip : list2) {
                String text = keypadChip.getText();
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                boolean enabled = keypadChip.getEnabled();
                Row6 row62 = row6;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, i5, obj);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i3 & 896) == i6) | composerStartRestartGroup.changedInstance(keypadChip);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionEditMode2.KeypadChips$lambda$14$lambda$13$lambda$12$lambda$11(function1, keypadChip);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ArrayList arrayList2 = arrayList;
                Composer composer3 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierM5144paddingVpY3zN4$default, null, type2, enabled, false, null, null, null, null, false, null, composer3, 24576, 0, 8136);
                arrayList2.add(Unit.INSTANCE);
                arrayList = arrayList2;
                composerStartRestartGroup = composer3;
                row6 = row62;
                i3 = i3;
                modifier4 = modifier4;
                i6 = i6;
                obj = obj;
                i5 = i5;
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionEditModeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ContributionEditMode2.KeypadChips$lambda$15(modifier3, list, function1, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KeypadChips$lambda$14$lambda$13$lambda$12$lambda$11(Function1 function1, KeypadChip keypadChip) {
        function1.invoke(keypadChip);
        return Unit.INSTANCE;
    }
}
