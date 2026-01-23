package com.robinhood.android.investorprofile.p162ui.profile;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiScreen3;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.bonfire.investmentprofilesettings.QuestionType;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileAnswers2;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestmentProfileSettingsBonfireIdentiScreen.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0014\u001ad\u0010\u0015\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001aa\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\bH\u0003¢\u0006\u0002\u0010!\u001a\u0015\u0010\"\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\u001a\u001d\u0010%\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010(\u001a\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010)\u001a9\u0010*\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010 \u001a\u00020\bH\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\bH\u0003¢\u0006\u0002\u0010-\u001a\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001bH\u0002\u001a\u0015\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\bH\u0003¢\u0006\u0002\u0010-\u001a\r\u00103\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00104\u001a\u0015\u00105\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u00106\u001a\u001d\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020/H\u0003¢\u0006\u0002\u0010:¨\u0006;²\u0006\n\u0010<\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\bX\u008a\u0084\u0002"}, m3636d2 = {"InvestmentProfileSettingsBonfireIdentiScreen", "", "state", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;", "handleQuestionItemSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;", "showButtonBar", "", "rowsClickable", "fromMarginUpgrade", "onConfirmInvestmentProfile", "Lkotlin/Function0;", "onInvestmentProfileReviewed", "onEditInvestmentProfile", "onAccountSelectionDropdownClicked", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lkotlin/ParameterName;", "name", WebsocketGatewayConstants.DATA_KEY, "(Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;Lkotlin/jvm/functions/Function1;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MainContent", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "(ZZLandroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "InvestmentProfileSettingsRow", "investmentProfileItem", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "position", "", "selectedAccountType", "Lcom/robinhood/utils/resource/StringResource;", "isLoading", "(Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;ZLkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lcom/robinhood/utils/resource/StringResource;ZLandroidx/compose/runtime/Composer;II)V", "ScreenHeaderItem", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ScreenHeaderItem;", "(Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ScreenHeaderItem;Landroidx/compose/runtime/Composer;I)V", "ListHeaderItem", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ListHeaderItem;", "(ILcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ListHeaderItem;Landroidx/compose/runtime/Composer;I)V", "AccountSwitcherItem", "(Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "QuestionSummaryItem", "(Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;ZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "AccountMessageItem", "(ZLandroidx/compose/runtime/Composer;I)V", "getContentType", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Loading", "inMarginOnboardingViewOnly", "LoadingScreenHeaderItem", "(Landroidx/compose/runtime/Composer;I)V", "LoadingListHeaderItem", "(ILandroidx/compose/runtime/Composer;I)V", "LoadingQuestionSummaryItem", "title", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-investor-profile_externalDebug", "hasScrolledToEnd", "canScrollForward"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentProfileSettingsBonfireIdentiScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountMessageItem$lambda$27(boolean z, int i, Composer composer, int i2) {
        AccountMessageItem(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSwitcherItem$lambda$25(StringResource stringResource, Function0 function0, int i, Composer composer, int i2) {
        AccountSwitcherItem(stringResource, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentProfileSettingsBonfireIdentiScreen$lambda$7(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Function1 function1, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function1 function12, int i, Composer composer, int i2) {
        InvestmentProfileSettingsBonfireIdentiScreen(investmentProfileSettingsBonfireIdentiViewState, function1, z, z2, z3, function0, function02, function03, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentProfileSettingsRow$lambda$18(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem investmentProfileItem, boolean z, Function1 function1, int i, Function0 function0, StringResource stringResource, boolean z2, int i2, int i3, Composer composer, int i4) {
        InvestmentProfileSettingsRow(investmentProfileItem, z, function1, i, function0, stringResource, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListHeaderItem$lambda$23(int i, InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ListHeaderItem listHeaderItem, int i2, Composer composer, int i3) {
        ListHeaderItem(i, listHeaderItem, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$28(boolean z, int i, Composer composer, int i2) {
        Loading(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingListHeaderItem$lambda$30(int i, int i2, Composer composer, int i3) {
        LoadingListHeaderItem(i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingQuestionSummaryItem$lambda$33(String str, String str2, int i, Composer composer, int i2) {
        LoadingQuestionSummaryItem(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingScreenHeaderItem$lambda$29(int i, Composer composer, int i2) {
        LoadingScreenHeaderItem(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$15(boolean z, boolean z2, LazyListState lazyListState, InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        MainContent(z, z2, lazyListState, investmentProfileSettingsBonfireIdentiViewState, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionSummaryItem$lambda$26(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem, boolean z, Function1 function1, boolean z2, int i, Composer composer, int i2) {
        QuestionSummaryItem(questionSummaryItem, z, function1, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenHeaderItem$lambda$22(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem screenHeaderItem, int i, Composer composer, int i2) {
        ScreenHeaderItem(screenHeaderItem, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InvestmentProfileSettingsBonfireIdentiScreen(final InvestmentProfileSettingsBonfireIdentiViewState state, final Function1<? super InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> handleQuestionItemSelected, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onConfirmInvestmentProfile, final Function0<Unit> onInvestmentProfileReviewed, final Function0<Unit> onEditInvestmentProfile, final Function1<? super AccountSwitcherData, Unit> onAccountSelectionDropdownClicked, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(handleQuestionItemSelected, "handleQuestionItemSelected");
        Intrinsics.checkNotNullParameter(onConfirmInvestmentProfile, "onConfirmInvestmentProfile");
        Intrinsics.checkNotNullParameter(onInvestmentProfileReviewed, "onInvestmentProfileReviewed");
        Intrinsics.checkNotNullParameter(onEditInvestmentProfile, "onEditInvestmentProfile");
        Intrinsics.checkNotNullParameter(onAccountSelectionDropdownClicked, "onAccountSelectionDropdownClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(144863391);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(handleQuestionItemSelected) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConfirmInvestmentProfile) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInvestmentProfileReviewed) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEditInvestmentProfile) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAccountSelectionDropdownClicked) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144863391, i2, -1, "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreen (InvestmentProfileSettingsBonfireIdentiScreen.kt:64)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(lazyListStateRememberLazyListState.getCanScrollForward());
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            boolean z4 = state.getInvestmentProfileSettingsResponse() != null;
            final boolean z5 = z4;
            composer2 = composerStartRestartGroup;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-2022375734, true, new C197311(state, z, onConfirmInvestmentProfile, z4, userInteractionEventDescriptor, coroutineScope, lazyListStateRememberLazyListState, onInvestmentProfileReviewed, onEditInvestmentProfile, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1947077815, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt.InvestmentProfileSettingsBonfireIdentiScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                    invoke(boxScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1947077815, i3, -1, "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreen.<anonymous> (InvestmentProfileSettingsBonfireIdentiScreen.kt:75)");
                    }
                    if (z5) {
                        composer3.startReplaceGroup(1861909925);
                        InvestmentProfileSettingsBonfireIdentiScreen3.MainContent(z3, z2, lazyListStateRememberLazyListState, state, handleQuestionItemSelected, onAccountSelectionDropdownClicked, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1862325883);
                        InvestmentProfileSettingsBonfireIdentiScreen3.Loading(z3 && !z2, composer3, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 3456, 3);
            Boolean boolValueOf = Boolean.valueOf(InvestmentProfileSettingsBonfireIdentiScreen$lambda$5(snapshotState4));
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            composer2.startReplaceGroup(-1746271574);
            boolean zChanged = composer2.changed(lazyListStateRememberLazyListState) | composer2.changed(z5);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InvestmentProfileSettingsBonfireIdentiScreen5(lazyListStateRememberLazyListState, z5, snapshotState, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue4, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsBonfireIdentiScreen$lambda$7(state, handleQuestionItemSelected, z, z2, z3, onConfirmInvestmentProfile, onInvestmentProfileReviewed, onEditInvestmentProfile, onAccountSelectionDropdownClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InvestmentProfileSettingsBonfireIdentiScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InvestmentProfileSettingsBonfireIdentiScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean InvestmentProfileSettingsBonfireIdentiScreen$lambda$5(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$InvestmentProfileSettingsBonfireIdentiScreen$1 */
    static final class C197311 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ SnapshotState<Boolean> $hasScrolledToEnd$delegate;
        final /* synthetic */ boolean $investmentProfileLoaded;
        final /* synthetic */ Function0<Unit> $onConfirmInvestmentProfile;
        final /* synthetic */ Function0<Unit> $onEditInvestmentProfile;
        final /* synthetic */ Function0<Unit> $onInvestmentProfileReviewed;
        final /* synthetic */ LazyListState $scrollState;
        final /* synthetic */ boolean $showButtonBar;
        final /* synthetic */ InvestmentProfileSettingsBonfireIdentiViewState $state;

        C197311(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, boolean z, Function0<Unit> function0, boolean z2, UserInteractionEventDescriptor userInteractionEventDescriptor, CoroutineScope coroutineScope, LazyListState lazyListState, Function0<Unit> function02, Function0<Unit> function03, SnapshotState<Boolean> snapshotState) {
            this.$state = investmentProfileSettingsBonfireIdentiViewState;
            this.$showButtonBar = z;
            this.$onConfirmInvestmentProfile = function0;
            this.$investmentProfileLoaded = z2;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$coroutineScope = coroutineScope;
            this.$scrollState = lazyListState;
            this.$onInvestmentProfileReviewed = function02;
            this.$onEditInvestmentProfile = function03;
            this.$hasScrolledToEnd$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(CoroutineScope coroutineScope, Function0 function0, SnapshotState snapshotState, LazyListState lazyListState) {
            if (!InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsBonfireIdentiScreen$lambda$1(snapshotState)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InvestmentProfileSettingsBonfireIdentiScreen4(lazyListState, null), 3, null);
            } else {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2022375734, i, -1, "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreen.<anonymous> (InvestmentProfileSettingsBonfireIdentiScreen.kt:91)");
            }
            if (this.$state.getAmlRefreshNeeded()) {
                composer.startReplaceGroup(2117107314);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState = this.$state;
                Function0<Unit> function0 = this.$onConfirmInvestmentProfile;
                boolean z = this.$investmentProfileLoaded;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
                Column6 column6 = Column6.INSTANCE;
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, z, investmentProfileSettingsBonfireIdentiViewState.isPrimaryButtonLoading(), null, null, null, null, false, null, composer, 384, 0, 8088);
                composer.endNode();
                composer.endReplaceGroup();
            } else if (this.$showButtonBar) {
                composer.startReplaceGroup(2117129781);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState2 = this.$state;
                final CoroutineScope coroutineScope = this.$coroutineScope;
                final LazyListState lazyListState = this.$scrollState;
                final Function0<Unit> function02 = this.$onInvestmentProfileReviewed;
                boolean z2 = this.$investmentProfileLoaded;
                Function0<Unit> function03 = this.$onEditInvestmentProfile;
                final SnapshotState<Boolean> snapshotState = this.$hasScrolledToEnd$delegate;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(!InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsBonfireIdentiScreen$lambda$1(snapshotState) ? Component.ComponentType.REVIEW_BUTTON : Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 47, null)), false, false, false, true, false, null, 110, null);
                String strStringResource = StringResources_androidKt.stringResource(!InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsBonfireIdentiScreen$lambda$1(snapshotState) ? C19641R.string.investment_profile_settings_review : C19641R.string.investment_profile_yes_correct, composer, 0);
                boolean zIsPrimaryButtonLoading = investmentProfileSettingsBonfireIdentiViewState2.isPrimaryButtonLoading();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(lazyListState) | composer.changed(function02);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$InvestmentProfileSettingsBonfireIdentiScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestmentProfileSettingsBonfireIdentiScreen3.C197311.invoke$lambda$3$lambda$2$lambda$1(coroutineScope, function02, snapshotState, lazyListState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, z2, zIsPrimaryButtonLoading, null, null, null, null, false, null, composer, 0, 0, 8088);
                composer.startReplaceGroup(1507261197);
                if (InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsBonfireIdentiScreen$lambda$1(snapshotState)) {
                    BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResources_androidKt.stringResource(C19641R.string.investment_profile_no_edit, composer, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.EDIT_INVESTMENT_PROFILE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1209644184);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent(final boolean z, final boolean z2, final LazyListState lazyListState, final InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, final Function1<? super InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> function1, final Function1<? super AccountSwitcherData, Unit> function12, Composer composer, final int i) {
        int i2;
        LazyListState lazyListState2;
        Modifier modifierM5146paddingqDBjuR0$default;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(218290507);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            lazyListState2 = lazyListState;
            i2 |= composerStartRestartGroup.changed(lazyListState2) ? 256 : 128;
        } else {
            lazyListState2 = lazyListState;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(investmentProfileSettingsBonfireIdentiViewState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(218290507, i2, -1, "com.robinhood.android.investorprofile.ui.profile.MainContent (InvestmentProfileSettingsBonfireIdentiScreen.kt:191)");
            }
            composerStartRestartGroup.startReplaceGroup(-676205532);
            if (z && !z2) {
                modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            } else {
                modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(investmentProfileSettingsBonfireIdentiViewState) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestmentProfileSettingsBonfireIdentiScreen3.MainContent$lambda$14$lambda$13(investmentProfileSettingsBonfireIdentiViewState, z2, function1, function12, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM5146paddingqDBjuR0$default, lazyListState2, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i2 >> 3) & 112, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.MainContent$lambda$15(z, z2, lazyListState, investmentProfileSettingsBonfireIdentiViewState, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$14$lambda$13(final InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, final boolean z, final Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem> userLevelItems = investmentProfileSettingsBonfireIdentiViewState.getUserLevelItems();
        LazyColumn.items(userLevelItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$MainContent$lambda$14$lambda$13$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return InvestmentProfileSettingsBonfireIdentiScreen3.getContentType((InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem) userLevelItems.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$MainContent$lambda$14$lambda$13$$inlined$itemsIndexed$default$3
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
                Object obj = userLevelItems.get(i);
                int i4 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                composer.startReplaceGroup(-1793118215);
                InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsRow((InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem) obj, z, function1, i, null, null, false, composer, (i4 << 6) & 7168, 112);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        final List<InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem> accountLevelItems = investmentProfileSettingsBonfireIdentiViewState.getAccountLevelItems();
        final Function1 function13 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentProfileSettingsBonfireIdentiScreen3.MainContent$lambda$14$lambda$13$lambda$10((InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem) obj);
            }
        };
        LazyColumn.items(accountLevelItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$MainContent$lambda$14$lambda$13$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function13.invoke(accountLevelItems.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$MainContent$lambda$14$lambda$13$$inlined$items$default$3
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem investmentProfileItem = (InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem) accountLevelItems.get(i);
                composer.startReplaceGroup(1353376455);
                boolean z2 = z;
                Function1 function14 = function1;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(investmentProfileSettingsBonfireIdentiViewState) | composer.changed(function12);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState2 = investmentProfileSettingsBonfireIdentiViewState;
                    final Function1 function15 = function12;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$MainContent$1$1$4$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AccountSwitcherData accountSwitcherData = investmentProfileSettingsBonfireIdentiViewState2.getAccountSwitcherData();
                            if (accountSwitcherData != null) {
                                function15.invoke(accountSwitcherData);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsRow(investmentProfileItem, z2, function14, 0, (Function0) objRememberedValue, investmentProfileSettingsBonfireIdentiViewState.getSelectedAccountType(), investmentProfileSettingsBonfireIdentiViewState.isAccountLevelLoading(), composer, StringResource.$stable << 15, 8);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object MainContent$lambda$14$lambda$13$lambda$10(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return getContentType(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098 A[PHI: r12
      0x0098: PHI (r12v13 int) = (r12v0 int), (r12v6 int), (r12v7 int) binds: [B:56:0x0096, B:66:0x00b0, B:65:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentProfileSettingsRow(final InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem investmentProfileItem, final boolean z, final Function1<? super InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> function1, int i, Function0<Unit> function0, StringResource stringResource, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z3;
        Function1<? super InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> function12;
        int i5;
        int i6;
        Function0<Unit> function02;
        int i7;
        int i8;
        boolean z4;
        final int i9;
        final Function0<Unit> function03;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        StringResource stringResource2 = stringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1894805040);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(investmentProfileItem) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                int i11 = 196608;
                if (i7 != 0) {
                    i4 |= i11;
                } else if ((196608 & i2) == 0) {
                    i11 = (262144 & i2) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 131072 : 65536;
                    i4 |= i11;
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                    if ((1572864 & i2) == 0) {
                        z4 = z2;
                        i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                    if ((599187 & i4) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            i5 = 0;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue;
                        }
                        if (i7 != 0) {
                            stringResource2 = null;
                        }
                        boolean z6 = i8 == 0 ? false : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1894805040, i4, -1, "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsRow (InvestmentProfileSettingsBonfireIdentiScreen.kt:248)");
                        }
                        if (!(investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem)) {
                            composerStartRestartGroup.startReplaceGroup(158510766);
                            ScreenHeaderItem((InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem) investmentProfileItem, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ListHeaderItem) {
                            composerStartRestartGroup.startReplaceGroup(158517425);
                            ListHeaderItem(i5, (InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ListHeaderItem) investmentProfileItem, composerStartRestartGroup, (i4 >> 9) & 14);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.AccountSwitcherItem) {
                            composerStartRestartGroup.startReplaceGroup(158525380);
                            AccountSwitcherItem(stringResource2, function02, composerStartRestartGroup, StringResource.$stable | ((i4 >> 15) & 14) | ((i4 >> 9) & 112));
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem) {
                            composerStartRestartGroup.startReplaceGroup(619619194);
                            QuestionSummaryItem((InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem) investmentProfileItem, z3, function12, z6, composerStartRestartGroup, (i4 & 1008) | ((i4 >> 9) & 7168));
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.AccountMessageItem)) {
                                composerStartRestartGroup.startReplaceGroup(158507436);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(158547544);
                            AccountMessageItem(z6, composerStartRestartGroup, (i4 >> 18) & 14);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i9 = i5;
                        function03 = function02;
                        z5 = z6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        i9 = i5;
                        function03 = function02;
                        z5 = z4;
                    }
                    final StringResource stringResource3 = stringResource2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsRow$lambda$18(investmentProfileItem, z, function1, i9, function03, stringResource3, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                z4 = z2;
                if ((599187 & i4) == 599186) {
                    if (i10 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!(investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i9 = i5;
                    function03 = function02;
                    z5 = z6;
                }
                final StringResource stringResource32 = stringResource2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i7 = i3 & 32;
            int i112 = 196608;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            z4 = z2;
            if ((599187 & i4) == 599186) {
            }
            final StringResource stringResource322 = stringResource2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        function02 = function0;
        i7 = i3 & 32;
        int i1122 = 196608;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        z4 = z2;
        if ((599187 & i4) == 599186) {
        }
        final StringResource stringResource3222 = stringResource2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ScreenHeaderItem(final InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem screenHeaderItem, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-180143819);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(screenHeaderItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180143819, i2, -1, "com.robinhood.android.investorprofile.ui.profile.ScreenHeaderItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:287)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String title = screenHeaderItem.getTitle();
            composerStartRestartGroup.startReplaceGroup(1074810983);
            if (title != null) {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            String subtitle = screenHeaderItem.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(1074822812);
            if (subtitle == null) {
                composer2 = composerStartRestartGroup;
            } else {
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(subtitle, PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16316);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.ScreenHeaderItem$lambda$22(screenHeaderItem, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ListHeaderItem(final int i, final InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ListHeaderItem listHeaderItem, Composer composer, final int i2) {
        int i3;
        float fM21594getXlargeD9Ej5fM;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1464338344);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(listHeaderItem) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1464338344, i3, -1, "com.robinhood.android.investorprofile.ui.profile.ListHeaderItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:317)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            if (i == 1) {
                composerStartRestartGroup.startReplaceGroup(1520136319);
                fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
            } else {
                composerStartRestartGroup.startReplaceGroup(1520137342);
                fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(listHeaderItem.getTitle(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, fM21594getXlargeD9Ej5fM, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, UtilKt.getComposeTextStyle(listHeaderItem.getTextStyle(), composerStartRestartGroup, 0), composer2, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.ListHeaderItem$lambda$23(i, listHeaderItem, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AccountSwitcherItem(final StringResource stringResource, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(897713039);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897713039, i2, -1, "com.robinhood.android.investorprofile.ui.profile.AccountSwitcherItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:333)");
            }
            if (stringResource == null) {
                function02 = function0;
            } else {
                function02 = function0;
                BentoChip.BentoDropdownChip(function02, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), false, null, StringResource2.getString(stringResource, composerStartRestartGroup, StringResource.$stable), composerStartRestartGroup, (i2 >> 3) & 14, 12);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.AccountSwitcherItem$lambda$25(stringResource, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void QuestionSummaryItem(final InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem, final boolean z, final Function1<? super InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> function1, boolean z2, Composer composer, final int i) {
        int i2;
        final boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(469846650);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(questionSummaryItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(469846650, i2, -1, "com.robinhood.android.investorprofile.ui.profile.QuestionSummaryItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:353)");
            }
            LocalShowPlaceholder.Loadable(z2, null, null, ComposableLambda3.rememberComposableLambda(1611821802, true, new C197371(questionSummaryItem, z, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 3072, 6);
            z3 = z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.QuestionSummaryItem$lambda$26(questionSummaryItem, z, function1, z3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$QuestionSummaryItem$1 */
    static final class C197371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> $handleQuestionItemSelected;
        final /* synthetic */ InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem $investmentProfileItem;
        final /* synthetic */ boolean $rowsClickable;

        /* JADX WARN: Multi-variable type inference failed */
        C197371(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem, boolean z, Function1<? super InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> function1) {
            this.$investmentProfileItem = questionSummaryItem;
            this.$rowsClickable = z;
            this.$handleQuestionItemSelected = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            BentoSettingsRows.EndElement.Metadata metadata;
            BentoSettingsRows.EndElement.Metadata metadata2;
            boolean zChanged;
            final boolean z;
            final Function1<InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> function1;
            final InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem;
            Object objRememberedValue;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1611821802, i, -1, "com.robinhood.android.investorprofile.ui.profile.QuestionSummaryItem.<anonymous> (InvestmentProfileSettingsBonfireIdentiScreen.kt:357)");
            }
            String strAnswer = UiInvestmentProfileSettingsQuestionSummarys.answer(this.$investmentProfileItem.getQuestion());
            String strTitle = UiInvestmentProfileSettingsQuestionSummarys.title(this.$investmentProfileItem.getQuestion());
            composer.startReplaceGroup(-1522431415);
            String strStringResource = strAnswer == null ? StringResources_androidKt.stringResource(C19641R.string.investment_profile_no_answer, composer, 0) : strAnswer;
            composer.endReplaceGroup();
            if (strAnswer == null) {
                composer.startReplaceGroup(-1522426184);
                metadata2 = new BentoSettingsRows.EndElement.Metadata(StringResources_androidKt.stringResource(C19641R.string.investment_profile_add_answer, composer, 0), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU()), null);
                composer.endReplaceGroup();
            } else {
                if (!this.$investmentProfileItem.getUpdated()) {
                    composer.startReplaceGroup(49870675);
                    composer.endReplaceGroup();
                    metadata = null;
                    composer.startReplaceGroup(-1746271574);
                    zChanged = composer.changed(this.$rowsClickable) | composer.changed(this.$handleQuestionItemSelected) | composer.changedInstance(this.$investmentProfileItem);
                    z = this.$rowsClickable;
                    function1 = this.$handleQuestionItemSelected;
                    questionSummaryItem = this.$investmentProfileItem;
                    objRememberedValue = composer.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$QuestionSummaryItem$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentProfileSettingsBonfireIdentiScreen3.C197371.invoke$lambda$1$lambda$0(z, function1, questionSummaryItem);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, strTitle, strStringResource, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) metadata, false, false, (Function0<Unit>) objRememberedValue, composer, BentoSettingsRows.EndElement.Metadata.$stable << 12, 105);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
                composer.startReplaceGroup(-1522418059);
                metadata2 = new BentoSettingsRows.EndElement.Metadata(StringResources_androidKt.stringResource(C19641R.string.investment_profile_updated, composer, 0), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU()), null);
                composer.endReplaceGroup();
            }
            metadata = metadata2;
            composer.startReplaceGroup(-1746271574);
            zChanged = composer.changed(this.$rowsClickable) | composer.changed(this.$handleQuestionItemSelected) | composer.changedInstance(this.$investmentProfileItem);
            z = this.$rowsClickable;
            function1 = this.$handleQuestionItemSelected;
            questionSummaryItem = this.$investmentProfileItem;
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$QuestionSummaryItem$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestmentProfileSettingsBonfireIdentiScreen3.C197371.invoke$lambda$1$lambda$0(z, function1, questionSummaryItem);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoSettingsRowKt.BentoSettingsRow((Modifier) null, strTitle, strStringResource, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) metadata, false, false, (Function0<Unit>) objRememberedValue, composer, BentoSettingsRows.EndElement.Metadata.$stable << 12, 105);
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(boolean z, Function1 function1, InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem) {
            if (z) {
                function1.invoke(questionSummaryItem);
            }
            return Unit.INSTANCE;
        }
    }

    private static final void AccountMessageItem(boolean z, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1826993772);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826993772, i2, -1, "com.robinhood.android.investorprofile.ui.profile.AccountMessageItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:386)");
            }
            z2 = z;
            LocalShowPlaceholder.Loadable(z2, null, null, InvestmentProfileSettingsBonfireIdentiScreen.INSTANCE.m15661getLambda$1666253020$feature_investor_profile_externalDebug(), composerStartRestartGroup, (i2 & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.AccountMessageItem$lambda$27(z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentType(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem investmentProfileItem) {
        if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem) {
            return "screen-header-item";
        }
        if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ListHeaderItem) {
            return "list-header-item";
        }
        if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.AccountSwitcherItem) {
            return "account-selector-item";
        }
        if (investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem) {
            return "question-summary-item";
        }
        if (!(investmentProfileItem instanceof InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.AccountMessageItem)) {
            throw new NoWhenBranchMatchedException();
        }
        return "account-message-item";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1278976031);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278976031, i2, -1, "com.robinhood.android.investorprofile.ui.profile.Loading (InvestmentProfileSettingsBonfireIdentiScreen.kt:419)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(1443464273, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt.Loading.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1443464273, i3, -1, "com.robinhood.android.investorprofile.ui.profile.Loading.<anonymous> (InvestmentProfileSettingsBonfireIdentiScreen.kt:421)");
                    }
                    composer2.startReplaceGroup(-105268783);
                    Modifier modifierM5146paddingqDBjuR0$default = z ? androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE;
                    composer2.endReplaceGroup();
                    boolean z2 = z;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer2.startReplaceGroup(-2048359820);
                    if (z2) {
                        InvestmentProfileSettingsBonfireIdentiScreen3.LoadingScreenHeaderItem(composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingListHeaderItem(1, composer2, 6);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("--------------", "-----------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("---------------", "------------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("--------------", "-------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("-------------", "---", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("----------------------", "-------------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("--------------", "----------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("--------------", "---------------------------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingListHeaderItem(0, composer2, 6);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("--------------------", "---", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("-----------------------", "--------------", composer2, 54);
                    InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem("-------------------", "-----------", composer2, 54);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.Loading$lambda$28(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingScreenHeaderItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-879499295);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879499295, i, -1, "com.robinhood.android.investorprofile.ui.profile.LoadingScreenHeaderItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:482)");
            }
            ScreenHeaderItem(new InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ScreenHeaderItem("---", "---"), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.LoadingScreenHeaderItem$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingListHeaderItem(final int i, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(631383900);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(631383900, i3, -1, "com.robinhood.android.investorprofile.ui.profile.LoadingListHeaderItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:496)");
            }
            ListHeaderItem(i, new InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.ListHeaderItem("---", TextStyle.TEXT_LARGE_BOLD), composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.LoadingListHeaderItem$lambda$30(i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingQuestionSummaryItem(String str, final String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-518860378);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-518860378, i2, -1, "com.robinhood.android.investorprofile.ui.profile.LoadingQuestionSummaryItem (InvestmentProfileSettingsBonfireIdentiScreen.kt:510)");
            }
            str3 = str;
            InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem = new InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem(new UiInvestmentProfileAnswers2.SupportedType(QuestionType.STRING_QUESTION, null, null, str, "", new UiInvestmentProfileAnswers2.SupportedType.Answer(false, str2), null, 64, null), false, null, false, 12, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem$lambda$32$lambda$31((InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            QuestionSummaryItem(questionSummaryItem, false, (Function1) objRememberedValue, true, composer2, 3504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiScreen3.LoadingQuestionSummaryItem$lambda$33(str3, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingQuestionSummaryItem$lambda$32$lambda$31(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
