package com.robinhood.compose.bento.component.rows;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAccordionToggleRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ap\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState;", "state", "Lkotlin/Function1;", "", "", "onValueChanged", "Lkotlin/ParameterName;", "name", "expanded", "onExpandedChange", "Lkotlin/Function0;", "expandableContent", "Landroidx/compose/ui/Modifier;", "modifier", "BentoAccordionToggleRow", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "BentoAccordionToggleRowCollapsedSection", "(Landroidx/compose/runtime/Composer;I)V", "BentoAccordionToggleRowExpandedSection", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoAccordionToggleRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAccordionToggleRow$lambda$3(BentoToggleRowState bentoToggleRowState, Function1 function1, Function1 function12, Function2 function2, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        BentoAccordionToggleRow(bentoToggleRowState, function1, function12, function2, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAccordionToggleRowCollapsedSection$lambda$4(int i, Composer composer, int i2) {
        BentoAccordionToggleRowCollapsedSection(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAccordionToggleRowExpandedSection$lambda$5(int i, Composer composer, int i2) {
        BentoAccordionToggleRowExpandedSection(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoAccordionToggleRow(final BentoToggleRowState state, final Function1<? super Boolean, Unit> onValueChanged, final Function1<? super Boolean, Unit> onExpandedChange, Function2<? super Composer, ? super Integer, Unit> expandableContent, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        BentoToggleRowState.End.Caret.Direction direction;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z4;
        Object objRememberedValue;
        final Function2<? super Composer, ? super Integer, Unit> function2;
        final Modifier modifier3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(expandableContent, "expandableContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-63740414);
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
            i3 |= composerStartRestartGroup.changedInstance(onValueChanged) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExpandedChange) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(expandableContent) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-63740414, i3, -1, "com.robinhood.compose.bento.component.rows.BentoAccordionToggleRow (BentoAccordionToggleRow.kt:27)");
                    }
                    if (!z3) {
                        direction = BentoToggleRowState.End.Caret.Direction.f5159UP;
                    } else {
                        direction = BentoToggleRowState.End.Caret.Direction.DOWN;
                    }
                    int i6 = i3 >> 12;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoToggleRowState.Start start = state.getStart();
                    BentoToggleRowState.End.Caret caret = new BentoToggleRowState.End.Caret(direction);
                    String primaryText = state.getPrimaryText();
                    BentoToggleRowState.Text secondaryText = state.getSecondaryText();
                    Modifier modifier5 = modifier4;
                    boolean enabled = state.getEnabled();
                    boolean checked = state.getChecked();
                    String contentDescription = state.getContentDescription();
                    boolean loading = state.getLoading();
                    boolean shouldIncludeLoadingPlaceholder = state.getShouldIncludeLoadingPlaceholder();
                    BentoIcon4.Size16 checkedIcon = state.getCheckedIcon();
                    boolean z6 = !z3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z4 = ((i3 & 896) != 256) | ((458752 & i3) != 131072);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BentoAccordionToggleRowKt.BentoAccordionToggleRow$lambda$2$lambda$1$lambda$0(onExpandedChange, z3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z7 = z3;
                    function2 = expandableContent;
                    BentoToggleRow3.BentoToggleRow(start, caret, primaryText, secondaryText, enabled, checked, contentDescription, loading, shouldIncludeLoadingPlaceholder, z6, checkedIcon, onValueChanged, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, i3 & 112, 4096);
                    composerStartRestartGroup = composerStartRestartGroup;
                    AnimatedVisibilityKt.AnimatedVisibility(column6, z7, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(671324404, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$BentoAccordionToggleRow$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(671324404, i7, -1, "com.robinhood.compose.bento.component.rows.BentoAccordionToggleRow.<anonymous>.<anonymous> (BentoAccordionToggleRow.kt:51)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer2, 6, 1);
                            Function2<Composer, Integer, Unit> function22 = function2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                            Column6 column62 = Column6.INSTANCE;
                            function22.invoke(composer2, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), bentoTheme.getColors(composer2, 6).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870 | (i6 & 112), 30);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z5 = z7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function2 = expandableContent;
                    modifier3 = modifier2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoAccordionToggleRowKt.BentoAccordionToggleRow$lambda$3(state, onValueChanged, onExpandedChange, function22, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!z3) {
                }
                int i62 = i3 >> 12;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoToggleRowState.Start start2 = state.getStart();
                    BentoToggleRowState.End.Caret caret2 = new BentoToggleRowState.End.Caret(direction);
                    String primaryText2 = state.getPrimaryText();
                    BentoToggleRowState.Text secondaryText2 = state.getSecondaryText();
                    Modifier modifier52 = modifier4;
                    boolean enabled2 = state.getEnabled();
                    boolean checked2 = state.getChecked();
                    String contentDescription2 = state.getContentDescription();
                    boolean loading2 = state.getLoading();
                    boolean shouldIncludeLoadingPlaceholder2 = state.getShouldIncludeLoadingPlaceholder();
                    BentoIcon4.Size16 checkedIcon2 = state.getCheckedIcon();
                    boolean z62 = !z3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z4 = ((i3 & 896) != 256) | ((458752 & i3) != 131072);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BentoAccordionToggleRowKt.BentoAccordionToggleRow$lambda$2$lambda$1$lambda$0(onExpandedChange, z3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z72 = z3;
                        function2 = expandableContent;
                        BentoToggleRow3.BentoToggleRow(start2, caret2, primaryText2, secondaryText2, enabled2, checked2, contentDescription2, loading2, shouldIncludeLoadingPlaceholder2, z62, checkedIcon2, onValueChanged, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, i3 & 112, 4096);
                        composerStartRestartGroup = composerStartRestartGroup;
                        AnimatedVisibilityKt.AnimatedVisibility(column62, z72, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(671324404, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$BentoAccordionToggleRow$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(671324404, i7, -1, "com.robinhood.compose.bento.component.rows.BentoAccordionToggleRow.<anonymous>.<anonymous> (BentoAccordionToggleRow.kt:51)");
                                }
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composer2, 6, 1);
                                Function2<Composer, Integer, Unit> function222 = function2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion3.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor22);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion3.getSetModifier());
                                Column6 column622 = Column6.INSTANCE;
                                function222.invoke(composer2, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme.getSpacing(composer2, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), bentoTheme.getColors(composer2, 6).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870 | (i62 & 112), 30);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z5 = z72;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAccordionToggleRow$lambda$2$lambda$1$lambda$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    public static final void BentoAccordionToggleRowCollapsedSection(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148297793);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148297793, i, -1, "com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowCollapsedSection (BentoAccordionToggleRow.kt:68)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoAccordionToggleRowKt.INSTANCE.getLambda$486699783$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAccordionToggleRowKt.BentoAccordionToggleRowCollapsedSection$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoAccordionToggleRowExpandedSection(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1701938317);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1701938317, i, -1, "com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowExpandedSection (BentoAccordionToggleRow.kt:145)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoAccordionToggleRowKt.INSTANCE.getLambda$369206853$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoAccordionToggleRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAccordionToggleRowKt.BentoAccordionToggleRowExpandedSection$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
