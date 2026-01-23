package com.robinhood.shared.crypto.transfer.send.address.saved;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressBottomSheetEvent;
import com.robinhood.utils.resource.StringResource;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SaveAddressSheetContent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u000e\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\u0012\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002"}, m3636d2 = {"SaveAddressSheetContent", "", "currencyCode", "", PlaceTypes.ADDRESS, "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "onDismiss", "Lkotlin/Function0;", "onSavingStateChange", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "onAddressSaved", "(Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shortenedAddress", "fullAddress", "apiCurrencyCode", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetDuxo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/SaveAddressBottomSheetEvent;", "nickname", "errorMessage", "Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SaveAddressSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveAddressSheetContent$lambda$2(String str, UiSavedAddress uiSavedAddress, Function0 function0, Function1 function1, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SaveAddressSheetContent(str, uiSavedAddress, function0, function1, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveAddressSheetContent$lambda$23(String str, String str2, String str3, String str4, Function0 function0, Function1 function1, Modifier modifier, Function0 function02, SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SaveAddressSheetContent(str, str2, str3, str4, function0, function1, modifier, function02, saveAddressBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SaveAddressSheetContent(final String currencyCode, final UiSavedAddress address, final Function0<Unit> onDismiss, final Function1<? super Boolean, Unit> onSavingStateChange, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int i4;
        final Function0<Unit> function02;
        Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSavingStateChange, "onSavingStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-268710409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currencyCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(address) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSavingStateChange) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-268710409, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContent (SaveAddressSheetContent.kt:48)");
                    }
                    int i6 = i3;
                    Modifier modifier5 = modifier4;
                    int i7 = (i6 << 9) & 7168;
                    int i8 = i6 << 6;
                    SaveAddressSheetContent(address.getShortenedAddress(), address.getAddress(), address.getCurrencyCode(), currencyCode, onDismiss, onSavingStateChange, modifier5, function03, null, composerStartRestartGroup, i7 | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128), 256);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function02 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SaveAddressSheetContent.SaveAddressSheetContent$lambda$2(currencyCode, address, onDismiss, onSavingStateChange, modifier3, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i62 = i3;
                Modifier modifier52 = modifier4;
                int i72 = (i62 << 9) & 7168;
                int i82 = i62 << 6;
                SaveAddressSheetContent(address.getShortenedAddress(), address.getAddress(), address.getCurrencyCode(), currencyCode, onDismiss, onSavingStateChange, modifier52, function03, null, composerStartRestartGroup, i72 | (57344 & i82) | (458752 & i82) | (3670016 & i82) | (i82 & 29360128), 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                function02 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void SaveAddressSheetContent(final String shortenedAddress, String str, String apiCurrencyCode, final String currencyCode, final Function0<Unit> onDismiss, final Function1<? super Boolean, Unit> onSavingStateChange, Modifier modifier, Function0<Unit> function0, SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Function0<Unit> function02;
        SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo2;
        Function0<Unit> function03;
        int i4;
        int i5;
        SnapshotMutationPolicy snapshotMutationPolicy;
        final SnapshotState snapshotState;
        boolean z;
        final String str2;
        final SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo3;
        final Function0<Unit> function04;
        final Modifier modifier3;
        EventConsumer<SaveAddressBottomSheetEvent> eventConsumerInvoke;
        EventConsumer<SaveAddressBottomSheetEvent> eventConsumerInvoke2;
        final String fullAddress = str;
        Intrinsics.checkNotNullParameter(shortenedAddress, "shortenedAddress");
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(apiCurrencyCode, "apiCurrencyCode");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSavingStateChange, "onSavingStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(140937204);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(shortenedAddress) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(fullAddress) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(apiCurrencyCode) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(currencyCode) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSavingStateChange) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 |= 12582912;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            if ((i2 & 256) == 0) {
                saveAddressBottomSheetDuxo2 = saveAddressBottomSheetDuxo;
                int i8 = composerStartRestartGroup.changedInstance(saveAddressBottomSheetDuxo2) ? 67108864 : 33554432;
                i3 |= i8;
            } else {
                saveAddressBottomSheetDuxo2 = saveAddressBottomSheetDuxo;
            }
            i3 |= i8;
        } else {
            saveAddressBottomSheetDuxo2 = saveAddressBottomSheetDuxo;
        }
        int i9 = i3;
        if ((i9 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = apiCurrencyCode;
            modifier3 = modifier2;
            function04 = function02;
            saveAddressBottomSheetDuxo3 = saveAddressBottomSheetDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function03 = (Function0) objRememberedValue;
                } else {
                    function03 = function02;
                }
                if ((i2 & 256) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    Modifier modifier5 = modifier4;
                    i4 = 2;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SaveAddressBottomSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$duxo$1.1
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
                    i9 &= -234881025;
                    modifier2 = modifier5;
                    saveAddressBottomSheetDuxo2 = (SaveAddressBottomSheetDuxo) baseDuxo;
                } else {
                    Modifier modifier6 = modifier4;
                    i4 = 2;
                    modifier2 = modifier6;
                }
                i5 = i9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 256) != 0) {
                    i9 &= -234881025;
                }
                function03 = function02;
                i5 = i9;
                i4 = 2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(140937204, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContent (SaveAddressSheetContent.kt:72)");
            }
            int i10 = i5;
            final SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo4 = saveAddressBottomSheetDuxo2;
            Modifier modifier7 = modifier2;
            final Function0<Unit> function05 = function03;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(saveAddressBottomSheetDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<SaveAddressBottomSheetEvent>> eventFlow = saveAddressBottomSheetDuxo4.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "SaveAddressSheetContent.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof SaveAddressBottomSheetEvent) {
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
            Event<SaveAddressBottomSheetEvent> value = eventFlow.getValue();
            Event<SaveAddressBottomSheetEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof SaveAddressBottomSheetEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue3 = SnapshotState3.mutableStateOf$default("", null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                snapshotMutationPolicy = null;
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Boolean boolValueOf = Boolean.valueOf(SaveAddressSheetContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).isSavingAddress());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = ((i10 & 458752) == 131072) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new SaveAddressSheetContent2(onSavingStateChange, snapshotState4CollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            final Event<SaveAddressBottomSheetEvent> eventSaveAddressSheetContent$lambda$6 = SaveAddressSheetContent$lambda$6(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSaveAddressSheetContent$lambda$6 != null) {
                if ((eventSaveAddressSheetContent$lambda$6.getData() instanceof SaveAddressBottomSheetEvent.Success) && (eventConsumerInvoke2 = eventSaveAddressSheetContent$lambda$6.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventSaveAddressSheetContent$lambda$6, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25088invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25088invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function05.invoke();
                            onDismiss.invoke();
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            final Event<SaveAddressBottomSheetEvent> eventSaveAddressSheetContent$lambda$62 = SaveAddressSheetContent$lambda$6(snapshotState4CollectAsStateWithLifecycle2);
            if (eventSaveAddressSheetContent$lambda$62 != null) {
                if ((eventSaveAddressSheetContent$lambda$62.getData() instanceof SaveAddressBottomSheetEvent.Error) && (eventConsumerInvoke = eventSaveAddressSheetContent$lambda$62.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventSaveAddressSheetContent$lambda$62, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$SaveAddressSheetContent$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25089invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25089invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState3.setValue(((SaveAddressBottomSheetEvent.Error) eventSaveAddressSheetContent$lambda$62.getData()).getErrorMessage());
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier7);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i11 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_save_address_bottom_sheet_heading_v2, new Object[]{currencyCode}, composerStartRestartGroup, 0);
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i11).getDisplayCapsuleSmall();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8120);
            BentoText2.m20747BentoText38GnDrw(shortenedAddress, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i11).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i11).getTextM(), composerStartRestartGroup, i10 & 14, 0, 8120);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strSaveAddressSheetContent$lambda$8 = SaveAddressSheetContent$lambda$8(snapshotState2);
            String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_save_address_bottom_sheet_placeholder, composerStartRestartGroup, 0);
            StringResource stringResourceSaveAddressSheetContent$lambda$11 = SaveAddressSheetContent$lambda$11(snapshotState3);
            composerStartRestartGroup.startReplaceGroup(1079881595);
            BentoTextInput8.Message.Error error = stringResourceSaveAddressSheetContent$lambda$11 == null ? null : new BentoTextInput8.Message.Error(StringResource2.getString(stringResourceSaveAddressSheetContent$lambda$11, composerStartRestartGroup, StringResource.$stable));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                snapshotState = snapshotState2;
                objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SaveAddressSheetContent.SaveAddressSheetContent$lambda$22$lambda$18$lambda$17(snapshotState, snapshotState3, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                snapshotState = snapshotState2;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(strSaveAddressSheetContent$lambda$8, (Function1) objRememberedValue6, modifierM5144paddingVpY3zN4$default, null, strStringResource2, null, error, null, null, null, null, null, null, false, false, composerStartRestartGroup, (BentoTextInput8.Message.Error.$stable << 18) | 48, 0, 32680);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 7, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String str3 = SaveAddressSheetContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).isAllowlistEnabled() ? "allowlisted_address_bottom_sheet" : "saved_address_bottom_sheet";
            Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CANCEL;
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            final SnapshotState snapshotState4 = snapshotState;
            BentoButtonKt.m20586BentoButtonEikTQX8(onDismiss, StringResources_androidKt.stringResource(C37934R.string.crypto_save_address_bottom_sheet_cancel_button, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(modifierWeight$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, action, null, new Component(componentType, str3, null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null), null, BentoButtons.Type.Secondary, SaveAddressSheetContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).isCancelButtonEnabled(), false, null, null, null, null, false, null, composerStartRestartGroup, ((i10 >> 12) & 14) | 24576, 0, 8136);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, C2002Dp.m7995constructorimpl(12)), composerStartRestartGroup, 6);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 11, null), 1.0f, false, 2, null), UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SAVE, null, new Component(componentType, str3, null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
            String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_save_address_bottom_sheet_save_button, composerStartRestartGroup, 0);
            boolean zIsSavingAddress = SaveAddressSheetContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).isSavingAddress();
            boolean z2 = SaveAddressSheetContent$lambda$8(snapshotState4).length() > 0;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(saveAddressBottomSheetDuxo4) | ((i10 & 112) == 32) | ((i10 & 896) == 256);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                fullAddress = str;
                z = z2;
                str2 = apiCurrencyCode;
                objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveAddressSheetContent.SaveAddressSheetContent$lambda$22$lambda$21$lambda$20$lambda$19(saveAddressBottomSheetDuxo4, fullAddress, str2, snapshotState4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                fullAddress = str;
                z = z2;
                str2 = apiCurrencyCode;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue7, strStringResource3, modifierAutoLogEvents$default, null, null, z, zIsSavingAddress, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8088);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            saveAddressBottomSheetDuxo3 = saveAddressBottomSheetDuxo4;
            function04 = function05;
            modifier3 = modifier7;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str4 = fullAddress;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SaveAddressSheetContent.SaveAddressSheetContent$lambda$23(shortenedAddress, str4, str2, currencyCode, onDismiss, onSavingStateChange, modifier3, function04, saveAddressBottomSheetDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final StringResource SaveAddressSheetContent$lambda$11(SnapshotState<StringResource> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveAddressBottomSheetViewState SaveAddressSheetContent$lambda$5(SnapshotState4<SaveAddressBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<SaveAddressBottomSheetEvent> SaveAddressSheetContent$lambda$6(SnapshotState4<Event<SaveAddressBottomSheetEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final String SaveAddressSheetContent$lambda$8(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveAddressSheetContent$lambda$22$lambda$18$lambda$17(SnapshotState snapshotState, SnapshotState snapshotState2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        snapshotState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveAddressSheetContent$lambda$22$lambda$21$lambda$20$lambda$19(SaveAddressBottomSheetDuxo saveAddressBottomSheetDuxo, String str, String str2, SnapshotState snapshotState) {
        saveAddressBottomSheetDuxo.saveAddress(str, str2, SaveAddressSheetContent$lambda$8(snapshotState));
        return Unit.INSTANCE;
    }
}
