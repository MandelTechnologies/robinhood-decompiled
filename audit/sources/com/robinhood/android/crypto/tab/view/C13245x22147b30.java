package com.robinhood.android.crypto.tab.view;

import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.text.font.FontWeight;
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
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
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
/* renamed from: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$1 */
/* loaded from: classes2.dex */
public final class C13245x22147b30 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ CryptoNewsArticle $cryptoArticle$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function1 $onRelatedInstrumentClick$inlined;
    final /* synthetic */ Resources $resources$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13245x22147b30(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, CryptoNewsArticle cryptoNewsArticle, Resources resources, Function1 function1) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$cryptoArticle$inlined = cryptoNewsArticle;
        this.$resources$inlined = resources;
        this.$onRelatedInstrumentClick$inlined = function1;
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
        composer.startReplaceGroup(283377681);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 12, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = CryptoNewsArticleComposable2.INSTANCE;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(this.$cryptoArticle$inlined.getArticle().getSource(), constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 24576, 0, 8172);
        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new CryptoNewsArticleComposable3(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
        Intrinsics.checkNotNull(this.$resources$inlined);
        BentoText2.m20747BentoText38GnDrw(DurationFormatter.formatNarrow$default(this.$resources$inlined, Durations.since(this.$cryptoArticle$inlined.getArticle().getPublishedAt()), false, 4, null), modifierConstrainAs, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8188);
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new CryptoNewsArticleComposable4(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Spacer2.Spacer(constraintLayoutScope.constrainAs(modifierM5156height3ABfNKs, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), composer, 0);
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component5);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new CryptoNewsArticleComposable5(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component5);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(this.$cryptoArticle$inlined.getArticle().getTitle(), constraintLayoutScope.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 817889280, 0, 7548);
        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = CryptoNewsArticleComposable6.INSTANCE;
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Spacer2.Spacer(constraintLayoutScope.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue5), composer, 0);
        float f = 56;
        Modifier modifierClip = Clip.clip(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
        composer.startReplaceGroup(-1633490746);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(constraintLayoutBaseScope4Component6);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = new CryptoNewsArticleComposable7(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component6);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(this.$cryptoArticle$inlined.getArticle().getPreviewImageUrl(), null, null, null, 0, null, composer, 0, 62), (String) null, constraintLayoutScope.constrainAs(modifierClip, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue6), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer, 24624, 104);
        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged5 = composer.changed(constraintLayoutBaseScope4Component4);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new CryptoNewsArticleComposable8(constraintLayoutBaseScope4Component4);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        CryptoNewsArticleComposable.RelatedInstrumentSectionComposable(this.$cryptoArticle$inlined, this.$onRelatedInstrumentClick$inlined, constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default3, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue7), composer, 0, 0);
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component5}, 0.0f, 2, null);
        Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged6 = composer.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChanged6 || objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = new CryptoNewsArticleComposable9(horizontalAnchorM8136createBottomBarrier3ABfNKs$default);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default4, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue8), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue9 == companion2.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposableKt$CryptoNewsArticleComposable$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue9);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue9, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
