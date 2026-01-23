package com.robinhood.android.equities.companyfinancials.onboarding;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.companyfinancials.C14608R;
import com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSection;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CompanyFinancialsOnboardingSection.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CompanyFinancialsOnboardingSection", "", "onBackPressed", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CompanyFinancialsOnboardingPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-company-financials_externalDebug", "onboardingLottie", "Lcom/airbnb/lottie/LottieComposition;", "onboardingLottieAspectRatio", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsOnboardingSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsOnboardingPreview$lambda$5(int i, Composer composer, int i2) {
        CompanyFinancialsOnboardingPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsOnboardingSection$lambda$4(Function0 function0, int i, Composer composer, int i2) {
        CompanyFinancialsOnboardingSection(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CompanyFinancialsOnboardingSection(final Function0<Unit> onBackPressed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1291598019);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291598019, i2, -1, "com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSection (CompanyFinancialsOnboardingSection.kt:55)");
            }
            final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.COMPANY_FINANCIALS_ONBOARDING.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(CompanyFinancialsOnboardingSection.CompanyFinancialsOnboardingSection$lambda$2$lambda$1(lottieCompositionResultRememberLottieComposition));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Integer num = LottieProperty.COLOR;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null), ComposableLambda3.rememberComposableLambda(1753209337, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt.CompanyFinancialsOnboardingSection.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1753209337, i4, -1, "com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSection.<anonymous> (CompanyFinancialsOnboardingSection.kt:84)");
                    }
                    Function2<Composer, Integer, Unit> function2M13522getLambda$172793108$lib_company_financials_externalDebug = CompanyFinancialsOnboardingSection2.INSTANCE.m13522getLambda$172793108$lib_company_financials_externalDebug();
                    final Function0<Unit> function0 = onBackPressed;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M13522getLambda$172793108$lib_company_financials_externalDebug, null, ComposableLambda3.rememberComposableLambda(1314521880, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt.CompanyFinancialsOnboardingSection.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num2) {
                            invoke(bentoAppBarScope, composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1314521880, i5, -1, "com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSection.<anonymous>.<anonymous> (CompanyFinancialsOnboardingSection.kt:88)");
                            }
                            IconButton5.IconButton(function0, null, false, null, null, CompanyFinancialsOnboardingSection2.INSTANCE.getLambda$1900460059$lib_company_financials_externalDebug(), composer3, 196608, 30);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, true, false, null, null, 0L, null, composer2, 196998, 0, 2010);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(677110222, true, new C146172(LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(num, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU())), new String[]{"**"}, composerStartRestartGroup, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.STROKE_COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU())), new String[]{"**"}, composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable), lottieCompositionResultRememberLottieComposition, snapshotState4, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompanyFinancialsOnboardingSection.CompanyFinancialsOnboardingSection$lambda$4(onBackPressed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CompanyFinancialsOnboardingSection$lambda$2$lambda$1(LottieCompositionResult lottieCompositionResult) {
        LottieComposition lottieCompositionCompanyFinancialsOnboardingSection$lambda$0 = CompanyFinancialsOnboardingSection$lambda$0(lottieCompositionResult);
        if ((lottieCompositionCompanyFinancialsOnboardingSection$lambda$0 != null ? lottieCompositionCompanyFinancialsOnboardingSection$lambda$0.getBounds() : null) == null) {
            return 1.0f;
        }
        return r1.width() / r1.height();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition CompanyFinancialsOnboardingSection$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CompanyFinancialsOnboardingSection$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* compiled from: CompanyFinancialsOnboardingSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt$CompanyFinancialsOnboardingSection$2 */
    static final class C146172 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ LottieDynamicProperties $dynamicProperties;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ LottieCompositionResult $onboardingLottie$delegate;
        final /* synthetic */ SnapshotState4<Float> $onboardingLottieAspectRatio$delegate;

        C146172(LottieDynamicProperties lottieDynamicProperties, LottieCompositionResult lottieCompositionResult, SnapshotState4<Float> snapshotState4, Navigator navigator, Context context) {
            this.$dynamicProperties = lottieDynamicProperties;
            this.$onboardingLottie$delegate = lottieCompositionResult;
            this.$onboardingLottieAspectRatio$delegate = snapshotState4;
            this.$navigator = navigator;
            this.$context = context;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(677110222, i2, -1, "com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSection.<anonymous> (CompanyFinancialsOnboardingSection.kt:103)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            LottieDynamicProperties lottieDynamicProperties = this.$dynamicProperties;
            LottieCompositionResult lottieCompositionResult = this.$onboardingLottie$delegate;
            SnapshotState4<Float> snapshotState4 = this.$onboardingLottieAspectRatio$delegate;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.5f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxHeight);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LottieAnimation2.LottieAnimation(CompanyFinancialsOnboardingSection.CompanyFinancialsOnboardingSection$lambda$0(lottieCompositionResult), AspectRatio3.aspectRatio$default(companion, CompanyFinancialsOnboardingSection.CompanyFinancialsOnboardingSection$lambda$3(snapshotState4), false, 2, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, lottieDynamicProperties, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer, 1572864, (LottieDynamicProperties.$stable << 9) | 196608, 0, 2056124);
            composer.endNode();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            String strStringResource = StringResources_androidKt.stringResource(C14608R.string.onboarding_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle bookCoverCapsuleSmall = bentoTheme.getTypography(composer, i3).getBookCoverCapsuleSmall();
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14608R.string.onboarding_details, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.m5176widthInVpY3zN4$default(companion, 0.0f, C2002Dp.m7995constructorimpl(600), 1, null), C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM()), 0.0f, composer, 6, 2), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8120);
            Spacer2.Spacer(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), composer, 0);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM());
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            String strStringResource2 = StringResources_androidKt.stringResource(C14608R.string.onboarding_button, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt$CompanyFinancialsOnboardingSection$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CompanyFinancialsOnboardingSection.C146172.invoke$lambda$4$lambda$3$lambda$2$lambda$1(navigator, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierM5143paddingVpY3zN4, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, false, null, composer, 0, 0, 8056);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Navigator navigator, Context context) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchSelector(SearchSelectorLaunchMode.CompanyFinancials.INSTANCE, new Screen(Screen.Name.COMPANY_FINANCIALS_ONBOARDING_SEARCH, null, null, null, 14, null), null, 4, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return Unit.INSTANCE;
        }
    }

    private static final void CompanyFinancialsOnboardingPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-576753008);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-576753008, i, -1, "com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingPreview (CompanyFinancialsOnboardingSection.kt:186)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CompanyFinancialsOnboardingSection2.INSTANCE.getLambda$450096200$lib_company_financials_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.CompanyFinancialsOnboardingSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompanyFinancialsOnboardingSection.CompanyFinancialsOnboardingPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
