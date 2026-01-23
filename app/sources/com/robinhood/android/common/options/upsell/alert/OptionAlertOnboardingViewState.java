package com.robinhood.android.common.options.upsell.alert;

import android.content.Context;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.notifications.Channels;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionAlertOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingViewState;", "", "channelId", "", "isLoading", "", "failureEvent", "Lcom/robinhood/udf/UiEvent;", "", "successEvent", "", "<init>", "(Ljava/lang/String;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getChannelId", "()Ljava/lang/String;", "()Z", "getFailureEvent", "()Lcom/robinhood/udf/UiEvent;", "getSuccessEvent", "isSystemSettingsEnabled", "context", "Landroid/content/Context;", "getPrimaryButtonText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptionAlertOnboardingViewState {
    public static final int $stable = 8;
    private final String channelId;
    private final UiEvent<Throwable> failureEvent;
    private final boolean isLoading;
    private final UiEvent<Unit> successEvent;

    public OptionAlertOnboardingViewState() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionAlertOnboardingViewState copy$default(OptionAlertOnboardingViewState optionAlertOnboardingViewState, String str, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionAlertOnboardingViewState.channelId;
        }
        if ((i & 2) != 0) {
            z = optionAlertOnboardingViewState.isLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = optionAlertOnboardingViewState.failureEvent;
        }
        if ((i & 8) != 0) {
            uiEvent2 = optionAlertOnboardingViewState.successEvent;
        }
        return optionAlertOnboardingViewState.copy(str, z, uiEvent, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component3() {
        return this.failureEvent;
    }

    public final UiEvent<Unit> component4() {
        return this.successEvent;
    }

    public final OptionAlertOnboardingViewState copy(String channelId, boolean isLoading, UiEvent<Throwable> failureEvent, UiEvent<Unit> successEvent) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        return new OptionAlertOnboardingViewState(channelId, isLoading, failureEvent, successEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionAlertOnboardingViewState)) {
            return false;
        }
        OptionAlertOnboardingViewState optionAlertOnboardingViewState = (OptionAlertOnboardingViewState) other;
        return Intrinsics.areEqual(this.channelId, optionAlertOnboardingViewState.channelId) && this.isLoading == optionAlertOnboardingViewState.isLoading && Intrinsics.areEqual(this.failureEvent, optionAlertOnboardingViewState.failureEvent) && Intrinsics.areEqual(this.successEvent, optionAlertOnboardingViewState.successEvent);
    }

    public int hashCode() {
        int iHashCode = ((this.channelId.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.failureEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.successEvent;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "OptionAlertOnboardingViewState(channelId=" + this.channelId + ", isLoading=" + this.isLoading + ", failureEvent=" + this.failureEvent + ", successEvent=" + this.successEvent + ")";
    }

    public OptionAlertOnboardingViewState(String channelId, boolean z, UiEvent<Throwable> uiEvent, UiEvent<Unit> uiEvent2) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.channelId = channelId;
        this.isLoading = z;
        this.failureEvent = uiEvent;
        this.successEvent = uiEvent2;
    }

    public /* synthetic */ OptionAlertOnboardingViewState(String str, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Channels.DEFAULT.getId() : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getFailureEvent() {
        return this.failureEvent;
    }

    public final UiEvent<Unit> getSuccessEvent() {
        return this.successEvent;
    }

    public final boolean isSystemSettingsEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NotificationUtils.isSystemNotificationOrChannelSettingsEnabled(ContextSystemServices.getNotificationManager(context), this.channelId);
    }

    public final String getPrimaryButtonText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isSystemSettingsEnabled(context)) {
            String string2 = context.getString(C11303R.string.option_alert_onboarding_positive_button);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = context.getString(C11303R.string.option_alert_go_to_settings_positive_button);
        Intrinsics.checkNotNull(string3);
        return string3;
    }
}
