package com.robinhood.android.matcha.p177ui;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.matcha.p177ui.common.HasPromptedUsernameUpdatePref;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "hasPromptedUsernameUpdatePref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaTransferActivity_MembersInjector implements MembersInjector<MatchaTransferActivity> {
    private final Provider<BooleanPreference> hasPromptedUsernameUpdatePref;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<MatchaTransferActivity> create(Provider<BaseActivitySingletons> provider, Provider<BooleanPreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @HasPromptedUsernameUpdatePref
    @JvmStatic
    public static final void injectHasPromptedUsernameUpdatePref(MatchaTransferActivity matchaTransferActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectHasPromptedUsernameUpdatePref(matchaTransferActivity, booleanPreference);
    }

    public MatchaTransferActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<BooleanPreference> hasPromptedUsernameUpdatePref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(hasPromptedUsernameUpdatePref, "hasPromptedUsernameUpdatePref");
        this.singletons = singletons;
        this.hasPromptedUsernameUpdatePref = hasPromptedUsernameUpdatePref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchaTransferActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        BooleanPreference booleanPreference = this.hasPromptedUsernameUpdatePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasPromptedUsernameUpdatePref(instance, booleanPreference);
    }

    /* compiled from: MatchaTransferActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "hasPromptedUsernameUpdatePref", "Lcom/robinhood/prefs/BooleanPreference;", "injectHasPromptedUsernameUpdatePref", "", "instance", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<MatchaTransferActivity> create(Provider<BaseActivitySingletons> singletons, Provider<BooleanPreference> hasPromptedUsernameUpdatePref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(hasPromptedUsernameUpdatePref, "hasPromptedUsernameUpdatePref");
            return new MatchaTransferActivity_MembersInjector(singletons, hasPromptedUsernameUpdatePref);
        }

        @HasPromptedUsernameUpdatePref
        @JvmStatic
        public final void injectHasPromptedUsernameUpdatePref(MatchaTransferActivity instance, BooleanPreference hasPromptedUsernameUpdatePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasPromptedUsernameUpdatePref, "hasPromptedUsernameUpdatePref");
            instance.setHasPromptedUsernameUpdatePref(hasPromptedUsernameUpdatePref);
        }
    }
}
