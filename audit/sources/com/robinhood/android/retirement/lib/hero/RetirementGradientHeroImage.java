package com.robinhood.android.retirement.lib.hero;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.responsive.AspectRatio;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoColor;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementGradientHeroImage.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u001f\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"retirementHeroGradientBackground", "Landroidx/compose/ui/Modifier;", "RetirementGradientHeroImage", "", "modifier", MarkdownText4.TagImageUrl, "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "lib-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.lib.hero.RetirementGradientHeroImageKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementGradientHeroImage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementGradientHeroImage$lambda$1(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        RetirementGradientHeroImage(modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Modifier retirementHeroGradientBackground(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Brush.Companion companion = Brush.INSTANCE;
        Float fValueOf = Float.valueOf(0.0f);
        BentoColor bentoColor = BentoColor.INSTANCE;
        return Background3.background$default(modifier, Brush.Companion.m6679linearGradientmHitzGk$default(companion, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(bentoColor.m21255getDayXrayLight0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(bentoColor.m21255getDayXrayLight0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.75f), Color.m6701boximpl(Color2.Color(4288933427L))), Tuples4.m3642to(Float.valueOf(0.875f), Color.m6701boximpl(Color2.Color(4286047014L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoColor.m21236getDayPrime0d7_KjU()))}, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
    }

    public static final void RetirementGradientHeroImage(Modifier modifier, final String imageUrl, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1827600774);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(imageUrl) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1827600774, i3, -1, "com.robinhood.android.retirement.lib.hero.RetirementGradientHeroImage (RetirementGradientHeroImage.kt:45)");
            }
            Modifier modifierRetirementHeroGradientBackground = retirementHeroGradientBackground(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), AspectRatio.INSTANCE.getHeroImage(composerStartRestartGroup, AspectRatio.$stable), false, 2, null));
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierRetirementHeroGradientBackground);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            modifier3 = modifier4;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(imageUrl, null, null, null, 0, null, composerStartRestartGroup, (i3 >> 3) & 14, 62), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 108);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(Modifier.INSTANCE, companion.getBottomCenter()), 0L, 0.0f, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.hero.RetirementGradientHeroImageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementGradientHeroImage.RetirementGradientHeroImage$lambda$1(modifier3, imageUrl, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
