package com.robinhood.android.navigation.deeplink.unrecognized;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CountryGateErrorType;
import com.robinhood.rosetta.eventlogging.CountryGatingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnrecognizedDeepLinkActivity.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requiresAuthentication", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "launchPlayStore", "logErrorAlertAppear", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$RegionGatedLoggingContext;", "Companion", "feature-unrecognized-deep-link_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UnrecognizedDeepLinkActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public AppType appType;
    public EventLogger eventLogger;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    /* renamed from: requiresAuthentication */
    public boolean getShouldPromptForLockScreen() {
        return false;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            if (((DeepLinkIntentKey.UnrecognizedDeepLink) companion.getExtras((Activity) this)).getLaunchPlayStoreImmediately()) {
                launchPlayStore();
            } else {
                logErrorAlertAppear(((DeepLinkIntentKey.UnrecognizedDeepLink) companion.getExtras((Activity) this)).getRegionGatedLoggingContext());
                RhDialogFragment.Builder title = RhDialogFragment.INSTANCE.create(this).setId(C22562R.id.dialog_id_unrecognized_deep_link).setTitle(C22562R.string.dialog_unrecognized_deep_link_title, new Object[0]);
                int i = C22562R.string.dialog_unrecognized_deep_link_message;
                AppType appType = getAppType();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                RhDialogFragment.Builder negativeButton = title.setMessage(i, appType.toAppName(resources)).setPositiveButton(C22562R.string.dialog_unrecognized_deep_link_action_update, new Object[0]).setNegativeButton(C22562R.string.dialog_unrecognized_deep_link_action_dismiss, new Object[0]);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "unrecognizedDeepLink", false, 4, null);
            }
        }
        LifecycleHost.DefaultImpls.bind$default(this, ScarletManager2.getScarletManager(this).getThemeChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.navigation.deeplink.unrecognized.UnrecognizedDeepLinkActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnrecognizedDeepLinkActivity.onCreate$lambda$0(this.f$0, (ThemeNode) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(UnrecognizedDeepLinkActivity unrecognizedDeepLinkActivity, ThemeNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        unrecognizedDeepLinkActivity.getWindow().getDecorView().setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(unrecognizedDeepLinkActivity, C20690R.attr.colorPrimary)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C22562R.id.dialog_id_unrecognized_deep_link) {
            launchPlayStore();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C22562R.id.dialog_id_unrecognized_deep_link) {
            if (((DeepLinkIntentKey.UnrecognizedDeepLink) INSTANCE.getExtras((Activity) this)).getRelaunchAppOnDismiss()) {
                Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, WelcomeIntentKey.INSTANCE, null, false, 12, null);
                intentCreateIntent$default.addFlags(335544320);
                startActivity(intentCreateIntent$default);
            }
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void launchPlayStore() {
        if (!GooglePlay.INSTANCE.launchStore(this)) {
            Resources resources = getResources();
            int i = C11048R.string.force_update_error_no_play_store;
            AppType appType = getAppType();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            Toast.makeText(this, resources.getString(i, appType.toAppName(resources2)), 1).show();
        }
        finish();
    }

    private final void logErrorAlertAppear(DeepLinkIntentKey.RegionGatedLoggingContext loggingContext) {
        Context context;
        if (loggingContext != null) {
            String regionGates = loggingContext.getRegionGates();
            if (regionGates == null) {
                regionGates = "";
            }
            context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CountryGatingContext(regionGates, CountryGateErrorType.DEEPLINK, loggingContext.getDeeplinkPath(), "", "", null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -524289, -1, 16383, null);
        } else {
            context = null;
        }
        Context context2 = context;
        EventLogger eventLogger = getEventLogger();
        String simpleName = UnrecognizedDeepLinkActivity.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(null, null, simpleName, null, 11, null), new Component(Component.ComponentType.ERROR_ALERT, null, null, 6, null), null, context2, 9, null);
    }

    /* compiled from: UnrecognizedDeepLinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity;", "Lcom/robinhood/android/navigation/keys/DeepLinkIntentKey$UnrecognizedDeepLink;", "<init>", "()V", "feature-unrecognized-deep-link_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<UnrecognizedDeepLinkActivity, DeepLinkIntentKey.UnrecognizedDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public DeepLinkIntentKey.UnrecognizedDeepLink getExtras(UnrecognizedDeepLinkActivity unrecognizedDeepLinkActivity) {
            return (DeepLinkIntentKey.UnrecognizedDeepLink) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, unrecognizedDeepLinkActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, DeepLinkIntentKey.UnrecognizedDeepLink unrecognizedDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, unrecognizedDeepLink);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, DeepLinkIntentKey.UnrecognizedDeepLink unrecognizedDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, unrecognizedDeepLink);
        }
    }
}
