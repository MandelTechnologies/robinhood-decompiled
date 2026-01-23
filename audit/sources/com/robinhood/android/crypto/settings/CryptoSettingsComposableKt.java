package com.robinhood.android.crypto.settings;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.crypto.settings.CryptoSettingsComposableKt;
import com.robinhood.android.crypto.settings.CryptoSettingsEvent;
import com.robinhood.android.crypto.settings.CryptoSettingsViewState;
import com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposable4;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.contracts.transfers.CryptoSavedAddressesListIntentKey;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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

/* compiled from: CryptoSettingsComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\"\u0016\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002"}, m3636d2 = {"CryptoSettingsComposable", "", "handleError", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo;Landroidx/compose/runtime/Composer;II)V", "logSuvResult", "Lcom/robinhood/analytics/EventLogger;", "status", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "FEE_TIER_STATUS_TAG", "", "getFEE_TIER_STATUS_TAG", "()Ljava/lang/String;", "feature-crypto-settings_externalDebug", "viewState", "Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsEvent;", "allowlistSheetState", "Lcom/robinhood/android/crypto/settings/AllowlistSheetState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoSettingsComposableKt {
    private static final String FEE_TIER_STATUS_TAG = "fee_tier_status_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoSettingsComposable$lambda$11(Function1 function1, Modifier modifier, CryptoSettingsDuxo cryptoSettingsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoSettingsComposable(function1, modifier, cryptoSettingsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSettingsComposable(final Function1<? super Throwable, Unit> handleError, Modifier modifier, CryptoSettingsDuxo cryptoSettingsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoSettingsDuxo cryptoSettingsDuxo2;
        Modifier modifier3;
        CryptoSettingsDuxo cryptoSettingsDuxo3;
        Event<CryptoSettingsEvent> event;
        Context context;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Event<CryptoSettingsEvent> eventCryptoSettingsComposable$lambda$1;
        OnBackPressedDispatcher onBackPressedDispatcher;
        int i4;
        final Context context2;
        AllowlistSheetState allowlistSheetStateCryptoSettingsComposable$lambda$7;
        final CryptoSettingsDuxo cryptoSettingsDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoSettingsEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1087811792);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(handleError) ? 4 : 2) | i;
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
                    cryptoSettingsDuxo2 = cryptoSettingsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoSettingsDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoSettingsDuxo2 = cryptoSettingsDuxo;
                }
                i3 |= i6;
            } else {
                cryptoSettingsDuxo2 = cryptoSettingsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoSettingsDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$duxo$1.1
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
                        i3 &= -897;
                        modifier3 = modifier5;
                        cryptoSettingsDuxo3 = (CryptoSettingsDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1087811792, i3, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable (CryptoSettingsComposable.kt:71)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoSettingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final StateFlow<Event<CryptoSettingsEvent>> eventFlow = cryptoSettingsDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoSettingsComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof CryptoSettingsEvent) {
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
                        Event<CryptoSettingsEvent> value = eventFlow.getValue();
                        event = value;
                        if (!((event == null ? event.getData() : null) instanceof CryptoSettingsEvent)) {
                            value = null;
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(current);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$3$lambda$2(current);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(current);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$5$lambda$4(current);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        eventCryptoSettingsComposable$lambda$1 = CryptoSettingsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventCryptoSettingsComposable$lambda$1 == null && (eventCryptoSettingsComposable$lambda$1.getData() instanceof CryptoSettingsEvent) && (eventConsumerInvoke = eventCryptoSettingsComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            i4 = i3;
                            onBackPressedDispatcher = null;
                            context2 = context;
                            eventConsumerInvoke.consume(eventCryptoSettingsComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m12975invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m12975invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoSettingsEvent cryptoSettingsEvent = (CryptoSettingsEvent) eventCryptoSettingsComposable$lambda$1.getData();
                                    if (cryptoSettingsEvent instanceof CryptoSettingsEvent.Deeplink) {
                                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context2, ((CryptoSettingsEvent.Deeplink) cryptoSettingsEvent).getUri(), null, null, false, null, 60, null);
                                        return;
                                    }
                                    if (cryptoSettingsEvent instanceof CryptoSettingsEvent.Error) {
                                        handleError.invoke(((CryptoSettingsEvent.Error) cryptoSettingsEvent).getThrowable());
                                    } else {
                                        if (!(cryptoSettingsEvent instanceof CryptoSettingsEvent.SuvRequired)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        CryptoSettingsEvent.SuvRequired suvRequired = (CryptoSettingsEvent.SuvRequired) cryptoSettingsEvent;
                                        function2RememberSuvLauncher.invoke(suvRequired.getWorkflowVerificationId(), Boolean.valueOf(suvRequired.isMigrated()));
                                    }
                                }
                            });
                        } else {
                            onBackPressedDispatcher = null;
                            i4 = i3;
                            context2 = context;
                        }
                        OnBackPressedDispatcherOwner current3 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                        final OnBackPressedDispatcher onBackPressedDispatcher2 = current3 == null ? current3.getOnBackPressedDispatcher() : onBackPressedDispatcher;
                        CryptoSettingsDuxo cryptoSettingsDuxo5 = cryptoSettingsDuxo3;
                        Modifier modifier6 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(388143852, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt.CryptoSettingsComposable.2
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
                                    ComposerKt.traceEventStart(388143852, i7, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous> (CryptoSettingsComposable.kt:100)");
                                }
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoSettingsComposableKt.INSTANCE.getLambda$389839135$feature_crypto_settings_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-211577269, true, new AnonymousClass1(onBackPressedDispatcher2), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoSettingsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ OnBackPressedDispatcher $onBack;

                                AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                                    this.$onBack = onBackPressedDispatcher;
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
                                        ComposerKt.traceEventStart(-211577269, i, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous>.<anonymous> (CryptoSettingsComposable.kt:108)");
                                    }
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$onBack);
                                    final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoSettingsComposableKt.C129862.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
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
                                public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                    if (onBackPressedDispatcher != null) {
                                        onBackPressedDispatcher.onBackPressed();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-643970175, true, new C129873(cryptoSettingsDuxo3, navigator, context2, snapshotState4CollectAsStateWithLifecycle, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 508);
                        composerStartRestartGroup = composerStartRestartGroup;
                        allowlistSheetStateCryptoSettingsComposable$lambda$7 = CryptoSettingsComposable$lambda$7(snapshotState);
                        if (allowlistSheetStateCryptoSettingsComposable$lambda$7 != null) {
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1845301542, true, new CryptoSettingsComposableKt$CryptoSettingsComposable$4$1(snapshotState, allowlistSheetStateCryptoSettingsComposable$lambda$7, cryptoSettingsDuxo5), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoSettingsDuxo4 = cryptoSettingsDuxo5;
                        modifier4 = modifier6;
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                cryptoSettingsDuxo3 = cryptoSettingsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoSettingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoSettingsDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoSettingsComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoSettingsEvent) {
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
                Event<CryptoSettingsEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoSettingsEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(current);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$3$lambda$2(current);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(current);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$5$lambda$4(current);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        final Function2 function2RememberSuvLauncher2 = SuvLauncher.rememberSuvLauncher(navigator2, function02, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        eventCryptoSettingsComposable$lambda$1 = CryptoSettingsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventCryptoSettingsComposable$lambda$1 == null) {
                            onBackPressedDispatcher = null;
                            i4 = i3;
                            context2 = context;
                            OnBackPressedDispatcherOwner current32 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                            if (current32 == null) {
                            }
                            CryptoSettingsDuxo cryptoSettingsDuxo52 = cryptoSettingsDuxo3;
                            Modifier modifier62 = modifier3;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier62, ComposableLambda3.rememberComposableLambda(388143852, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt.CryptoSettingsComposable.2
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
                                        ComposerKt.traceEventStart(388143852, i7, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous> (CryptoSettingsComposable.kt:100)");
                                    }
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoSettingsComposableKt.INSTANCE.getLambda$389839135$feature_crypto_settings_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-211577269, true, new AnonymousClass1(onBackPressedDispatcher2), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: CryptoSettingsComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$2$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                    final /* synthetic */ OnBackPressedDispatcher $onBack;

                                    AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        this.$onBack = onBackPressedDispatcher;
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
                                            ComposerKt.traceEventStart(-211577269, i, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous>.<anonymous> (CryptoSettingsComposable.kt:108)");
                                        }
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$onBack);
                                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$2$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoSettingsComposableKt.C129862.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
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
                                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        if (onBackPressedDispatcher != null) {
                                            onBackPressedDispatcher.onBackPressed();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-643970175, true, new C129873(cryptoSettingsDuxo3, navigator2, context2, snapshotState4CollectAsStateWithLifecycle3, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 508);
                            composerStartRestartGroup = composerStartRestartGroup;
                            allowlistSheetStateCryptoSettingsComposable$lambda$7 = CryptoSettingsComposable$lambda$7(snapshotState2);
                            if (allowlistSheetStateCryptoSettingsComposable$lambda$7 != null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            cryptoSettingsDuxo4 = cryptoSettingsDuxo52;
                            modifier4 = modifier62;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoSettingsDuxo4 = cryptoSettingsDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$11(handleError, modifier4, cryptoSettingsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoSettingsComposable$lambda$3$lambda$2(EventLogger eventLogger) {
        logSuvResult(eventLogger, StepUpVerificationContext.WorkflowStatus.APPROVED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoSettingsComposable$lambda$5$lambda$4(EventLogger eventLogger) {
        logSuvResult(eventLogger, StepUpVerificationContext.WorkflowStatus.DENIED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoSettingsViewState CryptoSettingsComposable$lambda$0(SnapshotState4<CryptoSettingsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoSettingsEvent> CryptoSettingsComposable$lambda$1(SnapshotState4<Event<CryptoSettingsEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final AllowlistSheetState CryptoSettingsComposable$lambda$7(SnapshotState<AllowlistSheetState> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: CryptoSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$3 */
    static final class C129873 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<AllowlistSheetState> $allowlistSheetState$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoSettingsDuxo $duxo;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState4<CryptoSettingsViewState> $viewState$delegate;

        C129873(CryptoSettingsDuxo cryptoSettingsDuxo, Navigator navigator, Context context, SnapshotState4<CryptoSettingsViewState> snapshotState4, SnapshotState<AllowlistSheetState> snapshotState) {
            this.$duxo = cryptoSettingsDuxo;
            this.$navigator = navigator;
            this.$context = context;
            this.$viewState$delegate = snapshotState4;
            this.$allowlistSheetState$delegate = snapshotState;
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x045a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x048f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x04fd  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0522  */
        /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            int i3;
            Modifier.Companion companion;
            int i4;
            Modifier.Companion companion2;
            final Navigator navigator;
            final Context context;
            boolean z;
            BentoTheme bentoTheme;
            Navigator navigator2;
            Context context2;
            int i5;
            int i6;
            final String strStringResource;
            final Navigator navigator3;
            final Context context3;
            boolean zChangedInstance;
            Object objRememberedValue;
            Modifier.Companion companion3;
            BentoTheme bentoTheme2;
            int i7;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643970175, i2, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous> (CryptoSettingsComposable.kt:117)");
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), paddingValues), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            CryptoSettingsDuxo cryptoSettingsDuxo = this.$duxo;
            Navigator navigator4 = this.$navigator;
            Context context4 = this.$context;
            SnapshotState4<CryptoSettingsViewState> snapshotState4 = this.$viewState$delegate;
            SnapshotState<AllowlistSheetState> snapshotState = this.$allowlistSheetState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme3.getSpacing(composer, i8).m21592getMediumD9Ej5fM()), composer, 0);
            composer.startReplaceGroup(2123844123);
            if (CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).isVolumeTiersDiscoveryExperimentEnabled()) {
                i3 = 0;
                companion = companion4;
                CryptoSettingsFeeTierStatusComposable4.CryptoSettingsFeeTierStatusComposable(TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, bentoTheme3.getSpacing(composer, i8).m21594getXlargeD9Ej5fM(), composer, 6, 1), CryptoSettingsComposableKt.getFEE_TIER_STATUS_TAG()), null, composer, 0, 2);
            } else {
                i3 = 0;
                companion = companion4;
            }
            composer.endReplaceGroup();
            Modifier.Companion companion6 = companion;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13000R.string.crypto_limits_title, composer, i3), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer, i8).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            Composer composer2 = composer;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), composer2, 0);
            StringResource receivingStatusTitle = CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getReceivingStatusTitle();
            int i9 = StringResource.$stable;
            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources6.getTextAsString(receivingStatusTitle, composer2, i9), null, 2, null), null, null, null, new AnnotatedString(CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getReceivingCryptoRowStatus(), null, 2, null), null, null, null, null, false, false, 4061, null);
            int i10 = BentoDataRowState.$stable;
            BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composer2, i10, 6);
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getSendingCryptoRowDescription(), new AnnotatedString(StringResources6.getTextAsString(CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getSendingStatusTitle(), composer2, i9), null, 2, null), null, null, null, new AnnotatedString(CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getSendingCryptoRowStatus(), null, 2, null), null, null, null, null, false, false, 4060, null), null, null, composer2, i10, 6);
            composer2.startReplaceGroup(2123884640);
            if (CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).isUserEligibleForHigherLimit()) {
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion6, bentoTheme3.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer2.changedInstance(cryptoSettingsDuxo);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$1$1(cryptoSettingsDuxo);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                companion2 = companion6;
                i4 = i8;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), StringResources_androidKt.stringResource(C13000R.string.crypto_limits_request_limit_increase, composer2, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                composer2 = composer;
            } else {
                i4 = i8;
                companion2 = companion6;
            }
            composer2.endReplaceGroup();
            CryptoSettingsViewState.AllowlistToggleState allowlistToggleState = CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getAllowlistToggleState();
            composer2.startReplaceGroup(2123900519);
            if (allowlistToggleState == null) {
                navigator = navigator4;
                context = context4;
                z = true;
            } else {
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    navigator = navigator4;
                    context = context4;
                    objRememberedValue3 = new UriHandler() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$2$uriHandler$1$1
                        @Override // androidx.compose.p011ui.platform.UriHandler
                        public void openUri(String uri) {
                            Intrinsics.checkNotNullParameter(uri, "uri");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, CryptoSavedAddressesListIntentKey.INSTANCE, null, false, null, null, 60, null);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    navigator = navigator4;
                    context = context4;
                }
                composer2.endReplaceGroup();
                z = true;
                CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides((C12988x2c28f6d7) objRememberedValue3), ComposableLambda3.rememberComposableLambda(-790756066, true, new CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$2$1(allowlistToggleState, snapshotState), composer2, 54), composer2, ProvidedValue.$stable | 48);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            ImmutableList<StatefulHistoryEvent<HistoryEvent>> cryptoTransferHistoryItems = CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).getCryptoTransferHistoryItems();
            composer2.startReplaceGroup(2123943556);
            if (cryptoTransferHistoryItems != null) {
                int i11 = i4;
                bentoTheme = bentoTheme3;
                Modifier.Companion companion7 = companion2;
                navigator2 = navigator;
                context2 = context;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13000R.string.crypto_limits_history_title, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme3.getSpacing(composer2, i11).m21594getXlargeD9Ej5fM(), bentoTheme3.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i11).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                ComposableSingletons$CryptoSettingsComposableKt composableSingletons$CryptoSettingsComposableKt = ComposableSingletons$CryptoSettingsComposableKt.INSTANCE;
                BentoThemeOverlays.ElevatedThemeOverlay(composableSingletons$CryptoSettingsComposableKt.getLambda$496196648$feature_crypto_settings_externalDebug(), composer, 6);
                if (cryptoTransferHistoryItems.isEmpty()) {
                    composer.startReplaceGroup(1419588367);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion7, 0.0f, composer, 6, 1);
                    companion2 = companion7;
                    i5 = i11;
                    i6 = 0;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13000R.string.crypto_limits_history_empty, composer, 0), modifierM21623defaultHorizontalPaddingrAjV9yQ, Color.m6701boximpl(bentoTheme.getColors(composer, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16376);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    strStringResource = StringResources_androidKt.stringResource(C13000R.string.crypto_transfer_support_withdrawal_url, composer2, i6);
                    BentoTheme bentoTheme4 = bentoTheme;
                    int i12 = i5;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme4.getSpacing(composer2, i12).m21590getDefaultD9Ej5fM(), 0.0f, composer2, 6, 2);
                    String strStringResource2 = StringResources_androidKt.stringResource(C13000R.string.crypto_limits_help, composer2, i6);
                    long jM21426getFg20d7_KjU = bentoTheme4.getColors(composer2, i12).m21426getFg20d7_KjU();
                    TextStyle textS = bentoTheme4.getTypography(composer2, i12).getTextS();
                    long jM21368getAccent0d7_KjU = bentoTheme4.getColors(composer2, i12).m21368getAccent0d7_KjU();
                    String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer2, i6);
                    composer2.startReplaceGroup(-1746271574);
                    navigator3 = navigator2;
                    context3 = context2;
                    zChangedInstance = composer2.changedInstance(navigator3) | composer2.changedInstance(context3) | composer2.changed(strStringResource);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoSettingsComposableKt.C129873.invoke$lambda$7$lambda$4$lambda$3(navigator3, context3, strStringResource);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Modifier.Companion companion8 = companion2;
                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue, modifierM21622defaultHorizontalPaddingWMci_g0, jM21426getFg20d7_KjU, jM21368getAccent0d7_KjU, textS, 0, composer, 0, 128);
                    Composer composer3 = composer;
                    composer3.startReplaceGroup(2124035252);
                    if (CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).isActivateTransferButtonVisible()) {
                        companion3 = companion8;
                        bentoTheme2 = bentoTheme4;
                        i7 = i12;
                    } else {
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion8, 0.0f, 1, null), 0.0f, bentoTheme4.getSpacing(composer3, i12).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        String strStringResource4 = StringResources_androidKt.stringResource(C13000R.string.crypto_settings_active_transfers, composer3, 0);
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer3.changedInstance(navigator3) | composer3.changedInstance(context3);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$3$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoSettingsComposableKt.C129873.invoke$lambda$7$lambda$6$lambda$5(navigator3, context3);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceGroup();
                        companion3 = companion8;
                        bentoTheme2 = bentoTheme4;
                        i7 = i12;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue4, strStringResource4, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                        composer3 = composer;
                    }
                    composer3.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
                composer.startReplaceGroup(1418545341);
                HistoryRowsKt.HistorySection(cryptoTransferHistoryItems, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), composableSingletons$CryptoSettingsComposableKt.m12972getLambda$523676891$feature_crypto_settings_externalDebug(), composableSingletons$CryptoSettingsComposableKt.getLambda$2055691814$feature_crypto_settings_externalDebug(), true, false, true, false, composer, 1797552, 128);
                composer2 = composer;
                composer2.endReplaceGroup();
                companion2 = companion7;
                i5 = i11;
            } else {
                bentoTheme = bentoTheme3;
                navigator2 = navigator;
                context2 = context;
                i5 = i4;
            }
            i6 = 0;
            composer2.endReplaceGroup();
            strStringResource = StringResources_androidKt.stringResource(C13000R.string.crypto_transfer_support_withdrawal_url, composer2, i6);
            BentoTheme bentoTheme42 = bentoTheme;
            int i122 = i5;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme42.getSpacing(composer2, i122).m21590getDefaultD9Ej5fM(), 0.0f, composer2, 6, 2);
            String strStringResource22 = StringResources_androidKt.stringResource(C13000R.string.crypto_limits_help, composer2, i6);
            long jM21426getFg20d7_KjU2 = bentoTheme42.getColors(composer2, i122).m21426getFg20d7_KjU();
            TextStyle textS2 = bentoTheme42.getTypography(composer2, i122).getTextS();
            long jM21368getAccent0d7_KjU2 = bentoTheme42.getColors(composer2, i122).m21368getAccent0d7_KjU();
            String strStringResource32 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer2, i6);
            composer2.startReplaceGroup(-1746271574);
            navigator3 = navigator2;
            context3 = context2;
            zChangedInstance = composer2.changedInstance(navigator3) | composer2.changedInstance(context3) | composer2.changed(strStringResource);
            objRememberedValue = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoSettingsComposableKt.C129873.invoke$lambda$7$lambda$4$lambda$3(navigator3, context3, strStringResource);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier.Companion companion82 = companion2;
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource22, strStringResource32, (Function0) objRememberedValue, modifierM21622defaultHorizontalPaddingWMci_g02, jM21426getFg20d7_KjU2, jM21368getAccent0d7_KjU2, textS2, 0, composer, 0, 128);
            Composer composer32 = composer;
            composer32.startReplaceGroup(2124035252);
            if (CryptoSettingsComposableKt.CryptoSettingsComposable$lambda$0(snapshotState4).isActivateTransferButtonVisible()) {
            }
            composer32.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer32, i7).m21594getXlargeD9Ej5fM()), composer32, 0);
            composer32.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4$lambda$3(Navigator navigator, Context context, String str) {
            Navigators3.showHelpCenterWebViewFragment(navigator, context, str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(Navigator navigator, Context context) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoTransferIntentKey(CryptoTransferIntentKey.Action.ENROLL, null, null, false, null, 30, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    private static final void logSuvResult(EventLogger eventLogger, StepUpVerificationContext.WorkflowStatus workflowStatus) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, UserInteractionEventData.Action.SUBMIT, new Screen(Screen.Name.CRYPTO_TRANSFER_LIMITS, null, null, null, 14, null), null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new StepUpVerificationContext(workflowStatus, "", null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -262145, -1, -1, 16383, null), 12, null);
    }

    public static final String getFEE_TIER_STATUS_TAG() {
        return FEE_TIER_STATUS_TAG;
    }
}
