package com.robinhood.android.doc.serverdriven.splash;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SddrSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0010\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, m3636d2 = {"ctaText", "", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;", "getCtaText", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "SddrSplashComposable", "", "content", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "primaryMethod", "onMethodClicked", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "secondaryMethod", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;Landroidx/compose/runtime/Composer;II)V", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.doc.serverdriven.splash.SddrSplashComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SddrSplashComposable {

    /* compiled from: SddrSplashComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.serverdriven.splash.SddrSplashComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDocumentRequest.AllowedCaptureMethods.values().length];
            try {
                iArr[ApiDocumentRequest.AllowedCaptureMethods.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDocumentRequest.AllowedCaptureMethods.FILE_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SddrSplashComposable$lambda$5(UIComponent uIComponent, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods, Function1 function1, Modifier modifier, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods2, int i, int i2, Composer composer, int i3) {
        SddrSplashComposable(uIComponent, allowedCaptureMethods, function1, modifier, allowedCaptureMethods2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @JvmName
    private static final String getCtaText(ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods, Composer composer, int i) {
        String strStringResource;
        composer.startReplaceGroup(-1387367079);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1387367079, i, -1, "com.robinhood.android.doc.serverdriven.splash.<get-ctaText> (SddrSplashComposable.kt:21)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[allowedCaptureMethods.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1819898002);
            strStringResource = StringResources_androidKt.stringResource(C14254R.string.doc_upload_splash_take_photo, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-1819900141);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1819894226);
            strStringResource = StringResources_androidKt.stringResource(C14254R.string.doc_upload_splash_upload_pdf, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SddrSplashComposable(final UIComponent<? extends GenericAction> content, final ApiDocumentRequest.AllowedCaptureMethods primaryMethod, final Function1<? super ApiDocumentRequest.AllowedCaptureMethods, Unit> onMethodClicked, Modifier modifier, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        final ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods2;
        Composer composer2;
        final ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(primaryMethod, "primaryMethod");
        Intrinsics.checkNotNullParameter(onMethodClicked, "onMethodClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1300591723);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryMethod.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onMethodClicked) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(allowedCaptureMethods == null ? -1 : allowedCaptureMethods.ordinal()) ? 16384 : 8192;
            }
            i5 = i3;
            if ((i5 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods4 = i4 == 0 ? null : allowedCaptureMethods;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1300591723, i5, -1, "com.robinhood.android.doc.serverdriven.splash.SddrSplashComposable (SddrSplashComposable.kt:33)");
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SduiComponent3.SduiComponent(content, Column5.weight$default(column6, companion2, 1.0f, false, 2, null), HorizontalPadding.Default, composerStartRestartGroup, (i5 & 14) | 384, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String ctaText = getCtaText(primaryMethod, composerStartRestartGroup, (i5 >> 3) & 14);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i8 = i5 & 896;
                z = (i8 != 256) | ((i5 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrSplashComposable.SddrSplashComposable$lambda$4$lambda$1$lambda$0(onMethodClicked, primaryMethod);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                allowedCaptureMethods2 = allowedCaptureMethods4;
                Modifier modifier5 = modifier4;
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1916384567);
                if (allowedCaptureMethods2 != null) {
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                    String ctaText2 = getCtaText(allowedCaptureMethods2, composer2, (i5 >> 12) & 14);
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    composer2.startReplaceGroup(-1633490746);
                    boolean z2 = (i8 == 256) | ((i5 & 57344) == 16384);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SddrSplashComposable.SddrSplashComposable$lambda$4$lambda$3$lambda$2(onMethodClicked, allowedCaptureMethods2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, ctaText2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                allowedCaptureMethods3 = allowedCaptureMethods2;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                allowedCaptureMethods3 = allowedCaptureMethods;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SddrSplashComposable.SddrSplashComposable$lambda$5(content, primaryMethod, onMethodClicked, modifier3, allowedCaptureMethods3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i3;
        if ((i5 & 9363) == 9362) {
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                SduiComponent3.SduiComponent(content, Column5.weight$default(column62, companion22, 1.0f, false, 2, null), HorizontalPadding.Default, composerStartRestartGroup, (i5 & 14) | 384, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String ctaText3 = getCtaText(primaryMethod, composerStartRestartGroup, (i5 >> 3) & 14);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i82 = i5 & 896;
                z = (i82 != 256) | ((i5 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.doc.serverdriven.splash.SddrSplashComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SddrSplashComposable.SddrSplashComposable$lambda$4$lambda$1$lambda$0(onMethodClicked, primaryMethod);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    allowedCaptureMethods2 = allowedCaptureMethods4;
                    Modifier modifier52 = modifier4;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, ctaText3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(1916384567);
                    if (allowedCaptureMethods2 != null) {
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM()), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    allowedCaptureMethods3 = allowedCaptureMethods2;
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SddrSplashComposable$lambda$4$lambda$1$lambda$0(Function1 function1, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods) {
        function1.invoke(allowedCaptureMethods);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SddrSplashComposable$lambda$4$lambda$3$lambda$2(Function1 function1, ApiDocumentRequest.AllowedCaptureMethods allowedCaptureMethods) {
        function1.invoke(allowedCaptureMethods);
        return Unit.INSTANCE;
    }
}
