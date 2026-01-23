package com.userleap;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\u0019\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0096\u0001J9\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0001J\t\u0010\u001a\u001a\u00020\fH\u0096\u0001J1\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016H\u0096\u0001J\t\u0010\u001f\u001a\u00020\fH\u0096\u0001J\u0011\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0019H\u0097\u0001J\u0011\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\bH\u0096\u0001J'\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\b2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0096\u0001J\u0019\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\u0017\u0010(\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0096\u0001J\u0011\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\bH\u0096\u0001J\u0011\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\bH\u0096\u0001J\u0011\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\bH\u0096\u0001J\u0011\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\bH\u0096\u0001J\u0011\u00102\u001a\u00020\f2\u0006\u0010/\u001a\u00020\bH\u0096\u0001J\u0019\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u000206H\u0096\u0001J\u0019\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0004H\u0096\u0001J\u0019\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0096\u0001J\u001d\u00107\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0016H\u0096\u0001J1\u00107\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u00108\u001a\u0004\u0018\u00010\bH\u0096\u0001J\t\u00109\u001a\u00020\fH\u0096\u0001J\u0011\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020<H\u0096\u0001J\u0011\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\bH\u0097\u0001J'\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0097\u0001J1\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0097\u0001J%\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u00108\u001a\u0004\u0018\u00010\bH\u0097\u0001J;\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u00108\u001a\u0004\u0018\u00010\b2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0097\u0001J;\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u00108\u001a\u0004\u0018\u00010\b2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0097\u0001JQ\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u00108\u001a\u0004\u0018\u00010\b2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0097\u0001JG\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0097\u0001J%\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0097\u0001J;\u0010:\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0097\u0001J\u0019\u0010?\u001a\u00020\f2\u0006\u0010;\u001a\u00020<2\u0006\u0010@\u001a\u00020\u0019H\u0096\u0001J\u0019\u0010?\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0019H\u0097\u0001J#\u0010?\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010@\u001a\u00020\u0019H\u0097\u0001J-\u0010?\u001a\u00020\f2\u0006\u0010=\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u00108\u001a\u0004\u0018\u00010\b2\u0006\u0010@\u001a\u00020\u0019H\u0097\u0001R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006A"}, m3636d2 = {"Lcom/userleap/Sprig;", "Lcom/userleap/UserLeapInterface;", "()V", "visitorIdentifier", "", "getVisitorIdentifier", "()Ljava/lang/Integer;", "visitorIdentifierString", "", "getVisitorIdentifierString", "()Ljava/lang/String;", "addEventListener", "", "eventName", "Lcom/userleap/EventName;", "listener", "Lcom/userleap/EventListener;", "configure", "context", "Landroid/content/Context;", "environment", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "", "reactFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "dismissActiveSurvey", "integrateOptimizely", "optimizelySdk", "userId", "attributes", "logout", "presentSurvey", "fragmentActivity", "presentSurveyWithId", "surveyId", "callback", "Lkotlin/Function1;", "Lcom/userleap/SurveyState;", "removeEventListener", "removeVisitorAttributes", "", "setEmailAddress", "emailAddress", "setLocale", "locale", "setPartnerAnonymousId", "identifier", "setPreviewKey", "previewKey", "setUserIdentifier", "setVisitorAttribute", "key", "value", "", "setVisitorAttributes", "partnerAnonymousId", "stopRecording", "track", "payload", "Lcom/userleap/EventPayload;", "event", "properties", "trackAndPresent", "fromActivity", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class Sprig implements UserLeapInterface {
    public static final Sprig INSTANCE = new Sprig();
    private final /* synthetic */ UserLeap $$delegate_0 = UserLeap.INSTANCE;

    private Sprig() {
    }

    @Override // com.userleap.UserLeapInterface
    public void addEventListener(EventName eventName, EventListener listener) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.$$delegate_0.addEventListener(eventName, listener);
    }

    @Override // com.userleap.UserLeapInterface
    public void configure(Context context, String environment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.$$delegate_0.configure(context, environment);
    }

    @Override // com.userleap.UserLeapInterface
    public void configure(Context context, String environment, Map<String, ? extends Object> configuration, FragmentActivity reactFragmentActivity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.$$delegate_0.configure(context, environment, configuration, reactFragmentActivity);
    }

    @Override // com.userleap.UserLeapInterface
    public void dismissActiveSurvey() {
        this.$$delegate_0.dismissActiveSurvey();
    }

    @Override // com.userleap.UserLeapInterface
    public Integer getVisitorIdentifier() {
        return this.$$delegate_0.getVisitorIdentifier();
    }

    @Override // com.userleap.UserLeapInterface
    public String getVisitorIdentifierString() {
        return this.$$delegate_0.getVisitorIdentifierString();
    }

    @Override // com.userleap.UserLeapInterface
    public void integrateOptimizely(Object optimizelySdk, String userId, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(optimizelySdk, "optimizelySdk");
        this.$$delegate_0.integrateOptimizely(optimizelySdk, userId, attributes);
    }

    @Override // com.userleap.UserLeapInterface
    public void logout() {
        this.$$delegate_0.logout();
    }

    @Override // com.userleap.UserLeapInterface
    @SuppressLint({"ResourceType"})
    public void presentSurvey(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.$$delegate_0.presentSurvey(fragmentActivity);
    }

    @Override // com.userleap.UserLeapInterface
    public void presentSurveyWithId(String surveyId) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        this.$$delegate_0.presentSurveyWithId(surveyId);
    }

    @Override // com.userleap.UserLeapInterface
    public void presentSurveyWithId(String surveyId, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        this.$$delegate_0.presentSurveyWithId(surveyId, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void removeEventListener(EventName eventName, EventListener listener) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.$$delegate_0.removeEventListener(eventName, listener);
    }

    @Override // com.userleap.UserLeapInterface
    public void removeVisitorAttributes(List<String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.$$delegate_0.removeVisitorAttributes(attributes);
    }

    @Override // com.userleap.UserLeapInterface
    public void setEmailAddress(String emailAddress) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        this.$$delegate_0.setEmailAddress(emailAddress);
    }

    @Override // com.userleap.UserLeapInterface
    public void setLocale(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.$$delegate_0.setLocale(locale);
    }

    @Override // com.userleap.UserLeapInterface
    public void setPartnerAnonymousId(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.$$delegate_0.setPartnerAnonymousId(identifier);
    }

    @Override // com.userleap.UserLeapInterface
    public void setPreviewKey(String previewKey) {
        Intrinsics.checkNotNullParameter(previewKey, "previewKey");
        this.$$delegate_0.setPreviewKey(previewKey);
    }

    @Override // com.userleap.UserLeapInterface
    public void setUserIdentifier(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.$$delegate_0.setUserIdentifier(identifier);
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttribute(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.$$delegate_0.setVisitorAttribute(key, value);
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttribute(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.setVisitorAttribute(key, value);
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttribute(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.$$delegate_0.setVisitorAttribute(key, value);
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttributes(Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.$$delegate_0.setVisitorAttributes(attributes);
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttributes(Map<String, String> attributes, String userId, String partnerAnonymousId) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.$$delegate_0.setVisitorAttributes(attributes, userId, partnerAnonymousId);
    }

    @Override // com.userleap.UserLeapInterface
    public void stopRecording() {
        this.$$delegate_0.stopRecording();
    }

    @Override // com.userleap.UserLeapInterface
    public void track(EventPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.$$delegate_0.track(payload);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, String userId, String partnerAnonymousId) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, userId, partnerAnonymousId);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, userId, partnerAnonymousId, properties);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, userId, partnerAnonymousId, properties, callback);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, String userId, String partnerAnonymousId, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, userId, partnerAnonymousId, callback);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, String userId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, userId, properties, callback);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, String userId, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, userId, callback);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.$$delegate_0.track(event, properties);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.$$delegate_0.track(event, properties, callback);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void track(String event, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.track(event, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void trackAndPresent(EventPayload payload, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        this.$$delegate_0.trackAndPresent(payload, fromActivity);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void trackAndPresent(String event, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        this.$$delegate_0.trackAndPresent(event, fromActivity);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void trackAndPresent(String event, String userId, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        this.$$delegate_0.trackAndPresent(event, userId, fromActivity);
    }

    @Override // com.userleap.UserLeapInterface
    @Deprecated
    public void trackAndPresent(String event, String userId, String partnerAnonymousId, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        this.$$delegate_0.trackAndPresent(event, userId, partnerAnonymousId, fromActivity);
    }
}
