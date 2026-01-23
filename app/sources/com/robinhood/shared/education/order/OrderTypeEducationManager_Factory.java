package com.robinhood.shared.education.order;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.shared.education.order.OrderTypeEducationManager_MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", SharedPreferencesModule.USER_PREFS_NAME, "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderTypeEducationManager_Factory implements Factory<OrderTypeEducationManager> {
    private final Provider<SharedPreferences> userPrefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderTypeEducationManager_Factory create(Provider<SharedPreferences> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final OrderTypeEducationManager newInstance() {
        return INSTANCE.newInstance();
    }

    public OrderTypeEducationManager_Factory(Provider<SharedPreferences> userPrefs) {
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        this.userPrefs = userPrefs;
    }

    @Override // javax.inject.Provider
    public OrderTypeEducationManager get() {
        OrderTypeEducationManager orderTypeEducationManagerNewInstance = INSTANCE.newInstance();
        OrderTypeEducationManager_MembersInjector.Companion companion = OrderTypeEducationManager_MembersInjector.INSTANCE;
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        companion.injectUserPrefs(orderTypeEducationManagerNewInstance, sharedPreferences);
        return orderTypeEducationManagerNewInstance;
    }

    /* compiled from: OrderTypeEducationManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/education/order/OrderTypeEducationManager_Factory;", SharedPreferencesModule.USER_PREFS_NAME, "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "newInstance", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderTypeEducationManager_Factory create(Provider<SharedPreferences> userPrefs) {
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            return new OrderTypeEducationManager_Factory(userPrefs);
        }

        @JvmStatic
        public final OrderTypeEducationManager newInstance() {
            return new OrderTypeEducationManager();
        }
    }
}
