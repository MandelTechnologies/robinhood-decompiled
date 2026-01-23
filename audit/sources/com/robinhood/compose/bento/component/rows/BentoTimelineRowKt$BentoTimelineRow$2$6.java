package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class BentoTimelineRowKt$BentoTimelineRow$2$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ BentoTimelineRowState $this_with;

    BentoTimelineRowKt$BentoTimelineRow$2$6(BentoTimelineRowState bentoTimelineRowState, boolean z) {
        this.$this_with = bentoTimelineRowState;
        this.$enabled = z;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1709966610, i, -1, "com.robinhood.compose.bento.component.rows.BentoTimelineRow.<anonymous>.<anonymous> (BentoTimelineRow.kt:291)");
        }
        final BentoTimelineRowState bentoTimelineRowState = this.$this_with;
        boolean z = this.$enabled;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        String timestampText = bentoTimelineRowState.getTimestampText();
        if (timestampText == null) {
            timestampText = "";
        }
        String metadataText = bentoTimelineRowState.getMetadataText();
        String str = metadataText != null ? metadataText : "";
        Timeline.InfoAction infoAction = bentoTimelineRowState.getInfoAction();
        int maxLines = bentoTimelineRowState.getMaxLines();
        BentoTimelineRowKt.TimelineMetadata(timestampText, str, infoAction, ModifiersKt.bentoPlaceholder$default(companion, bentoTimelineRowState.getShowMetadataPlaceholder(), null, 2, null), maxLines, composer, 0, 0);
        composer.startReplaceGroup(2048749149);
        if (bentoTimelineRowState.getDetailContent() != null) {
            String tertiaryText = bentoTimelineRowState.getDetailContent().getTertiaryText();
            String detailThumbnailImage = bentoTimelineRowState.getDetailContent().getDetailThumbnailImage();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(bentoTimelineRowState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoTimelineRowKt$BentoTimelineRow$2$6.invoke$lambda$2$lambda$1$lambda$0(bentoTimelineRowState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTimelineRowKt.TimelineDetailContent(tertiaryText, detailThumbnailImage, null, z, false, (Function0) objRememberedValue, composer, 0, 20);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(BentoTimelineRowState bentoTimelineRowState) {
        Function0<Unit> detailThumbnailAction = bentoTimelineRowState.getDetailContent().getDetailThumbnailAction();
        if (detailThumbnailAction != null) {
            detailThumbnailAction.invoke();
        }
        return Unit.INSTANCE;
    }
}
