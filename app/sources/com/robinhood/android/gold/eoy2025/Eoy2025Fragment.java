package com.robinhood.android.gold.eoy2025;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.BuildConfig;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.gold.contracts.Eoy2025IntentKey;
import com.robinhood.android.gold.eoy2025.Eoy2025Event;
import com.robinhood.android.gold.eoy2025.Eoy2025Fragment;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import eoy_giveaway.p456v1.GetProgramViewModelResponseDto;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.RemoteMicrogramApplication;
import timber.log.Timber;

/* compiled from: Eoy2025Fragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\r\u0010\u0019\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u001aJ'\u0010\u001b\u001a\u00020\u0012*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0003¢\u0006\u0002\u0010!J/\u0010\"\u001a\u00020\u0012*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0003¢\u0006\u0002\u0010%J-\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020(2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0003¢\u0006\u0002\u0010)J%\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00102\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0003¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0012H\u0002J\u001e\u00101\u001a\u00020\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010032\u0006\u00104\u001a\u00020$H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002²\u0006\u0012\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020$X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Fragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo;", "getDuxo", "()Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewId", "", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "PositionedBackButton", "Landroidx/compose/foundation/layout/BoxScope;", "location", "Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/BoxScope;Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PositionedCalendarButton", "showPendingGiftIndicator", "", "(Landroidx/compose/foundation/layout/BoxScope;Leoy_giveaway/v1/GetProgramViewModelResponseDto$CloseButtonLocationDto;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CalendarPillButton", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CanvasBackground", "url", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event;", "(Ljava/lang/String;Lcom/robinhood/android/udf/event/Event;Landroidx/compose/runtime/Composer;I)V", "dismissScreen", "showShareScreen", "contents", "", "includeCanvasImage", "Companion", "feature-eoy-2025_externalDebug", "state", "Lcom/robinhood/android/gold/eoy2025/Eoy2025ViewState;", "backgroundLoaded"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Eoy2025Fragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, Eoy2025Duxo.class);
    private final String viewId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Eoy2025Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetProgramViewModelResponseDto.CloseButtonLocationDto.values().length];
            try {
                iArr[GetProgramViewModelResponseDto.CloseButtonLocationDto.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetProgramViewModelResponseDto.CloseButtonLocationDto.LOCATION_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetProgramViewModelResponseDto.CloseButtonLocationDto.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetProgramViewModelResponseDto.CloseButtonLocationDto.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CalendarPillButton$lambda$5(Eoy2025Fragment eoy2025Fragment, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        eoy2025Fragment.CalendarPillButton(z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView CanvasBackground$lambda$19$lambda$18$lambda$17(WebView webView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasBackground$lambda$20(Eoy2025Fragment eoy2025Fragment, String str, Event event, int i, Composer composer, int i2) {
        eoy2025Fragment.CanvasBackground(str, event, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(Eoy2025Fragment eoy2025Fragment, int i, Composer composer, int i2) {
        eoy2025Fragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionedBackButton$lambda$3(Eoy2025Fragment eoy2025Fragment, BoxScope boxScope, GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto, Function0 function0, int i, Composer composer, int i2) {
        eoy2025Fragment.PositionedBackButton(boxScope, closeButtonLocationDto, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionedCalendarButton$lambda$4(Eoy2025Fragment eoy2025Fragment, BoxScope boxScope, GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto, boolean z, Function0 function0, int i, Composer composer, int i2) {
        eoy2025Fragment.PositionedCalendarButton(boxScope, closeButtonLocationDto, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CanvasBackground$lambda$14$lambda$13(final WebView webView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$CanvasBackground$lambda$14$lambda$13$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                webView.destroy();
            }
        };
    }

    private static final boolean CanvasBackground$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eoy2025ViewState ComposeContent$lambda$0(SnapshotState4<Eoy2025ViewState> snapshotState4) {
        return snapshotState4.getValue();
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

    public Eoy2025Fragment() {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.viewId = string2;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.EOY_GIVEAWAY_2025;
        String source = ((Eoy2025IntentKey) INSTANCE.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        return new Screen(name, null, source, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Eoy2025Duxo getDuxo() {
        return (Eoy2025Duxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireBaseActivity().overrideSystemBarsStyle(false);
        getDuxo().getEoyGiveawayManager().clientService();
        getDuxo().setCurrentViewId(this.viewId);
        getDuxo().getEoyGiveawayManager().updateProgramVisibility(this.viewId, true);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getDuxo().getEoyGiveawayManager().updateProgramVisibility(this.viewId, false);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1953282025);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1953282025, i2, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.ComposeContent (Eoy2025Fragment.kt:123)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Eoy2025Fragment3(context, this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1567598687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment.ComposeContent.2

                /* compiled from: Eoy2025Fragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$3, reason: invalid class name */
                static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<Event<Eoy2025Event>> $event$delegate;
                    final /* synthetic */ SnapshotState4<Eoy2025ViewState> $state$delegate;
                    final /* synthetic */ Eoy2025Fragment this$0;

                    AnonymousClass3(Eoy2025Fragment eoy2025Fragment, SnapshotState4<Eoy2025ViewState> snapshotState4, SnapshotState4<Event<Eoy2025Event>> snapshotState42) {
                        this.this$0 = eoy2025Fragment;
                        this.$state$delegate = snapshotState4;
                        this.$event$delegate = snapshotState42;
                    }

                    public final void invoke(Composer composer, int i) {
                        BoxScopeInstance boxScopeInstance;
                        Object obj;
                        Eoy2025Fragment eoy2025Fragment;
                        SnapshotState4<Eoy2025ViewState> snapshotState4;
                        Composer composer2 = composer;
                        if ((i & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1150208719, i, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.ComposeContent.<anonymous>.<anonymous> (Eoy2025Fragment.kt:152)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion, BentoColor.INSTANCE.m21319getNightJet0d7_KjU(), null, 2, null), 0.0f, 1, null);
                        Eoy2025Fragment eoy2025Fragment2 = this.this$0;
                        SnapshotState4<Eoy2025ViewState> snapshotState42 = this.$state$delegate;
                        SnapshotState4<Event<Eoy2025Event>> snapshotState43 = this.$event$delegate;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        eoy2025Fragment2.CanvasBackground(Eoy2025Fragment.ComposeContent$lambda$0(snapshotState42).getBackgroundCountdownUrl(), C177622.invoke$lambda$0(snapshotState43), composer2, 0);
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(boxScopeInstance2.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter())));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        composer2.startReplaceGroup(-1056616663);
                        if (Eoy2025Fragment.ComposeContent$lambda$0(snapshotState42).getShowOverlay()) {
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-eoy-2025", null, 2, null);
                            FragmentManager childFragmentManager = eoy2025Fragment2.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            snapshotState4 = snapshotState42;
                            boxScopeInstance = boxScopeInstance2;
                            eoy2025Fragment = eoy2025Fragment2;
                            obj = null;
                            MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, childFragmentManager, modifierFillMaxWidth$default, null, null, null, null, false, null, composer, 384, 504);
                            composer2 = composer;
                        } else {
                            boxScopeInstance = boxScopeInstance2;
                            obj = null;
                            eoy2025Fragment = eoy2025Fragment2;
                            snapshotState4 = snapshotState42;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj)), C2002Dp.m7995constructorimpl(64));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocation = Eoy2025Fragment.ComposeContent$lambda$0(snapshotState4).getCloseButtonLocation();
                        composer2.startReplaceGroup(5004770);
                        final Eoy2025Fragment eoy2025Fragment3 = eoy2025Fragment;
                        boolean zChangedInstance = composer2.changedInstance(eoy2025Fragment3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Eoy2025Fragment.C177622.AnonymousClass3.invoke$lambda$6$lambda$5$lambda$2$lambda$1(eoy2025Fragment3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                        eoy2025Fragment3.PositionedBackButton(boxScopeInstance3, closeButtonLocation, (Function0) objRememberedValue, composer2, 6);
                        GetProgramViewModelResponseDto.CloseButtonLocationDto calendarButtonLocation = Eoy2025Fragment.ComposeContent$lambda$0(snapshotState4).getCalendarButtonLocation();
                        boolean showPendingGiftIndicator = Eoy2025Fragment.ComposeContent$lambda$0(snapshotState4).getShowPendingGiftIndicator();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(eoy2025Fragment3);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$3$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Eoy2025Fragment.C177622.AnonymousClass3.invoke$lambda$6$lambda$5$lambda$4$lambda$3(eoy2025Fragment3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        eoy2025Fragment3.PositionedCalendarButton(boxScopeInstance3, calendarButtonLocation, showPendingGiftIndicator, (Function0) objRememberedValue2, composer2, 6);
                        composer.endNode();
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
                    public static final Unit invoke$lambda$6$lambda$5$lambda$2$lambda$1(Eoy2025Fragment eoy2025Fragment) {
                        eoy2025Fragment.dismissScreen();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(Eoy2025Fragment eoy2025Fragment) {
                        eoy2025Fragment.getDuxo().showHolidayHubView();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Event<Eoy2025Event> invoke$lambda$0(SnapshotState4<Event<Eoy2025Event>> snapshotState4) {
                    return snapshotState4.getValue();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    EventConsumer<Eoy2025Event> eventConsumerInvoke;
                    EventConsumer<Eoy2025Event> eventConsumerInvoke2;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1567598687, i3, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.ComposeContent.<anonymous> (Eoy2025Fragment.kt:138)");
                    }
                    final StateFlow<Event<Eoy2025Event>> eventFlow = Eoy2025Fragment.this.getDuxo().getEventFlow();
                    composer2.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$invoke$$inlined$collectEventAsStateWithLifecycle$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$invoke$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$invoke$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "Eoy2025Fragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$invoke$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
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
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof Eoy2025Event) {
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
                    Event<Eoy2025Event> value = eventFlow.getValue();
                    Event<Eoy2025Event> event = value;
                    if (!((event != null ? event.getData() : null) instanceof Eoy2025Event)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    final Event<Eoy2025Event> eventInvoke$lambda$0 = invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventInvoke$lambda$0 != null) {
                        final Eoy2025Fragment eoy2025Fragment = Eoy2025Fragment.this;
                        if ((eventInvoke$lambda$0.getData() instanceof Eoy2025Event.DismissView) && (eventConsumerInvoke2 = eventInvoke$lambda$0.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventInvoke$lambda$0, new Function1() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$invoke$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15018invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15018invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    eoy2025Fragment.dismissScreen();
                                }
                            });
                        }
                    }
                    final Event<Eoy2025Event> eventInvoke$lambda$02 = invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventInvoke$lambda$02 != null) {
                        final Eoy2025Fragment eoy2025Fragment2 = Eoy2025Fragment.this;
                        if ((eventInvoke$lambda$02.getData() instanceof Eoy2025Event.ShowSystemShareScreen) && (eventConsumerInvoke = eventInvoke$lambda$02.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventInvoke$lambda$02, new Function1() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$ComposeContent$2$invoke$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15019invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15019invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Eoy2025Event.ShowSystemShareScreen showSystemShareScreen = (Eoy2025Event.ShowSystemShareScreen) eventInvoke$lambda$02.getData();
                                    eoy2025Fragment2.showShareScreen(showSystemShareScreen.getContents(), showSystemShareScreen.getIncludeCanvasImage());
                                }
                            });
                        }
                    }
                    LocalShowPlaceholder.Loadable(Eoy2025Fragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoading(), Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoColor.INSTANCE.m21319getNightJet0d7_KjU(), null, 2, null), null, ComposableLambda3.rememberComposableLambda(-1150208719, true, new AnonymousClass3(Eoy2025Fragment.this, snapshotState4CollectAsStateWithLifecycle, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), composer2, 3072, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Eoy2025Fragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void PositionedBackButton(final BoxScope boxScope, final GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555828142);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(closeButtonLocationDto.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555828142, i2, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.PositionedBackButton (Eoy2025Fragment.kt:204)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[closeButtonLocationDto.ordinal()];
            if (i3 == 1 || i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(1611124516);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 3) {
                composerStartRestartGroup.startReplaceGroup(1611216927);
                BentoAppBarScope.INSTANCE.m20576BentoCloseButtoncf5BqRc(PaddingKt.m5146paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, 0L, function0, composerStartRestartGroup, ((i2 << 3) & 7168) | (BentoAppBarScope.$stable << 12), 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 4) {
                    composerStartRestartGroup.startReplaceGroup(-502220095);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1611530275);
                BentoAppBarScope.INSTANCE.m20576BentoCloseButtoncf5BqRc(PaddingKt.m5146paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, 0L, function0, composerStartRestartGroup, ((i2 << 3) & 7168) | (BentoAppBarScope.$stable << 12), 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Eoy2025Fragment.PositionedBackButton$lambda$3(this.f$0, boxScope, closeButtonLocationDto, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PositionedCalendarButton(final BoxScope boxScope, final GetProgramViewModelResponseDto.CloseButtonLocationDto closeButtonLocationDto, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Alignment centerEnd;
        int i3;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-492617289);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(closeButtonLocationDto.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-492617289, i2, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.PositionedCalendarButton (Eoy2025Fragment.kt:235)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i4 = iArr[closeButtonLocationDto.ordinal()];
            if (i4 == 1 || i4 == 2) {
                centerEnd = Alignment.INSTANCE.getCenterEnd();
                i3 = iArr[closeButtonLocationDto.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    z2 = false;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z2 = true;
                }
                AnimatedVisibilityKt.AnimatedVisibility(z2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScope.align(Modifier.INSTANCE, centerEnd), 0.0f, composerStartRestartGroup, 0, 1), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-358032929, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment.PositionedCalendarButton.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-358032929, i5, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.PositionedCalendarButton.<anonymous> (Eoy2025Fragment.kt:257)");
                        }
                        Eoy2025Fragment.this.CalendarPillButton(z, null, function0, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (i4 == 3) {
                centerEnd = Alignment.INSTANCE.getCenterStart();
                i3 = iArr[closeButtonLocationDto.ordinal()];
                if (i3 == 1) {
                }
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                centerEnd = Alignment.INSTANCE.getCenterEnd();
                i3 = iArr[closeButtonLocationDto.ordinal()];
                if (i3 == 1) {
                    z2 = false;
                    AnimatedVisibilityKt.AnimatedVisibility(z2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScope.align(Modifier.INSTANCE, centerEnd), 0.0f, composerStartRestartGroup, 0, 1), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-358032929, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment.PositionedCalendarButton.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-358032929, i5, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.PositionedCalendarButton.<anonymous> (Eoy2025Fragment.kt:257)");
                            }
                            Eoy2025Fragment.this.CalendarPillButton(z, null, function0, composer2, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Eoy2025Fragment.PositionedCalendarButton$lambda$4(this.f$0, boxScope, closeButtonLocationDto, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void CalendarPillButton(final boolean z, final Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1489686894);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1489686894, i3, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.CalendarPillButton (Eoy2025Fragment.kt:269)");
            }
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-996645620, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment.CalendarPillButton.1
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-996645620, i5, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.CalendarPillButton.<anonymous> (Eoy2025Fragment.kt:271)");
                    }
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    Modifier modifier2 = modifier;
                    Function0<Unit> function02 = function0;
                    boolean z2 = z;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(Clip.clip(modifier2, roundedCornerShapeM5327RoundedCornerShape0680j_4), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i6).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), jM21371getBg0d7_KjU, null, 2, null), false, null, null, function02, 7, null), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.GIFT_16), null, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17765R.string.calendar_view_all_button, composer2, 0), null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    composer2.startReplaceGroup(-2137026859);
                    if (z2) {
                        float f = 16;
                        BoxKt.Box(Background3.m4871backgroundbw27NRU(OffsetKt.m5125offsetVpY3zN4$default(boxScopeInstance.align(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), companion2.getTopEnd()), C2002Dp.m7995constructorimpl(5), 0.0f, 2, null), bentoTheme.getColors(composer2, i6).m21452getNegative0d7_KjU(), RoundedCornerShape2.getCircleShape()), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Eoy2025Fragment.CalendarPillButton$lambda$5(this.f$0, z, modifier2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    @SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CanvasBackground(final String str, final Event<Eoy2025Event> event, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        SnapshotState snapshotState;
        int i3;
        Composer composer2;
        Composer composer3;
        EventConsumer<Eoy2025Event> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-836289431);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836289431, i2, -1, "com.robinhood.android.gold.eoy2025.Eoy2025Fragment.CanvasBackground (Eoy2025Fragment.kt:323)");
            }
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                Object obj = objRememberedValue2;
                if (objRememberedValue2 == companion2.getEmpty()) {
                    WebView webView = new WebView(context);
                    webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    webView.setBackgroundColor(-16777216);
                    if (BuildConfig.DEBUG) {
                        webView.clearCache(true);
                    }
                    webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$CanvasBackground$webView$1$1$1
                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                            super.onReceivedHttpError(view, request, errorResponse);
                            CrashReporter.INSTANCE.log("Eoy2025, received http error, " + errorResponse);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                            super.onReceivedError(view, request, error);
                            CrashReporter.INSTANCE.log("Eoy2025, received error, " + error);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView view, String url) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            super.onPageFinished(view, url);
                            Timber.INSTANCE.mo3350d("Page has finished loading url=" + url, new Object[0]);
                            if (view.getProgress() == 100) {
                                Eoy2025Fragment.CanvasBackground$lambda$8(snapshotState2, true);
                                view.setBackgroundColor(0);
                            }
                        }
                    });
                    OnClickListeners.onClick(webView, new Function0() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Eoy2025Fragment.CanvasBackground$lambda$11$lambda$10$lambda$9(hapticFeedback);
                        }
                    });
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setDomStorageEnabled(true);
                    webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                    webView.setWebChromeClient(new WebChromeClient());
                    webView.getSettings().setLoadWithOverviewMode(false);
                    webView.getSettings().setSupportZoom(false);
                    webView.addJavascriptInterface(getDuxo().getJavascriptBridge(), "EndOfYearSupport");
                    webView.loadUrl(str);
                    composerStartRestartGroup.updateRememberedValue(webView);
                    obj = webView;
                }
                final WebView webView2 = (WebView) obj;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(webView2);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Eoy2025Fragment.CanvasBackground$lambda$14$lambda$13(webView2, (DisposableEffectScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
                if (event != null && (event.getData() instanceof Eoy2025Event.InvokeJavaScript) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$CanvasBackground$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m15017invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15017invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Eoy2025Event.InvokeJavaScript invokeJavaScript = (Eoy2025Event.InvokeJavaScript) event.getData();
                            Timber.INSTANCE.mo3350d("Webview will evaluate javascript: " + invokeJavaScript.getJavascript(), new Object[0]);
                            webView2.evaluateJavascript(invokeJavaScript.getJavascript(), null);
                        }
                    });
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-992166683);
                if (CanvasBackground$lambda$7(snapshotState2)) {
                    companion = companion3;
                    snapshotState = snapshotState2;
                    i3 = 5004770;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifierBackground$default = Background3.background$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.4331f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.8106f), Color.m6701boximpl(Color2.Color(4279510041L)))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBackground$default);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    snapshotState = snapshotState2;
                    companion = companion3;
                    i3 = 5004770;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17765R.string.calendar_loading_text, composerStartRestartGroup, 0), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, 0, 0, 8126);
                    Composer composer4 = composerStartRestartGroup;
                    composer4.endNode();
                    composer2 = composer4;
                }
                composer2.endReplaceGroup();
                Modifier modifierIsInvisible = ModifiersKt.isInvisible(companion, !CanvasBackground$lambda$7(snapshotState));
                composer2.startReplaceGroup(i3);
                boolean zChangedInstance2 = composer2.changedInstance(webView2);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Eoy2025Fragment.CanvasBackground$lambda$19$lambda$18$lambda$17(webView2, (Context) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue4, modifierIsInvisible, null, composer2, 0, 4);
                composer3 = composer2;
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Fragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Eoy2025Fragment.CanvasBackground$lambda$20(this.f$0, str, event, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CanvasBackground$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasBackground$lambda$11$lambda$10$lambda$9(HapticFeedback hapticFeedback) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissScreen() {
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShareScreen(List<String> contents, boolean includeCanvasImage) {
        Timber.INSTANCE.mo3350d("showShareScreen: contents=" + contents + ", includeCanvasImage=" + includeCanvasImage, new Object[0]);
        String strJoinToString$default = CollectionsKt.joinToString$default(contents, "\n", null, null, 0, null, null, 62, null);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", strJoinToString$default);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, getString(C11048R.string.general_share_chooser_title)));
    }

    /* compiled from: Eoy2025Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Fragment;", "Lcom/robinhood/android/gold/contracts/Eoy2025IntentKey;", "<init>", "()V", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<Eoy2025Fragment, Eoy2025IntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Eoy2025IntentKey getArgs(Eoy2025Fragment eoy2025Fragment) {
            return (Eoy2025IntentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, eoy2025Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public Eoy2025Fragment newInstance(Eoy2025IntentKey eoy2025IntentKey) {
            return (Eoy2025Fragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, eoy2025IntentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(Eoy2025Fragment eoy2025Fragment, Eoy2025IntentKey eoy2025IntentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, eoy2025Fragment, eoy2025IntentKey);
        }
    }
}
