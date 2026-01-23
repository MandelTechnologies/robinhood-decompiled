package com.robinhood.android.event.detail.p129ui.dialog;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
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
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EventContractsPositionContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventTradeOverlayDialog.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#\"\u001a\u0010&\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u001a\u0010(\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u0014\u0010+\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061²\u0006\u000e\u0010.\u001a\u00020-8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m3636d2 = {"", "scale", "Landroidx/compose/ui/graphics/TransformOrigin;", "origin", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "content", "StretchIn-twVAp8k", "(FJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "StretchIn", "Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "state", "cardScale", "cardTransformOrigin", "EventTradeDialogCardContent-RYX2cs4", "(Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;FJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventTradeDialogCardContent", "Lkotlin/Function1;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState$Metadata;", "onTradeClicked", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventDescriptor", "EventTradeDialogTradeButtons", "(Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onDismiss", "EventTradeDialogDismissButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventTradeOverlayDialog", "(Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "EventTradeDialogDismissButtonSize", "F", "getEventTradeDialogDismissButtonSize", "()F", "EventTradeDialogBoxSize", "getEventTradeDialogBoxSize", "EventTradeDialogContentSize", "getEventTradeDialogContentSize", "EventTradeDialogButtonsHeight", "getEventTradeDialogButtonsHeight", "", "EventTradeDialogAnimationDuration", "I", "", "isVisible", "topContentHeightPx", "dismissTopPx", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventTradeOverlayDialog4 {
    public static final int EventTradeDialogAnimationDuration = 500;
    private static final float EventTradeDialogDismissButtonSize = C2002Dp.m7995constructorimpl(44);
    private static final float EventTradeDialogBoxSize = C2002Dp.m7995constructorimpl(20);
    private static final float EventTradeDialogContentSize = C2002Dp.m7995constructorimpl(150);
    private static final float EventTradeDialogButtonsHeight = C2002Dp.m7995constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTradeDialogCardContent_RYX2cs4$lambda$3(EventTradeOverlayDialogData eventTradeOverlayDialogData, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14156EventTradeDialogCardContentRYX2cs4(eventTradeOverlayDialogData, f, j, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTradeDialogDismissButton$lambda$10(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventTradeDialogDismissButton(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTradeDialogTradeButtons$lambda$9(EventTradeOverlayDialogData eventTradeOverlayDialogData, Function1 function1, UserInteractionEventDescriptor userInteractionEventDescriptor, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventTradeDialogTradeButtons(eventTradeOverlayDialogData, function1, userInteractionEventDescriptor, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTradeOverlayDialog$lambda$16(EventTradeOverlayDialogData eventTradeOverlayDialogData, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventTradeOverlayDialog(eventTradeOverlayDialogData, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StretchIn_twVAp8k$lambda$1(float f, long j, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m14157StretchIntwVAp8k(f, j, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: EventTradeOverlayDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeOverlayDialog$2 */
    static final class C162202 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ SnapshotState<Boolean> $isVisible$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function1<ContractSelectorButtonViewState.Metadata, Unit> $onTradeClicked;
        final /* synthetic */ EventTradeOverlayDialogData $state;
        final /* synthetic */ float $verticalOffset;

        /* JADX WARN: Multi-variable type inference failed */
        C162202(Modifier modifier, EventTradeOverlayDialogData eventTradeOverlayDialogData, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function0, float f, SnapshotState<Boolean> snapshotState, Function1<? super ContractSelectorButtonViewState.Metadata, Unit> function1) {
            this.$modifier = modifier;
            this.$state = eventTradeOverlayDialogData;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$onDismiss = function0;
            this.$verticalOffset = f;
            this.$isVisible$delegate = snapshotState;
            this.$onTradeClicked = function1;
        }

        public final void invoke(Composer composer, int i) {
            float fM7995constructorimpl;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105462718, i, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialog.<anonymous> (EventTradeOverlayDialog.kt:289)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
            Component component = new Component(Component.ComponentType.EVENT_CONTRACT_TRADE_OVERLAY_DIALOG, Uuids.safeToString(this.$state.getBuyMoreMetadata().getContractId()), null, 4, null);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxSize$default, UserInteractionEventDescriptor.copy$default(this.$eventDescriptor, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EventContractsPositionContext(this.$state.getSignedQuantity(), this.$state.getAvgPrice(), null, 4, null), null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16255, null), component, null, 39, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Function0<Unit> function0 = this.$onDismiss;
            float f = this.$verticalOffset;
            SnapshotState<Boolean> snapshotState = this.$isVisible$delegate;
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            EventTradeOverlayDialogData eventTradeOverlayDialogData = this.$state;
            Function1<ContractSelectorButtonViewState.Metadata, Unit> function1 = this.$onTradeClicked;
            Modifier modifier = this.$modifier;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(Background3.m4872backgroundbw27NRU$default(modifierMatchParentSize, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), null, null, false, null, null, function0, 28, null), composer, 0);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composer.endReplaceGroup();
            if (snapshotIntState2.getIntValue() > 0) {
                composer.startReplaceGroup(-1874564766);
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(density.mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()) - bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1874453879);
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(EventTradeOverlayDialog4.getEventTradeDialogContentSize() + bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()) + EventTradeOverlayDialog4.getEventTradeDialogButtonsHeight());
                composer.endReplaceGroup();
            }
            composer.startReplaceGroup(-891744131);
            float f2 = fM7995constructorimpl;
            float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(Integer.MAX_VALUE);
                composer.updateRememberedValue(objRememberedValue2);
            }
            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
            composer.endReplaceGroup();
            if (snapshotIntState22.getIntValue() != Integer.MAX_VALUE) {
                fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM(snapshotIntState22.getIntValue());
            }
            float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM();
            AnimatedVisibilityKt.AnimatedVisibility(EventTradeOverlayDialog4.EventTradeOverlayDialog$lambda$13(snapshotState), (Modifier) null, EnterTransition.INSTANCE.getNone(), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-68322912, true, new EventTradeOverlayDialog7(C2002Dp.m7995constructorimpl(Math.max(fM21590getDefaultD9Ej5fM, C2002Dp.m7995constructorimpl(Math.min(C2002Dp.m7995constructorimpl(f - f2), C2002Dp.m7995constructorimpl(Math.max(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM - bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()) - f2), fM21590getDefaultD9Ej5fM)))))), function0, userInteractionEventDescriptor, eventTradeOverlayDialogData, snapshotIntState2, function1, modifier, snapshotIntState22), composer, 54), composer, 196608, 26);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EventTradeOverlayDialog$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: StretchIn-twVAp8k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14157StretchIntwVAp8k(final float f, final long j, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        long j2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2115985479);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2115985479, i3, -1, "com.robinhood.android.event.detail.ui.dialog.StretchIn (EventTradeOverlayDialog.kt:109)");
                    }
                    Modifier modifierM6758graphicsLayerAp8cVGQ$default = GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(modifier4, f2, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j2, null, false, null, 0L, 0L, 0, 130044, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM6758graphicsLayerAp8cVGQ$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventTradeOverlayDialog4.StretchIn_twVAp8k$lambda$1(f, j, modifier3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM6758graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(modifier4, f2, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j2, null, false, null, 0L, 0L, 0, 130044, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM6758graphicsLayerAp8cVGQ$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: EventTradeDialogCardContent-RYX2cs4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14156EventTradeDialogCardContentRYX2cs4(final EventTradeOverlayDialogData eventTradeOverlayDialogData, final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        long j2;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2013888687);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventTradeOverlayDialogData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2013888687, i3, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeDialogCardContent (EventTradeOverlayDialog.kt:130)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopEnd(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i5 = i3 >> 3;
                m14157StretchIntwVAp8k(f2, j2, null, ComposableLambda3.rememberComposableLambda(1785556205, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeDialogCardContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1785556205, i6, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeDialogCardContent.<anonymous>.<anonymous> (EventTradeOverlayDialog.kt:133)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(companion2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(EventTradeOverlayDialog4.getEventTradeDialogBoxSize())), C2002Dp.m7995constructorimpl(1), eventTradeOverlayDialogData.getThemeColor(composer2, 0), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(EventTradeOverlayDialog4.getEventTradeDialogBoxSize()));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierM4876borderxT4_qwU, bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                        EventTradeOverlayDialogData eventTradeOverlayDialogData2 = eventTradeOverlayDialogData;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16095R.string.event_trade_overlay_dialog_title, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8170);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        BentoText2.m20747BentoText38GnDrw(eventTradeOverlayDialogData2.getContractName(), Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                        BentoText2.m20747BentoText38GnDrw(StringUtil2.getText(eventTradeOverlayDialogData2.getSelectedQuote(), composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 3072 | (i5 & 112), 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventTradeOverlayDialog4.EventTradeDialogCardContent_RYX2cs4$lambda$3(eventTradeOverlayDialogData, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopEnd(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i52 = i3 >> 3;
                m14157StretchIntwVAp8k(f2, j2, null, ComposableLambda3.rememberComposableLambda(1785556205, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$EventTradeDialogCardContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1785556205, i6, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeDialogCardContent.<anonymous>.<anonymous> (EventTradeOverlayDialog.kt:133)");
                        }
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(companion22, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(EventTradeOverlayDialog4.getEventTradeDialogBoxSize())), C2002Dp.m7995constructorimpl(1), eventTradeOverlayDialogData.getThemeColor(composer2, 0), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(EventTradeOverlayDialog4.getEventTradeDialogBoxSize()));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierM4876borderxT4_qwU, bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                        EventTradeOverlayDialogData eventTradeOverlayDialogData2 = eventTradeOverlayDialogData;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16095R.string.event_trade_overlay_dialog_title, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 24576, 0, 8170);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        BentoText2.m20747BentoText38GnDrw(eventTradeOverlayDialogData2.getContractName(), Row5.weight$default(Row6.INSTANCE, companion22, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                        BentoText2.m20747BentoText38GnDrw(StringUtil2.getText(eventTradeOverlayDialogData2.getSelectedQuote(), composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i52 & 14) | 3072 | (i52 & 112), 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0669  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventTradeDialogTradeButtons(final EventTradeOverlayDialogData eventTradeOverlayDialogData, Function1<? super ContractSelectorButtonViewState.Metadata, Unit> function1, final UserInteractionEventDescriptor userInteractionEventDescriptor, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super ContractSelectorButtonViewState.Metadata, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1447821238);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventTradeOverlayDialogData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1447821238, i3, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeDialogTradeButtons (EventTradeOverlayDialog.kt:180)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    StringResource buyButtonLabel = eventTradeOverlayDialogData.getBuyButtonLabel();
                    int i5 = StringResource.$stable;
                    String text = StringUtil2.getText(buyButtonLabel, composerStartRestartGroup, i5);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                    Screen screen = userInteractionEventDescriptor2.getScreen();
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierWeight$default, new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EventContractsPositionContext(eventTradeOverlayDialogData.getSignedQuantity(), eventTradeOverlayDialogData.getAvgPrice(), null, 4, null), null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16255, null), new Component(componentType, "event-trade-overlay-dialog-buy-more-" + eventTradeOverlayDialogData.getBuyMoreMetadata().getContractId(), null, 4, null), null, 37, null), false, false, false, true, false, null, 110, null);
                    int i6 = i3 & 14;
                    long themeColor = eventTradeOverlayDialogData.getThemeColor(composerStartRestartGroup, i6);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i7 = i3 & 112;
                    zChangedInstance = (i7 != 32) | composerStartRestartGroup.changedInstance(eventTradeOverlayDialogData);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EventTradeOverlayDialog4.EventTradeDialogTradeButtons$lambda$8$lambda$5$lambda$4(function12, eventTradeOverlayDialogData);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierAutoLogEvents$default, null, null, false, false, Color.m6701boximpl(themeColor), null, null, null, false, null, composerStartRestartGroup, 0, 0, 8056);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    String text2 = StringUtil2.getText(eventTradeOverlayDialogData.getCloseButtonLabel(), composerStartRestartGroup, i5);
                    boolean z = eventTradeOverlayDialogData.getCloseMetadata() == null;
                    Modifier modifierWeight$default2 = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                    Screen screen2 = userInteractionEventDescriptor.getScreen();
                    ContractSelectorButtonViewState.Metadata closeMetadata = eventTradeOverlayDialogData.getCloseMetadata();
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifierWeight$default2, new UserInteractionEventDescriptor(null, screen2, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EventContractsPositionContext(eventTradeOverlayDialogData.getSignedQuantity(), eventTradeOverlayDialogData.getAvgPrice(), null, 4, null), null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16255, null), new Component(componentType, "event-trade-overlay-dialog-close-" + (closeMetadata == null ? closeMetadata.getContractId() : null), null, 4, null), null, 37, null), false, false, false, true, false, null, 110, null);
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU();
                    long themeColor2 = eventTradeOverlayDialogData.getThemeColor(composerStartRestartGroup, i6);
                    long themeColor3 = eventTradeOverlayDialogData.getThemeColor(composerStartRestartGroup, i6);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(eventTradeOverlayDialogData) | (i7 == 32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        function12 = function1;
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EventTradeOverlayDialog4.EventTradeDialogTradeButtons$lambda$8$lambda$7$lambda$6(eventTradeOverlayDialogData, function12);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        function12 = function1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, text2, modifierAutoLogEvents$default2, null, null, z, false, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(themeColor2), Color.m6701boximpl(themeColor3), null, false, null, composer2, 0, 0, 7256);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventTradeOverlayDialog4.EventTradeDialogTradeButtons$lambda$9(eventTradeOverlayDialogData, function12, userInteractionEventDescriptor, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    StringResource buyButtonLabel2 = eventTradeOverlayDialogData.getBuyButtonLabel();
                    int i52 = StringResource.$stable;
                    String text3 = StringUtil2.getText(buyButtonLabel2, composerStartRestartGroup, i52);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Modifier modifierWeight$default3 = Row5.weight$default(row62, companion22, 1.0f, false, 2, null);
                    Screen screen3 = userInteractionEventDescriptor2.getScreen();
                    Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierWeight$default3, new UserInteractionEventDescriptor(null, screen3, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EventContractsPositionContext(eventTradeOverlayDialogData.getSignedQuantity(), eventTradeOverlayDialogData.getAvgPrice(), null, 4, null), null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16255, null), new Component(componentType2, "event-trade-overlay-dialog-buy-more-" + eventTradeOverlayDialogData.getBuyMoreMetadata().getContractId(), null, 4, null), null, 37, null), false, false, false, true, false, null, 110, null);
                    int i62 = i3 & 14;
                    long themeColor4 = eventTradeOverlayDialogData.getThemeColor(composerStartRestartGroup, i62);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i72 = i3 & 112;
                    zChangedInstance = (i72 != 32) | composerStartRestartGroup.changedInstance(eventTradeOverlayDialogData);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EventTradeOverlayDialog4.EventTradeDialogTradeButtons$lambda$8$lambda$5$lambda$4(function12, eventTradeOverlayDialogData);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text3, modifierAutoLogEvents$default3, null, null, false, false, Color.m6701boximpl(themeColor4), null, null, null, false, null, composerStartRestartGroup, 0, 0, 8056);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        String text22 = StringUtil2.getText(eventTradeOverlayDialogData.getCloseButtonLabel(), composerStartRestartGroup, i52);
                        if (eventTradeOverlayDialogData.getCloseMetadata() == null) {
                        }
                        Modifier modifierWeight$default22 = Row5.weight$default(row62, companion22, 1.0f, false, 2, null);
                        Screen screen22 = userInteractionEventDescriptor.getScreen();
                        ContractSelectorButtonViewState.Metadata closeMetadata2 = eventTradeOverlayDialogData.getCloseMetadata();
                        if (closeMetadata2 == null) {
                        }
                        Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(modifierWeight$default22, new UserInteractionEventDescriptor(null, screen22, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EventContractsPositionContext(eventTradeOverlayDialogData.getSignedQuantity(), eventTradeOverlayDialogData.getAvgPrice(), null, 4, null), null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16255, null), new Component(componentType2, "event-trade-overlay-dialog-close-" + (closeMetadata2 == null ? closeMetadata2.getContractId() : null), null, 4, null), null, 37, null), false, false, false, true, false, null, 110, null);
                        long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i82).m21371getBg0d7_KjU();
                        long themeColor22 = eventTradeOverlayDialogData.getThemeColor(composerStartRestartGroup, i62);
                        long themeColor32 = eventTradeOverlayDialogData.getThemeColor(composerStartRestartGroup, i62);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(eventTradeOverlayDialogData) | (i72 == 32);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            function12 = function1;
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventTradeOverlayDialog4.EventTradeDialogTradeButtons$lambda$8$lambda$7$lambda$6(eventTradeOverlayDialogData, function12);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, text22, modifierAutoLogEvents$default22, null, null, z, false, Color.m6701boximpl(jM21371getBg0d7_KjU2), Color.m6701boximpl(themeColor22), Color.m6701boximpl(themeColor32), null, false, null, composer2, 0, 0, 7256);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTradeDialogTradeButtons$lambda$8$lambda$5$lambda$4(Function1 function1, EventTradeOverlayDialogData eventTradeOverlayDialogData) {
        function1.invoke(eventTradeOverlayDialogData.getBuyMoreMetadata());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTradeDialogTradeButtons$lambda$8$lambda$7$lambda$6(EventTradeOverlayDialogData eventTradeOverlayDialogData, Function1 function1) {
        ContractSelectorButtonViewState.Metadata closeMetadata = eventTradeOverlayDialogData.getCloseMetadata();
        if (closeMetadata != null) {
            function1.invoke(closeMetadata);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventTradeDialogDismissButton(final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-560260974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-560260974, i3, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeDialogDismissButton (EventTradeOverlayDialog.kt:250)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                int i6 = i3;
                int i7 = (i6 & 14) | 12582912 | (i6 & 112);
                modifier3 = modifier4;
                FloatingActionButtonKt.m5864FloatingActionButtonXz6DiA(function0, modifier3, RoundedCornerShape2.getCircleShape(), jM21425getFg0d7_KjU, jM21371getBg0d7_KjU, null, null, EventTradeOverlayDialog.INSTANCE.getLambda$584689744$feature_event_detail_externalDebug(), composerStartRestartGroup, i7, 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventTradeOverlayDialog4.EventTradeDialogDismissButton$lambda$10(function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            int i62 = i3;
            int i72 = (i62 & 14) | 12582912 | (i62 & 112);
            modifier3 = modifier4;
            FloatingActionButtonKt.m5864FloatingActionButtonXz6DiA(function0, modifier3, RoundedCornerShape2.getCircleShape(), jM21425getFg0d7_KjU2, jM21371getBg0d7_KjU2, null, null, EventTradeOverlayDialog.INSTANCE.getLambda$584689744$feature_event_detail_externalDebug(), composerStartRestartGroup, i72, 96);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventTradeOverlayDialog(final EventTradeOverlayDialogData state, final Function1<? super ContractSelectorButtonViewState.Metadata, Unit> onTradeClicked, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTradeClicked, "onTradeClicked");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1717340405);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTradeClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1717340405, i4, -1, "com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialog (EventTradeOverlayDialog.kt:278)");
                }
                float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(state.getAnchorYPx());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new EventTradeOverlayDialog6(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                Modifier modifier4 = modifier3;
                modifier2 = modifier4;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(105462718, true, new C162202(modifier4, state, userInteractionEventDescriptor, onDismiss, fMo5013toDpu2uoSUM, snapshotState, onTradeClicked), composerStartRestartGroup, 54), composer2, ((i4 >> 6) & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.ui.dialog.EventTradeOverlayDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventTradeOverlayDialog4.EventTradeOverlayDialog$lambda$16(state, onTradeClicked, onDismiss, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(state.getAnchorYPx());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            Modifier modifier42 = modifier3;
            modifier2 = modifier42;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambda3.rememberComposableLambda(105462718, true, new C162202(modifier42, state, userInteractionEventDescriptor2, onDismiss, fMo5013toDpu2uoSUM2, snapshotState2, onTradeClicked), composerStartRestartGroup, 54), composer2, ((i4 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier52 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventTradeOverlayDialog$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public static final float getEventTradeDialogDismissButtonSize() {
        return EventTradeDialogDismissButtonSize;
    }

    public static final float getEventTradeDialogBoxSize() {
        return EventTradeDialogBoxSize;
    }

    public static final float getEventTradeDialogContentSize() {
        return EventTradeDialogContentSize;
    }

    public static final float getEventTradeDialogButtonsHeight() {
        return EventTradeDialogButtonsHeight;
    }
}
