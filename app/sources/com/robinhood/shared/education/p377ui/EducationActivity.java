package com.robinhood.shared.education.p377ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.converters.engagement.LearningLessons;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.EducationLessonPreviews;
import com.robinhood.shared.education.p377ui.overview.EducationOverviewFragment;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.extensions.Activity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationActivity.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J \u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/education/ui/EducationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewFragment$Callbacks;", "<init>", "()V", EducationActivity.EXTRA_LAUNCH_MODE, "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "getLaunchMode", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "launchMode$delegate", "Lkotlin/Lazy;", "lessonSelectorEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLessonSelectorEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEducationLessonAppear", "educationLesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "position", "", "onEducationLessonClicked", "source", "", "onLoadEducationOverviewFailed", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationActivity extends BaseActivity implements EducationOverviewFragment.Callbacks {
    private static final String EXTRA_LAUNCH_MODE = "launchMode";
    public EventLogger eventLogger;

    /* renamed from: launchMode$delegate, reason: from kotlin metadata */
    private final Lazy launchMode;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public EducationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.launchMode = Activity.intentExtra(this, EXTRA_LAUNCH_MODE);
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.education.ui.EducationActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationActivity.logOnceEventLogger_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final LegacyIntentKey.EducationOverview getLaunchMode() {
        return (LegacyIntentKey.EducationOverview) this.launchMode.getValue();
    }

    private final Screen getLessonSelectorEventScreen() {
        return new Screen(Screen.Name.LEARNING_LESSON_SELECTOR, getLaunchMode().getSource(), null, null, 12, null);
    }

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$0(EducationActivity educationActivity) {
        return new LogOnceEventLogger(educationActivity.getEventLogger());
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
            setFragment(C11048R.id.fragment_container, EducationOverviewFragment.INSTANCE.newInstance((Parcelable) getLaunchMode()));
        }
    }

    @Override // com.robinhood.shared.education.ui.overview.EducationOverviewFragment.Callbacks
    public void onEducationLessonAppear(EducationLessonPreview educationLesson, int position) {
        Intrinsics.checkNotNullParameter(educationLesson, "educationLesson");
        getLogOnceEventLogger().logAppear(educationLesson.getIdentifier(), UserInteractionEventData.Action.VIEW_LEARNING_LESSON, getLessonSelectorEventScreen(), new Component(Component.ComponentType.LEARNING_LESSON_CARD, null, null, 6, null), new Context(position + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LearningLessons.toProtobuf(educationLesson, false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108866, -1, -1, -1, -1, -1, 16383, null));
    }

    @Override // com.robinhood.shared.education.ui.overview.EducationOverviewFragment.Callbacks
    public void onEducationLessonClicked(EducationLessonPreview educationLesson, int position, String source) {
        Intrinsics.checkNotNullParameter(educationLesson, "educationLesson");
        Intrinsics.checkNotNullParameter(source, "source");
        FragmentKey fragmentKeyOrNull = EducationLessonPreviews.toFragmentKeyOrNull(educationLesson, source);
        if (fragmentKeyOrNull != null) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), this, fragmentKeyOrNull, false, false, false, null, false, null, false, false, null, null, 4084, null);
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_LEARNING_LESSON, getLessonSelectorEventScreen(), new Component(Component.ComponentType.LEARNING_LESSON_CARD, null, null, 6, null), null, new Context(position + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LearningLessons.toProtobuf(educationLesson, false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108866, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    @Override // com.robinhood.shared.education.ui.overview.EducationOverviewFragment.Callbacks
    public void onLoadEducationOverviewFailed() {
        finish();
    }

    /* compiled from: EducationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/EducationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "<init>", "()V", "EXTRA_LAUNCH_MODE", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.EducationOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, LegacyIntentKey.EducationOverview key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) EducationActivity.class);
            intent.putExtra(EducationActivity.EXTRA_LAUNCH_MODE, key);
            return intent;
        }
    }
}
