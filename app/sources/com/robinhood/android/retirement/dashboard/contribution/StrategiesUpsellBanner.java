package com.robinhood.android.retirement.dashboard.contribution;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.RecsForRetirementStrategiesUpsellKey;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBanner;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrategiesUpsellBanner.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"StrategiesUpsellBanner", "", "accountNumber", "", "state", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;", "onDismissClicked", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class StrategiesUpsellBanner {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesUpsellBanner$lambda$2(String str, RecsForRetirementStrategiesUpsellViewModel.Banner banner, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StrategiesUpsellBanner(str, banner, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StrategiesUpsellBanner(final String accountNumber, final RecsForRetirementStrategiesUpsellViewModel.Banner state, final Function1<? super String, Unit> onDismissClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(290425154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(290425154, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBanner (StrategiesUpsellBanner.kt:49)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StrategiesUpsellBanner.StrategiesUpsellBanner$lambda$1$lambda$0(navigator, context, accountNumber);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final Function0<Unit> function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0);
                final Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1203791610, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt.StrategiesUpsellBanner.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1203791610, i5, -1, "com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBanner.<anonymous> (StrategiesUpsellBanner.kt:63)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jade = bentoTheme.getColors(composer3, i6).getJade();
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer3, i6).getXrayLight(), bentoTheme.getColors(composer3, i6).getNova(), 0L, 0L, jade, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-4200728, true, new AnonymousClass1(modifier4, function0HapticClick, state, onDismissClicked, accountNumber), composer3, 54), composer3, 805306368, 492);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: StrategiesUpsellBanner.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$StrategiesUpsellBanner$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onClick;
                        final /* synthetic */ Function1<String, Unit> $onDismissClicked;
                        final /* synthetic */ RecsForRetirementStrategiesUpsellViewModel.Banner $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Modifier modifier, Function0<Unit> function0, RecsForRetirementStrategiesUpsellViewModel.Banner banner, Function1<? super String, Unit> function1, String str) {
                            this.$modifier = modifier;
                            this.$onClick = function0;
                            this.$state = banner;
                            this.$onDismissClicked = function1;
                            this.$accountNumber = str;
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
                                ComposerKt.traceEventStart(-4200728, i, -1, "com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBanner.<anonymous>.<anonymous> (StrategiesUpsellBanner.kt:68)");
                            }
                            Modifier modifier = this.$modifier;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            float f = 8;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Background3.m4871backgroundbw27NRU(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), false, null, null, this.$onClick, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CARD, "advisory_promo", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                            RecsForRetirementStrategiesUpsellViewModel.Banner banner = this.$state;
                            Function0<Unit> function0 = this.$onClick;
                            final Function1<String, Unit> function1 = this.$onDismissClicked;
                            final String str = this.$accountNumber;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Horizontal start = arrangement.getStart();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(banner.getMessage(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), companion.getCenterVertically(), composer, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion3);
                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, banner.getCtaText(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getXrayLight()), composer, 0, 56);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12), null, bentoTheme.getColors(composer, i2).getXrayLight(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, composer, BentoIcon4.Size12.$stable | 48, 48);
                            composer.endNode();
                            composer.endNode();
                            Modifier modifierHeight = Intrinsic3.height(companion3, Intrinsic4.Max);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierHeight);
                            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor4);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5171sizeVpY3zN4(boxScopeInstance.align(companion3, companion.getCenterEnd()), C2002Dp.m7995constructorimpl(100), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)), 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                            String imageUrl = banner.getImageUrl();
                            ImageLoader imageLoader = Coil.imageLoader((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                            ContentScale.Companion companion4 = ContentScale.INSTANCE;
                            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(imageUrl, imageLoader, null, null, companion4.getFillWidth(), 0, null, composer, 24576, 108), (String) null, modifierM5146paddingqDBjuR0$default, (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
                            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).getNova(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0);
                            Modifier modifierM5142padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(boxScopeInstance.align(companion3, companion.getTopEnd()), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(function1) | composer.changed(str);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$StrategiesUpsellBanner$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return StrategiesUpsellBanner.C269981.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3$lambda$2(function1, str);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM6705copywmQWz5c$default, modifierM5142padding3ABfNKs2, Haptics.hapticClick((Function0) objRememberedValue, composer, 0), false, composer, BentoIcon4.Size24.$stable, 32);
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, String str) {
                            function1.invoke(str);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategiesUpsellBanner.StrategiesUpsellBanner$lambda$2(accountNumber, state, onDismissClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategiesUpsellBanner.StrategiesUpsellBanner$lambda$1$lambda$0(navigator, context, accountNumber);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                final Function0<Unit> function0HapticClick2 = Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0);
                final Modifier modifier42 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1203791610, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt.StrategiesUpsellBanner.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1203791610, i5, -1, "com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBanner.<anonymous> (StrategiesUpsellBanner.kt:63)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jade = bentoTheme.getColors(composer3, i6).getJade();
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer3, i6).getXrayLight(), bentoTheme.getColors(composer3, i6).getNova(), 0L, 0L, jade, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-4200728, true, new AnonymousClass1(modifier42, function0HapticClick2, state, onDismissClicked, accountNumber), composer3, 54), composer3, 805306368, 492);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: StrategiesUpsellBanner.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$StrategiesUpsellBanner$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onClick;
                        final /* synthetic */ Function1<String, Unit> $onDismissClicked;
                        final /* synthetic */ RecsForRetirementStrategiesUpsellViewModel.Banner $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Modifier modifier, Function0<Unit> function0, RecsForRetirementStrategiesUpsellViewModel.Banner banner, Function1<? super String, Unit> function1, String str) {
                            this.$modifier = modifier;
                            this.$onClick = function0;
                            this.$state = banner;
                            this.$onDismissClicked = function1;
                            this.$accountNumber = str;
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
                                ComposerKt.traceEventStart(-4200728, i, -1, "com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBanner.<anonymous>.<anonymous> (StrategiesUpsellBanner.kt:68)");
                            }
                            Modifier modifier = this.$modifier;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            float f = 8;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Background3.m4871backgroundbw27NRU(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), false, null, null, this.$onClick, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CARD, "advisory_promo", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                            RecsForRetirementStrategiesUpsellViewModel.Banner banner = this.$state;
                            Function0<Unit> function0 = this.$onClick;
                            final Function1 function1 = this.$onDismissClicked;
                            final String str = this.$accountNumber;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Horizontal start = arrangement.getStart();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(banner.getMessage(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), companion.getCenterVertically(), composer, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion3);
                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, banner.getCtaText(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getXrayLight()), composer, 0, 56);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12), null, bentoTheme.getColors(composer, i2).getXrayLight(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, composer, BentoIcon4.Size12.$stable | 48, 48);
                            composer.endNode();
                            composer.endNode();
                            Modifier modifierHeight = Intrinsic3.height(companion3, Intrinsic4.Max);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierHeight);
                            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor4);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5171sizeVpY3zN4(boxScopeInstance.align(companion3, companion.getCenterEnd()), C2002Dp.m7995constructorimpl(100), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)), 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                            String imageUrl = banner.getImageUrl();
                            ImageLoader imageLoader = Coil.imageLoader((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                            ContentScale.Companion companion4 = ContentScale.INSTANCE;
                            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(imageUrl, imageLoader, null, null, companion4.getFillWidth(), 0, null, composer, 24576, 108), (String) null, modifierM5146paddingqDBjuR0$default, (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
                            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).getNova(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0);
                            Modifier modifierM5142padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(boxScopeInstance.align(companion3, companion.getTopEnd()), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(function1) | composer.changed(str);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.StrategiesUpsellBannerKt$StrategiesUpsellBanner$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return StrategiesUpsellBanner.C269981.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3$lambda$2(function1, str);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM6705copywmQWz5c$default, modifierM5142padding3ABfNKs2, Haptics.hapticClick((Function0) objRememberedValue, composer, 0), false, composer, BentoIcon4.Size24.$stable, 32);
                            composer.endNode();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, String str) {
                            function1.invoke(str);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesUpsellBanner$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new RecsForRetirementStrategiesUpsellKey(str, null, 2, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }
}
