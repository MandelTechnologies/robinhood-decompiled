package com.robinhood.android.truelayer;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.truelayer.TrueLayerEvent;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Either;
import com.truelayer.payments.core.domain.configuration.Environment;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.screens.processor.ProcessorActivityContract;
import com.truelayer.payments.p419ui.screens.processor.ProcessorContext;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TrueLayerSession.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/truelayer/TrueLayerSession;", "", "host", "Lcom/robinhood/utils/Either;", "Landroidx/fragment/app/Fragment;", "Landroidx/activity/ComponentActivity;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Lcom/robinhood/utils/Either;Lcom/robinhood/targetbackend/TargetBackend;)V", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/truelayer/TrueLayerEvent;", "pendingPaymentContext", "startAndListenToNewTrueLayerSession", "Lkotlinx/coroutines/flow/StateFlow;", "paymentId", "", "resourceToken", "baseRedirectUri", "isQueuedDeposit", "", "lib-truelayer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TrueLayerSession {
    private final Either<Fragment, ComponentActivity> host;
    private ProcessorContext pendingPaymentContext;
    private ActivityResultLauncher<ProcessorContext> resultLauncher;
    private final StateFlow2<TrueLayerEvent> stateFlow;
    private final TargetBackend targetBackend;

    /* JADX WARN: Multi-variable type inference failed */
    public TrueLayerSession(Either<? extends Fragment, ? extends ComponentActivity> host, TargetBackend targetBackend) throws IllegalArgumentException {
        Context applicationContext;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.host = host;
        this.targetBackend = targetBackend;
        this.stateFlow = StateFlow4.MutableStateFlow(TrueLayerEvent.Initialized.INSTANCE);
        TrueLayerUI.Companion companion = TrueLayerUI.INSTANCE;
        if (host instanceof Either.Left) {
            applicationContext = ((Fragment) ((Either.Left) host).getValue()).requireContext().getApplicationContext();
        } else {
            if (!(host instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            applicationContext = ((ComponentActivity) ((Either.Right) host).getValue()).getApplicationContext();
        }
        Intrinsics.checkNotNull(applicationContext);
        companion.init(applicationContext, new Function1() { // from class: com.robinhood.android.truelayer.TrueLayerSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrueLayerSession._init_$lambda$0(this.f$0, (TrueLayerUI.Builder) obj);
            }
        });
    }

    public final StateFlow<TrueLayerEvent> startAndListenToNewTrueLayerSession(String paymentId, String resourceToken, String baseRedirectUri, boolean isQueuedDeposit) {
        ProcessorContext paymentContext;
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(resourceToken, "resourceToken");
        Intrinsics.checkNotNullParameter(baseRedirectUri, "baseRedirectUri");
        String string2 = Uri.parse(baseRedirectUri).buildUpon().appendQueryParameter("payment_id", paymentId).appendQueryParameter("resource_token", resourceToken).appendQueryParameter("is_queued_deposit", String.valueOf(isQueuedDeposit)).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (isQueuedDeposit) {
            paymentContext = new ProcessorContext.MandateContext(paymentId, resourceToken, string2, new ProcessorContext.MandatePreferences((String) null, true, 0L, 5, (DefaultConstructorMarker) null));
        } else {
            paymentContext = new ProcessorContext.PaymentContext(paymentId, resourceToken, string2, new ProcessorContext.PaymentPreferences((String) null, true, 0L, 5, (DefaultConstructorMarker) null));
        }
        this.pendingPaymentContext = paymentContext;
        ActivityResultLauncher<ProcessorContext> activityResultLauncher = this.resultLauncher;
        if (activityResultLauncher == null) {
            this.stateFlow.setValue(TrueLayerEvent.Initializing.INSTANCE);
        } else if (activityResultLauncher != null) {
            activityResultLauncher.launch(paymentContext);
        }
        return this.stateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(final TrueLayerSession trueLayerSession, TrueLayerUI.Builder init) {
        Environment environment;
        ActivityResultLauncher<ProcessorContext> activityResultLauncherRegisterForActivityResult;
        Intrinsics.checkNotNullParameter(init, "$this$init");
        if (trueLayerSession.targetBackend.getId() == TargetBackend.EnumC41639Id.PROD) {
            environment = Environment.PRODUCTION;
        } else {
            environment = Environment.SANDBOX;
        }
        init.setEnvironment(environment);
        init.setHttpConnection(new HttpConnectionConfiguration(0L, HttpConnectionConfiguration2.Basic, 1, null));
        ProcessorActivityContract processorActivityContract = new ProcessorActivityContract();
        ActivityResultCallback activityResultCallback = new ActivityResultCallback() { // from class: com.robinhood.android.truelayer.TrueLayerSession$1$activityResultCallback$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ProcessorResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ProcessorResult.Failure) {
                    this.this$0.stateFlow.setValue(TrueLayerEvent.Failure.INSTANCE);
                } else {
                    if (it instanceof ProcessorResult.Successful) {
                        this.this$0.stateFlow.setValue(TrueLayerEvent.Succeeded.INSTANCE);
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        };
        Either<Fragment, ComponentActivity> either = trueLayerSession.host;
        if (either instanceof Either.Left) {
            activityResultLauncherRegisterForActivityResult = ((Fragment) ((Either.Left) either).getValue()).registerForActivityResult(processorActivityContract, activityResultCallback);
        } else {
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            activityResultLauncherRegisterForActivityResult = ((ComponentActivity) ((Either.Right) either).getValue()).registerForActivityResult(processorActivityContract, activityResultCallback);
        }
        trueLayerSession.resultLauncher = activityResultLauncherRegisterForActivityResult;
        ProcessorContext processorContext = trueLayerSession.pendingPaymentContext;
        if (Intrinsics.areEqual(trueLayerSession.stateFlow.getValue(), TrueLayerEvent.Initializing.INSTANCE) && processorContext != null) {
            trueLayerSession.stateFlow.setValue(TrueLayerEvent.OpenedFlow.INSTANCE);
            ActivityResultLauncher<ProcessorContext> activityResultLauncher = trueLayerSession.resultLauncher;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(processorContext);
            }
        }
        return Unit.INSTANCE;
    }
}
