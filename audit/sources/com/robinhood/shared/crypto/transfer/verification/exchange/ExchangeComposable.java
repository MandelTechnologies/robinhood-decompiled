package com.robinhood.shared.crypto.transfer.verification.exchange;

import android.app.Activity;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposable;
import com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo4;
import com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeViewState;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ExchangeComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001aU\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u008a\u0084\u0002"}, m3636d2 = {"ExchangeComposable", "", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "onVaspConfirmed", "Lkotlin/Function2;", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo;", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo;Landroidx/compose/runtime/Composer;II)V", "ExchangeScreen", "viewState", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState;", "onQueryChange", "Lkotlin/Function1;", "", "onVaspSelected", "onContinueButtonClicked", "Lkotlin/Function0;", "(Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ExchangeComposable {

    /* compiled from: ExchangeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExchangeComposable$lambda$5(UUID uuid, VerificationType verificationType, Function2 function2, Modifier modifier, ExchangeDuxo exchangeDuxo, int i, int i2, Composer composer, int i3) {
        ExchangeComposable(uuid, verificationType, function2, modifier, exchangeDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExchangeScreen$lambda$7(ExchangeViewState exchangeViewState, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExchangeScreen(exchangeViewState, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f2 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExchangeComposable(final UUID verificationId, final VerificationType verificationType, final Function2<? super ApiCryptoVaspResponse.Vasp, ? super ApiCryptoVerificationResponse, Unit> onVaspConfirmed, Modifier modifier, ExchangeDuxo exchangeDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ExchangeDuxo exchangeDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        ExchangeDuxo exchangeDuxo3;
        Object objRememberedValue;
        final CryptoTransferErrorHandler cryptoTransferErrorHandler;
        int i4;
        Screen.Name name;
        final Event<ExchangeDuxo4> eventExchangeComposable$lambda$1;
        final Event<ExchangeDuxo4> eventExchangeComposable$lambda$12;
        final Modifier modifier4;
        final ExchangeDuxo exchangeDuxo4;
        EventConsumer<ExchangeDuxo4> eventConsumerInvoke;
        EventConsumer<ExchangeDuxo4> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(onVaspConfirmed, "onVaspConfirmed");
        Composer composerStartRestartGroup = composer.startRestartGroup(326357336);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(verificationId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(verificationType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onVaspConfirmed) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    exchangeDuxo2 = exchangeDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(exchangeDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    exchangeDuxo2 = exchangeDuxo;
                }
                i3 |= i6;
            } else {
                exchangeDuxo2 = exchangeDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ExchangeDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -57345;
                        exchangeDuxo3 = (ExchangeDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(326357336, i3, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposable (ExchangeComposable.kt:53)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(exchangeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(exchangeDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) objConsume;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CryptoTransferErrorHandler cryptoTransferErrorHandler2 = new CryptoTransferErrorHandler(activity, null, null, null, null, false, 48, null);
                        composerStartRestartGroup.updateRememberedValue(cryptoTransferErrorHandler2);
                        objRememberedValue = cryptoTransferErrorHandler2;
                    }
                    cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    i4 = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
                    if (i4 == 1 && i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    name = Screen.Name.CRYPTO_TRANSFER_SEND_EXCHANGE;
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-467381437, true, new C385361(modifier5, exchangeDuxo3, snapshotState4CollectAsStateWithLifecycle, verificationId, verificationType), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    eventExchangeComposable$lambda$1 = ExchangeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventExchangeComposable$lambda$1 != null && (eventExchangeComposable$lambda$1.getData() instanceof ExchangeDuxo4.Success) && (eventConsumerInvoke2 = eventExchangeComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventExchangeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25197invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25197invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                ExchangeDuxo4.Success success = (ExchangeDuxo4.Success) eventExchangeComposable$lambda$1.getData();
                                onVaspConfirmed.invoke(success.getSelection(), success.getNext());
                            }
                        });
                    }
                    eventExchangeComposable$lambda$12 = ExchangeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventExchangeComposable$lambda$12 != null && (eventExchangeComposable$lambda$12.getData() instanceof ExchangeDuxo4.Error) && (eventConsumerInvoke = eventExchangeComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventExchangeComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25198invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25198invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((ExchangeDuxo4.Error) eventExchangeComposable$lambda$12.getData()).getThrowable(), false, 2, null);
                            }
                        });
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    exchangeDuxo4 = exchangeDuxo3;
                }
                exchangeDuxo3 = exchangeDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(exchangeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(exchangeDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                i4 = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
                if (i4 == 1) {
                    name = Screen.Name.CRYPTO_TRANSFER_SEND_EXCHANGE;
                } else {
                    name = Screen.Name.CRYPTO_TRANSFER_SEND_EXCHANGE;
                }
                Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-467381437, true, new C385361(modifier52, exchangeDuxo3, snapshotState4CollectAsStateWithLifecycle3, verificationId, verificationType), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventExchangeComposable$lambda$1 = ExchangeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventExchangeComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventExchangeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25197invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25197invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ExchangeDuxo4.Success success = (ExchangeDuxo4.Success) eventExchangeComposable$lambda$1.getData();
                            onVaspConfirmed.invoke(success.getSelection(), success.getNext());
                        }
                    });
                }
                eventExchangeComposable$lambda$12 = ExchangeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventExchangeComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventExchangeComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25198invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25198invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((ExchangeDuxo4.Error) eventExchangeComposable$lambda$12.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                exchangeDuxo4 = exchangeDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                exchangeDuxo4 = exchangeDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExchangeComposable.ExchangeComposable$lambda$5(verificationId, verificationType, onVaspConfirmed, modifier4, exchangeDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                    exchangeDuxo3 = exchangeDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(exchangeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(exchangeDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object objConsume22 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                Activity activity22 = (Activity) objConsume22;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                i4 = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
                if (i4 == 1) {
                }
                Modifier modifier522 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor22, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-467381437, true, new C385361(modifier522, exchangeDuxo3, snapshotState4CollectAsStateWithLifecycle32, verificationId, verificationType), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                eventExchangeComposable$lambda$1 = ExchangeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventExchangeComposable$lambda$1 != null) {
                }
                eventExchangeComposable$lambda$12 = ExchangeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventExchangeComposable$lambda$12 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
                exchangeDuxo4 = exchangeDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ExchangeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$1 */
    static final class C385361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ExchangeDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;
        final /* synthetic */ SnapshotState4<ExchangeViewState> $viewState$delegate;

        C385361(Modifier modifier, ExchangeDuxo exchangeDuxo, SnapshotState4<ExchangeViewState> snapshotState4, UUID uuid, VerificationType verificationType) {
            this.$modifier = modifier;
            this.$duxo = exchangeDuxo;
            this.$viewState$delegate = snapshotState4;
            this.$verificationId = uuid;
            this.$verificationType = verificationType;
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
                ComposerKt.traceEventStart(-467381437, i, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposable.<anonymous> (ExchangeComposable.kt:76)");
            }
            ExchangeViewState exchangeViewStateExchangeComposable$lambda$0 = ExchangeComposable.ExchangeComposable$lambda$0(this.$viewState$delegate);
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            ExchangeDuxo exchangeDuxo = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(exchangeDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ExchangeComposable2(exchangeDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changed(this.$viewState$delegate);
            final ExchangeDuxo exchangeDuxo2 = this.$duxo;
            final SnapshotState4<ExchangeViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ExchangeComposable.C385361.invoke$lambda$2$lambda$1(exchangeDuxo2, snapshotState4, (ApiCryptoVaspResponse.Vasp) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$verificationId) | composer.changed(this.$verificationType.ordinal()) | composer.changed(this.$viewState$delegate);
            final ExchangeDuxo exchangeDuxo3 = this.$duxo;
            final UUID uuid = this.$verificationId;
            final VerificationType verificationType = this.$verificationType;
            final SnapshotState4<ExchangeViewState> snapshotState42 = this.$viewState$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExchangeComposable.C385361.invoke$lambda$4$lambda$3(exchangeDuxo3, uuid, verificationType, snapshotState42);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ExchangeComposable.ExchangeScreen(exchangeViewStateExchangeComposable$lambda$0, function1, function12, (Function0) objRememberedValue3, modifierLogScreenTransitions$default, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(ExchangeDuxo exchangeDuxo, SnapshotState4 snapshotState4, ApiCryptoVaspResponse.Vasp it) {
            Intrinsics.checkNotNullParameter(it, "it");
            exchangeDuxo.onVaspSelected(ExchangeComposable.ExchangeComposable$lambda$0(snapshotState4).getSelection(), it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(ExchangeDuxo exchangeDuxo, UUID uuid, VerificationType verificationType, SnapshotState4 snapshotState4) {
            ApiCryptoVaspResponse.Vasp selection = ExchangeComposable.ExchangeComposable$lambda$0(snapshotState4).getSelection();
            if (selection != null) {
                exchangeDuxo.submit(uuid, verificationType, selection);
                return Unit.INSTANCE;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExchangeViewState ExchangeComposable$lambda$0(SnapshotState4<ExchangeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<ExchangeDuxo4> ExchangeComposable$lambda$1(SnapshotState4<Event<ExchangeDuxo4>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExchangeScreen(final ExchangeViewState exchangeViewState, final Function1<? super String, Unit> function1, final Function1<? super ApiCryptoVaspResponse.Vasp, Unit> function12, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-796153033);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(exchangeViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-796153033, i3, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeScreen (ExchangeComposable.kt:112)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier3, false, ComposableLambda3.rememberComposableLambda(1580214380, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt.ExchangeScreen.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        int i6;
                        CryptoTransferContext crypto_transfer_context;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoButtonBarScreenLayout) : composer2.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1580214380, i6, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeScreen.<anonymous> (ExchangeComposable.kt:165)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        CryptoTransferContext cryptoTransferContextCopy = null;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                        Context context = userInteractionEventDescriptor.getContext();
                        if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                            cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : exchangeViewState.getQuery(), (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                        }
                        BentoButtonBarScreenLayout.PrimaryButtonOnly(ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null), null, function0, StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer2, 0), exchangeViewState.getLoading(), null, exchangeViewState.getEnabled(), composer2, (BentoButtonBar3.$stable << 21) | ((i6 << 21) & 29360128), 34);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2041626081, true, new C385382(exchangeViewState, function1, function12, (FocusRequester) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExchangeComposable.ExchangeScreen$lambda$7(exchangeViewState, function1, function12, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier3, false, ComposableLambda3.rememberComposableLambda(1580214380, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt.ExchangeScreen.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    int i6;
                    CryptoTransferContext crypto_transfer_context;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoButtonBarScreenLayout) : composer2.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1580214380, i6, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeScreen.<anonymous> (ExchangeComposable.kt:165)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    CryptoTransferContext cryptoTransferContextCopy = null;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                    Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                    Context context = userInteractionEventDescriptor.getContext();
                    if (context != null && (crypto_transfer_context = context.getCrypto_transfer_context()) != null) {
                        cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : exchangeViewState.getQuery(), (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : null, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                    }
                    BentoButtonBarScreenLayout.PrimaryButtonOnly(ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 110, null), null, function0, StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer2, 0), exchangeViewState.getLoading(), null, exchangeViewState.getEnabled(), composer2, (BentoButtonBar3.$stable << 21) | ((i6 << 21) & 29360128), 34);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2041626081, true, new C385382(exchangeViewState, function1, function12, (FocusRequester) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ExchangeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2 */
    static final class C385382 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ Function1<String, Unit> $onQueryChange;
        final /* synthetic */ Function1<ApiCryptoVaspResponse.Vasp, Unit> $onVaspSelected;
        final /* synthetic */ ExchangeViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C385382(ExchangeViewState exchangeViewState, Function1<? super String, Unit> function1, Function1<? super ApiCryptoVaspResponse.Vasp, Unit> function12, FocusRequester focusRequester) {
            this.$viewState = exchangeViewState;
            this.$onQueryChange = function1;
            this.$onVaspSelected = function12;
            this.$focusRequester = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2041626081, i, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeScreen.<anonymous> (ExchangeComposable.kt:117)");
            }
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changed(this.$onQueryChange) | composer.changed(this.$onVaspSelected);
            final ExchangeViewState exchangeViewState = this.$viewState;
            final FocusRequester focusRequester = this.$focusRequester;
            final Function1<String, Unit> function1 = this.$onQueryChange;
            final Function1<ApiCryptoVaspResponse.Vasp, Unit> function12 = this.$onVaspSelected;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ExchangeComposable.C385382.invoke$lambda$3$lambda$2(exchangeViewState, focusRequester, function1, function12, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ExchangeViewState exchangeViewState, FocusRequester focusRequester, Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-256249664, true, new ExchangeComposable3(focusRequester, exchangeViewState, function1)), 3, null);
            final ImmutableList<ExchangeViewState.Row> results = exchangeViewState.getResults();
            final C38532x9373805e c38532x9373805e = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$invoke$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ExchangeViewState.Row row) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ExchangeViewState.Row) obj);
                }
            };
            LazyColumn.items(results.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$invoke$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c38532x9373805e.invoke(results.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$invoke$lambda$3$lambda$2$$inlined$items$default$4
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
                    final ExchangeViewState.Row row = (ExchangeViewState.Row) results.get(i);
                    composer.startReplaceGroup(746274950);
                    final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    if (row instanceof ExchangeViewState.Row.Empty) {
                        composer.startReplaceGroup(-391564441);
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C37934R.string.withdrawal_exchange_empty, composer, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, BentoBaseRowState.$stable << 3, 125);
                        composer.endReplaceGroup();
                    } else {
                        if (!(row instanceof ExchangeViewState.Row.Vasp)) {
                            composer.startReplaceGroup(-391566286);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-391555365);
                        BentoBaseRowState bentoBaseRowState = ((ExchangeViewState.Row.Vasp) row).getBentoBaseRowState();
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(function12) | composer.changedInstance(row) | composer.changed(softwareKeyboardController);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function13 = function12;
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$1$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function13.invoke(((ExchangeViewState.Row.Vasp) row).getVasp());
                                    SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                                    if (softwareKeyboardController2 != null) {
                                        softwareKeyboardController2.hide();
                                    }
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.$stable << 3, 61);
                        composer.endReplaceGroup();
                    }
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
