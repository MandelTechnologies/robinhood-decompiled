package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.installation.WhatsAppInstallation;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.DefaultContactsStore;
import com.robinhood.librobinhood.data.store.ReferralStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralOfferDetailsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo;", "contactsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/DefaultContactsStore;", "eventLoggingDelegate", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/ReferralOfferDetailEventLoggingDelegate;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "whatsAppInstallation", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ReferralOfferDetailsDuxo_Factory implements Factory<ReferralOfferDetailsDuxo> {
    private final Provider<DefaultContactsStore> contactsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ReferralOfferDetailEventLoggingDelegate> eventLoggingDelegate;
    private final Provider<PersistentCacheManager> persistentCacheManager;
    private final Provider<ReferralStore> referralStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;
    private final Provider<WhatsAppInstallation> whatsAppInstallation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ReferralOfferDetailsDuxo_Factory create(Provider<DefaultContactsStore> provider, Provider<ReferralOfferDetailEventLoggingDelegate> provider2, Provider<PersistentCacheManager> provider3, Provider<ReferralStore> provider4, Provider<UserStore> provider5, Provider<WhatsAppInstallation> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final ReferralOfferDetailsDuxo newInstance(DefaultContactsStore defaultContactsStore, ReferralOfferDetailEventLoggingDelegate referralOfferDetailEventLoggingDelegate, PersistentCacheManager persistentCacheManager, ReferralStore referralStore, UserStore userStore, WhatsAppInstallation whatsAppInstallation, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(defaultContactsStore, referralOfferDetailEventLoggingDelegate, persistentCacheManager, referralStore, userStore, whatsAppInstallation, duxoBundle, savedStateHandle);
    }

    public ReferralOfferDetailsDuxo_Factory(Provider<DefaultContactsStore> contactsStore, Provider<ReferralOfferDetailEventLoggingDelegate> eventLoggingDelegate, Provider<PersistentCacheManager> persistentCacheManager, Provider<ReferralStore> referralStore, Provider<UserStore> userStore, Provider<WhatsAppInstallation> whatsAppInstallation, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
        Intrinsics.checkNotNullParameter(eventLoggingDelegate, "eventLoggingDelegate");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(referralStore, "referralStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contactsStore = contactsStore;
        this.eventLoggingDelegate = eventLoggingDelegate;
        this.persistentCacheManager = persistentCacheManager;
        this.referralStore = referralStore;
        this.userStore = userStore;
        this.whatsAppInstallation = whatsAppInstallation;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public ReferralOfferDetailsDuxo get() {
        Companion companion = INSTANCE;
        DefaultContactsStore defaultContactsStore = this.contactsStore.get();
        Intrinsics.checkNotNullExpressionValue(defaultContactsStore, "get(...)");
        ReferralOfferDetailEventLoggingDelegate referralOfferDetailEventLoggingDelegate = this.eventLoggingDelegate.get();
        Intrinsics.checkNotNullExpressionValue(referralOfferDetailEventLoggingDelegate, "get(...)");
        PersistentCacheManager persistentCacheManager = this.persistentCacheManager.get();
        Intrinsics.checkNotNullExpressionValue(persistentCacheManager, "get(...)");
        ReferralStore referralStore = this.referralStore.get();
        Intrinsics.checkNotNullExpressionValue(referralStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        WhatsAppInstallation whatsAppInstallation = this.whatsAppInstallation.get();
        Intrinsics.checkNotNullExpressionValue(whatsAppInstallation, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(defaultContactsStore, referralOfferDetailEventLoggingDelegate, persistentCacheManager, referralStore, userStore, whatsAppInstallation, duxoBundle, savedStateHandle);
    }

    /* compiled from: ReferralOfferDetailsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo_Factory;", "contactsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/DefaultContactsStore;", "eventLoggingDelegate", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/ReferralOfferDetailEventLoggingDelegate;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "whatsAppInstallation", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ReferralOfferDetailsDuxo_Factory create(Provider<DefaultContactsStore> contactsStore, Provider<ReferralOfferDetailEventLoggingDelegate> eventLoggingDelegate, Provider<PersistentCacheManager> persistentCacheManager, Provider<ReferralStore> referralStore, Provider<UserStore> userStore, Provider<WhatsAppInstallation> whatsAppInstallation, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
            Intrinsics.checkNotNullParameter(eventLoggingDelegate, "eventLoggingDelegate");
            Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
            Intrinsics.checkNotNullParameter(referralStore, "referralStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ReferralOfferDetailsDuxo_Factory(contactsStore, eventLoggingDelegate, persistentCacheManager, referralStore, userStore, whatsAppInstallation, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final ReferralOfferDetailsDuxo newInstance(DefaultContactsStore contactsStore, ReferralOfferDetailEventLoggingDelegate eventLoggingDelegate, PersistentCacheManager persistentCacheManager, ReferralStore referralStore, UserStore userStore, WhatsAppInstallation whatsAppInstallation, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
            Intrinsics.checkNotNullParameter(eventLoggingDelegate, "eventLoggingDelegate");
            Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
            Intrinsics.checkNotNullParameter(referralStore, "referralStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ReferralOfferDetailsDuxo(contactsStore, eventLoggingDelegate, persistentCacheManager, referralStore, userStore, whatsAppInstallation, duxoBundle, savedStateHandle);
        }
    }
}
