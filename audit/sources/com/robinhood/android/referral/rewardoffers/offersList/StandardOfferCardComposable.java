package com.robinhood.android.referral.rewardoffers.offersList;

import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.lib.ToHttpUrl;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType;
import com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.models.api.rewardoffer.StandardData;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: StandardOfferCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"StandardOfferCardComposable", "", "viewType", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Standard;", "onButtonClicked", "Lkotlin/Function1;", "onCardClicked", "(Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Standard;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", StandardOfferCardComposable.StandardOfferCardTestTag, "", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class StandardOfferCardComposable {
    public static final String StandardOfferCardTestTag = "StandardOfferCardTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardOfferCardComposable$lambda$0(RewardOfferViewType.Standard standard, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        StandardOfferCardComposable(standard, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StandardOfferCardComposable(final RewardOfferViewType.Standard viewType, final Function1<? super RewardOfferViewType.Standard, Unit> onButtonClicked, final Function1<? super RewardOfferViewType.Standard, Unit> onCardClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(onButtonClicked, "onButtonClicked");
        Intrinsics.checkNotNullParameter(onCardClicked, "onCardClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1368110831);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onButtonClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCardClicked) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1368110831, i2, -1, "com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposable (StandardOfferCardComposable.kt:51)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1619885850, true, new C268111(viewType, onCardClicked, viewType.getData(), onButtonClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StandardOfferCardComposable.StandardOfferCardComposable$lambda$0(viewType, onButtonClicked, onCardClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: StandardOfferCardComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposableKt$StandardOfferCardComposable$1 */
    static final class C268111 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ StandardData $data;
        final /* synthetic */ Function1<RewardOfferViewType.Standard, Unit> $onButtonClicked;
        final /* synthetic */ Function1<RewardOfferViewType.Standard, Unit> $onCardClicked;
        final /* synthetic */ RewardOfferViewType.Standard $viewType;

        /* JADX WARN: Multi-variable type inference failed */
        C268111(RewardOfferViewType.Standard standard, Function1<? super RewardOfferViewType.Standard, Unit> function1, StandardData standardData, Function1<? super RewardOfferViewType.Standard, Unit> function12) {
            this.$viewType = standard;
            this.$onCardClicked = function1;
            this.$data = standardData;
            this.$onButtonClicked = function12;
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
                ComposerKt.traceEventStart(-1619885850, i, -1, "com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposable.<anonymous> (StandardOfferCardComposable.kt:54)");
            }
            ScarletManager scarletManagerScarletManagerOrNull = ScarletManager2.scarletManagerOrNull((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            Boolean boolValueOf = scarletManagerScarletManagerOrNull != null ? Boolean.valueOf(DayNightChanges.isDay(scarletManagerScarletManagerOrNull)) : null;
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, StandardOfferCardComposable.StandardOfferCardTestTag);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, C2002Dp.m7995constructorimpl(128), 1, null);
            Screen screen = new Screen(Screen.Name.REWARD_OFFERS_LIST, null, null, null, 14, null);
            Component.ComponentType componentType = Component.ComponentType.CARD;
            String string2 = this.$viewType.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifierM5155defaultMinSizeVpY3zN4$default, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, string2, null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(Intrinsics.areEqual(boolValueOf, Boolean.TRUE) ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU());
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) 1.5d);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onCardClicked) | composer.changedInstance(this.$viewType);
            final Function1<RewardOfferViewType.Standard, Unit> function1 = this.$onCardClicked;
            final RewardOfferViewType.Standard standard = this.$viewType;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposableKt$StandardOfferCardComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StandardOfferCardComposable.C268111.invoke$lambda$1$lambda$0(function1, standard);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CardKt.m5549CardLPr_se0((Function0) objRememberedValue, modifierFillMaxWidth$default, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, borderStrokeM4886BorderStrokecXLIe8U, fM7995constructorimpl, null, ComposableLambda3.rememberComposableLambda(-1427840448, true, new AnonymousClass2(this.$data, this.$onButtonClicked, this.$viewType), composer, 54), composer, 817889280, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, RewardOfferViewType.Standard standard) {
            function1.invoke(standard);
            return Unit.INSTANCE;
        }

        /* compiled from: StandardOfferCardComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposableKt$StandardOfferCardComposable$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ StandardData $data;
            final /* synthetic */ Function1<RewardOfferViewType.Standard, Unit> $onButtonClicked;
            final /* synthetic */ RewardOfferViewType.Standard $viewType;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(StandardData standardData, Function1<? super RewardOfferViewType.Standard, Unit> function1, RewardOfferViewType.Standard standard) {
                this.$data = standardData;
                this.$onButtonClicked = function1;
                this.$viewType = standard;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                Modifier.Companion companion;
                BentoTheme bentoTheme;
                int i2;
                StandardData standardData;
                Function1<RewardOfferViewType.Standard, Unit> function1;
                RewardOfferViewType.Standard standard;
                int i3;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1427840448, i, -1, "com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposable.<anonymous>.<anonymous> (StandardOfferCardComposable.kt:89)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM()), 0.0f, 1, null);
                StandardData standardData2 = this.$data;
                Function1<RewardOfferViewType.Standard, Unit> function12 = this.$onButtonClicked;
                RewardOfferViewType.Standard standard2 = this.$viewType;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Instant expiration_date = standardData2.getExpiration_date();
                composer.startReplaceGroup(1295391797);
                String strStringResource = (!standardData2.getShow_expiration() || expiration_date == null) ? "" : StringResources_androidKt.stringResource(C26659R.string.reward_offers_expiration_text, new Object[]{InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) expiration_date)}, composer, 0);
                composer.endReplaceGroup();
                String header_text = standardData2.getHeader_text();
                composer.startReplaceGroup(1295403482);
                if (header_text != null) {
                    composer.startReplaceGroup(1295404766);
                    strStringResource = strStringResource.length() == 0 ? header_text : StringResources_androidKt.stringResource(C26659R.string.reward_offers_standard_offer_header_placeholder, new Object[]{strStringResource, header_text}, composer, 0);
                    composer.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                composer.startReplaceGroup(1295412845);
                if (strStringResource.length() > 0) {
                    standardData = standardData2;
                    function1 = function12;
                    standard = standard2;
                    bentoTheme = bentoTheme2;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextS(), composer, 48, 0, 8124);
                    i2 = i4;
                    companion = companion2;
                    i3 = 0;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
                } else {
                    companion = companion2;
                    bentoTheme = bentoTheme2;
                    i2 = i4;
                    standardData = standardData2;
                    function1 = function12;
                    standard = standard2;
                    i3 = 0;
                }
                composer.endReplaceGroup();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer, i3);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, i3);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Modifier.Companion companion5 = companion;
                int i5 = i2;
                BentoTheme bentoTheme3 = bentoTheme;
                BentoText2.m20747BentoText38GnDrw(standardData.getDisplay_text(), Row5.weight$default(Row6.INSTANCE, companion, 1.0f, false, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 24576, 0, 8108);
                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion5, null, false, 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierWrapContentSize$default);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(ToHttpUrl.toHttpUrl(standardData.getImage().toDbModel(), composer, 0)).size(Size.ORIGINAL).build(), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5169size3ABfNKs(companion5, C2002Dp.m7995constructorimpl(80)), companion3.getCenter(), ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer, 28080, 96);
                composer.endNode();
                composer.endNode();
                ApiRewardOfferButtonAction primary_button = standardData.getPrimary_button();
                composer.startReplaceGroup(1295467763);
                if (primary_button != null) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme3.getSpacing(composer, i5).m21590getDefaultD9Ej5fM()), composer, 0);
                    Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(companion5, null, false, 3, null);
                    String display_text = primary_button.getDisplay_text();
                    composer.startReplaceGroup(-1633490746);
                    final Function1<RewardOfferViewType.Standard, Unit> function13 = function1;
                    final RewardOfferViewType.Standard standard3 = standard;
                    boolean zChanged = composer.changed(function13) | composer.changedInstance(standard3);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.offersList.StandardOfferCardComposableKt$StandardOfferCardComposable$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return StandardOfferCardComposable.C268111.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4$lambda$3(function13, standard3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, display_text, modifierWrapContentSize$default2, null, null, false, null, composer, 384, 120);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(Function1 function1, RewardOfferViewType.Standard standard) {
                function1.invoke(standard);
                return Unit.INSTANCE;
            }
        }
    }
}
