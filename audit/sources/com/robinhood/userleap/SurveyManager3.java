package com.robinhood.userleap;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.data.prefs.CrashlyticsUserId;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RxFragment;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.userleap.util.UserLeapCoroutines;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.userleap.SurveyState;
import com.userleap.UserLeap;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Duration;

/* compiled from: SurveyManager.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB?\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b!\u0010\"J\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00101J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u0002022\u0006\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b\u001c\u00104J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u0002022\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u00105J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u00109J#\u0010<\u001a\u00020\u00122\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020\u00122\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0015H\u0016¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0016\u0010*\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010HR\u0016\u0010I\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010.\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010M¨\u0006O"}, m3636d2 = {"Lcom/robinhood/userleap/UserLeapManager;", "Lcom/robinhood/userleap/SurveyManager;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlinx/coroutines/CoroutineScope;", "rootScope", "Landroid/app/Application;", "app", "Lcom/userleap/UserLeap;", "userLeap", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/prefs/StringPreference;", "userLeapUserIdPref", "userLocalityPref", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroid/app/Application;Lcom/userleap/UserLeap;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;)V", "", "trackingEvent", "", "trackEventInternal", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "fragment", "coroutineScope", "event", "j$/time/Duration", "delay", "Lkotlinx/coroutines/Job;", "presentSurveyIfNecessary", "(Landroidx/fragment/app/Fragment;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lj$/time/Duration;)Lkotlinx/coroutines/Job;", "presentSurvey", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lj$/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "initializeSdkIfNecessary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/KaizenExperiment;", "getUserLeapExperiments", "()Lio/reactivex/Observable;", "resetPendingSurvey", "()V", "isEnabled", "setEnabled", "(Z)V", "Lcom/robinhood/userleap/survey/Survey;", "pendingSurvey", "setPendingSurvey", "(Lcom/robinhood/userleap/survey/Survey;)V", "(Ljava/lang/String;Lj$/time/Duration;)V", "Lcom/robinhood/android/common/ui/RxFragment;", "survey", "(Lcom/robinhood/android/common/ui/RxFragment;Lcom/robinhood/userleap/survey/Survey;)Lkotlinx/coroutines/Job;", "(Lcom/robinhood/android/common/ui/RxFragment;Ljava/lang/String;Lj$/time/Duration;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/userleap/survey/TrackingEvent;", "track", "(Lcom/robinhood/userleap/survey/TrackingEvent;)V", "(Ljava/lang/String;)V", "Lkotlin/Pair;", "attribute", "setVisitorAttribute", "(Lkotlin/Pair;)V", "Landroidx/fragment/app/FragmentManager;", "fm", "f", "onFragmentResumed", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/app/Application;", "Lcom/userleap/UserLeap;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/prefs/StringPreference;", "Z", "hasInitializedUserLeapSdk", "pendingSurveyJob", "Lkotlinx/coroutines/Job;", "Lcom/robinhood/userleap/PendingSurvey;", "Lcom/robinhood/userleap/PendingSurvey;", "Companion", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.userleap.UserLeapManager, reason: use source file name */
/* loaded from: classes21.dex */
public final class SurveyManager3 extends FragmentManager.FragmentLifecycleCallbacks implements SurveyManager {
    public static final String DEV_ENVIRONMENT_ID = "MAxM3QWep98";
    public static final String ENVIRONMENT_ID = "7FZivRhA6kU";
    public static final String LOCALITY_ATTRIBUTE = "locality";
    private static final String PROD_ENVIRONMENT_ID = "7FZivRhA6kU";
    public static final String UNKNOWN_LOCALITY_VALUE = "unknown";
    private final Application app;
    private final ExperimentsStore experimentsStore;
    private boolean hasInitializedUserLeapSdk;
    private boolean isEnabled;
    private PendingSurvey pendingSurvey;
    private Job pendingSurveyJob;
    private final CoroutineScope rootScope;
    private final UserLeap userLeap;
    private final StringPreference userLeapUserIdPref;
    private final StringPreference userLocalityPref;

