package com.robinhood.shared.crypto.transfer.send.memo;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.DefaultScreenMargins;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposable3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferSendMemoComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aA\u0010\u000b\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0012\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferSendMemoComposable", "", "addressTag", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "savedTag", "", "onContinueWithAddressTag", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Memo", "onTagChange", "onLearnMore", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "regexToValidate", "Lkotlin/text/Regex;", "MemoTextInput", "(Ljava/lang/String;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MemoSheetContent", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "text", "showMemoBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendMemoComposable3 {
    private static final Regex regexToValidate = new Regex("[a-zA-Z0-9]+");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendMemoComposable$lambda$10(CryptoTransferConfig.TransferAddressTag transferAddressTag, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendMemoComposable(transferAddressTag, str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferSendMemoComposable$lambda$9$lambda$8(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Memo$lambda$12(String str, CryptoTransferConfig.TransferAddressTag transferAddressTag, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        Memo(str, transferAddressTag, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoSheetContent$lambda$28(RhModalBottomSheet5 rhModalBottomSheet5, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MemoSheetContent(rhModalBottomSheet5, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoTextInput$lambda$24(String str, CryptoTransferConfig.TransferAddressTag transferAddressTag, Function1 function1, int i, Composer composer, int i2) {
        MemoTextInput(str, transferAddressTag, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferSendMemoComposable(final CryptoTransferConfig.TransferAddressTag addressTag, final String str, final Function1<? super String, Unit> onContinueWithAddressTag, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(addressTag, "addressTag");
        Intrinsics.checkNotNullParameter(onContinueWithAddressTag, "onContinueWithAddressTag");
        Composer composerStartRestartGroup = composer.startRestartGroup(1294891576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(addressTag) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onContinueWithAddressTag) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1294891576, i3, -1, "com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposable (CryptoTransferSendMemoComposable.kt:56)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, 0.0f, composerStartRestartGroup, (i3 >> 9) & 14, 1), false, ComposableLambda3.rememberComposableLambda(321974893, true, new C383391(onContinueWithAddressTag, snapshotState2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(117483808, true, new C383402(str, addressTag, softwareKeyboardController, snapshotState2, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                    if (CryptoTransferSendMemoComposable$lambda$4(snapshotState)) {
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$7$lambda$6(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function0 = (Function0) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$9$lambda$8((SheetValue) obj));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue4, composerStartRestartGroup, 54, 0), null, 0L, CryptoTransferSendMemoComposable.INSTANCE.getLambda$1675760004$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 1572870, 54);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$10(addressTag, str, onContinueWithAddressTag, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier5, 0.0f, composerStartRestartGroup, (i3 >> 9) & 14, 1), false, ComposableLambda3.rememberComposableLambda(321974893, true, new C383391(onContinueWithAddressTag, snapshotState22), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(117483808, true, new C383402(str, addressTag, softwareKeyboardController2, snapshotState22, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                if (CryptoTransferSendMemoComposable$lambda$4(snapshotState)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferSendMemoComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CryptoTransferSendMemoComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$CryptoTransferSendMemoComposable$1 */
    static final class C383391 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onContinueWithAddressTag;
        final /* synthetic */ SnapshotState<String> $text$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C383391(Function1<? super String, Unit> function1, SnapshotState<String> snapshotState) {
            this.$onContinueWithAddressTag = function1;
            this.$text$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(321974893, i2, -1, "com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposable.<anonymous> (CryptoTransferSendMemoComposable.kt:65)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onContinueWithAddressTag);
            final Function1<String, Unit> function1 = this.$onContinueWithAddressTag;
            final SnapshotState<String> snapshotState = this.$text$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$CryptoTransferSendMemoComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendMemoComposable3.C383391.invoke$lambda$1$lambda$0(function1, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0), false, null, !StringsKt.isBlank(CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$1(this.$text$delegate)), composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState) {
            function1.invoke(CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$1(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTransferSendMemoComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$CryptoTransferSendMemoComposable$2 */
    static final class C383402 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ CryptoTransferConfig.TransferAddressTag $addressTag;
        final /* synthetic */ SoftwareKeyboardController $keyboardController;
        final /* synthetic */ String $savedTag;
        final /* synthetic */ SnapshotState<Boolean> $showMemoBottomSheet$delegate;
        final /* synthetic */ SnapshotState<String> $text$delegate;

        C383402(String str, CryptoTransferConfig.TransferAddressTag transferAddressTag, SoftwareKeyboardController softwareKeyboardController, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$savedTag = str;
            this.$addressTag = transferAddressTag;
            this.$keyboardController = softwareKeyboardController;
            this.$text$delegate = snapshotState;
            this.$showMemoBottomSheet$delegate = snapshotState2;
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
                ComposerKt.traceEventStart(117483808, i, -1, "com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposable.<anonymous> (CryptoTransferSendMemoComposable.kt:72)");
            }
            String str = this.$savedTag;
            CryptoTransferConfig.TransferAddressTag transferAddressTag = this.$addressTag;
            composer.startReplaceGroup(5004770);
            final SnapshotState<String> snapshotState = this.$text$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$CryptoTransferSendMemoComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSendMemoComposable3.C383402.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$keyboardController);
            final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            final SnapshotState<Boolean> snapshotState2 = this.$showMemoBottomSheet$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$CryptoTransferSendMemoComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendMemoComposable3.C383402.invoke$lambda$3$lambda$2(softwareKeyboardController, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CryptoTransferSendMemoComposable3.Memo(str, transferAddressTag, function1, (Function0) objRememberedValue2, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$2(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SoftwareKeyboardController softwareKeyboardController, SnapshotState snapshotState) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            CryptoTransferSendMemoComposable3.CryptoTransferSendMemoComposable$lambda$5(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CryptoTransferSendMemoComposable$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean CryptoTransferSendMemoComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String MemoTextInput$lambda$16(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendMemoComposable$lambda$7$lambda$6(SnapshotState snapshotState) {
        CryptoTransferSendMemoComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Memo(final String str, final CryptoTransferConfig.TransferAddressTag transferAddressTag, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1599037660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(transferAddressTag) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1599037660, i2, -1, "com.robinhood.shared.crypto.transfer.send.memo.Memo (CryptoTransferSendMemoComposable.kt:102)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 5, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_title, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_subtitle, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0), function0, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0, composerStartRestartGroup, (i4 >> 3) & 896, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            composer2 = composerStartRestartGroup;
            MemoTextInput(str, transferAddressTag, function1, composer2, i4 & 1022);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendMemoComposable3.Memo$lambda$12(str, transferAddressTag, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferSendMemoComposable$lambda$2(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    private static final void MemoTextInput(final String str, final CryptoTransferConfig.TransferAddressTag transferAddressTag, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(91420443);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(transferAddressTag) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(91420443, i3, -1, "com.robinhood.shared.crypto.transfer.send.memo.MemoTextInput (CryptoTransferSendMemoComposable.kt:140)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendMemoComposable3.MemoTextInput$lambda$15$lambda$14(str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z2 = true;
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester);
            String strMemoTextInput$lambda$16 = MemoTextInput$lambda$16(snapshotState);
            KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7767getNoneIUNYP9k(), Boolean.FALSE, KeyboardType.INSTANCE.m7783getPasswordPjHm6EE(), ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 112, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSendMemoComposable3.MemoTextInput$lambda$19$lambda$18(focusRequester, softwareKeyboardController, (KeyboardActions2) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            KeyboardActions keyboardActions = new KeyboardActions(null, null, (Function1) objRememberedValue3, null, null, null, 59, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(transferAddressTag) | composerStartRestartGroup.changed(snapshotState);
            if ((i3 & 896) != 256) {
                z2 = false;
            }
            boolean z3 = zChangedInstance | z2;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSendMemoComposable3.MemoTextInput$lambda$22$lambda$21(transferAddressTag, function1, snapshotState, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            BookCoverTextInput.BookCoverTextInput(strMemoTextInput$lambda$16, (Function1) objRememberedValue4, modifierFocusRequester, keyboardOptions, keyboardActions, null, composerStartRestartGroup, 3072, 32);
            composer2 = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer2.changed(softwareKeyboardController);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new CryptoTransferSendMemoComposable4(focusRequester, softwareKeyboardController, null);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendMemoComposable3.MemoTextInput$lambda$24(str, transferAddressTag, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MemoTextInput$lambda$15$lambda$14(String str) {
        if (str == null) {
            str = "";
        }
        return SnapshotState3.mutableStateOf$default(str, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoTextInput$lambda$22$lambda$21(CryptoTransferConfig.TransferAddressTag transferAddressTag, Function1 function1, SnapshotState snapshotState, String changedText) {
        Intrinsics.checkNotNullParameter(changedText, "changedText");
        if (changedText.length() <= transferAddressTag.getMaxLength()) {
            String strJoinToString$default = SequencesKt.joinToString$default(Regex.findAll$default(regexToValidate, changedText, 0, 2, null), "", null, null, 0, null, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendMemoComposable3.MemoTextInput$lambda$22$lambda$21$lambda$20((MatchResult) obj);
                }
            }, 30, null);
            snapshotState.setValue(strJoinToString$default);
            function1.invoke(strJoinToString$default);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence MemoTextInput$lambda$22$lambda$21$lambda$20(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoTextInput$lambda$19$lambda$18(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusRequester.freeFocus();
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MemoSheetContent(RhModalBottomSheet5 rhModalBottomSheet5, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        boolean z;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1851961467);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 1;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                rhModalBottomSheet52 = rhModalBottomSheet5;
            } else {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1851961467, i3, -1, "com.robinhood.shared.crypto.transfer.send.memo.MemoSheetContent (CryptoTransferSendMemoComposable.kt:180)");
                }
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, DefaultScreenMargins.INSTANCE.m21613getTopD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_sheet_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composerStartRestartGroup, 0, 0, 8188);
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop1_title, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop1_body, composerStartRestartGroup, 0);
                BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.DISCLOSURES_24, null, 2, null);
                BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                int i7 = BentoValuePropRow2.Icon.$stable;
                BentoValuePropRow3.BentoValuePropRow(strStringResource2, strStringResource3, icon, bentoValuePropRow, (Modifier) null, composerStartRestartGroup, (i7 << 6) | 3072, 16);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop2_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop2_body, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SEARCH_24, null, 2, null), bentoValuePropRow, (Modifier) null, composerStartRestartGroup, (i7 << 6) | 3072, 16);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop3_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop3_body, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.HELP_24, null, 2, null), bentoValuePropRow, (Modifier) null, composerStartRestartGroup, (i7 << 6) | 3072, 16);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop4_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop4_body, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, null, 2, null), bentoValuePropRow, (Modifier) null, composerStartRestartGroup, (i7 << 6) | 3072, 16);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 14) == 4) {
                    if ((i4 & 8) != 0) {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                        if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferSendMemoComposable3.MemoSheetContent$lambda$27$lambda$26$lambda$25(rhModalBottomSheet52);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    z = false;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferSendMemoComposable3.MemoSheetContent$lambda$27$lambda$26$lambda$25(rhModalBottomSheet52);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier4;
                    }
                } else {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                }
                z = true;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferSendMemoComposable3.MemoSheetContent$lambda$28(rhModalBottomSheet52, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, DefaultScreenMargins.INSTANCE.m21613getTopD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
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
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
                String strStringResource5 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_sheet_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource5, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composerStartRestartGroup, 0, 0, 8188);
                String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop1_title, composerStartRestartGroup, 0);
                String strStringResource32 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop1_body, composerStartRestartGroup, 0);
                BentoValuePropRow2.Icon icon2 = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.DISCLOSURES_24, null, 2, null);
                BentoValuePropRow bentoValuePropRow2 = BentoValuePropRow.Top;
                int i72 = BentoValuePropRow2.Icon.$stable;
                BentoValuePropRow3.BentoValuePropRow(strStringResource22, strStringResource32, icon2, bentoValuePropRow2, (Modifier) null, composerStartRestartGroup, (i72 << 6) | 3072, 16);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop2_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop2_body, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SEARCH_24, null, 2, null), bentoValuePropRow2, (Modifier) null, composerStartRestartGroup, (i72 << 6) | 3072, 16);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop3_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop3_body, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.HELP_24, null, 2, null), bentoValuePropRow2, (Modifier) null, composerStartRestartGroup, (i72 << 6) | 3072, 16);
                BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop4_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_memo_value_prop4_body, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, null, 2, null), bentoValuePropRow2, (Modifier) null, composerStartRestartGroup, (i72 << 6) | 3072, 16);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null);
                String strStringResource42 = StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 14) == 4) {
                }
                z = true;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoSheetContent$lambda$27$lambda$26$lambda$25(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
