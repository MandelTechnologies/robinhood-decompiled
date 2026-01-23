package com.robinhood.android.support.contactus;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.WebStorage;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.EmailUtils2;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.lib.pathfinder.PathfinderEvent;
import com.robinhood.android.lib.pathfinder.PathfinderFragment;
import com.robinhood.android.lib.pathfinder.PathfinderRelay;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.extensions.AnalyticsLoggers;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.support.contactus.ContactSupportHybridEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.contracts.ContactSupportHybridFragmentKey;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey2;
import com.robinhood.shared.support.contracts.SupportHubFragmentKey;
import com.robinhood.shared.support.databinding.FragmentContactSupportHybridBinding;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.net.ActiveNetworkCounter;
import com.robinhood.utils.net.ActiveNetworkCounter2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ContactSupportHybridFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00104\u001a\u00020.H\u0016J\b\u00105\u001a\u00020.H\u0016J\b\u00106\u001a\u00020.H\u0016J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020.H\u0002J\f\u0010>\u001a\u00020?*\u00020@H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R#\u0010#\u001a\n %*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "pathfinderRelay", "Lcom/robinhood/android/lib/pathfinder/PathfinderRelay;", "duxo", "Lcom/robinhood/android/support/contactus/ContactSupportHybridDuxo;", "getDuxo", "()Lcom/robinhood/android/support/contactus/ContactSupportHybridDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/shared/support/databinding/FragmentContactSupportHybridBinding;", "getBindings", "()Lcom/robinhood/shared/support/databinding/FragmentContactSupportHybridBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "contactSupportArgs", "Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "getContactSupportArgs", "()Lcom/robinhood/shared/support/contracts/ContactSupportFragmentKey;", "pathfinderFragment", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragment;", "getPathfinderFragment", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragment;", "connectivityManager", "Landroid/net/ConnectivityManager;", "kotlin.jvm.PlatformType", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "onDestroy", "handlePathfinderEvent", "event", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;", "displayErrorView", "error", "Lcom/robinhood/android/lib/webview/WebError;", "clearWebStorage", "isConnectivityTooManyRequests", "", "", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ContactSupportHybridFragment extends BaseFragment implements SupportBreadcrumbTracker2 {
    public AnalyticsLogger analytics;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: connectivityManager$delegate, reason: from kotlin metadata */
    private final Lazy connectivityManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActiveNetworkCounter networkCounter;
    private PathfinderRelay pathfinderRelay;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ContactSupportHybridFragment.class, "bindings", "getBindings()Lcom/robinhood/shared/support/databinding/FragmentContactSupportHybridBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ContactSupportHybridFragment() {
        super(C39996R.layout.fragment_contact_support_hybrid);
        this.duxo = DuxosKt.duxo(this, ContactSupportHybridDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, ContactSupportHybridFragment2.INSTANCE);
        this.networkCounter = new ActiveNetworkCounter();
        this.connectivityManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactSupportHybridFragment.connectivityManager_delegate$lambda$0(this.f$0);
            }
        });
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

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactSupportHybridDuxo getDuxo() {
        return (ContactSupportHybridDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentContactSupportHybridBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentContactSupportHybridBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactSupportFragmentKey getContactSupportArgs() {
        return ((ContactSupportHybridFragmentKey) INSTANCE.getArgs((Fragment) this)).getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderFragment getPathfinderFragment() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C39996R.id.pathfinder_container);
        if (fragmentFindFragmentById instanceof PathfinderFragment) {
            return (PathfinderFragment) fragmentFindFragmentById;
        }
        return null;
    }

    private final ConnectivityManager getConnectivityManager() {
        return (ConnectivityManager) this.connectivityManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectivityManager connectivityManager_delegate$lambda$0(ContactSupportHybridFragment contactSupportHybridFragment) {
        return (ConnectivityManager) contactSupportHybridFragment.requireContext().getSystemService(ConnectivityManager.class);
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        ContactSupportFragmentKey contactSupportArgs = getContactSupportArgs();
        ContactSupportFragmentKey.TriageFlow triageFlow = contactSupportArgs instanceof ContactSupportFragmentKey.TriageFlow ? (ContactSupportFragmentKey.TriageFlow) contactSupportArgs : null;
        String topicId = triageFlow != null ? triageFlow.getTopicId() : null;
        ContactSupportFragmentKey contactSupportArgs2 = getContactSupportArgs();
        ContactSupportFragmentKey.Uar uar = contactSupportArgs2 instanceof ContactSupportFragmentKey.Uar ? (ContactSupportFragmentKey.Uar) contactSupportArgs2 : null;
        if (topicId != null) {
            return new SupportBreadcrumb(SupportBreadcrumbType.LEGACY_TOPIC_ID, topicId, "AppLink");
        }
        if (uar != null) {
            return new SupportBreadcrumb(SupportBreadcrumbType.RECOVERY_AUTHENTICATOR_RESET, MapsKt.mapOf(Tuples4.m3642to("username", uar.getUsername()), Tuples4.m3642to("challenge_type", uar.getChallengeType().getServerValue())), uar.getSource());
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pathfinderRelay = (PathfinderRelay) new ViewModelProvider(this).get(PathfinderRelay.class);
        clearWebStorage();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C289781(null), 1, null);
    }

    /* compiled from: ContactSupportHybridFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1", m3645f = "ContactSupportHybridFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1 */
    static final class C289781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C289781(Continuation<? super C289781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C289781 c289781 = ContactSupportHybridFragment.this.new C289781(continuation);
            c289781.L$0 = obj;
            return c289781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ContactSupportHybridFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$1", m3645f = "ContactSupportHybridFragment.kt", m3646l = {112}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ContactSupportHybridFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ContactSupportHybridFragment contactSupportHybridFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = contactSupportHybridFragment;
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
                    final ContactSupportHybridFragment contactSupportHybridFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<ContactSupportHybridEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<ContactSupportHybridEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<ContactSupportHybridEvent> eventConsumerInvoke;
                            EventConsumer<ContactSupportHybridEvent> eventConsumerInvoke2;
                            EventConsumer<ContactSupportHybridEvent> eventConsumerInvoke3;
                            final ContactSupportHybridFragment contactSupportHybridFragment2 = contactSupportHybridFragment;
                            if ((event.getData() instanceof ContactSupportHybridEvent.Loading) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19088invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19088invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        RdsProgressBar inquiryLoadingView = contactSupportHybridFragment2.getBindings().inquiryLoadingView;
                                        Intrinsics.checkNotNullExpressionValue(inquiryLoadingView, "inquiryLoadingView");
                                        inquiryLoadingView.setVisibility(0);
                                        ErrorView contactSupportErrorView = contactSupportHybridFragment2.getBindings().contactSupportErrorView;
                                        Intrinsics.checkNotNullExpressionValue(contactSupportErrorView, "contactSupportErrorView");
                                        contactSupportErrorView.setVisibility(8);
                                    }
                                });
                            }
                            final ContactSupportHybridFragment contactSupportHybridFragment3 = contactSupportHybridFragment;
                            if ((event.getData() instanceof ContactSupportHybridEvent.Failed) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19089invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19089invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ContactSupportHybridEvent.Failed failed = (ContactSupportHybridEvent.Failed) event.getData();
                                        RdsProgressBar inquiryLoadingView = contactSupportHybridFragment3.getBindings().inquiryLoadingView;
                                        Intrinsics.checkNotNullExpressionValue(inquiryLoadingView, "inquiryLoadingView");
                                        inquiryLoadingView.setVisibility(8);
                                        ErrorView contactSupportErrorView = contactSupportHybridFragment3.getBindings().contactSupportErrorView;
                                        Intrinsics.checkNotNullExpressionValue(contactSupportErrorView, "contactSupportErrorView");
                                        contactSupportErrorView.setVisibility(0);
                                        contactSupportHybridFragment3.displayErrorView(failed.getReason());
                                    }
                                });
                            }
                            final ContactSupportHybridFragment contactSupportHybridFragment4 = contactSupportHybridFragment;
                            if ((event.getData() instanceof ContactSupportHybridEvent.Loaded) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19090invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19090invoke(Object it) {
                                        PathfinderFragmentKey2 sassy;
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ContactSupportHybridEvent.Loaded loaded = (ContactSupportHybridEvent.Loaded) event.getData();
                                        RdsProgressBar inquiryLoadingView = contactSupportHybridFragment4.getBindings().inquiryLoadingView;
                                        Intrinsics.checkNotNullExpressionValue(inquiryLoadingView, "inquiryLoadingView");
                                        inquiryLoadingView.setVisibility(8);
                                        ErrorView contactSupportErrorView = contactSupportHybridFragment4.getBindings().contactSupportErrorView;
                                        Intrinsics.checkNotNullExpressionValue(contactSupportErrorView, "contactSupportErrorView");
                                        contactSupportErrorView.setVisibility(8);
                                        if (contactSupportHybridFragment4.getPathfinderFragment() == null) {
                                            ContactSupportFragmentKey contactSupportArgs = contactSupportHybridFragment4.getContactSupportArgs();
                                            if (contactSupportArgs instanceof ContactSupportFragmentKey.Sassy) {
                                                sassy = new PathfinderFragmentKey2.Sassy(((ContactSupportFragmentKey.Sassy) contactSupportArgs).getFlow());
                                            } else {
                                                sassy = PathfinderFragmentKey2.None.INSTANCE;
                                            }
                                            contactSupportHybridFragment4.setFragment(C39996R.id.pathfinder_container, (PathfinderFragment) PathfinderFragment.INSTANCE.newInstance((Parcelable) new PathfinderFragmentKey(loaded.getInquiryId(), sassy)));
                                        }
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ContactSupportHybridFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ContactSupportHybridFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ContactSupportHybridFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$2", m3645f = "ContactSupportHybridFragment.kt", m3646l = {147}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ContactSupportHybridFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ContactSupportHybridFragment contactSupportHybridFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = contactSupportHybridFragment;
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
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: ContactSupportHybridFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$2$1", m3645f = "ContactSupportHybridFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<ContactSupportHybridEvent>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContactSupportHybridFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ContactSupportHybridFragment contactSupportHybridFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = contactSupportHybridFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Event<ContactSupportHybridEvent> event, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    EventConsumer eventConsumer;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final Event event = (Event) this.L$0;
                    final ContactSupportHybridFragment contactSupportHybridFragment = this.this$0;
                    if ((event.getData() instanceof ContactSupportHybridEvent.ShowSupportHub) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onViewCreated$1$2$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m19091invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19091invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                contactSupportHybridFragment.requireActivity().finish();
                                Navigator navigator = contactSupportHybridFragment.getNavigator();
                                Context contextRequireContext = contactSupportHybridFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, SupportHubFragmentKey.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        PathfinderRelay pathfinderRelay = this.pathfinderRelay;
        if (pathfinderRelay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pathfinderRelay");
            pathfinderRelay = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(pathfinderRelay.getEvents()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C289771(this));
        try {
            ConnectivityManager connectivityManager = getConnectivityManager();
            Intrinsics.checkNotNullExpressionValue(connectivityManager, "<get-connectivityManager>(...)");
            ActiveNetworkCounter2.registerNetworkCallback(connectivityManager, this.networkCounter);
        } catch (RuntimeException e) {
            if (isConnectivityTooManyRequests(e)) {
                AnalyticsLoggers.logNativePathfinderError(getAnalytics(), WebError.TooManyConnectivityRequests.INSTANCE.getMessage() + " (error screen not shown)");
                return;
            }
            throw e;
        }
    }

    /* compiled from: ContactSupportHybridFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.contactus.ContactSupportHybridFragment$onStart$1 */
    /* synthetic */ class C289771 extends FunctionReferenceImpl implements Function1<PathfinderEvent, Unit> {
        C289771(Object obj) {
            super(1, obj, ContactSupportHybridFragment.class, "handlePathfinderEvent", "handlePathfinderEvent(Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PathfinderEvent pathfinderEvent) {
            invoke2(pathfinderEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PathfinderEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ContactSupportHybridFragment) this.receiver).handlePathfinderEvent(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            Result.Companion companion = Result.INSTANCE;
            getConnectivityManager().unregisterNetworkCallback(this.networkCounter);
            Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        clearWebStorage();
    }

    private static final void handlePathfinderEvent$onBackNavChanged(ContactSupportHybridFragment contactSupportHybridFragment, boolean z) {
        if (z) {
            contactSupportHybridFragment.requireBaseActivity().showBackArrowIcon();
        } else {
            contactSupportHybridFragment.requireBaseActivity().showCloseIcon();
        }
    }

    private static final void handlePathfinderEvent$preventBackNav(ContactSupportHybridFragment contactSupportHybridFragment) {
        ActionBar supportActionBar = contactSupportHybridFragment.requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePathfinderEvent(PathfinderEvent event) {
        if (event instanceof PathfinderEvent.DismissEvent) {
            requireActivity().finish();
        } else if (event instanceof PathfinderEvent.BackNavChangeEvent) {
            handlePathfinderEvent$onBackNavChanged(this, ((PathfinderEvent.BackNavChangeEvent) event).getCanGoBack());
        } else {
            if (!(event instanceof PathfinderEvent.DisableBackNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            handlePathfinderEvent$preventBackNav(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayErrorView(final WebError error) {
        AnalyticsLoggers.logNativePathfinderError(getAnalytics(), error.getMessage() + " (error screen shown)");
        ErrorView errorView = getBindings().contactSupportErrorView;
        errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.support.contactus.ContactSupportHybridFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactSupportHybridFragment.displayErrorView$lambda$4$lambda$3(this.f$0, error);
            }
        });
        Intrinsics.checkNotNull(errorView);
        errorView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit displayErrorView$lambda$4$lambda$3(ContactSupportHybridFragment contactSupportHybridFragment, WebError webError) {
        Context contextRequireContext = contactSupportHybridFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Integer statusCode = webError.getStatusCode();
        EmailUtils2.sendSupportEmailIfSupported$default(contextRequireContext, null, null, statusCode != null ? CollectionsKt.listOf(String.valueOf(statusCode.intValue())) : null, null, 11, null);
        contactSupportHybridFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    private final void clearWebStorage() {
        WebStorage.getInstance().deleteAllData();
    }

    private final boolean isConnectivityTooManyRequests(Throwable th) {
        return Intrinsics.areEqual(th.getClass().getName(), "android.net.ConnectivityManager$TooManyRequestsException");
    }

    /* compiled from: ContactSupportHybridFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/contactus/ContactSupportHybridFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/contactus/ContactSupportHybridFragment;", "Lcom/robinhood/shared/support/contracts/ContactSupportHybridFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ContactSupportHybridFragment, ContactSupportHybridFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ContactSupportHybridFragmentKey contactSupportHybridFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, contactSupportHybridFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ContactSupportHybridFragmentKey getArgs(ContactSupportHybridFragment contactSupportHybridFragment) {
            return (ContactSupportHybridFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, contactSupportHybridFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ContactSupportHybridFragment newInstance(ContactSupportHybridFragmentKey contactSupportHybridFragmentKey) {
            return (ContactSupportHybridFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, contactSupportHybridFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ContactSupportHybridFragment contactSupportHybridFragment, ContactSupportHybridFragmentKey contactSupportHybridFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, contactSupportHybridFragment, contactSupportHybridFragmentKey);
        }
    }
}
