package com.robinhood.shared.crypto.transfer.enrollment.mfa;

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
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable4;
import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaEvent;
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

/* compiled from: CryptoTransferEnrollmentMfaComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\u0012\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u008a\u0084\u0002"}, m3636d2 = {"CryptoTransferEnrollmentMfaComposable", "", "onNavigate", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "onError", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "state", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferEnrollmentMfaComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferEnrollmentMfaComposable$lambda$3(Function1 function1, Function1 function12, Modifier modifier, CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferEnrollmentMfaComposable(function1, function12, modifier, cryptoTransferEnrollmentMfaDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferEnrollmentMfaComposable(final Function1<? super CryptoTransferEnrollmentMfaEvent.Navigate, Unit> onNavigate, final Function1<? super Throwable, Unit> onError, Modifier modifier, CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo2;
        final Modifier modifier3;
        int i4;
        final CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo3;
        Event<CryptoTransferEnrollmentMfaEvent> event;
        final Event<CryptoTransferEnrollmentMfaEvent> eventCryptoTransferEnrollmentMfaComposable$lambda$1;
        final Event<CryptoTransferEnrollmentMfaEvent> eventCryptoTransferEnrollmentMfaComposable$lambda$12;
        final CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoTransferEnrollmentMfaEvent> eventConsumerInvoke;
        EventConsumer<CryptoTransferEnrollmentMfaEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onNavigate, "onNavigate");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-699860169);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onNavigate) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoTransferEnrollmentMfaDuxo2 = cryptoTransferEnrollmentMfaDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTransferEnrollmentMfaDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoTransferEnrollmentMfaDuxo2 = cryptoTransferEnrollmentMfaDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTransferEnrollmentMfaDuxo2 = cryptoTransferEnrollmentMfaDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferEnrollmentMfaDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$duxo$1.1
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
                        CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo5 = (CryptoTransferEnrollmentMfaDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        cryptoTransferEnrollmentMfaDuxo3 = cryptoTransferEnrollmentMfaDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-699860169, i4, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable (CryptoTransferEnrollmentMfaComposable.kt:40)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferEnrollmentMfaDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final StateFlow<Event<CryptoTransferEnrollmentMfaEvent>> eventFlow = cryptoTransferEnrollmentMfaDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferEnrollmentMfaComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoTransferEnrollmentMfaEvent) {
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
                    Event<CryptoTransferEnrollmentMfaEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoTransferEnrollmentMfaEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1552698142, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt.CryptoTransferEnrollmentMfaComposable.1
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
                                ComposerKt.traceEventStart(-1552698142, i7, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable.<anonymous> (CryptoTransferEnrollmentMfaComposable.kt:49)");
                            }
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, CryptoTransferEnrollmentMfaComposable.INSTANCE.getLambda$1965160350$feature_crypto_transfer_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1697102989, true, new AnonymousClass1(cryptoTransferEnrollmentMfaDuxo3, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoTransferEnrollmentMfaComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ CryptoTransferEnrollmentMfaDuxo $duxo;
                            final /* synthetic */ SnapshotState4<CryptoTransferEnrollmentMfaViewState> $state$delegate;

                            AnonymousClass1(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo, SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4) {
                                this.$duxo = cryptoTransferEnrollmentMfaDuxo;
                                this.$state$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                Object obj;
                                Composer composer2 = composer;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                int i2 = (i & 6) == 0 ? i | (composer2.changed(paddingValues) ? 4 : 2) : i;
                                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1697102989, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable.<anonymous>.<anonymous> (CryptoTransferEnrollmentMfaComposable.kt:61)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierPadding, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 1, null);
                                final CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo = this.$duxo;
                                SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4 = this.$state$delegate;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CryptoTransferEnrollmentMfaComposable5.Title), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 7, null);
                                String strStringResource = StringResources_androidKt.stringResource(CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getTitleRes(), composer2, 0);
                                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i3).getDisplayCapsuleMedium();
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8124);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getSubtitleRes(), composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CryptoTransferEnrollmentMfaComposable5.Subtitle), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
                                composer2.startReplaceGroup(-1290712305);
                                for (MfaRow mfaRow : CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getMfaRows()) {
                                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, new BentoBaseRowState.Start.Icon(mfaRow.getLeadingIcon(), null, null, 6, null), StringResources_androidKt.stringResource(mfaRow.getPrimaryTextRes(), composer2, 0), StringResources_androidKt.stringResource(mfaRow.getSecondaryTextRes(), composer2, 0), null, null, null, false, false, false, 0L, null, composer, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3953);
                                    composer2 = composer;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                Integer helperTextRes = CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getHelperTextRes();
                                composer2.startReplaceGroup(-1157880162);
                                if (helperTextRes == null) {
                                    obj = null;
                                } else {
                                    int iIntValue = helperTextRes.intValue();
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferEnrollmentMfaComposable5.HelperText), 0.0f, 1, null);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    obj = null;
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(iIntValue, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8120);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferEnrollmentMfaComposable5.ContinueButton), 0.0f, 1, obj), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, obj), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_mfa_checklist_continue, composer2, 0);
                                boolean areButtonsLoading = CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getAreButtonsLoading();
                                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer2.changedInstance(cryptoTransferEnrollmentMfaDuxo);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoTransferEnrollmentMfaComposable4.C379731.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(cryptoTransferEnrollmentMfaDuxo);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, type2, false, areButtonsLoading, null, null, null, null, false, null, composer, 24576, 0, 8104);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4$lambda$3(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo) {
                                cryptoTransferEnrollmentMfaDuxo.onClickContinue();
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    eventCryptoTransferEnrollmentMfaComposable$lambda$1 = CryptoTransferEnrollmentMfaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoTransferEnrollmentMfaComposable$lambda$1 != null && (eventCryptoTransferEnrollmentMfaComposable$lambda$1.getData() instanceof CryptoTransferEnrollmentMfaEvent.Error) && (eventConsumerInvoke2 = eventCryptoTransferEnrollmentMfaComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventCryptoTransferEnrollmentMfaComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25005invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25005invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onError.invoke(((CryptoTransferEnrollmentMfaEvent.Error) eventCryptoTransferEnrollmentMfaComposable$lambda$1.getData()).getT());
                            }
                        });
                    }
                    eventCryptoTransferEnrollmentMfaComposable$lambda$12 = CryptoTransferEnrollmentMfaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoTransferEnrollmentMfaComposable$lambda$12 != null && (eventCryptoTransferEnrollmentMfaComposable$lambda$12.getData() instanceof CryptoTransferEnrollmentMfaEvent.Navigate) && (eventConsumerInvoke = eventCryptoTransferEnrollmentMfaComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoTransferEnrollmentMfaComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25006invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25006invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onNavigate.invoke(eventCryptoTransferEnrollmentMfaComposable$lambda$12.getData());
                            }
                        });
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoTransferEnrollmentMfaDuxo4 = cryptoTransferEnrollmentMfaDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                cryptoTransferEnrollmentMfaDuxo3 = cryptoTransferEnrollmentMfaDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferEnrollmentMfaDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = cryptoTransferEnrollmentMfaDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferEnrollmentMfaComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferEnrollmentMfaEvent) {
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
                Event<CryptoTransferEnrollmentMfaEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoTransferEnrollmentMfaEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1552698142, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt.CryptoTransferEnrollmentMfaComposable.1
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
                            ComposerKt.traceEventStart(-1552698142, i7, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable.<anonymous> (CryptoTransferEnrollmentMfaComposable.kt:49)");
                        }
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, CryptoTransferEnrollmentMfaComposable.INSTANCE.getLambda$1965160350$feature_crypto_transfer_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1697102989, true, new AnonymousClass1(cryptoTransferEnrollmentMfaDuxo3, snapshotState4CollectAsStateWithLifecycle3), composer2, 54), composer2, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTransferEnrollmentMfaComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ CryptoTransferEnrollmentMfaDuxo $duxo;
                        final /* synthetic */ SnapshotState4<CryptoTransferEnrollmentMfaViewState> $state$delegate;

                        AnonymousClass1(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo, SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4) {
                            this.$duxo = cryptoTransferEnrollmentMfaDuxo;
                            this.$state$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            Object obj;
                            Composer composer2 = composer;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            int i2 = (i & 6) == 0 ? i | (composer2.changed(paddingValues) ? 4 : 2) : i;
                            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1697102989, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable.<anonymous>.<anonymous> (CryptoTransferEnrollmentMfaComposable.kt:61)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierPadding, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 1, null);
                            final CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo = this.$duxo;
                            SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4 = this.$state$delegate;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CryptoTransferEnrollmentMfaComposable5.Title), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 7, null);
                            String strStringResource = StringResources_androidKt.stringResource(CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getTitleRes(), composer2, 0);
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i3).getDisplayCapsuleMedium();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getSubtitleRes(), composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CryptoTransferEnrollmentMfaComposable5.Subtitle), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
                            composer2.startReplaceGroup(-1290712305);
                            for (MfaRow mfaRow : CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getMfaRows()) {
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, new BentoBaseRowState.Start.Icon(mfaRow.getLeadingIcon(), null, null, 6, null), StringResources_androidKt.stringResource(mfaRow.getPrimaryTextRes(), composer2, 0), StringResources_androidKt.stringResource(mfaRow.getSecondaryTextRes(), composer2, 0), null, null, null, false, false, false, 0L, null, composer, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3953);
                                composer2 = composer;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            Integer helperTextRes = CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getHelperTextRes();
                            composer2.startReplaceGroup(-1157880162);
                            if (helperTextRes == null) {
                                obj = null;
                            } else {
                                int iIntValue = helperTextRes.intValue();
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferEnrollmentMfaComposable5.HelperText), 0.0f, 1, null);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i4 = BentoTheme.$stable;
                                obj = null;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(iIntValue, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8120);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferEnrollmentMfaComposable5.ContinueButton), 0.0f, 1, obj), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, obj), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                            String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_mfa_checklist_continue, composer2, 0);
                            boolean areButtonsLoading = CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getAreButtonsLoading();
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(cryptoTransferEnrollmentMfaDuxo);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTransferEnrollmentMfaComposable4.C379731.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(cryptoTransferEnrollmentMfaDuxo);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, type2, false, areButtonsLoading, null, null, null, null, false, null, composer, 24576, 0, 8104);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo) {
                            cryptoTransferEnrollmentMfaDuxo.onClickContinue();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventCryptoTransferEnrollmentMfaComposable$lambda$1 = CryptoTransferEnrollmentMfaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoTransferEnrollmentMfaComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventCryptoTransferEnrollmentMfaComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25005invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25005invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onError.invoke(((CryptoTransferEnrollmentMfaEvent.Error) eventCryptoTransferEnrollmentMfaComposable$lambda$1.getData()).getT());
                        }
                    });
                }
                eventCryptoTransferEnrollmentMfaComposable$lambda$12 = CryptoTransferEnrollmentMfaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoTransferEnrollmentMfaComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventCryptoTransferEnrollmentMfaComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25006invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25006invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onNavigate.invoke(eventCryptoTransferEnrollmentMfaComposable$lambda$12.getData());
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoTransferEnrollmentMfaDuxo4 = cryptoTransferEnrollmentMfaDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTransferEnrollmentMfaDuxo4 = cryptoTransferEnrollmentMfaDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$3(onNavigate, onError, modifier4, cryptoTransferEnrollmentMfaDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    cryptoTransferEnrollmentMfaDuxo3 = cryptoTransferEnrollmentMfaDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferEnrollmentMfaDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow22 = cryptoTransferEnrollmentMfaDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferEnrollmentMfaComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferEnrollmentMfaEvent) {
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
                Event<CryptoTransferEnrollmentMfaEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoTransferEnrollmentMfaEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1552698142, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt.CryptoTransferEnrollmentMfaComposable.1
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
                            ComposerKt.traceEventStart(-1552698142, i7, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable.<anonymous> (CryptoTransferEnrollmentMfaComposable.kt:49)");
                        }
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, CryptoTransferEnrollmentMfaComposable.INSTANCE.getLambda$1965160350$feature_crypto_transfer_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1697102989, true, new AnonymousClass1(cryptoTransferEnrollmentMfaDuxo3, snapshotState4CollectAsStateWithLifecycle32), composer2, 54), composer2, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTransferEnrollmentMfaComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ CryptoTransferEnrollmentMfaDuxo $duxo;
                        final /* synthetic */ SnapshotState4<CryptoTransferEnrollmentMfaViewState> $state$delegate;

                        AnonymousClass1(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo, SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4) {
                            this.$duxo = cryptoTransferEnrollmentMfaDuxo;
                            this.$state$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            Object obj;
                            Composer composer2 = composer;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            int i2 = (i & 6) == 0 ? i | (composer2.changed(paddingValues) ? 4 : 2) : i;
                            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1697102989, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposable.<anonymous>.<anonymous> (CryptoTransferEnrollmentMfaComposable.kt:61)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierPadding, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 1, null);
                            final CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo = this.$duxo;
                            SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4 = this.$state$delegate;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CryptoTransferEnrollmentMfaComposable5.Title), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 7, null);
                            String strStringResource = StringResources_androidKt.stringResource(CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getTitleRes(), composer2, 0);
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i3).getDisplayCapsuleMedium();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getSubtitleRes(), composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CryptoTransferEnrollmentMfaComposable5.Subtitle), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
                            composer2.startReplaceGroup(-1290712305);
                            for (MfaRow mfaRow : CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getMfaRows()) {
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, new BentoBaseRowState.Start.Icon(mfaRow.getLeadingIcon(), null, null, 6, null), StringResources_androidKt.stringResource(mfaRow.getPrimaryTextRes(), composer2, 0), StringResources_androidKt.stringResource(mfaRow.getSecondaryTextRes(), composer2, 0), null, null, null, false, false, false, 0L, null, composer, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3953);
                                composer2 = composer;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            Integer helperTextRes = CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getHelperTextRes();
                            composer2.startReplaceGroup(-1157880162);
                            if (helperTextRes == null) {
                                obj = null;
                            } else {
                                int iIntValue = helperTextRes.intValue();
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferEnrollmentMfaComposable5.HelperText), 0.0f, 1, null);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i4 = BentoTheme.$stable;
                                obj = null;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(iIntValue, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8120);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferEnrollmentMfaComposable5.ContinueButton), 0.0f, 1, obj), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, obj), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                            String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_mfa_checklist_continue, composer2, 0);
                            boolean areButtonsLoading = CryptoTransferEnrollmentMfaComposable4.CryptoTransferEnrollmentMfaComposable$lambda$0(snapshotState4).getAreButtonsLoading();
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(cryptoTransferEnrollmentMfaDuxo);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaComposableKt$CryptoTransferEnrollmentMfaComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTransferEnrollmentMfaComposable4.C379731.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(cryptoTransferEnrollmentMfaDuxo);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, type2, false, areButtonsLoading, null, null, null, null, false, null, composer, 24576, 0, 8104);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3(CryptoTransferEnrollmentMfaDuxo cryptoTransferEnrollmentMfaDuxo) {
                            cryptoTransferEnrollmentMfaDuxo.onClickContinue();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventCryptoTransferEnrollmentMfaComposable$lambda$1 = CryptoTransferEnrollmentMfaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoTransferEnrollmentMfaComposable$lambda$1 != null) {
                }
                eventCryptoTransferEnrollmentMfaComposable$lambda$12 = CryptoTransferEnrollmentMfaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoTransferEnrollmentMfaComposable$lambda$12 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoTransferEnrollmentMfaDuxo4 = cryptoTransferEnrollmentMfaDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferEnrollmentMfaViewState CryptoTransferEnrollmentMfaComposable$lambda$0(SnapshotState4<CryptoTransferEnrollmentMfaViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferEnrollmentMfaEvent> CryptoTransferEnrollmentMfaComposable$lambda$1(SnapshotState4<Event<CryptoTransferEnrollmentMfaEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
