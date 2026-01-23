package com.robinhood.android.retirement.contributions;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: RetirementContributionScreen.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/RetirementContributionScreenState;", "state", "Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;", "reviewCallbacks", "Lcom/robinhood/android/retirement/contributions/ContributionEditCallbacks;", "editCallbacks", "Lkotlin/Function0;", "", "onSubmitClicked", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "RetirementContributionScreen", "(Lcom/robinhood/android/retirement/contributions/RetirementContributionScreenState;Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;Lcom/robinhood/android/retirement/contributions/ContributionEditCallbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "", "targetState", "Lkotlin/Function1;", "composeFn", "SlideInLeft", "(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "maxRingHeight", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementContributionScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementContributionScreen$lambda$8(RetirementContributionScreen5 retirementContributionScreen5, ContributionReviewCallbacks contributionReviewCallbacks, ContributionEditMode contributionEditMode, Function0 function0, Modifier modifier, ScrollState scrollState, int i, int i2, Composer composer, int i3) {
        RetirementContributionScreen(retirementContributionScreen5, contributionReviewCallbacks, contributionEditMode, function0, modifier, scrollState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideInLeft$lambda$14$lambda$13$lambda$10(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideInLeft$lambda$14$lambda$13$lambda$11(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideInLeft$lambda$14$lambda$13$lambda$12(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideInLeft$lambda$14$lambda$13$lambda$9(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideInLeft$lambda$15(boolean z, Function3 function3, int i, Composer composer, int i2) {
        SlideInLeft(z, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementContributionScreen(final RetirementContributionScreen5 state, final ContributionReviewCallbacks reviewCallbacks, final ContributionEditMode editCallbacks, final Function0<Unit> onSubmitClicked, Modifier modifier, ScrollState scrollState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScrollState scrollStateRememberScrollState;
        Modifier modifier3;
        final Density density;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue2;
        final ScrollState scrollState2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reviewCallbacks, "reviewCallbacks");
        Intrinsics.checkNotNullParameter(editCallbacks, "editCallbacks");
        Intrinsics.checkNotNullParameter(onSubmitClicked, "onSubmitClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1244970821);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(reviewCallbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(editCallbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitClicked) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    scrollStateRememberScrollState = scrollState;
                    int i5 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 131072 : 65536;
                    i3 |= i5;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                i3 |= i5;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        i3 &= -458753;
                        modifier3 = modifier5;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1244970821, i3, -1, "com.robinhood.android.retirement.contributions.RetirementContributionScreen (RetirementContributionScreen.kt:43)");
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, null, true, false, false, false, false, null, 125, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                int i6 = i3;
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
                Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = ((i6 & 14) != 4 || ((i6 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | composerStartRestartGroup.changed(density);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RetirementContributionScreen.RetirementContributionScreen$lambda$7$lambda$5$lambda$4(state, density, snapshotState, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                ScrollState scrollState3 = scrollStateRememberScrollState;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(OnRemeasuredModifier2.onSizeChanged(modifierWeight$default, (Function1) objRememberedValue2), scrollState3, false, null, false, 14, null);
                scrollState2 = scrollState3;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                ContributionProgressRing.m18111ContributionProgressRinguFdPcIQ(state.getProgressRingState(), RetirementContributionScreen$lambda$1(snapshotState), null, composerStartRestartGroup, 0, 4);
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                SlideInLeft(state.isInEditMode(), ComposableLambda3.rememberComposableLambda(1482819190, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$RetirementContributionScreen$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                        invoke(bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, Composer composer2, int i7) {
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(z) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1482819190, i7, -1, "com.robinhood.android.retirement.contributions.RetirementContributionScreen.<anonymous>.<anonymous>.<anonymous> (RetirementContributionScreen.kt:74)");
                        }
                        if (!z) {
                            ContributionReviewModeKt.ContributionReviewMode(state.getReviewModeState(), reviewCallbacks, composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endNode();
                SlideInLeft(state.isInEditMode(), ComposableLambda3.rememberComposableLambda(-764035284, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$RetirementContributionScreen$1$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                        invoke(bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, Composer composer2, int i7) {
                        int i8;
                        if ((i7 & 6) == 0) {
                            i8 = (composer2.changed(z) ? 4 : 2) | i7;
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-764035284, i8, -1, "com.robinhood.android.retirement.contributions.RetirementContributionScreen.<anonymous>.<anonymous> (RetirementContributionScreen.kt:83)");
                        }
                        if (z) {
                            composer2.startReplaceGroup(1951574246);
                            RetirementContributionScreen5 retirementContributionScreen5 = state;
                            ContributionEditMode contributionEditMode = editCallbacks;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            ContributionEditMode2.ContributionEditMode(null, retirementContributionScreen5.getEditModeState(), contributionEditMode, composer2, 0, 1);
                            BentoNumpad4 bentoNumpad4 = BentoNumpad4.INSTANCE;
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged2 = composer2.changed(contributionEditMode);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new RetirementContributionScreen4(contributionEditMode);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            bentoNumpad4.BentoNumpadOnly(null, (Function1) ((KFunction) objRememberedValue3), false, false, false, null, composer2, BentoNumpad4.$stable << 18, 61);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1951939519);
                            ContributionReviewModeKt.ContributionReviewFooter(state.getReviewFooterState(), onSubmitClicked, null, composer2, StringResource.$stable, 4);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                scrollState2 = scrollStateRememberScrollState;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementContributionScreen.RetirementContributionScreen$lambda$8(state, reviewCallbacks, editCallbacks, onSubmitClicked, modifier4, scrollState2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier3, null, true, false, false, false, false, null, 125, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                int i62 = i3;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    if ((i62 & 14) != 4) {
                        zChanged = ((i62 & 14) != 4 || ((i62 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | composerStartRestartGroup.changed(density);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RetirementContributionScreen.RetirementContributionScreen$lambda$7$lambda$5$lambda$4(state, density, snapshotState, (IntSize) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            ScrollState scrollState32 = scrollStateRememberScrollState;
                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(OnRemeasuredModifier2.onSizeChanged(modifierWeight$default2, (Function1) objRememberedValue2), scrollState32, false, null, false, 14, null);
                            scrollState2 = scrollState32;
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                ContributionProgressRing.m18111ContributionProgressRinguFdPcIQ(state.getProgressRingState(), RetirementContributionScreen$lambda$1(snapshotState), null, composerStartRestartGroup, 0, 4);
                                Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                SlideInLeft(state.isInEditMode(), ComposableLambda3.rememberComposableLambda(1482819190, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$RetirementContributionScreen$1$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                                        invoke(bool.booleanValue(), composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z, Composer composer2, int i7) {
                                        if ((i7 & 6) == 0) {
                                            i7 |= composer2.changed(z) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1482819190, i7, -1, "com.robinhood.android.retirement.contributions.RetirementContributionScreen.<anonymous>.<anonymous>.<anonymous> (RetirementContributionScreen.kt:74)");
                                        }
                                        if (!z) {
                                            ContributionReviewModeKt.ContributionReviewMode(state.getReviewModeState(), reviewCallbacks, composer2, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                composerStartRestartGroup.endNode();
                                SlideInLeft(state.isInEditMode(), ComposableLambda3.rememberComposableLambda(-764035284, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$RetirementContributionScreen$1$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                                        invoke(bool.booleanValue(), composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z, Composer composer2, int i7) {
                                        int i8;
                                        if ((i7 & 6) == 0) {
                                            i8 = (composer2.changed(z) ? 4 : 2) | i7;
                                        } else {
                                            i8 = i7;
                                        }
                                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-764035284, i8, -1, "com.robinhood.android.retirement.contributions.RetirementContributionScreen.<anonymous>.<anonymous> (RetirementContributionScreen.kt:83)");
                                        }
                                        if (z) {
                                            composer2.startReplaceGroup(1951574246);
                                            RetirementContributionScreen5 retirementContributionScreen5 = state;
                                            ContributionEditMode contributionEditMode = editCallbacks;
                                            Modifier.Companion companion5 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, companion5);
                                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor32 = companion6.getConstructor();
                                            if (composer2.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor32);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion6.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion6.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion6.getSetModifier());
                                            Column6 column622 = Column6.INSTANCE;
                                            ContributionEditMode2.ContributionEditMode(null, retirementContributionScreen5.getEditModeState(), contributionEditMode, composer2, 0, 1);
                                            BentoNumpad4 bentoNumpad4 = BentoNumpad4.INSTANCE;
                                            composer2.startReplaceGroup(5004770);
                                            boolean zChanged2 = composer2.changed(contributionEditMode);
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new RetirementContributionScreen4(contributionEditMode);
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceGroup();
                                            bentoNumpad4.BentoNumpadOnly(null, (Function1) ((KFunction) objRememberedValue3), false, false, false, null, composer2, BentoNumpad4.$stable << 18, 61);
                                            composer2.endNode();
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(1951939519);
                                            ContributionReviewModeKt.ContributionReviewFooter(state.getReviewFooterState(), onSubmitClicked, null, composer2, StringResource.$stable, 4);
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void RetirementContributionScreen$lambda$2(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementContributionScreen$lambda$7$lambda$5$lambda$4(RetirementContributionScreen5 retirementContributionScreen5, Density density, SnapshotState snapshotState, IntSize intSize) {
        if (retirementContributionScreen5.isInEditMode() && ((int) (intSize.getPackedValue() & 4294967295L)) > 0 && C2002Dp.m7997equalsimpl0(RetirementContributionScreen$lambda$1(snapshotState), C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM())) {
            RetirementContributionScreen$lambda$2(snapshotState, density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() & 4294967295L)));
        }
        return Unit.INSTANCE;
    }

    private static final float RetirementContributionScreen$lambda$1(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final void SlideInLeft(final boolean z, final Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041211444);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041211444, i2, -1, "com.robinhood.android.retirement.contributions.SlideInLeft (RetirementContributionScreen.kt:107)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RetirementContributionScreen.SlideInLeft$lambda$14$lambda$13(z, (AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, Alignment.INSTANCE.getBottomStart(), "edit_mode_animation", null, ComposableLambda3.rememberComposableLambda(723090473, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt.SlideInLeft.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z3, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(723090473, i4, -1, "com.robinhood.android.retirement.contributions.SlideInLeft.<anonymous> (RetirementContributionScreen.kt:119)");
                    }
                    function3.invoke(Boolean.valueOf(z3), composer2, Integer.valueOf((i4 >> 3) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i3 | 1600512, 34);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementContributionScreen.SlideInLeft$lambda$15(z, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform SlideInLeft$lambda$14$lambda$13(boolean z, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (z) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(RetirementContributionScreen.SlideInLeft$lambda$14$lambda$13$lambda$9(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(RetirementContributionScreen.SlideInLeft$lambda$14$lambda$13$lambda$10(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(RetirementContributionScreen.SlideInLeft$lambda$14$lambda$13$lambda$11(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.RetirementContributionScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(RetirementContributionScreen.SlideInLeft$lambda$14$lambda$13$lambda$12(((Integer) obj).intValue()));
            }
        }, 1, null));
    }
}
