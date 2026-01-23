package com.robinhood.android.matcha.p177ui.review;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MemoComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Memo", "", "modifier", "Landroidx/compose/ui/Modifier;", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "onMemoClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/matcha/ui/review/MemoState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MemoContainerTag", "", "MemoEditTag", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.review.MemoComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MemoComposable3 {
    public static final String MemoContainerTag = "memo-tag";
    public static final String MemoEditTag = "memo-edit-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Memo$lambda$2(Modifier modifier, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, Function0 function0, int i, Composer composer, int i2) {
        Memo(modifier, matchaReviewTransactionViewState3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void Memo(Modifier modifier, final MatchaReviewTransactionViewState3 memoState, Function0<Unit> onMemoClick, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        Composer composer2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        Intrinsics.checkNotNullParameter(onMemoClick, "onMemoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(642302857);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(memoState) : composerStartRestartGroup.changedInstance(memoState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMemoClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(642302857, i2, -1, "com.robinhood.android.matcha.ui.review.Memo (MemoComposable.kt:36)");
            }
            if (memoState instanceof MatchaReviewTransactionViewState3.AddMemo) {
                composerStartRestartGroup.startReplaceGroup(765340686);
                RoundedCornerShape circleShape = RoundedCornerShape2.getCircleShape();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                CardKt.m5549CardLPr_se0(onMemoClick, modifier, false, circleShape, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), null, MemoComposable.INSTANCE.m16394getLambda$76229013$feature_p2p_externalDebug(), composer2, ((i2 >> 6) & 14) | 817889280 | ((i2 << 3) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
                modifier2 = modifier;
                composer2.endReplaceGroup();
                function0 = onMemoClick;
            } else {
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
                if (!(memoState instanceof MatchaReviewTransactionViewState3.Memo)) {
                    composer2.startReplaceGroup(-1222237906);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(766188567);
                Modifier modifierTestTag = TestTag3.testTag(modifier2, MemoContainerTag);
                MatchaReviewTransactionViewState3.Memo memo = (MatchaReviewTransactionViewState3.Memo) memoState;
                if (memo.isEditable()) {
                    modifierTestTag = ClickableKt.m4893clickableXHw0xAI$default(modifierTestTag, false, null, null, onMemoClick, 7, null);
                    function0 = onMemoClick;
                } else {
                    function0 = onMemoClick;
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierWeight = row6.weight(companion2, 1.0f, false);
                String memo2 = memo.getMemo();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(memo2, modifierWeight, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextM(), composer2, 817889280, 0, 7484);
                composer2.startReplaceGroup(2039790328);
                if (memo.isEditable()) {
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                    ImageKt.Image(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_edit_12dp, composer2, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_edit, composer2, 0), TestTag3.testTag(companion2, MemoEditTag), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme2.getColors(composer2, i4).m21426getFg20d7_KjU(), 0, 2, null), composer2, 384, 56);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            function0 = onMemoClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MemoComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoComposable3.Memo$lambda$2(modifier2, memoState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
