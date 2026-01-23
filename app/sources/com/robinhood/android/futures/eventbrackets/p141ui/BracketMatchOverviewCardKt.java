package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.futures.eventbrackets.C17135R;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchState;
import com.robinhood.android.futures.eventbrackets.p141ui.OverviewCardPreviewParameterProvider;
import com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildTournamentBracket;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a9\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001a\u001a1\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001f\u001a'\u0010 \u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\"\u001a\u001f\u0010#\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010$\u001a\u0017\u0010+\u001a\u00020\u00012\b\b\u0001\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010.\u001a\u0017\u0010/\u001a\u00020\u00012\b\b\u0001\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010.\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016\"\u0010\u0010&\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016\"\u0014\u0010'\u001a\u00020(X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00060"}, m3636d2 = {"BracketMatchOverviewCard", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "onCardClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnknownSeedFallback", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "StatusRow", "isLive", "", "gameStateDisplay", "", "hasOpenPosition", "pnlAmount", "Lcom/robinhood/models/util/Money;", "(ZLjava/lang/String;ZLcom/robinhood/models/util/Money;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatusRowHeight", "Landroidx/compose/ui/unit/Dp;", "F", "seedTextColor", "Landroidx/compose/ui/graphics/Color;", "isLoser", "(ZLandroidx/compose/runtime/Composer;I)J", "TwoRowsDisplay", "seed1", "seed2", "isSeed1Winner", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;Ljava/lang/Boolean;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LockedDisplay", "showTwoLock", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SingleLockedDisplay", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TwoLocksDisplay", "CardHeight", "CardShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCardShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "PreviewOverviewCard_day", "params", "Lcom/robinhood/android/futures/eventbrackets/ui/OverviewCardPreviewParameterProvider$Params;", "(Lcom/robinhood/android/futures/eventbrackets/ui/OverviewCardPreviewParameterProvider$Params;Landroidx/compose/runtime/Composer;I)V", "PreviewOverviewCard_night", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BracketMatchOverviewCardKt {
    private static final BracketGameSeedData UnknownSeedFallback = new BracketGameSeedData(PlaceholderUtils.XXShortPlaceholderText, "-", "-", "#000000", "#000000", null, 32, null);
    private static final float StatusRowHeight = C2002Dp.m7995constructorimpl(20);
    private static final float CardHeight = C2002Dp.m7995constructorimpl(100);
    private static final RoundedCornerShape CardShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BracketMatchOverviewCard$lambda$4(BracketGameOverviewCardData bracketGameOverviewCardData, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BracketMatchOverviewCard(bracketGameOverviewCardData, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LockedDisplay$lambda$19(String str, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LockedDisplay(str, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOverviewCard_day$lambda$26(OverviewCardPreviewParameterProvider.Params params, int i, Composer composer, int i2) {
        PreviewOverviewCard_day(params, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOverviewCard_night$lambda$27(OverviewCardPreviewParameterProvider.Params params, int i, Composer composer, int i2) {
        PreviewOverviewCard_night(params, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleLockedDisplay$lambda$21(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SingleLockedDisplay(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatusRow$lambda$7(boolean z, String str, boolean z2, Money money, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatusRow(z, str, z2, money, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoLocksDisplay$lambda$25(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TwoLocksDisplay(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsDisplay$lambda$18(BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2, Boolean bool, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TwoRowsDisplay(bracketGameSeedData, bracketGameSeedData2, bool, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BracketMatchOverviewCard(final BracketGameOverviewCardData data, final Function0<Unit> onCardClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i4;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        BracketGameSeedData seed1;
        BracketGameSeedData seed2;
        final Modifier modifier3;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-624173953);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClick) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-624173953, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCard (BracketMatchOverviewCard.kt:169)");
                }
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier4, CardHeight);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                StatusRow(data.isLive(), data.getGameStateDisplay(), data.getHasPosition(), data.getPnlAmount(), null, composerStartRestartGroup, 0, 16);
                companion = Modifier.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                int i7 = i3 & 14;
                Brush backgroundBrush = data.getBackgroundBrush(composerStartRestartGroup, i7);
                RoundedCornerShape roundedCornerShape = CardShape;
                Modifier modifierM4878borderziNgDLE = BorderKt.m4878borderziNgDLE(Background3.background$default(modifierM5146paddingqDBjuR0$default, backgroundBrush, roundedCornerShape, 0.0f, 4, null), C2002Dp.m7995constructorimpl(1), data.getBorderGradient(composerStartRestartGroup, i7), roundedCornerShape);
                Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = (i7 != 4) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BracketMatchOverviewCardKt.BracketMatchOverviewCard$lambda$3$lambda$1$lambda$0(data, onCardClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4878borderziNgDLE, false, null, roleM7472boximpl, (Function0) objRememberedValue, 3, null);
                boolean z2 = false;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (data.getSeed1() == null || data.getSeed2() != null) {
                    composerStartRestartGroup.startReplaceGroup(-1642038082);
                    seed1 = data.getSeed1();
                    if (seed1 == null) {
                        seed1 = UnknownSeedFallback;
                    }
                    seed2 = data.getSeed2();
                    if (seed2 == null) {
                        seed2 = UnknownSeedFallback;
                    }
                    TwoRowsDisplay(seed1, seed2, data.isSeed1Winner(), PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1641650582);
                    String gameStateDisplay = data.getGameStateDisplay();
                    BracketMatchState state = data.getState();
                    BracketMatchState.Locked locked = state instanceof BracketMatchState.Locked ? (BracketMatchState.Locked) state : null;
                    if (locked != null) {
                        i5 = 1;
                        if (locked.getShowTwoLocksSideBySide()) {
                            z2 = true;
                        }
                    } else {
                        i5 = 1;
                    }
                    LockedDisplay(gameStateDisplay, z2, PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, i5, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BracketMatchOverviewCardKt.BracketMatchOverviewCard$lambda$4(data, onCardClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier4, CardHeight);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                StatusRow(data.isLive(), data.getGameStateDisplay(), data.getHasPosition(), data.getPnlAmount(), null, composerStartRestartGroup, 0, 16);
                companion = Modifier.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                int i72 = i3 & 14;
                Brush backgroundBrush2 = data.getBackgroundBrush(composerStartRestartGroup, i72);
                RoundedCornerShape roundedCornerShape2 = CardShape;
                Modifier modifierM4878borderziNgDLE2 = BorderKt.m4878borderziNgDLE(Background3.background$default(modifierM5146paddingqDBjuR0$default2, backgroundBrush2, roundedCornerShape2, 0.0f, 4, null), C2002Dp.m7995constructorimpl(1), data.getBorderGradient(composerStartRestartGroup, i72), roundedCornerShape2);
                Role roleM7472boximpl2 = Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = (i72 != 4) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BracketMatchOverviewCardKt.BracketMatchOverviewCard$lambda$3$lambda$1$lambda$0(data, onCardClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4878borderziNgDLE2, false, null, roleM7472boximpl2, (Function0) objRememberedValue, 3, null);
                    boolean z22 = false;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (data.getSeed1() == null) {
                            composerStartRestartGroup.startReplaceGroup(-1642038082);
                            seed1 = data.getSeed1();
                            if (seed1 == null) {
                            }
                            seed2 = data.getSeed2();
                            if (seed2 == null) {
                            }
                            TwoRowsDisplay(seed1, seed2, data.isSeed1Winner(), PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BracketMatchOverviewCard$lambda$3$lambda$1$lambda$0(BracketGameOverviewCardData bracketGameOverviewCardData, Function0 function0) {
        if (bracketGameOverviewCardData.getCanNavigateToEdp()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void StatusRow(final boolean z, final String str, final boolean z2, Money money, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        Money money2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        String strCurrencyDeltaFormat;
        Composer composer2;
        long jM21452getNegative0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(639842029);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    money2 = money;
                    i3 |= composerStartRestartGroup.changedInstance(money2) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(639842029, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.StatusRow (BracketMatchOverviewCard.kt:238)");
                        }
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier3, StatusRowHeight);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1647730793);
                        if (z) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                            LiveStatusIcon5.m14380LiveStatusIconPZHvWI(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), 0.0f, 0L, null, composerStartRestartGroup, 0, 14);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifier4 = modifier3;
                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, ((i3 >> 3) & 14) | 805306368, 0, 7678);
                        Composer composer3 = composerStartRestartGroup;
                        strCurrencyDeltaFormat = BuildTournamentBracket.currencyDeltaFormat(money2);
                        composer3.startReplaceGroup(-1647719993);
                        if (strCurrencyDeltaFormat != null) {
                            if (Money3.isZero(money2)) {
                                composer3.startReplaceGroup(1271044639);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            } else if (Money3.isPositive(money2)) {
                                composer3.startReplaceGroup(1271138073);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1271209497);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i6).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(strCurrencyDeltaFormat, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i6).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8184);
                            composer3 = composer3;
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1647703493);
                        if (z2) {
                            composer2 = composer3;
                        } else {
                            composer2 = composer3;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CHECKMARK_12), StringResources_androidKt.stringResource(C17135R.string.card_has_position_check_mark_content_description, composer3, i5), bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer2, BentoIcon4.Size12.$stable, 48);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Money money3 = money2;
                        final Modifier modifier5 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BracketMatchOverviewCardKt.StatusRow$lambda$7(z, str, z2, money3, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                if ((i3 & 9363) != 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier3, StatusRowHeight);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1647730793);
                        if (z) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        Modifier modifier42 = modifier3;
                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, ((i3 >> 3) & 14) | 805306368, 0, 7678);
                        Composer composer32 = composerStartRestartGroup;
                        strCurrencyDeltaFormat = BuildTournamentBracket.currencyDeltaFormat(money2);
                        composer32.startReplaceGroup(-1647719993);
                        if (strCurrencyDeltaFormat != null) {
                        }
                        composer32.endReplaceGroup();
                        composer32.startReplaceGroup(-1647703493);
                        if (z2) {
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            money2 = money;
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        money2 = money;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long seedTextColor(boolean z, Composer composer, int i) {
        long jM21425getFg0d7_KjU;
        composer.startReplaceGroup(-971037503);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971037503, i, -1, "com.robinhood.android.futures.eventbrackets.ui.seedTextColor (BracketMatchOverviewCard.kt:285)");
        }
        if (z) {
            composer.startReplaceGroup(-1159133468);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
        } else {
            composer.startReplaceGroup(-1159132605);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21425getFg0d7_KjU;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TwoRowsDisplay(final BracketGameSeedData bracketGameSeedData, final BracketGameSeedData bracketGameSeedData2, final Boolean bool, Modifier modifier, Composer composer, final int i, final int i2) {
        final BracketGameSeedData bracketGameSeedData3;
        int i3;
        BracketGameSeedData bracketGameSeedData4;
        final Boolean bool2;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i5;
        boolean zChanged;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-995196009);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            bracketGameSeedData3 = bracketGameSeedData;
        } else {
            bracketGameSeedData3 = bracketGameSeedData;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(bracketGameSeedData3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                bracketGameSeedData4 = bracketGameSeedData2;
                i3 |= composerStartRestartGroup.changed(bracketGameSeedData4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                bool2 = bool;
            } else {
                bool2 = bool;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(bool2) ? 256 : 128;
                }
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-995196009, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.TwoRowsDisplay (BracketMatchOverviewCard.kt:295)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Measurer2(density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    measurer2 = (Measurer2) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ConstraintLayoutScope();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                    i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$2
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                snapshotState2.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                snapshotState.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        measurer22.performLayout(placementScope, list, linkedHashMap);
                                    }
                                }, 4, null);
                            }
                        };
                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                        snapshotState3 = snapshotState;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                        snapshotState3 = snapshotState;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl2.setKnownDirty(true);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    final Function0 function0 = (Function0) objRememberedValue7;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    final BracketGameSeedData bracketGameSeedData5 = bracketGameSeedData4;
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:29:0x01cd  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x0259  */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x02e3  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x0332  */
                        /* JADX WARN: Removed duplicated region for block: B:47:0x0368  */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x03f5  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x046b  */
                        /* JADX WARN: Removed duplicated region for block: B:65:0x04c1  */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x0545  */
                        /* JADX WARN: Removed duplicated region for block: B:73:0x0585  */
                        /* JADX WARN: Removed duplicated region for block: B:76:0x0591  */
                        /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer2, int i6) {
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
                            boolean zChanged2;
                            Object objRememberedValue9;
                            boolean zChanged3;
                            Object objRememberedValue10;
                            boolean zChanged4;
                            Object objRememberedValue11;
                            String score;
                            boolean zChanged5;
                            Object objRememberedValue12;
                            String score2;
                            boolean zChanged6;
                            Object objRememberedValue13;
                            boolean zChanged7;
                            Object objRememberedValue14;
                            boolean zChanged8;
                            Object objRememberedValue15;
                            boolean zChanged9;
                            Object objRememberedValue16;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer2.startReplaceGroup(-884332427);
                            long jSeedTextColor = BracketMatchOverviewCardKt.seedTextColor(Intrinsics.areEqual(bool2, Boolean.FALSE), composer2, 0);
                            long jSeedTextColor2 = BracketMatchOverviewCardKt.seedTextColor(Intrinsics.areEqual(bool2, Boolean.TRUE), composer2, 0);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, 0.0f, 2, null);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8141createGuidelineFromEnd0680j_4 = constraintLayoutScope2.m8141createGuidelineFromEnd0680j_4(C2002Dp.m7995constructorimpl(40));
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component5, constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component8}, 0.0f, 2, null);
                            ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope2.createGuidelineFromTop(0.5f);
                            boolean z = (bracketGameSeedData3.getScore() == null || bracketGameSeedData5.getScore() == null) ? false : true;
                            String displayId = bracketGameSeedData3.getDisplayId();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            boolean z2 = z;
                            int i7 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                            long jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged10 = composer2.changed(horizontalAnchorCreateGuidelineFromTop) | composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default);
                            Object objRememberedValue17 = composer2.rememberedValue();
                            if (!zChanged10) {
                                verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                verticalAnchor2 = verticalAnchor;
                                BentoText2.m20747BentoText38GnDrw(displayId, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue17), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer2, 805306368, 0, 7672);
                                String displayId2 = bracketGameSeedData5.getDisplayId();
                                TextStyle textS2 = bentoTheme.getTypography(composer2, i7).getTextS();
                                long jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged2 = composer2.changed(horizontalAnchorCreateGuidelineFromTop) | composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(constraintLayoutBaseScope4Component4);
                                objRememberedValue9 = composer2.rememberedValue();
                                if (!zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(horizontalAnchorCreateGuidelineFromTop, verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component4);
                                    composer2.updateRememberedValue(objRememberedValue9);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(displayId2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9), Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 1, 0, null, 0, textS2, composer2, 805306368, 0, 7672);
                                String name = bracketGameSeedData3.getName();
                                TextStyle textM = bentoTheme.getTypography(composer2, i7).getTextM();
                                int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged3 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                objRememberedValue10 = composer2.rememberedValue();
                                if (!zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                    composer2.updateRememberedValue(objRememberedValue10);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(name, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue10), Color.m6701boximpl(jSeedTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer2, 817889280, 0, 7544);
                                String name2 = bracketGameSeedData5.getName();
                                TextStyle textM2 = bentoTheme.getTypography(composer2, i7).getTextM();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged4 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                objRememberedValue11 = composer2.rememberedValue();
                                if (!zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                    composer2.updateRememberedValue(objRememberedValue11);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(name2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue11), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM2, composer2, 805306368, 0, 7672);
                                score = bracketGameSeedData3.getScore();
                                if (score == null) {
                                    score = "";
                                }
                                TextStyle textM3 = bentoTheme.getTypography(composer2, i7).getTextM();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged5 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                                objRememberedValue12 = composer2.rememberedValue();
                                if (!zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(z2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                    composer2.updateRememberedValue(objRememberedValue12);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(score, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue12), Color.m6701boximpl(jSeedTextColor), null, null, null, null, 0, false, 1, 0, null, 0, textM3, composer2, 805306368, 0, 7672);
                                score2 = bracketGameSeedData5.getScore();
                                if (score2 == null) {
                                    score2 = "";
                                }
                                TextStyle textM4 = bentoTheme.getTypography(composer2, i7).getTextM();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged6 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component9);
                                objRememberedValue13 = composer2.rememberedValue();
                                if (!zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue13 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(z2, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component9);
                                    composer2.updateRememberedValue(objRememberedValue13);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(score2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue13), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM4, composer2, 805306368, 0, 7672);
                                long jM21373getBg30d7_KjU = bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged7 = composer2.changed(z2) | composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                objRememberedValue14 = composer2.rememberedValue();
                                if (!zChanged7 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue14 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(z2, verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                    composer2.updateRememberedValue(objRememberedValue14);
                                }
                                composer2.endReplaceGroup();
                                Divider5.m5852VerticalDivider9IZ8Weo(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue14), 0.0f, jM21373getBg30d7_KjU, composer2, 0, 2);
                                String percentageDisplay = bracketGameSeedData3.getPercentageDisplay();
                                TextStyle textM5 = bentoTheme.getTypography(composer2, i7).getTextM();
                                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                                int iM7920getEnde0LSkKk = companion3.m7920getEnde0LSkKk();
                                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                                FontWeight bold = companion4.getBold();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged8 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component3);
                                objRememberedValue15 = composer2.rememberedValue();
                                if (!zChanged8 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue15 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component3);
                                    composer2.updateRememberedValue(objRememberedValue15);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(percentageDisplay, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), Color.m6701boximpl(jSeedTextColor), null, bold, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk), 0, false, 1, 0, null, 0, textM5, composer2, 805330944, 0, 7592);
                                String percentageDisplay2 = bracketGameSeedData5.getPercentageDisplay();
                                TextStyle textM6 = bentoTheme.getTypography(composer2, i7).getTextM();
                                FontWeight bold2 = companion4.getBold();
                                int iM7920getEnde0LSkKk2 = companion3.m7920getEnde0LSkKk();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged9 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component4);
                                objRememberedValue16 = composer2.rememberedValue();
                                if (!zChanged9 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue16 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$9$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component4);
                                    composer2.updateRememberedValue(objRememberedValue16);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(percentageDisplay2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), Color.m6701boximpl(jSeedTextColor2), null, bold2, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk2), 0, false, 1, 0, null, 0, textM6, composer2, 805330944, 0, 7592);
                                composer2.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    EffectsKt.SideEffect(function0, composer2, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                            objRememberedValue17 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$1$1(horizontalAnchorCreateGuidelineFromTop, constraintLayoutBaseScope4Component3, verticalAnchorM8137createEndBarrier3ABfNKs$default);
                            composer2.updateRememberedValue(objRememberedValue17);
                            composer2.endReplaceGroup();
                            verticalAnchor2 = verticalAnchor;
                            BentoText2.m20747BentoText38GnDrw(displayId, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue17), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer2, 805306368, 0, 7672);
                            String displayId22 = bracketGameSeedData5.getDisplayId();
                            TextStyle textS22 = bentoTheme.getTypography(composer2, i7).getTextS();
                            long jM21427getFg30d7_KjU22 = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                            composer2.startReplaceGroup(-1746271574);
                            zChanged2 = composer2.changed(horizontalAnchorCreateGuidelineFromTop) | composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(constraintLayoutBaseScope4Component4);
                            objRememberedValue9 = composer2.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue9 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(horizontalAnchorCreateGuidelineFromTop, verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component4);
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(displayId22, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9), Color.m6701boximpl(jM21427getFg30d7_KjU22), null, null, null, null, 0, false, 1, 0, null, 0, textS22, composer2, 805306368, 0, 7672);
                            String name3 = bracketGameSeedData3.getName();
                            TextStyle textM7 = bentoTheme.getTypography(composer2, i7).getTextM();
                            int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            composer2.startReplaceGroup(-1746271574);
                            zChanged3 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                            objRememberedValue10 = composer2.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue10 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(name3, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue10), Color.m6701boximpl(jSeedTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textM7, composer2, 817889280, 0, 7544);
                            String name22 = bracketGameSeedData5.getName();
                            TextStyle textM22 = bentoTheme.getTypography(composer2, i7).getTextM();
                            composer2.startReplaceGroup(-1746271574);
                            zChanged4 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                            objRememberedValue11 = composer2.rememberedValue();
                            if (!zChanged4) {
                                objRememberedValue11 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                composer2.updateRememberedValue(objRememberedValue11);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(name22, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue11), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM22, composer2, 805306368, 0, 7672);
                            score = bracketGameSeedData3.getScore();
                            if (score == null) {
                            }
                            TextStyle textM32 = bentoTheme.getTypography(composer2, i7).getTextM();
                            composer2.startReplaceGroup(-1746271574);
                            zChanged5 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                            objRememberedValue12 = composer2.rememberedValue();
                            if (!zChanged5) {
                                objRememberedValue12 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(z2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(score, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue12), Color.m6701boximpl(jSeedTextColor), null, null, null, null, 0, false, 1, 0, null, 0, textM32, composer2, 805306368, 0, 7672);
                            score2 = bracketGameSeedData5.getScore();
                            if (score2 == null) {
                            }
                            TextStyle textM42 = bentoTheme.getTypography(composer2, i7).getTextM();
                            composer2.startReplaceGroup(-1746271574);
                            zChanged6 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component9);
                            objRememberedValue13 = composer2.rememberedValue();
                            if (!zChanged6) {
                                objRememberedValue13 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(z2, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component9);
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(score2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue13), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM42, composer2, 805306368, 0, 7672);
                            long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU();
                            composer2.startReplaceGroup(-1633490746);
                            zChanged7 = composer2.changed(z2) | composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4);
                            objRememberedValue14 = composer2.rememberedValue();
                            if (!zChanged7) {
                                objRememberedValue14 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(z2, verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                composer2.updateRememberedValue(objRememberedValue14);
                            }
                            composer2.endReplaceGroup();
                            Divider5.m5852VerticalDivider9IZ8Weo(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue14), 0.0f, jM21373getBg30d7_KjU2, composer2, 0, 2);
                            String percentageDisplay3 = bracketGameSeedData3.getPercentageDisplay();
                            TextStyle textM52 = bentoTheme.getTypography(composer2, i7).getTextM();
                            TextAlign.Companion companion32 = TextAlign.INSTANCE;
                            int iM7920getEnde0LSkKk3 = companion32.m7920getEnde0LSkKk();
                            FontWeight.Companion companion42 = FontWeight.INSTANCE;
                            FontWeight bold3 = companion42.getBold();
                            composer2.startReplaceGroup(-1633490746);
                            zChanged8 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component3);
                            objRememberedValue15 = composer2.rememberedValue();
                            if (!zChanged8) {
                                objRememberedValue15 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component3);
                                composer2.updateRememberedValue(objRememberedValue15);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(percentageDisplay3, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), Color.m6701boximpl(jSeedTextColor), null, bold3, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk3), 0, false, 1, 0, null, 0, textM52, composer2, 805330944, 0, 7592);
                            String percentageDisplay22 = bracketGameSeedData5.getPercentageDisplay();
                            TextStyle textM62 = bentoTheme.getTypography(composer2, i7).getTextM();
                            FontWeight bold22 = companion42.getBold();
                            int iM7920getEnde0LSkKk22 = companion32.m7920getEnde0LSkKk();
                            composer2.startReplaceGroup(-1633490746);
                            zChanged9 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component4);
                            objRememberedValue16 = composer2.rememberedValue();
                            if (!zChanged9) {
                                objRememberedValue16 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$9$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component4);
                                composer2.updateRememberedValue(objRememberedValue16);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(percentageDisplay22, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), Color.m6701boximpl(jSeedTextColor2), null, bold22, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk22), 0, false, 1, 0, null, 0, textM62, composer2, 805330944, 0, 7592);
                            composer2.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BracketMatchOverviewCardKt.TwoRowsDisplay$lambda$18(bracketGameSeedData, bracketGameSeedData2, bool, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                            final Map linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                    }
                    final Function0 function02 = (Function0) objRememberedValue7;
                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        final BracketGameSeedData bracketGameSeedData52 = bracketGameSeedData4;
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:29:0x01cd  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x0259  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x02e3  */
                            /* JADX WARN: Removed duplicated region for block: B:42:0x0332  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x0368  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x03bf  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x03f5  */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x046b  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x04c1  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x0545  */
                            /* JADX WARN: Removed duplicated region for block: B:73:0x0585  */
                            /* JADX WARN: Removed duplicated region for block: B:76:0x0591  */
                            /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(Composer composer2, int i6) {
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
                                boolean zChanged2;
                                Object objRememberedValue9;
                                boolean zChanged3;
                                Object objRememberedValue10;
                                boolean zChanged4;
                                Object objRememberedValue11;
                                String score;
                                boolean zChanged5;
                                Object objRememberedValue12;
                                String score2;
                                boolean zChanged6;
                                Object objRememberedValue13;
                                boolean zChanged7;
                                Object objRememberedValue14;
                                boolean zChanged8;
                                Object objRememberedValue15;
                                boolean zChanged9;
                                Object objRememberedValue16;
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState2.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                constraintLayoutScope2.reset();
                                ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                composer2.startReplaceGroup(-884332427);
                                long jSeedTextColor = BracketMatchOverviewCardKt.seedTextColor(Intrinsics.areEqual(bool2, Boolean.FALSE), composer2, 0);
                                long jSeedTextColor2 = BracketMatchOverviewCardKt.seedTextColor(Intrinsics.areEqual(bool2, Boolean.TRUE), composer2, 0);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, 0.0f, 2, null);
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8141createGuidelineFromEnd0680j_4 = constraintLayoutScope22.m8141createGuidelineFromEnd0680j_4(C2002Dp.m7995constructorimpl(40));
                                ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component5, constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component8}, 0.0f, 2, null);
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope22.createGuidelineFromTop(0.5f);
                                boolean z = (bracketGameSeedData3.getScore() == null || bracketGameSeedData52.getScore() == null) ? false : true;
                                String displayId = bracketGameSeedData3.getDisplayId();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                boolean z2 = z;
                                int i7 = BentoTheme.$stable;
                                TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                                long jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChanged10 = composer2.changed(horizontalAnchorCreateGuidelineFromTop) | composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default);
                                Object objRememberedValue17 = composer2.rememberedValue();
                                if (!zChanged10) {
                                    verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                    if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    composer2.endReplaceGroup();
                                    verticalAnchor2 = verticalAnchor;
                                    BentoText2.m20747BentoText38GnDrw(displayId, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue17), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer2, 805306368, 0, 7672);
                                    String displayId22 = bracketGameSeedData52.getDisplayId();
                                    TextStyle textS22 = bentoTheme.getTypography(composer2, i7).getTextS();
                                    long jM21427getFg30d7_KjU22 = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                                    composer2.startReplaceGroup(-1746271574);
                                    zChanged2 = composer2.changed(horizontalAnchorCreateGuidelineFromTop) | composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(constraintLayoutBaseScope4Component4);
                                    objRememberedValue9 = composer2.rememberedValue();
                                    if (!zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue9 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(horizontalAnchorCreateGuidelineFromTop, verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component4);
                                        composer2.updateRememberedValue(objRememberedValue9);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(displayId22, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9), Color.m6701boximpl(jM21427getFg30d7_KjU22), null, null, null, null, 0, false, 1, 0, null, 0, textS22, composer2, 805306368, 0, 7672);
                                    String name3 = bracketGameSeedData3.getName();
                                    TextStyle textM7 = bentoTheme.getTypography(composer2, i7).getTextM();
                                    int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                                    composer2.startReplaceGroup(-1746271574);
                                    zChanged3 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                    objRememberedValue10 = composer2.rememberedValue();
                                    if (!zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue10 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                        composer2.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(name3, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue10), Color.m6701boximpl(jSeedTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textM7, composer2, 817889280, 0, 7544);
                                    String name22 = bracketGameSeedData52.getName();
                                    TextStyle textM22 = bentoTheme.getTypography(composer2, i7).getTextM();
                                    composer2.startReplaceGroup(-1746271574);
                                    zChanged4 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                    objRememberedValue11 = composer2.rememberedValue();
                                    if (!zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue11 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                        composer2.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(name22, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue11), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM22, composer2, 805306368, 0, 7672);
                                    score = bracketGameSeedData3.getScore();
                                    if (score == null) {
                                        score = "";
                                    }
                                    TextStyle textM32 = bentoTheme.getTypography(composer2, i7).getTextM();
                                    composer2.startReplaceGroup(-1746271574);
                                    zChanged5 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                                    objRememberedValue12 = composer2.rememberedValue();
                                    if (!zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue12 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(z2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                        composer2.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(score, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue12), Color.m6701boximpl(jSeedTextColor), null, null, null, null, 0, false, 1, 0, null, 0, textM32, composer2, 805306368, 0, 7672);
                                    score2 = bracketGameSeedData52.getScore();
                                    if (score2 == null) {
                                        score2 = "";
                                    }
                                    TextStyle textM42 = bentoTheme.getTypography(composer2, i7).getTextM();
                                    composer2.startReplaceGroup(-1746271574);
                                    zChanged6 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component9);
                                    objRememberedValue13 = composer2.rememberedValue();
                                    if (!zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue13 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(z2, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component9);
                                        composer2.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(score2, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue13), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM42, composer2, 805306368, 0, 7672);
                                    long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU();
                                    composer2.startReplaceGroup(-1633490746);
                                    zChanged7 = composer2.changed(z2) | composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                    objRememberedValue14 = composer2.rememberedValue();
                                    if (!zChanged7 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue14 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(z2, verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                        composer2.updateRememberedValue(objRememberedValue14);
                                    }
                                    composer2.endReplaceGroup();
                                    Divider5.m5852VerticalDivider9IZ8Weo(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue14), 0.0f, jM21373getBg30d7_KjU2, composer2, 0, 2);
                                    String percentageDisplay3 = bracketGameSeedData3.getPercentageDisplay();
                                    TextStyle textM52 = bentoTheme.getTypography(composer2, i7).getTextM();
                                    TextAlign.Companion companion32 = TextAlign.INSTANCE;
                                    int iM7920getEnde0LSkKk3 = companion32.m7920getEnde0LSkKk();
                                    FontWeight.Companion companion42 = FontWeight.INSTANCE;
                                    FontWeight bold3 = companion42.getBold();
                                    composer2.startReplaceGroup(-1633490746);
                                    zChanged8 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component3);
                                    objRememberedValue15 = composer2.rememberedValue();
                                    if (!zChanged8 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue15 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component3);
                                        composer2.updateRememberedValue(objRememberedValue15);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(percentageDisplay3, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), Color.m6701boximpl(jSeedTextColor), null, bold3, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk3), 0, false, 1, 0, null, 0, textM52, composer2, 805330944, 0, 7592);
                                    String percentageDisplay22 = bracketGameSeedData52.getPercentageDisplay();
                                    TextStyle textM62 = bentoTheme.getTypography(composer2, i7).getTextM();
                                    FontWeight bold22 = companion42.getBold();
                                    int iM7920getEnde0LSkKk22 = companion32.m7920getEnde0LSkKk();
                                    composer2.startReplaceGroup(-1633490746);
                                    zChanged9 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component4);
                                    objRememberedValue16 = composer2.rememberedValue();
                                    if (!zChanged9 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue16 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$9$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component4);
                                        composer2.updateRememberedValue(objRememberedValue16);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(percentageDisplay22, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), Color.m6701boximpl(jSeedTextColor2), null, bold22, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk22), 0, false, 1, 0, null, 0, textM62, composer2, 805330944, 0, 7592);
                                    composer2.endReplaceGroup();
                                    if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                        EffectsKt.SideEffect(function02, composer2, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        return;
                                    }
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
                                objRememberedValue17 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$1$1(horizontalAnchorCreateGuidelineFromTop, constraintLayoutBaseScope4Component3, verticalAnchorM8137createEndBarrier3ABfNKs$default);
                                composer2.updateRememberedValue(objRememberedValue17);
                                composer2.endReplaceGroup();
                                verticalAnchor2 = verticalAnchor;
                                BentoText2.m20747BentoText38GnDrw(displayId, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue17), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer2, 805306368, 0, 7672);
                                String displayId222 = bracketGameSeedData52.getDisplayId();
                                TextStyle textS222 = bentoTheme.getTypography(composer2, i7).getTextS();
                                long jM21427getFg30d7_KjU222 = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged2 = composer2.changed(horizontalAnchorCreateGuidelineFromTop) | composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(constraintLayoutBaseScope4Component4);
                                objRememberedValue9 = composer2.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue9 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(horizontalAnchorCreateGuidelineFromTop, verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component4);
                                    composer2.updateRememberedValue(objRememberedValue9);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(displayId222, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue9), Color.m6701boximpl(jM21427getFg30d7_KjU222), null, null, null, null, 0, false, 1, 0, null, 0, textS222, composer2, 805306368, 0, 7672);
                                String name32 = bracketGameSeedData3.getName();
                                TextStyle textM72 = bentoTheme.getTypography(composer2, i7).getTextM();
                                int iM7959getEllipsisgIe3tQ822 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged3 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                objRememberedValue10 = composer2.rememberedValue();
                                if (!zChanged3) {
                                    objRememberedValue10 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                    composer2.updateRememberedValue(objRememberedValue10);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(name32, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue10), Color.m6701boximpl(jSeedTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ822, false, 1, 0, null, 0, textM72, composer2, 817889280, 0, 7544);
                                String name222 = bracketGameSeedData52.getName();
                                TextStyle textM222 = bentoTheme.getTypography(composer2, i7).getTextM();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged4 = composer2.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer2.changed(verticalAnchor2) | composer2.changed(horizontalAnchorCreateGuidelineFromTop);
                                objRememberedValue11 = composer2.rememberedValue();
                                if (!zChanged4) {
                                    objRememberedValue11 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                                    composer2.updateRememberedValue(objRememberedValue11);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(name222, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue11), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM222, composer2, 805306368, 0, 7672);
                                score = bracketGameSeedData3.getScore();
                                if (score == null) {
                                }
                                TextStyle textM322 = bentoTheme.getTypography(composer2, i7).getTextM();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged5 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                                objRememberedValue12 = composer2.rememberedValue();
                                if (!zChanged5) {
                                    objRememberedValue12 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(z2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                    composer2.updateRememberedValue(objRememberedValue12);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(score, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue12), Color.m6701boximpl(jSeedTextColor), null, null, null, null, 0, false, 1, 0, null, 0, textM322, composer2, 805306368, 0, 7672);
                                score2 = bracketGameSeedData52.getScore();
                                if (score2 == null) {
                                }
                                TextStyle textM422 = bentoTheme.getTypography(composer2, i7).getTextM();
                                composer2.startReplaceGroup(-1746271574);
                                zChanged6 = composer2.changed(z2) | composer2.changed(constraintLayoutBaseScope4Component4) | composer2.changed(constraintLayoutBaseScope4Component9);
                                objRememberedValue13 = composer2.rememberedValue();
                                if (!zChanged6) {
                                    objRememberedValue13 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(z2, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component9);
                                    composer2.updateRememberedValue(objRememberedValue13);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(score2, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue13), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM422, composer2, 805306368, 0, 7672);
                                long jM21373getBg30d7_KjU22 = bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged7 = composer2.changed(z2) | composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                objRememberedValue14 = composer2.rememberedValue();
                                if (!zChanged7) {
                                    objRememberedValue14 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(z2, verticalAnchorM8141createGuidelineFromEnd0680j_4);
                                    composer2.updateRememberedValue(objRememberedValue14);
                                }
                                composer2.endReplaceGroup();
                                Divider5.m5852VerticalDivider9IZ8Weo(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue14), 0.0f, jM21373getBg30d7_KjU22, composer2, 0, 2);
                                String percentageDisplay32 = bracketGameSeedData3.getPercentageDisplay();
                                TextStyle textM522 = bentoTheme.getTypography(composer2, i7).getTextM();
                                TextAlign.Companion companion322 = TextAlign.INSTANCE;
                                int iM7920getEnde0LSkKk32 = companion322.m7920getEnde0LSkKk();
                                FontWeight.Companion companion422 = FontWeight.INSTANCE;
                                FontWeight bold32 = companion422.getBold();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged8 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component3);
                                objRememberedValue15 = composer2.rememberedValue();
                                if (!zChanged8) {
                                    objRememberedValue15 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component3);
                                    composer2.updateRememberedValue(objRememberedValue15);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(percentageDisplay32, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue15), Color.m6701boximpl(jSeedTextColor), null, bold32, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk32), 0, false, 1, 0, null, 0, textM522, composer2, 805330944, 0, 7592);
                                String percentageDisplay222 = bracketGameSeedData52.getPercentageDisplay();
                                TextStyle textM622 = bentoTheme.getTypography(composer2, i7).getTextM();
                                FontWeight bold222 = companion422.getBold();
                                int iM7920getEnde0LSkKk222 = companion322.m7920getEnde0LSkKk();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged9 = composer2.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer2.changed(constraintLayoutBaseScope4Component4);
                                objRememberedValue16 = composer2.rememberedValue();
                                if (!zChanged9) {
                                    objRememberedValue16 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$9$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component4);
                                    composer2.updateRememberedValue(objRememberedValue16);
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(percentageDisplay222, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue16), Color.m6701boximpl(jSeedTextColor2), null, bold222, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk222), 0, false, 1, 0, null, 0, textM622, composer2, 805330944, 0, 7592);
                                composer2.endReplaceGroup();
                                if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        bracketGameSeedData4 = bracketGameSeedData2;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void LockedDisplay(final String str, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1467696453);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1467696453, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.LockedDisplay (BracketMatchOverviewCard.kt:471)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1378113634);
                TwoLocksDisplay(str, modifier, composerStartRestartGroup, ((i3 >> 3) & 112) | (i3 & 14), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1378178238);
                SingleLockedDisplay(str, modifier, composerStartRestartGroup, ((i3 >> 3) & 112) | (i3 & 14), 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketMatchOverviewCardKt.LockedDisplay$lambda$19(str, z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SingleLockedDisplay(String str, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(458059985);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(458059985, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.SingleLockedDisplay (BracketMatchOverviewCard.kt:483)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            str2 = str;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.LOCK_24), str2, BracketStyle.INSTANCE.getLockColor(composerStartRestartGroup, 6), BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion.getCenter()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | ((i3 << 3) & 112), 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketMatchOverviewCardKt.SingleLockedDisplay$lambda$21(str2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TwoLocksDisplay(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271129061);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1271129061, i3, -1, "com.robinhood.android.futures.eventbrackets.ui.TwoLocksDisplay (BracketMatchOverviewCard.kt:500)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = Arrangement.INSTANCE.m5090spacedByD5KLDUw(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), companion.getCenterHorizontally());
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BracketMatchOverviewCardKt.TwoLocksDisplay$lambda$23$lambda$22(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LOCK_24;
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
                BracketStyle bracketStyle = BracketStyle.INSTANCE;
                long lockColor = bracketStyle.getLockColor(composerStartRestartGroup, 6);
                int i5 = BentoIcon4.Size24.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(size24, null, lockColor, null, null, false, composerStartRestartGroup, i5 | 48, 56);
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17135R.string.events_tournament_bracket_two_locks_card_vs, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2), null, bracketStyle.getLockColor(composerStartRestartGroup, 6), null, null, false, composerStartRestartGroup, i5 | 48, 56);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BracketMatchOverviewCardKt.TwoLocksDisplay$lambda$25(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            Arrangement.Horizontal horizontalM5090spacedByD5KLDUw2 = Arrangement.INSTANCE.m5090spacedByD5KLDUw(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), companion3.getCenterHorizontally());
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BracketMatchOverviewCardKt.TwoLocksDisplay$lambda$23$lambda$22(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw2, centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.LOCK_24;
                    BentoIcon4.Size24 size242 = new BentoIcon4.Size24(serverToBentoAssetMapper22);
                    BracketStyle bracketStyle2 = BracketStyle.INSTANCE;
                    long lockColor2 = bracketStyle2.getLockColor(composerStartRestartGroup, 6);
                    int i52 = BentoIcon4.Size24.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(size242, null, lockColor2, null, null, false, composerStartRestartGroup, i52 | 48, 56);
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17135R.string.events_tournament_bracket_two_locks_card_vs, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper22), null, bracketStyle2.getLockColor(composerStartRestartGroup, 6), null, null, false, composerStartRestartGroup, i52 | 48, 56);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoLocksDisplay$lambda$23$lambda$22(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    public static final RoundedCornerShape getCardShape() {
        return CardShape;
    }

    /* compiled from: BracketMatchOverviewCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$PreviewOverviewCard_day$1 */
    static final class C172051 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OverviewCardPreviewParameterProvider.Params $params;

        C172051(OverviewCardPreviewParameterProvider.Params params) {
            this.$params = params;
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
                ComposerKt.traceEventStart(2060226407, i, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewOverviewCard_day.<anonymous> (BracketMatchOverviewCard.kt:651)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            BracketGameOverviewCardData bracketGameOverviewCardData = new BracketGameOverviewCardData(uuidRandomUUID, this.$params.getSeed1(), this.$params.getSeed2(), this.$params.getGameStateDisplay(), this.$params.getState(), this.$params.getHasPosition(), this.$params.getPnlAmount(), false, 128, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$PreviewOverviewCard_day$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BracketMatchOverviewCardKt.BracketMatchOverviewCard(bracketGameOverviewCardData, (Function0) objRememberedValue, SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void PreviewOverviewCard_day(final OverviewCardPreviewParameterProvider.Params params, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1765200303);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(params) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1765200303, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewOverviewCard_day (BracketMatchOverviewCard.kt:649)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2060226407, true, new C172051(params), composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketMatchOverviewCardKt.PreviewOverviewCard_day$lambda$26(params, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BracketMatchOverviewCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$PreviewOverviewCard_night$1 */
    static final class C172061 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OverviewCardPreviewParameterProvider.Params $params;

        C172061(OverviewCardPreviewParameterProvider.Params params) {
            this.$params = params;
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
                ComposerKt.traceEventStart(-1615951645, i, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewOverviewCard_night.<anonymous> (BracketMatchOverviewCard.kt:675)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            BracketGameOverviewCardData bracketGameOverviewCardData = new BracketGameOverviewCardData(uuidRandomUUID, this.$params.getSeed1(), this.$params.getSeed2(), this.$params.getGameStateDisplay(), this.$params.getState(), this.$params.getHasPosition(), this.$params.getPnlAmount(), false, 128, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$PreviewOverviewCard_night$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BracketMatchOverviewCardKt.BracketMatchOverviewCard(bracketGameOverviewCardData, (Function0) objRememberedValue, SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void PreviewOverviewCard_night(final OverviewCardPreviewParameterProvider.Params params, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1668196053);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(params) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1668196053, i2, -1, "com.robinhood.android.futures.eventbrackets.ui.PreviewOverviewCard_night (BracketMatchOverviewCard.kt:673)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1615951645, true, new C172061(params), composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BracketMatchOverviewCardKt.PreviewOverviewCard_night$lambda$27(params, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
