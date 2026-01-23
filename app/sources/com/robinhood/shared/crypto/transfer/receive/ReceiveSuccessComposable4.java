package com.robinhood.shared.crypto.transfer.receive;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.app.ShareCompat;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContent;
import com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContent7;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReceiveSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001aA\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010!\u001a.\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)\u001a\r\u0010*\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006,²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u008e\u0002"}, m3636d2 = {"TestTagReceiveSuccess", "", "ReceiveSuccessComposable", "", "state", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success;", "onNetworkSelected", "Lkotlin/Function1;", "", "onInitialWarningSheetShown", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "(Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MemoBanner", "addressTag", "currencyCode", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "NetworkSelectionChip", "networkChip", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;", "onNetworkChipClick", "(Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success$NetworkChip;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState$Success;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WarningSheet", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "dismissSheet", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getQrCodeBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", PlaceTypes.ADDRESS, "width", "height", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljava/lang/String;IILkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug", "qrCodeBitmap", "showMultiChainNetworkSelectorSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ReceiveSuccessComposable4 {
    public static final String TestTagReceiveSuccess = "crypto_transfer_receive_success";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$34(CryptoTransferReceiveViewState.Success success, CoroutineScope coroutineScope, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBar(success, coroutineScope, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Content$lambda$22$lambda$21(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$24(CryptoTransferReceiveViewState.Success success, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        Content(success, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoBanner$lambda$27(String str, String str2, int i, Composer composer, int i2) throws Resources.NotFoundException {
        MemoBanner(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkSelectionChip$lambda$28(CryptoTransferReceiveViewState.Success.NetworkChip networkChip, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NetworkSelectionChip(networkChip, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetworkSelectionChip$lambda$29(CryptoTransferReceiveViewState.Success.NetworkChip networkChip, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NetworkSelectionChip(networkChip, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$38(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiveSuccessComposable$lambda$7(CryptoTransferReceiveViewState.Success success, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReceiveSuccessComposable(success, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheet$lambda$37(CryptoTransferConfig.TransferWarnings.Stage.Warning warning, String str, Function0 function0, int i, Composer composer, int i2) {
        WarningSheet(warning, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final ImageBitmap Content$lambda$11(SnapshotState<ImageBitmap> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean Content$lambda$14(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final CryptoTransferConfig.TransferWarnings.Stage.Warning ReceiveSuccessComposable$lambda$1(SnapshotState<CryptoTransferConfig.TransferWarnings.Stage.Warning> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReceiveSuccessComposable(final CryptoTransferReceiveViewState.Success state, final Function1<? super Integer, Unit> onNetworkSelected, final Function0<Unit> onInitialWarningSheetShown, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Composer composer2;
        CryptoTransferConfig.TransferWarnings.Stage.Warning warningReceiveSuccessComposable$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onNetworkSelected, "onNetworkSelected");
        Intrinsics.checkNotNullParameter(onInitialWarningSheetShown, "onInitialWarningSheetShown");
        Composer composerStartRestartGroup = composer.startRestartGroup(871351480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNetworkSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInitialWarningSheetShown) ? 256 : 128;
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
                    ComposerKt.traceEventStart(871351480, i3, -1, "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposable (ReceiveSuccessComposable.kt:92)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                ScaffoldKt.m5939ScaffoldTvnljyQ(TestTag3.testTag(ModifiersKt.logScreenTransitions$default(PaddingKt.m5144paddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, 1, null), TestTagReceiveSuccess), null, ComposableLambda3.rememberComposableLambda(621368403, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt.ReceiveSuccessComposable.1
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
                            ComposerKt.traceEventStart(621368403, i5, -1, "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposable.<anonymous> (ReceiveSuccessComposable.kt:112)");
                        }
                        ReceiveSuccessComposable4.BottomBar(state, coroutineScope, null, composer3, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-386924471, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt.ReceiveSuccessComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer3, int i5) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i5 & 6) == 0) {
                            i5 |= composer3.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-386924471, i5, -1, "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposable.<anonymous> (ReceiveSuccessComposable.kt:103)");
                        }
                        ReceiveSuccessComposable4.Content(state, onNetworkSelected, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306752, 250);
                composer2 = composerStartRestartGroup;
                warningReceiveSuccessComposable$lambda$1 = ReceiveSuccessComposable$lambda$1(snapshotState);
                composer2.startReplaceGroup(-149815172);
                if (warningReceiveSuccessComposable$lambda$1 != null) {
                    String addressTag = state.getAddressTag();
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiveSuccessComposable4.ReceiveSuccessComposable$lambda$5$lambda$4$lambda$3(snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    WarningSheet(warningReceiveSuccessComposable$lambda$1, addressTag, (Function0) objRememberedValue4, composer2, 384);
                    onInitialWarningSheetShown.invoke();
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet = state.getInitialWarningSheet();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(state);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new ReceiveSuccessComposable8(state, snapshotState, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(initialWarningSheet, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReceiveSuccessComposable4.ReceiveSuccessComposable$lambda$7(state, onNetworkSelected, onInitialWarningSheetShown, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            ScaffoldKt.m5939ScaffoldTvnljyQ(TestTag3.testTag(ModifiersKt.logScreenTransitions$default(PaddingKt.m5144paddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, 1, null), TestTagReceiveSuccess), null, ComposableLambda3.rememberComposableLambda(621368403, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt.ReceiveSuccessComposable.1
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
                        ComposerKt.traceEventStart(621368403, i5, -1, "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposable.<anonymous> (ReceiveSuccessComposable.kt:112)");
                    }
                    ReceiveSuccessComposable4.BottomBar(state, coroutineScope2, null, composer3, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-386924471, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt.ReceiveSuccessComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues contentPadding, Composer composer3, int i5) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i5 & 6) == 0) {
                        i5 |= composer3.changed(contentPadding) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-386924471, i5, -1, "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposable.<anonymous> (ReceiveSuccessComposable.kt:103)");
                    }
                    ReceiveSuccessComposable4.Content(state, onNetworkSelected, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306752, 250);
            composer2 = composerStartRestartGroup;
            warningReceiveSuccessComposable$lambda$1 = ReceiveSuccessComposable$lambda$1(snapshotState);
            composer2.startReplaceGroup(-149815172);
            if (warningReceiveSuccessComposable$lambda$1 != null) {
            }
            composer2.endReplaceGroup();
            CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet2 = state.getInitialWarningSheet();
            composer2.startReplaceGroup(-1633490746);
            zChangedInstance = composer2.changedInstance(state);
            objRememberedValue3 = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new ReceiveSuccessComposable8(state, snapshotState, null);
                composer2.updateRememberedValue(objRememberedValue3);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(initialWarningSheet2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiveSuccessComposable$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final CryptoTransferReceiveViewState.Success success, final Function1<? super Integer, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int iMo5010roundToPx0680j_4;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final CryptoTransferReceiveViewState.Success success2 = success;
        Composer composerStartRestartGroup = composer.startRestartGroup(-657111940);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(success2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657111940, i3, -1, "com.robinhood.shared.crypto.transfer.receive.Content (ReceiveSuccessComposable.kt:144)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(-124371922);
                iMo5010roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(PrimitiveResources_androidKt.dimensionResource(C37934R.dimen.qr_code_size, composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMo5010roundToPx0680j_4, iMo5010roundToPx0680j_4, Bitmap.Config.ARGB_8888);
                    new Canvas(bitmapCreateBitmap).drawColor(-1);
                    objRememberedValue = SnapshotState3.mutableStateOf$default(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String textAsString = StringResources6.getTextAsString(success2.getTitle(), composerStartRestartGroup, StringResource.$stable);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(textAsString, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8126);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(column6.align(companion5, companion2.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 1, null);
                CryptoTransferReceiveViewState.Success.NetworkChip networkChip = success.getNetworkChip();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    snapshotState2 = snapshotState4;
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReceiveSuccessComposable4.Content$lambda$18$lambda$17$lambda$16(snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotState2 = snapshotState4;
                }
                composerStartRestartGroup.endReplaceGroup();
                NetworkSelectionChip(networkChip, (Function0) objRememberedValue3, modifierM5144paddingVpY3zN4$default, composerStartRestartGroup, 48, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                snapshotState3 = snapshotState2;
                ImageKt.m4912Image5hnEew(Content$lambda$11(snapshotState), StringResources_androidKt.stringResource(C37934R.string.crypto_send_qr_action_menu_item_content_description, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(Clip.clip(companion5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.card_corner_radius, composerStartRestartGroup, 0))), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.QR_CODE, null, null, 6, null), null, 47, null), true, false, false, false, false, null, 108, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                BentoText2.m20747BentoText38GnDrw(success.getAddress(), PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup = composerStartRestartGroup;
                MemoBanner(success.getAddressTag(), success.getCurrencyCode(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-124300834);
                if (Content$lambda$14(snapshotState3)) {
                    success2 = success;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReceiveSuccessComposable4.Content$lambda$20$lambda$19(snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function0 = (Function0) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ReceiveSuccessComposable4.Content$lambda$22$lambda$21((SheetValue) obj));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    success2 = success;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue6, composerStartRestartGroup, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(1361970608, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt.Content.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                            invoke(rhModalBottomSheet5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1361970608, i6, -1, "com.robinhood.shared.crypto.transfer.receive.Content.<anonymous> (ReceiveSuccessComposable.kt:214)");
                            }
                            MultiChainNetworkSelectorSheetContent.MultiChainNetworkSelectorSheetContent(RhModalBottomSheet, success.getCurrencyCode(), success.getAllAddresses(), function1, null, composer2, RhModalBottomSheet5.$stable | (i6 & 14), 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 54);
                }
                composerStartRestartGroup.endReplaceGroup();
                String address = success2.getAddress();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(success2) | composerStartRestartGroup.changed(iMo5010roundToPx0680j_4);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ReceiveSuccessComposable6(success2, iMo5010roundToPx0680j_4, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(address, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReceiveSuccessComposable4.Content$lambda$24(success2, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(-124371922);
            iMo5010roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(PrimitiveResources_androidKt.dimensionResource(C37934R.dimen.qr_code_size, composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String textAsString2 = StringResources6.getTextAsString(success2.getTitle(), composerStartRestartGroup, StringResource.$stable);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                TextAlign.Companion companion42 = TextAlign.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(textAsString2, null, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8126);
                Modifier.Companion companion52 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(column62.align(companion52, companion22.getCenterHorizontally()), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 1, null);
                CryptoTransferReceiveViewState.Success.NetworkChip networkChip2 = success.getNetworkChip();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                NetworkSelectionChip(networkChip2, (Function0) objRememberedValue3, modifierM5144paddingVpY3zN4$default2, composerStartRestartGroup, 48, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion52, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                snapshotState3 = snapshotState2;
                ImageKt.m4912Image5hnEew(Content$lambda$11(snapshotState), StringResources_androidKt.stringResource(C37934R.string.crypto_send_qr_action_menu_item_content_description, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(Clip.clip(companion52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(C13997R.dimen.card_corner_radius, composerStartRestartGroup, 0))), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.QR_CODE, null, null, 6, null), null, 47, null), true, false, false, false, false, null, 108, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                BentoText2.m20747BentoText38GnDrw(success.getAddress(), PaddingKt.m5144paddingVpY3zN4$default(companion52, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup = composerStartRestartGroup;
                MemoBanner(success.getAddressTag(), success.getCurrencyCode(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-124300834);
                if (Content$lambda$14(snapshotState3)) {
                }
                composerStartRestartGroup.endReplaceGroup();
                String address2 = success2.getAddress();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(success2) | composerStartRestartGroup.changed(iMo5010roundToPx0680j_4);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue4 = new ReceiveSuccessComposable6(success2, iMo5010roundToPx0680j_4, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(address2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Content$lambda$15(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$18$lambda$17$lambda$16(SnapshotState snapshotState) {
        Content$lambda$15(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$20$lambda$19(SnapshotState snapshotState) {
        Content$lambda$15(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void MemoBanner(final String str, final String str2, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1287171308);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1287171308, i2, -1, "com.robinhood.shared.crypto.transfer.receive.MemoBanner (ReceiveSuccessComposable.kt:236)");
            }
            final ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
            if (str != null) {
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 5, null);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_receive_memo_banner_body, new Object[]{str, str2}, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_receive_memo_banner_cta, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(clipboardUtil) | ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReceiveSuccessComposable4.MemoBanner$lambda$26$lambda$25(coroutineScope, clipboardUtil, str, userInteractionEventDescriptor, current);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue2 = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoInfoBanner2.BentoUrgentInfoBanner(modifierM5146paddingqDBjuR0$default, strStringResource, size24, strStringResource2, (Function0) objRememberedValue2, composerStartRestartGroup, BentoIcon4.Size24.$stable << 6, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReceiveSuccessComposable4.MemoBanner$lambda$27(str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoBanner$lambda$26$lambda$25(CoroutineScope coroutineScope, ClipboardUtil clipboardUtil, String str, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReceiveSuccessComposable7(clipboardUtil, str, userInteractionEventDescriptor, eventLogger, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final void NetworkSelectionChip(final CryptoTransferReceiveViewState.Success.NetworkChip networkChip, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1375316961);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(networkChip) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375316961, i3, -1, "com.robinhood.shared.crypto.transfer.receive.NetworkSelectionChip (ReceiveSuccessComposable.kt:274)");
            }
            if (networkChip == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ReceiveSuccessComposable4.NetworkSelectionChip$lambda$28(networkChip, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier = modifier2;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoChip.BentoDropdownChip(function0, PaddingKt.m5144paddingVpY3zN4$default(modifier, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 1, null), false, new BentoChip2.Accessory.Dropdown.LeadingUrlIcon(bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? networkChip.getLogoUrlLight() : networkChip.getLogoUrlDark(), null, null, 6, null), StringResources_androidKt.stringResource(C37934R.string.crypto_unified_receive_chip, new Object[]{networkChip.getText()}, composerStartRestartGroup, 0), composerStartRestartGroup, ((i3 >> 3) & 14) | (BentoChip2.Accessory.Dropdown.LeadingUrlIcon.$stable << 9), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier3 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReceiveSuccessComposable4.NetworkSelectionChip$lambda$29(networkChip, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomBar(final CryptoTransferReceiveViewState.Success success, final CoroutineScope coroutineScope, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final String strStringResource;
        String strStringResource2;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final EventLogger current;
        final Context context;
        final ClipboardUtil clipboardUtil;
        boolean zChangedInstance;
        Object objRememberedValue;
        final UserInteractionEventDescriptor userInteractionEventDescriptor2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final String str;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final CryptoTransferReceiveViewState.Success success2 = success;
        Composer composerStartRestartGroup = composer.startRestartGroup(1725557500);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(success2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(coroutineScope) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1725557500, i4, -1, "com.robinhood.shared.crypto.transfer.receive.BottomBar (ReceiveSuccessComposable.kt:292)");
                }
                strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_copy_address, composerStartRestartGroup, 0);
                strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_share_address, composerStartRestartGroup, 0);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
                String textAsString = StringResources6.getTextAsString(success2.getDisclaimer(), composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(clipboardUtil) | composerStartRestartGroup.changedInstance(success2) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changed(strStringResource) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReceiveSuccessComposable4.BottomBar$lambda$31$lambda$30(coroutineScope, clipboardUtil, success2, userInteractionEventDescriptor, strStringResource, current);
                        }
                    };
                    success2 = success2;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    current = current;
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue = function0;
                } else {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                }
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(success2) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) | composerStartRestartGroup.changed(strStringResource2) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final CryptoTransferReceiveViewState.Success success3 = success2;
                    str = strStringResource2;
                    Function0 function03 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReceiveSuccessComposable4.BottomBar$lambda$33$lambda$32(context, success3, userInteractionEventDescriptor2, str, current);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function03);
                    objRememberedValue2 = function03;
                } else {
                    str = strStringResource2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoButtonBar2.BentoButtonBar(modifier5, textAsString, null, false, null, null, function02, strStringResource, false, null, false, (Function0) objRememberedValue2, str, false, null, false, composer2, (i4 >> 6) & 14, 0, 59196);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReceiveSuccessComposable4.BottomBar$lambda$34(success, coroutineScope, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_copy_address, composerStartRestartGroup, 0);
            strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_share_address, composerStartRestartGroup, 0);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
            String textAsString2 = StringResources6.getTextAsString(success2.getDisclaimer(), composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(clipboardUtil) | composerStartRestartGroup.changedInstance(success2) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changed(strStringResource) | composerStartRestartGroup.changedInstance(current);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                Function0 function04 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReceiveSuccessComposable4.BottomBar$lambda$31$lambda$30(coroutineScope, clipboardUtil, success2, userInteractionEventDescriptor, strStringResource, current);
                    }
                };
                success2 = success2;
                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                current = current;
                composerStartRestartGroup.updateRememberedValue(function04);
                objRememberedValue = function04;
                Function0 function022 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(success2) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) | composerStartRestartGroup.changed(strStringResource2) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    final CryptoTransferReceiveViewState.Success success32 = success2;
                    str = strStringResource2;
                    Function0 function032 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReceiveSuccessComposable4.BottomBar$lambda$33$lambda$32(context, success32, userInteractionEventDescriptor2, str, current);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function032);
                    objRememberedValue2 = function032;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    BentoButtonBar2.BentoButtonBar(modifier52, textAsString2, null, false, null, null, function022, strStringResource, false, null, false, (Function0) objRememberedValue2, str, false, null, false, composer2, (i4 >> 6) & 14, 0, 59196);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$31$lambda$30(CoroutineScope coroutineScope, ClipboardUtil clipboardUtil, CryptoTransferReceiveViewState.Success success, UserInteractionEventDescriptor userInteractionEventDescriptor, String str, EventLogger eventLogger) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReceiveSuccessComposable5(clipboardUtil, success, userInteractionEventDescriptor, str, eventLogger, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$33$lambda$32(Context context, CryptoTransferReceiveViewState.Success success, UserInteractionEventDescriptor userInteractionEventDescriptor, String str, EventLogger eventLogger) {
        new ShareCompat.IntentBuilder(context).setType("text/plain").setText(success.getAddress()).startChooser();
        Screen screen = userInteractionEventDescriptor.getScreen();
        com.robinhood.rosetta.eventlogging.Context context2 = userInteractionEventDescriptor.getContext();
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SHARE, screen, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, context2 != null ? com.robinhood.rosetta.eventlogging.Context.copy$default(context2, 0, 0, 0, str, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
        return Unit.INSTANCE;
    }

    private static final void WarningSheet(final CryptoTransferConfig.TransferWarnings.Stage.Warning warning, final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1156990072);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(warning) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1156990072, i2, -1, "com.robinhood.shared.crypto.transfer.receive.WarningSheet (ReceiveSuccessComposable.kt:347)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReceiveSuccessComposable4.WarningSheet$lambda$36$lambda$35(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(786547151, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt.WarningSheet.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(786547151, i3, -1, "com.robinhood.shared.crypto.transfer.receive.WarningSheet.<anonymous> (ReceiveSuccessComposable.kt:354)");
                    }
                    WarningSheetContent7.WarningSheetContent(RhModalBottomSheet, warning, str, null, composer2, RhModalBottomSheet5.$stable | (i3 & 14), 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReceiveSuccessComposable4.WarningSheet$lambda$37(warning, str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheet$lambda$36$lambda$35(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: ReceiveSuccessComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$getQrCodeBitmap$2", m3645f = "ReceiveSuccessComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$getQrCodeBitmap$2 */
    static final class C380582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ImageBitmap>, Object> {
        final /* synthetic */ String $address;
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C380582(String str, int i, int i2, Continuation<? super C380582> continuation) {
            super(2, continuation);
            this.$address = str;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C380582(this.$address, this.$width, this.$height, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageBitmap> continuation) {
            return ((C380582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws NumberFormatException, WriterException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2[] tuples2Arr = {Tuples4.m3642to(EncodeHintType.MARGIN, boxing.boxInt(2)), Tuples4.m3642to(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M), Tuples4.m3642to(EncodeHintType.CHARACTER_SET, CharacterSetECI.UTF8)};
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            MapsKt.putAll(enumMap, tuples2Arr);
            if (this.$address.length() <= 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.$width, this.$height, Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawColor(-1);
                return AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap);
            }
            BitMatrix bitMatrixEncode = new QRCodeWriter().encode(this.$address, BarcodeFormat.QR_CODE, this.$width, this.$height, enumMap);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitMatrixEncode.getWidth(), bitMatrixEncode.getHeight(), Bitmap.Config.ARGB_8888);
            int height = bitMatrixEncode.getHeight();
            for (int i = 0; i < height; i++) {
                int width = bitMatrixEncode.getWidth();
                for (int i2 = 0; i2 < width; i2++) {
                    bitmapCreateBitmap2.setPixel(i2, i, bitMatrixEncode.get(i2, i) ? -16777216 : -1);
                }
            }
            return AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getQrCodeBitmap(String str, int i, int i2, CoroutineDispatcher coroutineDispatcher, Continuation<? super ImageBitmap> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new C380582(str, i, i2, null), continuation);
    }

    @DayNightPreview
    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1601933730);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1601933730, i, -1, "com.robinhood.shared.crypto.transfer.receive.Preview (ReceiveSuccessComposable.kt:397)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ReceiveSuccessComposable.INSTANCE.getLambda$134337558$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReceiveSuccessComposable4.Preview$lambda$38(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
