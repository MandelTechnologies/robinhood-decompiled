package com.robinhood.android.fundingmethods;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.fundingmethods.RetirementFundingMethodsViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.models.retirement.api.ApiRetirementFundingMethodsResponse;
import com.robinhood.android.models.retirement.api.RetirementFundingMethod;
import com.robinhood.android.models.retirement.api.RetirementFundingMethodBadge;
import com.robinhood.android.models.retirement.api.RetirementFundingMethodSection;
import com.robinhood.android.models.retirement.api.RetirementMatchInfoTag;
import com.robinhood.android.retirement.lib.MatchPill;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementFundingMethodsScreen.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\r\u001a'\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"LoadingTag", "", "RetirementFundingMethodsScreen", "", "viewState", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState;", "callbacks", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsScreenCallbacks;", "(Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState;Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsScreenCallbacks;Landroidx/compose/runtime/Composer;I)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "fundingMethodsResponse", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFundingMethodsResponse;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementFundingMethodsResponse;Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsScreenCallbacks;Landroidx/compose/runtime/Composer;I)V", "FundingMethodSection", "section", "Lcom/robinhood/android/models/retirement/api/RetirementFundingMethodSection;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/retirement/api/RetirementFundingMethodSection;Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FundingMethod", "method", "Lcom/robinhood/android/models/retirement/api/RetirementFundingMethod;", "(Lcom/robinhood/android/models/retirement/api/RetirementFundingMethod;Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsScreenCallbacks;Landroidx/compose/runtime/Composer;I)V", "Badge", "badge", "Lcom/robinhood/android/models/retirement/api/RetirementFundingMethodBadge;", "(Lcom/robinhood/android/models/retirement/api/RetirementFundingMethodBadge;Landroidx/compose/runtime/Composer;I)V", "feature-retirement-funding-methods_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RetirementFundingMethodsScreen4 {
    public static final String LoadingTag = "loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Badge$lambda$20(RetirementFundingMethodBadge retirementFundingMethodBadge, int i, Composer composer, int i2) {
        Badge(retirementFundingMethodBadge, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundingMethod$lambda$17(RetirementFundingMethod retirementFundingMethod, RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, int i, Composer composer, int i2) {
        FundingMethod(retirementFundingMethod, retirementFundingMethodsScreen3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundingMethodSection$lambda$9(RetirementFundingMethodSection retirementFundingMethodSection, RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FundingMethodSection(retirementFundingMethodSection, retirementFundingMethodsScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$1(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementFundingMethodsScreen$lambda$0(RetirementFundingMethodsViewState retirementFundingMethodsViewState, RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, int i, Composer composer, int i2) {
        RetirementFundingMethodsScreen(retirementFundingMethodsViewState, retirementFundingMethodsScreen3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementFundingMethodsScreen$lambda$5(ApiRetirementFundingMethodsResponse apiRetirementFundingMethodsResponse, RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, int i, Composer composer, int i2) {
        RetirementFundingMethodsScreen(apiRetirementFundingMethodsResponse, retirementFundingMethodsScreen3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RetirementFundingMethodsScreen(final RetirementFundingMethodsViewState viewState, final RetirementFundingMethodsScreen3 callbacks, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1671884823);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671884823, i2, -1, "com.robinhood.android.fundingmethods.RetirementFundingMethodsScreen (RetirementFundingMethodsScreen.kt:48)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-240392524, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt.RetirementFundingMethodsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-240392524, i3, -1, "com.robinhood.android.fundingmethods.RetirementFundingMethodsScreen.<anonymous> (RetirementFundingMethodsScreen.kt:50)");
                    }
                    RetirementFundingMethodsViewState retirementFundingMethodsViewState = viewState;
                    if (retirementFundingMethodsViewState instanceof RetirementFundingMethodsViewState.Loading) {
                        composer2.startReplaceGroup(911021277);
                        RetirementFundingMethodsScreen4.Loading(composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(retirementFundingMethodsViewState instanceof RetirementFundingMethodsViewState.Content)) {
                            composer2.startReplaceGroup(911019095);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1823035285);
                        RetirementFundingMethodsScreen4.RetirementFundingMethodsScreen(((RetirementFundingMethodsViewState.Content) viewState).getFundingMethods(), callbacks, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementFundingMethodsScreen4.RetirementFundingMethodsScreen$lambda$0(viewState, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1198273899);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1198273899, i, -1, "com.robinhood.android.fundingmethods.Loading (RetirementFundingMethodsScreen.kt:64)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, "loading"), null, RetirementFundingMethodsScreen.INSTANCE.m2020x7d58e00b(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementFundingMethodsScreen4.Loading$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RetirementFundingMethodsScreen(final ApiRetirementFundingMethodsResponse apiRetirementFundingMethodsResponse, final RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(693680926);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(apiRetirementFundingMethodsResponse) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(retirementFundingMethodsScreen3) : composerStartRestartGroup.changedInstance(retirementFundingMethodsScreen3) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693680926, i2, -1, "com.robinhood.android.fundingmethods.RetirementFundingMethodsScreen (RetirementFundingMethodsScreen.kt:83)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
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
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ImmutableList<UIComponent<GenericAction>> header = apiRetirementFundingMethodsResponse.getHeader();
            int i3 = -1772220517;
            composerStartRestartGroup.startReplaceGroup(-1772220517);
            int i4 = 0;
            SduiColumns.SduiColumn(header, GenericAction.class, companion, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composerStartRestartGroup, 100663296, 0);
            Composer composer3 = composerStartRestartGroup;
            composer3.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer3, 0);
            composer3.startReplaceGroup(-1704830477);
            int i5 = 0;
            for (Object obj : apiRetirementFundingMethodsResponse.getSections()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Composer composer4 = composer3;
                int i7 = i3;
                int i8 = i2;
                int i9 = i4;
                FundingMethodSection((RetirementFundingMethodSection) obj, retirementFundingMethodsScreen3, null, composer4, i2 & 112, 4);
                composer4.startReplaceGroup(-1704824601);
                if (i5 != CollectionsKt.getLastIndex(apiRetirementFundingMethodsResponse.getSections())) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), composer4, i9);
                }
                composer4.endReplaceGroup();
                composer3 = composer4;
                i5 = i6;
                i3 = i7;
                i2 = i8;
                i4 = i9;
            }
            int i10 = i3;
            Composer composer5 = composer3;
            composer5.endReplaceGroup();
            composer5.endNode();
            ImmutableList<UIComponent<GenericAction>> footer = apiRetirementFundingMethodsResponse.getFooter();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
            composer5.startReplaceGroup(i10);
            composer2 = composer5;
            SduiColumns.SduiColumn(footer, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RetirementFundingMethodsScreen4.RetirementFundingMethodsScreen$lambda$5(apiRetirementFundingMethodsResponse, retirementFundingMethodsScreen3, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f A[LOOP:0: B:81:0x0209->B:83:0x020f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FundingMethodSection(final RetirementFundingMethodSection retirementFundingMethodSection, final RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, Modifier modifier, Composer composer, final int i, final int i2) {
        RetirementFundingMethodSection retirementFundingMethodSection2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String title;
        Modifier modifier3;
        int i4;
        Iterator<T> it;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1757265081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            retirementFundingMethodSection2 = retirementFundingMethodSection;
        } else if ((i & 6) == 0) {
            retirementFundingMethodSection2 = retirementFundingMethodSection;
            i3 = (composerStartRestartGroup.changedInstance(retirementFundingMethodSection2) ? 4 : 2) | i;
        } else {
            retirementFundingMethodSection2 = retirementFundingMethodSection;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(retirementFundingMethodsScreen3) : composerStartRestartGroup.changedInstance(retirementFundingMethodsScreen3) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            } else {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1757265081, i3, -1, "com.robinhood.android.fundingmethods.FundingMethodSection (RetirementFundingMethodsScreen.kt:118)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i6 = i3;
                title = retirementFundingMethodSection2.getTitle();
                RetirementMatchInfoTag title_info_tag = retirementFundingMethodSection2.getTitle_info_tag();
                composerStartRestartGroup.startReplaceGroup(2007805135);
                if (title == null) {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getTop(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    modifier3 = modifier5;
                    i4 = i6;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1314297240);
                    if (title_info_tag != null) {
                        MatchPill.MatchPill(title_info_tag.getTitle(), title_info_tag.getType(), null, composerStartRestartGroup, 0, 4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                } else {
                    modifier3 = modifier5;
                    i4 = i6;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2007826763);
                it = retirementFundingMethodSection.getFunding_methods().iterator();
                while (it.hasNext()) {
                    FundingMethod((RetirementFundingMethod) it.next(), retirementFundingMethodsScreen3, composerStartRestartGroup, i4 & 112);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementFundingMethodsScreen4.FundingMethodSection$lambda$9(retirementFundingMethodSection, retirementFundingMethodsScreen3, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion3.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                int i62 = i3;
                title = retirementFundingMethodSection2.getTitle();
                RetirementMatchInfoTag title_info_tag2 = retirementFundingMethodSection2.getTitle_info_tag();
                composerStartRestartGroup.startReplaceGroup(2007805135);
                if (title == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2007826763);
                it = retirementFundingMethodSection.getFunding_methods().iterator();
                while (it.hasNext()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void FundingMethod(final RetirementFundingMethod retirementFundingMethod, final RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        Object obj;
        int i3;
        float f;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(674611706);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(retirementFundingMethod) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(retirementFundingMethodsScreen3) : composerStartRestartGroup.changedInstance(retirementFundingMethodsScreen3) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674611706, i2, -1, "com.robinhood.android.fundingmethods.FundingMethod (RetirementFundingMethodsScreen.kt:157)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(retirementFundingMethodsScreen3))) | composerStartRestartGroup.changedInstance(retirementFundingMethod);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RetirementFundingMethodsScreen4.FundingMethod$lambda$11$lambda$10(retirementFundingMethodsScreen3, retirementFundingMethod);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, retirementFundingMethod.getLogging_identifier(), null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierAutoLogEvents$default, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon4 bentoIcon = SduiIcon2.toBentoIcon(retirementFundingMethod.getIcon());
            composerStartRestartGroup.startReplaceGroup(-1371657655);
            if (bentoIcon == null) {
                bentoTheme = bentoTheme2;
                i3 = i4;
                f = 0.0f;
                obj = null;
            } else {
                bentoTheme = bentoTheme2;
                obj = null;
                i3 = i4;
                f = 0.0f;
                BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, bentoTheme2.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), f, 2, obj);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default3);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Composer composer3 = composerStartRestartGroup;
            int i5 = i3;
            BentoText2.m20747BentoText38GnDrw(retirementFundingMethod.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
            String subtitle = retirementFundingMethod.getSubtitle();
            TextStyle textS = bentoTheme.getTypography(composer3, i5).getTextS();
            if (retirementFundingMethod.is_subtitle_match_text()) {
                composer3.startReplaceGroup(-894709038);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i5).m21456getPositive0d7_KjU();
            } else {
                composer3.startReplaceGroup(-894708020);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU();
            }
            composer3.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, retirementFundingMethod.is_subtitle_match_text() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8170);
            RetirementFundingMethodBadge badge = retirementFundingMethod.getBadge();
            composer3.startReplaceGroup(-894702853);
            if (badge != null) {
                Badge(badge, composer3, 0);
                Unit unit2 = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            composer3.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i5).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 5);
            composer2 = composer3;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RetirementFundingMethodsScreen4.FundingMethod$lambda$17(retirementFundingMethod, retirementFundingMethodsScreen3, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundingMethod$lambda$11$lambda$10(RetirementFundingMethodsScreen3 retirementFundingMethodsScreen3, RetirementFundingMethod retirementFundingMethod) {
        retirementFundingMethodsScreen3.onFundingMethodSelected(retirementFundingMethod);
        return Unit.INSTANCE;
    }

    private static final void Badge(final RetirementFundingMethodBadge retirementFundingMethodBadge, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224724610);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(retirementFundingMethodBadge) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224724610, i2, -1, "com.robinhood.android.fundingmethods.Badge (RetirementFundingMethodsScreen.kt:213)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon4 bentoIcon = SduiIcon2.toBentoIcon(retirementFundingMethodBadge.getIcon());
            composerStartRestartGroup.startReplaceGroup(1043788801);
            if (bentoIcon != null) {
                Color composeColor = SduiColors2.toComposeColor(retirementFundingMethodBadge.getColor(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1043792790);
                long jM21425getFg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, jM21425getFg0d7_KjU, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, 48 | BentoIcon4.$stable, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            String title = retirementFundingMethodBadge.getTitle();
            Color composeColor2 = SduiColors2.toComposeColor(retirementFundingMethodBadge.getColor(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1043800054);
            long jM21425getFg0d7_KjU2 = composeColor2 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor2.getValue();
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8170);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.fundingmethods.RetirementFundingMethodsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementFundingMethodsScreen4.Badge$lambda$20(retirementFundingMethodBadge, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
