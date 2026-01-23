package com.robinhood.android.eventcontracts.hub.p134v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.contracts.EventContractHubV2IntentKey;
import com.robinhood.android.eventcontracts.experiments.EventContractsSportsExperiment2;
import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraph3;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventContractHubActivity.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014JO\u0010\u000f\u001a\u00020\f2@\u0010\u0010\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\f0\u0012j\u0007`\u001a¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u00190\u0011H\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "NavHostComposeContent", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventContractHubActivity extends BaseComposeNavHostActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(EventContractsSportsExperiment2.INSTANCE);
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(EventContractHubActivity eventContractHubActivity, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        eventContractHubActivity.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C165301(null));
    }

    /* compiled from: EventContractHubActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity$onCreate$1", m3645f = "EventContractHubActivity.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity$onCreate$1 */
    static final class C165301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C165301(Continuation<? super C165301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventContractHubActivity.this.new C165301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C165301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamBottomSheetNavigationKey$default = CrossSellLaunchManager.streamBottomSheetNavigationKey$default(EventContractHubActivity.this.getCrossSellLaunchManager(), EventContractHubActivity.this.getLifecycleScope(), IacAlertSheetLocation.EVENT_CONTRACTS_HUB, null, null, null, null, null, null, ((EventContractHubV2IntentKey) EventContractHubActivity.INSTANCE.getExtras((Activity) EventContractHubActivity.this)).getSource(), EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventContractHubActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamBottomSheetNavigationKey$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EventContractHubActivity.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "navigationKey", "Lcom/robinhood/android/navigation/keys/NavigationKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity$onCreate$1$1", m3645f = "EventContractHubActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<NavigationKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EventContractHubActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventContractHubActivity eventContractHubActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventContractHubActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(navigationKey, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                NavigationKey navigationKey = (NavigationKey) this.L$0;
                CrossSellLaunchManager crossSellLaunchManager = this.this$0.getCrossSellLaunchManager();
                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                crossSellLaunchManager.processNavigationKey(supportFragmentManager, navigationKey);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity
    public void NavHostComposeContent(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(109495762);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(109495762, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity.NavHostComposeContent (EventContractHubActivity.kt:47)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1600111395, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity.NavHostComposeContent.1
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
                        ComposerKt.traceEventStart(-1600111395, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity.NavHostComposeContent.<anonymous> (EventContractHubActivity.kt:49)");
                    }
                    Companion companion = EventContractHubActivity.INSTANCE;
                    String source = ((EventContractHubV2IntentKey) companion.getExtras((Activity) EventContractHubActivity.this)).getSource();
                    if (source == null) {
                        source = "unknown";
                    }
                    HubRootNavGraph3.HubRootComposeNavigationComposable(source, null, ((EventContractHubV2IntentKey) companion.getExtras((Activity) EventContractHubActivity.this)).getInitialNodeId(), composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.EventContractHubActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventContractHubActivity.NavHostComposeContent$lambda$0(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EventContractHubActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity;", "Lcom/robinhood/android/eventcontracts/contracts/EventContractHubV2IntentKey;", "<init>", "()V", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<EventContractHubActivity, EventContractHubV2IntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public EventContractHubV2IntentKey getExtras(EventContractHubActivity eventContractHubActivity) {
            return (EventContractHubV2IntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, eventContractHubActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, EventContractHubV2IntentKey eventContractHubV2IntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, eventContractHubV2IntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, EventContractHubV2IntentKey eventContractHubV2IntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, eventContractHubV2IntentKey);
        }
    }
}
