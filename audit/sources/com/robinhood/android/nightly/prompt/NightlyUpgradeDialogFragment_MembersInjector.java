package com.robinhood.android.nightly.prompt;

import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightlyUpgradeDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "lastNightlyPromptPref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NightlyUpgradeDialogFragment_MembersInjector implements MembersInjector<NightlyUpgradeDialogFragment> {
    private final Provider<LastNightlyPromptDatePreference> lastNightlyPromptPref;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<NightlyUpgradeDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<LastNightlyPromptDatePreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectLastNightlyPromptPref(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment, LastNightlyPromptDatePreference lastNightlyPromptDatePreference) {
        INSTANCE.injectLastNightlyPromptPref(nightlyUpgradeDialogFragment, lastNightlyPromptDatePreference);
    }

    public NightlyUpgradeDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<LastNightlyPromptDatePreference> lastNightlyPromptPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
        this.singletons = singletons;
        this.lastNightlyPromptPref = lastNightlyPromptPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NightlyUpgradeDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        Companion companion2 = INSTANCE;
        LastNightlyPromptDatePreference lastNightlyPromptDatePreference = this.lastNightlyPromptPref.get();
        Intrinsics.checkNotNullExpressionValue(lastNightlyPromptDatePreference, "get(...)");
        companion2.injectLastNightlyPromptPref(instance, lastNightlyPromptDatePreference);
    }

    /* compiled from: NightlyUpgradeDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "lastNightlyPromptPref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "injectLastNightlyPromptPref", "", "instance", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<NightlyUpgradeDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<LastNightlyPromptDatePreference> lastNightlyPromptPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
            return new NightlyUpgradeDialogFragment_MembersInjector(singletons, lastNightlyPromptPref);
        }

        @JvmStatic
        public final void injectLastNightlyPromptPref(NightlyUpgradeDialogFragment instance, LastNightlyPromptDatePreference lastNightlyPromptPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lastNightlyPromptPref, "lastNightlyPromptPref");
            instance.setLastNightlyPromptPref(lastNightlyPromptPref);
        }
    }
}
