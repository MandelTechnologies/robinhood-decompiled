package com.robinhood.shared.navigation.provisions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.Constants;
import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.navigation.C22231R;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Intents2;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.ResolverNotFoundHandler;
import com.robinhood.android.navigation.Tabbed;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.performancelogger.PerformanceMetricTrigger;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.SLRemoteConfiguration;
import dagger.Lazy;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import timber.log.Timber;

/* compiled from: SharedNavigator.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 j2\u00020\u0001:\u0001jBG\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016JR\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016JR\u0010!\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J|\u0010(\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016Jj\u00101\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016Jt\u00105\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J5\u00107\u001a\u00020\u001e\"\f\b\u0000\u00108*\u000209*\u00020:2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H82\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010;J*\u0010<\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J(\u0010=\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010?H\u0002J\u001a\u0010@\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020)2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010A\u001a\u00020B2\u0006\u0010\u0016\u001a\u0002092\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J)\u0010C\u001a\u0004\u0018\u0001HD\"\b\b\u0000\u0010D*\u00020\u00072\u000e\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020G0FH\u0016¢\u0006\u0002\u0010HJ \u0010I\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020)2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010JH\u0016J=\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0L2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010M\u001a\u00020N2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001bH\u0016¢\u0006\u0002\u0010RJD\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001e0L2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010M\u001a\u00020N2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010UJC\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001e0L2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001e0L2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010M\u001a\u00020N2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010O\u001a\u00020PH\u0002¢\u0006\u0002\u0010XJ!\u0010Y\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u001e0L2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010ZJC\u0010[\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010\\J:\u0010]\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020NH\u0016J8\u0010a\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010b\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00130\u001dH\u0002JI\u0010d\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001e0L2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0018\u0010e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0L\u0012\u0004\u0012\u00020\u00130\u001dH\u0002¢\u0006\u0002\u0010fJ\u0016\u0010g\u001a\u00020\u0013*\u00020#2\b\u0010h\u001a\u0004\u0018\u00010 H\u0002J\f\u0010i\u001a\u00020\u001b*\u00020\u001eH\u0002R&\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006k"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/SharedNavigator;", "Lcom/robinhood/android/navigation/Navigator;", "navigationResolverSuppliers", "Ldagger/Lazy;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "resolverNotFoundHandler", "Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "deepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "eventLogger", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "<init>", "(Ldagger/Lazy;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/android/navigation/ResolverNotFoundHandler;Lcom/robinhood/android/navigation/DeepLinkResolver;Lcom/robinhood/analytics/DeeplinkEventLogger;)V", "startActivity", "", "context", "Landroid/content/Context;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "performanceMetricSource", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "shouldClearTop", "", "onIntentCreated", "Lkotlin/Function1;", "Landroid/content/Intent;", "navigationTypeOverride", "Lcom/robinhood/android/navigation/NavigationType;", "startActivityForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "fragment", "Landroidx/fragment/app/Fragment;", "showFragment", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "addToBackstack", "showInTab", "allowLandscape", "defaultTabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "useDesignSystemActivity", "allowNavigationToTabbedActivity", "showFragmentInStandaloneRdsActivity", "useCloseIcon", "allowMainBanner", "requiresAuthentication", "createIntentForFragment", "clearInTabBackstack", "createIntentForDialogFragment", "K", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "(Landroid/content/Context;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;)Landroid/content/Intent;", "createIntent", "createIntentInternal", "resolver", "Lcom/robinhood/android/navigation/IntentResolver;", "createFragment", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "ResolverT", "keyType", "Ljava/lang/Class;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "(Ljava/lang/Class;)Lcom/robinhood/android/navigation/NavigationResolver;", "createFragmentInternal", "Lcom/robinhood/android/navigation/FragmentResolver;", "resolveDeepLink", "", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;Z)[Landroid/content/Intent;", "resolveDeepLinkDirect", "navigationTypeTransitionEnabled", "(Landroid/content/Context;Landroid/net/Uri;ZLcom/robinhood/android/navigation/DeepLinkOrigin;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDeepLinkIntents", "intents", "([Landroid/content/Intent;Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;)[Landroid/content/Intent;", "applyClearTopFlags", "([Landroid/content/Intent;Ljava/lang/Boolean;)V", "handleDeepLink", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;ZLcom/robinhood/android/navigation/NavigationType;)Z", "handleDeepLinkDirect", "(Landroid/content/Context;Landroid/net/Uri;ZZLcom/robinhood/android/navigation/NavigationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeepLinkSupported", "uri", "processIntentWithNavigationType", "intent", "launchIntent", "processIntentsWithNavigationType", "launchIntents", "(Landroid/app/Activity;[Landroid/content/Intent;Lcom/robinhood/android/navigation/NavigationType;Lkotlin/jvm/functions/Function1;)V", "overrideActivityTransition", "navigationType", "isExternalTarget", "Companion", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SharedNavigator implements Navigator {
    private final DeepLinkResolver deepLinkResolver;
    private final DeeplinkEventLogger eventLogger;
    private final Lazy<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers;
    private final PerformanceLogger performanceLogger;
    private final ResolverNotFoundHandler resolverNotFoundHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SharedNavigator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationType.values().length];
            try {
                iArr[NavigationType.PRESENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationType.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationType.NO_TRANSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SharedNavigator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.navigation.provisions.SharedNavigator", m3645f = "SharedNavigator.kt", m3646l = {511}, m3647m = "handleDeepLinkDirect")
    /* renamed from: com.robinhood.shared.navigation.provisions.SharedNavigator$handleDeepLinkDirect$1 */
    /* loaded from: classes6.dex */
    static final class C392261 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C392261(Continuation<? super C392261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedNavigator.this.handleDeepLinkDirect(null, null, false, false, null, this);
        }
    }

    /* compiled from: SharedNavigator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.navigation.provisions.SharedNavigator", m3645f = "SharedNavigator.kt", m3646l = {414, 414}, m3647m = "resolveDeepLinkDirect")
    /* renamed from: com.robinhood.shared.navigation.provisions.SharedNavigator$resolveDeepLinkDirect$1 */
    /* loaded from: classes6.dex */
    static final class C392271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C392271(Continuation<? super C392271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedNavigator.this.resolveDeepLinkDirect(null, null, false, null, false, false, this);
        }
    }

    public SharedNavigator(Lazy<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers, PerformanceLogger performanceLogger, ResolverNotFoundHandler resolverNotFoundHandler, DeepLinkResolver deepLinkResolver, DeeplinkEventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(navigationResolverSuppliers, "navigationResolverSuppliers");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(resolverNotFoundHandler, "resolverNotFoundHandler");
        Intrinsics.checkNotNullParameter(deepLinkResolver, "deepLinkResolver");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.navigationResolverSuppliers = navigationResolverSuppliers;
        this.performanceLogger = performanceLogger;
        this.resolverNotFoundHandler = resolverNotFoundHandler;
        this.deepLinkResolver = deepLinkResolver;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public void startActivity(final Context context, IntentKey key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, final Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        processIntentWithNavigationType(BaseContexts.findActivityBaseContext(context), createIntent(context, key, performanceMetricSource, shouldClearTop), navigationTypeOverride, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SharedNavigator.startActivity$lambda$0(onIntentCreated, context, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startActivity$lambda$0(Function1 function1, Context context, Intent processedIntent) {
        Intrinsics.checkNotNullParameter(processedIntent, "processedIntent");
        if (function1 != null) {
            function1.invoke(processedIntent);
        }
        context.startActivity(processedIntent);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public void startActivityForResult(final Activity activity, IntentKey key, final int requestCode, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, final Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        processIntentWithNavigationType(activity, createIntent(activity, key, performanceMetricSource, shouldClearTop), navigationTypeOverride, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SharedNavigator.startActivityForResult$lambda$1(onIntentCreated, activity, requestCode, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startActivityForResult$lambda$1(Function1 function1, Activity activity, int i, Intent processedIntent) {
        Intrinsics.checkNotNullParameter(processedIntent, "processedIntent");
        if (function1 != null) {
            function1.invoke(processedIntent);
        }
        activity.startActivityForResult(processedIntent, i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public void startActivityForResult(final Fragment fragment, IntentKey key, final int requestCode, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, final Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(key, "key");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        processIntentWithNavigationType(fragment.getActivity(), createIntent(contextRequireContext, key, performanceMetricSource, shouldClearTop), navigationTypeOverride, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SharedNavigator.startActivityForResult$lambda$2(onIntentCreated, fragment, requestCode, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startActivityForResult$lambda$2(Function1 function1, Fragment fragment, int i, Intent processedIntent) {
        Intrinsics.checkNotNullParameter(processedIntent, "processedIntent");
        if (function1 != null) {
            function1.invoke(processedIntent);
        }
        fragment.startActivityForResult(processedIntent, i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public void showFragment(final Context context, FragmentKey key, boolean addToBackstack, boolean showInTab, boolean allowLandscape, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, FragmentTab defaultTabOverride, boolean useDesignSystemActivity, boolean allowNavigationToTabbedActivity, final Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        processIntentWithNavigationType(BaseContexts.findActivityBaseContext(context), Navigator.DefaultImpls.createIntentForFragment$default(this, context, key, addToBackstack, (allowNavigationToTabbedActivity || (BaseContexts.findActivityBaseContext(context) instanceof Tabbed)) ? showInTab : false, false, defaultTabOverride, allowLandscape, useDesignSystemActivity, false, false, false, null, shouldClearTop, 1808, null), navigationTypeOverride, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SharedNavigator.showFragment$lambda$3(onIntentCreated, context, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFragment$lambda$3(Function1 function1, Context context, Intent processedIntent) {
        Intrinsics.checkNotNullParameter(processedIntent, "processedIntent");
        if (function1 != null) {
            function1.invoke(processedIntent);
        }
        context.startActivity(processedIntent);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public void showFragmentInStandaloneRdsActivity(final Context context, FragmentKey key, boolean allowLandscape, boolean useCloseIcon, boolean allowMainBanner, boolean requiresAuthentication, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, final Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        processIntentWithNavigationType(BaseContexts.findActivityBaseContext(context), Navigator.DefaultImpls.createIntentForFragment$default(this, context, key, false, false, false, null, allowLandscape, true, useCloseIcon, allowMainBanner, requiresAuthentication, null, shouldClearTop, 52, null), navigationTypeOverride, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SharedNavigator.showFragmentInStandaloneRdsActivity$lambda$4(onIntentCreated, context, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFragmentInStandaloneRdsActivity$lambda$4(Function1 function1, Context context, Intent processedIntent) {
        Intrinsics.checkNotNullParameter(processedIntent, "processedIntent");
        if (function1 != null) {
            function1.invoke(processedIntent);
        }
        context.startActivity(processedIntent);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public Intent createIntentForFragment(Context context, FragmentKey key, boolean addToBackstack, boolean showInTab, boolean clearInTabBackstack, FragmentTab defaultTabOverride, boolean allowLandscape, boolean useDesignSystemActivity, boolean useCloseIcon, boolean allowMainBanner, boolean requiresAuthentication, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop) {
        IntentKey showFragmentInStandaloneActivity;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        if (showInTab) {
            showFragmentInStandaloneActivity = new HostIntentKey.ShowFragmentInTab(key, addToBackstack, clearInTabBackstack, defaultTabOverride);
        } else {
            if (useDesignSystemActivity) {
                HostIntentKey.ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity = new HostIntentKey.ShowFragmentInStandaloneRdsActivity(key, allowLandscape, requiresAuthentication, useCloseIcon, allowMainBanner, false, false, 96, null);
                z = shouldClearTop;
                showFragmentInStandaloneActivity = showFragmentInStandaloneRdsActivity;
                return createIntent(context, showFragmentInStandaloneActivity, null, z);
            }
            showFragmentInStandaloneActivity = new HostIntentKey.ShowFragmentInStandaloneActivity(key, false, 2, null);
        }
        z = shouldClearTop;
        return createIntent(context, showFragmentInStandaloneActivity, null, z);
    }

    @Override // com.robinhood.android.navigation.Navigator
    public <K extends DialogFragmentKey & Parcelable> Intent createIntentForDialogFragment(Context context, K key, PerformanceMetricEventData.Source performanceMetricSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        return Navigator.DefaultImpls.createIntent$default(this, context, new HostIntentKey.DialogFragmentHost(key), null, false, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.navigation.Navigator
    public Intent createIntent(Context context, IntentKey key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        Intent intentCreateIntentInternal = createIntentInternal(context, key, (IntentResolver) resolve(key.getClass()));
        if (shouldClearTop) {
            intentCreateIntentInternal.addFlags(67108864);
        }
        return intentCreateIntentInternal;
    }

    private final Intent createIntentInternal(Context context, IntentKey key, IntentResolver<? super IntentKey> resolver) {
        Intent intentIntentResolverNotFound;
        if (resolver == null || (intentIntentResolverNotFound = resolver.getIntent(context, key)) == null) {
            intentIntentResolverNotFound = this.resolverNotFoundHandler.intentResolverNotFound(context, key);
        }
        if (key.getNavigationType() != null) {
            Intents2.putNavigationType(intentIntentResolverNotFound, key.getNavigationType());
        }
        return intentIntentResolverNotFound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.navigation.Navigator
    public Fragment createFragment(FragmentKey key, PerformanceMetricEventData.Source performanceMetricSource) {
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        return createFragmentInternal(key, (FragmentResolver) resolve(key.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.navigation.Navigator
    public DialogFragment createDialogFragment(DialogFragmentKey key, PerformanceMetricEventData.Source performanceMetricSource) {
        DialogFragment dialogFragmentCreateDialogFragment;
        Intrinsics.checkNotNullParameter(key, "key");
        if ((key instanceof PerformanceMetricTrigger) && performanceMetricSource != null) {
            this.performanceLogger.triggerMetric((PerformanceMetricTrigger) key, performanceMetricSource);
        }
        DialogFragmentResolver dialogFragmentResolver = (DialogFragmentResolver) resolve(key.getClass());
        return (dialogFragmentResolver == null || (dialogFragmentCreateDialogFragment = dialogFragmentResolver.createDialogFragment(key)) == null) ? this.resolverNotFoundHandler.dialogFragmentResolverNotFound(key) : dialogFragmentCreateDialogFragment;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public <ResolverT extends NavigationResolver> ResolverT resolve(Class<? extends NavigationKey> keyType) {
        Intrinsics.checkNotNullParameter(keyType, "keyType");
        Function0<NavigationResolver> function0 = this.navigationResolverSuppliers.get().get(keyType.getName());
        if (function0 != null) {
            return (ResolverT) function0.invoke();
        }
        return null;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public Fragment createFragmentInternal(FragmentKey key, FragmentResolver<? super FragmentKey> resolver) {
        Fragment fragmentCreateFragment;
        Intrinsics.checkNotNullParameter(key, "key");
        return (resolver == null || (fragmentCreateFragment = resolver.createFragment(key)) == null) ? this.resolverNotFoundHandler.fragmentResolverNotFound(key) : fragmentCreateFragment;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public Intent[] resolveDeepLink(Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity) {
        Intent[] intentArrInvoke;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        CrashReporter.INSTANCE.log("Navigating to " + data + " from " + deepLinkOrigin);
        Uri uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease = INSTANCE.tryToConvertHttpUrls$lib_navigation_provisions_externalRelease(data);
        DeepLink deepLinkResolve = this.deepLinkResolver.resolve(uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease, deepLinkOrigin, requiresBackingActivity);
        if (deepLinkResolve != null && deepLinkResolve.isLongRunning()) {
            ScarletManager scarletManagerScarletManagerOrNull = ScarletManager2.scarletManagerOrNull(context);
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(this, context, new DeepLinkIntentKey.DeepLinkResolver(uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease, shouldClearTop, scarletManagerScarletManagerOrNull != null ? ScarletComposeInterop.themesForCompose(scarletManagerScarletManagerOrNull) : null), null, false, 12, null);
            intentCreateIntent$default.putExtra(DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, deepLinkOrigin);
            Unit unit = Unit.INSTANCE;
            Intent[] intentArr = {intentCreateIntent$default};
            applyClearTopFlags(intentArr, shouldClearTop);
            return intentArr;
        }
        if (deepLinkResolve != null) {
            intentArrInvoke = deepLinkResolve.getGetIntents().invoke(context, uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease);
        } else {
            intentArrInvoke = new Intent[0];
        }
        return processDeepLinkIntents(intentArrInvoke, context, uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease, shouldClearTop, deepLinkOrigin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r3 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.robinhood.android.navigation.Navigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolveDeepLinkDirect(Context context, Uri uri, boolean z, DeepLinkOrigin deepLinkOrigin, boolean z2, boolean z3, Continuation<? super Intent[]> continuation) {
        C392271 c392271;
        Uri uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease;
        boolean z4;
        boolean z5;
        Intent[] intentArrInvoke;
        Context context2;
        DeepLinkResolver deepLinkResolver;
        boolean z6;
        Context context3;
        DeepLinkOrigin deepLinkOrigin2 = deepLinkOrigin;
        if (continuation instanceof C392271) {
            c392271 = (C392271) continuation;
            int i = c392271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c392271.label = i - Integer.MIN_VALUE;
            } else {
                c392271 = new C392271(continuation);
            }
        }
        Object objRerouteExperiment = c392271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c392271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRerouteExperiment);
            CrashReporter.INSTANCE.log("Navigating to " + uri + " from " + deepLinkOrigin2);
            uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease = INSTANCE.tryToConvertHttpUrls$lib_navigation_provisions_externalRelease(uri);
            DeepLink deepLinkResolve = this.deepLinkResolver.resolve(uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease, deepLinkOrigin2, z2);
            if (deepLinkResolve == null) {
                intentArrInvoke = new Intent[0];
                context2 = context;
                z4 = z;
                z5 = z3;
            } else {
                if (deepLinkResolve.isLongRunning()) {
                    deepLinkResolver = this.deepLinkResolver;
                    c392271.L$0 = context;
                    c392271.L$1 = deepLinkOrigin2;
                    c392271.L$2 = uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease;
                    c392271.L$3 = deepLinkResolver;
                    z4 = z;
                    c392271.Z$0 = z4;
                    c392271.Z$1 = z3;
                    c392271.label = 1;
                    objRerouteExperiment = deepLinkResolver.rerouteExperiment(deepLinkResolve, c392271);
                    if (objRerouteExperiment != coroutine_suspended) {
                        z6 = z3;
                        context3 = context;
                    }
                    return coroutine_suspended;
                }
                z4 = z;
                z5 = z3;
                intentArrInvoke = deepLinkResolve.getGetIntents().invoke(context, uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease);
                context2 = context;
            }
            if (z5) {
            }
            return processDeepLinkIntents(intentArrInvoke, context2, uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease, boxing.boxBoolean(z4), deepLinkOrigin2);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = c392271.Z$1;
            boolean z7 = c392271.Z$0;
            Uri uri2 = (Uri) c392271.L$2;
            DeepLinkOrigin deepLinkOrigin3 = (DeepLinkOrigin) c392271.L$1;
            Context context4 = (Context) c392271.L$0;
            ResultKt.throwOnFailure(objRerouteExperiment);
            z4 = z7;
            uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease = uri2;
            context3 = context4;
            deepLinkOrigin2 = deepLinkOrigin3;
            intentArrInvoke = ((DeepLink) objRerouteExperiment).getGetIntents().invoke(context3, uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease);
            Context context5 = context3;
            z5 = z6;
            context2 = context5;
            if (z5) {
                for (Intent intent : intentArrInvoke) {
                    Intents2.putNavigationTypeTransitionEnabled(intent, true);
                }
            }
            return processDeepLinkIntents(intentArrInvoke, context2, uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease, boxing.boxBoolean(z4), deepLinkOrigin2);
        }
        z6 = c392271.Z$1;
        boolean z8 = c392271.Z$0;
        DeepLinkResolver deepLinkResolver2 = (DeepLinkResolver) c392271.L$3;
        Uri uri3 = (Uri) c392271.L$2;
        DeepLinkOrigin deepLinkOrigin4 = (DeepLinkOrigin) c392271.L$1;
        context3 = (Context) c392271.L$0;
        ResultKt.throwOnFailure(objRerouteExperiment);
        z4 = z8;
        uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease = uri3;
        deepLinkResolver = deepLinkResolver2;
        deepLinkOrigin2 = deepLinkOrigin4;
        c392271.L$0 = context3;
        c392271.L$1 = deepLinkOrigin2;
        c392271.L$2 = uriTryToConvertHttpUrls$lib_navigation_provisions_externalRelease;
        c392271.L$3 = null;
        c392271.Z$0 = z4;
        c392271.Z$1 = z6;
        c392271.label = 2;
        objRerouteExperiment = deepLinkResolver.rerouteRegionGate((DeepLink) objRerouteExperiment, c392271);
    }

    private final Intent[] processDeepLinkIntents(Intent[] intents, Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin) {
        if (intents.length == 0) {
            Timber.INSTANCE.mo3350d("Unrecognized deeplink: " + data, new Object[0]);
            intents = new Intent[]{Navigator.DefaultImpls.createIntent$default(this, context, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
        }
        Intent intent = (Intent) ArraysKt.last(intents);
        String action = intent.getAction();
        if (action == null || StringsKt.isBlank(action)) {
            intent.putExtra(DeepLink.INTENT_ARG_DEEP_LINK, data);
            intent.putExtra(DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, deepLinkOrigin);
            intent.putExtra(DeepLink.INTENT_ARG_DEEP_LINK_NONCE, UUID.randomUUID().toString());
        }
        applyClearTopFlags(intents, shouldClearTop);
        return intents;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public void applyClearTopFlags(Intent[] intentArr, Boolean bool) {
        Intrinsics.checkNotNullParameter(intentArr, "<this>");
        Intent intent = (Intent) ArraysKt.firstOrNull(intentArr);
        if (intent != null) {
            intent.addFlags(Intrinsics.areEqual(bool, Boolean.FALSE) ? 268435456 : 335544320);
        }
    }

    @Override // com.robinhood.android.navigation.Navigator
    public boolean handleDeepLink(final Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity, NavigationType navigationTypeOverride) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        if (data == null) {
            return false;
        }
        processIntentsWithNavigationType(BaseContexts.findActivityBaseContext(context), resolveDeepLink(context, data, shouldClearTop, deepLinkOrigin, requiresBackingActivity), navigationTypeOverride, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SharedNavigator.handleDeepLink$lambda$10(context, (Intent[]) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$10(Context context, Intent[] processedIntents) {
        Intrinsics.checkNotNullParameter(processedIntents, "processedIntents");
        context.startActivities(processedIntents);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.robinhood.android.navigation.Navigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleDeepLinkDirect(Context context, Uri uri, boolean z, boolean z2, NavigationType navigationType, Continuation<? super Boolean> continuation) {
        C392261 c392261;
        NavigationType navigationType2;
        Object objResolveDeepLinkDirect$default;
        final Context context2;
        Uri uri2;
        long j;
        if (continuation instanceof C392261) {
            c392261 = (C392261) continuation;
            int i = c392261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c392261.label = i - Integer.MIN_VALUE;
            } else {
                c392261 = new C392261(continuation);
            }
        }
        C392261 c3922612 = c392261;
        Object obj = c3922612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3922612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (uri != null) {
                long jM28773markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m28773markNowz9LOYto();
                DeepLinkOrigin.Internal internal = DeepLinkOrigin.Internal.INSTANCE;
                c3922612.L$0 = context;
                c3922612.L$1 = uri;
                navigationType2 = navigationType;
                c3922612.L$2 = navigationType2;
                c3922612.J$0 = jM28773markNowz9LOYto;
                c3922612.label = 1;
                objResolveDeepLinkDirect$default = Navigator.DefaultImpls.resolveDeepLinkDirect$default(this, context, uri, z, internal, z2, false, c3922612, 32, null);
                if (objResolveDeepLinkDirect$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context2 = context;
                uri2 = uri;
                j = jM28773markNowz9LOYto;
            } else {
                return boxing.boxBoolean(false);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c3922612.J$0;
            NavigationType navigationType3 = (NavigationType) c3922612.L$2;
            uri2 = (Uri) c3922612.L$1;
            context2 = (Context) c3922612.L$0;
            ResultKt.throwOnFailure(obj);
            navigationType2 = navigationType3;
            objResolveDeepLinkDirect$default = obj;
        }
        TimedValue timedValue = new TimedValue((Intent[]) objResolveDeepLinkDirect$default, TimeSource.Monotonic.ValueTimeMark.m28775elapsedNowUwyO8pc(j), null);
        processIntentsWithNavigationType(BaseContexts.findActivityBaseContext(context2), (Intent[]) timedValue.getValue(), navigationType2, new Function1() { // from class: com.robinhood.shared.navigation.provisions.SharedNavigator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SharedNavigator.handleDeepLinkDirect$lambda$12(context2, (Intent[]) obj2);
            }
        });
        this.eventLogger.logDeeplinkResolutionMetric(uri2, Duration.m28738getInWholeMillisecondsimpl(timedValue.getDuration()));
        return boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLinkDirect$lambda$12(Context context, Intent[] processedIntents) {
        Intrinsics.checkNotNullParameter(processedIntents, "processedIntents");
        context.startActivities(processedIntents);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.navigation.Navigator
    public boolean isDeepLinkSupported(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.deepLinkResolver.isSupported(INSTANCE.tryToConvertHttpUrls$lib_navigation_provisions_externalRelease(uri));
    }

    private final void processIntentWithNavigationType(Activity activity, Intent intent, NavigationType navigationTypeOverride, Function1<? super Intent, Unit> launchIntent) {
        if (navigationTypeOverride != null) {
            Intents2.putNavigationType(intent, navigationTypeOverride);
        } else {
            navigationTypeOverride = Intents2.getNavigationType(intent);
        }
        if (isExternalTarget(intent)) {
            Intents2.removeNavigationType(intent);
        } else {
            Intents2.putNavigationTypeTransitionEnabled(intent, true);
        }
        launchIntent.invoke(intent);
        if (navigationTypeOverride == null || activity == null) {
            return;
        }
        overrideActivityTransition(activity, navigationTypeOverride);
    }

    private final void processIntentsWithNavigationType(Activity activity, Intent[] intents, NavigationType navigationTypeOverride, Function1<? super Intent[], Unit> launchIntents) {
        Intent intent = (Intent) ArraysKt.last(intents);
        if (navigationTypeOverride != null) {
            Intents2.putNavigationType(intent, navigationTypeOverride);
        } else {
            navigationTypeOverride = Intents2.getNavigationType(intent);
        }
        int i = 0;
        if (isExternalTarget(intent)) {
            int length = intents.length;
            while (i < length) {
                Intents2.removeNavigationType(intents[i]);
                i++;
            }
        } else {
            int length2 = intents.length;
            while (i < length2) {
                Intents2.putNavigationTypeTransitionEnabled(intents[i], true);
                i++;
            }
        }
        launchIntents.invoke(intents);
        if (navigationTypeOverride == null || activity == null) {
            return;
        }
        overrideActivityTransition(activity, navigationTypeOverride);
    }

    private final void overrideActivityTransition(Activity activity, NavigationType navigationType) {
        int i = navigationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[navigationType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                activity.overridePendingTransition(C22231R.anim.activity_slide_up_bottom, C22231R.anim.nothing);
            } else if (i == 2) {
                activity.overridePendingTransition(C22231R.anim.screen_slide_in_right, C22231R.anim.screen_slide_out_left);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    private final boolean isExternalTarget(Intent intent) {
        return intent.getAction() != null;
    }

    /* compiled from: SharedNavigator.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/SharedNavigator$Companion;", "", "<init>", "()V", "tryToConvertHttpUrls", "Landroid/net/Uri;", "uri", "tryToConvertHttpUrls$lib_navigation_provisions_externalRelease", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Uri tryToConvertHttpUrls$lib_navigation_provisions_externalRelease(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String scheme = uri.getScheme();
            if (scheme == null) {
                return uri;
            }
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null || !StringsKt.startsWith$default(lowerCase, "http", false, 2, (Object) null)) {
                return uri;
            }
            String authority = uri.getAuthority();
            if (authority != null && StringsKt.contains$default((CharSequence) authority, (CharSequence) "applink", false, 2, (Object) null)) {
                return uri;
            }
            String path = uri.getPath();
            if (path != null && StringsKt.contains$default((CharSequence) path, (CharSequence) "applink", false, 2, (Object) null)) {
                return uri;
            }
            Uri uriBuild = new Uri.Builder().scheme(Constants.SCHEME).authority(DeepLinkPath.URL_BASE).path("applink/web").appendQueryParameter("url", uri.toString()).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
            return uriBuild;
        }
    }
}
