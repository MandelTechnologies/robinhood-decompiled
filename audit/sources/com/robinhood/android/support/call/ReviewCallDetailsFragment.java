package com.robinhood.android.support.call;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.PhoneVerificationResult;
import com.robinhood.android.navigation.app.keys.data.PhoneVerificationResult2;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.support.call.PhoneEditBottomSheetFragment;
import com.robinhood.android.support.call.textanimator.ReviewCallDetailsEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.security.contracts.PhoneUpdateIntentKey;
import com.robinhood.shared.security.contracts.PhoneVerificationSource;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.ReviewCallDetailsFragmentKey;
import com.robinhood.utils.extensions.Intents;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ReviewCallDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010 \u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J$\u0010/\u001a\u00020\u001a2\b\b\u0002\u00100\u001a\u0002012\u0010\b\u0002\u00102\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u000207H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u00108\u001a\u000207X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:¨\u0006>²\u0006\n\u0010?\u001a\u00020@X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "updatePhoneLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "duxo", "Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/ReviewCallDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "navigateToCallStatus", "isLoggedIn", "", "issueId", "Ljava/util/UUID;", "showRequestCallFailureResult", "error", "", "launchDefaultPhoneNumberEditor", "launchPhoneUpdateForResult", "onClickEditPhoneNumber", "onClickRequestCall", "onClickRetryFetchDetails", "logTapAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "onPhoneNumberEdited", "phoneNumber", "", "screenName", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "Companion", "feature-support_externalRelease", "viewState", "Lcom/robinhood/android/support/call/ReviewCallDetailsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewCallDetailsFragment extends GenericComposeFragment implements AutoLoggableFragment, PhoneEditBottomSheetFragment.Callbacks {
    public EventLogger eventLogger;
    private ActivityResultLauncher<Intent> updatePhoneLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ReviewCallDetailsDuxo.class);
    private final String screenName = "CX_REVIEW_CALL_DETAILS";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ReviewCallDetailsFragment reviewCallDetailsFragment, int i, Composer composer, int i2) {
        reviewCallDetailsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewCallDetailsDuxo getDuxo() {
        return (ReviewCallDetailsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.CX_REVIEW_CALL_DETAILS, null, getProfileId(), null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.updatePhoneLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment.onCreate.1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    Intent data = result.getData();
                    if ((data != null ? (PhoneVerificationResult) Intents.getSerializable(data, PhoneVerificationResult2.PHONE_VERIFICATION_RESULT_KEY) : null) == PhoneVerificationResult.UPDATE_PHONE_NUMBER) {
                        ReviewCallDetailsFragment.this.launchPhoneUpdateForResult();
                    } else {
                        ReviewCallDetailsFragment.this.getDuxo().onPhoneNumberChangedInIdenti();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewCallDetailsViewState ComposeContent$lambda$0(SnapshotState4<? extends ReviewCallDetailsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C289081(null), 1, null);
    }

    /* compiled from: ReviewCallDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1", m3645f = "ReviewCallDetailsFragment.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1 */
    static final class C289081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C289081(Continuation<? super C289081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewCallDetailsFragment.this.new C289081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ReviewCallDetailsFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReviewCallDetailsFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ReviewCallDetailsFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1$1", m3645f = "ReviewCallDetailsFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<ReviewCallDetailsEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReviewCallDetailsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReviewCallDetailsFragment reviewCallDetailsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = reviewCallDetailsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<ReviewCallDetailsEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                EventConsumer eventConsumer3;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                final ReviewCallDetailsFragment reviewCallDetailsFragment = this.this$0;
                if ((event.getData() instanceof ReviewCallDetailsEvent.RequestSupportSuccess) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m19059invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19059invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ReviewCallDetailsEvent.RequestSupportSuccess requestSupportSuccess = (ReviewCallDetailsEvent.RequestSupportSuccess) event.getData();
                            reviewCallDetailsFragment.navigateToCallStatus(requestSupportSuccess.getIsLoggedIn(), requestSupportSuccess.getIssueId());
                        }
                    });
                }
                final ReviewCallDetailsFragment reviewCallDetailsFragment2 = this.this$0;
                if ((event.getData() instanceof ReviewCallDetailsEvent.RequestSupportFailure) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m19060invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19060invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            reviewCallDetailsFragment2.showRequestCallFailureResult(((ReviewCallDetailsEvent.RequestSupportFailure) event.getData()).getError());
                        }
                    });
                }
                final ReviewCallDetailsFragment reviewCallDetailsFragment3 = this.this$0;
                if ((event.getData() instanceof ReviewCallDetailsEvent.NavigateToDefaultPhoneNumberEditor) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m19061invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19061invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            reviewCallDetailsFragment3.launchDefaultPhoneNumberEditor();
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1005411404);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1005411404, i2, -1, "com.robinhood.android.support.call.ReviewCallDetailsFragment.ComposeContent (ReviewCallDetailsFragment.kt:106)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1724800009, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724800009, i3, -1, "com.robinhood.android.support.call.ReviewCallDetailsFragment.ComposeContent.<anonymous> (ReviewCallDetailsFragment.kt:112)");
                    }
                    ReviewCallDetailsViewState reviewCallDetailsViewStateComposeContent$lambda$0 = ReviewCallDetailsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    ReviewCallDetailsFragment reviewCallDetailsFragment = ReviewCallDetailsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(reviewCallDetailsFragment);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ReviewCallDetailsFragment2(reviewCallDetailsFragment);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                    ReviewCallDetailsFragment reviewCallDetailsFragment2 = ReviewCallDetailsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(reviewCallDetailsFragment2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ReviewCallDetailsFragment3(reviewCallDetailsFragment2);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                    ReviewCallDetailsFragment reviewCallDetailsFragment3 = ReviewCallDetailsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(reviewCallDetailsFragment3);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ReviewCallDetailsFragment4(reviewCallDetailsFragment3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    ReviewCallDetailsComposable.ReviewCallDetailsComposable(reviewCallDetailsViewStateComposeContent$lambda$0, function0, function1, (Function0) ((KFunction) objRememberedValue3), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewCallDetailsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToCallStatus(boolean isLoggedIn, UUID issueId) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.SupportCallStatus(issueId, ((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((Fragment) this)).getClearTask(), true), false, isLoggedIn, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), null, false, 12, null);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.startActivity(intentCreateIntent$default);
        fragmentActivityRequireActivity.finish();
        fragmentActivityRequireActivity.overridePendingTransition(C11048R.anim.activity_enter_bottom, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRequestCallFailureResult(Throwable error) {
        String string2;
        final UserInteractionEventData.Action action = UserInteractionEventData.Action.REQUEST_CX_CALL;
        final Component.ComponentType componentType = Component.ComponentType.ERROR_TOAST;
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CX_REVIEW_CALL_DETAILS, null, null, null, 14, null);
        Component component = new Component(componentType, null, null, 6, null);
        String string3 = ((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string3, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), 8, null);
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(error);
        if (errorResponseExtractErrorResponse == null || (string2 = errorResponseExtractErrorResponse.getError_message()) == null) {
            string2 = getString(C39996R.string.support_issue_general_error_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(snackbars.findRoot(fragmentActivityRequireActivity), string2, -1);
        rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_alert_16dp);
        if (!Throwables.is4xxHttpException(error)) {
            RdsSnackbar.setAction$default(rdsSnackbarMake, C11048R.string.general_label_retry, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.support.call.ReviewCallDetailsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReviewCallDetailsFragment.showRequestCallFailureResult$lambda$4$lambda$3(this.f$0, action, componentType);
                }
            }, 14, (Object) null);
        }
        rdsSnackbarMake.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRequestCallFailureResult$lambda$4$lambda$3(ReviewCallDetailsFragment reviewCallDetailsFragment, UserInteractionEventData.Action action, Component.ComponentType componentType) {
        reviewCallDetailsFragment.logTapAction(action, componentType);
        reviewCallDetailsFragment.getDuxo().createNewIssue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchDefaultPhoneNumberEditor() {
        PhoneEditBottomSheetFragment phoneEditBottomSheetFragment = (PhoneEditBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(PhoneEditBottomSheetFragment.INSTANCE, new PhoneEditBottomSheetFragment.Args(((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId(), getEventScreen()), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        phoneEditBottomSheetFragment.show(parentFragmentManager, "phone-edit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchPhoneUpdateForResult() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new PhoneUpdateIntentKey(PhoneVerificationSource.CX_VOICE), null, false, 12, null);
        ActivityResultLauncher<Intent> activityResultLauncher = this.updatePhoneLauncher;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updatePhoneLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intentCreateIntent$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickEditPhoneNumber(boolean isLoggedIn) {
        logTapAction$default(this, UserInteractionEventData.Action.VIEW_EDIT_PHONE_NUMBER, null, 2, null);
        if (isLoggedIn) {
            launchPhoneUpdateForResult();
        } else {
            launchDefaultPhoneNumberEditor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickRequestCall() {
        logTapAction$default(this, UserInteractionEventData.Action.REQUEST_CX_CALL, null, 2, null);
        LottieUrl lottieUrl = LottieUrl.SUPPORT_CALL_WAITING;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        lottieUrl.prefetch(contextRequireContext);
        getDuxo().createNewIssue();
    }

    /* compiled from: ReviewCallDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsFragment$onClickRetryFetchDetails$1", m3645f = "ReviewCallDetailsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsFragment$onClickRetryFetchDetails$1 */
    static final class C289061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C289061(Continuation<? super C289061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewCallDetailsFragment.this.new C289061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ReviewCallDetailsDuxo duxo = ReviewCallDetailsFragment.this.getDuxo();
                this.label = 1;
                if (duxo.fetchIssueDetail(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickRetryFetchDetails() {
        getLifecycleScope().launchWhenStarted(new C289061(null));
    }

    static /* synthetic */ void logTapAction$default(ReviewCallDetailsFragment reviewCallDetailsFragment, UserInteractionEventData.Action action, Component.ComponentType componentType, int i, Object obj) {
        if ((i & 1) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 2) != 0) {
            componentType = null;
        }
        reviewCallDetailsFragment.logTapAction(action, componentType);
    }

    private final void logTapAction(UserInteractionEventData.Action action, Component.ComponentType componentType) {
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.CX_REVIEW_CALL_DETAILS, null, null, null, 14, null);
        Component component = componentType != null ? new Component(componentType, null, null, 6, null) : null;
        String string2 = ((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    @Override // com.robinhood.android.support.call.PhoneEditBottomSheetFragment.Callbacks
    public void onPhoneNumberEdited(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        getDuxo().onPhoneNumberChanged(phoneNumber);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return String.valueOf(((ReviewCallDetailsFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId());
    }

    /* compiled from: ReviewCallDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/ReviewCallDetailsFragment;", "Lcom/robinhood/shared/support/contracts/ReviewCallDetailsFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ReviewCallDetailsFragment, ReviewCallDetailsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ReviewCallDetailsFragmentKey reviewCallDetailsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, reviewCallDetailsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ReviewCallDetailsFragmentKey getArgs(ReviewCallDetailsFragment reviewCallDetailsFragment) {
            return (ReviewCallDetailsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, reviewCallDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReviewCallDetailsFragment newInstance(ReviewCallDetailsFragmentKey reviewCallDetailsFragmentKey) {
            return (ReviewCallDetailsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, reviewCallDetailsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReviewCallDetailsFragment reviewCallDetailsFragment, ReviewCallDetailsFragmentKey reviewCallDetailsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, reviewCallDetailsFragment, reviewCallDetailsFragmentKey);
        }
    }
}
