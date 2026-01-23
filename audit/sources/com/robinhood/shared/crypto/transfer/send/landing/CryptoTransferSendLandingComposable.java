package com.robinhood.shared.crypto.transfer.send.landing;

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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
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
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposable;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingDuxo;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingEvent;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingViewState;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFailedComposable3;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedPendingComposable3;
import com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitBottomSheetContent;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent;
import com.robinhood.shared.crypto.transfer.util.LandingErrorComposable3;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoTransferSendLandingComposable.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a×\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\r2d\u0010\u000f\u001a`\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\u0012\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferSendLandingComposable", "", "currencyPairId", "Ljava/util/UUID;", "loggingSessionId", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "useSavedAddressesFlow", "", "showTipsSheet", "onTipsSheetDismissed", "Lkotlin/Function0;", "onSetupTwoFactorClicked", "Lkotlin/Function2;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "onAddressScanned", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", PlaceTypes.ADDRESS, "", "maxAddressLength", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "submitWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "addressTagConfig", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/transfer/CryptoTransferAction;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent;", "higherLimitSheetState", "Lcom/robinhood/shared/crypto/transfer/send/landing/HigherLimitSheetState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendLandingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferSendLandingComposable$lambda$10$lambda$6$lambda$5(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendLandingComposable$lambda$13(UUID uuid, UUID uuid2, CryptoTransferAction cryptoTransferAction, boolean z, boolean z2, Function0 function0, Function2 function2, Function4 function4, Modifier modifier, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendLandingComposable(uuid, uuid2, cryptoTransferAction, z, z2, function0, function2, function4, modifier, cryptoTransferSendLandingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendLandingComposable(final UUID currencyPairId, final UUID loggingSessionId, final CryptoTransferAction action, final boolean z, final boolean z2, final Function0<Unit> onTipsSheetDismissed, final Function2<? super ApiCryptoTransferConfig.TransferStates.EnrollmentState, ? super CryptoTransferAction, Unit> onSetupTwoFactorClicked, final Function4<? super String, ? super Integer, ? super CryptoTransferConfig.TransferWarnings.Stage.Warning, ? super CryptoTransferConfig.TransferAddressTag, Unit> onAddressScanned, Modifier modifier, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo2;
        CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo3;
        Composer composer2;
        Object objRememberedValue;
        Composer.Companion companion;
        CryptoTransferSendLandingViewState cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0;
        int i5;
        Activity activity;
        Modifier modifier3;
        CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo4;
        final HigherLimitSheetState higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3;
        final Event<CryptoTransferSendLandingEvent> eventCryptoTransferSendLandingComposable$lambda$1;
        final CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo5;
        final Modifier modifier4;
        EventConsumer<CryptoTransferSendLandingEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onTipsSheetDismissed, "onTipsSheetDismissed");
        Intrinsics.checkNotNullParameter(onSetupTwoFactorClicked, "onSetupTwoFactorClicked");
        Intrinsics.checkNotNullParameter(onAddressScanned, "onAddressScanned");
        Composer composerStartRestartGroup = composer.startRestartGroup(212894217);
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
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTipsSheetDismissed) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSetupTwoFactorClicked) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAddressScanned) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    if ((i2 & 512) == 0) {
                        cryptoTransferSendLandingDuxo2 = cryptoTransferSendLandingDuxo;
                        int i6 = composerStartRestartGroup.changedInstance(cryptoTransferSendLandingDuxo2) ? 536870912 : 268435456;
                        i3 |= i6;
                    } else {
                        cryptoTransferSendLandingDuxo2 = cryptoTransferSendLandingDuxo;
                    }
                    i3 |= i6;
                } else {
                    cryptoTransferSendLandingDuxo2 = cryptoTransferSendLandingDuxo;
                }
                if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    cryptoTransferSendLandingDuxo5 = cryptoTransferSendLandingDuxo2;
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 512) == 0) {
                            CryptoTransferSendLandingDuxo.InitArgs initArgs = new CryptoTransferSendLandingDuxo.InitArgs(loggingSessionId, currencyPairId, action, z);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            modifier = modifier5;
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSendLandingDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$duxo$1.1
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
                            cryptoTransferSendLandingDuxo3 = (CryptoTransferSendLandingDuxo) baseDuxo;
                            i3 &= -1879048193;
                        } else {
                            modifier = modifier5;
                            cryptoTransferSendLandingDuxo3 = cryptoTransferSendLandingDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 512) != 0) {
                            i3 &= -1879048193;
                        }
                        cryptoTransferSendLandingDuxo3 = cryptoTransferSendLandingDuxo2;
                    }
                    Modifier modifier6 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(212894217, i3, -1, "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposable (CryptoTransferSendLandingComposable.kt:67)");
                    }
                    Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendLandingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composer2 = composerStartRestartGroup;
                    final StateFlow<Event<CryptoTransferSendLandingEvent>> eventFlow = cryptoTransferSendLandingDuxo3.getEventFlow();
                    CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo6 = cryptoTransferSendLandingDuxo3;
                    composer2.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendLandingComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoTransferSendLandingEvent) {
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
                    Event<CryptoTransferSendLandingEvent> value = eventFlow.getValue();
                    Event<CryptoTransferSendLandingEvent> event = value;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, !((event == null ? event.getData() : null) instanceof CryptoTransferSendLandingEvent) ? value : null, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0 = CryptoTransferSendLandingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (!(cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0 instanceof CryptoTransferSendLandingViewState.Loading)) {
                        composer2.startReplaceGroup(-1333773590);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(modifier6, null, false, false, composer2, (i3 >> 24) & 14, 14);
                        composer2.endReplaceGroup();
                        activity = activity2;
                        modifier3 = modifier6;
                        i5 = 0;
                    } else if (cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0 instanceof CryptoTransferSendLandingViewState.SecuritySetupRequired) {
                        composer2.startReplaceGroup(-1333604981);
                        modifier3 = modifier6;
                        i5 = 0;
                        CryptoTransferUnifiedMfaRequiredComposable.CryptoTransferUnifiedMfaRequiredComposable(CryptoTransferAction.SEND, ((CryptoTransferSendLandingViewState.SecuritySetupRequired) cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0).getEnrollmentState(), onSetupTwoFactorClicked, modifier3, composer2, ((i3 >> 15) & 7168) | ((i3 >> 12) & 896) | 6, 0);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                        activity = activity2;
                    } else {
                        i5 = 0;
                        if (Intrinsics.areEqual(cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0, CryptoTransferSendLandingViewState.PendingEnrollment.INSTANCE)) {
                            composer2.startReplaceGroup(-1333277466);
                            CryptoTransferUnifiedPendingComposable3.CryptoTransferUnifiedPendingComposable(modifier6, composer2, (i3 >> 24) & 14, 0);
                            composer2.endReplaceGroup();
                        } else if (Intrinsics.areEqual(cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0, CryptoTransferSendLandingViewState.FailedEnrollment.INSTANCE)) {
                            composer2.startReplaceGroup(-1333130681);
                            CryptoTransferUnifiedFailedComposable3.CryptoTransferUnifiedFailedComposable(modifier6, composer2, (i3 >> 24) & 14, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0 instanceof CryptoTransferSendLandingViewState.Success) {
                                composer2.startReplaceGroup(-1332944588);
                                Screen.Name name = Screen.Name.CRYPTO_TRANSFER_SEND_QR_SCANNER;
                                CryptoTransferSendLandingViewState.Success success = (CryptoTransferSendLandingViewState.Success) cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0;
                                String string2 = success.getCurrencyId().toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                Screen screen = new Screen(name, null, string2, null, 10, null);
                                String string3 = success.getCurrencyId().toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                String string4 = loggingSessionId.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(string3, string4, null, 0.0d, null, null, null, null, null, null, null, null, null, null, 16380, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null);
                                activity = activity2;
                                C383261 c383261 = new C383261(cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0, onAddressScanned, cryptoTransferSendLandingDuxo6, modifier6, z2, onTipsSheetDismissed);
                                modifier3 = modifier6;
                                cryptoTransferSendLandingDuxo4 = cryptoTransferSendLandingDuxo6;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1208815808, true, c383261, composer2, 54), composer2, 48);
                                composer2.endReplaceGroup();
                            } else {
                                activity = activity2;
                                modifier3 = modifier6;
                                cryptoTransferSendLandingDuxo4 = cryptoTransferSendLandingDuxo6;
                                if (!Intrinsics.areEqual(cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0, CryptoTransferSendLandingViewState.Error.INSTANCE)) {
                                    composer2.startReplaceGroup(-1567045926);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-1331377290);
                                LandingErrorComposable3.LandingErrorComposable(modifier3, composer2, (i3 >> 24) & 14, 0);
                                composer2.endReplaceGroup();
                            }
                            higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3 = CryptoTransferSendLandingComposable$lambda$3(snapshotState);
                            if (higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3 != null) {
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Boolean.valueOf(CryptoTransferSendLandingComposable.CryptoTransferSendLandingComposable$lambda$10$lambda$6$lambda$5((SheetValue) obj));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceGroup();
                                SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue3, composer2, 54, i5);
                                composer2.startReplaceGroup(5004770);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoTransferSendLandingComposable.CryptoTransferSendLandingComposable$lambda$10$lambda$8$lambda$7(snapshotState);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceGroup();
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(1439208064, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$2$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                                        invoke(rhModalBottomSheet5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i7) {
                                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer3.changed(RhModalBottomSheet) : composer3.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1439208064, i7, -1, "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposable.<anonymous>.<anonymous> (CryptoTransferSendLandingComposable.kt:146)");
                                        }
                                        HigherWithdrawalLimitBottomSheetContent.HigherWithdrawalLimitSheetContent(RhModalBottomSheet, StringResources6.getTextAsString(higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3.getAmountAvailableForWithdrawal(), composer3, StringResource.$stable), composer3, (i7 & 14) | RhModalBottomSheet5.$stable);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 1572870, 54);
                                Unit unit = Unit.INSTANCE;
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer2.changedInstance(cryptoTransferSendLandingDuxo4);
                                Object objRememberedValue5 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new CryptoTransferSendLandingComposable3(cryptoTransferSendLandingDuxo4, null);
                                    composer2.updateRememberedValue(objRememberedValue5);
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
                            }
                            eventCryptoTransferSendLandingComposable$lambda$1 = CryptoTransferSendLandingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                            if (eventCryptoTransferSendLandingComposable$lambda$1 != null) {
                                if ((eventCryptoTransferSendLandingComposable$lambda$1.getData() instanceof CryptoTransferSendLandingEvent) && (eventConsumerInvoke = eventCryptoTransferSendLandingComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                                    final Activity activity3 = activity;
                                    eventConsumerInvoke.consume(eventCryptoTransferSendLandingComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$consumeIfType$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            m25123invoke(obj);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m25123invoke(Object it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            CryptoTransferSendLandingEvent cryptoTransferSendLandingEvent = (CryptoTransferSendLandingEvent) eventCryptoTransferSendLandingComposable$lambda$1.getData();
                                            if (!(cryptoTransferSendLandingEvent instanceof CryptoTransferSendLandingEvent.ShowHigherLimitSheet)) {
                                                if (!(cryptoTransferSendLandingEvent instanceof CryptoTransferSendLandingEvent.Error)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                Activity activity4 = activity3;
                                                if (activity4 != null) {
                                                    CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, activity4, ((CryptoTransferSendLandingEvent.Error) cryptoTransferSendLandingEvent).getThrowable(), null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                                    return;
                                                }
                                                return;
                                            }
                                            snapshotState.setValue(new HigherLimitSheetState(((CryptoTransferSendLandingEvent.ShowHigherLimitSheet) cryptoTransferSendLandingEvent).getLimits()));
                                        }
                                    });
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Modifier modifier7 = modifier3;
                            cryptoTransferSendLandingDuxo5 = cryptoTransferSendLandingDuxo4;
                            modifier4 = modifier7;
                        }
                        activity = activity2;
                        modifier3 = modifier6;
                    }
                    cryptoTransferSendLandingDuxo4 = cryptoTransferSendLandingDuxo6;
                    higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3 = CryptoTransferSendLandingComposable$lambda$3(snapshotState);
                    if (higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3 != null) {
                    }
                    eventCryptoTransferSendLandingComposable$lambda$1 = CryptoTransferSendLandingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoTransferSendLandingComposable$lambda$1 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier72 = modifier3;
                    cryptoTransferSendLandingDuxo5 = cryptoTransferSendLandingDuxo4;
                    modifier4 = modifier72;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTransferSendLandingComposable.CryptoTransferSendLandingComposable$lambda$13(currencyPairId, loggingSessionId, action, z, z2, onTipsSheetDismissed, onSetupTwoFactorClicked, onAddressScanned, modifier4, cryptoTransferSendLandingDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 100663296;
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    Modifier modifier62 = modifier;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Activity activity22 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendLandingDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composer2 = composerStartRestartGroup;
                    final Flow eventFlow2 = cryptoTransferSendLandingDuxo3.getEventFlow();
                    CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo62 = cryptoTransferSendLandingDuxo3;
                    composer2.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendLandingComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoTransferSendLandingEvent) {
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
                    Event<CryptoTransferSendLandingEvent> value2 = eventFlow2.getValue();
                    Event<CryptoTransferSendLandingEvent> event2 = value2;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, !((event2 == null ? event2.getData() : null) instanceof CryptoTransferSendLandingEvent) ? value2 : null, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0 = CryptoTransferSendLandingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                    if (!(cryptoTransferSendLandingViewStateCryptoTransferSendLandingComposable$lambda$0 instanceof CryptoTransferSendLandingViewState.Loading)) {
                    }
                    cryptoTransferSendLandingDuxo4 = cryptoTransferSendLandingDuxo62;
                    higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3 = CryptoTransferSendLandingComposable$lambda$3(snapshotState2);
                    if (higherLimitSheetStateCryptoTransferSendLandingComposable$lambda$3 != null) {
                    }
                    eventCryptoTransferSendLandingComposable$lambda$1 = CryptoTransferSendLandingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoTransferSendLandingComposable$lambda$1 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier722 = modifier3;
                    cryptoTransferSendLandingDuxo5 = cryptoTransferSendLandingDuxo4;
                    modifier4 = modifier722;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i & 805306368) == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final CryptoTransferSendLandingViewState CryptoTransferSendLandingComposable$lambda$0(SnapshotState4<? extends CryptoTransferSendLandingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferSendLandingEvent> CryptoTransferSendLandingComposable$lambda$1(SnapshotState4<Event<CryptoTransferSendLandingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final HigherLimitSheetState CryptoTransferSendLandingComposable$lambda$3(SnapshotState<HigherLimitSheetState> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: CryptoTransferSendLandingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$1 */
    static final class C383261 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoTransferSendLandingDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function4<String, Integer, CryptoTransferConfig.TransferWarnings.Stage.Warning, CryptoTransferConfig.TransferAddressTag, Unit> $onAddressScanned;
        final /* synthetic */ Function0<Unit> $onTipsSheetDismissed;
        final /* synthetic */ boolean $showTipsSheet;
        final /* synthetic */ CryptoTransferSendLandingViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C383261(CryptoTransferSendLandingViewState cryptoTransferSendLandingViewState, Function4<? super String, ? super Integer, ? super CryptoTransferConfig.TransferWarnings.Stage.Warning, ? super CryptoTransferConfig.TransferAddressTag, Unit> function4, CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo, Modifier modifier, boolean z, Function0<Unit> function0) {
            this.$state = cryptoTransferSendLandingViewState;
            this.$onAddressScanned = function4;
            this.$duxo = cryptoTransferSendLandingDuxo;
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
        public static final Unit invoke$lambda$1$lambda$0(Function4 function4, CryptoTransferSendLandingViewState cryptoTransferSendLandingViewState, String address) {
            Intrinsics.checkNotNullParameter(address, "address");
            CryptoTransferSendLandingViewState.Success success = (CryptoTransferSendLandingViewState.Success) cryptoTransferSendLandingViewState;
            function4.invoke(address, Integer.valueOf(success.getMaxAddressLength()), success.getSubmitWarningSheet(), success.getAddressTag());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo) {
            cryptoTransferSendLandingDuxo.markInitialWarningSheetAsShown();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208815808, i, -1, "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposable.<anonymous> (CryptoTransferSendLandingComposable.kt:110)");
            }
            CryptoTransferSendLandingViewState.Success success = (CryptoTransferSendLandingViewState.Success) this.$state;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAddressScanned) | composer.changed(this.$state);
            final Function4<String, Integer, CryptoTransferConfig.TransferWarnings.Stage.Warning, CryptoTransferConfig.TransferAddressTag, Unit> function4 = this.$onAddressScanned;
            final CryptoTransferSendLandingViewState cryptoTransferSendLandingViewState = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSendLandingComposable.C383261.invoke$lambda$1$lambda$0(function4, cryptoTransferSendLandingViewState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final CryptoTransferSendLandingDuxo cryptoTransferSendLandingDuxo = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendLandingComposable.C383261.invoke$lambda$3$lambda$2(cryptoTransferSendLandingDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SendLandingSuccessComposable.SendLandingSuccessComposable(success, function1, (Function0) objRememberedValue2, this.$modifier, composer, 0, 0);
            if (this.$showTipsSheet) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(CryptoTransferSendLandingComposable.C383261.invoke$lambda$5$lambda$4((SheetValue) obj));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue3, composer, 54, 0);
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(this.$onTipsSheetDismissed);
                final Function0<Unit> function0 = this.$onTipsSheetDismissed;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt$CryptoTransferSendLandingComposable$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendLandingComposable.C383261.invoke$lambda$7$lambda$6(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                final CryptoTransferSendLandingViewState cryptoTransferSendLandingViewState2 = this.$state;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(-1066577036, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposableKt.CryptoTransferSendLandingComposable.1.5
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
                            ComposerKt.traceEventStart(-1066577036, i2, -1, "com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposable.<anonymous>.<anonymous> (CryptoTransferSendLandingComposable.kt:127)");
                        }
                        TipsSheetContent.TransferTipsSheetContent(RhModalBottomSheet, ((CryptoTransferSendLandingViewState.Success) cryptoTransferSendLandingViewState2).getTipsSheetContent(), null, composer2, RhModalBottomSheet5.$stable | (i2 & 14), 2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendLandingComposable$lambda$10$lambda$8$lambda$7(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
