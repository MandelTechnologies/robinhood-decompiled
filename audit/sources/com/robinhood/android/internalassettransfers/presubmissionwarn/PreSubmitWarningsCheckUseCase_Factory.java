package com.robinhood.android.internalassettransfers.presubmissionwarn;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nimbus.service.p511v1.NimbusService;

/* compiled from: PreSubmitWarningsCheckUseCase_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;", "factory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitAlertSheetFactory;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PreSubmitWarningsCheckUseCase_Factory implements Factory<PreSubmitWarningsCheckUseCase> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<PresubmissionCheckAlertSheets3> factory;
    private final Provider<NimbusService> nimbusService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PreSubmitWarningsCheckUseCase_Factory create(Provider<PresubmissionCheckAlertSheets3> provider, Provider<AccountProvider> provider2, Provider<NimbusService> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final PreSubmitWarningsCheckUseCase newInstance(PresubmissionCheckAlertSheets3 presubmissionCheckAlertSheets3, AccountProvider accountProvider, NimbusService nimbusService) {
        return INSTANCE.newInstance(presubmissionCheckAlertSheets3, accountProvider, nimbusService);
    }

    public PreSubmitWarningsCheckUseCase_Factory(Provider<PresubmissionCheckAlertSheets3> factory, Provider<AccountProvider> accountProvider, Provider<NimbusService> nimbusService) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
        this.factory = factory;
        this.accountProvider = accountProvider;
        this.nimbusService = nimbusService;
    }

    @Override // javax.inject.Provider
    public PreSubmitWarningsCheckUseCase get() {
        Companion companion = INSTANCE;
        PresubmissionCheckAlertSheets3 presubmissionCheckAlertSheets3 = this.factory.get();
        Intrinsics.checkNotNullExpressionValue(presubmissionCheckAlertSheets3, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        NimbusService nimbusService = this.nimbusService.get();
        Intrinsics.checkNotNullExpressionValue(nimbusService, "get(...)");
        return companion.newInstance(presubmissionCheckAlertSheets3, accountProvider, nimbusService);
    }

    /* compiled from: PreSubmitWarningsCheckUseCase_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase_Factory;", "factory", "Ljavax/inject/Provider;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitAlertSheetFactory;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "newInstance", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PreSubmitWarningsCheckUseCase_Factory create(Provider<PresubmissionCheckAlertSheets3> factory, Provider<AccountProvider> accountProvider, Provider<NimbusService> nimbusService) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
            return new PreSubmitWarningsCheckUseCase_Factory(factory, accountProvider, nimbusService);
        }

        @JvmStatic
        public final PreSubmitWarningsCheckUseCase newInstance(PresubmissionCheckAlertSheets3 factory, AccountProvider accountProvider, NimbusService nimbusService) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
            return new PreSubmitWarningsCheckUseCase(factory, accountProvider, nimbusService);
        }
    }
}
