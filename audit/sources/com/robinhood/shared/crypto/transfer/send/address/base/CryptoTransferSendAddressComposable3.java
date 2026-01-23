package com.robinhood.shared.crypto.transfer.send.address.base;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.textinput.CryptoAddressTextInput2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable3;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferSendAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001aC\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"INITIAL_TOOLBAR_PROGRESS", "", "CryptoTransferSendAddressComposable", "", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;", "isProtectionSheetLoading", "", "onContinueClicked", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressDuxo;", "(Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressDuxo;Landroidx/compose/runtime/Composer;II)V", "AddressDetails", "savedAddress", "requestFocusIntoAddressInput", "maxLimit", "", "onAddressChange", "(Ljava/lang/String;ZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SendAddressToolbar", "onScanClick", "Lkotlin/Function0;", "onBackClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressViewState;", "showTipsBottomSheet", "shouldLogFirstAddressInput"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendAddressComposable3 {
    private static final float INITIAL_TOOLBAR_PROGRESS = 0.33f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressDetails$lambda$18(String str, boolean z, int i, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        AddressDetails(str, z, i, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendAddressComposable$lambda$11(CryptoTransferSendAddressFragment.Callbacks callbacks, boolean z, Function1 function1, Modifier modifier, CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendAddressComposable(callbacks, z, function1, modifier, cryptoTransferSendAddressDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferSendAddressComposable$lambda$7$lambda$6(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SendAddressToolbar$lambda$20(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SendAddressToolbar(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendAddressComposable(final CryptoTransferSendAddressFragment.Callbacks callbacks, final boolean z, final Function1<? super String, Unit> onContinueClicked, Modifier modifier, CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo2;
        int i4;
        Modifier modifier3;
        Composer composer2;
        final CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Composer composer3;
        boolean z3;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue2;
        final Modifier modifier4;
        final CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1269665081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoTransferSendAddressDuxo2 = cryptoTransferSendAddressDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTransferSendAddressDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    cryptoTransferSendAddressDuxo2 = cryptoTransferSendAddressDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTransferSendAddressDuxo2 = cryptoTransferSendAddressDuxo;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSendAddressDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 &= -57345;
                        cryptoTransferSendAddressDuxo3 = (CryptoTransferSendAddressDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        cryptoTransferSendAddressDuxo3 = cryptoTransferSendAddressDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    cryptoTransferSendAddressDuxo3 = cryptoTransferSendAddressDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1269665081, i4, -1, "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable (CryptoTransferSendAddressComposable.kt:61)");
                }
                Composer composer4 = composer2;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer4, AutoLoggingCompositionLocals4.$stable);
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer4.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                composer4.startReplaceGroup(1849434622);
                objRememberedValue = composer4.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer4.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer4.endReplaceGroup();
                Modifier modifier5 = modifier3;
                int i7 = i4;
                CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo5 = cryptoTransferSendAddressDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(1018929283, true, new C381311(callbacks, appCompatActivityRequireActivityBaseContext), composer4, 54), ComposableLambda3.rememberComposableLambda(1919997218, true, new C381322(softwareKeyboardController, userInteractionEventDescriptor, current2, onContinueClicked, snapshotState4CollectAsStateWithLifecycle, z2, snapshotState), composer4, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1323870568, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt.CryptoTransferSendAddressComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer5, int i8) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i8 & 6) == 0) {
                            i8 |= composer5.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1323870568, i8, -1, "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable.<anonymous> (CryptoTransferSendAddressComposable.kt:84)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 1, null);
                        String address = CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAddress();
                        CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo6 = cryptoTransferSendAddressDuxo3;
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer5.changedInstance(cryptoTransferSendAddressDuxo6);
                        Object objRememberedValue4 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new CryptoTransferSendAddressComposable5(cryptoTransferSendAddressDuxo6);
                            composer5.updateRememberedValue(objRememberedValue4);
                        }
                        composer5.endReplaceGroup();
                        CryptoTransferSendAddressComposable3.AddressDetails(address, CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShouldRequestFocus(), CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getMaxAddressLength(), (Function1) ((KFunction) objRememberedValue4), modifierFillMaxSize$default, composer5, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), composer4, ((i4 >> 9) & 14) | 805306800, 504);
                composer3 = composer4;
                composer3.startReplaceGroup(-377340014);
                if (CryptoTransferSendAddressComposable$lambda$2(snapshotState)) {
                    z3 = false;
                    z4 = true;
                } else {
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$5$lambda$4(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function0 = (Function0) objRememberedValue4;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$7$lambda$6((SheetValue) obj));
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    composer3.endReplaceGroup();
                    z3 = false;
                    z4 = true;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue5, composer3, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-2129046509, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt.CryptoTransferSendAddressComposable.6
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer5, Integer num) {
                            invoke(rhModalBottomSheet5, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer5, int i8) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i8 & 6) == 0) {
                                i8 |= (i8 & 8) == 0 ? composer5.changed(RhModalBottomSheet) : composer5.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2129046509, i8, -1, "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable.<anonymous> (CryptoTransferSendAddressComposable.kt:132)");
                            }
                            TipsSheetContent.TransferTipsSheetContent(RhModalBottomSheet, CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTransferSendTipsSheetContent(), null, composer5, RhModalBottomSheet5.$stable | (i8 & 14), 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 1572870, 54);
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composer3.startReplaceGroup(-1633490746);
                zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle) | (((i7 & 14) != 4 || ((i7 & 8) != 0 && composer3.changedInstance(callbacks))) ? z4 : z3);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$10$lambda$9(callbacks, snapshotState4CollectAsStateWithLifecycle, (DisposableEffectScope) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                cryptoTransferSendAddressDuxo4 = cryptoTransferSendAddressDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTransferSendAddressDuxo4 = cryptoTransferSendAddressDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$11(callbacks, z, onContinueClicked, modifier4, cryptoTransferSendAddressDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer42, AutoLoggingCompositionLocals4.$stable);
                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composer42.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer42.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                AppCompatActivity appCompatActivityRequireActivityBaseContext2 = BaseContexts.requireActivityBaseContext((Context) composer42.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                composer42.startReplaceGroup(1849434622);
                objRememberedValue = composer42.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer42.endReplaceGroup();
                Modifier modifier52 = modifier3;
                int i72 = i4;
                CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo52 = cryptoTransferSendAddressDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(1018929283, true, new C381311(callbacks, appCompatActivityRequireActivityBaseContext2), composer42, 54), ComposableLambda3.rememberComposableLambda(1919997218, true, new C381322(softwareKeyboardController2, userInteractionEventDescriptor2, current22, onContinueClicked, snapshotState4CollectAsStateWithLifecycle, z2, snapshotState), composer42, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1323870568, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt.CryptoTransferSendAddressComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer5, int i8) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i8 & 6) == 0) {
                            i8 |= composer5.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1323870568, i8, -1, "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable.<anonymous> (CryptoTransferSendAddressComposable.kt:84)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 1, null);
                        String address = CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAddress();
                        CryptoTransferSendAddressDuxo cryptoTransferSendAddressDuxo6 = cryptoTransferSendAddressDuxo3;
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer5.changedInstance(cryptoTransferSendAddressDuxo6);
                        Object objRememberedValue42 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue42 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue42 = new CryptoTransferSendAddressComposable5(cryptoTransferSendAddressDuxo6);
                            composer5.updateRememberedValue(objRememberedValue42);
                        }
                        composer5.endReplaceGroup();
                        CryptoTransferSendAddressComposable3.AddressDetails(address, CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShouldRequestFocus(), CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getMaxAddressLength(), (Function1) ((KFunction) objRememberedValue42), modifierFillMaxSize$default, composer5, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), composer42, ((i4 >> 9) & 14) | 805306800, 504);
                composer3 = composer42;
                composer3.startReplaceGroup(-377340014);
                if (CryptoTransferSendAddressComposable$lambda$2(snapshotState)) {
                }
                composer3.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                composer3.startReplaceGroup(-1633490746);
                if ((i72 & 14) != 4) {
                    zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle) | (((i72 & 14) != 4 || ((i72 & 8) != 0 && composer3.changedInstance(callbacks))) ? z4 : z3);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$10$lambda$9(callbacks, snapshotState4CollectAsStateWithLifecycle, (DisposableEffectScope) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                        composer3.endReplaceGroup();
                        EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                        cryptoTransferSendAddressDuxo4 = cryptoTransferSendAddressDuxo52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CryptoTransferSendAddressComposable$lambda$10$lambda$9(final CryptoTransferSendAddressFragment.Callbacks callbacks, final SnapshotState4 snapshotState4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$lambda$10$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                callbacks.saveLastEnteredAddress(CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4).getAddress());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferSendAddressComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CryptoTransferSendAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$1 */
    static final class C381311 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ CryptoTransferSendAddressFragment.Callbacks $callbacks;

        C381311(CryptoTransferSendAddressFragment.Callbacks callbacks, AppCompatActivity appCompatActivity) {
            this.$callbacks = callbacks;
            this.$activity = appCompatActivity;
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
                ComposerKt.traceEventStart(1018929283, i, -1, "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable.<anonymous> (CryptoTransferSendAddressComposable.kt:73)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final CryptoTransferSendAddressFragment.Callbacks callbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAddressComposable3.C381311.invoke$lambda$1$lambda$0(callbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$activity);
            final AppCompatActivity appCompatActivity = this.$activity;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAddressComposable3.C381311.invoke$lambda$3$lambda$2(appCompatActivity);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoTransferSendAddressComposable3.SendAddressToolbar(function0, (Function0) objRememberedValue2, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoTransferSendAddressFragment.Callbacks callbacks) {
            callbacks.navigateToQrScanner();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(AppCompatActivity appCompatActivity) {
            appCompatActivity.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AddressDetails$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSendAddressViewState CryptoTransferSendAddressComposable$lambda$0(SnapshotState4<CryptoTransferSendAddressViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean CryptoTransferSendAddressComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: CryptoTransferSendAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$2 */
    static final class C381322 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isProtectionSheetLoading;
        final /* synthetic */ SoftwareKeyboardController $keyboardController;
        final /* synthetic */ Function1<String, Unit> $onContinueClicked;
        final /* synthetic */ SnapshotState<Boolean> $showTipsBottomSheet$delegate;
        final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventData;
        final /* synthetic */ SnapshotState4<CryptoTransferSendAddressViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C381322(SoftwareKeyboardController softwareKeyboardController, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function1<? super String, Unit> function1, SnapshotState4<CryptoTransferSendAddressViewState> snapshotState4, boolean z, SnapshotState<Boolean> snapshotState) {
            this.$keyboardController = softwareKeyboardController;
            this.$userInteractionEventData = userInteractionEventDescriptor;
            this.$eventLogger = eventLogger;
            this.$onContinueClicked = function1;
            this.$viewState$delegate = snapshotState4;
            this.$isProtectionSheetLoading = z;
            this.$showTipsBottomSheet$delegate = snapshotState;
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
                ComposerKt.traceEventStart(1919997218, i, -1, "com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposable.<anonymous> (CryptoTransferSendAddressComposable.kt:95)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null));
            StringResource helperText = CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(this.$viewState$delegate).getHelperText();
            composer.startReplaceGroup(-1718603955);
            String string2 = helperText != null ? StringResource2.getString(helperText, composer, StringResource.$stable) : null;
            composer.endReplaceGroup();
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_v2_more_tips, composer, 0);
            boolean zIsContinueEnabled = CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(this.$viewState$delegate).isContinueEnabled();
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$keyboardController);
            final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            final SnapshotState<Boolean> snapshotState = this.$showTipsBottomSheet$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAddressComposable3.C381322.invoke$lambda$1$lambda$0(softwareKeyboardController, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$userInteractionEventData) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$keyboardController) | composer.changed(this.$onContinueClicked) | composer.changed(this.$viewState$delegate);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$userInteractionEventData;
            final EventLogger eventLogger = this.$eventLogger;
            final SoftwareKeyboardController softwareKeyboardController2 = this.$keyboardController;
            final Function1<String, Unit> function1 = this.$onContinueClicked;
            final SnapshotState<Boolean> snapshotState2 = this.$showTipsBottomSheet$delegate;
            final SnapshotState4<CryptoTransferSendAddressViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$CryptoTransferSendAddressComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendAddressComposable3.C381322.invoke$lambda$3$lambda$2(userInteractionEventDescriptor, eventLogger, softwareKeyboardController2, function1, snapshotState2, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierNavigationBarsPadding, string2, strStringResource, true, function0, null, (Function0) objRememberedValue2, strStringResource2, this.$isProtectionSheetLoading, null, zIsContinueEnabled, null, null, false, null, false, composer, 3072, 0, 64032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SoftwareKeyboardController softwareKeyboardController, SnapshotState snapshotState) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$3(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SoftwareKeyboardController softwareKeyboardController, Function1 function1, SnapshotState snapshotState, SnapshotState4 snapshotState4) {
            Screen screen = userInteractionEventDescriptor.getScreen();
            com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor.getContext();
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.REVIEW, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, context, false, 40, null);
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$3(snapshotState, false);
            function1.invoke(CryptoTransferSendAddressComposable3.CryptoTransferSendAddressComposable$lambda$0(snapshotState4).getAddress());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendAddressComposable$lambda$5$lambda$4(SnapshotState snapshotState) {
        CryptoTransferSendAddressComposable$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressDetails(final String str, final boolean z, final int i, final Function1<? super String, Unit> function1, Modifier modifier, Composer composer, final int i2, final int i3) {
        String str2;
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z2;
        Object objRememberedValue2;
        EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(608128880);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 = i;
                    i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i2 & 24576) == 0) {
                        modifier2 = modifier;
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(608128880, i4, -1, "com.robinhood.shared.crypto.transfer.send.address.base.AddressDetails (CryptoTransferSendAddressComposable.kt:152)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifier4 = modifier2;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                        TextStyle bookCoverCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i7).getBookCoverCapsuleSmall();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                        long jM21368getAccent0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21368getAccent0d7_KjU();
                        long jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21427getFg30d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        z2 = (i4 & 7168) != 2048;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoTransferSendAddressComposable3.AddressDetails$lambda$16$lambda$15(function1, snapshotState, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoAddressTextInput2.m25244CryptoAddressTextInputTtFQ49E(str2, i5, bookCoverCapsuleSmall, jM21425getFg0d7_KjU, jM21368getAccent0d7_KjU, jM21427getFg30d7_KjU, (Function1) objRememberedValue2, modifierFillMaxWidth$default, z, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 21) & 234881024), 0);
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Boolean boolValueOf = Boolean.valueOf(AddressDetails$lambda$13(snapshotState));
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new CryptoTransferSendAddressComposable4(userInteractionEventDescriptor, current, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoTransferSendAddressComposable3.AddressDetails$lambda$18(str, z, i, function1, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                modifier2 = modifier;
                if ((i4 & 9363) == 9362) {
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifier42 = modifier2;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                    TextStyle bookCoverCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getBookCoverCapsuleSmall();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                    long jM21368getAccent0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21368getAccent0d7_KjU();
                    long jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21427getFg30d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i4 & 7168) != 2048) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoTransferSendAddressComposable3.AddressDetails$lambda$16$lambda$15(function1, snapshotState, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoAddressTextInput2.m25244CryptoAddressTextInputTtFQ49E(str2, i5, bookCoverCapsuleSmall2, jM21425getFg0d7_KjU2, jM21368getAccent0d7_KjU2, jM21427getFg30d7_KjU2, (Function1) objRememberedValue2, modifierFillMaxWidth$default2, z, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 21) & 234881024), 0);
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Boolean boolValueOf2 = Boolean.valueOf(AddressDetails$lambda$13(snapshotState));
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue3 = new CryptoTransferSendAddressComposable4(userInteractionEventDescriptor, current, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i5 = i;
            if ((i3 & 8) != 0) {
            }
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            modifier2 = modifier;
            if ((i4 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i;
        if ((i3 & 8) != 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AddressDetails$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressDetails$lambda$16$lambda$15(Function1 function1, SnapshotState snapshotState, String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (!AddressDetails$lambda$13(snapshotState)) {
            AddressDetails$lambda$14(snapshotState, true);
        }
        function1.invoke(address);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SendAddressToolbar(final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1764608800);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1764608800, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.base.SendAddressToolbar (CryptoTransferSendAddressComposable.kt:193)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                modifier3 = modifier4;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(CryptoTransferSendAddressComposable.INSTANCE.m25054getLambda$1117188989$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1563042345, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$SendAddressToolbar$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1563042345, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.base.SendAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendAddressComposable.kt:200)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, function02, composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-395061320, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$SendAddressToolbar$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-395061320, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.base.SendAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendAddressComposable.kt:206)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_v2_menu_item, composer2, 0), modifierM5146paddingqDBjuR0$default, null, BentoTextButton3.Size.f5147M, false, null, composer2, 24576, 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12586374, 0, 1906);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoProgressBar2.m20698BentoProgressBarjB83MbM(INITIAL_TOOLBAR_PROGRESS, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1, 0L, 0L, false, composerStartRestartGroup, 390, 56);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendAddressComposable3.SendAddressToolbar$lambda$20(function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                modifier3 = modifier4;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(CryptoTransferSendAddressComposable.INSTANCE.m25054getLambda$1117188989$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1563042345, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$SendAddressToolbar$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1563042345, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.base.SendAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendAddressComposable.kt:200)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, function02, composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-395061320, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.CryptoTransferSendAddressComposableKt$SendAddressToolbar$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-395061320, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.base.SendAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendAddressComposable.kt:206)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_v2_menu_item, composer2, 0), modifierM5146paddingqDBjuR0$default, null, BentoTextButton3.Size.f5147M, false, null, composer2, 24576, 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12586374, 0, 1906);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoProgressBar2.m20698BentoProgressBarjB83MbM(INITIAL_TOOLBAR_PROGRESS, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1, 0L, 0L, false, composerStartRestartGroup, 390, 56);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
