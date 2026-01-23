package com.robinhood.shared.crypto.acats.history;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailAssetsResponseDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDataRowIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBanner2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTimelineIdl;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryEvent;
import com.robinhood.shared.crypto.contracts.CryptoAcatsHistoryFragmentKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.DataRowStackedDto;
import rh_server_driven_ui.p531v1.DeepLinkActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;
import rh_server_driven_ui.p531v1.InfoBannerDto;
import rh_server_driven_ui.p531v1.PlainTextDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TimelineDto;
import rh_server_driven_ui.p531v1.TimelineRowDto;

/* compiled from: CryptoAcatsHistoryComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002"}, m3636d2 = {"CryptoAcatsHistoryComposable", "", "args", "Lcom/robinhood/shared/crypto/contracts/CryptoAcatsHistoryFragmentKey;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryDuxo;", "(Lcom/robinhood/shared/crypto/contracts/CryptoAcatsHistoryFragmentKey;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryDuxo;Landroidx/compose/runtime/Composer;II)V", "MigrationDetailContent", "response", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewMigrationDetailContent", "(Landroidx/compose/runtime/Composer;I)V", "feature-acats_externalRelease", "viewState", "Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAcatsHistoryComposable$lambda$3(CryptoAcatsHistoryFragmentKey cryptoAcatsHistoryFragmentKey, Modifier modifier, CryptoAcatsHistoryDuxo cryptoAcatsHistoryDuxo, int i, int i2, Composer composer, int i3) {
        CryptoAcatsHistoryComposable(cryptoAcatsHistoryFragmentKey, modifier, cryptoAcatsHistoryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationDetailContent$lambda$11(CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MigrationDetailContent(cryptoMigrationsDetailResponseDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMigrationDetailContent$lambda$12(int i, Composer composer, int i2) {
        PreviewMigrationDetailContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoAcatsHistoryComposable(final CryptoAcatsHistoryFragmentKey args, final Modifier modifier, CryptoAcatsHistoryDuxo cryptoAcatsHistoryDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Event<CryptoAcatsHistoryEvent> event;
        final Activity activity;
        final Event<CryptoAcatsHistoryEvent> eventCryptoAcatsHistoryComposable$lambda$1;
        EventConsumer<CryptoAcatsHistoryEvent> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1820063405);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changedInstance(cryptoAcatsHistoryDuxo)) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(2050738472);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                    creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoAcatsHistoryDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$duxo$1.1
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
                    cryptoAcatsHistoryDuxo = (CryptoAcatsHistoryDuxo) baseDuxo;
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1820063405, i3, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable (CryptoAcatsHistoryComposable.kt:64)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoAcatsHistoryDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final StateFlow<Event<CryptoAcatsHistoryEvent>> eventFlow = cryptoAcatsHistoryDuxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoAcatsHistoryComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoAcatsHistoryEvent) {
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
                Event<CryptoAcatsHistoryEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoAcatsHistoryEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                GenericActionHandlerKt.GenericActionHandler(Boolean.FALSE, true, null, null, ComposableLambda3.rememberComposableLambda(558290277, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(558290277, i5, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous> (CryptoAcatsHistoryComposable.kt:72)");
                        }
                        Modifier modifier2 = modifier;
                        Function2<Composer, Integer, Unit> function2M24875getLambda$1186148831$feature_acats_externalRelease = ComposableSingletons$CryptoAcatsHistoryComposableKt.INSTANCE.m24875getLambda$1186148831$feature_acats_externalRelease();
                        final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1322176128, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1322176128, i6, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous>.<anonymous> (CryptoAcatsHistoryComposable.kt:105)");
                                }
                                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer3.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                final Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState42 = snapshotState4;
                                ProvidedValue<DtoActionHandler<?>> providedValueProvides = DtoActionHandler2.getLocalDtoActionHandler().provides(new DtoActionHandler<GenericActionDto>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$1$1$customHandler$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                    public GenericActionDto convertAlertToAction(AlertDto alert) {
                                        Intrinsics.checkNotNullParameter(alert, "alert");
                                        return null;
                                    }

                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                    /* renamed from: handle-RsTtcXE, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
                                    public boolean mo10782handleRsTtcXE(GenericActionDto action, GenericAlertMobilePresentationStyle alertType, int textAlign) throws Resources.NotFoundException {
                                        String url;
                                        CryptoMigrationsDetailAssetsResponseDto assets_detail;
                                        Intrinsics.checkNotNullParameter(action, "action");
                                        Intrinsics.checkNotNullParameter(alertType, "alertType");
                                        DeepLinkActionDto deeplink = action.getDeeplink();
                                        if (deeplink != null && (url = deeplink.getUrl()) != null && StringsKt.contains$default((CharSequence) url, (CharSequence) "/crypto/crypto_migrations/detail/assets/", false, 2, (Object) null)) {
                                            CryptoMigrationsDetailResponseDto response = CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$0(snapshotState42).getResponse();
                                            if (response != null && (assets_detail = response.getAssets_detail()) != null) {
                                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, CryptoAcatsHistoryDestinations3.INSTANCE, assets_detail, null, null, false, null, 60, null);
                                            }
                                            return true;
                                        }
                                        if (action.getDeeplink() == null) {
                                            return false;
                                        }
                                        Navigator navigator2 = navigator;
                                        Context context2 = context;
                                        DeepLinkActionDto deeplink2 = action.getDeeplink();
                                        if (deeplink2 != null) {
                                            GenericActionHandlerKt.handleDeeplinkActionDto(navigator2, context2, deeplink2, Boolean.FALSE);
                                            return true;
                                        }
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                });
                                final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState43 = snapshotState4;
                                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1616808768, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1.1.1
                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1616808768, i7, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsHistoryComposable.kt:141)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM());
                                        SnapshotState4<CryptoAcatsHistoryViewState> snapshotState44 = snapshotState43;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierNavigationBarsPadding);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        CryptoMigrationsDetailResponseDto response = CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$0(snapshotState44).getResponse();
                                        List<ButtonDto> footer_buttons = response != null ? response.getFooter_buttons() : null;
                                        composer4.startReplaceGroup(-1667982083);
                                        if (footer_buttons != null) {
                                            for (ButtonDto buttonDto : footer_buttons) {
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                composer4.startReplaceGroup(1849434622);
                                                Object objRememberedValue2 = composer4.rememberedValue();
                                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = C37545x7a94b116.INSTANCE;
                                                    composer4.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer4.endReplaceGroup();
                                                SduiButton2.SduiButton(buttonDto, (Function1) ((KFunction) objRememberedValue2), modifierFillMaxWidth$default, composer4, 432, 0);
                                            }
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, function2M24875getLambda$1186148831$feature_acats_externalRelease, composableLambdaRememberComposableLambda, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(7181942, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(7181942, i6, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous>.<anonymous> (CryptoAcatsHistoryComposable.kt:87)");
                                }
                                Crossfade.Crossfade(CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$0(snapshotState42).getResponse(), androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), (FiniteAnimationSpec<Float>) null, "historyDetailCrossFade", ComposableSingletons$CryptoAcatsHistoryComposableKt.INSTANCE.getLambda$1062841268$feature_acats_externalRelease(), composer3, 27648, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306800, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 24630, 12);
                activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                eventCryptoAcatsHistoryComposable$lambda$1 = CryptoAcatsHistoryComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoAcatsHistoryComposable$lambda$1 != null && (eventCryptoAcatsHistoryComposable$lambda$1.getData() instanceof CryptoAcatsHistoryEvent.Error) && (eventConsumerInvoke = eventCryptoAcatsHistoryComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoAcatsHistoryComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m24880invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24880invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoAcatsHistoryEvent.Error error = (CryptoAcatsHistoryEvent.Error) eventCryptoAcatsHistoryComposable$lambda$1.getData();
                            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                            Activity activity2 = activity;
                            if (activity2 != null) {
                                ActivityErrorHandler.Companion.handle$default(companion, activity2, error.getThrowable(), true, false, 0, null, 56, null);
                                return;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoAcatsHistoryDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = cryptoAcatsHistoryDuxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoAcatsHistoryComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoAcatsHistoryEvent) {
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
                Event<CryptoAcatsHistoryEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoAcatsHistoryEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                GenericActionHandlerKt.GenericActionHandler(Boolean.FALSE, true, null, null, ComposableLambda3.rememberComposableLambda(558290277, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(558290277, i5, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous> (CryptoAcatsHistoryComposable.kt:72)");
                        }
                        Modifier modifier2 = modifier;
                        Function2<Composer, Integer, Unit> function2M24875getLambda$1186148831$feature_acats_externalRelease = ComposableSingletons$CryptoAcatsHistoryComposableKt.INSTANCE.m24875getLambda$1186148831$feature_acats_externalRelease();
                        final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1322176128, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1322176128, i6, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous>.<anonymous> (CryptoAcatsHistoryComposable.kt:105)");
                                }
                                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer3.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                                final Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState42 = snapshotState4;
                                ProvidedValue<DtoActionHandler<?>> providedValueProvides = DtoActionHandler2.getLocalDtoActionHandler().provides(new DtoActionHandler<GenericActionDto>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$1$1$customHandler$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                    public GenericActionDto convertAlertToAction(AlertDto alert) {
                                        Intrinsics.checkNotNullParameter(alert, "alert");
                                        return null;
                                    }

                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                                    /* renamed from: handle-RsTtcXE, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
                                    public boolean mo10782handleRsTtcXE(GenericActionDto action, GenericAlertMobilePresentationStyle alertType, int textAlign) throws Resources.NotFoundException {
                                        String url;
                                        CryptoMigrationsDetailAssetsResponseDto assets_detail;
                                        Intrinsics.checkNotNullParameter(action, "action");
                                        Intrinsics.checkNotNullParameter(alertType, "alertType");
                                        DeepLinkActionDto deeplink = action.getDeeplink();
                                        if (deeplink != null && (url = deeplink.getUrl()) != null && StringsKt.contains$default((CharSequence) url, (CharSequence) "/crypto/crypto_migrations/detail/assets/", false, 2, (Object) null)) {
                                            CryptoMigrationsDetailResponseDto response = CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$0(snapshotState42).getResponse();
                                            if (response != null && (assets_detail = response.getAssets_detail()) != null) {
                                                LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, CryptoAcatsHistoryDestinations3.INSTANCE, assets_detail, null, null, false, null, 60, null);
                                            }
                                            return true;
                                        }
                                        if (action.getDeeplink() == null) {
                                            return false;
                                        }
                                        Navigator navigator2 = navigator;
                                        Context context2 = context;
                                        DeepLinkActionDto deeplink2 = action.getDeeplink();
                                        if (deeplink2 != null) {
                                            GenericActionHandlerKt.handleDeeplinkActionDto(navigator2, context2, deeplink2, Boolean.FALSE);
                                            return true;
                                        }
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                });
                                final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState43 = snapshotState4;
                                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1616808768, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1.1.1
                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1616808768, i7, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsHistoryComposable.kt:141)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i8 = BentoTheme.$stable;
                                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM());
                                        SnapshotState4<CryptoAcatsHistoryViewState> snapshotState44 = snapshotState43;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer4, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierNavigationBarsPadding);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        CryptoMigrationsDetailResponseDto response = CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$0(snapshotState44).getResponse();
                                        List<ButtonDto> footer_buttons = response != null ? response.getFooter_buttons() : null;
                                        composer4.startReplaceGroup(-1667982083);
                                        if (footer_buttons != null) {
                                            for (ButtonDto buttonDto : footer_buttons) {
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                composer4.startReplaceGroup(1849434622);
                                                Object objRememberedValue2 = composer4.rememberedValue();
                                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = C37545x7a94b116.INSTANCE;
                                                    composer4.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer4.endReplaceGroup();
                                                SduiButton2.SduiButton(buttonDto, (Function1) ((KFunction) objRememberedValue2), modifierFillMaxWidth$default, composer4, 432, 0);
                                            }
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final SnapshotState4<CryptoAcatsHistoryViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, function2M24875getLambda$1186148831$feature_acats_externalRelease, composableLambdaRememberComposableLambda, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(7181942, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(7181942, i6, -1, "com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposable.<anonymous>.<anonymous> (CryptoAcatsHistoryComposable.kt:87)");
                                }
                                Crossfade.Crossfade(CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$0(snapshotState42).getResponse(), androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), (FiniteAnimationSpec<Float>) null, "historyDetailCrossFade", ComposableSingletons$CryptoAcatsHistoryComposableKt.INSTANCE.getLambda$1062841268$feature_acats_externalRelease(), composer3, 27648, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306800, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 24630, 12);
                activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                eventCryptoAcatsHistoryComposable$lambda$1 = CryptoAcatsHistoryComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoAcatsHistoryComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoAcatsHistoryComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$CryptoAcatsHistoryComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m24880invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24880invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoAcatsHistoryEvent.Error error = (CryptoAcatsHistoryEvent.Error) eventCryptoAcatsHistoryComposable$lambda$1.getData();
                            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                            Activity activity2 = activity;
                            if (activity2 != null) {
                                ActivityErrorHandler.Companion.handle$default(companion, activity2, error.getThrowable(), true, false, 0, null, 56, null);
                                return;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier2 = modifier;
        final CryptoAcatsHistoryDuxo cryptoAcatsHistoryDuxo2 = cryptoAcatsHistoryDuxo;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable$lambda$3(args, modifier2, cryptoAcatsHistoryDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoAcatsHistoryViewState CryptoAcatsHistoryComposable$lambda$0(SnapshotState4<CryptoAcatsHistoryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoAcatsHistoryEvent> CryptoAcatsHistoryComposable$lambda$1(SnapshotState4<Event<CryptoAcatsHistoryEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MigrationDetailContent(final CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        InfoBannerDto banner;
        TimelineDto timeline;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1344519685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(cryptoMigrationsDetailResponseDto) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1344519685, i3, -1, "com.robinhood.shared.crypto.acats.history.MigrationDetailContent (CryptoAcatsHistoryComposable.kt:174)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier4 = modifier3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(cryptoMigrationsDetailResponseDto.getTitle(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(cryptoMigrationsDetailResponseDto.getSubtitle(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                banner = cryptoMigrationsDetailResponseDto.getBanner();
                composerStartRestartGroup.startReplaceGroup(-1469315513);
                if (banner != null) {
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = CryptoAcatsHistoryComposableKt$MigrationDetailContent$1$1$1$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SduiInfoBanner2.SduiInfoBanner(banner, (Function1) ((KFunction) objRememberedValue), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, composerStartRestartGroup, 48, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                timeline = cryptoMigrationsDetailResponseDto.getTimeline();
                composerStartRestartGroup.startReplaceGroup(-1469304409);
                if (timeline != null) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = CryptoAcatsHistoryComposableKt$MigrationDetailContent$1$2$1$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SduiTimelineIdl.SduiTimeline(timeline, (Function1) ((KFunction) objRememberedValue2), null, null, 0, false, composerStartRestartGroup, 48, 60);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1469295772);
                if (!cryptoMigrationsDetailResponseDto.getDetail_rows().isEmpty()) {
                    for (DataRowStackedDto dataRowStackedDto : cryptoMigrationsDetailResponseDto.getDetail_rows()) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = CryptoAcatsHistoryComposableKt$MigrationDetailContent$1$3$1$1.INSTANCE;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        SduiDataRowIdl.SduiStackedDataRow(dataRowStackedDto, (Function1) ((KFunction) objRememberedValue3), null, null, composer2, 48, 12);
                        composerStartRestartGroup = composer2;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAcatsHistoryComposableKt.MigrationDetailContent$lambda$11(cryptoMigrationsDetailResponseDto, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier42 = modifier3;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(cryptoMigrationsDetailResponseDto.getTitle(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(cryptoMigrationsDetailResponseDto.getSubtitle(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                banner = cryptoMigrationsDetailResponseDto.getBanner();
                composerStartRestartGroup.startReplaceGroup(-1469315513);
                if (banner != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                timeline = cryptoMigrationsDetailResponseDto.getTimeline();
                composerStartRestartGroup.startReplaceGroup(-1469304409);
                if (timeline != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1469295772);
                if (!cryptoMigrationsDetailResponseDto.getDetail_rows().isEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewMigrationDetailContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1734637059);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1734637059, i, -1, "com.robinhood.shared.crypto.acats.history.PreviewMigrationDetailContent (CryptoAcatsHistoryComposable.kt:230)");
            }
            final CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto = new CryptoMigrationsDetailResponseDto("e3243429-ba17-48c7-a69d-02073a24253b", "bitstamp Migration", "Transfer in progress", new InfoBannerDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto("Your bitstamp migration is PRE_MIGRATION"))), null, null, null, null, 30, null), new TimelineDto(CollectionsKt.listOf((Object[]) new TimelineRowDto[]{new TimelineRowDto(TimelineRowDto.StateDto.STATE_COMPLETE, "Migration Started", "Created on November 21, 2025", null, null, null, null, 120, null), new TimelineRowDto(TimelineRowDto.StateDto.STATE_ONGOING, "Assets Transfer", "In Progress", null, null, null, null, 120, null)}), null, null, null, 14, null), CollectionsKt.listOf((Object[]) new DataRowStackedDto[]{new DataRowStackedDto("Migration ID", null, "e3243429-ba17-48c7-a69d-02073a24253b", null, null, null, 58, null), new DataRowStackedDto("Status", null, "PRE_MIGRATION", null, null, null, 58, null), new DataRowStackedDto("Partner", null, "bitstamp", null, null, null, 58, null)}), CollectionsKt.listOf(new ButtonDto(null, "View Assets", ButtonTypeDto.BUTTON_TYPE_SECONDARY, null, null, null, null, null, EnumC7081g.f2779x59907a3d, null)), null, null, null, 896, null);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-755288763, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt.PreviewMigrationDetailContent.1
                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-755288763, i2, -1, "com.robinhood.shared.crypto.acats.history.PreviewMigrationDetailContent.<anonymous> (CryptoAcatsHistoryComposable.kt:281)");
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                    CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto2 = cryptoMigrationsDetailResponseDto;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CryptoAcatsHistoryComposableKt.MigrationDetailContent(cryptoMigrationsDetailResponseDto2, null, composer2, 0, 2);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoAcatsHistoryComposableKt.PreviewMigrationDetailContent$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
