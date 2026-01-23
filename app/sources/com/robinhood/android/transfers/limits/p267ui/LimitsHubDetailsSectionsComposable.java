package com.robinhood.android.transfers.limits.p267ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitHubDetailsRow;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitsHubDetailsSection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: LimitsHubDetailsSectionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"LimitsHubDetailsSectionsComposable", "", "sections", "", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsSection;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "LimitsHubDetailRowPrefix", "", "feature-transfer-limits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSectionsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LimitsHubDetailsSectionsComposable {
    public static final String LimitsHubDetailRowPrefix = "limitsHubDetailRow_";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitsHubDetailsSectionsComposable$lambda$4(List list, int i, Composer composer, int i2) {
        LimitsHubDetailsSectionsComposable(list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LimitsHubDetailsSectionsComposable(final List<ApiLimitsHubDetailsSection> sections, Composer composer, final int i) {
        Composer composer2;
        Iterator it;
        int i2;
        Intrinsics.checkNotNullParameter(sections, "sections");
        Composer composerStartRestartGroup = composer.startRestartGroup(487428704);
        int i3 = 2;
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(sections) ? 4 : 2) | i : i;
        if ((i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487428704, i4, -1, "com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSectionsComposable (LimitsHubDetailsSectionsComposable.kt:17)");
            }
            Iterator it2 = sections.iterator();
            while (it2.hasNext()) {
                ApiLimitsHubDetailsSection apiLimitsHubDetailsSection = (ApiLimitsHubDetailsSection) it2.next();
                composerStartRestartGroup.startReplaceGroup(267555686);
                if (StringsKt.isBlank(apiLimitsHubDetailsSection.getTitle())) {
                    composerStartRestartGroup.startReplaceGroup(652495400);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    it = it2;
                    i2 = i3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(652664877);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Composer composer3 = composerStartRestartGroup;
                    it = it2;
                    i2 = i3;
                    BentoText2.m20747BentoText38GnDrw(apiLimitsHubDetailsSection.getTitle(), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(267575547);
                for (ApiLimitHubDetailsRow apiLimitHubDetailsRow : apiLimitsHubDetailsSection.getLimits()) {
                    ServerToBentoAssetMapper2 icon = apiLimitHubDetailsRow.getIcon().getIcon();
                    ServerToBentoAssetMapper2 layered_icon = apiLimitHubDetailsRow.getIcon().getLayered_icon();
                    Composer composer4 = composerStartRestartGroup;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(Modifier.INSTANCE, LimitsHubDetailRowPrefix + apiLimitHubDetailsRow.getType_description()), new BentoBaseRowState.Start.Icon(icon, layered_icon != null ? new BentoBaseRowState.Start.Icon.LayeredAsset(layered_icon, null, i2, null) : null, null, 4, null), apiLimitHubDetailsRow.getType_description(), apiLimitHubDetailsRow.getLimit_description(), null, null, null, false, false, false, 0L, null, composer4, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3952);
                    composerStartRestartGroup = composer4;
                }
                Composer composer5 = composerStartRestartGroup;
                composer5.endReplaceGroup();
                composer5.endReplaceGroup();
                i3 = i2;
                it2 = it;
            }
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSectionsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitsHubDetailsSectionsComposable.LimitsHubDetailsSectionsComposable$lambda$4(sections, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
