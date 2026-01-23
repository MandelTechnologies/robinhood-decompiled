package com.robinhood.android.feature.margin.hub;

import android.content.Context;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.margin.contracts.BuyingPowerHubFragmentKey;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherLocation;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BuyingPowerHubFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "getCallbacks", "()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-margin-hub_externalDebug", "viewState", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuyingPowerHubFragment extends GenericComposeFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BuyingPowerHubFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BuyingPowerHubDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SduiActionHandler.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SduiActionHandler) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(BuyingPowerHubFragment buyingPowerHubFragment, int i, Composer composer, int i2) {
        buyingPowerHubFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BUYING_POWER_HUB, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuyingPowerHubDuxo getDuxo() {
        return (BuyingPowerHubDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SduiActionHandler<BuyingPowerHubAction> getCallbacks() {
        return (SduiActionHandler) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-273008498);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273008498, i2, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent (BuyingPowerHubFragment.kt:74)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), ComposableLambda3.rememberComposableLambda(-287011502, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-287011502, i3, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent.<anonymous> (BuyingPowerHubFragment.kt:79)");
                    }
                    AppBarType appBarType = AppBarType.DEFAULT;
                    Function2<Composer, Integer, Unit> function2M14491getLambda$1750395201$feature_margin_hub_externalDebug = ComposableSingletons$BuyingPowerHubFragmentKt.INSTANCE.m14491getLambda$1750395201$feature_margin_hub_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(488819731, true, new AnonymousClass1(BuyingPowerHubFragment.this), composer2, 54);
                    final BuyingPowerHubFragment buyingPowerHubFragment = BuyingPowerHubFragment.this;
                    final SnapshotState4<BuyingPowerHubState3> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M14491getLambda$1750395201$feature_margin_hub_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-129959180, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                            invoke(row5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer3, int i4) {
                            Composer composer4;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-129959180, i4, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent.<anonymous>.<anonymous> (BuyingPowerHubFragment.kt:84)");
                            }
                            String accountNumber = ((BuyingPowerHubFragmentKey) BuyingPowerHubFragment.INSTANCE.getArgs((Fragment) buyingPowerHubFragment)).getAccountNumber();
                            if (accountNumber != null) {
                                SnapshotState4<BuyingPowerHubState3> snapshotState42 = snapshotState4;
                                composer3.startReplaceGroup(-336716968);
                                if (BuyingPowerHubFragment.ComposeContent$lambda$0(snapshotState42).getShouldShowCurrencySwitcher()) {
                                    composer4 = composer3;
                                    DisplayCurrencySwitcher.DisplayCurrencySwitcher(accountNumber, DisplayCurrencySwitcherLocation.BUYING_POWER, null, null, false, false, false, null, null, composer4, 48, 508);
                                } else {
                                    composer4 = composer3;
                                }
                                composer4.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, false, false, appBarType, null, 0L, null, composer2, 12586374, 0, 1906);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: BuyingPowerHubFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ BuyingPowerHubFragment this$0;

                    AnonymousClass1(BuyingPowerHubFragment buyingPowerHubFragment) {
                        this.this$0 = buyingPowerHubFragment;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(BuyingPowerHubFragment buyingPowerHubFragment) {
                        BaseActivity baseActivity = buyingPowerHubFragment.getBaseActivity();
                        if (baseActivity != null) {
                            baseActivity.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(488819731, i, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent.<anonymous>.<anonymous> (BuyingPowerHubFragment.kt:81)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final BuyingPowerHubFragment buyingPowerHubFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BuyingPowerHubFragment.C168161.AnonymousClass1.invoke$lambda$1$lambda$0(buyingPowerHubFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-210801635, true, new C168172(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BuyingPowerHubFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BuyingPowerHubFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuyingPowerHubState3 ComposeContent$lambda$0(SnapshotState4<? extends BuyingPowerHubState3> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: BuyingPowerHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$ComposeContent$2 */
    static final class C168172 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<BuyingPowerHubState3> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C168172(SnapshotState4<? extends BuyingPowerHubState3> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i |= composer.changed(contentPadding) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-210801635, i, -1, "com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment.ComposeContent.<anonymous> (BuyingPowerHubFragment.kt:96)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, contentPadding);
            BuyingPowerHubState3 buyingPowerHubState3ComposeContent$lambda$0 = BuyingPowerHubFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            StateFlow<Event<BuyingPowerHubEvent>> eventFlow = BuyingPowerHubFragment.this.getDuxo().getEventFlow();
            String entryPoint = ((BuyingPowerHubFragmentKey) BuyingPowerHubFragment.INSTANCE.getArgs((Fragment) BuyingPowerHubFragment.this)).getEntryPoint();
            SduiActionHandler callbacks = BuyingPowerHubFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(callbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new BuyingPowerHubFragment$ComposeContent$2$1$1(callbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            C16823x5a4c840c c16823x5a4c840c = new C16823x5a4c840c((Function1) ((KFunction) objRememberedValue));
            ActivityErrorHandler activityErrorHandler = BuyingPowerHubFragment.this.getActivityErrorHandler();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(activityErrorHandler);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new BuyingPowerHubFragment$ComposeContent$2$2$1(activityErrorHandler);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(BuyingPowerHubFragment.this);
            final BuyingPowerHubFragment buyingPowerHubFragment = BuyingPowerHubFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.feature.margin.hub.BuyingPowerHubFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BuyingPowerHubFragment.C168172.invoke$lambda$3$lambda$2(buyingPowerHubFragment, (GenericAlertContent) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BuyingPowerHubFragmentKt.BuyingPowerHubScreen(buyingPowerHubState3ComposeContent$lambda$0, eventFlow, entryPoint, c16823x5a4c840c, (Function1) objRememberedValue3, (Function1) kFunction, modifierPadding, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(BuyingPowerHubFragment buyingPowerHubFragment, GenericAlertContent alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager childFragmentManager = buyingPowerHubFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            sduiAlert.presentGenericAlertSheet(childFragmentManager, alert);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(BuyingPowerHubFragment buyingPowerHubFragment) {
        AppCompatActivity appCompatActivityFindActivityBaseContext;
        ActionBar supportActionBar;
        FragmentActivity activity = buyingPowerHubFragment.getActivity();
        if (activity != null && (appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(activity)) != null && (supportActionBar = appCompatActivityFindActivityBaseContext.getSupportActionBar()) != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BuyingPowerHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubFragment;", "Lcom/robinhood/android/margin/contracts/BuyingPowerHubFragmentKey;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<BuyingPowerHubFragment, BuyingPowerHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(BuyingPowerHubFragmentKey buyingPowerHubFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, buyingPowerHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BuyingPowerHubFragmentKey getArgs(BuyingPowerHubFragment buyingPowerHubFragment) {
            return (BuyingPowerHubFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, buyingPowerHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BuyingPowerHubFragment newInstance(BuyingPowerHubFragmentKey buyingPowerHubFragmentKey) {
            return (BuyingPowerHubFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, buyingPowerHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BuyingPowerHubFragment buyingPowerHubFragment, BuyingPowerHubFragmentKey buyingPowerHubFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, buyingPowerHubFragment, buyingPowerHubFragmentKey);
        }
    }
}
