package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.Stripe;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.stripe3ds2.init.p418ui.StripeToolbarCustomization;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PaymentAuthWebViewActivityViewModel.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002()B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "buttonText", "", "getButtonText$payments_core_release", "()Ljava/lang/String;", "cancellationResult", "Landroid/content/Intent;", "getCancellationResult$payments_core_release", "()Landroid/content/Intent;", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders$delegate", "Lkotlin/Lazy;", "paymentResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "getPaymentResult$payments_core_release", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toolbarBackgroundColor", "getToolbarBackgroundColor$payments_core_release", "toolbarTitle", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "getToolbarTitle$payments_core_release", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "fireAnalytics", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "logComplete", "logError", "logStart", "Factory", "ToolbarTitleData", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentAuthWebViewActivityViewModel extends ViewModel {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final PaymentBrowserAuthContract.Args args;
    private final /* synthetic */ String buttonText;

    /* renamed from: extraHeaders$delegate, reason: from kotlin metadata */
    private final Lazy extraHeaders;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final /* synthetic */ String toolbarBackgroundColor;
    private final /* synthetic */ ToolbarTitleData toolbarTitle;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAuthWebViewActivityViewModel(PaymentBrowserAuthContract.Args args, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        ToolbarTitleData toolbarTitleData;
        String buttonText;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.args = args;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.extraHeaders = LazyKt.lazy(new Function0<Map<String, ? extends String>>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivityViewModel$extraHeaders$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                PaymentAuthWebViewActivityViewModel paymentAuthWebViewActivityViewModel = this.this$0;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                if (paymentAuthWebViewActivityViewModel.args.getReferrer() != null) {
                    mapCreateMapBuilder.put("Referer", paymentAuthWebViewActivityViewModel.args.getReferrer());
                }
                return MapsKt.plus(new StripeClientUserAgentHeaderFactory(null, 1, null).create(Stripe.INSTANCE.getAppInfo()), MapsKt.build(mapCreateMapBuilder));
            }
        });
        StripeToolbarCustomization toolbarCustomization = args.getToolbarCustomization();
        this.buttonText = (toolbarCustomization == null || (buttonText = toolbarCustomization.getButtonText()) == null || StringsKt.isBlank(buttonText)) ? null : buttonText;
        StripeToolbarCustomization toolbarCustomization2 = args.getToolbarCustomization();
        if (toolbarCustomization2 == null) {
            toolbarTitleData = null;
        } else {
            String headerText = toolbarCustomization2.getHeaderText();
            headerText = (headerText == null || StringsKt.isBlank(headerText)) ? null : headerText;
            if (headerText != null) {
                Intrinsics.checkNotNull(headerText);
                toolbarTitleData = new ToolbarTitleData(headerText, toolbarCustomization2);
            }
        }
        this.toolbarTitle = toolbarTitleData;
        StripeToolbarCustomization toolbarCustomization3 = args.getToolbarCustomization();
        this.toolbarBackgroundColor = toolbarCustomization3 != null ? toolbarCustomization3.getBackgroundColor() : null;
    }

    public final Map<String, String> getExtraHeaders() {
        return (Map) this.extraHeaders.getValue();
    }

    /* renamed from: getButtonText$payments_core_release, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: getToolbarTitle$payments_core_release, reason: from getter */
    public final ToolbarTitleData getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: getToolbarBackgroundColor$payments_core_release, reason: from getter */
    public final String getToolbarBackgroundColor() {
        return this.toolbarBackgroundColor;
    }

    public final /* synthetic */ Unvalidated getPaymentResult$payments_core_release() {
        String clientSecret = this.args.getClientSecret();
        String lastPathSegment = Uri.parse(this.args.getUrl()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new Unvalidated(clientSecret, 0, null, false, lastPathSegment, null, this.args.getStripeAccountId(), 46, null);
    }

    public final /* synthetic */ Intent getCancellationResult$payments_core_release() {
        Intent intentPutExtras = new Intent().putExtras(Unvalidated.copy$default(getPaymentResult$payments_core_release(), null, this.args.getShouldCancelIntentOnUserNavigation() ? 3 : 1, null, this.args.getShouldCancelSource(), null, null, null, 117, null).toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final void logStart() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, null, 62, null));
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, null, 62, null));
    }

    public final void logError() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, null, 62, null));
    }

    public final void logComplete() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, null, 62, null));
    }

    private final void fireAnalytics(AnalyticsRequest request) {
        this.analyticsRequestExecutor.executeAsync(request);
    }

    /* compiled from: PaymentAuthWebViewActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "", "", "text", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "toolbarCustomization", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText$payments_core_release", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getToolbarCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ToolbarTitleData {
        private final String text;
        private final StripeToolbarCustomization toolbarCustomization;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolbarTitleData)) {
                return false;
            }
            ToolbarTitleData toolbarTitleData = (ToolbarTitleData) other;
            return Intrinsics.areEqual(this.text, toolbarTitleData.text) && Intrinsics.areEqual(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.text + ", toolbarCustomization=" + this.toolbarCustomization + ")";
        }

        public ToolbarTitleData(String text, StripeToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            this.text = text;
            this.toolbarCustomization = toolbarCustomization;
        }

        /* renamed from: getText$payments_core_release, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: getToolbarCustomization$payments_core_release, reason: from getter */
        public final StripeToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }
    }

    /* compiled from: PaymentAuthWebViewActivityViewModel.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "logger", "Lcom/stripe/android/core/Logger;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Application application;
        private final PaymentBrowserAuthContract.Args args;
        private final Logger logger;

        public Factory(Application application, Logger logger, PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(args, "args");
            this.application = application;
            this.logger = logger;
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new PaymentAuthWebViewActivityViewModel(this.args, new DefaultAnalyticsRequestExecutor(this.logger, Dispatchers.getIO()), new PaymentAnalyticsRequestFactory(this.application, this.args.getPublishableKey(), (Set<String>) SetsKt.setOf("PaymentAuthWebViewActivity")));
        }
    }
}
