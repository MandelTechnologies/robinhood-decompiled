package com.robinhood.iac.statusbanner;

import android.view.View;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.IacStatusBannerStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacStatusBannerProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerProvider;", "parentView", "Ljavax/inject/Provider;", "Landroid/view/View;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class IacStatusBannerProvider_Factory implements Factory<IacStatusBannerProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventLogger> eventLogger;
    private final Provider<IacStatusBannerStore> iacStatusBannerStore;
    private final Provider<View> parentView;

    @JvmStatic
    public static final IacStatusBannerProvider_Factory create(Provider<View> provider, Provider<IacStatusBannerStore> provider2, Provider<EventLogger> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final IacStatusBannerProvider newInstance(View view, IacStatusBannerStore iacStatusBannerStore, EventLogger eventLogger) {
        return INSTANCE.newInstance(view, iacStatusBannerStore, eventLogger);
    }

    public IacStatusBannerProvider_Factory(Provider<View> parentView, Provider<IacStatusBannerStore> iacStatusBannerStore, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.parentView = parentView;
        this.iacStatusBannerStore = iacStatusBannerStore;
        this.eventLogger = eventLogger;
    }

    @Override // javax.inject.Provider
    public IacStatusBannerProvider get() {
        Companion companion = INSTANCE;
        View view = this.parentView.get();
        Intrinsics.checkNotNullExpressionValue(view, "get(...)");
        IacStatusBannerStore iacStatusBannerStore = this.iacStatusBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacStatusBannerStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        return companion.newInstance(view, iacStatusBannerStore, eventLogger);
    }

    /* compiled from: IacStatusBannerProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/iac/statusbanner/IacStatusBannerProvider_Factory;", "parentView", "Ljavax/inject/Provider;", "Landroid/view/View;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "newInstance", "Lcom/robinhood/iac/statusbanner/IacStatusBannerProvider;", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IacStatusBannerProvider_Factory create(Provider<View> parentView, Provider<IacStatusBannerStore> iacStatusBannerStore, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(parentView, "parentView");
            Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new IacStatusBannerProvider_Factory(parentView, iacStatusBannerStore, eventLogger);
        }

        @JvmStatic
        public final IacStatusBannerProvider newInstance(View parentView, IacStatusBannerStore iacStatusBannerStore, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(parentView, "parentView");
            Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new IacStatusBannerProvider(parentView, iacStatusBannerStore, eventLogger);
        }
    }
}
