package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButton;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EventContractsPositionContext;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContractSelectorButton.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0017\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"ContractSelectorButton", "", "state", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "modifier", "Landroidx/compose/ui/Modifier;", "onTradeClicked", "Lkotlin/Function2;", "", "ContractSelectorButton-JEEbyFU", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "logTapEvent", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "buttonText", "", "ContractSelectorButtonPreview", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;Landroidx/compose/runtime/Composer;I)V", "feature-event-detail_externalDebug", "topY"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButtonPreview$lambda$10(ContractSelectorButtonViewState contractSelectorButtonViewState, int i, Composer composer, int i2) {
        ContractSelectorButtonPreview(contractSelectorButtonViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButton_JEEbyFU$lambda$9(ContractSelectorButtonViewState contractSelectorButtonViewState, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m14138ContractSelectorButtonJEEbyFU(contractSelectorButtonViewState, c2002Dp, c2002Dp2, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd  */
    /* renamed from: ContractSelectorButton-JEEbyFU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14138ContractSelectorButtonJEEbyFU(final ContractSelectorButtonViewState state, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, final Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> onTradeClicked, Composer composer, final int i, final int i2) {
        int i3;
        C2002Dp c2002Dp3;
        C2002Dp c2002Dp4;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final ContractSelectorButtonViewState.PositionState positionState;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTradeClicked, "onTradeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1093242894);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            c2002Dp3 = c2002Dp;
        } else {
            c2002Dp3 = c2002Dp;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(c2002Dp3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            c2002Dp4 = c2002Dp2;
        } else {
            c2002Dp4 = c2002Dp2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(c2002Dp4) ? 256 : 128;
            }
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTradeClicked) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1093242894, i4, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButton (ContractSelectorButton.kt:182)");
                }
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ContractSelectorButton.ContractSelectorButton_JEEbyFU$lambda$4$lambda$3(snapshotIntState2, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifier3, (Function1) objRememberedValue2);
                StringResource quoteText = state.getQuoteText();
                int i6 = StringResource.$stable;
                final String text = StringUtil2.getText(quoteText, composerStartRestartGroup, i6);
                positionState = state.getPositionState();
                if (!(positionState instanceof ContractSelectorButtonViewState.PositionState.WithPosition)) {
                    composerStartRestartGroup.startReplaceGroup(62760635);
                    boolean zIsEnabled = state.isEnabled();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i7 = i4 & 14;
                    boolean zChangedInstance = (i7 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changed(text) | ((i4 & 57344) == 16384);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContractSelectorButton.ContractSelectorButton_JEEbyFU$lambda$6$lambda$5(current, userInteractionEventDescriptor, state, text, onTradeClicked, snapshotIntState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function0);
                        objRememberedValue3 = function0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    ContractSelectorButtonWithPosition.m14139ContractSelectorButtonWithPositionUmHF5L4(state, c2002Dp3, c2002Dp4, ClickableKt.m4893clickableXHw0xAI$default(modifierOnGloballyPositioned, zIsEnabled, null, null, (Function0) objRememberedValue3, 6, null), composer2, i6 | i7 | (i4 & 112) | (i4 & 896), 0);
                    composer2.endReplaceGroup();
                } else {
                    if (!(positionState instanceof ContractSelectorButtonViewState.PositionState.WithoutPosition)) {
                        composerStartRestartGroup.startReplaceGroup(-1660546479);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(63405528);
                    boolean zIsEnabled2 = state.isEnabled();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i8 = i4 & 14;
                    boolean zChanged = composerStartRestartGroup.changed(positionState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i8 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | composerStartRestartGroup.changed(text) | ((i4 & 57344) == 16384);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                        Function0 function02 = new Function0() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContractSelectorButton.ContractSelectorButton_JEEbyFU$lambda$8$lambda$7(positionState, current, userInteractionEventDescriptor, state, text, onTradeClicked, snapshotIntState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function02);
                        objRememberedValue4 = function02;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    ContractSelectorButtonWithPosition.m14140ContractSelectorQuotePillUmHF5L4(state, c2002Dp, c2002Dp2, ClickableKt.m4893clickableXHw0xAI$default(modifierOnGloballyPositioned, zIsEnabled2, null, null, (Function0) objRememberedValue4, 6, null), composer2, i6 | i8 | (i4 & 112) | (i4 & 896), 0);
                    composer2.endReplaceGroup();
                }
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
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContractSelectorButton.ContractSelectorButton_JEEbyFU$lambda$9(state, c2002Dp, c2002Dp2, modifier4, onTradeClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifier3, (Function1) objRememberedValue2);
            StringResource quoteText2 = state.getQuoteText();
            int i62 = StringResource.$stable;
            final String text2 = StringUtil2.getText(quoteText2, composerStartRestartGroup, i62);
            positionState = state.getPositionState();
            if (!(positionState instanceof ContractSelectorButtonViewState.PositionState.WithPosition)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButton_JEEbyFU$lambda$4$lambda$3(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) LayoutCoordinates2.boundsInWindow(coordinates).getTop());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButton_JEEbyFU$lambda$6$lambda$5(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ContractSelectorButtonViewState contractSelectorButtonViewState, String str, Function2 function2, SnapshotIntState2 snapshotIntState2) {
        logTapEvent(eventLogger, userInteractionEventDescriptor, contractSelectorButtonViewState, str);
        function2.invoke(contractSelectorButtonViewState, Integer.valueOf(snapshotIntState2.getIntValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButton_JEEbyFU$lambda$8$lambda$7(ContractSelectorButtonViewState.PositionState positionState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ContractSelectorButtonViewState contractSelectorButtonViewState, String str, Function2 function2, SnapshotIntState2 snapshotIntState2) {
        if (((ContractSelectorButtonViewState.PositionState.WithoutPosition) positionState).getMetadata() != null) {
            logTapEvent(eventLogger, userInteractionEventDescriptor, contractSelectorButtonViewState, str);
            function2.invoke(contractSelectorButtonViewState, Integer.valueOf(snapshotIntState2.getIntValue()));
        }
        return Unit.INSTANCE;
    }

    private static final void logTapEvent(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ContractSelectorButtonViewState contractSelectorButtonViewState, String str) {
        Tuples2<Integer, Double> positionLoggingInfo = contractSelectorButtonViewState.getPositionLoggingInfo();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, contractSelectorButtonViewState.getIdentifier(), null, 4, null), null, new Context(0, 0, 0, str, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EventContractsPositionContext(positionLoggingInfo.component1().intValue(), positionLoggingInfo.component2().doubleValue(), null, 4, null), null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16255, null), false, 41, null);
    }

    /* compiled from: ContractSelectorButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$ContractSelectorButtonPreview$1 */
    static final class C161271 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ContractSelectorButtonViewState $state;

        C161271(ContractSelectorButtonViewState contractSelectorButtonViewState) {
            this.$state = contractSelectorButtonViewState;
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
                ComposerKt.traceEventStart(-1349038561, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonPreview.<anonymous> (ContractSelectorButton.kt:291)");
            }
            ContractSelectorButtonViewState contractSelectorButtonViewState = this.$state;
            C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(72));
            C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(36));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$ContractSelectorButtonPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContractSelectorButton.C161271.invoke$lambda$1$lambda$0((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(contractSelectorButtonViewState, c2002DpM7993boximpl, c2002DpM7993boximpl2, null, (Function2) objRememberedValue, composer, StringResource.$stable | 25008, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
            Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
            return Unit.INSTANCE;
        }
    }

    private static final void ContractSelectorButtonPreview(final ContractSelectorButtonViewState contractSelectorButtonViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374092903);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(contractSelectorButtonViewState) : composerStartRestartGroup.changedInstance(contractSelectorButtonViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374092903, i2, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorButtonPreview (ContractSelectorButton.kt:289)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1349038561, true, new C161271(contractSelectorButtonViewState), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractSelectorButton.ContractSelectorButtonPreview$lambda$10(contractSelectorButtonViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
