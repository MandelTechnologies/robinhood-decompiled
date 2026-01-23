package com.robinhood.android.transfers.recurring.p270ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunk2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.logging.AutomaticDepositDetailLogging;
import com.robinhood.android.transfers.recurring.p270ui.AutomaticDepositDetailFragment;
import com.robinhood.android.transfers.recurring.p270ui.AutomaticDepositDetailViewState;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.LocalDate;

/* compiled from: AutomaticDepositDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020'H\u0016J\r\u0010,\u001a\u00020'H\u0017¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0002J\u0015\u00101\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0003¢\u0006\u0002\u00104J\u001a\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010*H\u0016J\u001a\u00109\u001a\u00020\u00132\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010*H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b#\u0010$¨\u0006;²\u0006\n\u0010<\u001a\u000200X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "expandedToolbar", "Landroid/view/View;", "expandedToolbarTitleText", "Landroid/widget/TextView;", "expandedToolbarSubtitleText", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "bindState", "state", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;", "LoadedContent", "content", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState$Content;", "(Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState$Content;Landroidx/compose/runtime/Composer;I)V", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "Companion", "feature-recurring-deposits_externalDebug", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AutomaticDepositDetailFragment extends GenericComposeFragment implements AutoLoggableFragment, RhDialogFragment.OnDismissListener {
    public EventLogger eventLogger;
    private View expandedToolbar;
    private TextView expandedToolbarSubtitleText;
    private TextView expandedToolbarTitleText;
    public Markwon markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AutomaticDepositDetailDuxo.class);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutomaticDepositDetailFragment.eventScreen_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(AutomaticDepositDetailFragment automaticDepositDetailFragment, int i, Composer composer, int i2) {
        automaticDepositDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$9(AutomaticDepositDetailFragment automaticDepositDetailFragment, AutomaticDepositDetailViewState.Content content, int i, Composer composer, int i2) {
        automaticDepositDetailFragment.LoadedContent(content, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AutomaticDepositDetailDuxo getDuxo() {
        return (AutomaticDepositDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(AutomaticDepositDetailFragment automaticDepositDetailFragment) {
        return new Screen(Screen.Name.RECURRING_DEPOSIT_DETAIL, null, ((LegacyFragmentKey.AutomaticDepositDetail) INSTANCE.getArgs((Fragment) automaticDepositDetailFragment)).getAutomaticDepositId(), null, 10, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        View viewInflate = ViewGroups.inflate(rhToolbarRequireToolbar, C11048R.layout.include_detail_expanded_design_system_toolbar, false);
        this.expandedToolbarTitleText = (TextView) viewInflate.findViewById(C11048R.id.expanded_toolbar_title_txt);
        TextView textView = (TextView) viewInflate.findViewById(C11048R.id.expanded_toolbar_subtitle_txt);
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(0);
        this.expandedToolbarSubtitleText = textView;
        this.expandedToolbar = viewInflate;
        rhToolbarRequireToolbar.addView(viewInflate);
        BaseFragment.collectDuxoState$default(this, null, new C304502(null), 1, null);
    }

    private static final AutomaticDepositDetailViewState ComposeContent$lambda$3(SnapshotState4<AutomaticDepositDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AutomaticDepositDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$onViewCreated$2", m3645f = "AutomaticDepositDetailFragment.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$onViewCreated$2 */
    static final class C304502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C304502(Continuation<? super C304502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutomaticDepositDetailFragment.this.new C304502(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AutomaticDepositDetailViewState> stateFlow = AutomaticDepositDetailFragment.this.getDuxo().getStateFlow();
                final AutomaticDepositDetailFragment automaticDepositDetailFragment = AutomaticDepositDetailFragment.this;
                FlowCollector<? super AutomaticDepositDetailViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AutomaticDepositDetailViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AutomaticDepositDetailViewState automaticDepositDetailViewState, Continuation<? super Unit> continuation) {
                        automaticDepositDetailFragment.bindState(automaticDepositDetailViewState);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.removeView(this.expandedToolbar);
        }
        this.expandedToolbar = null;
        this.expandedToolbarTitleText = null;
        this.expandedToolbarSubtitleText = null;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(233526000);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(233526000, i2, -1, "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment.ComposeContent (AutomaticDepositDetailFragment.kt:112)");
            }
            AutomaticDepositDetailViewState.Content content = ComposeContent$lambda$3(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getContent();
            if (content != null) {
                LoadedContent(content, composerStartRestartGroup, (i2 << 3) & 112);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutomaticDepositDetailFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(AutomaticDepositDetailViewState state) {
        Result<AutomaticDeposit> resultConsume;
        Throwable thConsume;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(state.getIsLoading());
        }
        AutomaticDepositDetailViewState.Content content = state.getContent();
        if (content != null) {
            TextView textView = this.expandedToolbarTitleText;
            if (textView != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                textView.setText(content.getTitleTextValue(resources));
            }
            TextView textView2 = this.expandedToolbarSubtitleText;
            if (textView2 != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                textView2.setText(content.getSubtitleTextValue(resources2));
            }
        }
        UiEvent<Unit> cancelEvent = state.getCancelEvent();
        if ((cancelEvent != null ? cancelEvent.consume() : null) != null) {
            BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
            Toast.makeText(requireActivity(), C30439R.string.ach_transfer_automatic_deposit_cancel_confirmation, 0).show();
            if (!isStateSaved()) {
                baseActivityRequireBaseActivity.finish();
            }
        }
        UiEvent<Throwable> cancelErrorEvent = state.getCancelErrorEvent();
        if (cancelErrorEvent != null && (thConsume = cancelErrorEvent.consume()) != null) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
        }
        UiEvent<Result<AutomaticDeposit>> skipRecurringDepositResultEvent = state.getSkipRecurringDepositResultEvent();
        if (skipRecurringDepositResultEvent == null || (resultConsume = skipRecurringDepositResultEvent.consume()) == null) {
            return;
        }
        Object value = resultConsume.getValue();
        ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
        if (thM28553exceptionOrNullimpl == null) {
            AutomaticDeposit automaticDeposit = (AutomaticDeposit) value;
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(C30439R.id.dialog_id_recurring_deposit_skip_confirmed).setTitle(C30439R.string.ach_transfer_recurring_deposit_skip_confirmed_dialog_title, new Object[0]);
            int i = C30439R.string.ach_transfer_recurring_deposit_skip_confirmed_dialog_message;
            LocalDateFormatter localDateFormatter = LocalDateFormatter.LONG;
            LocalDate skipUntilDate = automaticDeposit.getSkipUntilDate();
            Intrinsics.checkNotNull(skipUntilDate);
            RhDialogFragment.Builder theme = title.setMessage(getString(i, localDateFormatter.format(skipUntilDate), localDateFormatter.format(automaticDeposit.getNextDepositDate()))).setPositiveButton(C11048R.string.general_label_okay, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(theme, childFragmentManager, "skipRecurringConfirmedDialog", false, 4, null);
            return;
        }
        AbsErrorHandler.handleError$default(activityErrorHandler, thM28553exceptionOrNullimpl, false, 2, null);
    }

    private final void LoadedContent(final AutomaticDepositDetailViewState.Content content, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(596118996);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(596118996, i2, -1, "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment.LoadedContent (AutomaticDepositDetailFragment.kt:169)");
            }
            final SduiActionHandler2 sduiActionHandler2RememberDefaultSduiChunkCallbacks = SduiChunk2.rememberDefaultSduiChunkCallbacks(this, getNavigator(), getMarkwon(), composerStartRestartGroup, (i2 >> 3) & 14);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1113488161, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment.LoadedContent.1

                /* compiled from: AutomaticDepositDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$LoadedContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ SduiActionHandler2 $callbacks;
                    final /* synthetic */ AutomaticDepositDetailViewState.Content $content;
                    final /* synthetic */ AutomaticDepositDetailFragment this$0;

                    AnonymousClass1(AutomaticDepositDetailViewState.Content content, AutomaticDepositDetailFragment automaticDepositDetailFragment, SduiActionHandler2 sduiActionHandler2) {
                        this.$content = content;
                        this.this$0 = automaticDepositDetailFragment;
                        this.$callbacks = sduiActionHandler2;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Modifier.Companion companion;
                        AutomaticDepositDetailViewState.Content content;
                        Column6 column6;
                        int i3;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(816224942, i2, -1, "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment.LoadedContent.<anonymous>.<anonymous> (AutomaticDepositDetailFragment.kt:173)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(PaddingKt.padding(companion2, paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                        AutomaticDepositDetailViewState.Content content2 = this.$content;
                        final AutomaticDepositDetailFragment automaticDepositDetailFragment = this.this$0;
                        SduiActionHandler2 sduiActionHandler2 = this.$callbacks;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C30439R.string.ach_transfer_automatic_deposit_detail_amount_header, composer, 0), null, 2, null), null, null, null, new AnnotatedString(content2.getAmountTextValue(), null, 2, null), null, null, null, null, false, false, 4061, null);
                        int i4 = BentoDataRowState.$stable;
                        BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composer, i4, 6);
                        AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C30439R.string.bank_account_header, composer, 0), null, 2, null);
                        Resources resources = automaticDepositDetailFragment.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(content2.getBankAccountTextValue(resources), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer, i4, 6);
                        Resources resources2 = automaticDepositDetailFragment.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        ImmutableList3 persistentList = extensions2.toPersistentList(content2.getAdditionalDataRows(resources2));
                        Modifier modifierWeight$default = Column5.weight$default(column62, companion2, 1.0f, false, 2, null);
                        composer.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierWeight$default, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion3.getStart(), false, composer, 100663296, 0);
                        Composer composer2 = composer;
                        composer2.endReplaceGroup();
                        StringResource footerStringResource = content2.getFooterStringResource();
                        composer2.startReplaceGroup(1486592986);
                        if (footerStringResource == null) {
                            column6 = column62;
                            companion = companion2;
                            i3 = 0;
                            content = content2;
                        } else {
                            Modifier modifierAlign = column62.align(companion2, companion3.getCenterHorizontally());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, false, 3, null), null, false, 3, null);
                            Resources resources3 = automaticDepositDetailFragment.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                            companion = companion2;
                            content = content2;
                            column6 = column62;
                            i3 = 0;
                            BentoText2.m20747BentoText38GnDrw(footerStringResource.getText(resources3).toString(), modifierWrapContentHeight$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer, 0, 0, 8184);
                            composer2 = composer;
                        }
                        composer2.endReplaceGroup();
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        boolean isSkipButtonEnabled = content.getIsSkipButtonEnabled();
                        String strStringResource = StringResources_androidKt.stringResource(C30439R.string.ach_transfer_recurring_deposit_skip_action, composer2, i3);
                        Modifier.Companion companion5 = companion;
                        Column6 column63 = column6;
                        Modifier modifierAlign2 = column63.align(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), companion3.getCenterHorizontally());
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierAutoLogSkipButton = AutomaticDepositDetailLogging.autoLogSkipButton(PaddingKt.m5146paddingqDBjuR0$default(modifierAlign2, bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null), automaticDepositDetailFragment.getEventScreen(), content.getIsSkipButtonEnabled());
                        composer2.startReplaceGroup(-1633490746);
                        final AutomaticDepositDetailViewState.Content content3 = content;
                        boolean zChangedInstance = composer2.changedInstance(automaticDepositDetailFragment) | composer2.changedInstance(content3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$LoadedContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AutomaticDepositDetailFragment.C304491.AnonymousClass1.invoke$lambda$5$lambda$2$lambda$1(automaticDepositDetailFragment, content3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogSkipButton, null, type2, isSkipButtonEnabled, false, null, null, null, null, false, null, composer, 24576, 0, 8136);
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.ach_transfer_recurring_deposit_cancel_action, composer, 0);
                        boolean isCancelEnabled = content3.getIsCancelEnabled();
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(column63.align(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), companion3.getCenterHorizontally()), bentoTheme2.getSpacing(composer, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i6).m21595getXsmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i6).m21592getMediumD9Ej5fM());
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(automaticDepositDetailFragment) | composer.changedInstance(content3);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$LoadedContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AutomaticDepositDetailFragment.C304491.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(automaticDepositDetailFragment, content3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM5145paddingqDBjuR0, null, type3, isCancelEnabled, false, null, null, null, null, false, null, composer, 24576, 0, 8136);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$2$lambda$1(AutomaticDepositDetailFragment automaticDepositDetailFragment, AutomaticDepositDetailViewState.Content content) {
                        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                        android.content.Context contextRequireContext = automaticDepositDetailFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(C30439R.id.dialog_id_recurring_deposit_skip_confirmation).setTitle(C30439R.string.ach_transfer_recurring_deposit_skip_confirmation_dialog_title, new Object[0]);
                        Resources resources = automaticDepositDetailFragment.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        RhDialogFragment.Builder theme = title.setMessage(content.getSkipConfirmationDialogMessage(resources)).setPositiveButton(C30439R.string.f5021xc3a91309, new Object[0]).setNegativeButton(C30439R.string.f5020xd196e54d, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                        FragmentManager childFragmentManager = automaticDepositDetailFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "skipRecurringConfirmationDialog", false, 4, null);
                        AutomaticDepositDetailLogging.logSkipConfirmationDialogAppear(automaticDepositDetailFragment);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4$lambda$3(AutomaticDepositDetailFragment automaticDepositDetailFragment, AutomaticDepositDetailViewState.Content content) {
                        EventLogger eventLogger = automaticDepositDetailFragment.getEventLogger();
                        Screen eventScreen = automaticDepositDetailFragment.getEventScreen();
                        Component.ComponentType componentType = Component.ComponentType.CANCEL_BUTTON;
                        Companion companion = AutomaticDepositDetailFragment.INSTANCE;
                        EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, new Component(componentType, ((LegacyFragmentKey.AutomaticDepositDetail) companion.getArgs((Fragment) automaticDepositDetailFragment)).getAutomaticDepositId(), null, 4, null), null, null, false, 57, null);
                        RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
                        android.content.Context contextRequireContext = automaticDepositDetailFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        RhDialogFragment.Builder title = companion2.create(contextRequireContext).setId(C30439R.id.dialog_id_recurring_deposit_cancel_confirmation).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C30439R.string.ach_transfer_automatic_deposit_cancel_confirmation_title, new Object[0]);
                        int i = C30439R.string.ach_transfer_automatic_deposit_cancel_confirmation_message;
                        Resources resources = automaticDepositDetailFragment.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        RhDialogFragment.Builder negativeButton = title.setMessage(i, content.getAccountName(resources)).setPositiveButton(C11048R.string.general_label_cancel, new Object[0]).setNegativeButton(C30439R.string.ach_transfer_automatic_deposit_nevermind, new Object[0]);
                        FragmentManager childFragmentManager = automaticDepositDetailFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "recurringDepositCancelConfirmation", false, 4, null);
                        EventLogger.DefaultImpls.logAppear$default(automaticDepositDetailFragment.getEventLogger(), null, automaticDepositDetailFragment.getEventScreen(), new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, ((LegacyFragmentKey.AutomaticDepositDetail) companion.getArgs((Fragment) automaticDepositDetailFragment)).getAutomaticDepositId(), null, 4, null), null, null, 25, null);
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
                        ComposerKt.traceEventStart(-1113488161, i3, -1, "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment.LoadedContent.<anonymous> (AutomaticDepositDetailFragment.kt:172)");
                    }
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(816224942, true, new AnonymousClass1(content, this, sduiActionHandler2RememberDefaultSduiChunkCallbacks), composer2, 54), composer2, 805306368, 511);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutomaticDepositDetailFragment.LoadedContent$lambda$9(this.f$0, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30439R.id.dialog_id_recurring_deposit_cancel_confirmation) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.CANCEL_CONFIRMATION_ALERT, ((LegacyFragmentKey.AutomaticDepositDetail) INSTANCE.getArgs((Fragment) this)).getAutomaticDepositId(), null, 4, null), null, null, false, 57, null);
            getDuxo().cancelAutomaticDeposit();
            return true;
        }
        if (id == C30439R.id.dialog_id_recurring_deposit_skip_confirmation) {
            AutomaticDepositDetailLogging.logSkipConfirmationDialogPositiveButtonTap(this);
            getDuxo().skipAutomaticDeposit();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30439R.id.dialog_id_recurring_deposit_skip_confirmation) {
            AutomaticDepositDetailLogging.logSkipConfirmationDialogNegativeButtonTap(this);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: AutomaticDepositDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutomaticDepositDetail;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AutomaticDepositDetailFragment, LegacyFragmentKey.AutomaticDepositDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.AutomaticDepositDetail automaticDepositDetail) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, automaticDepositDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.AutomaticDepositDetail getArgs(AutomaticDepositDetailFragment automaticDepositDetailFragment) {
            return (LegacyFragmentKey.AutomaticDepositDetail) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, automaticDepositDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AutomaticDepositDetailFragment newInstance(LegacyFragmentKey.AutomaticDepositDetail automaticDepositDetail) {
            return (AutomaticDepositDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, automaticDepositDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AutomaticDepositDetailFragment automaticDepositDetailFragment, LegacyFragmentKey.AutomaticDepositDetail automaticDepositDetail) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, automaticDepositDetailFragment, automaticDepositDetail);
        }
    }
}
