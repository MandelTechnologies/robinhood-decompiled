package com.robinhood.shared.support.supportchat.p396ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectionMenuView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuView$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class SelectionMenuView8 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<SelectionMenuRowModel, Unit> $onRowSelected;
    final /* synthetic */ List<SelectionMenuRowModel> $rowsToShow;

    /* JADX WARN: Multi-variable type inference failed */
    SelectionMenuView8(List<SelectionMenuRowModel> list, Function1<? super SelectionMenuRowModel, Unit> function1) {
        this.$rowsToShow = list;
        this.$onRowSelected = function1;
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
            ComposerKt.traceEventStart(1371603866, i, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMenuView.<anonymous>.<anonymous> (SelectionMenuView.kt:89)");
        }
        List<SelectionMenuRowModel> list = this.$rowsToShow;
        final Function1<SelectionMenuRowModel, Unit> function1 = this.$onRowSelected;
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
        composer.startReplaceGroup(-376636474);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final SelectionMenuRowModel selectionMenuRowModel = (SelectionMenuRowModel) obj;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(selectionMenuRowModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMenuViewKt$SelectionMenuView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelectionMenuView8.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function1, selectionMenuRowModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Composer composer2 = composer;
            SelectionMenuView6.SelectionMenuRow(selectionMenuRowModel, i2, (Function0) objRememberedValue, TestTag3.testTag(Modifier.INSTANCE, ChatMessageComposable7.SelectionMenuRow.indexedTestTag(i2)), composer2, 0, 0);
            composer2.startReplaceGroup(-376622294);
            if (i2 < CollectionsKt.getLastIndex(list)) {
                SelectionMenuView6.SelectionMenuDivider(null, composer2, 0, 1);
            }
            composer2.endReplaceGroup();
            i2 = i3;
            composer = composer2;
        }
        Composer composer3 = composer;
        composer3.endReplaceGroup();
        composer3.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, SelectionMenuRowModel selectionMenuRowModel) {
        function1.invoke(selectionMenuRowModel);
        return Unit.INSTANCE;
    }
}
