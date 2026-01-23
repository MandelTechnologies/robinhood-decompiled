package com.robinhood.shared.crypto.transfer.unified.sheet;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WarningSheetContent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"WarningSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "sheetContent", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "addressTag", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WarningSheetContent7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$7(RhModalBottomSheet5 rhModalBottomSheet5, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WarningSheetContent(rhModalBottomSheet5, warning, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WarningSheetContent(final RhModalBottomSheet5 rhModalBottomSheet5, final CryptoTransferConfig.TransferWarnings.Stage.Warning sheetContent, String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        int i5;
        Modifier.Companion companion;
        int i6;
        int i7;
        final String str2;
        String bodyMarkdown;
        int i8;
        int i9;
        Composer composer2;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        int i10;
        int i11;
        Object objRememberedValue;
        final RhModalBottomSheet5 rhModalBottomSheet53;
        int i12;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1646866218);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sheetContent) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1646866218, i3, -1, "com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContent (WarningSheetContent.kt:43)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                modifier3 = modifier4;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierVerticalScroll$default, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                z = sheetContent.getType() != ApiCryptoTransferConfig.TransferWarnings.Stage.Warning.Type.ADDRESS_TAG_COPY_REMINDER;
                i5 = i3;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 118);
                companion = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(sheetContent.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8126);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                if (z || str == null) {
                    i6 = i4;
                    i7 = 0;
                    str2 = str;
                    bodyMarkdown = sheetContent.getBodyMarkdown();
                } else {
                    i7 = 0;
                    i6 = i4;
                    bodyMarkdown = StringsKt.replace$default(sheetContent.getBodyMarkdown(), "{address_tag}", str, false, 4, (Object) null);
                    str2 = str;
                }
                i8 = i7;
                int i14 = i6;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(bodyMarkdown, null, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), 0, 17, 0, 0, null, composerStartRestartGroup, 196608, 470);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i14).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, i8);
                if (z || str2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-672094970);
                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_unified_erc20_cta, composerStartRestartGroup, i8);
                    i9 = 1;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) {
                        i9 = i8;
                    }
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (i9 != 0) {
                        Object obj = objRememberedValue3;
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            Function0 function0 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WarningSheetContent7.WarningSheetContent$lambda$6$lambda$5$lambda$4(rhModalBottomSheet5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function0);
                            obj = function0;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) obj, strStringResource, modifierFillMaxWidth$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24960, 0, 8168);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-674192213);
                    final ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, i8);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue4;
                    BentoButtons.Type type3 = BentoButtons.Type.Primary;
                    String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_receive_memo_warning_sheet_primary_cta, composerStartRestartGroup, i8);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.COPY, null, new Component(componentType, "copy_memo_alert_sheet", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i15 = ((i5 & 896) == 256 ? 1 : i8) | (composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0) | (composerStartRestartGroup.changedInstance(clipboardUtil) ? 1 : 0);
                    int i16 = i5 & 14;
                    if (i16 != 4) {
                        if ((i5 & 8) != 0) {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                            if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                            }
                            i11 = i15 | i10;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (i11 != 0 || objRememberedValue == companion3.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WarningSheetContent7.WarningSheetContent$lambda$6$lambda$1$lambda$0(coroutineScope, rhModalBottomSheet52, clipboardUtil, str2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i14).m21593getSmallD9Ej5fM()), composerStartRestartGroup, i8);
                            BentoButtons.Type type4 = BentoButtons.Type.Secondary;
                            String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_receive_memo_warning_sheet_secondary_cta, composerStartRestartGroup, i8);
                            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(componentType, "copy_memo_alert_sheet", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if (i16 == 4) {
                                if ((i5 & 8) != 0) {
                                    rhModalBottomSheet53 = rhModalBottomSheet5;
                                    if (composerStartRestartGroup.changedInstance(rhModalBottomSheet53)) {
                                    }
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (i12 == 0 || objRememberedValue2 == companion3.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return WarningSheetContent7.WarningSheetContent$lambda$6$lambda$3$lambda$2(rhModalBottomSheet53);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default2, null, type4, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                                    composer2.endReplaceGroup();
                                } else {
                                    rhModalBottomSheet53 = rhModalBottomSheet5;
                                }
                                i12 = i8;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (i12 == 0) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return WarningSheetContent7.WarningSheetContent$lambda$6$lambda$3$lambda$2(rhModalBottomSheet53);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default2, null, type4, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                                    composer2.endReplaceGroup();
                                }
                            } else {
                                rhModalBottomSheet53 = rhModalBottomSheet5;
                            }
                            i12 = 1;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (i12 == 0) {
                            }
                        } else {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                        }
                        i10 = i8;
                        i11 = i15 | i10;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i11 != 0) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WarningSheetContent7.WarningSheetContent$lambda$6$lambda$1$lambda$0(coroutineScope, rhModalBottomSheet52, clipboardUtil, str2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i14).m21593getSmallD9Ej5fM()), composerStartRestartGroup, i8);
                            BentoButtons.Type type42 = BentoButtons.Type.Secondary;
                            String strStringResource32 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_receive_memo_warning_sheet_secondary_cta, composerStartRestartGroup, i8);
                            Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(componentType, "copy_memo_alert_sheet", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if (i16 == 4) {
                            }
                            i12 = 1;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (i12 == 0) {
                            }
                        }
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    i10 = 1;
                    i11 = i15 | i10;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i11 != 0) {
                    }
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str2 = str;
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final String str3 = str2;
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return WarningSheetContent7.WarningSheetContent$lambda$7(rhModalBottomSheet5, sheetContent, str3, modifier5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i13 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            modifier3 = modifier4;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(modifierVerticalScroll$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
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
                if (sheetContent.getType() != ApiCryptoTransferConfig.TransferWarnings.Stage.Warning.Type.ADDRESS_TAG_COPY_REMINDER) {
                }
                i5 = i3;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 118);
                companion = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(sheetContent.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8126);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                if (z) {
                    i6 = i4;
                    i7 = 0;
                    str2 = str;
                    bodyMarkdown = sheetContent.getBodyMarkdown();
                    i8 = i7;
                    int i142 = i6;
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(bodyMarkdown, null, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), 0, 17, 0, 0, null, composerStartRestartGroup, 196608, 470);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i142).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, i8);
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(-672094970);
                        BentoButtons.Type type22 = BentoButtons.Type.Primary;
                        String strStringResource4 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_unified_erc20_cta, composerStartRestartGroup, i8);
                        i9 = 1;
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i5 & 14) != 4) {
                            i9 = i8;
                        }
                        Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                        if (i9 != 0) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$6$lambda$1$lambda$0(CoroutineScope coroutineScope, RhModalBottomSheet5 rhModalBottomSheet5, ClipboardUtil clipboardUtil, String str) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WarningSheetContent8(clipboardUtil, str, null), 3, null);
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$6$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$6$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
