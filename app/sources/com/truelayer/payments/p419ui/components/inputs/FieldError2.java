package com.truelayer.payments.p419ui.components.inputs;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.FieldState;
import com.truelayer.payments.p419ui.components.inputs.form.models.ValidationError2;
import com.truelayer.payments.p419ui.theme.Spacing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FieldError.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ErrorText", "", "modifier", "Landroidx/compose/ui/Modifier;", "field", "Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/models/Field;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.inputs.FieldErrorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FieldError2 {
    public static final void ErrorText(Modifier modifier, final Field field, Composer composer, final int i, final int i2) {
        String strIntoDisplayString;
        Intrinsics.checkNotNullParameter(field, "field");
        Composer composerStartRestartGroup = composer.startRestartGroup(261847904);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(261847904, i, -1, "com.truelayer.payments.ui.components.inputs.ErrorText (FieldError.kt:18)");
        }
        composerStartRestartGroup.startReplaceableGroup(1115520999);
        if (field.getState() instanceof FieldState.Invalid) {
            strIntoDisplayString = ValidationError2.intoDisplayString(((FieldState.Invalid) field.getState()).getError(), field.getLabel(), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        } else {
            strIntoDisplayString = "";
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        Spacing spacing = Spacing.INSTANCE;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, spacing.m27177getREGULARD9Ej5fM(), spacing.m27178getSMALLD9Ej5fM());
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i3 = MaterialTheme.$stable;
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(materialTheme.getTypography(composerStartRestartGroup, i3).getBodySmall(), materialTheme.getColorScheme(composerStartRestartGroup, i3).getError(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        final Modifier modifier3 = modifier2;
        TextKt.m6028Text4IGK_g(strIntoDisplayString, modifierM5143paddingVpY3zN4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7655copyp1EtxEg$default, composerStartRestartGroup, 0, 0, 65532);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.FieldErrorKt.ErrorText.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    FieldError2.ErrorText(modifier3, field, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
