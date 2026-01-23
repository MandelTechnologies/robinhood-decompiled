package com.robinhood.shared.common.agreementview;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: AgreementAdditionalCheckboxes.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$AgreementAdditionalCheckboxes$3$1, reason: use source file name */
/* loaded from: classes26.dex */
final class AgreementAdditionalCheckboxes3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotStateList<Boolean> $checkboxStates;
    final /* synthetic */ ImmutableList<String> $checkboxes;

    AgreementAdditionalCheckboxes3(ImmutableList<String> immutableList, SnapshotStateList<Boolean> snapshotStateList) {
        this.$checkboxes = immutableList;
        this.$checkboxStates = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotStateList snapshotStateList, int i) {
        snapshotStateList.set(i, Boolean.valueOf(!((Boolean) snapshotStateList.get(i)).booleanValue()));
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390333934, i, -1, "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes.<anonymous>.<anonymous> (AgreementAdditionalCheckboxes.kt:87)");
        }
        ImmutableList<String> immutableList = this.$checkboxes;
        final SnapshotStateList<Boolean> snapshotStateList = this.$checkboxStates;
        final int i2 = 0;
        for (String str : immutableList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.Checkbox, str, snapshotStateList.get(i2).booleanValue(), (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, true, (ImmutableMap) null, (Function0) null, 1752, (DefaultConstructorMarker) null);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged = composer2.changed(i2);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$AgreementAdditionalCheckboxes$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgreementAdditionalCheckboxes3.invoke$lambda$2$lambda$1$lambda$0(snapshotStateList, i2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(modifierM5144paddingVpY3zN4$default, bentoSelectionRowState, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 0);
            composer2 = composer;
            i2 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
