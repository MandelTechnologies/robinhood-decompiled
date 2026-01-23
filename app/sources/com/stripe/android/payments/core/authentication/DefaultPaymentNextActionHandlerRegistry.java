package com.stripe.android.payments.core.authentication;

import android.content.Context;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.injection.DaggerNextActionHandlerComponent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DefaultPaymentNextActionHandlerRegistry.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B\\\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012/\b\u0001\u0010\u000e\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\u0007j\u0002`\t\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0002\b\r0\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R;\u0010\u000e\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\u0007j\u0002`\t\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0002\b\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&RB\u0010+\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\u0007j\u0002`\t\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0002\b\r0\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R(\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002090\n088@X\u0081\u0004¢\u0006\f\u0012\u0004\b<\u0010\"\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;", "noOpIntentNextActionHandler", "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;", "sourceNextActionHandler", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "paymentNextActionHandlers", "", "includePaymentSheetNextActionHandlers", "Landroid/content/Context;", "applicationContext", "<init>", "(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)V", "Actionable", "actionable", "getNextActionHandler", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "", "onNewActivityResultCaller", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/ActivityResultCallback;)V", "onLauncherInvalidated", "()V", "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;", "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;", "Ljava/util/Map;", "Z", "paymentSheetNextActionHandlers$delegate", "Lkotlin/Lazy;", "getPaymentSheetNextActionHandlers", "()Ljava/util/Map;", "paymentSheetNextActionHandlers", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "getPaymentRelayLauncher$payments_core_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setPaymentRelayLauncher$payments_core_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "paymentBrowserAuthLauncher", "getPaymentBrowserAuthLauncher$payments_core_release", "setPaymentBrowserAuthLauncher$payments_core_release", "", "Lcom/stripe/android/core/model/StripeModel;", "getAllNextActionHandlers$payments_core_release", "()Ljava/util/Set;", "getAllNextActionHandlers$payments_core_release$annotations", "allNextActionHandlers", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class DefaultPaymentNextActionHandlerRegistry implements PaymentNextActionHandlerRegistry {
    private final boolean includePaymentSheetNextActionHandlers;
    private final NoOpIntentNextActionHandler noOpIntentNextActionHandler;
    private ActivityResultLauncher<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> paymentNextActionHandlers;
    private ActivityResultLauncher<PaymentRelayStarter.Args> paymentRelayLauncher;

    /* renamed from: paymentSheetNextActionHandlers$delegate, reason: from kotlin metadata */
    private final Lazy paymentSheetNextActionHandlers;
    private final SourceNextActionHandler sourceNextActionHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DefaultPaymentNextActionHandlerRegistry(NoOpIntentNextActionHandler noOpIntentNextActionHandler, SourceNextActionHandler sourceNextActionHandler, Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> paymentNextActionHandlers, boolean z, final Context applicationContext) {
        Intrinsics.checkNotNullParameter(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        Intrinsics.checkNotNullParameter(sourceNextActionHandler, "sourceNextActionHandler");
        Intrinsics.checkNotNullParameter(paymentNextActionHandlers, "paymentNextActionHandlers");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.noOpIntentNextActionHandler = noOpIntentNextActionHandler;
        this.sourceNextActionHandler = sourceNextActionHandler;
        this.paymentNextActionHandlers = paymentNextActionHandlers;
        this.includePaymentSheetNextActionHandlers = z;
        this.paymentSheetNextActionHandlers = LazyKt.lazy(new Function0<Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>>>() { // from class: com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry$paymentSheetNextActionHandlers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> invoke() {
                return DefaultPaymentNextActionHandlerRegistry3.paymentSheetNextActionHandlers(this.this$0.includePaymentSheetNextActionHandlers, applicationContext);
            }
        });
    }

    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> getPaymentSheetNextActionHandlers() {
        return (Map) this.paymentSheetNextActionHandlers.getValue();
    }

    public final Set<PaymentNextActionHandler<? extends StripeModel>> getAllNextActionHandlers$payments_core_release() {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        setCreateSetBuilder.add(this.noOpIntentNextActionHandler);
        setCreateSetBuilder.add(this.sourceNextActionHandler);
        setCreateSetBuilder.addAll(this.paymentNextActionHandlers.values());
        setCreateSetBuilder.addAll(getPaymentSheetNextActionHandlers().values());
        return SetsKt.build(setCreateSetBuilder);
    }

    public final ActivityResultLauncher<PaymentRelayStarter.Args> getPaymentRelayLauncher$payments_core_release() {
        return this.paymentRelayLauncher;
    }

    public final ActivityResultLauncher<PaymentBrowserAuthContract.Args> getPaymentBrowserAuthLauncher$payments_core_release() {
        return this.paymentBrowserAuthLauncher;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry
    public <Actionable> PaymentNextActionHandler<Actionable> getNextActionHandler(Actionable actionable) {
        PaymentNextActionHandler<Actionable> paymentNextActionHandler;
        if (actionable instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) actionable;
            if (!stripeIntent.requiresAction()) {
                NoOpIntentNextActionHandler noOpIntentNextActionHandler = this.noOpIntentNextActionHandler;
                Intrinsics.checkNotNull(noOpIntentNextActionHandler, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
                return noOpIntentNextActionHandler;
            }
            Map mapPlus = MapsKt.plus(this.paymentNextActionHandlers, getPaymentSheetNextActionHandlers());
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData == null || (paymentNextActionHandler = (PaymentNextActionHandler) mapPlus.get(nextActionData.getClass())) == null) {
                paymentNextActionHandler = this.noOpIntentNextActionHandler;
            }
            Intrinsics.checkNotNull(paymentNextActionHandler, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return paymentNextActionHandler;
        }
        if (actionable instanceof Source) {
            SourceNextActionHandler sourceNextActionHandler = this.sourceNextActionHandler;
            Intrinsics.checkNotNull(sourceNextActionHandler, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return sourceNextActionHandler;
        }
        throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + actionable).toString());
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        Iterator<T> it = getAllNextActionHandlers$payments_core_release().iterator();
        while (it.hasNext()) {
            ((PaymentNextActionHandler) it.next()).onNewActivityResultCaller(activityResultCaller, activityResultCallback);
        }
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.paymentBrowserAuthLauncher = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        Iterator<T> it = getAllNextActionHandlers$payments_core_release().iterator();
        while (it.hasNext()) {
            ((PaymentNextActionHandler) it.next()).onLauncherInvalidated();
        }
        ActivityResultLauncher<PaymentRelayStarter.Args> activityResultLauncher = this.paymentRelayLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher2 = this.paymentBrowserAuthLauncher;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.paymentRelayLauncher = null;
        this.paymentBrowserAuthLauncher = null;
    }

    /* compiled from: DefaultPaymentNextActionHandlerRegistry.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jn\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n¨\u0006\u0017"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;", "", "()V", "createInstance", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "context", "Landroid/content/Context;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "productUsage", "", "isInstantApp", "includePaymentSheetNextActionHandlers", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentNextActionHandlerRegistry createInstance(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean enableLogging, CoroutineContext workContext, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, Function0<String> publishableKeyProvider, Set<String> productUsage, boolean isInstantApp, boolean includePaymentSheetNextActionHandlers) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            Intrinsics.checkNotNullParameter(uiContext, "uiContext");
            Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return DaggerNextActionHandlerComponent.builder().context(context).analyticsRequestFactory(paymentAnalyticsRequestFactory).enableLogging(enableLogging).workContext(workContext).uiContext(uiContext).threeDs1IntentReturnUrlMap(threeDs1IntentReturnUrlMap).publishableKeyProvider(publishableKeyProvider).productUsage(productUsage).isInstantApp(isInstantApp).includePaymentSheetNextActionHandlers(includePaymentSheetNextActionHandlers).build().getRegistry();
        }
    }
}
