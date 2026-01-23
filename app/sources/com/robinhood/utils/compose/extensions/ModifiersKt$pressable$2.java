package com.robinhood.utils.compose.extensions;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Modifiers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class ModifiersKt$pressable$2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ long $color;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function1<Color, Unit> $onPressed;
    final /* synthetic */ float $pressedAlpha;

    /* JADX WARN: Multi-variable type inference failed */
    ModifiersKt$pressable$2(long j, float f, Function1<? super Color, Unit> function1, Function0<Unit> function0) {
        this.$color = j;
        this.$pressedAlpha = f;
        this.$onPressed = function1;
        this.$onClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    private static final boolean invoke$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$2(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        long jM6705copywmQWz5c$default;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-300752113);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-300752113, i, -1, "com.robinhood.utils.compose.extensions.pressable.<anonymous> (Modifiers.kt:58)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        SnapshotState4<Boolean> snapshotState4CollectIsPressedAsState = PressInteraction2.collectIsPressedAsState(interactionSource3, composer, 6);
        if (invoke$lambda$1(snapshotState4CollectIsPressedAsState)) {
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(this.$color, this.$pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM6705copywmQWz5c$default = this.$color;
        }
        SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM6705copywmQWz5c$default), composer, 0);
        Boolean boolValueOf = Boolean.valueOf(invoke$lambda$1(snapshotState4CollectIsPressedAsState));
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onPressed) | composer.changed(snapshotState4RememberUpdatedState);
        Function1<Color, Unit> function1 = this.$onPressed;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ModifiersKt$pressable$2$1$1(function1, snapshotState4RememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(composed, interactionSource3, null, false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), this.$onClick, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM4891clickableO2vRcR0$default;
    }
}
