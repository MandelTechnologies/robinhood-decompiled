package com.robinhood.android.isa.onboarding;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.isa.contracts.IsaSignUpErrorFragmentKey;
import com.robinhood.android.isa.onboarding.IsaSignUpComposable;
import com.robinhood.android.isa.onboarding.IsaSignUpDuxo3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IsaSignUpComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"IsaSignUpComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/isa/onboarding/IsaSignUpDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/isa/onboarding/IsaSignUpDuxo;Landroidx/compose/runtime/Composer;II)V", "IsaSignUpScreen", "onCtaClick", "Lkotlin/Function0;", "isCtaLoading", "", "pageConfigs", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/isa/onboarding/PageConfig;", "(Lkotlin/jvm/functions/Function0;ZLkotlinx/collections/immutable/PersistentList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HorizontalPager", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "pages", "Lcom/robinhood/android/isa/onboarding/ValueProp;", "(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PageIndicator", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-isa-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/isa/onboarding/IsaSignUpViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/isa/onboarding/IsaSignUpEvent;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaSignUpComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPager$lambda$7(PagerState pagerState, ImmutableList3 immutableList3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HorizontalPager(pagerState, immutableList3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaSignUpComposable$lambda$5(Modifier modifier, IsaSignUpDuxo isaSignUpDuxo, int i, int i2, Composer composer, int i3) {
        IsaSignUpComposable(modifier, isaSignUpDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaSignUpScreen$lambda$6(Function0 function0, boolean z, ImmutableList3 immutableList3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IsaSignUpScreen(function0, z, immutableList3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PageIndicator$lambda$10(PagerState pagerState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PageIndicator(pagerState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaSignUpComposable(final Modifier modifier, final IsaSignUpDuxo isaSignUpDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final Context context;
        final Navigator navigator;
        Event<IsaSignUpDuxo3> event;
        final Event<IsaSignUpDuxo3> eventIsaSignUpComposable$lambda$1;
        final Event<IsaSignUpDuxo3> eventIsaSignUpComposable$lambda$12;
        final Event<IsaSignUpDuxo3> eventIsaSignUpComposable$lambda$13;
        EventConsumer<IsaSignUpDuxo3> eventConsumerInvoke;
        EventConsumer<IsaSignUpDuxo3> eventConsumerInvoke2;
        EventConsumer<IsaSignUpDuxo3> eventConsumerInvoke3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1083150462);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(isaSignUpDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IsaSignUpDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$duxo$1.1
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
                    isaSignUpDuxo = (IsaSignUpDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083150462, i5, -1, "com.robinhood.android.isa.onboarding.IsaSignUpComposable (IsaSignUpComposable.kt:48)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(isaSignUpDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final StateFlow<Event<IsaSignUpDuxo3>> eventFlow = isaSignUpDuxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "IsaSignUpComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof IsaSignUpDuxo3) {
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
                Event<IsaSignUpDuxo3> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof IsaSignUpDuxo3)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventIsaSignUpComposable$lambda$1 = IsaSignUpComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventIsaSignUpComposable$lambda$1 != null && (eventIsaSignUpComposable$lambda$1.getData() instanceof IsaSignUpDuxo3.InfoSheet) && (eventConsumerInvoke3 = eventIsaSignUpComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventIsaSignUpComposable$lambda$1, new Function1() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15745invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15745invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            IsaSignUpDuxo3.InfoSheet infoSheet = (IsaSignUpDuxo3.InfoSheet) eventIsaSignUpComposable$lambda$1.getData();
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse("robinhood://info_sheet?id=" + infoSheet.getId()), null, null, false, null, 60, null);
                        }
                    });
                }
                eventIsaSignUpComposable$lambda$12 = IsaSignUpComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventIsaSignUpComposable$lambda$12 != null && (eventIsaSignUpComposable$lambda$12.getData() instanceof IsaSignUpDuxo3.Onboarding) && (eventConsumerInvoke2 = eventIsaSignUpComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventIsaSignUpComposable$lambda$12, new Function1() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15746invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15746invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new GenericSdFlowIntentKey("isa_onboarding", true, null, null, null, null, false, null, null, 508, null), null, false, null, null, 60, null);
                        }
                    });
                }
                eventIsaSignUpComposable$lambda$13 = IsaSignUpComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventIsaSignUpComposable$lambda$13 != null && (eventIsaSignUpComposable$lambda$13.getData() instanceof IsaSignUpDuxo3.Error) && (eventConsumerInvoke = eventIsaSignUpComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventIsaSignUpComposable$lambda$13, new Function1() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15747invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15747invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, IsaSignUpErrorFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
                        }
                    });
                }
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1314578519, true, new C199584(isaSignUpDuxo, modifier, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(isaSignUpDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = isaSignUpDuxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "IsaSignUpComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof IsaSignUpDuxo3) {
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
                Event<IsaSignUpDuxo3> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof IsaSignUpDuxo3)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventIsaSignUpComposable$lambda$1 = IsaSignUpComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventIsaSignUpComposable$lambda$1 != null) {
                    eventConsumerInvoke3.consume(eventIsaSignUpComposable$lambda$1, new Function1() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15745invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15745invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            IsaSignUpDuxo3.InfoSheet infoSheet = (IsaSignUpDuxo3.InfoSheet) eventIsaSignUpComposable$lambda$1.getData();
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse("robinhood://info_sheet?id=" + infoSheet.getId()), null, null, false, null, 60, null);
                        }
                    });
                }
                eventIsaSignUpComposable$lambda$12 = IsaSignUpComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventIsaSignUpComposable$lambda$12 != null) {
                    eventConsumerInvoke2.consume(eventIsaSignUpComposable$lambda$12, new Function1() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15746invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15746invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new GenericSdFlowIntentKey("isa_onboarding", true, null, null, null, null, false, null, null, 508, null), null, false, null, null, 60, null);
                        }
                    });
                }
                eventIsaSignUpComposable$lambda$13 = IsaSignUpComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventIsaSignUpComposable$lambda$13 != null) {
                    eventConsumerInvoke.consume(eventIsaSignUpComposable$lambda$13, new Function1() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15747invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15747invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, IsaSignUpErrorFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
                        }
                    });
                }
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1314578519, true, new C199584(isaSignUpDuxo, modifier, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaSignUpComposable.IsaSignUpComposable$lambda$5(modifier, isaSignUpDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: IsaSignUpComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$4 */
    static final class C199584 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ IsaSignUpDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState4<IsaSignUpViewState> $viewState$delegate;

        C199584(IsaSignUpDuxo isaSignUpDuxo, Modifier modifier, SnapshotState4<IsaSignUpViewState> snapshotState4) {
            this.$duxo = isaSignUpDuxo;
            this.$modifier = modifier;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314578519, i, -1, "com.robinhood.android.isa.onboarding.IsaSignUpComposable.<anonymous> (IsaSignUpComposable.kt:78)");
            }
            boolean zIsCtaLoading = IsaSignUpComposable.IsaSignUpComposable$lambda$0(this.$viewState$delegate).isCtaLoading();
            ImmutableList3<PageConfig> pageConfigs = IsaSignUpComposable.IsaSignUpComposable$lambda$0(this.$viewState$delegate).getPageConfigs();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final IsaSignUpDuxo isaSignUpDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsaSignUpComposable.C199584.invoke$lambda$1$lambda$0(isaSignUpDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            IsaSignUpComposable.IsaSignUpScreen((Function0) objRememberedValue, zIsCtaLoading, pageConfigs, this.$modifier, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(IsaSignUpDuxo isaSignUpDuxo) {
            isaSignUpDuxo.checkEligibility();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: IsaSignUpComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$HorizontalPager$1 */
    static final class C199571 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ ImmutableList3<ValueProp> $pages;

        C199571(ImmutableList3<ValueProp> immutableList3, PagerState pagerState) {
            this.$pages = immutableList3;
            this.$pagerState = pagerState;
        }

        private static final LottieComposition invoke$lambda$5$lambda$4$lambda$0(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$5$lambda$4$lambda$1(LottieAnimationState lottieAnimationState) {
            return lottieAnimationState.getValue().floatValue();
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            invoke(pagerScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1147027884, i2, -1, "com.robinhood.android.isa.onboarding.HorizontalPager.<anonymous> (IsaSignUpComposable.kt:145)");
            }
            ValueProp valueProp = this.$pages.get(i);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            PagerState pagerState = this.$pagerState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(valueProp.getLottieUrl().getUrl().getUrl())), null, null, null, null, null, composer, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(invoke$lambda$5$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition), pagerState.getTargetPage() == i, false, false, null, 0.0f, 1, null, false, false, composer, 1573248, 952);
            LottieComposition lottieCompositionInvoke$lambda$5$lambda$4$lambda$0 = invoke$lambda$5$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$HorizontalPager$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(IsaSignUpComposable.C199571.invoke$lambda$5$lambda$4$lambda$1(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionInvoke$lambda$5$lambda$4$lambda$0, (Function0) objRememberedValue, null, false, false, false, null, false, null, null, null, false, false, null, null, false, composer, 0, 0, 65532);
            composer.endNode();
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(valueProp.getHeaderResId(), composer, 0);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge(), composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(valueProp.getSubtitleResId(), composer, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(valueProp.getDisclosureResId(), composer, 0), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextS(), composer, 0, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsaSignUpViewState IsaSignUpComposable$lambda$0(SnapshotState4<IsaSignUpViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<IsaSignUpDuxo3> IsaSignUpComposable$lambda$1(SnapshotState4<Event<IsaSignUpDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: IsaSignUpComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpScreen$1 */
    static final class C199591 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ boolean $isCtaLoading;
        final /* synthetic */ Function0<Unit> $onCtaClick;
        final /* synthetic */ ImmutableList3<PageConfig> $pageConfigs;

        C199591(ImmutableList3<PageConfig> immutableList3, Function0<Unit> function0, boolean z) {
            this.$pageConfigs = immutableList3;
            this.$onCtaClick = function0;
            this.$isCtaLoading = z;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(703276688, i2, -1, "com.robinhood.android.isa.onboarding.IsaSignUpScreen.<anonymous> (IsaSignUpComposable.kt:99)");
            }
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ImmutableList3<PageConfig> immutableList3 = this.$pageConfigs;
            Function0<Unit> function0 = this.$onCtaClick;
            boolean z = this.$isCtaLoading;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            boolean isDay = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
            for (PageConfig pageConfig : immutableList3) {
                arrayList.add(new ValueProp(isDay ? pageConfig.getLightLottieUrl() : pageConfig.getDarkLottieUrl(), pageConfig.getHeaderResId(), pageConfig.getSubtitleResId(), pageConfig.getDisclosureResId()));
            }
            final ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(persistentList);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$IsaSignUpScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(persistentList.size());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composer, 0, 3);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            IsaSignUpComposable.HorizontalPager(pagerStateRememberPagerState, persistentList, Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer, 0, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            IsaSignUpComposable.PageIndicator(pagerStateRememberPagerState, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C19966R.string.isa_sign_up_cta, composer, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), null, null, false, z, null, null, null, null, false, null, composer, 0, 0, 8120);
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
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaSignUpScreen(final Function0<Unit> onCtaClick, final boolean z, final ImmutableList3<PageConfig> pageConfigs, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Intrinsics.checkNotNullParameter(pageConfigs, "pageConfigs");
        Composer composerStartRestartGroup = composer.startRestartGroup(395123265);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCtaClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(pageConfigs) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(395123265, i3, -1, "com.robinhood.android.isa.onboarding.IsaSignUpScreen (IsaSignUpComposable.kt:93)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = ((i3 >> 9) & 14) | 805306368;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(703276688, true, new C199591(pageConfigs, onCtaClick, z), composerStartRestartGroup, 54), composer2, i6, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaSignUpComposable.IsaSignUpScreen$lambda$6(onCtaClick, z, pageConfigs, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = ((i3 >> 9) & 14) | 805306368;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(703276688, true, new C199591(pageConfigs, onCtaClick, z), composerStartRestartGroup, 54), composer2, i62, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalPager(final PagerState pagerState, final ImmutableList3<ValueProp> immutableList3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(55016269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(immutableList3) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(55016269, i3, -1, "com.robinhood.android.isa.onboarding.HorizontalPager (IsaSignUpComposable.kt:140)");
                }
                Modifier modifier5 = modifier4;
                PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifier5, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1147027884, true, new C199571(immutableList3, pagerState), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112), 24576, 16380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaSignUpComposable.HorizontalPager$lambda$7(pagerState, immutableList3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifier52, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1147027884, true, new C199571(immutableList3, pagerState), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112), 24576, 16380);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PageIndicator(final PagerState pagerState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long jM21427getFg30d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(647040741);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647040741, i3, -1, "com.robinhood.android.isa.onboarding.PageIndicator (IsaSignUpComposable.kt:198)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2099841233);
            int pageCount = pagerState.getPageCount();
            for (int i5 = 0; i5 < pageCount; i5++) {
                if (pagerState.getCurrentPage() == i5) {
                    composerStartRestartGroup.startReplaceGroup(-686691915);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-686634348);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(6)), RoundedCornerShape2.getCircleShape()), jM21427getFg30d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.onboarding.IsaSignUpComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaSignUpComposable.PageIndicator$lambda$10(pagerState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
