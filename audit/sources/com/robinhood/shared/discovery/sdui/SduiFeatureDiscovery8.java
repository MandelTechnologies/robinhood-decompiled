package com.robinhood.shared.discovery.sdui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.C20692R;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiFeatureDiscovery.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$4$3, reason: use source file name */
/* loaded from: classes6.dex */
final class SduiFeatureDiscovery8 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SduiFeatureDiscovery2 $callback;
    final /* synthetic */ SnapshotState<Boolean> $showMore$delegate;

    SduiFeatureDiscovery8(SduiFeatureDiscovery2 sduiFeatureDiscovery2, SnapshotState<Boolean> snapshotState) {
        this.$callback = sduiFeatureDiscovery2;
        this.$showMore$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2095870214, i, -1, "com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery.<anonymous>.<anonymous>.<anonymous> (SduiFeatureDiscovery.kt:195)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C20692R.string.feature_discovery_show_less, composer, 0);
        BentoTextButton3.Icon.Size12 size12 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.CARET_UP_12, BentoTextButton3.Icon.Position.Trailing);
        long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU();
        Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), "feature_discovery-show_less", null, null, null, null, null, 62, null), true, false, false, true, false, null, 108, null), SduiFeatureDiscovery3.SHOW_MORE_TAG);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$callback);
        final SduiFeatureDiscovery2 sduiFeatureDiscovery2 = this.$callback;
        final SnapshotState<Boolean> snapshotState = this.$showMore$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureDiscoveryKt$SduiFeatureDiscovery$1$4$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SduiFeatureDiscovery8.invoke$lambda$1$lambda$0(sduiFeatureDiscovery2, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierTestTag, size12, null, false, Color.m6701boximpl(jM21368getAccent0d7_KjU), composer, BentoTextButton3.Icon.Size12.$stable << 9, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SduiFeatureDiscovery2 sduiFeatureDiscovery2, SnapshotState snapshotState) {
        SduiFeatureDiscovery3.SduiFeatureDiscovery$lambda$2(snapshotState, true);
        if (sduiFeatureDiscovery2 != null) {
            sduiFeatureDiscovery2.onExpanded(false);
        }
        return Unit.INSTANCE;
    }
}
