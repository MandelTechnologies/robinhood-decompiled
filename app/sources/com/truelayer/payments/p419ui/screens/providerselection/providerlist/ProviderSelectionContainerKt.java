package com.truelayer.payments.p419ui.screens.providerselection.providerlist;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.FlagImage3;
import com.truelayer.payments.p419ui.components.toolbars.AccessibleAppBarAction;
import com.truelayer.payments.p419ui.components.toolbars.SearchBarKt;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.screens.components.BankUnavailableDialog;
import com.truelayer.payments.p419ui.screens.providerselection.PaymentProviderViewData;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import com.truelayer.payments.p419ui.screens.providerselection.components.ProviderSelectionList;
import com.truelayer.payments.p419ui.screens.searchselect.components.EmptyView;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import com.truelayer.payments.p419ui.utils.ContentChangeAccessibilityAnnouncement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProviderSelectionContainer.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ax\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032O\b\u0002\u0010\u0004\u001aI\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2O\b\u0002\u0010\u0004\u001aI\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u001f\u001aí\u0001\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000b20\u0010%\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2@\b\u0002\u0010\u0004\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0003¢\u0006\u0002\u0010*\u001a8\u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0,2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0000\u001a#\u0010-\u001a\u00020.2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010/¨\u00060²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\f\u00101\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, m3636d2 = {"BranchSelectionContainer", "", "screen", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$BranchSelection;", "onSelect", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "providerId", "branchId", "", "isRecommendedProvider", "onBack", "Lkotlin/Function0;", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$BranchSelection;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DeleteIcon", "onClearButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProviderSelectionAccessibilityAnnouncements", "query", "Lcom/truelayer/payments/ui/models/QueryState;", "providers", "", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "recommendedProviders", "(Lcom/truelayer/payments/ui/models/QueryState;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ProviderSelectionContainer", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$ProviderSelection;", "onCountrySelectionClick", "onAbort", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$ProviderSelection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SelectionContainer", "title", "currentCountry", "Lcom/truelayer/payments/ui/models/Country;", "hasMoreThanOneCountryAvailable", "sortAndFilter", "Lkotlin/reflect/KFunction4;", "maxNumberOfRecentProvidersOnScreen", "", "branchSelection", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/truelayer/payments/ui/models/Country;ZLkotlin/reflect/KFunction;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "calculateNoOfSectionsAndItems", "Lkotlin/Pair;", "countrySearchAction", "Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;", "(Lkotlin/jvm/functions/Function0;Lcom/truelayer/payments/ui/models/Country;Landroidx/compose/runtime/Composer;I)Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;", "payments-ui_release", "showUnavailableBankDialogWithName"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ProviderSelectionContainerKt {
    public static final Tuples2<Integer, Integer> calculateNoOfSectionsAndItems(QueryState query, List<PaymentProviderViewData> providers, List<PaymentProviderViewData> recommendedProviders) {
        int size;
        int i;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
        if (query.getInner().length() != 0 || recommendedProviders.isEmpty()) {
            size = 0;
            i = 0;
        } else {
            size = recommendedProviders.size();
            i = 1;
        }
        if (!providers.isEmpty()) {
            i++;
            size += providers.size();
        }
        return new Tuples2<>(Integer.valueOf(i), Integer.valueOf(size));
    }

    public static final void ProviderSelectionAccessibilityAnnouncements(final QueryState query, final List<PaymentProviderViewData> providers, final List<PaymentProviderViewData> recommendedProviders, Composer composer, final int i) {
        String string2;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
        Composer composerStartRestartGroup = composer.startRestartGroup(1074742764);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1074742764, i, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionAccessibilityAnnouncements (ProviderSelectionContainer.kt:72)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int iIntValue = calculateNoOfSectionsAndItems(query, providers, recommendedProviders).component2().intValue();
        if (!StringsKt.isBlank(query.getInner())) {
            if (iIntValue > 0) {
                string2 = context.getString(C42830R.string.accessibility_number_of_items_in_search_result, context.getResources().getQuantityString(C42830R.plurals.items, iIntValue, Integer.valueOf(iIntValue)));
            } else {
                string2 = context.getString(C42830R.string.bank_not_found) + ". " + context.getString(C42830R.string.bank_not_found_desc);
            }
            Intrinsics.checkNotNull(string2);
            ContentChangeAccessibilityAnnouncement.ContentChangeAccessibilityAnnouncement(query.getInner(), string2, composerStartRestartGroup, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.ProviderSelectionAccessibilityAnnouncements.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ProviderSelectionContainerKt.ProviderSelectionAccessibilityAnnouncements(query, providers, recommendedProviders, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void BranchSelectionContainer(final ProviderSelectionScreen.BranchSelection screen, Function3<? super String, ? super String, ? super Boolean, Unit> function3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String country;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2031926928);
        Function3<? super String, ? super String, ? super Boolean, Unit> function32 = (i2 & 2) != 0 ? new Function3<String, String, Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.BranchSelectionContainer.1
            public final void invoke(String str, String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool) {
                invoke(str, str2, bool.booleanValue());
                return Unit.INSTANCE;
            }
        } : function3;
        Function0<Unit> function02 = (i2 & 4) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2031926928, i, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.BranchSelectionContainer (ProviderSelectionContainer.kt:94)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C42830R.string.choose_your_branch, composerStartRestartGroup, 0);
        List<PaymentProviderViewData> providers = screen.getProviders();
        List listEmptyList = CollectionsKt.emptyList();
        PaymentProviderViewData paymentProviderViewData = (PaymentProviderViewData) CollectionsKt.firstOrNull((List) screen.getProviders());
        if (paymentProviderViewData == null || (country = paymentProviderViewData.getCountryCode()) == null) {
            country = Locale.getDefault().getCountry();
        }
        Intrinsics.checkNotNull(country);
        SelectionContainer(strStringResource, providers, listEmptyList, new Country(country, ""), false, screen.getSortAndFilter(), 0, true, null, function32, function02, composerStartRestartGroup, ((i << 24) & 1879048192) | 12612032, (i >> 6) & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function3<? super String, ? super String, ? super Boolean, Unit> function33 = function32;
            final Function0<Unit> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.BranchSelectionContainer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ProviderSelectionContainerKt.BranchSelectionContainer(screen, function33, function03, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void ProviderSelectionContainer(final ProviderSelectionScreen.ProviderSelection screen, Function0<Unit> function0, Function3<? super String, ? super String, ? super Boolean, Unit> function3, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Composer composerStartRestartGroup = composer.startRestartGroup(-451933052);
        Function0<Unit> function03 = (i2 & 2) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.ProviderSelectionContainer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function3<? super String, ? super String, ? super Boolean, Unit> function32 = (i2 & 4) != 0 ? new Function3<String, String, Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.ProviderSelectionContainer.2
            public final void invoke(String str, String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool) {
                invoke(str, str2, bool.booleanValue());
                return Unit.INSTANCE;
            }
        } : function3;
        Function0<Unit> function04 = (i2 & 8) != 0 ? null : function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451933052, i, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainer (ProviderSelectionContainer.kt:114)");
        }
        int i3 = i << 21;
        SelectionContainer(null, screen.getProviders(), screen.getRecommendedProviders(), screen.getCurrentCountry(), screen.getHasMoreThanOneCountryAvailable(), screen.getSortAndFilter(), 0, false, function03, function32, function04, composerStartRestartGroup, (234881024 & i3) | 12587584 | (i3 & 1879048192), (i >> 9) & 14, 65);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function05 = function03;
            final Function3<? super String, ? super String, ? super Boolean, Unit> function33 = function32;
            final Function0<Unit> function06 = function04;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.ProviderSelectionContainer.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ProviderSelectionContainerKt.ProviderSelectionContainer(screen, function05, function33, function06, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionContainer(String str, final List<PaymentProviderViewData> list, final List<PaymentProviderViewData> list2, final Country country, final boolean z, final KFunction<? extends List<PaymentProviderViewData>> kFunction, int i, boolean z2, Function0<Unit> function0, Function3<? super String, ? super String, ? super Boolean, Unit> function3, Function0<Unit> function02, Composer composer, final int i2, final int i3, final int i4) {
        final String strStringResource;
        int i5;
        SnapshotState snapshotState;
        List listEmptyList;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-874657813);
        if ((i4 & 1) != 0) {
            i5 = i2 & (-15);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.choose_your_bank, composerStartRestartGroup, 0);
        } else {
            strStringResource = str;
            i5 = i2;
        }
        int i6 = (i4 & 64) != 0 ? 3 : i;
        boolean z3 = (i4 & 128) != 0 ? false : z2;
        final Function0<Unit> function03 = (i4 & 256) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.SelectionContainer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function3<? super String, ? super String, ? super Boolean, Unit> function32 = (i4 & 512) != 0 ? new Function3<String, String, Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.SelectionContainer.2
            public final void invoke(String str2, String str3, boolean z4) {
                Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str2, String str3, Boolean bool) {
                invoke(str2, str3, bool.booleanValue());
                return Unit.INSTANCE;
            }
        } : function3;
        final Function0<Unit> function04 = (i4 & 1024) != 0 ? null : function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-874657813, i5, i3, "com.truelayer.payments.ui.screens.providerselection.providerlist.SelectionContainer (ProviderSelectionContainer.kt:141)");
        }
        composerStartRestartGroup.startReplaceableGroup(1180539070);
        boolean z4 = (((i3 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(function04)) || (i3 & 6) == 4;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Function0<Unit> function05 = function04;
                    if (function05 != null) {
                        function05.invoke();
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
        composerStartRestartGroup.startReplaceableGroup(1180539120);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(QueryState.INSTANCE.mo27021default(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1180539215);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        QueryState queryStateSelectionContainer$lambda$2 = SelectionContainer$lambda$2(snapshotState2);
        composerStartRestartGroup.startReplaceableGroup(1180539304);
        boolean z5 = (((i2 & 29360128) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(z3)) || (i2 & 12582912) == 8388608;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new ProviderSelectionContainerKt$SelectionContainer$4$1(z3, snapshotState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(queryStateSelectionContainer$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 64);
        boolean zIsBlank = StringsKt.isBlank(SelectionContainer$lambda$2(snapshotState2).getInner());
        final List list3 = (List) ((Function4) kFunction).invoke(list, country, SelectionContainer$lambda$2(snapshotState2).getInner(), Boolean.valueOf(zIsBlank && !z3));
        if (!zIsBlank) {
            snapshotState = snapshotState3;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                SnapshotState snapshotState4 = snapshotState3;
                Iterator it2 = it;
                if (StringsKt.equals(((PaymentProviderViewData) next).getCountryCode(), country.getCountryCode(), true)) {
                    arrayList.add(next);
                }
                it = it2;
                snapshotState3 = snapshotState4;
            }
            snapshotState = snapshotState3;
            listEmptyList = CollectionsKt.take(arrayList, i6);
        }
        final List list4 = listEmptyList;
        final boolean z6 = z3;
        EffectsKt.LaunchedEffect(Boolean.TRUE, new C432175(z6, list4, list3, country, null), composerStartRestartGroup, 70);
        ProviderSelectionAccessibilityAnnouncements(SelectionContainer$lambda$2(snapshotState2), list3, list4, composerStartRestartGroup, 576);
        final Function0<Unit> function05 = function04;
        final Function0<Unit> function06 = function03;
        ComposableLambda composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, 329183407, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.SelectionContainer.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i7) {
                if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(329183407, i7, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.SelectionContainer.<anonymous> (ProviderSelectionContainer.kt:209)");
                    }
                    String str2 = strStringResource;
                    QueryState queryStateSelectionContainer$lambda$22 = ProviderSelectionContainerKt.SelectionContainer$lambda$2(snapshotState2);
                    composer3.startReplaceableGroup(291764760);
                    final SnapshotState<QueryState> snapshotState5 = snapshotState2;
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$6$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState) {
                                invoke2(queryState);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(QueryState newQuery) {
                                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                                snapshotState5.setValue(newQuery);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    Function1 function1 = (Function1) objRememberedValue5;
                    composer3.endReplaceableGroup();
                    Function0<Unit> function07 = function05;
                    composer3.startReplaceableGroup(291764888);
                    AccessibleAppBarAction accessibleAppBarActionCountrySearchAction = z ? ProviderSelectionContainerKt.countrySearchAction(function03, country, composer3, 64) : null;
                    composer3.endReplaceableGroup();
                    SearchBarKt.SearchBar(str2, null, false, queryStateSelectionContainer$lambda$22, function1, function07, accessibleAppBarActionCountrySearchAction, composer3, (CustomAccessibilityAction.$stable << 18) | 24624, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        final String str2 = strStringResource;
        final Function3<? super String, ? super String, ? super Boolean, Unit> function33 = function32;
        final SnapshotState snapshotState5 = snapshotState;
        ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -802617734, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.SelectionContainer.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                invoke(paddingValues, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues it3, Composer composer3, int i7) {
                int i8;
                Intrinsics.checkNotNullParameter(it3, "it");
                if ((i7 & 14) == 0) {
                    i8 = i7 | (composer3.changed(it3) ? 4 : 2);
                } else {
                    i8 = i7;
                }
                if ((i8 & 91) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-802617734, i8, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.SelectionContainer.<anonymous> (ProviderSelectionContainer.kt:225)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), it3);
                    List<PaymentProviderViewData> list5 = list3;
                    List<PaymentProviderViewData> list6 = list4;
                    String str3 = str2;
                    final boolean z7 = z6;
                    final Function3<String, String, Boolean, Unit> function34 = function33;
                    SnapshotState<QueryState> snapshotState6 = snapshotState2;
                    final SnapshotState<String> snapshotState7 = snapshotState5;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (list5.isEmpty() && list6.isEmpty()) {
                        composer3.startReplaceableGroup(185002608);
                        EmptyView.EmptyView(0, 0, composer3, 0, 3);
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(185002657);
                        QueryState queryStateSelectionContainer$lambda$22 = ProviderSelectionContainerKt.SelectionContainer$lambda$2(snapshotState6);
                        composer3.startReplaceableGroup(185002997);
                        boolean zChanged = composer3.changed(z7) | composer3.changed(function34);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<PaymentProviderViewData, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$7$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData) {
                                    invoke2(paymentProviderViewData);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PaymentProviderViewData provider) {
                                    Intrinsics.checkNotNullParameter(provider, "provider");
                                    String parentId = provider.getParentId();
                                    if (parentId == null) {
                                        parentId = provider.getId();
                                    }
                                    String str4 = parentId;
                                    String id = provider.getParentId() != null ? provider.getId() : null;
                                    if (z7) {
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BranchSelected(provider.getCountryCode(), null, id, 2, null));
                                    } else {
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ProviderSelected(str4, provider.isRecommended(), provider.getCountryCode(), null, id, 8, null));
                                    }
                                    function34.invoke(str4, id, Boolean.valueOf(provider.isRecommended()));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function1 = (Function1) objRememberedValue5;
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(185004317);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1<PaymentProviderViewData, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$7$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData) {
                                    invoke2(paymentProviderViewData);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PaymentProviderViewData providerViewData) {
                                    Intrinsics.checkNotNullParameter(providerViewData, "providerViewData");
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.UnavailableProviderClicked(providerViewData.getId(), providerViewData.isRecommended(), providerViewData.getCountryCode(), null, 8, null));
                                    snapshotState7.setValue(providerViewData.getDisplayName());
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        ProviderSelectionList.ProviderSelectionList(str3, queryStateSelectionContainer$lambda$22, list5, list6, z7, function1, (Function1) objRememberedValue6, composer3, 1577472, 0);
                        composer3.endReplaceableGroup();
                    }
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 805306416, 509);
        String strSelectionContainer$lambda$5 = SelectionContainer$lambda$5(snapshotState5);
        if (strSelectionContainer$lambda$5 == null) {
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(291767728);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$8$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState5.setValue(null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BankUnavailableDialog.BankUnavailableDialog(strSelectionContainer$lambda$5, null, (Function0) objRememberedValue5, composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i7 = i6;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.SelectionContainer.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    ProviderSelectionContainerKt.SelectionContainer(str2, list, list2, country, z, kFunction, i7, z6, function06, function33, function05, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* compiled from: ProviderSelectionContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$5", m3645f = "ProviderSelectionContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$5 */
    static final class C432175 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $branchSelection;
        final /* synthetic */ Country $currentCountry;
        final /* synthetic */ List<PaymentProviderViewData> $filteredRecommendedProviders;
        final /* synthetic */ List<PaymentProviderViewData> $sortedProviders;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C432175(boolean z, List<PaymentProviderViewData> list, List<PaymentProviderViewData> list2, Country country, Continuation<? super C432175> continuation) {
            super(2, continuation);
            this.$branchSelection = z;
            this.$filteredRecommendedProviders = list;
            this.$sortedProviders = list2;
            this.$currentCountry = country;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C432175(this.$branchSelection, this.$filteredRecommendedProviders, this.$sortedProviders, this.$currentCountry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432175) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$branchSelection) {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BranchSelectionLoaded(null, 1, null));
            } else {
                TrueLayerAnalytics analytics$payments_ui_release = TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release();
                boolean z = !this.$filteredRecommendedProviders.isEmpty();
                List<PaymentProviderViewData> list = this.$sortedProviders;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((PaymentProviderViewData) obj2).getAvailable()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((PaymentProviderViewData) it.next()).getId());
                }
                analytics$payments_ui_release.track(new AnalyticsEvents.ProviderSelectionLoaded(z, arrayList2, this.$currentCountry.getCountryCode(), null, 8, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessibleAppBarAction countrySearchAction(final Function0<Unit> function0, final Country country, Composer composer, int i) {
        composer.startReplaceableGroup(-2106058132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2106058132, i, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.countrySearchAction (ProviderSelectionContainer.kt:289)");
        }
        boolean z = true;
        ComposableLambda composableLambda = ComposableLambda3.composableLambda(composer, -994939601, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.countrySearchAction.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-994939601, i2, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.countrySearchAction.<anonymous> (ProviderSelectionContainer.kt:291)");
                    }
                    Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.countrySearchAction.1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver clearAndSetSemantics) {
                            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    });
                    Function0<Unit> function02 = function0;
                    final Country country2 = country;
                    IconButton5.IconButton(function02, modifierClearAndSetSemantics, false, null, null, ComposableLambda3.composableLambda(composer2, 1937311538, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.countrySearchAction.1.2
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1937311538, i3, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.countrySearchAction.<anonymous>.<anonymous> (ProviderSelectionContainer.kt:295)");
                                }
                                final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                Modifier modifierM27165circlesqb8OZA$default = ModifiersKt.m27165circlesqb8OZA$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), 0L, 0.0f, Color.m6701boximpl(Color.INSTANCE.m6727getWhite0d7_KjU()), 3, null);
                                final Country country3 = country2;
                                FlagImage3.FlagImage(SemanticsModifier6.semantics$default(modifierM27165circlesqb8OZA$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.countrySearchAction.1.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        String string2 = context.getString(C42830R.string.accessibility_country_selection_button_description, country3.getDisplayName());
                                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                        SemanticsPropertiesKt.setStateDescription(semantics, string2);
                                    }
                                }, 1, null), country2, StringResources_androidKt.stringResource(C42830R.string.choose_your_country, composer3, 0), null, null, composer3, 64, 24);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 196608, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        String strStringResource = StringResources_androidKt.stringResource(C42830R.string.choose_your_country, composer, 0);
        composer.startReplaceableGroup(1005592777);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(function0)) && (i & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Boolean>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$countrySearchAction$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    function0.invoke();
                    return Boolean.TRUE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AccessibleAppBarAction accessibleAppBarAction = new AccessibleAppBarAction(composableLambda, new CustomAccessibilityAction(strStringResource, (Function0) objRememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return accessibleAppBarAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DeleteIcon(final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(328062928);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                function0 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.DeleteIcon.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(328062928, i3, -1, "com.truelayer.payments.ui.screens.providerselection.providerlist.DeleteIcon (ProviderSelectionContainer.kt:322)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt.DeleteIcon.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ProviderSelectionContainerKt.DeleteIcon(function0, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryState SelectionContainer$lambda$2(SnapshotState<QueryState> snapshotState) {
        return snapshotState.getValue();
    }

    private static final String SelectionContainer$lambda$5(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }
}
