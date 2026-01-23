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

@Keep
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H&J8\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\u000bH&J0\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H&J\b\u0010\u001d\u001a\u00020\u000bH&J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0017H'J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0007H&J&\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00072\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H&J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010&\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070'H&J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0007H&J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0007H&J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0007H&J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0007H&J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0007H&J\u0018\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u000204H&J\u0018\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0003H&J\u0018\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H&J\u001c\u00105\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0015H&J0\u00105\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u0007H&J\b\u00107\u001a\u00020\u000bH&J\u0010\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020:H&J\u0010\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0007H'J&\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H'J0\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H'J$\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u0007H'J:\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H'J:\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H'JP\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H'JF\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H'J$\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0015H'J:\u00108\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00152\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010#H'J\u0018\u0010=\u001a\u00020\u000b2\u0006\u00109\u001a\u00020:2\u0006\u0010>\u001a\u00020\u0017H&J\u0018\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0017H'J\"\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010>\u001a\u00020\u0017H'J,\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u0010>\u001a\u00020\u0017H'R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006?"}, m3636d2 = {"Lcom/userleap/UserLeapInterface;", "", "visitorIdentifier", "", "getVisitorIdentifier", "()Ljava/lang/Integer;", "visitorIdentifierString", "", "getVisitorIdentifierString", "()Ljava/lang/String;", "addEventListener", "", "eventName", "Lcom/userleap/EventName;", "listener", "Lcom/userleap/EventListener;", "configure", "context", "Landroid/content/Context;", "environment", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "reactFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "dismissActiveSurvey", "integrateOptimizely", "optimizelySdk", "userId", "attributes", "logout", "presentSurvey", "fragmentActivity", "presentSurveyWithId", "surveyId", "callback", "Lkotlin/Function1;", "Lcom/userleap/SurveyState;", "removeEventListener", "removeVisitorAttributes", "", "setEmailAddress", "emailAddress", "setLocale", "locale", "setPartnerAnonymousId", "identifier", "setPreviewKey", "previewKey", "setUserIdentifier", "setVisitorAttribute", "key", "value", "", "setVisitorAttributes", "partnerAnonymousId", "stopRecording", "track", "payload", "Lcom/userleap/EventPayload;", "event", "properties", "trackAndPresent", "fromActivity", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface UserLeapInterface {
    void addEventListener(EventName eventName, EventListener listener);

    void configure(Context context, String environment);

    void configure(Context context, String environment, Map<String, ? extends Object> configuration, FragmentActivity reactFragmentActivity);

    void dismissActiveSurvey();

    Integer getVisitorIdentifier();

    String getVisitorIdentifierString();

    void integrateOptimizely(Object optimizelySdk, String userId, Map<String, String> attributes);

    void logout();

    @SuppressLint({"ResourceType"})
    void presentSurvey(FragmentActivity fragmentActivity);

    void presentSurveyWithId(String surveyId);

    void presentSurveyWithId(String surveyId, Function1<? super SurveyState, Unit> callback);

    void removeEventListener(EventName eventName, EventListener listener);

    void removeVisitorAttributes(List<String> attributes);

    void setEmailAddress(String emailAddress);

    void setLocale(String locale);

    void setPartnerAnonymousId(String identifier);

    void setPreviewKey(String previewKey);

    void setUserIdentifier(String identifier);

    void setVisitorAttribute(String key, int value);

    void setVisitorAttribute(String key, String value);

    void setVisitorAttribute(String key, boolean value);

    void setVisitorAttributes(Map<String, String> attributes);

    void setVisitorAttributes(Map<String, String> attributes, String userId, String partnerAnonymousId);

    void stopRecording();

    void track(EventPayload payload);

    @Deprecated
    void track(String event);

    @Deprecated
    void track(String event, String userId, String partnerAnonymousId);

    @Deprecated
    void track(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties);

    @Deprecated
    void track(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback);

    @Deprecated
    void track(String event, String userId, String partnerAnonymousId, Function1<? super SurveyState, Unit> callback);

    @Deprecated
    void track(String event, String userId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback);

    @Deprecated
    void track(String event, String userId, Function1<? super SurveyState, Unit> callback);

    @Deprecated
    void track(String event, Map<String, ? extends Object> properties);

    @Deprecated
    void track(String event, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback);

    @Deprecated
    void track(String event, Function1<? super SurveyState, Unit> callback);

    void trackAndPresent(EventPayload payload, FragmentActivity fromActivity);

    @Deprecated
    void trackAndPresent(String event, FragmentActivity fromActivity);

    @Deprecated
    void trackAndPresent(String event, String userId, FragmentActivity fromActivity);

    @Deprecated
    void trackAndPresent(String event, String userId, String partnerAnonymousId, FragmentActivity fromActivity);
}
