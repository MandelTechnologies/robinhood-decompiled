package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingLaunchMode;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IraDistributionTaxWithholdingBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"TagIraDistributionTaxWithholdingBottomSheetTitle", "", "TagIraDistributionTaxWithholdingBottomSheetSubtitle", "TagIraDistributionTaxWithholdingBottomSheetAmount", "TagIraDistributionClawbackWithholdingBottomSheetAmount", "TagIraDistributionTaxWithholdingBottomSheetFederal", "TagIraDistributionTaxWithholdingBottomSheetState", "TagIraDistributionTaxWithholdingBottomSheetReceived", "TagIraDistributionTaxWithholdingBottomSheetCta", "IraDistributionTaxWithholdingBottomSheet", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "useManagedAccountDisplay", "", "callbacks", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;ZLcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IraDistributionTaxWithholdingBottomSheet2 {
    public static final String TagIraDistributionClawbackWithholdingBottomSheetAmount = "ira-distribution-withholding-bottom-sheet-clawback-amount";
    public static final String TagIraDistributionTaxWithholdingBottomSheetAmount = "ira-distribution-withholding-bottom-sheet-amount";
    public static final String TagIraDistributionTaxWithholdingBottomSheetCta = "ira-distribution-withholding-bottom-sheet-cta";
    public static final String TagIraDistributionTaxWithholdingBottomSheetFederal = "ira-distribution-withholding-bottom-sheet-federal";
    public static final String TagIraDistributionTaxWithholdingBottomSheetReceived = "ira-distribution-withholding-bottom-sheet-received";
    public static final String TagIraDistributionTaxWithholdingBottomSheetState = "ira-distribution-withholding-bottom-sheet-state";
    public static final String TagIraDistributionTaxWithholdingBottomSheetSubtitle = "ira-distribution-withholding-bottom-sheet-subtitle";
    public static final String TagIraDistributionTaxWithholdingBottomSheetTitle = "ira-distribution-withholding-bottom-sheet-title";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IraDistributionTaxWithholdingBottomSheet$lambda$21(Modifier modifier, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, boolean z, IraDistributionTaxWithholdingBottomSheet3 iraDistributionTaxWithholdingBottomSheet3, int i, int i2, Composer composer, int i3) {
        IraDistributionTaxWithholdingBottomSheet(modifier, apiIraDistributionTaxWithholding, z, iraDistributionTaxWithholdingBottomSheet3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0592 A[Catch: all -> 0x0596, TRY_ENTER, TryCatch #0 {all -> 0x0596, blocks: (B:141:0x0592, B:146:0x059c, B:145:0x0599), top: B:174:0x0590 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0599 A[Catch: all -> 0x0596, TryCatch #0 {all -> 0x0596, blocks: (B:141:0x0592, B:146:0x059c, B:145:0x0599), top: B:174:0x0590 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IraDistributionTaxWithholdingBottomSheet(Modifier modifier, final ApiIraDistributionTaxWithholding state, final boolean z, final IraDistributionTaxWithholdingBottomSheet3 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        AnnotatedString annotatedString;
        int i4;
        boolean z2;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i5;
        boolean z3;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        AnnotatedString.Builder builder;
        int iPushStyle;
        boolean z4;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1795759919);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795759919, i3, -1, "com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheet (IraDistributionTaxWithholdingBottomSheet.kt:61)");
            }
            ApiIraDistributionTaxWithholding.LearnMore learn_more = state.getLearn_more();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetTitle);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            int i8 = i3;
            Modifier modifier5 = modifier4;
            BentoText2.m20747BentoText38GnDrw(learn_more.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(learn_more.getBody_markdown(), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetSubtitle), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 7, null), null, null, 0, null, 0, 0, null, composerStartRestartGroup, 0, 508);
            final boolean z5 = state.is_editable() && BigDecimals7.isPositive(state.getAmount());
            composerStartRestartGroup.startReplaceGroup(1114619533);
            if (z5) {
                builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(1114621614);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C11048R.string.general_action_edit, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    annotatedString = builder.toAnnotatedString();
                } finally {
                }
            } else {
                annotatedString = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag2 = TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetAmount);
            AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C30065R.string.transfer_ira_tax_withholding_withdrawal_amount, composerStartRestartGroup, 0), null, 2, null);
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
            BigDecimal amount = state.getAmount();
            Currency currency = Currencies.USD;
            builder2.append(Money.format$default(Money3.toMoney(amount, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            Unit unit2 = Unit.INSTANCE;
            BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(builder2.toAnnotatedString());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i9 = i8 & 7168;
            boolean zChanged = (i9 == 2048 || ((i8 & 4096) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changed(z5);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IraDistributionTaxWithholdingBottomSheet2.m2543x3c91f2bc(z5, callbacks);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i10 = BentoBaseRowState.Meta.SingleLine.$stable;
            final boolean z6 = z5;
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag2, null, annotatedString2, annotatedString, null, singleLine, null, false, false, false, false, false, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, (i10 << 15) | 12582918, 0, 8018);
            AnnotatedString annotatedString3 = annotatedString;
            Composer composer3 = composerStartRestartGroup;
            BigDecimal clawback_withholding_amount = state.getClawback_withholding_amount();
            if (clawback_withholding_amount == null || !BigDecimals7.isPositive(clawback_withholding_amount)) {
                clawback_withholding_amount = null;
            }
            composer3.startReplaceGroup(1114661857);
            if (clawback_withholding_amount != null) {
                Modifier modifierTestTag3 = TestTag3.testTag(companion2, TagIraDistributionClawbackWithholdingBottomSheetAmount);
                AnnotatedString annotatedString4 = new AnnotatedString(StringResources_androidKt.stringResource(C30065R.string.transfer_ira_tax_withholding_clawback_amount, composer3, 0), null, 2, null);
                AnnotatedString.Builder builder3 = new AnnotatedString.Builder(0, 1, null);
                builder3.append(Money.Adjustment.format$default(Money3.toMoney(clawback_withholding_amount, currency).toDebitAdjustment(), false, null, 3, null));
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag3, null, annotatedString4, null, null, new BentoBaseRowState.Meta.SingleLine(builder3.toAnnotatedString()), null, false, false, false, false, false, 0L, null, composer3, (i10 << 15) | 12582918, 0, 16218);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            Modifier modifierTestTag4 = TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetFederal);
            AnnotatedString annotatedString5 = new AnnotatedString(StringResources_androidKt.stringResource(C30065R.string.f4994x70a43663, new Object[]{Formats.getPercentFormat().format(state.getFederal_withholding_percent())}, composer3, 0), null, 2, null);
            AnnotatedString.Builder builder4 = new AnnotatedString.Builder(0, 1, null);
            builder4.append(Money.Adjustment.format$default(Money3.toMoney(state.getFederal_withholding_amount(), currency).toDebitAdjustment(), false, null, 3, null));
            BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(builder4.toAnnotatedString());
            composer3.startReplaceGroup(-1746271574);
            boolean zChanged2 = composer3.changed(z6);
            if (i9 != 2048) {
                i4 = i8;
                if ((i4 & 4096) == 0 || !composer3.changedInstance(callbacks)) {
                    z2 = false;
                }
                zChangedInstance = zChanged2 | z2 | composer3.changedInstance(state);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IraDistributionTaxWithholdingBottomSheet2.m2540x65bde88b(z6, callbacks, state);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                Composer composer4 = composer3;
                int i11 = i4;
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag4, null, annotatedString5, annotatedString3, null, singleLine2, null, false, false, false, false, false, 0L, (Function0) objRememberedValue, composer4, (i10 << 15) | 12582918, 0, 8018);
                Modifier modifierTestTag5 = TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetState);
                AnnotatedString annotatedString6 = new AnnotatedString(StringResources_androidKt.stringResource(C30065R.string.f4996x9bedb2f, new Object[]{state.getState(), Formats.getPercentFormat().format(state.getState_withholding_percent())}, composer4, 0), null, 2, null);
                AnnotatedString.Builder builder5 = new AnnotatedString.Builder(0, 1, null);
                builder5.append(Money.Adjustment.format$default(Money3.toMoney(state.getState_withholding_amount(), currency).toDebitAdjustment(), false, null, 3, null));
                BentoBaseRowState.Meta.SingleLine singleLine3 = new BentoBaseRowState.Meta.SingleLine(builder5.toAnnotatedString());
                composer4.startReplaceGroup(-1746271574);
                boolean zChanged3 = composer4.changed(z6);
                if (i9 == 2048) {
                    i5 = i11;
                    if ((i5 & 4096) == 0 || !composer4.changedInstance(callbacks)) {
                        z3 = false;
                    }
                    zChangedInstance2 = zChanged3 | z3 | composer4.changedInstance(state);
                    objRememberedValue2 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IraDistributionTaxWithholdingBottomSheet2.m2541x10ad4052(z6, callbacks, state);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer4.endReplaceGroup();
                    int i12 = i5;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag5, null, annotatedString6, annotatedString3, null, singleLine3, null, false, false, false, false, false, 0L, (Function0) objRememberedValue2, composer4, (i10 << 15) | 12582918, 0, 8018);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0L, 0.0f, composer4, 0, 6);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetReceived), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 7, null);
                    composer4.startReplaceGroup(1114775469);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    composer4.startReplaceGroup(1114776664);
                    FontWeight.Companion companion3 = FontWeight.INSTANCE;
                    iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(!z ? C30065R.string.transfer_ira_tax_withholding_est_amount_received : C30065R.string.transfer_ira_tax_withholding_amount_received, composer4, 0));
                        builder.pop(iPushStyle);
                        composer4.endReplaceGroup();
                        AnnotatedString annotatedString7 = builder.toAnnotatedString();
                        composer4.endReplaceGroup();
                        builder = new AnnotatedString.Builder(0, 1, null);
                        iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        try {
                            builder.append(Money.format$default(Money3.toMoney(state.getAmount_received(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                            builder.pop(iPushStyle);
                            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierM5146paddingqDBjuR0$default, null, annotatedString7, null, null, new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString()), null, false, false, false, false, false, 0L, null, composer4, (i10 << 15) | 12582912, 0, 16218);
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetCta), 0.0f, 1, null), bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 7, null);
                            z4 = false;
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0);
                            composer4.startReplaceGroup(5004770);
                            if (i9 != 2048 || ((i12 & 4096) != 0 && composer4.changedInstance(callbacks))) {
                                z4 = true;
                            }
                            objRememberedValue3 = composer4.rememberedValue();
                            if (!z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return IraDistributionTaxWithholdingBottomSheet2.m2542x8e0970de(callbacks);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue3);
                            }
                            composer4.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource, modifierM5146paddingqDBjuR0$default2, null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                            composer2 = composer4;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    i5 = i11;
                }
                z3 = true;
                zChangedInstance2 = zChanged3 | z3 | composer4.changedInstance(state);
                objRememberedValue2 = composer4.rememberedValue();
                if (zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IraDistributionTaxWithholdingBottomSheet2.m2541x10ad4052(z6, callbacks, state);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                    composer4.endReplaceGroup();
                    int i122 = i5;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag5, null, annotatedString6, annotatedString3, null, singleLine3, null, false, false, false, false, false, 0L, (Function0) objRememberedValue2, composer4, (i10 << 15) | 12582918, 0, 8018);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0L, 0.0f, composer4, 0, 6);
                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetReceived), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 7, null);
                    composer4.startReplaceGroup(1114775469);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    composer4.startReplaceGroup(1114776664);
                    FontWeight.Companion companion32 = FontWeight.INSTANCE;
                    iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion32.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                    builder.append(StringResources_androidKt.stringResource(!z ? C30065R.string.transfer_ira_tax_withholding_est_amount_received : C30065R.string.transfer_ira_tax_withholding_amount_received, composer4, 0));
                    builder.pop(iPushStyle);
                    composer4.endReplaceGroup();
                    AnnotatedString annotatedString72 = builder.toAnnotatedString();
                    composer4.endReplaceGroup();
                    builder = new AnnotatedString.Builder(0, 1, null);
                    iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion32.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                    builder.append(Money.format$default(Money3.toMoney(state.getAmount_received(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                    builder.pop(iPushStyle);
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierM5146paddingqDBjuR0$default3, null, annotatedString72, null, null, new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString()), null, false, false, false, false, false, 0L, null, composer4, (i10 << 15) | 12582912, 0, 16218);
                    Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetCta), 0.0f, 1, null), bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21592getMediumD9Ej5fM(), 7, null);
                    z4 = false;
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0);
                    composer4.startReplaceGroup(5004770);
                    if (i9 != 2048) {
                        z4 = true;
                        objRememberedValue3 = composer4.rememberedValue();
                        if (!z4) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IraDistributionTaxWithholdingBottomSheet2.m2542x8e0970de(callbacks);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue3);
                            composer4.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierM5146paddingqDBjuR0$default22, null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                            composer2 = composer4;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier5;
                        }
                    }
                }
            } else {
                i4 = i8;
            }
            z2 = true;
            zChangedInstance = zChanged2 | z2 | composer3.changedInstance(state);
            objRememberedValue = composer3.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IraDistributionTaxWithholdingBottomSheet2.m2540x65bde88b(z6, callbacks, state);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
                composer3.endReplaceGroup();
                Composer composer42 = composer3;
                int i112 = i4;
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag4, null, annotatedString5, annotatedString3, null, singleLine2, null, false, false, false, false, false, 0L, (Function0) objRememberedValue, composer42, (i10 << 15) | 12582918, 0, 8018);
                Modifier modifierTestTag52 = TestTag3.testTag(companion2, TagIraDistributionTaxWithholdingBottomSheetState);
                AnnotatedString annotatedString62 = new AnnotatedString(StringResources_androidKt.stringResource(C30065R.string.f4996x9bedb2f, new Object[]{state.getState(), Formats.getPercentFormat().format(state.getState_withholding_percent())}, composer42, 0), null, 2, null);
                AnnotatedString.Builder builder52 = new AnnotatedString.Builder(0, 1, null);
                builder52.append(Money.Adjustment.format$default(Money3.toMoney(state.getState_withholding_amount(), currency).toDebitAdjustment(), false, null, 3, null));
                BentoBaseRowState.Meta.SingleLine singleLine32 = new BentoBaseRowState.Meta.SingleLine(builder52.toAnnotatedString());
                composer42.startReplaceGroup(-1746271574);
                boolean zChanged32 = composer42.changed(z6);
                if (i9 == 2048) {
                }
                z3 = true;
                zChangedInstance2 = zChanged32 | z3 | composer42.changedInstance(state);
                objRememberedValue2 = composer42.rememberedValue();
                if (zChangedInstance2) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IraDistributionTaxWithholdingBottomSheet2.IraDistributionTaxWithholdingBottomSheet$lambda$21(modifier3, state, z, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IraDistributionTaxWithholdingBottomSheet$lambda$20$lambda$4$lambda$3 */
    public static final Unit m2543x3c91f2bc(boolean z, IraDistributionTaxWithholdingBottomSheet3 iraDistributionTaxWithholdingBottomSheet3) {
        if (z) {
            iraDistributionTaxWithholdingBottomSheet3.onEditWithdrawalAmountClicked();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IraDistributionTaxWithholdingBottomSheet$lambda$20$lambda$10$lambda$9 */
    public static final Unit m2540x65bde88b(boolean z, IraDistributionTaxWithholdingBottomSheet3 iraDistributionTaxWithholdingBottomSheet3, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding) {
        if (z) {
            iraDistributionTaxWithholdingBottomSheet3.onLaunchEditWithholding(new EditIraDistributionTaxWithholdingLaunchMode.Federal(apiIraDistributionTaxWithholding));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IraDistributionTaxWithholdingBottomSheet$lambda$20$lambda$13$lambda$12 */
    public static final Unit m2541x10ad4052(boolean z, IraDistributionTaxWithholdingBottomSheet3 iraDistributionTaxWithholdingBottomSheet3, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding) {
        if (z) {
            iraDistributionTaxWithholdingBottomSheet3.onLaunchEditWithholding(new EditIraDistributionTaxWithholdingLaunchMode.State(apiIraDistributionTaxWithholding));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IraDistributionTaxWithholdingBottomSheet$lambda$20$lambda$19$lambda$18 */
    public static final Unit m2542x8e0970de(IraDistributionTaxWithholdingBottomSheet3 iraDistributionTaxWithholdingBottomSheet3) {
        iraDistributionTaxWithholdingBottomSheet3.onDoneClicked();
        return Unit.INSTANCE;
    }
}
