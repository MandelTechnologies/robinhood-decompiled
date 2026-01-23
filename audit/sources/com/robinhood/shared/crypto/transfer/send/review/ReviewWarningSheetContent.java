package com.robinhood.shared.crypto.transfer.send.review;

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
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReviewWarningSheetContent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"ReviewWarningSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "title", "", CarResultComposable2.BODY, "onConfirmed", "Lkotlin/Function0;", "onEditAddress", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ReviewWarningSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewWarningSheetContent$lambda$5(RhModalBottomSheet5 rhModalBottomSheet5, String str, String str2, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReviewWarningSheetContent(rhModalBottomSheet5, str, str2, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewWarningSheetContent(RhModalBottomSheet5 rhModalBottomSheet5, final String str, final String str2, final Function0<Unit> onConfirmed, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        int i5;
        BentoTheme bentoTheme;
        Modifier.Companion companion;
        int i6;
        int i7;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        final RhModalBottomSheet5 rhModalBottomSheet53;
        boolean z3;
        boolean z4;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> onEditAddress = function0;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
        Intrinsics.checkNotNullParameter(onEditAddress, "onEditAddress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-587109504);
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
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirmed) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditAddress) ? 16384 : 8192;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 196608) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-587109504, i3, -1, "com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContent (ReviewWarningSheetContent.kt:33)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier4 = modifier2;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierVerticalScroll$default, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM());
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
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
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
                int i10 = i3;
                Composer composer3 = composerStartRestartGroup;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, null, null, composer3, 3072, 118);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), composer3, 0);
                composer3.startReplaceGroup(-1064984884);
                if (str == null) {
                    int i11 = (i10 >> 3) & 14;
                    i4 = i10;
                    bentoTheme = bentoTheme2;
                    i5 = i9;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleSmall(), composer3, i11, 0, 8190);
                    composer3 = composer3;
                    companion = companion3;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i5).m21593getSmallD9Ej5fM()), composer3, 0);
                } else {
                    i4 = i10;
                    i5 = i9;
                    bentoTheme = bentoTheme2;
                    companion = companion3;
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-1064977313);
                if (str2 == null) {
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(str2, null, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU()), 0, 17, 0, 0, null, composer3, ((i4 >> 6) & 14) | 196608, 470);
                    i6 = 0;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM()), composer3, 0);
                } else {
                    i6 = 0;
                }
                composer3.endReplaceGroup();
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer3, i6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer3.startReplaceGroup(-1633490746);
                int i12 = i4;
                boolean z5 = (i12 & 7168) != 2048;
                i7 = i12 & 14;
                if (i7 == 4) {
                    if ((i12 & 8) != 0) {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                        if (composer3.changedInstance(rhModalBottomSheet52)) {
                        }
                        z2 = z5 | z;
                        objRememberedValue = composer3.rememberedValue();
                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReviewWarningSheetContent.ReviewWarningSheetContent$lambda$4$lambda$1$lambda$0(onConfirmed, rhModalBottomSheet52);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        Composer composer4 = composer3;
                        Modifier.Companion companion4 = companion;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, type2, false, false, null, null, null, null, false, null, composer4, 24960, 0, 8168);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer4, i5).m21593getSmallD9Ej5fM()), composer4, 0);
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_error_btn, composer4, 0);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        composer4.startReplaceGroup(-1633490746);
                        boolean z6 = (57344 & i12) != 16384;
                        if (i7 == 4) {
                            if ((i12 & 8) != 0) {
                                rhModalBottomSheet53 = rhModalBottomSheet5;
                                if (composer4.changedInstance(rhModalBottomSheet53)) {
                                }
                                z4 = z6 | z3;
                                objRememberedValue2 = composer4.rememberedValue();
                                if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    onEditAddress = function0;
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContentKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ReviewWarningSheetContent.ReviewWarningSheetContent$lambda$4$lambda$3$lambda$2(onEditAddress, rhModalBottomSheet53);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue2);
                                } else {
                                    onEditAddress = function0;
                                }
                                composer4.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierFillMaxWidth$default2, null, type3, false, false, null, null, null, null, false, null, composer4, 24960, 0, 8168);
                                composer2 = composer4;
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                            } else {
                                rhModalBottomSheet53 = rhModalBottomSheet5;
                            }
                            z3 = false;
                            z4 = z6 | z3;
                            objRememberedValue2 = composer4.rememberedValue();
                            if (z4) {
                                onEditAddress = function0;
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReviewWarningSheetContent.ReviewWarningSheetContent$lambda$4$lambda$3$lambda$2(onEditAddress, rhModalBottomSheet53);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue2);
                                composer4.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierFillMaxWidth$default2, null, type3, false, false, null, null, null, null, false, null, composer4, 24960, 0, 8168);
                                composer2 = composer4;
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                            }
                        } else {
                            rhModalBottomSheet53 = rhModalBottomSheet5;
                        }
                        z3 = true;
                        z4 = z6 | z3;
                        objRememberedValue2 = composer4.rememberedValue();
                        if (z4) {
                        }
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    z = false;
                    z2 = z5 | z;
                    objRememberedValue = composer3.rememberedValue();
                    if (!z2) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReviewWarningSheetContent.ReviewWarningSheetContent$lambda$4$lambda$1$lambda$0(onConfirmed, rhModalBottomSheet52);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        Composer composer42 = composer3;
                        Modifier.Companion companion42 = companion;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, type2, false, false, null, null, null, null, false, null, composer42, 24960, 0, 8168);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme.getSpacing(composer42, i5).m21593getSmallD9Ej5fM()), composer42, 0);
                        BentoButtons.Type type32 = BentoButtons.Type.Secondary;
                        String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_send_address_error_btn, composer42, 0);
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
                        composer42.startReplaceGroup(-1633490746);
                        if ((57344 & i12) != 16384) {
                        }
                        if (i7 == 4) {
                        }
                        z3 = true;
                        z4 = z6 | z3;
                        objRememberedValue2 = composer42.rememberedValue();
                        if (z4) {
                        }
                    }
                } else {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                }
                z = true;
                z2 = z5 | z;
                objRememberedValue = composer3.rememberedValue();
                if (!z2) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                rhModalBottomSheet53 = rhModalBottomSheet5;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final RhModalBottomSheet5 rhModalBottomSheet54 = rhModalBottomSheet53;
                final Function0<Unit> function02 = onEditAddress;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.review.ReviewWarningSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReviewWarningSheetContent.ReviewWarningSheetContent$lambda$5(rhModalBottomSheet54, str, str2, onConfirmed, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier42 = modifier2;
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(modifierVerticalScroll$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                int i102 = i3;
                Composer composer32 = composerStartRestartGroup;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, null, null, composer32, 3072, 118);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme22.getSpacing(composer32, i92).m21592getMediumD9Ej5fM()), composer32, 0);
                composer32.startReplaceGroup(-1064984884);
                if (str == null) {
                }
                composer32.endReplaceGroup();
                composer32.startReplaceGroup(-1064977313);
                if (str2 == null) {
                }
                composer32.endReplaceGroup();
                BentoButtons.Type type22 = BentoButtons.Type.Primary;
                String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer32, i6);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer32.startReplaceGroup(-1633490746);
                int i122 = i4;
                if ((i122 & 7168) != 2048) {
                }
                i7 = i122 & 14;
                if (i7 == 4) {
                }
                z = true;
                z2 = z5 | z;
                objRememberedValue = composer32.rememberedValue();
                if (!z2) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewWarningSheetContent$lambda$4$lambda$1$lambda$0(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
        function0.invoke();
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewWarningSheetContent$lambda$4$lambda$3$lambda$2(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
        function0.invoke();
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