    /* compiled from: SurveyManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.userleap.UserLeapManager$WhenMappings */
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyState.values().length];
            try {
                iArr[SurveyState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyState.NO_SURVEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SurveyManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.userleap.UserLeapManager", m3645f = "SurveyManager.kt", m3646l = {300}, m3647m = "initializeSdkIfNecessary")
    /* renamed from: com.robinhood.userleap.UserLeapManager$initializeSdkIfNecessary$1 */
    /* loaded from: classes12.dex */
    static final class C418201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C418201(Continuation<? super C418201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SurveyManager3.this.initializeSdkIfNecessary(this);
        }
    }

    /* compiled from: SurveyManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.userleap.UserLeapManager", m3645f = "SurveyManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 201, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "presentSurvey")
    /* renamed from: com.robinhood.userleap.UserLeapManager$presentSurvey$1 */
    /* loaded from: classes12.dex */
    static final class C418211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C418211(Continuation<? super C418211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SurveyManager3.this.presentSurvey(null, null, null, this);
        }
    }

    /* compiled from: SurveyManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.userleap.UserLeapManager", m3645f = "SurveyManager.kt", m3646l = {155, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "trackEventInternal")
    /* renamed from: com.robinhood.userleap.UserLeapManager$trackEventInternal$1 */
    /* loaded from: classes12.dex */
    static final class C418231 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C418231(Continuation<? super C418231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SurveyManager3.this.trackEventInternal(null, this);
        }
    }

    public SurveyManager3(@RootCoroutineScope CoroutineScope rootScope, Application app, UserLeap userLeap, ExperimentsStore experimentsStore, @CrashlyticsUserId StringPreference userLeapUserIdPref, @UserLocalityPref StringPreference userLocalityPref) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(userLeap, "userLeap");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userLeapUserIdPref, "userLeapUserIdPref");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        this.rootScope = rootScope;
        this.app = app;
        this.userLeap = userLeap;
        this.experimentsStore = experimentsStore;
        this.userLeapUserIdPref = userLeapUserIdPref;
        this.userLocalityPref = userLocalityPref;
    }

    @Override // com.robinhood.userleap.SurveyManager
    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override // com.robinhood.userleap.SurveyManager
    public void setPendingSurvey(Survey pendingSurvey) {
        Duration delay;
        String serverValue = pendingSurvey != null ? pendingSurvey.getServerValue() : null;
        if (pendingSurvey == null || (delay = pendingSurvey.getDelay()) == null) {
            delay = Duration.ZERO;
        }
        Intrinsics.checkNotNull(delay);
        setPendingSurvey(serverValue, delay);
    }

    @Override // com.robinhood.userleap.SurveyManager
    public void setPendingSurvey(String event, Duration delay) {
        Intrinsics.checkNotNullParameter(delay, "delay");
        this.pendingSurvey = event != null ? new PendingSurvey(event, delay) : null;
    }

    @Override // com.robinhood.userleap.SurveyManager
    public Job presentSurveyIfNecessary(RxFragment fragment, Survey survey) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(survey, "survey");
        return presentSurveyIfNecessary(fragment, survey.getServerValue(), survey.getDelay());
    }

    @Override // com.robinhood.userleap.SurveyManager
    public Job presentSurveyIfNecessary(RxFragment fragment, String event, Duration delay) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(delay, "delay");
        return presentSurveyIfNecessary(fragment, fragment.getLifecycleScope(), event, delay);
    }

    @Override // com.robinhood.userleap.SurveyManager
    public void track(TrackingEvent trackingEvent) {
        Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
        track(trackingEvent.getServerValue());
    }

    /* compiled from: SurveyManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.userleap.UserLeapManager$track$1", m3645f = "SurveyManager.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.userleap.UserLeapManager$track$1 */
    /* loaded from: classes12.dex */
    static final class C418221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $trackingEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C418221(String str, Continuation<? super C418221> continuation) {
            super(2, continuation);
            this.$trackingEvent = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SurveyManager3.this.new C418221(this.$trackingEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C418221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SurveyManager3 surveyManager3 = SurveyManager3.this;
                String str = this.$trackingEvent;
                this.label = 1;
                if (surveyManager3.trackEventInternal(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.userleap.SurveyManager
    public void track(String trackingEvent) {
        Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
        BuildersKt__Builders_commonKt.launch$default(this.rootScope, null, null, new C418221(trackingEvent, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (com.robinhood.userleap.util.UserLeapCoroutines.trackEvent(r7, r6, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackEventInternal(String str, Continuation<? super Unit> continuation) {
        C418231 c418231;
        if (continuation instanceof C418231) {
            c418231 = (C418231) continuation;
            int i = c418231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418231.label = i - Integer.MIN_VALUE;
            } else {
                c418231 = new C418231(continuation);
            }
        }
        Object objInitializeSdkIfNecessary = c418231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c418231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
            c418231.L$0 = str;
            c418231.label = 1;
            objInitializeSdkIfNecessary = initializeSdkIfNecessary(c418231);
            if (objInitializeSdkIfNecessary != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
            return Unit.INSTANCE;
        }
        str = (String) c418231.L$0;
        ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
        if (!((Boolean) objInitializeSdkIfNecessary).booleanValue()) {
            return Unit.INSTANCE;
        }
        UserLeap userLeap = this.userLeap;
        Function0 function0 = new Function0() { // from class: com.robinhood.userleap.UserLeapManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyManager3.trackEventInternal$lambda$0(this.f$0);
            }
        };
        c418231.L$0 = null;
        c418231.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackEventInternal$lambda$0(SurveyManager3 surveyManager3) {
        surveyManager3.resetPendingSurvey();
        return Unit.INSTANCE;
    }

    private final Job presentSurveyIfNecessary(Fragment fragment, CoroutineScope coroutineScope, String event, Duration delay) {
        Job job = this.pendingSurveyJob;
        if (job != null) {
            Job6.cancel$default(job, "New survey was hooked", null, 2, null);
        }
        CoroutineContext.Element element = this.rootScope.getCoroutineContext().get(CoroutineExceptionHandler.INSTANCE);
        Intrinsics.checkNotNull(element);
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, element, null, new SurveyManager4(this, fragment, event, delay, null), 2, null);
        this.pendingSurveyJob = jobLaunch$default;
        return jobLaunch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object presentSurvey(Fragment fragment, String str, Duration duration, Continuation<? super Unit> continuation) {
        C418211 c418211;
        Fragment fragment2;
        String str2;
        FragmentActivity fragmentActivity;
        int i;
        if (continuation instanceof C418211) {
            c418211 = (C418211) continuation;
            int i2 = c418211.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c418211.label = i2 - Integer.MIN_VALUE;
            } else {
                c418211 = new C418211(continuation);
            }
        }
        Object objInitializeSdkIfNecessary = c418211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c418211.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
            c418211.L$0 = fragment;
            c418211.L$1 = str;
            c418211.L$2 = duration;
            c418211.label = 1;
            objInitializeSdkIfNecessary = initializeSdkIfNecessary(c418211);
            if (objInitializeSdkIfNecessary != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragmentActivity = (FragmentActivity) c418211.L$0;
                ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
                i = WhenMappings.$EnumSwitchMapping$0[((SurveyState) objInitializeSdkIfNecessary).ordinal()];
                if (i != 1) {
                    this.userLeap.presentSurvey(fragmentActivity);
                } else if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            str2 = (String) c418211.L$1;
            fragment2 = (Fragment) c418211.L$0;
            ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
            if (fragment2.isResumed()) {
                FragmentActivity fragmentActivityRequireActivity = fragment2.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                UserLeap userLeap = this.userLeap;
                Function0 function0 = new Function0() { // from class: com.robinhood.userleap.UserLeapManager$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SurveyManager3.presentSurvey$lambda$1(this.f$0);
                    }
                };
                c418211.L$0 = fragmentActivityRequireActivity;
                c418211.L$1 = null;
                c418211.label = 3;
                objInitializeSdkIfNecessary = UserLeapCoroutines.trackEvent(userLeap, str2, function0, c418211);
                if (objInitializeSdkIfNecessary != coroutine_suspended) {
                    fragmentActivity = fragmentActivityRequireActivity;
                    i = WhenMappings.$EnumSwitchMapping$0[((SurveyState) objInitializeSdkIfNecessary).ordinal()];
                    if (i != 1) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        duration = (Duration) c418211.L$2;
        str = (String) c418211.L$1;
        fragment = (Fragment) c418211.L$0;
        ResultKt.throwOnFailure(objInitializeSdkIfNecessary);
        if (!((Boolean) objInitializeSdkIfNecessary).booleanValue()) {
            return Unit.INSTANCE;
        }
        String str3 = this.userLeapUserIdPref.get();
        if (str3 != null) {
            UserLeap.INSTANCE.setUserIdentifier(str3);
        }
        long millis = duration.toMillis();
        c418211.L$0 = fragment;
        c418211.L$1 = str;
        c418211.L$2 = null;
        c418211.label = 2;
        if (DelayKt.delay(millis, c418211) != coroutine_suspended) {
            String str4 = str;
            fragment2 = fragment;
            str2 = str4;
            if (fragment2.isResumed()) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit presentSurvey$lambda$1(SurveyManager3 surveyManager3) {
        surveyManager3.resetPendingSurvey();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeSdkIfNecessary(Continuation<? super Boolean> continuation) {
        C418201 c418201;
        if (continuation instanceof C418201) {
            c418201 = (C418201) continuation;
            int i = c418201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418201.label = i - Integer.MIN_VALUE;
            } else {
                c418201 = new C418201(continuation);
            }
        }
        Object objAwaitFirstOrNull = c418201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c418201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            if (!this.isEnabled) {
                return boxing.boxBoolean(false);
            }
            if (this.hasInitializedUserLeapSdk) {
                return boxing.boxBoolean(true);
            }
            Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.USERLEAP.INSTANCE}, false, null, 6, null);
            c418201.label = 1;
            objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableStreamState$default, c418201);
            if (objAwaitFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
        }
        if (!Intrinsics.areEqual(objAwaitFirstOrNull, boxing.boxBoolean(true))) {
            return boxing.boxBoolean(false);
        }
        String str = this.userLeapUserIdPref.get();
        if (str == null) {
            return boxing.boxBoolean(false);
        }
        UserLeap userLeap = this.userLeap;
        userLeap.configure(this.app, "7FZivRhA6kU");
        userLeap.setUserIdentifier(str);
        String str2 = this.userLocalityPref.get();
        if (str2 == null) {
            str2 = "unknown";
        }
        userLeap.setVisitorAttribute("locality", str2);
        ScopedSubscriptionKt.subscribeIn(getUserLeapExperiments(), this.rootScope, new Function1() { // from class: com.robinhood.userleap.UserLeapManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyManager3.initializeSdkIfNecessary$lambda$4(this.f$0, (List) obj);
            }
        });
        this.hasInitializedUserLeapSdk = true;
        return boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeSdkIfNecessary$lambda$4(SurveyManager3 surveyManager3, List experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Iterator it = experiments.iterator();
        while (it.hasNext()) {
            KaizenExperiment kaizenExperiment = (KaizenExperiment) it.next();
            surveyManager3.userLeap.setVisitorAttribute(kaizenExperiment.getName(), kaizenExperiment.getVariation());
        }
        return Unit.INSTANCE;
    }

    private final Observable<List<KaizenExperiment>> getUserLeapExperiments() {
        Observable<List<KaizenExperiment>> observableDistinctUntilChanged = this.experimentsStore.streamExperiments().map(new Function() { // from class: com.robinhood.userleap.UserLeapManager.getUserLeapExperiments.1
            @Override // io.reactivex.functions.Function
            public final List<KaizenExperiment> apply(List<? extends KaizenExperiment> experiments) {
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                ArrayList arrayList = new ArrayList();
                for (T t : experiments) {
                    if (((KaizenExperiment) t).getUserleap()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // com.robinhood.userleap.SurveyManager
    public void setVisitorAttribute(Tuples2<String, String> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        this.userLeap.setVisitorAttribute(attribute.getFirst(), attribute.getSecond());
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        PendingSurvey pendingSurvey;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        if (f instanceof BaseFragment) {
            FragmentActivity fragmentActivityRequireActivity = f.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            if ((fragmentActivityRequireActivity instanceof BaseActivity) && ((BaseActivity) fragmentActivityRequireActivity).requiresAuthentication() && (pendingSurvey = this.pendingSurvey) != null) {
                presentSurveyIfNecessary((RxFragment) f, pendingSurvey.getEvent(), pendingSurvey.getDelay());
            }
        }
    }

    private final void resetPendingSurvey() {
        this.pendingSurvey = null;
    }
}
