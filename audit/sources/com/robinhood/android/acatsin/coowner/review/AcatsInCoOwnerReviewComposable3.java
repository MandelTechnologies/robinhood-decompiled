package com.robinhood.android.acatsin.coowner.review;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.acatsin.coowner.C7877R;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState5;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInCoOwnerReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$6, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInCoOwnerReviewComposable3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ Function1<AcatsInCoOwnerReviewState5.Loaded, Unit> $onCancelAcatRequestClicked;
    final /* synthetic */ AcatsInCoOwnerReviewState5 $state;

    /* JADX WARN: Multi-variable type inference failed */
    AcatsInCoOwnerReviewComposable3(AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5, Function1<? super AcatsInCoOwnerReviewState5.Loaded, Unit> function1) {
        this.$state = acatsInCoOwnerReviewState5;
        this.$onCancelAcatRequestClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        int i2;
        Object obj;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1931961757, i2, -1, "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposable.<anonymous>.<anonymous> (AcatsInCoOwnerReviewComposable.kt:73)");
        }
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        final AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5 = this.$state;
        final Function1<AcatsInCoOwnerReviewState5.Loaded, Unit> function1 = this.$onCancelAcatRequestClicked;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        int i4 = i2;
        BentoPogKt.m20684BentoPictogramPogRhg8lNc(ServerToBentoAssetMapper3.WARNING.getResourceId(), PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null), false, BentoPogSize.Hero, null, null, null, composer, 3072, 116);
        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 1, null);
        String strStringResource = StringResources_androidKt.stringResource(C7877R.string.acats_in_review_coowner_cancel_sheet_title, composer, 0);
        TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall();
        TextAlign.Companion companion3 = TextAlign.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8124);
        AcatsInCoOwnerReviewState5.Loaded loaded = (AcatsInCoOwnerReviewState5.Loaded) acatsInCoOwnerReviewState5;
        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(loaded.getCancelSheetBodyText(), composer, StringResource.$stable), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
        boolean z = false;
        String strStringResource2 = StringResources_androidKt.stringResource(C7877R.string.acats_in_review_coowner_cancel_button_text, composer, 0);
        boolean zIsCancelSheetLoading = loaded.isCancelSheetLoading();
        String strStringResource3 = StringResources_androidKt.stringResource(C7877R.string.acats_in_review_coowner_never_mind_button_text, composer, 0);
        composer.startReplaceGroup(5004770);
        if ((i4 & 14) != 4) {
            if ((i4 & 8) != 0) {
                obj = RhModalBottomSheet;
                if (composer.changedInstance(obj)) {
                }
            } else {
                obj = RhModalBottomSheet;
            }
            objRememberedValue = composer.rememberedValue();
            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AcatsInCoOwnerReviewComposable4(obj);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            boolean zIsCancelSheetLoading2 = loaded.isCancelSheetLoading();
            composer.startReplaceGroup(-1633490746);
            zChanged = composer.changed(function1) | composer.changed(acatsInCoOwnerReviewState5);
            objRememberedValue2 = composer.rememberedValue();
            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInCoOwnerReviewComposable3.invoke$lambda$3$lambda$2$lambda$1(function1, acatsInCoOwnerReviewState5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, (Function0) objRememberedValue2, strStringResource2, zIsCancelSheetLoading, null, false, function0, strStringResource3, zIsCancelSheetLoading2, null, false, composer, 0, 0, 50750);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                return;
            }
            ComposerKt.traceEventEnd();
            return;
        }
        obj = RhModalBottomSheet;
        z = true;
        objRememberedValue = composer.rememberedValue();
        if (!z) {
            objRememberedValue = new AcatsInCoOwnerReviewComposable4(obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        boolean zIsCancelSheetLoading22 = loaded.isCancelSheetLoading();
        composer.startReplaceGroup(-1633490746);
        zChanged = composer.changed(function1) | composer.changed(acatsInCoOwnerReviewState5);
        objRememberedValue2 = composer.rememberedValue();
        if (!zChanged) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsInCoOwnerReviewComposable3.invoke$lambda$3$lambda$2$lambda$1(function1, acatsInCoOwnerReviewState5);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, (Function0) objRememberedValue2, strStringResource2, zIsCancelSheetLoading, null, false, function02, strStringResource3, zIsCancelSheetLoading22, null, false, composer, 0, 0, 50750);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5) {
        function1.invoke(acatsInCoOwnerReviewState5);
        return Unit.INSTANCE;
    }
}
