package com.robinhood.shared.crypto.transfer.send.address.host;

import android.content.Context;
import androidx.compose.foundation.Background3;
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
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProtectionSheetContent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"ProtectionSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "isRhc", "", "onAcknowledge", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ProtectionSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtectionSheetContent$lambda$7(RhModalBottomSheet5 rhModalBottomSheet5, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProtectionSheetContent(rhModalBottomSheet5, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProtectionSheetContent(RhModalBottomSheet5 rhModalBottomSheet5, final boolean z, final Function0<Unit> onAcknowledge, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final String str;
        String strStringResource2;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i4;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        boolean z2;
        boolean z3;
        Object objRememberedValue2;
        final RhModalBottomSheet5 rhModalBottomSheet53;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(onAcknowledge, "onAcknowledge");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1130794942);
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
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAcknowledge) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1130794942, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContent (ProtectionSheetContent.kt:41)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-2083223682);
                    strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_protect_learn_more, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2083298950);
                    strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_protect_learn_more_rhc, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier5 = modifier4;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierVerticalScroll$default, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 5, null);
                Screen screen = userInteractionEventDescriptor.getScreen();
                com.robinhood.rosetta.eventlogging.Context context2 = userInteractionEventDescriptor.getContext();
                Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen, null, context2, new Component(componentType, "fraud_info", null, 4, null), null, 37, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                str = strStringResource;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).getLumen()), null, composerStartRestartGroup, 3072, 86);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                int i7 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_title, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, null, null, 6, null);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(2106277082);
                    strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_1, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2106144278);
                    strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_1_rhc, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(icon, new BentoBaseRowState.Text.Plain(strStringResource2), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                int i8 = BentoBaseRowState.$stable;
                boolean z4 = true;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierM5144paddingVpY3zN4$default, bentoBaseRowState, false, true, false, 0L, null, composerStartRestartGroup, (i8 << 3) | 3456, 112);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 2, null), new BentoBaseRowState(new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.LOCK_24, null, null, 6, null), new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_2, composerStartRestartGroup, 0)), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), false, true, false, 0L, null, composerStartRestartGroup, (i8 << 3) | 3456, 112);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState(new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.QUESTION_FILLED_24, null, null, 6, null), new BentoBaseRowState.Text.Annotated(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(!z ? C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_3_rhc : C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_3, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, 2, null), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProtectionSheetContent.ProtectionSheetContent$lambda$6$lambda$1$lambda$0(context, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierM5144paddingVpY3zN4$default2, bentoBaseRowState2, false, true, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (i8 << 3) | 3456, 48);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), new UserInteractionEventDescriptor(null, userInteractionEventDescriptor.getScreen(), UserInteractionEventData.Action.DONE, userInteractionEventDescriptor.getContext(), new Component(Component.ComponentType.BUTTON, "fraud_info", null, 4, null), new ComponentHierarchy(new Component(componentType, "fraud_info", null, 4, null), null, null, null, null, 30, null), 1, null), false, false, false, true, false, null, 108, null);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                String strStringResource3 = StringResources_androidKt.stringResource(!z ? C37934R.string.crypto_enrollment_acknowledge_rhc : C37934R.string.crypto_enrollment_acknowledge, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z5 = (i7 & 896) != 256;
                i4 = i7 & 14;
                if (i4 == 4) {
                    if ((i7 & 8) != 0) {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                        if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                        }
                        z3 = z5 | z2;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProtectionSheetContent.ProtectionSheetContent$lambda$6$lambda$3$lambda$2(onAcknowledge, rhModalBottomSheet52);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        String strStringResource4 = StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_acknowledge_cancel, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i4 == 4) {
                            if ((i7 & 8) != 0) {
                                rhModalBottomSheet53 = rhModalBottomSheet5;
                                if (!composerStartRestartGroup.changedInstance(rhModalBottomSheet53)) {
                                }
                            } else {
                                rhModalBottomSheet53 = rhModalBottomSheet5;
                            }
                            z4 = false;
                        } else {
                            rhModalBottomSheet53 = rhModalBottomSheet5;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProtectionSheetContent.ProtectionSheetContent$lambda$6$lambda$5$lambda$4(rhModalBottomSheet53);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource4, modifierM5144paddingVpY3zN4$default3, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    z2 = false;
                    z3 = z5 | z2;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProtectionSheetContent.ProtectionSheetContent$lambda$6$lambda$3$lambda$2(onAcknowledge, rhModalBottomSheet52);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        Modifier modifierM5144paddingVpY3zN4$default32 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        BentoButtons.Type type32 = BentoButtons.Type.Secondary;
                        String strStringResource42 = StringResources_androidKt.stringResource(C37934R.string.crypto_enrollment_acknowledge_cancel, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i4 == 4) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ProtectionSheetContent.ProtectionSheetContent$lambda$6$lambda$5$lambda$4(rhModalBottomSheet53);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource42, modifierM5144paddingVpY3zN4$default32, null, type32, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier5;
                        }
                    }
                } else {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                }
                z2 = true;
                z3 = z5 | z2;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                rhModalBottomSheet53 = rhModalBottomSheet5;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final RhModalBottomSheet5 rhModalBottomSheet54 = rhModalBottomSheet53;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ProtectionSheetContent.ProtectionSheetContent$lambda$7(rhModalBottomSheet54, z, onAcknowledge, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            if (z) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier52 = modifier4;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierVerticalScroll$default2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 5, null);
            Screen screen2 = userInteractionEventDescriptor2.getScreen();
            com.robinhood.rosetta.eventlogging.Context context22 = userInteractionEventDescriptor2.getContext();
            Component.ComponentType componentType2 = Component.ComponentType.BOTTOM_SHEET;
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, screen2, null, context22, new Component(componentType2, "fraud_info", null, 4, null), null, 37, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                str = strStringResource;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).getLumen()), null, composerStartRestartGroup, 3072, 86);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                int i72 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_title, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default4 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                BentoBaseRowState.Start.Icon icon2 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, null, null, 6, null);
                if (z) {
                }
                BentoBaseRowState bentoBaseRowState3 = new BentoBaseRowState(icon2, new BentoBaseRowState.Text.Plain(strStringResource2), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                int i82 = BentoBaseRowState.$stable;
                boolean z42 = true;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierM5144paddingVpY3zN4$default4, bentoBaseRowState3, false, true, false, 0L, null, composerStartRestartGroup, (i82 << 3) | 3456, 112);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 2, null), new BentoBaseRowState(new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.LOCK_24, null, null, 6, null), new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_2, composerStartRestartGroup, 0)), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), false, true, false, 0L, null, composerStartRestartGroup, (i82 << 3) | 3456, 112);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default22 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                BentoBaseRowState bentoBaseRowState22 = new BentoBaseRowState(new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.QUESTION_FILLED_24, null, null, 6, null), new BentoBaseRowState.Text.Annotated(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(!z ? C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_3_rhc : C37934R.string.crypto_transfer_enrollment_protect_sheet_subtitle_3, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, 2, null), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.ProtectionSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProtectionSheetContent.ProtectionSheetContent$lambda$6$lambda$1$lambda$0(context, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierM5144paddingVpY3zN4$default22, bentoBaseRowState22, false, true, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (i82 << 3) | 3456, 48);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null), new UserInteractionEventDescriptor(null, userInteractionEventDescriptor2.getScreen(), UserInteractionEventData.Action.DONE, userInteractionEventDescriptor2.getContext(), new Component(Component.ComponentType.BUTTON, "fraud_info", null, 4, null), new ComponentHierarchy(new Component(componentType2, "fraud_info", null, 4, null), null, null, null, null, 30, null), 1, null), false, false, false, true, false, null, 108, null);
                    BentoButtons.Type type22 = BentoButtons.Type.Primary;
                    String strStringResource32 = StringResources_androidKt.stringResource(!z ? C37934R.string.crypto_enrollment_acknowledge_rhc : C37934R.string.crypto_enrollment_acknowledge, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i72 & 896) != 256) {
                    }
                    i4 = i72 & 14;
                    if (i4 == 4) {
                    }
                    z2 = true;
                    z3 = z5 | z2;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtectionSheetContent$lambda$6$lambda$1$lambda$0(Context context, String str) {
        WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtectionSheetContent$lambda$6$lambda$3$lambda$2(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
        function0.invoke();
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtectionSheetContent$lambda$6$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
