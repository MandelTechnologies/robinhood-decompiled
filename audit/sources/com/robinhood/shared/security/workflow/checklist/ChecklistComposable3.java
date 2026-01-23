package com.robinhood.shared.security.workflow.checklist;

import android.app.Activity;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.workflow.p358ui.UiWorkflowStatus;
import com.robinhood.shared.security.workflow.checklist.ChecklistComposable3;
import com.robinhood.shared.security.workflow.checklist.ChecklistEvent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ChecklistComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"ChecklistComposable", "", "headerTitle", "", "markdownItems", "Lkotlinx/collections/immutable/ImmutableList;", Footer.f10637type, "primaryCta", "secondaryCta", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistDuxo;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/security/workflow/checklist/ChecklistDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-workflow_externalDebug", "viewState", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChecklistComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChecklistComposable$lambda$4(String str, ImmutableList immutableList, String str2, String str3, String str4, Modifier modifier, ChecklistDuxo checklistDuxo, int i, int i2, Composer composer, int i3) {
        ChecklistComposable(str, immutableList, str2, str3, str4, modifier, checklistDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChecklistComposable(final String headerTitle, final ImmutableList<String> markdownItems, final String footer, final String primaryCta, final String secondaryCta, Modifier modifier, ChecklistDuxo checklistDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ChecklistDuxo checklistDuxo2;
        Modifier modifier3;
        final ChecklistDuxo checklistDuxo3;
        final Activity activity;
        final Navigator navigator;
        Event<ChecklistEvent> event;
        final Event<ChecklistEvent> eventChecklistComposable$lambda$1;
        final Event<ChecklistEvent> eventChecklistComposable$lambda$12;
        final ChecklistDuxo checklistDuxo4;
        final Modifier modifier4;
        EventConsumer<ChecklistEvent> eventConsumerInvoke;
        EventConsumer<ChecklistEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(markdownItems, "markdownItems");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1660071894);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(headerTitle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(markdownItems) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(footer) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryCta) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(secondaryCta) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    checklistDuxo2 = checklistDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(checklistDuxo2) ? 1048576 : 524288;
                    i3 |= i5;
                } else {
                    checklistDuxo2 = checklistDuxo;
                }
                i3 |= i5;
            } else {
                checklistDuxo2 = checklistDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ChecklistDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$duxo$1.1
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
                        checklistDuxo3 = (ChecklistDuxo) baseDuxo;
                        i3 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1660071894, i3, -1, "com.robinhood.shared.security.workflow.checklist.ChecklistComposable (ChecklistComposable.kt:35)");
                    }
                    Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    activity = (Activity) objConsume;
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(checklistDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final StateFlow<Event<ChecklistEvent>> eventFlow = checklistDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ChecklistComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof ChecklistEvent) {
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
                    Event<ChecklistEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof ChecklistEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventChecklistComposable$lambda$1 = ChecklistComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventChecklistComposable$lambda$1 != null && (eventChecklistComposable$lambda$1.getData() instanceof ChecklistEvent.Exit) && (eventConsumerInvoke2 = eventChecklistComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventChecklistComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25695invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25695invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                NavigationActivityResultContract3.finishWithResult$default(activity, UiWorkflowStatus.DENIED, 0, 2, null);
                            }
                        });
                    }
                    eventChecklistComposable$lambda$12 = ChecklistComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventChecklistComposable$lambda$12 != null && (eventChecklistComposable$lambda$12.getData() instanceof ChecklistEvent.Deeplink) && (eventConsumerInvoke = eventChecklistComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventChecklistComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25696invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25696invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.handleDeepLink$default(navigator, activity, Uri.parse(((ChecklistEvent.Deeplink) eventChecklistComposable$lambda$12.getData()).getDeeplink()), null, null, false, null, 60, null);
                                activity.finish();
                            }
                        });
                    }
                    int i6 = i3;
                    Modifier modifier5 = modifier3;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier5, false, ComposableLambda3.rememberComposableLambda(-1659491617, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt.ChecklistComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                            invoke(bentoButtonBar3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1659491617, i7, -1, "com.robinhood.shared.security.workflow.checklist.ChecklistComposable.<anonymous> (ChecklistComposable.kt:53)");
                            }
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ChecklistDuxo checklistDuxo5 = checklistDuxo3;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(checklistDuxo5);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new ChecklistComposable4(checklistDuxo5);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            KFunction kFunction = (KFunction) objRememberedValue2;
                            composer2.endReplaceGroup();
                            boolean zIsPrimaryCtaEnabled = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isPrimaryCtaEnabled();
                            boolean zIsPrimaryCtaLoading = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isPrimaryCtaLoading();
                            ChecklistDuxo checklistDuxo6 = checklistDuxo3;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer2.changedInstance(checklistDuxo6);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new ChecklistComposable5(checklistDuxo6);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, footer, null, false, null, null, (Function0) kFunction, primaryCta, zIsPrimaryCtaLoading, null, zIsPrimaryCtaEnabled, (Function0) ((KFunction) objRememberedValue3), secondaryCta, false, null, false, composer2, 0, 0, 57916);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(131805970, true, new C397684(headerTitle, markdownItems, checklistDuxo3, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 15) & 14) | 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    checklistDuxo4 = checklistDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    modifier3 = modifier2;
                }
                checklistDuxo3 = checklistDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume2;
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4<ChecklistViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(checklistDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = checklistDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ChecklistComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof ChecklistEvent) {
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
                Event<ChecklistEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof ChecklistEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventChecklistComposable$lambda$1 = ChecklistComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventChecklistComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventChecklistComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25695invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25695invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            NavigationActivityResultContract3.finishWithResult$default(activity, UiWorkflowStatus.DENIED, 0, 2, null);
                        }
                    });
                }
                eventChecklistComposable$lambda$12 = ChecklistComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventChecklistComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventChecklistComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25696invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25696invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, activity, Uri.parse(((ChecklistEvent.Deeplink) eventChecklistComposable$lambda$12.getData()).getDeeplink()), null, null, false, null, 60, null);
                            activity.finish();
                        }
                    });
                }
                int i62 = i3;
                Modifier modifier52 = modifier3;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier52, false, ComposableLambda3.rememberComposableLambda(-1659491617, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt.ChecklistComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1659491617, i7, -1, "com.robinhood.shared.security.workflow.checklist.ChecklistComposable.<anonymous> (ChecklistComposable.kt:53)");
                        }
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ChecklistDuxo checklistDuxo5 = checklistDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(checklistDuxo5);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ChecklistComposable4(checklistDuxo5);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue2;
                        composer2.endReplaceGroup();
                        boolean zIsPrimaryCtaEnabled = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isPrimaryCtaEnabled();
                        boolean zIsPrimaryCtaLoading = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isPrimaryCtaLoading();
                        ChecklistDuxo checklistDuxo6 = checklistDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(checklistDuxo6);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ChecklistComposable5(checklistDuxo6);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, footer, null, false, null, null, (Function0) kFunction, primaryCta, zIsPrimaryCtaLoading, null, zIsPrimaryCtaEnabled, (Function0) ((KFunction) objRememberedValue3), secondaryCta, false, null, false, composer2, 0, 0, 57916);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(131805970, true, new C397684(headerTitle, markdownItems, checklistDuxo3, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i62 >> 15) & 14) | 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                }
                checklistDuxo4 = checklistDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                checklistDuxo4 = checklistDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChecklistComposable3.ChecklistComposable$lambda$4(headerTitle, markdownItems, footer, primaryCta, secondaryCta, modifier4, checklistDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 64) == 0) {
                    checklistDuxo3 = checklistDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume22 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume22;
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4<ChecklistViewState> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(checklistDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow22 = checklistDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ChecklistComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof ChecklistEvent) {
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
                Event<ChecklistEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof ChecklistEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventChecklistComposable$lambda$1 = ChecklistComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventChecklistComposable$lambda$1 != null) {
                }
                eventChecklistComposable$lambda$12 = ChecklistComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventChecklistComposable$lambda$12 != null) {
                }
                int i622 = i3;
                Modifier modifier522 = modifier3;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier522, false, ComposableLambda3.rememberComposableLambda(-1659491617, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt.ChecklistComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1659491617, i7, -1, "com.robinhood.shared.security.workflow.checklist.ChecklistComposable.<anonymous> (ChecklistComposable.kt:53)");
                        }
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ChecklistDuxo checklistDuxo5 = checklistDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(checklistDuxo5);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ChecklistComposable4(checklistDuxo5);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue2;
                        composer2.endReplaceGroup();
                        boolean zIsPrimaryCtaEnabled = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle32).isPrimaryCtaEnabled();
                        boolean zIsPrimaryCtaLoading = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle32).isPrimaryCtaLoading();
                        ChecklistDuxo checklistDuxo6 = checklistDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(checklistDuxo6);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ChecklistComposable5(checklistDuxo6);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, footer, null, false, null, null, (Function0) kFunction, primaryCta, zIsPrimaryCtaLoading, null, zIsPrimaryCtaEnabled, (Function0) ((KFunction) objRememberedValue3), secondaryCta, false, null, false, composer2, 0, 0, 57916);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(131805970, true, new C397684(headerTitle, markdownItems, checklistDuxo3, snapshotState4CollectAsStateWithLifecycle32), composerStartRestartGroup, 54), composerStartRestartGroup, ((i622 >> 15) & 14) | 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                }
                checklistDuxo4 = checklistDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ChecklistComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$4 */
    static final class C397684 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ ChecklistDuxo $duxo;
        final /* synthetic */ String $headerTitle;
        final /* synthetic */ ImmutableList<String> $markdownItems;
        final /* synthetic */ SnapshotState4<ChecklistViewState> $viewState$delegate;

        C397684(String str, ImmutableList<String> immutableList, ChecklistDuxo checklistDuxo, SnapshotState4<ChecklistViewState> snapshotState4) {
            this.$headerTitle = str;
            this.$markdownItems = immutableList;
            this.$duxo = checklistDuxo;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(ChecklistDuxo checklistDuxo, int i, boolean z) {
            checklistDuxo.onCheckboxClicked(i);
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(131805970, i, -1, "com.robinhood.shared.security.workflow.checklist.ChecklistComposable.<anonymous> (ChecklistComposable.kt:65)");
            }
            String str = this.$headerTitle;
            ImmutableList<String> immutableList = this.$markdownItems;
            ChecklistDuxo checklistDuxo = this.$duxo;
            SnapshotState4<ChecklistViewState> snapshotState4 = this.$viewState$delegate;
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            ChecklistDuxo checklistDuxo2 = checklistDuxo;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleLarge(), composer, 0, 0, 8188);
            Composer composer2 = composer;
            composer2.startReplaceGroup(598136583);
            final int i3 = 0;
            for (String str2 : immutableList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str3 = str2;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                boolean zBooleanValue = ChecklistComposable3.ChecklistComposable$lambda$0(snapshotState4).getCheckboxStates().get(i3).booleanValue();
                composer2.startReplaceGroup(-1633490746);
                final ChecklistDuxo checklistDuxo3 = checklistDuxo2;
                boolean zChangedInstance = composer2.changedInstance(checklistDuxo3) | composer2.changed(i3);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChecklistComposable3.C397684.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(checklistDuxo3, i3, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, zBooleanValue, false, null, (Function1) objRememberedValue, composer2, 0, 13);
                BentoMarkdownText2.BentoMarkdownText(str3, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null), (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 28);
                composer.endNode();
                composer2 = composer;
                i3 = i4;
                checklistDuxo2 = checklistDuxo3;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChecklistViewState ChecklistComposable$lambda$0(SnapshotState4<ChecklistViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<ChecklistEvent> ChecklistComposable$lambda$1(SnapshotState4<Event<ChecklistEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
