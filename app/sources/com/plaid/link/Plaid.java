package com.plaid.link;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.C5813C2;
import com.plaid.internal.C5825D5;
import com.plaid.internal.C5826D6;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5896L4;
import com.plaid.internal.C5921O;
import com.plaid.internal.C5926O4;
import com.plaid.internal.C5931P0;
import com.plaid.internal.C5935P4;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C5979U4;
import com.plaid.internal.C5988V4;
import com.plaid.internal.C6005X3;
import com.plaid.internal.C6042b3;
import com.plaid.internal.C7117j5;
import com.plaid.internal.C7156n0;
import com.plaid.internal.C7165o0;
import com.plaid.internal.C7195r3;
import com.plaid.internal.C7248x1;
import com.plaid.internal.C7258y2;
import com.plaid.internal.C7266z1;
import com.plaid.internal.EnumC5934P3;
import com.plaid.internal.EnumC6054c5;
import com.plaid.internal.EnumC7081g;
import com.plaid.internal.InterfaceC5944Q4;
import com.plaid.internal.InterfaceC6013Y2;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkConfigurationMalformedLinkTokenException;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dagger.internal.Preconditions;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Keep
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001a\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0006H\u0000¢\u0006\u0004\b%\u0010\u0003J\u0010\u0010)\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u0003J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u0010\u0003J'\u00108\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u00062\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0006H\u0007¢\u0006\u0004\b<\u0010\u0003JA\u0010E\u001a\u00020D2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020+2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020+0@2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\bE\u0010FJG\u0010E\u001a\u00020D2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020+2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\bE\u0010HJ\u001f\u0010J\u001a\u00020I2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bL\u0010.J\u0017\u0010M\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010\u0003J\u0017\u0010P\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020R2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bU\u0010\u0003J\u001f\u0010Y\u001a\u00020\u00192\u0006\u0010V\u001a\u00020R2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u0018\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020+H\u0082@¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bb\u0010QJ\u000f\u0010c\u001a\u00020\u0013H\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0013H\u0002¢\u0006\u0004\be\u0010dR\"\u0010g\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR \u0010m\u001a\u00020W8\u0006X\u0087D¢\u0006\u0012\n\u0004\bm\u0010n\u0012\u0004\bq\u0010\u0003\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR&\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010zR,\u0010{\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006}"}, m3636d2 = {"Lcom/plaid/link/Plaid;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/plaid/link/event/LinkEvent;", "", "Lcom/plaid/link/event/LinkEventListener;", "getCustomerFacingLinkEventListenerInternal$link_sdk_release", "()Lkotlin/jvm/functions/Function1;", "getCustomerFacingLinkEventListenerInternal", "Lkotlin/Function2;", "Lcom/plaid/internal/G2;", "Lcom/plaid/internal/event/QueueableLinkEventListener;", "getLinkEventListenerInternal$link_sdk_release", "()Lkotlin/jvm/functions/Function2;", "getLinkEventListenerInternal", "Landroid/app/Application;", "application", "Lcom/plaid/internal/Y2;", "provideLinkTokenComponent$link_sdk_release", "(Landroid/app/Application;)Lcom/plaid/internal/Y2;", "provideLinkTokenComponent", "Landroid/app/Activity;", "activity", "", "openLinkInternal$link_sdk_release", "(Landroid/app/Activity;)Z", "openLinkInternal", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Z", "Lcom/plaid/link/SubmissionData;", "submissionData", "submitInternal$link_sdk_release", "(Lcom/plaid/link/SubmissionData;)V", "submitInternal", "preloadLink$link_sdk_release", "preloadLink", "awaitPreload$link_sdk_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPreload", "destroy", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "linkTokenConfiguration", "createWithoutPreload$link_sdk_release", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)V", "createWithoutPreload", "trackSdkOpen$link_sdk_release", "trackSdkOpen", "", "resultCode", "Landroid/os/Parcelable;", WebsocketGatewayConstants.DATA_KEY, "setLinkResultAndFinish$link_sdk_release", "(Landroid/app/Activity;ILandroid/os/Parcelable;)V", "setLinkResultAndFinish", "linkEventListener", "setLinkEventListener", "(Lkotlin/jvm/functions/Function1;)V", "clearLinkEventListener", "Landroid/content/Context;", "context", "config", "Landroidx/activity/result/ActivityResultLauncher;", "activityResultLauncher", "Lcom/plaid/link/result/LinkExit;", "failureCallback", "Landroid/view/View;", "createLinkEmbeddedView", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Landroidx/activity/result/ActivityResultLauncher;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "successCallback", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "Lcom/plaid/link/PlaidHandler;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/link/PlaidHandler;", "initializeAndCheckPrerequisites", "initialize", "(Landroid/app/Application;)V", "drainLinkEventQueue", "enforceDeviceHasPortrait", "(Landroid/content/Context;)Z", "Lcom/plaid/internal/c5;", "initializeEnvironmentFromTokenOrCrash", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/internal/c5;", "maybeSendTestCrash", "plaidEnvironment", "", "packageName", "shouldSendTestCrash", "(Lcom/plaid/internal/c5;Ljava/lang/String;)Z", "Lcom/plaid/internal/P3;", "logLevel", "setPlogLevel", "(Lcom/plaid/internal/P3;)V", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "setLinkConfiguration", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasPortrait", "getOrCreateTokenComponent", "()Lcom/plaid/internal/Y2;", "initializeTokenComponent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated$link_sdk_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setCreated$link_sdk_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "VERSION_NAME", "Ljava/lang/String;", "getVERSION_NAME", "()Ljava/lang/String;", "getVERSION_NAME$annotations", "Lcom/plaid/internal/Q4;", "component", "Lcom/plaid/internal/Q4;", "tokenComponent", "Lcom/plaid/internal/Y2;", "Lkotlinx/coroutines/Job;", "preloadLinkJob", "Lkotlinx/coroutines/Job;", "Lkotlin/jvm/functions/Function1;", "queueableEventListener", "Lkotlin/jvm/functions/Function2;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class Plaid {
    private static InterfaceC5944Q4 component;
    private static Job preloadLinkJob;
    private static InterfaceC6013Y2 tokenComponent;
    public static final Plaid INSTANCE = new Plaid();
    private static AtomicBoolean isCreated = new AtomicBoolean(false);
    private static final String VERSION_NAME = "5.3.1";
    private static Function1<? super LinkEvent, Unit> linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$linkEventListener$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
            invoke2(linkEvent);
            return Unit.INSTANCE;
        }
    };
    private static Function2<? super LinkEvent, ? super AbstractC5849G2, Unit> queueableEventListener = new Function2<LinkEvent, AbstractC5849G2, Unit>() { // from class: com.plaid.link.Plaid$queueableEventListener$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkEvent linkEvent, AbstractC5849G2 abstractC5849G2) {
            Intrinsics.checkNotNullParameter(linkEvent, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent, AbstractC5849G2 abstractC5849G2) {
            invoke2(linkEvent, abstractC5849G2);
            return Unit.INSTANCE;
        }
    };

    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.plaid.link.Plaid", m3645f = "Plaid.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "setLinkConfiguration")
    /* renamed from: com.plaid.link.Plaid$setLinkConfiguration$1 */
    public static final class C72751 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C72751(Continuation<? super C72751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Plaid.this.setLinkConfiguration(null, this);
        }
    }

    private Plaid() {
    }

    @JvmStatic
    public static final void clearLinkEventListener() {
        linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid.clearLinkEventListener.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinkEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }
        };
    }

    @JvmStatic
    public static final PlaidHandler create(Application application, LinkTokenConfiguration linkTokenConfiguration) throws InterruptedException, LinkException {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "linkTokenConfiguration");
        Plaid plaid = INSTANCE;
        plaid.createWithoutPreload$link_sdk_release(application, linkTokenConfiguration);
        plaid.preloadLink$link_sdk_release();
        return new PlaidHandler();
    }

    @JvmStatic
    public static final View createLinkEmbeddedView(Context context, LinkTokenConfiguration config, ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher, Function1<? super LinkExit, Unit> failureCallback) throws LinkException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        Plaid plaid = INSTANCE;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        C5931P0 c5931p0 = new C5931P0(context, config, activityResultLauncher, null, failureCallback);
        c5931p0.m1289a();
        return c5931p0.f1611f;
    }

    private final void drainLinkEventQueue() {
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("draining link event queue", true);
        InterfaceC5944Q4 interfaceC5944Q4 = component;
        if (interfaceC5944Q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC5944Q4 = null;
        }
        ((C7165o0) interfaceC5944Q4).f3046j.get().m1667a(new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid.drainLinkEventQueue.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinkEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C5953R5.a.m1299a(C5953R5.f1671a, "draining " + it);
                Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(it);
            }
        });
    }

    private final boolean enforceDeviceHasPortrait(Context context) throws LinkException {
        if (hasPortrait(context)) {
            return true;
        }
        throw new LinkException("Device does not support portrait mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6013Y2 getOrCreateTokenComponent() {
        InterfaceC6013Y2 interfaceC6013Y2 = tokenComponent;
        return interfaceC6013Y2 == null ? initializeTokenComponent() : interfaceC6013Y2;
    }

    public static final String getVERSION_NAME() {
        return VERSION_NAME;
    }

    @JvmStatic
    public static /* synthetic */ void getVERSION_NAME$annotations() {
    }

    private final boolean hasPortrait(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.screen.portrait");
    }

    private final synchronized void initialize(Application application) {
        if (isCreated.get()) {
            return;
        }
        Application application2 = (Application) Preconditions.checkNotNull(application);
        C7117j5 c7117j5 = (C7117j5) Preconditions.checkNotNull(new C7117j5());
        Preconditions.checkBuilderRequirement(application2, Application.class);
        Preconditions.checkBuilderRequirement(c7117j5, C7117j5.class);
        C7165o0 c7165o0 = new C7165o0(new C7117j5(), application2);
        component = c7165o0;
        C5825D5 reporter = new C5825D5(c7165o0.f3050n.get());
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        C5835E6.f1339a = reporter;
        isCreated.getAndSet(true);
    }

    private final void initializeAndCheckPrerequisites(Application application, LinkTokenConfiguration linkTokenConfiguration) throws LinkException {
        EnumC5934P3 enumC5934P3;
        initialize(application);
        enforceDeviceHasPortrait(application);
        initializeEnvironmentFromTokenOrCrash(linkTokenConfiguration);
        LinkLogLevel logLevel = linkTokenConfiguration.getLogLevel();
        Intrinsics.checkNotNullParameter(logLevel, "<this>");
        switch (C5813C2.f1298a[logLevel.ordinal()]) {
            case 1:
                enumC5934P3 = EnumC5934P3.ASSERT;
                break;
            case 2:
                enumC5934P3 = EnumC5934P3.DEBUG;
                break;
            case 3:
                enumC5934P3 = EnumC5934P3.ERROR;
                break;
            case 4:
                enumC5934P3 = EnumC5934P3.INFO;
                break;
            case 5:
                enumC5934P3 = EnumC5934P3.VERBOSE;
                break;
            case 6:
                enumC5934P3 = EnumC5934P3.WARN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        setPlogLevel(enumC5934P3);
    }

    private final EnumC6054c5 initializeEnvironmentFromTokenOrCrash(LinkTokenConfiguration linkTokenConfiguration) {
        EnumC6054c5.a aVar = EnumC6054c5.Companion;
        String token = linkTokenConfiguration.getToken();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        InterfaceC5944Q4 interfaceC5944Q4 = null;
        EnumC6054c5 enumC6054c5 = null;
        for (EnumC6054c5 enumC6054c52 : EnumC6054c5.values()) {
            if (StringsKt.contains$default((CharSequence) token, (CharSequence) enumC6054c52.getJson(), false, 2, (Object) null)) {
                enumC6054c5 = enumC6054c52;
            }
        }
        if (enumC6054c5 == null) {
            throw LinkConfigurationMalformedLinkTokenException.INSTANCE;
        }
        InterfaceC5944Q4 interfaceC5944Q42 = component;
        if (interfaceC5944Q42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
        } else {
            interfaceC5944Q4 = interfaceC5944Q42;
        }
        ((C7165o0) interfaceC5944Q4).f3049m.get().m1503a(enumC6054c5);
        return enumC6054c5;
    }

    private final InterfaceC6013Y2 initializeTokenComponent() {
        InterfaceC5944Q4 interfaceC5944Q4 = component;
        if (interfaceC5944Q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC5944Q4 = null;
        }
        C7156n0 c7156n0 = new C7156n0(((C7165o0) interfaceC5944Q4).f3038b, new C6042b3());
        tokenComponent = c7156n0;
        Intrinsics.checkNotNull(c7156n0);
        return c7156n0;
    }

    private final void maybeSendTestCrash() {
        InterfaceC5944Q4 interfaceC5944Q4 = component;
        if (interfaceC5944Q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC5944Q4 = null;
        }
        EnumC6054c5 enumC6054c5M1504b = ((C7165o0) interfaceC5944Q4).f3049m.get().m1504b();
        InterfaceC5944Q4 interfaceC5944Q42 = component;
        if (interfaceC5944Q42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC5944Q42 = null;
        }
        String packageName = ((C7165o0) interfaceC5944Q42).f3037a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        if (shouldSendTestCrash(enumC6054c5M1504b, packageName)) {
            InterfaceC5944Q4 interfaceC5944Q43 = component;
            if (interfaceC5944Q43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                interfaceC5944Q43 = null;
            }
            C5988V4 c5988v4 = ((C7165o0) interfaceC5944Q43).f3050n.get();
            c5988v4.getClass();
            try {
                C5826D6 crashApi = c5988v4.f1767a;
                Intrinsics.checkNotNullParameter(crashApi, "crashApi");
                crashApi.getClass();
                Intrinsics.checkNotNullParameter("Proguard crash test", "message");
                throw new RuntimeException("Proguard crash test");
            } catch (RuntimeException e) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C5979U4(c5988v4, e, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setLinkConfiguration(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Unit> continuation) {
        C72751 c72751;
        AbstractC5894L2 bVar;
        if (continuation instanceof C72751) {
            c72751 = (C72751) continuation;
            int i = c72751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c72751.label = i - Integer.MIN_VALUE;
            } else {
                c72751 = new C72751(continuation);
            }
        }
        Object obj = c72751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c72751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (linkTokenConfiguration.getEmbeddedSessionInfo() != null) {
                bVar = new AbstractC5894L2.a(linkTokenConfiguration.getEmbeddedSessionInfo());
            } else {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                bVar = new AbstractC5894L2.b(string2, linkTokenConfiguration);
            }
            InterfaceC5944Q4 interfaceC5944Q4 = component;
            if (interfaceC5944Q4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                interfaceC5944Q4 = null;
            }
            C7248x1 c7248x1 = ((C7165o0) interfaceC5944Q4).f3042f.get();
            c72751.L$0 = linkTokenConfiguration;
            c72751.label = 1;
            if (c7248x1.mo1350a(bVar, c72751) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        linkTokenConfiguration = (LinkTokenConfiguration) c72751.L$0;
        ResultKt.throwOnFailure(obj);
        InterfaceC5944Q4 interfaceC5944Q42 = component;
        if (interfaceC5944Q42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC5944Q42 = null;
        }
        C5935P4 c5935p4 = ((C7165o0) interfaceC5944Q42).f3044h.get();
        boolean noLoadingState = linkTokenConfiguration.getNoLoadingState();
        c72751.L$0 = null;
        c72751.label = 2;
        if (c5935p4.f1630b != null) {
            c5935p4.f1630b = new C5896L4(noLoadingState);
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C5926O4(c5935p4, noLoadingState, null), c72751);
        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objWithContext = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void setLinkEventListener(final Function1<? super LinkEvent, Unit> linkEventListener2) {
        Intrinsics.checkNotNullParameter(linkEventListener2, "linkEventListener");
        queueableEventListener = new Function2<LinkEvent, AbstractC5849G2, Unit>() { // from class: com.plaid.link.Plaid.setLinkEventListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent, AbstractC5849G2 abstractC5849G2) {
                invoke2(linkEvent, abstractC5849G2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinkEvent event, AbstractC5849G2 options) {
                Intrinsics.checkNotNullParameter(event, "linkEvent");
                Intrinsics.checkNotNullParameter(options, "options");
                InterfaceC5944Q4 interfaceC5944Q4 = Plaid.component;
                if (interfaceC5944Q4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    interfaceC5944Q4 = null;
                }
                C7258y2 c7258y2 = ((C7165o0) interfaceC5944Q4).f3046j.get();
                if (options instanceof AbstractC5849G2.a) {
                    c7258y2.m1666a(event, ((AbstractC5849G2.a) options).f1348a);
                    return;
                }
                if (Intrinsics.areEqual(options, AbstractC5849G2.b.f1349a)) {
                    c7258y2.m1665a(event);
                    return;
                }
                if (!Intrinsics.areEqual(options, AbstractC5849G2.c.f1350a)) {
                    c7258y2.m1666a(event, 0);
                    return;
                }
                c7258y2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                c7258y2.m1665a(event);
                c7258y2.m1668b(null);
            }
        };
        linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid.setLinkEventListener.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkEvent linkEvent) {
                invoke2(linkEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LinkEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                InterfaceC5944Q4 interfaceC5944Q4 = Plaid.component;
                if (interfaceC5944Q4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    interfaceC5944Q4 = null;
                }
                ((C7165o0) interfaceC5944Q4).f3050n.get().m1331a(new C6005X3(event.getMetadata().toMap(), event.getEventName().getJson()));
                linkEventListener2.invoke(event);
            }
        };
    }

    private final void setPlogLevel(EnumC5934P3 logLevel) {
        C5953R5.a aVar = C5953R5.f1671a;
        C72781 c72781 = new Function3<Integer, String, String, Unit>() { // from class: com.plaid.link.Plaid.setPlogLevel.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, String str2) {
                invoke(num.intValue(), str, str2);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, String str, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                InterfaceC5944Q4 interfaceC5944Q4 = Plaid.component;
                if (interfaceC5944Q4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    interfaceC5944Q4 = null;
                }
                C5988V4 c5988v4 = ((C7165o0) interfaceC5944Q4).f3050n.get();
                if (str == null) {
                    str = "";
                }
                c5988v4.m1331a(new C7266z1(message, MapsKt.mapOf(Tuples4.m3642to("tag", str)), i));
            }
        };
        aVar.getClass();
        Intrinsics.checkNotNullParameter(logLevel, "priority");
        C5953R5.f1672b = new C5921O(logLevel, c72781);
    }

    private final boolean shouldSendTestCrash(EnumC6054c5 plaidEnvironment, String packageName) {
        return plaidEnvironment == EnumC6054c5.SANDBOX && StringsKt.startsWith$default(packageName, "com.plaid.", false, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitPreload$link_sdk_release(Continuation<? super Unit> continuation) {
        Plaid$awaitPreload$1 plaid$awaitPreload$1;
        if (continuation instanceof Plaid$awaitPreload$1) {
            plaid$awaitPreload$1 = (Plaid$awaitPreload$1) continuation;
            int i = plaid$awaitPreload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                plaid$awaitPreload$1.label = i - Integer.MIN_VALUE;
            } else {
                plaid$awaitPreload$1 = new Plaid$awaitPreload$1(this, continuation);
            }
        }
        Object obj = plaid$awaitPreload$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = plaid$awaitPreload$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Job job = preloadLinkJob;
            if (job != null && !job.isCompleted()) {
                plaid$awaitPreload$1.L$0 = this;
                plaid$awaitPreload$1.label = 1;
                if (job.join(plaid$awaitPreload$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        preloadLinkJob = null;
        return Unit.INSTANCE;
    }

    public final void createWithoutPreload$link_sdk_release(Application application, LinkTokenConfiguration linkTokenConfiguration) throws InterruptedException, LinkException {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(linkTokenConfiguration, "linkTokenConfiguration");
        initializeAndCheckPrerequisites(application, linkTokenConfiguration);
        initializeTokenComponent();
        BuildersKt__BuildersKt.runBlocking$default(null, new Plaid$createWithoutPreload$1(linkTokenConfiguration, null), 1, null);
        maybeSendTestCrash();
    }

    public final void destroy() {
        if (isCreated.get()) {
            InterfaceC5944Q4 interfaceC5944Q4 = component;
            if (interfaceC5944Q4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                interfaceC5944Q4 = null;
            }
            ((C7165o0) interfaceC5944Q4).f3051o.get().m1209a();
            tokenComponent = null;
        }
    }

    public final Function1<LinkEvent, Unit> getCustomerFacingLinkEventListenerInternal$link_sdk_release() {
        return linkEventListener;
    }

    public final Function2<LinkEvent, AbstractC5849G2, Unit> getLinkEventListenerInternal$link_sdk_release() {
        return queueableEventListener;
    }

    public final AtomicBoolean isCreated$link_sdk_release() {
        return isCreated;
    }

    public final boolean openLinkInternal$link_sdk_release(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = LinkActivity.f2928e;
        Intrinsics.checkNotNullParameter(activity, "context");
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(activity, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        activity.startActivityForResult(intent, 3364);
        return true;
    }

    public final void preloadLink$link_sdk_release() {
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("Preload is called", true);
        Job job = preloadLinkJob;
        if (job != null && job.isActive()) {
            C5953R5.a.m1303a("Requesting cancel on previous preload job", true);
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        preloadLinkJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getIO(), null, new Plaid$preloadLink$2(null), 2, null);
    }

    public final InterfaceC6013Y2 provideLinkTokenComponent$link_sdk_release(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        initialize(application);
        return getOrCreateTokenComponent();
    }

    public final void setCreated$link_sdk_release(AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        isCreated = atomicBoolean;
    }

    public final void setLinkResultAndFinish$link_sdk_release(Activity activity, int resultCode, Parcelable data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        drainLinkEventQueue();
        Intent intent = new Intent();
        intent.putExtra("link_result", data);
        activity.setResult(resultCode, intent);
        activity.finish();
        destroy();
    }

    public final void submitInternal$link_sdk_release(SubmissionData submissionData) {
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getMain(), null, new Plaid$submitInternal$1(submissionData, null), 2, null);
    }

    public final void trackSdkOpen$link_sdk_release() {
        InterfaceC6013Y2 interfaceC6013Y2 = tokenComponent;
        C7195r3 c7195r3 = interfaceC6013Y2 != null ? ((C7156n0) interfaceC6013Y2).f2995d.get() : null;
        if (c7195r3 == null) {
            C5953R5.a.m1304b(C5953R5.f1671a, "Cannot log open event LinkWorkflowAnalytics is null");
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getIO(), null, new Plaid$trackSdkOpen$1(c7195r3, null), 2, null);
        }
    }

    public final boolean openLinkInternal$link_sdk_release(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        int i = LinkActivity.f2928e;
        Context context = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        fragment.startActivityForResult(intent, 3364);
        return true;
    }

    @JvmStatic
    public static final View createLinkEmbeddedView(Context context, LinkTokenConfiguration config, Function1<? super LinkTokenConfiguration, Unit> successCallback, Function1<? super LinkExit, Unit> failureCallback) throws LinkException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        Plaid plaid = INSTANCE;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        C5931P0 c5931p0 = new C5931P0(context, config, null, successCallback, failureCallback);
        c5931p0.m1289a();
        return c5931p0.f1611f;
    }
}
