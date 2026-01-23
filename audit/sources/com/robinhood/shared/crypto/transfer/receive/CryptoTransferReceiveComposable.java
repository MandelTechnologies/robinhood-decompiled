package com.robinhood.shared.crypto.transfer.receive;

import android.app.Activity;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposable;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveEvent;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFailedComposable3;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedPendingComposable3;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent;
import com.robinhood.shared.crypto.transfer.util.LandingErrorComposable3;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
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

/* compiled from: CryptoTransferReceiveComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001ai\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002"}, m3636d2 = {"CryptoTransferReceiveComposable", "", "currencyPairId", "Ljava/util/UUID;", "loggingSessionId", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "showTipsSheet", "", "onTipsSheetDismissed", "Lkotlin/Function0;", "onSetupTwoFactorClicked", "Lkotlin/Function2;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo;", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/transfer/CryptoTransferAction;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferReceiveComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferReceiveComposable$lambda$4(UUID uuid, UUID uuid2, CryptoTransferAction cryptoTransferAction, boolean z, Function0 function0, Function2 function2, Modifier modifier, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferReceiveComposable(uuid, uuid2, cryptoTransferAction, z, function0, function2, modifier, cryptoTransferReceiveDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferReceiveComposable(final UUID currencyPairId, final UUID loggingSessionId, final CryptoTransferAction action, final boolean z, final Function0<Unit> onTipsSheetDismissed, final Function2<? super ApiCryptoTransferConfig.TransferStates.EnrollmentState, ? super CryptoTransferAction, Unit> onSetupTwoFactorClicked, Modifier modifier, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo2;
        int i5;
        final Modifier modifier3;
        CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo3;
        Event<CryptoTransferReceiveEvent> event;
        CryptoTransferReceiveViewState cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0;
        Composer composer2;
        final Activity activity;
        CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo4;
        final Event<CryptoTransferReceiveEvent> eventCryptoTransferReceiveComposable$lambda$1;
        final CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo5;
        EventConsumer<CryptoTransferReceiveEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onTipsSheetDismissed, "onTipsSheetDismissed");
        Intrinsics.checkNotNullParameter(onSetupTwoFactorClicked, "onSetupTwoFactorClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1481074211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loggingSessionId) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(action.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTipsSheetDismissed) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSetupTwoFactorClicked) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        cryptoTransferReceiveDuxo2 = cryptoTransferReceiveDuxo;
                        int i6 = composerStartRestartGroup.changedInstance(cryptoTransferReceiveDuxo2) ? 8388608 : 4194304;
                        i3 |= i6;
                    } else {
                        cryptoTransferReceiveDuxo2 = cryptoTransferReceiveDuxo;
                    }
                    i3 |= i6;
                } else {
                    cryptoTransferReceiveDuxo2 = cryptoTransferReceiveDuxo;
                }
                if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    cryptoTransferReceiveDuxo5 = cryptoTransferReceiveDuxo2;
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 128) == 0) {
                            CryptoTransferReceiveDuxo.InitArgs initArgs = new CryptoTransferReceiveDuxo.InitArgs(loggingSessionId, currencyPairId, action);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferReceiveDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$duxo$1.1
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
                            cryptoTransferReceiveDuxo3 = (CryptoTransferReceiveDuxo) baseDuxo;
                            Modifier modifier5 = modifier4;
                            i5 = i3 & (-29360129);
                            modifier3 = modifier5;
                        } else {
                            Modifier modifier6 = modifier4;
                            i5 = i3;
                            modifier3 = modifier6;
                            cryptoTransferReceiveDuxo3 = cryptoTransferReceiveDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        cryptoTransferReceiveDuxo3 = cryptoTransferReceiveDuxo2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1481074211, i5, -1, "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposable (CryptoTransferReceiveComposable.kt:47)");
                    }
                    Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferReceiveDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<CryptoTransferReceiveEvent>> eventFlow = cryptoTransferReceiveDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferReceiveComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoTransferReceiveEvent) {
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
                    Event<CryptoTransferReceiveEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event == null ? event.getData() : null) instanceof CryptoTransferReceiveEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0 = CryptoTransferReceiveComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (Intrinsics.areEqual(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0, CryptoTransferReceiveViewState.Loading.INSTANCE)) {
                        if (cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0 instanceof CryptoTransferReceiveViewState.SecuritySetupRequired) {
                            composerStartRestartGroup.startReplaceGroup(-481789860);
                            int i7 = i5 >> 9;
                            int i8 = (i7 & 896) | 6 | (i7 & 7168);
                            Modifier modifier7 = modifier3;
                            activity = activity2;
                            CryptoTransferUnifiedMfaRequiredComposable.CryptoTransferUnifiedMfaRequiredComposable(CryptoTransferAction.RECEIVE, ((CryptoTransferReceiveViewState.SecuritySetupRequired) cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0).getEnrollmentState(), onSetupTwoFactorClicked, modifier7, composerStartRestartGroup, i8, 0);
                            modifier3 = modifier7;
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = composerStartRestartGroup;
                            activity = activity2;
                            if (Intrinsics.areEqual(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0, CryptoTransferReceiveViewState.PendingEnrollment.INSTANCE)) {
                                composer2.startReplaceGroup(-1678098344);
                                CryptoTransferUnifiedPendingComposable3.CryptoTransferUnifiedPendingComposable(modifier3, composer2, (i5 >> 18) & 14, 0);
                                composer2.endReplaceGroup();
                            } else if (Intrinsics.areEqual(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0, CryptoTransferReceiveViewState.FailedEnrollment.INSTANCE)) {
                                composer2.startReplaceGroup(-1678094505);
                                CryptoTransferUnifiedFailedComposable3.CryptoTransferUnifiedFailedComposable(modifier3, composer2, (i5 >> 18) & 14, 0);
                                composer2.endReplaceGroup();
                            } else if (Intrinsics.areEqual(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0, CryptoTransferReceiveViewState.Error.INSTANCE)) {
                                composer2.startReplaceGroup(-1678091064);
                                LandingErrorComposable3.LandingErrorComposable(modifier3, composer2, (i5 >> 18) & 14, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0 instanceof CryptoTransferReceiveViewState.Success)) {
                                    composer2.startReplaceGroup(-1678113462);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-481072923);
                                Screen.Name name = Screen.Name.CRYPTO_TRANSFER_RECEIVE;
                                CryptoTransferReceiveViewState.Success success = (CryptoTransferReceiveViewState.Success) cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0;
                                String string2 = success.getCurrencyId().toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                Screen screen = new Screen(name, null, string2, null, 10, null);
                                String string3 = success.getCurrencyId().toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                String string4 = loggingSessionId.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(string3, string4, null, 0.0d, null, null, null, null, null, null, null, null, null, null, 16380, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null);
                                cryptoTransferReceiveDuxo4 = cryptoTransferReceiveDuxo3;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(800925861, true, new C380471(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0, cryptoTransferReceiveDuxo4, modifier3, z, onTipsSheetDismissed), composer2, 54), composer2, 48);
                                composer2.endReplaceGroup();
                            }
                        }
                        cryptoTransferReceiveDuxo4 = cryptoTransferReceiveDuxo3;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1678113215);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composerStartRestartGroup, 0, 15);
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoTransferReceiveDuxo4 = cryptoTransferReceiveDuxo3;
                        composer2 = composerStartRestartGroup;
                        activity = activity2;
                    }
                    eventCryptoTransferReceiveComposable$lambda$1 = CryptoTransferReceiveComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoTransferReceiveComposable$lambda$1 != null) {
                        if ((eventCryptoTransferReceiveComposable$lambda$1.getData() instanceof CryptoTransferReceiveEvent.Error) && (eventConsumerInvoke = eventCryptoTransferReceiveComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCryptoTransferReceiveComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25033invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25033invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoTransferReceiveEvent.Error error = (CryptoTransferReceiveEvent.Error) eventCryptoTransferReceiveComposable$lambda$1.getData();
                                    Activity activity3 = activity;
                                    if (activity3 != null) {
                                        CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, activity3, error.getThrowable(), null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                    }
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoTransferReceiveDuxo5 = cryptoTransferReceiveDuxo4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTransferReceiveComposable.CryptoTransferReceiveComposable$lambda$4(currencyPairId, loggingSessionId, action, z, onTipsSheetDismissed, onSetupTwoFactorClicked, modifier3, cryptoTransferReceiveDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((12582912 & i) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Activity activity22 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferReceiveDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final Flow eventFlow2 = cryptoTransferReceiveDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferReceiveComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoTransferReceiveEvent) {
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
                    Event<CryptoTransferReceiveEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof CryptoTransferReceiveEvent)) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0 = CryptoTransferReceiveComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                    if (Intrinsics.areEqual(cryptoTransferReceiveViewStateCryptoTransferReceiveComposable$lambda$0, CryptoTransferReceiveViewState.Loading.INSTANCE)) {
                    }
                    eventCryptoTransferReceiveComposable$lambda$1 = CryptoTransferReceiveComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoTransferReceiveComposable$lambda$1 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoTransferReceiveDuxo5 = cryptoTransferReceiveDuxo4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((12582912 & i) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: CryptoTransferReceiveComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$1 */
    static final class C380471 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoTransferReceiveDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onTipsSheetDismissed;
        final /* synthetic */ boolean $showTipsSheet;
        final /* synthetic */ CryptoTransferReceiveViewState $state;

        C380471(CryptoTransferReceiveViewState cryptoTransferReceiveViewState, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Modifier modifier, boolean z, Function0<Unit> function0) {
            this.$state = cryptoTransferReceiveViewState;
            this.$duxo = cryptoTransferReceiveDuxo;
            this.$modifier = modifier;
            this.$showTipsSheet = z;
            this.$onTipsSheetDismissed = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$5$lambda$4(SheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return false;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, int i) {
            cryptoTransferReceiveDuxo.onNetworkSelected(i);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo) {
            cryptoTransferReceiveDuxo.markInitialSheetShown();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(800925861, i, -1, "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposable.<anonymous> (CryptoTransferReceiveComposable.kt:85)");
            }
            CryptoTransferReceiveViewState.Success success = (CryptoTransferReceiveViewState.Success) this.$state;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferReceiveComposable.C380471.invoke$lambda$1$lambda$0(cryptoTransferReceiveDuxo, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
            final CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo2 = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferReceiveComposable.C380471.invoke$lambda$3$lambda$2(cryptoTransferReceiveDuxo2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ReceiveSuccessComposable4.ReceiveSuccessComposable(success, function1, (Function0) objRememberedValue2, this.$modifier, composer, 0, 0);
            if (this.$showTipsSheet) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(CryptoTransferReceiveComposable.C380471.invoke$lambda$5$lambda$4((SheetValue) obj));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue3, composer, 54, 0);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$onTipsSheetDismissed);
                final Function0<Unit> function0 = this.$onTipsSheetDismissed;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt$CryptoTransferReceiveComposable$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferReceiveComposable.C380471.invoke$lambda$7$lambda$6(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                final CryptoTransferReceiveViewState cryptoTransferReceiveViewState = this.$state;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(2038989041, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposableKt.CryptoTransferReceiveComposable.1.5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i2 & 6) == 0) {
                            i2 |= (i2 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i2 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2038989041, i2, -1, "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposable.<anonymous>.<anonymous> (CryptoTransferReceiveComposable.kt:102)");
                        }
                        TipsSheetContent.TransferTipsSheetContent(RhModalBottomSheet, ((CryptoTransferReceiveViewState.Success) cryptoTransferReceiveViewState).getTipsSheetContent(), null, composer2, RhModalBottomSheet5.$stable | (i2 & 14), 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 1572864, 54);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final CryptoTransferReceiveViewState CryptoTransferReceiveComposable$lambda$0(SnapshotState4<? extends CryptoTransferReceiveViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferReceiveEvent> CryptoTransferReceiveComposable$lambda$1(SnapshotState4<Event<CryptoTransferReceiveEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
