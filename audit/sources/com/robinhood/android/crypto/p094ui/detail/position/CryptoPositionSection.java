package com.robinhood.android.crypto.p094ui.detail.position;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionEvent;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionSection;
import com.robinhood.android.crypto.p094ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingState;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoPositionSection.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002"}, m3636d2 = {"CryptoPositionSection", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "state", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent;", "bottomSheetState", "Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPositionSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionSection$lambda$11(UUID uuid, Modifier modifier, Navigator navigator, CryptoPositionDuxo cryptoPositionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoPositionSection(uuid, modifier, navigator, cryptoPositionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPositionSection(final UUID currencyPairId, Modifier modifier, Navigator navigator, CryptoPositionDuxo cryptoPositionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Navigator navigator2;
        CryptoPositionDuxo cryptoPositionDuxo2;
        Modifier modifier3;
        final Navigator navigator3;
        int i4;
        CryptoPositionDuxo cryptoPositionDuxo3;
        final Context context;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<CryptoPositionEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final Event<CryptoPositionEvent> eventCryptoPositionSection$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        Navigator navigator4;
        SnapshotState snapshotState2;
        CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingStateCryptoPositionSection$lambda$4;
        final CryptoPositionDuxo cryptoPositionDuxo4;
        final Modifier modifier4;
        final Navigator navigator5;
        EventConsumer<CryptoPositionEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1070085242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    navigator2 = navigator;
                    int i6 = composerStartRestartGroup.changedInstance(navigator2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    navigator2 = navigator;
                }
                i3 |= i6;
            } else {
                navigator2 = navigator;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoPositionDuxo2 = cryptoPositionDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoPositionDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    cryptoPositionDuxo2 = cryptoPositionDuxo;
                }
                i3 |= i7;
            } else {
                cryptoPositionDuxo2 = cryptoPositionDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        navigator3 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        i3 &= -897;
                    } else {
                        navigator3 = navigator2;
                    }
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoPositionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        cryptoPositionDuxo3 = (CryptoPositionDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1070085242, i4, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSection (CryptoPositionSection.kt:45)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoPositionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final StateFlow<Event<CryptoPositionEvent>> eventFlow = cryptoPositionDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoPositionSection.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof CryptoPositionEvent) {
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
                        Event<CryptoPositionEvent> value = eventFlow.getValue();
                        event = value;
                        if (!((event == null ? event.getData() : null) instanceof CryptoPositionEvent)) {
                            value = null;
                        }
                        int i8 = i4;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoPositionSection.CryptoPositionSection$lambda$3$lambda$2();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        eventCryptoPositionSection$lambda$1 = CryptoPositionSection$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventCryptoPositionSection$lambda$1 != null && (eventCryptoPositionSection$lambda$1.getData() instanceof CryptoPositionEvent) && (eventConsumerInvoke = eventCryptoPositionSection$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCryptoPositionSection$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m13106invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m13106invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoPositionEvent cryptoPositionEvent = (CryptoPositionEvent) eventCryptoPositionSection$lambda$1.getData();
                                    if (cryptoPositionEvent instanceof CryptoPositionEvent.ShowPositionReferenceManual) {
                                        Navigator.DefaultImpls.startActivity$default(navigator3, context, ((CryptoPositionEvent.ShowPositionReferenceManual) cryptoPositionEvent).getIntentKey(), null, false, null, NavigationType.PRESENT, 28, null);
                                    } else {
                                        if (!(cryptoPositionEvent instanceof CryptoPositionEvent.ShowAverageCostReturnBottomSheet)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        snapshotState.setValue(((CryptoPositionEvent.ShowAverageCostReturnBottomSheet) cryptoPositionEvent).getBottomSheetState());
                                    }
                                }
                            });
                        }
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator3) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoPositionSection.CryptoPositionSection$lambda$8$lambda$7(navigator3, context, (GenericAction) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoPositionDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new CryptoPositionSection2(cryptoPositionDuxo3, currencyPairId, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i8 & 14);
                        composerStartRestartGroup.startReplaceGroup(1854790570);
                        if (CryptoPositionSection$lambda$0(snapshotState4CollectAsStateWithLifecycle).isVisible()) {
                            navigator4 = navigator3;
                            snapshotState2 = snapshotState;
                            composerStartRestartGroup = composerStartRestartGroup;
                        } else {
                            snapshotState2 = snapshotState;
                            composerStartRestartGroup = composerStartRestartGroup;
                            navigator4 = navigator3;
                            GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator4, ComposableLambda3.rememberComposableLambda(-110870973, true, new C134283(current2, snapshotState4CollectAsStateWithLifecycle, cryptoPositionDuxo3, modifier3, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i8 << 3) & 7168) | 24576, 7);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoAverageCostReturnUnavailableOrPendingStateCryptoPositionSection$lambda$4 = CryptoPositionSection$lambda$4(snapshotState2);
                        if (cryptoAverageCostReturnUnavailableOrPendingStateCryptoPositionSection$lambda$4 != null) {
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1149452789, true, new CryptoPositionSection7(snapshotState2, cryptoAverageCostReturnUnavailableOrPendingStateCryptoPositionSection$lambda$4), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoPositionDuxo4 = cryptoPositionDuxo3;
                        modifier4 = modifier3;
                        navigator5 = navigator4;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    navigator3 = navigator2;
                }
                cryptoPositionDuxo3 = cryptoPositionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoPositionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoPositionDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoPositionSection.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoPositionEvent) {
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
                Event<CryptoPositionEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoPositionEvent)) {
                }
                int i82 = i4;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                eventCryptoPositionSection$lambda$1 = CryptoPositionSection$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoPositionSection$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoPositionSection$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13106invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13106invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoPositionEvent cryptoPositionEvent = (CryptoPositionEvent) eventCryptoPositionSection$lambda$1.getData();
                            if (cryptoPositionEvent instanceof CryptoPositionEvent.ShowPositionReferenceManual) {
                                Navigator.DefaultImpls.startActivity$default(navigator3, context, ((CryptoPositionEvent.ShowPositionReferenceManual) cryptoPositionEvent).getIntentKey(), null, false, null, NavigationType.PRESENT, 28, null);
                            } else {
                                if (!(cryptoPositionEvent instanceof CryptoPositionEvent.ShowAverageCostReturnBottomSheet)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                snapshotState.setValue(((CryptoPositionEvent.ShowAverageCostReturnBottomSheet) cryptoPositionEvent).getBottomSheetState());
                            }
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator3) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoPositionSection.CryptoPositionSection$lambda$8$lambda$7(navigator3, context, (GenericAction) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    Function1 function12 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoPositionDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue3 = new CryptoPositionSection2(cryptoPositionDuxo3, currencyPairId, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i82 & 14);
                        composerStartRestartGroup.startReplaceGroup(1854790570);
                        if (CryptoPositionSection$lambda$0(snapshotState4CollectAsStateWithLifecycle).isVisible()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoAverageCostReturnUnavailableOrPendingStateCryptoPositionSection$lambda$4 = CryptoPositionSection$lambda$4(snapshotState2);
                        if (cryptoAverageCostReturnUnavailableOrPendingStateCryptoPositionSection$lambda$4 != null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        cryptoPositionDuxo4 = cryptoPositionDuxo3;
                        modifier4 = modifier3;
                        navigator5 = navigator4;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                navigator5 = navigator2;
                cryptoPositionDuxo4 = cryptoPositionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPositionSection.CryptoPositionSection$lambda$11(currencyPairId, modifier4, navigator5, cryptoPositionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoPositionSection$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionSection$lambda$8$lambda$7(Navigator navigator, Context context, GenericAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof GenericAction.DeeplinkAction) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) it).getUri(), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoPositionViewState CryptoPositionSection$lambda$0(SnapshotState4<CryptoPositionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoPositionEvent> CryptoPositionSection$lambda$1(SnapshotState4<Event<CryptoPositionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final CryptoAverageCostReturnUnavailableOrPendingState CryptoPositionSection$lambda$4(SnapshotState<CryptoAverageCostReturnUnavailableOrPendingState> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: CryptoPositionSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$3 */
    static final class C134283 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoPositionDuxo $duxo;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function1<GenericAction, Unit> $handleDeepLink;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState4<CryptoPositionViewState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C134283(EventLogger eventLogger, SnapshotState4<CryptoPositionViewState> snapshotState4, CryptoPositionDuxo cryptoPositionDuxo, Modifier modifier, Function1<? super GenericAction, Unit> function1) {
            this.$eventLogger = eventLogger;
            this.$state$delegate = snapshotState4;
            this.$duxo = cryptoPositionDuxo;
            this.$modifier = modifier;
            this.$handleDeepLink = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(EventLogger eventLogger, SnapshotState4 snapshotState4, SduiActionHandler sduiActionHandler) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, CryptoPositionSection.CryptoPositionSection$lambda$0(snapshotState4).getLoggingScreen(), new Component(Component.ComponentType.POSITION_SECTION, "INFORMATION", null, 4, null), null, null, false, 57, null);
            GenericAlertContent<com.robinhood.models.serverdriven.experimental.api.GenericAction> amountAvailableInfoScreen = CryptoPositionSection.CryptoPositionSection$lambda$0(snapshotState4).getAmountAvailableInfoScreen();
            if (amountAvailableInfoScreen != null) {
                sduiActionHandler.mo15941handle(new GenericAction.InfoAlert(new AlertAction(amountAvailableInfoScreen, GenericAlertMobilePresentationStyle.BOTTOM_SHEET)));
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110870973, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSection.<anonymous> (CryptoPositionSection.kt:91)");
            }
            final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$state$delegate) | composer.changedInstance(sduiActionHandlerCurrentActionHandler);
            final EventLogger eventLogger = this.$eventLogger;
            final SnapshotState4<CryptoPositionViewState> snapshotState4 = this.$state$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoPositionSection.C134283.invoke$lambda$2$lambda$1(eventLogger, snapshotState4, sduiActionHandlerCurrentActionHandler);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Screen loggingScreen = CryptoPositionSection.CryptoPositionSection$lambda$0(this.$state$delegate).getLoggingScreen();
            Asset.AssetType assetType = Asset.AssetType.CURRENCY_PAIR;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, loggingScreen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(Uuids.toStringOrEmpty(CryptoPositionSection.CryptoPositionSection$lambda$0(this.$state$delegate).getCurrencyPairId()), assetType, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1811997138, true, new AnonymousClass1(this.$duxo, this.$modifier, this.$handleDeepLink, (Function0) objRememberedValue, this.$state$delegate), composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: CryptoPositionSection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$3$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ CryptoPositionDuxo $duxo;
            final /* synthetic */ Function1<com.robinhood.models.serverdriven.p347db.GenericAction, Unit> $handleDeepLink;
            final /* synthetic */ Function0<Unit> $handleInfoAlert;
            final /* synthetic */ Modifier $modifier;
            final /* synthetic */ SnapshotState4<CryptoPositionViewState> $state$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CryptoPositionDuxo cryptoPositionDuxo, Modifier modifier, Function1<? super com.robinhood.models.serverdriven.p347db.GenericAction, Unit> function1, Function0<Unit> function0, SnapshotState4<CryptoPositionViewState> snapshotState4) {
                this.$duxo = cryptoPositionDuxo;
                this.$modifier = modifier;
                this.$handleDeepLink = function1;
                this.$handleInfoAlert = function0;
                this.$state$delegate = snapshotState4;
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
                    ComposerKt.traceEventStart(-1811997138, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionSection.<anonymous>.<anonymous> (CryptoPositionSection.kt:119)");
                }
                CryptoPositionState cryptoPositionState = CryptoPositionSection.CryptoPositionSection$lambda$0(this.$state$delegate).getCryptoPositionState(composer, 0);
                CryptoPositionDuxo cryptoPositionDuxo = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(cryptoPositionDuxo);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CryptoPositionSection3(cryptoPositionDuxo);
                    composer.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer.endReplaceGroup();
                CryptoPositionDuxo cryptoPositionDuxo2 = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(cryptoPositionDuxo2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new CryptoPositionSection4(cryptoPositionDuxo2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue2;
                composer.endReplaceGroup();
                CryptoPositionDuxo cryptoPositionDuxo3 = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(cryptoPositionDuxo3);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new CryptoPositionSection5(cryptoPositionDuxo3);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                KFunction kFunction3 = (KFunction) objRememberedValue3;
                composer.endReplaceGroup();
                CryptoPositionDuxo cryptoPositionDuxo4 = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(cryptoPositionDuxo4);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new CryptoPositionSection6(cryptoPositionDuxo4);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                KFunction kFunction4 = (KFunction) objRememberedValue4;
                composer.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(this.$modifier, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.POSITION_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Function1<com.robinhood.models.serverdriven.p347db.GenericAction, Unit> function1 = this.$handleDeepLink;
                Function0<Unit> function0 = this.$handleInfoAlert;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance5 = composer.changedInstance(this.$duxo) | composer.changed(this.$state$delegate);
                final CryptoPositionDuxo cryptoPositionDuxo5 = this.$duxo;
                final SnapshotState4<CryptoPositionViewState> snapshotState4 = this.$state$delegate;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionSectionKt$CryptoPositionSection$3$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoPositionSection.C134283.AnonymousClass1.invoke$lambda$5$lambda$4(cryptoPositionDuxo5, snapshotState4, (CryptoPositionLabelType) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                CryptoPositionComposable6.CryptoPositionComposable(cryptoPositionState, function1, function1, function0, (Function1) objRememberedValue5, (Function1) kFunction2, (Function1) kFunction, (Function1) kFunction3, (Function1) kFunction4, modifierAutoLogEvents$default, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$5$lambda$4(CryptoPositionDuxo cryptoPositionDuxo, SnapshotState4 snapshotState4, CryptoPositionLabelType type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                cryptoPositionDuxo.onPositionLabelClicked(CryptoPositionSection.CryptoPositionSection$lambda$0(snapshotState4).getPassThrough().getContentfulId(), type2);
                return Unit.INSTANCE;
            }
        }
    }
}
