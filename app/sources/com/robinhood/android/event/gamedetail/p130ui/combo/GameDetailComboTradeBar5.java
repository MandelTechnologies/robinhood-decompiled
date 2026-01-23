package com.robinhood.android.event.gamedetail.p130ui.combo;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBar5;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBarState;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.futures.sharedfuturesui.animations.CustomOutlineLoadingAnimatedButton;
import com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderDrawPill;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailComboTradeBar.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u000e2#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\u007f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a!\u0010 \u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010#\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0018X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"GameDetailComboTradeBar", "", "state", "Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;", "dismissWheelPicker", "Lkotlin/Function0;", "onPickerSelectionConfirmed", "openOrderForm", "Lkotlin/Function1;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "Lkotlin/ParameterName;", "name", "orderContext", "signAttestation", "Lkotlin/Function2;", "", "attestation", "startOnboarding", "Ljava/util/UUID;", "eventId", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FadeTweenDurationMs", "", "AnimatedTradeButtons", "(Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingPriceButton", "text", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLoadingPriceButton", "(Landroidx/compose/runtime/Composer;I)V", "ErrorMessage", "errorState", "Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState$ErrorState;", "(Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState$ErrorState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FadeAnimationDuration", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboTradeBar5 {
    private static final int FadeAnimationDuration = 300;
    private static final int FadeTweenDurationMs = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedTradeButtons$lambda$7(GameDetailComboTradeBarState gameDetailComboTradeBarState, Function0 function0, Function1 function1, Function2 function2, Function1 function12, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AnimatedTradeButtons(gameDetailComboTradeBarState, function0, function1, function2, function12, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorMessage$lambda$17(GameDetailComboTradeBarState.ErrorState errorState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ErrorMessage(errorState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboTradeBar$lambda$1(GameDetailComboTradeBarState gameDetailComboTradeBarState, Function0 function0, Function0 function02, Function1 function1, Function2 function2, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailComboTradeBar(gameDetailComboTradeBarState, function0, function02, function1, function2, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingPriceButton$lambda$11(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingPriceButton(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingPriceButton$lambda$12(int i, Composer composer, int i2) {
        PreviewLoadingPriceButton(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailComboTradeBar(final GameDetailComboTradeBarState state, final Function0<Unit> dismissWheelPicker, final Function0<Unit> onPickerSelectionConfirmed, final Function1<? super EventTradeOrderContext, Unit> openOrderForm, final Function2<? super String, ? super EventTradeOrderContext, Unit> signAttestation, final Function1<? super UUID, Unit> startOnboarding, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dismissWheelPicker, "dismissWheelPicker");
        Intrinsics.checkNotNullParameter(onPickerSelectionConfirmed, "onPickerSelectionConfirmed");
        Intrinsics.checkNotNullParameter(openOrderForm, "openOrderForm");
        Intrinsics.checkNotNullParameter(signAttestation, "signAttestation");
        Intrinsics.checkNotNullParameter(startOnboarding, "startOnboarding");
        Composer composerStartRestartGroup = composer.startRestartGroup(1432060163);
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
            i3 |= composerStartRestartGroup.changedInstance(dismissWheelPicker) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPickerSelectionConfirmed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openOrderForm) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(signAttestation) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(startOnboarding) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((i & 1572864) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1432060163, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBar (GameDetailComboTradeBar.kt:70)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                GameDetailComboTradeBarState.ErrorState error = state.getError();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ErrorMessage(error, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null), composerStartRestartGroup, StringResource.$stable, 0);
                int i6 = i3 >> 3;
                AnimatedTradeButtons(state, dismissWheelPicker, openOrderForm, signAttestation, startOnboarding, onPickerSelectionConfirmed, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, (i3 & 14) | 1572864 | (i3 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | ((i3 << 9) & 458752), 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboTradeBar5.GameDetailComboTradeBar$lambda$1(state, dismissWheelPicker, onPickerSelectionConfirmed, openOrderForm, signAttestation, startOnboarding, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                GameDetailComboTradeBarState.ErrorState error2 = state.getError();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                ErrorMessage(error2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 7, null), composerStartRestartGroup, StringResource.$stable, 0);
                int i62 = i3 >> 3;
                AnimatedTradeButtons(state, dismissWheelPicker, openOrderForm, signAttestation, startOnboarding, onPickerSelectionConfirmed, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), composerStartRestartGroup, (i3 & 14) | 1572864 | (i3 & 112) | (i62 & 896) | (i62 & 7168) | (i62 & 57344) | ((i3 << 9) & 458752), 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AnimatedTradeButtons(final GameDetailComboTradeBarState gameDetailComboTradeBarState, final Function0<Unit> function0, final Function1<? super EventTradeOrderContext, Unit> function1, final Function2<? super String, ? super EventTradeOrderContext, Unit> function2, final Function1<? super UUID, Unit> function12, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        Function1<? super EventTradeOrderContext, Unit> function13;
        Function2<? super String, ? super EventTradeOrderContext, Unit> function22;
        Function1<? super UUID, Unit> function14;
        Function0<Unit> function04;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-433055487);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gameDetailComboTradeBarState) : composerStartRestartGroup.changedInstance(gameDetailComboTradeBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function13 = function1;
        } else {
            function13 = function1;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function14 = function12;
        } else {
            function14 = function12;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            function04 = function02;
        } else {
            function04 = function02;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
            }
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-433055487, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.AnimatedTradeButtons (GameDetailComboTradeBar.kt:108)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailComboTradeBar5.AnimatedTradeButtons$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function15 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailComboTradeBar5.AnimatedTradeButtons$lambda$6$lambda$5((GameDetailComboTradeBarState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                AnimatedContentKt.AnimatedContent(gameDetailComboTradeBarState, modifier3, function15, null, null, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(2125425777, true, new C163843(function03, function13, function22, function14, function04), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1769856 | ((i3 >> 15) & 112), 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboTradeBar5.AnimatedTradeButtons$lambda$7(gameDetailComboTradeBarState, function0, function1, function2, function12, function02, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            Function1 function152 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            AnimatedContentKt.AnimatedContent(gameDetailComboTradeBarState, modifier3, function152, null, null, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(2125425777, true, new C163843(function03, function13, function22, function14, function04), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1769856 | ((i3 >> 15) & 112), 24);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnimatedTradeButtons$lambda$6$lambda$5(GameDetailComboTradeBarState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ImmutableList<TradeButton> buttons = it.getButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        Iterator<TradeButton> it2 = buttons.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().getStyle()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform AnimatedTradeButtons$lambda$3$lambda$2(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.8f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.8f, 0L, 4, null)));
    }

    /* compiled from: GameDetailComboTradeBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$AnimatedTradeButtons$3 */
    static final class C163843 implements Function4<AnimatedContentScope, GameDetailComboTradeBarState, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $dismissWheelPicker;
        final /* synthetic */ Function0<Unit> $onPickerSelectionConfirmed;
        final /* synthetic */ Function1<EventTradeOrderContext, Unit> $openOrderForm;
        final /* synthetic */ Function2<String, EventTradeOrderContext, Unit> $signAttestation;
        final /* synthetic */ Function1<UUID, Unit> $startOnboarding;

        /* JADX WARN: Multi-variable type inference failed */
        C163843(Function0<Unit> function0, Function1<? super EventTradeOrderContext, Unit> function1, Function2<? super String, ? super EventTradeOrderContext, Unit> function2, Function1<? super UUID, Unit> function12, Function0<Unit> function02) {
            this.$dismissWheelPicker = function0;
            this.$openOrderForm = function1;
            this.$signAttestation = function2;
            this.$startOnboarding = function12;
            this.$onPickerSelectionConfirmed = function02;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, GameDetailComboTradeBarState gameDetailComboTradeBarState, Composer composer, Integer num) {
            invoke(animatedContentScope, gameDetailComboTradeBarState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x03cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(AnimatedContentScope AnimatedContent, GameDetailComboTradeBarState animatedState, Composer composer, int i) {
            int i2;
            Object obj;
            TradeButton tradeButton;
            Function1<UUID, Unit> function1;
            Function0<Unit> function0;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(animatedState, "animatedState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125425777, i, -1, "com.robinhood.android.event.gamedetail.ui.combo.AnimatedTradeButtons.<anonymous> (GameDetailComboTradeBar.kt:123)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            float fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM();
            Alignment.Companion companion = Alignment.INSTANCE;
            Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = arrangement.m5090spacedByD5KLDUw(fM21593getSmallD9Ej5fM, companion.getCenterHorizontally());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            final Function0<Unit> function02 = this.$dismissWheelPicker;
            final Function1<EventTradeOrderContext, Unit> function12 = this.$openOrderForm;
            final Function2<String, EventTradeOrderContext, Unit> function2 = this.$signAttestation;
            Function1<UUID, Unit> function13 = this.$startOnboarding;
            Function0<Unit> function03 = this.$onPickerSelectionConfirmed;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, companion.getTop(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ImmutableList<TradeButton> buttons = animatedState.getButtons();
            composer2.startReplaceGroup(-430131407);
            for (final TradeButton tradeButton2 : buttons) {
                if (Intrinsics.areEqual(tradeButton2.getStyle(), TradeButton.Style.GettingPriceLoading.INSTANCE)) {
                    composer2.startReplaceGroup(-449167294);
                    GameDetailComboTradeBar5.LoadingPriceButton(StringResources6.getTextAsString(tradeButton2.getLabel(), composer2, StringResource.$stable), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 48, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-448874251);
                    StringResource label = tradeButton2.getLabel();
                    int i3 = StringResource.$stable;
                    String textAsString = StringResources6.getTextAsString(label, composer2, i3);
                    boolean loading = tradeButton2.getLoading();
                    BentoButtons.Type buttonType = tradeButton2.getButtonType();
                    TradeButton.ButtonColorOverrides buttonColorOverrides = tradeButton2.getButtonColorOverrides(composer2, 0);
                    Color colorM14174getBackgroundColorOverrideQN2ZGVo = buttonColorOverrides != null ? buttonColorOverrides.m14174getBackgroundColorOverrideQN2ZGVo() : null;
                    TradeButton.ButtonColorOverrides buttonColorOverrides2 = tradeButton2.getButtonColorOverrides(composer2, 0);
                    Color colorM14176getTextColorOverrideQN2ZGVo = buttonColorOverrides2 != null ? buttonColorOverrides2.m14176getTextColorOverrideQN2ZGVo() : null;
                    TradeButton.ButtonColorOverrides buttonColorOverrides3 = tradeButton2.getButtonColorOverrides(composer2, 0);
                    BentoButtonState bentoButtonState = new BentoButtonState(textAsString, (BentoButtons.Icon.Size16) null, buttonType, tradeButton2.getEnabled(), loading, colorM14174getBackgroundColorOverrideQN2ZGVo, colorM14176getTextColorOverrideQN2ZGVo, buttonColorOverrides3 != null ? buttonColorOverrides3.m14175getBorderColorOverrideQN2ZGVo() : null, (TextStyle) null, (Color) null, false, 1794, (DefaultConstructorMarker) null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer2.changedInstance(tradeButton2) | composer2.changed(function02) | composer2.changed(function12) | composer2.changed(function2) | composer2.changed(function13) | composer2.changed(function03);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        i2 = i3;
                        final Function1<UUID, Unit> function14 = function13;
                        final Function0<Unit> function04 = function03;
                        obj = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$AnimatedTradeButtons$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GameDetailComboTradeBar5.C163843.invoke$lambda$3$lambda$1$lambda$0(tradeButton2, function02, function12, function2, function14, function04);
                            }
                        };
                        tradeButton = tradeButton2;
                        function1 = function14;
                        function0 = function04;
                        composer2.updateRememberedValue(obj);
                    } else {
                        function0 = function03;
                        i2 = i3;
                        obj = objRememberedValue;
                        tradeButton = tradeButton2;
                        function1 = function13;
                    }
                    Function0 function05 = (Function0) obj;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-430057930);
                    Row6 row62 = row6;
                    Modifier modifierWeight$default = Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null);
                    String loggingIdentifier = tradeButton.getLoggingIdentifier();
                    if (loggingIdentifier != null) {
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierWeight$default, new UserInteractionEventDescriptor(loggingIdentifier, null, null, new Context(0, 0, 0, StringResources6.getTextAsString(tradeButton.getLabel(), composer2, i2), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, loggingIdentifier, null, 4, null), null, 38, null), false, false, false, true, false, null, 110, null);
                        Modifier modifier = modifierAutoLogEvents$default == null ? modifierWeight$default : modifierAutoLogEvents$default;
                        composer2.endReplaceGroup();
                        BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) function05, modifier, (String) null, composer2, BentoButtonState.$stable, 8);
                        composer.endReplaceGroup();
                        composer2 = composer;
                        function13 = function1;
                        row6 = row62;
                        function03 = function0;
                    }
                }
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$1$lambda$0(TradeButton tradeButton, Function0 function0, Function1 function1, Function2 function2, Function1 function12, Function0 function02) {
            TradeButton.Action action = tradeButton.getAction();
            if (Intrinsics.areEqual(action, TradeButton.Action.DismissWheelPicker.INSTANCE)) {
                function0.invoke();
            } else if (action instanceof TradeButton.Action.OpenOrderForm) {
                function1.invoke(((TradeButton.Action.OpenOrderForm) tradeButton.getAction()).getOrderContext());
            } else {
                if (action instanceof TradeButton.Action.SelectContract) {
                    throw new IllegalStateException("Not valid for combos");
                }
                if (action instanceof TradeButton.Action.SignAttestation) {
                    function2.invoke(((TradeButton.Action.SignAttestation) tradeButton.getAction()).getAttestationType(), ((TradeButton.Action.SignAttestation) tradeButton.getAction()).getOrderContext());
                } else if (action instanceof TradeButton.Action.StartOnboarding) {
                    function12.invoke(((TradeButton.Action.StartOnboarding) tradeButton.getAction()).getEventId());
                } else if (Intrinsics.areEqual(action, TradeButton.Action.ConfirmWheelPickerSelection.INSTANCE)) {
                    function02.invoke();
                } else if (action != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadingPriceButton(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(761811356);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(761811356, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.LoadingPriceButton (GameDetailComboTradeBar.kt:200)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                SolidColor solidColor = new SolidColor(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), null);
                float f = 1;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(f);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new PillLoadingPlaceholderDrawPill() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$LoadingPriceButton$1$1
                        @Override // com.robinhood.android.futures.sharedfuturesui.animations.PillLoadingPlaceholderDrawPill
                        /* renamed from: drawPill-iUh5c1k, reason: not valid java name */
                        public final void mo14256drawPilliUh5c1k(DrawScope PillLoadingPlaceholderDrawPill, float f2, long j, float f3, long j2) {
                            Intrinsics.checkNotNullParameter(PillLoadingPlaceholderDrawPill, "$this$PillLoadingPlaceholderDrawPill");
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (PillLoadingPlaceholderDrawPill.mo6963getSizeNHjbRc() >> 32)) * 2) / 3;
                            DrawScope.m6952drawOvalAsUm42w$default(PillLoadingPlaceholderDrawPill, Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j2)), Tuples4.m3642to(Float.valueOf(0.05f), Color.m6701boximpl(j2)), Tuples4.m3642to(Float.valueOf(0.3f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.7f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j2, 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()))}, j, f3 * 10, 0, 8, (Object) null), Offset.m6546minusMKHz9U(j, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat / r3) << 32) | (Float.floatToRawIntBits(f2 / r3) & 4294967295L))), Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(f2))), 0.0f, null, null, BlendMode.INSTANCE.m6667getSrcAtop0nO6VwU(), 56, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill = (PillLoadingPlaceholderDrawPill) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                CustomOutlineLoadingAnimatedButton.m14739CustomOutlineLoadingAnimatedButtonbQD1wOU(str, jM21426getFg20d7_KjU, true, false, (Function0) objRememberedValue2, modifier3, null, null, solidColor, fM7995constructorimpl2, fM7995constructorimpl, 0L, pillLoadingPlaceholderDrawPill, 2000, composer2, (i3 & 14) | 805334400 | ((i3 << 12) & 458752), 3078, 2240);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboTradeBar5.LoadingPriceButton$lambda$11(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU();
            SolidColor solidColor2 = new SolidColor(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), null);
            float f2 = 1;
            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(f2);
            float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(f2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill2 = (PillLoadingPlaceholderDrawPill) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            CustomOutlineLoadingAnimatedButton.m14739CustomOutlineLoadingAnimatedButtonbQD1wOU(str, jM21426getFg20d7_KjU2, true, false, (Function0) objRememberedValue2, modifier3, null, null, solidColor2, fM7995constructorimpl22, fM7995constructorimpl3, 0L, pillLoadingPlaceholderDrawPill2, 2000, composer2, (i3 & 14) | 805334400 | ((i3 << 12) & 458752), 3078, 2240);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewLoadingPriceButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(754293860);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(754293860, i, -1, "com.robinhood.android.event.gamedetail.ui.combo.PreviewLoadingPriceButton (GameDetailComboTradeBar.kt:236)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, GameDetailComboTradeBar.INSTANCE.getLambda$1522464284$feature_game_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailComboTradeBar5.PreviewLoadingPriceButton$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorMessage(GameDetailComboTradeBarState.ErrorState errorState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final GameDetailComboTradeBarState.ErrorState errorState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-711289580);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(errorState) : composerStartRestartGroup.changedInstance(errorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            errorState2 = errorState;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-711289580, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.ErrorMessage (GameDetailComboTradeBar.kt:248)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboTradeBar5.ErrorMessage$lambda$16$lambda$15((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            errorState2 = errorState;
            AnimatedContentKt.AnimatedContent(errorState2, modifier2, (Function1) objRememberedValue, null, null, null, GameDetailComboTradeBar.INSTANCE.m14251getLambda$1895468266$feature_game_detail_externalDebug(), composerStartRestartGroup, 1573248 | StringResource.$stable | (i3 & 14) | (i3 & 112), 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailComboTradeBar5.ErrorMessage$lambda$17(errorState2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ErrorMessage$lambda$16$lambda$15(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(GameDetailComboTradeBar5.ErrorMessage$lambda$16$lambda$15$lambda$13(((Integer) obj).intValue()));
            }
        }, 1, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboTradeBarKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(GameDetailComboTradeBar5.ErrorMessage$lambda$16$lambda$15$lambda$14(((Integer) obj).intValue()));
            }
        }, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ErrorMessage$lambda$16$lambda$15$lambda$13(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ErrorMessage$lambda$16$lambda$15$lambda$14(int i) {
        return i / 2;
    }
}
