package com.robinhood.store.stripe;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/stripe/StripeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/stripe/StripeStore;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "context", "Landroid/content/Context;", "rhmStripeApiKeyResource", "", "rhsStripeApiKeyResource", "rhyStripeApiKeyResource", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-stripe_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StripeStore_Factory implements Factory<StripeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> context;
    private final Provider<Integer> rhmStripeApiKeyResource;
    private final Provider<Integer> rhsStripeApiKeyResource;
    private final Provider<Integer> rhyStripeApiKeyResource;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final StripeStore_Factory create(Provider<UserStore> provider, Provider<Context> provider2, Provider<Integer> provider3, Provider<Integer> provider4, Provider<Integer> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final StripeStore newInstance(UserStore userStore, Context context, int i, int i2, int i3, StoreBundle storeBundle) {
        return INSTANCE.newInstance(userStore, context, i, i2, i3, storeBundle);
    }

    public StripeStore_Factory(Provider<UserStore> userStore, Provider<Context> context, Provider<Integer> rhmStripeApiKeyResource, Provider<Integer> rhsStripeApiKeyResource, Provider<Integer> rhyStripeApiKeyResource, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rhmStripeApiKeyResource, "rhmStripeApiKeyResource");
        Intrinsics.checkNotNullParameter(rhsStripeApiKeyResource, "rhsStripeApiKeyResource");
        Intrinsics.checkNotNullParameter(rhyStripeApiKeyResource, "rhyStripeApiKeyResource");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.userStore = userStore;
        this.context = context;
        this.rhmStripeApiKeyResource = rhmStripeApiKeyResource;
        this.rhsStripeApiKeyResource = rhsStripeApiKeyResource;
        this.rhyStripeApiKeyResource = rhyStripeApiKeyResource;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public StripeStore get() {
        Companion companion = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        Integer num = this.rhmStripeApiKeyResource.get();
        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
        int iIntValue = num.intValue();
        Integer num2 = this.rhsStripeApiKeyResource.get();
        Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.rhyStripeApiKeyResource.get();
        Intrinsics.checkNotNullExpressionValue(num3, "get(...)");
        int iIntValue3 = num3.intValue();
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(userStore, context, iIntValue, iIntValue2, iIntValue3, storeBundle);
    }

    /* compiled from: StripeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J8\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/stripe/StripeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/stripe/StripeStore_Factory;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "context", "Landroid/content/Context;", "rhmStripeApiKeyResource", "", "rhsStripeApiKeyResource", "rhyStripeApiKeyResource", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/stripe/StripeStore;", "lib-store-stripe_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StripeStore_Factory create(Provider<UserStore> userStore, Provider<Context> context, Provider<Integer> rhmStripeApiKeyResource, Provider<Integer> rhsStripeApiKeyResource, Provider<Integer> rhyStripeApiKeyResource, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rhmStripeApiKeyResource, "rhmStripeApiKeyResource");
            Intrinsics.checkNotNullParameter(rhsStripeApiKeyResource, "rhsStripeApiKeyResource");
            Intrinsics.checkNotNullParameter(rhyStripeApiKeyResource, "rhyStripeApiKeyResource");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new StripeStore_Factory(userStore, context, rhmStripeApiKeyResource, rhsStripeApiKeyResource, rhyStripeApiKeyResource, storeBundle);
        }

        @JvmStatic
        public final StripeStore newInstance(UserStore userStore, Context context, int rhmStripeApiKeyResource, int rhsStripeApiKeyResource, int rhyStripeApiKeyResource, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new StripeStore(userStore, context, rhmStripeApiKeyResource, rhsStripeApiKeyResource, rhyStripeApiKeyResource, storeBundle);
        }
    }
}
