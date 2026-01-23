package com.robinhood.android.pathfinder.corepages.attestation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AttestationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$Agreement$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class AttestationComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ Function0<Unit> $onClickCheckBox;

    AttestationComposable2(int i, boolean z, Function0<Unit> function0) {
        this.$index = i;
        this.$isChecked = z;
        this.$onClickCheckBox = function0;
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
            ComposerKt.traceEventStart(-539440445, i, -1, "com.robinhood.android.pathfinder.corepages.attestation.Agreement.<anonymous>.<anonymous>.<anonymous> (AttestationComposable.kt:122)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AttestationComposable.indexed(AttestationComposable.AttesttationTestTagAgreementCheckbox, this.$index));
        boolean z = this.$isChecked;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onClickCheckBox);
        final Function0<Unit> function0 = this.$onClickCheckBox;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.attestation.AttestationComposableKt$Agreement$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AttestationComposable2.invoke$lambda$1$lambda$0(function0, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(modifierTestTag, z, false, null, (Function1) objRememberedValue, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, boolean z) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
