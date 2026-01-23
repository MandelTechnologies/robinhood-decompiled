package com.robinhood.android.advisory.onboarding.rxr;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.advisory.onboarding.SystemBarUtils;
import com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import okhttp3.HttpUrl;

/* compiled from: RecsForRetirementStrategiesUpsellScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"LoadedScreen", "", "viewState", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellViewState$Loaded;", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellViewState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecsForRetirementStrategiesUpsellScreen", "duxo", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug", "footerDividerVisible", "", "Lcom/robinhood/android/advisory/onboarding/rxr/RecsForRetirementStrategiesUpsellViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RecsForRetirementStrategiesUpsellScreen6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedScreen$lambda$10(RecsForRetirementStrategiesUpsellViewState.Loaded loaded, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedScreen(loaded, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecsForRetirementStrategiesUpsellScreen$lambda$12(Function0 function0, Modifier modifier, RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo, int i, int i2, Composer composer, int i3) {
        RecsForRetirementStrategiesUpsellScreen(function0, modifier, recsForRetirementStrategiesUpsellDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0304 A[LOOP:0: B:86:0x02fe->B:88:0x0304, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedScreen(final RecsForRetirementStrategiesUpsellViewState.Loaded loaded, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        final Navigator navigator;
        final RecsForRetirementStrategiesUpsellViewModel viewModel;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        String disclosure;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-551743874);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-551743874, i3, -1, "com.robinhood.android.advisory.onboarding.rxr.LoadedScreen (RecsForRetirementStrategiesUpsellScreen.kt:51)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                viewModel = loaded.getViewModel();
                RecsForRetirementStrategiesUpsellViewModel.ValueProps valueProps = viewModel.getValueProps();
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Modifier modifier5 = modifier4;
                BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(HttpUrl.INSTANCE.get(valueProps.getImageUrl()), null, null, ContentScale.INSTANCE.getFillBounds(), 0, null, composerStartRestartGroup, 3072, 54), null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(400), 1, null), null, null, 0.0f, null, composerStartRestartGroup, 432, 120);
                String title = valueProps.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-461510102);
                for (RecsForRetirementStrategiesUpsellViewModel.ValuePropRow valuePropRow : valueProps.getRows()) {
                    BentoValuePropRow3.BentoValuePropRow(valuePropRow.getTitle(), valuePropRow.getSubtitle(), new BentoValuePropRow2.Icon(valuePropRow.getIcon(), null, 2, null), BentoValuePropRow.Center, (Modifier) null, composer3, (BentoValuePropRow2.Icon.$stable << 6) | 3072, 16);
                }
                composer3.endReplaceGroup();
                disclosure = valueProps.getDisclosure();
                composer3.startReplaceGroup(-461495478);
                if (disclosure != null) {
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i6).getTextS(), 0, bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18);
                    composer3 = composer3;
                    BentoMarkdownText2.BentoMarkdownText(disclosure, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composer3, i6).m21592getMediumD9Ej5fM()), markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                    Unit unit = Unit.INSTANCE;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                long jet = bentoTheme3.getColors(composer3, i7).getJet();
                boolean z = !topBarScrollStateRememberTopBarScrollState.getShowDivider();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer2 = composer3;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$63372903$feature_advisory_onboarding_externalDebug(), TopBarScrollState3.scrollableTopBarState(companion4, scrollStateRememberScrollState, topBarScrollStateRememberTopBarScrollState), ComposableLambda3.rememberComposableLambda(-1535541317, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$LoadedScreen$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                        invoke(bentoAppBarScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i8 & 6) == 0) {
                            i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1535541317, i8, -1, "com.robinhood.android.advisory.onboarding.rxr.LoadedScreen.<anonymous>.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:125)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), null, null, z, false, null, Color.m6701boximpl(jet), 0L, null, composer2, 390, 0, 1752);
                composer2.endNode();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme3.getColors(composer2, i7).m21373getBg30d7_KjU(), !LoadedScreen$lambda$2(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance = composer2.changedInstance(viewModel) | composer2.changedInstance(loaded) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecsForRetirementStrategiesUpsellScreen6.LoadedScreen$lambda$9$lambda$8$lambda$7(viewModel, loaded, navigator, context);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion4, bentoTheme3.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                SystemBarUtils.m11057SetStatusBarEffectek8zF_U(bentoTheme3.getColors(composerStartRestartGroup, i7).getJet(), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecsForRetirementStrategiesUpsellScreen6.LoadedScreen$lambda$10(loaded, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            viewModel = loaded.getViewModel();
            RecsForRetirementStrategiesUpsellViewModel.ValueProps valueProps2 = viewModel.getValueProps();
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierWeight$default2 = Column5.weight$default(column62, companion32, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null), scrollStateRememberScrollState2, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        Modifier modifier52 = modifier4;
                        BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(HttpUrl.INSTANCE.get(valueProps2.getImageUrl()), null, null, ContentScale.INSTANCE.getFillBounds(), 0, null, composerStartRestartGroup, 3072, 54), null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(400), 1, null), null, null, 0.0f, null, composerStartRestartGroup, 432, 120);
                        String title2 = valueProps2.getTitle();
                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion32, bentoTheme4.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                        Composer composer32 = composerStartRestartGroup;
                        composer32.startReplaceGroup(-461510102);
                        while (r13.hasNext()) {
                        }
                        composer32.endReplaceGroup();
                        disclosure = valueProps2.getDisclosure();
                        composer32.startReplaceGroup(-461495478);
                        if (disclosure != null) {
                        }
                        composer32.endReplaceGroup();
                        composer32.endNode();
                        BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                        int i72 = BentoTheme.$stable;
                        long jet2 = bentoTheme32.getColors(composer32, i72).getJet();
                        boolean z2 = !topBarScrollStateRememberTopBarScrollState2.getShowDivider();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        composer2 = composer32;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$63372903$feature_advisory_onboarding_externalDebug(), TopBarScrollState3.scrollableTopBarState(companion42, scrollStateRememberScrollState2, topBarScrollStateRememberTopBarScrollState2), ComposableLambda3.rememberComposableLambda(-1535541317, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$LoadedScreen$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1535541317, i8, -1, "com.robinhood.android.advisory.onboarding.rxr.LoadedScreen.<anonymous>.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:125)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer32, 54), null, null, z2, false, null, Color.m6701boximpl(jet2), 0L, null, composer2, 390, 0, 1752);
                        composer2.endNode();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme32.getColors(composer2, i72).m21373getBg30d7_KjU(), !LoadedScreen$lambda$2(snapshotState42) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
                        composer2.startReplaceGroup(-1224400529);
                        zChangedInstance = composer2.changedInstance(viewModel) | composer2.changedInstance(loaded) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecsForRetirementStrategiesUpsellScreen6.LoadedScreen$lambda$9$lambda$8$lambda$7(viewModel, loaded, navigator, context);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion42, bentoTheme32.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.endNode();
                            SystemBarUtils.m11057SetStatusBarEffectek8zF_U(bentoTheme32.getColors(composerStartRestartGroup, i72).getJet(), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean LoadedScreen$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecsForRetirementStrategiesUpsellViewState RecsForRetirementStrategiesUpsellScreen$lambda$11(SnapshotState4<? extends RecsForRetirementStrategiesUpsellViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedScreen$lambda$9$lambda$8$lambda$7(RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel, RecsForRetirementStrategiesUpsellViewState.Loaded loaded, Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new AdvisoryOnboardingKey(loaded.getBrokerageAccountType(), new AdvisoryOnboardingKey.EntryPoint.RxRSunset(recsForRetirementStrategiesUpsellViewModel.getAccountNumber(), recsForRetirementStrategiesUpsellViewModel.getIntro().getTitle(), recsForRetirementStrategiesUpsellViewModel.getIntro().getSubtitle(), recsForRetirementStrategiesUpsellViewModel.getIntro().getDisclosure()), loaded.getSource()), false, false, false, null, true, null, true, false, null, null, 3772, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecsForRetirementStrategiesUpsellScreen(final Function0<Unit> onBackClicked, final Modifier modifier, final RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1657978102);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changedInstance(recsForRetirementStrategiesUpsellDuxo)) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RecsForRetirementStrategiesUpsellDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$RecsForRetirementStrategiesUpsellScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$RecsForRetirementStrategiesUpsellScreen$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    recsForRetirementStrategiesUpsellDuxo = (RecsForRetirementStrategiesUpsellDuxo) baseDuxo;
                    i3 &= -897;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1657978102, i3, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen (RecsForRetirementStrategiesUpsellScreen.kt:180)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(recsForRetirementStrategiesUpsellDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-127151615, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i5) {
                        if ((i5 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-127151615, i5, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:184)");
                        }
                        RecsForRetirementStrategiesUpsellViewState recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 = RecsForRetirementStrategiesUpsellScreen6.RecsForRetirementStrategiesUpsellScreen$lambda$11(snapshotState4CollectAsStateWithLifecycle);
                        if (recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 instanceof RecsForRetirementStrategiesUpsellViewState.Error) {
                            composer5.startReplaceGroup(187525227);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer5, i6).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer5, i6).m21425getFg0d7_KjU();
                            Modifier modifier2 = modifier;
                            final Function0<Unit> function0 = onBackClicked;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2079755581, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i7) {
                                    if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2079755581, i7, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:191)");
                                    }
                                    Function2<Composer, Integer, Unit> lambda$1915601898$feature_advisory_onboarding_externalDebug = RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$1915601898$feature_advisory_onboarding_externalDebug();
                                    final Function0<Unit> function02 = function0;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1915601898$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(1158305342, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer7, Integer num) {
                                            invoke(bentoAppBarScope, composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer7, int i8) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i8 & 6) == 0) {
                                                i8 |= (i8 & 8) == 0 ? composer7.changed(BentoAppBar) : composer7.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i8 & 19) == 18 && composer7.getSkipping()) {
                                                composer7.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1158305342, i8, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:194)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer7, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer6, 54), null, null, false, false, null, null, 0L, null, composer6, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54);
                            final RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo2 = recsForRetirementStrategiesUpsellDuxo;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-572621624, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                    invoke(paddingValues, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer6, int i7) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i7 & 6) == 0) {
                                        i7 |= composer6.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-572621624, i7, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:201)");
                                    }
                                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo3 = recsForRetirementStrategiesUpsellDuxo2;
                                    composer6.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer6.changedInstance(recsForRetirementStrategiesUpsellDuxo3);
                                    Object objRememberedValue2 = composer6.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new RecsForRetirementStrategiesUpsellScreen8(recsForRetirementStrategiesUpsellDuxo3);
                                        composer6.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer6.endReplaceGroup();
                                    ErrorScreenComposable.ErrorScreenComposable(modifierPadding, (Function0) ((KFunction) objRememberedValue2), 0, null, null, null, null, false, composer6, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), composer5, 805306416, 316);
                            composer5.endReplaceGroup();
                        } else if (recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 instanceof RecsForRetirementStrategiesUpsellViewState.Loaded) {
                            composer5.startReplaceGroup(188390623);
                            RecsForRetirementStrategiesUpsellScreen6.LoadedScreen((RecsForRetirementStrategiesUpsellViewState.Loaded) recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11, onBackClicked, modifier, composer5, 0, 0);
                            composer5.endReplaceGroup();
                        } else {
                            if (!(recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 instanceof RecsForRetirementStrategiesUpsellViewState.Loading)) {
                                composer5.startReplaceGroup(-1933615266);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer5.startReplaceGroup(188674645);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composer5, i7).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer5, i7).m21425getFg0d7_KjU();
                            Modifier modifier3 = modifier;
                            final Function0<Unit> function02 = onBackClicked;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-866118523, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i8) {
                                    if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-866118523, i8, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:222)");
                                    }
                                    Function2<Composer, Integer, Unit> lambda$295982066$feature_advisory_onboarding_externalDebug = RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$295982066$feature_advisory_onboarding_externalDebug();
                                    final Function0<Unit> function03 = function02;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$295982066$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1616535226, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.3.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer7, Integer num) {
                                            invoke(bentoAppBarScope, composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer7, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i9 & 6) == 0) {
                                                i9 |= (i9 & 8) == 0 ? composer7.changed(BentoAppBar) : composer7.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i9 & 19) == 18 && composer7.getSkipping()) {
                                                composer7.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1616535226, i9, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:225)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer7, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer6, 54), null, null, false, false, null, null, 0L, null, composer6, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$1409961296$feature_advisory_onboarding_externalDebug(), composer5, 805306416, 316);
                            composer5.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            composer2 = composerStartRestartGroup;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Composer composer42 = composer2;
            final SnapshotState4<? extends RecsForRetirementStrategiesUpsellViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(recsForRetirementStrategiesUpsellDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
            composer3 = composer42;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-127151615, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i5) {
                    if ((i5 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-127151615, i5, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:184)");
                    }
                    RecsForRetirementStrategiesUpsellViewState recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 = RecsForRetirementStrategiesUpsellScreen6.RecsForRetirementStrategiesUpsellScreen$lambda$11(snapshotState4CollectAsStateWithLifecycle2);
                    if (recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 instanceof RecsForRetirementStrategiesUpsellViewState.Error) {
                        composer5.startReplaceGroup(187525227);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer5, i6).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer5, i6).m21425getFg0d7_KjU();
                        Modifier modifier2 = modifier;
                        final Function0<Unit> function0 = onBackClicked;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2079755581, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i7) {
                                if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2079755581, i7, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:191)");
                                }
                                Function2<Composer, Integer, Unit> lambda$1915601898$feature_advisory_onboarding_externalDebug = RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$1915601898$feature_advisory_onboarding_externalDebug();
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1915601898$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(1158305342, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer7, Integer num) {
                                        invoke(bentoAppBarScope, composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer7, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i8 & 6) == 0) {
                                            i8 |= (i8 & 8) == 0 ? composer7.changed(BentoAppBar) : composer7.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer7.getSkipping()) {
                                            composer7.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1158305342, i8, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:194)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer7, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer6, 54), null, null, false, false, null, null, 0L, null, composer6, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54);
                        final RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo2 = recsForRetirementStrategiesUpsellDuxo;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-572621624, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                invoke(paddingValues, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer6, int i7) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i7 & 6) == 0) {
                                    i7 |= composer6.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-572621624, i7, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:201)");
                                }
                                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo3 = recsForRetirementStrategiesUpsellDuxo2;
                                composer6.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer6.changedInstance(recsForRetirementStrategiesUpsellDuxo3);
                                Object objRememberedValue2 = composer6.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new RecsForRetirementStrategiesUpsellScreen8(recsForRetirementStrategiesUpsellDuxo3);
                                    composer6.updateRememberedValue(objRememberedValue2);
                                }
                                composer6.endReplaceGroup();
                                ErrorScreenComposable.ErrorScreenComposable(modifierPadding, (Function0) ((KFunction) objRememberedValue2), 0, null, null, null, null, false, composer6, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), composer5, 805306416, 316);
                        composer5.endReplaceGroup();
                    } else if (recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 instanceof RecsForRetirementStrategiesUpsellViewState.Loaded) {
                        composer5.startReplaceGroup(188390623);
                        RecsForRetirementStrategiesUpsellScreen6.LoadedScreen((RecsForRetirementStrategiesUpsellViewState.Loaded) recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11, onBackClicked, modifier, composer5, 0, 0);
                        composer5.endReplaceGroup();
                    } else {
                        if (!(recsForRetirementStrategiesUpsellViewStateRecsForRetirementStrategiesUpsellScreen$lambda$11 instanceof RecsForRetirementStrategiesUpsellViewState.Loading)) {
                            composer5.startReplaceGroup(-1933615266);
                            composer5.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer5.startReplaceGroup(188674645);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composer5, i7).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer5, i7).m21425getFg0d7_KjU();
                        Modifier modifier3 = modifier;
                        final Function0<Unit> function02 = onBackClicked;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-866118523, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-866118523, i8, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:222)");
                                }
                                Function2<Composer, Integer, Unit> lambda$295982066$feature_advisory_onboarding_externalDebug = RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$295982066$feature_advisory_onboarding_externalDebug();
                                final Function0<Unit> function03 = function02;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$295982066$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1616535226, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt.RecsForRetirementStrategiesUpsellScreen.1.3.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer7, Integer num) {
                                        invoke(bentoAppBarScope, composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer7, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer7.changed(BentoAppBar) : composer7.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer7.getSkipping()) {
                                            composer7.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1616535226, i9, -1, "com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreen.<anonymous>.<anonymous>.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:225)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer7, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer6, 54), null, null, false, false, null, null, 0L, null, composer6, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, RecsForRetirementStrategiesUpsellScreen.INSTANCE.getLambda$1409961296$feature_advisory_onboarding_externalDebug(), composer5, 805306416, 316);
                        composer5.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        final Modifier modifier2 = modifier;
        final RecsForRetirementStrategiesUpsellDuxo recsForRetirementStrategiesUpsellDuxo2 = recsForRetirementStrategiesUpsellDuxo;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.rxr.RecsForRetirementStrategiesUpsellScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsForRetirementStrategiesUpsellScreen6.RecsForRetirementStrategiesUpsellScreen$lambda$12(onBackClicked, modifier2, recsForRetirementStrategiesUpsellDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
