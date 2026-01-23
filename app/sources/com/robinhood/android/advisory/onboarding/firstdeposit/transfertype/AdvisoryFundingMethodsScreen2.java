package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen2;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen6;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.contribution.FundingTypeSelectionViewModel;
import com.robinhood.models.advisory.api.contribution.PromoViewModel;
import com.robinhood.models.advisory.api.contribution.SelectionComponent;
import com.robinhood.models.advisory.api.contribution.SelectionSectionViewModel;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryFundingMethodsScreen.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001aM\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u001a\u001a7\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, m3636d2 = {"FundingMethodsLoadingTestTag", "", "FundingMethodsSelectionScreen", "", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "callbacks", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadedAdvisoryFundingMethodsScreen", "state", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState$Loaded;", "source", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onPromoContinueClicked", "Lkotlin/Function0;", "currentPage", "", "(Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState$Loaded;Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/jvm/functions/Function0;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdvisoryFundingMethodsScreen", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;", "(Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryFundingMethodsScreen2 {
    public static final String FundingMethodsLoadingTestTag = "funding_methods_loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFundingMethodsScreen$lambda$22(AdvisoryFundingMethodsViewState advisoryFundingMethodsViewState, String str, BrokerageAccountType brokerageAccountType, AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryFundingMethodsScreen(advisoryFundingMethodsViewState, str, brokerageAccountType, advisoryFundingMethodsScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundingMethodsSelectionScreen$lambda$10(ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, Screen screen, Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FundingMethodsSelectionScreen(apiAdvisoryFirstTimeContributionViewModel, advisoryFundingMethodsScreen, screen, context, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$11(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$12(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$13(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$14(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedAdvisoryFundingMethodsScreen$lambda$17(AdvisoryFundingMethodsViewState.Loaded loaded, AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, String str, BrokerageAccountType brokerageAccountType, Function0 function0, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        LoadedAdvisoryFundingMethodsScreen(loaded, advisoryFundingMethodsScreen, str, brokerageAccountType, function0, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AdvisoryFundingMethodsScreen$lambda$20(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundingMethodsSelectionScreen(final ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, final AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, final Screen screen, final Context context, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Screen screen2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        AnnotatedString annotatedString;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1178179486);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiAdvisoryFirstTimeContributionViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(advisoryFundingMethodsScreen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                screen2 = screen;
                i3 |= composerStartRestartGroup.changedInstance(screen2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(context) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1178179486, i3, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.FundingMethodsSelectionScreen (AdvisoryFundingMethodsScreen.kt:77)");
                        }
                        FundingTypeSelectionViewModel selection_view_model = apiAdvisoryFirstTimeContributionViewModel.getSelection_view_model();
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                        ImmutableList immutableList = extensions2.toImmutableList(selection_view_model.getHeader());
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        Modifier modifier5 = modifier4;
                        int i5 = i3;
                        SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 0, 0);
                        Composer composer3 = composerStartRestartGroup;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(15796143);
                        for (SelectionSectionViewModel selectionSectionViewModel : selection_view_model.getSections()) {
                            String title = selectionSectionViewModel.getTitle();
                            FontWeight bold = FontWeight.INSTANCE.getBold();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Composer composer4 = composer3;
                            BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion3, bentoTheme.getSpacing(composer3, i6).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM()), null, null, bold, null, null, 0, false, 0, 0, null, 0, null, composer4, 24576, 0, 16364);
                            composer3 = composer4;
                            composer3.startReplaceGroup(15807479);
                            for (final SelectionComponent selectionComponent : selectionSectionViewModel.getComponents()) {
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, screen2, null, context, new Component(Component.ComponentType.ROW, selectionComponent.getComponent().getIdentifier(), null, 4, null), null, 37, null)), true, false, false, true, false, null, 108, null);
                                ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(selectionComponent.getIcon());
                                BentoBaseRowState.Start.Icon icon = bentoAsset != null ? new BentoBaseRowState.Start.Icon(bentoAsset, null, null, 6, null) : null;
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                builder.append(selectionComponent.getComponent().getLabel());
                                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                                String promotional_secondary_text = selectionComponent.getPromotional_secondary_text();
                                composer3.startReplaceGroup(15844194);
                                if (promotional_secondary_text == null) {
                                    annotatedString = null;
                                } else {
                                    composer3.startReplaceGroup(-1853051551);
                                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                                    int iPushStyle = builder2.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                                    try {
                                        builder2.append(promotional_secondary_text);
                                        Unit unit = Unit.INSTANCE;
                                        builder2.pop(iPushStyle);
                                        AnnotatedString annotatedString3 = builder2.toAnnotatedString();
                                        composer3.endReplaceGroup();
                                        annotatedString = annotatedString3;
                                    } catch (Throwable th) {
                                        builder2.pop(iPushStyle);
                                        throw th;
                                    }
                                }
                                composer3.endReplaceGroup();
                                boolean zIs_enabled = selectionComponent.is_enabled();
                                composer3.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = ((i5 & 112) == 32) | composer3.changedInstance(selectionComponent) | composer3.changedInstance(apiAdvisoryFirstTimeContributionViewModel);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryFundingMethodsScreen2.m1732x91d9371b(advisoryFundingMethodsScreen, selectionComponent, apiAdvisoryFirstTimeContributionViewModel);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                Composer composer5 = composer3;
                                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierAutoLogEvents$default, icon, annotatedString2, annotatedString, null, null, null, false, false, false, zIs_enabled, false, 0L, (Function0) objRememberedValue, composer5, BentoBaseRowState.Start.Icon.$stable << 3, 0, 7152);
                                screen2 = screen;
                                composer3 = composer5;
                            }
                            composer3.endReplaceGroup();
                            screen2 = screen;
                        }
                        composer3.endReplaceGroup();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer3, 0);
                        ImmutableList immutableList2 = extensions2.toImmutableList(selection_view_model.getFooter());
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        composer3.startReplaceGroup(-1772220517);
                        composer2 = composer3;
                        SduiColumns.SduiColumn(immutableList2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AdvisoryFundingMethodsScreen2.FundingMethodsSelectionScreen$lambda$10(apiAdvisoryFirstTimeContributionViewModel, advisoryFundingMethodsScreen, screen, context, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    FundingTypeSelectionViewModel selection_view_model2 = apiAdvisoryFirstTimeContributionViewModel.getSelection_view_model();
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        ImmutableList immutableList3 = extensions2.toImmutableList(selection_view_model2.getHeader());
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        Modifier modifier52 = modifier4;
                        int i52 = i3;
                        SduiColumns.SduiColumn(immutableList3, GenericAction.class, modifierM5146paddingqDBjuR0$default2, null, null, HorizontalPadding.Default, arrangement2.getTop(), companion5.getStart(), false, composerStartRestartGroup, 0, 0);
                        Composer composer32 = composerStartRestartGroup;
                        composer32.endReplaceGroup();
                        composer32.startReplaceGroup(15796143);
                        while (r30.hasNext()) {
                        }
                        composer32.endReplaceGroup();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composer32, 0);
                        ImmutableList immutableList22 = extensions2.toImmutableList(selection_view_model2.getFooter());
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer32, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        composer32.startReplaceGroup(-1772220517);
                        composer2 = composer32;
                        SduiColumns.SduiColumn(immutableList22, GenericAction.class, modifierM5144paddingVpY3zN4$default2, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        screen2 = screen;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryFundingMethodsScreen$lambda$21(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FundingMethodsSelectionScreen$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final Unit m1732x91d9371b(AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, SelectionComponent selectionComponent, ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel) {
        advisoryFundingMethodsScreen.onSelection(selectionComponent.getSelection_type(), apiAdvisoryFirstTimeContributionViewModel, selectionComponent.getComponent().getIdentifier(), selectionComponent.getSource_transfer_account_info());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedAdvisoryFundingMethodsScreen(AdvisoryFundingMethodsViewState.Loaded loaded, final AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, final String str, final BrokerageAccountType brokerageAccountType, final Function0<Unit> function0, int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        AdvisoryFundingMethodsViewState.Loaded loaded2;
        int i4;
        final AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen2;
        String str2;
        final Function0<Unit> function02;
        final int i5;
        int i6;
        Modifier modifier2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1215190075);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            loaded2 = loaded;
        } else if ((i2 & 6) == 0) {
            loaded2 = loaded;
            i4 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i2;
        } else {
            loaded2 = loaded;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            advisoryFundingMethodsScreen2 = advisoryFundingMethodsScreen;
        } else {
            advisoryFundingMethodsScreen2 = advisoryFundingMethodsScreen;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(advisoryFundingMethodsScreen2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                str2 = str;
                i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else {
                if ((i2 & 196608) == 0) {
                    i5 = i;
                    i4 |= composerStartRestartGroup.changed(i5) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 == 0) {
                    if ((1572864 & i2) == 0) {
                        modifier2 = modifier;
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    if ((599187 & i4) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1215190075, i4, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.LoadedAdvisoryFundingMethodsScreen (AdvisoryFundingMethodsScreen.kt:183)");
                        }
                        final Screen screen = new Screen(Screen.Name.ADVISORY_ONBOARDING_FUNDING_METHODS, null, null, null, 14, null);
                        PromoViewModel promo_view_model = loaded2.getViewModel().getPromo_view_model();
                        final List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new AdvisoryFundingMethodsScreen6[]{promo_view_model == null ? new AdvisoryFundingMethodsScreen6.Promo(promo_view_model) : null, new AdvisoryFundingMethodsScreen6.Selection(loaded2.getViewModel())});
                        String str3 = null;
                        Object[] objArr = 0 == true ? 1 : 0;
                        Object[] objArr2 = 0 == true ? 1 : 0;
                        Object[] objArr3 = 0 == true ? 1 : 0;
                        Object[] objArr4 = 0 == true ? 1 : 0;
                        final Context context = new Context(0, 0, 0, str3, null, null, objArr2, objArr3, 0, objArr4, str2, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, str3, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                        Integer numValueOf = Integer.valueOf(i5);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15((AnimatedContentTransitionScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = i4 >> 15;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier5 = modifier4;
                        AnimatedContentKt.AnimatedContent(numValueOf, modifier5, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(1297644721, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt.LoadedAdvisoryFundingMethodsScreen.2
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer3, Integer num2) {
                                invoke(animatedContentScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedContentScope AnimatedContent, int i8, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1297644721, i9, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.LoadedAdvisoryFundingMethodsScreen.<anonymous> (AdvisoryFundingMethodsScreen.kt:207)");
                                }
                                AdvisoryFundingMethodsScreen6 advisoryFundingMethodsScreen6 = listListOfNotNull.get(i8);
                                if (advisoryFundingMethodsScreen6 instanceof AdvisoryFundingMethodsScreen6.Promo) {
                                    composer3.startReplaceGroup(-866615582);
                                    PromoScreen.PromoScreen(((AdvisoryFundingMethodsScreen6.Promo) advisoryFundingMethodsScreen6).getViewModel(), function02, ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ONBOARDING_FEES_PROMO, null, null, null, 14, null), null, context, null, null, 53, null)), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(advisoryFundingMethodsScreen6 instanceof AdvisoryFundingMethodsScreen6.Selection)) {
                                        composer3.startReplaceGroup(1496063011);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(-866043353);
                                    AdvisoryFundingMethodsScreen2.FundingMethodsSelectionScreen(((AdvisoryFundingMethodsScreen6.Selection) advisoryFundingMethodsScreen6).getViewModel(), advisoryFundingMethodsScreen2, screen, context, ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, null, context, null, null, 53, null)), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (i7 & 14) | 1573248 | (i7 & 112), 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final AdvisoryFundingMethodsViewState.Loaded loaded3 = loaded2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen$lambda$17(loaded3, advisoryFundingMethodsScreen, str, brokerageAccountType, function0, i5, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                modifier2 = modifier;
                if ((599187 & i4) == 599186) {
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Screen screen2 = new Screen(Screen.Name.ADVISORY_ONBOARDING_FUNDING_METHODS, null, null, null, 14, null);
                    PromoViewModel promo_view_model2 = loaded2.getViewModel().getPromo_view_model();
                    final List<? extends AdvisoryFundingMethodsScreen6> listListOfNotNull2 = CollectionsKt.listOfNotNull((Object[]) new AdvisoryFundingMethodsScreen6[]{promo_view_model2 == null ? new AdvisoryFundingMethodsScreen6.Promo(promo_view_model2) : null, new AdvisoryFundingMethodsScreen6.Selection(loaded2.getViewModel())});
                    String str32 = null;
                    Object[] objArr5 = 0 == true ? 1 : 0;
                    Object[] objArr22 = 0 == true ? 1 : 0;
                    Object[] objArr32 = 0 == true ? 1 : 0;
                    Object[] objArr42 = 0 == true ? 1 : 0;
                    final Context context2 = new Context(0, 0, 0, str32, null, null, objArr22, objArr32, 0, objArr42, str2, objArr5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, str32, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                    Integer numValueOf2 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i72 = i4 >> 15;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    AnimatedContentKt.AnimatedContent(numValueOf2, modifier52, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(1297644721, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt.LoadedAdvisoryFundingMethodsScreen.2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer3, Integer num2) {
                            invoke(animatedContentScope, num.intValue(), composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, int i8, Composer composer3, int i9) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1297644721, i9, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.LoadedAdvisoryFundingMethodsScreen.<anonymous> (AdvisoryFundingMethodsScreen.kt:207)");
                            }
                            AdvisoryFundingMethodsScreen6 advisoryFundingMethodsScreen6 = listListOfNotNull2.get(i8);
                            if (advisoryFundingMethodsScreen6 instanceof AdvisoryFundingMethodsScreen6.Promo) {
                                composer3.startReplaceGroup(-866615582);
                                PromoScreen.PromoScreen(((AdvisoryFundingMethodsScreen6.Promo) advisoryFundingMethodsScreen6).getViewModel(), function02, ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ONBOARDING_FEES_PROMO, null, null, null, 14, null), null, context2, null, null, 53, null)), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(advisoryFundingMethodsScreen6 instanceof AdvisoryFundingMethodsScreen6.Selection)) {
                                    composer3.startReplaceGroup(1496063011);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-866043353);
                                AdvisoryFundingMethodsScreen2.FundingMethodsSelectionScreen(((AdvisoryFundingMethodsScreen6.Selection) advisoryFundingMethodsScreen6).getViewModel(), advisoryFundingMethodsScreen2, screen2, context2, ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen2, null, context2, null, null, 53, null)), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, (i72 & 14) | 1573248 | (i72 & 112), 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i5 = i;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i4) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i4) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$11(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$12(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$13(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen$lambda$16$lambda$15$lambda$14(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryFundingMethodsScreen(final AdvisoryFundingMethodsViewState state, final String source, final BrokerageAccountType brokerageAccountType, final AdvisoryFundingMethodsScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1502689972);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(source) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1502689972, i4, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen (AdvisoryFundingMethodsScreen.kt:246)");
                }
                Object[] objArr = {state};
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$19$lambda$18();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(133381904, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt.AdvisoryFundingMethodsScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(133381904, i7, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen.<anonymous> (AdvisoryFundingMethodsScreen.kt:254)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AdvisoryFundingMethodsScreen4.INSTANCE.getLambda$704474301$feature_advisory_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(2089466641, true, new AnonymousClass1(snapshotIntState2, callbacks), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AdvisoryFundingMethodsScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$AdvisoryFundingMethodsScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ AdvisoryFundingMethodsScreen $callbacks;
                        final /* synthetic */ SnapshotIntState2 $currentPage$delegate;

                        AnonymousClass1(SnapshotIntState2 snapshotIntState2, AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen) {
                            this.$currentPage$delegate = snapshotIntState2;
                            this.$callbacks = advisoryFundingMethodsScreen;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2089466641, i, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen.<anonymous>.<anonymous> (AdvisoryFundingMethodsScreen.kt:257)");
                            }
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$currentPage$delegate) | composer.changed(this.$callbacks);
                            final AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen = this.$callbacks;
                            final SnapshotIntState2 snapshotIntState2 = this.$currentPage$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$AdvisoryFundingMethodsScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisoryFundingMethodsScreen2.C88581.AnonymousClass1.invoke$lambda$1$lambda$0(advisoryFundingMethodsScreen, snapshotIntState2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, SnapshotIntState2 snapshotIntState2) {
                            if (AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$20(snapshotIntState2) > 0) {
                                AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$21(snapshotIntState2, AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$20(snapshotIntState2) - 1);
                            } else {
                                advisoryFundingMethodsScreen.onBackClicked();
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1677811611, true, new C88592(state, callbacks, source, brokerageAccountType, snapshotIntState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 12) & 14) | 805306416, 316);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$22(state, source, brokerageAccountType, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = {state};
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(133381904, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt.AdvisoryFundingMethodsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(133381904, i7, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen.<anonymous> (AdvisoryFundingMethodsScreen.kt:254)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(AdvisoryFundingMethodsScreen4.INSTANCE.getLambda$704474301$feature_advisory_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(2089466641, true, new AnonymousClass1(snapshotIntState22, callbacks), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AdvisoryFundingMethodsScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$AdvisoryFundingMethodsScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ AdvisoryFundingMethodsScreen $callbacks;
                    final /* synthetic */ SnapshotIntState2 $currentPage$delegate;

                    AnonymousClass1(SnapshotIntState2 snapshotIntState2, AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen) {
                        this.$currentPage$delegate = snapshotIntState2;
                        this.$callbacks = advisoryFundingMethodsScreen;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2089466641, i, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen.<anonymous>.<anonymous> (AdvisoryFundingMethodsScreen.kt:257)");
                        }
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(this.$currentPage$delegate) | composer.changed(this.$callbacks);
                        final AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen = this.$callbacks;
                        final SnapshotIntState2 snapshotIntState2 = this.$currentPage$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$AdvisoryFundingMethodsScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryFundingMethodsScreen2.C88581.AnonymousClass1.invoke$lambda$1$lambda$0(advisoryFundingMethodsScreen, snapshotIntState2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, SnapshotIntState2 snapshotIntState2) {
                        if (AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$20(snapshotIntState2) > 0) {
                            AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$21(snapshotIntState2, AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$20(snapshotIntState2) - 1);
                        } else {
                            advisoryFundingMethodsScreen.onBackClicked();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(1677811611, true, new C88592(state, callbacks, source, brokerageAccountType, snapshotIntState22), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 12) & 14) | 805306416, 316);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 AdvisoryFundingMethodsScreen$lambda$19$lambda$18() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* compiled from: AdvisoryFundingMethodsScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$AdvisoryFundingMethodsScreen$2 */
    static final class C88592 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ BrokerageAccountType $brokerageAccountType;
        final /* synthetic */ AdvisoryFundingMethodsScreen $callbacks;
        final /* synthetic */ SnapshotIntState2 $currentPage$delegate;
        final /* synthetic */ String $source;
        final /* synthetic */ AdvisoryFundingMethodsViewState $state;

        C88592(AdvisoryFundingMethodsViewState advisoryFundingMethodsViewState, AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen, String str, BrokerageAccountType brokerageAccountType, SnapshotIntState2 snapshotIntState2) {
            this.$state = advisoryFundingMethodsViewState;
            this.$callbacks = advisoryFundingMethodsScreen;
            this.$source = str;
            this.$brokerageAccountType = brokerageAccountType;
            this.$currentPage$delegate = snapshotIntState2;
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
                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1677811611, i2, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreen.<anonymous> (AdvisoryFundingMethodsScreen.kt:270)");
            }
            AdvisoryFundingMethodsViewState advisoryFundingMethodsViewState = this.$state;
            if (Intrinsics.areEqual(advisoryFundingMethodsViewState, AdvisoryFundingMethodsViewState.Error.INSTANCE)) {
                composer.startReplaceGroup(-1143587074);
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen = this.$callbacks;
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(advisoryFundingMethodsScreen);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AdvisoryFundingMethodsScreen3(advisoryFundingMethodsScreen);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(modifierPadding, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer.endReplaceGroup();
            } else if (advisoryFundingMethodsViewState instanceof AdvisoryFundingMethodsViewState.Loaded) {
                composer.startReplaceGroup(-1143320412);
                Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                AdvisoryFundingMethodsViewState.Loaded loaded = (AdvisoryFundingMethodsViewState.Loaded) this.$state;
                int iAdvisoryFundingMethodsScreen$lambda$20 = AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$20(this.$currentPage$delegate);
                AdvisoryFundingMethodsScreen advisoryFundingMethodsScreen2 = this.$callbacks;
                String str = this.$source;
                BrokerageAccountType brokerageAccountType = this.$brokerageAccountType;
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(this.$currentPage$delegate);
                final SnapshotIntState2 snapshotIntState2 = this.$currentPage$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsScreenKt$AdvisoryFundingMethodsScreen$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryFundingMethodsScreen2.C88592.invoke$lambda$2$lambda$1(snapshotIntState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                AdvisoryFundingMethodsScreen2.LoadedAdvisoryFundingMethodsScreen(loaded, advisoryFundingMethodsScreen2, str, brokerageAccountType, (Function0) objRememberedValue2, iAdvisoryFundingMethodsScreen$lambda$20, modifierPadding2, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(advisoryFundingMethodsViewState, AdvisoryFundingMethodsViewState.Loading.INSTANCE)) {
                    composer.startReplaceGroup(1764224223);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1142790095);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), AdvisoryFundingMethodsScreen2.FundingMethodsLoadingTestTag), true, false, 3, composer, 3120, 4);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SnapshotIntState2 snapshotIntState2) {
            AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$21(snapshotIntState2, AdvisoryFundingMethodsScreen2.AdvisoryFundingMethodsScreen$lambda$20(snapshotIntState2) + 1);
            return Unit.INSTANCE;
        }
    }
}
