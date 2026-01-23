package com.robinhood.android.nightly.prompt;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightlyAdoptionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager;", "nightlyUpgradePrompt", "Ljavax/inject/Provider;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;", "lastNightlyPromptPref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NightlyAdoptionManager_Factory implements Factory<NightlyAdoptionManager> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LastNightlyPromptDatePreference> lastNightlyPromptPref;
    private final Provider<NightlyUpgradePrompt> nightlyUpgradePrompt;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final NightlyAdoptionManager_Factory create(Provider<NightlyUpgradePrompt> provider, Provider<LastNightlyPromptDatePreference> provider2, Provider<ExperimentsStore> provider3, Provider<RhProcessLifecycleOwner> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final NightlyAdoptionManager newInstance(NightlyUpgradePrompt nightlyUpgradePrompt, LastNightlyPromptDatePreference lastNightlyPromptDatePreference, ExperimentsStore experimentsStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        return INSTANCE.newInstance(nightlyUpgradePrompt, lastNightlyPromptDatePreference, experimentsStore, rhProcessLifecycleOwner);
    }

    public NightlyAdoptionManager_Factory(Provider<NightlyUpgradePrompt> nightlyUpgradePrompt, Provider<LastNightlyPromptDatePreference> lastNightlyPromptPref, Provider<ExperimentsStore> experimentsStore, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(nightlyUpgradePrompt, "nightlyUpgradePrompt");
        Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.nightlyUpgradePrompt = nightlyUpgradePrompt;
        this.lastNightlyPromptPref = lastNightlyPromptPref;
        this.experimentsStore = experimentsStore;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // javax.inject.Provider
    public NightlyAdoptionManager get() {
        Companion companion = INSTANCE;
        NightlyUpgradePrompt nightlyUpgradePrompt = this.nightlyUpgradePrompt.get();
        Intrinsics.checkNotNullExpressionValue(nightlyUpgradePrompt, "get(...)");
        LastNightlyPromptDatePreference lastNightlyPromptDatePreference = this.lastNightlyPromptPref.get();
        Intrinsics.checkNotNullExpressionValue(lastNightlyPromptDatePreference, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        return companion.newInstance(nightlyUpgradePrompt, lastNightlyPromptDatePreference, experimentsStore, rhProcessLifecycleOwner);
    }

    /* compiled from: NightlyAdoptionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager_Factory;", "nightlyUpgradePrompt", "Ljavax/inject/Provider;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;", "lastNightlyPromptPref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "newInstance", "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager;", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NightlyAdoptionManager_Factory create(Provider<NightlyUpgradePrompt> nightlyUpgradePrompt, Provider<LastNightlyPromptDatePreference> lastNightlyPromptPref, Provider<ExperimentsStore> experimentsStore, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(nightlyUpgradePrompt, "nightlyUpgradePrompt");
            Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new NightlyAdoptionManager_Factory(nightlyUpgradePrompt, lastNightlyPromptPref, experimentsStore, rhProcessLifecycleOwner);
        }

        @JvmStatic
        public final NightlyAdoptionManager newInstance(NightlyUpgradePrompt nightlyUpgradePrompt, LastNightlyPromptDatePreference lastNightlyPromptPref, ExperimentsStore experimentsStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(nightlyUpgradePrompt, "nightlyUpgradePrompt");
            Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new NightlyAdoptionManager(nightlyUpgradePrompt, lastNightlyPromptPref, experimentsStore, rhProcessLifecycleOwner);
        }
    }
}
