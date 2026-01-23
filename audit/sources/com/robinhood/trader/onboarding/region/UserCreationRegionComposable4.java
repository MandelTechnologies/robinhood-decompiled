package com.robinhood.trader.onboarding.region;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoFlagIcon;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.DropdownMimicButton4;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.trader.onboarding.C41676R;
import com.robinhood.trader.onboarding.region.UserCreationRegionComposable4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UserCreationRegionComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001aW\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"UserCreationRegionComposable", "", "currentRegion", "Lcom/robinhood/iso/countrycode/CountryCode;", "isLoading", "", "onBackButtonClicked", "Lkotlin/Function0;", "onRegionDropdownClicked", "Lkotlin/Function1;", "onUserRegionConfirmed", "(Lcom/robinhood/iso/countrycode/CountryCode;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "REGION_DROP_DOWN_TEST_TAG", "", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UserCreationRegionComposable4 {
    public static final String REGION_DROP_DOWN_TEST_TAG = "regionDropDown";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationRegionComposable$lambda$0(CountryCode countryCode, boolean z, Function0 function0, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        UserCreationRegionComposable(countryCode, z, function0, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UserCreationRegionComposable(final CountryCode countryCode, final boolean z, final Function0<Unit> onBackButtonClicked, final Function1<? super CountryCode, Unit> onRegionDropdownClicked, final Function1<? super CountryCode, Unit> onUserRegionConfirmed, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onBackButtonClicked, "onBackButtonClicked");
        Intrinsics.checkNotNullParameter(onRegionDropdownClicked, "onRegionDropdownClicked");
        Intrinsics.checkNotNullParameter(onUserRegionConfirmed, "onUserRegionConfirmed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1897149077);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(countryCode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackButtonClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRegionDropdownClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUserRegionConfirmed) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897149077, i2, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionComposable (UserCreationRegionComposable.kt:36)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), ComposableLambda3.rememberComposableLambda(-157494183, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt.UserCreationRegionComposable.1
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
                        ComposerKt.traceEventStart(-157494183, i3, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionComposable.<anonymous> (UserCreationRegionComposable.kt:41)");
                    }
                    UserCreationRegionComposable userCreationRegionComposable = UserCreationRegionComposable.INSTANCE;
                    Function2<Composer, Integer, Unit> function2M26527getLambda$190979066$feature_onboarding_externalDebug = userCreationRegionComposable.m26527getLambda$190979066$feature_onboarding_externalDebug();
                    final Function0<Unit> function0 = onBackButtonClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M26527getLambda$190979066$feature_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(1274477146, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt.UserCreationRegionComposable.1.1
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
                                ComposerKt.traceEventStart(1274477146, i4, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionComposable.<anonymous>.<anonymous> (UserCreationRegionComposable.kt:50)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i4 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, userCreationRegionComposable.getLambda$1197698251$feature_onboarding_externalDebug(), false, false, null, null, 0L, null, composer3, 24966, 0, 2026);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(421271962, true, new C416972(countryCode, onUserRegionConfirmed, z), composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(2111128292, true, new C416983(onRegionDropdownClicked, countryCode), composerStartRestartGroup, 54), composer2, 805306800, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserCreationRegionComposable4.UserCreationRegionComposable$lambda$0(countryCode, z, onBackButtonClicked, onRegionDropdownClicked, onUserRegionConfirmed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UserCreationRegionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt$UserCreationRegionComposable$2 */
    static final class C416972 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CountryCode $currentRegion;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ Function1<CountryCode, Unit> $onUserRegionConfirmed;

        /* JADX WARN: Multi-variable type inference failed */
        C416972(CountryCode countryCode, Function1<? super CountryCode, Unit> function1, boolean z) {
            this.$currentRegion = countryCode;
            this.$onUserRegionConfirmed = function1;
            this.$isLoading = z;
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
                ComposerKt.traceEventStart(421271962, i, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionComposable.<anonymous> (UserCreationRegionComposable.kt:62)");
            }
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            boolean z = this.$currentRegion != null;
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$currentRegion) | composer.changed(this.$onUserRegionConfirmed);
            final CountryCode countryCode = this.$currentRegion;
            final Function1<CountryCode, Unit> function1 = this.$onUserRegionConfirmed;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt$UserCreationRegionComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRegionComposable4.C416972.invoke$lambda$2$lambda$1(countryCode, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, z, this.$isLoading, null, null, null, null, false, null, composer, 0, 0, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CountryCode countryCode, Function1 function1) {
            if (countryCode != null) {
                function1.invoke(countryCode);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UserCreationRegionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt$UserCreationRegionComposable$3 */
    static final class C416983 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CountryCode $currentRegion;
        final /* synthetic */ Function1<CountryCode, Unit> $onRegionDropdownClicked;

        /* JADX WARN: Multi-variable type inference failed */
        C416983(Function1<? super CountryCode, Unit> function1, CountryCode countryCode) {
            this.$onRegionDropdownClicked = function1;
            this.$currentRegion = countryCode;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
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
                ComposerKt.traceEventStart(2111128292, i2, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionComposable.<anonymous> (UserCreationRegionComposable.kt:71)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            final Function1<CountryCode, Unit> function1 = this.$onRegionDropdownClicked;
            final CountryCode countryCode = this.$currentRegion;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C41676R.string.user_creation_region_title, composer, 0);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41676R.string.user_creation_region_subtitle, composer, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            composer.endNode();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(countryCode);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt$UserCreationRegionComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRegionComposable4.C416983.invoke$lambda$3$lambda$2$lambda$1(function1, countryCode);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            DropdownMimicButton4.DropdownMimicButton((Function0) objRememberedValue, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(boxScopeInstance.align(TestTag3.testTag(companion, UserCreationRegionComposable4.REGION_DROP_DOWN_TEST_TAG), companion2.getCenter()), 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(-980539009, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionComposableKt$UserCreationRegionComposable$3$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-980539009, i4, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionComposable.<anonymous>.<anonymous>.<anonymous> (UserCreationRegionComposable.kt:96)");
                    }
                    if (countryCode == null) {
                        composer2.startReplaceGroup(-1164983608);
                        String strStringResource2 = StringResources_androidKt.stringResource(C41676R.string.user_creation_region_placeholder, composer2, 0);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strStringResource2, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getTextL(), composer2, 0, 0, 8186);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1164689387);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composer2, i6).m21593getSmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        CountryCode countryCode2 = countryCode;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion5);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoFlagIcon.BentoFlagIcon(countryCode2.getIso3166CountryCode(), null, composer2, 0, 2);
                        BentoText2.m20747BentoText38GnDrw(CountryCode.getDisplayCountry$default(countryCode2, null, 1, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i6).getTextL(), composer2, 0, 0, 8190);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 384, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, CountryCode countryCode) {
            function1.invoke(countryCode);
            return Unit.INSTANCE;
        }
    }
}
