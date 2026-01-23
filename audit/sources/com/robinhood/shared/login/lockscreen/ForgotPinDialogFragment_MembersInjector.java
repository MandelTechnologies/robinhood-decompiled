package com.robinhood.shared.login.lockscreen;

import android.app.Application;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ForgotPinDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BW\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "authManagerLazy", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "sheriffLazy", "Lcom/robinhood/api/retrofit/Sheriff;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "app", "Landroid/app/Application;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ForgotPinDialogFragment_MembersInjector implements MembersInjector<ForgotPinDialogFragment> {
    private final Provider<Application> app;
    private final Provider<AuthManager> authManagerLazy;
    private final Provider<PinManager> pinManager;
    private final Provider<Sheriff> sheriffLazy;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ForgotPinDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<AuthManager> provider2, Provider<Sheriff> provider3, Provider<PinManager> provider4, Provider<Application> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectApp(ForgotPinDialogFragment forgotPinDialogFragment, Application application) {
        INSTANCE.injectApp(forgotPinDialogFragment, application);
    }

    @JvmStatic
    public static final void injectAuthManagerLazy(ForgotPinDialogFragment forgotPinDialogFragment, Lazy<AuthManager> lazy) {
        INSTANCE.injectAuthManagerLazy(forgotPinDialogFragment, lazy);
    }

    @JvmStatic
    public static final void injectPinManager(ForgotPinDialogFragment forgotPinDialogFragment, PinManager pinManager) {
        INSTANCE.injectPinManager(forgotPinDialogFragment, pinManager);
    }

    @JvmStatic
    public static final void injectSheriffLazy(ForgotPinDialogFragment forgotPinDialogFragment, Lazy<Sheriff> lazy) {
        INSTANCE.injectSheriffLazy(forgotPinDialogFragment, lazy);
    }

    public ForgotPinDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<AuthManager> authManagerLazy, Provider<Sheriff> sheriffLazy, Provider<PinManager> pinManager, Provider<Application> app) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
        Intrinsics.checkNotNullParameter(sheriffLazy, "sheriffLazy");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(app, "app");
        this.singletons = singletons;
        this.authManagerLazy = authManagerLazy;
        this.sheriffLazy = sheriffLazy;
        this.pinManager = pinManager;
        this.app = app;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ForgotPinDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        Companion companion2 = INSTANCE;
        Lazy<AuthManager> lazy = DoubleCheck.lazy(this.authManagerLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion2.injectAuthManagerLazy(instance, lazy);
        Lazy<Sheriff> lazy2 = DoubleCheck.lazy(this.sheriffLazy);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        companion2.injectSheriffLazy(instance, lazy2);
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        companion2.injectPinManager(instance, pinManager);
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        companion2.injectApp(instance, application);
    }

    /* compiled from: ForgotPinDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\b2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\f0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0007J#\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\u0016H\u0007J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\f0\u0016H\u0007J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/ForgotPinDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "authManagerLazy", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "sheriffLazy", "Lcom/robinhood/api/retrofit/Sheriff;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "app", "Landroid/app/Application;", "injectAuthManagerLazy", "", "instance", "Ldagger/Lazy;", "injectSheriffLazy", "injectPinManager", "injectApp", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ForgotPinDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<AuthManager> authManagerLazy, Provider<Sheriff> sheriffLazy, Provider<PinManager> pinManager, Provider<Application> app) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
            Intrinsics.checkNotNullParameter(sheriffLazy, "sheriffLazy");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(app, "app");
            return new ForgotPinDialogFragment_MembersInjector(singletons, authManagerLazy, sheriffLazy, pinManager, app);
        }

        @JvmStatic
        public final void injectAuthManagerLazy(ForgotPinDialogFragment instance, Lazy<AuthManager> authManagerLazy) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
            instance.setAuthManagerLazy(authManagerLazy);
        }

        @JvmStatic
        public final void injectSheriffLazy(ForgotPinDialogFragment instance, Lazy<Sheriff> sheriffLazy) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sheriffLazy, "sheriffLazy");
            instance.setSheriffLazy(sheriffLazy);
        }

        @JvmStatic
        public final void injectPinManager(ForgotPinDialogFragment instance, PinManager pinManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            instance.setPinManager(pinManager);
        }

        @JvmStatic
        public final void injectApp(ForgotPinDialogFragment instance, Application app) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(app, "app");
            instance.setApp(app);
        }
    }
}
