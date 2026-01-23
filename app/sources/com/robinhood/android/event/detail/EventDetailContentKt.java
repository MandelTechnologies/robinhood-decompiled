package com.robinhood.android.event.detail;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewSection5;
import com.robinhood.android.cortex.digest.common.LocalClock;
import com.robinhood.android.cortex.digest.common.LocalClock3;
import com.robinhood.android.event.detail.EventDetailViewState;
import com.robinhood.android.event.detail.builders.BreakingNewsInputData;
import com.robinhood.android.event.detail.builders.ContractSelectorRowControlViewState;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractList5;
import com.robinhood.android.event.detail.duel.DuelEventContractUiDetail;
import com.robinhood.android.event.detail.duel.EventDetailDuelContractsHeader5;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet2;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialog4;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialogData;
import com.robinhood.android.eventcontracts.sharedeventui.EventDetailTradingProhibitionsSection;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabel6;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelItem;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineRowData;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineSection2;
import com.robinhood.android.eventcontracts.sharedeventui.util.EventContractHistoryFilterState;
import com.robinhood.android.futures.sharedfuturesui.MarketClosedHeader;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.newsfeed.breakingnews.p198ui.BreakingNewsCardWrapper3;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Instant;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventDetailContent.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001at\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032K\u0010\u0010\u001aG\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002\u001a.\u0010 \u001a\u00020\u0001*\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010#H\u0002\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001eH\u0002\"\u000e\u0010&\u001a\u00020'X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010(\u001a\u00020)*\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-²\u0006\n\u0010.\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020)X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"UpcomingActivityHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "UpcomingActivityFooter", "destination", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventDetailContent", "state", "Lcom/robinhood/android/event/detail/EventDetailViewState;", "screenCallbacks", "Lcom/robinhood/android/event/detail/EventDetailContentCallbacks;", "onTrade", "Lkotlin/Function3;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "Lrosetta/mainst/SideDto;", "side", "Lrosetta/mainst/PositionEffectDto;", "positionEffect", "(Lcom/robinhood/android/event/detail/EventDetailViewState;Lcom/robinhood/android/event/detail/EventDetailContentCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "timelineItem", "Landroidx/compose/foundation/lazy/LazyListScope;", "timeline", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/timeline/EventTimelineRowData;", "aboutItem", "about", "onFaqClick", "Lkotlin/Function0;", "tradingProhibitionsItem", "rules", "NumItemsBeforeCustomItems", "", "headerVisibility", "", "Landroidx/compose/foundation/lazy/LazyListState;", "getHeaderVisibility", "(Landroidx/compose/foundation/lazy/LazyListState;)Z", "feature-event-detail_externalDebug", "marketClosedBannerHeight", "contentBottomHeightDp", "Landroidx/compose/ui/unit/Dp;", "numVisibleContractItems", "showSelectDisplayDataBottomSheet", "latestScreenCallbacks"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventDetailContentKt {
    private static final int NumItemsBeforeCustomItems = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$45(EventDetailViewState eventDetailViewState, EventDetailContentCallbacks eventDetailContentCallbacks, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        EventDetailContent(eventDetailViewState, eventDetailContentCallbacks, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingActivityFooter$lambda$3(FragmentKey fragmentKey, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpcomingActivityFooter(fragmentKey, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingActivityHeader$lambda$0(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        UpcomingActivityHeader(modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean EventDetailContent$lambda$44$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventDetailContentCallbacks EventDetailContent$lambda$44$lambda$29(SnapshotState4<? extends EventDetailContentCallbacks> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final float EventDetailContent$lambda$44$lambda$8(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpcomingActivityHeader(Modifier modifier, String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        Modifier modifier3;
        String strStringResource;
        int i4;
        final Modifier modifier4;
        Composer composer2;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1402184519);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                int i6 = composerStartRestartGroup.changed(str2) ? 32 : 16;
                i3 |= i6;
            } else {
                str2 = str;
            }
            i3 |= i6;
        } else {
            str2 = str;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(C16095R.string.event_detail_upcoming_activity_header, composerStartRestartGroup, 0);
                    i4 = i3 & (-113);
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1402184519, i4, -1, "com.robinhood.android.event.detail.UpcomingActivityHeader (EventDetailContent.kt:91)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium();
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), composerStartRestartGroup, i4 & 14, 0);
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                str3 = strStringResource;
                BentoText2.m20747BentoText38GnDrw(str3, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, (i4 >> 3) & 14, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
            }
            i4 = i3;
            strStringResource = str2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium();
            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier3, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), composerStartRestartGroup, i4 & 14, 0);
            modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            str3 = strStringResource;
            BentoText2.m20747BentoText38GnDrw(str3, modifierM21622defaultHorizontalPaddingWMci_g02, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composer2, (i4 >> 3) & 14, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            composer2 = composerStartRestartGroup;
            str3 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailContentKt.UpcomingActivityHeader$lambda$0(modifier4, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UpcomingActivityFooter(final FragmentKey destination, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Composer composerStartRestartGroup = composer.startRestartGroup(-918721501);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(destination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-918721501, i3, -1, "com.robinhood.android.event.detail.UpcomingActivityFooter (EventDetailContent.kt:103)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_show_all, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(destination);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventDetailContentKt.UpcomingActivityFooter$lambda$2$lambda$1(navigator, context, destination);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            HistoryRowsKt.HistoryFooterTextButton(strStringResource, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailContentKt.UpcomingActivityFooter$lambda$3(destination, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingActivityFooter$lambda$2$lambda$1(Navigator navigator, Context context, FragmentKey fragmentKey) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventDetailContent(final EventDetailViewState state, final EventDetailContentCallbacks screenCallbacks, Modifier modifier, final Function3<? super UUID, ? super SideDto, ? super PositionEffectDto, Unit> onTrade, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState2;
        LazyListState lazyListStateRememberLazyListState;
        final EventContractHistoryFilterState upcomingActivityFilter;
        boolean z;
        int i4;
        Function1<LazyListScope, Unit> function1HistoryPreviewSection;
        final EventContractHistoryFilterState historyFilter;
        Function1<LazyListScope, Unit> function1;
        Function1<LazyListScope, Unit> function1HistoryPreviewSection2;
        Object objRememberedValue2;
        final Function1<LazyListScope, Unit> function12;
        final SnapshotIntState2 snapshotIntState22;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        final float fM21590getDefaultD9Ej5fM;
        Clock current;
        Object objRememberedValue4;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue5;
        int i5;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        SnapshotIntState2 snapshotIntState23;
        Modifier modifier4;
        int i6;
        int i7;
        final SnapshotState snapshotState3;
        final EventDetailViewState eventDetailViewState;
        EventDetailContentCallbacks eventDetailContentCallbacks;
        Composer composer2;
        SnapshotState4 snapshotState4RememberUpdatedState;
        boolean zChanged;
        Object objRememberedValue7;
        Object objRememberedValue8;
        Object objRememberedValue9;
        Object objRememberedValue10;
        final EventDetailContentCallbacks eventDetailContentCallbacks2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        EventTradeOverlayDialogData eventTradeOverlayDialogData;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(screenCallbacks, "screenCallbacks");
        Intrinsics.checkNotNullParameter(onTrade, "onTrade");
        Composer composerStartRestartGroup = composer.startRestartGroup(-460119782);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(screenCallbacks) : composerStartRestartGroup.changedInstance(screenCallbacks) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTrade) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-460119782, i3, -1, "com.robinhood.android.event.detail.EventDetailContent (EventDetailContent.kt:124)");
                }
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(C2002Dp.m7993boximpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue())), composerStartRestartGroup, 0);
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                upcomingActivityFilter = state.getUpcomingActivityFilter();
                composerStartRestartGroup.startReplaceGroup(1378004141);
                if (upcomingActivityFilter != null) {
                    i4 = 54;
                    z = true;
                    function1HistoryPreviewSection = null;
                } else {
                    z = true;
                    i4 = 54;
                    function1HistoryPreviewSection = HistoryPreviewSection5.historyPreviewSection(upcomingActivityFilter.getListParams(), false, ComposableSingletons$EventDetailContentKt.INSTANCE.m14096getLambda$1451057705$feature_event_detail_externalDebug(), ComposableLambda3.rememberComposableLambda(1435698840, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$upcomingActivitySection$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer3, Integer num) {
                            invoke(lazyItemScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope historyPreviewSection, Composer composer3, int i12) {
                            Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                            if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1435698840, i12, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:139)");
                            }
                            EventDetailContentKt.UpcomingActivityFooter(upcomingActivityFilter.getFooterKey(), null, composer3, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, "edp_upcoming_activity_preview_", null, composerStartRestartGroup, HistoryPreviewListParams.$stable | 200112, 80);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                historyFilter = state.getHistoryFilter();
                composerStartRestartGroup.startReplaceGroup(1378019628);
                if (historyFilter != null) {
                    function1 = function1HistoryPreviewSection;
                    function1HistoryPreviewSection2 = null;
                } else {
                    Composer composer3 = composerStartRestartGroup;
                    function1 = function1HistoryPreviewSection;
                    function1HistoryPreviewSection2 = HistoryPreviewSection5.historyPreviewSection(historyFilter.getListParams(), false, ComposableSingletons$EventDetailContentKt.INSTANCE.getLambda$1417031766$feature_event_detail_externalDebug(), ComposableLambda3.rememberComposableLambda(593220951, z, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$previewHistorySection$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer4, Integer num) {
                            invoke(lazyItemScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope historyPreviewSection, Composer composer4, int i12) {
                            Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
                            if ((i12 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(593220951, i12, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:151)");
                            }
                            HistoryRowsKt.DefaultHistoryFooter(null, null, historyFilter.getFooterKey(), composer4, 0, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, i4), null, "edp_history_preview_", null, composer3, HistoryPreviewListParams.$stable | 200112, 80);
                    composerStartRestartGroup = composer3;
                }
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventDetailContentKt.EventDetailContent$lambda$44$lambda$12$lambda$11();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function12 = function1HistoryPreviewSection2;
                snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventDetailContentKt.EventDetailContent$lambda$44$lambda$16$lambda$15();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i12 = BentoTheme.$stable;
                fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM();
                current = LocalClock3.getLocalClock().getCurrent(composerStartRestartGroup, LocalClock.$stable);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i13 = i3;
                if (objRememberedValue4 != companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Instant.now(current), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(current);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new EventDetailContentKt$EventDetailContent$1$1$1(snapshotState2, current, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(current, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM() + EventDetailContent$lambda$44$lambda$8(snapshotState4RememberUpdatedState2)), 7, null);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i5 = i13 & 112;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | (i5 != 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(screenCallbacks))) | composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(snapshotIntState22) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(function12) | composerStartRestartGroup.changed(fM21590getDefaultD9Ej5fM);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    snapshotIntState23 = snapshotIntState2;
                    modifier4 = modifier3;
                    i6 = i5;
                    final Function1<LazyListScope, Unit> function13 = function1;
                    i7 = -1633490746;
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventDetailContentKt.EventDetailContent$lambda$44$lambda$28$lambda$27(state, function13, screenCallbacks, snapshotState2, function12, fM21590getDefaultD9Ej5fM, snapshotIntState22, snapshotState, (LazyListScope) obj);
                        }
                    };
                    snapshotState3 = snapshotState;
                    eventDetailViewState = state;
                    eventDetailContentCallbacks = screenCallbacks;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    eventDetailContentCallbacks = screenCallbacks;
                    i6 = i5;
                    modifier4 = modifier3;
                    snapshotState3 = snapshotState;
                    i7 = -1633490746;
                    snapshotIntState23 = snapshotIntState2;
                    eventDetailViewState = state;
                }
                composerStartRestartGroup.endReplaceGroup();
                int i14 = i6;
                composer2 = composerStartRestartGroup;
                final SnapshotIntState2 snapshotIntState24 = snapshotIntState23;
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue6, composer2, 6, 504);
                snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(eventDetailContentCallbacks, composer2, (i13 >> 3) & 14);
                composer2.startReplaceGroup(i7);
                zChanged = composer2.changed(lazyListStateRememberLazyListState) | composer2.changed(snapshotState4RememberUpdatedState);
                objRememberedValue7 = composer2.rememberedValue();
                if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new EventDetailContentKt$EventDetailContent$1$3$1(lazyListStateRememberLazyListState, snapshotState4RememberUpdatedState, null);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, 0);
                boolean z3 = eventDetailViewState.getMarketClosedBanner() == null;
                composer2.startReplaceGroup(1849434622);
                objRememberedValue8 = composer2.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(EventDetailContentKt.EventDetailContent$lambda$44$lambda$32$lambda$31(((Integer) obj).intValue()));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                composer2.endReplaceGroup();
                EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue8, 1, null);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue9 = composer2.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(EventDetailContentKt.EventDetailContent$lambda$44$lambda$34$lambda$33(((Integer) obj).intValue()));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                composer2.endReplaceGroup();
                ExitTransition exitTransitionSlideOutVertically$default = EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue9, 1, null);
                Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getBottomCenter());
                composer2.startReplaceGroup(5004770);
                objRememberedValue10 = composer2.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventDetailContentKt.EventDetailContent$lambda$44$lambda$36$lambda$35(snapshotIntState24, (IntSize) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                composer2.endReplaceGroup();
                AnimatedVisibilityKt.AnimatedVisibility(z3, OnRemeasuredModifier2.onSizeChanged(modifierAlign, (Function1) objRememberedValue10), enterTransitionSlideInVertically$default, exitTransitionSlideOutVertically$default, (String) null, ComposableLambda3.rememberComposableLambda(319886072, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$7
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                        invoke(animatedVisibilityScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i15) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(319886072, i15, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous> (EventDetailContent.kt:366)");
                        }
                        StringResource marketClosedBanner = eventDetailViewState.getMarketClosedBanner();
                        if (marketClosedBanner != null) {
                            MarketClosedHeader.MarketClosedHeader(marketClosedBanner, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, StringResource.$stable | 48, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 200064, 16);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.startReplaceGroup(1378304291);
                if (EventDetailContent$lambda$44$lambda$17(snapshotState3)) {
                    eventDetailContentCallbacks2 = eventDetailContentCallbacks;
                    i8 = i14;
                    i9 = 5004770;
                    i10 = 32;
                    z2 = false;
                } else {
                    EventDetailDisplayDataBottomSheet selectedDisplayMode = eventDetailViewState.getSelectedDisplayMode();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    i10 = 32;
                    boolean z4 = i14 == 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(eventDetailContentCallbacks));
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new EventDetailContentKt$EventDetailContent$1$8$1(eventDetailContentCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1 function14 = (Function1) ((KFunction) objRememberedValue11);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState3);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EventDetailContentKt.EventDetailContent$lambda$44$lambda$39$lambda$38(snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    Function0 function0 = (Function0) objRememberedValue12;
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = 5004770;
                    eventDetailContentCallbacks2 = eventDetailContentCallbacks;
                    i8 = i14;
                    z2 = false;
                    EventDetailDisplayDataBottomSheet2.EventDetailDisplayDataBottomSheet(selectedDisplayMode, function14, function0, null, composerStartRestartGroup, 0, 8);
                }
                composerStartRestartGroup.endReplaceGroup();
                eventTradeOverlayDialogData = eventDetailViewState.getEventTradeOverlayDialogData();
                composerStartRestartGroup.startReplaceGroup(1378317344);
                if (eventTradeOverlayDialogData != null) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z5 = ((i8 == i10 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(eventDetailContentCallbacks2))) ? true : z2) | ((i13 & 7168) == 2048 ? true : z2);
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue13 == companion.getEmpty()) {
                        objRememberedValue13 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EventDetailContentKt.EventDetailContent$lambda$44$lambda$43$lambda$41$lambda$40(onTrade, eventDetailContentCallbacks2, (ContractSelectorButtonViewState.Metadata) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    Function1 function15 = (Function1) objRememberedValue13;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(i9);
                    boolean z6 = (i8 == i10 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(eventDetailContentCallbacks2))) ? true : z2;
                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue14 == companion.getEmpty()) {
                        objRememberedValue14 = new EventDetailContentKt$EventDetailContent$1$10$2$1(eventDetailContentCallbacks2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EventTradeOverlayDialog4.EventTradeOverlayDialog(eventTradeOverlayDialogData, function15, (Function0) ((KFunction) objRememberedValue14), null, composerStartRestartGroup, 0, 8);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                eventDetailViewState = state;
                eventDetailContentCallbacks2 = screenCallbacks;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final EventDetailViewState eventDetailViewState2 = eventDetailViewState;
                final EventDetailContentCallbacks eventDetailContentCallbacks3 = eventDetailContentCallbacks2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventDetailContentKt.EventDetailContent$lambda$45(eventDetailViewState2, eventDetailContentCallbacks3, modifier5, onTrade, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4RememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(C2002Dp.m7993boximpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue())), composerStartRestartGroup, 0);
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                upcomingActivityFilter = state.getUpcomingActivityFilter();
                composerStartRestartGroup.startReplaceGroup(1378004141);
                if (upcomingActivityFilter != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                historyFilter = state.getHistoryFilter();
                composerStartRestartGroup.startReplaceGroup(1378019628);
                if (historyFilter != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                function12 = function1HistoryPreviewSection2;
                snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                Object[] objArr22 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i122 = BentoTheme.$stable;
                fM21590getDefaultD9Ej5fM = bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21590getDefaultD9Ej5fM();
                current = LocalClock3.getLocalClock().getCurrent(composerStartRestartGroup, LocalClock.$stable);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i132 = i3;
                if (objRememberedValue4 != companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(current);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue5 = new EventDetailContentKt$EventDetailContent$1$1$1(snapshotState2, current, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(current, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                    PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default2 = androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21592getMediumD9Ej5fM() + EventDetailContent$lambda$44$lambda$8(snapshotState4RememberUpdatedState22)), 7, null);
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    i5 = i132 & 112;
                    if (i5 != 32) {
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | (i5 != 32 || ((i132 & 64) != 0 && composerStartRestartGroup.changedInstance(screenCallbacks))) | composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(snapshotIntState22) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(function12) | composerStartRestartGroup.changed(fM21590getDefaultD9Ej5fM);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            snapshotIntState23 = snapshotIntState2;
                            modifier4 = modifier3;
                            i6 = i5;
                            final Function1 function132 = function1;
                            i7 = -1633490746;
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EventDetailContentKt.EventDetailContent$lambda$44$lambda$28$lambda$27(state, function132, screenCallbacks, snapshotState2, function12, fM21590getDefaultD9Ej5fM, snapshotIntState22, snapshotState, (LazyListScope) obj);
                                }
                            };
                            snapshotState3 = snapshotState;
                            eventDetailViewState = state;
                            eventDetailContentCallbacks = screenCallbacks;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            composerStartRestartGroup.endReplaceGroup();
                            int i142 = i6;
                            composer2 = composerStartRestartGroup;
                            final SnapshotIntState2 snapshotIntState242 = snapshotIntState23;
                            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListStateRememberLazyListState, paddingValuesM5139PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (Function1) objRememberedValue6, composer2, 6, 504);
                            snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(eventDetailContentCallbacks, composer2, (i132 >> 3) & 14);
                            composer2.startReplaceGroup(i7);
                            zChanged = composer2.changed(lazyListStateRememberLazyListState) | composer2.changed(snapshotState4RememberUpdatedState);
                            objRememberedValue7 = composer2.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue7 = new EventDetailContentKt$EventDetailContent$1$3$1(lazyListStateRememberLazyListState, snapshotState4RememberUpdatedState, null);
                                composer2.updateRememberedValue(objRememberedValue7);
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, 0);
                                if (eventDetailViewState.getMarketClosedBanner() == null) {
                                }
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue8 = composer2.rememberedValue();
                                if (objRememberedValue8 == companion.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                EnterTransition enterTransitionSlideInVertically$default2 = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue8, 1, null);
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue9 = composer2.rememberedValue();
                                if (objRememberedValue9 == companion.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                ExitTransition exitTransitionSlideOutVertically$default2 = EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue9, 1, null);
                                Modifier modifierAlign2 = boxScopeInstance2.align(companion42, companion22.getBottomCenter());
                                composer2.startReplaceGroup(5004770);
                                objRememberedValue10 = composer2.rememberedValue();
                                if (objRememberedValue10 == companion.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                AnimatedVisibilityKt.AnimatedVisibility(z3, OnRemeasuredModifier2.onSizeChanged(modifierAlign2, (Function1) objRememberedValue10), enterTransitionSlideInVertically$default2, exitTransitionSlideOutVertically$default2, (String) null, ComposableLambda3.rememberComposableLambda(319886072, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$7
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                        invoke(animatedVisibilityScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i15) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(319886072, i15, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous> (EventDetailContent.kt:366)");
                                        }
                                        StringResource marketClosedBanner = eventDetailViewState.getMarketClosedBanner();
                                        if (marketClosedBanner != null) {
                                            MarketClosedHeader.MarketClosedHeader(marketClosedBanner, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, StringResource.$stable | 48, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 200064, 16);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.startReplaceGroup(1378304291);
                                if (EventDetailContent$lambda$44$lambda$17(snapshotState3)) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                eventTradeOverlayDialogData = eventDetailViewState.getEventTradeOverlayDialogData();
                                composerStartRestartGroup.startReplaceGroup(1378317344);
                                if (eventTradeOverlayDialogData != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier5 = modifier4;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 EventDetailContent$lambda$44$lambda$12$lambda$11() {
        return SnapshotIntState3.mutableIntStateOf(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState EventDetailContent$lambda$44$lambda$16$lambda$15() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void EventDetailContent$lambda$44$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$28$lambda$27(final EventDetailViewState eventDetailViewState, Function1 function1, final EventDetailContentCallbacks eventDetailContentCallbacks, SnapshotState snapshotState, Function1 function12, float f, final SnapshotIntState2 snapshotIntState2, final SnapshotState snapshotState2, LazyListScope LazyColumn) {
        LazyListScope lazyListScope;
        Modifier modifierM5146paddingqDBjuR0$default;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1209032117, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Event event;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1209032117, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:178)");
                }
                String individualAccountNumber = eventDetailViewState.getIndividualAccountNumber();
                UiEcEvent uiEvent = eventDetailViewState.getUiEvent();
                InfoBannerComponent.InfoBannerComponent(individualAccountNumber, IacInfoBannerLocation.INFO_BANNER_EVENTS_DETAIL_PAGE_MOBILE_TOP_LEVEL, null, (uiEvent == null || (event = uiEvent.getEvent()) == null) ? null : event.getEventId(), null, null, null, null, null, null, null, null, null, composer, 48, 0, 8180);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (eventDetailViewState.getTitle() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-673575600, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$2
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
                        ComposerKt.traceEventStart(-673575600, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:187)");
                    }
                    String orNull = eventDetailViewState.getTitle().getOrNull();
                    if (orNull == null) {
                        orNull = PlaceholderUtils.getMediumPlaceholderText();
                    }
                    BentoText2.m20747BentoText38GnDrw(orNull, ModifiersKt.bentoPlaceholder$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1), eventDetailViewState.getTitle().getOrNull() == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge(), composer, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        final Either<EventDetailViewState.DuelContractHeader, ImmutableList<EventChartLabelItem>> contractHeader = eventDetailViewState.getContractHeader();
        if (contractHeader instanceof Either.Left) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1471633491, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$3
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
                        ComposerKt.traceEventStart(-1471633491, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:201)");
                    }
                    EventDetailViewState.DuelContractHeader duelContractHeader = (EventDetailViewState.DuelContractHeader) ((Either.Left) contractHeader).getValue();
                    boolean z = duelContractHeader != null && duelContractHeader.getShowLiveActivity();
                    EventDetailViewState.DuelContractHeader duelContractHeader2 = (EventDetailViewState.DuelContractHeader) ((Either.Left) contractHeader).getValue();
                    DuelEventContractUiDetail leftContract = duelContractHeader2 != null ? duelContractHeader2.getLeftContract() : null;
                    EventDetailViewState.DuelContractHeader duelContractHeader3 = (EventDetailViewState.DuelContractHeader) ((Either.Left) contractHeader).getValue();
                    DuelEventContractUiDetail rightContract = duelContractHeader3 != null ? duelContractHeader3.getRightContract() : null;
                    EventDetailDuelContractsHeader5.EventDetailDuelContractsHeader(z, leftContract, rightContract, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0), eventDetailViewState.isInEcSportsExperiment(), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else if (contractHeader instanceof Either.Right) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1093584854, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$4
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
                        ComposerKt.traceEventStart(1093584854, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:215)");
                    }
                    EventChartLabel6.EventChartLabel((ImmutableList) ((Either.Right) contractHeader).getValue(), 3, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composer, 6, 0), false, composer, EventChartLabelItem.$stable | 48, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else if (contractHeader != null) {
            throw new NoWhenBranchMatchedException();
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1739538388, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$5
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
                    ComposerKt.traceEventStart(-1739538388, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:227)");
                }
                EventChartUiState chartState = eventDetailViewState.getChartState();
                EventDetailContentCallbacks eventDetailContentCallbacks2 = eventDetailContentCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(eventDetailContentCallbacks2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new EventDetailContentKt$EventDetailContent$1$2$1$5$1$1(eventDetailContentCallbacks2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Function1 function13 = (Function1) ((KFunction) objRememberedValue);
                EventDetailContentCallbacks eventDetailContentCallbacks3 = eventDetailContentCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(eventDetailContentCallbacks3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new EventDetailContentKt$EventDetailContent$1$2$1$5$2$1(eventDetailContentCallbacks3);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EventDetailChartSection2.EventChartSection(chartState, function13, (Function1) ((KFunction) objRememberedValue2), null, composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final EventDetailLiveDataSectionViewState liveDataSection = eventDetailViewState.getLiveDataSection();
        if (liveDataSection != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1820709135, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$6$1
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
                        ComposerKt.traceEventStart(1820709135, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:236)");
                    }
                    EventDetailLiveDataSection.EventDetailLiveDataSection(liveDataSection, null, composer, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        final BreakingNewsInputData breakingNewsData = eventDetailViewState.getBreakingNewsData();
        if (breakingNewsData != null) {
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(-369771258, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$EventDetailContent$1$2$1$7$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    float fM21592getMediumD9Ej5fM;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-369771258, i, -1, "com.robinhood.android.event.detail.EventDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventDetailContent.kt:244)");
                    }
                    UUID eventId = breakingNewsData.getEventId();
                    String accountNumber = breakingNewsData.getAccountNumber();
                    ApiAssetType apiAssetType = ApiAssetType.EVENT_CONTRACT;
                    if (eventDetailViewState.getLiveDataSection() == null) {
                        composer.startReplaceGroup(735907172);
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(736000451);
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                        composer.endReplaceGroup();
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BreakingNewsCardWrapper3.BreakingNewsCardWrapper(eventId, accountNumber, apiAssetType, null, androidx.compose.foundation.layout.PaddingKt.m5138PaddingValuesa9UjIt4(bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), fM21592getMediumD9Ej5fM, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, composer, 384, 40);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            lazyListScope = LazyColumn;
            LazyListScope.item$default(lazyListScope, null, null, composableLambdaComposableLambdaInstance, 3, null);
        } else {
            lazyListScope = LazyColumn;
        }
        if (function1 != null) {
            function1.invoke(lazyListScope);
        }
        final Either<ImmutableList<ContractSelectorRowControlViewState>, ImmutableList<ContractSelectorRowTreatmentViewState>> contractDataList = eventDetailViewState.getContractDataList();
        if (contractDataList instanceof Either.Left) {
            EventDetailMultiContractListKt.eventDetailContractList((ImmutableList) ((Either.Left) contractDataList).getValue(), snapshotIntState2.getIntValue(), new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDetailContentKt.EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$23(contractDataList, snapshotIntState2);
                }
            }, eventDetailViewState.getSelectedContractId(), new EventDetailContentKt$EventDetailContent$1$2$1$9(eventDetailContentCallbacks), new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDetailContentKt.EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$24(snapshotState2);
                }
            }).invoke(lazyListScope);
            LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$EventDetailContentKt.INSTANCE.getLambda$1883120743$feature_event_detail_externalDebug(), 3, null);
        } else if (contractDataList instanceof Either.Right) {
            EventDetailTreatmentMultiContractList5.eventDetailTreatmentMultiContractList((ImmutableList) ((Either.Right) contractDataList).getValue(), 5, new Function2() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailContentKt.EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$25(eventDetailContentCallbacks, (ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            }, new Function0() { // from class: com.robinhood.android.event.detail.EventDetailContentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDetailContentKt.EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$26(eventDetailViewState, eventDetailContentCallbacks);
                }
            }, snapshotState).invoke(lazyListScope);
            LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$EventDetailContentKt.INSTANCE.getLambda$1746722384$feature_event_detail_externalDebug(), 3, null);
        } else if (contractDataList != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (eventDetailViewState.getHasPosition()) {
            timelineItem(lazyListScope, eventDetailViewState.getTimeline());
            if (function12 != null) {
                function12.invoke(lazyListScope);
            }
            aboutItem$default(lazyListScope, eventDetailViewState.getAbout(), null, new EventDetailContentKt$EventDetailContent$1$2$1$13(eventDetailContentCallbacks), 2, null);
            tradingProhibitionsItem(lazyListScope, eventDetailViewState.getTradingProhibitionRules());
        } else {
            String about = eventDetailViewState.getAbout();
            EventDetailContentKt$EventDetailContent$1$2$1$14 eventDetailContentKt$EventDetailContent$1$2$1$14 = new EventDetailContentKt$EventDetailContent$1$2$1$14(eventDetailContentCallbacks);
            if (eventDetailViewState.isMultiContractViewMode()) {
                modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, f, 0.0f, 0.0f, 13, null);
            } else {
                modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            aboutItem(lazyListScope, about, modifierM5146paddingqDBjuR0$default, eventDetailContentKt$EventDetailContent$1$2$1$14);
            tradingProhibitionsItem(lazyListScope, eventDetailViewState.getTradingProhibitionRules());
            timelineItem(lazyListScope, eventDetailViewState.getTimeline());
            if (function12 != null) {
                function12.invoke(lazyListScope);
            }
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$EventDetailContentKt.INSTANCE.getLambda$2044416749$feature_event_detail_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$23(Either either, SnapshotIntState2 snapshotIntState2) {
        ImmutableList immutableList = (ImmutableList) ((Either.Left) either).getValue();
        snapshotIntState2.setIntValue(immutableList != null ? immutableList.size() : snapshotIntState2.getIntValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$24(SnapshotState snapshotState) {
        EventDetailContent$lambda$44$lambda$18(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$25(EventDetailContentCallbacks eventDetailContentCallbacks, ContractSelectorButtonViewState buttonState, int i) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        eventDetailContentCallbacks.onTradeButtonClicked(buttonState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$28$lambda$27$lambda$26(EventDetailViewState eventDetailViewState, EventDetailContentCallbacks eventDetailContentCallbacks) {
        Event event;
        UiEcEvent uiEvent = eventDetailViewState.getUiEvent();
        UUID eventId = (uiEvent == null || (event = uiEvent.getEvent()) == null) ? null : event.getEventId();
        if (eventId != null) {
            eventDetailContentCallbacks.onViewAllClick(eventId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EventDetailContent$lambda$44$lambda$32$lambda$31(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EventDetailContent$lambda$44$lambda$34$lambda$33(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$36$lambda$35(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$39$lambda$38(SnapshotState snapshotState) {
        EventDetailContent$lambda$44$lambda$18(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailContent$lambda$44$lambda$43$lambda$41$lambda$40(Function3 function3, EventDetailContentCallbacks eventDetailContentCallbacks, ContractSelectorButtonViewState.Metadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        function3.invoke(metadata.getContractId(), metadata.getOrderSide(), metadata.getPositionEffect());
        eventDetailContentCallbacks.onTradeOverlayDialogDismiss();
        return Unit.INSTANCE;
    }

    private static final void timelineItem(LazyListScope lazyListScope, final ImmutableList<EventTimelineRowData> immutableList) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1184263514, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt.timelineItem.1
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
                    ComposerKt.traceEventStart(-1184263514, i, -1, "com.robinhood.android.event.detail.timelineItem.<anonymous> (EventDetailContent.kt:395)");
                }
                EventTimelineSection2.EventContractTimelineSection(immutableList, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
    }

    static /* synthetic */ void aboutItem$default(LazyListScope lazyListScope, String str, Modifier modifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        aboutItem(lazyListScope, str, modifier, function0);
    }

    private static final void aboutItem(LazyListScope lazyListScope, final String str, final Modifier modifier, final Function0<Unit> function0) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1405732846, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt.aboutItem.1
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
                    ComposerKt.traceEventStart(1405732846, i, -1, "com.robinhood.android.event.detail.aboutItem.<anonymous> (EventDetailContent.kt:410)");
                }
                EventDetailAboutsSection3.EventDetailAboutsSection(str, function0, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), composer, 0, 1), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
    }

    private static final void tradingProhibitionsItem(LazyListScope lazyListScope, final ImmutableList<String> immutableList) {
        if (immutableList == null || !(!immutableList.isEmpty())) {
            return;
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1833961613, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailContentKt.tradingProhibitionsItem.1
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
                    ComposerKt.traceEventStart(-1833961613, i, -1, "com.robinhood.android.event.detail.tradingProhibitionsItem.<anonymous> (EventDetailContent.kt:423)");
                }
                EventDetailTradingProhibitionsSection.EventDetailTradingProhibitionsSection(immutableList, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), composer, 6, 1), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHeaderVisibility(LazyListState lazyListState) {
        return lazyListState.getFirstVisibleItemIndex() <= 2;
    }
}
