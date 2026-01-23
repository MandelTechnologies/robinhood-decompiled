package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelector;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CreateTransferV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$1$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2Composable6 implements Function3<Tuples2<? extends Boolean, ? extends Boolean>, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onContinueButtonClick;
    final /* synthetic */ Function0<Unit> $onInstantTransfersButtonClick;
    final /* synthetic */ Function1<QuickSelectorChip, Unit> $onQuickSelectorChipClick;
    final /* synthetic */ CreateTransferV2ViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    CreateTransferV2Composable6(CreateTransferV2ViewState createTransferV2ViewState, Function1<? super QuickSelectorChip, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        this.$viewState = createTransferV2ViewState;
        this.$onQuickSelectorChipClick = function1;
        this.$onContinueButtonClick = function0;
        this.$onInstantTransfersButtonClick = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Tuples2<? extends Boolean, ? extends Boolean> tuples2, Composer composer, Integer num) {
        invoke((Tuples2<Boolean, Boolean>) tuples2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Tuples2<Boolean, Boolean> destruct$, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(destruct$, "$destruct$");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(destruct$) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1452057584, i2, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferV2Composable.kt:202)");
        }
        boolean zBooleanValue = destruct$.component1().booleanValue();
        final CreateTransferV2ViewState createTransferV2ViewState = this.$viewState;
        Function0<Unit> function0 = this.$onContinueButtonClick;
        final Function0<Unit> function02 = this.$onInstantTransfersButtonClick;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(462418136);
        if (createTransferV2ViewState.getIsInstantTransfersButtonVisible()) {
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            UserInteractionEventData.Action action = UserInteractionEventData.Action.DEBIT_CARD_LINKING;
            Context context = ((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, context != null ? Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaymentLinkingContext(PaymentLinkingContext.EntryPoint.TRANSFERS_V2_REVIEW, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -32769, -1, -1, -1, 16383, null) : null, null, null, 51, null), ComposableLambda3.rememberComposableLambda(-820993972, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$1$1$2$1$1$1
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
                        ComposerKt.traceEventStart(-820993972, i3, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferV2Composable.kt:220)");
                    }
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C30065R.string.gated_instant_set_up_instant_transfers, composer2, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, true, false, null, 108, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), CreateTransferV2Composable3.InstantTransferButtonTag), new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.LIGHTNING_16, null, 2, null), BentoButtons.Type.Secondary, createTransferV2ViewState.getIsInstantTransfersButtonEnabled(), false, null, null, null, null, false, null, composer2, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 8128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 48);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(462499650);
        if (zBooleanValue) {
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResource2.getString(createTransferV2ViewState.getContinueButtonCopy(), composer, StringResource.$stable), TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), CreateTransferV2Composable3.ContinueButtonTag), null, null, createTransferV2ViewState.getIsContinueButtonEnabled(), createTransferV2ViewState.getIsContinueButtonLoading(), null, null, null, null, false, null, composer, 384, 0, 8088);
        }
        composer.endReplaceGroup();
        composer.endNode();
        List<QuickSelectorChip> quickSelectorChips = this.$viewState.getQuickSelectorChips();
        if (quickSelectorChips != null && !quickSelectorChips.isEmpty()) {
            ImmutableList immutableList = extensions2.toImmutableList(this.$viewState.getQuickSelectorChips());
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onQuickSelectorChipClick);
            final Function1<QuickSelectorChip, Unit> function1 = this.$onQuickSelectorChipClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<QuickSelectorChip, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$1$1$2$1$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(QuickSelectorChip quickSelectorChip) {
                        invoke2(quickSelectorChip);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(QuickSelectorChip chip) {
                        Intrinsics.checkNotNullParameter(chip, "chip");
                        function1.invoke(chip);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            QuickSelector.QuickSelector(immutableList, (Function1) objRememberedValue, null, true, composer, 3072, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
