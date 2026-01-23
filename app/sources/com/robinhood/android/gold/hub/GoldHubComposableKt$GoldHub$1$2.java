package com.robinhood.android.gold.hub;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.ButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.gold.BentoAppBarWithTransition;
import com.robinhood.android.gold.contracts.GoldHubSettingsComponentTargetType;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsTracker;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubBanner;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubBillingMethod;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubBillingSection;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCard;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCardSection;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubFeatureSection;
import com.robinhood.android.gold.lib.hub.api.GoldHubSwitchPlansCta;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCell;
import com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: GoldHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class GoldHubComposableKt$GoldHub$1$2 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ SduiActionHandler<GoldHubAction> $actionHandler;
    final /* synthetic */ SnapshotState<C2002Dp> $appBarHeight$delegate;
    final /* synthetic */ ApiGoldHubCard $cardToShow;
    final /* synthetic */ FragmentManager $childFragmentManager;
    final /* synthetic */ Map<GoldHubSettingsComponentTargetType, Float> $componentPositionMap;
    final /* synthetic */ MoneyMovementPaymentPreferenceCellDuxo $duxo;
    final /* synthetic */ SduiActionHandler<GenericAction> $genericActionHandler;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ boolean $isGoldEventActive;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ Ref.BooleanRef $positionOccured;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ GoldHubSettingsComponentTargetType $scrollTarget;
    final /* synthetic */ boolean $showBackButton;
    final /* synthetic */ ApiGoldHub $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldHubComposableKt$GoldHub$1$2(GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, Modifier modifier, ScrollState scrollState, ApiGoldHub apiGoldHub, float f, Ref.BooleanRef booleanRef, Map<GoldHubSettingsComponentTargetType, Float> map, boolean z, FragmentManager fragmentManager, ApiGoldHubCard apiGoldHubCard, SnapshotState<C2002Dp> snapshotState, SduiActionHandler<? super GenericAction> sduiActionHandler, SduiActionHandler<? super GoldHubAction> sduiActionHandler2, MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, boolean z2, Function0<Unit> function0) {
        this.$scrollTarget = goldHubSettingsComponentTargetType;
        this.$modifier = modifier;
        this.$scrollState = scrollState;
        this.$this_with = apiGoldHub;
        this.$headerHeight = f;
        this.$positionOccured = booleanRef;
        this.$componentPositionMap = map;
        this.$isGoldEventActive = z;
        this.$childFragmentManager = fragmentManager;
        this.$cardToShow = apiGoldHubCard;
        this.$appBarHeight$delegate = snapshotState;
        this.$genericActionHandler = sduiActionHandler;
        this.$actionHandler = sduiActionHandler2;
        this.$duxo = moneyMovementPaymentPreferenceCellDuxo;
        this.$showBackButton = z2;
        this.$onBackClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* compiled from: GoldHubComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$1", m3645f = "GoldHubComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 225}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$1 */
    static final class C177771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<GoldHubSettingsComponentTargetType, Float> $componentPositionMap;
        final /* synthetic */ Ref.BooleanRef $positionOccured;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ GoldHubSettingsComponentTargetType $scrollTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C177771(Ref.BooleanRef booleanRef, ScrollState scrollState, Map<GoldHubSettingsComponentTargetType, Float> map, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, Continuation<? super C177771> continuation) {
            super(2, continuation);
            this.$positionOccured = booleanRef;
            this.$scrollState = scrollState;
            this.$componentPositionMap = map;
            this.$scrollTarget = goldHubSettingsComponentTargetType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C177771(this.$positionOccured, this.$scrollState, this.$componentPositionMap, this.$scrollTarget, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (androidx.compose.foundation.ScrollState.animateScrollTo$default(r4, r5, null, r10, 2, null) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0 || i == 1) {
                ResultKt.throwOnFailure(obj);
                while (true) {
                    if (!this.$positionOccured.element) {
                        this.label = 1;
                        if (DelayKt.delay(300L, this) == coroutine_suspended) {
                            break;
                        }
                    } else {
                        ScrollState scrollState = this.$scrollState;
                        Float f = this.$componentPositionMap.get(this.$scrollTarget);
                        int iFloatValue = f != null ? (int) f.floatValue() : 0;
                        this.label = 2;
                    }
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Ref.BooleanRef booleanRef, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$6$lambda$5$lambda$4(Map map, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        map.put(GoldHubSettingsComponentTargetType.GOLD_BILLING_COMPONENT, Float.valueOf(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInRoot(it) & 4294967295L))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$11$lambda$9$lambda$8$lambda$7(Map map, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        map.put(GoldHubSettingsComponentTargetType.GOLD_BILLING_COMPONENT, Float.valueOf(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInRoot(it) & 4294967295L))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$22$lambda$14$lambda$13$lambda$12(SduiActionHandler sduiActionHandler, GoldHubSwitchPlansCta goldHubSwitchPlansCta) {
        sduiActionHandler.mo15941handle(goldHubSwitchPlansCta.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$22$lambda$20$lambda$19$lambda$18(ApiGoldHubBanner apiGoldHubBanner, SduiActionHandler sduiActionHandler) {
        String ctaLink = apiGoldHubBanner.getCtaLink();
        if (ctaLink != null) {
            sduiActionHandler.mo15941handle(new GoldHubAction.Deeplink(new DeeplinkAction(ctaLink)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.robinhood.compose.bento.component.BentoIcons] */
    /* JADX WARN: Type inference failed for: r3v43 */
    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
        FragmentManager fragmentManager;
        Unit unit;
        BentoTheme bentoTheme;
        Modifier.Companion companion;
        ApiGoldHub apiGoldHub;
        ApiGoldHubCard apiGoldHubCard;
        int i2;
        ApiGoldHubBillingMethod apiGoldHubBillingMethod;
        int i3;
        Modifier.Companion companion2;
        int i4;
        SduiActionHandler<GoldHubAction> sduiActionHandler;
        final Map<GoldHubSettingsComponentTargetType, Float> map;
        Object obj;
        final SduiActionHandler<GoldHubAction> sduiActionHandler2;
        SduiActionHandler<GoldHubAction> sduiActionHandler3;
        int i5;
        final SduiActionHandler<GoldHubAction> sduiActionHandler4;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1410622770, i, -1, "com.robinhood.android.gold.hub.GoldHub.<anonymous>.<anonymous> (GoldHubComposable.kt:219)");
        }
        composer2.startReplaceGroup(1601184329);
        GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.$scrollTarget;
        if (goldHubSettingsComponentTargetType != null) {
            EffectsKt.LaunchedEffect(goldHubSettingsComponentTargetType, new C177771(this.$positionOccured, this.$scrollState, this.$componentPositionMap, goldHubSettingsComponentTargetType, null), composer2, 0);
        }
        composer2.endReplaceGroup();
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(this.$modifier, this.$scrollState, false, null, false, 14, null);
        final Ref.BooleanRef booleanRef = this.$positionOccured;
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierVerticalScroll$default, new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GoldHubComposableKt$GoldHub$1$2.invoke$lambda$0(booleanRef, (LayoutCoordinates) obj2);
            }
        });
        boolean z = this.$isGoldEventActive;
        FragmentManager fragmentManager2 = this.$childFragmentManager;
        ApiGoldHub apiGoldHub2 = this.$this_with;
        ApiGoldHubCard apiGoldHubCard2 = this.$cardToShow;
        SnapshotState<C2002Dp> snapshotState = this.$appBarHeight$delegate;
        SduiActionHandler<GenericAction> sduiActionHandler5 = this.$genericActionHandler;
        SduiActionHandler<GoldHubAction> sduiActionHandler6 = this.$actionHandler;
        Map<GoldHubSettingsComponentTargetType, Float> map2 = this.$componentPositionMap;
        MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo = this.$duxo;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierOnGloballyPositioned);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        if (z) {
            composer2.startReplaceGroup(1583181217);
            GoldHubComposableKt.m15029GoldEventSectionWMci_g0(fragmentManager2, GoldHubComposableKt.GoldHub$lambda$2(snapshotState), 0.0f, composer, 0, 4);
            fragmentManager = fragmentManager2;
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            fragmentManager = fragmentManager2;
            composer2.startReplaceGroup(1583392792);
            ApiGoldEarningsTracker earningsTracker = apiGoldHub2.getEarningsTracker();
            composer2.startReplaceGroup(-780205636);
            if (earningsTracker == null) {
                unit = null;
            } else {
                GoldHubComposableKt.m15028GoldEarningsTrackerHeader6a0pyJM(earningsTracker, sduiActionHandler5, GoldHubComposableKt.GoldHub$lambda$2(snapshotState), apiGoldHub2.getInfoTag(), composer2, 0);
                unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            if (unit == null) {
                GoldHubComposableKt.GoldImageHeader(apiGoldHub2, composer2, 0);
            }
            composer2.endReplaceGroup();
        }
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i6 = BentoTheme.$stable;
        if (bentoTheme2.getColors(composer2, i6).getIsDay()) {
            composer2.startReplaceGroup(1583828838);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composer2, i6).m21591getLargeD9Ej5fM()), composer2, 0);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1583934052);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
            composer2.endReplaceGroup();
        }
        Modifier.Companion companion5 = Modifier.INSTANCE;
        MicrogramEmbeddedSection3.MicrogramEmbeddedSection(new RemoteMicrogramApplication("app-gold-hub-promo-card", null, 2, null), fragmentManager, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), null, null, null, null, false, null, composer, 384, 504);
        Composer composer3 = composer;
        composer3.startReplaceGroup(-780175976);
        if (apiGoldHubCard2 == null) {
            bentoTheme = bentoTheme2;
            companion2 = companion5;
            apiGoldHub = apiGoldHub2;
            i4 = 0;
            i3 = i6;
            sduiActionHandler = sduiActionHandler6;
            apiGoldHubBillingMethod = null;
        } else {
            ApiGoldHubCardSection cardSection = apiGoldHub2.getCardSection();
            String title = cardSection != null ? cardSection.getTitle() : null;
            composer3.startReplaceGroup(-780173491);
            if (title == null || title.length() == 0) {
                bentoTheme = bentoTheme2;
                companion = companion5;
                apiGoldHub = apiGoldHub2;
                apiGoldHubCard = apiGoldHubCard2;
                i2 = i6;
                apiGoldHubBillingMethod = null;
            } else {
                apiGoldHub = apiGoldHub2;
                i2 = i6;
                apiGoldHubCard = apiGoldHubCard2;
                companion = companion5;
                bentoTheme = bentoTheme2;
                apiGoldHubBillingMethod = null;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composer3, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i6).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                composer3 = composer;
            }
            composer3.endReplaceGroup();
            i3 = i2;
            companion2 = companion;
            i4 = 0;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM()), composer3, 0);
            sduiActionHandler = sduiActionHandler6;
            GoldHubComposableKt.Card(apiGoldHubCard, sduiActionHandler, composer3, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21594getXlargeD9Ej5fM()), composer3, 0);
            Unit unit2 = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        ApiGoldHubFeatureSection featureSection = apiGoldHub.getFeatureSection();
        composer3.startReplaceGroup(-780151688);
        if (featureSection != null) {
            GoldHubComposableKt.FeatureSection(featureSection, sduiActionHandler, apiGoldHub.getEarningsTracker() == null ? apiGoldHub.getInfoTag() : apiGoldHubBillingMethod, composer3, i4);
            Unit unit3 = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        ApiGoldHubBillingSection billingSectionV2 = apiGoldHub.getBillingSectionV2();
        composer3.startReplaceGroup(-780137108);
        if (billingSectionV2 == null) {
            obj = apiGoldHubBillingMethod;
            map = map2;
        } else {
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21594getXlargeD9Ej5fM()), composer3, i4);
            composer3.startReplaceGroup(5004770);
            map = map2;
            boolean zChangedInstance = composer3.changedInstance(map);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GoldHubComposableKt$GoldHub$1$2.invoke$lambda$23$lambda$6$lambda$5$lambda$4(map, (LayoutCoordinates) obj2);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            GoldHubComposableKt.BillingSection(billingSectionV2, sduiActionHandler, OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue), composer, 0, 0);
            composer3 = composer;
            obj = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(-780136434);
        if (obj == null) {
            ApiGoldHubBillingSection billingSection = apiGoldHub.getBillingSection();
            composer3.startReplaceGroup(-780115376);
            if (billingSection == null) {
                sduiActionHandler2 = sduiActionHandler;
            } else {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21594getXlargeD9Ej5fM()), composer3, i4);
                composer3.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer3.changedInstance(map);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GoldHubComposableKt$GoldHub$1$2.invoke$lambda$23$lambda$11$lambda$9$lambda$8$lambda$7(map, (LayoutCoordinates) obj2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                GoldHubComposableKt.BillingSection(billingSection, sduiActionHandler, OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue2), composer, 0, 0);
                sduiActionHandler2 = sduiActionHandler;
                composer3 = composer;
                Unit unit4 = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
            ApiGoldHubBillingSection billingSection2 = apiGoldHub.getBillingSection();
            ApiGoldHubBillingMethod goldHubBillingMethod = billingSection2 != null ? billingSection2.getGoldHubBillingMethod() : apiGoldHubBillingMethod;
            composer3.startReplaceGroup(-780094447);
            if (goldHubBillingMethod != null) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21594getXlargeD9Ej5fM()), composer3, i4);
                MoneyMovementPaymentPreferenceCell.MoneyMovementPaymentPreferenceCell(null, goldHubBillingMethod.getTitle(), goldHubBillingMethod.getPaymentMethodHeadingText(), moneyMovementPaymentPreferenceCellDuxo, composer3, MoneyMovementPaymentPreferenceCellDuxo.$stable << 9, 1);
                Unit unit5 = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
        } else {
            sduiActionHandler2 = sduiActionHandler;
        }
        composer3.endReplaceGroup();
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM(), composer3, 6, i4);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, i4);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i4);
        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        final GoldHubSwitchPlansCta switchPlansCta = apiGoldHub.getSwitchPlansCta();
        composer3.startReplaceGroup(546337550);
        if (switchPlansCta == null) {
            i5 = i4;
            sduiActionHandler3 = sduiActionHandler2;
        } else {
            composer3.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer3.changedInstance(sduiActionHandler2) | composer3.changedInstance(switchPlansCta);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldHubComposableKt$GoldHub$1$2.invoke$lambda$23$lambda$22$lambda$14$lambda$13$lambda$12(sduiActionHandler2, switchPlansCta);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue3);
            }
            composer3.endReplaceGroup();
            sduiActionHandler3 = sduiActionHandler2;
            ButtonKt.OutlinedButton((Function0) objRememberedValue3, null, false, null, null, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer3, i3).m21593getSmallD9Ej5fM()), null, null, null, ComposableLambda3.rememberComposableLambda(2055801958, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$3$6$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                    invoke(row5, composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 OutlinedButton, Composer composer4, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer4.changed(OutlinedButton) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2055801958, i8, -1, "com.robinhood.android.gold.hub.GoldHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:324)");
                    }
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.CALENDAR_24);
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(size24, "", bentoTheme3.getColors(composer4, i9).m21425getFg0d7_KjU(), null, null, false, composer4, BentoIcon4.Size24.$stable | 48, 56);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion6, bentoTheme3.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM()), composer4, 0);
                    BentoText2.m20747BentoText38GnDrw(switchPlansCta.getTitle(), androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion6, 0.0f, bentoTheme3.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer4, i9).getTextM(), composer4, 0, 0, 8188);
                    Spacer2.Spacer(Row5.weight$default(OutlinedButton, companion6, 1.0f, false, 2, null), composer4, 0);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme3.getColors(composer4, i9).m21427getFg30d7_KjU(), null, null, false, composer4, BentoIcon4.Size16.$stable | 48, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer, 805306368, 478);
            composer3 = composer;
            i5 = 0;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21594getXlargeD9Ej5fM()), composer3, 0);
            Unit unit6 = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        TextButton<GoldHubAction> cta = apiGoldHub.getCta();
        composer3.startReplaceGroup(546382017);
        if (cta == null) {
            sduiActionHandler4 = sduiActionHandler3;
        } else {
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(cta);
            Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(companion2, Component.ComponentType.LINK_BUTTON, cta.getLogging_identifier(), false, composer3, 54, 4);
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composer3.startReplaceGroup(-1772220517);
            Composer composer4 = composer3;
            SduiActionHandler<GoldHubAction> sduiActionHandler7 = sduiActionHandler3;
            SduiColumns.SduiColumn(immutableList3PersistentListOf, GoldHubAction.class, modifierAutoLogEvents, null, sduiActionHandler7, horizontalPadding, arrangement.getTop(), companion3.getStart(), true, composer4, 100859904, 0);
            sduiActionHandler4 = sduiActionHandler7;
            composer3 = composer4;
            composer3.endReplaceGroup();
            Unit unit7 = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        final ApiGoldHubBanner banner = apiGoldHub.getBanner();
        composer3.startReplaceGroup(546401883);
        if (banner != null) {
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21592getMediumD9Ej5fM()), composer3, i5);
            Modifier modifierAutoLogEvents2 = UtilKt.autoLogEvents(companion2, Component.ComponentType.INFO_BANNER, banner.getId(), false, composer3, 54, 4);
            String content = banner.getContent();
            String ctaText = banner.getCtaText();
            ServerToBentoAssetMapper2 icon = banner.getIcon();
            ?? size24 = icon != null ? new BentoIcon4.Size24(icon) : apiGoldHubBillingMethod;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU();
            long jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i3).m21372getBg20d7_KjU();
            composer3.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composer3.changedInstance(banner) | composer3.changedInstance(sduiActionHandler4);
            Object objRememberedValue4 = composer3.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldHubComposableKt$GoldHub$1$2.invoke$lambda$23$lambda$22$lambda$20$lambda$19$lambda$18(banner, sduiActionHandler4);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue4);
            }
            composer3.endReplaceGroup();
            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents2, content, size24, ctaText, (Function0) objRememberedValue4, null, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, composer, BentoIcon4.Size24.$stable << 6, 32);
            composer3 = composer;
            Unit unit8 = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        String disclosureMarkdown = apiGoldHub.getDisclosureMarkdown();
        composer3.startReplaceGroup(546437291);
        if (disclosureMarkdown != null) {
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i3).m21594getXlargeD9Ej5fM()), composer3, 0);
            BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i3).getTextS(), 0, bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
            composer3 = composer;
            Unit unit9 = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        composer3.endNode();
        composer3.endNode();
        String headerTitle = this.$this_with.getHeaderTitle();
        ScrollState scrollState = this.$scrollState;
        float f = this.$headerHeight;
        final boolean z2 = this.$showBackButton;
        final Function0<Unit> function0 = this.$onBackClick;
        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(316463155, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2.4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                invoke(bentoAppBarScope, composer5, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final BentoAppBarScope BentoAppBarWithTransition, Composer composer5, int i7) {
                int i8;
                Intrinsics.checkNotNullParameter(BentoAppBarWithTransition, "$this$BentoAppBarWithTransition");
                if ((i7 & 6) == 0) {
                    i8 = i7 | ((i7 & 8) == 0 ? composer5.changed(BentoAppBarWithTransition) : composer5.changedInstance(BentoAppBarWithTransition) ? 4 : 2);
                } else {
                    i8 = i7;
                }
                if ((i8 & 19) == 18 && composer5.getSkipping()) {
                    composer5.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(316463155, i8, -1, "com.robinhood.android.gold.hub.GoldHub.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:399)");
                }
                if (z2) {
                    long nova = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).getNova();
                    final Function0<Unit> function02 = function0;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, nova, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(835446474, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt.GoldHub.1.2.4.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer6, int i9) {
                            if ((i9 & 3) == 2 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(835446474, i9, -1, "com.robinhood.android.gold.hub.GoldHub.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:401)");
                            }
                            BentoAppBarWithTransition.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer6, BentoAppBarScope.$stable << 12, 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer5, 54), composer5, 805306368, 509);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer3, 54);
        composer3.startReplaceGroup(5004770);
        final SnapshotState<C2002Dp> snapshotState2 = this.$appBarHeight$delegate;
        Object objRememberedValue5 = composer3.rememberedValue();
        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$2$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GoldHubComposableKt$GoldHub$1$2.invoke$lambda$25$lambda$24(snapshotState2, (C2002Dp) obj2);
                }
            };
            composer3.updateRememberedValue(objRememberedValue5);
        }
        composer3.endReplaceGroup();
        BentoAppBarWithTransition.m12210BentoAppBarWithTransitionzVdqMik(scrollState, f, null, composableLambdaRememberComposableLambda, headerTitle, (Function1) objRememberedValue5, null, 0L, 0L, composer, 199680, 452);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$24(SnapshotState snapshotState, C2002Dp c2002Dp) {
        GoldHubComposableKt.GoldHub$lambda$3(snapshotState, c2002Dp.getValue());
        return Unit.INSTANCE;
    }
}
