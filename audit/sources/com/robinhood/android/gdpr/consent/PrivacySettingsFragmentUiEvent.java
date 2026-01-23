package com.robinhood.android.gdpr.consent;

import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsFragmentUiEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent;", "", "<init>", "()V", BentoAlertSheet6.button2Title, "OpenLink", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent$Dismiss;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent$OpenLink;", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class PrivacySettingsFragmentUiEvent {
    public static final int $stable = 0;

    public /* synthetic */ PrivacySettingsFragmentUiEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PrivacySettingsFragmentUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent$Dismiss;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dismiss extends PrivacySettingsFragmentUiEvent {
        public static final int $stable = 0;
        public static final Dismiss INSTANCE = new Dismiss();

        public boolean equals(Object other) {
            return this == other || (other instanceof Dismiss);
        }

        public int hashCode() {
            return -1894957578;
        }

        public String toString() {
            return BentoAlertSheet6.button2Title;
        }

        private Dismiss() {
            super(null);
        }
    }

    private PrivacySettingsFragmentUiEvent() {
    }

    /* compiled from: PrivacySettingsFragmentUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent$OpenLink;", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentUiEvent;", "url", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getUrl", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenLink extends PrivacySettingsFragmentUiEvent {
        public static final int $stable = StringResource.$stable;
        private final StringResource url;

        public static /* synthetic */ OpenLink copy$default(OpenLink openLink, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = openLink.url;
            }
            return openLink.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getUrl() {
            return this.url;
        }

        public final OpenLink copy(StringResource url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenLink(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenLink) && Intrinsics.areEqual(this.url, ((OpenLink) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenLink(url=" + this.url + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenLink(StringResource url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final StringResource getUrl() {
            return this.url;
        }
    }
}
