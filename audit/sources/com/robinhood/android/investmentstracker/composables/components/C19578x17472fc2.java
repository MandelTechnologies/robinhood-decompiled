package com.robinhood.android.investmentstracker.composables.components;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionRowDetailsDto;
import com.robinhood.android.investmentstracker.C19501R;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$1 */
/* loaded from: classes10.dex */
public final class C19578x17472fc2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ InvestmentsTrackerCategorySectionRowDetailsDto $item$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SecurityFilter $securityFilter$inlined;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19578x17472fc2(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, InvestmentsTrackerCategorySectionRowDetailsDto investmentsTrackerCategorySectionRowDetailsDto, SecurityFilter securityFilter) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$item$inlined = investmentsTrackerCategorySectionRowDetailsDto;
        this.$securityFilter$inlined = securityFilter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
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
            composer.startReplaceGroup(-65511546);
            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
            String title = this.$item$inlined.getTitle();
            if (title.length() == 0) {
                title = this.$item$inlined.getConnect_text();
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            TextOverflow.Companion companion = TextOverflow.INSTANCE;
            int iM7959getEllipsisgIe3tQ8 = companion.m7959getEllipsisgIe3tQ8();
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            FontWeight w400 = companion2.getW400();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = InvestmentsTrackerCategorySection2.INSTANCE;
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, w400, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer, 817913856, 0, 7528);
            composer.startReplaceGroup(829193595);
            if (this.$item$inlined.getAccount_last_four().length() > 0) {
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(constraintLayoutBaseScope4Component1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new InvestmentsTrackerCategorySection3(constraintLayoutBaseScope4Component1);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
                String strStringResource = StringResources_androidKt.stringResource(C19501R.string.last_four_string, new Object[]{this.$securityFilter$inlined.getValueOrStars(this.$item$inlined.getAccount_last_four())}, composer, 0);
                FontWeight w4002 = companion2.getW400();
                TextStyle textM2 = bentoTheme.getTypography(composer, i2).getTextM();
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierConstrainAs, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, w4002, null, null, companion.m7960getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer, 817913856, 0, 7528);
            }
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final SnapshotState snapshotState = this.$start;
            final SnapshotState snapshotState2 = this.$end;
            final Channel channel = this.$channel;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$1.1
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
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
