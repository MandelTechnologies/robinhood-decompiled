package com.robinhood.android.pdfrenderer;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
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
import androidx.compose.runtime.SnapshotStateKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.pdfrenderer.PdfRendererEvent;
import com.robinhood.android.pdfrenderer.PdfRendererViewState;
import com.robinhood.android.pdfrenderer.RhPdfRenderer;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PdfRendererComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u00012\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u000f0\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\u0012\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"PdfRendererComposable", "", "onCloseClicked", "Lkotlin/Function0;", "onOpenInAnotherAppPressed", "onError", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/pdfrenderer/PdfRendererDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pdfrenderer/PdfRendererDuxo;Landroidx/compose/runtime/Composer;II)V", "PdfRendererContent", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer$Page;", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AppBar", "title", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "pxToDp", "Landroidx/compose/ui/unit/Dp;", "", "(ILandroidx/compose/runtime/Composer;I)F", "lib-pdf-renderer_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/pdfrenderer/PdfRendererEvent;", "state", "Lcom/robinhood/android/pdfrenderer/PdfRendererViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pdfrenderer.PdfRendererComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PdfRendererComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBar$lambda$7(String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AppBar(str, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfRendererComposable$lambda$3(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, PdfRendererDuxo pdfRendererDuxo, int i, int i2, Composer composer, int i3) {
        PdfRendererComposable(function0, function02, function03, modifier, pdfRendererDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfRendererContent$lambda$6(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PdfRendererContent(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PdfRendererComposable(final Function0<Unit> onCloseClicked, final Function0<Unit> onOpenInAnotherAppPressed, final Function0<Unit> onError, Modifier modifier, PdfRendererDuxo pdfRendererDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PdfRendererDuxo pdfRendererDuxo2;
        Modifier modifier3;
        int i4;
        PdfRendererDuxo pdfRendererDuxo3;
        Event<PdfRendererEvent> event;
        final Event<PdfRendererEvent> eventPdfRendererComposable$lambda$0;
        final PdfRendererDuxo pdfRendererDuxo4;
        EventConsumer<PdfRendererEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onOpenInAnotherAppPressed, "onOpenInAnotherAppPressed");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(2117772381);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenInAnotherAppPressed) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    pdfRendererDuxo2 = pdfRendererDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(pdfRendererDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    pdfRendererDuxo2 = pdfRendererDuxo;
                }
                i3 |= i6;
            } else {
                pdfRendererDuxo2 = pdfRendererDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PdfRendererDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-57345);
                        pdfRendererDuxo3 = (PdfRendererDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2117772381, i4, -1, "com.robinhood.android.pdfrenderer.PdfRendererComposable (PdfRendererComposable.kt:42)");
                        }
                        final StateFlow<Event<PdfRendererEvent>> eventFlow = pdfRendererDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PdfRendererComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof PdfRendererEvent) {
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
                        Event<PdfRendererEvent> value = eventFlow.getValue();
                        event = value;
                        if (!((event == null ? event.getData() : null) instanceof PdfRendererEvent)) {
                            value = null;
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        eventPdfRendererComposable$lambda$0 = PdfRendererComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (eventPdfRendererComposable$lambda$0 != null && (eventPdfRendererComposable$lambda$0.getData() instanceof PdfRendererEvent.Error) && (eventConsumerInvoke = eventPdfRendererComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventPdfRendererComposable$lambda$0, new Function1() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m17600invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17600invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onError.invoke();
                                }
                            });
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(pdfRendererDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        modifier2 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(765717793, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.PdfRendererComposable.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(765717793, i7, -1, "com.robinhood.android.pdfrenderer.PdfRendererComposable.<anonymous> (PdfRendererComposable.kt:52)");
                                }
                                PdfRendererComposable.AppBar(PdfRendererComposable.PdfRendererComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle2).getTitle(), onCloseClicked, onOpenInAnotherAppPressed, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1765923564, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.PdfRendererComposable.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                                invoke(paddingValues, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues padding, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(padding, "padding");
                                if ((i7 & 6) == 0) {
                                    i7 |= composer2.changed(padding) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1765923564, i7, -1, "com.robinhood.android.pdfrenderer.PdfRendererComposable.<anonymous> (PdfRendererComposable.kt:59)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), padding);
                                SnapshotState4<PdfRendererViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
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
                                Column6 column6 = Column6.INSTANCE;
                                PdfRendererViewState pdfRendererViewStatePdfRendererComposable$lambda$2 = PdfRendererComposable.PdfRendererComposable$lambda$2(snapshotState4);
                                if (pdfRendererViewStatePdfRendererComposable$lambda$2 instanceof PdfRendererViewState.Loaded) {
                                    composer2.startReplaceGroup(-169426759);
                                    PdfRendererComposable.PdfRendererContent(((PdfRendererViewState.Loaded) pdfRendererViewStatePdfRendererComposable$lambda$2).getPages(), null, composer2, 0, 2);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(pdfRendererViewStatePdfRendererComposable$lambda$2 instanceof PdfRendererViewState.Loading)) {
                                        composer2.startReplaceGroup(410174248);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(-169284531);
                                    LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(TestTag3.testTag(companion, PdfRendererComposable4.PROGRESS_VIEW), composer2, 6, 0);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 9) & 14) | 805306416, 508);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        pdfRendererDuxo4 = pdfRendererDuxo3;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                pdfRendererDuxo3 = pdfRendererDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Flow eventFlow2 = pdfRendererDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PdfRendererComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof PdfRendererEvent) {
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
                Event<PdfRendererEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof PdfRendererEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventPdfRendererComposable$lambda$0 = PdfRendererComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                if (eventPdfRendererComposable$lambda$0 != null) {
                    eventConsumerInvoke.consume(eventPdfRendererComposable$lambda$0, new Function1() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m17600invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m17600invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onError.invoke();
                        }
                    });
                }
                final SnapshotState4<? extends PdfRendererViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(pdfRendererDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(765717793, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.PdfRendererComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(765717793, i7, -1, "com.robinhood.android.pdfrenderer.PdfRendererComposable.<anonymous> (PdfRendererComposable.kt:52)");
                        }
                        PdfRendererComposable.AppBar(PdfRendererComposable.PdfRendererComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle22).getTitle(), onCloseClicked, onOpenInAnotherAppPressed, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1765923564, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.PdfRendererComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues padding, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(padding, "padding");
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(padding) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1765923564, i7, -1, "com.robinhood.android.pdfrenderer.PdfRendererComposable.<anonymous> (PdfRendererComposable.kt:59)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), padding);
                        SnapshotState4<PdfRendererViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
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
                        Column6 column6 = Column6.INSTANCE;
                        PdfRendererViewState pdfRendererViewStatePdfRendererComposable$lambda$2 = PdfRendererComposable.PdfRendererComposable$lambda$2(snapshotState4);
                        if (pdfRendererViewStatePdfRendererComposable$lambda$2 instanceof PdfRendererViewState.Loaded) {
                            composer2.startReplaceGroup(-169426759);
                            PdfRendererComposable.PdfRendererContent(((PdfRendererViewState.Loaded) pdfRendererViewStatePdfRendererComposable$lambda$2).getPages(), null, composer2, 0, 2);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(pdfRendererViewStatePdfRendererComposable$lambda$2 instanceof PdfRendererViewState.Loading)) {
                                composer2.startReplaceGroup(410174248);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-169284531);
                            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(TestTag3.testTag(companion, PdfRendererComposable4.PROGRESS_VIEW), composer2, 6, 0);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 9) & 14) | 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                pdfRendererDuxo4 = pdfRendererDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                pdfRendererDuxo4 = pdfRendererDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PdfRendererComposable.PdfRendererComposable$lambda$3(onCloseClicked, onOpenInAnotherAppPressed, onError, modifier4, pdfRendererDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Event<PdfRendererEvent> PdfRendererComposable$lambda$0(SnapshotState4<Event<PdfRendererEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PdfRendererViewState PdfRendererComposable$lambda$2(SnapshotState4<? extends PdfRendererViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PdfRendererContent(final ImmutableList<RhPdfRenderer.Page> immutableList, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1217951940);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-1217951940, i3, -1, "com.robinhood.android.pdfrenderer.PdfRendererContent (PdfRendererComposable.kt:84)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(immutableList);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PdfRendererComposable.PdfRendererContent$lambda$5$lambda$4(immutableList, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PdfRendererComposable.PdfRendererContent$lambda$6(immutableList, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(immutableList);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PdfRendererComposable.PdfRendererContent$lambda$5$lambda$4(immutableList, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdfRendererContent$lambda$5$lambda$4(final ImmutableList immutableList, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, immutableList.size(), null, null, ComposableLambda3.composableLambdaInstance(1034886878, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererContent$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, final int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1034886878, i2, -1, "com.robinhood.android.pdfrenderer.PdfRendererContent.<anonymous>.<anonymous>.<anonymous> (PdfRendererComposable.kt:87)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                final ImmutableList<RhPdfRenderer.Page> immutableList2 = immutableList;
                BoxWithConstraints.BoxWithConstraints(modifierFillMaxWidth$default, null, false, ComposableLambda3.rememberComposableLambda(-1450911544, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$PdfRendererContent$1$1$1.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                        invoke(boxWithConstraints4, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i3) {
                        int i4;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i3 & 6) == 0) {
                            i4 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i3;
                        } else {
                            i4 = i3;
                        }
                        if ((i4 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1450911544, i4, -1, "com.robinhood.android.pdfrenderer.PdfRendererContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfRendererComposable.kt:88)");
                        }
                        RhPdfRenderer.Page page = immutableList2.get(i);
                        Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Unit unit = Unit.INSTANCE;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(page) | composer2.changedInstance(context);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PdfRendererComposable3(page, context, null);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                        Bitmap bitmap = (Bitmap) SnapshotStateKt.collectAsState(page.getPageContent(), null, composer2, 0, 1).getValue();
                        ImageBitmap imageBitmapAsImageBitmap = bitmap != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmap) : null;
                        if (imageBitmapAsImageBitmap != null) {
                            composer2.startReplaceGroup(445381670);
                            ImageKt.m4912Image5hnEew(imageBitmapAsImageBitmap, null, TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PdfRendererComposable4.PAGE + i), null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composer2, 24624, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(445755158);
                            BoxKt.Box(TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PdfRendererComposable.pxToDp(page.getHeightFromWidth(Constraints.m7975getMaxWidthimpl(BoxWithConstraints.getConstraints())), composer2, 0)), PdfRendererComposable4.PAGE_PLACEHOLDER + i), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3078, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppBar(final String str, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-447702908);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-447702908, i2, -1, "com.robinhood.android.pdfrenderer.AppBar (PdfRendererComposable.kt:123)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1234703351, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.AppBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1234703351, i3, -1, "com.robinhood.android.pdfrenderer.AppBar.<anonymous> (PdfRendererComposable.kt:126)");
                    }
                    TextStyle textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                    BentoText2.m20747BentoText38GnDrw(str, TestTag3.testTag(Modifier.INSTANCE, "title"), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 48, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-48902621, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.AppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-48902621, i3, -1, "com.robinhood.android.pdfrenderer.AppBar.<anonymous> (PdfRendererComposable.kt:133)");
                    }
                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "close_button"), false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i3 << 12) & 57344), 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-141385822, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt.AppBar.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-141385822, i3, -1, "com.robinhood.android.pdfrenderer.AppBar.<anonymous> (PdfRendererComposable.kt:139)");
                    }
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function02, StringResources_androidKt.stringResource(C25471R.string.open_in_another_app, composer3, 0), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), PdfRendererComposable4.OPEN_IN_ANOTHER_APP_BUTTON), null, null, false, null, composer3, 0, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pdfrenderer.PdfRendererComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdfRendererComposable.AppBar$lambda$7(str, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float pxToDp(int i, Composer composer, int i2) {
        composer.startReplaceGroup(-1550675023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1550675023, i2, -1, "com.robinhood.android.pdfrenderer.pxToDp (PdfRendererComposable.kt:151)");
        }
        float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo5013toDpu2uoSUM;
    }
}
