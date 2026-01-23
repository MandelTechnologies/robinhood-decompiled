package com.robinhood.android.aura;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StaticAura.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.aura.StaticAuraKt$PreviewStaticShader$1$5, reason: use source file name */
/* loaded from: classes7.dex */
final class StaticAura3 implements Function3<Column5, Composer, Integer, Unit> {
    final /* synthetic */ List<StaticAura5> $auraTypes;
    final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
    final /* synthetic */ SnapshotState<StaticAura5> $selectedType$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    StaticAura3(List<? extends StaticAura5> list, SnapshotState<StaticAura5> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$auraTypes = list;
        this.$selectedType$delegate = snapshotState;
        this.$expanded$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
        invoke(column5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(StaticAura5 staticAura5, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(staticAura5);
        StaticAura.PreviewStaticShader$lambda$17$lambda$12(snapshotState2, false);
        return Unit.INSTANCE;
    }

    public final void invoke(Column5 DropdownMenu, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-864979992, i, -1, "com.robinhood.android.aura.PreviewStaticShader.<anonymous>.<anonymous> (StaticAura.kt:232)");
        }
        List<StaticAura5> list = this.$auraTypes;
        final SnapshotState<StaticAura5> snapshotState = this.$selectedType$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$expanded$delegate;
        for (final StaticAura5 staticAura5 : list) {
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(staticAura5);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.aura.StaticAuraKt$PreviewStaticShader$1$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StaticAura3.invoke$lambda$2$lambda$1$lambda$0(staticAura5, snapshotState, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AndroidMenu_androidKt.DropdownMenuItem((Function0) objRememberedValue, null, false, null, null, ComposableLambda3.rememberComposableLambda(779296661, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.aura.StaticAuraKt$PreviewStaticShader$1$5$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 DropdownMenuItem, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(779296661, i2, -1, "com.robinhood.android.aura.PreviewStaticShader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StaticAura.kt:234)");
                    }
                    String simpleName = Reflection.getOrCreateKotlinClass(staticAura5.getClass()).getSimpleName();
                    Intrinsics.checkNotNull(simpleName);
                    TextKt.m5665Text4IGK_g(simpleName, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 196608, 30);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
