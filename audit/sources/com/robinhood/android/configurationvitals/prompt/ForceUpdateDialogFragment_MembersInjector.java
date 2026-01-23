package com.robinhood.android.configurationvitals.prompt;

import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.configurationvitals.LastVitalsDismissPref;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ForceUpdateDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "lastVitalsDismissPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ForceUpdateDialogFragment_MembersInjector implements MembersInjector<ForceUpdateDialogFragment> {
    private final Provider<StringPreference> lastVitalsDismissPref;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ForceUpdateDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<StringPreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    @LastVitalsDismissPref
    public static final void injectLastVitalsDismissPref(ForceUpdateDialogFragment forceUpdateDialogFragment, StringPreference stringPreference) {
        INSTANCE.injectLastVitalsDismissPref(forceUpdateDialogFragment, stringPreference);
    }

    public ForceUpdateDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<StringPreference> lastVitalsDismissPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
        this.singletons = singletons;
        this.lastVitalsDismissPref = lastVitalsDismissPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ForceUpdateDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        Companion companion2 = INSTANCE;
        StringPreference stringPreference = this.lastVitalsDismissPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectLastVitalsDismissPref(instance, stringPreference);
    }

    /* compiled from: ForceUpdateDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "lastVitalsDismissPref", "Lcom/robinhood/prefs/StringPreference;", "injectLastVitalsDismissPref", "", "instance", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ForceUpdateDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<StringPreference> lastVitalsDismissPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
            return new ForceUpdateDialogFragment_MembersInjector(singletons, lastVitalsDismissPref);
        }

        @JvmStatic
        @LastVitalsDismissPref
        public final void injectLastVitalsDismissPref(ForceUpdateDialogFragment instance, StringPreference lastVitalsDismissPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
            instance.setLastVitalsDismissPref(lastVitalsDismissPref);
        }
    }
}
