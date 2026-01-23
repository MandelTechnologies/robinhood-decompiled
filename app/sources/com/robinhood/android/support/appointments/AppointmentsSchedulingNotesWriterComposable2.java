package com.robinhood.android.support.appointments;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppointmentsSchedulingNotesWriterComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$AppointmentsSchedulingNotesWriterComposable$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class AppointmentsSchedulingNotesWriterComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ SnapshotState<TextFieldValue> $textFieldValue$delegate;
    final /* synthetic */ Column5 $this_Column;

    AppointmentsSchedulingNotesWriterComposable2(Column5 column5, long j, SnapshotState<TextFieldValue> snapshotState) {
        this.$this_Column = column5;
        this.$cursorColor = j;
        this.$textFieldValue$delegate = snapshotState;
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
            ComposerKt.traceEventStart(1679325412, i, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposable.<anonymous>.<anonymous> (AppointmentsSchedulingNotesWriterComposable.kt:96)");
        }
        Column5 column5 = this.$this_Column;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierWeight$default = Column5.weight$default(column5, PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null);
        TextFieldValue textFieldValueAppointmentsSchedulingNotesWriterComposable$lambda$1 = AppointmentsSchedulingNotesWriterComposable.AppointmentsSchedulingNotesWriterComposable$lambda$1(this.$textFieldValue$delegate);
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        SolidColor solidColor = new SolidColor(this.$cursorColor, null);
        composer.startReplaceGroup(5004770);
        final SnapshotState<TextFieldValue> snapshotState = this.$textFieldValue$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$AppointmentsSchedulingNotesWriterComposable$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppointmentsSchedulingNotesWriterComposable2.invoke$lambda$1$lambda$0(snapshotState, (TextFieldValue) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        final Column5 column52 = this.$this_Column;
        BasicTextFieldKt.BasicTextField(textFieldValueAppointmentsSchedulingNotesWriterComposable$lambda$1, (Function1<? super TextFieldValue, Unit>) objRememberedValue, modifierWeight$default, false, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-859433119, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposableKt$AppointmentsSchedulingNotesWriterComposable$1$2.2
            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i3 & 6) == 0) {
                    i3 |= composer2.changedInstance(innerTextField) ? 4 : 2;
                }
                if ((i3 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-859433119, i3, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulingNotesWriterComposable.<anonymous>.<anonymous>.<anonymous> (AppointmentsSchedulingNotesWriterComposable.kt:113)");
                }
                Column5 column53 = column52;
                Modifier.Companion companion = Modifier.INSTANCE;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierWeight$default2 = Column5.weight$default(column53, PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxSize$default(BorderKt.m4876borderxT4_qwU(companion, fM7995constructorimpl, bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4))), 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer2, Integer.valueOf(i3 & 14));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                return Unit.INSTANCE;
            }
        }, composer, 54), composer, 100663344, 196608, 16088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        snapshotState.setValue(newValue);
        return Unit.INSTANCE;
    }
}
