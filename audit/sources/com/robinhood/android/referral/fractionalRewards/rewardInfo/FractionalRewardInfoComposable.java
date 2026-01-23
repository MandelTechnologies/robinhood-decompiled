package com.robinhood.android.referral.fractionalRewards.rewardInfo;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposable;
import com.robinhood.android.referral.lib.rewardOfferDetail.p235ui.MarqueeRowComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.ClaimableInstrument;
import com.robinhood.models.p355ui.EducationalProp;
import com.robinhood.models.p355ui.FractionalRewardInfo;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FractionalRewardInfoComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a+\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"FractionalRewardInfoComposable", "", "rewardInfo", "Lcom/robinhood/models/ui/FractionalRewardInfo;", "onActionButtonClicked", "Lkotlin/Function0;", "onLinkClicked", "Lkotlin/Function1;", "Landroid/net/Uri;", "(Lcom/robinhood/models/ui/FractionalRewardInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ANIMATION_NAME", "", "FractionalRewardInfoHeader", "headline", "Landroid/text/SpannableString;", "subHeadline", "marqueeItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "(Landroid/text/SpannableString;Landroid/text/SpannableString;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", FractionalRewardInfoComposable.FractionalRewardInfoAnimation, FractionalRewardInfoComposable.FractionalRewardInfoActionButton, FractionalRewardInfoComposable.FractionalRewardInfoHeadline, FractionalRewardInfoComposable.FractionalRewardInfoSubHeadline, FractionalRewardInfoComposable.FractionalRewardInfoEducationProps, FractionalRewardInfoComposable.FractionalRewardInfoDisclosure, FractionalRewardInfoComposable.FractionalRewardInfoMarquee, "feature-referral_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FractionalRewardInfoComposable {
    private static final String ANIMATION_NAME = "tetris_highlight";
    public static final String FractionalRewardInfoActionButton = "FractionalRewardInfoActionButton";
    public static final String FractionalRewardInfoAnimation = "FractionalRewardInfoAnimation";
    public static final String FractionalRewardInfoDisclosure = "FractionalRewardInfoDisclosure";
    public static final String FractionalRewardInfoEducationProps = "FractionalRewardInfoEducationProps";
    public static final String FractionalRewardInfoHeadline = "FractionalRewardInfoHeadline";
    public static final String FractionalRewardInfoMarquee = "FractionalRewardInfoMarquee";
    public static final String FractionalRewardInfoSubHeadline = "FractionalRewardInfoSubHeadline";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FractionalRewardInfoComposable$lambda$0(FractionalRewardInfo fractionalRewardInfo, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        FractionalRewardInfoComposable(fractionalRewardInfo, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FractionalRewardInfoHeader$lambda$6(SpannableString spannableString, SpannableString spannableString2, ImmutableList immutableList, int i, Composer composer, int i2) {
        FractionalRewardInfoHeader(spannableString, spannableString2, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FractionalRewardInfoComposable(final FractionalRewardInfo rewardInfo, final Function0<Unit> onActionButtonClicked, final Function1<? super Uri, Unit> onLinkClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
        Intrinsics.checkNotNullParameter(onActionButtonClicked, "onActionButtonClicked");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(284527222);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rewardInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActionButtonClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLinkClicked) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284527222, i2, -1, "com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposable (FractionalRewardInfoComposable.kt:53)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-600904863, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt.FractionalRewardInfoComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-600904863, i3, -1, "com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposable.<anonymous> (FractionalRewardInfoComposable.kt:59)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), FractionalRewardInfoComposable.FractionalRewardInfoActionButton), null, true, false, false, true, false, null, 109, null);
                    BentoButtonKt.m20586BentoButtonEikTQX8(onActionButtonClicked, rewardInfo.getInfoCta(), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1254855538, true, new C267032(rewardInfo, onLinkClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardInfoComposable.FractionalRewardInfoComposable$lambda$0(rewardInfo, onActionButtonClicked, onLinkClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FractionalRewardInfoComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$FractionalRewardInfoComposable$2 */
    static final class C267032 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ Function1<Uri, Unit> $onLinkClicked;
        final /* synthetic */ FractionalRewardInfo $rewardInfo;

        /* JADX WARN: Multi-variable type inference failed */
        C267032(FractionalRewardInfo fractionalRewardInfo, Function1<? super Uri, Unit> function1) {
            this.$rewardInfo = fractionalRewardInfo;
            this.$onLinkClicked = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$1$lambda$0(Function1 function1, Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            function1.invoke(uri);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$3$lambda$2(Function1 function1, Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            function1.invoke(uri);
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1254855538, i, -1, "com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposable.<anonymous> (FractionalRewardInfoComposable.kt:76)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            FractionalRewardInfo fractionalRewardInfo = this.$rewardInfo;
            final Function1<Uri, Unit> function1 = this.$onLinkClicked;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            RichText infoHeadline = fractionalRewardInfo.getInfoHeadline();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$FractionalRewardInfoComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FractionalRewardInfoComposable.C267032.invoke$lambda$7$lambda$1$lambda$0(function1, (Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SpannableString spannableString$default = RichTexts.toSpannableString$default(infoHeadline, context, null, false, (Function1) objRememberedValue, 6, null);
            RichText infoSubHeadline = fractionalRewardInfo.getInfoSubHeadline();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$FractionalRewardInfoComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FractionalRewardInfoComposable.C267032.invoke$lambda$7$lambda$3$lambda$2(function1, (Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SpannableString spannableString$default2 = RichTexts.toSpannableString$default(infoSubHeadline, context, null, false, (Function1) objRememberedValue2, 6, null);
            List<ClaimableInstrument> instruments = fractionalRewardInfo.getInstruments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(instruments, 10));
            Iterator<T> it = instruments.iterator();
            while (it.hasNext()) {
                arrayList.add(((ClaimableInstrument) it.next()).getIconUrl());
            }
            FractionalRewardInfoComposable.FractionalRewardInfoHeader(spannableString$default, spannableString$default2, extensions2.toImmutableList(arrayList), composer, 0);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            composer.startReplaceGroup(-845842822);
            for (final EducationalProp educationalProp : fractionalRewardInfo.getEducationalProps()) {
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, FractionalRewardInfoComposable.FractionalRewardInfoEducationProps);
                BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(educationalProp.getDisplayTitle(), ComposableLambda3.rememberComposableLambda(-819508392, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$FractionalRewardInfoComposable$2$1$4$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-819508392, i2, -1, "com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FractionalRewardInfoComposable.kt:97)");
                        }
                        SpannableString spannableString$default3 = RichTexts.toSpannableString$default(educationalProp.getDisplaySubtitle(), context, null, false, null, 14, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString$default3, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU()), 0, null, 0, 0, null, composer2, 0, 498);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), new BentoValuePropRow2.Pog(ServerToBentoAssetMapper3.SPARKLE), BentoValuePropRow.Top, modifierTestTag, null, composer, (BentoValuePropRow2.Pog.$stable << 6) | 27696, 32);
            }
            composer.endReplaceGroup();
            RichText infoDisclosure = fractionalRewardInfo.getInfoDisclosure();
            composer.startReplaceGroup(-845815917);
            if (infoDisclosure != null) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM()), composer, 0);
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15958toAnnotatedStringV23IgeMak(infoDisclosure, 0L, (LinkInteractionListener) null, composer, 0, 3), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 2, null), FractionalRewardInfoComposable.FractionalRewardInfoDisclosure), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextS(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 0, 0, 8188);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final LottieComposition FractionalRewardInfoHeader$lambda$5$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FractionalRewardInfoHeader$lambda$5$lambda$2(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FractionalRewardInfoHeader(SpannableString spannableString, SpannableString spannableString2, ImmutableList<ThemedImageSource> immutableList, Composer composer, final int i) {
        int i2;
        final SpannableString spannableString3;
        final SpannableString spannableString4;
        final ImmutableList<ThemedImageSource> immutableList2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-669058765);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(spannableString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(spannableString2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            spannableString3 = spannableString;
            spannableString4 = spannableString2;
            immutableList2 = immutableList;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-669058765, i2, -1, "com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoHeader (FractionalRewardInfoComposable.kt:138)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(companion, companion2.getCenter(), false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Column6 column6 = Column6.INSTANCE;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Asset.m9150boximpl(LottieCompositionSpec.Asset.m9151constructorimpl(ANIMATION_NAME)), null, null, null, null, null, composerStartRestartGroup, 6, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(FractionalRewardInfoHeader$lambda$5$lambda$1(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(200));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(modifierM5156height3ABfNKs, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), FractionalRewardInfoAnimation);
            LottieComposition lottieCompositionFractionalRewardInfoHeader$lambda$5$lambda$1 = FractionalRewardInfoHeader$lambda$5$lambda$1(lottieCompositionResultRememberLottieComposition);
            ContentScale fit = ContentScale.INSTANCE.getFit();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(FractionalRewardInfoComposable.FractionalRewardInfoHeader$lambda$5$lambda$2(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionFractionalRewardInfoHeader$lambda$5$lambda$1, (Function0) objRememberedValue, modifierTestTag, false, false, false, null, false, null, null, fit, false, false, null, null, false, composerStartRestartGroup, 0, 6, 64504);
            int i4 = i2;
            BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), FractionalRewardInfoHeadline), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), C20690R.attr.textAppearanceDisplayMedium, 17, 0, 0, null, composerStartRestartGroup, (i2 & 14) | 196608, 452);
            spannableString3 = spannableString;
            spannableString4 = spannableString2;
            BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString4, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), FractionalRewardInfoSubHeadline), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), C20690R.attr.textAppearanceRegularMedium, 17, 0, 0, null, composerStartRestartGroup, ((i4 >> 3) & 14) | 196608, 452);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
            immutableList2 = immutableList;
            MarqueeRowComposable.MarqueeRowComposable(immutableList2, TestTag3.testTag(companion, FractionalRewardInfoMarquee), composerStartRestartGroup, ((i4 >> 6) & 14) | 48, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.fractionalRewards.rewardInfo.FractionalRewardInfoComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardInfoComposable.FractionalRewardInfoHeader$lambda$6(spannableString3, spannableString4, immutableList2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
