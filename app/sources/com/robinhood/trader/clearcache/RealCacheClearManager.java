package com.robinhood.trader.clearcache;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.authlock.prefs.PinPref;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.clearcache.CacheClearManager;
import com.robinhood.shared.security.authmanager.AuthTokenInjectionManager;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RealCacheClearManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/trader/clearcache/RealCacheClearManager;", "Lcom/robinhood/shared/clearcache/CacheClearManager;", "authTokenInjectionManager", "Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "applicationContext", "Landroid/content/Context;", "pinPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lcom/robinhood/prefs/StringPreference;)V", "clearCachesAndRestart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-clear-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealCacheClearManager implements CacheClearManager {
    private final Context applicationContext;
    private final AuthTokenInjectionManager authTokenInjectionManager;
    private final Navigator navigator;
    private final StringPreference pinPref;

    /* compiled from: RealCacheClearManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.trader.clearcache.RealCacheClearManager", m3645f = "RealCacheClearManager.kt", m3646l = {26, 37}, m3647m = "clearCachesAndRestart")
    /* renamed from: com.robinhood.trader.clearcache.RealCacheClearManager$clearCachesAndRestart$1 */
    static final class C416721 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C416721(Continuation<? super C416721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealCacheClearManager.this.clearCachesAndRestart(this);
        }
    }

    public RealCacheClearManager(AuthTokenInjectionManager authTokenInjectionManager, Navigator navigator, Context applicationContext, @PinPref StringPreference pinPref) {
        Intrinsics.checkNotNullParameter(authTokenInjectionManager, "authTokenInjectionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(pinPref, "pinPref");
        this.authTokenInjectionManager = authTokenInjectionManager;
        this.navigator = navigator;
        this.applicationContext = applicationContext;
        this.pinPref = pinPref;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.await(r10, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.shared.clearcache.CacheClearManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearCachesAndRestart(Continuation<? super Unit> continuation) {
        C416721 c416721;
        String str;
        if (continuation instanceof C416721) {
            c416721 = (C416721) continuation;
            int i = c416721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c416721.label = i - Integer.MIN_VALUE;
            } else {
                c416721 = new C416721(continuation);
            }
        }
        Object objLogoutLocal = c416721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c416721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLogoutLocal);
            str = this.pinPref.get();
            AuthTokenInjectionManager authTokenInjectionManager = this.authTokenInjectionManager;
            c416721.L$0 = str;
            c416721.label = 1;
            objLogoutLocal = authTokenInjectionManager.logoutLocal(c416721);
            if (objLogoutLocal != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLogoutLocal);
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(this.navigator, this.applicationContext, MainActivityIntentKey.INSTANCE, null, false, 12, null);
            intentCreateIntent$default.setFlags(268468224);
            this.applicationContext.startActivity(intentCreateIntent$default);
            return Unit.INSTANCE;
        }
        str = (String) c416721.L$0;
        ResultKt.throwOnFailure(objLogoutLocal);
        OAuthToken oAuthToken = (OAuthToken) objLogoutLocal;
        if (oAuthToken != null) {
            this.pinPref.set(str);
            Single<LoginStatus> singleLoginInternal = this.authTokenInjectionManager.loginInternal(oAuthToken);
            c416721.L$0 = null;
            c416721.label = 2;
        }
        return Unit.INSTANCE;
    }
}
