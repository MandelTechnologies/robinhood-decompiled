package com.robinhood.android.investmentstracker;

import accio.service.p003v1.PurposeDto;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.FastOpenPlaidLink;
import com.plaid.link.PlaidHandler;
import com.plaid.link.result.LinkResult;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.investmentstracker.InvestmentsTrackerFragment;
import com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRenderer;
import com.robinhood.android.investmentstracker.composables.InvestmentsTrackerEvent;
import com.robinhood.android.investmentstracker.composables.InvestmentsTrackerToolbar;
import com.robinhood.android.investmentstracker.composables.OnboardingScreen5;
import com.robinhood.android.investmentstracker.composables.components.AddAccountAgreementOverlay;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBar4;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceHeader4;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerSwitcher4;
import com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.contracts.InvestmentsTrackerAccountLinkingKey;
import com.robinhood.android.transfers.contracts.InvestmentsTrackerKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.account.contracts.AccountNavigationTabFragmentKey;
import com.robinhood.udf.UiEvent;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0016J\u0017\u0010(\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J\u001a\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\r\u00101\u001a\u00020\u001fH\u0017¢\u0006\u0002\u00102R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\f\u00107\u001a\u0004\u0018\u000100X\u008a\u008e\u0002²\u0006\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "onboardingSeen", "Lcom/robinhood/prefs/BooleanPreference;", "getOnboardingSeen", "()Lcom/robinhood/prefs/BooleanPreference;", "setOnboardingSeen", "(Lcom/robinhood/prefs/BooleanPreference;)V", "duxo", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo;", "getDuxo", "()Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "secondPageExoPlayer", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/plaid/link/PlaidHandler;", "kotlin.jvm.PlatformType", "oldLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "LoadingView", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "sendLogStatements", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "analyticsData", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-investments-tracker_externalDebug", "viewState", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerViewState;", "previousAnalyticsStateData", "scrollOffsetStack", "", "Lcom/robinhood/android/investmentstracker/ScrollInfo;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentsTrackerFragment extends GenericComposeFragment {
    private static final int ANIMATION_DIRECTION = 350;
    private ExoPlayer exoPlayer;
    private final ActivityResultLauncher<PlaidHandler> launcher;
    private final ActivityResultLauncher<PlaidHandler> oldLauncher;

    @InvestmentsTrackerPreferences
    public BooleanPreference onboardingSeen;
    private ExoPlayer secondPageExoPlayer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InvestmentsTrackerDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(InvestmentsTrackerFragment investmentsTrackerFragment, int i, Composer composer, int i2) {
        investmentsTrackerFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingView$lambda$3(InvestmentsTrackerFragment investmentsTrackerFragment, Modifier modifier, int i, int i2, Composer composer, int i3) {
        investmentsTrackerFragment.LoadingView(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentsTrackerViewState ComposeContent$lambda$5(SnapshotState4<InvestmentsTrackerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final InvestmentsTrackerAnalyticsStateData ComposeContent$lambda$7(SnapshotState<InvestmentsTrackerAnalyticsStateData> snapshotState) {
        return snapshotState.getValue();
    }

    public InvestmentsTrackerFragment() {
        ActivityResultLauncher<PlaidHandler> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new FastOpenPlaidLink(), new ActivityResultCallback() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$launcher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(LinkResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.this$0.getDuxo().handlePlaidCallback(result, this.this$0.getActivityErrorHandler(), this.this$0.getDuxo().getStateFlow().getValue().getUsingUpdateMode(), this.this$0.getDuxo().getStateFlow().getValue().getUpdateModeAccountLinkId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launcher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PlaidHandler> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new FastOpenPlaidLink(), new InvestmentsTrackerFragment$oldLauncher$1(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.oldLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    public final BooleanPreference getOnboardingSeen() {
        BooleanPreference booleanPreference = this.onboardingSeen;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onboardingSeen");
        return null;
    }

    public final void setOnboardingSeen(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.onboardingSeen = booleanPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestmentsTrackerDuxo getDuxo() {
        return (InvestmentsTrackerDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(contextRequireContext, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C194962(null), 3, null);
    }

    /* compiled from: InvestmentsTrackerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2", m3645f = "InvestmentsTrackerFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2 */
    static final class C194962 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C194962(Continuation<? super C194962> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentsTrackerFragment.this.new C194962(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C194962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InvestmentsTrackerFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1", m3645f = "InvestmentsTrackerFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<InvestmentsTrackerEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InvestmentsTrackerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentsTrackerFragment investmentsTrackerFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = investmentsTrackerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<InvestmentsTrackerEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                EventConsumer eventConsumer3;
                EventConsumer eventConsumer4;
                EventConsumer eventConsumer5;
                EventConsumer eventConsumer6;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final InvestmentsTrackerFragment investmentsTrackerFragment = this.this$0;
                    if ((event.getData() instanceof InvestmentsTrackerEvent.Deeplink) && (eventConsumer6 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer6.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15548invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15548invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InvestmentsTrackerEvent.Deeplink deeplink = (InvestmentsTrackerEvent.Deeplink) event.getData();
                                Navigator navigator = investmentsTrackerFragment.getNavigator();
                                Context contextRequireContext = investmentsTrackerFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(deeplink.getUri()), null, null, false, null, 60, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final InvestmentsTrackerFragment investmentsTrackerFragment2 = this.this$0;
                    if ((event.getData() instanceof InvestmentsTrackerEvent.OldPlaid) && (eventConsumer5 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer5.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15549invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15549invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InvestmentsTrackerDuxo duxo = investmentsTrackerFragment2.getDuxo();
                                FragmentActivity fragmentActivityRequireActivity = investmentsTrackerFragment2.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                DuxoExtensions.DefaultImpls.startPlaid$default(duxo, fragmentActivityRequireActivity, investmentsTrackerFragment2.launcher, PurposeDto.PURPOSE_INVESTMENT_TRACKING, null, 8, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final InvestmentsTrackerFragment investmentsTrackerFragment3 = this.this$0;
                    if ((event.getData() instanceof InvestmentsTrackerEvent.Plaid) && (eventConsumer4 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer4.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15550invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15550invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InvestmentsTrackerEvent.Plaid plaid = (InvestmentsTrackerEvent.Plaid) event.getData();
                                InvestmentsTrackerDuxo duxo = investmentsTrackerFragment3.getDuxo();
                                FragmentActivity fragmentActivityRequireActivity = investmentsTrackerFragment3.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                duxo.startPlaid(fragmentActivityRequireActivity, investmentsTrackerFragment3.launcher, PurposeDto.PURPOSE_INVESTMENT_TRACKING, plaid.getInstitutionId());
                            }
                        });
                    }
                }
                if (event != null) {
                    final InvestmentsTrackerFragment investmentsTrackerFragment4 = this.this$0;
                    if ((event.getData() instanceof InvestmentsTrackerEvent.NavigateToTransfers) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15551invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15551invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator navigator = investmentsTrackerFragment4.getNavigator();
                                Context contextRequireContext = investmentsTrackerFragment4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, InvestmentsTrackerFragment.INSTANCE.getTRANSFERS_ITEM_DEEPLINK(), null, null, false, null, 60, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final InvestmentsTrackerFragment investmentsTrackerFragment5 = this.this$0;
                    if ((event.getData() instanceof InvestmentsTrackerEvent.NavigateToAccountsList) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15552invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15552invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator navigator = investmentsTrackerFragment5.getNavigator();
                                Context contextRequireContext = investmentsTrackerFragment5.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new InvestmentsTrackerAccountLinkingKey(), false, false, false, false, null, false, null, null, 1020, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final InvestmentsTrackerFragment investmentsTrackerFragment6 = this.this$0;
                    if ((event.getData() instanceof InvestmentsTrackerEvent.SetupExoPlayer) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$onCreate$2$1$invokeSuspend$$inlined$consumeIfType$6
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15553invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15553invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                InvestmentsTrackerEvent.SetupExoPlayer setupExoPlayer = (InvestmentsTrackerEvent.SetupExoPlayer) event.getData();
                                ExoPlayer exoPlayer = investmentsTrackerFragment6.exoPlayer;
                                if (exoPlayer != null) {
                                    exoPlayer.setMediaItem(MediaItem.fromUri(Uri.parse(setupExoPlayer.getFirstUrl())));
                                }
                                ExoPlayer exoPlayer2 = investmentsTrackerFragment6.secondPageExoPlayer;
                                if (exoPlayer2 != null) {
                                    exoPlayer2.setMediaItem(MediaItem.fromUri(Uri.parse(setupExoPlayer.getSecondUrl())));
                                }
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<InvestmentsTrackerEvent>> eventFlow = InvestmentsTrackerFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InvestmentsTrackerFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getOnboardingSeen().get()) {
            return;
        }
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(requireContext()).build();
        exoPlayerBuild.prepare();
        exoPlayerBuild.setRepeatMode(2);
        exoPlayerBuild.setPlayWhenReady(true);
        exoPlayerBuild.setVideoScalingMode(1);
        this.exoPlayer = exoPlayerBuild;
        exoPlayerBuild.addListener(new Player.Listener() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.onViewCreated.2
            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                super.onAudioAttributesChanged(audioAttributes);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
                super.onAudioSessionIdChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                super.onAvailableCommandsChanged(commands);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
                super.onCues(cueGroup);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
                super.onCues((List<Cue>) list);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                super.onDeviceInfoChanged(deviceInfo);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                super.onDeviceVolumeChanged(i, z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                super.onEvents(player, events);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                super.onIsLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                super.onLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                super.onMaxSeekToPreviousPositionChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                super.onMediaItemTransition(mediaItem, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                super.onMediaMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
                super.onMetadata(metadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                super.onPlayWhenReadyChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                super.onPlaybackParametersChanged(playbackParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
                super.onPlaybackStateChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                super.onPlaybackSuppressionReasonChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                super.onPlayerError(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                super.onPlayerErrorChanged(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                super.onPlayerStateChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                super.onPlaylistMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                super.onPositionDiscontinuity(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                super.onPositionDiscontinuity(positionInfo, positionInfo2, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                super.onRepeatModeChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
                super.onSeekBackIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                super.onSeekForwardIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                super.onShuffleModeEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                super.onSkipSilenceEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                super.onSurfaceSizeChanged(i, i2);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                super.onTimelineChanged(timeline, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                super.onTrackSelectionParametersChanged(trackSelectionParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
                super.onTracksChanged(tracks);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                super.onVideoSizeChanged(videoSize);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
                super.onVolumeChanged(f);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onIsPlayingChanged(boolean isPlaying) {
                super.onIsPlayingChanged(isPlaying);
                InvestmentsTrackerFragment.this.getDuxo().exoPlayerLoaded();
            }
        });
        ExoPlayer exoPlayerBuild2 = new ExoPlayer.Builder(requireContext()).build();
        exoPlayerBuild2.prepare();
        exoPlayerBuild2.setRepeatMode(2);
        exoPlayerBuild2.setPlayWhenReady(true);
        exoPlayerBuild2.setVideoScalingMode(1);
        this.secondPageExoPlayer = exoPlayerBuild2;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    public final void LoadingView(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-929965764);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-929965764, i3, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.LoadingView (InvestmentsTrackerFragment.kt:225)");
            }
            int i5 = ((i3 << 3) & 112) | 3078;
            Modifier modifier2 = modifier;
            LocalShowPlaceholder.Loadable(true, modifier2, null, ComposableSingletons$InvestmentsTrackerFragmentKt.INSTANCE.m15543getLambda$241969748$feature_investments_tracker_externalDebug(), composerStartRestartGroup, i5, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerFragment.LoadingView$lambda$3(this.f$0, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void sendLogStatements(EventLogger eventLogger, InvestmentsTrackerAnalyticsStateData analyticsData) {
        if (analyticsData != null) {
            if (analyticsData.getInHomeExperience()) {
                if (analyticsData.getInAllocationsView()) {
                    EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.INVESTMENTS_TRACKER_ALLOCATIONS_VIEW, null, null, null, 14, null), null, null, null, 29, null);
                } else {
                    EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.INVESTMENTS_TRACKER_PERFORMANCE_VIEW, null, null, null, 14, null), null, null, null, 29, null);
                }
            }
            if (analyticsData.getInAccountExperience()) {
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(null, new Screen(Screen.Name.INVESTMENTS_TRACKER_ACCOUNT_DETAILS, null, null, null, 14, null), null, null, null, null, null, 125, null), false, false, 6, null);
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1514364381);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1514364381, i2, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent (InvestmentsTrackerFragment.kt:290)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final OnboardingViewModel onboardingData = ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getOnboardingData();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(689753502);
            if (!Intrinsics.areEqual(ComposeContent$lambda$7(snapshotState), ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getAnalyticsState())) {
                snapshotState.setValue(ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getAnalyticsState());
                sendLogStatements(AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getAnalyticsState());
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1639448027, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.1

                /* compiled from: InvestmentsTrackerFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ OnboardingViewModel $onboardingData;
                    final /* synthetic */ SnapshotState4<InvestmentsTrackerViewState> $viewState$delegate;
                    final /* synthetic */ InvestmentsTrackerFragment this$0;

                    AnonymousClass1(SnapshotState4<InvestmentsTrackerViewState> snapshotState4, InvestmentsTrackerFragment investmentsTrackerFragment, OnboardingViewModel onboardingViewModel) {
                        this.$viewState$delegate = snapshotState4;
                        this.this$0 = investmentsTrackerFragment;
                        this.$onboardingData = onboardingViewModel;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List<ScrollInfo> invoke$lambda$2(SnapshotState<List<ScrollInfo>> snapshotState) {
                        return snapshotState.getValue();
                    }

                    /* compiled from: InvestmentsTrackerFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C502281 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<InvestmentsTrackerViewState> $viewState$delegate;
                        final /* synthetic */ InvestmentsTrackerFragment this$0;

                        C502281(InvestmentsTrackerFragment investmentsTrackerFragment, SnapshotState4<InvestmentsTrackerViewState> snapshotState4) {
                            this.this$0 = investmentsTrackerFragment;
                            this.$viewState$delegate = snapshotState4;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1399878678, i, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerFragment.kt:313)");
                            }
                            final InvestmentsTrackerFragment investmentsTrackerFragment = this.this$0;
                            SnapshotState4<InvestmentsTrackerViewState> snapshotState4 = this.$viewState$delegate;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String navigationTitle = InvestmentsTrackerFragment.ComposeContent$lambda$5(snapshotState4).getNavigationTitle();
                            boolean showHomeHeader = InvestmentsTrackerFragment.ComposeContent$lambda$5(snapshotState4).getShowHomeHeader();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(investmentsTrackerFragment);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentsTrackerFragment.C194951.AnonymousClass1.C502281.invoke$lambda$15$lambda$1$lambda$0(investmentsTrackerFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(investmentsTrackerFragment);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentsTrackerFragment.C194951.AnonymousClass1.C502281.invoke$lambda$15$lambda$3$lambda$2(investmentsTrackerFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function02 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(investmentsTrackerFragment);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentsTrackerFragment.C194951.AnonymousClass1.C502281.invoke$lambda$15$lambda$5$lambda$4(investmentsTrackerFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function03 = (Function0) objRememberedValue3;
                            composer.endReplaceGroup();
                            Composer composer2 = composer;
                            InvestmentsTrackerToolbar.InvestmentsTrackerToolbar(function0, function02, function03, null, navigationTitle, showHomeHeader, composer2, 0, 8);
                            InvestmentsTrackerPerformanceHeaderViewModel headerInfo = InvestmentsTrackerFragment.ComposeContent$lambda$5(snapshotState4).getHeaderInfo();
                            composer.startReplaceGroup(-424264098);
                            if (headerInfo != null) {
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance4 = composer.changedInstance(investmentsTrackerFragment);
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestmentsTrackerFragment.C194951.AnonymousClass1.C502281.invoke$lambda$15$lambda$10$lambda$7$lambda$6(investmentsTrackerFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                Function0 function04 = (Function0) objRememberedValue4;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance5 = composer.changedInstance(investmentsTrackerFragment);
                                Object objRememberedValue5 = composer.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestmentsTrackerFragment.C194951.AnonymousClass1.C502281.invoke$lambda$15$lambda$10$lambda$9$lambda$8(investmentsTrackerFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue5);
                                }
                                composer.endReplaceGroup();
                                InvestmentsTrackerPerformanceHeader4.InvestmentsTrackerPerformanceHeader(headerInfo, function04, (Function0) objRememberedValue5, Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 0, 0);
                                composer2 = composer;
                            }
                            composer.endReplaceGroup();
                            InvestmentsTrackerSwitcherViewModel switcherData = InvestmentsTrackerFragment.ComposeContent$lambda$5(snapshotState4).getSwitcherData();
                            composer.startReplaceGroup(-424243259);
                            if (switcherData != null) {
                                Object duxo = investmentsTrackerFragment.getDuxo();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance6 = composer.changedInstance(duxo);
                                Object objRememberedValue6 = composer.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new InvestmentsTrackerFragment$ComposeContent$1$1$1$1$5$1$1(duxo);
                                    composer.updateRememberedValue(objRememberedValue6);
                                }
                                composer.endReplaceGroup();
                                InvestmentsTrackerSwitcher4.InvestmentsTrackerSwitcher(switcherData, (Function2) ((KFunction) objRememberedValue6), Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                            }
                            composer.endReplaceGroup();
                            InvestmentsTrackerAllocationsBarViewModel allocationBarData = InvestmentsTrackerFragment.ComposeContent$lambda$5(snapshotState4).getAllocationBarData();
                            composer.startReplaceGroup(-424229973);
                            if (allocationBarData != null) {
                                Object duxo2 = investmentsTrackerFragment.getDuxo();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance7 = composer.changedInstance(duxo2);
                                Object objRememberedValue7 = composer.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new InvestmentsTrackerFragment$ComposeContent$1$1$1$1$6$1$1(duxo2);
                                    composer.updateRememberedValue(objRememberedValue7);
                                }
                                composer.endReplaceGroup();
                                InvestmentsTrackerAllocationsBar4.InvestmentsTrackerAllocationsBar(allocationBarData, (Function2) ((KFunction) objRememberedValue7), Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$15$lambda$1$lambda$0(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            Navigator navigator = investmentsTrackerFragment.getNavigator();
                            Context contextRequireContext = investmentsTrackerFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountNavigationTabFragmentKey(false, false, null, null, 15, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$15$lambda$3$lambda$2(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            Navigator navigator = investmentsTrackerFragment.getNavigator();
                            Context contextRequireContext = investmentsTrackerFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$15$lambda$5$lambda$4(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            investmentsTrackerFragment.getDuxo().backSelected();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$15$lambda$10$lambda$7$lambda$6(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            investmentsTrackerFragment.getDuxo().securityHeaderClicked();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$15$lambda$10$lambda$9$lambda$8(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            investmentsTrackerFragment.getDuxo().infoClicked();
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void invoke$lambda$3(SnapshotState<List<ScrollInfo>> snapshotState, List<ScrollInfo> list) {
                        snapshotState.setValue(list);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final SnapshotState invoke$lambda$1$lambda$0() {
                        return SnapshotState3.mutableStateOf$default(CollectionsKt.listOf(new ScrollInfo(0, 0)), null, 2, null);
                    }

                    /* compiled from: InvestmentsTrackerFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<InvestmentsTrackerViewState> $viewState$delegate;
                        final /* synthetic */ InvestmentsTrackerFragment this$0;

                        AnonymousClass2(InvestmentsTrackerFragment investmentsTrackerFragment, SnapshotState4<InvestmentsTrackerViewState> snapshotState4) {
                            this.this$0 = investmentsTrackerFragment;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            investmentsTrackerFragment.getDuxo().onboardingContinueClicked();
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1321757589, i, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerFragment.kt:362)");
                            }
                            if (InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getOnboardingBottomSheetPagePopupData() != null) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.startReplaceGroup(1101283528);
                            if (InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getOnboardingData() != null) {
                                String onboardingButtonText = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getOnboardingButtonText();
                                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), new UserInteractionEventDescriptor(null, null, null, null, new Component(null, "InvestmentsTracker_FTUX_OK", null, 5, null), null, 47, null), true, false, false, true, false, null, 108, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final InvestmentsTrackerFragment investmentsTrackerFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(investmentsTrackerFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, onboardingButtonText, modifierAutoLogEvents$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceGroup();
                                return;
                            }
                            composer.endReplaceGroup();
                            if (InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getComponents().isEmpty()) {
                                composer.startReplaceGroup(-218735379);
                                LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$InvestmentsTrackerFragmentKt.INSTANCE.m15542getLambda$1000360882$feature_investments_tracker_externalDebug(), composer, 3078, 6);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-218141853);
                                String strStringResource = StringResources_androidKt.stringResource(C19501R.string.transfer, composer, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                BentoButtons.Type type3 = BentoButtons.Type.Primary;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                                final InvestmentsTrackerFragment investmentsTrackerFragment2 = this.this$0;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(investmentsTrackerFragment2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource, modifierFillMaxWidth$default, null, type3, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, textM, false, null, composer, 24576, 0, 6760);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(InvestmentsTrackerFragment investmentsTrackerFragment) {
                            investmentsTrackerFragment.getDuxo().transferClicked();
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: InvestmentsTrackerFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ boolean $addingScreen;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ OnboardingViewModel $onboardingData;
                        final /* synthetic */ boolean $poppingScreen;
                        final /* synthetic */ SnapshotState<List<ScrollInfo>> $scrollOffsetStack$delegate;
                        final /* synthetic */ SnapshotState4<InvestmentsTrackerViewState> $viewState$delegate;
                        final /* synthetic */ InvestmentsTrackerFragment this$0;

                        AnonymousClass3(OnboardingViewModel onboardingViewModel, InvestmentsTrackerFragment investmentsTrackerFragment, boolean z, boolean z2, SnapshotState4<InvestmentsTrackerViewState> snapshotState4, SnapshotState<List<ScrollInfo>> snapshotState, EventLogger eventLogger) {
                            this.$onboardingData = onboardingViewModel;
                            this.this$0 = investmentsTrackerFragment;
                            this.$addingScreen = z;
                            this.$poppingScreen = z2;
                            this.$viewState$delegate = snapshotState4;
                            this.$scrollOffsetStack$delegate = snapshotState;
                            this.$eventLogger = eventLogger;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$5$lambda$4$lambda$0(int i) {
                            return i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$5$lambda$4$lambda$1(int i) {
                            return -i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$5$lambda$4$lambda$2(int i) {
                            return -i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$5$lambda$4$lambda$3(int i) {
                            return i;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues padding, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(padding, "padding");
                            if ((i & 6) == 0) {
                                i2 = (composer.changed(padding) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1233636917, i2, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerFragment.kt:416)");
                            }
                            if (this.$onboardingData != null) {
                                composer.startReplaceGroup(-757682906);
                                OnboardingScreen5.OnboardingScreen(this.$onboardingData, PaddingKt.padding(Modifier.INSTANCE, padding), InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getShowExoPlayer(), this.this$0.exoPlayer, this.this$0.secondPageExoPlayer, this.this$0.requireContext(), composer, 0, 0);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-756972200);
                                ImmutableList<InvestmentsTrackerComponent> components = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getComponents();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(this.$addingScreen) | composer.changed(this.$poppingScreen);
                                final boolean z = this.$addingScreen;
                                final boolean z2 = this.$poppingScreen;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.invoke$lambda$5$lambda$4(z, z2, (AnimatedContentTransitionScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AnimatedContentKt.AnimatedContent(components, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1175163498, true, new AnonymousClass2(this.this$0, padding, this.$scrollOffsetStack$delegate, this.$viewState$delegate, this.$eventLogger), composer, 54), composer, 1572864, 58);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final ContentTransform invoke$lambda$5$lambda$4(boolean z, boolean z2, AnimatedContentTransitionScope AnimatedContent) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (z) {
                                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(InvestmentsTrackerFragment.ANIMATION_DIRECTION, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.invoke$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                                    }
                                }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(InvestmentsTrackerFragment.ANIMATION_DIRECTION, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.invoke$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                                    }
                                }));
                            }
                            if (z2) {
                                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(InvestmentsTrackerFragment.ANIMATION_DIRECTION, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.invoke$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
                                    }
                                }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(InvestmentsTrackerFragment.ANIMATION_DIRECTION, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.invoke$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
                                    }
                                }));
                            }
                            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                        }

                        /* compiled from: InvestmentsTrackerFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function4<AnimatedContentScope, ImmutableList<? extends InvestmentsTrackerComponent>, Composer, Integer, Unit> {
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ PaddingValues $padding;
                            final /* synthetic */ SnapshotState<List<ScrollInfo>> $scrollOffsetStack$delegate;
                            final /* synthetic */ SnapshotState4<InvestmentsTrackerViewState> $viewState$delegate;
                            final /* synthetic */ InvestmentsTrackerFragment this$0;

                            AnonymousClass2(InvestmentsTrackerFragment investmentsTrackerFragment, PaddingValues paddingValues, SnapshotState<List<ScrollInfo>> snapshotState, SnapshotState4<InvestmentsTrackerViewState> snapshotState4, EventLogger eventLogger) {
                                this.this$0 = investmentsTrackerFragment;
                                this.$padding = paddingValues;
                                this.$scrollOffsetStack$delegate = snapshotState;
                                this.$viewState$delegate = snapshotState4;
                                this.$eventLogger = eventLogger;
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ImmutableList<? extends InvestmentsTrackerComponent> immutableList, Composer composer, Integer num) {
                                invoke(animatedContentScope, immutableList, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedContentScope AnimatedContent, ImmutableList<? extends InvestmentsTrackerComponent> state, Composer composer, int i) {
                                boolean z;
                                Composer composer2 = composer;
                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                Intrinsics.checkNotNullParameter(state, "state");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1175163498, i, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerFragment.kt:450)");
                                }
                                if (InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getComponents().isEmpty() || InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getShowLoadingPage()) {
                                    z = false;
                                    composer2.startReplaceGroup(-1017233665);
                                    this.this$0.LoadingView(null, composer2, 0, 1);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-1017082695);
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, this.$padding);
                                    InvestmentsTrackerDuxo duxo = this.this$0.getDuxo();
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer2.changedInstance(duxo);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new InvestmentsTrackerFragment$ComposeContent$1$1$3$2$1$1(duxo);
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    KFunction kFunction = (KFunction) objRememberedValue;
                                    composer2.endReplaceGroup();
                                    InvestmentsTrackerDuxo duxo2 = this.this$0.getDuxo();
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer2.changedInstance(duxo2);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new InvestmentsTrackerFragment$ComposeContent$1$1$3$2$2$1(duxo2);
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    KFunction kFunction2 = (KFunction) objRememberedValue2;
                                    composer2.endReplaceGroup();
                                    SduiActionHandler<PerformanceChartAction> sduiActionHandler = new SduiActionHandler<PerformanceChartAction>() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.1.1.3.2.3
                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                        /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                                        public boolean mo15941handle(PerformanceChartAction action) {
                                            Intrinsics.checkNotNullParameter(action, "action");
                                            return true;
                                        }
                                    };
                                    InvestmentsTrackerDuxo duxo3 = this.this$0.getDuxo();
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer2.changedInstance(duxo3);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new InvestmentsTrackerFragment$ComposeContent$1$1$3$2$4$1(duxo3);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    KFunction kFunction3 = (KFunction) objRememberedValue3;
                                    composer2.endReplaceGroup();
                                    ScrollInfo scrollInfo = (ScrollInfo) CollectionsKt.lastOrNull(AnonymousClass1.invoke$lambda$2(this.$scrollOffsetStack$delegate));
                                    int firstItemIndex = scrollInfo != null ? scrollInfo.getFirstItemIndex() : 0;
                                    ScrollInfo scrollInfo2 = (ScrollInfo) CollectionsKt.lastOrNull(AnonymousClass1.invoke$lambda$2(this.$scrollOffsetStack$delegate));
                                    int scrollOffset = scrollInfo2 != null ? scrollInfo2.getScrollOffset() : 0;
                                    Function2 function2 = (Function2) kFunction;
                                    Function2 function22 = (Function2) kFunction2;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged = composer2.changed(this.$scrollOffsetStack$delegate);
                                    final SnapshotState<List<ScrollInfo>> snapshotState = this.$scrollOffsetStack$delegate;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$4$lambda$3(snapshotState, ((Integer) obj).intValue());
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue4;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer2.changed(this.$scrollOffsetStack$delegate);
                                    final SnapshotState<List<ScrollInfo>> snapshotState2 = this.$scrollOffsetStack$delegate;
                                    Object objRememberedValue5 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$6$lambda$5(snapshotState2, ((Integer) obj).intValue());
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer2.endReplaceGroup();
                                    z = false;
                                    InvestmentsTrackerComponentRenderer.InvestmentsTrackerComponentRenderer(state, firstItemIndex, scrollOffset, function2, function22, sduiActionHandler, function1, (Function1) objRememberedValue5, (Function1) kFunction3, modifierPadding, composer, (i >> 3) & 14, 0);
                                    composer2 = composer;
                                    composer2.endReplaceGroup();
                                }
                                InvestmentsTrackerOnboardingSecondPageDto onboardingBottomSheetPagePopupData = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getOnboardingBottomSheetPagePopupData();
                                composer2.startReplaceGroup(244361419);
                                if (onboardingBottomSheetPagePopupData != null) {
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final InvestmentsTrackerFragment investmentsTrackerFragment = this.this$0;
                                    SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer2, 6, 2);
                                    composer2.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composer2.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                        objRememberedValue6 = new RhModalBottomSheet5(sheetStateRememberModalBottomSheetState, investmentsTrackerFragment.getLifecycleScope(), new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$13$lambda$8$lambda$7(investmentsTrackerFragment);
                                            }
                                        });
                                        composer2.updateRememberedValue(objRememberedValue6);
                                    }
                                    RhModalBottomSheet5 rhModalBottomSheet5 = (RhModalBottomSheet5) objRememberedValue6;
                                    composer2.endReplaceGroup();
                                    final UserInteractionEventData userInteractionEventData = new UserInteractionEventData(null, null, new Component(null, "InvestmentsTracker_FTUX_CONTINUE", null, 5, null), null, null, null, null, 123, null);
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                    String title = onboardingBottomSheetPagePopupData.getTitle();
                                    String disclosure_metadata = onboardingBottomSheetPagePopupData.getDisclosure_metadata();
                                    String primary_button_text = onboardingBottomSheetPagePopupData.getPrimary_button_text();
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance4 = composer2.changedInstance(eventLogger) | composer2.changedInstance(userInteractionEventData) | composer2.changedInstance(investmentsTrackerFragment);
                                    Object objRememberedValue7 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue7 == companion.getEmpty()) {
                                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$13$lambda$10$lambda$9(eventLogger, userInteractionEventData, investmentsTrackerFragment, (RhModalBottomSheet5) obj);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue7);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue7;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance5 = composer2.changedInstance(eventLogger) | composer2.changedInstance(userInteractionEventData) | composer2.changedInstance(investmentsTrackerFragment);
                                    Object objRememberedValue8 = composer2.rememberedValue();
                                    if (zChangedInstance5 || objRememberedValue8 == companion.getEmpty()) {
                                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$13$lambda$12$lambda$11(eventLogger, userInteractionEventData, investmentsTrackerFragment);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue8);
                                    }
                                    composer2.endReplaceGroup();
                                    RhContentBottomSheet2.RhContentBottomSheet(title, disclosure_metadata, primary_button_text, function12, (Function0) objRememberedValue8, modifierAutoLogEvents$default, null, null, null, false, sheetStateRememberModalBottomSheetState, rhModalBottomSheet5, composer2, 14155776, RhModalBottomSheet5.$stable << 3, 768);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                InvestmentsTrackerTooltipDataDto infoSheetData = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getInfoSheetData();
                                if (infoSheetData != null) {
                                    final EventLogger eventLogger2 = this.$eventLogger;
                                    final InvestmentsTrackerFragment investmentsTrackerFragment2 = this.this$0;
                                    SheetState sheetStateRememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer2, 6, 2);
                                    composer2.startReplaceGroup(1849434622);
                                    Object objRememberedValue9 = composer2.rememberedValue();
                                    Composer.Companion companion2 = Composer.INSTANCE;
                                    if (objRememberedValue9 == companion2.getEmpty()) {
                                        objRememberedValue9 = new RhModalBottomSheet5(sheetStateRememberModalBottomSheetState2, investmentsTrackerFragment2.getLifecycleScope(), new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$20$lambda$15$lambda$14(investmentsTrackerFragment2);
                                            }
                                        });
                                        composer2.updateRememberedValue(objRememberedValue9);
                                    }
                                    RhModalBottomSheet5 rhModalBottomSheet52 = (RhModalBottomSheet5) objRememberedValue9;
                                    composer2.endReplaceGroup();
                                    final Screen screen = new Screen(Screen.Name.INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT, null, null, null, 14, null);
                                    EventLogger.DefaultImpls.logAppear$default(eventLogger2, null, screen, null, null, null, 29, null);
                                    String title2 = infoSheetData.getTitle();
                                    String description = infoSheetData.getDescription();
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0);
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance6 = composer2.changedInstance(eventLogger2) | composer2.changedInstance(screen) | composer2.changedInstance(investmentsTrackerFragment2);
                                    Object objRememberedValue10 = composer2.rememberedValue();
                                    if (zChangedInstance6 || objRememberedValue10 == companion2.getEmpty()) {
                                        objRememberedValue10 = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$20$lambda$17$lambda$16(eventLogger2, screen, investmentsTrackerFragment2, (RhModalBottomSheet5) obj);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue10);
                                    }
                                    Function1 function13 = (Function1) objRememberedValue10;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance7 = composer2.changedInstance(eventLogger2) | composer2.changedInstance(screen) | composer2.changedInstance(investmentsTrackerFragment2);
                                    Object objRememberedValue11 = composer2.rememberedValue();
                                    if (zChangedInstance7 || objRememberedValue11 == companion2.getEmpty()) {
                                        objRememberedValue11 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$3$2$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InvestmentsTrackerFragment.C194951.AnonymousClass1.AnonymousClass3.AnonymousClass2.invoke$lambda$20$lambda$19$lambda$18(eventLogger2, screen, investmentsTrackerFragment2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer2.endReplaceGroup();
                                    RhContentBottomSheet2.RhContentBottomSheet(title2, description, strStringResource, function13, (Function0) objRememberedValue11, null, null, null, null, false, sheetStateRememberModalBottomSheetState2, rhModalBottomSheet52, composer2, 14155776, RhModalBottomSheet5.$stable << 3, 800);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, int i) {
                                if (AnonymousClass1.invoke$lambda$2(snapshotState).size() > 0) {
                                    List listSubList = AnonymousClass1.invoke$lambda$2(snapshotState).subList(0, AnonymousClass1.invoke$lambda$2(snapshotState).size() - 1);
                                    ScrollInfo scrollInfo = (ScrollInfo) CollectionsKt.lastOrNull(AnonymousClass1.invoke$lambda$2(snapshotState));
                                    AnonymousClass1.invoke$lambda$3(snapshotState, CollectionsKt.plus((Collection<? extends ScrollInfo>) listSubList, new ScrollInfo(i, scrollInfo != null ? scrollInfo.getScrollOffset() : 0)));
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState, int i) {
                                if (AnonymousClass1.invoke$lambda$2(snapshotState).size() > 0) {
                                    List listSubList = AnonymousClass1.invoke$lambda$2(snapshotState).subList(0, AnonymousClass1.invoke$lambda$2(snapshotState).size() - 1);
                                    ScrollInfo scrollInfo = (ScrollInfo) CollectionsKt.lastOrNull(AnonymousClass1.invoke$lambda$2(snapshotState));
                                    AnonymousClass1.invoke$lambda$3(snapshotState, CollectionsKt.plus((Collection<? extends ScrollInfo>) listSubList, new ScrollInfo(scrollInfo != null ? scrollInfo.getFirstItemIndex() : 0, i)));
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$13$lambda$8$lambda$7(InvestmentsTrackerFragment investmentsTrackerFragment) {
                                investmentsTrackerFragment.getDuxo().onboardingBottomSheetFinished();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$13$lambda$10$lambda$9(EventLogger eventLogger, UserInteractionEventData userInteractionEventData, InvestmentsTrackerFragment investmentsTrackerFragment, RhModalBottomSheet5 RhContentBottomSheet) {
                                Intrinsics.checkNotNullParameter(RhContentBottomSheet, "$this$RhContentBottomSheet");
                                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, userInteractionEventData, false, false, 6, null);
                                investmentsTrackerFragment.getDuxo().onboardingBottomSheetFinished();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$13$lambda$12$lambda$11(EventLogger eventLogger, UserInteractionEventData userInteractionEventData, InvestmentsTrackerFragment investmentsTrackerFragment) {
                                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, userInteractionEventData, false, false, 6, null);
                                investmentsTrackerFragment.getDuxo().onboardingBottomSheetFinished();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$20$lambda$15$lambda$14(InvestmentsTrackerFragment investmentsTrackerFragment) {
                                investmentsTrackerFragment.getDuxo().onboardingBottomSheetFinished();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$20$lambda$17$lambda$16(EventLogger eventLogger, Screen screen, InvestmentsTrackerFragment investmentsTrackerFragment, RhModalBottomSheet5 RhContentBottomSheet) {
                                Intrinsics.checkNotNullParameter(RhContentBottomSheet, "$this$RhContentBottomSheet");
                                EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, screen, null, null, null, 29, null);
                                investmentsTrackerFragment.getDuxo().infoClosed();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$20$lambda$19$lambda$18(EventLogger eventLogger, Screen screen, InvestmentsTrackerFragment investmentsTrackerFragment) {
                                EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, screen, null, null, null, 29, null);
                                investmentsTrackerFragment.getDuxo().infoClosed();
                                return Unit.INSTANCE;
                            }
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1138126118, i, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.<anonymous>.<anonymous> (InvestmentsTrackerFragment.kt:302)");
                        }
                        UiEvent<Boolean> addingScreen = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getAddingScreen();
                        boolean zAreEqual = addingScreen != null ? Intrinsics.areEqual(addingScreen.consume(), Boolean.TRUE) : false;
                        UiEvent<Boolean> poppingScreen = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getPoppingScreen();
                        boolean zAreEqual2 = poppingScreen != null ? Intrinsics.areEqual(poppingScreen.consume(), Boolean.TRUE) : false;
                        Object[] objArr = new Object[0];
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestmentsTrackerFragment.C194951.AnonymousClass1.invoke$lambda$1$lambda$0();
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
                        if (zAreEqual) {
                            snapshotState.setValue(CollectionsKt.plus((Collection<? extends ScrollInfo>) invoke$lambda$2(snapshotState), new ScrollInfo(0, 0)));
                        } else if (zAreEqual2) {
                            snapshotState.setValue(invoke$lambda$2(snapshotState).subList(0, invoke$lambda$2(snapshotState).size() - 1));
                        }
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-1399878678, true, new C502281(this.this$0, this.$viewState$delegate), composer, 54), ComposableLambda3.rememberComposableLambda(-1321757589, true, new AnonymousClass2(this.this$0, this.$viewState$delegate), composer, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1233636917, true, new AnonymousClass3(this.$onboardingData, this.this$0, zAreEqual, zAreEqual2, this.$viewState$delegate, snapshotState, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable)), composer, 54), composer, 805306800, 505);
                        InvestmentsTrackerAgreementViewModel agreementResponse = InvestmentsTrackerFragment.ComposeContent$lambda$5(this.$viewState$delegate).getAgreementResponse();
                        if (agreementResponse != null) {
                            final InvestmentsTrackerFragment investmentsTrackerFragment = this.this$0;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(investmentsTrackerFragment);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentsTrackerFragment.C194951.AnonymousClass1.invoke$lambda$10$lambda$5$lambda$4(investmentsTrackerFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(investmentsTrackerFragment);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InvestmentsTrackerFragment.C194951.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(investmentsTrackerFragment, (InvestmentsTrackerGetAgreementResponseDto) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function1 = (Function1) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(investmentsTrackerFragment);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$ComposeContent$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InvestmentsTrackerFragment.C194951.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8(investmentsTrackerFragment, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            AddAccountAgreementOverlay.AddAccountAgreementOverlay(agreementResponse, function0, function1, (Function1) objRememberedValue4, null, composer, 0, 16);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$10$lambda$5$lambda$4(InvestmentsTrackerFragment investmentsTrackerFragment) {
                        investmentsTrackerFragment.getDuxo().closeAgreements();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$10$lambda$7$lambda$6(InvestmentsTrackerFragment investmentsTrackerFragment, InvestmentsTrackerGetAgreementResponseDto it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        investmentsTrackerFragment.getDuxo().agreetoAgreement(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$10$lambda$9$lambda$8(InvestmentsTrackerFragment investmentsTrackerFragment, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator navigator = investmentsTrackerFragment.getNavigator();
                        Context contextRequireContext = investmentsTrackerFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(it), null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1639448027, i3, -1, "com.robinhood.android.investmentstracker.InvestmentsTrackerFragment.ComposeContent.<anonymous> (InvestmentsTrackerFragment.kt:301)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1138126118, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, this, onboardingData), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InvestmentsTrackerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerFragment;", "Lcom/robinhood/android/transfers/contracts/InvestmentsTrackerKey;", "<init>", "()V", "TRANSFERS_ITEM_DEEPLINK", "Landroid/net/Uri;", "getTRANSFERS_ITEM_DEEPLINK", "()Landroid/net/Uri;", "ANIMATION_DIRECTION", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolverWithArgsCompanion<InvestmentsTrackerFragment, InvestmentsTrackerKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InvestmentsTrackerKey investmentsTrackerKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, investmentsTrackerKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestmentsTrackerKey getArgs(InvestmentsTrackerFragment investmentsTrackerFragment) {
            return (InvestmentsTrackerKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, investmentsTrackerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestmentsTrackerFragment newInstance(InvestmentsTrackerKey investmentsTrackerKey) {
            return (InvestmentsTrackerFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, investmentsTrackerKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestmentsTrackerFragment investmentsTrackerFragment, InvestmentsTrackerKey investmentsTrackerKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, investmentsTrackerFragment, investmentsTrackerKey);
        }

        public final Uri getTRANSFERS_ITEM_DEEPLINK() {
            return Uri.parse("robinhood://account_banking");
        }
    }
}
