package com.robinhood.android.advisor.marketplace.onboarding;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreen;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardNotEnrolledBottomSheet;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarketplaceOnboardingNotEnrolledScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"RoundedBottomSheetTopPadding", "Landroidx/compose/ui/unit/Dp;", "F", "MarketplaceOnboardingNotEnrolledScreen", "", "state", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$NotEnrolled;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState$NotEnrolled;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CenteredDisclaimerText", InstantRetirementAgreementComponents.MarkdownTag, "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisor-marketplace-onboarding_externalDebug", "showingBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MarketplaceOnboardingNotEnrolledScreen {
    private static final float RoundedBottomSheetTopPadding = C2002Dp.m7995constructorimpl(32);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenteredDisclaimerText$lambda$9(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CenteredDisclaimerText(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketplaceOnboardingNotEnrolledScreen$lambda$7(AdvisorDashboardState.NotEnrolled notEnrolled, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarketplaceOnboardingNotEnrolledScreen(notEnrolled, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketplaceOnboardingNotEnrolledScreen(AdvisorDashboardState.NotEnrolled state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        final SheetState sheetStateRememberModalBottomSheetState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final AdvisorDashboardState.NotEnrolled notEnrolled;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2011419213);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2011419213, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreen (MarketplaceOnboardingNotEnrolledScreen.kt:44)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen$lambda$6$lambda$5(coroutineScope, sheetStateRememberModalBottomSheetState, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                notEnrolled = state;
                modifier3 = modifier4;
                AdvisorMarketplaceOnboardingComponents.BackHandlingScaffold(modifier3, null, ComposableLambda3.rememberComposableLambda(1479863737, true, new C85701(state, snapshotState, navigator, context, (Function0) objRememberedValue3, sheetStateRememberModalBottomSheetState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                notEnrolled = state;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen$lambda$7(notEnrolled, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(snapshotState);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen$lambda$6$lambda$5(coroutineScope, sheetStateRememberModalBottomSheetState, snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                notEnrolled = state;
                modifier3 = modifier4;
                AdvisorMarketplaceOnboardingComponents.BackHandlingScaffold(modifier3, null, ComposableLambda3.rememberComposableLambda(1479863737, true, new C85701(state, snapshotState, navigator2, context2, (Function0) objRememberedValue3, sheetStateRememberModalBottomSheetState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MarketplaceOnboardingNotEnrolledScreen$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarketplaceOnboardingNotEnrolledScreen$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketplaceOnboardingNotEnrolledScreen$lambda$6$lambda$5(CoroutineScope coroutineScope, SheetState sheetState, final SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketplaceOnboardingNotEnrolledScreen2(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketplaceOnboardingNotEnrolledScreen.m1725xfee1f5fe(snapshotState, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MarketplaceOnboardingNotEnrolledScreen$lambda$6$lambda$5$lambda$4 */
    public static final Unit m1725xfee1f5fe(SnapshotState snapshotState, Throwable th) {
        MarketplaceOnboardingNotEnrolledScreen$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: MarketplaceOnboardingNotEnrolledScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$MarketplaceOnboardingNotEnrolledScreen$1 */
    static final class C85701 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SheetState $bottomSheetState;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function0<Unit> $dismissCallback;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState<Boolean> $showingBottomSheet$delegate;
        final /* synthetic */ AdvisorDashboardState.NotEnrolled $state;

        C85701(AdvisorDashboardState.NotEnrolled notEnrolled, SnapshotState<Boolean> snapshotState, Navigator navigator, Context context, Function0<Unit> function0, SheetState sheetState) {
            this.$state = notEnrolled;
            this.$showingBottomSheet$delegate = snapshotState;
            this.$navigator = navigator;
            this.$context = context;
            this.$dismissCallback = function0;
            this.$bottomSheetState = sheetState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen$lambda$3(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Navigator navigator, Context context, AdvisorDashboardState.NotEnrolled notEnrolled) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(notEnrolled.getLoadingScreen().getDeeplink()), null, null, false, null, 60, null);
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
                ComposerKt.traceEventStart(1479863737, i2, -1, "com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreen.<anonymous> (MarketplaceOnboardingNotEnrolledScreen.kt:64)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final AdvisorDashboardState.NotEnrolled notEnrolled = this.$state;
            final SnapshotState<Boolean> snapshotState = this.$showingBottomSheet$delegate;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Spacer2.Spacer(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), composer, 0);
            String title = notEnrolled.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle displayMartinaLarge = bentoTheme.getTypography(composer, i3).getDisplayMartinaLarge();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayMartinaLarge, composer, 0, 0, 8124);
            String description = notEnrolled.getDescription();
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion3.m7919getCentere0LSkKk(), 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 29);
            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$MarketplaceOnboardingNotEnrolledScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketplaceOnboardingNotEnrolledScreen.C85701.invoke$lambda$4$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(description, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 8);
            MarketplaceOnboardingNotEnrolledScreen.CenteredDisclaimerText(notEnrolled.getFooter(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
            String ctaTitle = notEnrolled.getCtaTitle();
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(notEnrolled);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$MarketplaceOnboardingNotEnrolledScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarketplaceOnboardingNotEnrolledScreen.C85701.invoke$lambda$4$lambda$3$lambda$2(navigator, context, notEnrolled);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, ctaTitle, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen$lambda$2(this.$showingBottomSheet$delegate)) {
                final Function0<Unit> function0 = this.$dismissCallback;
                final SheetState sheetState = this.$bottomSheetState;
                final AdvisorDashboardState.NotEnrolled notEnrolled2 = this.$state;
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1683422578, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt.MarketplaceOnboardingNotEnrolledScreen.1.2
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
                            ComposerKt.traceEventStart(1683422578, i4, -1, "com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreen.<anonymous>.<anonymous> (MarketplaceOnboardingNotEnrolledScreen.kt:118)");
                        }
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                        final Function0<Unit> function02 = function0;
                        SheetState sheetState2 = sheetState;
                        final AdvisorDashboardState.NotEnrolled notEnrolled3 = notEnrolled2;
                        ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function02, null, sheetState2, 0.0f, null, jM21371getBg0d7_KjU, 0L, 0.0f, 0L, null, null, null, ComposableLambda3.rememberComposableLambda(623475215, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt.MarketplaceOnboardingNotEnrolledScreen.1.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                invoke(column5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i5) {
                                Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                                if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(623475215, i5, -1, "com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreen.<anonymous>.<anonymous>.<anonymous> (MarketplaceOnboardingNotEnrolledScreen.kt:124)");
                                }
                                String title2 = notEnrolled3.getBottomSheet().getTitle();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                TextStyle displayCapsuleSmall = bentoTheme2.getTypography(composer3, i6).getDisplayCapsuleSmall();
                                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                BentoText2.m20747BentoText38GnDrw(title2, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Modifier.INSTANCE, MarketplaceOnboardingNotEnrolledScreen.RoundedBottomSheetTopPadding, bentoTheme2.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM()), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer3, 0, 0, 8124);
                                composer3.startReplaceGroup(-2135723675);
                                for (AdvisorDashboardNotEnrolledBottomSheet.ValueProp valueProp : notEnrolled3.getBottomSheet().getValueProps()) {
                                    BentoValuePropRow3.BentoValuePropRow(valueProp.getPrimaryText(), valueProp.getSecondaryText(), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null), BentoValuePropRow.Top, (Modifier) null, composer3, (BentoValuePropRow2.Icon.$stable << 6) | 3072, 16);
                                }
                                composer3.endReplaceGroup();
                                String disclaimer = notEnrolled3.getBottomSheet().getDisclaimer();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                MarketplaceOnboardingNotEnrolledScreen.CenteredDisclaimerText(disclaimer, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, bentoTheme3.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                                BentoButtonKt.m20586BentoButtonEikTQX8(function02, notEnrolled3.getBottomSheet().getDismissTitle(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion4, bentoTheme3.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, 384, 3546);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarketplaceOnboardingNotEnrolledScreen$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CenteredDisclaimerText(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1740047872);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1740047872, i3, -1, "com.robinhood.android.advisor.marketplace.onboarding.CenteredDisclaimerText (MarketplaceOnboardingNotEnrolledScreen.kt:172)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier3;
                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, (i3 & 14) | (MarkdownStyle.$stable << 6), 26);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNotEnrolledScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarketplaceOnboardingNotEnrolledScreen.CenteredDisclaimerText$lambda$9(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                Modifier modifier42 = modifier3;
                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, bentoMarkdownText2.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, (i3 & 14) | (MarkdownStyle.$stable << 6), 26);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
