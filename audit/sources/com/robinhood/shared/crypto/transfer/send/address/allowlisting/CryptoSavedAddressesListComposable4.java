package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToast3;
import com.robinhood.compose.bento.component.BentoToast4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.contracts.CryptoTransferSelectionIntentKey;
import com.robinhood.shared.crypto.contracts.transfers.CryptoAddSavedAddressFragmentKey;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable4;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListDuxo;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListEvent;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListViewState;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposable4;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoSavedAddressesListComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aK\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001aO\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"NUMBER_OF_LOADING_ROWS", "", "CryptoSavedAddressesListComposable", "", "currencyPairId", "Ljava/util/UUID;", "loggingSessionId", "", "onAddressRowClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo;Landroidx/compose/runtime/Composer;II)V", "AddressLists", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState;", "onSavedAddressDeleted", "Lkotlin/Function2;", "(Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigateToAddressAddition", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "feature-crypto-transfer_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListEvent;", "showHoldingPeriodWarningSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoSavedAddressesListComposable4 {
    private static final int NUMBER_OF_LOADING_ROWS = 9;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressLists$lambda$15(CryptoSavedAddressesListViewState cryptoSavedAddressesListViewState, Function1 function1, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddressLists(cryptoSavedAddressesListViewState, function1, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoSavedAddressesListComposable$lambda$8(UUID uuid, String str, Function1 function1, Modifier modifier, CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, int i, int i2, Composer composer, int i3) {
        CryptoSavedAddressesListComposable(uuid, str, function1, modifier, cryptoSavedAddressesListDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoSavedAddressesListViewState CryptoSavedAddressesListComposable$lambda$0(SnapshotState4<CryptoSavedAddressesListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoSavedAddressesListEvent> CryptoSavedAddressesListComposable$lambda$1(SnapshotState4<Event<CryptoSavedAddressesListEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoSavedAddressesListComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSavedAddressesListComposable(final UUID uuid, final String str, final Function1<? super String, Unit> function1, Modifier modifier, CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        int i4;
        Modifier modifier2;
        CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo2;
        Modifier modifier3;
        int i5;
        CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo3;
        Event<CryptoSavedAddressesListEvent> event;
        Object objRememberedValue;
        final Event<CryptoSavedAddressesListEvent> eventCryptoSavedAddressesListComposable$lambda$1;
        final Event<CryptoSavedAddressesListEvent> eventCryptoSavedAddressesListComposable$lambda$12;
        final Modifier modifier4;
        final CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo4;
        EventConsumer<CryptoSavedAddressesListEvent> eventConsumerInvoke;
        EventConsumer<CryptoSavedAddressesListEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1202283251);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cryptoSavedAddressesListDuxo2 = cryptoSavedAddressesListDuxo;
                        int i6 = composerStartRestartGroup.changedInstance(cryptoSavedAddressesListDuxo2) ? 16384 : 8192;
                        i3 |= i6;
                    } else {
                        cryptoSavedAddressesListDuxo2 = cryptoSavedAddressesListDuxo;
                    }
                    i3 |= i6;
                } else {
                    cryptoSavedAddressesListDuxo2 = cryptoSavedAddressesListDuxo;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    cryptoSavedAddressesListDuxo4 = cryptoSavedAddressesListDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 16) == 0) {
                            CryptoSavedAddressesListDuxo.InitArgs initArgs = new CryptoSavedAddressesListDuxo.InitArgs(uuid);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            i5 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoSavedAddressesListDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$duxo$1.1
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
                            cryptoSavedAddressesListDuxo3 = (CryptoSavedAddressesListDuxo) baseDuxo;
                        } else {
                            i5 = 0;
                            cryptoSavedAddressesListDuxo3 = cryptoSavedAddressesListDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        cryptoSavedAddressesListDuxo3 = cryptoSavedAddressesListDuxo2;
                        i5 = 0;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1202283251, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable (CryptoSavedAddressesListComposable.kt:92)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoSavedAddressesListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final StateFlow<Event<CryptoSavedAddressesListEvent>> eventFlow = cryptoSavedAddressesListDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoSavedAddressesListComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoSavedAddressesListEvent) {
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
                    Event<CryptoSavedAddressesListEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event == null ? event.getData() : null) instanceof CryptoSavedAddressesListEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    final Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final BentoToast2 current2 = BentoToast4.getLocalBentoToastHost().getCurrent(composerStartRestartGroup, BentoToast3.$stable);
                    OnBackPressedDispatcherOwner current3 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                    OnBackPressedDispatcher onBackPressedDispatcher = current3 == null ? current3.getOnBackPressedDispatcher() : null;
                    final String textAsString = StringResources6.getTextAsString(StringResource.INSTANCE.invoke(C37934R.string.delete_saved_address_alert_dialog_error_toast, new Object[i5]), composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    eventCryptoSavedAddressesListComposable$lambda$1 = CryptoSavedAddressesListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoSavedAddressesListComposable$lambda$1 != null) {
                        if ((eventCryptoSavedAddressesListComposable$lambda$1.getData() instanceof CryptoSavedAddressesListEvent.DeleteSavedAddressError) && (eventConsumerInvoke2 = eventCryptoSavedAddressesListComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventCryptoSavedAddressesListComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25052invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25052invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    BentoToast2.showToast$default(current2, textAsString, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$1$1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }
                                    }, false, 32, null);
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    eventCryptoSavedAddressesListComposable$lambda$12 = CryptoSavedAddressesListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoSavedAddressesListComposable$lambda$12 != null) {
                        if ((eventCryptoSavedAddressesListComposable$lambda$12.getData() instanceof CryptoSavedAddressesListEvent.Error) && (eventConsumerInvoke = eventCryptoSavedAddressesListComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCryptoSavedAddressesListComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                    m25053invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25053invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoSavedAddressesListEvent.Error error = (CryptoSavedAddressesListEvent.Error) eventCryptoSavedAddressesListComposable$lambda$12.getData();
                                    Activity activity2 = activity;
                                    if (activity2 != null) {
                                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity2, error.getT(), false, false, 0, null, 60, null);
                                    }
                                }
                            });
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(uuid != null ? Screen.Name.CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES : Screen.Name.CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(Uuids.toStringOrEmpty(CryptoSavedAddressesListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrencyId()), str != null ? "" : str, null, 0.0d, null, null, null, null, null, null, null, null, null, null, 16380, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1472639202, true, new C381153(modifier5, snapshotState4CollectAsStateWithLifecycle, navigator, context, onBackPressedDispatcher, snapshotState, function12, cryptoSavedAddressesListDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    cryptoSavedAddressesListDuxo4 = cryptoSavedAddressesListDuxo3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$8(uuid, str, function1, modifier4, cryptoSavedAddressesListDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoSavedAddressesListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final Flow eventFlow2 = cryptoSavedAddressesListDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoSavedAddressesListComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoSavedAddressesListEvent) {
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
                    Event<CryptoSavedAddressesListEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof CryptoSavedAddressesListEvent)) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    final Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final BentoToast2 current22 = BentoToast4.getLocalBentoToastHost().getCurrent(composerStartRestartGroup, BentoToast3.$stable);
                    OnBackPressedDispatcherOwner current32 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                    if (current32 == null) {
                    }
                    final String textAsString2 = StringResources6.getTextAsString(StringResource.INSTANCE.invoke(C37934R.string.delete_saved_address_alert_dialog_error_toast, new Object[i5]), composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    eventCryptoSavedAddressesListComposable$lambda$1 = CryptoSavedAddressesListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoSavedAddressesListComposable$lambda$1 != null) {
                    }
                    eventCryptoSavedAddressesListComposable$lambda$12 = CryptoSavedAddressesListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCryptoSavedAddressesListComposable$lambda$12 != null) {
                    }
                    Modifier modifier52 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(uuid != null ? Screen.Name.CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES : Screen.Name.CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(Uuids.toStringOrEmpty(CryptoSavedAddressesListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getCurrencyId()), str != null ? "" : str, null, 0.0d, null, null, null, null, null, null, null, null, null, null, 16380, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1472639202, true, new C381153(modifier52, snapshotState4CollectAsStateWithLifecycle3, navigator2, context2, onBackPressedDispatcher, snapshotState2, function12, cryptoSavedAddressesListDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    cryptoSavedAddressesListDuxo4 = cryptoSavedAddressesListDuxo3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoSavedAddressesListComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CryptoSavedAddressesListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3 */
    static final class C381153 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoSavedAddressesListDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function1<String, Unit> $onAddressRowClick;
        final /* synthetic */ OnBackPressedDispatcher $onBack;
        final /* synthetic */ SnapshotState<Boolean> $showHoldingPeriodWarningSheet$delegate;
        final /* synthetic */ SnapshotState4<CryptoSavedAddressesListViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C381153(Modifier modifier, SnapshotState4<CryptoSavedAddressesListViewState> snapshotState4, Navigator navigator, Context context, OnBackPressedDispatcher onBackPressedDispatcher, SnapshotState<Boolean> snapshotState, Function1<? super String, Unit> function1, CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo) {
            this.$modifier = modifier;
            this.$viewState$delegate = snapshotState4;
            this.$navigator = navigator;
            this.$context = context;
            this.$onBack = onBackPressedDispatcher;
            this.$showHoldingPeriodWarningSheet$delegate = snapshotState;
            this.$onAddressRowClick = function1;
            this.$duxo = cryptoSavedAddressesListDuxo;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoSavedAddressesListComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Navigator $navigator;
            final /* synthetic */ SnapshotState<Boolean> $showHoldingPeriodWarningSheet$delegate;
            final /* synthetic */ SnapshotState4<CryptoSavedAddressesListViewState> $viewState$delegate;

            AnonymousClass3(SnapshotState4<CryptoSavedAddressesListViewState> snapshotState4, Navigator navigator, Context context, SnapshotState<Boolean> snapshotState) {
                this.$viewState$delegate = snapshotState4;
                this.$navigator = navigator;
                this.$context = context;
                this.$showHoldingPeriodWarningSheet$delegate = snapshotState;
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
                    ComposerKt.traceEventStart(-421017031, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:179)");
                }
                if (CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(this.$viewState$delegate).getShowAddAddressButton()) {
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "add_address", null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifierAutoLogEvents$default, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()));
                    boolean zIsLoading = CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(this.$viewState$delegate).isLoading();
                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_settings_add_saved_address, composer, 0);
                    composer.startReplaceGroup(-1224400529);
                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                    final Navigator navigator = this.$navigator;
                    final Context context = this.$context;
                    final SnapshotState4<CryptoSavedAddressesListViewState> snapshotState4 = this.$viewState$delegate;
                    final SnapshotState<Boolean> snapshotState = this.$showHoldingPeriodWarningSheet$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoSavedAddressesListComposable4.C381153.AnonymousClass3.invoke$lambda$1$lambda$0(navigator, context, snapshotState4, snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierNavigationBarsPadding, null, null, false, zIsLoading, null, null, null, null, false, null, composer, 0, 0, 8120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, SnapshotState4 snapshotState4, SnapshotState snapshotState) {
                if (CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(snapshotState4).isAllowlistingEnabled()) {
                    CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$4(snapshotState, true);
                } else {
                    CryptoSavedAddressesListComposable4.navigateToAddressAddition(CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(snapshotState4).getCurrencyPairId(), navigator, context);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CryptoSavedAddressesListComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$4, reason: invalid class name */
        static final class AnonymousClass4 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ CryptoSavedAddressesListDuxo $duxo;
            final /* synthetic */ Function1<String, Unit> $onAddressRowClick;
            final /* synthetic */ SnapshotState4<CryptoSavedAddressesListViewState> $viewState$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Function1<? super String, Unit> function1, CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, SnapshotState4<CryptoSavedAddressesListViewState> snapshotState4) {
                this.$onAddressRowClick = function1;
                this.$duxo = cryptoSavedAddressesListDuxo;
                this.$viewState$delegate = snapshotState4;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(648162607, i2, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:215)");
                }
                if (CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(this.$viewState$delegate).isLoading()) {
                    composer.startReplaceGroup(-760673166);
                    LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), CryptoSavedAddressesListComposable9.LIST_LOADING_SCREEN), false, false, 9, composer, 3072, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-760374419);
                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                    CryptoSavedAddressesListViewState cryptoSavedAddressesListViewStateCryptoSavedAddressesListComposable$lambda$0 = CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(this.$viewState$delegate);
                    Function1<String, Unit> function1 = this.$onAddressRowClick;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.$duxo);
                    final CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo = this.$duxo;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$4$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoSavedAddressesListComposable4.C381153.AnonymousClass4.invoke$lambda$1$lambda$0(cryptoSavedAddressesListDuxo, (UUID) obj, (String) obj2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    CryptoSavedAddressesListComposable4.AddressLists(cryptoSavedAddressesListViewStateCryptoSavedAddressesListComposable$lambda$0, function1, (Function2) objRememberedValue, modifierPadding, composer, 0, 0);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(CryptoSavedAddressesListDuxo cryptoSavedAddressesListDuxo, UUID id, String currencyCode) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                cryptoSavedAddressesListDuxo.deleteSavedAddress(id, currencyCode);
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            Modifier modifierLogScreenTransitions$default;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472639202, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous> (CryptoSavedAddressesListComposable.kt:136)");
            }
            Modifier modifier = this.$modifier;
            if (CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(this.$viewState$delegate).getCurrencyId() != null && (modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier, null, 1, null)) != null) {
                modifier = modifierLogScreenTransitions$default;
            }
            final SnapshotState4<CryptoSavedAddressesListViewState> snapshotState4 = this.$viewState$delegate;
            final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier, ComposableLambda3.rememberComposableLambda(-1622158374, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt.CryptoSavedAddressesListComposable.3.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1622158374, i2, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:143)");
                    }
                    final SnapshotState4<CryptoSavedAddressesListViewState> snapshotState42 = snapshotState4;
                    final OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(594289006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: CryptoSavedAddressesListComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $onBack;

                            AnonymousClass2(OnBackPressedDispatcher onBackPressedDispatcher) {
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
                                    ComposerKt.traceEventStart(-943406161, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:146)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$onBack);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005a: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = (r1v1 'onBackPressedDispatcher' androidx.activity.OnBackPressedDispatcher A[DONT_INLINE]) A[MD:(androidx.activity.OnBackPressedDispatcher):void (m)] (LINE:148) call: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1$2$$ExternalSyntheticLambda0.<init>(androidx.activity.OnBackPressedDispatcher):void type: CONSTRUCTOR in method: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1.2.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        java.lang.String r0 = "$this$BentoAppBar"
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                                        r0 = r14 & 6
                                        if (r0 != 0) goto L1c
                                        r0 = r14 & 8
                                        if (r0 != 0) goto L12
                                        boolean r0 = r13.changed(r12)
                                        goto L16
                                    L12:
                                        boolean r0 = r13.changedInstance(r12)
                                    L16:
                                        if (r0 == 0) goto L1a
                                        r0 = 4
                                        goto L1b
                                    L1a:
                                        r0 = 2
                                    L1b:
                                        r14 = r14 | r0
                                    L1c:
                                        r0 = r14 & 19
                                        r1 = 18
                                        if (r0 != r1) goto L2d
                                        boolean r0 = r13.getSkipping()
                                        if (r0 != 0) goto L29
                                        goto L2d
                                    L29:
                                        r13.skipToGroupEnd()
                                        return
                                    L2d:
                                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r0 == 0) goto L3c
                                        r0 = -1
                                        java.lang.String r1 = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:146)"
                                        r2 = -943406161(0xffffffffc7c4c3af, float:-100743.37)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r14, r0, r1)
                                    L3c:
                                        r0 = 5004770(0x4c5de2, float:7.013177E-39)
                                        r13.startReplaceGroup(r0)
                                        androidx.activity.OnBackPressedDispatcher r0 = r11.$onBack
                                        boolean r0 = r13.changedInstance(r0)
                                        androidx.activity.OnBackPressedDispatcher r1 = r11.$onBack
                                        java.lang.Object r2 = r13.rememberedValue()
                                        if (r0 != 0) goto L58
                                        androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                                        java.lang.Object r0 = r0.getEmpty()
                                        if (r2 != r0) goto L60
                                    L58:
                                        com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1$2$$ExternalSyntheticLambda0 r2 = new com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1$2$$ExternalSyntheticLambda0
                                        r2.<init>(r1)
                                        r13.updateRememberedValue(r2)
                                    L60:
                                        r7 = r2
                                        kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                                        r13.endReplaceGroup()
                                        int r0 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                                        int r0 = r0 << 12
                                        r1 = 57344(0xe000, float:8.0356E-41)
                                        int r14 = r14 << 12
                                        r14 = r14 & r1
                                        r9 = r0 | r14
                                        r10 = 7
                                        r4 = 0
                                        r5 = 0
                                        r6 = 0
                                        r3 = r12
                                        r8 = r13
                                        r3.m20575BentoBackButtondrOMvmE(r4, r5, r6, r7, r8, r9, r10)
                                        boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r12 == 0) goto L84
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L84:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable8.AnonymousClass2.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                    if (onBackPressedDispatcher != null) {
                                        onBackPressedDispatcher.onBackPressed();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(594289006, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:144)");
                                }
                                AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                final SnapshotState4<CryptoSavedAddressesListViewState> snapshotState43 = snapshotState42;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(540764251, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$2$appBar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(540764251, i4, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:152)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(snapshotState43).getTopBarState().getTitle(), composer4, StringResource.$stable), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(snapshotState43).getTopBarState() instanceof CryptoSavedAddressesListViewState.TopBarState.Loading, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8188);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(-943406161, true, new AnonymousClass2(onBackPressedDispatcher2), composer3, 54), CryptoSavedAddressesListComposable.INSTANCE.getLambda$312329744$feature_crypto_transfer_externalDebug(), null, false, false, appBarType, null, 0L, null, composer3, 12586374, 0, 1906);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        if (CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(snapshotState4).getTopBarState().getShowProgressBar()) {
                            composer2.startReplaceGroup(1252877119);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composableLambdaRememberComposableLambda.invoke(composer2, 6);
                            BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.33f, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 7, null), 1, 0L, 0L, false, composer2, 390, 56);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1253354488);
                            composableLambdaRememberComposableLambda.invoke(composer2, 6);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), ComposableLambda3.rememberComposableLambda(-421017031, true, new AnonymousClass3(this.$viewState$delegate, this.$navigator, this.$context, this.$showHoldingPeriodWarningSheet$delegate), composer, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(648162607, true, new AnonymousClass4(this.$onAddressRowClick, this.$duxo, this.$viewState$delegate), composer, 54), composer, 805306800, 504);
                if (CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$3(this.$showHoldingPeriodWarningSheet$delegate)) {
                    final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "new_address_holding_period", null, 4, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_address_list_holding_period_warning_title, composer, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_address_list_holding_period_warning_subtitle_v2, composer, 0);
                    String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_address_list_holding_period_warning_primary_cta, composer, 0);
                    String strStringResource4 = StringResources_androidKt.stringResource(C37934R.string.crypto_address_list_holding_period_warning_secondary_cta, composer, 0);
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                    final Navigator navigator = this.$navigator;
                    final Context context = this.$context;
                    final SnapshotState<Boolean> snapshotState = this.$showHoldingPeriodWarningSheet$delegate;
                    final SnapshotState4<CryptoSavedAddressesListViewState> snapshotState42 = this.$viewState$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CryptoSavedAddressesListComposable4.C381153.invoke$lambda$2$lambda$1(current, userInteractionEventDescriptor, navigator, context, snapshotState, snapshotState42, (RhModalBottomSheet5) obj2);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    final SnapshotState<Boolean> snapshotState2 = this.$showHoldingPeriodWarningSheet$delegate;
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoSavedAddressesListComposable4.C381153.invoke$lambda$4$lambda$3(snapshotState2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor);
                    final SnapshotState<Boolean> snapshotState3 = this.$showHoldingPeriodWarningSheet$delegate;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$CryptoSavedAddressesListComposable$3$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CryptoSavedAddressesListComposable4.C381153.invoke$lambda$6$lambda$5(current, userInteractionEventDescriptor, snapshotState3, (RhModalBottomSheet5) obj2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    RhContentBottomSheet2.RhContentBottomSheet(strStringResource, strStringResource2, strStringResource3, function1, function0, modifierAutoLogEvents$default, null, strStringResource4, (Function1) objRememberedValue3, false, null, null, composer, 1597440, 0, 3584);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Navigator navigator, Context context, SnapshotState snapshotState, SnapshotState4 snapshotState4, RhModalBottomSheet5 RhContentBottomSheet) {
                Intrinsics.checkNotNullParameter(RhContentBottomSheet, "$this$RhContentBottomSheet");
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$4(snapshotState, false);
                CryptoSavedAddressesListComposable4.navigateToAddressAddition(CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$0(snapshotState4).getCurrencyPairId(), navigator, context);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$6$lambda$5(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState snapshotState, RhModalBottomSheet5 RhContentBottomSheet) {
                Intrinsics.checkNotNullParameter(RhContentBottomSheet, "$this$RhContentBottomSheet");
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "cancel", null, 4, null), null, 47, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$4(snapshotState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
                CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable$lambda$4(snapshotState, false);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void AddressLists(final CryptoSavedAddressesListViewState cryptoSavedAddressesListViewState, final Function1<? super String, Unit> function1, final Function2<? super UUID, ? super String, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            Modifier modifier2;
            boolean zChangedInstance;
            Object objRememberedValue;
            Composer composer2;
            final Modifier modifier3;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
            Composer composerStartRestartGroup = composer.startRestartGroup(-783033909);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(cryptoSavedAddressesListViewState) ? 4 : 2) | i;
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
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            int i4 = i2 & 8;
            if (i4 == 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-783033909, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AddressLists (CryptoSavedAddressesListComposable.kt:300)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(cryptoSavedAddressesListViewState) | ((i3 & 112) == 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoSavedAddressesListComposable4.AddressLists$lambda$14$lambda$13(cryptoSavedAddressesListViewState, function2, function1, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoSavedAddressesListComposable4.AddressLists$lambda$15(cryptoSavedAddressesListViewState, function1, function2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(cryptoSavedAddressesListViewState) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoSavedAddressesListComposable4.AddressLists$lambda$14$lambda$13(cryptoSavedAddressesListViewState, function2, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyColumn(modifierFillMaxWidth$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AddressLists$lambda$14$lambda$13(final CryptoSavedAddressesListViewState cryptoSavedAddressesListViewState, final Function2 function2, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            if (!cryptoSavedAddressesListViewState.getPendingSavedAddresses().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1590876517, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1590876517, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AddressLists.<anonymous>.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:306)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                        if (cryptoSavedAddressesListViewState.getShouldShowSectionHeader()) {
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_pending_addresses_section_heading, composer, 0), modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                final ImmutableList<UiSavedAddress> pendingSavedAddresses = cryptoSavedAddressesListViewState.getPendingSavedAddresses();
                final Function1 function12 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoSavedAddressesListComposable4.AddressLists$lambda$14$lambda$13$lambda$9((UiSavedAddress) obj);
                    }
                };
                final C38096x479bb785 c38096x479bb785 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(UiSavedAddress uiSavedAddress) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((UiSavedAddress) obj);
                    }
                };
                LazyColumn.items(pendingSavedAddresses.size(), new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return function12.invoke(pendingSavedAddresses.get(i));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c38096x479bb785.invoke(pendingSavedAddresses.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$4
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
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                        UiSavedAddress uiSavedAddress = (UiSavedAddress) pendingSavedAddresses.get(i);
                        composer.startReplaceGroup(533809277);
                        CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable(cryptoSavedAddressesListViewState.getCurrencyCode(), uiSavedAddress, cryptoSavedAddressesListViewState.isAllowlistingEnabled(), null, function2, null, composer, 3072, 32);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (!cryptoSavedAddressesListViewState.getValidSavedAddresses().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1762197892, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$1$1$4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1762197892, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.AddressLists.<anonymous>.<anonymous>.<anonymous> (CryptoSavedAddressesListComposable.kt:332)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                        if (cryptoSavedAddressesListViewState.getShouldShowSectionHeader()) {
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_saved_addresses_section_heading, composer, 0), modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                final ImmutableList<UiSavedAddress> validSavedAddresses = cryptoSavedAddressesListViewState.getValidSavedAddresses();
                final Function1 function13 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoSavedAddressesListComposable4.AddressLists$lambda$14$lambda$13$lambda$11((UiSavedAddress) obj);
                    }
                };
                final C38100x479bb789 c38100x479bb789 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(UiSavedAddress uiSavedAddress) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((UiSavedAddress) obj);
                    }
                };
                LazyColumn.items(validSavedAddresses.size(), new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return function13.invoke(validSavedAddresses.get(i));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c38100x479bb789.invoke(validSavedAddresses.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListComposableKt$AddressLists$lambda$14$lambda$13$$inlined$items$default$8
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
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                        UiSavedAddress uiSavedAddress = (UiSavedAddress) validSavedAddresses.get(i);
                        composer.startReplaceGroup(-1990848272);
                        CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable(cryptoSavedAddressesListViewState.getCurrencyCode(), uiSavedAddress, cryptoSavedAddressesListViewState.isAllowlistingEnabled(), function1, function2, null, composer, 0, 32);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (cryptoSavedAddressesListViewState.getShowEmptyState()) {
                LazyListScope.item$default(LazyColumn, null, null, CryptoSavedAddressesListComposable.INSTANCE.m25047getLambda$111015645$feature_crypto_transfer_externalDebug(), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object AddressLists$lambda$14$lambda$13$lambda$9(UiSavedAddress item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object AddressLists$lambda$14$lambda$13$lambda$11(UiSavedAddress item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void navigateToAddressAddition(UUID uuid, Navigator navigator, Context context) {
            if (uuid == null) {
                Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoTransferSelectionIntentKey(null, CryptoTransferIntentKey.Action.SAVE, false, null, 12, null), null, false, null, null, 60, null);
            } else {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new CryptoAddSavedAddressFragmentKey(uuid), false, false, false, false, null, false, null, null, 1020, null);
            }
        }
    }
