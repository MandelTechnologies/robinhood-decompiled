package com.robinhood.android.matcha.p177ui.p178qr.amount;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QrBottomSheetContent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"QrBottomSheetContent", "", "qrCodeBitmap", "Landroid/graphics/Bitmap;", "userFullName", "", "userUsername", "amount", "Lcom/robinhood/models/util/Money;", "onDismissClick", "Lkotlin/Function0;", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/util/Money;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.qr.amount.QrBottomSheetContentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class QrBottomSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QrBottomSheetContent$lambda$1(Bitmap bitmap, String str, String str2, Money money, Function0 function0, int i, Composer composer, int i2) {
        QrBottomSheetContent(bitmap, str, str2, money, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void QrBottomSheetContent(final Bitmap bitmap, final String str, final String str2, final Money amount, final Function0<Unit> onDismissClick, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i4;
        Composer composer2;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        Modifier.Companion companion2;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(onDismissClick, "onDismissClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-451579156);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(amount) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-451579156, i2, -1, "com.robinhood.android.matcha.ui.qr.amount.QrBottomSheetContent (QrBottomSheetContent.kt:33)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (bitmap != null) {
                composerStartRestartGroup.startReplaceGroup(249543698);
                i3 = i2;
                bentoTheme = bentoTheme2;
                i4 = i6;
                z2 = false;
                z = true;
                companion = companion3;
                z3 = false;
                ImageKt.m4912Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, null, null, null, 0.0f, null, 0, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                i3 = i2;
                companion = companion3;
                bentoTheme = bentoTheme2;
                i4 = i6;
                composer2 = composerStartRestartGroup;
                z = true;
                z2 = false;
                z3 = false;
                composer2.startReplaceGroup(249695784);
                BoxKt.Box(SizeKt.m5169size3ABfNKs(ModifiersKt.bentoPlaceholder(companion, true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), PrimitiveResources_androidKt.dimensionResource(C21284R.dimen.matcha_qr_code_size, composer2, 0)), composer2, 0);
                composer2.endReplaceGroup();
            }
            Composer composer3 = composer2;
            int i7 = i3;
            Modifier.Companion companion5 = companion;
            BentoTheme bentoTheme3 = bentoTheme;
            int i8 = i4;
            String str3 = Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            TextStyle displayCapsuleMedium = bentoTheme3.getTypography(composer3, i8).getDisplayCapsuleMedium();
            TextAlign.Companion companion6 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme3.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8124);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.startReplaceGroup(-684661246);
            if (str != null) {
                companion2 = companion5;
                i5 = i8;
                BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleSmall(), composerStartRestartGroup, (i7 >> 3) & 14, 0, 8126);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i5 = i8;
                companion2 = companion5;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-684653804);
            if (str2 != null) {
                Composer composer4 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i5).getTextM(), composer4, (i7 >> 6) & 14, 0, 8126);
                composerStartRestartGroup = composer4;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(onDismissClick, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i7 >> 12) & 14, 0, 8184);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.amount.QrBottomSheetContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QrBottomSheetContent.QrBottomSheetContent$lambda$1(bitmap, str, str2, amount, onDismissClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
