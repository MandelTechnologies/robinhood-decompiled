package com.robinhood.android.iav.p154ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateIavRelationshipActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CreateIavRelationshipActivity_MembersInjector implements MembersInjector<CreateIavRelationshipActivity> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<RhShortcutManager> shortcutManager;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CreateIavRelationshipActivity> create(Provider<BaseActivitySingletons> provider, Provider<RhShortcutManager> provider2, Provider<AnalyticsLogger> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAnalytics(CreateIavRelationshipActivity createIavRelationshipActivity, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(createIavRelationshipActivity, analyticsLogger);
    }

    @JvmStatic
    public static final void injectShortcutManager(CreateIavRelationshipActivity createIavRelationshipActivity, RhShortcutManager rhShortcutManager) {
        INSTANCE.injectShortcutManager(createIavRelationshipActivity, rhShortcutManager);
    }

    public CreateIavRelationshipActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<RhShortcutManager> shortcutManager, Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(shortcutManager, "shortcutManager");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.singletons = singletons;
        this.shortcutManager = shortcutManager;
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateIavRelationshipActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        RhShortcutManager rhShortcutManager = this.shortcutManager.get();
        Intrinsics.checkNotNullExpressionValue(rhShortcutManager, "get(...)");
        companion2.injectShortcutManager(instance, rhShortcutManager);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: CreateIavRelationshipActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectShortcutManager", "", "instance", "injectAnalytics", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CreateIavRelationshipActivity> create(Provider<BaseActivitySingletons> singletons, Provider<RhShortcutManager> shortcutManager, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(shortcutManager, "shortcutManager");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new CreateIavRelationshipActivity_MembersInjector(singletons, shortcutManager, analytics);
        }

        @JvmStatic
        public final void injectShortcutManager(CreateIavRelationshipActivity instance, RhShortcutManager shortcutManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(shortcutManager, "shortcutManager");
            instance.setShortcutManager(shortcutManager);
        }

        @JvmStatic
        public final void injectAnalytics(CreateIavRelationshipActivity instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
