package com.robinhood.android.inbox.p156ui.thread;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.LoggedRecyclerView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.databinding.FragmentInboxThreadDetailBinding;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailAdapter;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailEvent;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.ThreadNotificationSettingsSource;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ThreadDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000û\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001@\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0002|}B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u0012\u0010I\u001a\u00020F2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0018\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0014J\u0010\u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u000209H\u0016J\u001a\u0010S\u001a\u00020F2\u0006\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0018\u0010V\u001a\u00020F2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0002J\b\u0010[\u001a\u00020FH\u0016J\b\u0010\\\u001a\u00020FH\u0016J\b\u0010]\u001a\u00020FH\u0016J\"\u0010^\u001a\u00020F2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0010\u0010h\u001a\u00020F2\u0006\u0010R\u001a\u00020iH\u0016J\u0010\u0010j\u001a\u00020F2\u0006\u0010R\u001a\u000202H\u0016J\u0010\u0010k\u001a\u00020F2\u0006\u0010R\u001a\u000202H\u0016J\u0010\u0010l\u001a\u00020F2\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u00020F2\u0006\u0010R\u001a\u00020pH\u0016J\u0010\u0010q\u001a\u00020F2\u0006\u0010r\u001a\u00020sH\u0016J\u0010\u0010t\u001a\u00020F2\u0006\u0010u\u001a\u00020vH\u0002J\u0016\u0010w\u001a\u00020F2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020y0xH\u0002J\u0010\u0010z\u001a\u00020F2\u0006\u0010u\u001a\u00020vH\u0002J\u0012\u0010{\u001a\u00020F2\b\u0010b\u001a\u0004\u0018\u00010cH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b+\u0010,R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020201X\u0082.¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b5\u00106R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0004\n\u0002\u0010AR\u0014\u0010B\u001a\u00020;X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0014\u0010d\u001a\u00020*X\u0096D¢\u0006\b\n\u0000\u001a\u0004\be\u0010,R\u0014\u0010f\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010,¨\u0006~"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$Callbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "getImagePicker", "()Lcom/robinhood/android/mediaservice/ImagePicker;", "setImagePicker", "(Lcom/robinhood/android/mediaservice/ImagePicker;)V", "notificationHandler", "Lcom/robinhood/android/common/notification/NotificationManager;", "getNotificationHandler", "()Lcom/robinhood/android/common/notification/NotificationManager;", "setNotificationHandler", "(Lcom/robinhood/android/common/notification/NotificationManager;)V", "duxo", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/inbox/ui/thread/ThreadDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadDetailBinding;", "getBinding", "()Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter;", "imagesToSendAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/inbox/ui/thread/ImageToSendItemView;", "Landroid/graphics/Bitmap;", ThreadDetailFragment.ARG_THREAD_ID, "", "getThreadId", "()Ljava/lang/String;", "threadId$delegate", "threadSettingsItem", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "threadAnalyticsLogger", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment$ThreadAnalyticsLogger;", "getThreadAnalyticsLogger", "()Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment$ThreadAnalyticsLogger;", "threadAnalyticsLogger$delegate", "notificationSettingsMenu", "Landroid/view/MenuItem;", "isLoadingPreviousMessages", "", "hasFetchedAllPreviousMessages", "earliestMessageId", "showMediaUploadButton", "notificationInterceptor", "com/robinhood/android/inbox/ui/thread/ThreadDetailFragment$notificationInterceptor$1", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment$notificationInterceptor$1;", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onViewCreated", "view", "Landroid/view/View;", "fetchPreviousMessagesIfNeeded", "event", "Lcom/jakewharton/rxbinding3/recyclerview/RecyclerViewScrollEvent;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onResume", "onPause", "onStop", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "screenName", "getScreenName", "screenDescription", "getScreenDescription", "onResponseClick", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Response;", "onExternalActionClick", "onInternalActionClick", "onRetryClick", "localMessageId", "Ljava/util/UUID;", "onAvatarClick", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "onImageClick", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "updateViewState", "viewState", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailViewState;", "handleEvent", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent;", "updateEditTextEndIcon", "appendImagesFromActivityResult", "ThreadAnalyticsLogger", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadDetailFragment extends BaseFragment implements ThreadDetailAdapter.Callbacks {
    private static final String ARG_THREAD_ID = "threadId";
    private static final int PREFETCH_THRESHOLD = 10;
    private static final int REQUEST_CODE_PICK_IMAGE = 50;
    private static final String SCREEN_NAME = "ThreadMessages";
    private final ThreadDetailAdapter adapter;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private String earliestMessageId;
    private boolean hasFetchedAllPreviousMessages;
    public ImagePicker imagePicker;
    private final GenericListAdapter<ImageToSendItemView, Bitmap> imagesToSendAdapter;
    private boolean isLoadingPreviousMessages;
    public NotificationManager notificationHandler;
    private final ThreadDetailFragment3 notificationInterceptor;
    private MenuItem notificationSettingsMenu;
    private final String screenName;
    private boolean showMediaUploadButton;

    /* renamed from: threadAnalyticsLogger$delegate, reason: from kotlin metadata */
    private final Lazy threadAnalyticsLogger;

    /* renamed from: threadId$delegate, reason: from kotlin metadata */
    private final Lazy threadId;
    private ApiNotificationThreadSettingsItem threadSettingsItem;
    private final boolean useDesignSystemToolbar;
    private VisibleItemsManager<ThreadDetailViewState4, ThreadDetailViewState4> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadDetailViewState4 onViewCreated$lambda$8(ThreadDetailViewState4 VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<ThreadDetailEvent> event) {
        EventConsumer<ThreadDetailEvent> eventConsumerInvoke;
        EventConsumer<ThreadDetailEvent> eventConsumerInvoke2;
        EventConsumer<ThreadDetailEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof ThreadDetailEvent.ClearInputEvent) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15294invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15294invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getBinding().inboxMessageEdt.setText((CharSequence) null);
                }
            });
        }
        if ((event.getData() instanceof ThreadDetailEvent.NotificationSettingError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15295invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15295invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((ThreadDetailEvent.NotificationSettingError) event.getData()).getThrowable(), false, 2, null);
                }
            });
        }
        if (!(event.getData() instanceof ThreadDetailEvent.UploadMediaError) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15296invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15296invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                Snackbars.show(fragmentActivityRequireActivity, C11048R.string.general_error_summary, -1);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$notificationInterceptor$1] */
    public ThreadDetailFragment() {
        super(C18721R.layout.fragment_inbox_thread_detail);
        this.duxo = DuxosKt.duxo(this, ThreadDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ThreadDetailFragment2.INSTANCE);
        ThreadDetailAdapter threadDetailAdapter = new ThreadDetailAdapter();
        threadDetailAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        this.adapter = threadDetailAdapter;
        this.imagesToSendAdapter = GenericListAdapter.INSTANCE.m2987of(ImageToSendItemView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ThreadDetailFragment.imagesToSendAdapter$lambda$2(this.f$0, (ImageToSendItemView) obj, (Bitmap) obj2);
            }
        });
        this.threadId = Fragments2.argument(this, ARG_THREAD_ID);
        this.threadAnalyticsLogger = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadDetailFragment.threadAnalyticsLogger_delegate$lambda$3(this.f$0);
            }
        });
        this.notificationInterceptor = new NotificationManager.Interceptor() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$notificationInterceptor$1
            @Override // com.robinhood.android.common.notification.NotificationManager.Interceptor
            public boolean intercept(Uri uri, Map<String, String> data) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(data, "data");
                if (!Intrinsics.areEqual(uri.getAuthority(), "threads")) {
                    return false;
                }
                String queryParameter = uri.getQueryParameter("id");
                return queryParameter == null || Intrinsics.areEqual(queryParameter, this.this$0.getThreadId());
            }
        };
        this.useDesignSystemToolbar = true;
        this.screenName = SCREEN_NAME;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    public final NotificationManager getNotificationHandler() {
        NotificationManager notificationManager = this.notificationHandler;
        if (notificationManager != null) {
            return notificationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationHandler");
        return null;
    }

    public final void setNotificationHandler(NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "<set-?>");
        this.notificationHandler = notificationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadDetailDuxo getDuxo() {
        return (ThreadDetailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentInboxThreadDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInboxThreadDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit imagesToSendAdapter$lambda$2(final ThreadDetailFragment threadDetailFragment, ImageToSendItemView of, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        of.bind(bitmap, new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadDetailFragment.imagesToSendAdapter$lambda$2$lambda$1(this.f$0, bitmap);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit imagesToSendAdapter$lambda$2$lambda$1(ThreadDetailFragment threadDetailFragment, Bitmap bitmap) {
        threadDetailFragment.getDuxo().removeImageToSend(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getThreadId() {
        return (String) this.threadId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadAnalyticsLogger getThreadAnalyticsLogger() {
        return (ThreadAnalyticsLogger) this.threadAnalyticsLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadAnalyticsLogger threadAnalyticsLogger_delegate$lambda$3(ThreadDetailFragment threadDetailFragment) {
        return new ThreadAnalyticsLogger(threadDetailFragment.getAnalytics(), threadDetailFragment.getThreadId());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setThreadId(getThreadId());
        this.adapter.setCallbacks(this);
        setHasOptionsMenu(true);
        this.adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = ThreadDetailFragment.this.visibleItemsManager;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(C18721R.menu.menu_thread_detail, menu);
        this.notificationSettingsMenu = menu.findItem(C18721R.id.action_thread_detail_notification_settings);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C18721R.id.action_thread_detail_notification_settings) {
            getThreadAnalyticsLogger().onNotificationSettingsClick();
            Navigator navigator = getNavigator();
            ThreadNotificationSettingsSource threadNotificationSettingsSource = ThreadNotificationSettingsSource.THREAD_MESSAGES;
            ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem = this.threadSettingsItem;
            Intrinsics.checkNotNull(apiNotificationThreadSettingsItem);
            Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ThreadNotificationSettings(threadNotificationSettingsSource, apiNotificationThreadSettingsItem), null, 2, null).show(getChildFragmentManager(), "muteNotification");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(contextRequireContext);
        linearLayoutManager.setStackFromEnd(true);
        getBinding().recyclerView.setButtonTitle(getThreadId());
        getBinding().recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.ItemAnimator itemAnimator = getBinding().recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        LoggedRecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.adapter);
        getBinding().recyclerView.addItemDecoration(new ThreadDetailAdapter.PaddingItemDecoration(contextRequireContext));
        LoggedRecyclerView recyclerView2 = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(recyclerView2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailFragment.onViewCreated$lambda$6(this.f$0, linearLayoutManager, (RecyclerViewScrollEvent) obj);
            }
        });
        VisibleItemsManager<ThreadDetailViewState4, ThreadDetailViewState4> visibleItemsManager = new VisibleItemsManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(ThreadDetailFragment.onViewCreated$lambda$7(this.f$0));
            }
        }, new C187723(this.adapter), new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailFragment.onViewCreated$lambda$8((ThreadDetailViewState4) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        visibleItemsManager.setCallbacks(new VisibleItemsManager.Callbacks<ThreadDetailViewState4>() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment.onViewCreated.5
            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemDisappeared(ThreadDetailViewState4 item, long durationVisible) {
                Intrinsics.checkNotNullParameter(item, "item");
            }

            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemAppeared(ThreadDetailViewState4 item) {
                Intrinsics.checkNotNullParameter(item, "item");
                ThreadDetailFragment.this.getThreadAnalyticsLogger().onItemAppeared(item);
            }
        });
        getThreadAnalyticsLogger().reset();
        RdsTextInputEditText inboxMessageEdt = getBinding().inboxMessageEdt;
        Intrinsics.checkNotNullExpressionValue(inboxMessageEdt, "inboxMessageEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(inboxMessageEdt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailFragment.onViewCreated$lambda$9(this.f$0, (CharSequence) obj);
            }
        });
        getBinding().inboxEditTextContainer.setEndDrawableOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment.onViewCreated.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Editable text = ThreadDetailFragment.this.getBinding().inboxMessageEdt.getText();
                if (ThreadDetailFragment.this.showMediaUploadButton && (text == null || text.length() == 0)) {
                    ImagePicker imagePicker = ThreadDetailFragment.this.getImagePicker();
                    Context contextRequireContext2 = ThreadDetailFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    ThreadDetailFragment.this.startActivityForResult(ImagePicker.getImagePickerIntent$default(imagePicker, contextRequireContext2, null, null, false, false, 30, null), 50);
                    return;
                }
                String string2 = (text == null || StringsKt.isBlank(text)) ? null : text.toString();
                RecyclerView imagesToSendRecyclerView = ThreadDetailFragment.this.getBinding().imagesToSendRecyclerView;
                Intrinsics.checkNotNullExpressionValue(imagesToSendRecyclerView, "imagesToSendRecyclerView");
                if (imagesToSendRecyclerView.getVisibility() != 0 && string2 == null) {
                    return;
                }
                ThreadDetailFragment threadDetailFragment = ThreadDetailFragment.this;
                BaseFragment.collectDuxoState$default(threadDetailFragment, null, new AnonymousClass1(threadDetailFragment, string2, null), 1, null);
            }

            /* compiled from: ThreadDetailFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1", m3645f = "ThreadDetailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $message;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ThreadDetailFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ThreadDetailFragment threadDetailFragment, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = threadDetailFragment;
                    this.$message = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$message, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ThreadDetailFragment.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1$1", m3645f = "ThreadDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ String $message;
                    int label;
                    final /* synthetic */ ThreadDetailFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501871(ThreadDetailFragment threadDetailFragment, String str, Continuation<? super C501871> continuation) {
                        super(2, continuation);
                        this.this$0 = threadDetailFragment;
                        this.$message = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C501871(this.this$0, this.$message, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C501871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            final Flow flowTake = FlowKt.take(this.this$0.getDuxo().getStateFlow(), 1);
                            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends Bitmap>>() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1$1$invokeSuspend$$inlined$map$1
                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super List<? extends Bitmap>> flowCollector, Continuation continuation) {
                                    Object objCollect = flowTake.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "ThreadDetailFragment.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$7$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                            List<Bitmap> imagesToSend = ((ThreadDetailViewState) obj).getImagesToSend();
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(imagesToSend, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
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
                            });
                            final ThreadDetailFragment threadDetailFragment = this.this$0;
                            final String str = this.$message;
                            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment.onViewCreated.7.1.1.2
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit((List<Bitmap>) obj2, (Continuation<? super Unit>) continuation);
                                }

                                public final Object emit(List<Bitmap> list, Continuation<? super Unit> continuation) {
                                    threadDetailFragment.getDuxo().submitMessage(str, list);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 1;
                            if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
                        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C501871(this.this$0, this.$message, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        });
        RecyclerView imagesToSendRecyclerView = getBinding().imagesToSendRecyclerView;
        Intrinsics.checkNotNullExpressionValue(imagesToSendRecyclerView, "imagesToSendRecyclerView");
        bindAdapter(imagesToSendRecyclerView, this.imagesToSendAdapter);
        BaseFragment.collectDuxoState$default(this, null, new C187768(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(ThreadDetailFragment threadDetailFragment, LinearLayoutManager linearLayoutManager, RecyclerViewScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        threadDetailFragment.fetchPreviousMessagesIfNeeded(event, linearLayoutManager);
        VisibleItemsManager<ThreadDetailViewState4, ThreadDetailViewState4> visibleItemsManager = threadDetailFragment.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$3 */
    /* synthetic */ class C187723 extends FunctionReferenceImpl implements Function1<Integer, ThreadDetailViewState4> {
        C187723(Object obj) {
            super(1, obj, ThreadDetailAdapter.class, "getItem", "getItem(I)Lcom/robinhood/android/inbox/ui/thread/ViewType;", 0);
        }

        public final ThreadDetailViewState4 invoke(int i) {
            return ((ThreadDetailAdapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ThreadDetailViewState4 invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$7(ThreadDetailFragment threadDetailFragment) {
        return threadDetailFragment.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(ThreadDetailFragment threadDetailFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseFragment.collectDuxoState$default(threadDetailFragment, null, new ThreadDetailFragment4(threadDetailFragment, null), 1, null);
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8", m3645f = "ThreadDetailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8 */
    static final class C187768 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187768(Continuation<? super C187768> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187768 c187768 = ThreadDetailFragment.this.new C187768(continuation);
            c187768.L$0 = obj;
            return c187768;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187768) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ThreadDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$1", m3645f = "ThreadDetailFragment.kt", m3646l = {256}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThreadDetailFragment threadDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = threadDetailFragment;
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
                    final StateFlow<ThreadDetailViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$1$invokeSuspend$$inlined$map$1$2", m3645f = "ThreadDetailFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    String savedUserInput = ((ThreadDetailViewState) obj).getSavedUserInput();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(savedUserInput, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
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
                    });
                    final ThreadDetailFragment threadDetailFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment.onViewCreated.8.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((String) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(String str, Continuation<? super Unit> continuation) {
                            Editable text = threadDetailFragment.getBinding().inboxMessageEdt.getText();
                            if (text == null || text.length() == 0) {
                                threadDetailFragment.getBinding().inboxMessageEdt.setText(str);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ThreadDetailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ThreadDetailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ThreadDetailFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ThreadDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$2", m3645f = "ThreadDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ThreadDetailFragment threadDetailFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = threadDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ThreadDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ ThreadDetailFragment $tmp0;

                AnonymousClass1(ThreadDetailFragment threadDetailFragment) {
                    this.$tmp0 = threadDetailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, ThreadDetailFragment.class, "updateViewState", "updateViewState(Lcom/robinhood/android/inbox/ui/thread/ThreadDetailViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(ThreadDetailViewState threadDetailViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$updateViewState = AnonymousClass2.invokeSuspend$updateViewState(this.$tmp0, threadDetailViewState, continuation);
                    return objInvokeSuspend$updateViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$updateViewState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((ThreadDetailViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<ThreadDetailViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$updateViewState(ThreadDetailFragment threadDetailFragment, ThreadDetailViewState threadDetailViewState, Continuation continuation) {
                threadDetailFragment.updateViewState(threadDetailViewState);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: ThreadDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$3", m3645f = "ThreadDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ThreadDetailFragment threadDetailFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = threadDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ThreadDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$onViewCreated$8$3$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ ThreadDetailFragment $tmp0;

                AnonymousClass1(ThreadDetailFragment threadDetailFragment) {
                    this.$tmp0 = threadDetailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, ThreadDetailFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<ThreadDetailEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass3.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<ThreadDetailEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleEvent(ThreadDetailFragment threadDetailFragment, Event event, Continuation continuation) {
                threadDetailFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    private final void fetchPreviousMessagesIfNeeded(RecyclerViewScrollEvent event, LinearLayoutManager layoutManager) {
        if (event.getDy() >= 0 || this.hasFetchedAllPreviousMessages || this.earliestMessageId == null || this.isLoadingPreviousMessages || layoutManager.findFirstVisibleItemPosition() >= 10) {
            return;
        }
        ThreadDetailDuxo duxo = getDuxo();
        String str = this.earliestMessageId;
        Intrinsics.checkNotNull(str);
        duxo.fetchPreviousMessages(str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        NotificationManager notificationHandler = getNotificationHandler();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Uri uri = Uri.parse("robinhood://threads?id=" + getThreadId());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        notificationHandler.cancelNotifications(contextRequireContext, uri);
        getNotificationHandler().addInterceptor(this.notificationInterceptor);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getDuxo().saveUserInput(String.valueOf(getBinding().inboxMessageEdt.getText()));
        getNotificationHandler().removeInterceptor(this.notificationInterceptor);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) throws Resources.NotFoundException {
        if (requestCode != 50) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            appendImagesFromActivityResult(data);
            return;
        }
        if (resultCode == 2) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ContextsUiExtensions.showShortToast(contextRequireContext, C11048R.string.general_error_no_image_picker_found);
        } else {
            if (resultCode != 3) {
                return;
            }
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            ContextsUiExtensions.showShortToast(contextRequireContext2, C18721R.string.inbox_failed_to_add_image_error_message);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return getThreadId();
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter.Callbacks
    public void onResponseClick(ThreadDetailViewState4.Response item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getThreadAnalyticsLogger().onResponseClick(item);
        getDuxo().submitResponse(item);
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter.Callbacks
    public void onExternalActionClick(ThreadDetailViewState4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getThreadAnalyticsLogger().onExternalActionClick(item);
        WebUtils webUtils = WebUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ExternalAction externalAction = ThreadDetailFragment5.getExternalAction(item);
        Intrinsics.checkNotNull(externalAction);
        WebUtils.viewUrl$default(webUtils, fragmentActivityRequireActivity, externalAction.getUrl(), 0, 4, null);
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter.Callbacks
    public void onInternalActionClick(ThreadDetailViewState4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getThreadAnalyticsLogger().onInternalActionClick(item);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        InternalAction internalAction = ThreadDetailFragment5.getInternalAction(item);
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, internalAction != null ? internalAction.getUri() : null, null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter.Callbacks
    public void onRetryClick(UUID localMessageId) {
        Intrinsics.checkNotNullParameter(localMessageId, "localMessageId");
        getDuxo().retryMessage(getThreadId(), localMessageId);
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter.Callbacks
    public void onAvatarClick(ThreadDetailViewState4.Text item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getThreadAnalyticsLogger().onAvatarClick(item);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String entityUrl = item.getEntityUrl();
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, entityUrl != null ? Uri.parse(entityUrl) : null, null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter.Callbacks
    public void onImageClick(MediaMetadata mediaMetadata) {
        Intrinsics.checkNotNullParameter(mediaMetadata, "mediaMetadata");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.MediaImageViewer(mediaMetadata), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(ThreadDetailViewState viewState) {
        MenuItem menuItem = this.notificationSettingsMenu;
        if (menuItem != null) {
            menuItem.setVisible(viewState.getShowNotificationSettings());
        }
        MenuItem menuItem2 = this.notificationSettingsMenu;
        if (menuItem2 != null && menuItem2.isVisible()) {
            getThreadAnalyticsLogger().onNotificationSettingsAppear();
        }
        this.threadSettingsItem = viewState.getApiNotificationThreadSettingsItem();
        this.isLoadingPreviousMessages = viewState.isLoadingPreviousMessages();
        this.hasFetchedAllPreviousMessages = viewState.getHasFetchedAllPreviousMessages();
        this.earliestMessageId = viewState.getEarliestMessageId();
        this.showMediaUploadButton = viewState.getShowMediaUploadButton();
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setTitle(viewState.getThreadTitle());
        RdsTextInputContainerView inboxEditTextContainer = getBinding().inboxEditTextContainer;
        Intrinsics.checkNotNullExpressionValue(inboxEditTextContainer, "inboxEditTextContainer");
        final boolean z = false;
        inboxEditTextContainer.setVisibility(viewState.getAllowInput() ? 0 : 8);
        RecyclerView imagesToSendRecyclerView = getBinding().imagesToSendRecyclerView;
        Intrinsics.checkNotNullExpressionValue(imagesToSendRecyclerView, "imagesToSendRecyclerView");
        imagesToSendRecyclerView.setVisibility(viewState.getShowImagesToSendView() ? 0 : 8);
        if (viewState.getViewTypes().size() > this.adapter.getSize() && this.adapter.getSize() != 0) {
            z = true;
        }
        this.adapter.submitList(viewState.getViewTypes(), new Runnable() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment.updateViewState.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ThreadDetailFragment.this.isAtMost(LifecycleEvent.ON_STOP)) {
                    if (z && ThreadDetailFragment.this.getBinding().recyclerView.getScrollState() == 0) {
                        ThreadDetailFragment.this.getBinding().recyclerView.smoothScrollToPosition(ThreadDetailFragment.this.adapter.getSize() - 1);
                    }
                    ThreadDetailFragment.this.adapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
                }
            }
        });
        this.imagesToSendAdapter.submitList(viewState.getImagesToSend());
        getBinding().inboxMessageEdt.setEnabled(true ^ viewState.isUploadingMedia());
        updateEditTextEndIcon(viewState);
        getDuxo().markThreadAsRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateEditTextEndIcon(ThreadDetailViewState viewState) {
        int i;
        Editable text;
        RdsProgressBar inboxMessageProgressBar = getBinding().inboxMessageProgressBar;
        Intrinsics.checkNotNullExpressionValue(inboxMessageProgressBar, "inboxMessageProgressBar");
        int i2 = 0;
        inboxMessageProgressBar.setVisibility(viewState.isUploadingMedia() ? 0 : 8);
        if (!viewState.isUploadingMedia()) {
            if (this.showMediaUploadButton && ((text = getBinding().inboxMessageEdt.getText()) == null || text.length() == 0)) {
                i2 = C20690R.drawable.ic_rds_image_24dp;
            } else {
                i2 = C20690R.drawable.ic_rds_message_send_24dp;
            }
        }
        getBinding().inboxEditTextContainer.setEndDrawable(i2);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Editable text2 = getBinding().inboxMessageEdt.getText();
        if (text2 == null || StringsKt.isBlank(text2)) {
            RecyclerView imagesToSendRecyclerView = getBinding().imagesToSendRecyclerView;
            Intrinsics.checkNotNullExpressionValue(imagesToSendRecyclerView, "imagesToSendRecyclerView");
            i = imagesToSendRecyclerView.getVisibility() == 0 ? C20690R.attr.colorPrimary : R.attr.textColorSecondary;
        }
        getBinding().inboxEditTextContainer.setDrawableEndTint(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext, i)));
    }

    private final void appendImagesFromActivityResult(Intent data) {
        ImagePicker imagePicker = getImagePicker();
        Intrinsics.checkNotNull(data);
        bind(SinglesAndroid.observeOnMainThread(imagePicker.extractImagesFromResultIntent(data)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadDetailFragment.appendImagesFromActivityResult$lambda$13(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendImagesFromActivityResult$lambda$13(ThreadDetailFragment threadDetailFragment, List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        threadDetailFragment.getDuxo().addImagesToSend(images);
        if (images.isEmpty()) {
            FragmentActivity fragmentActivityRequireActivity = threadDetailFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, C18721R.string.inbox_failed_to_add_image_error_message, -1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThreadDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment$ThreadAnalyticsLogger;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", ThreadDetailFragment.ARG_THREAD_ID, "", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Ljava/lang/String;)V", "seenTextIds", "", "seenExternalActionIds", "seenResponseIds", "Lkotlin/Pair;", "seenNotificationSettings", "", "reset", "", "onItemAppeared", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "onResponseClick", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Response;", "onExternalActionClick", "onInternalActionClick", "onAvatarClick", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "onNotificationSettingsAppear", "onNotificationSettingsClick", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class ThreadAnalyticsLogger {
        private final AnalyticsLogger analytics;
        private final Set<String> seenExternalActionIds;
        private boolean seenNotificationSettings;
        private final Set<Tuples2<String, String>> seenResponseIds;
        private final Set<String> seenTextIds;
        private final String threadId;

        public ThreadAnalyticsLogger(AnalyticsLogger analytics, String threadId) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(threadId, "threadId");
            this.analytics = analytics;
            this.threadId = threadId;
            this.seenTextIds = new LinkedHashSet();
            this.seenExternalActionIds = new LinkedHashSet();
            this.seenResponseIds = new LinkedHashSet();
        }

        public final void reset() {
            this.seenTextIds.clear();
            this.seenExternalActionIds.clear();
            this.seenResponseIds.clear();
            this.seenNotificationSettings = false;
        }

        public final void onItemAppeared(ThreadDetailViewState4 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof ThreadDetailViewState4.Text) {
                ThreadDetailViewState4.Text text = (ThreadDetailViewState4.Text) item;
                String messageId = text.getMessageId();
                if (text.getText() != null && !this.seenTextIds.contains(messageId)) {
                    this.seenTextIds.add(messageId);
                    AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_TEXT, this.threadId, text.getMessageConfigId(), null, null, text.getMessageTypeConfigId(), messageId, null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, null);
                    if (text.getInternalAction() != null) {
                        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_DEEPLINK, this.threadId, text.getMessageConfigId(), null, text.getInternalAction().getUri().toString(), null, messageId, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
                        return;
                    }
                    return;
                }
                if (text.getExternalAction() == null || this.seenExternalActionIds.contains(messageId)) {
                    return;
                }
                this.seenExternalActionIds.add(messageId);
                AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_WEBLINK, this.threadId, text.getMessageConfigId(), null, text.getExternalAction().getUrl().getUrl(), null, messageId, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
                return;
            }
            if (item instanceof ThreadDetailViewState4.Response) {
                ThreadDetailViewState4.Response response = (ThreadDetailViewState4.Response) item;
                Tuples2<String, String> tuples2M3642to = Tuples4.m3642to(response.getMessageId(), response.getAnswer());
                if (this.seenResponseIds.contains(tuples2M3642to)) {
                    return;
                }
                this.seenResponseIds.add(tuples2M3642to);
                AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_RESPONSES, this.threadId, response.getMessageConfigId(), null, response.getAnswer(), response.getMessageTypeConfigId(), response.getMessageId(), null, 136, null);
                return;
            }
            if (!(item instanceof ThreadDetailViewState4.Date) && !(item instanceof ThreadDetailViewState4.Metadata) && !(item instanceof ThreadDetailViewState4.ProgressBar) && !(item instanceof ThreadDetailViewState4.Timestamp)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        public final void onResponseClick(ThreadDetailViewState4.Response item) {
            Intrinsics.checkNotNullParameter(item, "item");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_RESPONSES, this.threadId, item.getMessageConfigId(), null, item.getAnswer(), item.getMessageTypeConfigId(), item.getMessageId(), null, 136, null);
        }

        public final void onExternalActionClick(ThreadDetailViewState4 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            AnalyticsLogger analyticsLogger = this.analytics;
            String str = this.threadId;
            String messageConfigId = ThreadDetailFragment5.getMessageConfigId(item);
            ExternalAction externalAction = ThreadDetailFragment5.getExternalAction(item);
            Intrinsics.checkNotNull(externalAction);
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_THREAD_WEBLINK, str, messageConfigId, null, externalAction.getUrl().getUrl(), null, ThreadDetailFragment5.getMessageId(item), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
        }

        public final void onInternalActionClick(ThreadDetailViewState4 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            AnalyticsLogger analyticsLogger = this.analytics;
            String str = this.threadId;
            String messageConfigId = ThreadDetailFragment5.getMessageConfigId(item);
            InternalAction internalAction = ThreadDetailFragment5.getInternalAction(item);
            Intrinsics.checkNotNull(internalAction);
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_THREAD_DEEPLINK, str, messageConfigId, null, internalAction.getUri().toString(), null, ThreadDetailFragment5.getMessageId(item), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
        }

        public final void onAvatarClick(ThreadDetailViewState4.Text item) {
            Intrinsics.checkNotNullParameter(item, "item");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_AVATAR, this.threadId, item.getMessageConfigId(), null, String.valueOf(item.getEntityUrl()), null, item.getMessageId(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
        }

        public final void onNotificationSettingsAppear() {
            if (this.seenNotificationSettings) {
                return;
            }
            this.seenNotificationSettings = true;
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_SETTINGS, this.threadId, AnalyticsStrings.BUTTON_THREAD_SETTINGS_DESCRIPTION_GEAR_ICON, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        }

        public final void onNotificationSettingsClick() {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_THREAD_SETTINGS, this.threadId, AnalyticsStrings.BUTTON_THREAD_SETTINGS_DESCRIPTION_GEAR_ICON, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        }
    }

    /* compiled from: ThreadDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$InboxThreadDetail;", "<init>", "()V", "REQUEST_CODE_PICK_IMAGE", "", "SCREEN_NAME", "", "ARG_THREAD_ID", "PREFETCH_THRESHOLD", "newInstance", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailFragment;", ThreadDetailFragment.ARG_THREAD_ID, "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.InboxThreadDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ThreadDetailFragment newInstance(String threadId) {
            Intrinsics.checkNotNullParameter(threadId, "threadId");
            ThreadDetailFragment threadDetailFragment = new ThreadDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ThreadDetailFragment.ARG_THREAD_ID, threadId);
            threadDetailFragment.setArguments(bundle);
            return threadDetailFragment;
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.InboxThreadDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance(key.getThreadId());
        }
    }
}
