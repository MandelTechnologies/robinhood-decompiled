package com.robinhood.android.equitydetail.p123ui.options;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
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
/* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C15530x36a5b6f0 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ long $closeIconTint$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ int $imageRes$inlined;
    final /* synthetic */ Function0 $onCardCtaClicked$inlined;
    final /* synthetic */ Function0 $onCardDismissed$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15530x36a5b6f0(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Function0 function0, int i, long j, Function0 function02) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$onCardCtaClicked$inlined = function0;
        this.$imageRes$inlined = i;
        this.$closeIconTint$inlined = j;
        this.$onCardDismissed$inlined = function02;
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
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(394523829);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope.createGuidelineFromEnd(0.33f);
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(verticalAnchorM8138createStartBarrier3ABfNKs$default) | composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InstrumentDetailOptionLevel3EntryPointCardView4(verticalAnchorM8138createStartBarrier3ABfNKs$default, constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3_incentive_summary, composer, 0), PaddingKt.m5142padding3ABfNKs(modifierConstrainAs, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 4, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 817889280, 0, 7548);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = InstrumentDetailOptionLevel3EntryPointCardView5.INSTANCE;
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig(this.$onCardCtaClicked$inlined, StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3, composer, 0), PaddingKt.m5142padding3ABfNKs(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer, BentoTextButton3.Icon.Size12.$stable << 9, 112);
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(0), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(verticalAnchorCreateGuidelineFromEnd);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new InstrumentDetailOptionLevel3EntryPointCardView6(verticalAnchorCreateGuidelineFromEnd);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(this.$imageRes$inlined, composer, 0), (String) null, constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer, 24624, 104);
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = InstrumentDetailOptionLevel3EntryPointCardView7.INSTANCE;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0), this.$closeIconTint$inlined, constraintLayoutScope.constrainAs(modifierM5142padding3ABfNKs, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), this.$onCardDismissed$inlined, false, composer, BentoIcon4.Size24.$stable, 32);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
