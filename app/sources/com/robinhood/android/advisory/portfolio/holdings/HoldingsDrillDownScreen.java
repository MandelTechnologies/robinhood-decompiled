package com.robinhood.android.advisory.portfolio.holdings;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.portfolio.C9151R;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState;
import com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownViewState3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.component.text.Markdown4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.content.contracts.RemoteAgreementFragmentKey;
import com.robinhood.shared.content.contracts.RemoteAgreementFragmentKey2;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HoldingsDrillDownScreen.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\f\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a7\u0010#\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010&\"\u0014\u0010(\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&¨\u0006,²\u0006\u000e\u0010*\u001a\u00020)8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020 8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;", "viewState", "Lkotlin/Function0;", "", "onBackClicked", "Landroidx/compose/ui/Modifier;", "modifier", "HoldingsDrillDownScreen", "(Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "disclosureBottomSheet", "DisclosureBottomSheetContent", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewHoldingsDrillDownScreen", "(Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownViewState;Landroidx/compose/runtime/Composer;I)V", "", "percentage", "description", "SubAssetCategoryDescriptionText", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "title", "subtitle", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "topBarScrollState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "HoldingsDrillDownScaffold", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/TopBarScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/advisory/portfolio/holdings/AllocationRowData;", "allocationRowData", "", "showAmount", "onClick", "AllocationRow", "(Lcom/robinhood/android/advisory/portfolio/holdings/AllocationRowData;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TagHoldingsDrillDownScreenSubtitle", "Ljava/lang/String;", "TagHoldingsDrillDownScreenLazyColumn", "GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER", "", "selectedTabIndex", "disclosureBottomSheetVisible", "feature-advisory-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HoldingsDrillDownScreen {
    private static final String GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER = "gold_sweep_interest_rate";
    public static final String TagHoldingsDrillDownScreenLazyColumn = "holdings-drilldown-screen-lazy-column";
    public static final String TagHoldingsDrillDownScreenSubtitle = "holdings-drilldown-screen-subtitle";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AllocationRow$lambda$24(AllocationRowData allocationRowData, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AllocationRow(allocationRowData, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureBottomSheetContent$lambda$15(RhModalBottomSheet5 rhModalBottomSheet5, DisclosureBottomSheet disclosureBottomSheet, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisclosureBottomSheetContent(rhModalBottomSheet5, disclosureBottomSheet, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldingsDrillDownScaffold$lambda$21(String str, String str2, Function0 function0, TopBarScrollState topBarScrollState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        HoldingsDrillDownScaffold(str, str2, function0, topBarScrollState, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldingsDrillDownScreen$lambda$9(HoldingsDrillDownViewState holdingsDrillDownViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HoldingsDrillDownScreen(holdingsDrillDownViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHoldingsDrillDownScreen$lambda$16(HoldingsDrillDownViewState holdingsDrillDownViewState, int i, Composer composer, int i2) {
        PreviewHoldingsDrillDownScreen(holdingsDrillDownViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubAssetCategoryDescriptionText$lambda$20(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SubAssetCategoryDescriptionText(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HoldingsDrillDownScreen$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172 A[LOOP:1: B:73:0x016c->B:75:0x0172, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HoldingsDrillDownScreen(final HoldingsDrillDownViewState viewState, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Iterator it;
        Composer composer2;
        final Modifier modifier3;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1500292057);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1500292057, i3, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen (HoldingsDrillDownScreen.kt:98)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final HoldingsDrillDownViewState3 holdingsDrillDownViewState3 = viewState.getClassificationTabs().get(snapshotIntState2.getIntValue());
                final String string2 = StringResource2.getString(holdingsDrillDownViewState3.getName(), composerStartRestartGroup, StringResource.$stable);
                ImmutableList<AllocationRowData> allocationRows = viewState.getAllocationRows();
                ArrayList arrayList = new ArrayList();
                for (AllocationRowData allocationRowData : allocationRows) {
                    AllocationRowData allocationRowData2 = allocationRowData;
                    TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                    if (!(holdingsDrillDownViewState3 instanceof HoldingsDrillDownViewState3.AssetRegionTabData)) {
                        if (!(holdingsDrillDownViewState3 instanceof HoldingsDrillDownViewState3.SubAssetCategoryTabData)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = allocationRowData2.getSubAssetClassCategory() == ((HoldingsDrillDownViewState3.SubAssetCategoryTabData) holdingsDrillDownViewState3).getSubAssetClassCategory();
                    }
                    if (z) {
                        arrayList.add(allocationRowData);
                    }
                    topBarScrollStateRememberTopBarScrollState = topBarScrollState;
                }
                final TopBarScrollState topBarScrollState2 = topBarScrollStateRememberTopBarScrollState;
                final List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((AllocationRowData) t2).getPercentage(), ((AllocationRowData) t).getPercentage());
                    }
                });
                List list = listSortedWith;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AllocationRowData) it.next()).getInstrumentId());
                }
                final ImmutableList3 persistentList = extensions2.toPersistentList(arrayList2);
                final DisclosureBottomSheet disclosureBottomSheet = viewState.getDisclosureBottomSheet();
                final Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PORTFOLIO_DRILLDOWN, null, viewState.getAssetClassRegion().getServerValue(), null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(75867214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScreen.1
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
                            ComposerKt.traceEventStart(75867214, i5, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous> (HoldingsDrillDownScreen.kt:132)");
                        }
                        String string3 = StringResource2.getString(viewState.getTitle(), composer3, StringResource.$stable);
                        String str = string2;
                        Function0<Unit> function0 = onBackClicked;
                        TopBarScrollState topBarScrollState3 = topBarScrollState2;
                        Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(modifier5, lazyListStateRememberLazyListState, topBarScrollState3);
                        final HoldingsDrillDownViewState holdingsDrillDownViewState = viewState;
                        final LazyListState lazyListState = lazyListStateRememberLazyListState;
                        final DisclosureBottomSheet disclosureBottomSheet2 = disclosureBottomSheet;
                        final HoldingsDrillDownViewState3 holdingsDrillDownViewState32 = holdingsDrillDownViewState3;
                        final List<AllocationRowData> list2 = listSortedWith;
                        final ImmutableList3<UUID> immutableList3 = persistentList;
                        final Navigator navigator2 = navigator;
                        final Context context2 = context;
                        final SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                        final SnapshotState<Boolean> snapshotState2 = snapshotState;
                        HoldingsDrillDownScreen.HoldingsDrillDownScaffold(string3, str, function0, topBarScrollState3, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(901274846, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer4.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(901274846, i7, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:142)");
                                }
                                LocalShowPlaceholder.Loadable(holdingsDrillDownViewState instanceof HoldingsDrillDownViewState.Loading, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableLambda3.rememberComposableLambda(-1062267282, true, new C495941(paddingValues, lazyListState, holdingsDrillDownViewState, disclosureBottomSheet2, holdingsDrillDownViewState32, list2, immutableList3, navigator2, context2, snapshotIntState22, snapshotState2), composer4, 54), composer4, 3120, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: HoldingsDrillDownScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C495941 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ HoldingsDrillDownViewState3 $currentTab;
                                final /* synthetic */ DisclosureBottomSheet $disclosureBottomSheet;
                                final /* synthetic */ SnapshotState<Boolean> $disclosureBottomSheetVisible$delegate;
                                final /* synthetic */ ImmutableList3<UUID> $instrumentIds;
                                final /* synthetic */ LazyListState $listScrollState;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ PaddingValues $paddingValues;
                                final /* synthetic */ List<AllocationRowData> $portfolioAllocations;
                                final /* synthetic */ SnapshotIntState2 $selectedTabIndex$delegate;
                                final /* synthetic */ HoldingsDrillDownViewState $viewState;

                                C495941(PaddingValues paddingValues, LazyListState lazyListState, HoldingsDrillDownViewState holdingsDrillDownViewState, DisclosureBottomSheet disclosureBottomSheet, HoldingsDrillDownViewState3 holdingsDrillDownViewState3, List<AllocationRowData> list, ImmutableList3<UUID> immutableList3, Navigator navigator, Context context, SnapshotIntState2 snapshotIntState2, SnapshotState<Boolean> snapshotState) {
                                    this.$paddingValues = paddingValues;
                                    this.$listScrollState = lazyListState;
                                    this.$viewState = holdingsDrillDownViewState;
                                    this.$disclosureBottomSheet = disclosureBottomSheet;
                                    this.$currentTab = holdingsDrillDownViewState3;
                                    this.$portfolioAllocations = list;
                                    this.$instrumentIds = immutableList3;
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$selectedTabIndex$delegate = snapshotIntState2;
                                    this.$disclosureBottomSheetVisible$delegate = snapshotState;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(final HoldingsDrillDownViewState holdingsDrillDownViewState, final List list, SnapshotIntState2 snapshotIntState2, DisclosureBottomSheet disclosureBottomSheet, HoldingsDrillDownViewState3 holdingsDrillDownViewState3, SnapshotState snapshotState, final ImmutableList3 immutableList3, final Navigator navigator, final Context context, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1470750141, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                            invoke(lazyItemScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i & 17) == 16 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1470750141, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:155)");
                                            }
                                            String string2 = StringResource2.getString(holdingsDrillDownViewState.getTitle(), composer, StringResource.$stable);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleLarge(), composer, 0, 0, 8188);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 3, null);
                                    if (holdingsDrillDownViewState.getShowClassificationTabs()) {
                                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-270674018, true, new HoldingsDrillDownScreen3(holdingsDrillDownViewState, snapshotIntState2)), 3, null);
                                    }
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-973640326, true, new HoldingsDrillDownScreen4(disclosureBottomSheet, holdingsDrillDownViewState3, snapshotState)), 3, null);
                                    LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(541400655, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$4
                                        public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                                            BentoTheme bentoTheme;
                                            int i3;
                                            Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                                            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(541400655, i2, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:243)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                            int i4 = BentoTheme.$stable;
                                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU(), null, 2, null);
                                            HoldingsDrillDownViewState holdingsDrillDownViewState2 = holdingsDrillDownViewState;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.Vertical top = arrangement.getTop();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
                                            Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
                                            composer.startReplaceGroup(-788684707);
                                            long jM21372getBg20d7_KjU = colorM21927getDividerColorQN2ZGVo == null ? bentoTheme2.getColors(composer, i4).m21372getBg20d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
                                            composer.endReplaceGroup();
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, jM21372getBg20d7_KjU, 0.0f, composer, 0, 5);
                                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), companion2.getTop(), composer, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                            Row6 row6 = Row6.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_tab_asset, composer, 0), Row5.weight$default(row6, companion, 4.0f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_tab_allocation, composer, 0), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 2.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
                                            composer.startReplaceGroup(-298014797);
                                            if (holdingsDrillDownViewState2.getShowAmounts()) {
                                                bentoTheme = bentoTheme2;
                                                i3 = i4;
                                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(holdingsDrillDownViewState2.getAmountTabTitle(), composer, StringResource.$stable), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 2.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
                                            } else {
                                                bentoTheme = bentoTheme2;
                                                i3 = i4;
                                            }
                                            composer.endReplaceGroup();
                                            composer.endNode();
                                            Color colorM21927getDividerColorQN2ZGVo2 = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
                                            composer.startReplaceGroup(-788616995);
                                            long jM21372getBg20d7_KjU2 = colorM21927getDividerColorQN2ZGVo2 == null ? bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU() : colorM21927getDividerColorQN2ZGVo2.getValue();
                                            composer.endReplaceGroup();
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, jM21372getBg20d7_KjU2, 0.0f, composer, 0, 5);
                                            composer.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    final C9162x65b80cf4 c9162x65b80cf4 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Void invoke(AllocationRowData allocationRowData) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            return invoke((AllocationRowData) obj);
                                        }
                                    };
                                    LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final Object invoke(int i) {
                                            return c9162x65b80cf4.invoke(list.get(i));
                                        }
                                    }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$4
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
                                            final AllocationRowData allocationRowData;
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
                                            AllocationRowData allocationRowData2 = (AllocationRowData) list.get(i);
                                            composer.startReplaceGroup(-1547483242);
                                            boolean showAmounts = holdingsDrillDownViewState.getShowAmounts();
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance = composer.changedInstance(allocationRowData2) | composer.changedInstance(holdingsDrillDownViewState) | composer.changedInstance(immutableList3) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                allocationRowData = allocationRowData2;
                                                final HoldingsDrillDownViewState holdingsDrillDownViewState2 = holdingsDrillDownViewState;
                                                final ImmutableList3 immutableList32 = immutableList3;
                                                final Navigator navigator2 = navigator;
                                                final Context context2 = context;
                                                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$5$1$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        Navigator.DefaultImpls.showFragment$default(navigator2, context2, new LegacyFragmentKey.EquityInstrumentDetail(allocationRowData.getInstrumentId(), immutableList32, holdingsDrillDownViewState2.getAccountNumber(), InstrumentDetailSource.MANAGED_PORTFOLIO_BREAKDOWN, false, 16, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                                    }
                                                };
                                                composer.updateRememberedValue(function0);
                                                objRememberedValue = function0;
                                            } else {
                                                allocationRowData = allocationRowData2;
                                            }
                                            composer.endReplaceGroup();
                                            HoldingsDrillDownScreen.AllocationRow(allocationRowData, showAmounts, (Function0) objRememberedValue, null, composer, 0, 8);
                                            composer.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1062267282, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:146)");
                                    }
                                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.$paddingValues), HoldingsDrillDownScreen.TagHoldingsDrillDownScreenLazyColumn), null, 1, null);
                                    LazyListState lazyListState = this.$listScrollState;
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$disclosureBottomSheet) | composer.changedInstance(this.$currentTab) | composer.changedInstance(this.$portfolioAllocations) | composer.changedInstance(this.$instrumentIds) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                    final HoldingsDrillDownViewState holdingsDrillDownViewState = this.$viewState;
                                    final List<AllocationRowData> list = this.$portfolioAllocations;
                                    final SnapshotIntState2 snapshotIntState2 = this.$selectedTabIndex$delegate;
                                    final DisclosureBottomSheet disclosureBottomSheet = this.$disclosureBottomSheet;
                                    final HoldingsDrillDownViewState3 holdingsDrillDownViewState3 = this.$currentTab;
                                    final SnapshotState<Boolean> snapshotState = this.$disclosureBottomSheetVisible$delegate;
                                    final ImmutableList3<UUID> immutableList3 = this.$instrumentIds;
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return HoldingsDrillDownScreen.C91681.AnonymousClass1.C495941.invoke$lambda$3$lambda$2(holdingsDrillDownViewState, list, snapshotIntState2, disclosureBottomSheet, holdingsDrillDownViewState3, snapshotState, immutableList3, navigator, context, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifierLogScreenTransitions$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
                                    if (HoldingsDrillDownScreen.HoldingsDrillDownScreen$lambda$4(this.$disclosureBottomSheetVisible$delegate) && this.$disclosureBottomSheet != null) {
                                        composer.startReplaceGroup(5004770);
                                        final SnapshotState<Boolean> snapshotState2 = this.$disclosureBottomSheetVisible$delegate;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return HoldingsDrillDownScreen.C91681.AnonymousClass1.C495941.invoke$lambda$5$lambda$4(snapshotState2);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        final DisclosureBottomSheet disclosureBottomSheet2 = this.$disclosureBottomSheet;
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1282243678, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScreen.1.1.1.3
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                                invoke(rhModalBottomSheet5, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i2) {
                                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                                if ((i2 & 6) == 0) {
                                                    i2 |= (i2 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                                }
                                                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1282243678, i2, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:307)");
                                                }
                                                HoldingsDrillDownScreen.DisclosureBottomSheetContent(RhModalBottomSheet, disclosureBottomSheet2, null, composer2, RhModalBottomSheet5.$stable | (i2 & 14), 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 1572870, 62);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
                                    HoldingsDrillDownScreen.HoldingsDrillDownScreen$lambda$5(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54), composer3, 196608 | (TopBarScrollState.$stable << 9), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HoldingsDrillDownScreen.HoldingsDrillDownScreen$lambda$9(viewState, onBackClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final HoldingsDrillDownViewState3 holdingsDrillDownViewState32 = viewState.getClassificationTabs().get(snapshotIntState22.getIntValue());
            final String string22 = StringResource2.getString(holdingsDrillDownViewState32.getName(), composerStartRestartGroup, StringResource.$stable);
            ImmutableList<AllocationRowData> allocationRows2 = viewState.getAllocationRows();
            ArrayList arrayList3 = new ArrayList();
            while (r13.hasNext()) {
            }
            final TopBarScrollState topBarScrollState22 = topBarScrollStateRememberTopBarScrollState2;
            final List<AllocationRowData> listSortedWith2 = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((AllocationRowData) t2).getPercentage(), ((AllocationRowData) t).getPercentage());
                }
            });
            List list2 = listSortedWith2;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            final ImmutableList3<UUID> persistentList2 = extensions2.toPersistentList(arrayList22);
            final DisclosureBottomSheet disclosureBottomSheet2 = viewState.getDisclosureBottomSheet();
            final Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PORTFOLIO_DRILLDOWN, null, viewState.getAssetClassRegion().getServerValue(), null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(75867214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScreen.1
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
                        ComposerKt.traceEventStart(75867214, i5, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous> (HoldingsDrillDownScreen.kt:132)");
                    }
                    String string3 = StringResource2.getString(viewState.getTitle(), composer3, StringResource.$stable);
                    String str = string22;
                    Function0<Unit> function0 = onBackClicked;
                    TopBarScrollState topBarScrollState3 = topBarScrollState22;
                    Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(modifier52, lazyListStateRememberLazyListState2, topBarScrollState3);
                    final HoldingsDrillDownViewState holdingsDrillDownViewState = viewState;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState2;
                    final DisclosureBottomSheet disclosureBottomSheet22 = disclosureBottomSheet2;
                    final HoldingsDrillDownViewState3 holdingsDrillDownViewState322 = holdingsDrillDownViewState32;
                    final List<AllocationRowData> list22 = listSortedWith2;
                    final ImmutableList3<UUID> immutableList3 = persistentList2;
                    final Navigator navigator22 = navigator2;
                    final Context context22 = context2;
                    final SnapshotIntState2 snapshotIntState222 = snapshotIntState22;
                    final SnapshotState<Boolean> snapshotState22 = snapshotState2;
                    HoldingsDrillDownScreen.HoldingsDrillDownScaffold(string3, str, function0, topBarScrollState3, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(901274846, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer4.changed(paddingValues) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(901274846, i7, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:142)");
                            }
                            LocalShowPlaceholder.Loadable(holdingsDrillDownViewState instanceof HoldingsDrillDownViewState.Loading, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableLambda3.rememberComposableLambda(-1062267282, true, new C495941(paddingValues, lazyListState, holdingsDrillDownViewState, disclosureBottomSheet22, holdingsDrillDownViewState322, list22, immutableList3, navigator22, context22, snapshotIntState222, snapshotState22), composer4, 54), composer4, 3120, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: HoldingsDrillDownScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C495941 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ HoldingsDrillDownViewState3 $currentTab;
                            final /* synthetic */ DisclosureBottomSheet $disclosureBottomSheet;
                            final /* synthetic */ SnapshotState<Boolean> $disclosureBottomSheetVisible$delegate;
                            final /* synthetic */ ImmutableList3<UUID> $instrumentIds;
                            final /* synthetic */ LazyListState $listScrollState;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ PaddingValues $paddingValues;
                            final /* synthetic */ List<AllocationRowData> $portfolioAllocations;
                            final /* synthetic */ SnapshotIntState2 $selectedTabIndex$delegate;
                            final /* synthetic */ HoldingsDrillDownViewState $viewState;

                            C495941(PaddingValues paddingValues, LazyListState lazyListState, HoldingsDrillDownViewState holdingsDrillDownViewState, DisclosureBottomSheet disclosureBottomSheet, HoldingsDrillDownViewState3 holdingsDrillDownViewState3, List<AllocationRowData> list, ImmutableList3<UUID> immutableList3, Navigator navigator, Context context, SnapshotIntState2 snapshotIntState2, SnapshotState<Boolean> snapshotState) {
                                this.$paddingValues = paddingValues;
                                this.$listScrollState = lazyListState;
                                this.$viewState = holdingsDrillDownViewState;
                                this.$disclosureBottomSheet = disclosureBottomSheet;
                                this.$currentTab = holdingsDrillDownViewState3;
                                this.$portfolioAllocations = list;
                                this.$instrumentIds = immutableList3;
                                this.$navigator = navigator;
                                this.$context = context;
                                this.$selectedTabIndex$delegate = snapshotIntState2;
                                this.$disclosureBottomSheetVisible$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(final HoldingsDrillDownViewState holdingsDrillDownViewState, final List list, SnapshotIntState2 snapshotIntState2, DisclosureBottomSheet disclosureBottomSheet, HoldingsDrillDownViewState3 holdingsDrillDownViewState3, SnapshotState snapshotState, final ImmutableList3 immutableList3, final Navigator navigator, final Context context, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1470750141, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1470750141, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:155)");
                                        }
                                        String string2 = StringResource2.getString(holdingsDrillDownViewState.getTitle(), composer, StringResource.$stable);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i2 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleLarge(), composer, 0, 0, 8188);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                if (holdingsDrillDownViewState.getShowClassificationTabs()) {
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-270674018, true, new HoldingsDrillDownScreen3(holdingsDrillDownViewState, snapshotIntState2)), 3, null);
                                }
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-973640326, true, new HoldingsDrillDownScreen4(disclosureBottomSheet, holdingsDrillDownViewState3, snapshotState)), 3, null);
                                LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(541400655, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$4
                                    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                                        BentoTheme bentoTheme;
                                        int i3;
                                        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                                        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(541400655, i2, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:243)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i4 = BentoTheme.$stable;
                                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU(), null, 2, null);
                                        HoldingsDrillDownViewState holdingsDrillDownViewState2 = holdingsDrillDownViewState;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
                                        Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
                                        composer.startReplaceGroup(-788684707);
                                        long jM21372getBg20d7_KjU = colorM21927getDividerColorQN2ZGVo == null ? bentoTheme2.getColors(composer, i4).m21372getBg20d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
                                        composer.endReplaceGroup();
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, jM21372getBg20d7_KjU, 0.0f, composer, 0, 5);
                                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), companion2.getTop(), composer, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_tab_asset, composer, 0), Row5.weight$default(row6, companion, 4.0f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_tab_allocation, composer, 0), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 2.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
                                        composer.startReplaceGroup(-298014797);
                                        if (holdingsDrillDownViewState2.getShowAmounts()) {
                                            bentoTheme = bentoTheme2;
                                            i3 = i4;
                                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(holdingsDrillDownViewState2.getAmountTabTitle(), composer, StringResource.$stable), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 2.0f, false, 2, null), companion2.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
                                        } else {
                                            bentoTheme = bentoTheme2;
                                            i3 = i4;
                                        }
                                        composer.endReplaceGroup();
                                        composer.endNode();
                                        Color colorM21927getDividerColorQN2ZGVo2 = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
                                        composer.startReplaceGroup(-788616995);
                                        long jM21372getBg20d7_KjU2 = colorM21927getDividerColorQN2ZGVo2 == null ? bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU() : colorM21927getDividerColorQN2ZGVo2.getValue();
                                        composer.endReplaceGroup();
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, jM21372getBg20d7_KjU2, 0.0f, composer, 0, 5);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }), 3, null);
                                final Function1 c9162x65b80cf4 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(AllocationRowData allocationRowData) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((AllocationRowData) obj);
                                    }
                                };
                                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c9162x65b80cf4.invoke(list.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$invoke$lambda$3$lambda$2$$inlined$items$default$4
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
                                        final AllocationRowData allocationRowData;
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
                                        AllocationRowData allocationRowData2 = (AllocationRowData) list.get(i);
                                        composer.startReplaceGroup(-1547483242);
                                        boolean showAmounts = holdingsDrillDownViewState.getShowAmounts();
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance = composer.changedInstance(allocationRowData2) | composer.changedInstance(holdingsDrillDownViewState) | composer.changedInstance(immutableList3) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            allocationRowData = allocationRowData2;
                                            final HoldingsDrillDownViewState holdingsDrillDownViewState2 = holdingsDrillDownViewState;
                                            final ImmutableList3<UUID> immutableList32 = immutableList3;
                                            final Navigator navigator2 = navigator;
                                            final Context context2 = context;
                                            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$1$1$5$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    Navigator.DefaultImpls.showFragment$default(navigator2, context2, new LegacyFragmentKey.EquityInstrumentDetail(allocationRowData.getInstrumentId(), immutableList32, holdingsDrillDownViewState2.getAccountNumber(), InstrumentDetailSource.MANAGED_PORTFOLIO_BREAKDOWN, false, 16, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                                }
                                            };
                                            composer.updateRememberedValue(function0);
                                            objRememberedValue = function0;
                                        } else {
                                            allocationRowData = allocationRowData2;
                                        }
                                        composer.endReplaceGroup();
                                        HoldingsDrillDownScreen.AllocationRow(allocationRowData, showAmounts, (Function0) objRememberedValue, null, composer, 0, 8);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1062267282, i, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:146)");
                                }
                                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.$paddingValues), HoldingsDrillDownScreen.TagHoldingsDrillDownScreenLazyColumn), null, 1, null);
                                LazyListState lazyListState = this.$listScrollState;
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$disclosureBottomSheet) | composer.changedInstance(this.$currentTab) | composer.changedInstance(this.$portfolioAllocations) | composer.changedInstance(this.$instrumentIds) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                final HoldingsDrillDownViewState holdingsDrillDownViewState = this.$viewState;
                                final List list = this.$portfolioAllocations;
                                final SnapshotIntState2 snapshotIntState2 = this.$selectedTabIndex$delegate;
                                final DisclosureBottomSheet disclosureBottomSheet = this.$disclosureBottomSheet;
                                final HoldingsDrillDownViewState3 holdingsDrillDownViewState3 = this.$currentTab;
                                final SnapshotState snapshotState = this.$disclosureBottomSheetVisible$delegate;
                                final ImmutableList3 immutableList3 = this.$instrumentIds;
                                final Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HoldingsDrillDownScreen.C91681.AnonymousClass1.C495941.invoke$lambda$3$lambda$2(holdingsDrillDownViewState, list, snapshotIntState2, disclosureBottomSheet, holdingsDrillDownViewState3, snapshotState, immutableList3, navigator, context, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierLogScreenTransitions$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
                                if (HoldingsDrillDownScreen.HoldingsDrillDownScreen$lambda$4(this.$disclosureBottomSheetVisible$delegate) && this.$disclosureBottomSheet != null) {
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState snapshotState2 = this.$disclosureBottomSheetVisible$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$HoldingsDrillDownScreen$1$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return HoldingsDrillDownScreen.C91681.AnonymousClass1.C495941.invoke$lambda$5$lambda$4(snapshotState2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    final DisclosureBottomSheet disclosureBottomSheet2 = this.$disclosureBottomSheet;
                                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1282243678, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScreen.1.1.1.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                            invoke(rhModalBottomSheet5, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i2) {
                                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                            if ((i2 & 6) == 0) {
                                                i2 |= (i2 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                                            }
                                            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1282243678, i2, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:307)");
                                            }
                                            HoldingsDrillDownScreen.DisclosureBottomSheetContent(RhModalBottomSheet, disclosureBottomSheet2, null, composer2, RhModalBottomSheet5.$stable | (i2 & 14), 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, 1572870, 62);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
                                HoldingsDrillDownScreen.HoldingsDrillDownScreen$lambda$5(snapshotState, false);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54), composer3, 196608 | (TopBarScrollState.$stable << 9), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HoldingsDrillDownScreen$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisclosureBottomSheetContent(final RhModalBottomSheet5 rhModalBottomSheet5, final DisclosureBottomSheet disclosureBottomSheet, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        DisclosureBottomSheet disclosureBottomSheet2;
        int i4;
        Modifier modifier2;
        BigDecimal goldInterestRate;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        int i5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        boolean z;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(615999751);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                disclosureBottomSheet2 = disclosureBottomSheet;
                i3 |= composerStartRestartGroup.changedInstance(disclosureBottomSheet2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(615999751, i3, -1, "com.robinhood.android.advisory.portfolio.holdings.DisclosureBottomSheetContent (HoldingsDrillDownScreen.kt:321)");
                    }
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Markwon current = Markdown3.getLocalMarkwon().getCurrent(composerStartRestartGroup, Markdown4.$stable);
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    SweepsInterest sweepInterest = disclosureBottomSheet2.getSweepEnrollmentData().getSweepInterest();
                    goldInterestRate = sweepInterest.getGoldInterestRate();
                    if (goldInterestRate == null) {
                        goldInterestRate = sweepInterest.getInterestRate();
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
                    i5 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(disclosureBottomSheet2.getDisclosure().getTitle(), modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(Markwons.toSpanned(current, disclosureBottomSheet.getDisclosure().getContent(), MapsKt.mapOf(Tuples4.m3642to("gold_sweep_interest_rate", Formats.getInterestRateFormatShortWithPercentage().format(goldInterestRate)))).toString(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8124);
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null);
                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i5 & 14) == 4) {
                        if ((i5 & 8) != 0) {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                            if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HoldingsDrillDownScreen.DisclosureBottomSheetContent$lambda$14$lambda$11$lambda$10(rhModalBottomSheet52);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null);
                            BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                            String strStringResource2 = StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_interest_earning_read_full_disclosure, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HoldingsDrillDownScreen.DisclosureBottomSheetContent$lambda$14$lambda$13$lambda$12(navigator, context);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, type3, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                        }
                        z = false;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HoldingsDrillDownScreen.DisclosureBottomSheetContent$lambda$14$lambda$11$lambda$10(rhModalBottomSheet52);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default22 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null);
                            BentoButtons.Type type32 = BentoButtons.Type.Secondary;
                            String strStringResource22 = StringResources_androidKt.stringResource(C9151R.string.portfolio_holdings_interest_earning_read_full_disclosure, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HoldingsDrillDownScreen.DisclosureBottomSheetContent$lambda$14$lambda$13$lambda$12(navigator, context);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource22, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default22, null, type32, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier5;
                            }
                        }
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    z = true;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HoldingsDrillDownScreen.DisclosureBottomSheetContent$lambda$15(rhModalBottomSheet5, disclosureBottomSheet, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Markwon current2 = Markdown3.getLocalMarkwon().getCurrent(composerStartRestartGroup, Markdown4.$stable);
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                SweepsInterest sweepInterest2 = disclosureBottomSheet2.getSweepEnrollmentData().getSweepInterest();
                goldInterestRate = sweepInterest2.getGoldInterestRate();
                if (goldInterestRate == null) {
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                i5 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
                    TextAlign.Companion companion32 = TextAlign.INSTANCE;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(disclosureBottomSheet2.getDisclosure().getTitle(), modifierM21620defaultFillMaxWidthPaddingVpY3zN42, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(Markwons.toSpanned(current2, disclosureBottomSheet.getDisclosure().getContent(), MapsKt.mapOf(Tuples4.m3642to("gold_sweep_interest_rate", Formats.getInterestRateFormatShortWithPercentage().format(goldInterestRate)))).toString(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8124);
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 1, null);
                    BentoButtons.Type type22 = BentoButtons.Type.Primary;
                    String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i5 & 14) == 4) {
                    }
                    z = true;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        disclosureBottomSheet2 = disclosureBottomSheet;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureBottomSheetContent$lambda$14$lambda$11$lambda$10(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureBottomSheetContent$lambda$14$lambda$13$lambda$12(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new RemoteAgreementFragmentKey(new RemoteAgreementFragmentKey2.AgreementType("cash_sweep_agreement"), false, false, false, null, 30, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    private static final void PreviewHoldingsDrillDownScreen(final HoldingsDrillDownViewState holdingsDrillDownViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-664462516);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(holdingsDrillDownViewState) : composerStartRestartGroup.changedInstance(holdingsDrillDownViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-664462516, i2, -1, "com.robinhood.android.advisory.portfolio.holdings.PreviewHoldingsDrillDownScreen (HoldingsDrillDownScreen.kt:388)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableLambda3.rememberComposableLambda(910528140, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.PreviewHoldingsDrillDownScreen.1

                /* compiled from: HoldingsDrillDownScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$PreviewHoldingsDrillDownScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ HoldingsDrillDownViewState $viewState;

                    AnonymousClass1(HoldingsDrillDownViewState holdingsDrillDownViewState) {
                        this.$viewState = holdingsDrillDownViewState;
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
                            ComposerKt.traceEventStart(1181458900, i, -1, "com.robinhood.android.advisory.portfolio.holdings.PreviewHoldingsDrillDownScreen.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:393)");
                        }
                        HoldingsDrillDownViewState holdingsDrillDownViewState = this.$viewState;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$PreviewHoldingsDrillDownScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        HoldingsDrillDownScreen.HoldingsDrillDownScreen(holdingsDrillDownViewState, (Function0) objRememberedValue, null, composer, 48, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

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
                        ComposerKt.traceEventStart(910528140, i3, -1, "com.robinhood.android.advisory.portfolio.holdings.PreviewHoldingsDrillDownScreen.<anonymous> (HoldingsDrillDownScreen.kt:392)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1181458900, true, new AnonymousClass1(holdingsDrillDownViewState), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HoldingsDrillDownScreen.PreviewHoldingsDrillDownScreen$lambda$16(holdingsDrillDownViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubAssetCategoryDescriptionText(final String percentage, final String description, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(description, "description");
        Composer composerStartRestartGroup = composer.startRestartGroup(538816930);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(percentage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(description) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(538816930, i3, -1, "com.robinhood.android.advisory.portfolio.holdings.SubAssetCategoryDescriptionText (HoldingsDrillDownScreen.kt:473)");
                }
                composerStartRestartGroup.startReplaceGroup(-1887967326);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C9151R.string.portfolio_sub_asset_category_percentage_text, new Object[]{percentage}, composerStartRestartGroup, 0);
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(strStringResource);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(description);
                        builder.pop(iPushStyle);
                        int i6 = i3;
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifier3, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, (i6 >> 3) & 112, 0, 8188);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } finally {
                    }
                } finally {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HoldingsDrillDownScreen.SubAssetCategoryDescriptionText$lambda$20(percentage, description, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(-1887967326);
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C9151R.string.portfolio_sub_asset_category_percentage_text, new Object[]{percentage}, composerStartRestartGroup, 0);
            int iPushStyle2 = builder2.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            builder2.append(strStringResource2);
            Unit unit2 = Unit.INSTANCE;
            builder2.pop(iPushStyle2);
            builder2.append(PlaceholderUtils.XXShortPlaceholderText);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            builder2.append(description);
            builder2.pop(iPushStyle2);
            int i62 = i3;
            AnnotatedString annotatedString2 = builder2.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifier3, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composer2, (i62 >> 3) & 112, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HoldingsDrillDownScaffold(final String title, final String subtitle, final Function0<Unit> onBackClicked, final TopBarScrollState topBarScrollState, Modifier modifier, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(180961680);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(subtitle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180961680, i3, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold (HoldingsDrillDownScreen.kt:498)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(230283092, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScaffold.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(230283092, i6, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold.<anonymous> (HoldingsDrillDownScreen.kt:504)");
                        }
                        final TopBarScrollState topBarScrollState2 = topBarScrollState;
                        final String str = title;
                        final String str2 = subtitle;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2115899391, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScaffold.1.1
                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2115899391, i7, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:506)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierAlpha = Alpha.alpha(companion, topBarScrollState2.getOpacity());
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                String str3 = str;
                                String str4 = str2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierAlpha);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme2.getColors(composer4, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextL(), composer4, 0, 0, 8186);
                                BentoText2.m20747BentoText38GnDrw(str4, TestTag3.testTag(companion, HoldingsDrillDownScreen.TagHoldingsDrillDownScreenSubtitle), Color.m6701boximpl(bentoTheme2.getColors(composer4, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextM(), composer4, 48, 0, 8184);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54);
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(615664213, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScaffold.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(615664213, i7, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:524)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, content, composer2, ((i3 >> 12) & 14) | 48 | ((i3 << 12) & 1879048192), 316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HoldingsDrillDownScreen.HoldingsDrillDownScaffold$lambda$21(title, subtitle, onBackClicked, topBarScrollState, modifier3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(230283092, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScaffold.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(230283092, i6, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold.<anonymous> (HoldingsDrillDownScreen.kt:504)");
                    }
                    final TopBarScrollState topBarScrollState2 = topBarScrollState;
                    final String str = title;
                    final String str2 = subtitle;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2115899391, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScaffold.1.1
                        public final void invoke(Composer composer4, int i7) {
                            if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2115899391, i7, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:506)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierAlpha = Alpha.alpha(companion, topBarScrollState2.getOpacity());
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            String str3 = str;
                            String str4 = str2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierAlpha);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme22.getColors(composer4, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer4, i8).getTextL(), composer4, 0, 0, 8186);
                            BentoText2.m20747BentoText38GnDrw(str4, TestTag3.testTag(companion, HoldingsDrillDownScreen.TagHoldingsDrillDownScreenSubtitle), Color.m6701boximpl(bentoTheme22.getColors(composer4, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer4, i8).getTextM(), composer4, 48, 0, 8184);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54);
                    final Function0<Unit> function0 = onBackClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(615664213, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt.HoldingsDrillDownScaffold.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(615664213, i7, -1, "com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScaffold.<anonymous>.<anonymous> (HoldingsDrillDownScreen.kt:524)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, content, composer2, ((i3 >> 12) & 14) | 48 | ((i3 << 12) & 1879048192), 316);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllocationRow(final AllocationRowData allocationRowData, final boolean z, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zIsBlank;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(allocationRowData, "allocationRowData");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1782860513);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(allocationRowData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1782860513, i3, -1, "com.robinhood.android.advisory.portfolio.holdings.AllocationRow (HoldingsDrillDownScreen.kt:541)");
                }
                Modifier modifier5 = modifier4;
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier5, allocationRowData.getClickable(), null, null, onClick, 6, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.ASSET_ROW;
                String string2 = allocationRowData.getInstrumentId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, string2, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierAutoLogEvents$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 4.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                zIsBlank = StringsKt.isBlank(allocationRowData.getSymbol());
                String name = allocationRowData.getName();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                BentoText2.m20747BentoText38GnDrw(name, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, zIsBlank ? FontWeight.INSTANCE.getBold() : null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS, composerStartRestartGroup, 817889280, 0, 7530);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-2079880210);
                if (!zIsBlank) {
                    BentoText2.m20747BentoText38GnDrw(allocationRowData.getSymbol(), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextS(), composer3, 0, 0, 8186);
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                Composer composer4 = composer3;
                BentoText2.m20747BentoText38GnDrw(allocationRowData.getPercentageString(), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion3, 2.0f, false, 2, null), companion.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextS(), composer4, 0, 0, 8184);
                Composer composer5 = composer4;
                composer5.startReplaceGroup(246023763);
                if (z) {
                    BentoText2.m20747BentoText38GnDrw(allocationRowData.getAmount(), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion3, 2.0f, false, 2, null), companion.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer5, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i5).getTextS(), composer5, 0, 0, 8184);
                    composer5 = composer5;
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer5.consume(Styles2.getLocalStyles())).getRow(composer5, 0).getColors().m21927getDividerColorQN2ZGVo();
                composer5.startReplaceGroup(-362913531);
                long jM21372getBg20d7_KjU = colorM21927getDividerColorQN2ZGVo != null ? bentoTheme.getColors(composer5, i5).m21372getBg20d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
                composer5.endReplaceGroup();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, jM21372getBg20d7_KjU, 0.0f, composer5, 0, 5);
                composer2 = composer5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.holdings.HoldingsDrillDownScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HoldingsDrillDownScreen.AllocationRow$lambda$24(allocationRowData, z, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier52, allocationRowData.getClickable(), null, null, onClick, 6, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType2 = Component.ComponentType.ASSET_ROW;
            String string22 = allocationRowData.getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType2, string22, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierAutoLogEvents$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 4.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    zIsBlank = StringsKt.isBlank(allocationRowData.getSymbol());
                    String name2 = allocationRowData.getName();
                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                    BentoText2.m20747BentoText38GnDrw(name2, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, zIsBlank ? FontWeight.INSTANCE.getBold() : null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS2, composerStartRestartGroup, 817889280, 0, 7530);
                    Composer composer32 = composerStartRestartGroup;
                    composer32.startReplaceGroup(-2079880210);
                    if (!zIsBlank) {
                    }
                    composer32.endReplaceGroup();
                    composer32.endNode();
                    Composer composer42 = composer32;
                    BentoText2.m20747BentoText38GnDrw(allocationRowData.getPercentageString(), SizeKt.wrapContentWidth$default(Row5.weight$default(row62, companion32, 2.0f, false, 2, null), companion4.getEnd(), false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer32, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer32, i52).getTextS(), composer42, 0, 0, 8184);
                    Composer composer52 = composer42;
                    composer52.startReplaceGroup(246023763);
                    if (z) {
                    }
                    composer52.endReplaceGroup();
                    composer52.endNode();
                    Color colorM21927getDividerColorQN2ZGVo2 = ((Styles) composer52.consume(Styles2.getLocalStyles())).getRow(composer52, 0).getColors().m21927getDividerColorQN2ZGVo();
                    composer52.startReplaceGroup(-362913531);
                    long jM21372getBg20d7_KjU2 = colorM21927getDividerColorQN2ZGVo2 != null ? bentoTheme2.getColors(composer52, i52).m21372getBg20d7_KjU() : colorM21927getDividerColorQN2ZGVo2.getValue();
                    composer52.endReplaceGroup();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, jM21372getBg20d7_KjU2, 0.0f, composer52, 0, 5);
                    composer2 = composer52;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
