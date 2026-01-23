package com.robinhood.android.support.appointments;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$1 */
/* loaded from: classes9.dex */
public final class C28822xcdc87b28 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ int $dayIndex$inlined;
    final /* synthetic */ int $displayDayOfMonth$inlined;
    final /* synthetic */ String $displayDayOfWeekText$inlined;
    final /* synthetic */ String $displayMonthText$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ boolean $isAvailable$inlined;
    final /* synthetic */ boolean $isSelected$inlined;
    final /* synthetic */ Function2 $onClick$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ int $weekIndex$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28822xcdc87b28(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, String str, boolean z, boolean z2, Function2 function2, int i, int i2, String str2, int i3) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$displayDayOfWeekText$inlined = str;
        this.$isSelected$inlined = z;
        this.$isAvailable$inlined = z2;
        this.$onClick$inlined = function2;
        this.$weekIndex$inlined = i;
        this.$dayIndex$inlined = i2;
        this.$displayMonthText$inlined = str2;
        this.$displayDayOfMonth$inlined = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long jM21371getBg0d7_KjU;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$contentTracker.setValue(Unit.INSTANCE);
            if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
                this.$compositionSource.setValue(CompositionSource.Content);
            }
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            composer.startReplaceGroup(141184454);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$1$1(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
            Intrinsics.checkNotNull(this.$displayDayOfWeekText$inlined);
            String str = this.$displayDayOfWeekText$inlined;
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 12582912, 0, 7992);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$2$1(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            if (this.$isSelected$inlined) {
                composer.startReplaceGroup(-133961638);
                jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            } else {
                composer.startReplaceGroup(-133960806);
                jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            }
            composer.endReplaceGroup();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C39996R.dimen.support_hub_recommended_action_border, composer, 0), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU());
            composer.startReplaceGroup(-1224400529);
            boolean zChanged3 = composer.changed(this.$isAvailable$inlined) | composer.changed(this.$onClick$inlined) | composer.changed(this.$weekIndex$inlined) | composer.changed(this.$dayIndex$inlined);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$3$1(this.$isAvailable$inlined, this.$onClick$inlined, this.$weekIndex$inlined, this.$dayIndex$inlined);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue3, modifierM5144paddingVpY3zN4$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(-1665195603, true, new AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$4(this.$isSelected$inlined, this.$isAvailable$inlined, this.$displayMonthText$inlined, this.$displayDayOfMonth$inlined), composer, 54), composer, 0, 6, 740);
            composer.endReplaceGroup();
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final SnapshotState snapshotState = this.$start;
            final SnapshotState snapshotState2 = this.$end;
            final Channel channel = this.$channel;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DateCard$$inlined$ConstraintLayout$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                        if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                            snapshotState.setValue(constraintSet3);
                            snapshotState2.setValue(snapshotState.getValue());
                        } else {
                            channel.mo8337trySendJP2dKIU(constraintSet3);
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
