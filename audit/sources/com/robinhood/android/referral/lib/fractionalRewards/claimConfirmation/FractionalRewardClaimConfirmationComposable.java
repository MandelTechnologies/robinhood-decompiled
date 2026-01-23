package com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextPainter2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.cards.BentoCelebrationCard;
import com.robinhood.compose.bento.component.cards.SecondaryRow;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FractionalRewardClaimConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002\u001a!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"InlineContentId", "", "ScaleDuration", "", "FractionalRewardClaimConfirmationComposable", "", "rewardInfo", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "onDoneClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColorOverride", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "(Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/Color;Landroidx/compose/runtime/Composer;II)V", "BottomBarComposable", "disclaimerText", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "getPillSpanContent", "Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "card", "getInlineContent", "Lkotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "pillText", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/PersistentMap;", "FractionalRewardConfirmationCelebrationTag", "FractionalRewardConfirmationDoneTag", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FractionalRewardClaimConfirmationComposable {
    public static final String FractionalRewardConfirmationCelebrationTag = "FractionalRewardConfirmationCelebration";
    public static final String FractionalRewardConfirmationDoneTag = "FractionalRewardConfirmationDone";
    private static final String InlineContentId = "inlineContent";
    private static final int ScaleDuration = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$7(Function0 function0, RichText richText, int i, Composer composer, int i2) {
        BottomBarComposable(function0, richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FractionalRewardClaimConfirmationComposable$lambda$2(UiRewardCertificateInfo uiRewardCertificateInfo, Function0 function0, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        FractionalRewardClaimConfirmationComposable(uiRewardCertificateInfo, function0, modifier, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FractionalRewardClaimConfirmationComposable(final UiRewardCertificateInfo rewardInfo, final Function0<Unit> onDoneClick, Modifier modifier, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Color color2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
        Intrinsics.checkNotNullParameter(onDoneClick, "onDoneClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(101571790);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(rewardInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDoneClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(color == null ? -1 : color.ordinal()) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                Color color3 = i4 == 0 ? null : color;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(101571790, i3, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposable (FractionalRewardClaimConfirmationComposable.kt:65)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FractionalRewardClaimConfirmationComposable2(animatable, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1173737186);
                androidx.compose.p011ui.graphics.Color composeColor = color3 != null ? SduiColors2.toComposeColor(color3, composerStartRestartGroup, (i3 >> 9) & 14) : null;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1173737935);
                long jade = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                Color color4 = color3;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, ComposableLambda3.rememberComposableLambda(-1487436823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt.FractionalRewardClaimConfirmationComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1487436823, i6, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposable.<anonymous> (FractionalRewardClaimConfirmationComposable.kt:79)");
                        }
                        FractionalRewardClaimConfirmationComposable.BottomBarComposable(onDoneClick, rewardInfo.getDisclaimerText(), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, jade, 0L, null, ComposableLambda3.rememberComposableLambda(1194016479, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt.FractionalRewardClaimConfirmationComposable.3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1194016479, i7, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposable.<anonymous> (FractionalRewardClaimConfirmationComposable.kt:85)");
                        }
                        Tuples2 pillSpanContent = FractionalRewardClaimConfirmationComposable.getPillSpanContent(rewardInfo);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Animatable<Float, AnimationVectors2> animatable2 = animatable;
                        UiRewardCertificateInfo uiRewardCertificateInfo = rewardInfo;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierTestTag = TestTag3.testTag(Scale2.scale(SizeKt.wrapContentSize$default(companion2, null, false, 3, null), animatable2.getValue().floatValue()), FractionalRewardClaimConfirmationComposable.FractionalRewardConfirmationCelebrationTag);
                        String headerTitle = uiRewardCertificateInfo.getHeaderTitle();
                        AnnotatedString annotatedString = (AnnotatedString) pillSpanContent.getSecond();
                        String description = uiRewardCertificateInfo.getDescription();
                        ImmutableMap3 inlineContent = FractionalRewardClaimConfirmationComposable.getInlineContent((String) pillSpanContent.getFirst(), composer3, 0);
                        String footerTitle = uiRewardCertificateInfo.getFooterTitle();
                        String footerDetail = uiRewardCertificateInfo.getFooterDetail();
                        String footerSubtitle = uiRewardCertificateInfo.getFooterSubtitle();
                        if (footerSubtitle == null) {
                            footerSubtitle = "";
                        }
                        String footerSubDetail = uiRewardCertificateInfo.getFooterSubDetail();
                        BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(modifierTestTag, headerTitle, annotatedString, inlineContent, null, footerTitle, footerDetail, description, new SecondaryRow(footerSubtitle, footerSubDetail != null ? footerSubDetail : ""), 0L, 0L, composer3, SecondaryRow.$stable << 24, 0, 1552);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 805306752, 442);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                color2 = color4;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                color2 = color;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FractionalRewardClaimConfirmationComposable.FractionalRewardClaimConfirmationComposable$lambda$2(rewardInfo, onDoneClick, modifier3, color2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new FractionalRewardClaimConfirmationComposable2(animatable, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1173737186);
                if (color3 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1173737935);
                long jade2 = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                Color color42 = color3;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, ComposableLambda3.rememberComposableLambda(-1487436823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt.FractionalRewardClaimConfirmationComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1487436823, i6, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposable.<anonymous> (FractionalRewardClaimConfirmationComposable.kt:79)");
                        }
                        FractionalRewardClaimConfirmationComposable.BottomBarComposable(onDoneClick, rewardInfo.getDisclaimerText(), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, jade2, 0L, null, ComposableLambda3.rememberComposableLambda(1194016479, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt.FractionalRewardClaimConfirmationComposable.3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1194016479, i7, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposable.<anonymous> (FractionalRewardClaimConfirmationComposable.kt:85)");
                        }
                        Tuples2 pillSpanContent = FractionalRewardClaimConfirmationComposable.getPillSpanContent(rewardInfo);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Animatable<Float, AnimationVectors2> animatable2 = animatable;
                        UiRewardCertificateInfo uiRewardCertificateInfo = rewardInfo;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierTestTag = TestTag3.testTag(Scale2.scale(SizeKt.wrapContentSize$default(companion2, null, false, 3, null), animatable2.getValue().floatValue()), FractionalRewardClaimConfirmationComposable.FractionalRewardConfirmationCelebrationTag);
                        String headerTitle = uiRewardCertificateInfo.getHeaderTitle();
                        AnnotatedString annotatedString = (AnnotatedString) pillSpanContent.getSecond();
                        String description = uiRewardCertificateInfo.getDescription();
                        ImmutableMap3 inlineContent = FractionalRewardClaimConfirmationComposable.getInlineContent((String) pillSpanContent.getFirst(), composer3, 0);
                        String footerTitle = uiRewardCertificateInfo.getFooterTitle();
                        String footerDetail = uiRewardCertificateInfo.getFooterDetail();
                        String footerSubtitle = uiRewardCertificateInfo.getFooterSubtitle();
                        if (footerSubtitle == null) {
                            footerSubtitle = "";
                        }
                        String footerSubDetail = uiRewardCertificateInfo.getFooterSubDetail();
                        BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(modifierTestTag, headerTitle, annotatedString, inlineContent, null, footerTitle, footerDetail, description, new SecondaryRow(footerSubtitle, footerSubDetail != null ? footerSubDetail : ""), 0L, 0L, composer3, SecondaryRow.$stable << 24, 0, 1552);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 805306752, 442);
                if (ComposerKt.isTraceInProgress()) {
                }
                color2 = color42;
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: FractionalRewardClaimConfirmationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$getInlineContent$3 */
    static final class C267173 implements Function3<String, Composer, Integer, Unit> {
        final /* synthetic */ float $horizontalPadding;
        final /* synthetic */ long $pillStrokeWidth;
        final /* synthetic */ String $pillText;
        final /* synthetic */ TextMeasurer $textMeasurer;
        final /* synthetic */ float $verticalPadding;

        C267173(float f, float f2, TextMeasurer textMeasurer, String str, long j) {
            this.$horizontalPadding = f;
            this.$verticalPadding = f2;
            this.$textMeasurer = textMeasurer;
            this.$pillText = str;
            this.$pillStrokeWidth = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(long j, float f, float f2, TextMeasurer textMeasurer, String str, TextStyle textStyle, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(48));
            float fMo5015toPxR2X_6o = Canvas.mo5015toPxR2X_6o(j);
            DrawScope.m6960drawRoundRectuAw5IA$default(Canvas, BentoColor.INSTANCE.m21319getNightJet0d7_KjU(), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((-fMo5015toPxR2X_6o) * 2) & 4294967295L)), Canvas.mo6963getSizeNHjbRc(), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L)), new Stroke(fMo5015toPxR2X_6o, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
            TextPainter2.m7629drawTextTPWCCtM(Canvas, textMeasurer, str, (496 & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : Offset.m6535constructorimpl((Float.floatToRawIntBits(f + fMo5015toPxR2X_6o) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), (496 & 8) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (496 & 16) != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : 0, (496 & 32) != 0, (496 & 64) != 0 ? Integer.MAX_VALUE : 0, (496 & 128) != 0 ? Size.INSTANCE.m6588getUnspecifiedNHjbRc() : 0L, (496 & 256) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1765291743, i, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.getInlineContent.<anonymous> (FractionalRewardClaimConfirmationComposable.kt:216)");
            }
            final TextStyle displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleSmall();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$horizontalPadding) | composer.changed(this.$verticalPadding) | composer.changed(this.$textMeasurer) | composer.changed(this.$pillText) | composer.changed(displayCapsuleSmall);
            final long j = this.$pillStrokeWidth;
            final float f = this.$horizontalPadding;
            final float f2 = this.$verticalPadding;
            final TextMeasurer textMeasurer = this.$textMeasurer;
            final String str = this.$pillText;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$getInlineContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FractionalRewardClaimConfirmationComposable.C267173.invoke$lambda$1$lambda$0(j, f, f2, textMeasurer, str, displayCapsuleSmall, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Canvas2.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public static final void BottomBarComposable(Function0<Unit> function0, final RichText richText, Composer composer, final int i) {
        int i2;
        int i3;
        BentoTheme bentoTheme;
        int i4;
        ?? r3;
        final Function0<Unit> function02 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1671719316);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671719316, i2, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.BottomBarComposable (FractionalRewardClaimConfirmationComposable.kt:117)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(796696174);
            if (richText == null) {
                bentoTheme = bentoTheme2;
                i3 = i2;
                i4 = i5;
                r3 = 0;
            } else {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                TextStyle textS = bentoTheme2.getTypography(composerStartRestartGroup, i5).getTextS();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                Color.Companion companion3 = androidx.compose.p011ui.graphics.Color.INSTANCE;
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textS, companion3.m6727getWhite0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7919getCentere0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744446, null);
                long jM6727getWhite0d7_KjU = companion3.m6727getWhite0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FractionalRewardClaimConfirmationComposable.BottomBarComposable$lambda$6$lambda$5$lambda$4$lambda$3(navigator, context, (Uri) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i2;
                bentoTheme = bentoTheme2;
                BentoRichText.m15948BentoRichText0sCZWFg(richText, modifierM5146paddingqDBjuR0$default, textStyleM7655copyp1EtxEg$default, 0L, jM6727getWhite0d7_KjU, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composerStartRestartGroup, 24576, 488);
                i4 = i5;
                companion = companion;
                r3 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, r3, 3, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 7, null), FractionalRewardConfirmationDoneTag);
            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, r3);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            function02 = function0;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, modifierTestTag, null, type2, false, false, null, androidx.compose.p011ui.graphics.Color.m6701boximpl(jM21425getFg0d7_KjU), androidx.compose.p011ui.graphics.Color.m6701boximpl(jM21425getFg0d7_KjU2), null, false, null, composerStartRestartGroup, (i3 & 14) | 24576, 0, 7400);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardClaimConfirmationComposable.BottomBarComposable$lambda$7(function02, richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$6$lambda$5$lambda$4$lambda$3(Navigator navigator, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2<String, AnnotatedString> getPillSpanContent(UiRewardCertificateInfo uiRewardCertificateInfo) {
        String primaryText = uiRewardCertificateInfo.getPrimaryText();
        UiRewardCertificateInfo.PillInfo primaryTextPillInfo = uiRewardCertificateInfo.getPrimaryTextPillInfo();
        if (primaryTextPillInfo == null) {
            return new Tuples2<>("", new AnnotatedString(primaryText, null, 2, null));
        }
        int location = primaryTextPillInfo.getLocation();
        int length = primaryTextPillInfo.getLength() + location;
        boolean z = location < 0 || location >= primaryText.length();
        boolean z2 = length < 0 || length > primaryText.length();
        boolean z3 = location >= length;
        if (z || z2 || z3) {
            return new Tuples2<>("", new AnnotatedString(primaryText, null, 2, null));
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String strSubstring = primaryText.substring(0, location);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        builder.append(strSubstring);
        InlineTextContent2.appendInlineContent(builder, InlineContentId, "[myBox]");
        String strSubstring2 = primaryText.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        builder.append(strSubstring2);
        AnnotatedString annotatedString = builder.toAnnotatedString();
        String strSubstring3 = primaryText.substring(location, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        return new Tuples2<>(strSubstring3, annotatedString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableMap3<String, InlineTextContent> getInlineContent(String str, Composer composer, int i) {
        composer.startReplaceGroup(-1654926178);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654926178, i, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.getInlineContent (FractionalRewardClaimConfirmationComposable.kt:190)");
        }
        TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composer, 0, 1);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextLayoutResult textLayoutResultM7623measurewNUYSr0$default = TextMeasurer.m7623measurewNUYSr0$default(textMeasurerRememberTextMeasurer, str, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), 0, false, 0, 0L, null, null, null, false, 1020, null);
        composer.startReplaceGroup(-1246147332);
        float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1246144478);
        float f = 2;
        float fMo5016toPx0680j_42 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM()) / f;
        composer.endReplaceGroup();
        long sp = TextUnit2.getSp(1);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        long jMo5019toSpkPz2Gy4 = density.mo5019toSpkPz2Gy4(((int) (textLayoutResultM7623measurewNUYSr0$default.getSize() >> 32)) + (fMo5016toPx0680j_4 * f) + (density.mo5015toPxR2X_6o(sp) * f));
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        ImmutableMap3<String, InlineTextContent> immutableMap3PersistentMapOf = extensions2.persistentMapOf(new Tuples2(InlineContentId, new InlineTextContent(new Placeholder(jMo5019toSpkPz2Gy4, density2.mo5019toSpkPz2Gy4(((int) (textLayoutResultM7623measurewNUYSr0$default.getSize() & 4294967295L)) + (fMo5016toPx0680j_42 * f) + (density2.mo5015toPxR2X_6o(sp) * f)), PlaceholderVerticalAlign.INSTANCE.m7579getTextCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-1765291743, true, new C267173(fMo5016toPx0680j_4, fMo5016toPx0680j_42, textMeasurerRememberTextMeasurer, str, sp), composer, 54))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableMap3PersistentMapOf;
    }
}
