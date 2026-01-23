package com.truelayer.payments.p419ui.screens.wait;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.BackHandler;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.components.ErrorDialog6;
import com.truelayer.payments.p419ui.screens.components.NetworkErrorView;
import com.truelayer.payments.p419ui.screens.processor.ProcessorContext;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.utils.AnalyticsExtensions3;
import java.util.Map;
import kotlin.Deprecated;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: WaitContainer.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001aÆ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00132#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00132#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0002\u0010\u001a\u001aÆ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00132#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00132#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"WaitContainer", "", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "paymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "translations", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "api", "Lcom/truelayer/payments/core/network/Network;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "onFailure", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult;", "Lkotlin/ParameterName;", "name", "result", "onAbandoned", "onPaymentStatusChanged", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/util/Map;Lcom/truelayer/payments/core/network/Network;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "context", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/util/Map;Lcom/truelayer/payments/core/network/Network;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "WaitContainerPreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release", "screen", "Lcom/truelayer/payments/ui/screens/wait/WaitScreens;"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WaitContainer3 {
    @Deprecated
    public static final void WaitContainer(final ProcessorContext context, final Payment payment, final Legals legals, final PaymentProvider paymentProvider, final Map<String, LocalisedText> map, Network network, CoroutineDispatcher coroutineDispatcher, Function1<? super ProcessorResult, Unit> function1, Function1<? super ProcessorResult, Unit> function12, Function1<? super Payment, Unit> function13, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        final Network network2;
        int i3;
        CoroutineDispatcher io2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(legals, "legals");
        Intrinsics.checkNotNullParameter(paymentProvider, "paymentProvider");
        Composer composerStartRestartGroup = composer.startRestartGroup(-675546375);
        if ((i2 & 32) != 0) {
            i3 = i & (-458753);
            network2 = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
        } else {
            network2 = network;
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            i3 &= -3670017;
            io2 = Dispatchers.getIO();
        } else {
            io2 = coroutineDispatcher;
        }
        Function1<? super ProcessorResult, Unit> function14 = (i2 & 128) != 0 ? new Function1<ProcessorResult, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProcessorResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult processorResult) {
                invoke2(processorResult);
                return Unit.INSTANCE;
            }
        } : function1;
        Function1<? super ProcessorResult, Unit> function15 = (i2 & 256) != 0 ? new Function1<ProcessorResult, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProcessorResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult processorResult) {
                invoke2(processorResult);
                return Unit.INSTANCE;
            }
        } : function12;
        Function1<? super Payment, Unit> function16 = (i2 & 512) != 0 ? new Function1<Payment, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Payment it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Payment payment2) {
                invoke2(payment2);
                return Unit.INSTANCE;
            }
        } : function13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675546375, i3, -1, "com.truelayer.payments.ui.screens.wait.WaitContainer (WaitContainer.kt:52)");
        }
        WaitContainer(ProcessorContext.intoPaymentContext$payments_ui_release$default(context, false, null, 3, null), payment, legals, paymentProvider, map, network2, io2, function14, function15, function16, composerStartRestartGroup, (29360128 & i3) | 2396736 | (234881024 & i3) | (1879048192 & i3), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final CoroutineDispatcher coroutineDispatcher2 = io2;
            final Function1<? super ProcessorResult, Unit> function17 = function14;
            final Function1<? super ProcessorResult, Unit> function18 = function15;
            final Function1<? super Payment, Unit> function19 = function16;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) throws Resources.NotFoundException {
                    WaitContainer3.WaitContainer(context, payment, legals, paymentProvider, map, network2, coroutineDispatcher2, function17, function18, function19, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void WaitContainer(final PaymentContext paymentContext, final Payment payment, final Legals legals, final PaymentProvider paymentProvider, final Map<String, LocalisedText> map, Network network, CoroutineDispatcher coroutineDispatcher, Function1<? super ProcessorResult, Unit> function1, Function1<? super ProcessorResult, Unit> function12, Function1<? super Payment, Unit> function13, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Network network2;
        int i3;
        CoroutineDispatcher io2;
        CreationExtras defaultViewModelCreationExtras;
        Function1<? super Payment, Unit> function14;
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(legals, "legals");
        Intrinsics.checkNotNullParameter(paymentProvider, "paymentProvider");
        Composer composerStartRestartGroup = composer.startRestartGroup(885468397);
        if ((i2 & 32) != 0) {
            network2 = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
            i3 = i & (-458753);
        } else {
            network2 = network;
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            io2 = Dispatchers.getIO();
            i3 &= -3670017;
        } else {
            io2 = coroutineDispatcher;
        }
        final Function1<? super ProcessorResult, Unit> function15 = (i2 & 128) != 0 ? new Function1<ProcessorResult, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProcessorResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult processorResult) {
                invoke2(processorResult);
                return Unit.INSTANCE;
            }
        } : function1;
        final Function1<? super ProcessorResult, Unit> function16 = (i2 & 256) != 0 ? new Function1<ProcessorResult, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.6
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProcessorResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult processorResult) {
                invoke2(processorResult);
                return Unit.INSTANCE;
            }
        } : function12;
        Function1<? super Payment, Unit> function17 = (i2 & 512) != 0 ? new Function1<Payment, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Payment it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Payment payment2) {
                invoke2(payment2);
                return Unit.INSTANCE;
            }
        } : function13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885468397, i3, -1, "com.truelayer.payments.ui.screens.wait.WaitContainer (WaitContainer.kt:79)");
        }
        final Network network3 = network2;
        final CoroutineDispatcher coroutineDispatcher2 = io2;
        ViewModelProvider.Factory factoryWaitViewModel = WaitContainerViewModel2.waitViewModel(paymentContext, payment, paymentProvider.getCountryCode(), map, network3, coroutineDispatcher2);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) WaitContainerViewModel.class, current, (String) null, factoryWaitViewModel, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        final WaitContainerViewModel waitContainerViewModel = (WaitContainerViewModel) viewModel;
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final String strStringResource = StringResources_androidKt.stringResource(C42830R.string.wait_screen_back_button_message, composerStartRestartGroup, 0);
        SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(waitContainerViewModel.getScreen(), null, composerStartRestartGroup, 8, 1);
        Locale current2 = Locale.INSTANCE.getCurrent();
        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        EffectsKt.DisposableEffect(lifecycle, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                lifecycle.addObserver(waitContainerViewModel);
                final Lifecycle lifecycle2 = lifecycle;
                final WaitContainerViewModel waitContainerViewModel2 = waitContainerViewModel;
                return new DisposableEffectResult() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$8$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        lifecycle2.removeObserver(waitContainerViewModel2);
                    }
                };
            }
        }, composerStartRestartGroup, 8);
        BackHandler.BackHandler(true, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.9
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
                Toast.makeText(context, strStringResource, 1).show();
            }
        }, composerStartRestartGroup, 6, 0);
        EffectsKt.LaunchedEffect(Boolean.TRUE, new C4327710(waitContainerViewModel, null), composerStartRestartGroup, 70);
        EffectsKt.LaunchedEffect(current2, new C4327811(waitContainerViewModel, null), composerStartRestartGroup, 64);
        final WaitViewData3 waitViewData3WaitContainer$lambda$0 = WaitContainer$lambda$0(snapshotState4CollectAsState);
        if (waitViewData3WaitContainer$lambda$0 instanceof PaymentStatusChanged) {
            composerStartRestartGroup.startReplaceableGroup(-2054069024);
            PaymentStatusChanged paymentStatusChanged = (PaymentStatusChanged) waitViewData3WaitContainer$lambda$0;
            function17.invoke(paymentStatusChanged.getPayment());
            function14 = function17;
            WaitContainerView5.WaitContainerView(paymentStatusChanged.getWaitingScreen().getWaitingText(), paymentProvider.getIconUri(), paymentProvider.getExtendedIcon(), legals, paymentStatusChanged.getWaitingScreen().getExtraText(), composerStartRestartGroup, 4096, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            function14 = function17;
            if (waitViewData3WaitContainer$lambda$0 instanceof Waiting) {
                composerStartRestartGroup.startReplaceableGroup(-2054068456);
                WaitContainerView5.WaitContainerView(((Waiting) waitViewData3WaitContainer$lambda$0).getWaitingText(), paymentProvider.getIconUri(), paymentProvider.getExtendedIcon(), legals, null, composerStartRestartGroup, 28672, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (waitViewData3WaitContainer$lambda$0 instanceof WaitingTimeout) {
                composerStartRestartGroup.startReplaceableGroup(-2054068121);
                EffectsKt.LaunchedEffect(waitViewData3WaitContainer$lambda$0, new C4327912(null), composerStartRestartGroup, 64);
                String strStringResource2 = StringResources_androidKt.stringResource(C42830R.string.wait_timeout_error_title, composerStartRestartGroup, 0);
                String strAsString = ((WaitingTimeout) waitViewData3WaitContainer$lambda$0).getWaitTimeExceededText().asString(composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C42830R.string.wait_timeout_error_leave_button, composerStartRestartGroup, 0);
                String strStringResource4 = StringResources_androidKt.stringResource(C42830R.string.wait_timeout_error_try_again_button, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-2054067594);
                boolean z = (((i & 234881024) ^ 100663296) > 67108864 && composerStartRestartGroup.changed(function16)) || (i & 100663296) == 67108864;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$13$1
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
                            function16.invoke(new ProcessorResult.Failure(ProcessorResult.FailureReason.WaitAbandoned));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ErrorDialog6.ErrorDialog(strStringResource2, strAsString, strStringResource3, strStringResource4, (Function0) objRememberedValue, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.14
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
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.KeepWaitingTapped(null, 1, null));
                        waitContainerViewModel.retry();
                    }
                }, false, false, composerStartRestartGroup, 0, 192);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (waitViewData3WaitContainer$lambda$0 instanceof Error) {
                composerStartRestartGroup.startReplaceableGroup(-2054067280);
                EffectsKt.LaunchedEffect(waitViewData3WaitContainer$lambda$0, new C4328115(waitViewData3WaitContainer$lambda$0, paymentContext, null), composerStartRestartGroup, 64);
                Error error = (Error) waitViewData3WaitContainer$lambda$0;
                if ((error.getError() instanceof CoreError.HttpError) && ((CoreError.HttpError) error.getError()).getType() == CoreError.HttpError.ServerErrorType.Unauthenticated) {
                    function15.invoke(new ProcessorResult.Failure(ProcessorResult.FailureReason.WaitTokenExpired));
                } else {
                    NetworkErrorView.NetworkErrorView(error.getError(), new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.16
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
                            function15.invoke(NetworkErrorView.intoProcessorResult(((Error) waitViewData3WaitContainer$lambda$0).getError()));
                        }
                    }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.17
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
                            waitContainerViewModel.retry();
                        }
                    }, composerStartRestartGroup, 8, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2054066161);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super ProcessorResult, Unit> function18 = function15;
            final Function1<? super ProcessorResult, Unit> function19 = function16;
            final Function1<? super Payment, Unit> function110 = function14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainer.18
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) throws Resources.NotFoundException {
                    WaitContainer3.WaitContainer(paymentContext, payment, legals, paymentProvider, map, network3, coroutineDispatcher2, function18, function19, function110, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: WaitContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$10", m3645f = "WaitContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$10 */
    static final class C4327710 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WaitContainerViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4327710(WaitContainerViewModel waitContainerViewModel, Continuation<? super C4327710> continuation) {
            super(2, continuation);
            this.$viewModel = waitContainerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4327710(this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4327710) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.init();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: WaitContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$11", m3645f = "WaitContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$11 */
    static final class C4327811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WaitContainerViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4327811(WaitContainerViewModel waitContainerViewModel, Continuation<? super C4327811> continuation) {
            super(2, continuation);
            this.$viewModel = waitContainerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4327811(this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4327811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.notifyLocaleChange();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: WaitContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$12", m3645f = "WaitContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$12 */
    static final class C4327912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4327912(Continuation<? super C4327912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4327912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4327912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.StillWaitingDialog(null, 1, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: WaitContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$15", m3645f = "WaitContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerKt$WaitContainer$15 */
    static final class C4328115 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        final /* synthetic */ WaitViewData3 $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4328115(WaitViewData3 waitViewData3, PaymentContext paymentContext, Continuation<? super C4328115> continuation) {
            super(2, continuation);
            this.$screen = waitViewData3;
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4328115(this.$screen, this.$paymentContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4328115) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ErrorScreenLoaded(null, AnalyticsExtensions3.toAnalyticsError(((Error) this.$screen).getError(), this.$paymentContext), 1, null));
            return Unit.INSTANCE;
        }
    }

    public static final void WaitContainerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1703120059);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1703120059, i, -1, "com.truelayer.payments.ui.screens.wait.WaitContainerPreview (WaitContainer.kt:188)");
            }
            Theme5.Theme(null, false, null, WaitContainer.INSTANCE.m27153getLambda1$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerKt.WaitContainerPreview.1
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
                    WaitContainer3.WaitContainerPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final WaitViewData3 WaitContainer$lambda$0(SnapshotState4<? extends WaitViewData3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
