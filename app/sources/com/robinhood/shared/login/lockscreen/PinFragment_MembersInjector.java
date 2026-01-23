package com.robinhood.shared.login.lockscreen;

import android.graphics.drawable.Drawable;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.authlock.prefs.BiometricsChangedPref;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.p099di.BrandLogo;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PinFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bk\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/PinFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/PinFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "authManagerLazy", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "brandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "biometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinFragment_MembersInjector implements MembersInjector<PinFragment> {
    private final Provider<AuthManager> authManagerLazy;
    private final Provider<StringPreference> biometricsChangedPref;
    private final Provider<DirectResourceReference<Drawable>> brandLogo;
    private final Provider<ScarletOverlay> lockscreenOverlay;
    private final Provider<PinManager> pinManager;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<PinFragment> create(Provider<BaseFragmentSingletons> provider, Provider<PinManager> provider2, Provider<AuthManager> provider3, Provider<ScarletOverlay> provider4, Provider<DirectResourceReference<Drawable>> provider5, Provider<StringPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAuthManagerLazy(PinFragment pinFragment, Lazy<AuthManager> lazy) {
        INSTANCE.injectAuthManagerLazy(pinFragment, lazy);
    }

    @JvmStatic
    @BiometricsChangedPref
    public static final void injectBiometricsChangedPref(PinFragment pinFragment, StringPreference stringPreference) {
        INSTANCE.injectBiometricsChangedPref(pinFragment, stringPreference);
    }

    @JvmStatic
    @BrandLogo
    public static final void injectBrandLogo(PinFragment pinFragment, DirectResourceReference<Drawable> directResourceReference) {
        INSTANCE.injectBrandLogo(pinFragment, directResourceReference);
    }

    @LockscreenScarletOverlay
    @JvmStatic
    public static final void injectLockscreenOverlay(PinFragment pinFragment, ScarletOverlay scarletOverlay) {
        INSTANCE.injectLockscreenOverlay(pinFragment, scarletOverlay);
    }

    @JvmStatic
    public static final void injectPinManager(PinFragment pinFragment, PinManager pinManager) {
        INSTANCE.injectPinManager(pinFragment, pinManager);
    }

    public PinFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<PinManager> pinManager, Provider<AuthManager> authManagerLazy, Provider<ScarletOverlay> lockscreenOverlay, Provider<DirectResourceReference<Drawable>> brandLogo, Provider<StringPreference> biometricsChangedPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
        Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
        Intrinsics.checkNotNullParameter(brandLogo, "brandLogo");
        Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
        this.singletons = singletons;
        this.pinManager = pinManager;
        this.authManagerLazy = authManagerLazy;
        this.lockscreenOverlay = lockscreenOverlay;
        this.brandLogo = brandLogo;
        this.biometricsChangedPref = biometricsChangedPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PinFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        companion2.injectPinManager(instance, pinManager);
        Lazy<AuthManager> lazy = DoubleCheck.lazy(this.authManagerLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion2.injectAuthManagerLazy(instance, lazy);
        ScarletOverlay scarletOverlay = this.lockscreenOverlay.get();
        Intrinsics.checkNotNullExpressionValue(scarletOverlay, "get(...)");
        companion2.injectLockscreenOverlay(instance, scarletOverlay);
        DirectResourceReference<Drawable> directResourceReference = this.brandLogo.get();
        Intrinsics.checkNotNullExpressionValue(directResourceReference, "get(...)");
        companion2.injectBrandLogo(instance, directResourceReference);
        StringPreference stringPreference = this.biometricsChangedPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectBiometricsChangedPref(instance, stringPreference);
    }

    /* compiled from: PinFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jr\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0017\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u000e0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J#\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J#\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u000eH\u0007J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/PinFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/PinFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "authManagerLazy", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "brandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "biometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "injectPinManager", "", "instance", "injectAuthManagerLazy", "Ldagger/Lazy;", "injectLockscreenOverlay", "injectBrandLogo", "injectBiometricsChangedPref", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PinFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<PinManager> pinManager, Provider<AuthManager> authManagerLazy, Provider<ScarletOverlay> lockscreenOverlay, Provider<DirectResourceReference<Drawable>> brandLogo, Provider<StringPreference> biometricsChangedPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
            Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
            Intrinsics.checkNotNullParameter(brandLogo, "brandLogo");
            Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
            return new PinFragment_MembersInjector(singletons, pinManager, authManagerLazy, lockscreenOverlay, brandLogo, biometricsChangedPref);
        }

        @JvmStatic
        public final void injectPinManager(PinFragment instance, PinManager pinManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            instance.setPinManager(pinManager);
        }

        @JvmStatic
        public final void injectAuthManagerLazy(PinFragment instance, Lazy<AuthManager> authManagerLazy) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
            instance.setAuthManagerLazy(authManagerLazy);
        }

        @LockscreenScarletOverlay
        @JvmStatic
        public final void injectLockscreenOverlay(PinFragment instance, ScarletOverlay lockscreenOverlay) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
            instance.setLockscreenOverlay(lockscreenOverlay);
        }

        @JvmStatic
        @BrandLogo
        public final void injectBrandLogo(PinFragment instance, DirectResourceReference<Drawable> brandLogo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(brandLogo, "brandLogo");
            instance.setBrandLogo(brandLogo);
        }

        @JvmStatic
        @BiometricsChangedPref
        public final void injectBiometricsChangedPref(PinFragment instance, StringPreference biometricsChangedPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
            instance.setBiometricsChangedPref(biometricsChangedPref);
        }
    }
}
