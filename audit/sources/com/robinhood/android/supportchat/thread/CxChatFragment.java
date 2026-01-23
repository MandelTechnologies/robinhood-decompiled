package com.robinhood.android.supportchat.thread;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mediaservice.CameraUtils;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.AccountOverviewLaunchType;
import com.robinhood.android.settings.extensions.NotificationManagers;
import com.robinhood.android.supportchat.C29104R;
import com.robinhood.android.supportchat.thread.CxChatEvent;
import com.robinhood.android.supportchat.thread.CxChatFragment;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.android.supportchat.thread.compose.CxChatComposableKt;
import com.robinhood.android.supportchat.thread.compose.CxChatDialogData;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import com.robinhood.shared.support.contracts.SupportChatListFragmentKey;
import com.robinhood.shared.support.supportchat.targets.SupportChatThreadNotificationHandler;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CxChatFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016J\b\u00102\u001a\u00020\u0017H\u0016J\r\u00103\u001a\u00020+H\u0017¢\u0006\u0002\u00104J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002J\b\u00108\u001a\u00020+H\u0002J\b\u00109\u001a\u00020+H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "getImagePicker", "()Lcom/robinhood/android/mediaservice/ImagePicker;", "setImagePicker", "(Lcom/robinhood/android/mediaservice/ImagePicker;)V", "cameraUtils", "Lcom/robinhood/android/mediaservice/CameraUtils;", "getCameraUtils", "()Lcom/robinhood/android/mediaservice/CameraUtils;", "setCameraUtils", "(Lcom/robinhood/android/mediaservice/CameraUtils;)V", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "getNotificationManager", "()Lcom/robinhood/android/common/notification/NotificationManager;", "setNotificationManager", "(Lcom/robinhood/android/common/notification/NotificationManager;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "getDuxo", "()Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pushSettingsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "contactChannelPushSettingsLauncher", "activeInquiryId", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/UUID;", "notificationInterceptor", "Lcom/robinhood/shared/support/supportchat/targets/SupportChatThreadNotificationInterceptor;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onPause", "onBackPressed", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showEnablePushDialogIfNeeded", "showPushSettings", "handlePushSettingsResult", "handlePushChannelSettingsResult", "showPushEnabledSnackbar", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CxChatFragment extends GenericComposeFragment {
    private final AtomicReference<UUID> activeInquiryId;
    public CameraUtils cameraUtils;
    private final ActivityResultLauncher<Intent> contactChannelPushSettingsLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CxChatDuxo.class);
    public ImagePicker imagePicker;
    private final SupportChatThreadNotificationHandler notificationInterceptor;
    public NotificationManager notificationManager;
    private final ActivityResultLauncher<Intent> pushSettingsLauncher;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(CxChatFragment cxChatFragment, int i, Composer composer, int i2) {
        cxChatFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public CxChatFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$pushSettingsLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.handlePushSettingsResult();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.pushSettingsLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$contactChannelPushSettingsLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.handlePushChannelSettingsResult();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.contactChannelPushSettingsLauncher = activityResultLauncherRegisterForActivityResult2;
        this.activeInquiryId = new AtomicReference<>(null);
        this.notificationInterceptor = new SupportChatThreadNotificationHandler(new Function1() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CxChatFragment.notificationInterceptor$lambda$0(this.f$0, (Uri) obj));
            }
        });
    }

    public final ImagePicker getImagePicker() {
        ImagePicker imagePicker = this.imagePicker;
        if (imagePicker != null) {
            return imagePicker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
        return null;
    }

    public final void setImagePicker(ImagePicker imagePicker) {
        Intrinsics.checkNotNullParameter(imagePicker, "<set-?>");
        this.imagePicker = imagePicker;
    }

    public final CameraUtils getCameraUtils() {
        CameraUtils cameraUtils = this.cameraUtils;
        if (cameraUtils != null) {
            return cameraUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cameraUtils");
        return null;
    }

    public final void setCameraUtils(CameraUtils cameraUtils) {
        Intrinsics.checkNotNullParameter(cameraUtils, "<set-?>");
        this.cameraUtils = cameraUtils;
    }

    public final NotificationManager getNotificationManager() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            return notificationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        return null;
    }

    public final void setNotificationManager(NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "<set-?>");
        this.notificationManager = notificationManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CxChatDuxo getDuxo() {
        return (CxChatDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean notificationInterceptor$lambda$0(CxChatFragment cxChatFragment, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("id");
        UUID uuid = queryParameter != null ? StringsKt.toUuid(queryParameter) : null;
        return uuid == null || Intrinsics.areEqual(uuid, cxChatFragment.activeInquiryId.get());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
        requireActivity().getWindow().setSoftInputMode(16);
        BaseFragment.collectDuxoState$default(this, null, new C291731(null), 1, null);
        showEnablePushDialogIfNeeded();
    }

    /* compiled from: CxChatFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1", m3645f = "CxChatFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1 */
    static final class C291731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291731(Continuation<? super C291731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291731 c291731 = CxChatFragment.this.new C291731(continuation);
            c291731.L$0 = obj;
            return c291731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$1", m3645f = "CxChatFragment.kt", m3646l = {80}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CxChatFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatFragment cxChatFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cxChatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final CxChatFragment cxChatFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<CxChatEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<CxChatEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<CxChatEvent> eventConsumerInvoke;
                            EventConsumer<CxChatEvent> eventConsumerInvoke2;
                            final CxChatFragment cxChatFragment2 = cxChatFragment;
                            if ((event.getData() instanceof CxChatEvent.UploadError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19139invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19139invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                                        View viewRequireView = cxChatFragment2.requireView();
                                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                                        companion.make(viewRequireView, C29104R.string.chatbot_message_update_error, -1).show();
                                    }
                                });
                            }
                            final CxChatFragment cxChatFragment3 = cxChatFragment;
                            if ((event.getData() instanceof CxChatEvent.GenericError) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19140invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19140invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                                        View viewRequireView = cxChatFragment3.requireView();
                                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                                        companion.make(viewRequireView, C29104R.string.support_chat_general_error_toast, -1).show();
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CxChatFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CxChatFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CxChatFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2", m3645f = "CxChatFragment.kt", m3646l = {104}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CxChatFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CxChatFragment cxChatFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cxChatFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CxChatViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow<UUID> flow = new Flow<UUID>() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CxChatFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    CxChatViewState cxChatViewState = (CxChatViewState) obj;
                                    CxChatViewState.Success success = cxChatViewState instanceof CxChatViewState.Success ? (CxChatViewState.Success) cxChatViewState : null;
                                    UUID inquiryId = success != null ? success.getInquiryId() : null;
                                    if (inquiryId != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(inquiryId, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C505592 c505592 = new C505592(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c505592, this) == coroutine_suspended) {
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

            /* compiled from: CxChatFragment.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inquiryId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2$2", m3645f = "CxChatFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$onViewCreated$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C505592 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CxChatFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505592(CxChatFragment cxChatFragment, Continuation<? super C505592> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505592 c505592 = new C505592(this.this$0, continuation);
                    c505592.L$0 = obj;
                    return c505592;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
                    return ((C505592) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.activeInquiryId.set((UUID) this.L$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getNotificationManager().addInterceptor(this.notificationInterceptor);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getNotificationManager().removeInterceptor(this.notificationInterceptor);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        CxChatViewState value = getDuxo().getStateFlow().getValue();
        Companion companion = INSTANCE;
        if (((CxChatFragmentKey) companion.getArgs((Fragment) this)).getHideBackButton() && value.getTopBarState().getEndButtonStatus() != CxChatTopBar5.EndButtonStatus.Hidden && !(value.getDialogData() instanceof CxChatDialogData.EndChat)) {
            getDuxo().openEndChatConfirmationDialog();
            return true;
        }
        if (((CxChatFragmentKey) companion.getArgs((Fragment) this)).getHideBackButton() && value.getTopBarState().getEndButtonStatus() == CxChatTopBar5.EndButtonStatus.Hidden) {
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            requireActivity().startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, fragmentActivityRequireActivity, new LegacyFragmentKey.AccountOverview(AccountOverviewLaunchType.OPTIONS, ((CxChatFragmentKey) companion.getArgs((Fragment) this)).getAccountNumber()), true, true, true, null, false, true, false, false, false, null, true, 3936, null));
            return true;
        }
        if (((CxChatFragmentKey) companion.getArgs((Fragment) this)).getIsFromInitializationFlow()) {
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Navigator navigator2 = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            fragmentActivityRequireActivity2.startActivities(new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator2, contextRequireContext, SupportChatListFragmentKey.INSTANCE, false, false, false, null, false, false, false, false, false, null, true, 4092, null)});
            fragmentActivityRequireActivity2.finish();
            return true;
        }
        return super.onBackPressed();
    }

    /* compiled from: CxChatFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatFragment$ComposeContent$1 */
    static final class C291721 implements Function2<Composer, Integer, Unit> {
        C291721() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1810406965, i, -1, "com.robinhood.android.supportchat.thread.CxChatFragment.ComposeContent.<anonymous> (CxChatFragment.kt:172)");
            }
            CxChatDuxo duxo = CxChatFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CxChatFragment.this);
            final CxChatFragment cxChatFragment = CxChatFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatFragment.C291721.invoke$lambda$1$lambda$0(cxChatFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            ImagePicker imagePicker = CxChatFragment.this.getImagePicker();
            CameraUtils cameraUtils = CxChatFragment.this.getCameraUtils();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CxChatFragment.this);
            final CxChatFragment cxChatFragment2 = CxChatFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatFragment.C291721.invoke$lambda$3$lambda$2(cxChatFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(CxChatFragment.this);
            final CxChatFragment cxChatFragment3 = CxChatFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatFragment.C291721.invoke$lambda$5$lambda$4(cxChatFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Companion companion = CxChatFragment.INSTANCE;
            CxChatComposableKt.CxChatComposable(duxo, function0, imagePicker, cameraUtils, function02, (Function0) objRememberedValue3, ((CxChatFragmentKey) companion.getArgs((Fragment) CxChatFragment.this)).getHideBackButton(), ((CxChatFragmentKey) companion.getArgs((Fragment) CxChatFragment.this)).getNavigateBackWhenChatEnded(), composer, (ImagePicker.$stable << 6) | (CameraUtils.$stable << 9));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CxChatFragment cxChatFragment) {
            cxChatFragment.requireActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CxChatFragment cxChatFragment) {
            Context contextRequireContext = cxChatFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ContextsUiExtensions.openAppSystemSettings(contextRequireContext);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CxChatFragment cxChatFragment) {
            cxChatFragment.showPushSettings();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-739968662);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-739968662, i2, -1, "com.robinhood.android.supportchat.thread.CxChatFragment.ComposeContent (CxChatFragment.kt:170)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1810406965, true, new C291721(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.CxChatFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void showEnablePushDialogIfNeeded() {
        if (((CxChatFragmentKey) INSTANCE.getArgs((Fragment) this)).getIsFromInitializationFlow()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            if (NotificationManagers.isSystemPushOrContactChannelEnabled(contextRequireContext)) {
                return;
            }
            getDuxo().openPushPromptDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPushSettings() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(contextRequireContext);
        if (NotificationManagers.isSystemPushOrContactChannelEnabled(contextRequireContext)) {
            return;
        }
        Intent systemPushOrContactChannelSettingsIntent = NotificationManagers.getSystemPushOrContactChannelSettingsIntent(contextRequireContext);
        if (!notificationManager.areNotificationsEnabled()) {
            this.pushSettingsLauncher.launch(systemPushOrContactChannelSettingsIntent);
        } else {
            this.contactChannelPushSettingsLauncher.launch(systemPushOrContactChannelSettingsIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePushSettingsResult() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (NotificationManagers.isSystemPushOrContactChannelEnabled(contextRequireContext)) {
            showPushEnabledSnackbar();
        } else if (ContextSystemServices.getNotificationManager(contextRequireContext).areNotificationsEnabled()) {
            showPushSettings();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePushChannelSettingsResult() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (NotificationManagers.isSystemPushOrContactChannelEnabled(contextRequireContext)) {
            showPushEnabledSnackbar();
        }
    }

    private final void showPushEnabledSnackbar() {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        String string2 = getString(C29104R.string.support_chat_thread_push_enabled);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        companion.make(viewRequireView, string2, -1).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_16dp).show();
    }

    /* compiled from: CxChatFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/supportchat/thread/CxChatFragment;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey;", "<init>", "()V", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CxChatFragment, CxChatFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CxChatFragmentKey cxChatFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, cxChatFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CxChatFragmentKey getArgs(CxChatFragment cxChatFragment) {
            return (CxChatFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cxChatFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CxChatFragment newInstance(CxChatFragmentKey cxChatFragmentKey) {
            return (CxChatFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cxChatFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CxChatFragment cxChatFragment, CxChatFragmentKey cxChatFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cxChatFragment, cxChatFragmentKey);
        }
    }
}
