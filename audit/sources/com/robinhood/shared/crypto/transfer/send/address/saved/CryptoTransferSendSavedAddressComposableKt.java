package com.robinhood.shared.crypto.transfer.send.address.saved;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.compose.bento.component.BentoToast3;
import com.robinhood.compose.bento.component.BentoToast4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.textinput.CryptoAddressTextInput2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoTransferSendSavedAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001aÉ\u0001\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000f2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0(2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010*\u001a\u0087\u0001\u0010+\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000f2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0(2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010,\u001a_\u0010-\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\u0012\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"INITIAL_TOOLBAR_PROGRESS", "", "TestTagAddressLazyList", "", "ExpandCtaItemKey", "TestTagAddressInput", "TestTagLoadingSpinner", "TestTagBackButton", "CryptoTransferSendSavedAddressComposable", "", "callbacks", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;", "isProtectionSheetLoading", "", "onContinueClicked", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo;", "(Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo;Landroidx/compose/runtime/Composer;II)V", "AddressDetails", "savedAddress", "requestFocusIntoAddressInput", "showSavedAddressLoadingSpinner", "maxLimit", "", "currencyCode", "shouldShowAddressLists", CryptoTransferSendSavedAddressComposableKt.ExpandCtaItemKey, "onShowAllRecentAddresses", "Lkotlin/Function0;", "savedAddressesList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "recentAddressesList", "showPasteLimitToast", "onAddressChange", "onAddressRowClick", "deleteSavedAddress", "Lkotlin/Function2;", "Ljava/util/UUID;", "(Ljava/lang/String;ZZILjava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "AddressesList", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SendSavedAddressToolbar", "shouldShowScanTooltipSavedAddresses", "onScanClick", "onBackClick", "markScanTooltipSavedAddressesAsSeen", "makeScanTooltipSavedAddressesDisappear", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressEvent;", "shouldLogFirstAddressInput"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferSendSavedAddressComposableKt {
    public static final String ExpandCtaItemKey = "showExpandRecentAddressesCta";
    private static final float INITIAL_TOOLBAR_PROGRESS = 0.33f;
    public static final String TestTagAddressInput = "AddressInput";
    public static final String TestTagAddressLazyList = "AddressLazyList";
    public static final String TestTagBackButton = "BackButton";
    public static final String TestTagLoadingSpinner = "LoadingSpinner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressDetails$lambda$15(String str, boolean z, boolean z2, int i, String str2, boolean z3, boolean z4, Function0 function0, ImmutableList immutableList, ImmutableList immutableList2, Function0 function02, Function1 function1, Function1 function12, Function2 function2, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) throws Resources.NotFoundException {
        AddressDetails(str, z, z2, i, str2, z3, z4, function0, immutableList, immutableList2, function02, function1, function12, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressesList$lambda$23(String str, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, Function0 function0, Function1 function1, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddressesList(str, immutableList, immutableList2, z, z2, function0, function1, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendSavedAddressComposable$lambda$7(CryptoTransferSendAddressFragment.Callbacks callbacks, boolean z, Function1 function1, Modifier modifier, CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendSavedAddressComposable(callbacks, z, function1, modifier, cryptoTransferSendSavedAddressDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SendSavedAddressToolbar$lambda$25(String str, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SendSavedAddressToolbar(str, z, function0, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CryptoTransferSendSavedAddressComposable$lambda$6$lambda$5(final CryptoTransferSendAddressFragment.Callbacks callbacks, final SnapshotState4 snapshotState4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                callbacks.saveLastEnteredAddress(CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(snapshotState4).getAddress());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AddressDetails$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferSendSavedAddressViewState CryptoTransferSendSavedAddressComposable$lambda$0(SnapshotState4<CryptoTransferSendSavedAddressViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferSendSavedAddressEvent> CryptoTransferSendSavedAddressComposable$lambda$1(SnapshotState4<Event<CryptoTransferSendSavedAddressEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendSavedAddressComposable(CryptoTransferSendAddressFragment.Callbacks callbacks, final boolean z, final Function1<? super String, Unit> onContinueClicked, Modifier modifier, CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo2;
        int i4;
        Modifier modifier3;
        int i5;
        int i6;
        CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo3;
        Event<CryptoTransferSendSavedAddressEvent> event;
        int i7;
        final BentoToast2 current;
        final String textAsString;
        final String textAsString2;
        final Event<CryptoTransferSendSavedAddressEvent> eventCryptoTransferSendSavedAddressComposable$lambda$1;
        final Event<CryptoTransferSendSavedAddressEvent> eventCryptoTransferSendSavedAddressComposable$lambda$12;
        int i8;
        int i9;
        Object objRememberedValue;
        final Modifier modifier4;
        final CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo4;
        EventConsumer<CryptoTransferSendSavedAddressEvent> eventConsumerInvoke;
        EventConsumer<CryptoTransferSendSavedAddressEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final CryptoTransferSendAddressFragment.Callbacks callbacks2 = callbacks;
        Intrinsics.checkNotNullParameter(callbacks2, "callbacks");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1918036554);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks2) : composerStartRestartGroup.changedInstance(callbacks2) ? 4 : 2) | i;
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
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoTransferSendSavedAddressDuxo2 = cryptoTransferSendSavedAddressDuxo;
                    int i11 = composerStartRestartGroup.changedInstance(cryptoTransferSendSavedAddressDuxo2) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    cryptoTransferSendSavedAddressDuxo2 = cryptoTransferSendSavedAddressDuxo;
                }
                i3 |= i11;
            } else {
                cryptoTransferSendSavedAddressDuxo2 = cryptoTransferSendSavedAddressDuxo;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferSendSavedAddressDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$duxo$1.1
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
                        i6 = i4 & (-57345);
                        cryptoTransferSendSavedAddressDuxo3 = (CryptoTransferSendSavedAddressDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1918036554, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposable (CryptoTransferSendSavedAddressComposable.kt:90)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendSavedAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<CryptoTransferSendSavedAddressEvent>> eventFlow = cryptoTransferSendSavedAddressDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendSavedAddressComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoTransferSendSavedAddressEvent) {
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
                    Event<CryptoTransferSendSavedAddressEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoTransferSendSavedAddressEvent)) {
                        value = null;
                    }
                    i7 = i6;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    EventLogger current3 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    current = BentoToast4.getLocalBentoToastHost().getCurrent(composerStartRestartGroup, BentoToast3.$stable);
                    StringResource.Companion companion = StringResource.INSTANCE;
                    StringResource stringResourceInvoke = companion.invoke(C37934R.string.delete_saved_address_alert_dialog_error_toast, new Object[i5]);
                    int i12 = StringResource.$stable;
                    textAsString = StringResources6.getTextAsString(stringResourceInvoke, composerStartRestartGroup, i12);
                    textAsString2 = StringResources6.getTextAsString(companion.invoke(C37934R.string.crypto_saved_addresses_refresh_address_lists_error, new Object[i5]), composerStartRestartGroup, i12);
                    CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo5 = cryptoTransferSendSavedAddressDuxo3;
                    Modifier modifier5 = modifier3;
                    int i13 = i5;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(1021004658, true, new C382361(callbacks2, appCompatActivityRequireActivityBaseContext, cryptoTransferSendSavedAddressDuxo3, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(53043729, true, new C382372(userInteractionEventDescriptor, current3, softwareKeyboardController, onContinueClicked, snapshotState4CollectAsStateWithLifecycle, z2), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-50710649, true, new C382383(cryptoTransferSendSavedAddressDuxo3, current, StringResources6.getTextAsString(companion.invoke(C37934R.string.saved_addresses_paste_limit_error_text, new Object[i5]), composerStartRestartGroup, i12), snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306800, 504);
                    composerStartRestartGroup = composerStartRestartGroup;
                    eventCryptoTransferSendSavedAddressComposable$lambda$1 = CryptoTransferSendSavedAddressComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoTransferSendSavedAddressComposable$lambda$1 != null && (eventCryptoTransferSendSavedAddressComposable$lambda$1.getData() instanceof CryptoTransferSendSavedAddressEvent.FetchAddressListsError) && (eventConsumerInvoke2 = eventCryptoTransferSendSavedAddressComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventCryptoTransferSendSavedAddressComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25082invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25082invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BentoToast2.showToast$default(current, textAsString2, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$4$1
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
                    eventCryptoTransferSendSavedAddressComposable$lambda$12 = CryptoTransferSendSavedAddressComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoTransferSendSavedAddressComposable$lambda$12 != null && (eventCryptoTransferSendSavedAddressComposable$lambda$12.getData() instanceof CryptoTransferSendSavedAddressEvent.DeleteSavedAddressAlertError) && (eventConsumerInvoke = eventCryptoTransferSendSavedAddressComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoTransferSendSavedAddressComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25083invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25083invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BentoToast2.showToast$default(current, textAsString, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$5$1
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
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i7 & 14) != 4) {
                        if ((i7 & 8) != 0) {
                            callbacks2 = callbacks;
                            if (composerStartRestartGroup.changedInstance(callbacks2)) {
                            }
                            i9 = (composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) ? 1 : 0) | i8;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$6$lambda$5(callbacks2, snapshotState4CollectAsStateWithLifecycle, (DisposableEffectScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            cryptoTransferSendSavedAddressDuxo4 = cryptoTransferSendSavedAddressDuxo5;
                        } else {
                            callbacks2 = callbacks;
                        }
                        i8 = i13;
                        i9 = (composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) ? 1 : 0) | i8;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i9 != 0) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$6$lambda$5(callbacks2, snapshotState4CollectAsStateWithLifecycle, (DisposableEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier5;
                            cryptoTransferSendSavedAddressDuxo4 = cryptoTransferSendSavedAddressDuxo5;
                        }
                    } else {
                        callbacks2 = callbacks;
                    }
                    i8 = 1;
                    i9 = (composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) ? 1 : 0) | i8;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i9 != 0) {
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                i5 = 0;
                i6 = i4;
                cryptoTransferSendSavedAddressDuxo3 = cryptoTransferSendSavedAddressDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendSavedAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoTransferSendSavedAddressDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendSavedAddressComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSendSavedAddressEvent) {
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
                Event<CryptoTransferSendSavedAddressEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoTransferSendSavedAddressEvent)) {
                }
                i7 = i6;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                EventLogger current32 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                AppCompatActivity appCompatActivityRequireActivityBaseContext2 = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                current = BentoToast4.getLocalBentoToastHost().getCurrent(composerStartRestartGroup, BentoToast3.$stable);
                StringResource.Companion companion2 = StringResource.INSTANCE;
                StringResource stringResourceInvoke2 = companion2.invoke(C37934R.string.delete_saved_address_alert_dialog_error_toast, new Object[i5]);
                int i122 = StringResource.$stable;
                textAsString = StringResources6.getTextAsString(stringResourceInvoke2, composerStartRestartGroup, i122);
                textAsString2 = StringResources6.getTextAsString(companion2.invoke(C37934R.string.crypto_saved_addresses_refresh_address_lists_error, new Object[i5]), composerStartRestartGroup, i122);
                CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo52 = cryptoTransferSendSavedAddressDuxo3;
                Modifier modifier52 = modifier3;
                int i132 = i5;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(1021004658, true, new C382361(callbacks2, appCompatActivityRequireActivityBaseContext2, cryptoTransferSendSavedAddressDuxo3, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(53043729, true, new C382372(userInteractionEventDescriptor2, current32, softwareKeyboardController2, onContinueClicked, snapshotState4CollectAsStateWithLifecycle3, z2), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-50710649, true, new C382383(cryptoTransferSendSavedAddressDuxo3, current, StringResources6.getTextAsString(companion2.invoke(C37934R.string.saved_addresses_paste_limit_error_text, new Object[i5]), composerStartRestartGroup, i122), snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306800, 504);
                composerStartRestartGroup = composerStartRestartGroup;
                eventCryptoTransferSendSavedAddressComposable$lambda$1 = CryptoTransferSendSavedAddressComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoTransferSendSavedAddressComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventCryptoTransferSendSavedAddressComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25082invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25082invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BentoToast2.showToast$default(current, textAsString2, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$4$1
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
                eventCryptoTransferSendSavedAddressComposable$lambda$12 = CryptoTransferSendSavedAddressComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoTransferSendSavedAddressComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventCryptoTransferSendSavedAddressComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25083invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25083invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BentoToast2.showToast$default(current, textAsString, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0<Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$5$1
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
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i7 & 14) != 4) {
                }
                i8 = 1;
                i9 = (composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle3) ? 1 : 0) | i8;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i9 != 0) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTransferSendSavedAddressDuxo4 = cryptoTransferSendSavedAddressDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$7(callbacks2, z, onContinueClicked, modifier4, cryptoTransferSendSavedAddressDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i10 == 0) {
                }
                if ((i2 & 16) == 0) {
                    i5 = 0;
                    i6 = i4;
                    cryptoTransferSendSavedAddressDuxo3 = cryptoTransferSendSavedAddressDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferSendSavedAddressDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow22 = cryptoTransferSendSavedAddressDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoTransferSendSavedAddressComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoTransferSendSavedAddressEvent) {
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
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoTransferSendSavedAddressEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoTransferSendSavedAddressEvent)) {
                }
                i7 = i6;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                EventLogger current322 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                SoftwareKeyboardController softwareKeyboardController22 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                AppCompatActivity appCompatActivityRequireActivityBaseContext22 = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                current = BentoToast4.getLocalBentoToastHost().getCurrent(composerStartRestartGroup, BentoToast3.$stable);
                StringResource.Companion companion22 = StringResource.INSTANCE;
                StringResource stringResourceInvoke22 = companion22.invoke(C37934R.string.delete_saved_address_alert_dialog_error_toast, new Object[i5]);
                int i1222 = StringResource.$stable;
                textAsString = StringResources6.getTextAsString(stringResourceInvoke22, composerStartRestartGroup, i1222);
                textAsString2 = StringResources6.getTextAsString(companion22.invoke(C37934R.string.crypto_saved_addresses_refresh_address_lists_error, new Object[i5]), composerStartRestartGroup, i1222);
                CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo522 = cryptoTransferSendSavedAddressDuxo3;
                Modifier modifier522 = modifier3;
                int i1322 = i5;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier522, ComposableLambda3.rememberComposableLambda(1021004658, true, new C382361(callbacks2, appCompatActivityRequireActivityBaseContext22, cryptoTransferSendSavedAddressDuxo3, snapshotState4CollectAsStateWithLifecycle32), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(53043729, true, new C382372(userInteractionEventDescriptor22, current322, softwareKeyboardController22, onContinueClicked, snapshotState4CollectAsStateWithLifecycle32, z2), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-50710649, true, new C382383(cryptoTransferSendSavedAddressDuxo3, current, StringResources6.getTextAsString(companion22.invoke(C37934R.string.saved_addresses_paste_limit_error_text, new Object[i5]), composerStartRestartGroup, i1222), snapshotState4CollectAsStateWithLifecycle32), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306800, 504);
                composerStartRestartGroup = composerStartRestartGroup;
                eventCryptoTransferSendSavedAddressComposable$lambda$1 = CryptoTransferSendSavedAddressComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoTransferSendSavedAddressComposable$lambda$1 != null) {
                }
                eventCryptoTransferSendSavedAddressComposable$lambda$12 = CryptoTransferSendSavedAddressComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoTransferSendSavedAddressComposable$lambda$12 != null) {
                }
                Unit unit22 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i7 & 14) != 4) {
                }
                i8 = 1;
                i9 = (composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle32) ? 1 : 0) | i8;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i9 != 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoTransferSendSavedAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$1 */
    static final class C382361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ CryptoTransferSendAddressFragment.Callbacks $callbacks;
        final /* synthetic */ CryptoTransferSendSavedAddressDuxo $duxo;
        final /* synthetic */ SnapshotState4<CryptoTransferSendSavedAddressViewState> $viewState$delegate;

        C382361(CryptoTransferSendAddressFragment.Callbacks callbacks, AppCompatActivity appCompatActivity, CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, SnapshotState4<CryptoTransferSendSavedAddressViewState> snapshotState4) {
            this.$callbacks = callbacks;
            this.$activity = appCompatActivity;
            this.$duxo = cryptoTransferSendSavedAddressDuxo;
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(1021004658, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposable.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:112)");
            }
            String currencyCode = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getCurrencyCode();
            boolean shouldShowScanTooltipSavedAddresses = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getShouldShowScanTooltipSavedAddresses();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final CryptoTransferSendAddressFragment.Callbacks callbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendSavedAddressComposableKt.C382361.invoke$lambda$1$lambda$0(callbacks);
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
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendSavedAddressComposableKt.C382361.invoke$lambda$3$lambda$2(appCompatActivity);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
            final CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo = this.$duxo;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendSavedAddressComposableKt.C382361.invoke$lambda$5$lambda$4(cryptoTransferSendSavedAddressDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(this.$duxo);
            final CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo2 = this.$duxo;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendSavedAddressComposableKt.C382361.invoke$lambda$7$lambda$6(cryptoTransferSendSavedAddressDuxo2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            CryptoTransferSendSavedAddressComposableKt.SendSavedAddressToolbar(currencyCode, shouldShowScanTooltipSavedAddresses, function0, function02, function03, (Function0) objRememberedValue4, null, composer, 0, 64);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo) {
            cryptoTransferSendSavedAddressDuxo.markScanTooltipSavedAddressesAsSeen();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo) {
            cryptoTransferSendSavedAddressDuxo.makeScanTooltipSavedAddressesDisappear();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTransferSendSavedAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$3 */
    static final class C382383 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CryptoTransferSendSavedAddressDuxo $duxo;
        final /* synthetic */ String $pasteLimitErrorToastText;
        final /* synthetic */ BentoToast2 $toastHost;
        final /* synthetic */ SnapshotState4<CryptoTransferSendSavedAddressViewState> $viewState$delegate;

        C382383(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, BentoToast2 bentoToast2, String str, SnapshotState4<CryptoTransferSendSavedAddressViewState> snapshotState4) {
            this.$duxo = cryptoTransferSendSavedAddressDuxo;
            this.$toastHost = bentoToast2;
            this.$pasteLimitErrorToastText = str;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) throws Resources.NotFoundException {
            int i2;
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(contentPadding) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-50710649, i2, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposable.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:131)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, contentPadding), 0.0f, 1, null);
            String address = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getAddress();
            CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(cryptoTransferSendSavedAddressDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C38239x21588aa4(cryptoTransferSendSavedAddressDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            boolean shouldRequestFocus = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getShouldRequestFocus();
            int maxAddressLength = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getMaxAddressLength();
            boolean showSavedAddressLoadingSpinner = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getShowSavedAddressLoadingSpinner();
            String currencyCode = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getCurrencyCode();
            ImmutableList<UiSavedAddress> savedAddressesList = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getSavedAddressesList();
            ImmutableList<UiSavedAddress> recentAddressesList = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getRecentAddressesList();
            boolean shouldShowAddressLists = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getShouldShowAddressLists();
            boolean showExpandRecentAddressesCta = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).getShowExpandRecentAddressesCta();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
            final CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo2 = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendSavedAddressComposableKt.C382383.invoke$lambda$2$lambda$1(cryptoTransferSendSavedAddressDuxo2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(this.$toastHost) | composer.changed(this.$pasteLimitErrorToastText);
            final BentoToast2 bentoToast2 = this.$toastHost;
            final String str = this.$pasteLimitErrorToastText;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendSavedAddressComposableKt.C382383.invoke$lambda$5$lambda$4(bentoToast2, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            Function1 function1 = (Function1) kFunction;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(this.$duxo);
            final CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo3 = this.$duxo;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSendSavedAddressComposableKt.C382383.invoke$lambda$7$lambda$6(cryptoTransferSendSavedAddressDuxo3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function12 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(this.$duxo);
            final CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo4 = this.$duxo;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$3$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendSavedAddressComposableKt.C382383.invoke$lambda$9$lambda$8(cryptoTransferSendSavedAddressDuxo4, (UUID) obj, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            CryptoTransferSendSavedAddressComposableKt.AddressDetails(address, shouldRequestFocus, showSavedAddressLoadingSpinner, maxAddressLength, currencyCode, shouldShowAddressLists, showExpandRecentAddressesCta, function0, savedAddressesList, recentAddressesList, function02, function1, function12, (Function2) objRememberedValue5, modifierFillMaxSize$default, composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo) {
            cryptoTransferSendSavedAddressDuxo.showAllRecentAddresses();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, UUID id, String currencyCode) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            cryptoTransferSendSavedAddressDuxo.deleteSavedAddress(id, currencyCode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(BentoToast2 bentoToast2, String str) {
            BentoToast2.showToast$default(bentoToast2, str, -1, ServerToBentoAssetMapper2.INFO_24, null, new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, false, 32, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, String address) {
            Intrinsics.checkNotNullParameter(address, "address");
            cryptoTransferSendSavedAddressDuxo.changeAddress(address);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTransferSendSavedAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$2 */
    static final class C382372 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isProtectionSheetLoading;
        final /* synthetic */ SoftwareKeyboardController $keyboardController;
        final /* synthetic */ Function1<String, Unit> $onContinueClicked;
        final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventData;
        final /* synthetic */ SnapshotState4<CryptoTransferSendSavedAddressViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C382372(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SoftwareKeyboardController softwareKeyboardController, Function1<? super String, Unit> function1, SnapshotState4<CryptoTransferSendSavedAddressViewState> snapshotState4, boolean z) {
            this.$userInteractionEventData = userInteractionEventDescriptor;
            this.$eventLogger = eventLogger;
            this.$keyboardController = softwareKeyboardController;
            this.$onContinueClicked = function1;
            this.$viewState$delegate = snapshotState4;
            this.$isProtectionSheetLoading = z;
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
                ComposerKt.traceEventStart(53043729, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposable.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:169)");
            }
            if (CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).isContinueVisible()) {
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()));
                boolean zIsContinueEnabled = CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(this.$viewState$delegate).isContinueEnabled();
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$userInteractionEventData) | composer.changedInstance(this.$eventLogger) | composer.changed(this.$keyboardController) | composer.changed(this.$onContinueClicked) | composer.changed(this.$viewState$delegate);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$userInteractionEventData;
                final EventLogger eventLogger = this.$eventLogger;
                final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                final Function1<String, Unit> function1 = this.$onContinueClicked;
                final SnapshotState4<CryptoTransferSendSavedAddressViewState> snapshotState4 = this.$viewState$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$CryptoTransferSendSavedAddressComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferSendSavedAddressComposableKt.C382372.invoke$lambda$1$lambda$0(userInteractionEventDescriptor, eventLogger, softwareKeyboardController, function1, snapshotState4);
                        }
                    };
                    composer.updateRememberedValue(function0);
                    objRememberedValue = function0;
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierNavigationBarsPadding, null, null, zIsContinueEnabled, this.$isProtectionSheetLoading, null, null, null, null, false, null, composer, 0, 0, 8088);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SoftwareKeyboardController softwareKeyboardController, Function1 function1, SnapshotState4 snapshotState4) {
            Screen screen = userInteractionEventDescriptor.getScreen();
            com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor.getContext();
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.REVIEW, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, context, false, 40, null);
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            function1.invoke(CryptoTransferSendSavedAddressComposableKt.CryptoTransferSendSavedAddressComposable$lambda$0(snapshotState4).getAddress());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressDetails(final String str, final boolean z, final boolean z2, final int i, final String str2, final boolean z3, final boolean z4, final Function0<Unit> function0, final ImmutableList<UiSavedAddress> immutableList, final ImmutableList<UiSavedAddress> immutableList2, final Function0<Unit> function02, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function2<? super UUID, ? super String, Unit> function2, Modifier modifier, Composer composer, final int i2, final int i3, final int i4) throws Resources.NotFoundException {
        String str3;
        int i5;
        boolean z5;
        String str4;
        boolean z6;
        int i6;
        int i7;
        int i8;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z7;
        Object objRememberedValue2;
        Composer composer2;
        EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(661548567);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i2 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                z5 = z;
                i5 |= composerStartRestartGroup.changed(z5) ? 32 : 16;
            }
            if ((i4 & 4) == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    if ((i4 & 16) == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            str4 = str2;
                            i5 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                        }
                        if ((i4 & 32) != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                        if ((i4 & 64) != 0) {
                            i5 |= 1572864;
                            z6 = z4;
                        } else {
                            z6 = z4;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(z6) ? 1048576 : 524288;
                            }
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            }
                            if ((i4 & 256) == 0) {
                                i5 |= 100663296;
                            } else {
                                if ((i2 & 100663296) == 0) {
                                    i5 |= composerStartRestartGroup.changedInstance(immutableList) ? 67108864 : 33554432;
                                }
                                if ((i4 & 512) != 0) {
                                    i5 |= 805306368;
                                } else {
                                    if ((i2 & 805306368) == 0) {
                                        i5 |= composerStartRestartGroup.changedInstance(immutableList2) ? 536870912 : 268435456;
                                    }
                                    if ((i4 & 1024) == 0) {
                                        i6 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        i6 = i3 | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
                                    } else {
                                        i6 = i3;
                                    }
                                    if ((i4 & 2048) == 0) {
                                        i6 |= 48;
                                    } else if ((i3 & 48) == 0) {
                                        i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
                                    }
                                    int i9 = i6;
                                    if ((i4 & 4096) == 0) {
                                        i9 |= 384;
                                    } else {
                                        if ((i3 & 384) == 0) {
                                            i9 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                                        }
                                        if ((i4 & 8192) == 0) {
                                            if ((i3 & 3072) == 0) {
                                                i9 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                                            }
                                            i7 = i4 & 16384;
                                            if (i7 == 0) {
                                                i8 = i9 | 24576;
                                            } else {
                                                int i10 = i9;
                                                if ((i3 & 24576) == 0) {
                                                    i10 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
                                                }
                                                i8 = i10;
                                            }
                                            if ((i5 & 306783379) != 306783378 && (i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                modifier2 = modifier;
                                                composer2 = composerStartRestartGroup;
                                            } else {
                                                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(661548567, i5, i8, "com.robinhood.shared.crypto.transfer.send.address.saved.AddressDetails (CryptoTransferSendSavedAddressComposable.kt:236)");
                                                }
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                companion = Composer.INSTANCE;
                                                int i11 = i8;
                                                if (objRememberedValue == companion.getEmpty()) {
                                                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                                    objRememberedValue = snapshotStateMutableStateOf$default;
                                                }
                                                snapshotState = (SnapshotState) objRememberedValue;
                                                composerStartRestartGroup.endReplaceGroup();
                                                int i12 = i5;
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Modifier modifier4 = modifier3;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                if (composerStartRestartGroup.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (composerStartRestartGroup.getInserting()) {
                                                    composerStartRestartGroup.useNode();
                                                } else {
                                                    composerStartRestartGroup.createNode(constructor);
                                                }
                                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                Modifier modifierTestTag = TestTag3.testTag(companion3, TestTagAddressInput);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i13 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                                long jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i13).m21427getFg30d7_KjU();
                                                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_page_input_label_text, composerStartRestartGroup, 0);
                                                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_page_input_placeholder_text, new Object[]{str4}, composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                z7 = (i11 & 112) != 32;
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (!z7 || objRememberedValue2 == companion.getEmpty()) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return CryptoTransferSendSavedAddressComposableKt.AddressDetails$lambda$13$lambda$12$lambda$11(function1, snapshotState, (String) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                int i14 = i12 >> 6;
                                                int i15 = i11 << 12;
                                                CryptoAddressTextInput2.m25245CryptoAddressTextInputCondensedIkByU14(str3, i, jM21427getFg30d7_KjU, (Function1) objRememberedValue2, function02, modifierM5144paddingVpY3zN4$default, strStringResource, strStringResource2, z5, composerStartRestartGroup, (i12 & 14) | (i14 & 112) | (i15 & 57344) | ((i12 << 21) & 234881024), 0);
                                                composer2 = composerStartRestartGroup;
                                                Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i13).m21373getBg30d7_KjU(), composer2, 48, 0);
                                                composer2.startReplaceGroup(-344814253);
                                                if (z3) {
                                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                                    int i16 = i12 >> 21;
                                                    AddressesList(str4, immutableList, immutableList2, z2, z6, function0, function12, function2, modifierM5146paddingqDBjuR0$default, composer2, ((i12 >> 12) & 14) | (i16 & 112) | (i16 & 896) | ((i12 << 3) & 7168) | (i14 & 57344) | (458752 & i14) | (3670016 & i15) | (29360128 & i15), 0);
                                                }
                                                composer2.endReplaceGroup();
                                                composer2.endNode();
                                                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                                Boolean boolValueOf = Boolean.valueOf(AddressDetails$lambda$9(snapshotState));
                                                composer2.startReplaceGroup(-1746271574);
                                                zChangedInstance = composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(current);
                                                objRememberedValue3 = composer2.rememberedValue();
                                                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                                    objRememberedValue3 = new CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1(userInteractionEventDescriptor, current, snapshotState, null);
                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer2.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                modifier2 = modifier4;
                                            }
                                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup == null) {
                                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return CryptoTransferSendSavedAddressComposableKt.AddressDetails$lambda$15(str, z, z2, i, str2, z3, z4, function0, immutableList, immutableList2, function02, function1, function12, function2, modifier2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i9 |= 3072;
                                        i7 = i4 & 16384;
                                        if (i7 == 0) {
                                        }
                                        if ((i5 & 306783379) != 306783378) {
                                            if (i7 == 0) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            companion = Composer.INSTANCE;
                                            int i112 = i8;
                                            if (objRememberedValue == companion.getEmpty()) {
                                            }
                                            snapshotState = (SnapshotState) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                            int i122 = i5;
                                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                            Modifier modifier42 = modifier3;
                                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting()) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                                Column6 column62 = Column6.INSTANCE;
                                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                                Modifier modifierTestTag2 = TestTag3.testTag(companion32, TestTagAddressInput);
                                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                int i132 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                                long jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i132).m21427getFg30d7_KjU();
                                                String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_page_input_label_text, composerStartRestartGroup, 0);
                                                String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_page_input_placeholder_text, new Object[]{str4}, composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                if ((i112 & 112) != 32) {
                                                }
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (!z7) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return CryptoTransferSendSavedAddressComposableKt.AddressDetails$lambda$13$lambda$12$lambda$11(function1, snapshotState, (String) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    int i142 = i122 >> 6;
                                                    int i152 = i112 << 12;
                                                    CryptoAddressTextInput2.m25245CryptoAddressTextInputCondensedIkByU14(str3, i, jM21427getFg30d7_KjU2, (Function1) objRememberedValue2, function02, modifierM5144paddingVpY3zN4$default2, strStringResource3, strStringResource22, z5, composerStartRestartGroup, (i122 & 14) | (i142 & 112) | (i152 & 57344) | ((i122 << 21) & 234881024), 0);
                                                    composer2 = composerStartRestartGroup;
                                                    Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composer2, i132).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer2, i132).m21373getBg30d7_KjU(), composer2, 48, 0);
                                                    composer2.startReplaceGroup(-344814253);
                                                    if (z3) {
                                                    }
                                                    composer2.endReplaceGroup();
                                                    composer2.endNode();
                                                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                                    Boolean boolValueOf2 = Boolean.valueOf(AddressDetails$lambda$9(snapshotState));
                                                    composer2.startReplaceGroup(-1746271574);
                                                    zChangedInstance = composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(current);
                                                    objRememberedValue3 = composer2.rememberedValue();
                                                    if (!zChangedInstance) {
                                                        objRememberedValue3 = new CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1(userInteractionEventDescriptor, current, snapshotState, null);
                                                        composer2.updateRememberedValue(objRememberedValue3);
                                                        composer2.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        modifier2 = modifier42;
                                                    }
                                                }
                                            }
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup == null) {
                                        }
                                    }
                                    if ((i4 & 8192) == 0) {
                                    }
                                    i7 = i4 & 16384;
                                    if (i7 == 0) {
                                    }
                                    if ((i5 & 306783379) != 306783378) {
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                    }
                                }
                                if ((i4 & 1024) == 0) {
                                }
                                if ((i4 & 2048) == 0) {
                                }
                                int i92 = i6;
                                if ((i4 & 4096) == 0) {
                                }
                                if ((i4 & 8192) == 0) {
                                }
                                i7 = i4 & 16384;
                                if (i7 == 0) {
                                }
                                if ((i5 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            if ((i4 & 512) != 0) {
                            }
                            if ((i4 & 1024) == 0) {
                            }
                            if ((i4 & 2048) == 0) {
                            }
                            int i922 = i6;
                            if ((i4 & 4096) == 0) {
                            }
                            if ((i4 & 8192) == 0) {
                            }
                            i7 = i4 & 16384;
                            if (i7 == 0) {
                            }
                            if ((i5 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i4 & 256) == 0) {
                        }
                        if ((i4 & 512) != 0) {
                        }
                        if ((i4 & 1024) == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        int i9222 = i6;
                        if ((i4 & 4096) == 0) {
                        }
                        if ((i4 & 8192) == 0) {
                        }
                        i7 = i4 & 16384;
                        if (i7 == 0) {
                        }
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str4 = str2;
                    if ((i4 & 32) != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    if ((i4 & 512) != 0) {
                    }
                    if ((i4 & 1024) == 0) {
                    }
                    if ((i4 & 2048) == 0) {
                    }
                    int i92222 = i6;
                    if ((i4 & 4096) == 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    i7 = i4 & 16384;
                    if (i7 == 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i4 & 16) == 0) {
                }
                str4 = str2;
                if ((i4 & 32) != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if ((i4 & 256) == 0) {
                }
                if ((i4 & 512) != 0) {
                }
                if ((i4 & 1024) == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                int i922222 = i6;
                if ((i4 & 4096) == 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                i7 = i4 & 16384;
                if (i7 == 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i4 & 8) != 0) {
            }
            if ((i4 & 16) == 0) {
            }
            str4 = str2;
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if ((i4 & 256) == 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i4 & 1024) == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            int i9222222 = i6;
            if ((i4 & 4096) == 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            i7 = i4 & 16384;
            if (i7 == 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z5 = z;
        if ((i4 & 4) == 0) {
        }
        if ((i4 & 8) != 0) {
        }
        if ((i4 & 16) == 0) {
        }
        str4 = str2;
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((i4 & 256) == 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i4 & 1024) == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        int i92222222 = i6;
        if ((i4 & 4096) == 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        i7 = i4 & 16384;
        if (i7 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AddressDetails$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressDetails$lambda$13$lambda$12$lambda$11(Function1 function1, SnapshotState snapshotState, String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (!AddressDetails$lambda$9(snapshotState)) {
            AddressDetails$lambda$10(snapshotState, true);
        }
        function1.invoke(address);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AddressesList(final String str, final ImmutableList<UiSavedAddress> immutableList, final ImmutableList<UiSavedAddress> immutableList2, final boolean z, final boolean z2, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function2<? super UUID, ? super String, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1128508306);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList2) ? 256 : 128;
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
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        }
                        i4 = i2 & 256;
                        if (i4 != 0) {
                            i3 |= 100663296;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                            }
                        }
                        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1128508306, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.AddressesList (CryptoTransferSendSavedAddressComposable.kt:308)");
                            }
                            if (!z) {
                                composerStartRestartGroup.startReplaceGroup(1613532706);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(TestTag3.testTag(companion, TestTagLoadingSpinner), BentoProgressIndicator3.f5151S, 0L, composerStartRestartGroup, 54, 4);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1614018724);
                                Modifier modifierTestTag = TestTag3.testTag(modifier3, TestTagAddressLazyList);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | composerStartRestartGroup.changedInstance(immutableList2) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final boolean z4 = z3;
                                    Function1 function12 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoTransferSendSavedAddressComposableKt.AddressesList$lambda$22$lambda$21(immutableList, immutableList2, z4, str, function1, function2, function0, (LazyListScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function12);
                                    objRememberedValue = function12;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CryptoTransferSendSavedAddressComposableKt.AddressesList$lambda$23(str, immutableList, immutableList2, z, z2, function0, function1, function2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    i4 = i2 & 256;
                    if (i4 != 0) {
                    }
                    if ((i3 & 38347923) != 38347922) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 128) != 0) {
                }
                i4 = i2 & 256;
                if (i4 != 0) {
                }
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z2;
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressesList$lambda$22$lambda$21(final ImmutableList immutableList, final ImmutableList immutableList2, boolean z, final String str, final Function1 function1, final Function2 function2, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!immutableList.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CryptoTransferSendSavedAddressComposableKt.INSTANCE.m25075getLambda$1829128638$feature_crypto_transfer_externalDebug(), 3, null);
            final Function1 function12 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendSavedAddressComposableKt.AddressesList$lambda$22$lambda$21$lambda$17((UiSavedAddress) obj);
                }
            };
            final C38212xbe59d40d c38212xbe59d40d = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(UiSavedAddress uiSavedAddress) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((UiSavedAddress) obj);
                }
            };
            LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function12.invoke(immutableList.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c38212xbe59d40d.invoke(immutableList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$4
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
                    UiSavedAddress uiSavedAddress = (UiSavedAddress) immutableList.get(i);
                    composer.startReplaceGroup(1852842652);
                    CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable(str, uiSavedAddress, false, function1, function2, null, composer, 384, 32);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (!immutableList2.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CryptoTransferSendSavedAddressComposableKt.INSTANCE.getLambda$1221192377$feature_crypto_transfer_externalDebug(), 3, null);
            final Function1 function13 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendSavedAddressComposableKt.AddressesList$lambda$22$lambda$21$lambda$19((UiSavedAddress) obj);
                }
            };
            final C38216xbe59d411 c38216xbe59d411 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(UiSavedAddress uiSavedAddress) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((UiSavedAddress) obj);
                }
            };
            LazyColumn.items(immutableList2.size(), new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function13.invoke(immutableList2.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c38216xbe59d411.invoke(immutableList2.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$lambda$22$lambda$21$$inlined$items$default$8
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
                    UiSavedAddress uiSavedAddress = (UiSavedAddress) immutableList2.get(i);
                    composer.startReplaceGroup(-1372437628);
                    CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable(str, uiSavedAddress, false, function1, function2, null, composer, 384, 32);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if (z) {
                LazyListScope.item$default(LazyColumn, ExpandCtaItemKey, null, ComposableLambda3.composableLambdaInstance(379843476, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressesList$2$1$5
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
                            ComposerKt.traceEventStart(379843476, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.AddressesList.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:375)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 5, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C37934R.string.crypto_recent_addresses_section_footer, composer, 0), modifierM5144paddingVpY3zN4$default, null, null, false, null, composer, 0, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AddressesList$lambda$22$lambda$21$lambda$17(UiSavedAddress item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AddressesList$lambda$22$lambda$21$lambda$19(UiSavedAddress item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SendSavedAddressToolbar(final String str, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(390594895);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
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
            function05 = function0;
        } else {
            function05 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function05) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function06 = function03;
        } else {
            function06 = function03;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function06) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                function07 = function04;
                i3 |= composerStartRestartGroup.changedInstance(function07) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(390594895, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SendSavedAddressToolbar (CryptoTransferSendSavedAddressComposable.kt:401)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
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
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1372172942, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$SendSavedAddressToolbar$1$1
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
                                ComposerKt.traceEventStart(-1372172942, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SendSavedAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:455)");
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_unified_send_title, new Object[]{str}, composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1005710278, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$SendSavedAddressToolbar$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 6) == 0) {
                                i6 = i5 | ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1005710278, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SendSavedAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:410)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferSendSavedAddressComposableKt.TestTagBackButton), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1180681191, true, new C38244x827c5355(z2, function06, function07, userInteractionEventDescriptor, function05), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12586374, 0, 1906);
                    composer2 = composerStartRestartGroup;
                    BentoProgressBar2.m20698BentoProgressBarjB83MbM(INITIAL_TOOLBAR_PROGRESS, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1, 0L, 0L, false, composer2, 390, 56);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTransferSendSavedAddressComposableKt.SendSavedAddressToolbar$lambda$25(str, z, function0, function02, function03, function04, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1372172942, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$SendSavedAddressToolbar$1$1
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
                                ComposerKt.traceEventStart(-1372172942, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SendSavedAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:455)");
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_unified_send_title, new Object[]{str}, composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1005710278, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$SendSavedAddressToolbar$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 6) == 0) {
                                i6 = i5 | ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1005710278, i6, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.SendSavedAddressToolbar.<anonymous>.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:410)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferSendSavedAddressComposableKt.TestTagBackButton), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1180681191, true, new C38244x827c5355(z2, function06, function07, userInteractionEventDescriptor2, function05), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12586374, 0, 1906);
                    composer2 = composerStartRestartGroup;
                    BentoProgressBar2.m20698BentoProgressBarjB83MbM(INITIAL_TOOLBAR_PROGRESS, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1, 0L, 0L, false, composer2, 390, 56);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function07 = function04;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
