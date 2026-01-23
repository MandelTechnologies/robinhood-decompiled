package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.OptionChainSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetViewState2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionOnboardingUpsellAllSetFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002FGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u001a\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\r\u0010.\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010/J\u0017\u00100\u001a\u00020\u001d2\b\u00101\u001a\u0004\u0018\u000102H\u0003¢\u0006\u0002\u00103J\r\u00104\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010/J\u001f\u00105\u001a\u0002062\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00107\u001a\u00020\u0011H\u0003¢\u0006\u0002\u00108J\u0018\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002J\u0010\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020\u001dH\u0002J\t\u0010@\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "<set-?>", "isNegativeButtonLoading", "setNegativeButtonLoading", "(Z)V", "isNegativeButtonLoading$delegate", "Landroidx/compose/runtime/MutableState;", "setLoading", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "duxo", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "NewOptionAllSet", "sdp", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "OldOptionAllSet", "generateNewOnboardingData", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetFragment$NewOnboardingData;", "isDay", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetFragment$NewOnboardingData;", "goToOptionChainScreen", "equityUuid", "Ljava/util/UUID;", "chainUuid", "goToWatchlistScreen", "inOptionsPostEnableExperiment", "goToNextOptionScreen", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "NewOnboardingData", "Companion", "feature-options-upgrade_externalDebug", "state", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellAllSetFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingUpsellAllSetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOnboardingScreens2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: isNegativeButtonLoading$delegate, reason: from kotlin metadata */
    private final SnapshotState isNegativeButtonLoading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionOnboardingUpsellAllSetDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingUpsellAllSetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOptionAllSet$lambda$2(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment, String str, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingUpsellAllSetFragment.NewOptionAllSet(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionAllSet$lambda$7(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment, int i, Composer composer, int i2) {
        optionOnboardingUpsellAllSetFragment.OldOptionAllSet(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isNegativeButtonLoading() {
        return ((Boolean) this.isNegativeButtonLoading.getValue()).booleanValue();
    }

    private final void setNegativeButtonLoading(boolean z) {
        this.isNegativeButtonLoading.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setNegativeButtonLoading(isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOnboardingUpsellAllSetDuxo getDuxo() {
        return (OptionOnboardingUpsellAllSetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        OptionOnboardingStyles2.setupStatusBarStyle(this, ((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) this)).getStyle());
        getDuxo().setupSdpFlowTimer(((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) this)).isFromSdp());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OptionOnboardingStyles2.removeStatusBarStyle(this);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C250621(null), 1, null);
    }

    /* compiled from: OptionOnboardingUpsellAllSetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$onViewCreated$1", m3645f = "OptionOnboardingUpsellAllSetFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$onViewCreated$1 */
    static final class C250621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C250621(Continuation<? super C250621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellAllSetFragment.this.new C250621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OptionOnboardingUpsellAllSetFragment.this.getDuxo().getEventFlow());
                final OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment = OptionOnboardingUpsellAllSetFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<OptionOnboardingUpsellAllSetViewState2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<OptionOnboardingUpsellAllSetViewState2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<OptionOnboardingUpsellAllSetViewState2> eventConsumerInvoke;
                        final OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment2 = optionOnboardingUpsellAllSetFragment;
                        if ((event.getData() instanceof OptionOnboardingUpsellAllSetViewState2.SdpSuccess) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17440invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17440invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    OptionOnboardingUpsellAllSetFragment.Companion companion = OptionOnboardingUpsellAllSetFragment.INSTANCE;
                                    SdpInfo sdp = ((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) optionOnboardingUpsellAllSetFragment2)).getSdp();
                                    UUID uuid = sdp != null ? sdp.getUuid() : null;
                                    SdpInfo sdp2 = ((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) optionOnboardingUpsellAllSetFragment2)).getSdp();
                                    UUID chainUuid = sdp2 != null ? sdp2.getChainUuid() : null;
                                    boolean z = uuid == null || chainUuid == null;
                                    if (z) {
                                        optionOnboardingUpsellAllSetFragment2.goToNextOptionScreen();
                                    } else {
                                        if (!z) {
                                            optionOnboardingUpsellAllSetFragment2.goToOptionChainScreen(uuid, chainUuid);
                                            return;
                                        }
                                        throw new NoWhenBranchMatchedException();
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

    private static final OptionOnboardingUpsellAllSetViewState ComposeContent$lambda$0(SnapshotState4<OptionOnboardingUpsellAllSetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(918759581);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(918759581, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment.ComposeContent (OptionOnboardingUpsellAllSetFragment.kt:85)");
            }
            boolean inOptionsPostEnableExperiment = ComposeContent$lambda$0(SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1)).getInOptionsPostEnableExperiment();
            if (inOptionsPostEnableExperiment) {
                composerStartRestartGroup.startReplaceGroup(-1835300034);
                SdpInfo sdp = ((ScreenArgs.UpsellAllSet) INSTANCE.getArgs((Fragment) this)).getSdp();
                NewOptionAllSet(sdp != null ? sdp.getSymbol() : null, composerStartRestartGroup, (i2 << 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (inOptionsPostEnableExperiment) {
                    composerStartRestartGroup.startReplaceGroup(-1835302000);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1835298290);
                OldOptionAllSet(composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellAllSetFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void NewOptionAllSet(final String str, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1897819195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897819195, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment.NewOptionAllSet (OptionOnboardingUpsellAllSetFragment.kt:94)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            NewOnboardingData newOnboardingDataGenerateNewOnboardingData = generateNewOnboardingData(str, bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay(), composerStartRestartGroup, ((i2 << 3) & 896) | (i2 & 14));
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            String title = newOnboardingDataGenerateNewOnboardingData.getTitle();
            composer2 = composerStartRestartGroup;
            OptionOnboardingUpsellComposableKt.m17447OptionOnboardingUpsellComposableDY_cekU(jM21371getBg0d7_KjU, newOnboardingDataGenerateNewOnboardingData.getMessage(), null, newOnboardingDataGenerateNewOnboardingData.getOnPositiveButtonClick(), false, newOnboardingDataGenerateNewOnboardingData.getPositiveButtonText(), false, title, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), true, null, newOnboardingDataGenerateNewOnboardingData.getAnimation(), null, null, null, false, null, composer2, 806879232, 0, 128020);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellAllSetFragment.NewOptionAllSet$lambda$2(this.f$0, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void OldOptionAllSet(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1704734493);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1704734493, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment.OldOptionAllSet (OptionOnboardingUpsellAllSetFragment.kt:112)");
            }
            Companion companion = INSTANCE;
            long jM17424getComposeColorWaAFU9c = ((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) this)).getStyle().m17424getComposeColorWaAFU9c(composerStartRestartGroup, 0);
            int optionOnboardingUpsellAllSetImageResId = OptionOnboardingUpsellAllSetFragment2.getOptionOnboardingUpsellAllSetImageResId(((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) this)).getStyle());
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.option_settings_confirmation_title, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.option_settings_confirmation_description, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C11303R.string.option_settings_explore_options_button, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C11303R.string.option_alert_onboarding_negative_button, composerStartRestartGroup, 0);
            boolean zIsNegativeButtonLoading = isNegativeButtonLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAllSetFragment.OldOptionAllSet$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf = Integer.valueOf(optionOnboardingUpsellAllSetImageResId);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAllSetFragment.OldOptionAllSet$lambda$6$lambda$5(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            OptionOnboardingUpsellComposableKt.m17447OptionOnboardingUpsellComposableDY_cekU(jM17424getComposeColorWaAFU9c, strStringResource2, null, function0, false, strStringResource3, false, strStringResource, null, false, numValueOf, null, null, null, strStringResource4, zIsNegativeButtonLoading, (Function0) objRememberedValue2, composer2, 1572864, 0, 15124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellAllSetFragment.OldOptionAllSet$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionAllSet$lambda$4$lambda$3(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment) {
        optionOnboardingUpsellAllSetFragment.goToWatchlistScreen(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionAllSet$lambda$6$lambda$5(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment) {
        optionOnboardingUpsellAllSetFragment.goToNextOptionScreen();
        return Unit.INSTANCE;
    }

    private final NewOnboardingData generateNewOnboardingData(String str, boolean z, Composer composer, int i) throws Resources.NotFoundException {
        LottieUrl lottieUrl;
        NewOnboardingData newOnboardingData;
        LottieUrl lottieUrl2;
        composer.startReplaceGroup(251908872);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(251908872, i, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment.generateNewOnboardingData (OptionOnboardingUpsellAllSetFragment.kt:128)");
        }
        if (str == null) {
            composer.startReplaceGroup(1566262289);
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.option_confirmation_title_non_sdp, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.option_confirmation_description_non_sdp, composer, 0);
            if (z) {
                lottieUrl2 = LottieUrl.OPTIONS_ONBOARDING_ALL_SET_NON_SDP_DAY;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                lottieUrl2 = LottieUrl.OPTIONS_ONBOARDING_ALL_SET_NON_SDP_NIGHT;
            }
            LottieUrl lottieUrl3 = lottieUrl2;
            String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAllSetFragment.generateNewOnboardingData$lambda$9$lambda$8(this.f$0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            newOnboardingData = new NewOnboardingData(strStringResource, strStringResource2, lottieUrl3, strStringResource3, (Function0) objRememberedValue);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1566281387);
            String strStringResource4 = StringResources_androidKt.stringResource(C11303R.string.option_confirmation_title_sdp, composer, 0);
            String strStringResource5 = StringResources_androidKt.stringResource(C11303R.string.option_confirmation_description_sdp, new Object[]{str}, composer, 0);
            if (z) {
                lottieUrl = LottieUrl.OPTIONS_ONBOARDING_ALL_SET_SDP_DAY;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                lottieUrl = LottieUrl.OPTIONS_ONBOARDING_ALL_SET_SDP_NIGHT;
            }
            NewOnboardingData newOnboardingData2 = new NewOnboardingData(strStringResource4, strStringResource5, lottieUrl, null, null, 24, null);
            composer.endReplaceGroup();
            newOnboardingData = newOnboardingData2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return newOnboardingData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateNewOnboardingData$lambda$9$lambda$8(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment) {
        optionOnboardingUpsellAllSetFragment.goToWatchlistScreen(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToOptionChainScreen(UUID equityUuid, UUID chainUuid) {
        Navigator navigator = getNavigator();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new OptionChainIntentKey(equityUuid, new OptionChainIdLaunchMode.SingleChainId(chainUuid), (ImmutableList) null, (OptionOrderFilter) null, ((ScreenArgs.UpsellAllSet) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), OptionChainSource.ONBOARDING_UPSELL_SDP, 12, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void goToWatchlistScreen(boolean inOptionsPostEnableExperiment) {
        Navigator navigator = getNavigator();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, fragmentActivityRequireActivity, new SearchSelector(new SearchSelectorLaunchMode.Options.Watchlist(((ScreenArgs.UpsellAllSet) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), OptionChainLaunchMode.Normal.INSTANCE, inOptionsPostEnableExperiment), null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToNextOptionScreen() {
        OptionOnboardingScreens2 callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.UpsellAllSet(((ScreenArgs.UpsellAllSet) companion.getArgs((Fragment) this)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionOnboardingUpsellAllSetFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetFragment$NewOnboardingData;", "", "title", "", "message", "animation", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "positiveButtonText", "onPositiveButtonClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/remote/assets/LottieUrl;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getAnimation", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getPositiveButtonText", "getOnPositiveButtonClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class NewOnboardingData {
        private final LottieUrl animation;
        private final String message;
        private final Function0<Unit> onPositiveButtonClick;
        private final String positiveButtonText;
        private final String title;

        public static /* synthetic */ NewOnboardingData copy$default(NewOnboardingData newOnboardingData, String str, String str2, LottieUrl lottieUrl, String str3, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newOnboardingData.title;
            }
            if ((i & 2) != 0) {
                str2 = newOnboardingData.message;
            }
            if ((i & 4) != 0) {
                lottieUrl = newOnboardingData.animation;
            }
            if ((i & 8) != 0) {
                str3 = newOnboardingData.positiveButtonText;
            }
            if ((i & 16) != 0) {
                function0 = newOnboardingData.onPositiveButtonClick;
            }
            Function0 function02 = function0;
            LottieUrl lottieUrl2 = lottieUrl;
            return newOnboardingData.copy(str, str2, lottieUrl2, str3, function02);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final LottieUrl getAnimation() {
            return this.animation;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        public final Function0<Unit> component5() {
            return this.onPositiveButtonClick;
        }

        public final NewOnboardingData copy(String title, String message, LottieUrl animation, String positiveButtonText, Function0<Unit> onPositiveButtonClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
            return new NewOnboardingData(title, message, animation, positiveButtonText, onPositiveButtonClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewOnboardingData)) {
                return false;
            }
            NewOnboardingData newOnboardingData = (NewOnboardingData) other;
            return Intrinsics.areEqual(this.title, newOnboardingData.title) && Intrinsics.areEqual(this.message, newOnboardingData.message) && this.animation == newOnboardingData.animation && Intrinsics.areEqual(this.positiveButtonText, newOnboardingData.positiveButtonText) && Intrinsics.areEqual(this.onPositiveButtonClick, newOnboardingData.onPositiveButtonClick);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.animation.hashCode()) * 31;
            String str = this.positiveButtonText;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.onPositiveButtonClick.hashCode();
        }

        public String toString() {
            return "NewOnboardingData(title=" + this.title + ", message=" + this.message + ", animation=" + this.animation + ", positiveButtonText=" + this.positiveButtonText + ", onPositiveButtonClick=" + this.onPositiveButtonClick + ")";
        }

        public NewOnboardingData(String title, String message, LottieUrl animation, String str, Function0<Unit> onPositiveButtonClick) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
            this.title = title;
            this.message = message;
            this.animation = animation;
            this.positiveButtonText = str;
            this.onPositiveButtonClick = onPositiveButtonClick;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final LottieUrl getAnimation() {
            return this.animation;
        }

        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        public /* synthetic */ NewOnboardingData(String str, String str2, LottieUrl lottieUrl, String str3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, lottieUrl, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetFragment$NewOnboardingData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function0);
        }

        public final Function0<Unit> getOnPositiveButtonClick() {
            return this.onPositiveButtonClick;
        }
    }

    /* compiled from: OptionOnboardingUpsellAllSetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAllSet;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingUpsellAllSetFragment, ScreenArgs.UpsellAllSet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.UpsellAllSet getArgs(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment) {
            return (ScreenArgs.UpsellAllSet) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingUpsellAllSetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingUpsellAllSetFragment newInstance(ScreenArgs.UpsellAllSet upsellAllSet) {
            return (OptionOnboardingUpsellAllSetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, upsellAllSet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingUpsellAllSetFragment optionOnboardingUpsellAllSetFragment, ScreenArgs.UpsellAllSet upsellAllSet) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingUpsellAllSetFragment, upsellAllSet);
        }
    }
}
