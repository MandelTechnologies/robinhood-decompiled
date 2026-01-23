package com.robinhood.shared.crypto.transfer.selection;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.compose.BackHandler5;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferOptions;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.contracts.transfers.CryptoAddSavedAddressFragmentKey;
import com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable3;
import com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo5;
import com.robinhood.shared.crypto.transfer.util.NavigationType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoTransferSelectionComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\u0012\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u008a\u0084\u0002"}, m3636d2 = {"CryptoTransferSelectionComposable", "", "onCloseClick", "Lkotlin/Function0;", "onFinish", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "navigationType", "Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "duxo", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/shared/crypto/transfer/util/NavigationType;Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "state", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSelectionComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSelectionComposable$lambda$6(Function0 function0, Function0 function02, Navigator navigator, NavigationType navigationType, CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSelectionComposable(function0, function02, navigator, navigationType, cryptoTransferSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSelectionComposable(final Function0<Unit> onCloseClick, final Function0<Unit> onFinish, final Navigator navigator, final NavigationType navigationType, CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        final CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer2;
        Event<CryptoTransferSelectionDuxo5> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final Context context;
        final OnBackPressedDispatcher onBackPressedDispatcher;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Event<CryptoTransferSelectionDuxo5> eventCryptoTransferSelectionComposable$lambda$1;
        final Event<CryptoTransferSelectionDuxo5> eventCryptoTransferSelectionComposable$lambda$12;
        EventConsumer<CryptoTransferSelectionDuxo5> eventConsumerInvoke;
        EventConsumer<CryptoTransferSelectionDuxo5> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1282593409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFinish) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(navigationType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                cryptoTransferSelectionDuxo2 = cryptoTransferSelectionDuxo;
                int i4 = composerStartRestartGroup.changedInstance(cryptoTransferSelectionDuxo2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                cryptoTransferSelectionDuxo2 = cryptoTransferSelectionDuxo;
            }
            i3 |= i4;
        } else {
            cryptoTransferSelectionDuxo2 = cryptoTransferSelectionDuxo;
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    cryptoTransferSelectionDuxo2 = (CryptoTransferSelectionDuxo) baseDuxo;
                    i3 &= -57345;
                }
                CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo4 = cryptoTransferSelectionDuxo2;
                int i5 = i3;
                cryptoTransferSelectionDuxo3 = cryptoTransferSelectionDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1282593409, i5, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable (CryptoTransferSelectionComposable.kt:53)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<CryptoTransferSelectionDuxo5>> eventFlow = cryptoTransferSelectionDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                composer2 = composerStartRestartGroup;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSelectionDuxo5) {
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
                Event<CryptoTransferSelectionDuxo5> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoTransferSelectionDuxo5)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                composer2.endReplaceGroup();
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(coroutineContextImpl6, composer2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composer2, BackHandler5.$stable);
                onBackPressedDispatcher = current2 != null ? current2.getOnBackPressedDispatcher() : null;
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(onBackPressedDispatcher);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$3$lambda$2(onBackPressedDispatcher, (ActivityResult) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue2, composer2, 0);
                eventCryptoTransferSelectionComposable$lambda$1 = CryptoTransferSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSelectionComposable$lambda$1 != null && (eventCryptoTransferSelectionComposable$lambda$1.getData() instanceof CryptoTransferSelectionDuxo5.NeedsEnrollment) && (eventConsumerInvoke2 = eventCryptoTransferSelectionComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventCryptoTransferSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25042invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25042invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoTransferIntentKey(CryptoTransferIntentKey.Action.ENROLL, null, null, CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCheckForUpsell(), null, 20, null), null, false, null, null, 60, null);
                        }
                    });
                }
                eventCryptoTransferSelectionComposable$lambda$12 = CryptoTransferSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSelectionComposable$lambda$12 != null && (eventCryptoTransferSelectionComposable$lambda$12.getData() instanceof CryptoTransferSelectionDuxo5.Finish) && (eventConsumerInvoke = eventCryptoTransferSelectionComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoTransferSelectionComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25043invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25043invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onFinish.invoke();
                        }
                    });
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-271581891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt.CryptoTransferSelectionComposable.3
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
                            ComposerKt.traceEventStart(-271581891, i7, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable.<anonymous> (CryptoTransferSelectionComposable.kt:85)");
                        }
                        Function2<Composer, Integer, Unit> function2M25040getLambda$730811344$feature_crypto_transfer_externalDebug = CryptoTransferSelectionComposable.INSTANCE.m25040getLambda$730811344$feature_crypto_transfer_externalDebug();
                        final NavigationType navigationType2 = navigationType;
                        final Function0<Unit> function0 = onCloseClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25040getLambda$730811344$feature_crypto_transfer_externalDebug, null, ComposableLambda3.rememberComposableLambda(-184693668, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt.CryptoTransferSelectionComposable.3.1

                            /* compiled from: CryptoTransferSelectionComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$3$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[NavigationType.values().length];
                                    try {
                                        iArr[NavigationType.PUSH.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[NavigationType.MODAL.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i9 = ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-184693668, i9, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable.<anonymous>.<anonymous> (CryptoTransferSelectionComposable.kt:88)");
                                }
                                int i10 = WhenMappings.$EnumSwitchMapping$0[navigationType2.ordinal()];
                                if (i10 == 1) {
                                    composer4.startReplaceGroup(-1396952793);
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                    composer4.endReplaceGroup();
                                } else {
                                    if (i10 != 2) {
                                        composer4.startReplaceGroup(-1396954878);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(-1396949847);
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, null, null, 0, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1751066386, true, new C380724(snapshotState4CollectAsStateWithLifecycle, cryptoTransferSelectionDuxo3, activityResultRegistry8RememberLauncherForActivityResult, navigator, context, coroutineScope), composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo42 = cryptoTransferSelectionDuxo2;
                int i52 = i3;
                cryptoTransferSelectionDuxo3 = cryptoTransferSelectionDuxo42;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoTransferSelectionDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                composer2 = composerStartRestartGroup;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSelectionDuxo5) {
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
                Event<CryptoTransferSelectionDuxo5> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoTransferSelectionDuxo5)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer2, 0, 0);
                composer2.endReplaceGroup();
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composer2, BackHandler5.$stable);
                onBackPressedDispatcher = current22 != null ? current22.getOnBackPressedDispatcher() : null;
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(onBackPressedDispatcher);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$3$lambda$2(onBackPressedDispatcher, (ActivityResult) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                    composer2.endReplaceGroup();
                    ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue2, composer2, 0);
                    eventCryptoTransferSelectionComposable$lambda$1 = CryptoTransferSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoTransferSelectionComposable$lambda$1 != null) {
                        eventConsumerInvoke2.consume(eventCryptoTransferSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25042invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25042invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoTransferIntentKey(CryptoTransferIntentKey.Action.ENROLL, null, null, CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCheckForUpsell(), null, 20, null), null, false, null, null, 60, null);
                            }
                        });
                    }
                    eventCryptoTransferSelectionComposable$lambda$12 = CryptoTransferSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoTransferSelectionComposable$lambda$12 != null) {
                        eventConsumerInvoke.consume(eventCryptoTransferSelectionComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25043invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25043invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onFinish.invoke();
                            }
                        });
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-271581891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt.CryptoTransferSelectionComposable.3
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
                                ComposerKt.traceEventStart(-271581891, i7, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable.<anonymous> (CryptoTransferSelectionComposable.kt:85)");
                            }
                            Function2<Composer, Integer, Unit> function2M25040getLambda$730811344$feature_crypto_transfer_externalDebug = CryptoTransferSelectionComposable.INSTANCE.m25040getLambda$730811344$feature_crypto_transfer_externalDebug();
                            final NavigationType navigationType2 = navigationType;
                            final Function0<Unit> function0 = onCloseClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25040getLambda$730811344$feature_crypto_transfer_externalDebug, null, ComposableLambda3.rememberComposableLambda(-184693668, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt.CryptoTransferSelectionComposable.3.1

                                /* compiled from: CryptoTransferSelectionComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$3$1$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[NavigationType.values().length];
                                        try {
                                            iArr[NavigationType.PUSH.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[NavigationType.MODAL.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    int i9;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i9 = ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i8;
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-184693668, i9, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable.<anonymous>.<anonymous> (CryptoTransferSelectionComposable.kt:88)");
                                    }
                                    int i10 = WhenMappings.$EnumSwitchMapping$0[navigationType2.ordinal()];
                                    if (i10 == 1) {
                                        composer4.startReplaceGroup(-1396952793);
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (i10 != 2) {
                                            composer4.startReplaceGroup(-1396954878);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(-1396949847);
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, null, 0, bentoTheme2.getColors(composer2, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composer2, i62).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1751066386, true, new C380724(snapshotState4CollectAsStateWithLifecycle, cryptoTransferSelectionDuxo3, activityResultRegistry8RememberLauncherForActivityResult2, navigator, context, coroutineScope2), composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            cryptoTransferSelectionDuxo3 = cryptoTransferSelectionDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$6(onCloseClick, onFinish, navigator, navigationType, cryptoTransferSelectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSelectionComposable$lambda$3$lambda$2(OnBackPressedDispatcher onBackPressedDispatcher, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1 && onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSelectionViewState CryptoTransferSelectionComposable$lambda$0(SnapshotState4<CryptoTransferSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferSelectionDuxo5> CryptoTransferSelectionComposable$lambda$1(SnapshotState4<Event<CryptoTransferSelectionDuxo5>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: CryptoTransferSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4 */
    static final class C380724 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ ActivityResultRegistry8<Intent, ActivityResult> $addAddressLauncher;
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoTransferSelectionDuxo $duxo;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnapshotState4<CryptoTransferSelectionViewState> $state$delegate;

        C380724(SnapshotState4<CryptoTransferSelectionViewState> snapshotState4, CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8, Navigator navigator, Context context, CoroutineScope coroutineScope) {
            this.$state$delegate = snapshotState4;
            this.$duxo = cryptoTransferSelectionDuxo;
            this.$addAddressLauncher = activityResultRegistry8;
            this.$navigator = navigator;
            this.$context = context;
            this.$scope = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(it) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1751066386, i2, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable.<anonymous> (CryptoTransferSelectionComposable.kt:96)");
            }
            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), it), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_SEARCH, null, null, null, 14, null), null, null, null, null, 61, null));
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$state$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$addAddressLauncher) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$scope);
            final CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo = this.$duxo;
            final SnapshotState4<CryptoTransferSelectionViewState> snapshotState4 = this.$state$delegate;
            final ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8 = this.$addAddressLauncher;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final CoroutineScope coroutineScope = this.$scope;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSelectionComposable3.C380724.invoke$lambda$3$lambda$2(cryptoTransferSelectionDuxo, snapshotState4, activityResultRegistry8, navigator, context, coroutineScope, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierLogScreenTransitions, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, final SnapshotState4 snapshotState4, final ActivityResultRegistry8 activityResultRegistry8, final Navigator navigator, final Context context, final CoroutineScope coroutineScope, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1417657677, true, new CryptoTransferSelectionComposable4(cryptoTransferSelectionDuxo, snapshotState4)), 3, null);
            final ImmutableList<CryptoTransferOptions.TransferableCrypto> items = CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$0(snapshotState4).getItems();
            final C38067xf652b185 c38067xf652b185 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$invoke$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(CryptoTransferOptions.TransferableCrypto transferableCrypto) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CryptoTransferOptions.TransferableCrypto) obj);
                }
            };
            LazyColumn.items(items.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$invoke$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c38067xf652b185.invoke(items.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$invoke$lambda$3$lambda$2$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final CryptoTransferOptions.TransferableCrypto transferableCrypto = (CryptoTransferOptions.TransferableCrypto) items.get(i);
                    composer.startReplaceGroup(-644292511);
                    String title = transferableCrypto.getTitle();
                    String subtitle = transferableCrypto.getSubtitle();
                    composer.startReplaceGroup(-1224400529);
                    boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(activityResultRegistry8) | composer.changedInstance(transferableCrypto) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(coroutineScope);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final ActivityResultRegistry8 activityResultRegistry82 = activityResultRegistry8;
                        final Navigator navigator2 = navigator;
                        final Context context2 = context;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final SnapshotState4 snapshotState42 = snapshotState4;
                        Object obj = new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$0(snapshotState42).getAction() != CryptoTransferAction.SAVE) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(navigator2, context2, transferableCrypto, null), 3, null);
                                    return;
                                }
                                activityResultRegistry82.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator2, context2, new CryptoAddSavedAddressFragmentKey(transferableCrypto.getCurrencyPairId()), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
                            }

                            /* compiled from: CryptoTransferSelectionComposable.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$1$1$2$1$1$1", m3645f = "CryptoTransferSelectionComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$1$1$2$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ CryptoTransferOptions.TransferableCrypto $crypto;
                                final /* synthetic */ Navigator $navigator;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Navigator navigator, Context context, CryptoTransferOptions.TransferableCrypto transferableCrypto, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$crypto = transferableCrypto;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$navigator, this.$context, this.$crypto, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        Navigator navigator = this.$navigator;
                                        Context context = this.$context;
                                        Uri uri = Uri.parse(this.$crypto.getDeeplink());
                                        this.label = 1;
                                        if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, context, uri, false, false, null, this, 28, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    composer.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, title, subtitle, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 2035);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }
}
