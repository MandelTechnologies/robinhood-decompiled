package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.BackButton;
import com.truelayer.payments.p419ui.components.ScreenTitle;
import com.truelayer.payments.p419ui.components.toolbars.AccessibleTopAppBar2;
import com.truelayer.payments.p419ui.screens.components.BankUnavailableDialog;
import com.truelayer.payments.p419ui.screens.confirmation.MandateConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.components.ConfirmationButtonView;
import com.truelayer.payments.p419ui.screens.confirmation.singlepayment.PaymentConfirmationContainer3;
import com.truelayer.payments.p419ui.screens.coordinator.PaymentCancellationReason;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.utils.ModifierExtensions;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MandateConfirmationContainer.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\u0080\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"ConfirmationPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "MandateConfirmationContainer", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "onAbort", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/coordinator/PaymentCancellationReason;", "Lkotlin/ParameterName;", "name", "reason", "onConfirm", "Lkotlin/Function0;", "onSecureLinkClicked", "onLegalLinkClicked", "", "onDetailsDialogOpened", "(Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MandateConfirmationContainer3 {
    public static final void MandateConfirmationContainer(final MandateConfirmationViewData viewData, Function1<? super PaymentCancellationReason, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function12, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1210311149);
        final Function1<? super PaymentCancellationReason, Unit> function13 = (i2 & 2) != 0 ? new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PaymentCancellationReason it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaymentCancellationReason paymentCancellationReason) {
                invoke2(paymentCancellationReason);
                return Unit.INSTANCE;
            }
        } : function1;
        final Function0<Unit> function04 = (i2 & 4) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function0<Unit> function05 = (i2 & 8) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        Function1<? super String, Unit> function14 = (i2 & 16) != 0 ? new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function12;
        final Function0<Unit> function06 = (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function03;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210311149, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainer (MandateConfirmationContainer.kt:44)");
        }
        final Function1<? super String, Unit> function15 = function14;
        final Function0<Unit> function07 = function05;
        final Function1<? super PaymentCancellationReason, Unit> function16 = function13;
        final Function0<Unit> function08 = function04;
        final Function0<Unit> function09 = function06;
        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1899222569, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1899222569, i3, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainer.<anonymous> (MandateConfirmationContainer.kt:46)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C42830R.string.mandate_confirmation_screen_title, composer2, 0);
                    final Function1<PaymentCancellationReason, Unit> function17 = function13;
                    AccessibleTopAppBar2.AccessibleTopAppBar(null, strStringResource, ComposableLambda3.composableLambda(composer2, -549006149, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.6.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-549006149, i4, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainer.<anonymous>.<anonymous> (MandateConfirmationContainer.kt:48)");
                            }
                            composer3.startReplaceableGroup(921656218);
                            boolean zChanged = composer3.changed(function17);
                            final Function1<PaymentCancellationReason, Unit> function18 = function17;
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt$MandateConfirmationContainer$6$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        function18.invoke(PaymentCancellationReason.NormalCancellation);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceableGroup();
                            BackButton.BackButton(null, null, (Function0) objRememberedValue, composer3, 0, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), null, composer2, 384, 9);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, null, null, 0, 0L, 0L, null, ComposableLambda3.composableLambda(composerStartRestartGroup, 719401954, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            /* compiled from: MandateConfirmationContainer.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt$MandateConfirmationContainer$7$2", m3645f = "MandateConfirmationContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt$MandateConfirmationContainer$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(PaymentConfirmationContainer3.providerUnavailableAnalyticsEvent());
                    return Unit.INSTANCE;
                }
            }

            public final void invoke(PaddingValues it, Composer composer2, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer2.changed(it) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(719401954, i4, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainer.<anonymous> (MandateConfirmationContainer.kt:52)");
                }
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifierExtensions.systemBarSafeAreaAndImePadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)), PaddingKt.calculateStartPadding(it, layoutDirection), it.getTop(), PaddingKt.calculateEndPadding(it, layoutDirection), 0.0f, 8, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                MandateConfirmationViewData mandateConfirmationViewData = viewData;
                Function0<Unit> function010 = function04;
                Function1<String, Unit> function17 = function15;
                Function0<Unit> function011 = function07;
                Function0<Unit> function012 = function06;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5146paddingqDBjuR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Modifier modifierTestTag = TestTag3.testTag(ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), TestTags.CONSENT_CONTAINER);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierTestTag);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ScreenTitle.ScreenTitle(StringResources_androidKt.stringResource(C42830R.string.mandate_confirmation_screen_title, composer2, 0), null, composer2, 0, 2);
                Spacing spacing = Spacing.INSTANCE;
                MandateDetailsViewKt.m27100MandateDetailsView1yyLQnY(mandateConfirmationViewData, PaddingKt.m5143paddingVpY3zN4(companion, spacing.m27177getREGULARD9Ej5fM(), spacing.m27178getSMALLD9Ej5fM()), 0.0f, 0.0f, function011, function012, composer2, 56, 12);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                ConfirmationButtonView.ConfirmationButtonView(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, spacing.m27175getMEDIUMD9Ej5fM(), 0.0f, it.getBottom(), 5, null), mandateConfirmationViewData, function010, function17, composer2, 64, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (!viewData.isEnabled()) {
                    EffectsKt.LaunchedEffect(Boolean.TRUE, new AnonymousClass2(null), composer2, 70);
                    String providerName = viewData.getProviderName();
                    String strStringResource = StringResources_androidKt.stringResource(C42830R.string.go_back, composer2, 0);
                    composer2.startReplaceableGroup(1470636375);
                    boolean zChanged = composer2.changed(function13);
                    final Function1<PaymentCancellationReason, Unit> function18 = function13;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt$MandateConfirmationContainer$7$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function18.invoke(PaymentCancellationReason.ProviderTemporarilyUnavailable);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    BankUnavailableDialog.BankUnavailableDialog(providerName, strStringResource, (Function0) objRememberedValue, composer2, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.MandateConfirmationContainer.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    MandateConfirmationContainer3.MandateConfirmationContainer(viewData, function16, function08, function07, function15, function09, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void ConfirmationPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(684095876);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(684095876, i, -1, "com.truelayer.payments.ui.screens.confirmation.mandate.ConfirmationPreview (MandateConfirmationContainer.kt:104)");
            }
            Theme5.Theme(null, false, null, MandateConfirmationContainer.INSTANCE.m27096getLambda1$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.mandate.MandateConfirmationContainerKt.ConfirmationPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    MandateConfirmationContainer3.ConfirmationPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
