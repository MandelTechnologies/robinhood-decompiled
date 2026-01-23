package com.robinhood.shared.equities.store.subzero;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.IntPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubzeroOnboardingHandler_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "subzeroFtuxSeenCountPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SubzeroOnboardingHandler_Factory implements Factory<SubzeroOnboardingHandler> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IntPreference> subzeroFtuxSeenCountPref;

    @JvmStatic
    public static final SubzeroOnboardingHandler_Factory create(Provider<IntPreference> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final SubzeroOnboardingHandler newInstance(IntPreference intPreference) {
        return INSTANCE.newInstance(intPreference);
    }

    public SubzeroOnboardingHandler_Factory(Provider<IntPreference> subzeroFtuxSeenCountPref) {
        Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
        this.subzeroFtuxSeenCountPref = subzeroFtuxSeenCountPref;
    }

    @Override // javax.inject.Provider
    public SubzeroOnboardingHandler get() {
        Companion companion = INSTANCE;
        IntPreference intPreference = this.subzeroFtuxSeenCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        return companion.newInstance(intPreference);
    }

    /* compiled from: SubzeroOnboardingHandler_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler_Factory;", "subzeroFtuxSeenCountPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/IntPreference;", "newInstance", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SubzeroOnboardingHandler_Factory create(Provider<IntPreference> subzeroFtuxSeenCountPref) {
            Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
            return new SubzeroOnboardingHandler_Factory(subzeroFtuxSeenCountPref);
        }

        @JvmStatic
        public final SubzeroOnboardingHandler newInstance(IntPreference subzeroFtuxSeenCountPref) {
            Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
            return new SubzeroOnboardingHandler(subzeroFtuxSeenCountPref);
        }
    }
}
