package com.robinhood.compose.app;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ErrorScreenComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"ErrorScreenComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "onTryAgainClick", "Lkotlin/Function0;", "imageResId", "", "title", "", "description", "buttonText", "buttonType", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "showButton", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZLandroidx/compose/runtime/Composer;II)V", ErrorScreenComposable.ErrorScreenTestTagRetryButton, "lib-compose-app_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.app.ErrorScreenComposableKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ErrorScreenComposable {
    public static final String ErrorScreenTestTagRetryButton = "ErrorScreenTestTagRetryButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreenComposable$lambda$3(Modifier modifier, Function0 function0, int i, String str, String str2, String str3, BentoButtons.Type type2, boolean z, int i2, int i3, Composer composer, int i4) {
        ErrorScreenComposable(modifier, function0, i, str, str2, str3, type2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorScreenComposable(Modifier modifier, Function0<Unit> function0, int i, String str, String str2, String str3, BentoButtons.Type type2, boolean z, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        final Function0<Unit> function02;
        int i5;
        String strStringResource;
        String strStringResource2;
        String str4;
        int i6;
        int i7;
        Modifier modifier3;
        String strStringResource3;
        String str5;
        int i8;
        int i9;
        boolean z2;
        BentoButtons.Type type3;
        String str6;
        String str7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        String str8;
        Modifier.Companion companion;
        String str9;
        BentoButtons.Type type4;
        final Modifier modifier4;
        final int i10;
        final Function0<Unit> function03;
        final String str10;
        final BentoButtons.Type type5;
        final String str11;
        final boolean z3;
        final String str12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-999855163);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    int i13 = composerStartRestartGroup.changed(i5) ? 256 : 128;
                    i4 |= i13;
                } else {
                    i5 = i;
                }
                i4 |= i13;
            } else {
                i5 = i;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    strStringResource = str;
                    int i14 = composerStartRestartGroup.changed(strStringResource) ? 2048 : 1024;
                    i4 |= i14;
                } else {
                    strStringResource = str;
                }
                i4 |= i14;
            } else {
                strStringResource = str;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    strStringResource2 = str2;
                    int i15 = composerStartRestartGroup.changed(strStringResource2) ? 16384 : 8192;
                    i4 |= i15;
                } else {
                    strStringResource2 = str2;
                }
                i4 |= i15;
            } else {
                strStringResource2 = str2;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    str4 = str3;
                    int i16 = composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                    i4 |= i16;
                } else {
                    str4 = str3;
                }
                i4 |= i16;
            } else {
                str4 = str3;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
            }
            if ((i4 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i12 != 0) {
                        function02 = null;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        i5 = C11048R.drawable.svg_caution_tube_white_with_shadow;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        strStringResource = StringResources_androidKt.stringResource(C11048R.string.error_title, composerStartRestartGroup, 0);
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.error_description, composerStartRestartGroup, 0);
                    }
                    if ((i3 & 32) == 0) {
                        strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.error_try_again, composerStartRestartGroup, 0);
                        i4 &= -458753;
                    } else {
                        strStringResource3 = str3;
                    }
                    BentoButtons.Type type6 = i6 == 0 ? BentoButtons.Type.Secondary : type2;
                    if (i7 == 0) {
                        int i17 = i4;
                        str5 = strStringResource3;
                        i8 = i5;
                        i9 = i17;
                        type3 = type6;
                        str6 = strStringResource;
                        str7 = strStringResource2;
                        z2 = true;
                    } else {
                        int i18 = i4;
                        str5 = strStringResource3;
                        i8 = i5;
                        i9 = i18;
                        z2 = z;
                        type3 = type6;
                        str6 = strStringResource;
                        str7 = strStringResource2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    type3 = type2;
                    z2 = z;
                    modifier3 = modifier2;
                    i8 = i5;
                    str6 = strStringResource;
                    str7 = strStringResource2;
                    i9 = i4;
                    str5 = str3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-999855163, i9, -1, "com.robinhood.compose.app.ErrorScreenComposable (ErrorScreenComposable.kt:33)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                Modifier modifier5 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i19 = i9 >> 6;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(i8, composerStartRestartGroup, i19 & 14);
                String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.error_image_content_description, composerStartRestartGroup, 0);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                int i20 = i9;
                ImageKt.Image(painterPainterResource, strStringResource4, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(40), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 384, 120);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i21 = BentoTheme.$stable;
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i21).getDisplayCapsuleSmall();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                String str13 = str6;
                BentoText2.m20747BentoText38GnDrw(str13, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, (i20 >> 9) & 14, 0, 8126);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(180733624);
                if (str7 == null) {
                    int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
                    TextStyle textM = bentoTheme.getTypography(composer2, i21).getTextM();
                    String str14 = str7;
                    companion = companion3;
                    BentoText2.m20747BentoText38GnDrw(str14, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i21).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textM, composer2, (i20 >> 12) & 14, 0, 8124);
                    str8 = str14;
                    composer2 = composer2;
                } else {
                    str8 = str7;
                    companion = companion3;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(180743185);
                if (z2) {
                    str9 = str5;
                    type4 = type3;
                } else {
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, ErrorScreenTestTagRetryButton), 0.0f, 1, null), C2002Dp.m7995constructorimpl(120), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i21).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(5004770);
                    boolean z4 = (i20 & 112) == 32;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.app.ErrorScreenComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ErrorScreenComposable.ErrorScreenComposable$lambda$2$lambda$1$lambda$0(function02);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    str9 = str5;
                    type4 = type3;
                    Composer composer3 = composer2;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str9, modifierM5146paddingqDBjuR0$default, null, type4, false, false, null, null, null, null, false, null, composer3, ((i20 >> 12) & 112) | (i19 & 57344), 0, 8168);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                i10 = i8;
                function03 = function02;
                str10 = str9;
                type5 = type4;
                str11 = str8;
                z3 = z2;
                str12 = str13;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                type5 = type2;
                function03 = function02;
                i10 = i5;
                str11 = strStringResource2;
                str10 = str4;
                z3 = z;
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                str12 = strStringResource;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.app.ErrorScreenComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ErrorScreenComposable.ErrorScreenComposable$lambda$3(modifier4, function03, i10, str12, str11, str10, type5, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        function02 = function0;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i11 == 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Modifier modifier52 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    int i192 = i9 >> 6;
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(i8, composerStartRestartGroup, i192 & 14);
                    String strStringResource42 = StringResources_androidKt.stringResource(C11048R.string.error_image_content_description, composerStartRestartGroup, 0);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    int i202 = i9;
                    ImageKt.Image(painterPainterResource2, strStringResource42, PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(40), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 384, 120);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i212 = BentoTheme.$stable;
                    TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i212).getDisplayCapsuleSmall();
                    TextAlign.Companion companion42 = TextAlign.INSTANCE;
                    String str132 = str6;
                    BentoText2.m20747BentoText38GnDrw(str132, null, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, (i202 >> 9) & 14, 0, 8126);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(180733624);
                    if (str7 == null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(180743185);
                    if (z2) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    i10 = i8;
                    function03 = function02;
                    str10 = str9;
                    type5 = type4;
                    str11 = str8;
                    z3 = z2;
                    str12 = str132;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreenComposable$lambda$2$lambda$1$lambda$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
