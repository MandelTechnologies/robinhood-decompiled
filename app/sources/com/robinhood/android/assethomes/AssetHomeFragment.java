package com.robinhood.android.assethomes;

import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.assethomes.AssetHomeEvent;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.educationtour.extensions.BaseFragments3;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.educationtour.interfaces.EducationTourCallbacks;
import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.compose.LocalityProvider;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PortfolioAccountContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.ExceptionsH;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AssetHomeFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\r\u0010$\u001a\u00020\rH\u0017¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\rH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/assethomes/AssetHomeDuxo;", "getDuxo", "()Lcom/robinhood/android/assethomes/AssetHomeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showEducationTour", "screenName", "", "onShowEducationTour", "onHideEducationTour", "Companion", "feature-asset-homes_externalDebug", "viewState", "Lcom/robinhood/android/assethomes/AssetHomeViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AssetHomeFragment extends GenericComposeFragment implements AutoLoggableFragment, EducationTourCallbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AssetHomeDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AssetHomeFragment assetHomeFragment, int i, Composer composer, int i2) {
        assetHomeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onShowEducationTour() {
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* compiled from: AssetHomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/assethomes/AssetHomeFragment;", "Lcom/robinhood/android/equities/contracts/AssetHomeContract$Key;", "<init>", "()V", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AssetHomeFragment, AssetHomeContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AssetHomeContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AssetHomeContract.Key getArgs(AssetHomeFragment assetHomeFragment) {
            return (AssetHomeContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, assetHomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AssetHomeFragment newInstance(AssetHomeContract.Key key) {
            return (AssetHomeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AssetHomeFragment assetHomeFragment, AssetHomeContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, assetHomeFragment, key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetHomeDuxo getDuxo() {
        return (AssetHomeDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ASSET_HOME, ((AssetHomeContract.Key) INSTANCE.getArgs((Fragment) this)).getAssetType().getServerValue(), null, null, 12, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        Companion companion = INSTANCE;
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, ((AssetHomeContract.Key) companion.getArgs((Fragment) this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PortfolioAccountContext(((AssetHomeContract.Key) companion.getArgs((Fragment) this)).getPortfolioAccountType(), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -131073, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C95961(null), 1, null);
    }

    /* compiled from: AssetHomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeFragment$onViewCreated$1", m3645f = "AssetHomeFragment.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.assethomes.AssetHomeFragment$onViewCreated$1 */
    static final class C95961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C95961(Continuation<? super C95961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AssetHomeFragment.this.new C95961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C95961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AssetHomeEvent>> eventFlow = AssetHomeFragment.this.getDuxo().getEventFlow();
                final AssetHomeFragment assetHomeFragment = AssetHomeFragment.this;
                FlowCollector<? super Event<AssetHomeEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.assethomes.AssetHomeFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AssetHomeEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AssetHomeEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AssetHomeEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AssetHomeFragment assetHomeFragment2 = assetHomeFragment;
                            if ((event.getData() instanceof AssetHomeEvent.ShowEducationTour) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.assethomes.AssetHomeFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m11330invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m11330invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        assetHomeFragment2.showEducationTour(((AssetHomeEvent.ShowEducationTour) event.getData()).getTourScreenName());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1877654637);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1877654637, i2, -1, "com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent (AssetHomeFragment.kt:74)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            LocalityProvider.LocalityProvider(null, ComposableLambda3.rememberComposableLambda(-31855185, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-31855185, i3, -1, "com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent.<anonymous> (AssetHomeFragment.kt:77)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, AssetHomeFragment.this.getEventScreen(), null, AssetHomeFragment.this.getScreenEventContext(), null, null, 53, null);
                    final SnapshotState4<AssetHomeViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    final AssetHomeFragment assetHomeFragment = AssetHomeFragment.this;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(798804314, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(798804314, i4, -1, "com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent.<anonymous>.<anonymous> (AssetHomeFragment.kt:83)");
                            }
                            AssetHomeState assetHomeState = AssetHomeFragment.ComposeContent$lambda$0(snapshotState4).getAssetHomeState();
                            BrokerageAccountType brokerageAccountType = AssetHomeFragment.ComposeContent$lambda$0(snapshotState4).getBrokerageAccountType();
                            final AssetHomeFragment assetHomeFragment2 = assetHomeFragment;
                            final SnapshotState4<AssetHomeViewState> snapshotState42 = snapshotState4;
                            AssetHomeEducationTourScreen.AssetHomeEducationTourScreen(assetHomeState, brokerageAccountType, null, null, ComposableLambda3.rememberComposableLambda(-2067645803, true, new Function3<LazyListState, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyListState lazyListState, Composer composer4, Integer num) {
                                    invoke(lazyListState, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyListState lazyListState, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                                    if ((i5 & 6) == 0) {
                                        i5 |= composer4.changed(lazyListState) ? 4 : 2;
                                    }
                                    if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2067645803, i5, -1, "com.robinhood.android.assethomes.AssetHomeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AssetHomeFragment.kt:87)");
                                    }
                                    AssetHomeViewState assetHomeViewStateComposeContent$lambda$0 = AssetHomeFragment.ComposeContent$lambda$0(snapshotState42);
                                    BaseActivity baseActivityRequireBaseActivity = assetHomeFragment2.requireBaseActivity();
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer4.changedInstance(baseActivityRequireBaseActivity);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new AssetHomeFragment2(baseActivityRequireBaseActivity);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    KFunction kFunction = (KFunction) objRememberedValue;
                                    composer4.endReplaceGroup();
                                    AssetHomeDuxo duxo = assetHomeFragment2.getDuxo();
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer4.changedInstance(duxo);
                                    Object objRememberedValue2 = composer4.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new AssetHomeFragment3(duxo);
                                        composer4.updateRememberedValue(objRememberedValue2);
                                    }
                                    KFunction kFunction2 = (KFunction) objRememberedValue2;
                                    composer4.endReplaceGroup();
                                    Navigator navigator = (Navigator) composer4.consume(LocalNavigator.getLocalNavigator());
                                    AssetHomeDuxo duxo2 = assetHomeFragment2.getDuxo();
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer4.changedInstance(duxo2);
                                    Object objRememberedValue3 = composer4.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new AssetHomeFragment4(duxo2);
                                        composer4.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer4.endReplaceGroup();
                                    AssetHomeComposable.AssetHomeComposable(assetHomeViewStateComposeContent$lambda$0, (Function0) ((KFunction) objRememberedValue3), (Function0) kFunction, navigator, null, lazyListState, (Function0) kFunction2, composer4, (i5 << 15) & 458752, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 24576, 12);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetHomeFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetHomeViewState ComposeContent$lambda$0(SnapshotState4<AssetHomeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEducationTour(String screenName) {
        ViewsKt.setEducationTourScreenName(getRootView(), screenName);
        BaseFragments3.showEducationTour$default(this, screenName, null, this, true, true, 2, null);
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onHideEducationTour() {
        getDuxo().onHideEducationTour();
    }
}
