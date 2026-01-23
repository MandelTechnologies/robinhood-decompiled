package com.robinhood.android.referral.rewardoffers.referralOffer;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.installation.WhatsAppInstallation;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.shared.store.user.UserStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralOfferActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "whatsAppInstallation", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ReferralOfferActivity_MembersInjector implements MembersInjector<ReferralOfferActivity> {
    private final Provider<ImageLoader> imageLoader;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<UserStore> userStore;
    private final Provider<WhatsAppInstallation> whatsAppInstallation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ReferralOfferActivity> create(Provider<BaseActivitySingletons> provider, Provider<ImageLoader> provider2, Provider<UserStore> provider3, Provider<WhatsAppInstallation> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectImageLoader(ReferralOfferActivity referralOfferActivity, ImageLoader imageLoader) {
        INSTANCE.injectImageLoader(referralOfferActivity, imageLoader);
    }

    @JvmStatic
    public static final void injectUserStore(ReferralOfferActivity referralOfferActivity, UserStore userStore) {
        INSTANCE.injectUserStore(referralOfferActivity, userStore);
    }

    @JvmStatic
    public static final void injectWhatsAppInstallation(ReferralOfferActivity referralOfferActivity, WhatsAppInstallation whatsAppInstallation) {
        INSTANCE.injectWhatsAppInstallation(referralOfferActivity, whatsAppInstallation);
    }

    public ReferralOfferActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<ImageLoader> imageLoader, Provider<UserStore> userStore, Provider<WhatsAppInstallation> whatsAppInstallation) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
        this.singletons = singletons;
        this.imageLoader = imageLoader;
        this.userStore = userStore;
        this.whatsAppInstallation = whatsAppInstallation;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReferralOfferActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        ImageLoader imageLoader = this.imageLoader.get();
        Intrinsics.checkNotNullExpressionValue(imageLoader, "get(...)");
        companion2.injectImageLoader(instance, imageLoader);
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion2.injectUserStore(instance, userStore);
        WhatsAppInstallation whatsAppInstallation = this.whatsAppInstallation.get();
        Intrinsics.checkNotNullExpressionValue(whatsAppInstallation, "get(...)");
        companion2.injectWhatsAppInstallation(instance, whatsAppInstallation);
    }

    /* compiled from: ReferralOfferActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/ReferralOfferActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "whatsAppInstallation", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "injectImageLoader", "", "instance", "injectUserStore", "injectWhatsAppInstallation", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ReferralOfferActivity> create(Provider<BaseActivitySingletons> singletons, Provider<ImageLoader> imageLoader, Provider<UserStore> userStore, Provider<WhatsAppInstallation> whatsAppInstallation) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
            return new ReferralOfferActivity_MembersInjector(singletons, imageLoader, userStore, whatsAppInstallation);
        }

        @JvmStatic
        public final void injectImageLoader(ReferralOfferActivity instance, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            instance.setImageLoader(imageLoader);
        }

        @JvmStatic
        public final void injectUserStore(ReferralOfferActivity instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }

        @JvmStatic
        public final void injectWhatsAppInstallation(ReferralOfferActivity instance, WhatsAppInstallation whatsAppInstallation) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
            instance.setWhatsAppInstallation(whatsAppInstallation);
        }
    }
}
