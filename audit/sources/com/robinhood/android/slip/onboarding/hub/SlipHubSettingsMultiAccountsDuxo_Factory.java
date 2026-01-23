package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHubSettingsMultiAccountsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo;", "slipHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SlipHubSettingsMultiAccountsDuxo_Factory implements Factory<SlipHubSettingsMultiAccountsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SlipHubStore> slipHubStore;
    private final Provider<SlipStatusStore> slipStatusStore;
    private final Provider<SlipHubSettingsMultiAccountsStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SlipHubSettingsMultiAccountsDuxo_Factory create(Provider<SlipHubStore> provider, Provider<SlipStatusStore> provider2, Provider<UserStore> provider3, Provider<SlipHubSettingsMultiAccountsStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final SlipHubSettingsMultiAccountsDuxo newInstance(SlipHubStore slipHubStore, SlipStatusStore slipStatusStore, UserStore userStore, SlipHubSettingsMultiAccountsStateProvider slipHubSettingsMultiAccountsStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(slipHubStore, slipStatusStore, userStore, slipHubSettingsMultiAccountsStateProvider, duxoBundle);
    }

    public SlipHubSettingsMultiAccountsDuxo_Factory(Provider<SlipHubStore> slipHubStore, Provider<SlipStatusStore> slipStatusStore, Provider<UserStore> userStore, Provider<SlipHubSettingsMultiAccountsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(slipHubStore, "slipHubStore");
        Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.slipHubStore = slipHubStore;
        this.slipStatusStore = slipStatusStore;
        this.userStore = userStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SlipHubSettingsMultiAccountsDuxo get() {
        Companion companion = INSTANCE;
        SlipHubStore slipHubStore = this.slipHubStore.get();
        Intrinsics.checkNotNullExpressionValue(slipHubStore, "get(...)");
        SlipStatusStore slipStatusStore = this.slipStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(slipStatusStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        SlipHubSettingsMultiAccountsStateProvider slipHubSettingsMultiAccountsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(slipHubSettingsMultiAccountsStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(slipHubStore, slipStatusStore, userStore, slipHubSettingsMultiAccountsStateProvider, duxoBundle);
    }

    /* compiled from: SlipHubSettingsMultiAccountsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo_Factory;", "slipHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SlipHubSettingsMultiAccountsDuxo_Factory create(Provider<SlipHubStore> slipHubStore, Provider<SlipStatusStore> slipStatusStore, Provider<UserStore> userStore, Provider<SlipHubSettingsMultiAccountsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(slipHubStore, "slipHubStore");
            Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SlipHubSettingsMultiAccountsDuxo_Factory(slipHubStore, slipStatusStore, userStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final SlipHubSettingsMultiAccountsDuxo newInstance(SlipHubStore slipHubStore, SlipStatusStore slipStatusStore, UserStore userStore, SlipHubSettingsMultiAccountsStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(slipHubStore, "slipHubStore");
            Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SlipHubSettingsMultiAccountsDuxo(slipHubStore, slipStatusStore, userStore, stateProvider, duxoBundle);
        }
    }
}
