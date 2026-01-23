package com.robinhood.shared.common.singular;

import android.content.Context;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealSingularSdkWrapper_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper;", "appContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "disableTrackingPref", "Lcom/robinhood/prefs/BooleanPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RealSingularSdkWrapper_Factory implements Factory<SingularSdkWrapper2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> appContext;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<BooleanPreference> disableTrackingPref;
    private final Provider<EventLogger> eventLogger;

    @JvmStatic
    public static final RealSingularSdkWrapper_Factory create(Provider<Context> provider, Provider<BooleanPreference> provider2, Provider<CoroutineScope> provider3, Provider<EventLogger> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final SingularSdkWrapper2 newInstance(Context context, BooleanPreference booleanPreference, CoroutineScope coroutineScope, EventLogger eventLogger) {
        return INSTANCE.newInstance(context, booleanPreference, coroutineScope, eventLogger);
    }

    public RealSingularSdkWrapper_Factory(Provider<Context> appContext, Provider<BooleanPreference> disableTrackingPref, Provider<CoroutineScope> coroutineScope, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(disableTrackingPref, "disableTrackingPref");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.appContext = appContext;
        this.disableTrackingPref = disableTrackingPref;
        this.coroutineScope = coroutineScope;
        this.eventLogger = eventLogger;
    }

    @Override // javax.inject.Provider
    public SingularSdkWrapper2 get() {
        Companion companion = INSTANCE;
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        BooleanPreference booleanPreference = this.disableTrackingPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        return companion.newInstance(context, booleanPreference, coroutineScope, eventLogger);
    }

    /* compiled from: RealSingularSdkWrapper_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper_Factory;", "appContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "disableTrackingPref", "Lcom/robinhood/prefs/BooleanPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "newInstance", "Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper;", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealSingularSdkWrapper_Factory create(Provider<Context> appContext, Provider<BooleanPreference> disableTrackingPref, Provider<CoroutineScope> coroutineScope, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(disableTrackingPref, "disableTrackingPref");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new RealSingularSdkWrapper_Factory(appContext, disableTrackingPref, coroutineScope, eventLogger);
        }

        @JvmStatic
        public final SingularSdkWrapper2 newInstance(Context appContext, BooleanPreference disableTrackingPref, CoroutineScope coroutineScope, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(disableTrackingPref, "disableTrackingPref");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new SingularSdkWrapper2(appContext, disableTrackingPref, coroutineScope, eventLogger);
        }
    }
}
