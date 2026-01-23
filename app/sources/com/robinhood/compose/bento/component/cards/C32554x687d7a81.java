package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard7;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$1 */
/* loaded from: classes15.dex */
public final class C32554x687d7a81 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ String $ctaText$inlined;
    final /* synthetic */ BentoCommunicationCard7.DismissIconType $dismissIconType$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function0 $onClick$inlined;
    final /* synthetic */ Function0 $onDismiss$inlined;
    final /* synthetic */ Painter $painter$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ CommunicationCardStyle $style$inlined;
    final /* synthetic */ AnnotatedString $text$inlined;
    final /* synthetic */ BentoCommunicationCard7.Type $type$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32554x687d7a81(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Painter painter, CommunicationCardStyle communicationCardStyle, Function0 function0, BentoCommunicationCard7.Type type2, AnnotatedString annotatedString, Function0 function02, String str, BentoCommunicationCard7.DismissIconType dismissIconType) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$painter$inlined = painter;
        this.$style$inlined = communicationCardStyle;
        this.$onDismiss$inlined = function0;
        this.$type$inlined = type2;
        this.$text$inlined = annotatedString;
        this.$onClick$inlined = function02;
        this.$ctaText$inlined = str;
        this.$dismissIconType$inlined = dismissIconType;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long jM21752getDarkDismissIconTint0d7_KjU;
        boolean z;
        long jM22031getColor0d7_KjU;
        TextStyle standardTextStyle;
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
        composer.startReplaceGroup(430709749);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4CreateRef = this.$painter$inlined != null ? constraintLayoutScope.createRef() : null;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = constraintLayoutBaseScope4CreateRef != null ? ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4CreateRef, constraintLayoutBaseScope4Component3}, 0.0f, 2, null) : ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3}, 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope.createGuidelineFromEnd(this.$painter$inlined != null ? 0.3f : 0.0f);
        String strStringResource = StringResources_androidKt.stringResource(C11917R.string.content_description_dismiss, composer, 0);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.m5169size3ABfNKs(companion, this.$style$inlined.getSizing().m21758getDismissTapTargetSizeD9Ej5fM()), false, null, null, this.$onDismiss$inlined, 7, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = BentoCommunicationCard2.INSTANCE;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierM4893clickableXHw0xAI$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(strStringResource);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new BentoCommunicationCard3(strStringResource);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierZIndex = ZIndexModifier2.zIndex(SemanticsModifier6.semantics(modifierConstrainAs, true, (Function1) objRememberedValue2), 1.0f);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierZIndex);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
        int i2 = BentoCommunicationCard.C325591.WhenMappings.$EnumSwitchMapping$0[this.$dismissIconType$inlined.ordinal()];
        if (i2 == 1) {
            jM21752getDarkDismissIconTint0d7_KjU = this.$style$inlined.getColors().m21752getDarkDismissIconTint0d7_KjU();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jM21752getDarkDismissIconTint0d7_KjU = this.$style$inlined.getColors().m21753getLightDismissIconTint0d7_KjU();
        }
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21752getDarkDismissIconTint0d7_KjU, null, null, false, composer, 48, 56);
        composer.endNode();
        composer.startReplaceGroup(-817345780);
        if (this.$painter$inlined != null && constraintLayoutBaseScope4CreateRef != null) {
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(verticalAnchorCreateGuidelineFromEnd);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new BentoCommunicationCard4(verticalAnchorCreateGuidelineFromEnd);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ImageKt.Image(this.$painter$inlined, (String) null, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4CreateRef, (Function1) objRememberedValue3), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer, 24624, 104);
        }
        composer.endReplaceGroup();
        BentoCommunicationCard7.Type type2 = this.$type$inlined;
        composer.startReplaceGroup(-817326302);
        if (type2 instanceof BentoCommunicationCard7.Type.BrandMoment) {
            jM22031getColor0d7_KjU = ((BentoCommunicationCard7.Type.BrandMoment) this.$type$inlined).m20879getTextColor0d7_KjU();
            z = false;
        } else {
            if (!Intrinsics.areEqual(type2, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
            jM22031getColor0d7_KjU = ((Styles) composer.consume(Styles2.getLocalStyles())).getText(composer, 0).m22031getColor0d7_KjU();
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$style$inlined) | composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(verticalAnchor) | composer.changedInstance(this.$painter$inlined);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new BentoCommunicationCard5(this.$style$inlined, constraintLayoutBaseScope4Component2, verticalAnchor, this.$painter$inlined);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue4);
        BentoCommunicationCard7.Type type3 = this.$type$inlined;
        if (type3 instanceof BentoCommunicationCard7.Type.BrandMoment) {
            standardTextStyle = this.$style$inlined.getTypography().getBrandMomentTextStyle();
        } else {
            if (!Intrinsics.areEqual(type3, BentoCommunicationCard7.Type.Standard.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            standardTextStyle = this.$style$inlined.getTypography().getStandardTextStyle();
        }
        BentoText2.m20748BentoTextQnj7Zds(this.$text$inlined, modifierConstrainAs2, Color.m6701boximpl(jM22031getColor0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, this.$style$inlined.getTypography().getMaxLines(), 0, null, null, standardTextStyle, composer, 12582912, 0, 7544);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$style$inlined);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new BentoCommunicationCard6(this.$style$inlined);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig(this.$onClick$inlined, this.$ctaText$inlined, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue5), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, Color.m6701boximpl(jM22031getColor0d7_KjU), composer, 0, 48);
        composer.endReplaceGroup();
        boolean zChangedInstance3 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCommunicationCardKt$BentoCommunicationCard$1$invoke$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue6);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue6, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
