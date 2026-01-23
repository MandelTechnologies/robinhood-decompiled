package com.robinhood.android.pathfinder.corepages.heroimage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.compose.SingletonAsyncImagePainter;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.pathfinder.extensions.ImageTypes;
import com.robinhood.android.lib.pathfinder.extensions.ImageTypes2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.pathfinder.corepages.heroimage.HeroImageViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.pathfinder.contexts.ImageType;
import com.robinhood.models.api.pathfinder.contexts.LegacyCtaAction;
import com.robinhood.models.api.pathfinder.contexts.LegacyCtaType;
import com.robinhood.models.p355ui.pathfinder.contexts.HeroImageContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.compose.arrangement.TopWithFooter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HeroImageComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001ai\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u001b\u001a\u001b\u0010\u001e\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u001f\"\u000e\u0010 \u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020!X\u0080T¢\u0006\u0002\n\u0000¨\u0006)²\u0006\f\u0010*\u001a\u0004\u0018\u00010+X\u008a\u0084\u0002"}, m3636d2 = {"HeroImageComposable", "", "state", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;", "onClickPrimaryCta", "Lkotlin/Function1;", "Lcom/robinhood/models/api/pathfinder/contexts/LegacyCtaAction;", "onClickSecondaryCta", "onClickErrorPrimary", "Lkotlin/Function0;", "(Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Content", "inputUpdateSource", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;", "heading", "Lcom/robinhood/models/serverdriven/db/RichText;", "subheading", "imageType", "Lcom/robinhood/models/api/pathfinder/contexts/ImageType;", "primaryCta", "Lcom/robinhood/models/api/pathfinder/contexts/LegacyCtaType;", "secondaryCta", "footerText", "(Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/serverdriven/db/RichText;Lcom/robinhood/models/api/pathfinder/contexts/ImageType;Lcom/robinhood/models/api/pathfinder/contexts/LegacyCtaType;Lcom/robinhood/models/api/pathfinder/contexts/LegacyCtaType;Lcom/robinhood/models/serverdriven/db/RichText;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HeroImage", "(Lcom/robinhood/models/api/pathfinder/contexts/ImageType;Landroidx/compose/runtime/Composer;I)V", "Heading", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "Subheading", "Footer", "Error", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", HeroImageComposable.HeroImageTestTagContent, "", HeroImageComposable.HeroImageTestTagImage, HeroImageComposable.HeroImageTestTagLottieImage, HeroImageComposable.HeroImageTestTagHeading, HeroImageComposable.HeroImageTestTagSubheading, HeroImageComposable.HeroImageTestTagButtonBar, HeroImageComposable.HeroImageTestTagFooter, HeroImageComposable.HeroImageTestTagError, "feature-pathfinder-core-pages_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class HeroImageComposable {
    public static final String HeroImageTestTagButtonBar = "HeroImageTestTagButtonBar";
    public static final String HeroImageTestTagContent = "HeroImageTestTagContent";
    public static final String HeroImageTestTagError = "HeroImageTestTagError";
    public static final String HeroImageTestTagFooter = "HeroImageTestTagFooter";
    public static final String HeroImageTestTagHeading = "HeroImageTestTagHeading";
    public static final String HeroImageTestTagImage = "HeroImageTestTagImage";
    public static final String HeroImageTestTagLottieImage = "HeroImageTestTagLottieImage";
    public static final String HeroImageTestTagSubheading = "HeroImageTestTagSubheading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9(HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource, RichText richText, RichText richText2, ImageType imageType, LegacyCtaType legacyCtaType, LegacyCtaType legacyCtaType2, RichText richText3, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        Content(inputUpdateSource, richText, richText2, imageType, legacyCtaType, legacyCtaType2, richText3, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Error$lambda$15(Function0 function0, int i, Composer composer, int i2) {
        Error(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$14(RichText richText, int i, Composer composer, int i2) {
        Footer(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$12(RichText richText, int i, Composer composer, int i2) {
        Heading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroImage$lambda$11(ImageType imageType, int i, Composer composer, int i2) {
        HeroImage(imageType, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroImageComposable$lambda$5(HeroImageViewState heroImageViewState, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        HeroImageComposable(heroImageViewState, function1, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subheading$lambda$13(RichText richText, int i, Composer composer, int i2) {
        Subheading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HeroImageComposable(final HeroImageViewState state, final Function1<? super LegacyCtaAction, Unit> onClickPrimaryCta, final Function1<? super LegacyCtaAction, Unit> onClickSecondaryCta, final Function0<Unit> onClickErrorPrimary, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Intrinsics.checkNotNullParameter(onClickSecondaryCta, "onClickSecondaryCta");
        Intrinsics.checkNotNullParameter(onClickErrorPrimary, "onClickErrorPrimary");
        Composer composerStartRestartGroup = composer.startRestartGroup(1900484304);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickSecondaryCta) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickErrorPrimary) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1900484304, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposable (HeroImageComposable.kt:44)");
            }
            if (state instanceof HeroImageViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(1069303403);
                HeroImageViewState.Loaded loaded = (HeroImageViewState.Loaded) state;
                final HeroImageContext context = loaded.getContext();
                RichText heading = context.getHeading();
                RichText subheading = context.getSubheading();
                ImageType image = context.getImage();
                LegacyCtaType primaryCta = context.getPrimaryCta();
                LegacyCtaType secondaryCta = context.getSecondaryCta();
                RichText footerText = context.getFooterText();
                HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource = loaded.getInputUpdateSource();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HeroImageComposable.HeroImageComposable$lambda$1$lambda$0(onClickPrimaryCta, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | ((i2 & 896) == 256);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HeroImageComposable.HeroImageComposable$lambda$4$lambda$3(context, onClickSecondaryCta);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Content(inputUpdateSource, heading, subheading, image, primaryCta, secondaryCta, footerText, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(state, HeroImageViewState.Error.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1004323425);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1070027563);
                Error(onClickErrorPrimary, composerStartRestartGroup, (i2 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.HeroImageComposable$lambda$5(state, onClickPrimaryCta, onClickSecondaryCta, onClickErrorPrimary, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroImageComposable$lambda$1$lambda$0(Function1 function1, HeroImageContext heroImageContext) {
        function1.invoke(heroImageContext.getPrimaryCta().getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroImageComposable$lambda$4$lambda$3(HeroImageContext heroImageContext, Function1 function1) {
        LegacyCtaType secondaryCta = heroImageContext.getSecondaryCta();
        if (secondaryCta != null) {
            function1.invoke(secondaryCta.getAction());
        }
        return Unit.INSTANCE;
    }

    public static final void Content(final HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource, final RichText richText, final RichText richText2, final ImageType imageType, final LegacyCtaType primaryCta, final LegacyCtaType legacyCtaType, final RichText richText3, final Function0<Unit> onClickPrimaryCta, final Function0<Unit> onClickSecondaryCta, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(inputUpdateSource, "inputUpdateSource");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Intrinsics.checkNotNullParameter(onClickSecondaryCta, "onClickSecondaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(1355466720);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(inputUpdateSource.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(imageType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(primaryCta) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(legacyCtaType) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickSecondaryCta) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355466720, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.Content (HeroImageComposable.kt:84)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.navigationBarsPadding(TestTag3.testTag(companion, HeroImageTestTagContent)), 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(new TopWithFooter(richText3 == null ? 0 : 1), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            HeroImage(imageType, composerStartRestartGroup, (i2 >> 9) & 14);
            int i3 = i2 >> 3;
            Heading(richText, composerStartRestartGroup, i3 & 14);
            Subheading(richText2, composerStartRestartGroup, (i2 >> 6) & 14);
            Footer(richText3, composerStartRestartGroup, (i2 >> 18) & 14);
            composerStartRestartGroup.endNode();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, HeroImageTestTagButtonBar), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String text = primaryCta.getText();
            HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource2 = HeroImageViewState.Loaded.InputUpdateSource.PRIMARY;
            boolean z = inputUpdateSource == inputUpdateSource2;
            HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource3 = HeroImageViewState.Loaded.InputUpdateSource.SECONDARY;
            composer2 = composerStartRestartGroup;
            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, onClickPrimaryCta, text, z, null, inputUpdateSource != inputUpdateSource3, legacyCtaType != null ? onClickSecondaryCta : null, legacyCtaType != null ? legacyCtaType.getText() : null, inputUpdateSource == inputUpdateSource3, null, inputUpdateSource != inputUpdateSource2, composer2, i3 & 3670016, 0, 16958);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.Content$lambda$9(inputUpdateSource, richText, richText2, imageType, primaryCta, legacyCtaType, richText3, onClickPrimaryCta, onClickSecondaryCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LottieComposition HeroImage$lambda$10(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final void HeroImage(final ImageType imageType, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        Composer composerStartRestartGroup = composer.startRestartGroup(1571410551);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1571410551, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.HeroImage (HeroImageComposable.kt:122)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            ImageTypes renderType = ImageTypes2.toRenderType(imageType, bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay());
            if (renderType instanceof ImageTypes.Drawable) {
                composerStartRestartGroup.startReplaceGroup(-1251593516);
                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(((ImageTypes.Drawable) renderType).getDrawableRes()), null, null, null, 0, null, composerStartRestartGroup, 0, 62), (String) null, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, HeroImageTestTagImage), 0.0f, 1, null), 1.3333334f, false, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 27696, 96);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (renderType instanceof ImageTypes.Lottie) {
                composerStartRestartGroup.startReplaceGroup(-1250961023);
                LottieAnimation2.LottieAnimation(HeroImage$lambda$10(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(((ImageTypes.Lottie) renderType).getLottieJsonRes())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), SizeKt.fillMaxWidth$default(AspectRatio3.aspectRatio$default(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, HeroImageTestTagLottieImage), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.3333334f, false, 2, null), 0.0f, 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composerStartRestartGroup, 1572864, 196608, 0, 2064316);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(renderType instanceof ImageTypes.None)) {
                    composerStartRestartGroup.startReplaceGroup(-1702945051);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1250361111);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.HeroImage$lambda$11(imageType, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Heading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-464444204);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-464444204, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.Heading (HeroImageComposable.kt:163)");
            }
            if (richText != null) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, HeroImageTestTagHeading), 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.Heading$lambda$12(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Subheading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-713891336);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-713891336, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.Subheading (HeroImageComposable.kt:181)");
            }
            if (richText != null) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, HeroImageTestTagSubheading), 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8124);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.Subheading$lambda$13(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Footer(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1286483583);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1286483583, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.Footer (HeroImageComposable.kt:202)");
            }
            if (richText != null) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, HeroImageTestTagFooter), 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8124);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.Footer$lambda$14(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Error(Function0<Unit> onClickErrorPrimary, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(onClickErrorPrimary, "onClickErrorPrimary");
        Composer composerStartRestartGroup = composer.startRestartGroup(-496129311);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClickErrorPrimary) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-496129311, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.Error (HeroImageComposable.kt:222)");
            }
            function0 = onClickErrorPrimary;
            ErrorScreenComposable.ErrorScreenComposable(SizeKt.fillMaxSize$default(TestTag3.testTag(Modifier.INSTANCE, HeroImageTestTagError), 0.0f, 1, null), function0, C11048R.drawable.svg_error_triangle, null, StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composerStartRestartGroup, 0), null, false, composerStartRestartGroup, ((i2 << 3) & 112) | 6, 200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onClickErrorPrimary;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageComposable.Error$lambda$15(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
