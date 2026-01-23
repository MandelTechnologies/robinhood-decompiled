package com.robinhood.android.crypto.p094ui.detail.recurring;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.os.Bundle2;
import androidx.fragment.app.FragmentManager;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposable;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringDuxo;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringEvent;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoDetailRecurringComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002"}, m3636d2 = {"CryptoDetailRecurringComposable", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo;Landroidx/compose/runtime/Composer;II)V", CryptoDetailRecurringComposable3.CryptoDetailRecurringDescriptionBottomSheetTag, "", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "showCryptoFeeUnsupportedRecurringAlertDialog", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent$ShowCryptoFeeUnsupportedRecurringAlert;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailRecurringComposable3 {
    private static final String CryptoDetailRecurringDescriptionBottomSheetTag = "CryptoDetailRecurringDescriptionBottomSheetTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailRecurringComposable$lambda$14(UUID uuid, Modifier modifier, CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, int i, int i2, Composer composer, int i3) {
        CryptoDetailRecurringComposable(uuid, modifier, cryptoDetailRecurringDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoDetailRecurringComposable(final UUID currencyPairId, Modifier modifier, CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo2;
        int i4;
        Modifier modifier3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<CryptoDetailRecurringEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final Event<CryptoDetailRecurringEvent> eventCryptoDetailRecurringComposable$lambda$1;
        final Event<CryptoDetailRecurringEvent> eventCryptoDetailRecurringComposable$lambda$12;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        SnapshotState snapshotState;
        Navigator navigator;
        int i5;
        UiCurrencyPair currencyPair;
        int i6;
        boolean z;
        CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert showCryptoFeeUnsupportedRecurringAlertCryptoDetailRecurringComposable$lambda$4;
        Modifier modifier4;
        final Modifier modifier5;
        boolean zChangedInstance;
        Object objRememberedValue2;
        EventConsumer<CryptoDetailRecurringEvent> eventConsumerInvoke;
        EventConsumer<CryptoDetailRecurringEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1823896918);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoDetailRecurringDuxo2 = cryptoDetailRecurringDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(cryptoDetailRecurringDuxo2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    cryptoDetailRecurringDuxo2 = cryptoDetailRecurringDuxo;
                }
                i3 |= i8;
            } else {
                cryptoDetailRecurringDuxo2 = cryptoDetailRecurringDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str = "cdp_recurring_" + currencyPairId;
                        CryptoDetailRecurringDuxo.InitArgs initArgs = new CryptoDetailRecurringDuxo.InitArgs(currencyPairId);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoDetailRecurringDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$duxo$1.1
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
                        Modifier modifier7 = modifier6;
                        i4 = i3 & (-897);
                        modifier3 = modifier7;
                        cryptoDetailRecurringDuxo2 = (CryptoDetailRecurringDuxo) baseDuxo;
                    } else {
                        Modifier modifier8 = modifier6;
                        i4 = i3;
                        modifier3 = modifier8;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1823896918, i4, -1, "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposable (CryptoDetailRecurringComposable.kt:48)");
                }
                Composer composer2 = composerStartRestartGroup;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailRecurringDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                final StateFlow<Event<CryptoDetailRecurringEvent>> eventFlow = cryptoDetailRecurringDuxo2.getEventFlow();
                composer2.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoDetailRecurringComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoDetailRecurringEvent) {
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
                Event<CryptoDetailRecurringEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoDetailRecurringEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                composer2.endReplaceGroup();
                final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Object[] objArr = new Object[0];
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoDetailRecurringComposable3.CryptoDetailRecurringComposable$lambda$3$lambda$2();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                composerStartRestartGroup = composer2;
                final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer2, 3072, 6);
                eventCryptoDetailRecurringComposable$lambda$1 = CryptoDetailRecurringComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoDetailRecurringComposable$lambda$1 != null) {
                    if ((eventCryptoDetailRecurringComposable$lambda$1.getData() instanceof CryptoDetailRecurringEvent.EnterRecurringFlow) && (eventConsumerInvoke2 = eventCryptoDetailRecurringComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventCryptoDetailRecurringComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m13112invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13112invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoDetailRecurringEvent.EnterRecurringFlow enterRecurringFlow = (CryptoDetailRecurringEvent.EnterRecurringFlow) eventCryptoDetailRecurringComposable$lambda$1.getData();
                                if (enterRecurringFlow.getNavigationKey() instanceof FragmentKey) {
                                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, context, (FragmentKey) enterRecurringFlow.getNavigationKey(), false, false, false, false, null, false, null, null, 1012, null);
                                } else if (enterRecurringFlow.getNavigationKey() instanceof IntentKey) {
                                    Navigator.DefaultImpls.startActivity$default(navigator2, context, (IntentKey) enterRecurringFlow.getNavigationKey(), null, false, null, null, 60, null);
                                }
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                eventCryptoDetailRecurringComposable$lambda$12 = CryptoDetailRecurringComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoDetailRecurringComposable$lambda$12 != null) {
                    if ((eventCryptoDetailRecurringComposable$lambda$12.getData() instanceof CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert) && (eventConsumerInvoke = eventCryptoDetailRecurringComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoDetailRecurringComposable$lambda$12, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m13113invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13113invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                snapshotState2.setValue((CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert) eventCryptoDetailRecurringComposable$lambda$12.getData());
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(312032559);
                if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringHeaderView()) {
                    snapshotState = snapshotState2;
                    navigator = navigator2;
                    i5 = 5004770;
                } else if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringHeaderInfoIcon()) {
                    composerStartRestartGroup.startReplaceGroup(1083151557);
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoDetailRecurringComposable7.TITLE);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0);
                    BentoTextWithTrailingIconState bentoTextWithTrailingIconState = new BentoTextWithTrailingIconState(StringResources_androidKt.stringResource(CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTitle(), composerStartRestartGroup, 0), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C12757R.string.rhc_crypto_detail_recurring_details_button, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU(), null, null, null, null, null, 0, false, 0, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleMedium(), false, null, null, false, 253936, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoDetailRecurringComposable3.CryptoDetailRecurringComposable$lambda$12$lambda$10$lambda$9(context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = snapshotState2;
                    BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(bentoTextWithTrailingIconState, modifierM21622defaultHorizontalPaddingWMci_g0, null, (Function0) objRememberedValue4, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 4);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = 5004770;
                    navigator = navigator2;
                } else {
                    snapshotState = snapshotState2;
                    composerStartRestartGroup.startReplaceGroup(1084357364);
                    Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, CryptoDetailRecurringComposable7.TITLE);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    i5 = 5004770;
                    navigator = navigator2;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTitle(), composerStartRestartGroup, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i10).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                currencyPair = CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrencyPair();
                composerStartRestartGroup.startReplaceGroup(312091441);
                if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringNuxView() && currencyPair != null) {
                    Modifier modifierTestTag3 = TestTag3.testTag(Modifier.INSTANCE, CryptoDetailRecurringComposable7.NUX_SECTION);
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoDetailRecurringDuxo2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new CryptoDetailRecurringComposable4(cryptoDetailRecurringDuxo2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    RecurringInvestmentsNuxComposable.RecurringInvestmentsCryptoNuxComposable(currencyPair, modifierTestTag3, (Function0) ((KFunction) objRememberedValue2), composerStartRestartGroup, 48, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList<StatefulHistoryEvent<HistoryEvent>> recurringScheduleHistoryItems = CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRecurringScheduleHistoryItems();
                composerStartRestartGroup.startReplaceGroup(312105288);
                if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringListView() || recurringScheduleHistoryItems == null) {
                    i6 = 54;
                    z = true;
                } else {
                    boolean showHistoryAllCta = CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowHistoryAllCta();
                    Function2<Composer, Integer, Unit> lambda$1848323999$feature_crypto_externalDebug = CryptoDetailRecurringComposable.INSTANCE.getLambda$1848323999$feature_crypto_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(783356768, true, new CryptoDetailRecurringComposable5(navigator, context, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54);
                    i6 = 54;
                    z = true;
                    Composer composer3 = composerStartRestartGroup;
                    HistoryRowsKt.HistorySection(recurringScheduleHistoryItems, null, lambda$1848323999$feature_crypto_externalDebug, composableLambdaRememberComposableLambda, false, false, showHistoryAllCta, false, composer3, 200064, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
                    composerStartRestartGroup = composer3;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(312129415);
                if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringHeaderView()) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                boolean z2 = z;
                showCryptoFeeUnsupportedRecurringAlertCryptoDetailRecurringComposable$lambda$4 = CryptoDetailRecurringComposable$lambda$4(snapshotState);
                if (showCryptoFeeUnsupportedRecurringAlertCryptoDetailRecurringComposable$lambda$4 != null) {
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-508178240, z2, new CryptoDetailRecurringComposable6(showCryptoFeeUnsupportedRecurringAlertCryptoDetailRecurringComposable$lambda$4, userInteractionEventDescriptor, currencyPairId, snapshotState, cryptoDetailRecurringDuxo2), composerStartRestartGroup, i6), composerStartRestartGroup, 6);
                    Unit unit3 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            final CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo3 = cryptoDetailRecurringDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoDetailRecurringComposable3.CryptoDetailRecurringComposable$lambda$14(currencyPairId, modifier5, cryptoDetailRecurringDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer22 = composerStartRestartGroup;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoDetailRecurringDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                final Flow eventFlow2 = cryptoDetailRecurringDuxo2.getEventFlow();
                composer22.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer22.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoDetailRecurringComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoDetailRecurringEvent) {
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
                Event<CryptoDetailRecurringEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoDetailRecurringEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer22, 0, 0);
                composer22.endReplaceGroup();
                final Context context2 = (Context) composer22.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator22 = (Navigator) composer22.consume(LocalNavigator.getLocalNavigator());
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer22.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Object[] objArr2 = new Object[0];
                composer22.startReplaceGroup(1849434622);
                objRememberedValue = composer22.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composer22.endReplaceGroup();
                composerStartRestartGroup = composer22;
                final SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composer22, 3072, 6);
                eventCryptoDetailRecurringComposable$lambda$1 = CryptoDetailRecurringComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoDetailRecurringComposable$lambda$1 != null) {
                }
                eventCryptoDetailRecurringComposable$lambda$12 = CryptoDetailRecurringComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoDetailRecurringComposable$lambda$12 != null) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(312032559);
                    if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringHeaderView()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    currencyPair = CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrencyPair();
                    composerStartRestartGroup.startReplaceGroup(312091441);
                    if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringNuxView()) {
                        Modifier modifierTestTag32 = TestTag3.testTag(Modifier.INSTANCE, CryptoDetailRecurringComposable7.NUX_SECTION);
                        composerStartRestartGroup.startReplaceGroup(i5);
                        zChangedInstance = composerStartRestartGroup.changedInstance(cryptoDetailRecurringDuxo2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new CryptoDetailRecurringComposable4(cryptoDetailRecurringDuxo2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            RecurringInvestmentsNuxComposable.RecurringInvestmentsCryptoNuxComposable(currencyPair, modifierTestTag32, (Function0) ((KFunction) objRememberedValue2), composerStartRestartGroup, 48, 0);
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<StatefulHistoryEvent<HistoryEvent>> recurringScheduleHistoryItems2 = CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRecurringScheduleHistoryItems();
                    composerStartRestartGroup.startReplaceGroup(312105288);
                    if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringListView()) {
                        i6 = 54;
                        z = true;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(312129415);
                        if (CryptoDetailRecurringComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowRecurringHeaderView()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        boolean z22 = z;
                        showCryptoFeeUnsupportedRecurringAlertCryptoDetailRecurringComposable$lambda$4 = CryptoDetailRecurringComposable$lambda$4(snapshotState);
                        if (showCryptoFeeUnsupportedRecurringAlertCryptoDetailRecurringComposable$lambda$4 != null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                    }
                }
            }
        }
        final CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo32 = cryptoDetailRecurringDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoDetailRecurringComposable$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailRecurringViewState CryptoDetailRecurringComposable$lambda$0(SnapshotState4<CryptoDetailRecurringViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoDetailRecurringEvent> CryptoDetailRecurringComposable$lambda$1(SnapshotState4<Event<CryptoDetailRecurringEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert CryptoDetailRecurringComposable$lambda$4(SnapshotState<CryptoDetailRecurringEvent.ShowCryptoFeeUnsupportedRecurringAlert> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailRecurringComposable$lambda$12$lambda$10$lambda$9(Context context) {
        FragmentManager supportFragmentManager;
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext != null && (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) != null) {
            new CryptoDetailRecurringDescriptionBottomSheetFragment().show(supportFragmentManager, CryptoDetailRecurringDescriptionBottomSheetTag);
        }
        return Unit.INSTANCE;
    }
}
