package com.robinhood.android.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Navigator.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u0000 M2\u00020\u0001:\u0001MJR\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&JZ\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&JZ\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0090\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&Jz\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u008a\u0001\u0010%\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&J7\u0010'\u001a\u00020\u000e\"\f\b\u0000\u0010(*\u00020)*\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H(2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010+J.\u0010,\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u001c\u0010-\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00192\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001c\u0010.\u001a\u00020/2\u0006\u0010\u0006\u001a\u00020)2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J)\u00100\u001a\u0004\u0018\u0001H1\"\b\b\u0000\u00101*\u0002022\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020504H&¢\u0006\u0002\u00106J \u00107\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00192\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u000109H&JA\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0;2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010<\u001a\u00020=2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u000bH&¢\u0006\u0002\u0010AJJ\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0;2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010<\u001a\u00020=2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010DJ!\u0010E\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u000e0;2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010FJK\u0010G\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0002\u0010HJ@\u0010I\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0002\u0010JJ\u0010\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020=H&¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/navigation/Navigator;", "", "startActivity", "", "context", "Landroid/content/Context;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "performanceMetricSource", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "shouldClearTop", "", "onIntentCreated", "Lkotlin/Function1;", "Landroid/content/Intent;", "navigationTypeOverride", "Lcom/robinhood/android/navigation/NavigationType;", "startActivityForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "fragment", "Landroidx/fragment/app/Fragment;", "showFragment", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "addToBackstack", "showInTab", "allowLandscape", "defaultTabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "useDesignSystemActivity", "allowNavigationToTabbedActivity", "showFragmentInStandaloneRdsActivity", "useCloseIcon", "allowMainBanner", "requiresAuthentication", "createIntentForFragment", "clearInTabBackstack", "createIntentForDialogFragment", "K", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "(Landroid/content/Context;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;)Landroid/content/Intent;", "createIntent", "createFragment", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "ResolverT", "Lcom/robinhood/android/navigation/NavigationResolver;", "keyType", "Ljava/lang/Class;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "(Ljava/lang/Class;)Lcom/robinhood/android/navigation/NavigationResolver;", "createFragmentInternal", "resolver", "Lcom/robinhood/android/navigation/FragmentResolver;", "resolveDeepLink", "", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;Z)[Landroid/content/Intent;", "resolveDeepLinkDirect", "navigationTypeTransitionEnabled", "(Landroid/content/Context;Landroid/net/Uri;ZLcom/robinhood/android/navigation/DeepLinkOrigin;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyClearTopFlags", "([Landroid/content/Intent;Ljava/lang/Boolean;)V", "handleDeepLink", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;ZLcom/robinhood/android/navigation/NavigationType;)Z", "handleDeepLinkDirect", "(Landroid/content/Context;Landroid/net/Uri;ZZLcom/robinhood/android/navigation/NavigationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeepLinkSupported", "uri", "Stub", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Navigator {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void applyClearTopFlags(Intent[] intentArr, Boolean bool);

    DialogFragment createDialogFragment(DialogFragmentKey key, PerformanceMetricEventData.Source performanceMetricSource);

    Fragment createFragment(FragmentKey key, PerformanceMetricEventData.Source performanceMetricSource);

    Fragment createFragmentInternal(FragmentKey key, FragmentResolver<? super FragmentKey> resolver);

    Intent createIntent(Context context, IntentKey key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop);

    <K extends DialogFragmentKey & Parcelable> Intent createIntentForDialogFragment(Context context, K key, PerformanceMetricEventData.Source performanceMetricSource);

    Intent createIntentForFragment(Context context, FragmentKey key, boolean addToBackstack, boolean showInTab, boolean clearInTabBackstack, FragmentTab defaultTabOverride, boolean allowLandscape, boolean useDesignSystemActivity, boolean useCloseIcon, boolean allowMainBanner, boolean requiresAuthentication, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop);

    boolean handleDeepLink(Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity, NavigationType navigationTypeOverride);

    Object handleDeepLinkDirect(Context context, Uri uri, boolean z, boolean z2, NavigationType navigationType, Continuation<? super Boolean> continuation);

    boolean isDeepLinkSupported(Uri uri);

    <ResolverT extends NavigationResolver> ResolverT resolve(Class<? extends NavigationKey> keyType);

    Intent[] resolveDeepLink(Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity);

    Object resolveDeepLinkDirect(Context context, Uri uri, boolean z, DeepLinkOrigin deepLinkOrigin, boolean z2, boolean z3, Continuation<? super Intent[]> continuation);

    void showFragment(Context context, FragmentKey key, boolean addToBackstack, boolean showInTab, boolean allowLandscape, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, FragmentTab defaultTabOverride, boolean useDesignSystemActivity, boolean allowNavigationToTabbedActivity, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride);

    void showFragmentInStandaloneRdsActivity(Context context, FragmentKey key, boolean allowLandscape, boolean useCloseIcon, boolean allowMainBanner, boolean requiresAuthentication, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride);

    void startActivity(Context context, IntentKey key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride);

    void startActivityForResult(Activity activity, IntentKey key, int requestCode, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride);

    void startActivityForResult(Fragment fragment, IntentKey key, int requestCode, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride);

    /* compiled from: Navigator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startActivity$default(Navigator navigator, Context context, IntentKey intentKey, PerformanceMetricEventData.Source source, boolean z, Function1 function1, NavigationType navigationType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startActivity");
            }
            if ((i & 4) != 0) {
                source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
            }
            PerformanceMetricEventData.Source source2 = source;
            if ((i & 8) != 0) {
                z = false;
            }
            navigator.startActivity(context, intentKey, source2, z, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : navigationType);
        }

        public static /* synthetic */ void startActivityForResult$default(Navigator navigator, Activity activity, IntentKey intentKey, int i, PerformanceMetricEventData.Source source, boolean z, Function1 function1, NavigationType navigationType, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startActivityForResult");
            }
            if ((i2 & 8) != 0) {
                source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
            }
            PerformanceMetricEventData.Source source2 = source;
            if ((i2 & 16) != 0) {
                z = false;
            }
            navigator.startActivityForResult(activity, intentKey, i, source2, z, (Function1<? super Intent, Unit>) ((i2 & 32) != 0 ? null : function1), (i2 & 64) != 0 ? null : navigationType);
        }

        public static /* synthetic */ void startActivityForResult$default(Navigator navigator, Fragment fragment, IntentKey intentKey, int i, PerformanceMetricEventData.Source source, boolean z, Function1 function1, NavigationType navigationType, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startActivityForResult");
            }
            if ((i2 & 8) != 0) {
                source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
            }
            PerformanceMetricEventData.Source source2 = source;
            if ((i2 & 16) != 0) {
                z = false;
            }
            navigator.startActivityForResult(fragment, intentKey, i, source2, z, (Function1<? super Intent, Unit>) ((i2 & 32) != 0 ? null : function1), (i2 & 64) != 0 ? null : navigationType);
        }

        public static /* synthetic */ void showFragment$default(Navigator navigator, Context context, FragmentKey fragmentKey, boolean z, boolean z2, boolean z3, PerformanceMetricEventData.Source source, boolean z4, FragmentTab fragmentTab, boolean z5, boolean z6, Function1 function1, NavigationType navigationType, int i, Object obj) {
            NavigationType navigationType2;
            Navigator navigator2;
            Context context2;
            FragmentKey fragmentKey2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFragment");
            }
            boolean z7 = (i & 4) != 0 ? true : z;
            boolean z8 = (i & 8) != 0 ? true : z2;
            boolean z9 = (i & 16) != 0 ? false : z3;
            PerformanceMetricEventData.Source source2 = (i & 32) != 0 ? PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED : source;
            boolean z10 = (i & 64) != 0 ? false : z4;
            FragmentTab fragmentTab2 = (i & 128) != 0 ? null : fragmentTab;
            boolean z11 = (i & 256) != 0 ? false : z5;
            boolean z12 = (i & 512) != 0 ? false : z6;
            Function1 function12 = (i & 1024) != 0 ? null : function1;
            if ((i & 2048) != 0) {
                navigationType2 = null;
                context2 = context;
                fragmentKey2 = fragmentKey;
                navigator2 = navigator;
            } else {
                navigationType2 = navigationType;
                navigator2 = navigator;
                context2 = context;
                fragmentKey2 = fragmentKey;
            }
            navigator2.showFragment(context2, fragmentKey2, z7, z8, z9, source2, z10, fragmentTab2, z11, z12, function12, navigationType2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showFragmentInStandaloneRdsActivity$default(Navigator navigator, Context context, FragmentKey fragmentKey, boolean z, boolean z2, boolean z3, boolean z4, PerformanceMetricEventData.Source source, boolean z5, Function1 function1, NavigationType navigationType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFragmentInStandaloneRdsActivity");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            if ((i & 16) != 0) {
                z3 = false;
            }
            if ((i & 32) != 0) {
                z4 = true;
            }
            if ((i & 64) != 0) {
                source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
            }
            if ((i & 128) != 0) {
                z5 = false;
            }
            if ((i & 256) != 0) {
                function1 = null;
            }
            if ((i & 512) != 0) {
                navigationType = null;
            }
            navigator.showFragmentInStandaloneRdsActivity(context, fragmentKey, z, z2, z3, z4, source, z5, function1, navigationType);
        }

        public static /* synthetic */ Intent createIntentForFragment$default(Navigator navigator, Context context, FragmentKey fragmentKey, boolean z, boolean z2, boolean z3, FragmentTab fragmentTab, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, PerformanceMetricEventData.Source source, boolean z9, int i, Object obj) {
            boolean z10;
            Navigator navigator2;
            Context context2;
            FragmentKey fragmentKey2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIntentForFragment");
            }
            boolean z11 = (i & 4) != 0 ? true : z;
            boolean z12 = (i & 8) != 0 ? true : z2;
            boolean z13 = (i & 16) != 0 ? false : z3;
            FragmentTab fragmentTab2 = (i & 32) != 0 ? null : fragmentTab;
            boolean z14 = (i & 64) != 0 ? false : z4;
            boolean z15 = (i & 128) != 0 ? false : z5;
            boolean z16 = (i & 256) != 0 ? true : z6;
            boolean z17 = (i & 512) != 0 ? false : z7;
            boolean z18 = (i & 1024) != 0 ? true : z8;
            PerformanceMetricEventData.Source source2 = (i & 2048) != 0 ? null : source;
            if ((i & 4096) != 0) {
                z10 = false;
                context2 = context;
                fragmentKey2 = fragmentKey;
                navigator2 = navigator;
            } else {
                z10 = z9;
                navigator2 = navigator;
                context2 = context;
                fragmentKey2 = fragmentKey;
            }
            return navigator2.createIntentForFragment(context2, fragmentKey2, z11, z12, z13, fragmentTab2, z14, z15, z16, z17, z18, source2, z10);
        }

        public static /* synthetic */ Intent createIntentForDialogFragment$default(Navigator navigator, Context context, DialogFragmentKey dialogFragmentKey, PerformanceMetricEventData.Source source, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIntentForDialogFragment");
            }
            if ((i & 4) != 0) {
                source = null;
            }
            return navigator.createIntentForDialogFragment(context, dialogFragmentKey, source);
        }

        public static /* synthetic */ Intent createIntent$default(Navigator navigator, Context context, IntentKey intentKey, PerformanceMetricEventData.Source source, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIntent");
            }
            if ((i & 4) != 0) {
                source = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return navigator.createIntent(context, intentKey, source, z);
        }

        public static /* synthetic */ Fragment createFragment$default(Navigator navigator, FragmentKey fragmentKey, PerformanceMetricEventData.Source source, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFragment");
            }
            if ((i & 2) != 0) {
                source = null;
            }
            return navigator.createFragment(fragmentKey, source);
        }

        public static /* synthetic */ DialogFragment createDialogFragment$default(Navigator navigator, DialogFragmentKey dialogFragmentKey, PerformanceMetricEventData.Source source, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDialogFragment");
            }
            if ((i & 2) != 0) {
                source = null;
            }
            return navigator.createDialogFragment(dialogFragmentKey, source);
        }

        public static /* synthetic */ Intent[] resolveDeepLink$default(Navigator navigator, Context context, Uri uri, Boolean bool, DeepLinkOrigin deepLinkOrigin, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveDeepLink");
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            Boolean bool2 = bool;
            if ((i & 16) != 0) {
                z = true;
            }
            return navigator.resolveDeepLink(context, uri, bool2, deepLinkOrigin, z);
        }

        public static /* synthetic */ Object resolveDeepLinkDirect$default(Navigator navigator, Context context, Uri uri, boolean z, DeepLinkOrigin deepLinkOrigin, boolean z2, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveDeepLinkDirect");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 16) != 0) {
                z2 = true;
            }
            if ((i & 32) != 0) {
                z3 = false;
            }
            return navigator.resolveDeepLinkDirect(context, uri, z, deepLinkOrigin, z2, z3, continuation);
        }

        public static /* synthetic */ boolean handleDeepLink$default(Navigator navigator, Context context, Uri uri, Boolean bool, DeepLinkOrigin deepLinkOrigin, boolean z, NavigationType navigationType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleDeepLink");
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                deepLinkOrigin = DeepLinkOrigin.Internal.INSTANCE;
            }
            if ((i & 16) != 0) {
                z = true;
            }
            if ((i & 32) != 0) {
                navigationType = null;
            }
            return navigator.handleDeepLink(context, uri, bool, deepLinkOrigin, z, navigationType);
        }

        public static /* synthetic */ Object handleDeepLinkDirect$default(Navigator navigator, Context context, Uri uri, boolean z, boolean z2, NavigationType navigationType, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleDeepLinkDirect");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            if ((i & 16) != 0) {
                navigationType = null;
            }
            return navigator.handleDeepLinkDirect(context, uri, z, z2, navigationType, continuation);
        }
    }

    /* compiled from: Navigator.kt */
    @Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016JR\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016JR\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J|\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016Jj\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016Jt\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J5\u0010)\u001a\u00020\u0010\"\f\b\u0000\u0010**\u00020+*\u00020,2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H*2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010-J*\u0010.\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010/\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u00100\u001a\u0002012\u0006\u0010\b\u001a\u00020+2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u00102\u001a\u000203\"\b\b\u0000\u00104*\u0002052\u000e\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020807H\u0016J \u00109\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u001b2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010;H\u0016J=\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100=2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010>\u001a\u00020?2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\rH\u0016¢\u0006\u0002\u0010CJD\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100=2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010>\u001a\u00020?2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010FJ!\u0010G\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00100=2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010HJC\u0010I\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010JJ:\u0010K\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0002\u0010LJ\u0010\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020?H\u0016¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/navigation/Navigator$Stub;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "()V", "startActivity", "", "context", "Landroid/content/Context;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "performanceMetricSource", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "shouldClearTop", "", "onIntentCreated", "Lkotlin/Function1;", "Landroid/content/Intent;", "navigationTypeOverride", "Lcom/robinhood/android/navigation/NavigationType;", "startActivityForResult", "activity", "Landroid/app/Activity;", "requestCode", "", "fragment", "Landroidx/fragment/app/Fragment;", "showFragment", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "addToBackstack", "showInTab", "allowLandscape", "defaultTabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "useDesignSystemActivity", "allowNavigationToTabbedActivity", "showFragmentInStandaloneRdsActivity", "useCloseIcon", "allowMainBanner", "requiresAuthentication", "createIntentForFragment", "clearInTabBackstack", "createIntentForDialogFragment", "K", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "(Landroid/content/Context;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;)Landroid/content/Intent;", "createIntent", "createFragment", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "", "ResolverT", "Lcom/robinhood/android/navigation/NavigationResolver;", "keyType", "Ljava/lang/Class;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "createFragmentInternal", "resolver", "Lcom/robinhood/android/navigation/FragmentResolver;", "resolveDeepLink", "", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "requiresBackingActivity", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;Z)[Landroid/content/Intent;", "resolveDeepLinkDirect", "navigationTypeTransitionEnabled", "(Landroid/content/Context;Landroid/net/Uri;ZLcom/robinhood/android/navigation/DeepLinkOrigin;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyClearTopFlags", "([Landroid/content/Intent;Ljava/lang/Boolean;)V", "handleDeepLink", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/Boolean;Lcom/robinhood/android/navigation/DeepLinkOrigin;ZLcom/robinhood/android/navigation/NavigationType;)Z", "handleDeepLinkDirect", "(Landroid/content/Context;Landroid/net/Uri;ZZLcom/robinhood/android/navigation/NavigationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeepLinkSupported", "uri", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.navigation.Navigator$Stub, reason: from kotlin metadata */
    /* loaded from: classes8.dex */
    public static final class Companion implements Navigator {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // com.robinhood.android.navigation.Navigator
        public void applyClearTopFlags(Intent[] intentArr, Boolean bool) {
            Intrinsics.checkNotNullParameter(intentArr, "<this>");
        }

        @Override // com.robinhood.android.navigation.Navigator
        public boolean handleDeepLink(Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity, NavigationType navigationTypeOverride) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
            return true;
        }

        @Override // com.robinhood.android.navigation.Navigator
        public boolean isDeepLinkSupported(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return true;
        }

        @Override // com.robinhood.android.navigation.Navigator
        public void showFragment(Context context, FragmentKey key, boolean addToBackstack, boolean showInTab, boolean allowLandscape, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, FragmentTab defaultTabOverride, boolean useDesignSystemActivity, boolean allowNavigationToTabbedActivity, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
        }

        @Override // com.robinhood.android.navigation.Navigator
        public void showFragmentInStandaloneRdsActivity(Context context, FragmentKey key, boolean allowLandscape, boolean useCloseIcon, boolean allowMainBanner, boolean requiresAuthentication, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
        }

        @Override // com.robinhood.android.navigation.Navigator
        public void startActivity(Context context, IntentKey key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
        }

        @Override // com.robinhood.android.navigation.Navigator
        public void startActivityForResult(Activity activity, IntentKey key, int requestCode, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(key, "key");
        }

        @Override // com.robinhood.android.navigation.Navigator
        public void startActivityForResult(Fragment fragment, IntentKey key, int requestCode, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop, Function1<? super Intent, Unit> onIntentCreated, NavigationType navigationTypeOverride) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(key, "key");
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.Navigator
        public /* bridge */ /* synthetic */ NavigationResolver resolve(Class cls) {
            return (NavigationResolver) m16724resolve((Class<? extends NavigationKey>) cls);
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Intent createIntentForFragment(Context context, FragmentKey key, boolean addToBackstack, boolean showInTab, boolean clearInTabBackstack, FragmentTab defaultTabOverride, boolean allowLandscape, boolean useDesignSystemActivity, boolean useCloseIcon, boolean allowMainBanner, boolean requiresAuthentication, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent();
        }

        @Override // com.robinhood.android.navigation.Navigator
        public <K extends DialogFragmentKey & Parcelable> Intent createIntentForDialogFragment(Context context, K key, PerformanceMetricEventData.Source performanceMetricSource) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent();
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Intent createIntent(Context context, IntentKey key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent();
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Fragment createFragment(FragmentKey key, PerformanceMetricEventData.Source performanceMetricSource) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new Fragment();
        }

        @Override // com.robinhood.android.navigation.Navigator
        public DialogFragment createDialogFragment(DialogFragmentKey key, PerformanceMetricEventData.Source performanceMetricSource) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new DialogFragment();
        }

        /* renamed from: resolve, reason: collision with other method in class */
        public <ResolverT extends NavigationResolver> Void m16724resolve(Class<? extends NavigationKey> keyType) {
            Intrinsics.checkNotNullParameter(keyType, "keyType");
            throw new IllegalStateException("");
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Fragment createFragmentInternal(FragmentKey key, FragmentResolver<? super FragmentKey> resolver) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new Fragment();
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Intent[] resolveDeepLink(Context context, Uri data, Boolean shouldClearTop, DeepLinkOrigin deepLinkOrigin, boolean requiresBackingActivity) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
            return new Intent[0];
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Object resolveDeepLinkDirect(Context context, Uri uri, boolean z, DeepLinkOrigin deepLinkOrigin, boolean z2, boolean z3, Continuation<? super Intent[]> continuation) {
            return new Intent[0];
        }

        @Override // com.robinhood.android.navigation.Navigator
        public Object handleDeepLinkDirect(Context context, Uri uri, boolean z, boolean z2, NavigationType navigationType, Continuation<? super Boolean> continuation) {
            return boxing.boxBoolean(true);
        }
    }
}
