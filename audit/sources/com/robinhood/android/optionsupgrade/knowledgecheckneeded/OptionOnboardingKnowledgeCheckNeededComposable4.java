package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import android.app.Activity;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.LocalActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.OptionOnboardingLoggings;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededEvent;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsViewerFragmentKey;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionOnboardingKnowledgeCheckNeededComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001aI\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u008a\u0084\u0002"}, m3636d2 = {"OptionOnboardingKnowledgeCheckNeededComposable", "", "accountNumber", "", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$KnowledgeCheckNeeded;", "getOptionOnboardingScreenContext", "Lkotlin/Function0;", "Lcom/robinhood/rosetta/eventlogging/OptionOnboardingContext;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "duxo", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDuxo;", "(Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/ScreenArgs$KnowledgeCheckNeeded;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDuxo;Landroidx/compose/runtime/Composer;II)V", "OptionOnboardingKnowledgeCheckNeededContent", "viewState", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState;", "onCloseButtonClicked", "onChatNowCardClicked", "onScheduleCallCardClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SupportCard", "state", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;", "(Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState$SupportCardState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-options-upgrade_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingKnowledgeCheckNeededComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingKnowledgeCheckNeededComposable$lambda$12(String str, ScreenArgs.KnowledgeCheckNeeded knowledgeCheckNeeded, Function0 function0, ActivityErrorHandler activityErrorHandler, OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo, int i, int i2, Composer composer, int i3) {
        OptionOnboardingKnowledgeCheckNeededComposable(str, knowledgeCheckNeeded, function0, activityErrorHandler, optionOnboardingKnowledgeCheckNeededDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingKnowledgeCheckNeededContent$lambda$13(OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionOnboardingKnowledgeCheckNeededContent(optionOnboardingKnowledgeCheckNeededViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$15(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportCard$lambda$14(OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SupportCard(supportCardState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingKnowledgeCheckNeededComposable(final String accountNumber, final ScreenArgs.KnowledgeCheckNeeded screenArgs, final Function0<OptionOnboardingContext> getOptionOnboardingScreenContext, final ActivityErrorHandler activityErrorHandler, OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo, Composer composer, final int i, final int i2) {
        int i3;
        OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo2;
        int i4;
        final OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo3;
        Event<OptionOnboardingKnowledgeCheckNeededEvent> event;
        final Activity activity;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        EventConsumer<OptionOnboardingKnowledgeCheckNeededEvent> eventConsumerInvoke;
        EventConsumer<OptionOnboardingKnowledgeCheckNeededEvent> eventConsumerInvoke2;
        EventConsumer<OptionOnboardingKnowledgeCheckNeededEvent> eventConsumerInvoke3;
        EventConsumer<OptionOnboardingKnowledgeCheckNeededEvent> eventConsumerInvoke4;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        Intrinsics.checkNotNullParameter(getOptionOnboardingScreenContext, "getOptionOnboardingScreenContext");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(2107462543);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenArgs) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(getOptionOnboardingScreenContext) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                optionOnboardingKnowledgeCheckNeededDuxo2 = optionOnboardingKnowledgeCheckNeededDuxo;
                int i5 = composerStartRestartGroup.changedInstance(optionOnboardingKnowledgeCheckNeededDuxo2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                optionOnboardingKnowledgeCheckNeededDuxo2 = optionOnboardingKnowledgeCheckNeededDuxo;
            }
            i3 |= i5;
        } else {
            optionOnboardingKnowledgeCheckNeededDuxo2 = optionOnboardingKnowledgeCheckNeededDuxo;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            optionOnboardingKnowledgeCheckNeededDuxo3 = optionOnboardingKnowledgeCheckNeededDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionOnboardingKnowledgeCheckNeededDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    optionOnboardingKnowledgeCheckNeededDuxo2 = (OptionOnboardingKnowledgeCheckNeededDuxo) baseDuxo;
                    i3 &= -57345;
                }
                OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo4 = optionOnboardingKnowledgeCheckNeededDuxo2;
                i4 = i3;
                optionOnboardingKnowledgeCheckNeededDuxo3 = optionOnboardingKnowledgeCheckNeededDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2107462543, i4, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable (OptionOnboardingKnowledgeCheckNeededComposable.kt:60)");
                }
                final StateFlow<Event<OptionOnboardingKnowledgeCheckNeededEvent>> eventFlow = optionOnboardingKnowledgeCheckNeededDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                int i6 = i4;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionOnboardingKnowledgeCheckNeededComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof OptionOnboardingKnowledgeCheckNeededEvent) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<OptionOnboardingKnowledgeCheckNeededEvent> value = eventFlow.getValue();
                event = value;
                if (!((event != null ? event.getData() : null) instanceof OptionOnboardingKnowledgeCheckNeededEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                if (activity != null) {
                    final Event<OptionOnboardingKnowledgeCheckNeededEvent> eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$0 = OptionOnboardingKnowledgeCheckNeededComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$0 != null && (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$0.getData() instanceof OptionOnboardingKnowledgeCheckNeededEvent.ScheduleAppointment) && (eventConsumerInvoke4 = eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke4.consume(eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$0, new Function1() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$lambda$5$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m17462invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m17462invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.showFragment$default(navigator, activity, new AppointmentsSchedulerFragmentKey(((OptionOnboardingKnowledgeCheckNeededEvent.ScheduleAppointment) eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$0.getData()).getCampaignId(), null, null, new AppointmentsSchedulerFragmentKey.Source.OptionsOnboarding(accountNumber), false, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }
                        });
                    }
                    final Event<OptionOnboardingKnowledgeCheckNeededEvent> eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$02 = OptionOnboardingKnowledgeCheckNeededComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$02 != null && (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$02.getData() instanceof OptionOnboardingKnowledgeCheckNeededEvent.OpenAppointment) && (eventConsumerInvoke3 = eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$02, new Function1() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$lambda$5$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m17463invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m17463invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                OptionOnboardingKnowledgeCheckNeededEvent.OpenAppointment openAppointment = (OptionOnboardingKnowledgeCheckNeededEvent.OpenAppointment) eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$02.getData();
                                activity.finish();
                                Navigator.DefaultImpls.showFragment$default(navigator, activity, new AppointmentsViewerFragmentKey(openAppointment.getAppointmentId(), new AppointmentsSchedulerFragmentKey.Source.OptionsOnboarding(accountNumber)), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }
                        });
                    }
                    final Event<OptionOnboardingKnowledgeCheckNeededEvent> eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$03 = OptionOnboardingKnowledgeCheckNeededComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$03 != null && (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$03.getData() instanceof OptionOnboardingKnowledgeCheckNeededEvent.OpenChat) && (eventConsumerInvoke2 = eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$03.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$03, new Function1() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$lambda$5$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m17464invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m17464invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.showFragment$default(navigator, activity, new CxChatFragmentKey.InquiryId(((OptionOnboardingKnowledgeCheckNeededEvent.OpenChat) eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$03.getData()).getInquiryId(), false, true, true, accountNumber), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            }
                        });
                    }
                    final Event<OptionOnboardingKnowledgeCheckNeededEvent> eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$04 = OptionOnboardingKnowledgeCheckNeededComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$04 != null && (eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$04.getData() instanceof OptionOnboardingKnowledgeCheckNeededEvent.Error) && (eventConsumerInvoke = eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$04.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$04, new Function1() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$lambda$5$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m17465invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m17465invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(activityErrorHandler, ((OptionOnboardingKnowledgeCheckNeededEvent.Error) eventOptionOnboardingKnowledgeCheckNeededComposable$lambda$04.getData()).getException(), false, 2, null);
                            }
                        });
                    }
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionOnboardingKnowledgeCheckNeededDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState = (OptionOnboardingKnowledgeCheckNeededViewState) snapshotState4CollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(activity);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededComposable$lambda$7$lambda$6(activity);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i7 = i6 & 896;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screenArgs) | (i7 != 256) | composerStartRestartGroup.changedInstance(optionOnboardingKnowledgeCheckNeededDuxo3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededComposable$lambda$9$lambda$8(current, screenArgs, getOptionOnboardingScreenContext, optionOnboardingKnowledgeCheckNeededDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screenArgs) | (i7 == 256) | composerStartRestartGroup.changedInstance(optionOnboardingKnowledgeCheckNeededDuxo3);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingKnowledgeCheckNeededComposable4.m2362x7c32624d(current, screenArgs, getOptionOnboardingScreenContext, optionOnboardingKnowledgeCheckNeededDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionOnboardingKnowledgeCheckNeededContent(optionOnboardingKnowledgeCheckNeededViewState, function0, function02, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo5 = optionOnboardingKnowledgeCheckNeededDuxo2;
                    i4 = i3 & (-57345);
                    optionOnboardingKnowledgeCheckNeededDuxo3 = optionOnboardingKnowledgeCheckNeededDuxo5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Flow eventFlow2 = optionOnboardingKnowledgeCheckNeededDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    int i62 = i4;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionOnboardingKnowledgeCheckNeededComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof OptionOnboardingKnowledgeCheckNeededEvent) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Event<OptionOnboardingKnowledgeCheckNeededEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event != null ? event.getData() : null) instanceof OptionOnboardingKnowledgeCheckNeededEvent)) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    if (activity != null) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(optionOnboardingKnowledgeCheckNeededDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState2 = (OptionOnboardingKnowledgeCheckNeededViewState) snapshotState4CollectAsStateWithLifecycle22.getValue();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activity);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededComposable$lambda$7$lambda$6(activity);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        Function0 function03 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i72 = i62 & 896;
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screenArgs) | (i72 != 256) | composerStartRestartGroup.changedInstance(optionOnboardingKnowledgeCheckNeededDuxo3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededComposable$lambda$9$lambda$8(current, screenArgs, getOptionOnboardingScreenContext, optionOnboardingKnowledgeCheckNeededDuxo3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Function0 function022 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screenArgs) | (i72 == 256) | composerStartRestartGroup.changedInstance(optionOnboardingKnowledgeCheckNeededDuxo3);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance3) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionOnboardingKnowledgeCheckNeededComposable4.m2362x7c32624d(current, screenArgs, getOptionOnboardingScreenContext, optionOnboardingKnowledgeCheckNeededDuxo3);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                OptionOnboardingKnowledgeCheckNeededContent(optionOnboardingKnowledgeCheckNeededViewState2, function03, function022, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                }
            }
            OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo42 = optionOnboardingKnowledgeCheckNeededDuxo2;
            i4 = i3;
            optionOnboardingKnowledgeCheckNeededDuxo3 = optionOnboardingKnowledgeCheckNeededDuxo42;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final Flow eventFlow22 = optionOnboardingKnowledgeCheckNeededDuxo3.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state22 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
            int i622 = i4;
            Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionOnboardingKnowledgeCheckNeededComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$OptionOnboardingKnowledgeCheckNeededComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof OptionOnboardingKnowledgeCheckNeededEvent) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<OptionOnboardingKnowledgeCheckNeededEvent> value22 = eventFlow22.getValue();
            event = value22;
            if (!((event != null ? event.getData() : null) instanceof OptionOnboardingKnowledgeCheckNeededEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            final Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            if (activity != null) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(optionOnboardingKnowledgeCheckNeededDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState22 = (OptionOnboardingKnowledgeCheckNeededViewState) snapshotState4CollectAsStateWithLifecycle222.getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(activity);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededComposable$lambda$12(accountNumber, screenArgs, getOptionOnboardingScreenContext, activityErrorHandler, optionOnboardingKnowledgeCheckNeededDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Event<OptionOnboardingKnowledgeCheckNeededEvent> OptionOnboardingKnowledgeCheckNeededComposable$lambda$0(SnapshotState4<Event<OptionOnboardingKnowledgeCheckNeededEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingKnowledgeCheckNeededComposable$lambda$7$lambda$6(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingKnowledgeCheckNeededComposable$lambda$9$lambda$8(EventLogger eventLogger, ScreenArgs.KnowledgeCheckNeeded knowledgeCheckNeeded, Function0 function0, OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo) {
        OptionOnboardingLoggings.logOptionOnboardingActionTap(eventLogger, UserInteractionEventData.Action.CHAT_ACTION, knowledgeCheckNeeded, (OptionOnboardingContext) function0.invoke());
        optionOnboardingKnowledgeCheckNeededDuxo.onChatNowCardClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionOnboardingKnowledgeCheckNeededComposable$lambda$11$lambda$10 */
    public static final Unit m2362x7c32624d(EventLogger eventLogger, ScreenArgs.KnowledgeCheckNeeded knowledgeCheckNeeded, Function0 function0, OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo) {
        OptionOnboardingLoggings.logOptionOnboardingActionTap(eventLogger, UserInteractionEventData.Action.SCHEDULE_APPOINTMENT, knowledgeCheckNeeded, (OptionOnboardingContext) function0.invoke());
        optionOnboardingKnowledgeCheckNeededDuxo.onScheduleCallCardClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingKnowledgeCheckNeededContent(final OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2078597617);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(optionOnboardingKnowledgeCheckNeededViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2078597617, i3, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent (OptionOnboardingKnowledgeCheckNeededComposable.kt:135)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = ((i3 >> 12) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(481484747, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.OptionOnboardingKnowledgeCheckNeededContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(481484747, i7, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:140)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1131898238$feature_options_upgrade_externalDebug = OptionOnboardingKnowledgeCheckNeededComposable.INSTANCE.getLambda$1131898238$feature_options_upgrade_externalDebug();
                        final Function0<Unit> function04 = function0;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1131898238$feature_options_upgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(433655978, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.OptionOnboardingKnowledgeCheckNeededContent.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(433655978, i8, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent.<anonymous>.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:143)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "close_button"), false, 0L, function04, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1103371488, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.OptionOnboardingKnowledgeCheckNeededContent.2
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1103371488, i8, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:152)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(PaddingKt.m5144paddingVpY3zN4$default(modifierPadding, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                        OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState2 = optionOnboardingKnowledgeCheckNeededViewState;
                        Function0<Unit> function04 = function03;
                        Function0<Unit> function05 = function02;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(optionOnboardingKnowledgeCheckNeededViewState2.getTitle(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), "title"), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState chatNowCard = optionOnboardingKnowledgeCheckNeededViewState2.getChatNowCard();
                        composer3.startReplaceGroup(-640152842);
                        if (chatNowCard != null) {
                            OptionOnboardingKnowledgeCheckNeededComposable4.SupportCard(chatNowCard, TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 7, null), optionOnboardingKnowledgeCheckNeededViewState2.getChatNowCard().getEnabled(), null, null, function05, 6, null), OptionOnboardingKnowledgeCheckNeededComposable5.CHAT_NOW_CARD), composer3, 0, 0);
                        }
                        composer3.endReplaceGroup();
                        OptionOnboardingKnowledgeCheckNeededComposable4.SupportCard(optionOnboardingKnowledgeCheckNeededViewState2.getScheduleCallCard(), TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(companion, optionOnboardingKnowledgeCheckNeededViewState2.getScheduleCallCard().getEnabled(), null, null, function04, 6, null), OptionOnboardingKnowledgeCheckNeededComposable5.SCHEDULE_CALL_CARD), composer3, 0, 0);
                        composer3.endNode();
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                        String disclosureMarkdown = optionOnboardingKnowledgeCheckNeededViewState2.getDisclosureMarkdown();
                        composer3.startReplaceGroup(691873888);
                        if (disclosureMarkdown != null) {
                            BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 7, null), MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i9).getTextS(), 0, bentoTheme2.getColors(composer3, i9).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer3, i9).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), null, null, null, null, null, null, null, 0L, null, 0, new MarkdownStyle.Paragraph(false), 1023, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, i6, 316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOnboardingKnowledgeCheckNeededComposable4.OptionOnboardingKnowledgeCheckNeededContent$lambda$13(optionOnboardingKnowledgeCheckNeededViewState, function0, function02, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = ((i3 >> 12) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(481484747, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.OptionOnboardingKnowledgeCheckNeededContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(481484747, i7, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:140)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1131898238$feature_options_upgrade_externalDebug = OptionOnboardingKnowledgeCheckNeededComposable.INSTANCE.getLambda$1131898238$feature_options_upgrade_externalDebug();
                    final Function0<Unit> function04 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1131898238$feature_options_upgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(433655978, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.OptionOnboardingKnowledgeCheckNeededContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 6) == 0) {
                                i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(433655978, i8, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent.<anonymous>.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:143)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "close_button"), false, 0L, function04, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1103371488, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.OptionOnboardingKnowledgeCheckNeededContent.2
                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1103371488, i8, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededContent.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:152)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(PaddingKt.m5144paddingVpY3zN4$default(modifierPadding, bentoTheme22.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    OptionOnboardingKnowledgeCheckNeededViewState optionOnboardingKnowledgeCheckNeededViewState2 = optionOnboardingKnowledgeCheckNeededViewState;
                    Function0<Unit> function04 = function03;
                    Function0<Unit> function05 = function02;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(optionOnboardingKnowledgeCheckNeededViewState2.getTitle(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i9).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), "title"), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i9).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState chatNowCard = optionOnboardingKnowledgeCheckNeededViewState2.getChatNowCard();
                    composer3.startReplaceGroup(-640152842);
                    if (chatNowCard != null) {
                        OptionOnboardingKnowledgeCheckNeededComposable4.SupportCard(chatNowCard, TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 7, null), optionOnboardingKnowledgeCheckNeededViewState2.getChatNowCard().getEnabled(), null, null, function05, 6, null), OptionOnboardingKnowledgeCheckNeededComposable5.CHAT_NOW_CARD), composer3, 0, 0);
                    }
                    composer3.endReplaceGroup();
                    OptionOnboardingKnowledgeCheckNeededComposable4.SupportCard(optionOnboardingKnowledgeCheckNeededViewState2.getScheduleCallCard(), TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(companion, optionOnboardingKnowledgeCheckNeededViewState2.getScheduleCallCard().getEnabled(), null, null, function04, 6, null), OptionOnboardingKnowledgeCheckNeededComposable5.SCHEDULE_CALL_CARD), composer3, 0, 0);
                    composer3.endNode();
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                    String disclosureMarkdown = optionOnboardingKnowledgeCheckNeededViewState2.getDisclosureMarkdown();
                    composer3.startReplaceGroup(691873888);
                    if (disclosureMarkdown != null) {
                        BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE), 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 7, null), MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme22.getTypography(composer3, i9).getTextS(), 0, bentoTheme22.getColors(composer3, i9).m21426getFg20d7_KjU(), bentoTheme22.getColors(composer3, i9).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), null, null, null, null, null, null, null, 0L, null, 0, new MarkdownStyle.Paragraph(false), 1023, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, i62, 316);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SupportCard(final OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM21427getFg30d7_KjU;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1002384101);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(supportCardState) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1002384101, i3, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.SupportCard (OptionOnboardingKnowledgeCheckNeededComposable.kt:221)");
                }
                if (supportCardState.getEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(-1218439330);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1218440163);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = i3;
                final long j = jM21427getFg30d7_KjU;
                modifier3 = modifier4;
                CardKt.Card(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1805677069, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.SupportCard.1
                    public final void invoke(Column5 Card, Composer composer2, int i7) {
                        OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState2;
                        Modifier.Companion companion;
                        Alignment.Companion companion2;
                        Object obj;
                        float f;
                        long j2;
                        Composer composer3;
                        long jM21427getFg30d7_KjU2;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1805677069, i7, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.SupportCard.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:232)");
                        }
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion3.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM());
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme2.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), C2002Dp.m7995constructorimpl(94));
                        OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState3 = supportCardState;
                        long j3 = j;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        if (supportCardState3.isLoading()) {
                            composer2.startReplaceGroup(926710122);
                            supportCardState2 = supportCardState3;
                            composer3 = composer2;
                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(TestTag3.testTag(companion4, OptionOnboardingKnowledgeCheckNeededComposable5.LOADING_SPINNER), BentoProgressIndicator3.f5151S, j3, composer3, 54, 0);
                            composer3.endReplaceGroup();
                            j2 = j3;
                            companion = companion4;
                            obj = null;
                            companion2 = companion3;
                            f = 0.0f;
                        } else {
                            supportCardState2 = supportCardState3;
                            composer2.startReplaceGroup(926974986);
                            companion = companion4;
                            companion2 = companion3;
                            obj = null;
                            f = 0.0f;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(supportCardState2.getIcon()), "", j3, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                            j2 = j3;
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer3, i8).m21597getXxsmallD9Ej5fM());
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, f, 1, obj);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion2.getStart(), composer3, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(supportCardState2.getTitle(), null, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer3, i8).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 8186);
                        String description = supportCardState2.getDescription();
                        composer2.startReplaceGroup(1622877520);
                        if (description != null) {
                            TextStyle textS = bentoTheme2.getTypography(composer2, i8).getTextS();
                            if (supportCardState2.getEnabled()) {
                                composer2.startReplaceGroup(157222764);
                                jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer2, i8).m21426getFg20d7_KjU();
                            } else {
                                composer2.startReplaceGroup(157223628);
                                jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer2, i8).m21427getFg30d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(description, null, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_24), "", j2, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 3) & 14) | 196608, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOnboardingKnowledgeCheckNeededComposable4.SupportCard$lambda$14(supportCardState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (supportCardState.getEnabled()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = i3;
            final long j2 = jM21427getFg30d7_KjU;
            modifier3 = modifier4;
            CardKt.Card(modifier3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1805677069, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt.SupportCard.1
                public final void invoke(Column5 Card, Composer composer2, int i7) {
                    OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState2;
                    Modifier.Companion companion;
                    Alignment.Companion companion2;
                    Object obj;
                    float f;
                    long j22;
                    Composer composer3;
                    long jM21427getFg30d7_KjU2;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i7 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1805677069, i7, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.SupportCard.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:232)");
                    }
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme22.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM());
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme22.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), C2002Dp.m7995constructorimpl(94));
                    OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState3 = supportCardState;
                    long j3 = j2;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5156height3ABfNKs);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (supportCardState3.isLoading()) {
                        composer2.startReplaceGroup(926710122);
                        supportCardState2 = supportCardState3;
                        composer3 = composer2;
                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(TestTag3.testTag(companion4, OptionOnboardingKnowledgeCheckNeededComposable5.LOADING_SPINNER), BentoProgressIndicator3.f5151S, j3, composer3, 54, 0);
                        composer3.endReplaceGroup();
                        j22 = j3;
                        companion = companion4;
                        obj = null;
                        companion2 = companion3;
                        f = 0.0f;
                    } else {
                        supportCardState2 = supportCardState3;
                        composer2.startReplaceGroup(926974986);
                        companion = companion4;
                        companion2 = companion3;
                        obj = null;
                        f = 0.0f;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(supportCardState2.getIcon()), "", j3, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                        j22 = j3;
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(bentoTheme22.getSpacing(composer3, i8).m21597getXxsmallD9Ej5fM());
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, f, 1, obj);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(supportCardState2.getTitle(), null, Color.m6701boximpl(j22), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme22.getTypography(composer3, i8).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 8186);
                    String description = supportCardState2.getDescription();
                    composer2.startReplaceGroup(1622877520);
                    if (description != null) {
                        TextStyle textS = bentoTheme22.getTypography(composer2, i8).getTextS();
                        if (supportCardState2.getEnabled()) {
                            composer2.startReplaceGroup(157222764);
                            jM21427getFg30d7_KjU2 = bentoTheme22.getColors(composer2, i8).m21426getFg20d7_KjU();
                        } else {
                            composer2.startReplaceGroup(157223628);
                            jM21427getFg30d7_KjU2 = bentoTheme22.getColors(composer2, i8).m21427getFg30d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(description, null, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_24), "", j22, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                    invoke(column5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i62 >> 3) & 14) | 196608, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(236094863);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(236094863, i, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.Preview (OptionOnboardingKnowledgeCheckNeededComposable.kt:294)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, OptionOnboardingKnowledgeCheckNeededComposable.INSTANCE.getLambda$1277396183$feature_options_upgrade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingKnowledgeCheckNeededComposable4.Preview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
