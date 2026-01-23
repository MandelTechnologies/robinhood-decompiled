package com.robinhood.userleap;

import com.robinhood.android.common.p088ui.RxFragment;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.userleap.survey.TrackingEvent;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlinx.coroutines.Job;
import p479j$.time.Duration;

/* compiled from: SurveyManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\f\u0010\u0012J#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH&¢\u0006\u0004\b\u001d\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/userleap/SurveyManager;", "", "", "isEnabled", "", "setEnabled", "(Z)V", "Lcom/robinhood/android/common/ui/RxFragment;", "fragment", "Lcom/robinhood/userleap/survey/Survey;", "survey", "Lkotlinx/coroutines/Job;", "presentSurveyIfNecessary", "(Lcom/robinhood/android/common/ui/RxFragment;Lcom/robinhood/userleap/survey/Survey;)Lkotlinx/coroutines/Job;", "", "event", "j$/time/Duration", "delay", "(Lcom/robinhood/android/common/ui/RxFragment;Ljava/lang/String;Lj$/time/Duration;)Lkotlinx/coroutines/Job;", "Lkotlin/Pair;", "attribute", "setVisitorAttribute", "(Lkotlin/Pair;)V", "pendingSurvey", "setPendingSurvey", "(Lcom/robinhood/userleap/survey/Survey;)V", "(Ljava/lang/String;Lj$/time/Duration;)V", "Lcom/robinhood/userleap/survey/TrackingEvent;", "trackingEvent", "track", "(Lcom/robinhood/userleap/survey/TrackingEvent;)V", "(Ljava/lang/String;)V", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface SurveyManager {
    Job presentSurveyIfNecessary(RxFragment fragment, Survey survey);

    Job presentSurveyIfNecessary(RxFragment fragment, String event, Duration delay);

    void setEnabled(boolean isEnabled);

    void setPendingSurvey(Survey pendingSurvey);

    void setPendingSurvey(String event, Duration delay);

    void setVisitorAttribute(Tuples2<String, String> attribute);

    void track(TrackingEvent trackingEvent);

    void track(String trackingEvent);

    /* compiled from: SurveyManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Job presentSurveyIfNecessary$default(SurveyManager surveyManager, RxFragment rxFragment, String str, Duration duration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentSurveyIfNecessary");
            }
            if ((i & 4) != 0) {
                duration = Duration.ZERO;
            }
            return surveyManager.presentSurveyIfNecessary(rxFragment, str, duration);
        }

        public static /* synthetic */ void setPendingSurvey$default(SurveyManager surveyManager, String str, Duration duration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPendingSurvey");
            }
            if ((i & 2) != 0) {
                duration = Duration.ZERO;
            }
            surveyManager.setPendingSurvey(str, duration);
        }
    }
}
