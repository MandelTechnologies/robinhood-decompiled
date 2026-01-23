package com.robinhood.iac.alertsheet;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.api.iac.IacAlertSheetApi;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.StoreBundle;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacAlertSheetStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/IacAlertSheetStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "iacAlertSheetApi", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/api/iac/IacAlertSheetApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class IacAlertSheetStore_Factory implements Factory<IacAlertSheetStore> {
    private final Provider<AppType> appType;
    private final Provider<EventLogger> eventLogger;
    private final Provider<IacAlertSheetApi> iacAlertSheetApi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TargetBackend> targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IacAlertSheetStore_Factory create(Provider<IacAlertSheetApi> provider, Provider<EventLogger> provider2, Provider<TargetBackend> provider3, Provider<AppType> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final IacAlertSheetStore newInstance(IacAlertSheetApi iacAlertSheetApi, EventLogger eventLogger, TargetBackend targetBackend, AppType appType, StoreBundle storeBundle) {
        return INSTANCE.newInstance(iacAlertSheetApi, eventLogger, targetBackend, appType, storeBundle);
    }

    public IacAlertSheetStore_Factory(Provider<IacAlertSheetApi> iacAlertSheetApi, Provider<EventLogger> eventLogger, Provider<TargetBackend> targetBackend, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(iacAlertSheetApi, "iacAlertSheetApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.iacAlertSheetApi = iacAlertSheetApi;
        this.eventLogger = eventLogger;
        this.targetBackend = targetBackend;
        this.appType = appType;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IacAlertSheetStore get() {
        Companion companion = INSTANCE;
        IacAlertSheetApi iacAlertSheetApi = this.iacAlertSheetApi.get();
        Intrinsics.checkNotNullExpressionValue(iacAlertSheetApi, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(iacAlertSheetApi, eventLogger, targetBackend, appType, storeBundle);
    }

    /* compiled from: IacAlertSheetStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/iac/alertsheet/IacAlertSheetStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore_Factory;", "iacAlertSheetApi", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/api/iac/IacAlertSheetApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IacAlertSheetStore_Factory create(Provider<IacAlertSheetApi> iacAlertSheetApi, Provider<EventLogger> eventLogger, Provider<TargetBackend> targetBackend, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(iacAlertSheetApi, "iacAlertSheetApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IacAlertSheetStore_Factory(iacAlertSheetApi, eventLogger, targetBackend, appType, storeBundle);
        }

        @JvmStatic
        public final IacAlertSheetStore newInstance(IacAlertSheetApi iacAlertSheetApi, EventLogger eventLogger, TargetBackend targetBackend, AppType appType, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(iacAlertSheetApi, "iacAlertSheetApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IacAlertSheetStore(iacAlertSheetApi, eventLogger, targetBackend, appType, storeBundle);
        }
    }
}
