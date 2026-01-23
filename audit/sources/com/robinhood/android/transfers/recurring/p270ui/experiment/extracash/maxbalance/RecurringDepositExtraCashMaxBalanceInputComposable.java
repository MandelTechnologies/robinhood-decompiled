package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.maxbalance;

import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations3;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringExtraCashData;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RecurringDepositExtraCashMaxBalanceInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\u0012\u0010\f\u001a\n \r*\u0004\u0018\u00010\b0\bX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"RecurringDepositExtraCashMaxBalanceInputComposable", "", "args", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "minimumAmount", "Ljava/math/BigDecimal;", "getMinimumAmount", "()Ljava/math/BigDecimal;", "feature-recurring-deposits_externalDebug", "amount", "kotlin.jvm.PlatformType", "inputChars", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashMaxBalanceInputComposable {
    private static final BigDecimal minimumAmount;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositExtraCashMaxBalanceInputComposable$lambda$6(RecurringExtraCashData recurringExtraCashData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringDepositExtraCashMaxBalanceInputComposable(recurringExtraCashData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringDepositExtraCashMaxBalanceInputComposable(final RecurringExtraCashData args, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(854008602);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(854008602, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable (RecurringDepositExtraCashMaxBalanceInputComposable.kt:47)");
                }
                final DollarInputConsumer dollarInputConsumer = new DollarInputConsumer(new BigDecimal(10000000), true);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(BigDecimal.ZERO, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default("$0", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EXTRA_CASH_SETUP_SET_AMOUNT, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-881689979, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt.RecurringDepositExtraCashMaxBalanceInputComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: RecurringDepositExtraCashMaxBalanceInputComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$RecurringDepositExtraCashMaxBalanceInputComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<BigDecimal> $amount$delegate;
                        final /* synthetic */ RecurringExtraCashData $args;
                        final /* synthetic */ DollarInputConsumer $dollarInputConsumer;
                        final /* synthetic */ UserInteractionEventDescriptor $eventData;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SnapshotState<String> $inputChars$delegate;

                        AnonymousClass1(DollarInputConsumer dollarInputConsumer, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RecurringExtraCashData recurringExtraCashData, SnapshotState<BigDecimal> snapshotState, SnapshotState<String> snapshotState2) {
                            this.$dollarInputConsumer = dollarInputConsumer;
                            this.$eventLogger = eventLogger;
                            this.$eventData = userInteractionEventDescriptor;
                            this.$args = recurringExtraCashData;
                            this.$amount$delegate = snapshotState;
                            this.$inputChars$delegate = snapshotState2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Object obj;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-483421126, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashMaxBalanceInputComposable.kt:68)");
                            }
                            final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                            BentoNumpad4 bentoNumpad4 = BentoNumpad4.INSTANCE;
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(this.$dollarInputConsumer);
                            final DollarInputConsumer dollarInputConsumer = this.$dollarInputConsumer;
                            final SnapshotState<BigDecimal> snapshotState = this.$amount$delegate;
                            final SnapshotState<String> snapshotState2 = this.$inputChars$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$RecurringDepositExtraCashMaxBalanceInputComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return RecurringDepositExtraCashMaxBalanceInputComposable.C305221.AnonymousClass1.invoke$lambda$1$lambda$0(dollarInputConsumer, snapshotState, snapshotState2, (KeyEvent) obj2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventData) | composer.changed(lifecycleAwareNavigator) | composer.changedInstance(this.$args);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                            final RecurringExtraCashData recurringExtraCashData = this.$args;
                            final SnapshotState<BigDecimal> snapshotState3 = this.$amount$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (!zChangedInstance2) {
                                obj = objRememberedValue2;
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    Object obj2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$RecurringDepositExtraCashMaxBalanceInputComposable$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringDepositExtraCashMaxBalanceInputComposable.C305221.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, lifecycleAwareNavigator, recurringExtraCashData, snapshotState3);
                                        }
                                    };
                                    composer.updateRememberedValue(obj2);
                                    obj = obj2;
                                }
                            }
                            Function0<Unit> function0 = (Function0) obj;
                            composer.endReplaceGroup();
                            bentoNumpad4.BentoNumpadWithButton(null, function1, strStringResource, function0, false, RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(this.$amount$delegate).compareTo(RecurringDepositExtraCashMaxBalanceInputComposable.getMinimumAmount()) >= 0, false, false, false, false, null, false, composer, 0, BentoNumpad4.$stable << 6, 4049);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(DollarInputConsumer dollarInputConsumer, SnapshotState snapshotState, SnapshotState snapshotState2, KeyEvent keyEvent) {
                            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                            BigDecimal bigDecimalRecurringDepositExtraCashMaxBalanceInputComposable$lambda$1 = RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState);
                            char[] charArray = RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$4(snapshotState2).toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                            InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(bigDecimalRecurringDepositExtraCashMaxBalanceInputComposable$lambda$1, charArray), keyEvent);
                            BigDecimal bigDecimalComponent1 = inputStateConsume.component1();
                            char[] input = inputStateConsume.getInput();
                            RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$2(snapshotState, bigDecimalComponent1);
                            RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$5(snapshotState2, StringsKt.concatToString(input));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, RecurringExtraCashData recurringExtraCashData, SnapshotState snapshotState) throws Resources.NotFoundException {
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations3.INSTANCE, RecurringExtraCashData.copy$default(recurringExtraCashData, null, RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState), null, 5, null), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-881689979, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable.<anonymous> (RecurringDepositExtraCashMaxBalanceInputComposable.kt:63)");
                        }
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-483421126, true, new AnonymousClass1(dollarInputConsumer, current, userInteractionEventDescriptor, args, snapshotState, snapshotState2), composer2, 54);
                        final SnapshotState<String> snapshotState3 = snapshotState2;
                        final SnapshotState<BigDecimal> snapshotState4 = snapshotState;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1374546579, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt.RecurringDepositExtraCashMaxBalanceInputComposable.1.2
                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1374546579, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashMaxBalanceInputComposable.kt:110)");
                                }
                                UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                                SnapshotState<String> snapshotState5 = snapshotState3;
                                SnapshotState<BigDecimal> snapshotState6 = snapshotState4;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String strStringResource = StringResources_androidKt.stringResource(C30439R.string.set_max_balance_title, composer3, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 10, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30439R.string.set_max_balance_subtitle, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8184);
                                BentoText2.m20747BentoText38GnDrw(RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$4(snapshotState5), PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(column6.align(companion2, companion3.getCenterHorizontally()), 0.0f, 1, null), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), C2002Dp.m7995constructorimpl(4), bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6))), C2002Dp.m7995constructorimpl(14), C2002Dp.m7995constructorimpl(18)), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextL(), composer3, 0, 0, 8124);
                                composer3.startReplaceGroup(2108194792);
                                if (BigDecimal.ZERO.compareTo(RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState6)) < 0 && RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState6).compareTo(RecurringDepositExtraCashMaxBalanceInputComposable.getMinimumAmount()) < 0) {
                                    BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.INFO_BANNER, "low_amount", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), StringResources_androidKt.stringResource(C30439R.string.set_max_balance_below_threshold, composer3, 0), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, null, bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), bentoTheme.getColors(composer3, i7).m21372getBg20d7_KjU(), composer3, (BentoIcon4.Size24.$stable << 6) | 3072, 48);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$6(args, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final DollarInputConsumer dollarInputConsumer2 = new DollarInputConsumer(new BigDecimal(10000000), true);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState<BigDecimal> snapshotState3 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotState<String> snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EXTRA_CASH_SETUP_SET_AMOUNT, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-881689979, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt.RecurringDepositExtraCashMaxBalanceInputComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: RecurringDepositExtraCashMaxBalanceInputComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$RecurringDepositExtraCashMaxBalanceInputComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<BigDecimal> $amount$delegate;
                    final /* synthetic */ RecurringExtraCashData $args;
                    final /* synthetic */ DollarInputConsumer $dollarInputConsumer;
                    final /* synthetic */ UserInteractionEventDescriptor $eventData;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ SnapshotState<String> $inputChars$delegate;

                    AnonymousClass1(DollarInputConsumer dollarInputConsumer, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, RecurringExtraCashData recurringExtraCashData, SnapshotState<BigDecimal> snapshotState, SnapshotState<String> snapshotState2) {
                        this.$dollarInputConsumer = dollarInputConsumer;
                        this.$eventLogger = eventLogger;
                        this.$eventData = userInteractionEventDescriptor;
                        this.$args = recurringExtraCashData;
                        this.$amount$delegate = snapshotState;
                        this.$inputChars$delegate = snapshotState2;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                        invoke(bentoButtonBar3, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                        Object obj;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-483421126, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashMaxBalanceInputComposable.kt:68)");
                        }
                        final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                        BentoNumpad4 bentoNumpad4 = BentoNumpad4.INSTANCE;
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.$dollarInputConsumer);
                        final DollarInputConsumer dollarInputConsumer = this.$dollarInputConsumer;
                        final SnapshotState snapshotState = this.$amount$delegate;
                        final SnapshotState snapshotState2 = this.$inputChars$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$RecurringDepositExtraCashMaxBalanceInputComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return RecurringDepositExtraCashMaxBalanceInputComposable.C305221.AnonymousClass1.invoke$lambda$1$lambda$0(dollarInputConsumer, snapshotState, snapshotState2, (KeyEvent) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1<? super KeyEvent, Unit> function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventData) | composer.changed(lifecycleAwareNavigator) | composer.changedInstance(this.$args);
                        final EventLogger eventLogger = this.$eventLogger;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                        final RecurringExtraCashData recurringExtraCashData = this.$args;
                        final SnapshotState snapshotState3 = this.$amount$delegate;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (!zChangedInstance2) {
                            obj = objRememberedValue2;
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Object obj2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt$RecurringDepositExtraCashMaxBalanceInputComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RecurringDepositExtraCashMaxBalanceInputComposable.C305221.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, lifecycleAwareNavigator, recurringExtraCashData, snapshotState3);
                                    }
                                };
                                composer.updateRememberedValue(obj2);
                                obj = obj2;
                            }
                        }
                        Function0<Unit> function0 = (Function0) obj;
                        composer.endReplaceGroup();
                        bentoNumpad4.BentoNumpadWithButton(null, function1, strStringResource, function0, false, RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(this.$amount$delegate).compareTo(RecurringDepositExtraCashMaxBalanceInputComposable.getMinimumAmount()) >= 0, false, false, false, false, null, false, composer, 0, BentoNumpad4.$stable << 6, 4049);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(DollarInputConsumer dollarInputConsumer, SnapshotState snapshotState, SnapshotState snapshotState2, KeyEvent keyEvent) {
                        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                        BigDecimal bigDecimalRecurringDepositExtraCashMaxBalanceInputComposable$lambda$1 = RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState);
                        char[] charArray = RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$4(snapshotState2).toCharArray();
                        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                        InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(bigDecimalRecurringDepositExtraCashMaxBalanceInputComposable$lambda$1, charArray), keyEvent);
                        BigDecimal bigDecimalComponent1 = inputStateConsume.component1();
                        char[] input = inputStateConsume.getInput();
                        RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$2(snapshotState, bigDecimalComponent1);
                        RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$5(snapshotState2, StringsKt.concatToString(input));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, RecurringExtraCashData recurringExtraCashData, SnapshotState snapshotState) throws Resources.NotFoundException {
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations3.INSTANCE, RecurringExtraCashData.copy$default(recurringExtraCashData, null, RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState), null, 5, null), null, null, 6, null), false, (Function1) null, 6, (Object) null);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-881689979, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable.<anonymous> (RecurringDepositExtraCashMaxBalanceInputComposable.kt:63)");
                    }
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-483421126, true, new AnonymousClass1(dollarInputConsumer2, current, userInteractionEventDescriptor, args, snapshotState3, snapshotState22), composer2, 54);
                    final SnapshotState<String> snapshotState32 = snapshotState22;
                    final SnapshotState<BigDecimal> snapshotState4 = snapshotState3;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1374546579, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposableKt.RecurringDepositExtraCashMaxBalanceInputComposable.1.2
                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1374546579, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashMaxBalanceInputComposable.kt:110)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                            SnapshotState<String> snapshotState5 = snapshotState32;
                            SnapshotState<BigDecimal> snapshotState6 = snapshotState4;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C30439R.string.set_max_balance_title, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 10, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30439R.string.set_max_balance_subtitle, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8184);
                            BentoText2.m20747BentoText38GnDrw(RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$4(snapshotState5), PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(column6.align(companion2, companion3.getCenterHorizontally()), 0.0f, 1, null), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), C2002Dp.m7995constructorimpl(4), bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6))), C2002Dp.m7995constructorimpl(14), C2002Dp.m7995constructorimpl(18)), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextL(), composer3, 0, 0, 8124);
                            composer3.startReplaceGroup(2108194792);
                            if (BigDecimal.ZERO.compareTo(RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState6)) < 0 && RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(snapshotState6).compareTo(RecurringDepositExtraCashMaxBalanceInputComposable.getMinimumAmount()) < 0) {
                                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.INFO_BANNER, "low_amount", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), StringResources_androidKt.stringResource(C30439R.string.set_max_balance_below_threshold, composer3, 0), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, null, bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), bentoTheme.getColors(composer3, i7).m21372getBg20d7_KjU(), composer3, (BentoIcon4.Size24.$stable << 6) | 3072, 48);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal RecurringDepositExtraCashMaxBalanceInputComposable$lambda$1(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RecurringDepositExtraCashMaxBalanceInputComposable$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecurringDepositExtraCashMaxBalanceInputComposable$lambda$2(SnapshotState<BigDecimal> snapshotState, BigDecimal bigDecimal) {
        snapshotState.setValue(bigDecimal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecurringDepositExtraCashMaxBalanceInputComposable$lambda$5(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(300);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        minimumAmount = bigDecimalValueOf;
    }

    public static final BigDecimal getMinimumAmount() {
        return minimumAmount;
    }
}
