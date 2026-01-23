package com.robinhood.android.referral.rewardclaims;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Scale;
import coil.size.Size;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.rewardclaims.util.GetBackgroundImageUrl;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.cards.BentoCelebrationCard;
import com.robinhood.compose.bento.component.cards.SecondaryRow;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: RewardClaimingComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\f\u001aK\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"RewardClaimingComposable", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "defaultDismissLabel", "", "onCloseClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TopBarComposable", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BottomBarComposable", "disclaimerText", "Lcom/robinhood/models/serverdriven/db/RichText;", CarResultComposable2.BUTTONS, "", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onCloseClicked", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/models/serverdriven/db/RichText;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardClaimingComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$7(Navigator navigator, RichText richText, List list, String str, Function0 function0, int i, Composer composer, int i2) {
        BottomBarComposable(navigator, richText, list, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardClaimingComposable$lambda$2(Navigator navigator, UiRewardCertificateInfo uiRewardCertificateInfo, String str, Function0 function0, int i, Composer composer, int i2) {
        RewardClaimingComposable(navigator, uiRewardCertificateInfo, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarComposable$lambda$3(Function0 function0, int i, Composer composer, int i2) {
        TopBarComposable(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RewardClaimingComposable(final Navigator navigator, final UiRewardCertificateInfo info, final String defaultDismissLabel, final Function0<Unit> onCloseClick, Composer composer, final int i) {
        int i2;
        long jM21219getDayJade0d7_KjU;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(defaultDismissLabel, "defaultDismissLabel");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(362378983);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(info) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(defaultDismissLabel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(362378983, i3, -1, "com.robinhood.android.referral.rewardclaims.RewardClaimingComposable (RewardClaimingComposable.kt:58)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            UiRewardCertificateInfo.StyleInfo styleInfo = info.getStyleInfo();
            if (styleInfo != null) {
                jM21219getDayJade0d7_KjU = Color2.Color(styleInfo.getBackgroundColor());
            } else {
                jM21219getDayJade0d7_KjU = BentoColor.INSTANCE.m21219getDayJade0d7_KjU();
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, jM21219getDayJade0d7_KjU, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            HttpUrl backgroundImageUrl = null;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            UiRewardCertificateInfo.StyleInfo styleInfo2 = info.getStyleInfo();
            composerStartRestartGroup.startReplaceGroup(-1671135311);
            if (styleInfo2 != null) {
                DisplayMetrics displayMetrics = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
                backgroundImageUrl = GetBackgroundImageUrl.getBackgroundImageUrl(styleInfo2, displayMetrics);
            }
            composerStartRestartGroup.endReplaceGroup();
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(builder.data(backgroundImageUrl).scale(Scale.FIT).size(Size.ORIGINAL).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62), (String) null, modifierFillMaxSize$default, (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            ScaffoldKt.m5625Scaffold27mzLpw(null, null, RewardClaimingComposable.INSTANCE.getLambda$1103142514$feature_referral_externalDebug(), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-688808917, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$RewardClaimingComposable$2$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i4 & 6) == 0) {
                        i4 |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-688808917, i4, -1, "com.robinhood.android.referral.rewardclaims.RewardClaimingComposable.<anonymous>.<anonymous> (RewardClaimingComposable.kt:84)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                    final Navigator navigator2 = navigator;
                    final UiRewardCertificateInfo uiRewardCertificateInfo = info;
                    final String str = defaultDismissLabel;
                    final Function0<Unit> function0 = onCloseClick;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(46367126, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$RewardClaimingComposable$2$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                            invoke(bentoButtonBar3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(46367126, i5, -1, "com.robinhood.android.referral.rewardclaims.RewardClaimingComposable.<anonymous>.<anonymous>.<anonymous> (RewardClaimingComposable.kt:89)");
                            }
                            RewardClaimingComposable5.BottomBarComposable(navigator2, uiRewardCertificateInfo.getDisclaimerText(), uiRewardCertificateInfo.getFooterButtonsV2(), str, function0, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final UiRewardCertificateInfo uiRewardCertificateInfo2 = info;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-150617533, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$RewardClaimingComposable$2$1.2
                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-150617533, i5, -1, "com.robinhood.android.referral.rewardclaims.RewardClaimingComposable.<anonymous>.<anonymous>.<anonymous> (RewardClaimingComposable.kt:98)");
                            }
                            SecondaryRow secondaryRow = null;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            UiRewardCertificateInfo uiRewardCertificateInfo3 = uiRewardCertificateInfo2;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            String headerTitle = uiRewardCertificateInfo3.getHeaderTitle();
                            AnnotatedString annotatedString = new AnnotatedString(uiRewardCertificateInfo3.getPrimaryText(), null, 2, null);
                            String footerTitle = uiRewardCertificateInfo3.getFooterTitle();
                            String footerDetail = uiRewardCertificateInfo3.getFooterDetail();
                            String description = uiRewardCertificateInfo3.getDescription();
                            if (uiRewardCertificateInfo3.getFooterSubtitle() != null || uiRewardCertificateInfo3.getFooterSubDetail() != null) {
                                String footerSubtitle = uiRewardCertificateInfo3.getFooterSubtitle();
                                if (footerSubtitle == null) {
                                    footerSubtitle = "";
                                }
                                String footerSubDetail = uiRewardCertificateInfo3.getFooterSubDetail();
                                secondaryRow = new SecondaryRow(footerSubtitle, footerSubDetail != null ? footerSubDetail : "");
                            }
                            SecondaryRow secondaryRow2 = secondaryRow;
                            UiRewardCertificateInfo.StyleInfo styleInfo3 = uiRewardCertificateInfo3.getStyleInfo();
                            BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(null, headerTitle, annotatedString, null, null, footerTitle, footerDetail, description, secondaryRow2, styleInfo3 != null ? Color2.Color(styleInfo3.getCardColor()) : BentoColor.INSTANCE.m21354getNightXrayLight0d7_KjU(), 0L, composer3, SecondaryRow.$stable << 24, 0, 1049);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 12779520, 98299);
            composerStartRestartGroup = composerStartRestartGroup;
            TopBarComposable(onCloseClick, composerStartRestartGroup, (i3 >> 9) & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardClaimingComposable5.RewardClaimingComposable$lambda$2(navigator, info, defaultDismissLabel, onCloseClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TopBarComposable(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-536590756);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-536590756, i2, -1, "com.robinhood.android.referral.rewardclaims.TopBarComposable (RewardClaimingComposable.kt:130)");
            }
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, Color.INSTANCE.m6727getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(684454190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt.TopBarComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(684454190, i3, -1, "com.robinhood.android.referral.rewardclaims.TopBarComposable.<anonymous> (RewardClaimingComposable.kt:134)");
                    }
                    RewardClaimingComposable rewardClaimingComposable = RewardClaimingComposable.INSTANCE;
                    Function2<Composer, Integer, Unit> lambda$828286689$feature_referral_externalDebug = rewardClaimingComposable.getLambda$828286689$feature_referral_externalDebug();
                    final Function0<Unit> function02 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$828286689$feature_referral_externalDebug, null, ComposableLambda3.rememberComposableLambda(345969165, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt.TopBarComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i4 & 6) == 0) {
                                i4 |= (i4 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(345969165, i4, -1, "com.robinhood.android.referral.rewardclaims.TopBarComposable.<anonymous>.<anonymous> (RewardClaimingComposable.kt:137)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "closeButton"), false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i4 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), rewardClaimingComposable.getLambda$1920284364$feature_referral_externalDebug(), null, true, false, null, null, 0L, null, composer3, 200070, 0, 2002);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardClaimingComposable5.TopBarComposable$lambda$3(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final void BottomBarComposable(final Navigator navigator, final RichText richText, final List<? extends Button<? extends GenericAction>> list, final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        int i4;
        int i5;
        int i6;
        BentoTheme bentoTheme;
        final Column6 column6;
        final Context context;
        Composer composer2;
        ?? r14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2022163727);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i7 = i2;
        if ((i7 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2022163727, i7, -1, "com.robinhood.android.referral.rewardclaims.BottomBarComposable (RewardClaimingComposable.kt:155)");
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Column6 column62 = Column6.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1167224685);
            if (richText == null) {
                r14 = 0;
                i4 = i7;
                i5 = i8;
                companion = companion2;
                column6 = column62;
                bentoTheme = bentoTheme2;
                context = context2;
                i3 = 48;
                composer2 = composerStartRestartGroup;
                i6 = 16384;
            } else {
                Color.Companion companion4 = Color.INSTANCE;
                i3 = 48;
                companion = companion2;
                i4 = i7;
                i5 = i8;
                i6 = 16384;
                bentoTheme = bentoTheme2;
                column6 = column62;
                context = context2;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15958toAnnotatedStringV23IgeMak(richText, companion4.m6727getWhite0d7_KjU(), (LinkInteractionListener) null, composerStartRestartGroup, 48, 2), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextS(), companion4.m6727getWhite0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                r14 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i4 & 57344) == i6 ? true : r14) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$BottomBarComposable$1$actionHandler$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action instanceof GenericAction.Deeplink) {
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                            return true;
                        }
                        if (!(action instanceof GenericAction.Dismiss)) {
                            return false;
                        }
                        function0.invoke();
                        return true;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            SduiActionHandler3.ProvideActionHandler((SduiActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1060057798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$BottomBarComposable$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1060057798, i9, -1, "com.robinhood.android.referral.rewardclaims.BottomBarComposable.<anonymous>.<anonymous> (RewardClaimingComposable.kt:189)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
                    final List<Button<GenericAction>> list2 = list;
                    final Column5 column5 = column6;
                    final Function0<Unit> function02 = function0;
                    final String str2 = str;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-340061137, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$BottomBarComposable$1$2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-340061137, i10, -1, "com.robinhood.android.referral.rewardclaims.BottomBarComposable.<anonymous>.<anonymous>.<anonymous> (RewardClaimingComposable.kt:195)");
                            }
                            Unit unit = null;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null), 0.0f, 1, null);
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme3.getSpacing(composer4, i11).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer4, i11).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer4, i11).m21593getSmallD9Ej5fM(), 2, null);
                            List<Button<GenericAction>> list3 = list2;
                            composer4.startReplaceGroup(-381222987);
                            if (list3 != null) {
                                Iterator<T> it = list3.iterator();
                                while (it.hasNext()) {
                                    SduiButton2.SduiButton((Button) it.next(), modifierM5146paddingqDBjuR0$default, composer4, 0, 0);
                                }
                                unit = Unit.INSTANCE;
                            }
                            composer4.endReplaceGroup();
                            if (unit == null) {
                                Function0<Unit> function03 = function02;
                                String str3 = str2;
                                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                                Color.Companion companion5 = Color.INSTANCE;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function03, str3, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, Color.m6701boximpl(companion5.m6727getWhite0d7_KjU()), Color.m6701boximpl(companion5.m6727getWhite0d7_KjU()), null, false, null, composer4, 905994240, 0, 7400);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, i3);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), composer2, r14);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardclaims.RewardClaimingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardClaimingComposable5.BottomBarComposable$lambda$7(navigator, richText, list, str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
