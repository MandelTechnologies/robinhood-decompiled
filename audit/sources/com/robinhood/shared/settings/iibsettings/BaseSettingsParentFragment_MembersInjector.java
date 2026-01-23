package com.robinhood.shared.settings.iibsettings;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSettingsParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsParentFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class BaseSettingsParentFragment_MembersInjector implements MembersInjector<BaseSettingsParentFragment> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<RhShortcutManager> shortcutManager;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<BaseSettingsParentFragment> create(Provider<BaseFragmentSingletons> provider, Provider<RhShortcutManager> provider2, Provider<ExperimentsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectExperimentsStore(BaseSettingsParentFragment baseSettingsParentFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(baseSettingsParentFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectShortcutManager(BaseSettingsParentFragment baseSettingsParentFragment, RhShortcutManager rhShortcutManager) {
        INSTANCE.injectShortcutManager(baseSettingsParentFragment, rhShortcutManager);
    }

    public BaseSettingsParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<RhShortcutManager> shortcutManager, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(shortcutManager, "shortcutManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.singletons = singletons;
        this.shortcutManager = shortcutManager;
        this.experimentsStore = experimentsStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseSettingsParentFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        RhShortcutManager rhShortcutManager = this.shortcutManager.get();
        Intrinsics.checkNotNullExpressionValue(rhShortcutManager, "get(...)");
        companion2.injectShortcutManager(instance, rhShortcutManager);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
    }

    /* compiled from: BaseSettingsParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "injectShortcutManager", "", "instance", "injectExperimentsStore", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<BaseSettingsParentFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<RhShortcutManager> shortcutManager, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(shortcutManager, "shortcutManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new BaseSettingsParentFragment_MembersInjector(singletons, shortcutManager, experimentsStore);
        }

        @JvmStatic
        public final void injectShortcutManager(BaseSettingsParentFragment instance, RhShortcutManager shortcutManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(shortcutManager, "shortcutManager");
            instance.setShortcutManager(shortcutManager);
        }

        @JvmStatic
        public final void injectExperimentsStore(BaseSettingsParentFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }
    }
}
