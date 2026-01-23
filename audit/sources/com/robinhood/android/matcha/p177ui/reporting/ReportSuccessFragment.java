package com.robinhood.android.matcha.p177ui.reporting;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReportSuccessFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/ReportSuccessFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ReportSuccessFragment extends GenericComposeFragment {
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(ReportSuccessFragment reportSuccessFragment, int i, Composer composer, int i2) {
        reportSuccessFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        final ReportSuccessFragment reportSuccessFragment;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1882983793);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1882983793, i2, -1, "com.robinhood.android.matcha.ui.reporting.ReportSuccessFragment.ComposeContent (ReportSuccessFragment.kt:27)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            int i4 = i2;
            ImageKt.Image(PainterResources_androidKt.painterResource(C21284R.drawable.svg_thumbs_up, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 108);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 1, null);
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_report_success_title, composerStartRestartGroup, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5144paddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_report_success_detail, composerStartRestartGroup, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8126);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 14) != 4) {
                if ((i4 & 8) != 0) {
                    reportSuccessFragment = this;
                    if (composerStartRestartGroup.changedInstance(reportSuccessFragment)) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.reporting.ReportSuccessFragment$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReportSuccessFragment.ComposeContent$lambda$2$lambda$1$lambda$0(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default2, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8184);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    reportSuccessFragment = this;
                }
                z = false;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.reporting.ReportSuccessFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReportSuccessFragment.ComposeContent$lambda$2$lambda$1$lambda$0(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default2, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8184);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                reportSuccessFragment = this;
            }
            z = true;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            reportSuccessFragment = this;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.reporting.ReportSuccessFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReportSuccessFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1$lambda$0(ReportSuccessFragment reportSuccessFragment) {
        reportSuccessFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }
}
