package com.robinhood.android.common.gold;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationViewState;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: GoldPostUpgradeCelebrationFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0003*+,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020 H\u0016J\r\u0010(\u001a\u00020 H\u0017¢\u0006\u0002\u0010)R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationDuxo;", "getDuxo", "()Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-lib-gold_externalRelease", "viewStateFromDuxo", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GoldPostUpgradeCelebrationFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldPostUpgradeCelebrationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldPostUpgradeCelebrationDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldPostUpgradeCelebrationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final com.robinhood.rosetta.eventlogging.Context screenEventContext = new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -1, -1, -1, 16383, null);
    private final Screen eventScreen = new Screen(Screen.Name.GOLD_CELEBRATION, null, null, null, 14, null);

    /* compiled from: GoldPostUpgradeCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "", "onGoldUpgradeCelebrationAction", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onGoldUpgradeCelebrationAction(GenericAction action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(GoldPostUpgradeCelebrationFragment goldPostUpgradeCelebrationFragment, int i, Composer composer, int i2) {
        goldPostUpgradeCelebrationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    private final GoldPostUpgradeCelebrationDuxo getDuxo() {
        return (GoldPostUpgradeCelebrationDuxo) this.duxo.getValue();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return this.screenEventContext;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        UiPostTransferPage.PostTransferGoldCelebration postActionGoldCelebration = ((Args) companion.getArgs((Fragment) this)).getPostActionGoldCelebration();
        if (!(postActionGoldCelebration != null ? Intrinsics.areEqual(postActionGoldCelebration.getForceDarkMode(), Boolean.FALSE) : false)) {
            requireBaseActivity().overrideStatusBarStyle(false);
        }
        if (((Args) companion.getArgs((Fragment) this)).getPostActionGoldCelebration() == null) {
            getDuxo().fetchPostUpgradeCelebration(((Args) companion.getArgs((Fragment) this)).getFeature());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        requireBaseActivity().resetStatusBarStyleOverride();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        final GoldPostUpgradeCelebrationViewState goldPostUpgradeCelebrationViewStateComposeContent$lambda$0;
        Boolean forceDarkMode;
        Composer composerStartRestartGroup = composer.startRestartGroup(1661927920);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1661927920, i2, -1, "com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.ComposeContent (GoldPostUpgradeCelebrationFragment.kt:73)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            UiPostTransferPage.PostTransferGoldCelebration postActionGoldCelebration = ((Args) INSTANCE.getArgs((Fragment) this)).getPostActionGoldCelebration();
            if (postActionGoldCelebration != null) {
                goldPostUpgradeCelebrationViewStateComposeContent$lambda$0 = new GoldPostUpgradeCelebrationViewState.Loaded(postActionGoldCelebration);
            } else {
                goldPostUpgradeCelebrationViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String str = "";
            objectRef.element = "";
            boolean z = goldPostUpgradeCelebrationViewStateComposeContent$lambda$0 instanceof GoldPostUpgradeCelebrationViewState.Loaded;
            if (z) {
                String loggingIdentifier = ((GoldPostUpgradeCelebrationViewState.Loaded) goldPostUpgradeCelebrationViewStateComposeContent$lambda$0).getGoldCelebration().getLoggingIdentifier();
                T t = str;
                if (loggingIdentifier != null) {
                    t = loggingIdentifier;
                }
                objectRef.element = t;
            }
            BentoTheme2.BentoTheme((!z || (forceDarkMode = ((GoldPostUpgradeCelebrationViewState.Loaded) goldPostUpgradeCelebrationViewStateComposeContent$lambda$0).getGoldCelebration().getForceDarkMode()) == null) ? true : forceDarkMode.booleanValue() ? Boolean.FALSE : null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1586277064, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1586277064, i3, -1, "com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.ComposeContent.<anonymous> (GoldPostUpgradeCelebrationFragment.kt:92)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GOLD_CELEBRATION, null, objectRef.element, null, 10, null), null, this.getScreenEventContext(), null, null, 53, null);
                    final GoldPostUpgradeCelebrationViewState goldPostUpgradeCelebrationViewState = goldPostUpgradeCelebrationViewStateComposeContent$lambda$0;
                    final GoldPostUpgradeCelebrationFragment goldPostUpgradeCelebrationFragment = this;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1633221997, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(1633221997, i4, -1, "com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.ComposeContent.<anonymous>.<anonymous> (GoldPostUpgradeCelebrationFragment.kt:98)");
                            }
                            GoldPostUpgradeCelebrationViewState goldPostUpgradeCelebrationViewState2 = goldPostUpgradeCelebrationViewState;
                            Callbacks callbacks = goldPostUpgradeCelebrationFragment.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(callbacks);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldPostUpgradeCelebrationFragment2(callbacks);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            GoldPostUpgradeCelebrationComposable.GoldUpgradeCelebrationComposable(goldPostUpgradeCelebrationViewState2, (Function1) ((KFunction) objRememberedValue), null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldPostUpgradeCelebrationFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final GoldPostUpgradeCelebrationViewState ComposeContent$lambda$0(SnapshotState4<? extends GoldPostUpgradeCelebrationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: GoldPostUpgradeCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Args;", "Landroid/os/Parcelable;", "feature", "", "postActionGoldCelebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;)V", "getFeature", "()Ljava/lang/String;", "getPostActionGoldCelebration", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String feature;
        private final UiPostTransferPage.PostTransferGoldCelebration postActionGoldCelebration;

        /* compiled from: GoldPostUpgradeCelebrationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UiPostTransferPage.PostTransferGoldCelebration) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.feature;
            }
            if ((i & 2) != 0) {
                postTransferGoldCelebration = args.postActionGoldCelebration;
            }
            return args.copy(str, postTransferGoldCelebration);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final UiPostTransferPage.PostTransferGoldCelebration getPostActionGoldCelebration() {
            return this.postActionGoldCelebration;
        }

        public final Args copy(String feature, UiPostTransferPage.PostTransferGoldCelebration postActionGoldCelebration) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            return new Args(feature, postActionGoldCelebration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.feature, args.feature) && Intrinsics.areEqual(this.postActionGoldCelebration, args.postActionGoldCelebration);
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration = this.postActionGoldCelebration;
            return iHashCode + (postTransferGoldCelebration == null ? 0 : postTransferGoldCelebration.hashCode());
        }

        public String toString() {
            return "Args(feature=" + this.feature + ", postActionGoldCelebration=" + this.postActionGoldCelebration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.feature);
            dest.writeParcelable(this.postActionGoldCelebration, flags);
        }

        public Args(String feature, UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.feature = feature;
            this.postActionGoldCelebration = postTransferGoldCelebration;
        }

        public /* synthetic */ Args(String str, UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, postTransferGoldCelebration);
        }

        public final String getFeature() {
            return this.feature;
        }

        public final UiPostTransferPage.PostTransferGoldCelebration getPostActionGoldCelebration() {
            return this.postActionGoldCelebration;
        }
    }

    /* compiled from: GoldPostUpgradeCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Args;", "<init>", "()V", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldPostUpgradeCelebrationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldPostUpgradeCelebrationFragment goldPostUpgradeCelebrationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldPostUpgradeCelebrationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldPostUpgradeCelebrationFragment newInstance(Args args) {
            return (GoldPostUpgradeCelebrationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldPostUpgradeCelebrationFragment goldPostUpgradeCelebrationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldPostUpgradeCelebrationFragment, args);
        }
    }
}
