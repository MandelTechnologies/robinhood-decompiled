package com.robinhood.android.common.emojipicker;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListEmojiPickerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$1$1$1$6, reason: use source file name */
/* loaded from: classes2.dex */
final class CuratedListEmojiPickerComposable4 implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    final /* synthetic */ EmojiGroup $emojiGroup;
    final /* synthetic */ SnapshotState<Map<String, Boolean>> $expandedStateMap$delegate;

    CuratedListEmojiPickerComposable4(EmojiGroup emojiGroup, SnapshotState<Map<String, Boolean>> snapshotState) {
        this.$emojiGroup = emojiGroup;
        this.$expandedStateMap$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
        invoke(lazyGridItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(EmojiGroup emojiGroup, SnapshotState snapshotState) {
        Map mutableMap = MapsKt.toMutableMap(CuratedListEmojiPickerComposable.CuratedListEmojiPickerComposable$lambda$3(snapshotState));
        mutableMap.put(emojiGroup.getTitle(), Boolean.TRUE);
        snapshotState.setValue(mutableMap);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyGridItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1106957749, i, -1, "com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CuratedListEmojiPickerComposable.kt:82)");
        }
        if (Intrinsics.areEqual(CuratedListEmojiPickerComposable.CuratedListEmojiPickerComposable$lambda$3(this.$expandedStateMap$delegate).get(this.$emojiGroup.getTitle()), Boolean.FALSE)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            final EmojiGroup emojiGroup = this.$emojiGroup;
            final SnapshotState<Map<String, Boolean>> snapshotState = this.$expandedStateMap$delegate;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU();
            String strStringResource = StringResources_androidKt.stringResource(C11149R.string.emoji_picker_show_more, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(emojiGroup);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$1$1$1$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListEmojiPickerComposable4.invoke$lambda$2$lambda$1$lambda$0(emojiGroup, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5143paddingVpY3zN4, null, null, false, Color.m6701boximpl(jM21456getPositive0d7_KjU), composer, 0, 56);
            composer.endNode();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
