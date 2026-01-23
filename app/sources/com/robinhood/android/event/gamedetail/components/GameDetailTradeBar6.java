package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.TradeButton;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailTradeBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$GameDetailTradeBar$1$5, reason: use source file name */
/* loaded from: classes3.dex */
final class GameDetailTradeBar6 implements Function4<AnimatedContentScope, ImmutableList<? extends TradeButton>, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $dismissTradeSlip;
    final /* synthetic */ Function0<Unit> $onShowDisabledTradeButtonMessage;
    final /* synthetic */ Function1<EventTradeOrderContext, Unit> $openOrderForm;
    final /* synthetic */ Function2<UUID, ContractSide, Unit> $selectContract;
    final /* synthetic */ Function2<String, EventTradeOrderContext, Unit> $signAttestation;
    final /* synthetic */ Function1<UUID, Unit> $startOnboarding;
    final /* synthetic */ GameDetailTradeBarState $tradeBarState;

    /* JADX WARN: Multi-variable type inference failed */
    GameDetailTradeBar6(GameDetailTradeBarState gameDetailTradeBarState, Function0<Unit> function0, Function0<Unit> function02, Function1<? super EventTradeOrderContext, Unit> function1, Function2<? super UUID, ? super ContractSide, Unit> function2, Function2<? super String, ? super EventTradeOrderContext, Unit> function22, Function1<? super UUID, Unit> function12) {
        this.$tradeBarState = gameDetailTradeBarState;
        this.$onShowDisabledTradeButtonMessage = function0;
        this.$dismissTradeSlip = function02;
        this.$openOrderForm = function1;
        this.$selectContract = function2;
        this.$signAttestation = function22;
        this.$startOnboarding = function12;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ImmutableList<? extends TradeButton> immutableList, Composer composer, Integer num) {
        invoke(animatedContentScope, (ImmutableList<TradeButton>) immutableList, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(AnimatedContentScope AnimatedContent, ImmutableList<TradeButton> animatedButtons, Composer composer, int i) {
        Object obj;
        int i2;
        TradeButton tradeButton;
        Function2<String, EventTradeOrderContext, Unit> function2;
        Function1<UUID, Unit> function1;
        Modifier modifier;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(animatedButtons, "animatedButtons");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(573788019, i, -1, "com.robinhood.android.event.gamedetail.components.GameDetailTradeBar.<anonymous>.<anonymous> (GameDetailTradeBar.kt:99)");
        }
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM());
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        final GameDetailTradeBarState gameDetailTradeBarState = this.$tradeBarState;
        final Function0<Unit> function0 = this.$onShowDisabledTradeButtonMessage;
        final Function0<Unit> function02 = this.$dismissTradeSlip;
        final Function1<EventTradeOrderContext, Unit> function12 = this.$openOrderForm;
        final Function2<UUID, ContractSide, Unit> function22 = this.$selectContract;
        Function2<String, EventTradeOrderContext, Unit> function23 = this.$signAttestation;
        Function1<UUID, Unit> function13 = this.$startOnboarding;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
        composer2.startReplaceGroup(1800739277);
        Composer composer3 = composer2;
        for (final TradeButton tradeButton2 : animatedButtons) {
            StringResource label = tradeButton2.getLabel();
            int i3 = StringResource.$stable;
            String textAsString = StringResources6.getTextAsString(label, composer3, i3);
            boolean loading = tradeButton2.getLoading();
            BentoButtons.Type buttonType = tradeButton2.getButtonType();
            TradeButton.ButtonColorOverrides buttonColorOverrides = tradeButton2.getButtonColorOverrides(composer3, 0);
            Color colorM14174getBackgroundColorOverrideQN2ZGVo = buttonColorOverrides != null ? buttonColorOverrides.m14174getBackgroundColorOverrideQN2ZGVo() : null;
            TradeButton.ButtonColorOverrides buttonColorOverrides2 = tradeButton2.getButtonColorOverrides(composer3, 0);
            Color colorM14176getTextColorOverrideQN2ZGVo = buttonColorOverrides2 != null ? buttonColorOverrides2.m14176getTextColorOverrideQN2ZGVo() : null;
            TradeButton.ButtonColorOverrides buttonColorOverrides3 = tradeButton2.getButtonColorOverrides(composer3, 0);
            BentoButtonState bentoButtonState = new BentoButtonState(textAsString, (BentoButtons.Icon.Size16) null, buttonType, false, loading, colorM14174getBackgroundColorOverrideQN2ZGVo, colorM14176getTextColorOverrideQN2ZGVo, buttonColorOverrides3 != null ? buttonColorOverrides3.m14175getBorderColorOverrideQN2ZGVo() : null, (TextStyle) null, (Color) null, false, 1802, (DefaultConstructorMarker) null);
            composer3.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer3.changedInstance(tradeButton2) | composer3.changedInstance(gameDetailTradeBarState) | composer3.changed(function0) | composer3.changed(function02) | composer3.changed(function12) | composer3.changed(function22) | composer3.changed(function23) | composer3.changed(function13);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function2<String, EventTradeOrderContext, Unit> function24 = function23;
                final Function1<UUID, Unit> function14 = function13;
                i2 = 0;
                obj = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailTradeBarKt$GameDetailTradeBar$1$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailTradeBar6.invoke$lambda$4$lambda$3$lambda$1$lambda$0(tradeButton2, gameDetailTradeBarState, function0, function02, function12, function22, function24, function14);
                    }
                };
                tradeButton = tradeButton2;
                function2 = function24;
                function1 = function14;
                composer3.updateRememberedValue(obj);
            } else {
                function2 = function23;
                tradeButton = tradeButton2;
                obj = objRememberedValue;
                function1 = function13;
                i2 = 0;
            }
            Function0 function03 = (Function0) obj;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(1800820208);
            Row6 row62 = row6;
            Modifier modifierWeight$default = Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(i2)), 1.0f, false, 2, null);
            String loggingIdentifier = tradeButton.getLoggingIdentifier();
            if (loggingIdentifier != null) {
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierWeight$default, new UserInteractionEventDescriptor(loggingIdentifier, null, null, new Context(0, 0, 0, StringResources6.getTextAsString(tradeButton.getLabel(), composer3, i3), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, loggingIdentifier, null, 4, null), null, 38, null), false, false, false, true, false, null, 110, null);
                modifier = modifierAutoLogEvents$default == null ? modifierWeight$default : modifierAutoLogEvents$default;
            }
            composer3.endReplaceGroup();
            BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) function03, modifier, (String) null, composer3, BentoButtonState.$stable, 8);
            composer3 = composer;
            function23 = function2;
            row6 = row62;
            function13 = function1;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$1$lambda$0(TradeButton tradeButton, GameDetailTradeBarState gameDetailTradeBarState, Function0 function0, Function0 function02, Function1 function1, Function2 function2, Function2 function22, Function1 function12) {
        if (!tradeButton.getEnabled()) {
            if (!gameDetailTradeBarState.isWheelPickerVisible() && !gameDetailTradeBarState.getShowDisabledDescription()) {
                function0.invoke();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        TradeButton.Action action = tradeButton.getAction();
        if (Intrinsics.areEqual(action, TradeButton.Action.DismissWheelPicker.INSTANCE)) {
            function02.invoke();
        } else if (action instanceof TradeButton.Action.OpenOrderForm) {
            function1.invoke(((TradeButton.Action.OpenOrderForm) tradeButton.getAction()).getOrderContext());
        } else if (action instanceof TradeButton.Action.SelectContract) {
            function2.invoke(((TradeButton.Action.SelectContract) tradeButton.getAction()).getContractId(), ((TradeButton.Action.SelectContract) tradeButton.getAction()).getSide());
        } else if (action instanceof TradeButton.Action.SignAttestation) {
            function22.invoke(((TradeButton.Action.SignAttestation) tradeButton.getAction()).getAttestationType(), ((TradeButton.Action.SignAttestation) tradeButton.getAction()).getOrderContext());
        } else if (action instanceof TradeButton.Action.StartOnboarding) {
            function12.invoke(((TradeButton.Action.StartOnboarding) tradeButton.getAction()).getEventId());
        } else {
            if (Intrinsics.areEqual(action, TradeButton.Action.ConfirmWheelPickerSelection.INSTANCE)) {
                throw new IllegalStateException("Not expected for v1");
            }
            if (action != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
