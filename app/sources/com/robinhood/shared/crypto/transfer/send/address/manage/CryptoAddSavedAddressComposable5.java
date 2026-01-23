package com.robinhood.shared.crypto.transfer.send.address.manage;

import android.app.Activity;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.compose.result.ObserveResult;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToast3;
import com.robinhood.compose.bento.component.BentoToast4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.transfers.CryptoAddSavedAddressFragmentKey;
import com.robinhood.shared.crypto.p375ui.textinput.CryptoAddressTextInput2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.SanitizeCryptoAddress;
import com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposable5;
import com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressViewState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoAddSavedAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001aC\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0017\u001aI\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001d2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#\"\u0016\u0010%\u001a\u00020\u001b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010'¨\u0006(²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010*X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u001bX\u008a\u008e\u0002"}, m3636d2 = {"CryptoAddSavedAddressComposable", "", "args", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoAddSavedAddressFragmentKey;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "onClickScan", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDuxo;", "(Lcom/robinhood/shared/crypto/contracts/transfers/CryptoAddSavedAddressFragmentKey;Landroidx/lifecycle/SavedStateHandle;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDuxo;Landroidx/compose/runtime/Composer;II)V", "ScaffoldComposable", "state", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState;", "showPasteLimitToast", "(Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState;Landroidx/lifecycle/SavedStateHandle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TopBar", "title", "Lcom/robinhood/utils/resource/StringResource;", "isLoading", "", "(Lcom/robinhood/utils/resource/StringResource;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState$Loaded;", PlaceTypes.ADDRESS, "", "onAddressChanged", "Lkotlin/Function1;", "(Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState$Loaded;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "onSaveClick", "(Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadedPreview", "(Landroidx/compose/runtime/Composer;I)V", "LoadingPreview", "TestTagCryptoAddSavedAddressCondensedInput", "getTestTagCryptoAddSavedAddressCondensedInput$annotations", "()V", "feature-crypto-transfer_externalDebug", "showAddressAdditionBottomSheet", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/AddressAdditionBottomSheetState;", "isSavingAddressBottomSheet", "typedAddress"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAddSavedAddressComposable5 {
    public static final String TestTagCryptoAddSavedAddressCondensedInput = "CryptoAddSavedAddressCondensedInput";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$19(CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBar(cryptoAddSavedAddressViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$18(CryptoAddSavedAddressViewState.ContentState.Loaded loaded, String str, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(loaded, str, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddSavedAddressComposable$lambda$1(CryptoAddSavedAddressFragmentKey cryptoAddSavedAddressFragmentKey, SavedStateHandle savedStateHandle, Function0 function0, Modifier modifier, CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo, int i, int i2, Composer composer, int i3) {
        CryptoAddSavedAddressComposable(cryptoAddSavedAddressFragmentKey, savedStateHandle, function0, modifier, cryptoAddSavedAddressDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedPreview$lambda$20(int i, Composer composer, int i2) {
        LoadedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingPreview$lambda$21(int i, Composer composer, int i2) {
        LoadingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScaffoldComposable$lambda$13(CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, SavedStateHandle savedStateHandle, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ScaffoldComposable(cryptoAddSavedAddressViewState, savedStateHandle, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$14(StringResource stringResource, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBar(stringResource, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTestTagCryptoAddSavedAddressCondensedInput$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoAddSavedAddressComposable(final CryptoAddSavedAddressFragmentKey args, final SavedStateHandle savedStateHandle, final Function0<Unit> onClickScan, Modifier modifier, CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo2;
        int i4;
        Modifier modifier3;
        Composer composer2;
        CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo3;
        Composer composer3;
        final CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(onClickScan, "onClickScan");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1260590083);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(savedStateHandle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickScan) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoAddSavedAddressDuxo2 = cryptoAddSavedAddressDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoAddSavedAddressDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    cryptoAddSavedAddressDuxo2 = cryptoAddSavedAddressDuxo;
                }
                i3 |= i6;
            } else {
                cryptoAddSavedAddressDuxo2 = cryptoAddSavedAddressDuxo;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoAddSavedAddressDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$CryptoAddSavedAddressComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$CryptoAddSavedAddressComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 &= -57345;
                        cryptoAddSavedAddressDuxo3 = (CryptoAddSavedAddressDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        cryptoAddSavedAddressDuxo3 = cryptoAddSavedAddressDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    cryptoAddSavedAddressDuxo3 = cryptoAddSavedAddressDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1260590083, i4, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposable (CryptoAddSavedAddressComposable.kt:68)");
                }
                Composer composer4 = composer2;
                composer3 = composer4;
                modifier2 = modifier3;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(836232274, true, new C381781(savedStateHandle, onClickScan, BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable), StringResources6.getTextAsString(StringResource.INSTANCE.invoke(C37934R.string.saved_addresses_paste_limit_error_text, new Object[0]), composer3, StringResource.$stable), modifier2, FlowExtKt.collectAsStateWithLifecycle(cryptoAddSavedAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7)), composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoAddSavedAddressDuxo4 = cryptoAddSavedAddressDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                cryptoAddSavedAddressDuxo4 = cryptoAddSavedAddressDuxo2;
                composer3 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAddSavedAddressComposable5.CryptoAddSavedAddressComposable$lambda$1(args, savedStateHandle, onClickScan, modifier4, cryptoAddSavedAddressDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                composer3 = composer42;
                modifier2 = modifier3;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(836232274, true, new C381781(savedStateHandle, onClickScan, BentoToast4.getLocalBentoToastHost().getCurrent(composer3, BentoToast3.$stable), StringResources6.getTextAsString(StringResource.INSTANCE.invoke(C37934R.string.saved_addresses_paste_limit_error_text, new Object[0]), composer3, StringResource.$stable), modifier2, FlowExtKt.collectAsStateWithLifecycle(cryptoAddSavedAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7)), composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoAddSavedAddressDuxo4 = cryptoAddSavedAddressDuxo3;
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoAddSavedAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$CryptoAddSavedAddressComposable$1 */
    static final class C381781 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClickScan;
        final /* synthetic */ String $pasteLimitErrorToastText;
        final /* synthetic */ SavedStateHandle $savedStateHandle;
        final /* synthetic */ SnapshotState4<CryptoAddSavedAddressViewState> $state$delegate;
        final /* synthetic */ BentoToast2 $toastHost;

        C381781(SavedStateHandle savedStateHandle, Function0<Unit> function0, BentoToast2 bentoToast2, String str, Modifier modifier, SnapshotState4<CryptoAddSavedAddressViewState> snapshotState4) {
            this.$savedStateHandle = savedStateHandle;
            this.$onClickScan = function0;
            this.$toastHost = bentoToast2;
            this.$pasteLimitErrorToastText = str;
            this.$modifier = modifier;
            this.$state$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(836232274, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposable.<anonymous> (CryptoAddSavedAddressComposable.kt:75)");
            }
            CryptoAddSavedAddressViewState cryptoAddSavedAddressViewStateCryptoAddSavedAddressComposable$lambda$0 = CryptoAddSavedAddressComposable5.CryptoAddSavedAddressComposable$lambda$0(this.$state$delegate);
            SavedStateHandle savedStateHandle = this.$savedStateHandle;
            Function0<Unit> function0 = this.$onClickScan;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$toastHost) | composer.changed(this.$pasteLimitErrorToastText);
            final BentoToast2 bentoToast2 = this.$toastHost;
            final String str = this.$pasteLimitErrorToastText;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$CryptoAddSavedAddressComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoAddSavedAddressComposable5.C381781.invoke$lambda$2$lambda$1(bentoToast2, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoAddSavedAddressComposable5.ScaffoldComposable(cryptoAddSavedAddressViewStateCryptoAddSavedAddressComposable$lambda$0, savedStateHandle, function0, (Function0) objRememberedValue, this.$modifier, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(BentoToast2 bentoToast2, String str) {
            BentoToast2.showToast$default(bentoToast2, str, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$CryptoAddSavedAddressComposable$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, false, 32, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoAddSavedAddressViewState CryptoAddSavedAddressComposable$lambda$0(SnapshotState4<CryptoAddSavedAddressViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressAdditionBottomSheetState ScaffoldComposable$lambda$3(SnapshotState<AddressAdditionBottomSheetState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ScaffoldComposable$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ScaffoldComposable$lambda$9(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScaffoldComposable(final CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, final SavedStateHandle savedStateHandle, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(499877024);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cryptoAddSavedAddressViewState) : composerStartRestartGroup.changedInstance(cryptoAddSavedAddressViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(savedStateHandle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                function03 = function02;
            } else {
                function03 = function02;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(499877024, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ScaffoldComposable (CryptoAddSavedAddressComposable.kt:101)");
                    }
                    Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                    OnBackPressedDispatcher onBackPressedDispatcher = current == null ? current.getOnBackPressedDispatcher() : null;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$12$lambda$11(snapshotState3, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ObserveResult.ObserveResult(savedStateHandle, CryptoAddAddressNavDestinations2.KEY_SCANNED_ADDRESS, (Function1) objRememberedValue4, composerStartRestartGroup, ((i3 >> 3) & 14) | 432);
                    Modifier modifier5 = modifier4;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ADD_SAVED_ADDRESS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1679018955, true, new C381792(modifier5, cryptoAddSavedAddressViewState, function0, snapshotState3, snapshotState, function03, snapshotState2, activity, onBackPressedDispatcher), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$13(cryptoAddSavedAddressViewState, savedStateHandle, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Activity activity2 = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                if (current2 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ObserveResult.ObserveResult(savedStateHandle, CryptoAddAddressNavDestinations2.KEY_SCANNED_ADDRESS, (Function1) objRememberedValue4, composerStartRestartGroup, ((i3 >> 3) & 14) | 432);
                Modifier modifier52 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ADD_SAVED_ADDRESS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1679018955, true, new C381792(modifier52, cryptoAddSavedAddressViewState, function0, snapshotState32, snapshotState4, function03, snapshotState22, activity2, onBackPressedDispatcher), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScaffoldComposable$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScaffoldComposable$lambda$10(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScaffoldComposable$lambda$4(SnapshotState<AddressAdditionBottomSheetState> snapshotState, AddressAdditionBottomSheetState addressAdditionBottomSheetState) {
        snapshotState.setValue(addressAdditionBottomSheetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScaffoldComposable$lambda$12$lambda$11(SnapshotState snapshotState, String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        snapshotState.setValue(result);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoAddSavedAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2 */
    static final class C381792 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ SnapshotState<Boolean> $isSavingAddressBottomSheet$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ OnBackPressedDispatcher $onBack;
        final /* synthetic */ Function0<Unit> $onClickScan;
        final /* synthetic */ SnapshotState<AddressAdditionBottomSheetState> $showAddressAdditionBottomSheet$delegate;
        final /* synthetic */ Function0<Unit> $showPasteLimitToast;
        final /* synthetic */ CryptoAddSavedAddressViewState $state;
        final /* synthetic */ SnapshotState<String> $typedAddress$delegate;

        C381792(Modifier modifier, CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, Function0<Unit> function0, SnapshotState<String> snapshotState, SnapshotState<AddressAdditionBottomSheetState> snapshotState2, Function0<Unit> function02, SnapshotState<Boolean> snapshotState3, Activity activity, OnBackPressedDispatcher onBackPressedDispatcher) {
            this.$modifier = modifier;
            this.$state = cryptoAddSavedAddressViewState;
            this.$onClickScan = function0;
            this.$typedAddress$delegate = snapshotState;
            this.$showAddressAdditionBottomSheet$delegate = snapshotState2;
            this.$showPasteLimitToast = function02;
            this.$isSavingAddressBottomSheet$delegate = snapshotState3;
            this.$activity = activity;
            this.$onBack = onBackPressedDispatcher;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoAddSavedAddressComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ Function0<Unit> $showPasteLimitToast;
            final /* synthetic */ CryptoAddSavedAddressViewState $state;
            final /* synthetic */ SnapshotState<String> $typedAddress$delegate;

            AnonymousClass3(CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, Function0<Unit> function0, SnapshotState<String> snapshotState) {
                this.$state = cryptoAddSavedAddressViewState;
                this.$showPasteLimitToast = function0;
                this.$typedAddress$delegate = snapshotState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                if ((i & 6) == 0) {
                    i |= composer.changed(contentPadding) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1562359076, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ScaffoldComposable.<anonymous>.<anonymous> (CryptoAddSavedAddressComposable.kt:134)");
                }
                if (!(this.$state.getContentState() instanceof CryptoAddSavedAddressViewState.ContentState.Loaded)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 1, null);
                String strScaffoldComposable$lambda$9 = CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$9(this.$typedAddress$delegate);
                CryptoAddSavedAddressViewState.ContentState.Loaded loaded = (CryptoAddSavedAddressViewState.ContentState.Loaded) this.$state.getContentState();
                composer.startReplaceGroup(5004770);
                final SnapshotState<String> snapshotState = this.$typedAddress$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddSavedAddressComposable5.C381792.AnonymousClass3.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CryptoAddSavedAddressComposable5.Content(loaded, strScaffoldComposable$lambda$9, (Function1) objRememberedValue, this.$showPasteLimitToast, modifierFillMaxWidth$default, composer, StringResource.$stable | 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String address) {
                Intrinsics.checkNotNullParameter(address, "address");
                CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$10(snapshotState, address);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CryptoAddSavedAddressComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ SnapshotState<AddressAdditionBottomSheetState> $showAddressAdditionBottomSheet$delegate;
            final /* synthetic */ CryptoAddSavedAddressViewState $state;
            final /* synthetic */ SnapshotState<String> $typedAddress$delegate;

            AnonymousClass2(CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, SnapshotState<String> snapshotState, SnapshotState<AddressAdditionBottomSheetState> snapshotState2) {
                this.$state = cryptoAddSavedAddressViewState;
                this.$typedAddress$delegate = snapshotState;
                this.$showAddressAdditionBottomSheet$delegate = snapshotState2;
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
                    ComposerKt.traceEventStart(1840288230, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ScaffoldComposable.<anonymous>.<anonymous> (CryptoAddSavedAddressComposable.kt:148)");
                }
                if (CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$9(this.$typedAddress$delegate).length() > 0) {
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()));
                    CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState = this.$state;
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(this.$state);
                    final CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState2 = this.$state;
                    final SnapshotState<String> snapshotState = this.$typedAddress$delegate;
                    final SnapshotState<AddressAdditionBottomSheetState> snapshotState2 = this.$showAddressAdditionBottomSheet$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoAddSavedAddressComposable5.C381792.AnonymousClass2.invoke$lambda$1$lambda$0(cryptoAddSavedAddressViewState2, snapshotState, snapshotState2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    CryptoAddSavedAddressComposable5.BottomBar(cryptoAddSavedAddressViewState, (Function0) objRememberedValue, modifierNavigationBarsPadding, composer, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, SnapshotState snapshotState, SnapshotState snapshotState2) {
                if (cryptoAddSavedAddressViewState.getContentState() instanceof CryptoAddSavedAddressViewState.ContentState.Loaded) {
                    CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$4(snapshotState2, new AddressAdditionBottomSheetState(CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$9(snapshotState), ((CryptoAddSavedAddressViewState.ContentState.Loaded) cryptoAddSavedAddressViewState.getContentState()).getApiCurrencyCode(), ((CryptoAddSavedAddressViewState.ContentState.Loaded) cryptoAddSavedAddressViewState.getContentState()).getCurrencyCode()));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1679018955, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ScaffoldComposable.<anonymous> (CryptoAddSavedAddressComposable.kt:121)");
            }
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null));
            final CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState = this.$state;
            final Function0<Unit> function0 = this.$onClickScan;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierImePadding, ComposableLambda3.rememberComposableLambda(501795975, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt.ScaffoldComposable.2.1
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
                        ComposerKt.traceEventStart(501795975, i2, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ScaffoldComposable.<anonymous>.<anonymous> (CryptoAddSavedAddressComposable.kt:126)");
                    }
                    boolean zIsLoading = cryptoAddSavedAddressViewState.isLoading();
                    CryptoAddSavedAddressComposable5.TopBar(cryptoAddSavedAddressViewState.getContentState().getPageTitle(), zIsLoading, function0, Modifier.INSTANCE, composer2, StringResource.$stable | 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), ComposableLambda3.rememberComposableLambda(1840288230, true, new AnonymousClass2(this.$state, this.$typedAddress$delegate, this.$showAddressAdditionBottomSheet$delegate), composer, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1562359076, true, new AnonymousClass3(this.$state, this.$showPasteLimitToast, this.$typedAddress$delegate), composer, 54), composer, 805306800, 504);
            AddressAdditionBottomSheetState addressAdditionBottomSheetStateScaffoldComposable$lambda$3 = CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$3(this.$showAddressAdditionBottomSheet$delegate);
            if (addressAdditionBottomSheetStateScaffoldComposable$lambda$3 != null) {
                final SnapshotState<AddressAdditionBottomSheetState> snapshotState = this.$showAddressAdditionBottomSheet$delegate;
                final SnapshotState<Boolean> snapshotState2 = this.$isSavingAddressBottomSheet$delegate;
                Activity activity = this.$activity;
                OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoAddSavedAddressComposable5.C381792.invoke$lambda$4$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(CryptoAddSavedAddressComposable5.C381792.invoke$lambda$4$lambda$3$lambda$2(snapshotState2, (SheetValue) obj));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue2, composer, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-527543862, true, new CryptoAddSavedAddressComposable6(addressAdditionBottomSheetStateScaffoldComposable$lambda$3, activity, onBackPressedDispatcher, snapshotState, snapshotState2), composer, 54), composer, 1572870, 54);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState) {
            CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$4(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, SheetValue targetSheetValue) {
            Intrinsics.checkNotNullParameter(targetSheetValue, "targetSheetValue");
            return (targetSheetValue == SheetValue.Hidden && CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$6(snapshotState)) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBar(final StringResource stringResource, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1593662883);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-1593662883, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.TopBar (CryptoAddSavedAddressComposable.kt:220)");
                }
                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1558688816, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt.TopBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1558688816, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.TopBar.<anonymous> (CryptoAddSavedAddressComposable.kt:224)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(stringResource, composer3, StringResource.$stable), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(1847623164, true, new C381812(current == null ? current.getOnBackPressedDispatcher() : null), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(479901051, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt.TopBar.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(479901051, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.TopBar.<anonymous> (CryptoAddSavedAddressComposable.kt:233)");
                        }
                        if (!z) {
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C37934R.string.crypto_add_saved_address_scan_action, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, null, false, null, composer3, 0, 120);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, ((i3 >> 6) & 112) | 12586374, 0, 1904);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAddSavedAddressComposable5.TopBar$lambda$14(stringResource, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            if (current2 == null) {
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1558688816, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt.TopBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1558688816, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.TopBar.<anonymous> (CryptoAddSavedAddressComposable.kt:224)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(stringResource, composer3, StringResource.$stable), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(1847623164, true, new C381812(current2 == null ? current2.getOnBackPressedDispatcher() : null), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(479901051, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt.TopBar.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(479901051, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.TopBar.<anonymous> (CryptoAddSavedAddressComposable.kt:233)");
                    }
                    if (!z) {
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C37934R.string.crypto_add_saved_address_scan_action, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, null, false, null, composer3, 0, 120);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, ((i3 >> 6) & 112) | 12586374, 0, 1904);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoAddSavedAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$TopBar$2 */
    static final class C381812 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ OnBackPressedDispatcher $onBack;

        C381812(OnBackPressedDispatcher onBackPressedDispatcher) {
            this.$onBack = onBackPressedDispatcher;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
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
                ComposerKt.traceEventStart(1847623164, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.TopBar.<anonymous> (CryptoAddSavedAddressComposable.kt:230)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$onBack);
            final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$TopBar$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoAddSavedAddressComposable5.C381812.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final CryptoAddSavedAddressViewState.ContentState.Loaded loaded, final String str, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1831596716);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(loaded) : composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1831596716, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.Content (CryptoAddSavedAddressComposable.kt:253)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Modifier modifierTestTag = TestTag3.testTag(companion2, TestTagCryptoAddSavedAddressCondensedInput);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                int maxAddressLength = loaded.getMaxAddressLength();
                long jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_page_input_label_text, composerStartRestartGroup, 0);
                StringResource placeholderText = loaded.getPlaceholderText();
                composerStartRestartGroup.startReplaceGroup(-1827555225);
                String textAsString = placeholderText != null ? null : StringResources6.getTextAsString(placeholderText, composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 896) != 256;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddSavedAddressComposable5.Content$lambda$17$lambda$16$lambda$15(function1, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoAddressTextInput2.m25245CryptoAddressTextInputCondensedIkByU14(str2, maxAddressLength, jM21427getFg30d7_KjU, (Function1) objRememberedValue, function02, modifierM5144paddingVpY3zN4$default, strStringResource, textAsString, true, composerStartRestartGroup, ((i3 >> 3) & 14) | 100663296 | ((i3 << 3) & 57344), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAddSavedAddressComposable5.Content$lambda$18(loaded, str, function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Modifier modifierTestTag2 = TestTag3.testTag(companion22, TestTagCryptoAddSavedAddressCondensedInput);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                int maxAddressLength2 = loaded.getMaxAddressLength();
                long jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU();
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_page_input_label_text, composerStartRestartGroup, 0);
                StringResource placeholderText2 = loaded.getPlaceholderText();
                composerStartRestartGroup.startReplaceGroup(-1827555225);
                if (placeholderText2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 896) != 256) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddSavedAddressComposable5.Content$lambda$17$lambda$16$lambda$15(function1, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoAddressTextInput2.m25245CryptoAddressTextInputCondensedIkByU14(str2, maxAddressLength2, jM21427getFg30d7_KjU2, (Function1) objRememberedValue, function02, modifierM5144paddingVpY3zN4$default2, strStringResource2, textAsString, true, composerStartRestartGroup, ((i3 >> 3) & 14) | 100663296 | ((i3 << 3) & 57344), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$17$lambda$16$lambda$15(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(SanitizeCryptoAddress.sanitizeCryptoAddress(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomBar(final CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1492199673);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cryptoAddSavedAddressViewState) : composerStartRestartGroup.changedInstance(cryptoAddSavedAddressViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1492199673, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.BottomBar (CryptoAddSavedAddressComposable.kt:284)");
                    }
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C37934R.string.crypto_add_saved_address_save_address_cta_v2, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(modifier4, cryptoAddSavedAddressViewState.isLoading(), null, 2, null), null, null, !cryptoAddSavedAddressViewState.isLoading(), false, null, null, null, null, false, null, composer2, (i3 >> 3) & 14, 0, 8152);
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
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoAddSavedAddressComposable5.BottomBar$lambda$19(cryptoAddSavedAddressViewState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C37934R.string.crypto_add_saved_address_save_address_cta_v2, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(modifier4, cryptoAddSavedAddressViewState.isLoading(), null, 2, null), null, null, !cryptoAddSavedAddressViewState.isLoading(), false, null, null, null, null, false, null, composer2, (i3 >> 3) & 14, 0, 8152);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void LoadedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1029426000);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1029426000, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.LoadedPreview (CryptoAddSavedAddressComposable.kt:295)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, CryptoAddSavedAddressComposable2.INSTANCE.getLambda$1585300632$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoAddSavedAddressComposable5.LoadedPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LoadingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-453028565);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453028565, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.LoadingPreview (CryptoAddSavedAddressComposable.kt:317)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, CryptoAddSavedAddressComposable2.INSTANCE.m25066getLambda$400784157$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoAddSavedAddressComposable5.LoadingPreview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
