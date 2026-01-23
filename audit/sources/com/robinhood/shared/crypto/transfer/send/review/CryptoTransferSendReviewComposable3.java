package com.robinhood.shared.crypto.transfer.send.review;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable3;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewEvent;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoTransferSendReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0016X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferSendReviewComposable", "", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDuxo;", "(Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDuxo;Landroidx/compose/runtime/Composer;II)V", "ReviewDetails", "state", "Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;", "(Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;Landroidx/compose/runtime/Composer;I)V", "PreviewReviewDetails", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "shouldShowWarningSheetOnSubmission", "", "showWarningBottomSheet", "showNetworkBottomSheet", "showNetworkFeeBottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendReviewComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferSendReviewComposable$lambda$15$lambda$14(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendReviewComposable$lambda$20(CryptoTransferSendReviewFragment.Callbacks callbacks, Modifier modifier, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendReviewComposable(callbacks, modifier, cryptoTransferSendReviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewReviewDetails$lambda$41(int i, Composer composer, int i2) {
        PreviewReviewDetails(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ReviewDetails$lambda$35$lambda$34(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ReviewDetails$lambda$39$lambda$38(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetails$lambda$40(ReviewDetailsState reviewDetailsState, int i, Composer composer, int i2) {
        ReviewDetails(reviewDetailsState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendReviewComposable(final CryptoTransferSendReviewFragment.Callbacks callbacks, Modifier modifier, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo2;
        int i4;
        final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo3;
        final Modifier modifier3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<CryptoTransferSendReviewEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        final Function2<UUID, Boolean, Unit> function2;
        final SnapshotState snapshotState2;
        final Event<CryptoTransferSendReviewEvent> eventCryptoTransferSendReviewComposable$lambda$1;
        final Event<CryptoTransferSendReviewEvent> eventCryptoTransferSendReviewComposable$lambda$12;
        final Event<CryptoTransferSendReviewEvent> eventCryptoTransferSendReviewComposable$lambda$13;
        final Event<CryptoTransferSendReviewEvent> eventCryptoTransferSendReviewComposable$lambda$14;
        final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoTransferSendReviewEvent> eventConsumerInvoke;
        EventConsumer<CryptoTransferSendReviewEvent> eventConsumerInvoke2;
        EventConsumer<CryptoTransferSendReviewEvent> eventConsumerInvoke3;
        EventConsumer<CryptoTransferSendReviewEvent> eventConsumerInvoke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(619961723);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
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
                    cryptoTransferSendReviewDuxo2 = cryptoTransferSendReviewDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTransferSendReviewDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoTransferSendReviewDuxo2 = cryptoTransferSendReviewDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTransferSendReviewDuxo2 = cryptoTransferSendReviewDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSendReviewDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo5 = (CryptoTransferSendReviewDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoTransferSendReviewDuxo3 = cryptoTransferSendReviewDuxo5;
                    } else {
                        i4 = i3;
                        cryptoTransferSendReviewDuxo3 = cryptoTransferSendReviewDuxo2;
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoTransferSendReviewDuxo3 = cryptoTransferSendReviewDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(619961723, i4, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable (CryptoTransferSendReviewComposable.kt:59)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendReviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<CryptoTransferSendReviewEvent>> eventFlow = cryptoTransferSendReviewDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendReviewComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSendReviewEvent) {
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
                Event<CryptoTransferSendReviewEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoTransferSendReviewEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTransferSendReviewDuxo3) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$9$lambda$8(cryptoTransferSendReviewDuxo3, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoTransferSendReviewDuxo3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$11$lambda$10(cryptoTransferSendReviewDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, function0, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo6 = cryptoTransferSendReviewDuxo3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, CryptoTransferSendReviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingScreen(), null, CryptoTransferSendReviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(980494694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt.CryptoTransferSendReviewComposable.1
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
                            ComposerKt.traceEventStart(980494694, i7, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous> (CryptoTransferSendReviewComposable.kt:87)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1045528219, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, navigator, context, current2, userInteractionEventDescriptor, cryptoTransferSendReviewDuxo6, snapshotState3, snapshotState), composer2, 54);
                        final SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-32931762, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt.CryptoTransferSendReviewComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-32931762, i8, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous>.<anonymous> (CryptoTransferSendReviewComposable.kt:90)");
                                }
                                CryptoTransferSendReviewComposable3.ReviewDetails(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(snapshotState4).getReviewDetailsState(), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3456, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTransferSendReviewComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                        final /* synthetic */ CryptoTransferSendReviewDuxo $duxo;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ SnapshotState<Boolean> $shouldShowWarningSheetOnSubmission$delegate;
                        final /* synthetic */ SnapshotState<Boolean> $showWarningBottomSheet$delegate;
                        final /* synthetic */ SnapshotState4<CryptoTransferSendReviewViewState> $viewState$delegate;

                        AnonymousClass1(SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4, Navigator navigator, Context context, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
                            this.$viewState$delegate = snapshotState4;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$eventLogger = eventLogger;
                            this.$descriptor = userInteractionEventDescriptor;
                            this.$duxo = cryptoTransferSendReviewDuxo;
                            this.$shouldShowWarningSheetOnSubmission$delegate = snapshotState;
                            this.$showWarningBottomSheet$delegate = snapshotState2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1045528219, i, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous>.<anonymous> (CryptoTransferSendReviewComposable.kt:93)");
                            }
                            final String strStringResource = StringResources_androidKt.stringResource(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getDisclosureUrl(), composer, 0);
                            final String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_disclosures, composer, 0);
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            String string2 = StringResource2.getString(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getHelperText(), composer, StringResource.$stable);
                            String strStringResource3 = StringResources_androidKt.stringResource(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getSubmitButtonText(), composer, 0);
                            boolean zIsLoading = CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).isLoading();
                            boolean zIsSubmitButtonEnabled = CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).isSubmitButtonEnabled();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(strStringResource) | composer.changed(strStringResource2);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            final SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTransferSendReviewComposable3.C383801.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context, strStringResource, strStringResource2, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changedInstance(this.$duxo);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                            final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo = this.$duxo;
                            final SnapshotState<Boolean> snapshotState = this.$shouldShowWarningSheetOnSubmission$delegate;
                            final SnapshotState<Boolean> snapshotState2 = this.$showWarningBottomSheet$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTransferSendReviewComposable3.C383801.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, cryptoTransferSendReviewDuxo, snapshotState, snapshotState2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, string2, strStringResource2, false, function0, null, (Function0) objRememberedValue2, strStringResource3, zIsLoading, null, zIsSubmitButtonEnabled, null, null, false, null, false, composer, 0, 0, 64040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String str, String str2, SnapshotState4 snapshotState4) {
                            if (CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(snapshotState4).isSubmitButtonEnabled()) {
                                Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(str, str2), null, false, null, null, 60, null);
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SUBMIT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                            if (CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$3(snapshotState)) {
                                CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$7(snapshotState2, true);
                            } else {
                                cryptoTransferSendReviewDuxo.challengeWithSuvOrPass();
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(-1217134797);
                if (CryptoTransferSendReviewComposable$lambda$6(snapshotState)) {
                    function2 = function2RememberSuvLauncher;
                    snapshotState2 = snapshotState3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$13$lambda$12(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function02 = (Function0) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$15$lambda$14((SheetValue) obj));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = function2RememberSuvLauncher;
                    snapshotState2 = snapshotState3;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue7, composerStartRestartGroup, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-1087915089, true, new C383814(callbacks, cryptoTransferSendReviewDuxo6, snapshotState4CollectAsStateWithLifecycle, snapshotState3), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 54);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoTransferSendReviewComposable$lambda$1 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSendReviewComposable$lambda$1 != null) {
                    if ((eventCryptoTransferSendReviewComposable$lambda$1.getData() instanceof CryptoTransferSendReviewEvent.CompletedWithdrawal) && (eventConsumerInvoke4 = eventCryptoTransferSendReviewComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke4.consume(eventCryptoTransferSendReviewComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25139invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25139invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                callbacks.onSentSuccessfully(((CryptoTransferSendReviewEvent.CompletedWithdrawal) eventCryptoTransferSendReviewComposable$lambda$1.getData()).getWithdrawal());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                eventCryptoTransferSendReviewComposable$lambda$12 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSendReviewComposable$lambda$12 != null) {
                    if ((eventCryptoTransferSendReviewComposable$lambda$12.getData() instanceof CryptoTransferSendReviewEvent.MustShowWarningSheet) && (eventConsumerInvoke3 = eventCryptoTransferSendReviewComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(eventCryptoTransferSendReviewComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25140invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25140invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$4(snapshotState2, true);
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity = (Activity) objConsume;
                eventCryptoTransferSendReviewComposable$lambda$13 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSendReviewComposable$lambda$13 != null) {
                    if ((eventCryptoTransferSendReviewComposable$lambda$13.getData() instanceof CryptoTransferSendReviewEvent.InputError) && (eventConsumerInvoke2 = eventCryptoTransferSendReviewComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventCryptoTransferSendReviewComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25141invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25141invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoTransferSendReviewEvent.InputError inputError = (CryptoTransferSendReviewEvent.InputError) eventCryptoTransferSendReviewComposable$lambda$13.getData();
                                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(inputError.getThrowable());
                                ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
                                CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, activity, inputError.getThrowable(), null, (errorResponse3 != null ? errorResponse3.getError_code() : null) == ErrorResponse3.ErrorCode.INVALID_OR_EXPIRED_FEE_TOKEN ? Integer.valueOf(C37934R.string.crypt_send_review_expiry_start_over) : null, null, null, false, 116, null);
                            }
                        });
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                eventCryptoTransferSendReviewComposable$lambda$14 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSendReviewComposable$lambda$14 != null) {
                    if ((eventCryptoTransferSendReviewComposable$lambda$14.getData() instanceof CryptoTransferSendReviewEvent.StartSuv) && (eventConsumerInvoke = eventCryptoTransferSendReviewComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoTransferSendReviewComposable$lambda$14, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25142invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25142invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoTransferSendReviewEvent.StartSuv startSuv = (CryptoTransferSendReviewEvent.StartSuv) eventCryptoTransferSendReviewComposable$lambda$14.getData();
                                function2.invoke(startSuv.getWorkflowId(), Boolean.valueOf(startSuv.isMigrated()));
                            }
                        });
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoTransferSendReviewDuxo4 = cryptoTransferSendReviewDuxo6;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTransferSendReviewDuxo4 = cryptoTransferSendReviewDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$20(callbacks, modifier4, cryptoTransferSendReviewDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                modifier3 = modifier5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendReviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoTransferSendReviewDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendReviewComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSendReviewEvent) {
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
                Event<CryptoTransferSendReviewEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoTransferSendReviewEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState<Boolean> snapshotState32 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTransferSendReviewDuxo3) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$9$lambda$8(cryptoTransferSendReviewDuxo3, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    Function0 function03 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoTransferSendReviewDuxo3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$11$lambda$10(cryptoTransferSendReviewDuxo3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        Function2<UUID, Boolean, Unit> function2RememberSuvLauncher2 = SuvLauncher.rememberSuvLauncher(navigator2, function03, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo62 = cryptoTransferSendReviewDuxo3;
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, CryptoTransferSendReviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingScreen(), null, CryptoTransferSendReviewComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(980494694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt.CryptoTransferSendReviewComposable.1
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
                                    ComposerKt.traceEventStart(980494694, i7, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous> (CryptoTransferSendReviewComposable.kt:87)");
                                }
                                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1045528219, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, navigator2, context2, current22, userInteractionEventDescriptor2, cryptoTransferSendReviewDuxo62, snapshotState32, snapshotState), composer2, 54);
                                final SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-32931762, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt.CryptoTransferSendReviewComposable.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                        invoke(boxScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-32931762, i8, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous>.<anonymous> (CryptoTransferSendReviewComposable.kt:90)");
                                        }
                                        CryptoTransferSendReviewComposable3.ReviewDetails(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(snapshotState4).getReviewDetailsState(), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 3456, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoTransferSendReviewComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ UserInteractionEventDescriptor $descriptor;
                                final /* synthetic */ CryptoTransferSendReviewDuxo $duxo;
                                final /* synthetic */ EventLogger $eventLogger;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ SnapshotState<Boolean> $shouldShowWarningSheetOnSubmission$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showWarningBottomSheet$delegate;
                                final /* synthetic */ SnapshotState4<CryptoTransferSendReviewViewState> $viewState$delegate;

                                AnonymousClass1(SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4, Navigator navigator, Context context, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
                                    this.$viewState$delegate = snapshotState4;
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$eventLogger = eventLogger;
                                    this.$descriptor = userInteractionEventDescriptor;
                                    this.$duxo = cryptoTransferSendReviewDuxo;
                                    this.$shouldShowWarningSheetOnSubmission$delegate = snapshotState;
                                    this.$showWarningBottomSheet$delegate = snapshotState2;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                    invoke(bentoButtonBar3, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1045528219, i, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous>.<anonymous> (CryptoTransferSendReviewComposable.kt:93)");
                                    }
                                    final String strStringResource = StringResources_androidKt.stringResource(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getDisclosureUrl(), composer, 0);
                                    final String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_disclosures, composer, 0);
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                    String string2 = StringResource2.getString(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getHelperText(), composer, StringResource.$stable);
                                    String strStringResource3 = StringResources_androidKt.stringResource(CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getSubmitButtonText(), composer, 0);
                                    boolean zIsLoading = CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).isLoading();
                                    boolean zIsSubmitButtonEnabled = CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).isSubmitButtonEnabled();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(strStringResource) | composer.changed(strStringResource2);
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object obj = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoTransferSendReviewComposable3.C383801.AnonymousClass1.invoke$lambda$1$lambda$0(navigator, context, strStringResource, strStringResource2, snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(obj);
                                        objRememberedValue = obj;
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changedInstance(this.$duxo);
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
                                    final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo = this.$duxo;
                                    final SnapshotState snapshotState = this.$shouldShowWarningSheetOnSubmission$delegate;
                                    final SnapshotState snapshotState2 = this.$showWarningBottomSheet$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoTransferSendReviewComposable3.C383801.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, cryptoTransferSendReviewDuxo, snapshotState, snapshotState2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, string2, strStringResource2, false, function0, null, (Function0) objRememberedValue2, strStringResource3, zIsLoading, null, zIsSubmitButtonEnabled, null, null, false, null, false, composer, 0, 0, 64040);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String str, String str2, SnapshotState4 snapshotState4) {
                                    if (CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(snapshotState4).isSubmitButtonEnabled()) {
                                        Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(str, str2), null, false, null, null, 60, null);
                                    }
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
                                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SUBMIT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                                    if (CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$3(snapshotState)) {
                                        CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$7(snapshotState2, true);
                                    } else {
                                        cryptoTransferSendReviewDuxo.challengeWithSuvOrPass();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceGroup(-1217134797);
                        if (CryptoTransferSendReviewComposable$lambda$6(snapshotState)) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        eventCryptoTransferSendReviewComposable$lambda$1 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventCryptoTransferSendReviewComposable$lambda$1 != null) {
                        }
                        eventCryptoTransferSendReviewComposable$lambda$12 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventCryptoTransferSendReviewComposable$lambda$12 != null) {
                        }
                        Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                        Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                        final Activity activity2 = (Activity) objConsume2;
                        eventCryptoTransferSendReviewComposable$lambda$13 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventCryptoTransferSendReviewComposable$lambda$13 != null) {
                        }
                        eventCryptoTransferSendReviewComposable$lambda$14 = CryptoTransferSendReviewComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventCryptoTransferSendReviewComposable$lambda$14 != null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        cryptoTransferSendReviewDuxo4 = cryptoTransferSendReviewDuxo62;
                        modifier4 = modifier3;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferSendReviewComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferSendReviewComposable$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendReviewComposable$lambda$9$lambda$8(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState4 snapshotState4) {
        cryptoTransferSendReviewDuxo.submitWithdrawal(CryptoTransferSendReviewComposable$lambda$0(snapshotState4).getWithdrawalId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendReviewComposable$lambda$11$lambda$10(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo) {
        cryptoTransferSendReviewDuxo.suvNotApproved();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSendReviewViewState CryptoTransferSendReviewComposable$lambda$0(SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferSendReviewEvent> CryptoTransferSendReviewComposable$lambda$1(SnapshotState4<Event<CryptoTransferSendReviewEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferSendReviewComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CryptoTransferSendReviewComposable$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ReviewDetails$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ReviewDetails$lambda$25(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendReviewComposable$lambda$13$lambda$12(SnapshotState snapshotState) {
        CryptoTransferSendReviewComposable$lambda$7(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTransferSendReviewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$4 */
    static final class C383814 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ CryptoTransferSendReviewFragment.Callbacks $callbacks;
        final /* synthetic */ CryptoTransferSendReviewDuxo $duxo;
        final /* synthetic */ SnapshotState<Boolean> $shouldShowWarningSheetOnSubmission$delegate;
        final /* synthetic */ SnapshotState4<CryptoTransferSendReviewViewState> $viewState$delegate;

        C383814(CryptoTransferSendReviewFragment.Callbacks callbacks, CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState4<CryptoTransferSendReviewViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
            this.$callbacks = callbacks;
            this.$duxo = cryptoTransferSendReviewDuxo;
            this.$viewState$delegate = snapshotState4;
            this.$shouldShowWarningSheetOnSubmission$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1087915089, i, -1, "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposable.<anonymous> (CryptoTransferSendReviewComposable.kt:138)");
            }
            CryptoTransferSendReviewFragment.Callbacks callbacks = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(callbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CryptoTransferSendReviewComposable4(callbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            String warningSheetTitle = CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getWarningSheetTitle();
            String warningSheetBody = CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$0(this.$viewState$delegate).getWarningSheetBody();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
            final CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo = this.$duxo;
            final SnapshotState<Boolean> snapshotState = this.$shouldShowWarningSheetOnSubmission$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$CryptoTransferSendReviewComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendReviewComposable3.C383814.invoke$lambda$2$lambda$1(cryptoTransferSendReviewDuxo, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ReviewWarningSheetContent.ReviewWarningSheetContent(RhModalBottomSheet, warningSheetTitle, warningSheetBody, (Function0) objRememberedValue2, (Function0) kFunction, null, composer, RhModalBottomSheet5.$stable | (i & 14), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, SnapshotState snapshotState) {
            CryptoTransferSendReviewComposable3.CryptoTransferSendReviewComposable$lambda$4(snapshotState, false);
            cryptoTransferSendReviewDuxo.challengeWithSuvOrPass();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReviewDetails(final ReviewDetailsState reviewDetailsState, Composer composer, final int i) {
        int i2;
        int i3;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        boolean z;
        Composer composer2;
        final SnapshotState snapshotState3;
        final ReviewDetailsState reviewDetailsState2 = reviewDetailsState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-78902542);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(reviewDetailsState2) : composerStartRestartGroup.changedInstance(reviewDetailsState2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-78902542, i2, -1, "com.robinhood.shared.crypto.transfer.send.review.ReviewDetails (CryptoTransferSendReviewComposable.kt:180)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM(), 1, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            StringResource title = reviewDetailsState2.getTitle();
            int i5 = StringResource.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composerStartRestartGroup, i5), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getBookCoverCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(reviewDetailsState.getSubtitle(), composerStartRestartGroup, i5), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8184);
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_send_review_address_label, composerStartRestartGroup, 0);
            BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(reviewDetailsState.getAddress());
            int i6 = BentoBaseRowState.Meta.SingleLine.$stable;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource, null, null, singleLine, null, false, false, false, 0L, null, composerStartRestartGroup, i6 << 15, 0, 4059);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(1060008010);
            if (reviewDetailsState.getMemoVisible()) {
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_review_memo_label, composer3, 0);
                String string2 = StringResource2.getString(reviewDetailsState.getMemo(), composer3, i5);
                if (string2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, null, null, new BentoBaseRowState.Meta.SingleLine(string2), null, false, false, false, 0L, null, composer3, i6 << 15, 0, 4059);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(1060016635);
            if (reviewDetailsState.getNetworkName() == null || reviewDetailsState.getNetworkTypeName() == null) {
                i3 = 5004770;
                snapshotState = snapshotState4;
            } else {
                String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypt_send_review_network_row, composer3, 0);
                BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(reviewDetailsState.getNetworkName());
                composer3.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    snapshotState3 = snapshotState4;
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendReviewComposable3.ReviewDetails$lambda$31$lambda$28$lambda$27(snapshotState3);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotState3 = snapshotState4;
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer3.endReplaceGroup();
                int i7 = i6 << 15;
                Composer composer4 = composer3;
                i3 = 5004770;
                snapshotState = snapshotState3;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource3, null, null, singleLine2, null, false, false, false, 0L, function0, composer4, i7, 48, 2011);
                composer3 = composer4;
            }
            composer3.endReplaceGroup();
            AnnotatedString annotatedStringBuildDisplayFee = reviewDetailsState.getNetworkFeeMeta1().buildDisplayFee(composer3, 0);
            AnnotatedString annotatedStringBuildDisplayFee2 = reviewDetailsState.getNetworkFeeMeta2().buildDisplayFee(composer3, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C37934R.string.crypt_send_review_network_fee_row, composer3, 0);
            BentoBaseRowState.Meta.TwoLine twoLine = new BentoBaseRowState.Meta.TwoLine(annotatedStringBuildDisplayFee, annotatedStringBuildDisplayFee2);
            composer3.startReplaceGroup(i3);
            Object objRememberedValue4 = composer3.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                snapshotState2 = snapshotState5;
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendReviewComposable3.ReviewDetails$lambda$31$lambda$30$lambda$29(snapshotState2);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue4);
            } else {
                snapshotState2 = snapshotState5;
            }
            composer3.endReplaceGroup();
            int i8 = BentoBaseRowState.Meta.TwoLine.$stable;
            final SnapshotState snapshotState6 = snapshotState2;
            Composer composer5 = composer3;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource4, null, null, twoLine, null, false, false, false, 0L, (Function0) objRememberedValue4, composer5, i8 << 15, 48, 2011);
            Composer composer6 = composer5;
            composer6.startReplaceGroup(1060040721);
            if (reviewDetailsState.getTotalFeesRowVisible()) {
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C37934R.string.crypt_send_review_total_row_label, composer6, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_send_review_total_secondary_text, composer6, 0), null, new BentoBaseRowState.Meta.TwoLine(reviewDetailsState.getTotalMeta1(), reviewDetailsState.getTotalMeta2()), null, false, false, false, 0L, null, composer6, i8 << 15, 0, 4051);
                composer6 = composer6;
            }
            composer6.endReplaceGroup();
            composer6.endNode();
            composer6.startReplaceGroup(1484150374);
            if (ReviewDetails$lambda$22(snapshotState)) {
                composer6.startReplaceGroup(i3);
                Object objRememberedValue5 = composer6.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendReviewComposable3.ReviewDetails$lambda$33$lambda$32(snapshotState);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue5);
                }
                Function0 function02 = (Function0) objRememberedValue5;
                composer6.endReplaceGroup();
                composer6.startReplaceGroup(1849434622);
                Object objRememberedValue6 = composer6.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(CryptoTransferSendReviewComposable3.ReviewDetails$lambda$35$lambda$34((SheetValue) obj));
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue6);
                }
                composer6.endReplaceGroup();
                z = true;
                reviewDetailsState2 = reviewDetailsState;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue6, composer6, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-366436826, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt.ReviewDetails.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer7, Integer num) {
                        invoke(rhModalBottomSheet5, composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer7, int i9) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i9 & 6) == 0) {
                            i9 |= (i9 & 8) == 0 ? composer7.changed(RhModalBottomSheet) : composer7.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i9 & 19) == 18 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-366436826, i9, -1, "com.robinhood.shared.crypto.transfer.send.review.ReviewDetails.<anonymous> (CryptoTransferSendReviewComposable.kt:244)");
                        }
                        String currencyCode = reviewDetailsState.getCurrencyCode();
                        String networkName = reviewDetailsState.getNetworkName();
                        if (networkName == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String networkTypeName = reviewDetailsState.getNetworkTypeName();
                        if (networkTypeName == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        NetworkForTransferSheetContent.NetworkForTransferSheetContent(RhModalBottomSheet, currencyCode, networkName, networkTypeName, null, composer7, RhModalBottomSheet5.$stable | (i9 & 14), 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer6, 54), composer6, 1572870, 54);
            } else {
                z = true;
                reviewDetailsState2 = reviewDetailsState;
            }
            composer6.endReplaceGroup();
            if (ReviewDetails$lambda$25(snapshotState6)) {
                composer6.startReplaceGroup(i3);
                Object objRememberedValue7 = composer6.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendReviewComposable3.ReviewDetails$lambda$37$lambda$36(snapshotState6);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue7);
                }
                Function0 function03 = (Function0) objRememberedValue7;
                composer6.endReplaceGroup();
                composer6.startReplaceGroup(1849434622);
                Object objRememberedValue8 = composer6.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(CryptoTransferSendReviewComposable3.ReviewDetails$lambda$39$lambda$38((SheetValue) obj));
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue8);
                }
                composer6.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function03, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(z, (Function1) objRememberedValue8, composer6, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(1230129117, z, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt.ReviewDetails.7
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer7, Integer num) {
                        invoke(rhModalBottomSheet5, composer7, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer7, int i9) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i9 & 6) == 0) {
                            i9 |= (i9 & 8) == 0 ? composer7.changed(RhModalBottomSheet) : composer7.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i9 & 19) == 18 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1230129117, i9, -1, "com.robinhood.shared.crypto.transfer.send.review.ReviewDetails.<anonymous> (CryptoTransferSendReviewComposable.kt:260)");
                        }
                        SendNetworkFeeSheetContent2.NetworkFeeSheetContent(RhModalBottomSheet, reviewDetailsState2.getNetworkFeeSheetContentState(), null, composer7, RhModalBottomSheet5.$stable | (i9 & 14), 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer6, 54), composer6, 1572870, 54);
            }
            composer2 = composer6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReviewComposable3.ReviewDetails$lambda$40(reviewDetailsState2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ReviewDetails$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void ReviewDetails$lambda$26(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetails$lambda$31$lambda$28$lambda$27(SnapshotState snapshotState) {
        ReviewDetails$lambda$23(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetails$lambda$31$lambda$30$lambda$29(SnapshotState snapshotState) {
        ReviewDetails$lambda$26(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetails$lambda$33$lambda$32(SnapshotState snapshotState) {
        ReviewDetails$lambda$23(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewDetails$lambda$37$lambda$36(SnapshotState snapshotState) {
        ReviewDetails$lambda$26(snapshotState, false);
        return Unit.INSTANCE;
    }

    public static final void PreviewReviewDetails(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(105887821);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105887821, i, -1, "com.robinhood.shared.crypto.transfer.send.review.PreviewReviewDetails (CryptoTransferSendReviewComposable.kt:284)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoTransferSendReviewComposable.INSTANCE.getLambda$1725464469$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReviewComposable3.PreviewReviewDetails$lambda$41(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
