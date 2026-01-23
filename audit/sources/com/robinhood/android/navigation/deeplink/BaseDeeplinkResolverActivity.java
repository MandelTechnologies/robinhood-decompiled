package com.robinhood.android.navigation.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.ComponentActivity6;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.perf.OneTimeUsePerfTrace;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.Intents2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.utils.extensions.Activity;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BaseDeeplinkResolverActivity.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J#\u0010'\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020\tH\u0002¢\u0006\u0002\u0010,R\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/BaseDeeplinkResolverActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "deepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "getDeepLinkResolver", "()Lcom/robinhood/android/navigation/DeepLinkResolver;", DeeplinkResolverActivity.KEY_SHOULD_CLEAR_TOP_OVERRIDE, "", "getShouldClearTopOverride", "()Ljava/lang/Boolean;", "shouldClearTopOverride$delegate", "Lkotlin/Lazy;", DeeplinkResolverActivity.KEY_CURRENT_SCARLET_THEME, "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "getCurrentScarletTheme", "()Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "currentScarletTheme$delegate", "loadTimeTrace", "Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace;", "shouldPromptForLockscreen", "requiresAuthentication", "ignoreNavigationType", "getIgnoreNavigationType", "()Z", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "redirectToUnrecognizedDeepLinkScreenAndTerminate", "redirectToWelcomeScreenAndTerminate", "redirectToMainScreenAndTerminate", "redirectAndTerminate", "intents", "", "Landroid/content/Intent;", "shouldClearTop", "([Landroid/content/Intent;Z)V", "feature-deep-link-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class BaseDeeplinkResolverActivity extends BaseActivity {
    public static final int $stable = 8;
    public AuthManager authManager;

    /* renamed from: shouldClearTopOverride$delegate, reason: from kotlin metadata */
    private final Lazy shouldClearTopOverride = Activity.intentExtra(this, DeeplinkResolverActivity.KEY_SHOULD_CLEAR_TOP_OVERRIDE);

    /* renamed from: currentScarletTheme$delegate, reason: from kotlin metadata */
    private final Lazy currentScarletTheme = Activity.intentExtra(this, DeeplinkResolverActivity.KEY_CURRENT_SCARLET_THEME);
    private final OneTimeUsePerfTrace loadTimeTrace = new OneTimeUsePerfTrace("deeplinkResolver");
    private final boolean ignoreNavigationType = true;

    protected abstract DeepLinkResolver getDeepLinkResolver();

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    private final Boolean getShouldClearTopOverride() {
        return (Boolean) this.shouldClearTopOverride.getValue();
    }

    private final ThemesFromScarlet getCurrentScarletTheme() {
        return (ThemesFromScarlet) this.currentScarletTheme.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean getIgnoreNavigationType() {
        return this.ignoreNavigationType;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        DeepLinkOrigin deepLinkOrigin;
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data == null) {
            redirectToWelcomeScreenAndTerminate();
            return;
        }
        final boolean z = getIntent().getAction() != null;
        DeepLinkResolver deepLinkResolver = getDeepLinkResolver();
        if (z) {
            deepLinkOrigin = DeepLinkOrigin.External.INSTANCE;
        } else {
            deepLinkOrigin = DeepLinkOrigin.Internal.INSTANCE;
        }
        DeepLink deepLinkResolve$default = DeepLinkResolver.DefaultImpls.resolve$default(deepLinkResolver, data, deepLinkOrigin, false, 4, null);
        if (deepLinkResolve$default == null) {
            redirectToUnrecognizedDeepLinkScreenAndTerminate();
            return;
        }
        if (!getAuthManager().isLoggedIn() && deepLinkResolve$default.getRequireAuthentication()) {
            redirectToWelcomeScreenAndTerminate();
            return;
        }
        Boolean shouldClearTopOverride = getShouldClearTopOverride();
        boolean zBooleanValue = shouldClearTopOverride != null ? shouldClearTopOverride.booleanValue() : deepLinkResolve$default.getShouldClearTop();
        if (!deepLinkResolve$default.isLongRunning()) {
            redirectAndTerminate(deepLinkResolve$default.getGetIntents().invoke(this, data), zBooleanValue);
            return;
        }
        final ThemesFromScarlet currentScarletTheme = getCurrentScarletTheme();
        if (currentScarletTheme == null) {
            currentScarletTheme = new ThemesFromScarlet(false, false, false, false, false, null, 63, null);
        }
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(-308728092, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-308728092, i, -1, "com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity.onCreate.<anonymous> (BaseDeeplinkResolverActivity.kt:101)");
                }
                Observable observableJust = Observable.just(currentScarletTheme);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                ThemesFromScarlet themesFromScarlet = currentScarletTheme;
                final boolean z2 = z;
                BentoTheme2.BentoTheme(observableJust, themesFromScarlet, ComposableLambda3.rememberComposableLambda(237840882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity.onCreate.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(237840882, i2, -1, "com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity.onCreate.<anonymous>.<anonymous> (BaseDeeplinkResolverActivity.kt:108)");
                        }
                        if (z2) {
                            composer2.startReplaceGroup(-1177956316);
                            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, null, BaseDeeplinkResolverActivity3.INSTANCE.getLambda$158711688$feature_deep_link_resolver_externalDebug(), composer2, 805306374, 510);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1177308447);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            BaseDeeplinkResolverActivity3 baseDeeplinkResolverActivity3 = BaseDeeplinkResolverActivity3.INSTANCE;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, baseDeeplinkResolverActivity3.getLambda$821296010$feature_deep_link_resolver_externalDebug(), null, null, null, 0, 0L, 0L, null, baseDeeplinkResolverActivity3.getLambda$855900831$feature_deep_link_resolver_externalDebug(), composer2, 805306422, 508);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
        getLifecycleScope().launchWhenCreated(new C225502(zBooleanValue, deepLinkResolve$default, data, null));
    }

    /* compiled from: BaseDeeplinkResolverActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity$onCreate$2", m3645f = "BaseDeeplinkResolverActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.navigation.deeplink.BaseDeeplinkResolverActivity$onCreate$2 */
    static final class C225502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $data;
        final /* synthetic */ DeepLink $deepLink;
        final /* synthetic */ boolean $shouldClearTop;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C225502(boolean z, DeepLink deepLink, Uri uri, Continuation<? super C225502> continuation) {
            super(2, continuation);
            this.$shouldClearTop = z;
            this.$deepLink = deepLink;
            this.$data = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseDeeplinkResolverActivity.this.new C225502(this.$shouldClearTop, this.$deepLink, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C225502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BaseDeeplinkResolverActivity2 baseDeeplinkResolverActivity2 = new BaseDeeplinkResolverActivity2(BaseDeeplinkResolverActivity.this, this.$deepLink, this.$data, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, baseDeeplinkResolverActivity2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseDeeplinkResolverActivity.this.redirectAndTerminate((Intent[]) obj, this.$shouldClearTop);
            return Unit.INSTANCE;
        }
    }

    private final void redirectToUnrecognizedDeepLinkScreenAndTerminate() {
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        AddIntentFlagAndDeepLinkData.addIntentFlagAndDeepLinkData(intent, new Intent[]{intentCreateIntent$default}, false);
        startActivity(intentCreateIntent$default);
        overridePendingTransition(0, 0);
        finish();
    }

    private final void redirectToWelcomeScreenAndTerminate() {
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, WelcomeIntentKey.INSTANCE, null, false, 12, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        AddIntentFlagAndDeepLinkData.addIntentFlagAndDeepLinkData(intent, new Intent[]{intentCreateIntent$default}, false);
        startActivity(intentCreateIntent$default);
        overridePendingTransition(0, 0);
        finish();
    }

    private final void redirectToMainScreenAndTerminate() {
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, 12, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        AddIntentFlagAndDeepLinkData.addIntentFlagAndDeepLinkData(intent, new Intent[]{intentCreateIntent$default}, false);
        startActivity(intentCreateIntent$default);
        overridePendingTransition(0, 0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void redirectAndTerminate(Intent[] intents, boolean shouldClearTop) {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Intents2.getNavigationTypeTransitionEnabled(intent)) {
            for (Intent intent2 : intents) {
                Intents2.putNavigationTypeTransitionEnabled(intent2, true);
            }
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
            NavigationType navigationType = Intents2.getNavigationType(intent3);
            if (navigationType != null) {
                Intents2.putNavigationType((Intent) ArraysKt.last(intents), navigationType);
            }
        }
        if (intents.length == 0 && getAuthManager().isLoggedIn()) {
            redirectToMainScreenAndTerminate();
            return;
        }
        if (intents.length == 0 && !getAuthManager().isLoggedIn()) {
            redirectToWelcomeScreenAndTerminate();
            return;
        }
        Intent intent4 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        AddIntentFlagAndDeepLinkData.addIntentFlagAndDeepLinkData(intent4, intents, shouldClearTop);
        startActivities(intents);
        overridePendingTransition(0, 0);
        finish();
    }
}
