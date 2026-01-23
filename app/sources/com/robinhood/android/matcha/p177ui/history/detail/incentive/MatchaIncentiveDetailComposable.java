package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import android.content.res.Resources;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.detail.incentive.MatchaIncentiveDetailViewState;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaIncentiveDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"MatchaIncentiveDetailComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewState", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;Landroidx/compose/runtime/Composer;II)V", "MatchaIncentiveDetail", "state", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;Landroidx/compose/runtime/Composer;II)V", "MatchaIncentiveDetailComposablePreview", "(Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaIncentiveDetailComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaIncentiveDetail$lambda$3(Modifier modifier, MatchaIncentiveDetailViewState.Loaded loaded, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        MatchaIncentiveDetail(modifier, loaded, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaIncentiveDetailComposable$lambda$0(Modifier modifier, MatchaIncentiveDetailViewState matchaIncentiveDetailViewState, int i, int i2, Composer composer, int i3) {
        MatchaIncentiveDetailComposable(modifier, matchaIncentiveDetailViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaIncentiveDetailComposablePreview$lambda$4(MatchaIncentiveDetailViewState matchaIncentiveDetailViewState, int i, Composer composer, int i2) {
        MatchaIncentiveDetailComposablePreview(matchaIncentiveDetailViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MatchaIncentiveDetailComposable(final Modifier modifier, MatchaIncentiveDetailViewState viewState, Composer composer, final int i, final int i2) {
        int i3;
        final MatchaIncentiveDetailViewState matchaIncentiveDetailViewState;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1416619477);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416619477, i3, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposable (MatchaIncentiveDetailComposable.kt:31)");
            }
            int i5 = ((i3 >> 3) & 14) | 24576;
            matchaIncentiveDetailViewState = viewState;
            Crossfade.Crossfade(matchaIncentiveDetailViewState, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambda3.rememberComposableLambda(1255570788, true, new Function3<MatchaIncentiveDetailViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt.MatchaIncentiveDetailComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(MatchaIncentiveDetailViewState matchaIncentiveDetailViewState2, Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(matchaIncentiveDetailViewState2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final MatchaIncentiveDetailViewState state, Composer composer2, int i6) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(state, "state");
                    if ((i6 & 6) == 0) {
                        i6 |= (i6 & 8) == 0 ? composer2.changed(state) : composer2.changedInstance(state) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1255570788, i6, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposable.<anonymous> (MatchaIncentiveDetailComposable.kt:33)");
                    }
                    if (state instanceof MatchaIncentiveDetailViewState.Loading) {
                        composer2.startReplaceGroup(-282279828);
                        LocalShowPlaceholder.Loadable(true, modifier, null, ComposableLambda3.rememberComposableLambda(-1971431076, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt.MatchaIncentiveDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) throws Resources.NotFoundException {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1971431076, i7, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposable.<anonymous>.<anonymous> (MatchaIncentiveDetailComposable.kt:38)");
                                }
                                MatchaIncentiveDetailComposable.MatchaIncentiveDetail(null, ((MatchaIncentiveDetailViewState.Loading) state).getMock(), composer3, 0, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3078, 4);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(state instanceof MatchaIncentiveDetailViewState.Loaded)) {
                            composer2.startReplaceGroup(-282281888);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-282272660);
                        MatchaIncentiveDetailComposable.MatchaIncentiveDetail(modifier, (MatchaIncentiveDetailViewState.Loaded) state, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i5, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            matchaIncentiveDetailViewState = viewState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaIncentiveDetailComposable.MatchaIncentiveDetailComposable$lambda$0(modifier, matchaIncentiveDetailViewState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MatchaIncentiveDetail(Modifier modifier, final MatchaIncentiveDetailViewState.Loaded loaded, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        final Modifier modifier2;
        int i3;
        BentoTheme bentoTheme;
        Modifier.Companion companion;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1236688777);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(loaded) ? 32 : 16;
        }
        int i7 = i3;
        if ((i7 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1236688777, i7, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetail (MatchaIncentiveDetailComposable.kt:53)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier4 = modifier3;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_gift, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, composerStartRestartGroup, 0, 1), false, BentoPogSize.Hero, StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_pog_content_description, composerStartRestartGroup, 0), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i8).m21456getPositive0d7_KjU()), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i8).m21456getPositive0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), composerStartRestartGroup, 3072, 4);
            BentoText2.m20747BentoText38GnDrw(loaded.getAmount(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            int i9 = (i7 >> 3) & 14;
            String subtitle = loaded.getSubtitle(composerStartRestartGroup, i9);
            composerStartRestartGroup.startReplaceGroup(216908728);
            if (subtitle == null) {
                companion = companion3;
                i4 = i9;
                bentoTheme = bentoTheme2;
                i5 = i8;
            } else {
                bentoTheme = bentoTheme2;
                companion = companion3;
                i4 = i9;
                i5 = i8;
                BentoText2.m20747BentoText38GnDrw(subtitle, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 7, null), composerStartRestartGroup, 0);
            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_status_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_status_description, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, 4061, null);
            int i10 = BentoDataRowState.$stable;
            BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i10, 6);
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_date_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(loaded.getDate(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i10, 6);
            composerStartRestartGroup.startReplaceGroup(216936502);
            if (loaded.getShowReferralCount()) {
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_referral_count_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(loaded.getReferralCountValue(composerStartRestartGroup, i4), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i10, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_to_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_to_description, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i10, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaIncentiveDetailComposable.MatchaIncentiveDetail$lambda$3(modifier2, loaded, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MatchaIncentiveDetailComposablePreview(final MatchaIncentiveDetailViewState matchaIncentiveDetailViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(158719870);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(matchaIncentiveDetailViewState) : composerStartRestartGroup.changedInstance(matchaIncentiveDetailViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(158719870, i2, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposablePreview (MatchaIncentiveDetailComposable.kt:116)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1525213898, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt.MatchaIncentiveDetailComposablePreview.1
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
                        ComposerKt.traceEventStart(-1525213898, i3, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposablePreview.<anonymous> (MatchaIncentiveDetailComposable.kt:118)");
                    }
                    MatchaIncentiveDetailComposable.MatchaIncentiveDetailComposable(null, matchaIncentiveDetailViewState, composer2, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaIncentiveDetailComposable.MatchaIncentiveDetailComposablePreview$lambda$4(matchaIncentiveDetailViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
