package com.robinhood.android.waitlist;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.waitlist.contracts.Waitlist;
import com.robinhood.android.waitlist.loading.WaitlistLoadingFragment;
import com.robinhood.android.waitlist.spot.WaitlistSpotFragment;
import com.robinhood.models.api.bonfire.waitlist.WaitlistStatus;
import com.robinhood.models.p355ui.bonfire.waitlist.WaitlistSpot;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: WaitlistActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/waitlist/WaitlistActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/waitlist/loading/WaitlistLoadingFragment$Callbacks;", "<init>", "()V", "allowLandscapeMode", "", "getAllowLandscapeMode", "()Z", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onWaitlistSpotAvailable", "waitlistSpot", "Lcom/robinhood/models/ui/bonfire/waitlist/WaitlistSpot;", "onBackPressed", "Companion", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WaitlistActivity extends BaseActivity implements WaitlistLoadingFragment.Callbacks {
    private final boolean allowLandscapeMode;
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public WaitlistActivity() {
        super(C31444R.layout.activity_waitlist);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected boolean getAllowLandscapeMode() {
        return this.allowLandscapeMode;
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C31444R.id.fragment_container, WaitlistLoadingFragment.INSTANCE.newInstance((Parcelable) new WaitlistLoadingFragment.Args(((Waitlist) INSTANCE.getExtras((Activity) this)).getName())));
        }
    }

    @Override // com.robinhood.android.waitlist.loading.WaitlistLoadingFragment.Callbacks
    public void onWaitlistSpotAvailable(WaitlistSpot waitlistSpot) {
        Intrinsics.checkNotNullParameter(waitlistSpot, "waitlistSpot");
        if (waitlistSpot.getStatus() == WaitlistStatus.UNAVAILABLE) {
            finish();
        } else {
            new ReplaceFragmentBuilder((WaitlistSpotFragment) WaitlistSpotFragment.INSTANCE.newInstance((Parcelable) new WaitlistSpotFragment.Args(((Waitlist) INSTANCE.getExtras((Activity) this)).getName(), waitlistSpot))).setUseDefaultAnimation(false).buildAndExecute(this);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Screen.Name name = Screen.Name.WAITLIST;
        String simpleName = WaitlistSpotFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(name, simpleName, str, byteString, 12, defaultConstructorMarker), new Component(Component.ComponentType.BUTTON, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
        finish();
    }

    /* compiled from: WaitlistActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/waitlist/WaitlistActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/waitlist/WaitlistActivity;", "Lcom/robinhood/android/waitlist/contracts/Waitlist;", "<init>", "()V", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<WaitlistActivity, Waitlist> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Waitlist getExtras(WaitlistActivity waitlistActivity) {
            return (Waitlist) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, waitlistActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Waitlist waitlist2) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, waitlist2);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Waitlist waitlist2) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, waitlist2);
        }
    }
}
