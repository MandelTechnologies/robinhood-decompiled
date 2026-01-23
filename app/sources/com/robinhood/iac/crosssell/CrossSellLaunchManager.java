package com.robinhood.iac.crosssell;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.contracts.MicrogramBottomSheetFragmentKey;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import dispatch.core.Launch;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import timber.log.Timber;

/* compiled from: CrossSellLaunchManager.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B=\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0005Jl\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0014H\u0007Jr\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120/2\u0006\u00100\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0014H\u0007J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120/2\u0006\u0010$\u001a\u00020%H\u0002J\u001c\u00103\u001a\u00020\u001d*\u00020\u00052\u0006\u0010$\u001a\u00020%2\u0006\u00104\u001a\u00020#H\u0002JZ\u00105\u001a\u000206*\u00020\u00052\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u00142\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0012J\u0018\u0010;\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020<H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006>"}, m3636d2 = {"Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/shared/app/type/AppType;)V", "dialogLaunchRequestFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "locationKey", "", "getLocationKey", "(Lcom/robinhood/android/navigation/keys/NavigationKey;)Ljava/lang/String;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "lifecycleScope", "routerService", "Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;", "onMicrogramComponentLoaded", "", "key", "onMicrogramComponentLoaded$lib_cross_sell_externalDebug", "launchDemoSheet", "initIacBottomSheetPolling", "dialogLaunchSourceFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "location", "Lcom/robinhood/models/db/IacAlertSheetLocation;", "accountNumber", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "optionChainId", "optionStrategyType", "eventId", "source", "streamBottomSheetNavigationKey", "Lkotlinx/coroutines/flow/Flow;", "pollingScope", "optionStrategy", "dialogLaunchRequestForLocation", "launchWhenReceived", "fragment", "performPolling", "Lkotlinx/coroutines/Job;", "processNavigationKey", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "navigationKey", "showDialog", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Companion", "lib-cross-sell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class CrossSellLaunchManager {
    public static final String DIALOG_TAG = "cross_sell_dialog";
    private final AppType appType;
    private final Context context;
    private final StateFlow2<NavigationKey> dialogLaunchRequestFlow;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final Navigator navigator;
    public static final int $stable = 8;

    public CrossSellLaunchManager(Context context, @RootCoroutineScope CoroutineScope microgramCoroutineScope, MicrogramManager microgramManager, Navigator navigator, LazyMoshi moshi, AppType appType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.microgramManager = microgramManager;
        this.navigator = navigator;
        this.moshi = moshi;
        this.appType = appType;
        this.dialogLaunchRequestFlow = StateFlow4.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLocationKey(NavigationKey navigationKey) {
        Map<String, String> metadata;
        MicrogramBottomSheetFragmentKey microgramBottomSheetFragmentKey = navigationKey instanceof MicrogramBottomSheetFragmentKey ? (MicrogramBottomSheetFragmentKey) navigationKey : null;
        if (microgramBottomSheetFragmentKey == null || (metadata = microgramBottomSheetFragmentKey.getMetadata()) == null) {
            return null;
        }
        return metadata.get("location");
    }

    private final MicrogramComponent microgramComponent(CoroutineScope lifecycleScope) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(this.microgramManager, new RemoteMicrogramApplication("app-cross-sell-router", null, 2, null), lifecycleScope, this.moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(this.context, this.navigator)), new Function1() { // from class: com.robinhood.iac.crosssell.CrossSellLaunchManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossSellLaunchManager.microgramComponent$lambda$0(this.f$0, (FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.iac.crosssell.CrossSellLaunchManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossSellLaunchManager.microgramComponent$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$0(CrossSellLaunchManager crossSellLaunchManager, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        crossSellLaunchManager.onMicrogramComponentLoaded$lib_cross_sell_externalDebug(fragmentKey);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$1(CrossSellLaunchManager crossSellLaunchManager, DialogFragmentKey dialogKey) {
        Intrinsics.checkNotNullParameter(dialogKey, "dialogKey");
        crossSellLaunchManager.onMicrogramComponentLoaded$lib_cross_sell_externalDebug(dialogKey);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CrossSellRouterService routerService() {
        return (CrossSellRouterService) microgramComponent(this.microgramCoroutineScope).getServiceLocator().getClient(CrossSellRouterService.class);
    }

    public final void onMicrogramComponentLoaded$lib_cross_sell_externalDebug(NavigationKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        StateFlow2<NavigationKey> stateFlow2 = this.dialogLaunchRequestFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), key)) {
        }
    }

    public final void launchDemoSheet(CoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Timber.INSTANCE.mo3350d("Invoking router service to launch demo bottomsheet", new Object[0]);
        microgramComponent(lifecycleScope);
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new C333481(null), 3, null);
    }

    /* compiled from: CrossSellLaunchManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$launchDemoSheet$1", m3645f = "CrossSellLaunchManager.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$launchDemoSheet$1 */
    static final class C333481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C333481(Continuation<? super C333481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CrossSellLaunchManager.this.new C333481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CrossSellRouterService crossSellRouterServiceRouterService = CrossSellLaunchManager.this.routerService();
                this.label = 1;
                if (crossSellRouterServiceRouterService.launchDemoHalfSheet(this) == coroutine_suspended) {
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

    public static /* synthetic */ void initIacBottomSheetPolling$default(CrossSellLaunchManager crossSellLaunchManager, BaseFragment baseFragment, IacAlertSheetLocation iacAlertSheetLocation, String str, UUID uuid, UUID uuid2, UUID uuid3, String str2, UUID uuid4, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            uuid = null;
        }
        if ((i & 16) != 0) {
            uuid2 = null;
        }
        if ((i & 32) != 0) {
            uuid3 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            uuid4 = null;
        }
        if ((i & 256) != 0) {
            str3 = null;
        }
        crossSellLaunchManager.initIacBottomSheetPolling(baseFragment, iacAlertSheetLocation, str, uuid, uuid2, uuid3, str2, uuid4, str3);
    }

    /* compiled from: CrossSellLaunchManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$initIacBottomSheetPolling$1", m3645f = "CrossSellLaunchManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$initIacBottomSheetPolling$1 */
    static final class C333471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $currencyPairId;
        final /* synthetic */ BaseFragment $dialogLaunchSourceFragment;
        final /* synthetic */ UUID $eventId;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ IacAlertSheetLocation $location;
        final /* synthetic */ UUID $optionChainId;
        final /* synthetic */ String $optionStrategyType;
        final /* synthetic */ String $source;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333471(IacAlertSheetLocation iacAlertSheetLocation, String str, UUID uuid, UUID uuid2, UUID uuid3, String str2, UUID uuid4, String str3, BaseFragment baseFragment, Continuation<? super C333471> continuation) {
            super(2, continuation);
            this.$location = iacAlertSheetLocation;
            this.$accountNumber = str;
            this.$instrumentId = uuid;
            this.$currencyPairId = uuid2;
            this.$optionChainId = uuid3;
            this.$optionStrategyType = str2;
            this.$eventId = uuid4;
            this.$source = str3;
            this.$dialogLaunchSourceFragment = baseFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C333471 c333471 = CrossSellLaunchManager.this.new C333471(this.$location, this.$accountNumber, this.$instrumentId, this.$currencyPairId, this.$optionChainId, this.$optionStrategyType, this.$eventId, this.$source, this.$dialogLaunchSourceFragment, continuation);
            c333471.L$0 = obj;
            return c333471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CrossSellLaunchManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$initIacBottomSheetPolling$1$1", m3645f = "CrossSellLaunchManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$initIacBottomSheetPolling$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $currencyPairId;
            final /* synthetic */ UUID $eventId;
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ IacAlertSheetLocation $location;
            final /* synthetic */ UUID $optionChainId;
            final /* synthetic */ String $optionStrategyType;
            final /* synthetic */ String $source;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CrossSellLaunchManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CrossSellLaunchManager crossSellLaunchManager, IacAlertSheetLocation iacAlertSheetLocation, String str, UUID uuid, UUID uuid2, UUID uuid3, String str2, UUID uuid4, String str3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = crossSellLaunchManager;
                this.$location = iacAlertSheetLocation;
                this.$accountNumber = str;
                this.$instrumentId = uuid;
                this.$currencyPairId = uuid2;
                this.$optionChainId = uuid3;
                this.$optionStrategyType = str2;
                this.$eventId = uuid4;
                this.$source = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$location, this.$accountNumber, this.$instrumentId, this.$currencyPairId, this.$optionChainId, this.$optionStrategyType, this.$eventId, this.$source, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.performPolling((CoroutineScope) this.L$0, this.$location, this.$accountNumber, this.$instrumentId, this.$currencyPairId, this.$optionChainId, this.$optionStrategyType, this.$eventId, this.$source);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass1(CrossSellLaunchManager.this, this.$location, this.$accountNumber, this.$instrumentId, this.$currencyPairId, this.$optionChainId, this.$optionStrategyType, this.$eventId, this.$source, null), 3, null);
            Launch.launchMain$default(coroutineScope, null, null, new AnonymousClass2(CrossSellLaunchManager.this, this.$location, this.$dialogLaunchSourceFragment, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: CrossSellLaunchManager.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$initIacBottomSheetPolling$1$2", m3645f = "CrossSellLaunchManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$initIacBottomSheetPolling$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BaseFragment $dialogLaunchSourceFragment;
            final /* synthetic */ IacAlertSheetLocation $location;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CrossSellLaunchManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CrossSellLaunchManager crossSellLaunchManager, IacAlertSheetLocation iacAlertSheetLocation, BaseFragment baseFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = crossSellLaunchManager;
                this.$location = iacAlertSheetLocation;
                this.$dialogLaunchSourceFragment = baseFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$location, this.$dialogLaunchSourceFragment, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.launchWhenReceived((CoroutineScope) this.L$0, this.$location, this.$dialogLaunchSourceFragment);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public final void initIacBottomSheetPolling(BaseFragment dialogLaunchSourceFragment, IacAlertSheetLocation location, String accountNumber, UUID instrumentId, UUID currencyPairId, UUID optionChainId, String optionStrategyType, UUID eventId, String source) {
        Intrinsics.checkNotNullParameter(dialogLaunchSourceFragment, "dialogLaunchSourceFragment");
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.appType != AppType.NCW) {
            dialogLaunchSourceFragment.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C333471(location, accountNumber, instrumentId, currencyPairId, optionChainId, optionStrategyType, eventId, source, dialogLaunchSourceFragment, null));
        }
    }

    public static /* synthetic */ Flow streamBottomSheetNavigationKey$default(CrossSellLaunchManager crossSellLaunchManager, CoroutineScope coroutineScope, IacAlertSheetLocation iacAlertSheetLocation, String str, UUID uuid, UUID uuid2, UUID uuid3, String str2, UUID uuid4, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            uuid = null;
        }
        if ((i & 16) != 0) {
            uuid2 = null;
        }
        if ((i & 32) != 0) {
            uuid3 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            uuid4 = null;
        }
        if ((i & 256) != 0) {
            str3 = null;
        }
        return crossSellLaunchManager.streamBottomSheetNavigationKey(coroutineScope, iacAlertSheetLocation, str, uuid, uuid2, uuid3, str2, uuid4, str3);
    }

    @ExperimentalCrossSellLaunchApi
    public final Flow<NavigationKey> streamBottomSheetNavigationKey(CoroutineScope pollingScope, IacAlertSheetLocation location, String accountNumber, UUID instrumentId, UUID currencyPairId, UUID optionChainId, String optionStrategy, UUID eventId, String source) {
        Intrinsics.checkNotNullParameter(pollingScope, "pollingScope");
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.appType == AppType.NCW) {
            return FlowKt.emptyFlow();
        }
        performPolling(pollingScope, location, accountNumber, instrumentId, currencyPairId, optionChainId, optionStrategy, eventId, source);
        return dialogLaunchRequestForLocation(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<NavigationKey> dialogLaunchRequestForLocation(final IacAlertSheetLocation location) {
        final Flow flowFilterNotNull = FlowKt.filterNotNull(this.dialogLaunchRequestFlow);
        return new Flow<NavigationKey>() { // from class: com.robinhood.iac.crosssell.CrossSellLaunchManager$dialogLaunchRequestForLocation$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super NavigationKey> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector, this, location), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$dialogLaunchRequestForLocation$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ IacAlertSheetLocation $location$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CrossSellLaunchManager this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$dialogLaunchRequestForLocation$$inlined$filter$1$2", m3645f = "CrossSellLaunchManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$dialogLaunchRequestForLocation$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector, CrossSellLaunchManager crossSellLaunchManager, IacAlertSheetLocation iacAlertSheetLocation) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = crossSellLaunchManager;
                    this.$location$inlined = iacAlertSheetLocation;
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
                        if (Intrinsics.areEqual(this.this$0.getLocationKey((NavigationKey) obj), this.$location$inlined.getServerValue())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* compiled from: CrossSellLaunchManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$launchWhenReceived$1", m3645f = "CrossSellLaunchManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$launchWhenReceived$1 */
    static final class C333491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseFragment $fragment;
        final /* synthetic */ IacAlertSheetLocation $location;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333491(IacAlertSheetLocation iacAlertSheetLocation, BaseFragment baseFragment, Continuation<? super C333491> continuation) {
            super(2, continuation);
            this.$location = iacAlertSheetLocation;
            this.$fragment = baseFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CrossSellLaunchManager.this.new C333491(this.$location, this.$fragment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C333491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDialogLaunchRequestForLocation = CrossSellLaunchManager.this.dialogLaunchRequestForLocation(this.$location);
                final CrossSellLaunchManager crossSellLaunchManager = CrossSellLaunchManager.this;
                final BaseFragment baseFragment = this.$fragment;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.iac.crosssell.CrossSellLaunchManager.launchWhenReceived.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((NavigationKey) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                        CrossSellLaunchManager crossSellLaunchManager2 = crossSellLaunchManager;
                        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        crossSellLaunchManager2.processNavigationKey(childFragmentManager, navigationKey);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDialogLaunchRequestForLocation.collect(flowCollector, this) == coroutine_suspended) {
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
    public final void launchWhenReceived(CoroutineScope coroutineScope, IacAlertSheetLocation iacAlertSheetLocation, BaseFragment baseFragment) {
        Launch.launchMain$default(coroutineScope, null, null, new C333491(iacAlertSheetLocation, baseFragment, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job performPolling(CoroutineScope coroutineScope, IacAlertSheetLocation iacAlertSheetLocation, String str, UUID uuid, UUID uuid2, UUID uuid3, String str2, UUID uuid4, String str3) {
        Timber.INSTANCE.mo3350d("createPollingJob -> location=" + iacAlertSheetLocation, new Object[0]);
        CrossSellRouterService crossSellRouterServiceRouterService = routerService();
        String serverValue = iacAlertSheetLocation.getServerValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uuid != null) {
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            linkedHashMap.put("instrument_id", string2);
        }
        if (uuid2 != null) {
            String string3 = uuid2.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            linkedHashMap.put("currency_pair_id", string3);
        }
        if (uuid3 != null) {
            String string4 = uuid3.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            linkedHashMap.put("option_chain_id", string4);
        }
        if (str2 != null) {
            linkedHashMap.put("option_strategy", str2);
        }
        if (uuid4 != null) {
            String string5 = uuid4.toString();
            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
            linkedHashMap.put("event_id", string5);
        }
        if (str3 != null) {
            linkedHashMap.put("entry_point", str3);
        }
        if (str != null) {
            linkedHashMap.put("account_number", str);
        }
        Unit unit = Unit.INSTANCE;
        return FlowKt.launchIn(FlowKt.m28818catch(crossSellRouterServiceRouterService.pollBottomSheets(serverValue, linkedHashMap), new C333502(null)), coroutineScope);
    }

    /* compiled from: CrossSellLaunchManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.iac.crosssell.CrossSellLaunchManager$performPolling$2", m3645f = "CrossSellLaunchManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.iac.crosssell.CrossSellLaunchManager$performPolling$2 */
    static final class C333502 extends ContinuationImpl7 implements Function3<FlowCollector<? super Unit>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C333502(Continuation<? super C333502> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Unit> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C333502 c333502 = new C333502(continuation);
            c333502.L$0 = th;
            return c333502.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            Timber.INSTANCE.mo3353e("Swallowing flow collection error: " + th, new Object[0]);
            return Unit.INSTANCE;
        }
    }

    public final void processNavigationKey(FragmentManager fragmentManager, NavigationKey navigationKey) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(navigationKey, "navigationKey");
        String locationKey = getLocationKey(navigationKey);
        Timber.Companion companion = Timber.INSTANCE;
        companion.mo3350d("processNavigationKey -> location=" + locationKey + ", key=" + navigationKey, new Object[0]);
        if (navigationKey instanceof DialogFragmentKey) {
            companion.mo3350d("createDialogFragment location=" + locationKey, new Object[0]);
            showDialog(fragmentManager, (DialogFragmentKey) navigationKey);
            return;
        }
        companion.mo3353e("Unsupported navigation key: " + navigationKey, new Object[0]);
    }

    private final void showDialog(FragmentManager fragmentManager, DialogFragmentKey navigationKey) {
        if (fragmentManager.findFragmentByTag(DIALOG_TAG) == null) {
            Timber.INSTANCE.mo3350d("showDialog location=" + getLocationKey(navigationKey), new Object[0]);
            StateFlow2<NavigationKey> stateFlow2 = this.dialogLaunchRequestFlow;
            while (!stateFlow2.compareAndSet(stateFlow2.getValue(), null)) {
            }
            Navigator.DefaultImpls.createDialogFragment$default(this.navigator, navigationKey, null, 2, null).show(fragmentManager, DIALOG_TAG);
            return;
        }
        Timber.INSTANCE.mo3362w("showDialog dropped dialog, because one is already showing -> key=" + navigationKey, new Object[0]);
    }
}
