package com.truelayer.payments.p419ui;

import android.content.Context;
import android.os.Bundle;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.analytics.utils.AnalyticsError;
import com.truelayer.payments.analytics.utils.ErrorType;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.configuration.Environment;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration;
import com.truelayer.payments.core.domain.configuration.TrueLayerConfiguration;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.errors.TrueLayerConfigurationError;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.utils.UtilsKt;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.models.ProcessorStatus;
import com.truelayer.payments.p419ui.utils.AnalyticsExtensions3;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TrueLayerUI.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\u0007\bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/ui/TrueLayerUI;", "", "core", "Lcom/truelayer/payments/core/TrueLayerCore;", "analytics", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "(Lcom/truelayer/payments/core/TrueLayerCore;Lcom/truelayer/payments/analytics/TrueLayerAnalytics;)V", "Builder", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TrueLayerUI {
    private final TrueLayerAnalytics analytics;
    private final TrueLayerCore core;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static Outcome<TrueLayerUI, ? extends TrueLayerConfigurationError> TrueLayerUI = new Fail(new TrueLayerConfigurationError.NotInitialised("TrueLayerUI"));
    private static final Lazy<TrueLayerCore> core$delegate = LazyKt.lazy(new Function0<TrueLayerCore>() { // from class: com.truelayer.payments.ui.TrueLayerUI$Companion$core$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TrueLayerCore invoke() {
            return ((TrueLayerUI) Outcome.expect$default(TrueLayerUI.TrueLayerUI, null, 1, null)).core;
        }
    });
    private static final Lazy<TrueLayerAnalytics> analytics$delegate = LazyKt.lazy(new Function0<TrueLayerAnalytics>() { // from class: com.truelayer.payments.ui.TrueLayerUI$Companion$analytics$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TrueLayerAnalytics invoke() {
            return ((TrueLayerUI) Outcome.expect$default(TrueLayerUI.TrueLayerUI, null, 1, null)).analytics;
        }
    });

    @JvmStatic
    public static final Outcome<TrueLayerUI, TrueLayerConfigurationError> init(Context context, Builder builder) throws IllegalArgumentException {
        return INSTANCE.init(context, builder);
    }

    @JvmStatic
    public static final Outcome<TrueLayerUI, TrueLayerConfigurationError> init(Context context, Function1<? super Builder, Unit> function1) throws IllegalArgumentException {
        return INSTANCE.init(context, function1);
    }

    public TrueLayerUI(TrueLayerCore core, TrueLayerAnalytics analytics) {
        Intrinsics.checkNotNullParameter(core, "core");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.core = core;
        this.analytics = analytics;
        TrueLayerUI = new Ok(this);
    }

    /* compiled from: TrueLayerUI.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J-\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/ui/TrueLayerUI$Builder;", "", "environment", "Lcom/truelayer/payments/core/domain/configuration/Environment;", "httpConnection", "Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "(Lcom/truelayer/payments/core/domain/configuration/Environment;Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;)V", "getEnvironment", "()Lcom/truelayer/payments/core/domain/configuration/Environment;", "setEnvironment", "(Lcom/truelayer/payments/core/domain/configuration/Environment;)V", "getHttpConnection", "()Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "setHttpConnection", "(Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;)V", "build", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/ui/TrueLayerUI;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "", "context", "Landroid/content/Context;", "build$payments_ui_release", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Builder {
        public static final int $stable = 8;
        private Environment environment;
        private HttpConnectionConfiguration httpConnection;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Environment environment, HttpConnectionConfiguration httpConnectionConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                environment = builder.environment;
            }
            if ((i & 2) != 0) {
                httpConnectionConfiguration = builder.httpConnection;
            }
            return builder.copy(environment, httpConnectionConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        /* renamed from: component2, reason: from getter */
        public final HttpConnectionConfiguration getHttpConnection() {
            return this.httpConnection;
        }

        public final Builder copy(Environment environment, HttpConnectionConfiguration httpConnection) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new Builder(environment, httpConnection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return this.environment == builder.environment && Intrinsics.areEqual(this.httpConnection, builder.httpConnection);
        }

        public int hashCode() {
            int iHashCode = this.environment.hashCode() * 31;
            HttpConnectionConfiguration httpConnectionConfiguration = this.httpConnection;
            return iHashCode + (httpConnectionConfiguration == null ? 0 : httpConnectionConfiguration.hashCode());
        }

        public String toString() {
            return "Builder(environment=" + this.environment + ", httpConnection=" + this.httpConnection + ")";
        }

        public Builder(Environment environment, HttpConnectionConfiguration httpConnectionConfiguration) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.environment = environment;
            this.httpConnection = httpConnectionConfiguration;
        }

        public /* synthetic */ Builder(Environment environment, HttpConnectionConfiguration httpConnectionConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Environment.PRODUCTION : environment, (i & 2) != 0 ? null : httpConnectionConfiguration);
        }

        public final Environment getEnvironment() {
            return this.environment;
        }

        public final void setEnvironment(Environment environment) {
            Intrinsics.checkNotNullParameter(environment, "<set-?>");
            this.environment = environment;
        }

        public final HttpConnectionConfiguration getHttpConnection() {
            return this.httpConnection;
        }

        public final void setHttpConnection(HttpConnectionConfiguration httpConnectionConfiguration) {
            this.httpConnection = httpConnectionConfiguration;
        }

        public final Builder environment(Environment environment) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.environment = environment;
            return this;
        }

        public final Builder httpConnection(HttpConnectionConfiguration httpConnection) {
            Intrinsics.checkNotNullParameter(httpConnection, "httpConnection");
            this.httpConnection = httpConnection;
            return this;
        }

        public final Outcome<Outcome<TrueLayerUI, TrueLayerConfigurationError>, Throwable> build$payments_ui_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Environment environment = this.environment;
                HttpConnectionConfiguration httpConnectionConfiguration = this.httpConnection;
                TrueLayerConfiguration trueLayerConfiguration = new TrueLayerConfiguration(environment, httpConnectionConfiguration == null ? new HttpConnectionConfiguration(0L, null, 3, null) : httpConnectionConfiguration, null, null, 12, null);
                com.truelayer.payments.analytics.configuration.Environment analyticsServerApi = UtilsKt.getAnalyticsServerApi(this.environment);
                TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                TrueLayerAnalytics trueLayerAnalyticsShared$default = TrueLayerAnalytics.Companion.shared$default(companion, applicationContext, new TrueLayerAnalytics.Configuration(analyticsServerApi, null, null, null, false, 30, null), null, null, null, 28, null);
                TrueLayerCore.Companion companion2 = TrueLayerCore.INSTANCE;
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                Outcome<TrueLayerCore, TrueLayerConfigurationError> outcomeInit = companion2.init(applicationContext2, trueLayerAnalyticsShared$default, trueLayerConfiguration);
                if (outcomeInit instanceof Ok) {
                    outcomeInit = new Ok<>(new TrueLayerUI((TrueLayerCore) ((Ok) outcomeInit).getValue(), trueLayerAnalyticsShared$default));
                } else if (!(outcomeInit instanceof Fail)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new Ok(outcomeInit);
            } catch (Throwable th) {
                return new Fail(th);
            }
        }
    }

    /* compiled from: TrueLayerUI.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ6\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J5\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010!\u001a\u00020\"2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020&0%¢\u0006\u0002\b'H\u0007J\u0015\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0005H\u0001¢\u0006\u0002\b*J\r\u0010+\u001a\u00020&H\u0001¢\u0006\u0002\b,J\u0018\u0010-\u001a\u00020&2\u0006\u0010!\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0018H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00060"}, m3636d2 = {"Lcom/truelayer/payments/ui/TrueLayerUI$Companion;", "", "()V", "TrueLayerUI", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/ui/TrueLayerUI;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "analytics", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "getAnalytics$payments_ui_release", "()Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "analytics$delegate", "Lkotlin/Lazy;", "core", "Lcom/truelayer/payments/core/TrueLayerCore;", "getCore$payments_ui_release", "()Lcom/truelayer/payments/core/TrueLayerCore;", "core$delegate", "isInitialized", "", "isInitialized$payments_ui_release", "()Z", "getMandateStatus", "Lcom/truelayer/payments/ui/models/ProcessorStatus;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "id", "", "resourceToken", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentStatus", "init", "context", "Landroid/content/Context;", "config", "Lcom/truelayer/payments/ui/TrueLayerUI$Builder;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initWith", "trueLayerUI", "initWith$payments_ui_release", "reset", "reset$payments_ui_release", "trackError", "Lcom/truelayer/payments/ui/models/PaymentContext;", "error", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isInitialized$payments_ui_release() {
            return TrueLayerUI.TrueLayerUI instanceof Ok;
        }

        public final TrueLayerCore getCore$payments_ui_release() {
            return (TrueLayerCore) TrueLayerUI.core$delegate.getValue();
        }

        public final TrueLayerAnalytics getAnalytics$payments_ui_release() {
            return (TrueLayerAnalytics) TrueLayerUI.analytics$delegate.getValue();
        }

        @JvmStatic
        public final Outcome<TrueLayerUI, TrueLayerConfigurationError> init(Context context, Builder config) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Outcome outcome = TrueLayerUI.TrueLayerUI;
            if (outcome instanceof Ok) {
                return new Fail(new TrueLayerConfigurationError.AlreadyInitialised("TrueLayerUI"));
            }
            if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            synchronized (this) {
                TrueLayerUI.TrueLayerUI = (Outcome) Outcome.expect$default(config.build$payments_ui_release(context), null, 1, null);
                Unit unit = Unit.INSTANCE;
            }
            return TrueLayerUI.TrueLayerUI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final Outcome<TrueLayerUI, TrueLayerConfigurationError> init(Context context, Function1<? super Builder, Unit> config) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Builder builder = new Builder(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            config.invoke(builder);
            return init(context, builder);
        }

        public final void reset$payments_ui_release() {
            Outcome outcome = TrueLayerUI.TrueLayerUI;
            if (outcome instanceof Ok) {
                TrueLayerCore.INSTANCE.reset();
            } else if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        public final void initWith$payments_ui_release(TrueLayerUI trueLayerUI) {
            Intrinsics.checkNotNullParameter(trueLayerUI, "trueLayerUI");
            TrueLayerUI.TrueLayerUI = new Ok(trueLayerUI);
        }

        public static /* synthetic */ Object getPaymentStatus$default(Companion companion, String str, String str2, Bundle bundle, Continuation continuation, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            return companion.getPaymentStatus(str, str2, bundle, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getPaymentStatus(String str, String str2, Bundle bundle, Continuation<? super Outcome<? extends ProcessorStatus, ? extends CoreError>> continuation) {
            TrueLayerUI5 trueLayerUI5;
            Companion companion;
            PaymentContext paymentContext;
            if (continuation instanceof TrueLayerUI5) {
                trueLayerUI5 = (TrueLayerUI5) continuation;
                int i = trueLayerUI5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    trueLayerUI5.label = i - Integer.MIN_VALUE;
                    companion = this;
                } else {
                    companion = this;
                    trueLayerUI5 = new TrueLayerUI5(companion, continuation);
                }
            }
            Object payment = trueLayerUI5.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = trueLayerUI5.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(payment);
                PaymentContext paymentContext2 = new PaymentContext(str, str2, "", null, PaymentContext.PaymentType.SinglePayment, bundle != null ? bundle.getBoolean("react-native", false) : false ? TrueLayerAnalytics.IntegrationType.ReactNative : TrueLayerAnalytics.IntegrationType.Native, bundle != null ? bundle.getString("react-native-sdk-version") : null, 8, null);
                Network network = companion.getCore$payments_ui_release().getNetwork();
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = paymentContext2.intoDomain$payments_ui_release();
                trueLayerUI5.L$0 = paymentContext2;
                trueLayerUI5.label = 1;
                payment = network.getPayment(paymentContextIntoDomain$payments_ui_release, trueLayerUI5);
                if (payment == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentContext = paymentContext2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentContext = (PaymentContext) trueLayerUI5.L$0;
                ResultKt.throwOnFailure(payment);
            }
            Outcome ok = (Outcome) payment;
            if (ok instanceof Ok) {
                ok = new Ok(ProcessorStatus.INSTANCE.toStatus((Payment) ((Ok) ok).getValue()));
            } else if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ok instanceof Ok) {
                return ok;
            }
            if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            TrueLayerUI.INSTANCE.trackError(paymentContext, (CoreError) ((Fail) ok).getError());
            return ok;
        }

        public static /* synthetic */ Object getMandateStatus$default(Companion companion, String str, String str2, Bundle bundle, Continuation continuation, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            return companion.getMandateStatus(str, str2, bundle, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getMandateStatus(String str, String str2, Bundle bundle, Continuation<? super Outcome<? extends ProcessorStatus, ? extends CoreError>> continuation) {
            TrueLayerUI4 trueLayerUI4;
            Companion companion;
            PaymentContext paymentContext;
            if (continuation instanceof TrueLayerUI4) {
                trueLayerUI4 = (TrueLayerUI4) continuation;
                int i = trueLayerUI4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    trueLayerUI4.label = i - Integer.MIN_VALUE;
                    companion = this;
                } else {
                    companion = this;
                    trueLayerUI4 = new TrueLayerUI4(companion, continuation);
                }
            }
            Object payment = trueLayerUI4.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = trueLayerUI4.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(payment);
                PaymentContext paymentContext2 = new PaymentContext(str, str2, "", null, PaymentContext.PaymentType.Mandate, bundle != null ? bundle.getBoolean("react-native", false) : false ? TrueLayerAnalytics.IntegrationType.ReactNative : TrueLayerAnalytics.IntegrationType.Native, bundle != null ? bundle.getString("react-native-sdk-version") : null, 8, null);
                Network network = companion.getCore$payments_ui_release().getNetwork();
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = paymentContext2.intoDomain$payments_ui_release();
                trueLayerUI4.L$0 = paymentContext2;
                trueLayerUI4.label = 1;
                payment = network.getPayment(paymentContextIntoDomain$payments_ui_release, trueLayerUI4);
                if (payment == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentContext = paymentContext2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentContext = (PaymentContext) trueLayerUI4.L$0;
                ResultKt.throwOnFailure(payment);
            }
            Outcome ok = (Outcome) payment;
            if (ok instanceof Ok) {
                ok = new Ok(ProcessorStatus.INSTANCE.toStatus((Payment) ((Ok) ok).getValue()));
            } else if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ok instanceof Ok) {
                return ok;
            }
            if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            TrueLayerUI.INSTANCE.trackError(paymentContext, (CoreError) ((Fail) ok).getError());
            return ok;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void trackError(PaymentContext context, CoreError error) {
            AnalyticsError analyticsErrorCopy$default;
            AnalyticsError analyticsError = AnalyticsExtensions3.toAnalyticsError(error, context);
            if (analyticsError.getType() == ErrorType.Validation) {
                analyticsErrorCopy$default = AnalyticsError.copy$default(analyticsError, ErrorType.ParseFailed, null, false, null, null, null, 0, null, "Failed to parse " + context.getPaymentType().name() + " response when getting status", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
            } else {
                analyticsErrorCopy$default = AnalyticsError.copy$default(analyticsError, null, null, false, null, null, null, 0, null, "Failed to get " + context.getPaymentType().name() + " status", 255, null);
            }
            TrueLayerAnalytics.INSTANCE.setAnalyticsContext(new TrueLayerAnalytics.AnalyticsContext(context.getId(), null, context.getResourceToken(), context.getPaymentType().intoDomain$payments_ui_release().intoAnalyticsType(), null, null, null, context.getIntegrationType(), context.getIntegrationVersion(), 114, null));
            getAnalytics$payments_ui_release().track(new AnalyticsEvents.ErrorScreenLoaded(null, analyticsErrorCopy$default, 1, 0 == true ? 1 : 0));
        }
    }
}
