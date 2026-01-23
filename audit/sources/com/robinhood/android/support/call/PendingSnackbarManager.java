package com.robinhood.android.support.call;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingSnackbarManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/support/call/PendingSnackbarManager;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "<init>", "()V", "pendingSnackbars", "Ljava/util/LinkedList;", "Lcom/robinhood/android/support/call/PendingSnackbarManager$Config;", "pushPendingSnackbar", "", "config", "onActivityResumed", "activity", "Landroid/app/Activity;", "showPendingSnackbar", "Config", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PendingSnackbarManager implements ActivityLifecycleListener {
    public static final int $stable = 8;
    private final LinkedList<Config> pendingSnackbars = new LinkedList<>();

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public final void pushPendingSnackbar(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.pendingSnackbars.offer(config);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof BaseActivity) {
            showPendingSnackbar(activity);
        }
    }

    private final void showPendingSnackbar(final Activity activity) {
        Config configPoll = this.pendingSnackbars.poll();
        if (configPoll != null) {
            RdsSnackbar rdsSnackbarAddDismissCallback = RdsSnackbar.INSTANCE.make(Snackbars.INSTANCE.findRoot(activity), configPoll.getText(), configPoll.getDuration()).setLeadingIcon(configPoll.getLeadingIcon()).addDismissCallback(new Function2() { // from class: com.robinhood.android.support.call.PendingSnackbarManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingSnackbarManager.showPendingSnackbar$lambda$1$lambda$0(this.f$0, activity, (RdsSnackbar) obj, ((Integer) obj2).intValue());
                }
            });
            if (configPoll.getEventData() != null) {
                rdsSnackbarAddDismissCallback.setEventData(configPoll.getEventData());
            }
            rdsSnackbarAddDismissCallback.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPendingSnackbar$lambda$1$lambda$0(PendingSnackbarManager pendingSnackbarManager, Activity activity, RdsSnackbar rdsSnackbar, int i) {
        pendingSnackbarManager.showPendingSnackbar(activity);
        return Unit.INSTANCE;
    }

    /* compiled from: PendingSnackbarManager.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/support/call/PendingSnackbarManager$Config;", "", "text", "", "duration", "", "leadingIcon", "Landroid/graphics/drawable/Drawable;", "eventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "<init>", "(Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "getText", "()Ljava/lang/CharSequence;", "getDuration", "()I", "getLeadingIcon", "()Landroid/graphics/drawable/Drawable;", "getEventData", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Config {
        public static final int $stable = 8;
        private final int duration;
        private final UserInteractionEventDescriptor eventData;
        private final Drawable leadingIcon;
        private final CharSequence text;

        public static /* synthetic */ Config copy$default(Config config, CharSequence charSequence, int i, Drawable drawable, UserInteractionEventDescriptor userInteractionEventDescriptor, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                charSequence = config.text;
            }
            if ((i2 & 2) != 0) {
                i = config.duration;
            }
            if ((i2 & 4) != 0) {
                drawable = config.leadingIcon;
            }
            if ((i2 & 8) != 0) {
                userInteractionEventDescriptor = config.eventData;
            }
            return config.copy(charSequence, i, drawable, userInteractionEventDescriptor);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* renamed from: component3, reason: from getter */
        public final Drawable getLeadingIcon() {
            return this.leadingIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final UserInteractionEventDescriptor getEventData() {
            return this.eventData;
        }

        public final Config copy(CharSequence text, int duration, Drawable leadingIcon, UserInteractionEventDescriptor eventData) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Config(text, duration, leadingIcon, eventData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.text, config.text) && this.duration == config.duration && Intrinsics.areEqual(this.leadingIcon, config.leadingIcon) && Intrinsics.areEqual(this.eventData, config.eventData);
        }

        public int hashCode() {
            int iHashCode = ((this.text.hashCode() * 31) + Integer.hashCode(this.duration)) * 31;
            Drawable drawable = this.leadingIcon;
            int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.eventData;
            return iHashCode2 + (userInteractionEventDescriptor != null ? userInteractionEventDescriptor.hashCode() : 0);
        }

        public String toString() {
            CharSequence charSequence = this.text;
            return "Config(text=" + ((Object) charSequence) + ", duration=" + this.duration + ", leadingIcon=" + this.leadingIcon + ", eventData=" + this.eventData + ")";
        }

        public Config(CharSequence text, int i, Drawable drawable, UserInteractionEventDescriptor userInteractionEventDescriptor) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.duration = i;
            this.leadingIcon = drawable;
            this.eventData = userInteractionEventDescriptor;
        }

        public /* synthetic */ Config(CharSequence charSequence, int i, Drawable drawable, UserInteractionEventDescriptor userInteractionEventDescriptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : drawable, (i2 & 8) != 0 ? null : userInteractionEventDescriptor);
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final Drawable getLeadingIcon() {
            return this.leadingIcon;
        }

        public final UserInteractionEventDescriptor getEventData() {
            return this.eventData;
        }
    }
}
