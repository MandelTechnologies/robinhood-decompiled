package com.robinhood.android.acats.plaid.transfer.partial;

import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferAssetRow$1$2 */
/* loaded from: classes24.dex */
final class C7542x1040039a implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $data;
    final /* synthetic */ Function1<AcatsPlaidPartialTransferAssetRowData, Unit> $onRowClicked;
    final /* synthetic */ Resources $resources;

    /* JADX WARN: Multi-variable type inference failed */
    C7542x1040039a(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, Resources resources, Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function1) {
        this.$data = acatsPlaidPartialTransferAssetRowData;
        this.$resources = resources;
        this.$onRowClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BentoBaseRowState.Meta singleLineAndIcon;
        EquityAsset equityAsset;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2055784742, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRow.<anonymous>.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:289)");
        }
        AcatsPlaidPartialTransferDuxo3 type2 = this.$data.getType();
        AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment = type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment ? (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2 : null;
        BigDecimal borrowFee = (equityAssetWithAdjustment == null || (equityAsset = equityAssetWithAdjustment.getEquityAsset()) == null) ? null : equityAsset.getBorrowFee();
        if (borrowFee != null) {
            composer.startReplaceGroup(-1944326853);
            StringResource metaText = this.$data.getMetaText();
            Resources resources = this.$resources;
            Intrinsics.checkNotNull(resources);
            singleLineAndIcon = new BentoBaseRowState.Meta.TwoLineAndIcon(new AnnotatedString(metaText.getText(resources).toString(), null, 2, null), new AnnotatedString(StringResources_androidKt.stringResource(C7686R.string.acats_in_borrowing_fee_rate, new Object[]{Formats.getLeadingZeroesHundredthPercentFormat().format(borrowFee)}, composer, 0), null, 2, null), ServerToBentoAssetMapper2.CARET_RIGHT_16, "", Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU()), null, 32, null);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1943714324);
            StringResource metaText2 = this.$data.getMetaText();
            Resources resources2 = this.$resources;
            Intrinsics.checkNotNull(resources2);
            singleLineAndIcon = new BentoBaseRowState.Meta.SingleLineAndIcon(metaText2.getText(resources2).toString(), ServerToBentoAssetMapper2.CARET_RIGHT_16, "", Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU()), (DefaultConstructorMarker) null);
            composer.endReplaceGroup();
        }
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
        StringResource primaryText = this.$data.getPrimaryText();
        Resources resources3 = this.$resources;
        Intrinsics.checkNotNull(resources3);
        AnnotatedString annotatedString = new AnnotatedString(primaryText.getText(resources3).toString(), null, 2, null);
        StringResource secondaryText = this.$data.getSecondaryText();
        Resources resources4 = this.$resources;
        Intrinsics.checkNotNull(resources4);
        AnnotatedString annotatedString2 = new AnnotatedString(secondaryText.getText(resources4).toString(), null, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onRowClicked) | composer.changed(this.$data);
        final Function1<AcatsPlaidPartialTransferAssetRowData, Unit> function1 = this.$onRowClicked;
        final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.$data;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferAssetRow$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7542x1040039a.invoke$lambda$1$lambda$0(function1, acatsPlaidPartialTransferAssetRowData);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, annotatedString, annotatedString2, null, singleLineAndIcon, null, false, false, true, false, false, 0L, (Function0) objRememberedValue, composer, (BentoBaseRowState.Meta.$stable << 15) | 817889280, 0, 7506);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData) {
        function1.invoke(acatsPlaidPartialTransferAssetRowData);
        return Unit.INSTANCE;
    }
}
