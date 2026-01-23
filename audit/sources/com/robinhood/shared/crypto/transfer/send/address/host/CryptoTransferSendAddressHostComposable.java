package com.robinhood.shared.crypto.transfer.send.address.host;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable4;
import com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable3;
import com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostEvent;
import com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostViewState;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt;
import com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContent7;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.utils.p409ui.context.BaseContexts;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoTransferSendAddressHostComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferSendAddressHostComposable", "", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "loggingSessionId", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo;", "(Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostEvent;", "initialWarningSheetContent", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "protectionSheetState", "Lcom/robinhood/shared/crypto/transfer/send/address/host/ProtectionSheetState;", "showAllowlistPrimer", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendAddressHostComposable {

    /* compiled from: CryptoTransferSendAddressHostComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoTransferSendAddressHostViewState.EntryType.values().length];
            try {
                iArr[CryptoTransferSendAddressHostViewState.EntryType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoTransferSendAddressHostViewState.EntryType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoTransferSendAddressHostViewState.EntryType.SAVED_ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoTransferSendAddressHostViewState.EntryType.ALLOWLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTransferSendAddressHostComposable$lambda$21$lambda$20$lambda$19 */
    public static final boolean m2783x884b96e5(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTransferSendAddressHostComposable$lambda$26$lambda$25$lambda$24 */
    public static final boolean m2785xafbfe049(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendAddressHostComposable$lambda$28(CryptoTransferSendAddressFragment.Callbacks callbacks, UiCurrencyPair uiCurrencyPair, String str, Modifier modifier, CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendAddressHostComposable(callbacks, uiCurrencyPair, str, modifier, cryptoTransferSendAddressHostDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d6  */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.Modifier, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendAddressHostComposable(final CryptoTransferSendAddressFragment.Callbacks callbacks, final UiCurrencyPair currencyPair, final String loggingSessionId, Modifier modifier, CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo2;
        Composer composer2;
        boolean z;
        int i4;
        Modifier modifier3;
        CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo3;
        ?? r7;
        Composer composer3;
        Event<CryptoTransferSendAddressHostEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final AppCompatActivity appCompatActivityRequireActivityBaseContext;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        Modifier modifier4;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        ?? r1;
        int i6;
        final CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo4;
        Composer composer4;
        int i7;
        ProtectionSheetState protectionSheetStateCryptoTransferSendAddressHostComposable$lambda$6;
        int i8;
        boolean z2;
        final CryptoTransferConfig.TransferWarnings.Stage.Warning warningCryptoTransferSendAddressHostComposable$lambda$3;
        final Event<CryptoTransferSendAddressHostEvent> eventCryptoTransferSendAddressHostComposable$lambda$1;
        final CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo5;
        final Modifier modifier5;
        EventConsumer<CryptoTransferSendAddressHostEvent> eventConsumerInvoke;
        SnapshotState4 snapshotState4;
        Composer composer5;
        Object obj;
        int i9;
        CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-693792723);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(currencyPair) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(loggingSessionId) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoTransferSendAddressHostDuxo2 = cryptoTransferSendAddressHostDuxo;
                    int i11 = composerStartRestartGroup.changedInstance(cryptoTransferSendAddressHostDuxo2) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    cryptoTransferSendAddressHostDuxo2 = cryptoTransferSendAddressHostDuxo;
                }
                i3 |= i11;
            } else {
                cryptoTransferSendAddressHostDuxo2 = cryptoTransferSendAddressHostDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        z = false;
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSendAddressHostDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer2, 0);
                        composer2.endReplaceGroup();
                        cryptoTransferSendAddressHostDuxo2 = (CryptoTransferSendAddressHostDuxo) baseDuxo;
                        i3 &= -57345;
                    } else {
                        composer2 = composerStartRestartGroup;
                        z = false;
                    }
                    CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo7 = cryptoTransferSendAddressHostDuxo2;
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoTransferSendAddressHostDuxo3 = cryptoTransferSendAddressHostDuxo7;
                    r7 = z;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo8 = cryptoTransferSendAddressHostDuxo2;
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoTransferSendAddressHostDuxo3 = cryptoTransferSendAddressHostDuxo8;
                    composer2 = composerStartRestartGroup;
                    r7 = 0;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-693792723, i4, -1, "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposable (CryptoTransferSendAddressHostComposable.kt:40)");
                }
                int i12 = i4;
                composer3 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendAddressHostDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                final StateFlow<Event<CryptoTransferSendAddressHostEvent>> eventFlow = cryptoTransferSendAddressHostDuxo3.getEventFlow();
                composer3.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendAddressHostComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSendAddressHostEvent) {
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
                Event<CryptoTransferSendAddressHostEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoTransferSendAddressHostEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer3, 0, 0);
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue = composer3.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue2 = composer3.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue2;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState7 = (SnapshotState) objRememberedValue3;
                composer3.endReplaceGroup();
                appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                composer3.startReplaceGroup(5004770);
                objRememberedValue4 = composer3.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CryptoTransferSendAddressHostComposable.CryptoTransferSendAddressHostComposable$lambda$12$lambda$11(snapshotState6, (String) obj2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1 = (Function1) objRememberedValue4;
                composer3.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r7);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, r7);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                i5 = WhenMappings.$EnumSwitchMapping$0[CryptoTransferSendAddressHostComposable$lambda$0(snapshotState42).getEntryType().ordinal()];
                if (i5 == 1) {
                    if (i5 == 2) {
                        modifier4 = modifier3;
                        snapshotState4 = snapshotState42;
                        composer5 = composer3;
                        obj = null;
                        i9 = -1633490746;
                        cryptoTransferSendAddressHostDuxo6 = cryptoTransferSendAddressHostDuxo3;
                        composer5.startReplaceGroup(1123135987);
                        CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable(callbacks, CryptoTransferSendAddressHostComposable$lambda$0(snapshotState4).isProtectionSheetLoading(), function1, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer5, (i12 & 14) | 3456, 16);
                        composer5.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (i5 == 3) {
                        composer3.startReplaceGroup(1123540878);
                        i9 = -1633490746;
                        modifier4 = modifier3;
                        snapshotState4 = snapshotState42;
                        composer5 = composer3;
                        obj = null;
                        snapshotState5 = snapshotState5;
                        cryptoTransferSendAddressHostDuxo6 = cryptoTransferSendAddressHostDuxo3;
                        CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable(callbacks, CryptoTransferSendAddressHostComposable$lambda$0(snapshotState42).isProtectionSheetLoading(), function1, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer5, (i12 & 14) | 3456, 16);
                        composer5.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        if (i5 != 4) {
                            composer3.startReplaceGroup(2114434476);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(1123945955);
                        CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo9 = cryptoTransferSendAddressHostDuxo3;
                        int i13 = ((i12 >> 3) & 112) | 3456;
                        snapshotState = snapshotState7;
                        snapshotState3 = snapshotState6;
                        i7 = 5004770;
                        CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable(currencyPair.getId(), loggingSessionId, function1, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer3, i13, 16);
                        composer4 = composer3;
                        composer4.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        modifier4 = modifier3;
                        snapshotState2 = snapshotState5;
                        r1 = 0;
                        cryptoTransferSendAddressHostDuxo4 = cryptoTransferSendAddressHostDuxo9;
                        i6 = -1633490746;
                    }
                    cryptoTransferSendAddressHostDuxo4 = cryptoTransferSendAddressHostDuxo6;
                    snapshotState2 = snapshotState5;
                    r1 = obj;
                    snapshotState3 = snapshotState6;
                    snapshotState = snapshotState7;
                    i6 = i9;
                    i7 = 5004770;
                    composer4 = composer5;
                    snapshotState42 = snapshotState4;
                } else {
                    modifier4 = modifier3;
                    composer3.startReplaceGroup(2114436395);
                    snapshotState = snapshotState7;
                    snapshotState2 = snapshotState5;
                    snapshotState3 = snapshotState6;
                    r1 = 0;
                    i6 = -1633490746;
                    cryptoTransferSendAddressHostDuxo4 = cryptoTransferSendAddressHostDuxo3;
                    composer4 = composer3;
                    snapshotState42 = snapshotState42;
                    i7 = 5004770;
                    LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer4, 0, 15);
                    composer4.endReplaceGroup();
                    Unit unit4 = Unit.INSTANCE;
                }
                composer4.startReplaceGroup(2114477024);
                if (CryptoTransferSendAddressHostComposable$lambda$9(snapshotState)) {
                    Unit unit5 = Unit.INSTANCE;
                    composer4.startReplaceGroup(i7);
                    boolean zChangedInstance2 = composer4.changedInstance(cryptoTransferSendAddressHostDuxo4);
                    Object objRememberedValue6 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new CryptoTransferSendAddressHostComposable2(cryptoTransferSendAddressHostDuxo4, r1);
                        composer4.updateRememberedValue(objRememberedValue6);
                    }
                    composer4.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer4, 6);
                    composer4.startReplaceGroup(i6);
                    boolean zChangedInstance3 = composer4.changedInstance(cryptoTransferSendAddressHostDuxo4);
                    Object objRememberedValue7 = composer4.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAddressHostComposable.m2781x2188802c(cryptoTransferSendAddressHostDuxo4, snapshotState);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue7);
                    }
                    composer4.endReplaceGroup();
                    AllowlistPrimerComposable.AllowlistPrimerComposable((Function0) objRememberedValue7, r1, composer4, 0, 2);
                }
                composer4.endReplaceGroup();
                composer4.endNode();
                protectionSheetStateCryptoTransferSendAddressHostComposable$lambda$6 = CryptoTransferSendAddressHostComposable$lambda$6(snapshotState3);
                composer4.startReplaceGroup(-1014785547);
                if (protectionSheetStateCryptoTransferSendAddressHostComposable$lambda$6 != null) {
                    z2 = true;
                    i8 = 1849434622;
                } else {
                    composer4.startReplaceGroup(i7);
                    Object objRememberedValue8 = composer4.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAddressHostComposable.m2782x27bf878c(snapshotState3);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function0 = (Function0) objRememberedValue8;
                    composer4.endReplaceGroup();
                    i8 = 1849434622;
                    composer4.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composer4.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(CryptoTransferSendAddressHostComposable.m2783x884b96e5((SheetValue) obj2));
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue9);
                    }
                    composer4.endReplaceGroup();
                    SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue9, composer4, 54, 0);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1874706582, true, new CryptoTransferSendAddressHostComposable3(cryptoTransferSendAddressHostDuxo4, protectionSheetStateCryptoTransferSendAddressHostComposable$lambda$6, snapshotState42), composer4, 54);
                    Composer composer6 = composer4;
                    z2 = true;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, sheetStateRememberModalBottomSheetState, null, 0L, composableLambdaRememberComposableLambda, composer6, 1572870, 54);
                    composer4 = composer6;
                }
                composer4.endReplaceGroup();
                warningCryptoTransferSendAddressHostComposable$lambda$3 = CryptoTransferSendAddressHostComposable$lambda$3(snapshotState2);
                if (warningCryptoTransferSendAddressHostComposable$lambda$3 != null) {
                    composer4.startReplaceGroup(i7);
                    Object objRememberedValue10 = composer4.rememberedValue();
                    if (objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAddressHostComposable.m2784x85f67ac5(snapshotState2);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue10);
                    }
                    Function0 function02 = (Function0) objRememberedValue10;
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(i8);
                    Object objRememberedValue11 = composer4.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(CryptoTransferSendAddressHostComposable.m2785xafbfe049((SheetValue) obj2));
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue11);
                    }
                    composer4.endReplaceGroup();
                    SheetState sheetStateRememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(z2, (Function1) objRememberedValue11, composer4, 54, 0);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-406234618, z2, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$3$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer7, Integer num) {
                            invoke(rhModalBottomSheet5, composer7, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer7, int i14) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i14 & 6) == 0) {
                                i14 |= (i14 & 8) == 0 ? composer7.changed(RhModalBottomSheet) : composer7.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i14 & 19) == 18 && composer7.getSkipping()) {
                                composer7.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-406234618, i14, -1, "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposable.<anonymous>.<anonymous> (CryptoTransferSendAddressHostComposable.kt:129)");
                            }
                            WarningSheetContent7.WarningSheetContent(RhModalBottomSheet, warningCryptoTransferSendAddressHostComposable$lambda$3, null, null, composer7, RhModalBottomSheet5.$stable | 384 | (i14 & 14), 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54);
                    Composer composer7 = composer4;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, sheetStateRememberModalBottomSheetState2, null, 0L, composableLambdaRememberComposableLambda2, composer7, 1572870, 54);
                    composer4 = composer7;
                }
                eventCryptoTransferSendAddressHostComposable$lambda$1 = CryptoTransferSendAddressHostComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferSendAddressHostComposable$lambda$1 != null && (eventCryptoTransferSendAddressHostComposable$lambda$1.getData() instanceof CryptoTransferSendAddressHostEvent) && (eventConsumerInvoke = eventCryptoTransferSendAddressHostComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    final SnapshotState snapshotState8 = snapshotState;
                    final SnapshotState snapshotState9 = snapshotState2;
                    eventConsumerInvoke.consume(eventCryptoTransferSendAddressHostComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m25062invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25062invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoTransferSendAddressHostEvent cryptoTransferSendAddressHostEvent = (CryptoTransferSendAddressHostEvent) eventCryptoTransferSendAddressHostComposable$lambda$1.getData();
                            if (cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.Continue) {
                                CryptoTransferSendAddressHostEvent.Continue r12 = (CryptoTransferSendAddressHostEvent.Continue) cryptoTransferSendAddressHostEvent;
                                callbacks.onContinueWithAddress(r12.getAddress(), r12.getSupportedNetworks());
                            } else if (cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.Error) {
                                CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, appCompatActivityRequireActivityBaseContext, ((CryptoTransferSendAddressHostEvent.Error) cryptoTransferSendAddressHostEvent).getThrowable(), null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            } else {
                                if (!(cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.ShowInitialWarningSheet)) {
                                    if (cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.ShowAllowlistPrimer) {
                                        CryptoTransferSendAddressHostComposable.CryptoTransferSendAddressHostComposable$lambda$10(snapshotState8, true);
                                        return;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                snapshotState9.setValue(((CryptoTransferSendAddressHostEvent.ShowInitialWarningSheet) cryptoTransferSendAddressHostEvent).getInitialWarningSheet());
                            }
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoTransferSendAddressHostDuxo5 = cryptoTransferSendAddressHostDuxo4;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer4 = composerStartRestartGroup;
                modifier5 = modifier2;
                cryptoTransferSendAddressHostDuxo5 = cryptoTransferSendAddressHostDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoTransferSendAddressHostComposable.CryptoTransferSendAddressHostComposable$lambda$28(callbacks, currencyPair, loggingSessionId, modifier5, cryptoTransferSendAddressHostDuxo5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
            if ((i & 1) != 0) {
                if (i10 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo72 = cryptoTransferSendAddressHostDuxo2;
                i4 = i3;
                modifier3 = modifier2;
                cryptoTransferSendAddressHostDuxo3 = cryptoTransferSendAddressHostDuxo72;
                r7 = z;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = i4;
                composer3 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendAddressHostDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                final Flow eventFlow2 = cryptoTransferSendAddressHostDuxo3.getEventFlow();
                composer3.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendAddressHostComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSendAddressHostEvent) {
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
                Event<CryptoTransferSendAddressHostEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoTransferSendAddressHostEvent)) {
                }
                SnapshotState4 snapshotState422 = snapshotState4CollectAsStateWithLifecycle3;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer3, 0, 0);
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue = composer3.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState52 = (SnapshotState) objRememberedValue;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue2 = composer3.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState62 = (SnapshotState) objRememberedValue2;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1849434622);
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                SnapshotState snapshotState72 = (SnapshotState) objRememberedValue3;
                composer3.endReplaceGroup();
                appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                composer3.startReplaceGroup(5004770);
                objRememberedValue4 = composer3.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                Function1 function12 = (Function1) objRememberedValue4;
                composer3.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r7);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, r7);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composer3.getApplier() == null) {
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    i5 = WhenMappings.$EnumSwitchMapping$0[CryptoTransferSendAddressHostComposable$lambda$0(snapshotState422).getEntryType().ordinal()];
                    if (i5 == 1) {
                    }
                    composer4.startReplaceGroup(2114477024);
                    if (CryptoTransferSendAddressHostComposable$lambda$9(snapshotState)) {
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    protectionSheetStateCryptoTransferSendAddressHostComposable$lambda$6 = CryptoTransferSendAddressHostComposable$lambda$6(snapshotState3);
                    composer4.startReplaceGroup(-1014785547);
                    if (protectionSheetStateCryptoTransferSendAddressHostComposable$lambda$6 != null) {
                    }
                    composer4.endReplaceGroup();
                    warningCryptoTransferSendAddressHostComposable$lambda$3 = CryptoTransferSendAddressHostComposable$lambda$3(snapshotState2);
                    if (warningCryptoTransferSendAddressHostComposable$lambda$3 != null) {
                    }
                    eventCryptoTransferSendAddressHostComposable$lambda$1 = CryptoTransferSendAddressHostComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoTransferSendAddressHostComposable$lambda$1 != null) {
                        final SnapshotState snapshotState82 = snapshotState;
                        final SnapshotState snapshotState92 = snapshotState2;
                        eventConsumerInvoke.consume(eventCryptoTransferSendAddressHostComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m25062invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25062invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoTransferSendAddressHostEvent cryptoTransferSendAddressHostEvent = (CryptoTransferSendAddressHostEvent) eventCryptoTransferSendAddressHostComposable$lambda$1.getData();
                                if (cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.Continue) {
                                    CryptoTransferSendAddressHostEvent.Continue r12 = (CryptoTransferSendAddressHostEvent.Continue) cryptoTransferSendAddressHostEvent;
                                    callbacks.onContinueWithAddress(r12.getAddress(), r12.getSupportedNetworks());
                                } else if (cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.Error) {
                                    CryptoTransferErrorHandler.Companion.handle$default(CryptoTransferErrorHandler.INSTANCE, appCompatActivityRequireActivityBaseContext, ((CryptoTransferSendAddressHostEvent.Error) cryptoTransferSendAddressHostEvent).getThrowable(), null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                } else {
                                    if (!(cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.ShowInitialWarningSheet)) {
                                        if (cryptoTransferSendAddressHostEvent instanceof CryptoTransferSendAddressHostEvent.ShowAllowlistPrimer) {
                                            CryptoTransferSendAddressHostComposable.CryptoTransferSendAddressHostComposable$lambda$10(snapshotState82, true);
                                            return;
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    snapshotState92.setValue(((CryptoTransferSendAddressHostEvent.ShowInitialWarningSheet) cryptoTransferSendAddressHostEvent).getInitialWarningSheet());
                                }
                            }
                        });
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoTransferSendAddressHostDuxo5 = cryptoTransferSendAddressHostDuxo4;
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferSendAddressHostComposable$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendAddressHostComposable$lambda$12$lambda$11(SnapshotState snapshotState, String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        snapshotState.setValue(new ProtectionSheetState(address));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSendAddressHostViewState CryptoTransferSendAddressHostComposable$lambda$0(SnapshotState4<CryptoTransferSendAddressHostViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferSendAddressHostEvent> CryptoTransferSendAddressHostComposable$lambda$1(SnapshotState4<Event<CryptoTransferSendAddressHostEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final CryptoTransferConfig.TransferWarnings.Stage.Warning CryptoTransferSendAddressHostComposable$lambda$3(SnapshotState<CryptoTransferConfig.TransferWarnings.Stage.Warning> snapshotState) {
        return snapshotState.getValue();
    }

    private static final ProtectionSheetState CryptoTransferSendAddressHostComposable$lambda$6(SnapshotState<ProtectionSheetState> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean CryptoTransferSendAddressHostComposable$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTransferSendAddressHostComposable$lambda$16$lambda$15$lambda$14 */
    public static final Unit m2781x2188802c(CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, SnapshotState snapshotState) {
        CryptoTransferSendAddressHostComposable$lambda$10(snapshotState, false);
        cryptoTransferSendAddressHostDuxo.m2788x81966257();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTransferSendAddressHostComposable$lambda$21$lambda$18$lambda$17 */
    public static final Unit m2782x27bf878c(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTransferSendAddressHostComposable$lambda$26$lambda$23$lambda$22 */
    public static final Unit m2784x85f67ac5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
