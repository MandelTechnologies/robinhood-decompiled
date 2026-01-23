package com.robinhood.android.transfers.international.p266ui.review;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.common.DisclosureComposable3;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferComposable;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferEvent;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferViewState;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: ReviewTransferComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002"}, m3636d2 = {"ReviewTransferComposable", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "onBackPressed", "Lkotlin/Function0;", "onFinishRequested", "duxo", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo;Landroidx/compose/runtime/Composer;II)V", "AmountView", "state", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState$AmountViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-international-transfers_externalDebug", "viewState", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewTransferComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountView$lambda$12(ReviewTransferViewState.AmountViewState amountViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AmountView(amountViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewTransferComposable$lambda$9(Screen screen, Context context, Function0 function0, Function0 function02, ReviewTransferDuxo reviewTransferDuxo, int i, int i2, Composer composer, int i3) {
        ReviewTransferComposable(screen, context, function0, function02, reviewTransferDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewTransferComposable(final Screen eventScreen, final Context eventContext, final Function0<Unit> onBackPressed, final Function0<Unit> onFinishRequested, ReviewTransferDuxo reviewTransferDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final ReviewTransferDuxo reviewTransferDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        Event<ReviewTransferEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final Event<ReviewTransferEvent> eventReviewTransferComposable$lambda$1;
        ErrorDialog errorDialogReviewTransferComposable$lambda$3;
        EventConsumer<ReviewTransferEvent> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onFinishRequested, "onFinishRequested");
        Composer composerStartRestartGroup = composer.startRestartGroup(228984758);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventScreen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFinishRequested) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                reviewTransferDuxo2 = reviewTransferDuxo;
                int i4 = composerStartRestartGroup.changedInstance(reviewTransferDuxo2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                reviewTransferDuxo2 = reviewTransferDuxo;
            }
            i3 |= i4;
        } else {
            reviewTransferDuxo2 = reviewTransferDuxo;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ReviewTransferDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    reviewTransferDuxo2 = (ReviewTransferDuxo) baseDuxo;
                    i3 &= -57345;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(228984758, i3, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable (ReviewTransferComposable.kt:52)");
                }
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(reviewTransferDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<ReviewTransferEvent>> eventFlow = reviewTransferDuxo2.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ReviewTransferComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof ReviewTransferEvent) {
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
                Event<ReviewTransferEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof ReviewTransferEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventReviewTransferComposable$lambda$1 = ReviewTransferComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventReviewTransferComposable$lambda$1 != null && (eventReviewTransferComposable$lambda$1.getData() instanceof ReviewTransferEvent.Error) && (eventConsumerInvoke = eventReviewTransferComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventReviewTransferComposable$lambda$1, new Function1() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19675invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19675invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState.setValue(((ReviewTransferEvent.Error) eventReviewTransferComposable$lambda$1.getData()).getErrorDialog());
                        }
                    });
                }
                int i5 = i3;
                ReviewTransferDuxo reviewTransferDuxo3 = reviewTransferDuxo2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(783901810, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt.ReviewTransferComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(783901810, i6, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous> (ReviewTransferComposable.kt:66)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final SnapshotState4<ReviewTransferViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1544156645, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt.ReviewTransferComposable.2.1
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
                                    ComposerKt.traceEventStart(1544156645, i7, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous>.<anonymous> (ReviewTransferComposable.kt:70)");
                                }
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                SnapshotState4<ReviewTransferViewState> snapshotState42 = snapshotState4;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
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
                                StringResource toolbarTitle = ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState42).getToolbarTitle();
                                int i8 = StringResource.$stable;
                                String string2 = StringResources6.getText(toolbarTitle, composer3, i8).toString();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8190);
                                BentoText2.m20747BentoText38GnDrw(StringResources6.getText(ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState42).getToolbarSubtitle(), composer3, i8).toString(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getTextS(), composer3, 0, 0, 8186);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-1452619759, true, new AnonymousClass2(onBackPressed), composer2, 54), null, null, false, false, appBarType, null, 0L, null, composer2, 12583350, 0, 1912);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ReviewTransferComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$2$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackPressed;

                        AnonymousClass2(Function0<Unit> function0) {
                            this.$onBackPressed = function0;
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
                                ComposerKt.traceEventStart(-1452619759, i, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous>.<anonymous> (ReviewTransferComposable.kt:86)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackPressed);
                            final Function0<Unit> function0 = this.$onBackPressed;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$2$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReviewTransferComposable.C303752.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
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

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(311439303, true, new C303763(reviewTransferDuxo3, current2, eventScreen, eventContext, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, 380);
                composerStartRestartGroup = composerStartRestartGroup;
                errorDialogReviewTransferComposable$lambda$3 = ReviewTransferComposable$lambda$3(snapshotState);
                if (errorDialogReviewTransferComposable$lambda$3 != null) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReviewTransferComposable.ReviewTransferComposable$lambda$8$lambda$7$lambda$6(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ErrorDialog2.ErrorDialogComposable(errorDialogReviewTransferComposable$lambda$3, onFinishRequested, (Function0) objRememberedValue3, composerStartRestartGroup, StringResource.$stable | 384 | ((i5 >> 6) & 112));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                reviewTransferDuxo2 = reviewTransferDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final SnapshotState4<ReviewTransferViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(reviewTransferDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = reviewTransferDuxo2.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ReviewTransferComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof ReviewTransferEvent) {
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
                Event<ReviewTransferEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof ReviewTransferEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventReviewTransferComposable$lambda$1 = ReviewTransferComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventReviewTransferComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventReviewTransferComposable$lambda$1, new Function1() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19675invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19675invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState.setValue(((ReviewTransferEvent.Error) eventReviewTransferComposable$lambda$1.getData()).getErrorDialog());
                        }
                    });
                }
                int i52 = i3;
                ReviewTransferDuxo reviewTransferDuxo32 = reviewTransferDuxo2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(783901810, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt.ReviewTransferComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(783901810, i6, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous> (ReviewTransferComposable.kt:66)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final SnapshotState4<ReviewTransferViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1544156645, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt.ReviewTransferComposable.2.1
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
                                    ComposerKt.traceEventStart(1544156645, i7, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous>.<anonymous> (ReviewTransferComposable.kt:70)");
                                }
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                SnapshotState4<ReviewTransferViewState> snapshotState42 = snapshotState4;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
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
                                StringResource toolbarTitle = ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState42).getToolbarTitle();
                                int i8 = StringResource.$stable;
                                String string2 = StringResources6.getText(toolbarTitle, composer3, i8).toString();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8190);
                                BentoText2.m20747BentoText38GnDrw(StringResources6.getText(ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState42).getToolbarSubtitle(), composer3, i8).toString(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getTextS(), composer3, 0, 0, 8186);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-1452619759, true, new AnonymousClass2(onBackPressed), composer2, 54), null, null, false, false, appBarType, null, 0L, null, composer2, 12583350, 0, 1912);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ReviewTransferComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$2$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackPressed;

                        AnonymousClass2(Function0<Unit> function0) {
                            this.$onBackPressed = function0;
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
                                ComposerKt.traceEventStart(-1452619759, i, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous>.<anonymous> (ReviewTransferComposable.kt:86)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackPressed);
                            final Function0 function0 = this.$onBackPressed;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$2$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReviewTransferComposable.C303752.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
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

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(311439303, true, new C303763(reviewTransferDuxo32, current22, eventScreen, eventContext, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, 380);
                composerStartRestartGroup = composerStartRestartGroup;
                errorDialogReviewTransferComposable$lambda$3 = ReviewTransferComposable$lambda$3(snapshotState);
                if (errorDialogReviewTransferComposable$lambda$3 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                reviewTransferDuxo2 = reviewTransferDuxo32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewTransferComposable.ReviewTransferComposable$lambda$9(eventScreen, eventContext, onBackPressed, onFinishRequested, reviewTransferDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewTransferViewState ReviewTransferComposable$lambda$0(SnapshotState4<ReviewTransferViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<ReviewTransferEvent> ReviewTransferComposable$lambda$1(SnapshotState4<Event<ReviewTransferEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final ErrorDialog ReviewTransferComposable$lambda$3(SnapshotState<ErrorDialog> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: ReviewTransferComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$3 */
    static final class C303763 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ ReviewTransferDuxo $duxo;
        final /* synthetic */ Context $eventContext;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Screen $eventScreen;
        final /* synthetic */ SnapshotState4<ReviewTransferViewState> $viewState$delegate;

        /* compiled from: ReviewTransferComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$3$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReviewTransferViewState.DataRow.IconAction.values().length];
                try {
                    iArr[ReviewTransferViewState.DataRow.IconAction.SHOW_EXCHANGE_RATE_INFO_SHEET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C303763(ReviewTransferDuxo reviewTransferDuxo, EventLogger eventLogger, Screen screen, Context context, SnapshotState4<ReviewTransferViewState> snapshotState4) {
            this.$duxo = reviewTransferDuxo;
            this.$eventLogger = eventLogger;
            this.$eventScreen = screen;
            this.$eventContext = context;
            this.$viewState$delegate = snapshotState4;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer2.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(311439303, i2, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferComposable.<anonymous> (ReviewTransferComposable.kt:95)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 0.0f;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            final ReviewTransferDuxo reviewTransferDuxo = this.$duxo;
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$eventScreen;
            final Context context = this.$eventContext;
            SnapshotState4<ReviewTransferViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ReviewTransferComposable.AmountView(ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState4).getAmountViewState(), Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), composer2, 0, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            boolean z = true;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 1, null), bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
            composer2.startReplaceGroup(745956374);
            for (final ReviewTransferViewState.DataRow dataRow : ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState4).getDataRows()) {
                StringResource label = dataRow.getLabel();
                int i4 = StringResource.$stable;
                AnnotatedString annotatedString = new AnnotatedString(StringResources6.getText(label, composer2, i4).toString(), null, 2, null);
                StringResource value = dataRow.getValue();
                composer2.startReplaceGroup(745964326);
                CharSequence text = value == null ? null : StringResources6.getText(value, composer2, i4);
                composer2.endReplaceGroup();
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, dataRow.getIcon(), null, new AnnotatedString(String.valueOf(text), null, 2, null), null, null, null, null, false, dataRow.getValue() == null ? z : false, 2005, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer2.changedInstance(dataRow) | composer2.changedInstance(reviewTransferDuxo);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReviewTransferComposable.C303763.invoke$lambda$4$lambda$1$lambda$0(dataRow, reviewTransferDuxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, null, (Function0) objRememberedValue, null, null, composer, BentoDataRowState.$stable, 26);
                composer2 = composer;
                f = 0.0f;
                z = true;
            }
            float f2 = f;
            composer2.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            DisclosureComposable3.DisclosureComposable(SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), f2, 2, null), composer2, 0, 0);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, f2, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(C30310R.string.withdraw, composer2, 0);
            boolean zIsPrimaryButtonLoading = ReviewTransferComposable.ReviewTransferComposable$lambda$0(snapshotState4).isPrimaryButtonLoading();
            composer2.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer2.changedInstance(eventLogger) | composer2.changedInstance(screen) | composer2.changedInstance(context) | composer2.changedInstance(reviewTransferDuxo);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$ReviewTransferComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewTransferComposable.C303763.invoke$lambda$4$lambda$3$lambda$2(eventLogger, screen, context, reviewTransferDuxo);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, (Function0) objRememberedValue2, strStringResource, zIsPrimaryButtonLoading, null, false, null, null, false, null, false, composer, 0, 0, 65086);
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
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(ReviewTransferViewState.DataRow dataRow, ReviewTransferDuxo reviewTransferDuxo) {
            ReviewTransferViewState.DataRow.IconAction iconAction = dataRow.getIconAction();
            int i = iconAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[iconAction.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                reviewTransferDuxo.showExchangeRateInfoSheet();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Context context, ReviewTransferDuxo reviewTransferDuxo) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SUBMIT_TRANSFER, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, context, false, 40, null);
            reviewTransferDuxo.submitTransfer();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewTransferComposable$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountView(ReviewTransferViewState.AmountViewState amountViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final ReviewTransferViewState.AmountViewState amountViewState2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-512357188);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(amountViewState) : composerStartRestartGroup.changedInstance(amountViewState) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-512357188, i3, -1, "com.robinhood.android.transfers.international.ui.review.AmountView (ReviewTransferComposable.kt:167)");
                }
                if (!(amountViewState instanceof ReviewTransferViewState.AmountViewState.WithFx)) {
                    composerStartRestartGroup.startReplaceGroup(681026713);
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C30310R.string.review_source_amount_label, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ReviewTransferViewState.AmountViewState.WithFx withFx = (ReviewTransferViewState.AmountViewState.WithFx) amountViewState;
                    BentoText2.m20747BentoText38GnDrw(withFx.getSourceAmount(), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30310R.string.review_sink_amount_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.bentoPlaceholder$default(companion2, withFx.getSinkAmount() == null, null, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    String sinkAmount = withFx.getSinkAmount();
                    if (sinkAmount == null) {
                        sinkAmount = "-----------";
                    }
                    BentoText2.m20747BentoText38GnDrw(sinkAmount, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    amountViewState2 = amountViewState;
                    modifier3 = modifier5;
                } else {
                    amountViewState2 = amountViewState;
                    Modifier modifier6 = modifier4;
                    if (!(amountViewState2 instanceof ReviewTransferViewState.AmountViewState.WithoutFx)) {
                        composerStartRestartGroup.startReplaceGroup(1545987298);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(682314081);
                    modifier3 = modifier6;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BentoText2.m20748BentoTextQnj7Zds(((ReviewTransferViewState.AmountViewState.WithoutFx) amountViewState2).getAmount(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleLarge(), composerStartRestartGroup, 0, 0, 8126);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                amountViewState2 = amountViewState;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReviewTransferComposable.AmountView$lambda$12(amountViewState2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!(amountViewState instanceof ReviewTransferViewState.AmountViewState.WithFx)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
