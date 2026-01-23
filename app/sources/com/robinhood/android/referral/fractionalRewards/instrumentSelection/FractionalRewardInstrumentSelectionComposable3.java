package com.robinhood.android.referral.fractionalRewards.instrumentSelection;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.fractionalRewards.ExtensionsKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.ClaimableInstrument;
import com.robinhood.models.p355ui.FractionalRewardInfo;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FractionalRewardInstrumentSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0018X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, m3636d2 = {"FractionalRewardInstrumentSelectionComposable", "", "rewardInfo", "Lcom/robinhood/models/ui/FractionalRewardInfo;", "onCardClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/ui/ClaimableInstrument;", "onLinkClicked", "Landroid/net/Uri;", "(Lcom/robinhood/models/ui/FractionalRewardInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "InstrumentHeader", "headline", "Landroid/text/SpannableString;", "subHeadline", "inventoryShortageBannerText", "Lcom/robinhood/models/serverdriven/db/RichText;", "showInventoryShortageBanner", "", "(Landroid/text/SpannableString;Landroid/text/SpannableString;Lcom/robinhood/models/serverdriven/db/RichText;ZLandroidx/compose/runtime/Composer;I)V", "ANIMATION_START_FRAME", "", "ANIMATION_LOOP_MIN_FRAME", "ANIMATION_LOOP_MAX_FRAME", FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentSelectionInfoHeadline, "", FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentSelectionInfoSubHeadline, FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentSelectionDisclosure, FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentSelectionBanner, FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentSelectionAnimation, FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentCard, FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentsArrowIndicator, "feature-referral_externalDebug", "showArrowIndicator", "composition", "Lcom/airbnb/lottie/LottieComposition;", "loopingProgress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FractionalRewardInstrumentSelectionComposable3 {
    private static final int ANIMATION_LOOP_MAX_FRAME = 480;
    private static final int ANIMATION_LOOP_MIN_FRAME = 300;
    private static final int ANIMATION_START_FRAME = 179;
    public static final String FractionalInstrumentCard = "FractionalInstrumentCard";
    public static final String FractionalInstrumentSelectionAnimation = "FractionalInstrumentSelectionAnimation";
    public static final String FractionalInstrumentSelectionBanner = "FractionalInstrumentSelectionBanner";
    public static final String FractionalInstrumentSelectionDisclosure = "FractionalInstrumentSelectionDisclosure";
    public static final String FractionalInstrumentSelectionInfoHeadline = "FractionalInstrumentSelectionInfoHeadline";
    public static final String FractionalInstrumentSelectionInfoSubHeadline = "FractionalInstrumentSelectionInfoSubHeadline";
    public static final String FractionalInstrumentsArrowIndicator = "FractionalInstrumentsArrowIndicator";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FractionalRewardInstrumentSelectionComposable$lambda$14(FractionalRewardInfo fractionalRewardInfo, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        FractionalRewardInstrumentSelectionComposable(fractionalRewardInfo, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentHeader$lambda$20(SpannableString spannableString, SpannableString spannableString2, RichText richText, boolean z, int i, Composer composer, int i2) {
        InstrumentHeader(spannableString, spannableString2, richText, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FractionalRewardInstrumentSelectionComposable(final FractionalRewardInfo rewardInfo, final Function1<? super ClaimableInstrument, Unit> onCardClicked, final Function1<? super Uri, Unit> onLinkClicked, Composer composer, final int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
        Intrinsics.checkNotNullParameter(onCardClicked, "onCardClicked");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2009094565);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rewardInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCardClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLinkClicked) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2009094565, i4, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposable (FractionalRewardInstrumentSelectionComposable.kt:67)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.systemBarsPadding(companion), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new NestedScrollModifier() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$FractionalRewardInstrumentSelectionComposable$1$nestedScrollConnection$1$1
                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPostFling-RZ2iAVY */
                    public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                        return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                    }

                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPostScroll-DzOQY0M */
                    public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i5) {
                        return super.mo5024onPostScrollDzOQY0M(j, j2, i5);
                    }

                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPreFling-QWom1Mo */
                    public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                        return super.mo5609onPreFlingQWom1Mo(j, continuation);
                    }

                    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                    /* renamed from: onPreScroll-OzD1aCk */
                    public long mo5298onPreScrollOzD1aCk(long available, int source) {
                        if (FractionalRewardInstrumentSelectionComposable3.FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$1(snapshotState)) {
                            FractionalRewardInstrumentSelectionComposable3.FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$2(snapshotState, false);
                        }
                        return Offset.INSTANCE.m6553getZeroF1C5BW0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            FractionalRewardInstrumentSelectionComposable4 fractionalRewardInstrumentSelectionComposable4 = (FractionalRewardInstrumentSelectionComposable4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            RichText instrumentSelectionHeadline = rewardInfo.getInstrumentSelectionHeadline();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FractionalRewardInstrumentSelectionComposable3.m2415xa07b6090(onLinkClicked, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpannableString spannableString$default = RichTexts.toSpannableString$default(instrumentSelectionHeadline, context, null, false, (Function1) objRememberedValue3, 6, null);
            RichText instrumentSelectionSubHeadline = rewardInfo.getInstrumentSelectionSubHeadline();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i5 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FractionalRewardInstrumentSelectionComposable3.m2416x890e42d0(onLinkClicked, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            InstrumentHeader(spannableString$default, RichTexts.toSpannableString$default(instrumentSelectionSubHeadline, context, null, false, (Function1) objRememberedValue4, 6, null), rewardInfo.getInstrumentsUnavailableBanner().getText(), ExtensionsKt.hasInstrumentShortage(rewardInfo), composerStartRestartGroup, 0);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(companion, fractionalRewardInstrumentSelectionComposable4, null, 2, null);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rewardInfo) | ((i4 & 112) == 32);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FractionalRewardInstrumentSelectionComposable3.m2414xec0c567e(rewardInfo, onCardClicked, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(modifierNestedScroll$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composerStartRestartGroup, 0, 508);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(-1499271121);
            if (FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$1(snapshotState)) {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                i3 = 0;
                CardKt.m5548CardFjzlyU(boxScopeInstance.align(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_instrument_card_scroll_indicator_size, composerStartRestartGroup, 0)), PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_instrument_card_scroll_indicator_size, composerStartRestartGroup, 0)), companion2.getCenterEnd()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_instrument_card_scroll_indicator_radius, composerStartRestartGroup, 0)), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, null, 0.0f, FractionalRewardInstrumentSelectionComposable.INSTANCE.getLambda$1307300897$feature_referral_externalDebug(), composerStartRestartGroup, 1572864, 56);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i3 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, i3);
            RichText instrumentSelectionDisclosure = rewardInfo.getInstrumentSelectionDisclosure();
            composerStartRestartGroup.startReplaceGroup(-1114928202);
            if (instrumentSelectionDisclosure != null) {
                Composer composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15958toAnnotatedStringV23IgeMak(instrumentSelectionDisclosure, 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 3), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 2, null), FractionalInstrumentSelectionDisclosure), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS(), bentoTheme2.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer2, 0, 0, 8188);
                composerStartRestartGroup = composer2;
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardInstrumentSelectionComposable3.FractionalRewardInstrumentSelectionComposable$lambda$14(rewardInfo, onCardClicked, onLinkClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition InstrumentHeader$lambda$19$lambda$15(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float InstrumentHeader$lambda$19$lambda$16(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$5$lambda$4 */
    public static final Unit m2415xa07b6090(Function1 function1, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$7$lambda$6 */
    public static final Unit m2416x890e42d0(Function1 function1, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2414xec0c567e(final FractionalRewardInfo fractionalRewardInfo, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List<ClaimableInstrument> instruments = fractionalRewardInfo.getInstruments();
        LazyRow.items(instruments.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$11$lambda$10$lambda$9$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                instruments.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$FractionalRewardInstrumentSelectionComposable$lambda$13$lambda$11$lambda$10$lambda$9$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                ClaimableInstrument claimableInstrument = (ClaimableInstrument) instruments.get(i);
                composer.startReplaceGroup(1525951537);
                Modifier modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                composer.startReplaceGroup(-1059151606);
                Modifier modifierM5146paddingqDBjuR0$default2 = i == 0 ? PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null) : modifierM5146paddingqDBjuR0$default;
                composer.endReplaceGroup();
                Modifier modifierThen = modifierM5146paddingqDBjuR0$default.then(modifierM5146paddingqDBjuR0$default2);
                composer.startReplaceGroup(-1059146633);
                if (i == fractionalRewardInfo.getInstruments().size() - 1) {
                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                }
                composer.endReplaceGroup();
                InstrumentCardViewComposable.InstrumentCardViewComposable(claimableInstrument, function1, TestTag3.testTag(modifierThen.then(modifierM5146paddingqDBjuR0$default), FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentCard), composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float InstrumentHeader$lambda$19$lambda$18$lambda$17(LottieAnimationState lottieAnimationState, LottieAnimationState lottieAnimationState2) {
        if (lottieAnimationState.isPlaying()) {
            return lottieAnimationState.getProgress();
        }
        return InstrumentHeader$lambda$19$lambda$16(lottieAnimationState2);
    }

    private static final void InstrumentHeader(final SpannableString spannableString, final SpannableString spannableString2, final RichText richText, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1957306044);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(spannableString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(spannableString2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(richText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1957306044, i2, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentHeader (FractionalRewardInstrumentSelectionComposable.kt:170)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(modifierM5144paddingVpY3zN4$default, companion2.getCenter(), false, 2, null), 0.0f, 1, null);
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
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C26659R.raw.lotte_cash_to_cube_full)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieComposition lottieCompositionInstrumentHeader$lambda$19$lambda$15 = InstrumentHeader$lambda$19$lambda$15(lottieCompositionResultRememberLottieComposition);
            LottieClipSpec.Frame frame = new LottieClipSpec.Frame(179, null, false, 6, null);
            int i4 = LottieClipSpec.Frame.$stable;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieCompositionInstrumentHeader$lambda$19$lambda$15, false, false, false, frame, 0.0f, 1, null, false, false, composerStartRestartGroup, (i4 << 12) | 1572864, 942);
            int i5 = i2;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(InstrumentHeader$lambda$19$lambda$15(lottieCompositionResultRememberLottieComposition), !lottieAnimationStateAnimateLottieCompositionAsState.isPlaying(), false, false, new LottieClipSpec.Frame(300, Integer.valueOf(ANIMATION_LOOP_MAX_FRAME), false, 4, null), 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, (i4 << 12) | 1572864, 940);
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(150)), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), FractionalInstrumentSelectionAnimation);
            LottieComposition lottieCompositionInstrumentHeader$lambda$19$lambda$152 = InstrumentHeader$lambda$19$lambda$15(lottieCompositionResultRememberLottieComposition);
            ContentScale inside = ContentScale.INSTANCE.getInside();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(FractionalRewardInstrumentSelectionComposable3.InstrumentHeader$lambda$19$lambda$18$lambda$17(lottieAnimationStateAnimateLottieCompositionAsState, lottieAnimationStateAnimateLottieCompositionAsState2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionInstrumentHeader$lambda$19$lambda$152, (Function0) objRememberedValue, modifierTestTag, false, false, false, null, false, null, null, inside, false, false, null, null, false, composerStartRestartGroup, 0, 6, 64504);
            composerStartRestartGroup = composerStartRestartGroup;
            BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), FractionalInstrumentSelectionInfoHeadline), null, null, C20690R.attr.textAppearanceDisplaySmall, 17, 0, 0, null, composerStartRestartGroup, (i5 & 14) | 196608, 460);
            BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString2, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), FractionalInstrumentSelectionInfoSubHeadline), null, null, 0, 17, 0, 0, null, composerStartRestartGroup, ((i5 >> 3) & 14) | 196608, 476);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1941581863);
                BentoInfoBanner2.BentoPinnedInfoBanner(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(0), 7, null), FractionalInstrumentSelectionBanner), richText.getText(), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, composerStartRestartGroup, (BentoIcon4.Size24.$stable << 6) | 3072, 16);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1941998472);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.FractionalRewardInstrumentSelectionComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardInstrumentSelectionComposable3.InstrumentHeader$lambda$20(spannableString, spannableString2, richText, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
