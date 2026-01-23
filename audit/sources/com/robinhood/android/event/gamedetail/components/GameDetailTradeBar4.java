package com.robinhood.android.event.gamedetail.components;

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
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Spacer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailTradeBar.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001aó\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u000726\u0010\f\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\r26\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\r2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010!\u001a\u0017\u0010$\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010%\"\u000e\u0010\"\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"GameDetailTradeBar", "", "tradeBarState", "Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "dismissTradeSlip", "Lkotlin/Function0;", "openOrderForm", "Lkotlin/Function1;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "Lkotlin/ParameterName;", "name", "orderContext", "selectContract", "Lkotlin/Function2;", "Ljava/util/UUID;", "contractId", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "side", "signAttestation", "", "attestation", "startOnboarding", "eventId", "onShowDisabledTradeButtonMessage", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionalTradeButtonDisabledMessage", "showDisabledDescription", "", "isWheelPickerVisible", "(ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisabledMessageWithAdjustedPadding", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FadeAnimationDuration", "", "DisabledMessageText", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailTradeBar4 {
    private static final int FadeAnimationDuration = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledMessageText$lambda$20(Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisabledMessageText(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledMessageWithAdjustedPadding$lambda$19(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisabledMessageWithAdjustedPadding(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeBar$lambda$9(GameDetailTradeBarState gameDetailTradeBarState, Function0 function0, Function1 function1, Function2 function2, Function2 function22, Function1 function12, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailTradeBar(gameDetailTradeBarState, function0, function1, function2, function22, function12, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalTradeButtonDisabledMessage$lambda$10(boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionalTradeButtonDisabledMessage(z, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailTradeBar(final GameDetailTradeBarState tradeBarState, final Function0<Unit> dismissTradeSlip, final Function1<? super EventTradeOrderContext, Unit> openOrderForm, final Function2<? super UUID, ? super ContractSide, Unit> selectContract, final Function2<? super String, ? super EventTradeOrderContext, Unit> signAttestation, final Function1<? super UUID, Unit> startOnboarding, final Function0<Unit> onShowDisabledTradeButtonMessage, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float fM21590getDefaultD9Ej5fM;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tradeBarState, "tradeBarState");
        Intrinsics.checkNotNullParameter(dismissTradeSlip, "dismissTradeSlip");
        Intrinsics.checkNotNullParameter(openOrderForm, "openOrderForm");
        Intrinsics.checkNotNullParameter(selectContract, "selectContract");
        Intrinsics.checkNotNullParameter(signAttestation, "signAttestation");
        Intrinsics.checkNotNullParameter(startOnboarding, "startOnboarding");
        Intrinsics.checkNotNullParameter(onShowDisabledTradeButtonMessage, "onShowDisabledTradeButtonMessage");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1302621845);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(tradeBarState) : composerStartRestartGroup.changedInstance(tradeBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismissTradeSlip) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(openOrderForm) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(selectContract) ? 2048 : 1024;
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
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowDisabledTradeButtonMessage) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1302621845, i3, -1, "com.robinhood.android.event.gamedetail.components.GameDetailTradeBar (GameDetailTradeBar.kt:60)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1984088745);
                if (tradeBarState.isWheelPickerVisible()) {
                    fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM();
                } else {
                    fM21590getDefaultD9Ej5fM = C2002Dp.m7995constructorimpl(0);
                }
                composerStartRestartGroup.endReplaceGroup();
                float fM21590getDefaultD9Ej5fM2 = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM();
                modifier3 = modifier4;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierM4872backgroundbw27NRU$default, fM21590getDefaultD9Ej5fM, fM21590getDefaultD9Ej5fM2, composerStartRestartGroup, 0, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Boolean boolValueOf = Boolean.valueOf(tradeBarState.getShowDisabledDescription());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailTradeBar4.GameDetailTradeBar$lambda$8$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-2142817628, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$GameDetailTradeBar$1$2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2142817628, i6, -1, "com.robinhood.android.event.gamedetail.components.GameDetailTradeBar.<anonymous>.<anonymous> (GameDetailTradeBar.kt:79)");
                        }
                        GameDetailTradeBar4.OptionalTradeButtonDisabledMessage(z, tradeBarState.isWheelPickerVisible(), null, composer3, (i6 >> 3) & 14, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
                ImmutableList<TradeButton> buttons = tradeBarState.getButtons();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailTradeBar4.GameDetailTradeBar$lambda$8$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailTradeBar4.GameDetailTradeBar$lambda$8$lambda$7$lambda$6((ImmutableList) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                AnimatedContentKt.AnimatedContent(buttons, null, function1, null, "tradeBarButtons", (Function1) objRememberedValue3, ComposableLambda3.rememberComposableLambda(573788019, true, new GameDetailTradeBar6(tradeBarState, onShowDisabledTradeButtonMessage, dismissTradeSlip, openOrderForm, selectContract, signAttestation, startOnboarding), composerStartRestartGroup, 54), composer2, 1794432, 10);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailTradeBar4.GameDetailTradeBar$lambda$9(tradeBarState, dismissTradeSlip, openOrderForm, selectContract, signAttestation, startOnboarding, onShowDisabledTradeButtonMessage, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((4793491 & i3) == 4793490) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1984088745);
            if (tradeBarState.isWheelPickerVisible()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            float fM21590getDefaultD9Ej5fM22 = bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM();
            modifier3 = modifier4;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierM4872backgroundbw27NRU$default2, fM21590getDefaultD9Ej5fM, fM21590getDefaultD9Ej5fM22, composerStartRestartGroup, 0, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g02);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Boolean boolValueOf2 = Boolean.valueOf(tradeBarState.getShowDisabledDescription());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(boolValueOf2, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-2142817628, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$GameDetailTradeBar$1$2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2142817628, i6, -1, "com.robinhood.android.event.gamedetail.components.GameDetailTradeBar.<anonymous>.<anonymous> (GameDetailTradeBar.kt:79)");
                        }
                        GameDetailTradeBar4.OptionalTradeButtonDisabledMessage(z, tradeBarState.isWheelPickerVisible(), null, composer3, (i6 >> 3) & 14, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
                ImmutableList<TradeButton> buttons2 = tradeBarState.getButtons();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                AnimatedContentKt.AnimatedContent(buttons2, null, function12, null, "tradeBarButtons", (Function1) objRememberedValue3, ComposableLambda3.rememberComposableLambda(573788019, true, new GameDetailTradeBar6(tradeBarState, onShowDisabledTradeButtonMessage, dismissTradeSlip, openOrderForm, selectContract, signAttestation, startOnboarding), composerStartRestartGroup, 54), composer2, 1794432, 10);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform GameDetailTradeBar$lambda$8$lambda$3$lambda$2(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(GameDetailTradeBar4.GameDetailTradeBar$lambda$8$lambda$3$lambda$2$lambda$0(((Integer) obj).intValue()));
            }
        }, 1, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(GameDetailTradeBar4.GameDetailTradeBar$lambda$8$lambda$3$lambda$2$lambda$1(((Integer) obj).intValue()));
            }
        }, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GameDetailTradeBar$lambda$8$lambda$3$lambda$2$lambda$0(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GameDetailTradeBar$lambda$8$lambda$3$lambda$2$lambda$1(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object GameDetailTradeBar$lambda$8$lambda$7$lambda$6(ImmutableList button) {
        Intrinsics.checkNotNullParameter(button, "button");
        return Integer.valueOf(button.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform GameDetailTradeBar$lambda$8$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.8f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.8f, 0L, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionalTradeButtonDisabledMessage(final boolean z, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1307878511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
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
                ComposerKt.traceEventStart(-1307878511, i3, -1, "com.robinhood.android.event.gamedetail.components.OptionalTradeButtonDisabledMessage (GameDetailTradeBar.kt:182)");
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1554175678);
                DisabledMessageWithAdjustedPadding(z, modifier, composerStartRestartGroup, ((i3 >> 3) & 112) | (i3 & 14), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceGroup(1554181296);
                DisabledMessageText(modifier, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(935046417);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailTradeBar4.OptionalTradeButtonDisabledMessage$lambda$10(z, z2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DisabledMessageWithAdjustedPadding(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1184607632);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
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
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1184607632, i3, -1, "com.robinhood.android.event.gamedetail.components.DisabledMessageWithAdjustedPadding (GameDetailTradeBar.kt:199)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailTradeBar4.DisabledMessageWithAdjustedPadding$lambda$18$lambda$17(z, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailTradeBar4.DisabledMessageWithAdjustedPadding$lambda$19(z, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult DisabledMessageWithAdjustedPadding$lambda$18$lambda$17(final boolean z, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose("disabledMessage", GameDetailTradeBar.INSTANCE.m14191getLambda$763378561$feature_game_detail_externalDebug());
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(Spacer.f10659type, GameDetailTradeBar.INSTANCE.getLambda$1316791473$feature_game_detail_externalDebug());
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose2, 10));
        Iterator<T> it2 = listSubcompose2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Measurable) it2.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int height = ((Placeable) it3.next()).getHeight();
        while (it3.hasNext()) {
            int height2 = ((Placeable) it3.next()).getHeight();
            if (height < height2) {
                height = height2;
            }
        }
        Iterator it4 = arrayList2.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        int height3 = ((Placeable) it4.next()).getHeight();
        while (it4.hasNext()) {
            int height4 = ((Placeable) it4.next()).getHeight();
            if (height3 < height4) {
                height3 = height4;
            }
        }
        return MeasureScope.layout$default(SubcomposeLayout, Constraints.m7975getMaxWidthimpl(constraints.getValue()), Math.max(height, height3), null, new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailTradeBar4.DisabledMessageWithAdjustedPadding$lambda$18$lambda$17$lambda$16(z, arrayList, arrayList2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledMessageWithAdjustedPadding$lambda$18$lambda$17$lambda$16(boolean z, List list, List list2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (!z) {
            list = list2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisabledMessageText(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(498993186);
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
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(498993186, i3, -1, "com.robinhood.android.event.gamedetail.components.DisabledMessageText (GameDetailTradeBar.kt:227)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C16283R.string.trade_button_disabled_label, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailTradeBar4.DisabledMessageText$lambda$20(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
