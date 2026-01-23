package com.robinhood.android.equities.rhvtrailer.video;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.UIComponentDto;
import ventures.trailer.proto.p551v1.TrailerScreenDto;
import ventures.trailer.proto.p551v1.TrailerStateDto;

/* compiled from: RhvTrailerVideoScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoMainSection$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class RhvTrailerVideoScreen7 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ TrailerScreenDto $data;
    final /* synthetic */ Function0<Unit> $onContinueClicked;
    final /* synthetic */ Function1<RhvTrailerVideoScreen3, Unit> $onPlayerStateChange;
    final /* synthetic */ RhvTrailerVideoScreen3 $playerState;

    /* compiled from: RhvTrailerVideoScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoMainSection$2$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhvTrailerVideoScreen3.values().length];
            try {
                iArr[RhvTrailerVideoScreen3.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhvTrailerVideoScreen3.ENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    RhvTrailerVideoScreen7(RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, TrailerScreenDto trailerScreenDto, Function1<? super RhvTrailerVideoScreen3, Unit> function1, Function0<Unit> function0) {
        this.$playerState = rhvTrailerVideoScreen3;
        this.$data = trailerScreenDto;
        this.$onPlayerStateChange = function1;
        this.$onContinueClicked = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        int i2;
        ServerToBentoAssetMapper2 bentoAsset;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-519717641, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoMainSection.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:188)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        RhvTrailerVideoScreen3 rhvTrailerVideoScreen3 = this.$playerState;
        TrailerScreenDto trailerScreenDto = this.$data;
        final Function1<RhvTrailerVideoScreen3, Unit> function1 = this.$onPlayerStateChange;
        Function0<Unit> function0 = this.$onContinueClicked;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(50));
        Brush.Companion companion4 = Brush.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        BoxKt.Box(Background3.background$default(modifierM5156height3ABfNKs, Brush.Companion.m6682verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), Float.POSITIVE_INFINITY, 0.0f, 0, 8, (Object) null), null, 0.0f, 6, null), composer, 0);
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        int i4 = WhenMappings.$EnumSwitchMapping$0[rhvTrailerVideoScreen3.ordinal()];
        if (i4 == 1) {
            composer.startReplaceGroup(1135122028);
            TrailerStateDto pre_trailer_state = trailerScreenDto.getPre_trailer_state();
            UIComponentDto body = pre_trailer_state != null ? pre_trailer_state.getBody() : null;
            composer.startReplaceGroup(-1625950876);
            if (body == null) {
                i2 = 2;
            } else {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoMainSection$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen7.invoke$lambda$13$lambda$12$lambda$2$lambda$1$lambda$0((ActionDto) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                i2 = 2;
                SduiComponentIdl.SduiComponent(body, (Function1) objRememberedValue, (Modifier) null, (HorizontalPadding) null, composer, 48, 12);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            TrailerStateDto pre_trailer_state2 = trailerScreenDto.getPre_trailer_state();
            if (pre_trailer_state2 != null) {
                String primary_cta_text = pre_trailer_state2.getPrimary_cta_text();
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                IconDto primary_cta_icon = pre_trailer_state2.getPrimary_cta_icon();
                BentoButtons.Icon.Size16 size16 = (primary_cta_icon == null || (bentoAsset = SduiIcon2.toBentoAsset(primary_cta_icon)) == null) ? null : new BentoButtons.Icon.Size16(bentoAsset, null, i2, null);
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, i2, null);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoMainSection$2$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhvTrailerVideoScreen7.invoke$lambda$13$lambda$12$lambda$7$lambda$5$lambda$4(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, primary_cta_text, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, size16, type2, false, false, null, null, null, null, false, null, composer, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 8160);
                String secondary_cta_text = pre_trailer_state2.getSecondary_cta_text();
                composer.startReplaceGroup(-1625914033);
                if (secondary_cta_text != null) {
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, secondary_cta_text, PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
        } else if (i4 != 2) {
            composer.startReplaceGroup(1138036245);
            composer.endReplaceGroup();
            Unit unit4 = Unit.INSTANCE;
        } else {
            composer.startReplaceGroup(1137039533);
            TrailerStateDto post_trailer_state = trailerScreenDto.getPost_trailer_state();
            UIComponentDto body2 = post_trailer_state != null ? post_trailer_state.getBody() : null;
            composer.startReplaceGroup(-1625888092);
            if (body2 != null) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoMainSection$2$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen7.invoke$lambda$13$lambda$12$lambda$10$lambda$9$lambda$8((ActionDto) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                SduiComponentIdl.SduiComponent(body2, (Function1) objRememberedValue3, (Modifier) null, (HorizontalPadding) null, composer, 48, 12);
                Unit unit5 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            TrailerStateDto post_trailer_state2 = trailerScreenDto.getPost_trailer_state();
            if (post_trailer_state2 != null) {
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, post_trailer_state2.getPrimary_cta_text(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                Unit unit6 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
        }
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$2$lambda$1$lambda$0(ActionDto actionDto) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$7$lambda$5$lambda$4(Function1 function1) {
        function1.invoke(RhvTrailerVideoScreen3.PLAYING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$10$lambda$9$lambda$8(ActionDto actionDto) {
        return Unit.INSTANCE;
    }
}
